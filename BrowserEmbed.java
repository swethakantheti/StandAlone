
package test;

/**
 *
 * @author swetha kantheti
 */
  
 
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel; 
import javafx.scene.Scene;
import javafx.scene.web.WebEngine; 
import javafx.scene.web.WebView;
import javax.swing.*; 
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.concurrent.Worker.State.FAILED;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ButtonGroup; 
 

public class BrowserEmbed extends JFrame {
static BrowserEmbed browser = new BrowserEmbed();
    private JFXPanel jPanel1;
    private WebEngine engine;
    private JPanel panel;
    private final  JTextField txtURL = new JTextField();
  //  private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
  //  private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
   // private javax.swing.JLabel jLabel7;
 //   private javax.swing.JList jList1;
 //   private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
 //   private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
  //  private javax.swing.JTextField jTextField3;
  public static String uname="";
    public BrowserEmbed() {
        super();
        initComponents();
        groupButton();
    }

    private void initComponents() {
    //    jfxPanel = new JFXPanel();
         jPanel1 = new JFXPanel();
        createScene();
    //     jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
//        jLabel3 = new javax.swing.JLabel();
  //      jTextField1 = new javax.swing.JTextField();
//        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
      //  jLabel7 = new javax.swing.JLabel();
//        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
     //   jList1 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1390, 768));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 210, 570, 310);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));  
        jLabel2.setText("Rating");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 540, 70, 30);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Best");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(20, 570, 70, 23);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jRadioButton1ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BrowserEmbed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jRadioButton2.setText("Good");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(110, 570, 80, 23);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jRadioButton2ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BrowserEmbed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jRadioButton3.setText("Average");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(200, 570, 100, 23);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jRadioButton3ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BrowserEmbed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
        jRadioButton4.setText("Below average");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(320, 570, 140, 23);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jRadioButton4ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BrowserEmbed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
      //  jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
     //   jLabel3.setText("search a video ");
//        getContentPane().add(jLabel3);
  //      jLabel3.setBounds(590, 230, 110, 20);
 //       getContentPane().add(jTextField1);
 //       jTextField1.setBounds(730, 220, 190, 40);

//        jButton1.setText("OK");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
     //   getContentPane().add(jButton1);
     ///   jButton1.setBounds(730, 280, 47, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Post your question ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 370, 130, 14);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(720, 360, 200, 40);

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BrowserEmbed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(720, 420, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Comments ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 480, 90, 15);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(710, 470, 300, 96);

        jButton3.setText("Submit  ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(BrowserEmbed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 610, 110, 23);

        jLabel6.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        jLabel6.setText("Predictable Convergant Solutions");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 130, 580, 70);

//        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
//        jLabel7.setText("Video name");
//        getContentPane().add(jLabel7);
//        jLabel7.setBounds(970, 360, 80, 30);

//        jTextField3.setText(" ");
  //      getContentPane().add(jTextField3);
   //     jTextField3.setBounds(1080, 350, 190, 40);

//        jList1.setModel(new javax.swing.AbstractListModel() {
//            String[] strings = { "Search Results" };
//            @Override
//            public int getSize() { return strings.length; }
//            @Override
//            public Object getElementAt(int i) { return strings[i]; }
//        });
  //      jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(970, 220, 190, 40);

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1160, 100, 110, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 750);

        pack();
    }
    private void groupButton(){
         ButtonGroup bg1=new ButtonGroup();
         bg1.add(jRadioButton1);
         bg1.add(jRadioButton2);
         bg1.add(jRadioButton3);
         bg1.add(jRadioButton4);
     }
    void rating(int rating) throws IOException{
    String VName=VideoNameFromHtml.main();
                    System.out.println("VideoName="+VName);
         
         try{
             try (FileWriter fw = new FileWriter("D:\\pcs\\txtfiles\\offlineRating.txt",true)) {
                 fw.write(VName+"\n");
                 fw.write(rating+"\n");
                // fw.write(DateTime.main()+"\n");
             }
		  } catch (IOException ex) {
            Logger.getLogger(Staticforum.class.getName()).log(Level.SEVERE, null, ex);
        }
      RatingThread r=new RatingThread(uname);
      r.start();
      this.setVisible(false);
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                              
        // TODO add your handling code here:
       // this.setVisible(false);
       // RadioDisplay.main(jRadioButton1.getText());
        System.out.println("Rating-5");
        rating(5);
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                              
        // TODO add your handling code here:
      //  this.setVisible(false);
      //  RadioDisplay.main(jRadioButton2.getText());
        System.out.println("Rating-4");
        rating(4);
    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                              
        // TODO add your handling code here:
     //   this.setVisible(false);
     //   RadioDisplay.main(jRadioButton3.getText());
        System.out.println("Rating-3");
        rating(3);
    } 
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                              
        // TODO add your handling code here:
     //   this.setVisible(false);
     //   RadioDisplay.main(jRadioButton3.getText());
        System.out.println("Rating-2");
        rating(2);
    } 
    private void createScene() {
       Platform.runLater(new Runnable() {
             @Override
            public void run() {
                WebView view = new WebView();
                engine = view.getEngine();
                engine.getLoadWorker()
                        .exceptionProperty()
                        .addListener(new ChangeListener<Throwable>() {
                            @Override
                            public void changed(ObservableValue<? extends Throwable> o, Throwable old, final Throwable value) {
                                if (engine.getLoadWorker().getState() == FAILED) {
                                    SwingUtilities.invokeLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            JOptionPane.showMessageDialog(
                                            panel,
                                            (value != null)
                                            ? engine.getLocation() + "\n" + value.getMessage()
                                            : engine.getLocation() + "\nUnexpected error.",
                                            "Loading error...",
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                    });
                                }
                            }
                        });
             //  jfxPanel.setScene(new Scene(view));
               jPanel1.setScene(new Scene(view));
            }
        });
    }
     public void loadURL(final String url) {
        Platform.runLater(new Runnable() {
             @Override
            public void run() {
                String tmp = toURL(url);

                if (tmp == null) {
                    tmp = toURL("http://" + url);
                }
              engine.load(tmp);
            }
        });
    }

    private static String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        //------------------------------------
