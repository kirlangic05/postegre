package com.postgreSQL.postegre.service;

import com.postgreSQL.postegre.model.Postgre;
import com.postgreSQL.postegre.repository.PostgreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostgreService {

    @Autowired
    PostgreRepository repo;

    public List<Postgre> findAllData(){
        return repo.findAll();
    }

    public Postgre  findById(Long id){
        return repo.findById(id).get();


    }

    public Postgre saveData(Postgre postgre){
        return repo.save(postgre);
    }

    public void deleteData(Long id){
        repo.deleteById(id);
    }

    public Postgre updateData(Postgre requestPostgre){
        Postgre existingPostgre = repo.findById(requestPostgre.getId()).get();
        existingPostgre.setId(requestPostgre.getId());
        existingPostgre.setName(requestPostgre.getName());
        existingPostgre.setSurname(requestPostgre.getSurname());

        return repo.save(existingPostgre);
    }
}
