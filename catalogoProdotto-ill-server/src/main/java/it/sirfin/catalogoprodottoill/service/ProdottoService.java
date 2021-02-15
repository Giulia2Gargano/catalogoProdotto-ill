/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoprodottoill.service;

import it.sirfin.catalogoprodottoill.model.Prodotto;
import java.util.List;

public interface ProdottoService {

    List<Prodotto> inserisciProdotto(Prodotto p);

    List<Prodotto> rimuoviProdotto(Prodotto p);

    List<Prodotto> svuotaProdotti();

    List<Prodotto> ritornaLista();
}
