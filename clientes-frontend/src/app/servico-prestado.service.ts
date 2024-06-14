import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { ServicoPrestado } from './servico-prestado/servicoPrestado';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { ServicoPrestadoBusca } from './servico-prestado/servico-prestado-lista/servicoPrestadoBusca';

@Injectable({
  providedIn: 'root'
})
export class ServicoPrestadoService {

  apiUrlBase: string = environment.apiUrlBase + '/api/servicos-prestados';

  constructor( private http: HttpClient ) {

   }

  salvar( servicoPrestado: ServicoPrestado ): Observable<ServicoPrestado> {
    return this.http.post<ServicoPrestado>(this.apiUrlBase, servicoPrestado);
  }

  buscar(nome: string, mes: number): Observable<ServicoPrestadoBusca[]>{
    const httpParams = new HttpParams()
    .set("nome", nome)
    .set("mes", mes ? mes.toString() : "");

    const url = this.apiUrlBase + "?" + httpParams.toString();
    return this.http.get<any>(url);
  }

}
