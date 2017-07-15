

public class Q2 {
        public static void main(String[] args) {
                Circle c = new Circle();
                Square s = new Square();
                System.out.println("Area of circle with radius 5: " + c.area(5));
                System.out.println("Area of square with side 5: " + s.area(5));
        }

}

class Circle {
        public float area(float radius) {
                return 3.14F * radius * radius;
        }
}

class Square {
        public float area(float side) {
                return side * side;
        }
}
