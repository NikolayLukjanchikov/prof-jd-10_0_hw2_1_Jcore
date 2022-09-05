public class Ravenclaw extends Hogwarts {
    //когтевран
    private int intellect;  //ум
    private int wisdom;     //мудрость
    private int wittiness;  //остроумие
    private int creativity; //творчество

    public Ravenclaw(String studentFullName, int spellPower, int transgressionDistance, int intellect, int wisdom, int wittiness, int creativity) {
        super(studentFullName, spellPower, transgressionDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "модификаторы школы Когтевран: " +
                "ум-" + intellect +
                ", мудрость-" + wisdom +
                ", остроумие-" + wittiness +
                ", творчество-" + creativity;
    }

    public static void compareTwoStudentsAtFacultyAndPrintBest(Ravenclaw student1, Ravenclaw student2) {
        if ((student1.getIntellect() + student1.getWisdom() + student1.getWittiness() + student1.getCreativity()) > (student2.getIntellect()) + student2.getWisdom() + student2.getCreativity() + student2.getWittiness()) {
            System.out.println(student1.getStudentFullName() + " лучший Когтевранец, чем " + student2.getStudentFullName());
        } else if ((student1.getIntellect() + student1.getWisdom() + student1.getWittiness() + student1.getCreativity()) < (student2.getIntellect()) + student2.getWisdom() + student2.getCreativity() + student2.getWittiness()) {
            System.out.println(student2.getStudentFullName() + " лучший Когтевранец, чем " + student1.getStudentFullName());
        } else
            System.out.println(student2.getStudentFullName() + " и " + student1.getStudentFullName() + " два сапога пара :-)");
    }


//    public static void findAndPrintBestStudent(Ravenclaw[] students) {
//        int firstNotNullElement = 0;
//        int studentMaxSumSkill = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                studentMaxSumSkill = (students[i].getIntellect() + students[i].getWittiness() + students[i].getWisdom()+students[i].getCreativity());
//                firstNotNullElement = i;
//                break;
//            } else {
//                System.out.println("В Когтевран еще никого не распределили, обратитесь к шляпе");
//            }
//        }
//        for (int i = firstNotNullElement; i < students.length; i++) {
//            if (students[i] != null && (studentMaxSumSkill < (students[i].getIntellect() + students[i].getWittiness() + students[i].getWisdom()+students[i].getCreativity()))) {
//                studentMaxSumSkill = (students[i].getIntellect() + students[i].getWittiness() + students[i].getWisdom()+students[i].getCreativity());
//            }
//        }
//        for (int i = firstNotNullElement; i < students.length; i++) {
//            if (students[i] != null && (students[i].getIntellect() + students[i].getWittiness() + students[i].getWisdom()+students[i].getCreativity()) == studentMaxSumSkill) {
//                System.out.println(students[i].getStudentFullName() + " лучший Когтевранец, среди остальных " + (numOfStudentsInFaculty(students) - 1) + " студента/ов");
//            }
//        }
//    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }
}
