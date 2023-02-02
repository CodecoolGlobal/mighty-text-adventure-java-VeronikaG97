package com.codecool.mightytextadventure.data;

public class SubArea {

    private String name;
    private String scene;
    private String location;

    public SubArea(String name, String scene, String location) {
        this.name = name;
        this.scene = scene;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getScene() {
        return scene;
    }

    public String getLocation() { return location; }

}
