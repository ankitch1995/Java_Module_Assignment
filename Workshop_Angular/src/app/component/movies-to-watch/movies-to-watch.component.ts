import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/Movie';

@Component({
  selector: 'app-movies-to-watch',
  templateUrl: './movies-to-watch.component.html',
  styleUrls: ['./movies-to-watch.component.scss']
})
export class MoviesToWatchComponent implements OnInit {

  constructor() { }

  movies: Movie[] = [
    { id : 1 , name: 'The Manchurian candiate'},
    { id : 2 , name: 'Ocean 8'},
    { id : 3 , name: 'The Incridibles'},
    { id : 4 , name: 'Hidden Figures'},
    { id : 5 , name: 'Croods'},
  ]

  flag:boolean = true;

  addToWatchlist(movie:Movie){
    if(this.watched.includes(movie))
    {
      alert("Already added !!!!");
    }else
    this.watched.push(movie);
    // alert("hiii");
  }

  removefromWatchlist(){
    this.watched.pop();
  }

  watched:Movie[]=[];

  ngOnInit(): void {
  }

}
