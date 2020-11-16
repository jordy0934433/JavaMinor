import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-inlog',
  templateUrl: './inlog.component.html',
  styleUrls: ['./inlog.component.css']
})
export class InlogComponent implements OnInit {
  notPossible: string;


  constructor() { }

  ngOnInit(): void {
  }

  logIn(): void {
    this.notPossible = 'Niet mogelijk';
  }
}
