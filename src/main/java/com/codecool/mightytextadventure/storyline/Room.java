package com.codecool.mightytextadventure.storyline;
public enum Room {
    ROOM0("INTRO"),
    ROOM1("You are really, really tired, but your head hurts. It hurts as if someone hit you with an old rusty baseball bat. The loud noise around you doesn't help. " +
            "\n There is a moment, while you force yourself to open your eyes, where you wonder about your metaphors. There is a red light. " +
            "\n It flickers on and off, on and off - why is it red. Your head hurts, your eyes hurt - everything is so weird. While you are rubbing your eyes - in hope to wake up more - and sitting up, you wonder what your name is. You cannot remember it. Why aren’t you able to remember it?\n" +
            "\n" +
            "Finally, you realize that the noise is a siren. It is loud but bearable. What does it mean?\n" +
            "You feel awkward. Something isn’t right. The walls are metallic, there are a lot of scratches on it and you just know that you want to get out of this room. Still, you are also really tired and wonder if you should rest a bit first.\n" +
            "\n" +
            "In front of you lies a sheet of dirty paper and a little plastic card. On your left there is a tiny old bed and to your right there is a door. \n" +
            "\n" +
            "What do you want to do?\n"),
    ROOM2("As you enter the next room you have to put your hands on your ears. It is loud! The siren seems to come from this room and you need a while to get used to it. The lights in this room are also shining red and flicker. What is wrong here?\n" +
            "You look around and nearly scream. There on your right side are some astronaut suits, “staring” at you. You take a deep breath and frown. Why is it hard to get some air? No, no, no, this is silly. You probably have trouble breathing because you are scared. You shouldn’t be scared! Get yourself together!\n" +
            "The siren is surely a false alarm and someone will fix it soon. The suits on your right are just standing there, they are not moving! You cough and look around again.\n" +
            "\n" +
            "Beside the suits there is the door back to the earlier room, a door across from you and a door on your left side. The walls here have more scratch marks then in the room before but the color is the same - a trist metallic.\n"),
    ROOM3("It is cold. Not to shiver is not an option. Every step you make makes a squeaky noise. Again, you feel watched and no matter how much you try to be silent you just know it will never work. Something fluid meets your ankle and you look down. Are you walking through paint or blood? You are white as chalk. Are you okay? You don’t look so good. The sound of the siren and the flickering of the red light chased you to this room. They don’t help you in the slightest with your headache and you are still struggling with your breath.\n" +
            "\n" +
            "As one cue you turn around the corner and it is a wonder with this scene in front of you that you don’t throw up.\n" +
            "You can not breathe. You struggle not to faint or be sick. \n" +
            "\n" +
            "There, directly in front of you lies a dead body. It is unrecognizable. You have to force yourself to look away and further through the room.\n" +
            "On the right wall is a door. The big exit sign about it brings you hope. On the left wall is something written on the wall.\n");

    private String description;

     Room (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
