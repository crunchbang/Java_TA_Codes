import java.util.Scanner;

public class Speak {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                String animal;
                System.out.print("Enter the name of the animal: ");
                animal = s.next(); //next reads input till the first space character
                //use nextLine() to read the whole line
                printSound(animal);
        }

        public static void printSound(String animal) {
                String sound;
                if (animal.equals("human")) {
                        sound = "bla bla bla";
                } else if (animal.equals("dog")) {
                        sound = "bark";
                } else if (animal.equals("cat")) {
                        sound = "meow";
                } else {
                        sound = "wrong animal";
                }

                System.out.println(sound);
                
        }
}
