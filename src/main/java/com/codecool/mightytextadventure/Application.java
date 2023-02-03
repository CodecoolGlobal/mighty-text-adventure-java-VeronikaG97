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
        Player player = new Player("Test_Name", "Intro", "Center", new String[]{" ", " "});

        display.printMessage("Starting Zombie Adventure: The Room-ening 2 - Unholy Hangover! Director's Cut Remastered");

        Area[] areas = loadAreas();
        SubArea[] subAreas = loadSubAreas();

        Game game = new Game(areas, subAreas, input, display, player);

        game.run();

        display.printMessage("Thank you for playing Zombie Adventure: The Room-ening 2 - Unholy Hangover! Director's Cut Remastered " +
                "\nWe hope you had fun!");
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
        SubArea[] items = new SubArea[3];

        Item sceneDoor = Item.DOOR;
        Item sceneBed = Item.BED;
        Item sceneKey = Item.KEY;


        items[0] = new SubArea(
                "Bed",
                sceneBed.getDescription(),
                "Room 1");
        items[1] = new SubArea(
                "Key",
                sceneKey.getDescription(),
                "Room 2");
        items[2] = new SubArea(
                "Door1",
                sceneDoor.getDescription(),
                "Room 2");
        return items;
    }
}
