package com.tka.eci.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.eci.entity.Candidate;

public class Dao {

	public List<Candidate> getAllCandidates() {

		List<Candidate> allcandidates = new ArrayList<Candidate>();

		allcandidates.add(new Candidate("Patankar Satyajit Vikramsinh", "Patan", "Independent", 55, "male"));
		allcandidates.add(new Candidate("Desai Shamburaj Shivajirao", "Patan", "Shivsena", 56, "male"));
		allcandidates.add(new Candidate("Kadam Harshad Mohanrao", "Patan", "Shivsena UBT", 34, "male"));
		allcandidates.add(new Candidate("Gujar Indrajit Ashok ", "Karad South", "Swabhimani Paksha", 53, "male"));
		allcandidates.add(new Candidate("Chavan Prithviraj Dajisaheb ", "Karad South", "Indian National Congress", 78, "male"));
		allcandidates.add(new Candidate("Bhosale Atulbaba Suresh ", "Karad South", "BJP", 41, "male"));
		allcandidates.add(new Candidate("Chavan Somnath Ramesh ", "Karad North", "Rashtriya Samaj Paksh", 34, "male"));
		allcandidates.add(new Candidate("Ghorpade Manoj BHimrao ", "Karad North", "BJP", 47, "male"));
		allcandidates.add(new Candidate("Patil Balasaheb Pandurang ", "Karad North","Nationalist Congress Party  Sharadchandra Pawar", 63, "male"));
		allcandidates.add(new Candidate("Shinde Shashkant Jaywant ", "Koregaon","Nationalist Congress Party  Sharadchandra Pawar", 61, "male"));
		allcandidates.add(new Candidate(" Chavan Umesh Bhau", "Koregaon", "Rashtriya Samaj Paksh", 34, "male"));
		allcandidates.add(new Candidate("Shinde Mahesh Sambhajiraje", "Koregaon", "Shivsena", 49, "male"));
		allcandidates.add(new Candidate("Patil Jayant Rajaram", "Islampur","Nationalist Congress Party  Sharadchandra Pawar", 62, "male"));

		return allcandidates;

	}

}
