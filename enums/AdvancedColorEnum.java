import java.util.Random;

class AdvancedColorEnum {
        public enum Color {
                RED(255,0,0),
                GREEN(0,255,0),
                BLUE(0,0,255); //semicolon if methods follow the definition
                        
                private final int[] hexCode;
                private Color(int r, int g, int b) {
                        hexCode = new int[3];
                        hexCode[0] = r;
                        hexCode[1] = g;
                        hexCode[2] = b;
                }

                public String toString() {
                        String hexRep = "(" +  Integer.toString(hexCode[0]) + ", " 
                                             + Integer.toString(hexCode[1]) + ", " 
                                             + Integer.toString(hexCode[2]) + " )";
                        return hexRep;
                }


        }
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
