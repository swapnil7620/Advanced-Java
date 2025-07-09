package com.Itp.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//@Table(name = "Sports_Man")

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class Player   
{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jno;
	private String pname;
	private int matches;
	private int runs;
	
	public Player() {
//		System.out.println("No args constructor of Player");
	}
	

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public Player(int jno, String pname, int matches, int runs) {
		
		this.jno = jno;
		this.pname = pname;
		this.matches = matches;
		this.runs = runs;
	}
	
	
public Player( String pname, int matches, int runs) {
		this.pname = pname;
		this.matches = matches;
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + ", matches=" + matches + ", runs=" + runs + "]";
	}


		
}
