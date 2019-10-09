package com.example.tambackend.repository;

import com.example.tambackend.model.Themen;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//Schnittstelle zur Themen-Tabelle
public interface ThemenRepository extends MongoRepository<Themen, String> {
    Themen findById(Integer id);
}
