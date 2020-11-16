import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './home/home.component';
import {InlogComponent} from './inlog/inlog.component';
import {KlantgegevensComponent} from './klantgegevens/klantgegevens.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'inlog', component: InlogComponent },
  { path: 'klantgegevens', component: KlantgegevensComponent },
  { path: 'home', component: HomeComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
