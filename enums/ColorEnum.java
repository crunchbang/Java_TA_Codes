import java.util.Random;

enum Color {
        RED,
        GREEN,
        BLUE,
}

class ColorEnum {
        public static void main(String[] args) {

                Color outputColor = findColorOfObject();
                switch(outputColor) {
                        case RED:
                                System.out.println("It's RED!");
                                break;
                        case BLUE:
                                System.out.println("It's BLUE!");
                                break;
                        case GREEN:
                                System.out.println("It's GREEN!");
                                break;

                }
                System.out.println(outputColor);

                System.out.println("Possible Colors:");
                for (Color c : Color.values()) {
                        System.out.println(c);
                }
        }

        public static Color findColorOfObject() { 
                /* 
                 * Randomly return an enum
                 */
                Random random = new Random();
                int val = random.nextInt(3);
                Color c;
                switch(val) {
                        case 0 :
                                c = Color.RED;
                                break;
                        case 1:
                                c = Color.BLUE;
                                break;
                        case 2:
                                c = Color.GREEN;
                                break;
                        default:
                                c = Color.RED;
                                break;
                }
                return c;
        }
}
