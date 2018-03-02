/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program Enumerates the planets and their positions.
 * 
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Planet {
	
	public PlanetName name;
	public int location = 0;
	
	public Planet(PlanetName title) {
		this.name = title;
		//initialize location (In millions of kilometres)
		location = Planet.findLocation(name);
	}
	
	public enum PlanetName {
		MERCURY,
		VENUS,
		EARTH,
		MARS,
		JUPITER,
		SATURN,
		URANUS,
		NEPTUNE,
	}
	
	public static int findLocation(PlanetName nameOfPlanet) {
		//Use a switch to assign locations
		switch(nameOfPlanet) {
		case MERCURY: return 57;
		case VENUS: return 108;
		case EARTH: return 150;
		case MARS: return 228;
		case JUPITER: return 779;
		case SATURN: return 1430;
		case URANUS: return 2880;
		case NEPTUNE: return 4500;
		default: return 0;
		}
	}
	
	public static void main(String[] args) {
		//Test program by calling different planets
		
		String input = "";
		PlanetName planetInput = PlanetName.EARTH;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
	validInput:
		while(true) {
			System.out.println("Enter the name of a planet: ");
			try {
				//Get user input
				input = reader.readLine();
			} catch (IOException noInput) {
				noInput.printStackTrace();
			}
			//test if input is in enumerated list
			for(PlanetName planet: PlanetName.values()){
				if(input.toUpperCase().equals(planet.toString())) {
					break validInput;
				}
			}
		}
		switch(input.toUpperCase()) {
		case "MERCURY":
			planetInput = PlanetName.MERCURY;
			break;
		case "VENUS":
			planetInput = PlanetName.VENUS;
			break;
		case "EARTH":
			planetInput = PlanetName.EARTH;
			break;
		case "MARS":
			planetInput = PlanetName.MARS;
			break;
		case "JUPITER":
			planetInput = PlanetName.JUPITER;
			break;
		case "SATURN":
			planetInput = PlanetName.SATURN;
			break;
		case "URANUS":
			planetInput = PlanetName.URANUS;
			break;
		case "NEPTUNE":
			planetInput = PlanetName.NEPTUNE;
			break;
			default: break;
		}
		Planet chosenPlanet = new Planet(planetInput);
		System.out.println("The planet you chose was " + chosenPlanet.name);
		System.out.println(chosenPlanet.name + " is an average of " + 
				chosenPlanet.location+" million kilometers away from the sun");
	}
}