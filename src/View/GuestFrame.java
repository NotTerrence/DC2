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
import javax.swing.JTextField;

public class GuestFrame {

	private JFrame frame;
	private JTextField txtfldUN;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestFrame window = new GuestFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuestFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 197, 156);
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
		
		JLabel lblLogin = new JLabel("GUEST");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblLogin.setBounds(10, 11, 74, 34);
		panel.add(lblLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(108, 122, 137));
		panel_1.setBounds(0, 56, 197, 100);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(lblUsername.CENTER);;
		lblUsername.setForeground(new Color(236, 240, 241));
		lblUsername.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblUsername.setBounds(10, 11, 177, 30);
		panel_1.add(lblUsername);;
		
		txtfldUN = new JTextField();
		txtfldUN.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldUN.setBackground(new Color(46, 49, 49));
		txtfldUN.setForeground(new Color(228, 241, 254));
		txtfldUN.setBounds(10, 37, 177, 20);
		panel_1.add(txtfldUN);
		txtfldUN.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		
		btnCancel.setOpaque(true);
		btnCancel.setBackground(new Color(192, 57, 43));
		btnCancel.setBorderPainted(true);
		btnCancel.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setHorizontalAlignment(btnCancel.CENTER);
		btnCancel.setBounds(20, 67, 74, 20);
		panel_1.add(btnCancel);
                
        JButton btnSignin = new JButton("Sign In");
        btnSignin.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		String guestname = txtfldUN.getText();
        
        		PreparedStatement st;
        		String query = "INSERT INTO `guests`(`guest_name`)"
                		+ "VALUES(?)";
        
        		try {
            			st = MyConnection.getConnection().prepareStatement(query);
            			st.setString(1, guestname);
            
            		if(st.executeUpdate() > 0)
            		{
                		JOptionPane.showMessageDialog(null, "Logged in as " + guestname + "!");
            		}
            
        		} catch (SQLException ex) {
            		Logger.getLogger(SignupFrame.class.getName()).log(Level.SEVERE, null, ex);
        		}
        		frame.dispose();
        	}
        });
        btnSignin.setOpaque(true);
        btnSignin.setBackground(new Color(34, 167, 240));
        btnSignin.setBorderPainted(true);
        btnSignin.setFont(new Font("Agency FB", Font.BOLD, 15));
        btnSignin.setForeground(Color.WHITE);
        btnSignin.setHorizontalAlignment(btnSignin.CENTER);
		btnSignin.setBounds(104, 67, 74, 20);
		panel_1.add(btnSignin);
	}
}