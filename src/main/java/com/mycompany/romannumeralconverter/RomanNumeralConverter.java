/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.romannumeralconverter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author grahamfarrell
 */
@Path("/romanNumeralConverter")
public class RomanNumeralConverter {
    
    public final int[] DECIMAL_NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    public final String[] ROMAN_NUMERAL_LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    
    @GET
    @Path("/decimalToRoman/{decimalNumberValue}")
    public Response convertDecimalToRoman(@PathParam("decimalNumberValue") int decimalNumberValue) {
        String romanNumeralValue = "";
        for (int i = 0; i < DECIMAL_NUMBER_VALUES.length; i++) {
            while (decimalNumberValue >= DECIMAL_NUMBER_VALUES[i]) {
                romanNumeralValue = romanNumeralValue + ROMAN_NUMERAL_LETTERS[i];
                decimalNumberValue = decimalNumberValue - DECIMAL_NUMBER_VALUES[i];
            }
        }
        return Response.status(200).entity(romanNumeralValue).build();
    }

}