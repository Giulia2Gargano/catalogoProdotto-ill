/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoprodottoill.dto;

import it.sirfin.catalogoprodottoill.model.Prodotto;

/**
 *
 * @author Palo
 */
public class RichiestaProdottoDto {

    private Prodotto prodotto;

    public RichiestaProdottoDto() {
    }

    public RichiestaProdottoDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "RichiestaDto{" + "prodotto=" + prodotto + '}';
    }

}
