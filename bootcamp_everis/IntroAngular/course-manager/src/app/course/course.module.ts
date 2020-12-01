import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseListComponent } from '../courses/course-list.component';
import { CourseInfoComponent } from '../courses/course-info/course-info.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { StarModule } from '../shared/component/star/star.module';
import { AppPipeModule } from '../shared/component/pipe/app-pipe.module';



@NgModule({
  declarations: [
    CourseListComponent,
    CourseInfoComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    StarModule,
    AppPipeModule,
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
