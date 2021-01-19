/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AES;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author E5470
 */
public class DiffieHellman {
    
    public BigInteger SinhSNT(){
        BigInteger a = new BigInteger(128, 50, new Random());
        return a;
    }
    
    public BigInteger mixKey(BigInteger key, BigInteger g, BigInteger p){
        return g.modPow(key, p);
    }
    
    public BigInteger genKey(BigInteger mKey, BigInteger key, BigInteger p){
        return mKey.modPow(key, p);
    }
    
    
//    public static void main(String[] args) {
//        BigInteger g = new BigInteger(64, 50, new Random());
//        System.out.println(g);
//        BigInteger p = new BigInteger(128, 50, new Random());
//        System.out.println(p);
//        BigInteger a = new BigInteger("12",10);
//        BigInteger b = new BigInteger("6",10);
//        BigInteger KA = g.modPow(a, p);
//        BigInteger KB = g.modPow(b, p);
//        BigInteger K1 = KB.modPow(a, p);
//        BigInteger K2 = KA.modPow(b, p);
//        System.out.println(K1.subtract(K2));
//        BigInteger a = new BigInteger("124");
//        System.out.println(a);
//    }
}
