package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.dao.Dao;
import com.entity.Candidate;

public class Service {
	Scanner Sc = new Scanner(System.in);
	Dao dao = null;

	public List<Candidate> getAllCandidate() {
		dao = new Dao();
		List<Candidate> allCandidate = dao.getAllCandidate();
		return allCandidate;
	}

	public int insertcandidate() {
		int insert = 0;
		dao = new Dao();
		System.out.print("Enter Candidate ID : ");
		int c_id = Sc.nextInt();
		Sc.nextLine();
		System.out.print("\nEnter Candidate Name : ");
		String name = Sc.nextLine();
		System.out.print("\nEnter Candidate Party Name : ");
		String partyname = Sc.nextLine();
		System.out.print("\nEnter Candidate Assembly Name : ");
		String assembly = Sc.nextLine();
		System.out.print("\nEnter Candidate State Name : ");
		String statename = Sc.nextLine();
		System.out.print("\nEnter Candidate Gender : ");
		String gender = Sc.nextLine();
		System.out.print("\nEnter Candidate Age : ");
		int age = Sc.nextInt();
		try {
			insert = dao.insertcandidate(c_id, name, partyname,assembly, statename, gender,age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return insert;
	}

	public int updatecandidate() {
		int update = 0;
		dao = new Dao();
		System.out.print("Enter Candidate ID : ");
		int c_id = Sc.nextInt();
		Sc.nextLine();
		System.out.print("\nEnter Candidate Name : ");
		String name = Sc.nextLine();
		System.out.print("\nEnter Candidate Party Name : ");
		String partyname = Sc.nextLine();
		System.out.print("\nEnter Candidare Assembly Name : ");
		String assembly = Sc.nextLine();
		System.out.print("\nEnter Candidate State Name : ");
		String statename = Sc.nextLine();
		System.out.print("\nEnter Candidate Gender : ");
		String gender = Sc.nextLine();
		System.out.print("\nEnter Candidate Age : ");
		int age = Sc.nextInt();
		Sc.nextLine();
		try {
			update = dao.updatecandidate(c_id,name,partyname,assembly,statename,gender,age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return update;
	}
	
	public int deletecandidate()
	{
		int delete=0;
		dao = new Dao();
		System.out.print("Enter Candidate ID : ");
		int c_id = Sc.nextInt();
		Sc.nextLine();
		
		try {
			delete = dao.deletecandidate(c_id);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return delete;
	}

	public List<Candidate> getCandidateByPname(String partyname) {
		partyname = partyname.toUpperCase();
		partyname.toString();
		ArrayList<Candidate> l1 = new ArrayList<Candidate>();
		ArrayList<Candidate> can = (ArrayList<Candidate>) this.getAllCandidate();
		for (Candidate c : can) {
			if (c.getPartyname().equals(partyname)) {
				l1.add(c);
			}
		}
		return l1;
	}

	public List<Candidate> getCandidateByState(String statename) {
		statename = statename.toUpperCase();
		ArrayList<Candidate> l2 = new ArrayList<Candidate>();
		ArrayList<Candidate> can = (ArrayList<Candidate>) this.getAllCandidate();
		for (Candidate c : can) {
			if (c.getStatename().equals(statename)) {
				l2.add(c);
			}
		}
		return l2;
	}

	public Set<String> getCandidateNameList() {
		Set<String> l3 = new HashSet<String>();
		List<Candidate> can = this.getAllCandidate();
		for (Candidate c : can) {
			l3.add(c.getName());

		}
		return l3;

	}
}