import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeadComponenteComponent } from './head/head-componente/head-componente.component';
import { ConteudoComponenteComponent } from './conteudo/conteudo-componente/conteudo-componente.component';


@NgModule({
  declarations: [
    AppComponent,
    HeadComponenteComponent,
    ConteudoComponenteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
