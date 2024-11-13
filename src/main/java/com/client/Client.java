package com.client;

import java.util.List;
import java.util.Set;

import com.controller.Controller;
import com.entity.Candidate;

public class Client {
	public static void main(String[] args) {
		Controller controller = null;
		controller = new Controller();
		List<Candidate> allCandidate = controller.getAllCandidate();
		for (Candidate candidate : allCandidate) {
//	System.out.println(candidate);
		}
//		controller.insertcandidate();

//	controller.updatecandidate();

//	controller.deletecandidate();

//		List<Candidate> db1 = controller.getCandidateByPname("NCP");
//		System.out.println(db1);

//		List<Candidate> db2 = controller.getCandidateByState("MP");
//		System.out.println(db2);

//		Set<String> db3 = controller.getCandidateNameList();
//		System.out.println(db3);
	}
}