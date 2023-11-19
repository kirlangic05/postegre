package com.postgreSQL.postegre.controller;

import com.postgreSQL.postegre.model.Postgre;
import com.postgreSQL.postegre.service.PostgreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postgre")
public class PostgreController {

    private static final Logger logger = LoggerFactory.getLogger(PostgreController.class);

    @Autowired
    PostgreService service;

    @GetMapping
    public List<Postgre> findAll(){
        logger.info("Read işlemi yapıldı.");
        return service.findAllData();
    }

    @GetMapping("/{id}")
    public Postgre findByID(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Postgre saveData(@RequestBody Postgre postgre){
        logger.info("Create işlemi yapıldı");
        return service.saveData(postgre);
    }

    @DeleteMapping("/{id}")
    public String deleteData(@PathVariable Long id){
        service.deleteData(id);
        logger.info("DELETE işlemi yapıldı");
        return id+" Veri silindi.";
    }

    @PutMapping
    public Postgre updateData(@RequestBody Postgre postgre){
        logger.info("Update işlemi yapıldı.");
        return service.updateData(postgre);
    }


}
