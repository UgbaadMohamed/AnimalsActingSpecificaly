import java.util.ArrayList;

public class AnimalsActingSpecifically {
    void run () {

        //Udprintelse af overskrift
        System.out.println("_____________________________________");
        System.out.println("Animal acting specifically");
        System.out.println("_____________________________________");

        // Oprettelse af araylist
        ArrayList <String> Animals = new ArrayList <>();

        //Oprettele af instancer, samt give dem navne og add til arraylisten.
        Dog b = new Dog();
        b.setName("Brown");
        Animals.add(0, b.getName());

        Dog br = new Dog();
        br.setName("Brownie");
        Animals.add(1, br.getName());

        Cat v = new Cat();
        v.setName("Valentino");
        Animals.add(2, v.getName());

        Cat g = new Cat();
        g.setName("Gucci");
        Animals.add(3, g.getName());


        System.out.print(Animals.get(0) + ", " );
        if (b instanceof Dog){
            b.makeSound();
            b.beg();
        }

        System.out.print(Animals.get(1)+ ", ");
        if (br instanceof Dog){
            br.makeSound();
            br.beg();
        }

        System.out.print(Animals.get(2)+ ", ");
        if (v instanceof Cat){
            v.makeSound();
            v.scratch();
        }

        System.out.print(Animals.get(3) + ", ");
        if (g instanceof Cat){
            g.makeSound();
            g.scratch();
        }
    }

    public static void main(String[] args) {
        new AnimalsActingSpecifically().run();
    }
}
