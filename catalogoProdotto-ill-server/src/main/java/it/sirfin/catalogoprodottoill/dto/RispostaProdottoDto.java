/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoprodottoill.dto;

import it.sirfin.catalogoprodottoill.model.Prodotto;
import java.util.List;

/**
 *
 * @author Palo
 */
public class RispostaProdottoDto {

    private List<Prodotto> listaProdotti;

    public RispostaProdottoDto() {
    }

    public RispostaProdottoDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "RispostaDto{" + "listaProdotti=" + listaProdotti + '}';
    }

}
