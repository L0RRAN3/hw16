public class Hufflepuff extends Hogwarts {
    private int patience;
    private int kindness;
    public Hufflepuff(int bravery, int intelligence, int cunning,
                      int loyalty, int patience, int kindness) {
        super(bravery, intelligence, cunning, loyalty);
        this.patience = patience;
        this.kindness = kindness;
    }
    public void compareHufflepuffs(Hufflepuff student) {
        int studentPatience = ((Hufflepuff) student).getPatience();
        int studentKindness = ((Hufflepuff) student).getKindness();
        if (loyalty + patience + kindness > student.getLoyalty() + studentPatience + studentKindness) {
            System.out.println("Текущий студент лучше, чем ученик " + "из факультета Hufflepuff.");
        } else if (loyalty + patience + kindness <
                student.getLoyalty() + studentPatience + studentKindness) {
            System.out.println("Текущий студент хуже, чем ученик " + "из факультета Hufflepuff.");
        } else {
            System.out.println("Оба ученика равны по своим " + "факультетским свойствам в Hufflepuff.");
        }
    }
    public int getPatience() {
        return patience;
    }
    public int getKindness() {
        return kindness;
    }
}
