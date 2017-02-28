package com.ewheezy.yayatow.newsletter.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.ewheezy.yayatow.newsletter.entity.base.AbstractEntity;

//https://github.com/reshet/NCLodger/blob/ff66c525a5cbdb8e56e1976d0435e2834cb58ac6/src/main/java/com/nclodger/control/action/access/SignUpAction.java

@Entity
@Table(name = "confirm")
public class ConfirmationEmail  extends AbstractEntity {// extends AbstractNamedEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String confirmhash;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date confirmdate;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName = "id") 
	private User user;

	
	public ConfirmationEmail() {	
	}

	public ConfirmationEmail(User user, String confirmHash) {
		this.setUser(user);
		
		this.confirmhash = confirmHash;
		this.setConfirmdate(new Date());
	}

	public ConfirmationEmail(User user, String confirmHash, Date confirmDate) {
		this.setUser(user);
		this.confirmhash = confirmHash;
		this.setConfirmdate(new Date(confirmDate.getTime()));
	}

	public String getConfirmHash() {
		return confirmhash;
	}

	public void setConfirmHash(String confirmHash) {
		this.confirmhash = confirmHash;
	}

	public Date getConfirmdate() {
		return confirmdate;
	}

	public void setConfirmdate(Date confirmdate) {
		this.confirmdate = confirmdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
