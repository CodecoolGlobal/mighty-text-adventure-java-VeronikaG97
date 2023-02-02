package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.SubArea;
import com.codecool.mightytextadventure.service.LogicProvider;

import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;
import com.codecool.mightytextadventure.data.Player;


public class Game {
    private final Area[] areas;
    private final SubArea[] subAreas;
    private final Input input;
    private final Display display;
    private Player player;

    public Game(Area[] areas, SubArea[] subAreas, Input input, Display display, Player player) {
        this.areas = areas;
        this.subAreas = subAreas;
        this.input = input;
        this.display = display;
        this.player = player;
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
/*            try {*/
                isRunning = step(); // if (winCon || loseCon) { isRunning =false}
/*            } catch (Exception error) {
                display.printMessage("Please try again. Press h for help.");
            }*/

        }
    }

    private boolean step() {

        String playerLocation = player.getLocation();


        if(playerLocation.equals("Intro")){
            display.printMessage(areas[1].getScene());
            player.setLocation("Room 1");
            return true;
        }

        String userInput = input.getInputFromUser();
        String keyword = userInput.substring(0, userInput.indexOf(" "));
        String target = userInput.substring(userInput.indexOf((" ")));


        LogicProvider logic = new LogicProvider(playerLocation, areas, subAreas);

        if( keyword.equalsIgnoreCase("Examine") ){
            if( target.equalsIgnoreCase(" Room") ){
                for ( int i = 0; i < areas.length; i++ ) {
                    if ( areas[i].getName().equals(playerLocation) ) {
                        display.printMessage(areas[i].getScene());
                    }
                }
            }
            else if(target.equalsIgnoreCase(" "+"testSub1") && logic.isThingInRoom("testSub1")) {
                int subAreaIndex = logic.getSubAreaIndex("testSub1");
                display.printMessage(subAreas[subAreaIndex].getScene());
             /*   for (int i = 0; i < subAreas.length; i++){
                    if(subAreas[i].getName().equalsIgnoreCase("testSub1") && playerLocation.equalsIgnoreCase(subAreas[i].getLocation())){
                        display.printMessage(subAreas[i].getScene());
                    }
                }*/
            }
            else if(target.equalsIgnoreCase(" "+"testSub2") && logic.isThingInRoom("testSub2")) {
                int subAreaIndex = logic.getSubAreaIndex("testSub2");
                display.printMessage(subAreas[subAreaIndex].getScene());

/*                for (int i = 0; i < subAreas.length; i++){
                    if(subAreas[i].getName().equalsIgnoreCase("testSub2") && playerLocation.equalsIgnoreCase(subAreas[i].getLocation())){
                        display.printMessage(subAreas[i].getScene());
                    }
                }*/
            }
            else if(target.equalsIgnoreCase(" "+"testSub1") && logic.isThingInRoom("testSub1")) {
                int subAreaIndex = logic.getSubAreaIndex("testSub1");
                display.printMessage(subAreas[subAreaIndex].getScene());
            }
            else{
                display.printMessage("There's no such thing here.");
            }
        }
        else if(keyword.equalsIgnoreCase("Go to")){

        }






        for(int i = 0; i < areas.length; i++){
            String areaName = areas[i].getName();
            String areaScene = areas[i].getScene();

            if (userInput.equalsIgnoreCase("Go " + areaName ) && playerLocation.equals(areaName) ){
                display.printMessage("That's where you already are.");
                break;
            }
            else if (userInput.equalsIgnoreCase("Go " + areaName) && !(playerLocation.equals(areaName)) ){
                player.setLocation(areaName);
                display.printMessage(areaScene);
                return true;
            }

        }
        return true;
    }
}