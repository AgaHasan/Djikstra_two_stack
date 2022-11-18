package ba.unsa.etf.rpr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit testovi za nasu aplikaciju.
 */
public class ExpressionEvaluatorTest
{
    /**
     * Prvi unit test je primjer iz zadatka // ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
     */
    @Test
    public void primjerIzZadatka() {
        Double x = ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
        assertEquals((Double)101.,(Double)x);
    }

    /**
     * Test za Drugi primjer iz zadatka // ( 1 + ( 5 * 20 ) )
     */
    @Test
    public void primjerIzZadatka2() {
        Double x = ExpressionEvaluator.evaluate("( 1 + ( 5 * 20 ) )");
        assertEquals((Double)101.,(Double)x);
    }

    /**
     * Test sa sqrt
     */
    @Test
    public void korjenovanje() {
        Double x = ExpressionEvaluator.evaluate("( sqrt ( 5 * 20 ) )");
        assertEquals((Double)10.,(Double)x);
    }

    /**
     * Test sa dijeljenjem
     */
    @Test
    public void dijeljenje() {
        Double x = ExpressionEvaluator.evaluate("( 1 + ( 5 / 5 ) )");
        assertEquals((Double)2.,(Double)x);
    }

    /**
     * Test sa negativnim rezultatom
     */
    @Test
    public void negativni() {
        Double x = ExpressionEvaluator.evaluate("( 1 - ( 5 * 20 ) )");
        assertEquals((Double)(-99.),(Double)x);
    }
}
