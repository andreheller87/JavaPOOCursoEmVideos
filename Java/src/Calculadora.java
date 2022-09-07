import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	
	CalculadoraMetodos mc = new CalculadoraMetodos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 24, 85, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(10, 60, 99, 25);
		contentPane.add(lblNewLabel_1);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		tfNum1.setBounds(107, 24, 185, 30);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		tfNum2.setBounds(107, 57, 185, 31);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText("" +mc.soma());
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 96, 45, 49);
		contentPane.add(btnNewButton);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		tfResultado.setBounds(107, 168, 185, 38);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(10, 168, 93, 38);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText("" +mc.subTracao());
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(65, 96, 45, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText("" +mc.multiplicacao());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_2.setBounds(128, 96, 45, 49);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc.setNum1(Double.parseDouble(tfNum1.getText()));
				mc.setNum2(Double.parseDouble(tfNum2.getText()));
				
				tfResultado.setText("" +mc.divisao());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_3.setBounds(189, 99, 45, 49);
		contentPane.add(btnNewButton_3);
	}
}
