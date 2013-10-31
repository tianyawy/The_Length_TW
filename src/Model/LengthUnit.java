package Model;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/30/13
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class LengthUnit {

    private final String _UnitName;
    private final double _ConverRate;

    public LengthUnit(String unitname, double convertRate) {

        this._UnitName = unitname;
        this._ConverRate = convertRate;
            //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object obj) {
        LengthUnit other = (LengthUnit)obj;
        return other._UnitName.equals(this._UnitName) && other._ConverRate == this._ConverRate;
    }

    public double ConvertWith(LengthUnit targetUnit) {
        return this._ConverRate/targetUnit._ConverRate;
    }
}
