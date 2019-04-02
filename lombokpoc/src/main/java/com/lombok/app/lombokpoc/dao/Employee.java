package com.lombok.app.lombokpoc.dao;

public class Employee {

	private long id;
	private String eFirstName;
	private String eLastName;
	private String eCity;
	private String eState;
	private String eZip;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public String geteState() {
		return eState;
	}

	public void seteState(String eState) {
		this.eState = eState;
	}

	public String geteZip() {
		return eZip;
	}

	public void seteZip(String eZip) {
		this.eZip = eZip;
	}

	public String geteFirstName() {
		return eFirstName;
	}

	public void seteFirstName(String eFirstName) {
		this.eFirstName = eFirstName;
	}

	public String geteLastName() {
		return eLastName;
	}

	public void seteLastName(String eLastName) {
		this.eLastName = eLastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eFirstName=" + eFirstName + ", eLastName=" + eLastName + ", eCity=" + eCity
				+ ", eState=" + eState + ", eZip=" + eZip + "]";
	}

	public Employee(long id, String eFirstName, String eLastName, String eCity, String eState, String eZip) {
		super();
		this.id = id;
		this.eFirstName = eFirstName;
		this.eLastName = eLastName;
		this.eCity = eCity;
		this.eState = eState;
		this.eZip = eZip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eCity == null) ? 0 : eCity.hashCode());
		result = prime * result + ((eFirstName == null) ? 0 : eFirstName.hashCode());
		result = prime * result + ((eLastName == null) ? 0 : eLastName.hashCode());
		result = prime * result + ((eState == null) ? 0 : eState.hashCode());
		result = prime * result + ((eZip == null) ? 0 : eZip.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eCity == null) {
			if (other.eCity != null)
				return false;
		} else if (!eCity.equals(other.eCity))
			return false;
		if (eFirstName == null) {
			if (other.eFirstName != null)
				return false;
		} else if (!eFirstName.equals(other.eFirstName))
			return false;
		if (eLastName == null) {
			if (other.eLastName != null)
				return false;
		} else if (!eLastName.equals(other.eLastName))
			return false;
		if (eState == null) {
			if (other.eState != null)
				return false;
		} else if (!eState.equals(other.eState))
			return false;
		if (eZip == null) {
			if (other.eZip != null)
				return false;
		} else if (!eZip.equals(other.eZip))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
