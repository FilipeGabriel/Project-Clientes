import { Injectable } from '@angular/core';
import { Cliente } from './clientes/cliente';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  apiUrlBase: string = environment.apiUrlBase + '/api/clientes';

  constructor( private http: HttpClient ) {

  }

  salvar( cliente: Cliente ): Observable<Cliente> {
    const token = JSON.parse(localStorage.getItem('access_token') || '{}')
    const headers = {
      'Authorization' : 'Bearer ' + token.access_token
    }
    return this.http.post<Cliente>(`${this.apiUrlBase}` , cliente, { headers });
  }

  getClientes(): Observable<Cliente[]>{
    const token = JSON.parse(localStorage.getItem('access_token') || '{}')
    const headers = {
      'Authorization' : 'Bearer ' + token.access_token
    }
    return this.http.get<Cliente[]>(this.apiUrlBase, { headers });
  }

  getClienteById( id: number ): Observable<Cliente>{
    return this.http.get<any>(`${this.apiUrlBase}/${id}`);
  }

  atualizar( cliente: Cliente ): Observable<any>{
    return this.http.put<Cliente>(`${this.apiUrlBase}/${cliente.id}`, cliente)
  }

  deletar( cliente: Cliente ): Observable<any>{
    return this.http.delete<any>(`${this.apiUrlBase}/${cliente.id}`)
  }

}
