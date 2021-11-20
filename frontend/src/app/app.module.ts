import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { ConteudoComponent } from './conteudo/conteudo.component';
import { HomeComponent } from './conteudo/home/home.component';
import { UsuariosComponent } from './conteudo/usuarios/usuarios.component';
import { ProdutosComponent } from './conteudo/produtos/produtos.component';
import { LoginComponent } from './conteudo/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ConteudoComponent,
    HomeComponent,
    UsuariosComponent,
    ProdutosComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
