package com.skilledmonster.sakila.model;

// Generated Mar 17, 2013 7:41:54 AM by Hibernate Tools 3.4.0.CR1

/**
 * ActorInfoId generated by hbm2java
 */
public class ActorInfoId implements java.io.Serializable {

	private short actorId;
	private String firstName;
	private String lastName;
	private String filmInfo;

	public ActorInfoId() {
	}

	public ActorInfoId(short actorId, String firstName, String lastName) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ActorInfoId(short actorId, String firstName, String lastName,
			String filmInfo) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.filmInfo = filmInfo;
	}

	public short getActorId() {
		return this.actorId;
	}

	public void setActorId(short actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFilmInfo() {
		return this.filmInfo;
	}

	public void setFilmInfo(String filmInfo) {
		this.filmInfo = filmInfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActorInfoId))
			return false;
		ActorInfoId castOther = (ActorInfoId) other;

		return (this.getActorId() == castOther.getActorId())
				&& ((this.getFirstName() == castOther.getFirstName()) || (this
						.getFirstName() != null
						&& castOther.getFirstName() != null && this
						.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getLastName() == castOther.getLastName()) || (this
						.getLastName() != null
						&& castOther.getLastName() != null && this
						.getLastName().equals(castOther.getLastName())))
				&& ((this.getFilmInfo() == castOther.getFilmInfo()) || (this
						.getFilmInfo() != null
						&& castOther.getFilmInfo() != null && this
						.getFilmInfo().equals(castOther.getFilmInfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getActorId();
		result = 37 * result
				+ (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result
				+ (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result
				+ (getFilmInfo() == null ? 0 : this.getFilmInfo().hashCode());
		return result;
	}

}
