/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author swetha kantheti
 */
public class inputratingdetails {
    public static void main(String VName,String rating1,String uname1){   
  
	 try {
               
             
//             String url = "http://example.com";
//String charset = "UTF-8";
//String param1 = "value1";
//String param2 = "value2";
//// ...
//String query = String.format("param1=%s&param2=%s", 
//     URLEncoder.encode(param1, charset), 
//     URLEncoder.encode(param2, charset));
           //  System.out.println("--------inputservlet---");
	//	 String url1 ="http://192.168.6.162:8084/app2servlet/inputcomment";
                 String url1 ="http://172.16.6.117:8084/app2servlet/inputRating";
		 String charset = "UTF-8";
		 String videoid = VName;
                 String rating = rating1;
                 String uname=uname1;
                  
		 String query = String.format("videoid=%s&rating=%s&uname=%s",
                         URLEncoder.encode(videoid,charset),
                         URLEncoder.encode(rating,charset),
                         URLEncoder.encode(uname,charset));
//		 URL url = new URL("http://172.16.5.133:8084/app2servlet/inputservlet?videoid="+VName+"&emp_id="+emp_id+"&message="+message);
           //      URL url = new URL("http://192.168.6.162:8084/app2servlet/inputservlet?videoid="+VName+"&Ques="+Ques);
                 URL url = new URL(url1+"?"+query);
                
                 HttpURLConnection con =(HttpURLConnection) url.openConnection();
		 con.setRequestProperty("Accept-Charset", charset);
                System.out.println("1---1--Rating--1-----1");
		 con.setDoInput(true);
		 con.setDoOutput(true);
//		 con.setUseCaches(false);
		 con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//
//		 DataOutputStream printout = new DataOutputStream(con.getOutputStream());
//
//		 // This is the POST 
//		 String content ="email=jad939933@hotmail.com&pass=577383";
//
//
//		 printout.writeBytes(content);
//		 printout.flush();
//		 printout.close();
             try (DataInputStream input = new DataInputStream(con.getInputStream())) {
                 String str;
                 //Read the response
                 while (null != ((str = input.readLine()))) {
                 System.out.println("->---"+str);
                 }
             }


		 } catch (MalformedURLException ex) {
		 } catch (IOException ex) {
			 System.out.println("Exception---"+ex);
		 }
  }
}
