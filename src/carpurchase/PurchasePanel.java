/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carpurchase;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QP
 */
public class PurchasePanel extends javax.swing.JFrame{
    
    /**
     * Creates new form PurchasePanel
     */
    Cart cart = new Cart();
    Cars car = new Cars();
    Object[] row = new Object[4];
    
    private static String brand;
    private static String modal;
    private static String year;
    private static String price;
    
    public static int currentCarNumber = 0;
    public static String[][] carInformations = new String[100][5];
    
    public static int iFilteredCarNumber = 0;
    public static int iArrYearLower[] = {2000, 2000, 2006, 2011, 2016, 2021};
    public static int iArrYearUpper[] = {2022, 2005, 2010, 2015, 2020, 2022};
    public static int iArrPriceLower[] = {0, 0, 100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000};
    public static int iArrPriceUpper[] = {1000000, 100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};
        
    public PurchasePanel() {
        initComponents();
        getShowCarInformations();
    }
    
    private void clearCarInformations()
    {
        DefaultTableModel model = (DefaultTableModel)CarsTable.getModel();        
        for (int i = (iFilteredCarNumber - 1); i >= 0; i--)
        {
            model.removeRow(i);
        }
    }
    
    private void getShowCarInformations()
    {
        currentCarNumber = car.getCurrentCarNumber();        
        iFilteredCarNumber = 0;
        carInformations = car.getCarInformation();
        
            for (int i = 0; i < currentCarNumber; i++)
            {
                if(carInformations[i][4].equals("Available"))
                {
                    for (int j = 0; j < 4; j++)
                    {
                        row[j] = carInformations[i][j];
                    }

                    DefaultTableModel model = (DefaultTableModel)CarsTable.getModel();
                    model.addRow(row);
                    iFilteredCarNumber++;
                }
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

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        yearComboBox = new javax.swing.JComboBox<>();
        modalText = new javax.swing.JTextField();
        priceComboBox = new javax.swing.JComboBox<>();
        brandText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton4.setText("Select");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 185, -1));

