package com.codecool.mightytextadventure.data;

import com.codecool.mightytextadventure.storyline.Room;

public class Area {

    private String name;
    private String scene;

    public Area(String name, String scene) {
        this.name = name;
        this.scene = scene;
    }

    public String getName() {
        return name;
    }

    public String getScene() {
        return scene;
    }
}



