import inBackpack.abstracts.Circle;
import inBackpack.abstracts.Cylinder;
import inBackpack.abstracts.Flat;

import java.util.ArrayList;

public class Backpack {
    private Flat flat;
    private Cylinder cylinder;
    private ArrayList<Circle> circles = new ArrayList<Circle>();

    public void addCircles(Circle circle, int amount) {
        for (int i = 0; i < amount; i++) {
            circles.add(circle);
        }
    }

    public Backpack() {
    }

    public Backpack(Flat flat, Cylinder cylinder, Circle circle, int amountCircles) {
        this.flat = flat;
        this.cylinder = cylinder;
        addCircles(circle, amountCircles);
    }

    public Backpack(Flat flat, Cylinder cylinder, ArrayList<Circle> circles) {
        this.flat = flat;
        this.cylinder = cylinder;
        this.circles = circles;
    }

    public Flat getFlat() {
        return flat;
    }

    public Cylinder getCylinder() {
        return cylinder;
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "flat=" + flat +
                ", cylinder=" + cylinder +
                ", circles=" + circles +
                '}';
    }
}
