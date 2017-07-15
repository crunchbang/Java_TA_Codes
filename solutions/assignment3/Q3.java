

public class Q3 {
        public static void main(String[] args) {
                Circle c = new Circle();
                c.radius = 5;
                System.out.println("Area of circle with radius 5: " + c.area());

                Square s = new Square();
                s.side = 5;
                System.out.println("Area of square with side 5: " + s.area());
        }

}

class Circle {
        public float radius;

        public float area() {
                return 3.14F * radius * radius;
        }
}

class Square {
        public float side;

        public float area() {
                return side * side;
        }
}
