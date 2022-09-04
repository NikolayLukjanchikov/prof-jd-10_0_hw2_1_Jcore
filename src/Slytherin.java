public class Slytherin extends Hogwarts{

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
