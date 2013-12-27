/*
 * To change this template, choose Tools | Templates
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
public class forum2input {
     public static void main(String emp_id1,String Qid1,String Ans){
       
  
	 try {
		 String url1 ="http://172.16.5.133:8084/app2servlet/inputservletAns";
 		 String charset = "UTF-8";
		 String Qid=Qid1;
                 String emp_id=emp_id1;
                 String ans=Ans;
                 String query = String.format("Qid=%s&emp_id=%s&ans=%s",
                          URLEncoder.encode(Qid,charset),
                          URLEncoder.encode(emp_id,charset),
                          URLEncoder.encode(ans,charset));
                 URL url = new URL(url1+"?"+query);
	//	 URL url = new URL("http://172.16.5.133:8084/app2servlet/inputservletAns?Qid="+Qid1+"&emp_id="+emp_id1+"&ans="+Ans);
		 HttpURLConnection con =(HttpURLConnection) url.openConnection();
		 con.setRequestProperty("Accept-Charset", charset);

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
                     System.out.println(ex);
			 System.out.println("------Internet may not be available----");
		 }
  }
}
