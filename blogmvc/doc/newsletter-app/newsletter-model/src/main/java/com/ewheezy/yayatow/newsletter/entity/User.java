package com.ewheezy.yayatow.newsletter.entity;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Address;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.log4j.Logger;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.ewheezy.yayatow.newsletter.entity.base.AbstractEntity;


@Entity
@Table(name = "user")
public class User extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private static Logger LOGGER = Logger.getLogger(User.class);
	
	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	private String password;


	@Enumerated(EnumType.STRING)
	private ConfirmStatus confirmstatus;

	@NotEmpty
	private String firstname;

	@NotEmpty
	private String lastname;

	@NotNull
	private Boolean acceptedterms;
	
	private Boolean newsletter;
	
	
	private Image userphoto;

	private String securityanswer;

	private String securityquestion;

	@OneToOne(mappedBy = "user")
	private ConfirmationEmail confirm;

	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") })
	private List<UserRole> roles = new ArrayList<UserRole>();

	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	private Address billAddress;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	private Address shipAddress;
	
	
	public User() {
		setConfirmstatus(ConfirmStatus.NOCONFIRM);
	}
	
	
	
	public Boolean getAcceptedterms() {
		return acceptedterms;
	}


	public void setAcceptedterms(Boolean acceptedterms) {
		this.acceptedterms = acceptedterms;
	}




	public Boolean getNewsletter() {
		return newsletter;
	}




	public void setNewsletter(Boolean newsletter) {
		this.newsletter = newsletter;
	}




	public Address getBillAddress() {
		return billAddress;
	}




	public void setBillAddress(Address billAddress) {
		this.billAddress = billAddress;
	}




	public Address getShipAddress() {
		return shipAddress;
	}




	public void setShipAddress(Address shipAddress) {
		this.shipAddress = shipAddress;
	}




	public ConfirmationEmail getConfirm() {
		return confirm;
	}

	public void setConfirm(ConfirmationEmail confirm) {
		this.confirm = confirm;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEncryptedPassword(String password) {
		this.password = ""; // getMD5String(password);
	}

	public String toString() {
		return "Username: " + getFirstname() + " " + getLastname() + "\n"
				+ "email: " + getEmail() + "\n" + "password: " + getPassword();
	}

	public List<UserRole> getMyUserRole() {
		return roles;
	}

	public void setMyUserRole(List<UserRole> myUserRole) {
		this.roles = myUserRole;
	}

	public void update(String fname, String lname, String email,
			String password, List<UserRole> roles, 
			boolean acceptedTerms, boolean newsletterAbo ) {

		setEmail(email);
		setFirstname(fname);
		setLastname(lname);
		setEncryptedPassword(password);
		setRoles(roles);
		setNewsletter(newsletterAbo);		
		setAcceptedterms(acceptedTerms);	
	}

	public String getConfirmstatusText() {
		return confirmstatus.name().toLowerCase();
	}

	
	public ConfirmStatus getConfirmstatus() {
		return confirmstatus;
	}

	public void setConfirmstatus(ConfirmStatus confirmstatus) {
		this.confirmstatus = confirmstatus;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Image getUserphoto() {
		return userphoto;
	}

	public void setUserphoto(Image userphoto) {
		this.userphoto = userphoto;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	public String getSecurityanswer() {
		return securityanswer;
	}

	public void setSecurityanswer(String securityanswer) {
		this.securityanswer = securityanswer;
	}

	public String getSecurityquestion() {
		return securityquestion;
	}

	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}
	
	public boolean isAcceptedterms() {
		return acceptedterms;
	}


	public void setAcceptedterms(boolean acceptedterms) {
		this.acceptedterms = acceptedterms;
	}


	public boolean isNewsletter() {
		return newsletter;
	}


	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}



	public static Logger getLOGGER() {
		return LOGGER;
	}



	public static void setLOGGER(Logger lOGGER) {
		LOGGER = lOGGER;
	}
	
	


}