
public class Arythmetics {
    protected double first;
    protected double second;

    protected double sum() {
        return first + second;
    }

    protected double sub() {
        return first - second;
    }

    protected double multiply() {
        return first * second;
    }

    protected double divide() {
        return first / second;
    }

    protected double power() { return Math.pow(first, second);}

    protected double square() { return Math.pow(first, 1/second);}

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }
}
