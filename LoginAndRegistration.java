
package com.mycompany.loginandregistration;

// Mia Koppen
// Software Design and Development Semester Project
// Login and Registration Form using Java NetBeans and MySQL.

public class LoginAndRegistration 
    {
    public static void main(String[] args) 
        {
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(LoginFrame);
        }
    }
