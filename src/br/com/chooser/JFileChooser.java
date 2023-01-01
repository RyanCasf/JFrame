package br.com.chooser;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class JFileChooser extends JFrame {
	private static final long serialVersionUID = -7469912300508719739L;

	private JPanel contentPane;
	private JTextField txtfCaminho;
	private JButton btnBuscar;

	public JFileChooser() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCaminho = new JLabel("Caminho:");
		lblCaminho.setBounds(10, 11, 414, 14);
		contentPane.add(lblCaminho);

		txtfCaminho = new JTextField();
		txtfCaminho.setBounds(10, 24, 414, 20);
		contentPane.add(txtfCaminho);
		txtfCaminho.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(169, 55, 89, 23);
		btnBuscar.addActionListener(btnBucarActionListener());

		contentPane.add(btnBuscar);
	}

	public java.awt.event.ActionListener btnBucarActionListener() {
		return (java.awt.event.ActionEvent event) -> {
			final String DIR_BASE = System.getProperty("user.home") + "/Desktop";
			File file = new File(DIR_BASE);

			javax.swing.JFileChooser jChooser = new javax.swing.JFileChooser();
			jChooser.setCurrentDirectory(file);
			jChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);

			String caminhoSelecionada = "";
			final int retorno = jChooser.showOpenDialog(null);
			if (retorno == javax.swing.JFileChooser.APPROVE_OPTION) {
				caminhoSelecionada = jChooser.getSelectedFile().getAbsolutePath();
				txtfCaminho.setText(caminhoSelecionada);
			}
		};
	}
}