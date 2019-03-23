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

public class SignupFrame {

	private JFrame frame;
	private JTextField txtfldUN;
	private JTextField txtfldPW;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupFrame window = new SignupFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignupFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 197, 210);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 51));
		panel.setBounds(0, 0, 197, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("SIGN UP");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblLogin.setBounds(10, 11, 104, 34);
		panel.add(lblLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(0, 56, 197, 205);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(lblUsername.CENTER);;
		lblUsername.setForeground(new Color(236, 240, 241));
		lblUsername.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblUsername.setBounds(10, 11, 177, 30);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(lblPassword.CENTER);;
		lblPassword.setForeground(new Color(236, 240, 241));
		lblPassword.setFont(new Font("Agency FB", Font.PLAIN, 17));
		lblPassword.setBounds(10, 68, 177, 30);
		panel_1.add(lblPassword);
		
		txtfldUN = new JTextField();
		txtfldUN.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldUN.setBackground(new Color(108, 122, 137));
		txtfldUN.setForeground(new Color(228, 241, 254));
		txtfldUN.setBounds(10, 37, 177, 20);
		panel_1.add(txtfldUN);
		txtfldUN.setColumns(10);
		
		txtfldPW = new JTextField();
		txtfldPW.setFont(new Font("Arial", Font.PLAIN, 11));
		txtfldPW.setBackground(new Color(108, 122, 137));
		txtfldPW.setForeground(new Color(228, 241, 254));
		txtfldPW.setBounds(10, 94, 177, 20);
		panel_1.add(txtfldPW);
		txtfldPW.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				new LoginPage();
			}
		});
		
		btnCancel.setOpaque(true);
		btnCancel.setBackground(new Color(192, 57, 43));
		btnCancel.setBorderPainted(true);
		btnCancel.setFont(new Font("Agency FB", Font.BOLD, 15));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setHorizontalAlignment(btnCancel.CENTER);
		btnCancel.setBounds(20, 125, 74, 20);
		panel_1.add(btnCancel);
                
        JButton btnLogin = new JButton("Sign Up");
        btnLogin.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		frame.dispose();
        		new LoginPage();
        	}
        });
        btnLogin.setOpaque(true);
        btnLogin.setBackground(new Color(34, 167, 240));
        btnLogin.setBorderPainted(true);
        btnLogin.setFont(new Font("Agency FB", Font.BOLD, 15));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setHorizontalAlignment(btnLogin.CENTER);
		btnLogin.setBounds(104, 125, 74, 20);
		panel_1.add(btnLogin);
	}
}