package com.propel.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.propel.app.model.Visit;

@Repository
public interface IVisitRepository extends CrudRepository<Visit, Integer> {

}
