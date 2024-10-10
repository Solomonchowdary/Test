package com.nt.Bean;

public class Donar {
private int did;
private String dname;
private String bloodgroop;
private String phoneno;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getBloodgroop() {
	return bloodgroop;
}
public void setBloodgroop(String bloodgroop) {
	this.bloodgroop = bloodgroop;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Donar [did=" + did + ", dname=" + dname + ", bloodgroop=" + bloodgroop + ", phoneno=" + phoneno + "]";
}




}
