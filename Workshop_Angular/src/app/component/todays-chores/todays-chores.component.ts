import { Component, OnInit } from '@angular/core';
import { Chores } from 'src/Chores';

@Component({
  selector: 'app-todays-chores',
  templateUrl: './todays-chores.component.html',
  styleUrls: ['./todays-chores.component.scss']
})
export class TodaysChoresComponent implements OnInit {

  constructor() { }

  todaysChores :Chores[]= [
    { id : 1 , name: 'load Dishwasher'},
    { id : 2 , name: 'Buy Groceries'},
    { id : 3 , name: 'Demo'}
  
  ]

  yesterdayChores :Chores[]= [
    { id : 1 , name: 'Empty Dishwasher'},
    { id : 2 , name: 'Buy Groceries'},
    { id : 3 , name: 'finish launch prepare code'}
  ]

  tommarowChores :Chores[]= [
    { id : 1 , name: 'Empty Dishwasher Again'},
    { id : 2 , name: 'Groceries Again'},
    { id : 3 , name: 'play with launch prepare code'},
    { id : 3 , name: 'play with launch prepare code'}
  ]

  // myVar:boolean=true;




  path:string="assets/img/target.jpg";


  ngOnInit(): void {
  }

}
