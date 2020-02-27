import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service'
import { Employee } from '../Employee';

@Component({
  selector: 'app-search-delete-employee',
  templateUrl: './search-delete-employee.component.html',
  styleUrls: ['./search-delete-employee.component.css']
})
export class SearchDeleteEmployeeComponent implements OnInit {

  employee: Employee;
  message: any;
  id: number;

  constructor(private service: EmployeeServiceService) { }

  public delteUser(id:number){
    let resp= this.service.deleteEmployee(id);
    resp.subscribe((data)=>this.employee=data);
   }
   
   public findUserById(id){
     let resp= this.service.getEmployeebyId(this.id);
     resp.subscribe((data)=>this.employee=data);
    }
   
     ngOnInit() {
       let resp=this.service.getEmployees();
       resp.subscribe((data)=>this.employee=data);
     }

}
