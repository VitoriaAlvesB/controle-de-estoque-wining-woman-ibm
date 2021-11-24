import { Observable } from 'rxjs';
import { UsuariosService } from './../../usuarios/services/usuarios.service';
import { Component, OnInit } from '@angular/core';
import { Usuario } from './model/usuario';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  usuarios: Observable<Usuario[]>;
  //usuarios: Usuario[] = [];

  displayedColumns = ['nome', 'sobrenome', 'email', 'funcao'];

  //usuariosService: UsuariosService;

  constructor(private usuariosService: UsuariosService) {
    //this.usuarios = [];
    //this.usuariosService = new UsuariosService();
    this.usuarios = this.usuariosService.list();

    //this.usuariosService.list().subscribe(usuarios => this.usuarios = usuarios);

  }

  ngOnInit(): void {

  }

}
