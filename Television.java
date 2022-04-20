/**
 * Television
 */
public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnedOn;

    public void setVolume (int volumeLevel) {
        if (this.getTurnedOn()) {
            this.volume = volumeLevel;
        } else {
            System.out.println("Error. TV is off.");
            System.out.println();
        }
        
    }

    public int getVolume () {
        return this.volume; 
    }

    public void setCurrentProgram (int programNumber) {
        if (this.getTurnedOn()) {
            this.currentProgram = programNumber;
        } else {
            System.out.println("Error. TV is off.");
            System.out.println();
        }
        
    }

    public int getCurrentProgram () {
        return this.currentProgram;
    }

    public void setTurnedOn (Boolean tvOn) {
        this.turnedOn = tvOn;
    }

    public boolean getTurnedOn () {
        return this.turnedOn;
    }

    public void printInConsole () {
        System.out.println("Volume is: " + this.getVolume());
        System.out.println("Current program is: " + this.getCurrentProgram());
        System.out.println("The TV is turned on: " + this.getTurnedOn());
        System.out.println();
    }
}