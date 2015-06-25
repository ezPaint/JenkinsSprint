package com.simoncomputing.app.jenkinssprint.domain;

public class Entry {
	private String partyName; 
	private String partyNumber;
	
	public Entry(String name, String num) {
		partyName = name; 
		partyNumber = num;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getPartyNumber() {
		return partyNumber;
	}
	public void setPartyNumber(String partyNumber) {
		this.partyNumber = partyNumber;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (!obj.getClass().equals(getClass())) {
			return false;
		}
		return ((Entry)obj).getPartyName().equals(partyName) 
			&& ((Entry)obj).getPartyNumber().equals(partyNumber);
	}
	
	@Override
	public String toString() {
		return partyName + ":" + partyNumber;
	}
}
