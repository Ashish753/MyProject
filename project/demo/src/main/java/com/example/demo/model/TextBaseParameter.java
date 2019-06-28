package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
@Entity
@Table(name = "text_base_parameter")
public class TextBaseParameter {

	@Id
	@Column(name = "MATERIAL_ID")
	//@JsonProperty
	private Integer materialId;
	//@JsonProperty
	
	@Column(name = "MATERIAL_DESIGNATION")
	private String materialDesignation;
	//@JsonProperty
	@Column(name = "MATERIAL_NAME")
	private String materialName;
	//@JsonProperty
	@Column(name = "REGION")
	private String region;
	//@JsonProperty
	@Column(name = "MANUFACTURE_NAME")
	private String manufactureName;
	//@JsonProperty
	@Column(name = "CLASS_NAME")
	private String className;
	//@JsonProperty
	@Column(name = "SUB_CLASS_NAME")
	private String subClassName;

	public TextBaseParameter() {
	}

	public TextBaseParameter(Integer materialId) {
		this.materialId = materialId;
	}

	public Integer getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	public String getMaterialDesignation() {
		return materialDesignation;
	}

	public void setMaterialDesignation(String materialDesignation) {
		this.materialDesignation = materialDesignation;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSubClassName() {
		return subClassName;
	}

	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}

	/*
	 * public boolean equalBy(String property, String value) { int propertyId =
	 * Integer.valueOf(property); if (propertyId == 1) {
	 * 
	 * return this.materialDesignation.equalsIgnoreCase(value);
	 * 
	 * } else if (propertyId == 2) {
	 * 
	 * return this.materialName.equalsIgnoreCase(value);
	 * 
	 * } else if (propertyId == 3) {
	 * 
	 * return this.region.contains(value);
	 * 
	 * } else if (propertyId == 4) {
	 * 
	 * return this.manufactureName.equalsIgnoreCase(value);
	 * 
	 * } else if (propertyId == 5) {
	 * 
	 * return this.className.equalsIgnoreCase(value);
	 * 
	 * } else if (propertyId == 6) {
	 * 
	 * return this.subClassName.equalsIgnoreCase(value);
	 * 
	 * } return false; }
	 */
}
