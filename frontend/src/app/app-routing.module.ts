import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './conteudo/home/home.component';
import { LoginComponent } from './conteudo/login/login.component';
import { ProdutosComponent } from './conteudo/produtos/produtos.component';
import { UsuariosComponent } from './conteudo/usuarios/usuarios.component';

///Trecho com inclusao dos links
const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'usuarios', component: UsuariosComponent },
  { path: 'produtos', component: ProdutosComponent },
  { path: 'login', component: LoginComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
