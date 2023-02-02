package com.codecool.mightytextadventure.data;


public class Area {

    private String name;
    private String scene;

    private String[] items;

    public Area(String name, String scene, String[] items) {
        this.name = name;
        this.scene = scene;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getScene() {
        return scene;
    }
}



