package com.codecool.mightytextadventure.storyline;

public enum Item {
    ROOM1("The walls are metallic, there are a lot of scratches on it and you just know that you want to get out of this room.\n" +
            "Still, you are also really tired and wonder if you should rest a bit first.\n" +
            "On your left there is a tiny old bed and to your right there is a door It is slightly open. \n"),
    BED("The bed looks comfortable. The sheets are pure. You feel really tired. Like you could sleep through all that the world want to throw at you.\n" +
            "Should you take a nap and recharge your energy? You are sure, you would feel much better.\n"),
    ROOM2("The walls here have more scratch marks then in the room before but the color is the same - a cold metallic.\n" +
            "There is a door, but it is closed and something golden is in the corner. A key?"),
    KEY("That golden glimmer is a key. Why would someone let a key laying around? Should you take it with you?\n");

    private String description;

    Item (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


