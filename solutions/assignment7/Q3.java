
interface Shape {

        float area();
}

class Rectangle implements Shape {
        private final float length, breadth;

        public Rectangle(float l, float b) {
                length = l;
                breadth = b;
        }

        @Override
        public float area() {
                return length * breadth;
        }

}

class Circle implements Shape {
        private final float radius;

        public Circle(float radius) {
                this.radius = radius;
        }

        @Override
        public float area() {
                return 3.14F * radius * radius;
        }
}

class Q3 {
        public static void main(String[] args) {
                Shape[] shapeArray = new Shape[3];

                shapeArray[0] = new Rectangle(10, 20);
                shapeArray[1] = new Rectangle(1, 200);
                shapeArray[2] = new Circle(10.3F);

                for(Shape s : shapeArray) {
                        System.out.println("Area : " + s.area());
                }


        }
}
