package com.crick.artcomm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crick.artcomm.model.Progetti;

@Repository
public interface ProgettiRepository extends CrudRepository<Progetti, Long>{

}
