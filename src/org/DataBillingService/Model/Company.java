package org.DataBillingService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	
	@Id
	@Column(name="idCompany")
	private String id;
	
	@Column
	private String Name;
	
	@Column
	private String UserWS;
	
	@Column
	private String PassWs;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUserWS() {
		return UserWS;
	}

	public void setUserWS(String userWS) {
		UserWS = userWS;
	}

	public String getPassWs() {
		return PassWs;
	}

	public void setPassWs(String passWs) {
		PassWs = passWs;
	}
	
	
	
}
