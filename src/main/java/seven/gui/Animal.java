package seven.gui;

public enum Animal {

    BIRD("Bird"),
    CAT("Cat"),
    DOG("Dog"),
    RABBIT("Rabbit"),
    PIG("Pig");

    private String animalName;

    private Animal(String label) {
        this.animalName = label;
    }

    public String getAnimalName() {
        return animalName;
    }
}
