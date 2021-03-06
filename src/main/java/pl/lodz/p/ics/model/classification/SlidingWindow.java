package pl.lodz.p.ics.model.classification;

/**
 * User: maciek
 * Date: 11.01.14
 * Time: 23:00
 */
public class SlidingWindow {

    private int x;
    private int y;

    private int scalingSteps;
    private double scale;

    public SlidingWindow(int x, int y, int scalingSteps, double scale) {
        this.x = x;
        this.y = y;
        this.scalingSteps = scalingSteps;
        this.scale = scale;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScalingSteps() {
        return scalingSteps;
    }

    public void setScalingSteps(int scalingSteps) {
        this.scalingSteps = scalingSteps;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }
}
