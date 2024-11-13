package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Candidate;

public class Dao {
	String url = "jdbc:mysql://localhost:3307/advjava193";
	String uname = "root";
	String pwd = "root";
	Connection con = null;
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Dao dao = null;
	String sql = "SELECT * FROM advjava193.candidate";
	List<Candidate> allcandidate = null;

	public List<Candidate> getAllCandidate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pwd);
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			allcandidate = new ArrayList<Candidate>();
			while (rs.next()) {
				int c_id = rs.getInt("c_id");
				String name = rs.getString("name");
				String partyname = rs.getString("partyname");
				String assembly = rs.getString("assembly");
				String statename = rs.getString("statename");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");
				Candidate candidate = new Candidate(c_id, name, partyname, assembly, statename, gender, age);
				allcandidate.add(candidate);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allcandidate;
	}

	public void closeconnection() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int insertcandidate(int c_id, String name, String partyname, String assembly, String statename,
			String gender, int age) {
		dao = new Dao();
		String query = "INSERT INTO candidate(c_id,name,partyname, assembly,statename,gender,age)VALUES(?,?,?,?,?,?,?)";
		try {
			con = DriverManager.getConnection(url, uname, pwd);
			ps = con.prepareStatement(query);
			ps.setInt(1, c_id);
			ps.setString(2, name);
			ps.setString(3, partyname);
			ps.setString(4, assembly);
			ps.setString(5, statename);
			ps.setString(6, gender);
			ps.setInt(7, age);
			ps.execute();
			System.out.println("Your Data Is Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.closeconnection();
		return 0;
	}

	public int updatecandidate(int c_id, String name, String partyname, String assembly, String statename,
			String gender, int age) {
		dao = new Dao();
		String query = "UPDATE candidate SET name = ?, partyname = ?, assembly = ? ,statename = ?, gender = ? ,age = ? WHERE c_id = ?";
		try {
			con = DriverManager.getConnection(url, uname, pwd);
			ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, partyname);
			ps.setString(3, assembly);
			ps.setString(4, statename);
			ps.setString(5, gender);
			ps.setInt(6, age);
			ps.setInt(7, c_id);
			ps.executeUpdate();
			System.out.println("Your Data is Updated...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.closeconnection();
		return 0;
	}

	public int deletecandidate(int c_id) {
		dao = new Dao();
		int rowsupdated = 0;
		String query = "DELETE from candidate where c_id=?";
		try {
			con = DriverManager.getConnection(url, uname, pwd);
			ps = con.prepareStatement(query);
			ps.setInt(1, c_id);
			rowsupdated = ps.executeUpdate();

			System.out.println("Your Data is Deleted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.closeconnection();
		return rowsupdated;
	}
}