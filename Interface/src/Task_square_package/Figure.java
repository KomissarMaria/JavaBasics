package Task_square_package;

public class Figure {
    protected double square = 0;
    protected String name;

    public double findsquare() {
        return square;
    }

    public void print() {
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return name + " S = " + square;
    }
}
