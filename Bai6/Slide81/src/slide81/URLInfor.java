package slide81;

import java.net.URL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nctuan
 */
public class URLInfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            URL url= new URL("http://abc.com:80/xyz/page.jsp?x=5&y=7#xxx");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Post: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());
            System.out.println("Query: "+url.getQuery());
            System.out.println("Ref: "+url.getRef());
        } catch (Exception e) {
        }
    }
    
}
