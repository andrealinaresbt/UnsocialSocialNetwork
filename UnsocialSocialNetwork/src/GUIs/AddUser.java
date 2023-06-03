/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import EDD.List;
import Grafo.Graph;
import ImportantClasses.Helpers;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class AddUser extends javax.swing.JFrame {
    static Graph graph;
    static int userID;
    static String userNickname;
    static List relations;

    /**
     * Creates new form AddUser
     */
    public AddUser(Graph graph) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.graph = graph;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showUsers = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        userIDInput = new javax.swing.JTextField();
        checkID = new javax.swing.JButton();
        inputRelation = new javax.swing.JTextField();
        addRelation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userNicknameInput1 = new javax.swing.JTextField();
        checkUser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("ADD A FRIEND!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        showUsers.setBackground(java.awt.SystemColor.activeCaptionBorder);
        showUsers.setColumns(20);
        showUsers.setForeground(new java.awt.Color(0, 0, 0));
        showUsers.setRows(5);
        showUsers.setText("//Set text existent users\n");
        jScrollPane1.setViewportView(showUsers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("To add an user you need to fill the folllowing:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        userIDInput.setBackground(java.awt.SystemColor.activeCaptionBorder);
        userIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDInputActionPerformed(evt);
            }
        });
        jPanel1.add(userIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 150, -1));

        checkID.setBackground(new java.awt.Color(0, 0, 255));
        checkID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkID.setForeground(new java.awt.Color(255, 255, 255));
        checkID.setText("Check");
        checkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIDActionPerformed(evt);
            }
        });
        jPanel1.add(checkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 80, -1));

        inputRelation.setBackground(java.awt.SystemColor.activeCaptionBorder);
        inputRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRelationActionPerformed(evt);
            }
        });
        jPanel1.add(inputRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, -1));

        addRelation.setBackground(new java.awt.Color(0, 0, 255));
        addRelation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addRelation.setForeground(new java.awt.Color(255, 255, 255));
        addRelation.setText("Add ");
        addRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationActionPerformed(evt);
            }
        });
        jPanel1.add(addRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Press to submit info");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Please enter your user ID (in numbers)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("NOTE: You need to type the user's ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("ID whom you want to relate to.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, 20));

        exit.setBackground(new java.awt.Color(0, 0, 204));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/200x200.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Please enter your username putting \"@\" before the user");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 330, -1));

        userNicknameInput1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        userNicknameInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNicknameInput1ActionPerformed(evt);
            }
        });
        jPanel1.add(userNicknameInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 150, -1));

        checkUser.setBackground(new java.awt.Color(0, 0, 255));
        checkUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkUser.setForeground(new java.awt.Color(255, 255, 255));
        checkUser.setText("Check");
        checkUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUserActionPerformed(evt);
            }
        });
        jPanel1.add(checkUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 80, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FINALIZE PROCCESS!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Please enter one or more relations separating them by \",\"");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 340, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDInputActionPerformed

    private void checkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIDActionPerformed
        try{
        int number = Helpers.valorNumero(userIDInput.getText());
            if (number!=-1) { 
          number = Helpers.validID(graph, number); //Checks if the number is not on the existents users
        //CHECK IF IT EXISTS
            if (number !=-1) {
                  JOptionPane.showMessageDialog(this, "This is an available ID!");
            userID=number; 
                
   
        
        }else{
            JOptionPane.showMessageDialog(this, "Not an available ID");
            userIDInput.setText("");
            }
            
            }}catch(Exception e) {
        JOptionPane.showMessageDialog(this, "This is not a valid ID" + e);
        userIDInput.setText("");}
       
    }//GEN-LAST:event_checkIDActionPerformed

    private void inputRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRelationActionPerformed
   
    }//GEN-LAST:event_inputRelationActionPerformed

    private void userNicknameInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNicknameInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNicknameInput1ActionPerformed

    private void checkUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUserActionPerformed

       String username = Helpers.nickname(userNicknameInput1.getText());
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "This is not a valid username");
           
        }
        else if (username.equalsIgnoreCase("no")) {
            userNicknameInput1.setText("");
            
        }else{
            username=Helpers.validNickname(graph, username);
            if (username!=null) {
                userNickname = username;
                JOptionPane.showMessageDialog(this, "This nickname is available!");
                
            }else{
            JOptionPane.showMessageDialog(this, "This is not an available username.");}
        }
        
    }//GEN-LAST:event_checkUserActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //HERE you need to create the user, relation and add it to the graph!
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationActionPerformed
            try{
                String text= inputRelation.getText();
                String[] numbers =text.split(",");
                List list=null;
                for (int i = 0; i < numbers.length; i++) {
                    int number = Integer.parseInt(numbers[i]);
                    number =Helpers.validID(graph, number);
                    if (number != -1) {
                        list.addFirst(Integer.parseInt(numbers[i]));
                        
                    }else{
                     JOptionPane.showMessageDialog(this, "This is not an existing ID");
                    break;}

                
                    
                    
                }
        
        
        //CHECK IF IT EXISTS
            
        
        }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR!" +e);
        inputRelation.setText("");}
       
                                           

    }//GEN-LAST:event_addRelationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser(graph).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRelation;
    private javax.swing.JButton checkID;
    private javax.swing.JButton checkUser;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputRelation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea showUsers;
    private javax.swing.JTextField userIDInput;
    private javax.swing.JTextField userNicknameInput1;
    // End of variables declaration//GEN-END:variables
}
