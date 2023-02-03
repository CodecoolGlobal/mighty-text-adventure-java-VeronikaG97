package com.codecool.mightytextadventure.data;

public class Player {
    String name;
    String location;
    String subLocation;
    String[] inventory;

    public Player(String name, String location, String subLocation, String[] inventory){
       this.name = name;
       this.location = location;
       this.subLocation = subLocation;
       this.inventory = inventory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    public void setInventory(String item) {
        for (int i = 0; i < inventory.length; i++){
            if (this.inventory[i].equals(" ")) {
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
    public boolean hasKey() {
        boolean playerHasKey= false;
        for(int i= 0; i< inventory.length; i++){
            if (inventory[i].equalsIgnoreCase("Key")) {
                playerHasKey = true;
            }
        }
        return playerHasKey;
    }
}
