/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GuiCattleNetic;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamzah Manzoor
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    String url = "jdbc:mysql://localhost:3306/cattleNetic";
    String user = "root";
    String password = "root";
    public Customer() {
        initComponents();
        
        try {
            String searchID = "1";
            String sql = "SELECT * FROM docter WHERE ID = '" + searchID + "' ";
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String managingCows = rs.getString(4);
                ManagingCowsLabel.setText(managingCows);
                
                String date  = rs.getString(5);
                //System.out.println("Date is: " + date);
                JoiningDateLabel.setText(date);
                
                String availability = rs.getString(6);
                if (availability.equals("0")) {
                    AvailabilityLabel.setText("Not Available");
                } else {
                    AvailabilityLabel.setText("    Available");    
                }
                                
            } else {
                JOptionPane.showMessageDialog(null, "No content in the database");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Issues in SQL syntax", "Database", JOptionPane.ERROR_MESSAGE);
            //System.out.println(ex);
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

        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        CreateDietBtn = new javax.swing.JButton();
        ManageDiet = new javax.swing.JButton();
        UpdateHealth = new javax.swing.JButton();
        ProfileBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        DocterNameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ManagingCowsLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JoiningDateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AvailabilityLabel = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Portal | Cattle Netic");
        setPreferredSize(new java.awt.Dimension(1551, 830));

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));

        MenuPanel.setBackground(new java.awt.Color(54, 33, 89));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("CATTLENETIC");
        MenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 102));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 102));
        MenuPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 220, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/external-cow-farming-icongeek26-outline-gradient-icongeek26.png"))); // NOI18N
        MenuPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 120));

        CreateDietBtn.setBackground(new java.awt.Color(80, 60, 112));
        CreateDietBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CreateDietBtn.setForeground(new java.awt.Color(204, 204, 204));
        CreateDietBtn.setText("Create Diet Plan");
        CreateDietBtn.setBorder(null);
        CreateDietBtn.setBorderPainted(false);
        CreateDietBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDietBtnActionPerformed(evt);
            }
        });
        MenuPanel.add(CreateDietBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 40));

        ManageDiet.setBackground(new java.awt.Color(80, 45, 100));
        ManageDiet.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ManageDiet.setForeground(new java.awt.Color(204, 204, 204));
        ManageDiet.setText("Manage Diet Plan");
        ManageDiet.setBorder(null);
        ManageDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDietActionPerformed(evt);
            }
        });
        MenuPanel.add(ManageDiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, 40));

        UpdateHealth.setBackground(new java.awt.Color(80, 60, 112));
        UpdateHealth.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UpdateHealth.setForeground(new java.awt.Color(204, 204, 204));
        UpdateHealth.setText("Update Cow Health");
        UpdateHealth.setBorder(null);
        UpdateHealth.setBorderPainted(false);
        UpdateHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateHealthActionPerformed(evt);
            }
        });
        MenuPanel.add(UpdateHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 40));

        ProfileBtn.setBackground(new java.awt.Color(80, 45, 100));
        ProfileBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ProfileBtn.setForeground(new java.awt.Color(204, 204, 204));
        ProfileBtn.setText("Update Profile");
        ProfileBtn.setBorder(null);
        ProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileBtnActionPerformed(evt);
            }
        });
        MenuPanel.add(ProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 40));

        LogoutBtn.setBackground(new java.awt.Color(80, 60, 112));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(204, 204, 204));
        LogoutBtn.setText("Logout");
        LogoutBtn.setBorder(null);
        LogoutBtn.setBorderPainted(false);
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        MenuPanel.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 90, 40));

        jSeparator2.setBackground(new java.awt.Color(255, 204, 102));
        jSeparator2.setForeground(new java.awt.Color(255, 204, 102));
        MenuPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, -1));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocterNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DocterNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        DocterNameLabel.setText("Doctor Name");
        jPanel1.add(DocterNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Doctor Portal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 303, 50));

        jDesktopPane1.setLayout(new java.awt.GridLayout(2, 3));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cows Managing");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 0, 2, new java.awt.Color(0, 0, 0)));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(jLabel4);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Joining Date");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 0, 2, new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(jLabel8);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Availability");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 0, 2, new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(jLabel6);

        jPanel4.setBackground(new java.awt.Color(153, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(54, 33, 89)));
        jPanel4.setForeground(new java.awt.Color(54, 33, 89));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManagingCowsLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ManagingCowsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ManagingCowsLabel.setText("15");
        jPanel4.add(ManagingCowsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 50));

        jDesktopPane1.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(54, 33, 89)));
        jPanel3.setForeground(new java.awt.Color(54, 33, 89));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JoiningDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        JoiningDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        JoiningDateLabel.setText("17/05/2015");
        jPanel3.add(JoiningDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 50));

        jDesktopPane1.add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(54, 33, 89)));
        jPanel2.setForeground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AvailabilityLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        AvailabilityLabel.setForeground(new java.awt.Color(255, 255, 255));
        AvailabilityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvailabilityLabel.setText("Available");
        jPanel2.add(AvailabilityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 50));

        jDesktopPane1.add(jPanel2);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
                    .addComponent(jDesktopPane2)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2))
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        // TODO add your handling code here:
        UpdateProfile profile = new UpdateProfile();
        profile.setVisible(true);
        jDesktopPane2.add(profile);
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void UpdateHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateHealthActionPerformed
        // TODO add your handling code here:
        FeadBack feadback = new FeadBack();
        feadback.setVisible(true);
        jDesktopPane2.add(feadback);
    }//GEN-LAST:event_UpdateHealthActionPerformed

    private void ManageDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDietActionPerformed
        // TODO add your handling code here:
        MeatOrderManagement meat = new MeatOrderManagement();
        meat.setVisible(true);
        jDesktopPane2.add(meat); 
    }//GEN-LAST:event_ManageDietActionPerformed

    private void CreateDietBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDietBtnActionPerformed

        OrderManagement om = new OrderManagement();
        om.setVisible(true);
        jDesktopPane2.add(om);
    }//GEN-LAST:event_CreateDietBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutBtnActionPerformed

    void setColor(JPanel panel){
        panel.setBackground(new Color(85, 65, 118));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64, 43, 100));
    }
    void setColor(JButton panel){
        panel.setBackground(new Color(85, 65, 118));
    }
    
    void resetColor(JButton panel){
        panel.setBackground(new Color(64, 43, 100));
    }
    
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailabilityLabel;
    private javax.swing.JButton CreateDietBtn;
    private javax.swing.JLabel DocterNameLabel;
    private javax.swing.JLabel JoiningDateLabel;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton ManageDiet;
    private javax.swing.JLabel ManagingCowsLabel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JButton UpdateHealth;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
