/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsfrompattern;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author entrar
 */
@Stateless
@Path("generic")
public class GenericResource {
    static DecimalABin conv;
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String conversor(@QueryParam("num") int num){
        DecimalABin conv = new DecimalABin();
        return conv.DecimalABin(num);
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String conversorJSON(@QueryParam("num") int num){
        DecimalABin conv = new DecimalABin();
        return conv.DecimalABin(num);
    }
    
    public String DecimalABin(int num) {
        String bin="";
        while(num>0){
            bin=(num%2)+bin;
            num=num/2;
        }
        return bin;
    }
}
