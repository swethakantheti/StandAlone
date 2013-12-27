/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.File;

/**
 *
 * @author swetha kantheti
 */
public class FileDelete {
    public static void main(String fname){
    File f1 = new File("D:\\pcs\\txtfiles\\"+fname+".txt");
    boolean b = f1.delete();
    if(b){
    System.out.println("File Deleted");
    }else{
        System.out.println("File isn't Deleted");
    }
    }
}
