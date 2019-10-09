package com.example.tambackend.repository;

import com.example.tambackend.model.Professoren;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//Schnittstelle zur Professoren-Tabelle
public interface ProfessorRepository extends MongoRepository<Professoren, String> {
    Professoren findById(ObjectId id);
}
