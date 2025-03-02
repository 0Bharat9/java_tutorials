class PolygonCreator {
    public void createPolygon(Point... corners) {
        for(int i =0;i<corners.length;i++){
          System.out.println("Point " + i + " is at ( " + corners[i].x + " , " + corners[i].y + " )");
        }
        System.out.println("Polygon created with " + corners.length + " points.");
    }

    public static void main(String[] args) {
        Point[] points = {new Point(0, 0), new Point(5, 0), new Point(5, 5), new Point(0, 5)};
        PolygonCreator pc = new PolygonCreator();
        pc.createPolygon(points);
        Point p1 = new Point(10,10);
        System.out.println("Point is at ( " + p1.x + " , " + p1.y + " )");
        p1 = new Point(20,20);
        System.out.println("Point is at ( " + p1.x + " , " + p1.y + " )");
        p1 = null;
        System.out.println("Point is at ( " + p1.x + " , " + p1.y + " )");
    }
}

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

