/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.FileOutputStream;
import java.io.PrintStream;
import static test.HomeScreen.uname;

/**
 *
 * @author swetha kantheti
 */
public class NewVideoHTML {
     public static void main(String file) {
        // TODO code application logic here
        try{
		    FileOutputStream f=new FileOutputStream("D:/pcs/a.html");

		    PrintStream p=new PrintStream(f);
                    p.println("<!DOCTYPE html><html><body><video width=550 height=280 controls><source src="+file+".mp4 type=video/mp4></video></body></html>");
                    p.close(); 

                     BrowserEmbed.main(uname);
		  }
		  catch(Exception e){}
    }
}
