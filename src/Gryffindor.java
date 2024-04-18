public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    public Gryffindor(int bravery, int intelligence, int cunning,
                      int loyalty, int nobility, int honor) {
        super(bravery, intelligence, cunning, loyalty);
        this.nobility = nobility;
        this.honor = honor;
    }
    public void compareGryffindors(Gryffindor student) {
        int studentNobility = ((Gryffindor) student).getNobility();
        int studentHonor = ((Gryffindor) student).getHonor();
        if (nobility + honor > studentNobility + studentHonor) {
            System.out.println("Текущий студент лучше, чем ученик " +
                    "из факультета Gryffindor.");
        } else if (nobility + honor < studentNobility + studentHonor) {
            System.out.println("Текущий студент хуже, чем ученик " +
                    "из факультета Gryffindor.");
        } else {
            System.out.println("Оба ученика равны по своим " +
                    "факультетским свойствам в Gryffindor.");
        }
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
}