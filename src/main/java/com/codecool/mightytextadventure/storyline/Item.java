package com.codecool.mightytextadventure.storyline;

public enum Item {
    DOOR("There is another door here - made out of metal, closed, and much more damaged than the walls. It's heavily dented, but all the dents are outwards." +
            "\n...almost as if someone very strong wanted to get out of here. Or maybe something? Type OPEN DOOR to try and open it."),
    BED("The bed looks comfortable. The sheets are clean and crisp, and would feel amazing against your tired and exhausted body." +
            "\nIf you were to lie down now, there`s no way anything would ever be able wake you up before your alarm clock rings." +
            "\nType SLEEP to take a nap and recharge your energy? You`d definitely feel much better afterwards."),
    ROOM2("The walls here have more scratch marks then in the room before but the color is the same - a cold metallic.\n" +
            "There is a door, but it is closed and something golden is in the corner. A key?"),
    KEY("You have found a key. Who would just throw something as useful as this in some corner on the floor like that? " +
            "\nYou see no reason to let this disgraceful state of affairs continue, so you grab the key and put it in your pocket.");

    private String description;

    Item (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


