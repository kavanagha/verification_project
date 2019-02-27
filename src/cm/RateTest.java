//Ailish Kavanagh, C00206130
package cm;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.math.BigDecimal;

public class RateTest
{
    //TASK 1 TEST CASES
    @Test
    public void testCase1()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);
        
        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase2()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        BigDecimal reducedRate = new BigDecimal("6.0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);
        
        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase3()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        BigDecimal reducedRate = new BigDecimal("0.5");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCaset4()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        BigDecimal reducedRate = new BigDecimal("-1");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase5()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        //BigDecimal reducedRate = new BigDecimal(); //null

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, null, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    /*@Test
    public void testCase6()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        BigDecimal reducedRate = new BigDecimal("abc");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    @Test
    public void testCase7()
    {
        BigDecimal normalRate = new BigDecimal("0");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase8()
    {
        BigDecimal normalRate = new BigDecimal("8.0");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase9()
    {
        BigDecimal normalRate = new BigDecimal("0.5");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase10()
    {
        BigDecimal normalRate = new BigDecimal("-1");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase11()
    {
        //BigDecimal normalRate = new BigDecimal(); //null
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, null, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    /*@Test
    public void testCase12()
    {
        BigDecimal normalRate = new BigDecimal("abc");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    @Test
    public void testCase13()
    {
        BigDecimal normalRate = new BigDecimal("2");
        BigDecimal reducedRate = new BigDecimal("1");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase14()
    {
        BigDecimal normalRate = new BigDecimal("0");
        BigDecimal reducedRate = new BigDecimal("0");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase15()
    {
        BigDecimal normalRate = new BigDecimal("4");
        BigDecimal reducedRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase16()
    {
        BigDecimal reducedRate = new BigDecimal("2");
        BigDecimal normalRate = new BigDecimal("6");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase17()
    {
        //BigDecimal normalRate = new BigDecimal(null);
        //BigDecimal reducedRate = new BigDecimal(null);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, null, null, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase18()
    {
        BigDecimal reducedRate = new BigDecimal("6");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    /*@Test
    public void testCase19()
    {
        BigDecimal reducedRate = new BigDecimal("abc");
        BigDecimal normalRate = new BigDecimal("abc");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    @Test
    public void testCase20()
    {
        BigDecimal reducedRate = new BigDecimal("0");
        //BigDecimal normalRate = new BigDecimal(null);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, null, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase21()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase22()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(5,9);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase23()
    {
        //BigDecimal reducedRate = new BigDecimal(null);
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, null, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase24()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, null, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    /*@Test
    public void testCase25()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(-5,-1);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    /*@Test
    public void testCase26()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period("abc","abc");
        reducedPeriods.add(rp);
        Period rp2 = new Period("abc","abc");
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    @Test
    public void testCase27()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase28()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(11, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase29()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, null);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase30()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, null);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    /*@Test
    public void testCase31()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period("abc","abc");
        normalPeriods.add(np);
        Period np2 = new Period("abc","abc");
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    /*@Test
    public void testCase32()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(-8,-1);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    @Test
    public void testCase33()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase34()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(5,12);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase35()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(4,6);
        normalPeriods.add(np);
        Period np2 = new Period(14,16);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase36()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, null, null);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    @Test
    public void testCase37()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, null, null);
        }     
        catch (IllegalArgumentException e)
        {       }
    }

    /*@Test
    public void testCase38()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(-5,-4);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(-8,-1);
        normalPeriods.add(np);
        Period np2 = new Period(17, 19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    /*@Test
    public void testCase39()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period("abc","abc");
        reducedPeriods.add(rp);
        Period rp2 = new Period("abc","abc");
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period("abc","abc");
        normalPeriods.add(np);
        Period np2 = new Period("abc","abc");
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        try{
        	new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        }     
        catch (IllegalArgumentException e)
        {       }
    }*/

    @Test
    public void testCase40()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17,19);
        normalPeriods.add(np2);
        
        CarParkKind park = CarParkKind.STAFF;

        Rate rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        Period hours = new Period(20,22);
        BigDecimal result = rate.calculate(hours);
        
        BigDecimal expected = new BigDecimal("0");

        assertEquals(result, expected);
    }

    @Test
    public void testCase41()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17,19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        Rate rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        Period hours = new Period(4,6);
        BigDecimal result = rate.calculate(hours);
        
        BigDecimal expected = new BigDecimal("2");

        assertEquals(result, expected);
    }

    @Test
    public void testCase42()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17,19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        Rate rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        Period hours = new Period(10,12);
        BigDecimal result = rate.calculate(hours);
        
        BigDecimal expected = new BigDecimal("8");

        assertEquals(result, expected);
    }

    @Test
    public void testCase43()
    {
        BigDecimal reducedRate = new BigDecimal("1");
        BigDecimal normalRate = new BigDecimal("4");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period rp = new Period(4,6);
        reducedPeriods.add(rp);
        Period rp2 = new Period(14,16);
        reducedPeriods.add(rp2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period np = new Period(8,12);
        normalPeriods.add(np);
        Period np2 = new Period(17,19);
        normalPeriods.add(np2);

        CarParkKind park = CarParkKind.STAFF;

        Rate rate = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        Period hours = new Period(5,15);
        BigDecimal result = rate.calculate(hours);

        BigDecimal expected = new BigDecimal("18");
        
        assertEquals(result,expected);
    }

    
    
}