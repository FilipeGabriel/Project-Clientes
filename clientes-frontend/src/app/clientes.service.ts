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
    return this.http.post<Cliente>(`${this.apiUrlBase}` , cliente);
  }

  getClientes(): Observable<Cliente[]>{
    return this.http.get<Cliente[]>(this.apiUrlBase);
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
