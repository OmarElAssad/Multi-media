/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("TV's current status");       
        System.out.println();

        Television LG = new Television();
        LG.setVolume(0);
        LG.setCurrentProgram(1);
        LG.setTurnedOn(false);
        LG.printInConsole();

        LG.setTurnedOn(true);
        LG.setVolume(33);
        LG.setCurrentProgram(445);
        LG.printInConsole();

        Radio naxi = new Radio();
        naxi.setFmFrequency(91.8f);
        naxi.setAmFrequency(600);
        naxi.setBand('A');
        naxi.printInConsole();
        
    }
}