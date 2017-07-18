
class Rectangle {
        public final float length, breadth;

        public Rectangle(float l, float b) {
                length = l;
                breadth = b;
        }

}

class Square extends Rectangle {

        public Square(float side) {
                super(side, side);
        }

}

class Point extends Rectangle {

        public Point() {
                super(0, 0);
        }
}

class Q3 {
        public static void main(String[] args) {
                Rectangle[] rectArray = new Rectangle[3];

                rectArray[0] = new Rectangle(10, 20);
                rectArray[1] = new Square(10);
                rectArray[2] = new Point();

                for(Rectangle r : rectArray) {
                        System.out.println("Area : " + r.length * r.breadth);
                }


        }
}
