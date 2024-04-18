public class Slytherin extends Hogwarts {
    private int ambition;
    private int resourcefulness;
    public Slytherin(int bravery, int intelligence, int cunning, int loyalty, int ambition, int resourcefulness) {
        super(bravery, intelligence, cunning, loyalty);
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }
    public void compareSlytherins(Slytherin student) {
        int studentAmbition = ((Slytherin) student).getAmbition();
        int studentResourcefulness = ((Slytherin) student).getResourcefulness();
        if (cunning + ambition + resourcefulness >
                student.getCunning() + studentAmbition + studentResourcefulness) {
            System.out.println("Текущий студент лучше, чем ученик " + "из факультета Slytherin.");
        } else if (cunning + ambition + resourcefulness <
                student.getCunning() + studentAmbition + studentResourcefulness) {
            System.out.println("Текущий студент хуже, чем ученик " + "из факультета Slytherin.");
        } else {
            System.out.println("Оба ученика равны по своим " + "факультетским свойствам в Slytherin.");
        }
    }
    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }
}
