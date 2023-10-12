/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author nctuan
 */
class MaHoaMD5  {

    String converHashToString(String inputString) throws NoSuchAlgorithmException{
        MessageDigest md=MessageDigest.getInstance("MD5");
        byte[] hashInBytes= md.digest(inputString.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb= new StringBuilder();
        for (byte b: hashInBytes) {
            sb.append(String.format("%02x", b));
        }
            
        return sb.toString();
    }
    
}
