package com.propel.app.service;

import java.util.List;
import java.util.Optional;

import com.propel.app.model.Visit;

public interface IVisitService {
	
	public List<Visit> getAllVisits();

	public Optional<Visit> getVisitById(Integer id);

	public void addVisit(Visit visit);

	public void updateVisit(Visit visit);

	public void deleteVisit(Integer id);

}
