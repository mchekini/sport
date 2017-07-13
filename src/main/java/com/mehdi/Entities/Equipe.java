package com.mehdi.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Mahdi on 14/07/2017.
 */

@Entity
public class Equipe {

    @Id
    private Long idEquipe;

    private String nomEquipe;

    private String paysEquipe;

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public String getPaysEquipe() {
        return paysEquipe;
    }

    public void setPaysEquipe(String paysEquipe) {
        this.paysEquipe = paysEquipe;
    }


    @Override
    public String toString() {
        return "Equipe{" +
                "idEquipe=" + idEquipe +
                ", nomEquipe='" + nomEquipe + '\'' +
                ", paysEquipe='" + paysEquipe + '\'' +
                '}';
    }
}
