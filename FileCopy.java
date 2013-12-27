/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author swetha kantheti
 */
 

public class FileCopy {
    static void copyFileUsingFileStreams(File source, File dest)
 
        throws IOException {
 
    InputStream input = null;
 
    OutputStream output = null;
 
    try {
 
        input = new FileInputStream(source);
 
        output = new FileOutputStream(dest);
 
        byte[] buf = new byte[1024];
 
        int bytesRead;
 
        while ((bytesRead = input.read(buf)) > 0) {
 
            output.write(buf, 0, bytesRead);
 
        } 
    }
    finally {
        input.close();
        output.close();
        }}
    public static void main(String src,String video,String description,String tags) throws IOException, ClassNotFoundException, SQLException{
        System.out.println("SRC--"+src+"___Dest---"+video);
                
            File source = new File(src);
            File desc = new File("D:/pcs/"+video+".mp4");
             copyFileUsingFileStreams(source,desc);
             Connection con=DatabaseConnection.dbConnection();
             PreparedStatement ps=con.prepareStatement("Insert into videos values(?,?,?)");
              ps.setString(1,video);
              ps.setString(2,description);
              ps.setString(3,tags);
              ps.execute();
    }
}
