package com.edertaveira.musician.musiciancatalog.controller;


import com.edertaveira.musician.musiciancatalog.entity.Instrument;
import com.edertaveira.musician.musiciancatalog.repository.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/instrument")
public class IntrumentController {

    @Autowired
    private InstrumentRepository instrumentRepository;

    @GetMapping(path = "")
    public List<Instrument> retrieveAllInstruments() {
        return (List<Instrument>) instrumentRepository.findAll();
    }

}
