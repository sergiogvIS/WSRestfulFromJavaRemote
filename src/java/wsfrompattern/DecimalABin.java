/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsfrompattern;

/**
 *
 * @author entrar
 */
public class DecimalABin {
    private String bin;
    private int num;

    public String DecimalABin(int num) {
        String bin="";
        while(num>0){
            bin=(num%2)+bin;
            num=num/2;
        }
        return bin;
    }

    public String getBin() {
        return bin;
    }

    public int getDec() {
        return num;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public void setDec(int num) {
        this.num = num;
    }
    
}
