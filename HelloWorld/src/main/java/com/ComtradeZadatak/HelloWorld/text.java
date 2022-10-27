package com.ComtradeZadatak.HelloWorld;

public class text {

	private Integer id;
	private String naziv;
	private String jezik;
	
	
	
	public text(Integer id, String naziv, String jezik) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.jezik = jezik; 
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getJezik() {
		return jezik;
	}
	public void setJezik(String jezik) {
		this.jezik = jezik;
	}
	
}
