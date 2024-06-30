import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Usuario } from './login/usuario';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  apiUrlBase: string = environment.apiUrlBase + '/api/usuarios';
  tokenUrl: string = environment.apiUrlBase + environment.obterTokenUrl;
  clientId: string = environment.clientID;
  clienteSecret: string = environment.clientSecret;

  constructor( private http: HttpClient ) { }

  salvar(usuario: Usuario): Observable<any>{
    return this.http.post<any>(this.apiUrlBase, usuario)
  }

  tentarLogar( username: string, password: string ): Observable<any> {
    const params = new HttpParams()
                      .set('username', username)
                      .set('password', password)
                      .set('grant_type', 'password');

    const headers = {
      'Authorization': 'Basic ' + btoa(`${this.clientId}:${this.clienteSecret}`),
      'Content-Type' : 'application/x-www-form-urlencoded'
    }

    return this.http.post(this.tokenUrl, params.toString(), { headers });
  }

}
