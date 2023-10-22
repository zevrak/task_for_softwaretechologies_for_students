package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

public class AnimalFactory {
    private static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "meow";
        }
    }

    private static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "woof";
        }
    }

    private static class Cow extends Animal {
        public Cow(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "moo";
        }
    }

    /**
     * Метод для создания животных по типу
     *
     * @param name - имя животного
     * @param type - тип животного
     * @return животное, соответствующее каждому из типов.
     */


    public static Animal createAnimal(String name, AnimalType type) {
        /* TODO в зависимости от type создайте и верните нужное животное */
        return switch (type) {
            case CAT -> new Cat(name);
            case DOG -> new Dog(name);
            case COW -> new Cow(name);
        };

    };

}