//        checkconnection();
         String comment=jTextArea1.getText();
        String VName=VideoNameFromHtml.main();
                    System.out.println("VideoName="+VName);
         try{
             try (FileWriter fw = new FileWriter("D:\\pcs\\txtfiles\\offlinecomments.txt",true)) {
                 fw.write(VName+"\n");
                 fw.write(comment+"\n");
                 fw.write(DateTime.main()+"\n");
             }
		  } catch (IOException ex) {
            Logger.getLogger(Staticforum.class.getName()).log(Level.SEVERE, null, ex);
        }
	commentthread c=new commentthread(uname);
        c.start();
        this.setVisible(false);
     }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        // TODO add your handling code here:
        //------------------------------------
//        checkconnection();
         String ques=jTextField2.getText();
         String VName=VideoNameFromHtml.main();
                    System.out.println("VideoName="+VName);
         
         try{
             try (FileWriter fw = new FileWriter("D:\\pcs\\txtfiles\\offlinemessages.txt",true)) {
                 fw.write(VName+"\n");
                 fw.write(ques+"\n");
                 fw.write(DateTime.main()+"\n");
             }
		  } catch (IOException ex) {
            Logger.getLogger(Staticforum.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        forumthread f=new forumthread(uname);
        f.start();
        this.setVisible(false);
        //------------------------------------
    }                                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
////        checkconnection();
//         
////        String key=jTextField1.getText();
//        String s1,s2,s3;
//        ArrayList values= new ArrayList();
//         int i=0;
//        System.out.println("name"+key);
//        try{
//        Connection con=DatabaseConnection.dbConnection();
//        PreparedStatement pst1=con.prepareStatement("Select * from videos");
//        
//         ResultSet rss=pst1.executeQuery();
//                while(rss.next()){
//                     s1=rss.getString(1);
//                    s2=rss.getString(2);s3=rss.getString(3);
//                     System.out.println("S1--"+s1+"S2--"+s2+"S3--"+s3);
//                    if(s1.contains(key)||s2.contains(key)||s3.contains(key)){
//                        s1=s1.trim();
//                        values.add(i, s1);
//                        i++;
//                        System.out.println("SS!"+s1);
//                      }
//                 }
//         }
//          catch(ClassNotFoundException | SQLException e){}
//     //   jList1.setListData(values.toArray());
//       //          jList1.addListSelectionListener(new ListSelectionListener()
////               {                    
////                   @Override
////                   public void valueChanged(ListSelectionEvent lse) {
////                       String VName=jList1.getSelectedValue().toString();
////                      NewVideoHTML.main(VName);
////                    }
////              });
//    }
 private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      System.out.println("---JB4-------------");
      this.setVisible(false);
      this.loadURL("file:///D:/pcs/a.html");
        Home.main(uname);
    }
    public static void main(String username) {
            uname=username;
        SwingUtilities.invokeLater(new Runnable() {
         
            @Override
            public void run() {
                
                browser.setVisible(true);
                browser.loadURL("file:///D:/pcs/a.html");
            }
        });
    }
}