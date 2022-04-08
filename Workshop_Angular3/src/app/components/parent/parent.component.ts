import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.scss']
})
export class ParentComponent implements OnInit {


  parentCounter:number=5;

  parentIncrement(value : number)
  {
    console.log("Inside Parent counter");
    this.parentCounter = value;
  }


  constructor() { }

  ngOnInit(): void {
  }

}
