package com.lad_corp.ingym.entity;

public class UtilInfo {

	private String weight;
	private String height;
	private String bodyFatPercentage;
	
	public UtilInfo() {}

	public UtilInfo(String weight, String height, String bodyFatPercentage) {
		this.weight = weight;
		this.height = height;
		this.bodyFatPercentage = bodyFatPercentage;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBodyFatPercentage() {
		return bodyFatPercentage;
	}

	public void setBodyFatPercertage(String bodyFatPercertage) {
		this.bodyFatPercentage = bodyFatPercertage;
	}
	
	
	
}
