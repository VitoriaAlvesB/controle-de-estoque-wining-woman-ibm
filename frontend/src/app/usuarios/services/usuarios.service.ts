import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first } from 'rxjs';
import { Usuario } from 'src/app/conteudo/usuarios/model/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  private readonly API = '';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Usuario[]>(this.API)
    .pipe(
      first(),
    );
  }
}
