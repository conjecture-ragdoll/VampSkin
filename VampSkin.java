import java.lang.String;
import java.util.HashMap;


public class VampSkin extends Dayta {

/*** 

Track period date and skin behaviors throughout the month
while also doing your rituals during the most barrier friendly times

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

    protected static HashMap<String, Integer> treatments = new HashMap<>();     // Treatments and frequency 

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
    // Reset menstralCycle Array when user logs period 
    

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

    public Dayta getDayta(int dayIndex) {
        return this.menstralCycle[dayIndex];
    }

    // log date of period
    public void logPeriodStart() {
        // Date, update local calendar, reset menstralCycle[], track previous cycleLength
    }

    // log end date of period
    public void logPeriodEnd(int dayIndex) { // folicular phase
        // Date
        this.cycleLength = dayIndex;
    }

    public void addTreatmentDay(String treat, int dayIndex) {     // PM treatments for better collagen production
        this.menstralCycle[dayIndex].PM
        .setTreatment(treat);
    }




    // TODO: Build Routine add to String

    

    public static void main(String[] args) {    // Implement Generalized routine 



    }
}