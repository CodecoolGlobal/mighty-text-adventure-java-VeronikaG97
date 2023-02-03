package com.codecool.mightytextadventure.storyline;
public enum Room {

    ROOM0("You wake up, and your head hurts. \n" +
            "It hurts as if someone hit you with an old rusty baseball bat wrapped in lemon peels, and the loud noise around you doesn't help matters much. \n" +
            "For a moment, while forcing yourself to get up, you wonder about the weirdness your comparisons." +
            "The first thing you notice is a red light.\n" +
            "It flickers on and off, on and off - in concert with the noise, painting everything you see in a sickly, eerie glow. Your head hurts, your eyes hurt...everything hurts.\n" +
            "Rubbing something worse than sleep out of your eyes, you sit up and ... wonder what your name is. You can not remember it. \n" +
            "You can't remember anything, in fact. What happened to you?\n" +
            "Fighting the rising panic, you finally realize that the noise is a siren. It is loud, but bearable. What is going on here?\n" +
            "Something isn’t right here."),
    ROOM1("The walls seem to be made of a metallic material, but worn down and ... scratched?.\n" +
            "The siren has stopped by now, and the light has dimmed to a sickly red glow, leaving you enveloped by silence. You're not sure if this is an improvement - but, it allows you to think.\n" +
            "Still, your battered state makes thinking a chore. Some actual rest might help.\n" +
            "Looking around, you actually notice a BED on the left side of the room that would facilitate this.\n" +
            "However, there is also door to your right. It is slightly ajar; beckoning, yet full of potential danger.\n"
            ),
    ROOM2("It's sou loud ou have to put your hands on your ears.\n" +
            "The siren started up again, with this room being the source of the (by now quite unpleasant) noise.\n" +
            "The lights in this room are also shining red and flicker. What is wrong here?\n" +
            "You look around and nearly scream. There on your right side are some astronaut suits, “staring” at you. And not only that, you could swear one of them actually moved their finger a bit!\n" +
            "You take a deep breath. Spacesuits moving on their own is impossible, so there is just no way this one could have.\n" +
            "\"No, no, no, this is silly. You're probably just paranoid to cope with this situation somehow. You shouldn’t be scared! Get yourself together!\n" +
            "The siren is surely a false alarm and someone will fix it soon.\" Or so you keep telling yourself, to keep from freaking out.\n"),
    ROOM3("Hell YEAH, you're OUT! For a second you thought you might die in there..." +
            "\nBut it seems like the other side of the door is no picnic either: As you exit, a frigid wind carrying snowflakes immediately chills you to the bones." +
            "\nIt is not just cold, it's freezing. Not to shiver is not an option." +
            "\nLooking around, you seem to stand in front of a cabin in the middle of the woods; the cabin is built on a hill, allowing you to see the forest stretch for miles, with no end in sight." +
            "\nYou rummage once more through the cabin - from outside you can see small it actually is - and take everything that might help your survival." +
            "\nYou leave dressed in one of the spacesuits (the other was too heavy too lift off it's hook, for some reason)." +
            "\nEvery breath you take makes a little cloud; Every move you make will bring you closer to solving the mystery of your background; and every step you take makes a squeaky noise in the pristine snow" +
            "\nas you leave through the forest for adventures of legendary proportions," +
            "\navailable through the season pass for the microscopic price of only 999,99€ / month ! PreOrder NOW!");
    private String description;

     Room (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
