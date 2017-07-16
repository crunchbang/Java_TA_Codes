package shapes.circle;

public class Circle {
        /*
         * private : we do not want users to access the radius directly
         * final : once set, the radius is assumed to not change (you can omit this if your assumptions are different)
         * non-static : static fields are shared across instances. Here radius is unique to each instance and is non-static.
         */
        private final float radius;

        public Circle(float r) {
                /*
                 * a final variable can only be initialized once but it need not be initialized at the time of declaration. 
                 * This is called a blank final variable. A blank final instance variable of a class must definitely be initialized
                 * by the end of every constructor of the class in which it is declared
                 */
                radius = r;
        }

        public float area() {
                return 3.14F * radius * radius;
        }
}
