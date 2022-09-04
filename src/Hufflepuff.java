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
