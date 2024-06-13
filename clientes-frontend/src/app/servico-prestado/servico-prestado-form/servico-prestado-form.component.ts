import { Component, OnInit } from '@angular/core';

import { Cliente } from '../../clientes/cliente';
import { ClientesService } from '../../clientes.service';
import { ServicoPrestado } from '../servicoPrestado';
import { ServicoPrestadoService } from 'src/app/servico-prestado.service';

@Component({
  selector: 'app-servico-prestado-form',
  templateUrl: './servico-prestado-form.component.html',
  styleUrls: ['./servico-prestado-form.component.css']
})
export class ServicoPrestadoFormComponent implements OnInit {

  clientes: Cliente[] = []
  servico: ServicoPrestado;
  success: boolean = false;
  notSuccess: boolean = false;
  errors: string[] = []

  constructor(
    private clienteService: ClientesService,
    private servicoPrestadoService: ServicoPrestadoService
  ) {
    this.servico = new ServicoPrestado();
   }

  ngOnInit(): void {
    this.clienteService
    .getClientes()
    .subscribe(response => this.clientes = response);
  }

  public onSubmit(){
    this.servicoPrestadoService.salvar(this.servico).subscribe(
      response => {
        this.notSuccess = false;
        this.success = true;
        this.errors = [];
        this.servico = response;
        this.servico = new ServicoPrestado();
      },
      errorResponse => {
        console.log(errorResponse);
        this.success = false;
        this.notSuccess = true;
        this.errors = [errorResponse.error.error];
      }
    );
  }
}
