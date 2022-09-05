public class Slytherin extends Hogwarts {

    private int cunning;        //хитрость
    private int determination;  //решительность
    private int ambition;       //амбициозность
    private int resourcefulness;//находчивость
    private int lustForPower;   //жажда власти

    public Slytherin(String studentFullName, int spellPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentFullName, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "модификаторы школы Слизерин: " +
                "хитрость-" + cunning +
                ", решительность-" + determination +
                ", амбициозность-" + ambition +
                ", находчивость-" + resourcefulness +
                ", жажда власти-" + lustForPower;
    }

    public static void compareTwoStudentsAtFacultyAndPrintBest(Slytherin student1, Slytherin student2) {
        if ((student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower())
                >
                (student2.getCunning()) + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower()) {
            System.out.println(student1.getStudentFullName() + " лучший Слизеринец, чем " + student2.getStudentFullName());
        } else if ((student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower())
                <
                (student2.getCunning()) + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower()) {
            System.out.println(student2.getStudentFullName() + " лучший Слизеринец, чем " + student1.getStudentFullName());
        } else
            System.out.println(student2.getStudentFullName() + " и " + student1.getStudentFullName() + " два сапога пара :-)");
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
