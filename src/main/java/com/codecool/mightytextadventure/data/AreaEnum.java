package com.codecool.mightytextadventure.data;

    public enum AreaEnum {
        ROOM0("description",
                "Scene",
                new String[]{"actionOne", "actionTwo"},
                new String[]{"Room 1"}  ),
        ROOM1("description",
                "Scene",
                new String[]{"actionOne", "actionTwo"},
                new String[]{"Room 0", "Room 2"}  ),
        ROOM2("description",
                "Scene",
                new String[]{"actionOne", "actionTwo"},
                new String[]{"Room 1", "Room 3"}  ),
        ROOM3("description",
                "Scene",
                new String[]{"actionOne", "actionTwo"},
                new String[]{"Room 2"}  );

        private String description;
        private String scene;
        private String[] actionsToTake;
        private String[] connectedRooms;


        AreaEnum (String description, String scene, String[]actionsToTake, String[]connectedRooms) {
            this.description = description;
            this.scene = scene;
            this.actionsToTake = actionsToTake;
            this.connectedRooms = connectedRooms;

        }

        public String getDescription() {
            return description;
        }
        public String getScene(){
            return scene;
        }
        public String[] getActionsToTake(){
            return actionsToTake;
        }
        public String[] getConnectedRooms(){
            return connectedRooms;
        }
    }



