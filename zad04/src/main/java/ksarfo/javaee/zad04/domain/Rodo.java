package ksarfo.javaee.zad04.domain;

public class Rodo {
	private boolean personalDataAcc = false;
	private boolean sellingDataAcc = false;
	
	public Rodo() {
		
	}
	
	public boolean isPersonalDataAcc() {
		
		return personalDataAcc;
	}
	
	public void setPersonalDataAcc( boolean personalDataAcc ) {
		
		this.personalDataAcc = personalDataAcc;
	}
	
	public boolean isSellingDataAcc() {
		
		return sellingDataAcc;
	}
	
	public void setSellingDataAcc(boolean sellingDataAcc) {
		
		this.sellingDataAcc = sellingDataAcc;
	}
	
	
}
