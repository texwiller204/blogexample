package com.wheezy.blogmvc.model.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@MappedSuperclass
public abstract class AbstractEntity implements Serializable, IdentifiedEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Version
	@Column(name = "obj_version")
	private int version = 0;

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, updatable = false)
	private Date created = new Date();


	
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		final AbstractEntity other = (AbstractEntity) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		return result;
	}

	public void setId(Long id) {
		this.id = id;
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

