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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginPage {

	private JFrame frame;
	private JTextField txtfldUN;
	private JTextField txtfldPW;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 197, 261);
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
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblLogin.setBounds(10, 11, 65, 34);
		panel.add(lblLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(108, 122, 137));
		panel_1.setBounds(0, 56, 197, 205);
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
		
		txtfldPW = new JTextField();
		txtfldPW.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldPW.setBackground(new Color(46, 49, 49));
		txtfldPW.setForeground(new Color(228, 241, 254));
		txtfldPW.setBounds(10, 94, 177, 20);
		panel_1.add(txtfldPW);
		txtfldPW.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		btnExit.setOpaque(true);
		btnExit.setBackground(new Color(192, 57, 43));
		btnExit.setBorderPainted(true);
		btnExit.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnExit.setForeground(Color.WHITE);
		btnExit.setHorizontalAlignment(btnExit.CENTER);
		btnExit.setBounds(20, 125, 74, 20);
		panel_1.add(btnExit);
                
        JButton btnLogin = new JButton("Login");
        btnLogin.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		PreparedStatement st;
                        String query = "SELECT * from users where username = ? and password = ?";
            
                    try {
                        String username = txtfldUN.getText();
                        st = MyConnection.getConnection().prepareStatement(query);
                        st.setString(1, username);
                        st.setString(2, txtfldPW.getText());
                        ResultSet rs = st.executeQuery();
                    if(rs.next()){
                        frame.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "User/Password incorrect.");
                        txtfldUN.setText("");
                        txtfldPW.setText("");
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
		
		JButton btnGuest = new JButton("Login as Guest");
		btnGuest.setForeground(Color.CYAN);
		btnGuest.setOpaque(false);
		btnGuest.setContentAreaFilled(false);
		btnGuest.setBorderPainted(false);
		btnGuest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new GuestFrame();
				frame.dispose();
			}
		});
		btnGuest.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnGuest.setBounds(40, 156, 112, 20);
		panel_1.add(btnGuest);
		
		JButton btnCrtAcc = new JButton("Create a new account!");
		btnCrtAcc.setForeground(Color.CYAN);
		btnCrtAcc.setOpaque(false);
		btnCrtAcc.setContentAreaFilled(false);
		btnCrtAcc.setBorderPainted(false);
		btnCrtAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignupFrame();
				frame.dispose();
			}
		});
		btnCrtAcc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCrtAcc.setBounds(20, 175, 158, 20);
		panel_1.add(btnCrtAcc);
	}
}
