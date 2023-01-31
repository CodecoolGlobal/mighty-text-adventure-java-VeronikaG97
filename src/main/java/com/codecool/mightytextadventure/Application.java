package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.AreaEnum;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();

        Game game = new Game(areas, input, display);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas(){
        Area[] areas =   new Area[7];
        areas[0] = new Area(AreaEnum.ROOM0);
        areas[1] = new Area(AreaEnum.ROOM1);
        areas[2] = new Area(AreaEnum.ROOM2);
        areas[3] = new Area(AreaEnum.ROOM3);
//        areas[4] = new Area(AreaEnum.ROOM4);
//        areas[5] = new Area(AreaEnum.ROOM5);
//        areas[6] = new Area(AreaEnum.ROOM6);
        return areas;
    }
}
