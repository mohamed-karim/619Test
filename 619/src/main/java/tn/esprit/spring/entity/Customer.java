package tn.esprit.spring.entity;

import java.net.PasswordAuthentication;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

@Entity
public class Customer {

	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Client")
	private long id_Client;

	@Column(name = "customer_Name")
	private String customer_Name;

	@Column(name = "first_Name")
	private String first_Name;

	@Temporal(TemporalType.DATE)
	private Date date_Naissance;

	@Column(name = "email_Customer")
	private Email email_Customer;
	
	@Column(name = "email_Customer")
	private PasswordAuthentication password_Customer;
	
	@Column(name = "adresse_Customer")
	private String adresse_Custome;

	public long getId_Client() {
		return id_Client;
	}

	//constructeur
	
	
	
	
	public Customer() {
		super();
	}
	
	
//toString
	
	
	
	@Override
	public String toString() {
		return "Customer [id_Client=" + id_Client + ", customer_Name=" + customer_Name + ", first_Name=" + first_Name
				+ ", date_Naissance=" + date_Naissance + ", email_Customer=" + email_Customer + ", password_Customer="
				+ password_Customer + ", adresse_Custome=" + adresse_Custome + "]";
	}

	
	//getter and setter
	
	
	
	
	public String getCustomer_Name() {
		return customer_Name;
	}

	

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public Date getDate_Naissance() {
		return date_Naissance;
	}

	public void setDate_Naissance(Date date_Naissance) {
		this.date_Naissance = date_Naissance;
	}

	public Email getEmail_Customer() {
		return email_Customer;
	}

	public void setEmail_Customer(Email email_Customer) {
		this.email_Customer = email_Customer;
	}

	public PasswordAuthentication getPassword_Customer() {
		return password_Customer;
	}

	public void setPassword_Customer(PasswordAuthentication password_Customer) {
		this.password_Customer = password_Customer;
	}

	public String getAdresse_Custome() {
		return adresse_Custome;
	}

	public void setAdresse_Custome(String adresse_Custome) {
		this.adresse_Custome = adresse_Custome;
	}
	
	
	
	
	
	
	
}
