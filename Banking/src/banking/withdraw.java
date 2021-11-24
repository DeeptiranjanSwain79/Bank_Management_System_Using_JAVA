package banking;

import javax.swing.JOptionPane;

/**
 *
 * @author DEEPTIRANJAN SWAIN
 */
public class withdraw extends javax.swing.JFrame {
    Connection_Provider cp = new Connection_Provider();
    String cardno, pin;
    int balance = 0;
    /**
     * Creates new form withdraw
     */
    public withdraw(String cardno, String pin) {
        this.cardno = cardno;
        this.pin = pin;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balance_ = new javax.swing.JLabel();
        view_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        amount_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        withdraw_ = new javax.swing.JButton();
        transaction_ = new javax.swing.JButton();
        exit_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        balance_.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        balance_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        view_.setBackground(new java.awt.Color(0, 0, 255));
        view_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        view_.setText("View Balance");
        view_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Enter amount");

        amount_.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Please enter multiple of 100");

        withdraw_.setBackground(new java.awt.Color(0, 204, 0));
        withdraw_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        withdraw_.setText("Withdraw");
        withdraw_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_ActionPerformed(evt);
            }
        });

        transaction_.setBackground(new java.awt.Color(0, 153, 153));
        transaction_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transaction_.setText("Another Transaction");
        transaction_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaction_ActionPerformed(evt);
            }
        });

        exit_.setBackground(new java.awt.Color(204, 0, 0));
        exit_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit_.setText("Exit");
        exit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(balance_, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(view_, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(withdraw_, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transaction_, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount_, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(balance_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(withdraw_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transaction_, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_ActionPerformed
        try {
            String q = "select balance from bank where cardno = ? and pin = ?";            
            java.sql.PreparedStatement ps = cp.conn.prepareStatement(q);
            
            ps.setString(1, cardno);
            ps.setString(2, pin);
            
            java.sql.ResultSet set = ps.executeQuery();
            
            
            while(set.next()){
                balance = set.getInt(1);
            }
            
            balance_.setText(Integer.toString(balance));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_view_ActionPerformed

    private void withdraw_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_ActionPerformed
       int cash = Integer.parseInt(amount_.getText());
       if(cash % 100 == 0){
           JOptionPane.showMessageDialog(null, "Please enter amount multiple of 100");
       }else{
           if(balance <= 100){
               JOptionPane.showMessageDialog(null, "Your available balance is very low");
           }else{
               JOptionPane.showMessageDialog(null, "Please collect your cash");
                try {
                String q = "select balance from bank where cardno = ? and pin = ?";            
                java.sql.PreparedStatement ps = cp.conn.prepareStatement(q);

                ps.setString(1, cardno);
                ps.setString(2, pin);

                java.sql.ResultSet set = ps.executeQuery();


                while(set.next()){
                    balance = set.getInt(1);
                }

                balance -= cash;
                
                    try {
                        String q1 = "update bank set balance = ? where cardno = ? and pin = ?";
                        java.sql.PreparedStatement ps1 = cp.conn.prepareStatement(q1);
                        
                        ps1.setInt(1, cash);
                        ps1.setString(2, cardno);
                        ps1.setString(3, pin);
                        
                        ps1.executeUpdate();
                        
                        System.out.println("Updated");
                        
                        JOptionPane.showMessageDialog(null, "Available balance  "+Integer.toString(balance));
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
           }
       }
       
    }//GEN-LAST:event_withdraw_ActionPerformed

    private void exit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_ActionPerformed

    private void transaction_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaction_ActionPerformed
        new transaction(cardno, pin).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_transaction_ActionPerformed

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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_;
    private javax.swing.JLabel balance_;
    private javax.swing.JButton exit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton transaction_;
    private javax.swing.JButton view_;
    private javax.swing.JButton withdraw_;
    // End of variables declaration//GEN-END:variables
}
