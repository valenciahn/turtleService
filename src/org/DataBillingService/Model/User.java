package org.DataBillingService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@Column(name="idUser")
	private int id;
	@Column
	private String UserName;
	@Column
	private String Password;
	@Column
	private String Name;
	@Column
	private String LastName;
	@Column
	private String Email;
	@Column
	private Company idCompany;
	

}
