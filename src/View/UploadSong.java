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
	private JTextField txtfldNew;
	
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
		frame.setBounds(100, 100, 282, 345);
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
		lblUplSong.setBounds(10, 0, 196, 56);
		pnlHeader.add(lblUplSong);
		
		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(UploadSong.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		lblX.setBounds(266, 0, 16, 16);
		pnlHeader.add(lblX);
		
		JPanel pnlBody = new JPanel();
		pnlBody.setBackground(new Color(108, 122, 137));
		pnlBody.setBounds(0, 56, 282, 294);
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
		txtfldTitle.setBackground(new Color(108, 122, 137));
		txtfldTitle.setForeground(new Color(228, 241, 254));
		txtfldTitle.setBounds(50, 12, 222, 20);
		pnlBody.add(txtfldTitle);
		txtfldTitle.setColumns(10);
		
		txtfldYear = new JTextField();
		txtfldYear.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldYear.setBackground(new Color(108, 122, 137));
		txtfldYear.setForeground(new Color(228, 241, 254));
		txtfldYear.setBounds(50, 42, 222, 20);
		pnlBody.add(txtfldYear);
		txtfldYear.setColumns(10);
		
		JButton btnAlbCov = new JButton("Upload Cover");
		btnAlbCov.setOpaque(true);
		btnAlbCov.setBackground(new Color(34, 167, 240));
		btnAlbCov.setBorderPainted(true);
		btnAlbCov.setFont(new Font("Agency FB", Font.PLAIN, 16));
		btnAlbCov.setForeground(Color.WHITE);
		btnAlbCov.setHorizontalAlignment(btnAlbCov.CENTER);
		btnAlbCov.setBounds(156, 186, 116, 21);
		pnlBody.add(btnAlbCov);
                
        JButton btnUpl = new JButton("Upload");
        btnUpl.setOpaque(true);
        btnUpl.setBackground(new Color(0, 153, 51));
        btnUpl.setBorderPainted(true);
        btnUpl.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btnUpl.setForeground(Color.WHITE);
        btnUpl.setHorizontalAlignment(btnUpl.CENTER);
		btnUpl.setBounds(89, 255, 98, 20);
		pnlBody.add(btnUpl);
		
		JLabel lblAlbum = new JLabel("Album:");
		lblAlbum.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlbum.setForeground(new Color(236, 240, 241));
		lblAlbum.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAlbum.setBounds(10, 104, 40, 20);
		pnlBody.add(lblAlbum);
		
		JComboBox cmbboxAlb = new JComboBox();
		cmbboxAlb.setBounds(79, 105, 193, 20);
		pnlBody.add(cmbboxAlb);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setForeground(new Color(236, 240, 241));
		lblYear.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblYear.setBounds(10, 41, 30, 20);
		pnlBody.add(lblYear);
		
		JLabel lblAlbCov = new JLabel("Album Cover (New Album):");
		lblAlbCov.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlbCov.setForeground(new Color(236, 240, 241));
		lblAlbCov.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAlbCov.setBounds(10, 187, 152, 20);
		pnlBody.add(lblAlbCov);
		
		txtfldArt = new JTextField();
		txtfldArt.setForeground(new Color(228, 241, 254));
		txtfldArt.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldArt.setColumns(10);
		txtfldArt.setBackground(new Color(108, 122, 137));
		txtfldArt.setBounds(50, 72, 222, 20);
		pnlBody.add(txtfldArt);
		
		JLabel lblArtist = new JLabel("Artist:");
		lblArtist.setHorizontalAlignment(SwingConstants.LEFT);
		lblArtist.setForeground(new Color(236, 240, 241));
		lblArtist.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblArtist.setBounds(10, 72, 40, 20);
		pnlBody.add(lblArtist);
		
		JRadioButton radbtnAlb = new JRadioButton("");
		radbtnAlb.setOpaque(false);
		radbtnAlb.setBounds(50, 104, 21, 23);
		pnlBody.add(radbtnAlb);
		
		JRadioButton radbtnNew = new JRadioButton("");
		radbtnNew.setOpaque(false);
		radbtnNew.setBounds(50, 131, 21, 23);
		pnlBody.add(radbtnNew);
		
		JRadioButton radbtnNone = new JRadioButton("");
		radbtnNone.setOpaque(false);
		radbtnNone.setBounds(50, 157, 21, 23);
		pnlBody.add(radbtnNone);
		
		txtfldNew = new JTextField();
		txtfldNew.setForeground(new Color(228, 241, 254));
		txtfldNew.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldNew.setColumns(10);
		txtfldNew.setBackground(new Color(108, 122, 137));
		txtfldNew.setBounds(79, 134, 193, 20);
		pnlBody.add(txtfldNew);
		
		JLabel lblNone = new JLabel("None");
		lblNone.setHorizontalAlignment(SwingConstants.LEFT);
		lblNone.setForeground(new Color(236, 240, 241));
		lblNone.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblNone.setBounds(79, 157, 40, 20);
		pnlBody.add(lblNone);
		
		JLabel lblAudFil = new JLabel("Audio File*");
		lblAudFil.setHorizontalAlignment(SwingConstants.LEFT);
		lblAudFil.setForeground(new Color(236, 240, 241));
		lblAudFil.setFont(new Font("Agency FB", Font.PLAIN, 16));
		lblAudFil.setBounds(10, 218, 61, 20);
		pnlBody.add(lblAudFil);
		
		JButton btnAudFil = new JButton("Upload Song");
		btnAudFil.setOpaque(true);
		btnAudFil.setHorizontalAlignment(SwingConstants.CENTER);
		btnAudFil.setForeground(Color.WHITE);
		btnAudFil.setFont(new Font("Agency FB", Font.PLAIN, 16));
		btnAudFil.setBorderPainted(true);
		btnAudFil.setBackground(new Color(34, 167, 240));
		btnAudFil.setBounds(156, 218, 116, 21);
		pnlBody.add(btnAudFil);
	}
}
