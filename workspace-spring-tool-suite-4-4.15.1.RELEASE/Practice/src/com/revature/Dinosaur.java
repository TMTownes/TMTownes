package com.revature;

public class Dinosaur {
	
	/**
	 * Name field corresponds to the species of dinosaur: T-Rex or Pterodactyl
	 */
	String name;
	String habitat;
	/**
	 * Height is height in feet with a default value of 0.
	 */
	int height;
	
	Dinosaur(){
	}
	
	Dinosaur (String name, String habitat){
		this.name = name;
		this.habitat = habitat;
	}

	Dinosaur(String name, String habitat, int height){
		this.name = name;
		this.habitat= habitat;
		this.height= height;
	}
	
	public static void main(String[]args) {
		Dinosaur trex= new Dinosaur("T-Rex", "Land", 100);
		
		
	}
}
