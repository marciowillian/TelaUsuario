package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private Image img_logo = new ImageIcon(ViewLogin.class.getResource("/images/peoples-login.png")).getImage()
			.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_home = new ImageIcon(ViewLogin.class.getResource("/images/home-icon.png")).getImage()
			.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_profile = new ImageIcon(ViewLogin.class.getResource("/images/profile-icon.jpg")).getImage()
			.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_signout = new ImageIcon(ViewLogin.class.getResource("/images/signout-icon.png")).getImage()
			.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_burger_menu = new ImageIcon(ViewLogin.class.getResource("/images/burger-menu-icon.png"))
			.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	
	int x = 300;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		
		setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(47, 79, 79));
		panelMenu.setBounds(0, 0, 300, 720);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 300, 142);
		panelMenu.add(panel);
		panel.setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(95, 23, 112, 93);
		panel.add(lblIcon);
		lblIcon.setIcon(new ImageIcon(img_logo));
		
		JLabel lblBurger = new JLabel("");
		lblBurger.setBounds(236, 12, 52, 40);
		panel.add(lblBurger);
		lblBurger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(x == 300) {
					panelMenu.setSize(300, 720);
					Thread th = new Thread(){
						@Override
						public void run(){
							try{
								for(int i = 300; i >= 0; i--){
									Thread.sleep(1);
									panelMenu.setSize(i,720);
								}
							} catch 
								(Exception e) {
									JOptionPane.showMessageDialog(null, e);
								}
							}
						};th.start();
						x = 0;
					}

				}
		});
		lblBurger.setBackground(new Color(47, 79, 79));
		lblBurger.setHorizontalAlignment(SwingConstants.CENTER);
		lblBurger.setIcon(new ImageIcon(img_burger_menu));
		
		JPanel pHome = new JPanel();
		pHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pHome.setBackground(new Color(51, 51, 51));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pHome.setBackground(new Color(47, 79, 79));
			}
		});
		pHome.setBackground(new Color(47, 79, 79));
		pHome.setBounds(0, 142, 300, 73);
		panelMenu.add(pHome);
		pHome.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setForeground(Color.WHITE);
		lblHome.setBounds(98, 12, 108, 36);
		pHome.add(lblHome);
		
		JLabel labelHomeIcon = new JLabel("");
		labelHomeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelHomeIcon.setBounds(0, 0, 70, 73);
		pHome.add(labelHomeIcon);
		labelHomeIcon.setIcon(new ImageIcon(img_home));
		
		JPanel pProfile = new JPanel();
		pProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pProfile.setBackground(new Color(51, 51, 51));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pProfile.setBackground(new Color(47, 79, 79));
			}
		});
		pProfile.setBackground(new Color(47, 79, 79));
		pProfile.setBounds(0, 215, 300, 73);
		panelMenu.add(pProfile);
		pProfile.setLayout(null);
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setBounds(98, 12, 108, 36);
		pProfile.add(lblProfile);
		
		JLabel labelProfileIcon = new JLabel("");
		labelProfileIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelProfileIcon.setBounds(0, 0, 70, 73);
		pProfile.add(labelProfileIcon);
		labelProfileIcon.setIcon(new ImageIcon(img_profile));
		
		JPanel pSignOut = new JPanel();
		pSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pSignOut.setBackground(new Color(51, 51, 51));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pSignOut.setBackground(new Color(47, 79, 79));
			}
		});
		pSignOut.setBackground(new Color(47, 79, 79));
		pSignOut.setBounds(0, 288, 300, 73);
		panelMenu.add(pSignOut);
		pSignOut.setLayout(null);
		
		JLabel lblSignout = new JLabel("Signout");
		lblSignout.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignout.setForeground(Color.WHITE);
		lblSignout.setBounds(98, 12, 108, 36);
		pSignOut.add(lblSignout);
		
		JLabel labelSignoutIcon = new JLabel("");
		labelSignoutIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelSignoutIcon.setBounds(0, 0, 70, 73);
		pSignOut.add(labelSignoutIcon);
		labelSignoutIcon.setIcon(new ImageIcon(img_signout));
		
		JLabel lblBurgerLeft = new JLabel("");
		lblBurgerLeft.setBounds(0, 12, 52, 40);
		contentPane.add(lblBurgerLeft);
		lblBurgerLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(x == 0) {
					panelMenu.show();
					panelMenu.setSize(x, 720);
					Thread th = new Thread(){
						@Override
						public void run(){
							try{
								for(int i = 0; i <= x; i++){
									Thread.sleep(1);
									panelMenu.setSize(i,720);
								}
							} catch 
								(Exception e) {
									JOptionPane.showMessageDialog(null, e);
								}
							}
						};th.start();
						x = 300;
					}				
				
				}
			
		});
		lblBurgerLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblBurgerLeft.setBackground(new Color(47, 79, 79));
		lblBurgerLeft.setIcon(new ImageIcon(img_burger_menu));
		setLocationRelativeTo(null);
	}
}
