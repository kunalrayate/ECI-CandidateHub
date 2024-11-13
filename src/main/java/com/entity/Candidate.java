package com.entity;

public class Candidate {
	private int c_id;
	private String name;
	private String partyname;
	private String assembly;
	private String statename;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int c_id, String name, String partyname, String assembly, String statename, String gender,
			int age) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.partyname = partyname;
		this.assembly = assembly;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String assembly() {
		return assembly;
	}

	public void setassembly(String assembly) {
		this.assembly = assembly;
	}

	public String getStatename() {
		return statename;
	}

	public void setSname(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getage() {
		return age;
	}

	public void setage() {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", pname=" + partyname + ", sname=" + statename + "]";
	}
}
