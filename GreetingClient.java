/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author swetha kantheti
 */
import java.net.*;
import java.io.*;
 

public class GreetingClient
{
    public static void stream(InputStream in, OutputStream out)
        throws IOException {
    byte[] buf = new byte[1024];
    int bytesRead = 0;

    try {

        while (-1 != (bytesRead = in.read(buf, 0, buf.length))) {
            out.write(buf, 0, bytesRead);
        }

    } catch (IOException e) {
//        log.error("Error with streaming op: " + e.getMessage());
        throw (e);
    } finally {
                    try{
           in.close();
           out.flush();
           out.close();
                    } catch (Exception e){}//Ignore
    }
}
   public static void main(String FileToUpload)
   {
      String serverName = "172.16.6.117";        //Ip address of the server
      int port = Integer.parseInt("4445");
      try
      {
//        // System.out.println("Connecting to " + serverName + " on port " + port);
//     //    Socket client = new Socket(serverName, port);
//         
//         OutputStream os = client.getOutputStream();
//         InputStream is = new FileInputStream(new File(FileToUpload));
//          stream(is, os);
//          
//         client.close();
         
         
            System.out.println("Connecting to " + serverName + " on port " + port);
         Socket client = new Socket(serverName, port);
         File f = new File(FileToUpload);
         
         OutputStream os = client.getOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(os);
          System.out.println("filename :- "+f.getName());
         oos.writeObject(new String(f.getName()));
         InputStream is = new FileInputStream(f);
          stream(is, os);
          
         client.close();
         
         
         
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}