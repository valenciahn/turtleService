package org.DataBillingService.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Device")
public class Device {
	
	@Id
	@Column(name="SerialNumber")
	private String id;
	
	@Column
	@OneToMany
	private List<Company> Company;
	
	@Column
	private String idRegisterKey;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Company> getCompany() {
		return Company;
	}

	public void setCompany(List<Company> company) {
		Company = company;
	}

	public String getIdRegisterKey() {
		return idRegisterKey;
	}

	public void setIdRegisterKey(String idRegisterKey) {
		this.idRegisterKey = idRegisterKey;
	}
	
	
}
