package br.com.crud;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class CRUDExample extends JFrame {
	private static final long serialVersionUID = 4352205922371063453L;
	
	private JPanel contentPane;
	private JTextField txtPosicao;
	private JTextField txtUsuario;
	
	public CRUDExample() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPosicao = new JTextField();
		txtPosicao.setBounds(10, 79, 400, 20);
		contentPane.add(txtPosicao);
		txtPosicao.setColumns(10);
		
		JLabel lblPosicao = new JLabel("Posi\u00E7\u00E3o:");
		lblPosicao.setBounds(10, 65, 46, 14);
		contentPane.add(lblPosicao);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio:");
		lblNewLabel_1.setBounds(10, 23, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(10, 36, 400, 20);
		contentPane.add(txtUsuario);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 132, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(210, 132, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnExcluir_1 = new JButton("Excluir");
		btnExcluir_1.setBounds(111, 132, 89, 23);
		contentPane.add(btnExcluir_1);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(309, 132, 89, 23);
		contentPane.add(btnListar);
		
		JTextArea txtAObservacao = new JTextArea();
		txtAObservacao.setBounds(10, 187, 400, 22);
		contentPane.add(txtAObservacao);
		
		JLabel lblObservacao = new JLabel("Posi\u00E7\u00E3o:");
		lblObservacao.setBounds(10, 166, 46, 14);
		contentPane.add(lblObservacao);
	}
}