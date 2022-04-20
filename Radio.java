/**
 * Radio
 */
public class Radio {

    private float fmFrequency;
    private int amFrequency;
    private char band;

    public void setFmFrequency (float fm) {
        this.fmFrequency = fm;
    } 

    public float getFmFrequency() {
        return this.fmFrequency;
    }

    public void setAmFrequency (int am) {
        this.amFrequency = am;
    }

    public int getAmFrequency () {
        return this.amFrequency;
    }

    public void setBand (char bandType) {
        this.band = bandType;
    }

    public char getBand () {
        return this.band;
    }

    public void printInConsole() {
        System.out.println("FM Frequency is: " + this.getFmFrequency());
        System.out.println("AM Frequency is: " + this.getAmFrequency());
        System.out.println("Band is: " + this.getBand());
        System.out.println();
    }
}