/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoprodottoill.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prodotto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String descrizione;

    @Column
    private Float prezzo;

    public Prodotto() {
    }

    public Prodotto(String descrizione, Float prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "id=" + id + ", descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }

}
