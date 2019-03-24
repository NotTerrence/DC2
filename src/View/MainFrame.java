package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Frame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.BevelBorder;

public class MainFrame {

	private JFrame frame;
	private JLayeredPane layeredPane;
	private JTable tblDash;
	private JTable tblPL;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame("Music Applet");
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setBackground(new Color(108,122,137));
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlTop = new JPanel();
		pnlTop.setBounds(1328, 0, 32, 16);
		pnlTop.setBackground(new Color(34,49,63));
		frame.getContentPane().add(pnlTop);
		pnlTop.setLayout(null);
		
		JLabel lblClose = new JLabel("");
		lblClose.setBounds(16, 0, 16, 16);
		pnlTop.add(lblClose);
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setIcon(new ImageIcon(MainFrame.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		
		JLabel lblMnmz = new JLabel("");
		lblMnmz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setState(frame.ICONIFIED);
			}
		});
		lblMnmz.setBounds(0, 0, 16, 16);
		pnlTop.add(lblMnmz);
		lblMnmz.setIcon(new ImageIcon(MainFrame.class.getResource("/javax/swing/plaf/metal/icons/ocean/iconify.gif")));
		
		JPanel pnlBottom = new JPanel();
		pnlBottom.setBounds(0, 717, 1360, 52);
		pnlBottom.setBackground(new Color(46,49,49));
		frame.getContentPane().add(pnlBottom);
		
		JPanel pnlSide = new JPanel();
		pnlSide.setBounds(0, 0, 214, 769);
		pnlSide.setBackground(new Color(103,128,159));
		frame.getContentPane().add(pnlSide);
		pnlSide.setLayout(null);
		
		JLabel lblDc = new JLabel("DC2");
		lblDc.setForeground(Color.CYAN);
		lblDc.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 57));
		lblDc.setHorizontalAlignment(SwingConstants.LEFT);
		lblDc.setBounds(10, 11, 194, 114);
		pnlSide.add(lblDc);
		
		JScrollPane scrpnPL = new JScrollPane();
		scrpnPL.setViewportBorder(null);
		scrpnPL.setOpaque(false);
		scrpnPL.getViewport().setOpaque(false);
		scrpnPL.setBounds(10, 247, 194, 459);
		pnlSide.add(scrpnPL);
		
		tblPL = new JTable();
		tblPL.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Playlists"
			}
		));
		tblPL.setBackground(new Color(103,128,159));
		tblPL.setForeground(new Color(228, 241, 254));
		scrpnPL.setViewportView(tblPL);
		
		JButton btnCreatePlaylist = new JButton("Create Playlist");
		btnCreatePlaylist.setForeground(Color.WHITE);
		btnCreatePlaylist.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnCreatePlaylist.setBackground(new Color(34, 167, 240));
		btnCreatePlaylist.setBounds(10, 213, 119, 23);
		pnlSide.add(btnCreatePlaylist);
		
		JLabel label = new JLabel("My Profile");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Agency FB", Font.PLAIN, 40));
		label.setBounds(10, 99, 159, 56);
		pnlSide.add(label);
		
		JLabel label_1 = new JLabel("Favorite Song:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(236, 240, 241));
		label_1.setFont(new Font("Agency FB", Font.PLAIN, 17));
		label_1.setBounds(10, 151, 74, 20);
		pnlSide.add(label_1);
		
		JLabel label_2 = new JLabel("<Insert song here>");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(236, 240, 241));
		label_2.setFont(new Font("Agency FB", Font.PLAIN, 17));
		label_2.setBounds(83, 151, 147, 20);
		pnlSide.add(label_2);
		
		JLabel label_3 = new JLabel("<Insert playlist here>");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(236, 240, 241));
		label_3.setFont(new Font("Agency FB", Font.PLAIN, 17));
		label_3.setBounds(93, 171, 137, 20);
		pnlSide.add(label_3);
		
		JLabel label_4 = new JLabel("Favorite Playlist:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(236, 240, 241));
		label_4.setFont(new Font("Agency FB", Font.PLAIN, 17));
		label_4.setBounds(10, 171, 85, 20);
		pnlSide.add(label_4);
		
		JScrollPane scrpnDash = new JScrollPane();
		scrpnDash.setViewportBorder(null);
		scrpnDash.setOpaque(false);
		scrpnDash.getViewport().setOpaque(false);
		
		JPanel pnlAC = new JPanel();
		pnlAC.setBackground(Color.BLACK);
		pnlAC.setBounds(224, 53, 214, 183);
		frame.getContentPane().add(pnlAC);
		pnlAC.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<INSERT ALBUM COVER HERE>");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 21));
		lblNewLabel.setBounds(10, 11, 194, 161);
		pnlAC.add(lblNewLabel);
		scrpnDash.setBounds(224, 247, 1126, 459);
		frame.getContentPane().add(scrpnDash);
		
		tblDash = new JTable();
		tblDash.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Title", "Album", "Genre", "Year", "Artist"
			}
		));
		tblDash.setBackground(new Color(108, 122, 137));
		tblDash.setForeground(new Color(228, 241, 254));
		scrpnDash.setViewportView(tblDash);
		
		JButton btnLoginAsGuest = new JButton("Login as Guest");
		btnLoginAsGuest.setBackground(new Color(1,50,67));
		btnLoginAsGuest.setForeground(Color.WHITE);
		btnLoginAsGuest.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnLoginAsGuest.setBounds(965, 0, 111, 23);
		frame.getContentPane().add(btnLoginAsGuest);
		
		JButton btnCreateANew = new JButton("Create a new account!");
		btnCreateANew.setBackground(new Color(44,62,80));
		btnCreateANew.setForeground(Color.WHITE);
		btnCreateANew.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnCreateANew.setBounds(1086, 0, 156, 23);
		frame.getContentPane().add(btnCreateANew);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(0, 153, 51));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnLogin.setBounds(787, 0, 66, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRefreshDashboard = new JButton("Refresh Dashboard");
		btnRefreshDashboard.setForeground(Color.WHITE);
		btnRefreshDashboard.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnRefreshDashboard.setBackground(new Color(34,167,240));
		btnRefreshDashboard.setBounds(1215, 213, 135, 23);
		frame.getContentPane().add(btnRefreshDashboard);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnLogout.setBackground(new Color(192, 57, 43));
		btnLogout.setBounds(1252, 0, 66, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnUploadSong = new JButton("Upload Song");
		btnUploadSong.setForeground(Color.WHITE);
		btnUploadSong.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnUploadSong.setBackground(new Color(0, 153, 51));
		btnUploadSong.setBounds(1104, 213, 101, 23);
		frame.getContentPane().add(btnUploadSong);
		
		JButton btnMyProfile = new JButton("My Profile");
		btnMyProfile.setForeground(Color.WHITE);
		btnMyProfile.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnMyProfile.setBackground(new Color(30, 130, 76));
		btnMyProfile.setBounds(863, 0, 92, 23);
		frame.getContentPane().add(btnMyProfile);
	}
}
