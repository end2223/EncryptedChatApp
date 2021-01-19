/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AES;

/**
 *
 * @author E5470
 */
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public MD5() {
    }

    public String md5(String str) {
        String result = "";
        MessageDigest digest;
        try {
            //chuyen vao kieu ma hoa: MD5, SHA2561, SHA1
            digest = MessageDigest.getInstance("MD5");
            //thuc hien bien doi
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest.digest());
//            giúp đồng bộ chuỗ i mã hóa md5 trong  mysql
            System.out.println(bigInteger);
//            chuyen ve he 16
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args) {
        MD5 t = new MD5();
        System.out.println(t.md5("lalarrrrr3333232r23r32r3rrl"));
    }
}
