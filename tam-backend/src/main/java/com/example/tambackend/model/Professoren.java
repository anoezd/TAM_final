package com.example.tambackend.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


// Klasse Professoren
public class Professoren {
    @Id
    public ObjectId id;

    public String name;
    public String schwerpunkt;
    public String email;

    //Leerer Konstruktor
    public Professoren(){}

    //Konstruktor
    public Professoren(ObjectId id, String name, String schwerpunkt, String email) {
        this.id = id;
        this.name = name;
        this.schwerpunkt = schwerpunkt;
        this.email = email;
    }

    //Setter & Getter für ID
    public void setId(ObjectId id) {
        this.id = id;
    }
    public String getId(){
        return id.toHexString();
    }
}
