public class Hogwarts {
    private int bravery;
    private int intelligence;
    private int cunning;
    private int loyalty;
    public Hogwarts(int bravery, int intelligence, int cunning, int loyalty) {
        this.bravery = bravery;
        this.intelligence = intelligence;
        this.cunning = cunning;
        this.loyalty = loyalty;
    }
    public void printDescription() {
        System.out.println("Описание студента:");
        System.out.println("Храбрость: " + bravery);
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Хитрость: " + cunning);
        System.out.println("Лояльность: " + loyalty);
    }
    public int compareProperties(Hogwarts student) {
        int sumProperties = bravery + intelligence + cunning + loyalty;
        int studentSumProperties = student.getBravery() + student.getIntelligence() +
                student.getCunning() + student.getLoyalty();

        if (sumProperties > studentSumProperties) {
            System.out.println("Текущий студент лучше, чем ученик " +
                    "своего факультета.");
        } else if (sumProperties < studentSumProperties) {
            System.out.println("Текущий студент хуже, чем ученик " +
                    "своего факультета.");
        } else {
            System.out.println("Оба ученика равны по своим " +
                    "факультетским свойствам.");
        }

        return studentSumProperties;
    }
    public int getBravery() {
        return bravery;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getCunning() {
        return cunning;
    }
    public int getLoyalty() {
        return loyalty;
    }
}
