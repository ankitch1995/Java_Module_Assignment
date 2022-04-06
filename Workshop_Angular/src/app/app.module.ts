import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './component/footer/footer.component';
import { HeaderComponent } from './component/header/header.component';
import { MoviesToWatchComponent } from './component/movies-to-watch/movies-to-watch.component';
import { ImagesComponent } from './component/images/images.component';
import { TodaysChoresComponent } from './component/todays-chores/todays-chores.component';
import { FavoriteLinksComponent } from './component/favorite-links/favorite-links.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    MoviesToWatchComponent,
    ImagesComponent,
    TodaysChoresComponent,
    FavoriteLinksComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
