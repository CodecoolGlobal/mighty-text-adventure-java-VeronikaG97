package com.codecool.mightytextadventure.data;

////////////////////////////////////////////////////////////////////////////////////
//Not currently in use, left in case the structure is needed down the road
///////////////////////////////////////////////////////////////////////////////7
    public enum AreaEnum {
        ROOM0("Room 0",
                "You wake up, there is a Shelf",
                new String[]{"Shelf"},
                new String[]{"Room 1"}  ),
        ROOM1("Room 1",
                "you're in Room 1, there are two shelves",
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
        private String[] sublocations;
        private String[] connectedRooms;


        AreaEnum (String name, String scene, String[]sublocations, String[]connectedRooms) {
            this.description = description;
            this.scene = scene;
            this.sublocations = sublocations;
            this.connectedRooms = connectedRooms;

        }

        public String getDescription() {
            return description;
        }
        public String getScene(){
            return scene;
        }
        public String[] getSublocations(){
            return sublocations;
        }
        public String[] getConnectedRooms(){
            return connectedRooms;
        }
    }



