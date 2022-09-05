public class Hufflepuff extends Hogwarts {
    //пуффендуй
    private int industrious;    //трудолюбие
    private int loyalty;        //верность
    private int honesty;        //честность

    public Hufflepuff(String studentFullName, int spellPower, int transgressionDistance, int industrious, int loyalty, int honesty) {
        super(studentFullName, spellPower, transgressionDistance);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "модификаторы школы Пуффендуй: " +
                "трудолюбие: " + industrious +
                ", верность: " + loyalty +
                ", честность: " + honesty;
    }

    public static void compareTwoStudentsAtFacultyAndPrintBest(Hufflepuff student1, Hufflepuff student2) {
        if ((student1.getIndustrious() + student1.getIndustrious() + student1.getHonesty()) > (student2.getIndustrious()) + student2.getIndustrious() + student2.getHonesty()) {
            System.out.println(student1.getStudentFullName() + " лучший Пуффендуец, чем " + student2.getStudentFullName());
        } else if ((student1.getIndustrious() + student1.getIndustrious() + student1.getHonesty()) < (student2.getIndustrious()) + student2.getIndustrious() + student2.getHonesty()) {
            System.out.println(student2.getStudentFullName() + " лучший Пуффендуец, чем " + student1.getStudentFullName());
        } else
            System.out.println(student2.getStudentFullName() + " и " + student1.getStudentFullName() + " два сапога пара :-)");
    }

//    public static void findAndPrintBestStudent(Hufflepuff[] students) {
//        int firstNotNullElement = 0;
//        int studentMaxSumSkill = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                studentMaxSumSkill = (students[i].getIndustrious() + students[i].getLoyalty() + students[i].getHonesty());
//                firstNotNullElement = i;
//                break;
//            } else {
//                System.out.println("В Пуффендуй еще никого не распределили, обратитесь к шляпе");
//            }
//        }
//        for (int i = firstNotNullElement; i < students.length; i++) {
//            if (students[i] != null && (studentMaxSumSkill < (students[i].getIndustrious() + students[i].getLoyalty() + students[i].getHonesty()))) {
//                studentMaxSumSkill = (students[i].getIndustrious() + students[i].getLoyalty() + students[i].getHonesty());
//            }
//        }
//        for (int i = firstNotNullElement; i < students.length; i++) {
//            if (students[i] != null && (students[i].getIndustrious() + students[i].getLoyalty() + students[i].getHonesty()) == studentMaxSumSkill) {
//                System.out.println(students[i].getStudentFullName() + " лучший Пуффендуец, среди остальных " + (numOfStudentsInFaculty(students) - 1) + " студента/ов");
//            }
//        }
//    }


    public int getIndustrious() {
        return industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
