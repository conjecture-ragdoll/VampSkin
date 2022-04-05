

//Day #, Skincare Ritual, Logged Symptoms

public class Dayta extends Ritual {

    protected int dayNumber = 0;
    protected Ritual AM;
    protected Ritual PM;    // Treatment Rituals can be at night 
    protected String[] loggedSymptoms = {};  // User logs indices corresponding to elements belonging to Array symptoms[]



    public Dayta() {
        this.dayNumber = this.dayNumber;
        this.AM = this.AM;
        this.PM = this.PM;
        this.loggedSymptoms = this.loggedSymptoms;
    }

    public Dayta(int dayIndex) {
        this.dayNumber = dayIndex;
        this.AM = this.AM;
        this.PM = this.PM;
        this.loggedSymptoms = this.loggedSymptoms;
    }

    public void setDayNumber(int dayNum) {
        this.dayNumber = dayNum;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

    public void setAMRitual(Ritual ritual) {
        this.AM = ritual;
    }

    public Ritual getAMRitual() {
        return this.AM;
    }

    public void setPMRitual(Ritual ritual) {
        this.PM = ritual;
    }

    public Ritual getPMRitual() {
        return this.PM;
    }

    public void setSymptoms(String[] symp) {
        this.loggedSymptoms = symp;
    }

    public String[] getSymptoms() {
        return this.loggedSymptoms;
    }


    public void gatherSymptoms() {
        
    }
/*
    public void logSymptoms(int dayNum) {   // make part of dayta instead?
        for(String symptom : this.symptoms) {

        }
    }
*/
    public String toString() {   
        return "~ Day " + this.dayNumber + " ~\nAM Routine: \n" + this.AM + "\nPM Routine: \n" + this.PM; 
    }

}

