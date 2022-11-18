package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testiramo App klasu
 */
public class AppTest 
{
    /**
     * Provjera validacije ulaza, primjer iz zadatka // ( 1 + ( 5* 20))
     */
    @Test
    public void primjerIzZadatka()
    {
        assertEquals("Ilegalan izraz", App.main(new String[]{"( 1 + ( 5* 20))"}));
    }

    /**
     * Provjera validacije ulaza, primjer bez operanada // ( + ( * ) )
     */
    @Test
    public void primjer2()
    {
        assertEquals("Ilegalan izraz", App.main(new String[]{"( + ( * ) )"}));
    }

    /**
     * Provjera validacije ulaza, primjer gdje nisu sve otvorene zagrade zatvorene // ( 1 + ( 1 + 1 )
     */
    @Test
    public void primjer3()
    {
        assertEquals("Ilegalan izraz", App.main(new String[]{"( 1 + ( 1 + 1 )"}));
    }

    /**
     * Provjera validacije ulaza, primjer gdje fali prva zagrada //  1 + ( 1 + 1 ) )
     */
    @Test
    public void primjer4()
    {
        assertEquals("Ilegalan izraz", App.main(new String[]{" 1 + ( 1 + 1 ) )"}));
    }


    /**
     * Provjera validacije ulaza, primjer gdje fali operator //  ( 1 ( 1 + 1 ) )
     */
    @Test
    public void primjer5()
    {
        assertEquals("Ilegalan izraz", App.main(new String[]{"( 1 ( 1 + 1 ) )"}));
    }

    /**
     * Provjera validacije ulaza, primjer gdje imamo karakter koji nije medju zadatim //  ( 1 ! ( 1 + 1 ) )
     */
    @Test
    public void primjer6()
    {
        assertEquals("Ilegalan izraz", App.main(new String[]{"( 1 ! ( 1 + 1 ) )"}));
    }

    /**
     * I konacno, za kraj, jedan integracijski test da osiguramo da je sef sretan buduci da ce nam osigurati 100% pokrivenost koda >.<
     */
    @Test
    public void integration()
    {
        assertEquals("101.0", App.main(new String[]{"( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"}));
    }

}
