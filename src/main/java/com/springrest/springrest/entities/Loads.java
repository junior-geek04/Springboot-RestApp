package com.springrest.springrest.entities;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Table;
@Entity
@Table(name="loadsdata")
public class Loads {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loadId")
	private int id;
	


	@Column(name="loadingPoint")
	private String loadingPoint;
	
	@Column(name="unloadingPoint")
	private String unloadingPoint;
	
	@Column(name="productType")
	private String productType;
	
	@Column(name="truckType")
	private String truckType;
	
	@Column(name="noOfTrucks")
	private int noOfTrucks;
	
	@Column(name="weight")
	private int weight;
	
	@Column(name="comment")
	 private String comment;
	
	@Column(name="shipperId")
	private String shipperId;
	
	@Column(name="date")
    private Date date;
	
	


	public Loads(int id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, int weight, String comment, String shipperId, Date date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Loads [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}

}
