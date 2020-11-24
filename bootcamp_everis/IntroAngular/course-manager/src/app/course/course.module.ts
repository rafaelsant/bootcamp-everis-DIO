import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseListComponent } from '../courses/course-list.component';
import { CourseInfoComponent } from '../courses/course-info/course-info.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ReplacePipe } from '../replace.pipe';
import { StarComponent } from '../star/star.component';



@NgModule({
  declarations: [
    CourseListComponent,
    CourseInfoComponent,
    ReplacePipe,
    StarComponent 
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule.forChild([
      {
        path: 'courses',component: CourseListComponent
      },
      {
        path: 'courses/info/:id', component: CourseInfoComponent
      }
    ])
  ]
})
export class CourseModule { }
