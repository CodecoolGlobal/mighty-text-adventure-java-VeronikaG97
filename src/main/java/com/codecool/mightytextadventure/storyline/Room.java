package com.codecool.mightytextadventure.storyline;
public enum Room {
    ROOM0("INTRO"),
    ROOM1("You are really, really tired, but your head hurts. It hurts as if someone hit you with an old rusty baseball bat. The loud noise around you doesn't help. \n" +
            "There is a moment, while you force yourself to open your eyes, where you wonder about your metaphors." +
            "There is a red light.\n" +
            "It flickers on and off, on and off - why is it red. Your head hurts, your eyes hurt - everything is so weird.\n" +
            "While you are rubbing your eyes - in hope to wake up more - and sitting up, you wonder what your name is. You cannot remember it. \n" +
            "Why aren’t you able to remember it?\n" +
            "Finally, you realize that the noise is a siren. It is loud but bearable. What does it mean?\n" +
            "You feel awkward. Something isn’t right.\n" +
            "What do you want to do?\n"),
    ROOM2("As you enter the next room you have to put your hands on your ears. It is loud! The siren seems to come from this room and you need a while to get used to it.\n" +
            "The lights in this room are also shining red and flicker. What is wrong here?\n" +
            "You look around and nearly scream. There on your right side are some astronaut suits, “staring” at you. You take a deep breath and frown. Why is it hard to get some air?\n" +
            "No, no, no, this is silly. You probably have trouble breathing because you are scared. You shouldn’t be scared! Get yourself together!\n" +
            "The siren is surely a false alarm and someone will fix it soon. The suits on your right are just standing there, they are not moving! You cough.\n"),
    ROOM3("It is cold. Not to shiver is not an option. Every step you make makes a squeaky noise. Again, you feel watched and no matter how much you try to be silent you just know it will never work.\n" +
            "Something fluid meets your ankle and you look down.\n" +
            "End of demo.\n" +
            "Thank you for playing!");
    private String description;

     Room (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
