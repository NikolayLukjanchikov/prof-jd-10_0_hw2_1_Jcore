public class Gryffindor extends Hogwarts {
    private int nobility;   //благородство
    private int honor;      //честь
    private int courage;    //храбрость

    public Gryffindor(String studentFullName, int spellPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(studentFullName, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "модификаторы школы Гриффиндор: " +
                "благородство-" + nobility +
                ", честь-" + honor +
                ", храбрость-" + courage;
    }

    public static void compareTwoStudentsAtFacultyAndPrintBest(Gryffindor student1, Gryffindor student2) {
        if ((student1.getNobility() + student1.getHonor() + student1.getCourage()) > (student2.getNobility()) + student2.getHonor() + student2.getCourage()) {
            System.out.println(student1.getStudentFullName()+ " лучший Гриффиндорец, чем " + student2.getStudentFullName());
        } else if ((student1.getNobility() + student1.getHonor() + student1.getCourage()) < (student2.getNobility()) + student2.getHonor() + student2.getCourage()) {
            System.out.println(student2.getStudentFullName()+ " лучший Гриффиндорец, чем " + student1.getStudentFullName());
        } else System.out.println(student2.getStudentFullName()+ " и " + student1.getStudentFullName() + " два сапога пара :-)");
    }

//    public static void findAndPrintBestStudent(Gryffindor[] students) {
//        int firstNotNullElement = 0;
//        int studentMaxSumSkill = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                studentMaxSumSkill = (students[i].getNobility() + students[i].getHonor() + students[i].getCourage());
//                firstNotNullElement = i;
//                break;
//            } else {
//                System.out.println("В Грифиндор еще никого не распределили, обратитесь к шляпе");
//            }
//        }
//        for (int i = firstNotNullElement; i < students.length; i++) {
//            if (students[i] != null && (studentMaxSumSkill < (students[i].getNobility() + students[i].getHonor() + students[i].getCourage()))) {
//                studentMaxSumSkill = (students[i].getNobility() + students[i].getHonor() + students[i].getCourage());
//            }
//        }
//        for (int i = firstNotNullElement; i < students.length; i++) {
//            if (students[i] != null && ((students[i].getNobility() + students[i].getHonor() + students[i].getCourage()) == studentMaxSumSkill)) {
//                System.out.println(students[i].getStudentFullName() + " лучший Гриффиндорец, среди остальных " + (numOfStudentsInFaculty(students) - 1) + " студента/ов");
//            }
//        }
//    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
}
