package com.project.springboot_theater_management_system.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//validation dependence if spring star validation2.7.7
	private int ownerId;
	private String ownerName;
	private long ownerPhone;
	private double ownerNetworth;

	@OneToOne(cascade = CascadeType.ALL)
	private Theater theater;
	
	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public long getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(long ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public double getOwnerNetworth() {
		return ownerNetworth;
	}

	public void setOwnerNetworth(double ownerNetworth) {
		this.ownerNetworth = ownerNetworth;
	}
	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

}
