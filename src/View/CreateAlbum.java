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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CreateAlbum {

	private JFrame frame;
	private JTextField txtfldTitle;
	private JTextField txtfldArt;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAlbum window = new CreateAlbum(0);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CreateAlbum(int userid) {
		initialize(userid);
	}

	private void initialize(int userid) {
		frame = new JFrame("Upload Song");
		frame.setBounds(100, 100, 282, 194);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(103, 128, 159));
		pnlHeader.setBounds(0, 0, 282, 56);
		frame.getContentPane().add(pnlHeader);
		pnlHeader.setLayout(null);
		
		JLabel lblCrtAlb = new JLabel("Create Album");
		lblCrtAlb.setHorizontalAlignment(SwingConstants.LEFT);
		lblCrtAlb.setForeground(Color.WHITE);
		lblCrtAlb.setFont(new Font("Agency FB", Font.PLAIN, 35));
		lblCrtAlb.setBounds(10, 0, 142, 56);
		pnlHeader.add(lblCrtAlb);
		
		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(CreateAlbum.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		lblX.setBounds(266, 0, 16, 16);
		pnlHeader.add(lblX);
                lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		
		JPanel pnlBody = new JPanel();
		pnlBody.setBackground(new Color(108, 122, 137));
		pnlBody.setBounds(0, 56, 282, 138);
		frame.getContentPane().add(pnlBody);
		pnlBody.setLayout(null);
		
		JLabel lblTitle = new JLabel("Name:");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);;
		lblTitle.setForeground(new Color(236, 240, 241));
		lblTitle.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblTitle.setBounds(10, 11, 30, 20);
		pnlBody.add(lblTitle);;
		
		txtfldTitle = new JTextField();
		txtfldTitle.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldTitle.setBackground(new Color(46, 49, 49));
		txtfldTitle.setForeground(new Color(228, 241, 254));
		txtfldTitle.setBounds(50, 12, 222, 20);
		pnlBody.add(txtfldTitle);
		txtfldTitle.setColumns(10);
		
		txtfldArt = new JTextField();
		txtfldArt.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldArt.setBackground(new Color(46, 49, 49));
		txtfldArt.setForeground(new Color(228, 241, 254));
		txtfldArt.setBounds(50, 42, 222, 20);
		pnlBody.add(txtfldArt);
		txtfldArt.setColumns(10);
		
		JButton btnAlbCov = new JButton("Upload Cover");
		btnAlbCov.setOpaque(true);
		btnAlbCov.setBackground(new Color(34, 167, 240));
		btnAlbCov.setBorderPainted(true);
		btnAlbCov.setFont(new Font("Agency FB", Font.PLAIN, 16));
		btnAlbCov.setForeground(Color.WHITE);
		btnAlbCov.setHorizontalAlignment(btnAlbCov.CENTER);
		btnAlbCov.setBounds(156, 73, 116, 21);
		pnlBody.add(btnAlbCov);
                
                JButton btnUpl = new JButton("Upload");
                btnUpl.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
        	
                        PreparedStatement st;
                        String query = "INSERT INTO `album`(`title`, `artist`, `uploaderID`)"
                                + " VALUES(?, ?, ?)";
                    
                        try {
                                st = MyConnection.getConnection().prepareStatement(query);
                                st.setString(1, txtfldTitle.getText());
                                st.setString(2, txtfldArt.getText());
                                st.setInt(3, userid);
                            

                                if(st.executeUpdate() > 0)
                                {
                                    JOptionPane.showMessageDialog(null, txtfldTitle.getText() + " has been added!");
                                }
            
                                } catch (SQLException ex) {
                                    Logger.getLogger(SignupFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }
                    
        		frame.dispose();
                    }
                });
                btnUpl.setOpaque(true);
                btnUpl.setBackground(new Color(0, 153, 51));
                btnUpl.setBorderPainted(true);
                btnUpl.setFont(new Font("Agency FB", Font.PLAIN, 16));
                btnUpl.setForeground(Color.WHITE);
                btnUpl.setHorizontalAlignment(btnUpl.CENTER);
		btnUpl.setBounds(87, 105, 98, 20);
		pnlBody.add(btnUpl);
		
		JLabel lblYear = new JLabel("Artist:");
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setForeground(new Color(236, 240, 241));
		lblYear.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblYear.setBounds(10, 41, 30, 20);
		pnlBody.add(lblYear);
		
		JLabel lblAlbCov = new JLabel("Album Cover (New Album):");
		lblAlbCov.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlbCov.setForeground(new Color(236, 240, 241));
		lblAlbCov.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAlbCov.setBounds(10, 74, 120, 20);
		pnlBody.add(lblAlbCov);
	}
}
