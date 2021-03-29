package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ViewUser extends JFrame {

	private JPanel cpDashBoard;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewUser frame = new ViewUser();
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
	public ViewUser() {
				
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		cpDashBoard = new JPanel();		
		cpDashBoard.setLocation(-173, -157);
		cpDashBoard.setBackground(new Color(0, 128, 128));
		cpDashBoard.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		setContentPane(cpDashBoard);
		cpDashBoard.setLayout(null);
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
//				panelCadastro.setBackground(new Color(2, 206, 209));
			}
			public void mouseExited(MouseEvent e) {
//				panelCadastro.setBackground(new Color(47, 79, 79));
			}
		});
		panelCadastro.setBackground(new Color(47, 79, 79));
		panelCadastro.setBounds(132, 49, 314, 326);
		cpDashBoard.add(panelCadastro);
		panelCadastro.setLayout(null);
		
		JLabel lblCadastrarUsuario = new JLabel("Cadastrar Usuario");
		lblCadastrarUsuario.setForeground(Color.WHITE);
		lblCadastrarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
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
		txtNome.setBounds(121, 62, 179, 25);
		panelCadastro.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(121, 102, 179, 25);
		panelCadastro.add(txtEmail);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(121, 139, 179, 25);
		panelCadastro.add(txtTel);
		
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
				if(JOptionPane.showConfirmDialog(null, "Usuário Cadastrado com sucesso, deseja cadastrar mais usuarios?", "Confirmation", JOptionPane.YES_NO_OPTION) == 1) {
					ViewUser.this.dispose();
				}
			}
		});
		pCadastro.setBackground(Color.GRAY);
		pCadastro.setBounds(64, 254, 179, 47);
		panelCadastro.add(pCadastro);
		pCadastro.setLayout(null);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setBackground(Color.WHITE);
		lblCadastrar.setBounds(43, 12, 88, 23);
		pCadastro.add(lblCadastrar);
		
		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo!");
		lblSejaBemVindo.setForeground(Color.WHITE);
		lblSejaBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSejaBemVindo.setBounds(132, 12, 303, 25);
		cpDashBoard.add(lblSejaBemVindo);
		setLocationRelativeTo(null);
	}
}
