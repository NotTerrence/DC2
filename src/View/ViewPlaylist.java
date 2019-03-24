import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class ViewPlaylist {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPlaylist window = new ViewPlaylist();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewPlaylist() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 197, 146);
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
		
		JLabel lblVP = new JLabel("PLAYLISTS");
		lblVP.setForeground(Color.WHITE);
		lblVP.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblVP.setBounds(10, 11, 119, 34);
		panel.add(lblVP);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(108, 122, 137));
		panel_1.setBounds(0, 56, 197, 90);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNowPlaying = new JLabel("Now Playing");
		lblNowPlaying.setForeground(Color.WHITE);
		lblNowPlaying.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNowPlaying.setBounds(10, 32, 66, 18);
		panel_1.add(lblNowPlaying);
		
		JLabel lblSong = new JLabel("Song 1:");
		lblSong.setForeground(Color.WHITE);
		lblSong.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblSong.setBounds(80, 11, 36, 14);
		panel_1.add(lblSong);
		
		JLabel lblSong_1 = new JLabel("Song 2:");
		lblSong_1.setForeground(Color.WHITE);
		lblSong_1.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblSong_1.setBounds(80, 36, 36, 14);
		panel_1.add(lblSong_1);
		
		JLabel lblSong_2 = new JLabel("Song 3:");
		lblSong_2.setForeground(Color.WHITE);
		lblSong_2.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblSong_2.setBounds(80, 61, 36, 14);
		panel_1.add(lblSong_2);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPlay.setBackground(new Color(0, 153, 51));
		btnPlay.setBounds(118, 34, 69, 18);
		panel_1.add(btnPlay);
		
		JButton btnPlay_1 = new JButton("Play");
		btnPlay_1.setForeground(Color.WHITE);
		btnPlay_1.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPlay_1.setBackground(new Color(0, 153, 51));
		btnPlay_1.setBounds(118, 9, 69, 18);
		panel_1.add(btnPlay_1);
		
		JButton btnPlay_2 = new JButton("Play");
		btnPlay_2.setForeground(Color.WHITE);
		btnPlay_2.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPlay_2.setBackground(new Color(0, 153, 51));
		btnPlay_2.setBounds(118, 59, 69, 18);
		panel_1.add(btnPlay_2);;;
	}
}
