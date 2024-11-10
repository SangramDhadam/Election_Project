package com.tka.eci.controller;

import java.util.List;

import com.tka.eci.entity.Candidate;
import com.tka.eci.service.Service;

public class Controller {
	
	Service service=null;
	
	public List<Candidate> getAllCandidates(){
		service=new Service();
		
		List<Candidate>allcandidates=service.getAllCandidates();		
		return allcandidates;
		
	}

	public List<Candidate> getAllIndeCandidates() {
		service=new Service();
		List<Candidate>listofindecandidates=service.getAllIndeCandidates();
		return listofindecandidates;
	}

	public List<Candidate> getAllNCPCandidates() {
		
		service=new Service();
		List<Candidate>listofncpcandidates=service.getAllNCPCandidates();
		return listofncpcandidates;
	}

	public List<Candidate> getAllCandidatesFromPatan() {
		
		service=new Service();
		List<Candidate>listofpatancandidates=service.getAllCandidatesFromPatan();
		return listofpatancandidates;
	}

}
