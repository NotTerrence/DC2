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

public class UploadSong {

	private JFrame frame;
	private JTextField txtfldTitle;
	private JTextField txtfldYear;
	private JTextField txtfldArt;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UploadSong window = new UploadSong();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UploadSong() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Upload Song");
		frame.setBounds(100, 100, 282, 375);
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
		
		JLabel lblUplSong = new JLabel("Upload Song");
		lblUplSong.setHorizontalAlignment(SwingConstants.LEFT);
		lblUplSong.setForeground(Color.WHITE);
		lblUplSong.setFont(new Font("Agency FB", Font.PLAIN, 35));
		lblUplSong.setBounds(10, 0, 132, 56);
		pnlHeader.add(lblUplSong);
		
		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(UploadSong.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		lblX.setBounds(266, 0, 16, 16);
		pnlHeader.add(lblX);
		
		JPanel pnlBody = new JPanel();
		pnlBody.setBackground(new Color(108, 122, 137));
		pnlBody.setBounds(0, 56, 282, 308);
		frame.getContentPane().add(pnlBody);
		pnlBody.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title:");
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
		
		txtfldYear = new JTextField();
		txtfldYear.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldYear.setBackground(new Color(46, 49, 49));
		txtfldYear.setForeground(new Color(228, 241, 254));
		txtfldYear.setBounds(50, 42, 222, 20);
		pnlBody.add(txtfldYear);
		txtfldYear.setColumns(10);
                
        JButton btnUpl = new JButton("Upload");
        btnUpl.setOpaque(true);
        btnUpl.setBackground(new Color(0, 153, 51));
        btnUpl.setBorderPainted(true);
        btnUpl.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnUpl.setForeground(Color.WHITE);
        btnUpl.setHorizontalAlignment(btnUpl.CENTER);
		btnUpl.setBounds(92, 275, 98, 20);
		pnlBody.add(btnUpl);
		
		JLabel lblAlbum = new JLabel("Album:");
		lblAlbum.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlbum.setForeground(new Color(236, 240, 241));
		lblAlbum.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAlbum.setBounds(10, 210, 40, 20);
		pnlBody.add(lblAlbum);
		
		JComboBox cmbboxAlb = new JComboBox();
		cmbboxAlb.setBounds(50, 211, 222, 20);
		pnlBody.add(cmbboxAlb);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setForeground(new Color(236, 240, 241));
		lblYear.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblYear.setBounds(10, 41, 30, 20);
		pnlBody.add(lblYear);
		
		txtfldArt = new JTextField();
		txtfldArt.setForeground(new Color(228, 241, 254));
		txtfldArt.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldArt.setColumns(10);
		txtfldArt.setBackground(new Color(46, 49, 49));
		txtfldArt.setBounds(50, 72, 222, 20);
		pnlBody.add(txtfldArt);
		
		JLabel lblArtist = new JLabel("Artist:");
		lblArtist.setHorizontalAlignment(SwingConstants.LEFT);
		lblArtist.setForeground(new Color(236, 240, 241));
		lblArtist.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblArtist.setBounds(10, 72, 40, 20);
		pnlBody.add(lblArtist);
		
		JLabel lblAudFil = new JLabel("Audio File*");
		lblAudFil.setHorizontalAlignment(SwingConstants.LEFT);
		lblAudFil.setForeground(new Color(236, 240, 241));
		lblAudFil.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAudFil.setBounds(10, 241, 45, 20);
		pnlBody.add(lblAudFil);
		
		JButton btnAudFil = new JButton("Upload Song");
		btnAudFil.setOpaque(true);
		btnAudFil.setHorizontalAlignment(SwingConstants.CENTER);
		btnAudFil.setForeground(Color.WHITE);
		btnAudFil.setFont(new Font("Agency FB", Font.PLAIN, 16));
		btnAudFil.setBorderPainted(true);
		btnAudFil.setBackground(new Color(34, 167, 240));
		btnAudFil.setBounds(156, 241, 116, 21);
		pnlBody.add(btnAudFil);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenre.setForeground(new Color(236, 240, 241));
		lblGenre.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblGenre.setBounds(10, 99, 40, 20);
		pnlBody.add(lblGenre);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setOpaque(false);
		radioButton.setBounds(50, 99, 21, 23);
		pnlBody.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setOpaque(false);
		radioButton_1.setBounds(50, 126, 21, 23);
		pnlBody.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setOpaque(false);
		radioButton_2.setBounds(50, 152, 21, 23);
		pnlBody.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setOpaque(false);
		radioButton_3.setBounds(50, 178, 21, 23);
		pnlBody.add(radioButton_3);
		
		JLabel lblPop = new JLabel("Pop");
		lblPop.setForeground(Color.WHITE);
		lblPop.setHorizontalAlignment(SwingConstants.LEFT);
		lblPop.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblPop.setBounds(79, 103, 46, 14);
		pnlBody.add(lblPop);
		
		JLabel lblRock = new JLabel("Rock");
		lblRock.setForeground(Color.WHITE);
		lblRock.setHorizontalAlignment(SwingConstants.LEFT);
		lblRock.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblRock.setBounds(79, 129, 46, 14);
		pnlBody.add(lblRock);
		
		JLabel lblJazz = new JLabel("Jazz");
		lblJazz.setForeground(Color.WHITE);
		lblJazz.setHorizontalAlignment(SwingConstants.LEFT);
		lblJazz.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblJazz.setBounds(79, 156, 46, 14);
		pnlBody.add(lblJazz);
		
		JLabel lblClassical = new JLabel("Classical");
		lblClassical.setForeground(Color.WHITE);
		lblClassical.setHorizontalAlignment(SwingConstants.LEFT);
		lblClassical.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblClassical.setBounds(79, 182, 46, 14);
		pnlBody.add(lblClassical);
	}
}
