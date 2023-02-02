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
        int result=0;
        for(int i = 0; i < areas.length; i++){
            if(areas[i].getName().equals(playerLocation)){
                result = i;
            }
        }
        return result;
    }

    public boolean isThingInRoom(String thing){
        boolean result = false;
        for(int i = 0; i < subAreas.length; i++){
            if(playerLocation.equalsIgnoreCase(subAreas[i].getLocation()) && thing.equalsIgnoreCase(subAreas[i].getName())){
                result = true;
            }
        }
        return result;
    }
}

