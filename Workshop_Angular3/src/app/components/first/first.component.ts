import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.scss']
})
export class FirstComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  sayHello()
  {
    alert("Hello from Angular");
  }

  initialValue:string = "someText";

  // showMe:boolean=true;
  showMe:boolean=false;

  num:number=1;

  msg:string="Hello from Angular";

  toDate:Date = new Date();

  cur:number = 100;
}
