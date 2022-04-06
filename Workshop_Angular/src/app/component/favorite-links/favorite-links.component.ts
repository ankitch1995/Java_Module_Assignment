import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-favorite-links',
  templateUrl: './favorite-links.component.html',
  styleUrls: ['./favorite-links.component.scss']
})
export class FavoriteLinksComponent implements OnInit {

  constructor() { }

  links = [
    { id : 1 , name: 'link1' , path:"#"},
    { id : 2 , name: 'link2',path:"#"},
    { id : 3 , name: 'link3', path:"#"},
    { id : 4 , name: 'link4', path:"#"},
    { id : 5 , name: 'link5', path:"#"},
    { id : 6 , name: 'link6', path:"#"},
   
  ]

  ngOnInit(): void {
  }

}
