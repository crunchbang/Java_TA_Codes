import shapes.circle.*;
import shapes.square.*;

public class Tester {
        public static void main(String[] args) {
                Circle c = new Circle(3);
                System.out.println(c.area());

                Square s = new Square(5);
                System.out.println(s.area());

        }
}


