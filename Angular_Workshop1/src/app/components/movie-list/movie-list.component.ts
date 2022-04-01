import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.scss']
})
export class MovieListComponent implements OnInit {

  constructor() { }

   MOVIES = [
    {id: 1, name:'Batman'},
    {id: 2, name:'Anabell'},
    {id: 3, name:'Moonlight'},
    {id: 4, name:'HarryPotter'},
    {id: 5, name:'TimeMachine'},
    {id: 6, name:'Mogli'}
  ];
  ngOnInit(): void {
  }

}
