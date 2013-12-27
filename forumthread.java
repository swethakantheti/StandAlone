/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author swetha kantheti
 */
public class forumthread extends Thread{
      String str;String s="";public static String uname="";//forumthrd a=new forumthrd();
        forumthread(String username){uname=username;}
  
    
      @Override
       public void run(){
           while(true){
                boolean connectivity;
                try {
                    URL url1 = new URL("http://www.google.com/");
                    URLConnection con = url1.openConnection();
                    con.connect();
                    connectivity = true;
                } catch (IOException e) {
                    connectivity = false;
                }
                System.out.println("->Forum_Thread");
                 if(connectivity){String ques = null,VName=null,Date;
                     int i=0;
                     try{
                        FileInputStream f=new FileInputStream("D:\\pcs\\txtfiles\\offlinemessages.txt");
                        DataInputStream d=new DataInputStream(f);
                         
                   
                            while(d.available()!=0)
                            {       i++;
                                    
                                    if(i==1){
                                       VName=d.readLine();
                                 //        System.out.println("VName->"+VName);
                                    }
                                   if(i==2){
                                        ques=d.readLine();
                                  //       System.out.println("Ques->"+ques);
                                 //        inputforumdetails.main(VName,ques,uname);
                                       //   System.out.println("QQQQQ"+ques);
                                         
                                    }
                                   if(i==3){
                                   Date=d.readLine();
                                    System.out.println("VName->"+VName);
                                   System.out.println("Ques->"+ques);
                                    System.out.println("Date->"+Date);
                                    inputforumdetails.main(VName,ques,uname,Date);
                                     i=0;
                                   }
                                    System.out.println("- offlineMsges- - - - ");
                            } 
                            d.close();
                            
                            FileDelete.main("offlinemessages");
                     } catch (FileNotFoundException ex) {      
                        Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
                    }     
                    
                    return;
                 }
                  
                try {
                   forumthread.sleep(10000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
               }
           } 
       }
}
