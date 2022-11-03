public abstract class Animal {

    private String name;

    public Animal () {
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public String makeSound () {
        return "Animal sound";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' + "  "+  "Animal sound = "+   makeSound() +
                '}';
    }
}
