import { FormsModule } from '@angular/forms';
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

  usuario: any = {
    nome: null,
    sobrenome: null,
    email: null,
    senha: null,
    funcao: null
  }

  usuarios: Observable<Usuario[]>;
  //usuarios: Usuario[] = [];

  displayedColumns = ['nome', 'sobrenome', 'email', 'funcao'];

  //usuariosService: UsuariosService;

  onSubmit(form: any){
    console.log(form.value);

    console.log(this.usuario);
  }

  constructor(private usuariosService: UsuariosService) {
    //this.usuarios = [];
    //this.usuariosService = new UsuariosService();
    this.usuarios = this.usuariosService.list();

    //this.usuariosService.list().subscribe(usuarios => this.usuarios = usuarios);

  }

  ngOnInit(): void {

  }

}
