package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.SubArea;
import com.codecool.mightytextadventure.service.LogicProvider;

import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;
import com.codecool.mightytextadventure.data.Player;

import java.util.Arrays;


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
            try {
                isRunning = step();
            } catch (Exception error) {
                display.printMessage("Invalid Input. Try typing GO ROOM 1  or GO ROOM 2 to switch rooms, or EXAMINE <something> !");
            }

        }
    }

    private boolean step() {
        String playerLocation = player.getLocation();

        if(playerLocation.equals("Intro")){
            display.printMessage(areas[0].getScene());
            player.setLocation("Room 1");
            return true;
        }

        String userInput = input.getInputFromUser();
        String keyword = userInput.substring(0, userInput.indexOf(" "));
        String target = userInput.substring(userInput.indexOf((" ")));


        LogicProvider logic = new LogicProvider(playerLocation, areas, subAreas);

        if( keyword.equalsIgnoreCase("Examine") ){
            if( target.equalsIgnoreCase(" Room") ){
                int areaIndex = logic.getAreaIndex();
                String roomScene = areas[areaIndex].getScene();
                String keyHint = "\nLooking carefully, there seems to be a GLINT in the corner of the Room...";
                boolean keyIsThere = logic.isThingInRoom("Key");
                if(keyIsThere){
                    display.printMessage(roomScene + keyHint);
                }
                else{
                    display.printMessage(roomScene);
                }
            }
            else if(target.equalsIgnoreCase(" "+"Bed") && logic.isThingInRoom("Bed")) {
                int subAreaIndex = logic.getSubAreaIndex("Bed");
                display.printMessage(subAreas[subAreaIndex].getScene());
                String bedInput = input.getInputFromUser();

                if(bedInput.equalsIgnoreCase("Sleep")){
                    display.printMessage("You lie down on the bed, set an alarm on your phone and fall asleep almost immediately." +
                            "\n..."+
                            "\nThe alarm fails to wake you in the morning - even though it is quite loud." +
                            "\nAnd there's only a Zombie to hear it anyway; " +
                            "\nthe very same zombie that crept into the room while you slept, and made it's rotten stomach your final resting place." +
                            "\nAnd also this floor. And these walls. A bit of you even got splattered on the ceiling.");
                    return false;
                }
                else{
                    display.printMessage("You turn away; now is not the time to sleep, no matter how crappy you feel.");
                    return true;
                }
            }
            else if(target.equalsIgnoreCase(" "+"Glint") && logic.isThingInRoom("Key")) {
                int subAreaIndex = logic.getSubAreaIndex("Key");
                player.setInventory("Key");
                subAreas[subAreaIndex].setLocation(" ");
                display.printMessage(subAreas[subAreaIndex].getScene());
            }
            else if(target.equalsIgnoreCase(" "+"Door") && logic.isThingInRoom("Door1")) {
                int subAreaIndex = logic.getSubAreaIndex("Door1");
                display.printMessage(subAreas[subAreaIndex].getScene());

                String doorInput = input.getInputFromUser();
                if(doorInput.equalsIgnoreCase("Open Door")){
                    if(player.hasKey() ){
                        display.printMessage(areas[3].getScene());
                        return false;
                    }
                    else{
                        display.printMessage("This door is locked - no matter how hard you try to open it, it won't budge.");
                        return true;
                    }
                }
                else{
                    return true;
                }

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