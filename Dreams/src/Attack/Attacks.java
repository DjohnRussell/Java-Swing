package Attack;

public class Attacks {

    private String name;
    private int damageCaused;
    private int healtItCosted;


    public Attacks(String name, int damageCaused, int healtItCosted) {
        this.name = name;
        this.damageCaused = damageCaused;
        this.healtItCosted = healtItCosted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageCaused() {
        return damageCaused;
    }

    public void setDamageCaused(int damageCaused) {
        this.damageCaused = damageCaused;
    }

    public int getHealtItCosted() {
        return healtItCosted;
    }

    public void setHealtItCosted(int healtItCosted) {
        this.healtItCosted = healtItCosted;
    }
}


