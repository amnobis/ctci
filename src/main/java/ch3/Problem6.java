package ch3;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author anobis
 */
public class Problem6 {
    LinkedList<Animal> dogs = new LinkedList<>();
    LinkedList<Animal> cats = new LinkedList<>();
    int age = 0;

    public void addDog(int doggo) {
        dogs.addLast(new Animal(doggo, age++));
    }

    public void addCat(int cat) {
        cats.addLast(new Animal(cat, age++));
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }


        if (dogs.peek().age > cats.peek().age) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Animal dequeueCat() {
        return cats.poll();
    }

    public Animal dequeueDog() {
        return dogs.poll();
    }

    public static class Animal {
        final int id;
        final int age;

        public Animal(int id, int age) {
            this.id = id;
            this.age = age;
        }
    }
}
