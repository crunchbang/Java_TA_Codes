
abstract class Animal {
        protected final String species;

        public Animal(String species) {
                this.species = species;
        }

        public abstract void move();
}

class Bird extends Animal {

        public Bird() {
                super("Bird");
        }

        @Override
        public void move() {
                System.out.println("Bird flying");
        }
}

class Fish extends Animal {

        public Fish() {
                super("Fish");
        }

        @Override
        public void move() {
                System.out.println("Fish swimming");
        }
}

class Q2 {
        public static void main(String[] args) {
                Animal b = new Bird();
                b.move();

                Animal f = new Fish();
                f.move();
        }

}
