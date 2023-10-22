package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

import java.util.*;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();
    public void addAnimal(Animal animal) {

        animalList.add(animal);
    }

    /**
     * Метод должен возвращять список звуков животных.
     * Звуки животных должны быть отсортированы по имени житного. Пример
     * Животные:
     *
     * Корова: Яша
     * Кошка: Дуся
     * Собака: Жучка
     * Корова: Абракадабра
     * Собака: Шарик
     * Кошка: Мурзик
     * Собака: Бобик
     *
     * Вовращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */
    public List<String> soundAllAnimalsSortByName() {
        List<String> sounds = new ArrayList<>();
        // TODO заполните корректно список звуков
        Comparator<Animal> comparator=new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(animalList,comparator);
        for(Animal x:animalList)sounds.add(x.sound());
        return sounds;
    }


}
