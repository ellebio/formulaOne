package it.davincifascetti.quintainfa.bianchi.model;

import java.sql.Date;

public class Piloti {

	private int id, podiums, worldChampionships, carNumber, team;
	private String name, surname, country, image;
	private Date dateOfBirth;

	public Piloti(int id, String name, String surname, Date dateOfBirth, String country, String image, int podiums,
			int worldChampionships, int carNumber, int team) {
		super();
		this.id = id;
		this.podiums = podiums;
		this.worldChampionships = worldChampionships;
		this.carNumber = carNumber;
		this.team = team;
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.image = image;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPodiums() {
		return podiums;
	}

	public void setPodiums(int podiums) {
		this.podiums = podiums;
	}

	public int getWorldChampionships() {
		return worldChampionships;
	}

	public void setWorldChampionships(int worldChampionships) {
		this.worldChampionships = worldChampionships;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
