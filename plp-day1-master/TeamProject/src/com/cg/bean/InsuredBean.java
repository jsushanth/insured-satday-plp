package com.cg.bean;

public class InsuredBean {
private String insuredName;
private String insuredStreet;
private String insuredCity;
private String insuredState;
private String insuredZip;
private String businessSegment;
public String getInsuredName() {
	return insuredName;
}
public void setInsuredName(String insuredName) {
	this.insuredName = insuredName;
}
public String getInsuredStreet() {
	return insuredStreet;
}
public void setInsuredStreet(String insuredStreet) {
	this.insuredStreet = insuredStreet;
}
public String getInsuredCity() {
	return insuredCity;
}
public void setInsuredCity(String insuredCity) {
	this.insuredCity = insuredCity;
}
public String getInsuredState() {
	return insuredState;
}
public void setInsuredState(String insuredState) {
	this.insuredState = insuredState;
}
public String getInsuredZip() {
	return insuredZip;
}
public void setInsuredZip(String insuredZip) {
	this.insuredZip = insuredZip;
}
public String getBusinessSegment() {
	return businessSegment;
}
public void setBusinessSegment(String businessSegment) {
	this.businessSegment = businessSegment;
}
@Override
public String toString() {
	return "InsuredBean [insuredName=" + insuredName + ", insuredStreet=" + insuredStreet + ", insuredCity="
			+ insuredCity + ", insuredState=" + insuredState + ", insuredZip=" + insuredZip + ", businessSegment="
			+ businessSegment + "]";
}


}
