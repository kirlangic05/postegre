package com.postgreSQL.postegre.repository;

import com.postgreSQL.postegre.model.Postgre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgreRepository extends JpaRepository<Postgre,Long> {
}
