public class Hogwarts {
    private int spellPower;
    private int transgressionDistance;
    private String studentFullName;

    public Hogwarts(String studentFullName, int spellPower, int transgressionDistance) {
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
        this.studentFullName = studentFullName;
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
