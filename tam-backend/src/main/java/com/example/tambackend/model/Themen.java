package com.example.tambackend.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;


//Klasse: Abschlussarbeitsthemen
public class Themen {
    @Id
    public BigInteger _id;

    public String arbeitsTitel;
    public String arbeitsArt;
    public String fachrichtung;
    public String erstellDatum;
    public String _dozent;
    public String beschreibung;

    //Leerer Konstruktor
    public Themen(){}

    //Konstruktor
    public Themen(BigInteger _id, String arbeitsTitel,
                  String arbeitsArt, String fachrichtung, String erstellDatum, String _dozent, String beschreibung) {
        this._id = _id;
        this.arbeitsTitel = arbeitsTitel;
        this.arbeitsArt = arbeitsArt;
        this.fachrichtung = fachrichtung;
        this.erstellDatum = erstellDatum;
        this._dozent = _dozent;
        this.beschreibung = beschreibung;
    }

    //Setter für ID
    public void setId(BigInteger id) {
        this._id = id;
    }
}
