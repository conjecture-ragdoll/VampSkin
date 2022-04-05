
public class Ritual {

    protected String facewash = "";
    protected String actives = "";
    protected String moisturizer = "";
    protected String treatment = "";

    public Ritual() {    
        this.facewash = this.facewash;
        this.actives = this.actives;
        this.moisturizer = this.moisturizer;
        this.treatment = this.treatment;
    }

    public Ritual(String fw, String acts, String moist) {
        this.facewash = fw;
        this.actives = acts;
        this.moisturizer = moist;
    }

    public Ritual(String fw, String acts, String moist, String treat) {
        this.facewash = fw;
        this.actives = acts;
        this.moisturizer = moist;
        this.treatment = treat;
    }

    public Ritual(String treat) {
        this.treatment = treat;
    }

    public void setFacewash(String fw) {
        this.facewash = fw;
    }

    public String getFacewash() {
        return this.facewash;
    }

    public void setActives(String acts) {
        this.actives = acts;
    }

    public String getActives() {
        return this.actives;
    }

    public void setMoisturizer(String moist) {
        this.moisturizer = moist;
    }

    public String getMoisturizer() {
        return this.moisturizer;
    }

    public void setTreatment(String treat) {
        this.treatment = treat;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public String toString() {     
        return "Facewash: " + this.facewash + "\nActives: " + this.actives + "\nMoisturizer: " + this.moisturizer;
    }
}