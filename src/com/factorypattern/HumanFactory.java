package com.factorypattern;

public class HumanFactory {
	public Humans getSpecies(String species) {
        if(species.equals(null)) return null;
        
        if(species.equalsIgnoreCase("stage1")) {
            return new Stage1();
        } else if(species.equalsIgnoreCase("stage2")) {
            return new Stage2();
        } else if(species.equalsIgnoreCase("stage3")) {
            return new Stage3();
        } else if(species.equalsIgnoreCase("stage4")) {
            return new Stage4();
        } else if(species.equalsIgnoreCase("stage5")) {
            return new Stage5();
        }
        return null;        
    }  
}
