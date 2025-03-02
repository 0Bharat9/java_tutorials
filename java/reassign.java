class Circle {
    int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printLocation() {
        System.out.println("Circle at (" + x + ", " + y + ")");
    }
}

class ReferenceDemo {
    public static void reassignCircle(Circle c) {
        c = new Circle(0, 0);
        // Reassignment has no effect on the original object
        System.out.println("reassignCircle:"+c.x+ " , "+c.y);
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5, 5);
        reassignCircle(myCircle);
        myCircle.printLocation();  // Still (5,5), not (0,0)
    }
}

