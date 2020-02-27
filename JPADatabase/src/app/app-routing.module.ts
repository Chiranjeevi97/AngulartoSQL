import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterEmployeeComponent } from './register-employee/register-employee.component';
import { SearchDeleteEmployeeComponent } from './search-delete-employee/search-delete-employee.component';
import { LoginComponent } from './login/login.component'


const routes: Routes = [
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"register",component:RegisterEmployeeComponent},
  {path:"search",component:SearchDeleteEmployeeComponent},
  {path:"login",component:LoginComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
