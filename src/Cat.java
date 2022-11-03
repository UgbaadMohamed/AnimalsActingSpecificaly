import javax.xml.parsers.SAXParser;

public class Cat extends Animal{

    public Cat () {
        super();
    }

    public String makeSound () {
       return "Meow Meow";
    }
    public String scratch () {
        return "Scratching";

    }

    @Override
    public String toString() {
        return super.toString() +" " +  scratch();
    }
}
