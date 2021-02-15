/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoprodottoill.service.impl;

import it.sirfin.catalogoprodottoill.model.Prodotto;
import it.sirfin.catalogoprodottoill.repository.ProdottoRepository;
import it.sirfin.catalogoprodottoill.service.ProdottoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdottoServiceImpl implements ProdottoService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public List<Prodotto> inserisciProdotto(Prodotto p) {
        prodottoRepository.save(p);
        return ritornaLista();
    }

    @Override
    public List<Prodotto> rimuoviProdotto(Prodotto p) {
        prodottoRepository.delete(p);
        return ritornaLista();
    }

    @Override
    public List<Prodotto> svuotaProdotti() {
        prodottoRepository.deleteAllInBatch();
        return ritornaLista();
    }

    @Override
    public List<Prodotto> ritornaLista() {
        return prodottoRepository.findAll();
    }

}
