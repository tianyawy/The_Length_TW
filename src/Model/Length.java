package Model;

public class Length {

    private final double Value;
    private final LengthUnit Unit;

    public Length(double value, LengthUnit unit) {
        this.Value = value;
        this.Unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Length other = (Length) obj;
        return (this.Value == other.Value) && (this.Unit.equals(other.Unit));
    }

    public Length ConvertTo(LengthUnit toUnit) {
        double value = this.Value * this.Unit.ConvertWith(toUnit);
        Length toLength = new Length(value,toUnit);
        return toLength;
    }
}
