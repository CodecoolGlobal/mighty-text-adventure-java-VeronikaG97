package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.data.SubArea;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.storyline.Item;
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

        Player player = new Player("Test_Name", "Intro", "Center", inventory);

        player.setInventory("ID-Card");
        player.setInventory("Key");

        //System.out.println(Arrays.toString(player.getInventory()));
        //END OF TEST Player

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();
        SubArea[] subAreas = loadSubAreas();

        Game game = new Game(areas, subAreas, input, display, player);

        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
        }

    private static Area[] loadAreas(){
        Area[] areas =   new Area[4];

        Room description0 = Room.ROOM0;
        Room description1 = Room.ROOM1;
        Room description2 = Room.ROOM2;
        Room description3 = Room.ROOM3;



        areas[0] = new Area("Intro", description0.getDescription());
        areas[1] = new Area("Room 1", description1.getDescription());
        areas[2] = new Area("Room 2", description2.getDescription());
        areas[3] = new Area("Room 3", description3.getDescription());

        return areas;
    }
    private static SubArea[] loadSubAreas(){
        SubArea[] room1 = new SubArea[2];

        Item sceneRoom1 = Item.ROOM1;
        Item sceneBed = Item.BED;
        Item sceneRoom2 = Item.ROOM2;
        Item sceneKey = Item.KEY;


        room1[0] = new SubArea(
                "Room 1",
                sceneRoom1.getDescription(),
                "Room 1");

        room1[1] = new SubArea(
                "Room 2"
                sceneRoom2.getDescription(),
                sceneKey.getDescription(),
                "Room 2");
        return room1;
    }
}
