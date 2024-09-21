public class Wolf {
    String name;
    int age;
    String gender;
    String species;
    String color;
    int weight;

    public Wolf(String name, int age, String gender, String species, String color, int weight) {
        this.name = name;
        // refers to specific wolf
        this.age = age;
        this.gender = gender;
        this.species = species;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}
