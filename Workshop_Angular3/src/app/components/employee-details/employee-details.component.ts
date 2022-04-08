import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { Employee } from 'src/utilities/Employee';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.scss']
})
export class EmployeeDetailsComponent implements OnInit,OnChanges {


  employees:Employee[]=[{
    empId:101,
    name:"Ankit",
    designation:"Manager",
    image:"assets/img/Angular.png",
    flag:true
  },
  {
    empId:102,
    name:"Sanjay",
    designation:"Engineer",
    image:"assets/img/Java.png",
    flag:true
  },
  {
    empId:103,
    name:"Shubham",
    designation:"Doctor",
    image:"assets/img/Python.png",
    flag:true
  },
  {
    empId:104,
    name:"Amit",
    designation:"Software_Employee",
    image:"assets/img/Emp1.jpg",
    flag:true
  },
  {
    empId:105,
    name:"Priya",
    designation:"Doctor",
    image:"assets/img/Emp2.jpg",
    flag:true
  },
  {
    empId:106,
    name:"Rahul",
    designation:"Carpenter",
    image:"assets/img/Emp3.jpg",
    flag:true
  },
  {
    empId:107,
    name:"Shweta",
    designation:"Painter",
    image:"assets/img/Emp4.jpg",
    flag:true
  },
  {
    empId:108,
    name:"Sanjeev",
    designation:"Banker",
    image:"assets/img/Emp3.jpg",
    flag:true
  }]

  searchStr:string="";
  
  constructor() { 
    console.log("Constructor");
  }
  //Constructor is used for Initializing properties and to Inject dependency.
  ngOnInit(): void {
    console.log("Oninit()");
    // API consumption
  }

  ngOnChanges(changes: SimpleChanges): void {
      console.log("Onchanges()");
      // It's not printing bcoz we are not passing any child component.
  }

  toogleImage(employee:Employee)
  {
    employee.flag =! employee.flag;
    //employee.flag = false
    //employee.flag = true
  }
}
