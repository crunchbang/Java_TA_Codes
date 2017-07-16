
public class Square {
        /*
         * private : we do not want users to access the side directly
         * final : once set, the side is assumed to not change (you can omit this if your assumptions are different)
         * non-static : static fields are shared across instances. Here side is unique to each instance and is non-static.
         */
        private final float side;

        public Square(float s) {
                /*
                 * a final variable can only be initialized once but it need not be initialized at the time of declaration. 
                 * This is called a blank final variable. A blank final instance variable of a class must definitely be initialized
                 * by the end of every constructor of the class in which it is declared.
                 */
                side = s;
        }

        public float area() {
                return side * side;
        }
}
