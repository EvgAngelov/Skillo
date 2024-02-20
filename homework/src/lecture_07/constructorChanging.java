package lecture_07;

public class constructorChanging {
        public static void main(String[] args) {
            System.out.println("1. Creating object Animal");
            Animal animal = new Animal();
            System.out.println("2. Creating object Bird");
            Bird bird = new Bird();
            System.out.println("3. Creating object Penguin");
            Penguin penguin = new Penguin();
        }
    }
    // Penguin -> Bird -> Animal
    class Animal {
        public Animal() {
            System.out.println("Calling constructor of class Animal");
        }
    }

    class Bird extends Animal {
        public Bird() {
            System.out.println("Calling constructor of class Bird");
        }
    }

    class Penguin extends Bird {
        public Penguin() {
            System.out.println("Calling constructor of class Penguin");
        }
    }

