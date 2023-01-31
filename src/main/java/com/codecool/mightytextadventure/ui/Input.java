package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    public String getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

}