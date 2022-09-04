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
