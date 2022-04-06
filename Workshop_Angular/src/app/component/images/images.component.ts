import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-images',
  templateUrl: './images.component.html',
  styleUrls: ['./images.component.scss']
})
export class ImagesComponent implements OnInit {

  constructor() { }

  images = [
    { id : 1 , name: 'link1' , path:"assets/img/mandalorian.jpg"},
    { id : 2 , name: 'link2',path:"assets/img/penthouses.jpg"},
    { id : 3 , name: 'link3', path:"assets/img/supergirl.jpg"}
   
  ]

  ngOnInit(): void {
  }

}
