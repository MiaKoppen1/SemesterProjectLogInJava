
package com.mycompany.loginandregistration;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {

    
    // Creates new form Login
   
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parent = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        LoginButton = new javax.swing.JLabel();
        EmailButton = new javax.swing.JLabel();
        UserNameButton = new javax.swing.JLabel();
        PasswordButton = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        NoAccountLabel = new javax.swing.JLabel();
        SubmitLoginButton1 = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        CompanyLogo = new javax.swing.JLabel();
        CompanyName = new javax.swing.JLabel();
        CopyrightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));

        Parent.setBackground(new java.awt.Color(0, 0, 0));
        Parent.setForeground(new java.awt.Color(90, 70, 76));
        Parent.setMaximumSize(new java.awt.Dimension(500, 500));
        Parent.setPreferredSize(new java.awt.Dimension(700, 600));

        right.setBackground(new java.awt.Color(255, 239, 189));
        right.setMaximumSize(new java.awt.Dimension(500, 500));
        right.setMinimumSize(new java.awt.Dimension(100, 100));
        right.setPreferredSize(new java.awt.Dimension(350, 500));

        LoginButton.setBackground(new java.awt.Color(255, 239, 189));
        LoginButton.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(83, 19, 30));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setLabelFor(right);
        LoginButton.setText("LOG-IN");
        LoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 19, 30), 6));
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginButton.setName("LoginButton"); // NOI18N
        LoginButton.setOpaque(true);

        EmailButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EmailButton.setText("Email");

        UserNameButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UserNameButton.setText("Username");

        PasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PasswordButton.setText("Password");

        email.setText("enter your email...");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        username.setText("enter your username...");

        SignUpButton.setBackground(new java.awt.Color(255, 239, 189));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(83, 19, 30));
        SignUpButton.setText("Signup Here!");
        SignUpButton.setBorder(null);
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        NoAccountLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NoAccountLabel.setText("or");

        SubmitLoginButton1.setBackground(new java.awt.Color(83, 19, 30));
        SubmitLoginButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SubmitLoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        SubmitLoginButton1.setText("Login");
        SubmitLoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitLoginButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(username)
                    .addComponent(email)
                    .addComponent(UserNameButton)
                    .addComponent(EmailButton)
                    .addComponent(PasswordButton)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                        .addComponent(NoAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                        .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                        .addComponent(SubmitLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmailButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UserNameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(SubmitLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Left.setBackground(new java.awt.Color(83, 19, 30));
        Left.setMaximumSize(new java.awt.Dimension(500, 500));
        Left.setPreferredSize(new java.awt.Dimension(350, 500));

        CompanyName.setBackground(new java.awt.Color(255, 239, 189));
        CompanyName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        CompanyName.setForeground(new java.awt.Color(255, 239, 189));
        CompanyName.setText("COMPANY NAME");

        CopyrightLabel.setBackground(new java.awt.Color(255, 239, 189));
        CopyrightLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CopyrightLabel.setForeground(new java.awt.Color(255, 239, 189));
        CopyrightLabel.setText("Copyright @ company name All Rights Reserved");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                                .addComponent(CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(CompanyLogo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CompanyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CopyrightLabel)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout ParentLayout = new javax.swing.GroupLayout(Parent);
        Parent.setLayout(ParentLayout);
        ParentLayout.setHorizontalGroup(
            ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ParentLayout.setVerticalGroup(
            ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Parent, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(339, 339, 339))
        );

        Parent.getAccessibleContext().setAccessibleName("LOGIN");
        Parent.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        SignUp SignUpFrame = new SignUp();// creates a new instance of login.
        SignUpFrame.setVisible(true);// makes it visible to the screen.
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);// center
        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void SubmitLoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitLoginButton1ActionPerformed
       String Email, Password, UserID, query, PassDb = null;
       String SUrl, SUser, SPass;
            SUrl = "jdbc:mysql://localhost:3306/user_registration_database";
            SUser = "root";
            SPass = "";
            int notFound = 0;
            
             try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
         Statement st = con.createStatement();
        if("".equals(email.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "Email Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else if("".equals(password.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "Password Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else if("".equals(username.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "UserID Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else{
             Email = email.getText();
             Password = password.getText();
             UserID = username.getText();
             
             query = "SELECT * FROM user WHERE Email = "+Email+ "'";
             ResultSet rs = st.executeQuery(query);
             while(rs.next())
                {
                PassDb = rs.getString("Password");
                notFound = 1;
                }
             if(notFound == 1 && Password.equals(PassDb))
                {
                Home HomeFrame = new Home();// creates a new instance of login.
                HomeFrame.setVisible(true);// makes it visible to the screen.
                HomeFrame.pack();
                HomeFrame.setLocationRelativeTo(null);// center
                this.dispose();
                }
             else
             {
             JOptionPane.showMessageDialog(new JFrame(), "INCORRECT EMAIL OR PASSWORD", 
                     "Error!", JOptionPane.ERROR_MESSAGE);
             }
             password.setText("");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
            System.out.println("Error!" + e.getMessage());
            }
    }//GEN-LAST:event_SubmitLoginButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompanyLogo;
    private javax.swing.JLabel CompanyName;
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JLabel EmailButton;
    private javax.swing.JPanel Left;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel NoAccountLabel;
    private javax.swing.JPanel Parent;
    private javax.swing.JLabel PasswordButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JButton SubmitLoginButton1;
    private javax.swing.JLabel UserNameButton;
    private javax.swing.JTextField email;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel right;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
