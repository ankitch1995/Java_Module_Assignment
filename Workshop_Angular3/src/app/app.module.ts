import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { MainComponent } from './components/main/main.component';
import { FooterComponent } from './components/footer/footer.component';
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { FirstComponent } from './components/first/first.component';
import { FormsModule } from '@angular/forms';
import { EmployeeDetailsComponent } from './components/employee-details/employee-details.component';
import { SearchPipe } from './pipes/search.pipe';
import { CounterComponent } from './components/counter/counter.component';
import { ParentComponent } from './components/parent/parent.component';
import { PagenotfoundComponent } from './components/pagenotfound/pagenotfound.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MainComponent,
    FooterComponent,
    MovieListComponent,
    FirstComponent,
    EmployeeDetailsComponent,
    SearchPipe,
    CounterComponent,
    ParentComponent,
    PagenotfoundComponent
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
