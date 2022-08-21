package it.davincifascetti.quintainfa.bianchi.model;

public class Teams {

	private int id, worldChampionships;
	private String name, base, teamPrincipal, chassis, powerUnit, image;

	public Teams(int id, String name, String base, String teamPrincipal, String chassis, String powerUnit,
			int worldChampionships, String image) {

		this.id = id;
		this.name = name;
		this.base = base;
		this.teamPrincipal = teamPrincipal;
		this.chassis = chassis;
		this.powerUnit = powerUnit;
		this.worldChampionships = worldChampionships;
		this.image = image;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWorldChampionships() {
		return worldChampionships;
	}

	public void setWorldChampionships(int worldChampionships) {
		this.worldChampionships = worldChampionships;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getTeamPrincipal() {
		return teamPrincipal;
	}

	public void setTeamPrincipal(String teamPrincipal) {
		this.teamPrincipal = teamPrincipal;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getPowerUnit() {
		return powerUnit;
	}

	public void setPowerUnit(String powerUnit) {
		this.powerUnit = powerUnit;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
