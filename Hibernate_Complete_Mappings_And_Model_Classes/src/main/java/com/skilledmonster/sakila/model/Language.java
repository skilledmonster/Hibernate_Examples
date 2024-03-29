package com.skilledmonster.sakila.model;

// Generated Mar 17, 2013 7:41:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Language generated by hbm2java
 */
public class Language implements java.io.Serializable {

	private Byte languageId;
	private String name;
	private Date lastUpdate;
	private Set filmsForOriginalLanguageId = new HashSet(0);
	private Set filmsForLanguageId = new HashSet(0);

	public Language() {
	}

	public Language(String name, Date lastUpdate) {
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	public Language(String name, Date lastUpdate,
			Set filmsForOriginalLanguageId, Set filmsForLanguageId) {
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
		this.filmsForLanguageId = filmsForLanguageId;
	}

	public Byte getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Byte languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getFilmsForOriginalLanguageId() {
		return this.filmsForOriginalLanguageId;
	}

	public void setFilmsForOriginalLanguageId(Set filmsForOriginalLanguageId) {
		this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
	}

	public Set getFilmsForLanguageId() {
		return this.filmsForLanguageId;
	}

	public void setFilmsForLanguageId(Set filmsForLanguageId) {
		this.filmsForLanguageId = filmsForLanguageId;
	}

}
