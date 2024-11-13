package com.controller;

import java.util.List;
import java.util.Set;

import com.entity.Candidate;
import com.service.Service;

public class Controller {
	Service service = null;

	public List<Candidate> getAllCandidate() {
		service = new Service();
		List<Candidate> allCandidate = service.getAllCandidate();
		return allCandidate;
	}

	public int insertcandidate() {
		return new Service().insertcandidate();
	}

	public int updatecandidate() {
		return new Service().updatecandidate();
	}

	public int deletecandidate() {
		return new Service().deletecandidate();
	}

	public List<Candidate> getCandidateByPname(String partyname) {
		return new Service().getCandidateByPname(partyname);
	}

	public List<Candidate> getCandidateByState(String sname) {
		return new Service().getCandidateByState(sname);
	}

	public Set<String> getCandidateNameList() {
		return new Service().getCandidateNameList();
	}
}