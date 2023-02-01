package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;


public class Game {
    private final Area[] areas;
    private final Input input;
    private final Display display;

    public Game(Area[] areas, Input input, Display display) {
        this.areas = areas;
        this.input = input;
        this.display = display;
    }




    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            isRunning = step(); // if (winCon || loseCon) { isRunning =false}
        }
    }

    private boolean step() {

        String userInput = input.getInputFromUser();


        for(int i = 0; i< areas.length; i++){
            if (userInput.equals("Go " + areas[i].getName())){


                display.printMessage(areas[i].getScene());
                break;
            }
        }



        return true;
    }
}
