import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodotto } from './prodotto';
import { RispostaDto } from './risposta-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  prodotti: Prodotto[] = [];
  url = "http://localhost:8080/";

  constructor(private http: HttpClient) { }

  recupera() {
    let oss: Observable<RispostaDto> = this.http
      .get<RispostaDto>(this.url + "recupera");
    oss.subscribe(p => {
      this.prodotti = p.listaProdotti;
    });
  }
}
