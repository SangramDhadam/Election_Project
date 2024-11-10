package com.tka.eci.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.eci.dao.Dao;
import com.tka.eci.entity.Candidate;

public class Service {
	
	Dao dao=null;
	
	public List<Candidate> getAllCandidates(){
		dao=new Dao();
		List<Candidate>allcandidates=dao.getAllCandidates();
		
		return allcandidates;
		
	}

	public List<Candidate> getAllIndeCandidates() {
		List<Candidate>listofindecandidates=new ArrayList<Candidate>();
		dao=new Dao();
		
		List<Candidate>allcandidates=dao.getAllCandidates();
		
		for (Candidate c : allcandidates) {
			if(c.getPartyName().equals("Independent")) {
				listofindecandidates.add(c);
			}
			
		}
		
		
		return listofindecandidates;
	}

	public List<Candidate> getAllNCPCandidates() {
		List<Candidate>listofncpcandidates=new ArrayList<Candidate>();
		
		dao=new Dao();
		
		List<Candidate> allcandidates = dao.getAllCandidates();
		
		for (Candidate c1 : allcandidates) {
			if(c1.getPartyName().equals("Nationalist Congress Party  Sharadchandra Pawar")) {
				listofncpcandidates.add(c1);
			}
			
		}
		return listofncpcandidates;
	}

	public List<Candidate> getAllCandidatesFromPatan() {
		List<Candidate>listofpatancandidates=new ArrayList<Candidate>();
		
		dao=new Dao();
		
		List<Candidate> allCandidates = dao.getAllCandidates();
		
		for (Candidate c2 : allCandidates) {
			if(c2.getAssembly().equals("Patan")) {
				listofpatancandidates.add(c2);
			}
			
		}
		return listofpatancandidates;
	}

}
