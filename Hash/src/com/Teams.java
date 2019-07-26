package com;


public class Teams {

	int id;
	   String teams;
	   String city;

	   public Teams(int id, String teams, String city) {
	      this.id = id;
	      this.teams = teams;
	      this.city = city;
	   }
	   
	 

	   public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTeams() {
		return teams;
	}



	public void setTeams(String teams) {
		this.teams = teams;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Teams [id=" + id + ", teams=" + teams + ", city=" + city + "]";
	}

	
}
