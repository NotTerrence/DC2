package View;

import java.sql.*;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.BevelBorder;

public class MainFrame {

	private JFrame frame;
	private JLayeredPane layeredPane;
	private JLabel lblUN;

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
		frame.setAlwaysOnTop(false);
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
		
		JPanel pnlPlayer = new JPanel();
		pnlPlayer.setBounds(10, 697, 1340, 61);
		pnlPlayer.setBackground(new Color(46,49,49));
		frame.getContentPane().add(pnlPlayer);
		
		JPanel pnlMainbtns = new JPanel();
		pnlMainbtns.setBackground(new Color(46, 49, 49));
		pnlMainbtns.setBounds(10, 22, 243, 609);
		frame.getContentPane().add(pnlMainbtns);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 49, 49));
		panel.setBounds(263, 642, 834, 44);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 49, 49));
		panel_1.setBounds(1107, 334, 243, 352);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(46, 49, 49));
		panel_2.setBounds(1107, 22, 243, 301);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(46, 49, 49));
		panel_3.setBounds(263, 22, 834, 609);
		frame.getContentPane().add(panel_3);
        }
}

