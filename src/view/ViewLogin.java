package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ViewLogin extends JFrame {

	private Image img_logo = new ImageIcon(ViewLogin.class.getResource("/images/peoples-login.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_username = new ImageIcon(ViewLogin.class.getResource("/images/businessman.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(ViewLogin.class.getResource("/images/lock-icon.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_login = new ImageIcon(ViewLogin.class.getResource("/images/key-icon.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblUserMessageLogin = new JLabel("");
	
	private Dashboard dash;
	private ViewUser viewUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewLogin() {
		
		dash = new Dashboard();
		viewUser = new ViewUser();
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setLocation(-173, -157);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(32, 178, 170), 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(173, 164, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().trim().replace(" ", "").replace("á", "a").equals("Nomedousuario")) {
					txtUsername.setText("");
				} else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals("")) {
					txtUsername.setText("Nome do usuário");
				}
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtUsername.setText("Nome do usuário");
		txtUsername.setBounds(12, 12, 170, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUser_Name = new JLabel("");
		lblUser_Name.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser_Name.setBounds(179, 0, 71, 40);
		panel.add(lblUser_Name);
		lblUser_Name.setIcon(new ImageIcon(img_username));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(32, 178, 170), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(173, 216, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Senha")) {
					txtPassword.setEchoChar('*');
					txtPassword.setText("");
				} else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Senha");
					txtPassword.setEchoChar((char) 0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char) 0);
		txtPassword.setText("Senha");
		txtPassword.setBounds(12, 12, 170, 20);
		panel_1.add(txtPassword);
		
		JLabel lblPwd = new JLabel("");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setBounds(174, 0, 76, 40);
		panel_1.add(lblPwd);
		lblPwd.setIcon(new ImageIcon(img_password));
		
		JPanel pLogin = new JPanel();
		pLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pLogin.setBackground(Color.GREEN);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pLogin.setBackground(Color.GRAY);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin123")) {
					System.out.println("Usuário logado com sucesso!!!");
					dash.show();
				} else if(txtUsername.getText().equals("") || 
						txtUsername.getText().equals(txtUsername.getText().trim().replace(" ", "").replace("á", "a").equals("Nomedousuario")) || 
						txtPassword.getText().equals("") || txtPassword.getText().equals("Senha")) {
					lblUserMessageLogin.setText("Verique se os dados estão corretos.");
				} else {
					lblUserMessageLogin.setText("Usuário inválido.");
				}
			}
		});
		pLogin.setBackground(Color.GRAY);
		pLogin.setBounds(173, 297, 250, 50);
		contentPane.add(pLogin);
		pLogin.setLayout(null);
		
		JLabel lblName_Login = new JLabel("Login");
		lblName_Login.setForeground(Color.WHITE);
		lblName_Login.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		lblName_Login.setBounds(107, 12, 110, 26);
		pLogin.add(lblName_Login);
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(180, 0, 70, 50);
		pLogin.add(lblLogin);
		lblLogin.setIcon(new ImageIcon(img_login));
		
		
		JLabel lblX = new JLabel("x");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Você realmente deseja finalizar a aplicação?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					ViewLogin.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
		});
		
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Dialog", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(568, 12, 20, 20);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(173, 37, 250, 114);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_logo));
		lblUserMessageLogin.setFont(new Font("Dialog", Font.BOLD, 11));
		
		lblUserMessageLogin.setBounds(173, 269, 250, 20);
		contentPane.add(lblUserMessageLogin);
		setLocationRelativeTo(null);
	}
}
