public class Main {
    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor(5, 100, 3, 80, 5, 5);
        Gryffindor ron = new Gryffindor(3, 70, 4, 70, 3, 4);

        hermione.printDescription();
        ron.printDescription();

        hermione.compareGryffindors(ron);

        Ravenclaw luna = new Ravenclaw(4, 90, 6, 70, 100, 80);
        Ravenclaw cho = new Ravenclaw(3, 80, 5, 70, 90, 75);

        luna.printDescription();
        cho.printDescription();

        luna.compareRavenclaws(cho);

        Hufflepuff cedric = new Hufflepuff(4, 80, 5, 100, 90, 100);
        Hufflepuff justin = new Hufflepuff(3, 70, 4, 90, 80, 90);

        cedric.printDescription();
        justin.printDescription();

        cedric.compareHufflepuffs(justin);

        Slytherin draco = new Slytherin(3, 90, 6, 70, 100, 80);
        Slytherin zacharias = new Slytherin(2, 80, 5, 70, 90, 75);

        draco.printDescription();
        zacharias.printDescription();

        draco.compareSlytherins(zacharias);

        Hogwarts student1 = new Hogwarts(4, 100, 6, 80);
        Hogwarts student2 = new Hogwarts(5, 90, 7, 70);

        student1.printDescription();
        student2.printDescription();

        student1.compareProperties(student2);
    }
}