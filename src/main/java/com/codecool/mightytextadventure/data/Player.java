package com.codecool.mightytextadventure.data;

import java.lang.reflect.Array;

public class Player {
    String name;
    String location;
    String[] inventory;

    public Player(String name, String location, String[] inventory){
       this.name = name;
       this.location = location;
       this.inventory = new String[2];
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setInventory(String item) {
        for (int i = 0; i < inventory.length; i++){
            if (this.inventory[i] == null) {
                this.inventory[i] = item;
                break;
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public String[] getInventory() {
        return this.inventory;
    }
}
