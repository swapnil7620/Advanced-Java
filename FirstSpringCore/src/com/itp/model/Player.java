package com.itp.model;




public class Player  
{

	private int jno;
	private String pname;
	private int matches;
	private int runs;
	
	public Player() {
		System.out.println("No args constructor of Player");
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
	
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + ", matches=" + matches + ", runs=" + runs + "]";
	}


	/*
	@Override
	public void destroy() throws Exception {
		System.out.println("i am just before the destructor destroy method");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("i am immediately after constructor afterPropertiesSet  method");
	}
	*/
//	 @PostConstruct
//	public void First() {
//		System.out.println("i am from first method for initialization after the constructor");
//	}
//	
//	 @PreDestroy
//	public void Last() {
//		System.out.println("i am from last method before destroy the object");
//	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destructor from finalize method");
	}
}
