import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodotto } from './prodotto';
import { RichiestaDto } from './richiesta-dto';
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

  aggiungi() {
    let req = new RichiestaDto();
    req.prodotto = this.prodotto;

    let oss: Observable<RispostaDto> = this.http
      .post<RispostaDto>(this.url + "aggiungi", req);
    oss.subscribe(p => {
      this.prodotti = p.listaProdotti;
    });
    this.prodotto = new Prodotto();
  }

  svuota() {
    let oss: Observable<RispostaDto> = this.http
      .get<RispostaDto>(this.url + "svuota");
    oss.subscribe(r => {
      this.prodotti = r.listaProdotti;
    });
  }

  elimina(p: Prodotto) {
    let req = new RichiestaDto();
    req.prodotto = p;

    let oss: Observable<RispostaDto> = this.http
      .post<RispostaDto>(this.url + "elimina", req);
    oss.subscribe(r => {
      this.prodotti = r.listaProdotti;
    });
  }
}
