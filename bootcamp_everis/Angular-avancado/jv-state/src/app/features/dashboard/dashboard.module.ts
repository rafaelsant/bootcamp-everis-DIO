import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateTodoComponent } from './create-todo/create-todo.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LastTodosComponent } from './last-todos/last-todos.component';
import { ListItemComponent } from './list-item/list-item.component';
import { ListComponent } from './list/list.component';



@NgModule({
  declarations: [CreateTodoComponent, DashboardComponent, LastTodosComponent, ListItemComponent, ListComponent],
  imports: [
    CommonModule
  ]
})
export class DashboardModule { }
