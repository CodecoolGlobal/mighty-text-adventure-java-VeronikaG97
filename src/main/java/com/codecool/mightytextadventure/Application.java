package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.data.SubArea;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.storyline.Room;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();


        // TEST Player
        String[] inventory = new String[2];
        inventory[0] = "";
        inventory[1] = "";

        Player player = new Player("Test_Name", "Intro", inventory);

        player.setInventory("ID-Card");
        player.setInventory("Key");

        System.out.println(Arrays.toString(player.getInventory()));
        //END OF TEST Player

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();
        SubArea[] subAreas = loadSubAreas();

        Game game = new Game(areas, subAreas, input, display, player);

        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
        }

    private static Area[] loadAreas(){
        Area[] areas =   new Area[7];

        Room description0 = Room.ROOM0;
        Room description1 = Room.ROOM1;
        Room description2 = Room.ROOM2;
        Room description3 = Room.ROOM3;


        areas[0] = new Area("Intro", description0.getDescription(), new String[]{null});
        areas[1] = new Area("Room 1", description1.getDescription(), new String[]{"testSub1", "testSub2"});
        areas[2] = new Area("Room 2", description2.getDescription(), new String[]{null});
        areas[3] = new Area("Room 3", description3.getDescription(), new String[]{null});

        /*
        areas[4] = new Area("Room 4", "Welcome to Room 4.", new String[]{null});
        areas[5] = new Area("Room 5", "Welcome to Room 5.", new String[]{null});
        areas[6] = new Area("Room 6", "Welcome to Room 6.", new String[]{null});
        */
        return areas;
    }
    private static SubArea[] loadSubAreas(){

        // ArrayList[] roomContents = new ArrayList[7];


        SubArea[] room1 = new SubArea[2];
        room1[0] = new SubArea(
                "testSub1",
                "It's a delicious looking Footlong Sandwich from Subway!!!" +
                "\nIt's exquisite scent would be mouthwatering, " +
                "\nwere it not for stench coming from somewhere around here...", "Room 1");

        room1[1] = new SubArea(
                "testSub2",
                "It seems to have been a meatball sub once. " +
                "\nNow it's teeming with life best left undescribed, " +
                "\nspreading a vomit inducing stench.", "Room 2");

        //roomContents[0] = room1;
        return room1;
    }
}
