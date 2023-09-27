package src.test;

import org.junit.Before;
import org.junit.Test;
import src.main.Calcolatrice;

import static junit.framework.TestCase.assertTrue;

public class CalcTest {
    Calcolatrice calcolatrice;

    @Before
    public final void setUp(){
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void TestSomma(){
        assertTrue("somma esatta", calcolatrice.somma(1,1)==2);
    }

    @Test
    public void TestMolt(){
        assertTrue("moltiplicazione esatta",calcolatrice.moltiplicazione(2,2)==4);
    }

    @Test
    public void TestDiv(){
        assertTrue("divisione esatta", calcolatrice.divisione(10,2)==5);
    }

    @Test
    public void TestSott(){
        assertTrue("sottrazione esatta", calcolatrice.sottrazione(10,2)==8);
    }

}
