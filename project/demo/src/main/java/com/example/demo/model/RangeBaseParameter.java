package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "range_base_parameter")
//@JsonPropertyOrder
public class RangeBaseParameter {

	@Id
	@Column(name = "PROPERTY_ID")
	//@JsonProperty
	private Integer propertyId;
	@Column(name = "PROPERTY_NAME")
	//@JsonProperty
	private String propertyName;
	//@JsonProperty
	@Column(name = "VALUE")
	private Double value;
	//@JsonProperty
	@Column(name = "MAX_VALUE")
	private Double maxValue;
	@Column(name = "UOM")
	//@JsonProperty
	private String uom;
	@Column(name = "DESCRIPTION")
	//@JsonProperty
	private String description;
	@Column(name = "ABBERVATION")
	//@JsonProperty
	private String abbervation;

	public RangeBaseParameter() {
	}

	public Double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}

	public RangeBaseParameter(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}


	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAbbervation() {
		return abbervation;
	}

	public void setAbbervation(String abbervation) {
		this.abbervation = abbervation;
	}

	/*
	 * public boolean equalBy(String property, String uom) {
	 * 
	 * return (property.equals(this.propertyName) && uom.equals(this.uom));
	 * 
	 * }
	 * 
	 * public boolean between(double minValue, Double maxValue) {
	 * 
	 * return (minValue >= this.minValue && maxValue <= this.maxValue);
	 * 
	 * }
	 */
}
