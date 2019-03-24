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
import javax.swing.JRadioButton;

public class SongInfo {

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SongInfo window = new SongInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SongInfo() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Upload Song");
		frame.setBounds(100, 100, 313, 420);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(new Color(103, 128, 159));
		pnlHeader.setBounds(0, 0, 313, 56);
		frame.getContentPane().add(pnlHeader);
		pnlHeader.setLayout(null);
		
		JLabel lblUplSong = new JLabel("Song Information");
		lblUplSong.setHorizontalAlignment(SwingConstants.LEFT);
		lblUplSong.setForeground(Color.WHITE);
		lblUplSong.setFont(new Font("Agency FB", Font.PLAIN, 35));
		lblUplSong.setBounds(10, 0, 182, 56);
		pnlHeader.add(lblUplSong);
		
		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(SongInfo.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		lblX.setBounds(297, 0, 16, 16);
		pnlHeader.add(lblX);
		
		JPanel pnlBody = new JPanel();
		pnlBody.setBackground(new Color(108, 122, 137));
		pnlBody.setBounds(0, 56, 313, 364);
		frame.getContentPane().add(pnlBody);
		pnlBody.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);;
		lblTitle.setForeground(new Color(236, 240, 241));
		lblTitle.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblTitle.setBounds(10, 205, 30, 20);
		pnlBody.add(lblTitle);;
                
        JButton btnUpl = new JButton("Play");
        btnUpl.setOpaque(true);
        btnUpl.setBackground(new Color(0, 153, 51));
        btnUpl.setBorderPainted(true);
        btnUpl.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnUpl.setForeground(Color.WHITE);
        btnUpl.setHorizontalAlignment(btnUpl.CENTER);
		btnUpl.setBounds(120, 329, 67, 20);
		pnlBody.add(btnUpl);
		
		JLabel lblAlbum = new JLabel("Album:");
		lblAlbum.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlbum.setForeground(new Color(236, 240, 241));
		lblAlbum.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAlbum.setBounds(10, 267, 40, 20);
		pnlBody.add(lblAlbum);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setForeground(new Color(236, 240, 241));
		lblYear.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblYear.setBounds(10, 298, 30, 20);
		pnlBody.add(lblYear);
		
		JLabel lblAlbCov = new JLabel("Album Cover:");
		lblAlbCov.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlbCov.setForeground(new Color(236, 240, 241));
		lblAlbCov.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAlbCov.setBounds(10, 11, 59, 20);
		pnlBody.add(lblAlbCov);
		
		JLabel lblArtist = new JLabel("Artist:");
		lblArtist.setHorizontalAlignment(SwingConstants.LEFT);
		lblArtist.setForeground(new Color(236, 240, 241));
		lblArtist.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblArtist.setBounds(10, 235, 40, 20);
		pnlBody.add(lblArtist);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(79, 11, 214, 183);
		pnlBody.add(panel);
		
		JLabel label = new JLabel("<INSERT ALBUM COVER HERE>");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Agency FB", Font.PLAIN, 21));
		label.setBounds(10, 11, 194, 161);
		panel.add(label);
		
		JLabel label_1 = new JLabel("<Insert Title here>");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(236, 240, 241));
		label_1.setFont(new Font("Agency FB", Font.PLAIN, 16));
		label_1.setBounds(50, 205, 79, 20);
		pnlBody.add(label_1);
		
		JLabel label_2 = new JLabel("<Insert Album Name here>");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(new Color(236, 240, 241));
		label_2.setFont(new Font("Agency FB", Font.PLAIN, 16));
		label_2.setBounds(50, 267, 114, 20);
		pnlBody.add(label_2);
		
		JLabel label_3 = new JLabel("<Insert Artist Name here>");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(new Color(236, 240, 241));
		label_3.setFont(new Font("Agency FB", Font.PLAIN, 16));
		label_3.setBounds(50, 236, 114, 20);
		pnlBody.add(label_3);
		
		JLabel label_4 = new JLabel("<Insert Year here>");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(new Color(236, 240, 241));
		label_4.setFont(new Font("Agency FB", Font.PLAIN, 16));
		label_4.setBounds(50, 298, 84, 20);
		pnlBody.add(label_4);
	}
}
