import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from './usuario';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  imageLogo = 'assets/images/logo.svg';
  username: string;
  password: string;
  success: boolean;
  cadastrando: boolean;
  mensagemSucesso: string;
  mensagemError: string;

  constructor(
    private router: Router,
    private authService: AuthService
  ) { }

  onSubmit(){

    this.authService
        .tentarLogar( this.username, this.password )
        .subscribe(response => {
          const access_token = JSON.stringify(response);
          localStorage.setItem('access_token', access_token)
          this.router.navigate(['/home'])
        }, responseError => {
          this.success = false;
          this.mensagemError = 'Usuário e/ou senha incorreto!'
        })


  }

  preparaCadastrar(event: any){
    event.preventDefault();
    this.cadastrando = true;
  }

  cancelaCadastro(){
    this.cadastrando = false;
  }

  cadastrar(){
    const usuario: Usuario = new Usuario();
    usuario.username = this.username;
    usuario.password = this.password;
    this.authService
        .salvar(usuario)
        .subscribe(response => {
          this.mensagemSucesso = "Cadastro realizado com sucesso! Efetue o login."
          this.success = true;
          this.cadastrando = false;
          this.username = "";
          this.password = "";
        }, responseError => {
          this.success = false;
          this.mensagemError = responseError.error.error;
        } )
  }

}
