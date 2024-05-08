
package com.mycompany.loginandregistration;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class SignUp extends javax.swing.JFrame {


     // Creates new form SignUp
    public SignUp()
        {
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParentPanelSignUp = new javax.swing.JPanel();
        LeftSignUpPanel = new javax.swing.JPanel();
        LogoOnSignUpPage = new javax.swing.JLabel();
        SignUpCompanyName = new javax.swing.JLabel();
        SignUpCopyrightStatement = new javax.swing.JLabel();
        RightSignUpPanel = new javax.swing.JPanel();
        SignUpButton = new javax.swing.JLabel();
        EmailSignUpLabel = new javax.swing.JLabel();
        CreateUserNameLabel = new javax.swing.JLabel();
        CreatePasswordLabel = new javax.swing.JLabel();
        FullNameLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        fname = new javax.swing.JTextField();
        userID = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        CreateAccountButton = new javax.swing.JButton();
        SignInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Sign Up"); // NOI18N

        ParentPanelSignUp.setBackground(new java.awt.Color(255, 255, 255));
        ParentPanelSignUp.setPreferredSize(new java.awt.Dimension(800, 500));
        ParentPanelSignUp.setLayout(null);

        LeftSignUpPanel.setBackground(new java.awt.Color(83, 19, 30));
        LeftSignUpPanel.setMinimumSize(new java.awt.Dimension(400, 400));

        SignUpCompanyName.setBackground(new java.awt.Color(255, 239, 189));
        SignUpCompanyName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        SignUpCompanyName.setForeground(new java.awt.Color(255, 239, 189));
        SignUpCompanyName.setText("COMPANY NAME");

        SignUpCopyrightStatement.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        SignUpCopyrightStatement.setForeground(new java.awt.Color(255, 239, 189));
        SignUpCopyrightStatement.setText("Copyright @ company name All Rights Reserved");

        javax.swing.GroupLayout LeftSignUpPanelLayout = new javax.swing.GroupLayout(LeftSignUpPanel);
        LeftSignUpPanel.setLayout(LeftSignUpPanelLayout);
        LeftSignUpPanelLayout.setHorizontalGroup(
            LeftSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftSignUpPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LogoOnSignUpPage)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftSignUpPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SignUpCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftSignUpPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignUpCopyrightStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        LeftSignUpPanelLayout.setVerticalGroup(
            LeftSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftSignUpPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(LogoOnSignUpPage, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpCopyrightStatement)
                .addGap(90, 90, 90))
        );

        ParentPanelSignUp.add(LeftSignUpPanel);
        LeftSignUpPanel.setBounds(0, 0, 400, 500);

        RightSignUpPanel.setBackground(new java.awt.Color(255, 239, 189));
        RightSignUpPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        SignUpButton.setBackground(new java.awt.Color(255, 239, 189));
        SignUpButton.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(83, 19, 30));
        SignUpButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpButton.setText("SIGN-UP");
        SignUpButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(83, 19, 30), 6));
        SignUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUpButton.setName("SignUpButton"); // NOI18N
        SignUpButton.setOpaque(true);

        EmailSignUpLabel.setBackground(new java.awt.Color(83, 19, 30));
        EmailSignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EmailSignUpLabel.setText("Email");

        CreateUserNameLabel.setBackground(new java.awt.Color(83, 19, 30));
        CreateUserNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CreateUserNameLabel.setText("Username");

        CreatePasswordLabel.setBackground(new java.awt.Color(83, 19, 30));
        CreatePasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CreatePasswordLabel.setText("Password");

        FullNameLabel.setBackground(new java.awt.Color(83, 19, 30));
        FullNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        FullNameLabel.setText("Full Name");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        fname.setText("Ex; John Doe Smith");
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });

        email.setText("Ex; JohnDSmith@gmail.com");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        CreateAccountButton.setBackground(new java.awt.Color(83, 19, 30));
        CreateAccountButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CreateAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccountButton.setText("Create Account");
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });

        SignInButton.setBackground(SignUpButton.getBackground());
        SignInButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        SignInButton.setForeground(SignUpButton.getForeground());
        SignInButton.setText("I already have an account");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightSignUpPanelLayout = new javax.swing.GroupLayout(RightSignUpPanel);
        RightSignUpPanel.setLayout(RightSignUpPanelLayout);
        RightSignUpPanelLayout.setHorizontalGroup(
            RightSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightSignUpPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(CreateAccountButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RightSignUpPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(RightSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightSignUpPanelLayout.createSequentialGroup()
                        .addComponent(CreatePasswordLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightSignUpPanelLayout.createSequentialGroup()
                        .addGroup(RightSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SignUpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RightSignUpPanelLayout.createSequentialGroup()
                                .addGroup(RightSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SignInButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailSignUpLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CreateUserNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FullNameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 29, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))))
        );
        RightSignUpPanelLayout.setVerticalGroup(
            RightSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightSignUpPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FullNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateUserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreatePasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailSignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(CreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        ParentPanelSignUp.add(RightSignUpPanel);
        RightSignUpPanel.setBounds(400, 0, 400, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ParentPanelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ParentPanelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    // directs the user back to the log-in page to log into their account.
    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        Login SignIn = new Login();// creates a new instance of login.
        SignIn.setVisible(true);// makes it visible to the screen.
        SignIn.pack();
        SignIn.setLocationRelativeTo(null);// center
        this.dispose();
    }//GEN-LAST:event_SignInButtonActionPerformed

    // when the create account button is clicked...
    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        String Fullname;
        String Email;
        String Password;
        String UserID;
        String query;
        String SUrl,SUser,SPass;
            SUrl = "jdbc:mysql://localhost:3306/user_registration_database";
            SUser = "root";
            SPass = "";
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
         Statement st = con.createStatement();
         if("".equals(fname.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "Name Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else if("".equals(email.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "Email Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else if("".equals(password.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "Password Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else if("".equals(userID.getText()))
            {
             JOptionPane.showMessageDialog(new JFrame(), "UserID Required", "Error!", JOptionPane.ERROR_MESSAGE);
            }
         else{
             Fullname = fname.getText();
             Email = email.getText();
             Password = password.getText();
             UserID = userID.getText();
             System.out.println(Password);
             
             query = "INSERT * INTO user(fname, Email, Password)" + "VALUES('"+Fullname+"', '"+Email+"', '"+Password+"')";
             
             st.execute(query);
             fname.setText("");
             email.setText("");
             userID.setText("");
             password.setText("");
             showMessageDialog(null, "account created");
         }
      }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
        System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountButton;
    private javax.swing.JLabel CreatePasswordLabel;
    private javax.swing.JLabel CreateUserNameLabel;
    private javax.swing.JLabel EmailSignUpLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JPanel LeftSignUpPanel;
    private javax.swing.JLabel LogoOnSignUpPage;
    private javax.swing.JPanel ParentPanelSignUp;
    private javax.swing.JPanel RightSignUpPanel;
    private javax.swing.JButton SignInButton;
    private javax.swing.JLabel SignUpButton;
    private javax.swing.JLabel SignUpCompanyName;
    private javax.swing.JLabel SignUpCopyrightStatement;
    private javax.swing.JTextField email;
    javax.swing.JTextField fname;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userID;
    // End of variables declaration//GEN-END:variables
}
