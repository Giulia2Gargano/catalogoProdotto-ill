/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoprodottoill.controller;

import it.sirfin.catalogoprodottoill.dto.RichiestaProdottoDto;
import it.sirfin.catalogoprodottoill.dto.RispostaProdottoDto;
import it.sirfin.catalogoprodottoill.model.Prodotto;
import it.sirfin.catalogoprodottoill.service.ProdottoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ProdottoController {

    @Autowired
    ProdottoService prodottoService;

    @RequestMapping("/aggiungi")
    @ResponseBody
    public RispostaProdottoDto aggiungiProdotto(@RequestBody RichiestaProdottoDto dto) {
        //return new RispostaProdottoDto(prodottoService.inserisciProdotto(dto.getProdotto()));
        Prodotto p = dto.getProdotto();
        List<Prodotto> lista = prodottoService.inserisciProdotto(p);
        RispostaProdottoDto risp = new RispostaProdottoDto(lista);
        return risp;
    }

    @RequestMapping("/elimina")
    @ResponseBody
    public RispostaProdottoDto eliminaProdotto(@RequestBody RichiestaProdottoDto dto) {
        return new RispostaProdottoDto(prodottoService.rimuoviProdotto(dto.getProdotto()));
    }

    @RequestMapping("/svuota")
    @ResponseBody
    public RispostaProdottoDto cancellaProdotti() {
        return new RispostaProdottoDto(prodottoService.svuotaProdotti());
    }

    @RequestMapping("/recupera")
    @ResponseBody
    public RispostaProdottoDto ritornaLista() {
        return new RispostaProdottoDto(prodottoService.ritornaLista());
    }
}
