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

        ///TODO:must support the equal but not the same unit
        Length other = (Length) obj;
        return (this.Value == other.Value) && (this.Unit.equals(other.Unit));
    }

    public Length ConvertTo(LengthUnit toUnit) {
        ///TODO: add convert rate ,add knowledge, encapsulation destroy
        ///TODO: convert function in unit,must be encapsulation
        double value = this.Value * this.Unit.ConvertWith(toUnit);
        Length toLength = new Length(value,toUnit);
        return toLength;
    }
}
