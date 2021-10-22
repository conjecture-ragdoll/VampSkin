import java.lang.String;

public class VampSkin extends Dayta {

/*** 

Track period date and Skin behaviors throughout the month
Reccomend custom skincare routine

Coming Soon: Import products from INCI api database as suggestions for skin concerns

***/
    
    private String[] skinConcerns = 
                    {
                        "Acne",
                        "Fine lines",
                        "Oily skin",
                        "Extreme dryness",
                        "Dullness",
                        "Discoloration",
                        "Acne scarring",
                    };

    protected static String[] treatments = 
                    {
                        "Chemical Exfoliation",
                        "Dermaplanning",    // 2x month
                        "Chemical Peel"    
                    };

    protected static String[] symptoms = 
                    { 
                        "Oily skin",  
                        "Congested skin",   
                        "Acne breakouts",
                        "Dry skin",
                        "Itchy skin",
                        "Flakey skin",
                        "None!",
                        "Other"
                    };

    private int cycleLength;
    private Dayta[] menstralCycle;
    private int treatDayFrequency;      // # of reccomended treatments throughout cycle, prevent overcompramising skin barrier
    

    public VampSkin(Dayta[] monthlyCycle) {
        this.cycleLength = this.cycleLength;
        this.menstralCycle = this.menstralCycle;
    }

    public VampSkin(int cycLen) {
        this.cycleLength = cycLen;
        this.menstralCycle = new Dayta[cycLen];
    }

    public void setCycleLength(int cycLen) {
        this.cycleLength = cycLen;
    }

    public int getCycleLength() {
        return this.cycleLength;
    }

    public void setMenstralCycle(Dayta[] cycle) {
        this.menstralCycle = cycle;
    }

    public Dayta[] getMenstralCycle() {
        return this.menstralCycle;
    }

    public Dayta getDayta(int dayNum) {
        return this.menstralCycle[dayNum];
    }

    // log date of period
    public void logPeriodStart() {
        // Date
    }

    // log end date of period
    public void logPeriodEnd(int cycleIndex) { // folicular phase
        // Date
        this.cycleLength = cycleIndex;
    }

    public void gatherSymptoms() {
        
    }

    public void logSymptoms(int dayNum) {
        for(String symptom : this.symptoms) {

        }
    }

    public void setTreatmentDay(int dayStart, int frequency, String treat) {     // PM treatments for better collagen production
        this.menstralCycle[dayStart]
        .getPMRitual()
        .setTreatment(treat);
    }

    public void setTreatDayFrequency(int daysApart) {
        this.treatDayFrequency = this.cycleLength / daysApart;  // Make each TreatmentRitual have it's own treatDay frequency?
    }


    // TODO: Build Routine add to String

    

    public static void main(String[] args) {    // Implement Generalized routine 



    }
}