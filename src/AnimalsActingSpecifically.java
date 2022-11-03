import java.util.ArrayList;

public class AnimalsActingSpecifically {
    void run () {

        //Udprintelse af overskrift
        System.out.println("__________________________________________________________");
        System.out.println("Animal acting specifically");
        System.out.println("___________________________________________________________");

        // Oprettelse af araylist
        ArrayList <Animal>animals = new ArrayList <>();

        //Oprettele af instancer, samt give dem navne og add til arraylisten.
        Dog b = new Dog();
        b.setName("Brown");
        animals.add(b);

        Dog br = new Dog();
        br.setName("Brownie");
        animals.add(br);

        Cat v = new Cat();
        v.setName("Valentino");
        animals.add(v);

        Cat g = new Cat();
        g.setName("Gucci");
        animals.add(g);

        //Printning af instancere samt tilføje beg og scrach metoder, ved hjælp af instanceof.
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            System.out.println(a);
            if (a instanceof Dog) {
                ((Dog) animals.get(i)).beg();
            }

            else if (animals.get(i) instanceof Cat) {
                ((Cat) animals.get(i)).scratch();
            }
        }
    }


    public static void main(String[] args) {
        new AnimalsActingSpecifically().run();
    }
}
