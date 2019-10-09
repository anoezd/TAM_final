package com.example.tambackend;

import com.example.tambackend.model.Professoren;
import com.example.tambackend.repository.ProfessorRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professoren")
public class ProfessorController {
    @Autowired
    private ProfessorRepository repository;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public List<Professoren> getAllProfessoren() {
        return repository.findAll();
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public Professoren getProfessorById(@PathVariable("id") ObjectId id){
        return repository.findById(id);
    }
}
