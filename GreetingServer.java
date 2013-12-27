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
// File Name GreetingServer.java
import java.net.*;
import java.io.*;
 

public class GreetingServer extends Thread {

    public static void stream(InputStream in, OutputStream out)
            throws IOException {
        byte[] buf = new byte[1024];
        int bytesRead = 0;

        try {

            while (-1 != (bytesRead = in.read(buf, 0, buf.length))) {
                out.write(buf, 0, bytesRead);
            }

        } catch (IOException e) {
            // log.error("Error with streaming op: " + e.getMessage());
            throw (e);
        } finally {
            try {
                in.close();
                out.flush();
                out.close();
            } catch (Exception e) {
            }//Ignore
        }
    }

    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        //serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                InputStream is = server.getInputStream();
                OutputStream os = new FileOutputStream(new File("1.iso"));
                stream(is, os);

                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
//      int port = Integer.parseInt(args[0]);
        try {
            Thread t = new GreetingServer(4445);
            System.out.println("started");
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
