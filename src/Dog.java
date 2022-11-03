public class Dog extends Animal{

    public Dog () {
      super();
    }
    public String makeSound () {
    return "Woof Woof";
    }

    public String beg () {
        return "Begging";
    }

    @Override
    public String toString() {
        return super.toString() + " " + beg();
    }
}
