package com.example.tambackend;

import com.example.tambackend.model.Professoren;
import com.example.tambackend.model.Themen;
import com.example.tambackend.repository.ProfessorRepository;
import com.example.tambackend.repository.ThemenRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/themen")
public class ThemenController {
    @Autowired
    private ThemenRepository repository;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public List<Themen> getAllThemen() {
        return repository.findAll();
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public Themen getThemaById(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

}
