package com.propel.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propel.app.model.Visit;
import com.propel.app.repository.IVisitRepository;
@Service
public class VisitServiceImpl implements IVisitService {

	@Autowired
	private IVisitRepository visitRepository;
	
	@Override
	public List<Visit> getAllVisits() {
		return (List<Visit>) visitRepository.findAll();
	}

	@Override
	public Optional<Visit> getVisitById(Integer id) {
		return visitRepository.findById(id);
	}

	@Override
	public void addVisit(Visit visit) {
		visitRepository.save(visit);
	}

	@Override
	public void updateVisit(Visit visit) {
		visitRepository.save(visit);
	}

	@Override
	public void deleteVisit(Integer id) {
		visitRepository.deleteById(id);

	}

}
