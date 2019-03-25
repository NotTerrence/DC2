/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

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

public class CreatePlaylist {

	private JFrame frame;
	private JTextField txtfldPL;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePlaylist window = new CreatePlaylist(0);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CreatePlaylist(int userid) {
		initialize(userid);
	}

	private void initialize(int userid) {
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 152);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		panel.setBounds(0, 0, 276, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCrtPly = new JLabel("Create Playlist");
		lblCrtPly.setForeground(Color.WHITE);
		lblCrtPly.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblCrtPly.setBounds(10, 11, 184, 34);
		panel.add(lblCrtPly);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(108, 122, 137));
		panel_1.setBounds(0, 56, 276, 96);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPL = new JLabel("Playlist Name:");
		lblPL.setHorizontalAlignment(lblPL.CENTER);;
		lblPL.setForeground(new Color(236, 240, 241));
		lblPL.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblPL.setBounds(0, 11, 276, 30);
		panel_1.add(lblPL);;
		
		txtfldPL = new JTextField();
		txtfldPL.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldPL.setBackground(new Color(46, 49, 49));
		txtfldPL.setForeground(new Color(228, 241, 254));
		txtfldPL.setBounds(10, 37, 256, 20);
		panel_1.add(txtfldPL);
		txtfldPL.setColumns(10);
		
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
		btnCancel.setBounds(41, 68, 74, 20);
		panel_1.add(btnCancel);
                
        JButton btnDone = new JButton("Done");
        btnDone.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		String title = txtfldPL.getText();
                    
                    PreparedStatement st;
                    String query = "INSERT INTO `playlist`(`name`, `accountID`)"
                                + " VALUES(?, ?)";
                    
                    try {
                            st = MyConnection.getConnection().prepareStatement(query);
                            st.setString(1, title);
                            st.setInt(2, userid);
                            
                            if(st.executeUpdate() > 0)
                            {
                                JOptionPane.showMessageDialog(null, title + " has been added!");
                            }
            
                            } catch (SQLException ex) {
                                Logger.getLogger(signupFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
        		frame.dispose();
        	}
        });
        btnDone.setOpaque(true);
        btnDone.setBackground(new Color(34, 167, 240));
        btnDone.setBorderPainted(true);
        btnDone.setFont(new Font("Agency FB", Font.BOLD, 15));
        btnDone.setForeground(Color.WHITE);
        btnDone.setHorizontalAlignment(btnDone.CENTER);
		btnDone.setBounds(150, 68, 74, 20);
		panel_1.add(btnDone);
	}
}