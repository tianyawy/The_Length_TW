package Test.Module;

import Model.Length;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
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
        Length length1 = new Length(100);
        Length length2 = new Length(100);

        assertEquals("Exception Raised into should_equal_when_with_same_value()", length1, length2);
    }


} 
