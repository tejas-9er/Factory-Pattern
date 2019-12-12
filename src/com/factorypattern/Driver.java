package com.factorypattern;

public class Driver {
	 public static void main(String[] args) {
	        HumanFactory humanFactory = new HumanFactory();
	      
	        Humans human1 = humanFactory.getSpecies("Stage1");
	        human1.species();
	      
	        Humans human2 = humanFactory.getSpecies("Stage2");
	        human2.species();
	      
	        Humans human3 = humanFactory.getSpecies("Stage3");
	        human3.species();
	        
	        Humans human4 = humanFactory.getSpecies("Stage4");
	        human4.species();
	        
	        Humans human5 = humanFactory.getSpecies("Stage5");
	        human5.species();
	    }
}
