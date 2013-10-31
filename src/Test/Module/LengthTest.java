package Test.Module;

import Model.Length;
import Model.LengthUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
/**
 * Length Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Oct 30, 2013</pre>
 */
public class LengthTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void should_equal_when_with_same_value() throws Exception {
        Length length1 = new Length(100, new LengthUnit("m",100));
        Length length2 = new Length(100, new LengthUnit("m",100));

        Length length3 = new Length(1, new LengthUnit("cm",1));
        Length length4 = new Length(1, new LengthUnit("cm",1));

        Length length5 = new Length(1, new LengthUnit("mm",0.1));
        Length length6 = new Length(1,new LengthUnit("mm",0.1));


        assertEquals("Exception Raised into should_equal_when_with_same_value()", length1, length2);
        assertEquals("Exception Raised into should_equal_when_with_same_value()", length3, length4);
        assertEquals("Exception Raised into should_equal_when_with_same_value()", length6, length5);
        assertFalse("Exception Raised into should_equal_when_with_same_value()",length1.equals(length5));
    }


    public void should_get_100_rate_from_M_to_CM()throws Exception{
        Length length1 = new Length(100, new LengthUnit("m",100));
        assertEquals("should_get_100_rate_from_M_to_CM",100*100.0,length1.ConvertTo(new LengthUnit("mm",0.1)),0.0);
    }

} 
