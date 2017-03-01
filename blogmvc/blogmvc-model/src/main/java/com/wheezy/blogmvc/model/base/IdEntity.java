package com.wheezy.blogmvc.model.base;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

@MappedSuperclass
public abstract class IdEntity implements Persistable<String> {
	private static final long serialVersionUID = 4135637827653249198L;
	@Id
	@Column(unique = true, length = 36, name = "id")
	@GeneratedValue(generator = "UIDGenerator")
	@GenericGenerator(name = "UIDGenerator", strategy = "uuid2")
	protected String id;

	@Version
	private Timestamp timestamp;

	@Version
	@Column(name = "obj_version")
	private int version = 0;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, updatable = false)
	private Date created = new Date();

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isNew() {
		return this.id == null || this.id.equals("");
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}