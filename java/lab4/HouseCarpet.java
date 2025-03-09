public class HouseCarpet {
    private RoomDimension[] rooms;
    private double cost;

    public HouseCarpet(int numRooms, double cost) {
        this.rooms = new RoomDimension[numRooms];
        this.cost = cost;
    }

    public double getCarpetCost() {
        double totalCost = 0;
        for (RoomDimension room : rooms) {
            if (room != null) {
                totalCost += room.getArea() * cost;
            }
        }
        return totalCost;
    }

    public double[] getRoomCosts() {
        double[] roomCosts = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                roomCosts[i] = rooms[i].getArea() * cost;
            }
        }
        return roomCosts;
    }

    public void setRooms(RoomDimension[] newRooms) {
        if (newRooms.length != rooms.length) {
            rooms = new RoomDimension[newRooms.length];
        }
        for (int i = 0; i < newRooms.length; i++) {
            rooms[i] = newRooms[i];
        }
    }

    public int isFanSuitable(Fan fan) {
        int count = 0;
        for (RoomDimension room : rooms) {
            if (room != null && fan.isSuitable(room.getArea())) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        double totalArea = 0;
        for (RoomDimension room : rooms) {
            if (room != null) {
                totalArea += room.getArea();
            }
        }
        return "Total Rooms: " + rooms.length + ", Total Area: " + totalArea + ", Total Carpet Cost: " + getCarpetCost();
    }

    public static void main(String[] args) {
        RoomDimension[] testRooms = {
            new RoomDimension(1, 10),
            new RoomDimension(8, 10),
            new RoomDimension(12, 15)
        };
        
        HouseCarpet house = new HouseCarpet(testRooms.length, 2.5);
        house.setRooms(testRooms);
        
        System.out.println(house);
        
        Fan testFan = new Fan(2, true, 6.0, "white");
        System.out.println("Suitable rooms for fan: " + house.isFanSuitable(testFan));
    }
}
