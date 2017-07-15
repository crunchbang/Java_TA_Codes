

public class Q4 {
        public static void main(String[] args) {
                Circle c = new Circle(5);
                System.out.println("Area of circle with radius 5: " + c.area());

                Square s = new Square(5);
                System.out.println("Area of square with side 5: " + s.area());
        }

}

class Circle {
        public float radius;

        public Circle(float r) {
                radius = r;
        }

        public float area() {
                return 3.14F * radius * radius;
        }
}

class Square {
        public float side;

        public Square(float s) {
                side = s;
        }

        public float area() {
                return side * side;
        }
}
