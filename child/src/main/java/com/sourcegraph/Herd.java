package com.sourcegraph;

import java.util.List;

public class Herd {
    private List<Animal> animals;

    public Herd(List<Animal> animals) {
        this.animals = animals;
    }

    public void migrate() {
        for (Animal animal : animals) {
            animal.walk();
        }
    }
}
