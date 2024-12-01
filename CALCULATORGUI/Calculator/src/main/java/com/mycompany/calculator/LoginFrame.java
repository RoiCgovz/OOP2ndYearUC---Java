package com.mycompany.calculator;
import javax.swing.JOptionPane;
public class LoginFrame extends javax.swing.JFrame {
    public LoginFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesignPanel1 = new javax.swing.JPanel();
        DesignPanel2 = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        LOGINBUTTON = new javax.swing.JButton();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordFieldLogin = new javax.swing.JPasswordField();
        UserNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesignPanel1.setBackground(new java.awt.Color(0, 102, 255));

        DesignPanel2.setBackground(new java.awt.Color(255, 255, 255));

        WelcomeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(0, 51, 204));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("WELCOME");

        LOGINBUTTON.setBackground(new java.awt.Color(0, 51, 204));
        LOGINBUTTON.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LOGINBUTTON.setText("LOGIN");
        LOGINBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBUTTONActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 51, 204));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 51, 204));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");

        javax.swing.GroupLayout DesignPanel2Layout = new javax.swing.GroupLayout(DesignPanel2);
        DesignPanel2.setLayout(DesignPanel2Layout);
        DesignPanel2Layout.setHorizontalGroup(
            DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesignPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGINBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(DesignPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DesignPanel2Layout.createSequentialGroup()
                        .addComponent(PasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesignPanel2Layout.createSequentialGroup()
                        .addComponent(UsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserNameTextField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DesignPanel2Layout.setVerticalGroup(
            DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesignPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(WelcomeLabel)
                .addGap(37, 37, 37)
                .addGroup(DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(LOGINBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout DesignPanel1Layout = new javax.swing.GroupLayout(DesignPanel1);
        DesignPanel1.setLayout(DesignPanel1Layout);
        DesignPanel1Layout.setHorizontalGroup(
            DesignPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesignPanel1Layout.createSequentialGroup()
                .addGap(0, 211, Short.MAX_VALUE)
                .addComponent(DesignPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DesignPanel1Layout.setVerticalGroup(
            DesignPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesignPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesignPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesignPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBUTTONActionPerformed
        String username = UserNameTextField.getText();
        String password = new String(PasswordFieldLogin.getPassword());
        if (username.equals("admin") && password.equals("1234")) {
            CalculatorFrame calcPage = new CalculatorFrame();
            calcPage.setVisible(true);
            this.dispose(); // Close the login window
        } else {
            // Incorrect login: Show error message
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_LOGINBUTTONActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DesignPanel1;
    private javax.swing.JPanel DesignPanel2;
    private javax.swing.JButton LOGINBUTTON;
    private javax.swing.JPasswordField PasswordFieldLogin;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel WelcomeLabel;
    // End of variables declaration//GEN-END:variables
}


