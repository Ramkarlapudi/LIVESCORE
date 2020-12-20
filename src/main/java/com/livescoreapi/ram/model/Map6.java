package com.livescoreapi.ram.model;

public class Map6 {
	public String name;
	public boolean isBatting;
	public int id;
	public String shortName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBatting() {
		return isBatting;
	}
	public void setBatting(boolean isBatting) {
		this.isBatting = isBatting;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	@Override
	public String toString() {
		return "Map6 [name=" + name + ", isBatting=" + isBatting + ", id=" + id + ", shortName=" + shortName + "]";
	}
	
	

}
