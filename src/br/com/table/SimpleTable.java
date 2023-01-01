package br.com.table;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class SimpleTable  extends JFrame {
	private static final long serialVersionUID = -8940482949485324741L;
	
	private JPanel contentPane;
	
	public SimpleTable() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(gerarTabela());
	}
	
	public JFrame gerarTabela() {
		String[] colunas = {"Nome", "Sobrenome", "Signo", "Idade", "Coda em Java?"};
		
		Object[][] dados = {
				{"Ryan", "Castro", "Capricórnio", 19, true},
				{"Felipe", "Castro", "Capricórnio", 19, false},
				{"Rildo", "Ferreira", "Touro", 45, false}
		};
		
		JTable table = new JTable(dados, colunas);
		table.setBounds(101, 37, 1, 1);
		table.setVisible(true);
		
		JFrame frame = new JFrame();
		frame.setSize(455,300);
		frame.setVisible(true);
		frame.add(table);
		
		return frame;
	}
}