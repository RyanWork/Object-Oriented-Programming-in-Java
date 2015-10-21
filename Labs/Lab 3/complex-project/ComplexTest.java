

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComplexTest.
 *
 * @author  alan
 * @version jan 25th
 */
public class ComplexTest
{

        Complex c1;
        Complex c2;
        Complex c3;
    /**
     * Default constructor for test class ComplexTest
     */
    public ComplexTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        c1 = new Complex(1.0, 3);
        c2 = new Complex(0.5, 0.1);
        c3= new Complex(); 
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        c1= null;
        c2= null;
        c3= null;
    }

    @Test
    public void testPlus1()
    {
               
        c1.plus1(c2, c3);
        boolean goodresult = (c3.getReal()== 1.5 && c3.getImag()== 3.1);
        assert(goodresult);

    }
    
    @Test
    public void testPlus2()
    {
        c1.plus2(c2, c3);
        assert(c3.getReal() == 1.5);
        assert (c3.getImag() == 3.1);
    }
    
    @Test
    public void testPlus3()
    {
        c3 = c1.plus3(c2);
        Complex c4 = new Complex(1.5,3.1);
        assert(c3.isEqual(c4));
    }
}