        yearComboBox.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2000 - 2005", "2006 - 2010", "2011 - 2015", "2016 - 2020", "2021 - 2022" }));
        yearComboBox.setToolTipText("");
        jPanel1.add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 170, -1));

        modalText.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jPanel1.add(modalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 170, -1));

        priceComboBox.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        priceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "0 - 100.000", "100.000 - 200.000", "200.000 - 300.000", "300.000 - 400.000", "400.000 - 500.000", "500.000 - 600.000", "600.000 - 700.000", "700.000 - 800.000", "800.000 - 900.000", "900.000 - 1.000.000" }));
        priceComboBox.setToolTipText("");
        jPanel1.add(priceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 170, -1));

        brandText.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        brandText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTextActionPerformed(evt);
            }
        });
        jPanel1.add(brandText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Brand");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Modal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Year of production");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 127, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 75, -1, -1));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 69, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton5.setText("My Cart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 175, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Main Menu");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 81, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpurchase/mainMenu.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpurchase/blue.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 720));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 720));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Price range");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton2.setText("Filter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 170, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 170, -1));

        CarsTable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        CarsTable.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Modal", "Year", "Price"
            }
        ));
        CarsTable.setRowHeight(25);
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CarsTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 210, 920, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpurchase/grey1.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1100, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void brandTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = (cart.getCurrentCartNumber() - 1); i >= 0; i--)
        {
            try {
                cart.deleteCart(i);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        this.dispose();
        new Login().setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new MyCart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)CarsTable.getModel();       
        
        String filteredBrandText = brandText.getText();
        String filteredModalText = modalText.getText();        
        int iYearLower = iArrYearLower[yearComboBox.getSelectedIndex()];
        int iYearUpper = iArrYearUpper[yearComboBox.getSelectedIndex()];
        int iPriceLower = iArrPriceLower[priceComboBox.getSelectedIndex()];
        int iPriceUpper = iArrPriceUpper[priceComboBox.getSelectedIndex()];

        clearCarInformations();     
        iFilteredCarNumber = 0;
        
        for (int i = 0; i < currentCarNumber; i++)
        {      
            if ((filteredBrandText.equals("") == false) && filteredModalText.equals("") == false)
            {
                if (carInformations[i][0].equals(filteredBrandText) == true &&
                    carInformations[i][1].equals(filteredModalText) == true &&
                    carInformations[i][4].equals("Available") == true &&
                    iYearLower <= Integer.parseInt(carInformations[i][2]) &&
                    iYearUpper >= Integer.parseInt(carInformations[i][2]) &&   
                    iPriceLower <= Integer.parseInt(carInformations[i][3]) &&
                    iPriceUpper >= Integer.parseInt(carInformations[i][3]))      
                { 
                    for (int j = 0; j < 4; j++)
                    {
                        row[j] = carInformations[i][j];
                    }   
                    model.addRow(row);
                    iFilteredCarNumber++;
                }
            }    
            else if ((filteredBrandText.equals("") == false) && filteredModalText.equals("") == true)
            {
                if (carInformations[i][0].equals(filteredBrandText) == true &&
                    carInformations[i][4].equals("Available") == true &&
                    iYearLower <= Integer.parseInt(carInformations[i][2]) &&
                    iYearUpper >= Integer.parseInt(carInformations[i][2]) &&   
                    iPriceLower <= Integer.parseInt(carInformations[i][3]) &&
                    iPriceUpper >= Integer.parseInt(carInformations[i][3]))      
                { 
                    for (int j = 0; j < 4; j++)
                    {
                        row[j] = carInformations[i][j];
                    }   
                    model.addRow(row);
                    iFilteredCarNumber++;
                }
            } 
            else if ((filteredBrandText.equals("") == true) && filteredModalText.equals("") == false)
            {
                if (carInformations[i][1].equals(filteredModalText) == true &&
                    carInformations[i][4].equals("Available") == true &&
                    iYearLower <= Integer.parseInt(carInformations[i][2]) &&
                    iYearUpper >= Integer.parseInt(carInformations[i][2]) &&   
                    iPriceLower <= Integer.parseInt(carInformations[i][3]) &&
                    iPriceUpper >= Integer.parseInt(carInformations[i][3]))      
                { 
                    for (int j = 0; j < 4; j++)
                    {
                        row[j] = carInformations[i][j];
                    }   
                    model.addRow(row);
                    iFilteredCarNumber++;
                }
            } 
            else if ((filteredBrandText.equals("") == true) && filteredModalText.equals("") == true)
            {
                if (carInformations[i][4].equals("Available") == true &&
                    iYearLower <= Integer.parseInt(carInformations[i][2]) &&
                    iYearUpper >= Integer.parseInt(carInformations[i][2]) &&   
                    iPriceLower <= Integer.parseInt(carInformations[i][3]) &&
                    iPriceUpper >= Integer.parseInt(carInformations[i][3]))      
                { 
                    for (int j = 0; j < 4; j++)
                    {
                        row[j] = carInformations[i][j];
                    }   
                    model.addRow(row);
                    iFilteredCarNumber++;
                }
            } 
        }
        JOptionPane.showMessageDialog(this, "The table Has Been Filtered");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ResetTexts();
        clearCarInformations();
        getShowCarInformations();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean a = false;
        
        for(int i = 0; i < currentCarNumber; i++)
        {
            if(CarsTable.isRowSelected(i))
                a = true;
        }
        if(!a)
        {
            JOptionPane.showMessageDialog(this, "Select A Car to Add");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Car Selected Successfully");
            ResetTexts();
            new AddToCart().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTableMouseClicked
       
       DefaultTableModel model = (DefaultTableModel)CarsTable.getModel();
       int MyIndex = CarsTable.getSelectedRow();
       
       brandText.setText(model.getValueAt(MyIndex, 0).toString());
       modalText.setText(model.getValueAt(MyIndex, 1).toString());
       
       brand = model.getValueAt(MyIndex, 0).toString();
       modal = model.getValueAt(MyIndex, 1).toString();
       year = model.getValueAt(MyIndex, 2).toString();
       price = model.getValueAt(MyIndex, 3).toString();
    }//GEN-LAST:event_CarsTableMouseClicked

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

    public String getSelectedBrand()
    {
        return brand;
    }
    public String getSelectedModal()
    {
        return modal;
    }
    public String getSelectedYear()
    {
        return year;
    }
    public String getSelectedPrice()
    {
        return price;
    }
    private void ResetTexts()
    {
        modalText.setText("");
        brandText.setText("");
        yearComboBox.setSelectedIndex(0);
        priceComboBox.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CarsTable;
    private javax.swing.JTextField brandText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField modalText;
    private javax.swing.JComboBox<String> priceComboBox;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
