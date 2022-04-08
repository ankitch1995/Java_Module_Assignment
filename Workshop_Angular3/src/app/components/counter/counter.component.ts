import { Component, Input, OnInit, Output, EventEmitter, OnChanges, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.scss']
})
export class CounterComponent implements OnInit, OnChanges {


  @Input() childCounter:number=0;

  @Output() increment = new EventEmitter<number>();

  constructor() { }

  ngOnInit(): void {

    console.log(this.childCounter);
  }

  onIncrement()
  {
    console.log("Inside child increment");
    this.increment.emit(++this.childCounter);
  }

  ngOnChanges(changes: SimpleChanges): void {
      console.log("Onchange");
  }



}
