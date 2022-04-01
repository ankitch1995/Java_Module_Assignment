import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {

  header1:string="Movies To Watch";
  header2:string="Random Images";
  header3:string="Today's Chores";

  msg1:string="The Manchurian Candidate";
  msg2:string="Ocean 8";
  msg3:string="The Incredibles";
  msg4:string="Hidden Figures";
  msg5:string="The Himalayas";
  msg6:string="The End Of World";

  msg7:string="Empty Dishwasher";
  msg8:string="Complete";
  msg9:string="LaunchCode Preparation";
  msg10:string="Buy Gloceries";
  msg11:string="Market Place";
  


  constructor() { }


  IMAGES = [
    {id:1, name: 'link1', path:"assets/img/Angular.png"},
    {id:2, name: 'link2', path:"assets/img/Java.png"},
    {id:3, name: 'link3', path:"assets/img/Python.png"}
  ]

  ngOnInit(): void {
  }

}
