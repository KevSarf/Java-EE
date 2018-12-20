package ksarfo.javaee.zad04.domain;

import java.util.Date;

public class Phone {
	
	private long id;
	private String dataProd;
	private String opinia;
	private String extra ="";
	private double price;
	public Phone() {


	}
	
	public Phone(long id, String  dataProd, String opinia, String extra, Double price) {
		this.id = id;
		this.dataProd=dataProd;
		this.opinia = opinia;
		this.extra = extra;
		this.price = price;		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDataProd() {
		return dataProd;
	}
	
	public void setDataProd(String  dataProd) {
		this.dataProd = dataProd;
	}
	
	public String getOpinia() {
		return opinia;
	}
	
	public void setOpinia(String opinia) {
		this.opinia = opinia;
	}
	
	
	public String getExtra() {
		return extra;
	}
	
	public void setExtra(String  extra) {
		this.extra = extra;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}

