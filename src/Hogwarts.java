abstract class Hogwarts {
    private int spellPower;
    private int transgressionDistance;
    private String studentFullName;

    public Hogwarts(String studentFullName, int spellPower, int transgressionDistance) {
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
        this.studentFullName = studentFullName;
    }

    public static void printStudentDescription(Hogwarts student) {
        System.out.println("Студент " + student.getStudentFullName() + ": сила магии-" + student.getSpellPower() + ", расстояние трансгрессии-" + student.getTransgressionDistance());
        System.out.println(student);
        System.out.println();
    }


    public static void compareTwoStudentsInHogwartsAndPrintBest(Hogwarts student1, Hogwarts student2) {
        if ((student1.getSpellPower() + student1.getTransgressionDistance()) > (student2.getSpellPower()) + student2.getTransgressionDistance()) {
            System.out.println(student1.getStudentFullName() + " обладает бОльшей мощностью магии, чем " + student2.getStudentFullName());
        } else if ((student1.getSpellPower() + student1.getTransgressionDistance()) < (student2.getSpellPower()) + student2.getTransgressionDistance()) {
            System.out.println(student2.getStudentFullName() + " обладает бОльшей мощностью магии, чем " + student1.getStudentFullName());
        } else
            System.out.println("У " + student2.getStudentFullName() + " и " + student1.getStudentFullName() + " силы равны ");
    }

//    protected static int numOfStudentsInFaculty(Hogwarts[] students) {
//        int count = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                count++;
//            }
//        }
//        return count;
//    }


    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getStudentFullName() {
        return studentFullName;
    }


}
