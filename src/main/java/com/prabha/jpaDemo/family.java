package com.prabha.jpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class family {
	
	@Id
	private int Mid;
	private String Mname;
	private String Mgender;
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getMgender() {
		return Mgender;
	}
	public void setMgender(String mgender) {
		Mgender = mgender;
	}
	
	@Override
	public String toString() {
		return "family [Mid=" + Mid + ", Mname=" + Mname + ", Mgender=" + Mgender + "]";
	}
	

}
