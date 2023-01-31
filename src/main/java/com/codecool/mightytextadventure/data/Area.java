package com.codecool.mightytextadventure.data;

import java.util.Arrays;

public class Area {
    private String description;
    private String scene;
    public String[] actionsToTake;
    public String[] connectedRooms;


    public Area(AreaEnum details) {
        this.description = details.getDescription();
        this.scene = details.getScene();
        this.actionsToTake = details.getActionsToTake();
        this.connectedRooms = details.getConnectedRooms();
        System.out.println(this.description);
        System.out.println(this.scene);
        System.out.println(Arrays.toString(this.actionsToTake));
        System.out.println(Arrays.toString(this.connectedRooms));
    }
}
