package Test.Module;

import Model.LengthUnit;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 10/30/13
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class LengthUnitTest {

    @Test
    public void should_get_convert_from_m_to_mm(){
        LengthUnit unitM = new LengthUnit("m",100);
        LengthUnit unitMM = new LengthUnit("mm",0.1);
        Assert.assertTrue(1000 == unitM.ConvertWith(unitMM));
    }
}
