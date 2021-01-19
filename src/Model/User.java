/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author E5470
 */
public class User {
    private String username;
    private String password;
    private boolean isLoggedIn;
    private BigInteger p;
    private BigInteger g;
    private BigInteger secret;
//    private BigInteger genKey;
    HashMap<String, BigInteger> genKey = new HashMap<>();
    HashMap<String, Integer> check = new HashMap<>();
    public User() {
        Random rd = new Random();
//        this.genKey = new BigInteger("-1",10);
        int i = rd.nextInt();
        this.setSecret(new BigInteger(i+"",10));
    }
    
    public User(String na, String pa, boolean ol) {
        this.username = na;
        this.password = pa;
        this.isLoggedIn = ol;
        
        Random rd = new Random();
//        this.genKey = new BigInteger("-1",10);
        int i = rd.nextInt();
        this.setSecret(new BigInteger(i+"",10));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public BigInteger getP() {
        return p;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public BigInteger getG() {
        return g;
    }

    public void setG(BigInteger g) {
        this.g = g;
    }

    public BigInteger getSecret() {
        return secret;
    }

    public void setSecret(BigInteger secret) {
        this.secret = secret;
    }

    public HashMap<String, BigInteger> getGenKey() {
        return genKey;
    }

    public HashMap<String, Integer> getCheck() {
        return check;
    }
    
}
