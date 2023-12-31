/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carpurchase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author QP
 */
public class Login extends javax.swing.JFrame {

    static int currentCustomerNumber = 0;
    public static String[][] customerInformations = new String[50][3];
    Cart cart = new Cart();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        customer();
    }
    
    public void customer()
        {
            try{
            FileReader reader = new FileReader("customers.txt");
            Scanner in = new Scanner(reader);
            int iObjectIndex = 0;

            while (in.hasNextLine())
            {        
                String line = in.nextLine();            
                Scanner lineScanner = new Scanner(line);

                iObjectIndex = 0;
                while (lineScanner.hasNext())
                {
                    customerInformations[currentCustomerNumber][iObjectIndex] = lineScanner.next();
                    iObjectIndex++;               
                }

                currentCustomerNumber++;
            }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passwordText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 75, -1, -1));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 69, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Car Purchasing System");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 274, -1, -1));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 81, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Car Purchase System");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 77, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("UserName");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 268, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Password");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 336, 95, -1));

        userNameText.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });
        jPanel4.add(userNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 265, 235, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 404, 131, -1));

        passwordText.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel4.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 333, 235, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 404, 129, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 21)); // NOI18N
        jButton3.setText("Admin Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 17, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpurchase/login.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpurchase/grey.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 590));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 0, 500, 590));

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Welcome To The");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 213, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpurchase/blue.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        for (int i = (cart.getCurrentCartNumber() - 1); i >= 0; i--)
        {
            try {
                cart.deleteCart(i);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AdminLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new Register().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean a = false;
        try{
            for(int i = 0; i < currentCustomerNumber; i++)
            {
                if(customerInformations[i][0].equals(userNameText.getText()) && customerInformations[i][1].equals(passwordText.getText()))
                {
                    a = true;
                    JOptionPane.showMessageDialog(this, "User Login Successful");
                    this.dispose();
                    new PurchasePanel().setVisible(true);
                    break;
                }
            }

            if(a == false)
            {
                JOptionPane.showMessageDialog(this, "Wrong or Missing Information");
            }
        } catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
