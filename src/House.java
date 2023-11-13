
public class House {
    // Field
    String houseName;
    int floorNumber;

    // Getter and setter
    public String getHouseName() {
        return this.houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getFloorNumber() {
        return this.floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    // Constructor
    public House(String houseName, int floorNumber) {
        this.houseName = houseName;
        this.floorNumber = floorNumber;
    }
}