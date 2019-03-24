package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MyProfile {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyProfile window = new MyProfile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyProfile() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 240, 159);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(103, 128, 159));
		panel.setBounds(0, 0, 240, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMyProfile = new JLabel("My Profile");
		lblMyProfile.setForeground(Color.WHITE);
		lblMyProfile.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblMyProfile.setBounds(10, 0, 159, 56);
		panel.add(lblMyProfile);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblWelcome.setBounds(148, 11, 66, 20);
		panel.add(lblWelcome);
		
		JLabel label_2 = new JLabel("<Insert Username>");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Agency FB", Font.BOLD, 17));
		label_2.setBounds(134, 27, 103, 20);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(108, 122, 137));
		panel_1.setBounds(0, 56, 240, 103);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFaveSong = new JLabel("Favorite Song:");
		lblFaveSong.setHorizontalAlignment(lblFaveSong.CENTER);;
		lblFaveSong.setForeground(new Color(236, 240, 241));
		lblFaveSong.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblFaveSong.setBounds(10, 11, 74, 20);
		panel_1.add(lblFaveSong);;
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		
		btnBack.setOpaque(true);
		btnBack.setBackground(new Color(192, 57, 43));
		btnBack.setBorderPainted(true);
		btnBack.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnBack.setForeground(Color.WHITE);
		btnBack.setHorizontalAlignment(btnBack.CENTER);
		btnBack.setBounds(35, 73, 74, 20);
		panel_1.add(btnBack);
                
        JButton btnDone = new JButton("Done");
        btnDone.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		frame.dispose();
        	}
        });
        btnDone.setOpaque(true);
        btnDone.setBackground(new Color(34, 167, 240));
        btnDone.setBorderPainted(true);
        btnDone.setFont(new Font("Agency FB", Font.BOLD, 15));
        btnDone.setForeground(Color.WHITE);
        btnDone.setHorizontalAlignment(btnDone.CENTER);
		btnDone.setBounds(126, 73, 74, 20);
		panel_1.add(btnDone);
		
		JLabel lblFavoritePlaylist = new JLabel("Favorite Playlist:");
		lblFavoritePlaylist.setHorizontalAlignment(SwingConstants.CENTER);
		lblFavoritePlaylist.setForeground(new Color(236, 240, 241));
		lblFavoritePlaylist.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblFavoritePlaylist.setBounds(10, 42, 85, 20);
		panel_1.add(lblFavoritePlaylist);
		
		textField = new JTextField();
		textField.setBounds(94, 11, 136, 20);
		textField.setBackground(new Color(46, 49, 49));
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 42, 125, 20);
		textField_1.setBackground(new Color(46, 49, 49));
		panel_1.add(textField_1);
		textField_1.setColumns(10);
	}
}