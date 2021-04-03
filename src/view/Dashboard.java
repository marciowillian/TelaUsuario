package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import dao.UsuarioDAO;
import model.Usuario;

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
	
	//Dashboar Icons
	
	private Image img_user = new ImageIcon(ViewLogin.class.getResource("/images/users-icon.png"))
			.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private Image img_admin = new ImageIcon(ViewLogin.class.getResource("/images/admins-icon.png"))
			.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private Image img_total = new ImageIcon(ViewLogin.class.getResource("/images/db-icon.png"))
			.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private Image img_clima = new ImageIcon(ViewLogin.class.getResource("/images/clima-icon.png"))
			.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private Image img_hora = new ImageIcon(ViewLogin.class.getResource("/images/relogio-icon.png"))
			.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	
	int x = 300;
	private JPanel panelContentHome = new JPanel();
	private JPanel panelContentProfile = new JPanel();
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	
	private UsuarioDAO usuDAO;
	private Usuario usuario;
	
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

		usuario = new Usuario();
		usuDAO = new UsuarioDAO();
		
		setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelContentProfile.setBackground(new Color(0, 128, 128));
		panelContentProfile.setBounds(300, 0, 981, 720);
		contentPane.add(panelContentProfile);
		panelContentProfile.setLayout(null);
		
		JPanel cpDashBoard = new JPanel();
		cpDashBoard.setBounds(12, 144, 475, 400);
		panelContentProfile.add(cpDashBoard);
		cpDashBoard.setLayout(null);
		cpDashBoard.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cpDashBoard.setBackground(new Color(0, 128, 128));
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(null);
		panelCadastro.setBackground(new Color(47, 79, 79));
		panelCadastro.setBounds(77, 49, 314, 326);
		cpDashBoard.add(panelCadastro);
		
		JLabel lblCadastrarUsuario = new JLabel("Cadastrar Usuario");
		lblCadastrarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarUsuario.setForeground(Color.WHITE);
		lblCadastrarUsuario.setBounds(77, 12, 164, 38);
		panelCadastro.add(lblCadastrarUsuario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(14, 62, 93, 25);
		panelCadastro.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(14, 99, 93, 25);
		panelCadastro.add(lblEmail);
		
		JLabel lblTel = new JLabel("Telefone");
		lblTel.setForeground(Color.WHITE);
		lblTel.setBounds(14, 136, 93, 25);
		panelCadastro.add(lblTel);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setBounds(14, 173, 93, 25);
		panelCadastro.add(lblTipo);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(121, 62, 179, 25);
		panelCadastro.add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(121, 102, 179, 25);
		panelCadastro.add(txtEmail);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(121, 139, 179, 25);
		panelCadastro.add(txtTelefone);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setBounds(121, 173, 179, 25);
		panelCadastro.add(cbTipo);
		
		JPanel pCadastro = new JPanel();
		pCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pCadastro.setBackground(Color.GREEN);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pCadastro.setBackground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = txtNome.getText();
				
				usuario.setNome(txtNome.getText());
				usuario.setEmail(txtEmail.getText());
				usuario.setTelefone(txtTelefone.getText());
				usuario.setTipo(1);
				usuario.setDataCadastro(new Date());
				
				usuDAO.save(usuario);
				
				JOptionPane.showMessageDialog(null, "Usuário " + user + " cadastrado com sucesso!");
			}
		});
		pCadastro.setLayout(null);
		pCadastro.setBackground(Color.GRAY);
		pCadastro.setBounds(64, 254, 179, 47);
		panelCadastro.add(pCadastro);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setBackground(Color.WHITE);
		lblCadastrar.setBounds(51, 12, 88, 23);
		pCadastro.add(lblCadastrar);
		
		JPanel cpDashBoard_1 = new JPanel();
		cpDashBoard_1.setLayout(null);
		cpDashBoard_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cpDashBoard_1.setBackground(new Color(0, 128, 128));
		cpDashBoard_1.setBounds(499, 144, 475, 400);
		panelContentProfile.add(cpDashBoard_1);
		
		JPanel panelCadastro_1 = new JPanel();
		panelCadastro_1.setLayout(null);
		panelCadastro_1.setBackground(new Color(47, 79, 79));
		panelCadastro_1.setBounds(77, 49, 314, 326);
		cpDashBoard_1.add(panelCadastro_1);
		
		JLabel lblListasDeUsurios = new JLabel("Lista de Usuários");
		lblListasDeUsurios.setHorizontalAlignment(SwingConstants.CENTER);
		lblListasDeUsurios.setForeground(Color.WHITE);
		lblListasDeUsurios.setBounds(77, 12, 164, 38);
		panelCadastro_1.add(lblListasDeUsurios);
		
		JPanel pListar = new JPanel();
		pListar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pListar.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pListar.setBackground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Ainda falta implementar essa feature ;) kkk");
			}
		});
		pListar.setLayout(null);
		pListar.setBackground(Color.GRAY);
		pListar.setBounds(64, 254, 179, 47);
		panelCadastro_1.add(pListar);
		
		JLabel lblListar = new JLabel("Listar");
		lblListar.setForeground(Color.WHITE);
		lblListar.setBackground(Color.WHITE);
		lblListar.setBounds(67, 12, 88, 23);
		pListar.add(lblListar);
		
		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo!");
		lblSejaBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSejaBemVindo.setForeground(Color.WHITE);
		lblSejaBemVindo.setBounds(340, 52, 314, 25);
		panelContentProfile.add(lblSejaBemVindo);
		panelContentProfile.setVisible(false);
		
		panelContentHome.setBackground(new Color(0, 128, 128));
		panelContentHome.setBounds(300, 0, 981, 720);
		contentPane.add(panelContentHome);
		panelContentHome.setLayout(null);
		
		JPanel userList = new JPanel();
		userList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				userList.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				userList.setBackground(Color.DARK_GRAY);
			}
		});
		userList.setBackground(new Color(47, 79, 79));
		userList.setBounds(46, 140, 274, 237);
		panelContentHome.add(userList);
		userList.setLayout(null);
		
		JLabel lblUsurios = new JLabel("Usuários");
		lblUsurios.setForeground(Color.WHITE);
		lblUsurios.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsurios.setBounds(48, 12, 201, 33);
		userList.add(lblUsurios);
		
		JLabel lblUserIcon = new JLabel("");
		lblUserIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserIcon.setBounds(48, 57, 180, 149);
		userList.add(lblUserIcon);
		lblUserIcon.setIcon(new ImageIcon(img_user));
		
		JPanel adminList = new JPanel();
		adminList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminList.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				adminList.setBackground(Color.DARK_GRAY);
			}
		});
		adminList.setLayout(null);
		adminList.setBackground(new Color(47, 79, 79));
		adminList.setBounds(351, 140, 274, 237);
		panelContentHome.add(adminList);
		
		JLabel lblAdmnistradores = new JLabel("Admnistradores");
		lblAdmnistradores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmnistradores.setForeground(Color.WHITE);
		lblAdmnistradores.setBounds(41, 12, 201, 33);
		adminList.add(lblAdmnistradores);
		
		JLabel lblAdminIcon = new JLabel("");
		lblAdminIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAdminIcon.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAdminIcon.setBackground(Color.DARK_GRAY);
			}
		});
		lblAdminIcon.setBackground(UIManager.getColor("Button.darkShadow"));
		lblAdminIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminIcon.setBounds(51, 57, 180, 149);
		adminList.add(lblAdminIcon);
		lblAdminIcon.setIcon(new ImageIcon(img_admin));
		
		JPanel userTotal = new JPanel();
		userTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				userTotal.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				userTotal.setBackground(Color.DARK_GRAY);
			}
		});
		userTotal.setLayout(null);
		userTotal.setBackground(new Color(47, 79, 79));
		userTotal.setBounds(654, 140, 274, 237);
		panelContentHome.add(userTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setBounds(49, 12, 201, 33);
		userTotal.add(lblTotal);
		
		JLabel lblTotalUsersIcon = new JLabel("");
		lblTotalUsersIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalUsersIcon.setBounds(49, 51, 180, 149);
		userTotal.add(lblTotalUsersIcon);
		lblTotalUsersIcon.setIcon(new ImageIcon(img_total));
		
		JPanel clima = new JPanel();
		clima.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				clima.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				clima.setBackground(Color.DARK_GRAY);
			}
		});
		clima.setLayout(null);
		clima.setBackground(new Color(47, 79, 79));
		clima.setBounds(175, 407, 274, 237);
		panelContentHome.add(clima);
		
		JLabel lblClimaDeHoje = new JLabel("Clima de Hoje");
		lblClimaDeHoje.setHorizontalAlignment(SwingConstants.CENTER);
		lblClimaDeHoje.setForeground(Color.WHITE);
		lblClimaDeHoje.setBounds(41, 12, 201, 33);
		clima.add(lblClimaDeHoje);
		
		JLabel lblClimaIcon = new JLabel("");
		lblClimaIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClimaIcon.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblClimaIcon.setBackground(Color.DARK_GRAY);
			}
		});
		lblClimaIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblClimaIcon.setBounds(51, 57, 180, 149);
		clima.add(lblClimaIcon);
		lblClimaIcon.setIcon(new ImageIcon(img_clima));
		
		JPanel hora = new JPanel();
		hora.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hora.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hora.setBackground(Color.DARK_GRAY);
			}
		});
		hora.setLayout(null);
		hora.setBackground(new Color(47, 79, 79));
		hora.setBounds(572, 407, 274, 237);
		panelContentHome.add(hora);
		
		JLabel lblHoraDeHoje = new JLabel("Hora de Hoje");
		lblHoraDeHoje.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraDeHoje.setForeground(Color.WHITE);
		lblHoraDeHoje.setBounds(48, 12, 201, 33);
		hora.add(lblHoraDeHoje);
		
		JLabel lblHoraIcon = new JLabel("");
		lblHoraIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraIcon.setBounds(48, 55, 180, 149);
		hora.add(lblHoraIcon);
		lblHoraIcon.setIcon(new ImageIcon(img_hora));
		
		panelContentHome.setVisible(true);
		
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
			@Override
			public void mouseClicked(MouseEvent e) {
				ativarContent("home");
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
			@Override
			public void mouseClicked(MouseEvent e) {
				ativarContent("profile");
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
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Você realmente deseja sair?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Dashboard.this.dispose();
				}
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
		
		JLabel lblCopyright = new JLabel("Copyright©2021 - Marcio Willian");
		lblCopyright.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(55, 693, 189, 15);
		panelMenu.add(lblCopyright);
		
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
	
	public void ativarContent(String name) {
		if(name.equals("home")) {
			panelContentHome.setVisible(true);
			panelContentProfile.setVisible(false);
		} else if(name.equals("profile")) {
			panelContentHome.setVisible(false);
			panelContentProfile.setVisible(true);
		}
		
	}
}
