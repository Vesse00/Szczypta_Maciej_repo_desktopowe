/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.maciej.szczypta.rejestracjailogowanie;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gromm
 */
public class LOGOWANIE extends javax.swing.JFrame {

    /**
     * Creates new form LOGOWANIE
     */
    public LOGOWANIE() {
        initComponents();
        
    }
    
    public static String user;
    public static String pass;
    public static String mail;
    public static String err = "";
    public static String blad = "";
    public static String zlymail = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelReg = new javax.swing.JPanel();
        jLabelReg = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelPass = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jLabelComfirm = new javax.swing.JLabel();
        jPasswordFieldCPass = new javax.swing.JPasswordField();
        jButtonReg = new javax.swing.JButton();
        jLabelWrongUser = new javax.swing.JLabel();
        jLabelPassErr = new javax.swing.JLabel();
        jLabelEmailErr = new javax.swing.JLabel();
        jPanelLog = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelReg.setText("Register");
        jLabelReg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUsername.setText("Username:");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmail.setText("Email");

        jLabelPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPass.setText("Password");

        jLabelComfirm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelComfirm.setText("Comfirm Password");

        jButtonReg.setText("Rejestracja");
        jButtonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegLayout = new javax.swing.GroupLayout(jPanelReg);
        jPanelReg.setLayout(jPanelRegLayout);
        jPanelRegLayout.setHorizontalGroup(
            jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegLayout.createSequentialGroup()
                        .addComponent(jButtonReg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRegLayout.createSequentialGroup()
                        .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordFieldCPass, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPass)
                            .addComponent(jLabelReg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelComfirm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWrongUser, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addGroup(jPanelRegLayout.createSequentialGroup()
                                .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelPassErr, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(jLabelEmailErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelRegLayout.setVerticalGroup(
            jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReg)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWrongUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmailErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelComfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldCPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButtonReg)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("REJESTRACJA", jPanelReg);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Logowanie");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setText("Zaloguj");

        javax.swing.GroupLayout jPanelLogLayout = new javax.swing.GroupLayout(jPanelLog);
        jPanelLog.setLayout(jPanelLogLayout);
        jPanelLogLayout.setHorizontalGroup(
            jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1)
                        .addComponent(jLabel3)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanelLogLayout.setVerticalGroup(
            jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("LOGOWANIE", jPanelLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegActionPerformed
        Register();
        
        
        jTextFieldUsername.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldPass.setText("");
        jPasswordFieldCPass.setText("");
    }//GEN-LAST:event_jButtonRegActionPerformed

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
            java.util.logging.Logger.getLogger(LOGOWANIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGOWANIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGOWANIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGOWANIE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGOWANIE().setVisible(true);
            }
        });
    }
    
    
    
    public void Register(){
            Username();
            Email();
            Password();
            Zapis();
    }
    
    
    public void Username(){
        err = "";
        user = jTextFieldUsername.getText();
        if(user.length()< 2 || user.length() >20){
            System.out.println();
            err += " musi byc 2-20 liter ";
        }
        
        String[] tab;
        char[] raw = user.toCharArray();
        tab = new String[raw.length];
        for(int i =0; i < raw.length;i++){
            tab[i] = Character.toString(raw[i]);
        }
        
        
        /*for(int i = 0;i<tab.length;i++){
            System.out.println(tab[i]+" ");
        }*/
        String[] tak = {"1","2","3","4","5","6","7","8","9","0"};
        int liczby =0;
        for(int i =0; i<tak.length;i++){
           if(user.contains(tak[i])){
                liczby++;
            } 
        }
        if(liczby > 0){
           err += " USER MA LICZBY "; 
        }
        
        
        System.out.println("Bledy w username: "+err);      
        if(err != ""){
            jLabelWrongUser.setText(err);
        }
    }
    
    public void Email(){
        mail = jTextFieldEmail.getText();
        zlymail = "";
        
        if(mail.contains("@") && mail.contains(".")){
            if(mail.charAt(0)=='@'){
                zlymail = "Podano nie poprawny adres EMAIL!";
            }else{
                String hosting[] = mail.split("@");
                if(hosting[1].charAt(0)=='.'){
                    zlymail = "Podano nie poprawny adres EMAIL!";
                }
                
                String kropa = hosting[1];
                String[] kropa2 = kropa.split("\\.");
                if(kropa2[1].isEmpty()==true){
                    zlymail = "Podano nie poprawny adres EMAIL!";
                }
            }
        }else{
            zlymail = "Podano nie poprawny adres EMAIL!";
        }
        
        System.out.println("Bledy w email: "+zlymail);      
        if(zlymail != ""){
            jLabelEmailErr.setText(zlymail);
        }
    }
    
    public void Password(){
        pass = jPasswordFieldPass.getText();
        String Cpass = jPasswordFieldCPass.getText();
        
        blad = "";
        

        if(pass.equals(Cpass)){
            System.out.println("Hasla takie same");
        }else{
            System.out.println("Hasla nie sa takie same");
            blad +="Hasla nie sa takie same";
        }
        
        jLabelPassErr.setText(blad);
    }
    
    public void Zapis(){
        File f = new File("user.csv");
        
        if(err == "" && blad == "" && zlymail == ""){ 
            try { 
                FileWriter fw = new FileWriter(f, true);
                fw.write(user+";"+mail+";"+ pass+"\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LOGOWANIE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Sproboj jeszcze raz", "BŁĄD!", JOptionPane.ERROR_MESSAGE);

        }
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelComfirm;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmailErr;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPassErr;
    private javax.swing.JLabel jLabelReg;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelWrongUser;
    private javax.swing.JPanel jPanelLog;
    private javax.swing.JPanel jPanelReg;
    private javax.swing.JPasswordField jPasswordFieldCPass;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
