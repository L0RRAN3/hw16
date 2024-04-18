public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int creativity;
    public Ravenclaw(int bravery, int intelligence, int cunning, int loyalty, int wisdom, int creativity) {
        super(bravery, intelligence, cunning, loyalty);
        this.wisdom = wisdom;
        this.creativity = creativity;
    }
    public void compareRavenclaws(Ravenclaw student) {
        int studentWisdom = ((Ravenclaw) student).getWisdom();
        int studentCreativity = ((Ravenclaw) student).getCreativity();
        if (intelligence + wisdom + creativity >
                student.getIntelligence() + studentWisdom + studentCreativity) {
            System.out.println("Текущий студент лучше, чем ученик " + "из факультета Ravenclaw.");
        } else if (intelligence + wisdom + creativity <
                student.getIntelligence() + studentWisdom + studentCreativity) {
            System.out.println("Текущий студент хуже, чем ученик " + "из факультета Ravenclaw.");
        } else {
            System.out.println("Оба ученика равны по своим " + "факультетским свойствам в Ravenclaw.");
        }
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCreativity() {
        return creativity;
    }
}
