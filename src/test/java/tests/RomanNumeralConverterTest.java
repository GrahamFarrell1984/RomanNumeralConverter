/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.mycompany.romannumeralconverter.RomanNumeralConverter;
import javax.ws.rs.core.Response;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author grahamfarrell
 */
public class RomanNumeralConverterTest {
    
    @Test
    public void testConvertDecimalToRomanMethod() {
        
        RomanNumeralConverter romanNumeralConverterTest = new RomanNumeralConverter();
        
        int decimalNumberValue = 2019;
        Response result = romanNumeralConverterTest.convertDecimalToRoman(decimalNumberValue);
        System.out.println(result.getEntity());
        
        Assert.assertEquals("MMXIX", result.getEntity());
        
        decimalNumberValue = 1984;
        result = romanNumeralConverterTest.convertDecimalToRoman(decimalNumberValue);
        System.out.println(result.getEntity());
        
        Assert.assertEquals("MCMLXXXIV", result.getEntity());
        
        decimalNumberValue = 456;
        result = romanNumeralConverterTest.convertDecimalToRoman(decimalNumberValue);
        System.out.println(result.getEntity());
        
        Assert.assertEquals("CDLVI", result.getEntity());
        
    }
    
    @Test
    public void testConvertRomanToDecimalMethod() {
        
        RomanNumeralConverter romanNumeralConverterTest = new RomanNumeralConverter();
        
        String romanNumeralValue = "MMXIX";
        Response result = romanNumeralConverterTest.convertRomanToDecimal(romanNumeralValue);
        System.out.println(result.getEntity());
        
        Assert.assertEquals(2019, result.getEntity());
        
        romanNumeralValue = "MCMLXXXIV";
        result = romanNumeralConverterTest.convertRomanToDecimal(romanNumeralValue);
        System.out.println(result.getEntity());
        
        Assert.assertEquals(1984, result.getEntity());
        
        romanNumeralValue = "CDLVI";
        result = romanNumeralConverterTest.convertRomanToDecimal(romanNumeralValue);
        System.out.println(result.getEntity());
        
        Assert.assertEquals(456, result.getEntity());
        
    }
    
}
