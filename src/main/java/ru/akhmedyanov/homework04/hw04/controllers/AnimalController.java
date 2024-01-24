package ru.akhmedyanov.homework04.hw04.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.akhmedyanov.homework04.hw04.models.Animal;
import ru.akhmedyanov.homework04.hw04.services.AnimalService;

@Controller
@AllArgsConstructor
public class AnimalController {

    private AnimalService animalService;

    /**
     * Получить всех животных
     * @param model
     * @return
     */
    @GetMapping("/animals")
    public String getAnimal(Model model) {
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }

    /**
     * Добавить животное
     * @param animal
     * @param model
     * @return
     */
    @PostMapping("/animals")
    public String addAnimal(Animal animal, Model model) {
        animalService.addAnimal(animal);
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }
}
