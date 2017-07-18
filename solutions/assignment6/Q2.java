
class Animal {
        public void walk() {
                System.out.println("I'm walking");
        }
}

class Bird extends Animal {
        public void fly() {
                System.out.println("I'm flying");
        }
}

class Q2 {
        public static void main(String[] args) {
                Bird b = new Bird();

                b.walk();
                b.fly();
        }

}
