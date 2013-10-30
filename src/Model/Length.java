package Model;

public class Length {

    private final double Value;

    public Length(double value) {
        this.Value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Length other = (Length) obj;
        return this.Value == other.Value;
    }
}
