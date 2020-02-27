import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';
import { Employee } from '../Employee'

@Component({
  selector: 'app-register-employee',
  templateUrl: './register-employee.component.html',
  styleUrls: ['./register-employee.component.css']
})
export class RegisterEmployeeComponent implements OnInit {

  constructor(private service:EmployeeServiceService) { }

  employee: Employee = new Employee(0,"","","","","");
  message: any;

  ngOnInit() {
  }

  public registerNow(){
    let resp=this.service.doRegistration(this.employee);
    resp.subscribe((data)=>this.message=data);
  }

}
