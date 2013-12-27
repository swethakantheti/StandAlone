/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/**
 *
 * @author G0pS
 */
import java.net.URL;
import java.net.URLConnection;
/**
 *
 * @author swetha kanthetiswetha kantheti
 */
public class netconnection {
    boolean  connection(){
    boolean connectivity;
        try {
            URL url = new URL("http://www.google.com/");
            URLConnection conn = url.openConnection();
            conn.connect();
            connectivity = true;
        } catch (Exception e) {
            connectivity = false;
        }
        return connectivity;
    }
}
