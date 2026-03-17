package main.java.task3;

public class Insert {

    public void insertFish(Fish fish, Places place,  Ford ford) {
        if (place != Places.EAR){
            System.out.println("Fish can only be inserted into the ear.");
        } else {
            if (fish.place == place){
                System.out.println("Fish is already in the ear.");
                return;
            }
            fish.insert(place);
            System.out.println("Fish has been inserted into the ear.");
            ford.setCondition("Satisfied");
        }

    }

    public void insertCereals(Cereals cereals, Places place, Arthur arthur) {
    
        if (place ==  Places.Room) {
            if (cereals.place == place){
                System.out.println("Cereals are already in the mouth.");
                return;
            }
            
            System.out.println("Cereals have been inserted into the mouth.");
            arthur.setCondition("Sure");
        } else if (place == Places.EYE){
            System.out.println("You can insert only fish into the eye.");
            return;
        }

        cereals.place = place;

    }

    
}
