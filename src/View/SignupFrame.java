/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupFrame {

	private JFrame frame;
	private JTextField txtfldUN;
	private JPasswordField txtfldPW;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupFrame window = new SignupFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignupFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 197, 210);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		panel.setBounds(0, 0, 197, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("SIGN UP");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblLogin.setBounds(10, 11, 104, 34);
		panel.add(lblLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(108, 122, 137));
		panel_1.setBounds(0, 56, 197, 154);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(lblUsername.CENTER);;
		lblUsername.setForeground(new Color(236, 240, 241));
		lblUsername.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblUsername.setBounds(10, 11, 177, 30);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(lblPassword.CENTER);;
		lblPassword.setForeground(new Color(236, 240, 241));
		lblPassword.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblPassword.setBounds(10, 68, 177, 30);
		panel_1.add(lblPassword);
		
		txtfldUN = new JTextField();
		txtfldUN.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldUN.setBackground(new Color(46, 49, 49));
		txtfldUN.setForeground(new Color(228, 241, 254));
		txtfldUN.setBounds(10, 37, 177, 20);
		panel_1.add(txtfldUN);
		txtfldUN.setColumns(10);
		
		txtfldPW = new JPasswordField();
		txtfldPW.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldPW.setBackground(new Color(46, 49, 49));
		txtfldPW.setForeground(new Color(228, 241, 254));
		txtfldPW.setBounds(10, 94, 177, 20);
		panel_1.add(txtfldPW);
		txtfldPW.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				new LoginPage();
				frame.dispose();
			}
		});
		
		btnCancel.setOpaque(true);
		btnCancel.setBackground(new Color(192, 57, 43));
		btnCancel.setBorderPainted(true);
		btnCancel.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setHorizontalAlignment(btnCancel.CENTER);
		btnCancel.setBounds(20, 125, 74, 20);
		panel_1.add(btnCancel);
                
        JButton btnLogin = new JButton("Sign Up");
        btnLogin.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
        	new LoginPage();
        	String username = txtfldUN.getText();
                String password = String.valueOf(txtfldPW.getPassword());
        
        	PreparedStatement st;
        	String query = "INSERT INTO `account`(`username`, `password`, `type`)"
                	+ "VALUES(?, ?, ?)";
        
        	try {
            	st = MyConnection.getConnection().prepareStatement(query);
            	st.setString(1, username);
            	st.setString(2, password);
                st.setString(3, "user");
            
            	if(st.executeUpdate() > 0)
            	{
                	JOptionPane.showMessageDialog(null, username + " has been added!");
                        new LoginPage();
                        frame.dispose();
            	}
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SignupFrame.class.getName()).log(Level.SEVERE, null, ex);
        	}
        }
        });
        btnLogin.setOpaque(true);
        btnLogin.setBackground(new Color(34, 167, 240));
        btnLogin.setBorderPainted(true);
        btnLogin.setFont(new Font("Agency FB", Font.BOLD, 15));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setHorizontalAlignment(btnLogin.CENTER);
		btnLogin.setBounds(104, 125, 74, 20);
		panel_1.add(btnLogin);
	}
}
