package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Wallet")
public class Wallet {
	@Id
	@Column(name="cus_id")
	private int cus_id;
	private int wal_id;
	private double wal_amount;
	private String wal_src;
	
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	
	@Id
	public int getWal_id() {
		return wal_id;
	}
	public void setWal_id(int wal_id) {
		this.wal_id = wal_id;
	}
	public double getWal_amount() {
		return wal_amount;
	}
	public void setWal_amount(double wal_amount) {
		this.wal_amount = wal_amount;
	}
	public String getWal_src() {
		return wal_src;
	}
	public void setWal_src(String wal_src) {
		this.wal_src = wal_src;
	}
	

}
