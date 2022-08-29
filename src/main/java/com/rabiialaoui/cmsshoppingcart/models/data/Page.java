package com.rabiialaoui.cmsshoppingcart.models.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="pages")
@Data
public class Page{ 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int matricule;

    private String nom;

    private String prenom;

    private String abrev;

    private String ancien_rh;

    private String rh_ctuel;

    private String gender;

    private String site;

    private String bu;

    private String embauche;

    private String bap;

    private String depart;
    
    private String ancien_collab;

    private String seminaire;

    private String date_seminaire;

    private String app;

    private String poste;

    private int salaire;

    private int sorting;
}
