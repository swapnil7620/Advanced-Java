package com.itp.model;

public class Customer {
	
	private int CustId;
	private String CusName;
	private String CustAge;
	
	public Customer() {
	}
	
	public Customer(int custId, String cusName, String custAge) {

		CustId = custId;
		CusName = cusName;
		CustAge = custAge;
	}
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CusName=" + CusName + ", CustAge=" + CustAge + "]";
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public String getCusName() {
		return CusName;
	}

	public void setCusName(String cusName) {
		CusName = cusName;
	}

	public String getCustAge() {
		return CustAge;
	}

	public void setCustAge(String custAge) {
		CustAge = custAge;
	}

	

}
