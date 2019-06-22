package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Uom_tab")
public class Uom {
@Id
@GeneratedValue
@Column(name="id")
	private Integer uomId;
@Column(name="type")
	private String uomType;
@Column(name="code")
	private String uomCode;
@Column(name="ufor")
private String uomFor;
@Column(name="email")
	private String uomEmail;
@Column(name="contact")
	private Integer uomContact;
@Column(name="IdType")
	private String uomIdType;
@Column(name="IdNumber")
	private Integer uomIdNumber;
public Uom() {
	super();
}public Uom(Integer uomId) {
	super();
	this.uomId = uomId;
}
public Integer getUomId() {
	return uomId;
}
public void setUomId(Integer uomId) {
	this.uomId = uomId;
}
public String getuomType() {
	return uomType;
}
public void setuomType(String uomType) {
	this.uomType = uomType;
}
public String getUomType() {
	return uomType;
}
public void setUomType(String uomType) {
	this.uomType = uomType;
}
public String getUomCode() {
	return uomCode;
}
public void setUomCode(String uomCode) {
	this.uomCode = uomCode;
}
public String getUomFor() {
	return uomFor;
}
public void setUomFor(String uomFor) {
	this.uomFor = uomFor;
}
public String getUomEmail() {
	return uomEmail;
}
public void setUomEmail(String uomEmail) {
	this.uomEmail = uomEmail;
}
public Integer getUomContact() {
	return uomContact;
}
public void setUomContact(Integer uomContact) {
	this.uomContact = uomContact;
}
public String getUomIdType() {
	return uomIdType;
}
public void setUomIdType(String uomIdType) {
	this.uomIdType = uomIdType;
}
public Integer getUomIdNumber() {
	return uomIdNumber;
}
public void setUomIdNumber(Integer uomIdNumber) {
	this.uomIdNumber = uomIdNumber;
}
public Uom(Integer uomId, String uomType, String uomCode, String uomFor, String uomEmail, Integer uomContact,
		String uomIdType, Integer uomIdNumber) {
	super();
	this.uomId = uomId;
	this.uomType = uomType;
	this.uomCode = uomCode;
	this.uomFor = uomFor;
	this.uomEmail = uomEmail;
	this.uomContact = uomContact;
	this.uomIdType = uomIdType;
	this.uomIdNumber = uomIdNumber;
}

}
