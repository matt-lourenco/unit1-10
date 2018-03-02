/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program Enumerates the planets and their positions.
 * 
 ****************************************************************************/

public enum Planet {
	
	MERCURY (57),
	VENUS (108),
	EARTH (150),
	MARS (228),
	JUPITER (779),
	SATURN (1430),
	URANUS (2880),
	NEPTUNE (4500);
	
	private final double location; //In millions of kilometers
	
	private Planet(int location) {
		//default constructor
		this.location = location;
	}
	
	public static void main(String[] args) {
		//Test program by calling different planets
		
		for(Planet planet: Planet.values()) {
			System.out.println(planet+" is an average of "+planet.location+
					" million kilometers away from the sun.");
		}
		
	}
}