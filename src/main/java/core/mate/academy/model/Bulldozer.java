package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeSize;

    public Bulldozer() {
    }

    public Bulldozer(String bladeSize) {
        this.bladeSize = bladeSize;
    }

    public String getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(String bladeSize) {
        this.bladeSize = bladeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
