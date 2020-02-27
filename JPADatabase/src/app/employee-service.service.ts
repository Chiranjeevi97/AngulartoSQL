import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  constructor(private http:HttpClient) { }

  public getEmployees(){

    return this.http.get("http://localhost:8082/employee");
  }

  public getEmployeebyId(id){

    return this.http.get("http://localhost:8082/employee/" + id);
  }

  public doRegistration(user){
    
    return this.http.post("http://localhost:8082/employee/",user,{responseType:'text' as 'json'});
  }

  public deleteEmployee(id){

    return this.http.delete("http://localhost:8082/employee/" + id);
  }

}
