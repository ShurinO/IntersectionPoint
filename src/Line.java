import java.util.Objects;

public class Line {
    private double a;
    private double b;
    private double c;

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(line.a, a) == 0 &&
                Double.compare(line.b, b) == 0 &&
                Double.compare(line.c, c) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Line(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }
}
