package org.DataBillingService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address  {
	
	@Id
	@Column(name="idAddress")
	private int id;
	
	@Column
	private String Street;
	
	@Column
	private String ExternalNumber;
	
	@Column
	private String InternalNumber;
	
	@Column
	private String Suburb;
	
	@Column
	private String Municipaly;
	
	@Column
	private String State;
	
	@Column
	private String Country;
	
	@Column
	private int ZipCode;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getExternalNumber() {
		return ExternalNumber;
	}

	public void setExternalNumber(String externalNumber) {
		ExternalNumber = externalNumber;
	}

	public String getInternalNumber() {
		return InternalNumber;
	}

	public void setInternalNumber(String internalNumber) {
		InternalNumber = internalNumber;
	}

	public String getSuburb() {
		return Suburb;
	}

	public void setSuburb(String suburb) {
		Suburb = suburb;
	}

	public String getMunicipaly() {
		return Municipaly;
	}

	public void setMunicipaly(String municipaly) {
		Municipaly = municipaly;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getZipCode() {
		return ZipCode;
	}

	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}

}
