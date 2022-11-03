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

    public void makeSound () {
        System.out.println("Animal sound");
    }
}
