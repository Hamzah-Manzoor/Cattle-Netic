/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiCattleNetic;

import java.beans.PropertyVetoException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamzah Manzoor
 */
public class FeadBack extends javax.swing.JInternalFrame {

    /**
     * Creates new form OrderManagement
     */
    String url = "jdbc:mysql://localhost:3306/cattleNetic";
    String user = "root";
    String password = "root";
    public FeadBack() {
        initComponents();
        HealthComboBox.setSelectedItem("Test");
        HealthComboBox.setSelectedItem("Test Two");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        CancelBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpdatesTextField = new javax.swing.JTextArea();
        HealthComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CowIDSpinner = new javax.swing.JSpinner();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(51, 255, 51));
        setClosable(true);
        setTitle("Cow Health");

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        CancelBtn.setBackground(new java.awt.Color(80, 45, 100));
        CancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(204, 204, 204));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SubmitBtn.setBackground(new java.awt.Color(80, 60, 112));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(204, 204, 204));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("How is the cow health:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add any recommendations/updates:");

        UpdatesTextField.setBackground(new java.awt.Color(204, 204, 255));
        UpdatesTextField.setColumns(20);
        UpdatesTextField.setRows(5);
        jScrollPane1.setViewportView(UpdatesTextField);

        HealthComboBox.setBackground(new java.awt.Color(204, 204, 255));
        HealthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Bad", "Critical" }));
        HealthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("What is the Cow ID:");

        CowIDSpinner.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CowIDSpinner.setMinimumSize(new java.awt.Dimension(48, 22));
        CowIDSpinner.setPreferredSize(new java.awt.Dimension(48, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(SubmitBtn)
                        .addGap(112, 112, 112)
                        .addComponent(CancelBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CowIDSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HealthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CowIDSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HealthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn)
                    .addComponent(CancelBtn))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        //int id = Integer.parseInt(CowIDSpinner.getValue());
        int ID = Integer.valueOf((int) CowIDSpinner.getValue());
        String health = String.valueOf(HealthComboBox.getSelectedItem());
        String healthUpdate = UpdatesTextField.getText();
        String cowID = Integer.toString(ID);
        
        
        try {    
            Connection con = DriverManager.getConnection(url, user, password);
            
            String sql = "SELECT * FROM cows";
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            int count = 0;
            while(rs.next()){
                count++;
            }
            //System.out.println("Count is: " + count);
            
            if (ID <= count &&  ID > 0){
                JOptionPane.showMessageDialog(null, "Success! The updates have been submitted");
                //String searchID = "1";
                String query = " UPDATE cows SET cowHealth = ?, cowHealthUpdates = ?"
                        + " WHERE ID = '" + cowID + "' ";

                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString (1, health);
                preparedStmt.setString (2, healthUpdate);

                preparedStmt.execute();                
            } else {
                JOptionPane.showMessageDialog(null, "Number not in range", "Database", JOptionPane.ERROR_MESSAGE);
            }


            con.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }
        
        
        
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed

        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MeatOrderManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void HealthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthComboBoxActionPerformed
        // TODO add your handling code here:
        //jComboBox1.setSelectedIndex(1) = "Hamzah";

    }//GEN-LAST:event_HealthComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JSpinner CowIDSpinner;
    public javax.swing.JComboBox<String> HealthComboBox;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextArea UpdatesTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}