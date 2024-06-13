import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ServicoPrestado } from './servico-prestado/servicoPrestado';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

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

}
