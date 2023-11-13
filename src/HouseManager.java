
import java.util.ArrayList;
import java.util.List;

public class HouseManager {
    // Class for managing house
    public static List<House> getAllHouse() {
        List<House> houses = new ArrayList<>();
        houses.add(new House("Villa basse Iavoloha", 1));
        houses.add(new House("Appartement Gendal", 5));
        houses.add(new House("Hopital Befelatanana", 3));

        return houses;
    }
}
