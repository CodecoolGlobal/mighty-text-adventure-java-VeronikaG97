package com.codecool.mightytextadventure.service;
import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.SubArea;

public class LogicProvider {

    private String playerLocation;
    private Area[] areas;
    private SubArea[] subAreas;

    public LogicProvider(String playerLocation, Area[] areas, SubArea[] subAreas) {
        this.playerLocation = playerLocation;
        this.areas = areas;
        this.subAreas = subAreas;
    }


    public int getAreaIndex () {
        int areaResult = 0;
        for(int i = 0; i < areas.length; i++){
            if(areas[i].getName().equals(playerLocation)){
                areaResult = i;
            }
        }
        return areaResult;
    }

    public int getSubAreaIndex(String thing){
        int subAreaResult = 0;
        for(int i = 0; i < subAreas.length; i++){
            if(thing.equalsIgnoreCase(subAreas[i].getName())){
                subAreaResult = i;
            }
        };
        return subAreaResult;
    }

    public boolean isThingInRoom(String thing){
        boolean itIs = false;
        for(int i = 0; i < subAreas.length; i++){
            if(playerLocation.equalsIgnoreCase(subAreas[i].getLocation()) && thing.equalsIgnoreCase(subAreas[i].getName())){
                itIs = true;
            }
        }
        return itIs;
    }
}

