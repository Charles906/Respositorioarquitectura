/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
/**
 *
 * @author Charles
 */
@Stateless
@Path("/calculator")
public class Calculadora {
    
    
    @GET
    @Path("/add")
    public String suma(@QueryParam("num1") long num1, @QueryParam("num2") long num2) {

        return Long.toString($suma(num1,num2));
    }

    long $suma(long num1, long num2) {

            return num1 + num2;

    }
    
    @GET
    @Path("/subs")
    public String resta(@QueryParam("num1") long num1, @QueryParam("num2") long num2) {

        return Long.toString($resta(num1,num2));
    }

    long $resta(long num1, long num2) {

            return num1 - num2;

    }
    
    @GET
    @Path("/mult")
    public String multiplica(@QueryParam("num1") long num1, @QueryParam("num2") long num2) {

        return Long.toString($multiplica(num1,num2));
    }

    long $multiplica(long num1, long num2) {

            return num1 * num2;

    }
    
    @GET
    @Path("/div")
    public String divide(@QueryParam("num1") long num1, @QueryParam("num2") long num2) {

        return Long.toString($divide(num1,num2));
    }

    long $divide(long num1, long num2) {

            return num1 / num2;

    }
     
}
