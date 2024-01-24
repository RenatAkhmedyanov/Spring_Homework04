package ru.akhmedyanov.homework04.hw04.services;

import org.springframework.stereotype.Service;
import ru.akhmedyanov.homework04.hw04.models.Animal;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    List<Animal> animals = new ArrayList<>();

    /**
     * Добавить животное
     * @param animal
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Получить всех животных
     * @return
     */
    public List<Animal> getAllAnimals() {
        return animals;
    }
}
