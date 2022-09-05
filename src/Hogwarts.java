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
        System.out.println("Студент " + student.getStudentFullName() + ": сила магии-" + student.getSpellPower()+ ", расстояние трансгрессии-" + student.getTransgressionDistance());
        System.out.println(student);
        System.out.println();
    }

    protected static int numOfStudentsInFaculty(Hogwarts[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        return count;
    }



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
