package com.tka.eci.entity;

public class Candidate {

	private String name;
	private String Assembly;
	private String partyName;
	private int age;
	private String gender;

	public Candidate() {
		super();
	}

	public Candidate(String name, String assembly, String partyName, int age, String gender) {
		super();
		this.name = name;
		Assembly = assembly;
		this.partyName = partyName;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssembly() {
		return Assembly;
	}

	public void setAssembly(String assembly) {
		Assembly = assembly;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", Assembly=" + Assembly + ", partyName=" + partyName + "]";
	}

}
