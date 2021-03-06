package banking;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author DEEPTIRANJAN SWAIN
 */
public class Signup3 extends javax.swing.JFrame {
    String formno;
    
    Random random = new Random();
    long c = Math.abs(random.nextLong(999999999999L - 100000000000L) + 100000000000L);
    
    String card = Long.toString(c);
    
    int p = random.nextInt(9999 - 1000) + 1000;
    String pin = Integer.toString(p);
    /**
     * Creates new form Sign up 3
     */
    public Signup3(String formno) {
        this.formno = formno;
        initComponents();
        
        String atype = "";
        if(current_.isSelected()){
            atype = "Current";
        }else if(savings_.isSelected()){
            atype = "Savings";
        }else if(fd_.isSelected()){
            atype = "FD";
        }
        
        try {
            Connection_Provider cp = new Connection_Provider();
            //Inserting to table signup3
            String q = "insert into signup3 (formno, atype, cardno, pin) values (?,?,?,?)";
            java.sql.PreparedStatement ps = cp.conn.prepareStatement(q);
            
            ps.setString(1, formno);
            ps.setString(2, atype);
            ps.setString(3, card);
            ps.setString(4, pin);
            
            ps.executeUpdate();
            
            System.out.println("Data inserted successfully");
            
            
            //Inserting to table login
            String q2 = "insert into login (cardno, pin) values (?,?)";
            java.sql.PreparedStatement ps2 = cp.conn.prepareStatement(q2);
            
            ps2.setString(1, card);
            ps2.setString(2, pin);
            
            ps2.executeUpdate();
            
            System.out.println("Data inserted in log in");
            String q3 = "insert into bank (balance, cardno, pin) values (?,?,?)";
            java.sql.PreparedStatement ps3 = cp.conn.prepareStatement(q3);
            
            ps3.setInt(1, 0);
            ps3.setString(2, card);
            ps3.setString(3, pin);
            
            ps3.executeUpdate();
            System.out.println("Data inserted to bank");
            
            
            //Inserting to table bank
            
            
                    
        } catch (Exception e) {
            e.printStackTrace();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        login_ = new javax.swing.JButton();
        signout_ = new javax.swing.JButton();
        current_ = new javax.swing.JRadioButton();
        savings_ = new javax.swing.JRadioButton();
        fd_ = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Account Type");

        login_.setBackground(new java.awt.Color(0, 51, 255));
        login_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login_.setText("Log In");
        login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ActionPerformed(evt);
            }
        });

        signout_.setBackground(new java.awt.Color(255, 51, 51));
        signout_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signout_.setText("Sign Out");
        signout_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_ActionPerformed(evt);
            }
        });

        current_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        current_.setText("Current");

        savings_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        savings_.setText("Savings");

        fd_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fd_.setText("FD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(current_, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signout_, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savings_, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fd_))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(current_)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(savings_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(fd_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signout_, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ActionPerformed
        setVisible(false);
        new login().setVisible(true);
        JOptionPane.showMessageDialog(null, "Signed Out Successfilly\nCard No.  "+card+"\nPIN   "+pin+"\nForm no.   "+formno);
    }//GEN-LAST:event_login_ActionPerformed

    private void signout_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_ActionPerformed
        JOptionPane.showMessageDialog(null, "Signed Out Successfilly\nCard No.  "+card+"\nPIN   "+pin+"\nForm no.   "+formno);
        System.exit(0);
    }//GEN-LAST:event_signout_ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup3("").setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton current_;
    private javax.swing.JRadioButton fd_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login_;
    private javax.swing.JRadioButton savings_;
    private javax.swing.JButton signout_;
    // End of variables declaration//GEN-END:variables
}
