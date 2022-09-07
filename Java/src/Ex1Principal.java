import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Ex1Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	JCheckBox chCarregador = new JCheckBox(" Carregador - R$ 300,00");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 250,00");
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 300,00");
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 150,00");
	JComboBox cbPlacaDeVideo = new JComboBox();
	
	
	Ex1Notebook no = new Ex1Notebook();
	Ex1Desktop  de = new Ex1Desktop();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Principal frame = new Ex1Principal();
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
	public Ex1Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Configure o seu computador");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(90, 11, 291, 30);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbNotebook = new JRadioButton("Notebook");
		rbNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chCarregador.setEnabled(true);
				chPasta.setEnabled(true);
				chEstabilizador.setEnabled(false);
				chEstabilizador.setSelected(false);
				chTeclado.setEnabled(false);
				chTeclado.setSelected(false);
			}
		});
		buttonGroup.add(rbNotebook);
		rbNotebook.setSelected(true);
		rbNotebook.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rbNotebook.setBounds(106, 48, 109, 23);
		contentPane.add(rbNotebook);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chEstabilizador.setEnabled(true);
				
				chTeclado.setEnabled(true);
				
				chCarregador.setEnabled(false);
				chCarregador.setSelected(false);
				chPasta.setEnabled(false);
				chPasta.setSelected(false);
				
			}
		});
		buttonGroup.add(rbDesktop);
		rbDesktop.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rbDesktop.setBounds(253, 48, 109, 23);
		contentPane.add(rbDesktop);
		
		JLabel lblPlacame = new JLabel("Placa-Mãe:");
		lblPlacame.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblPlacame.setBounds(29, 78, 95, 30);
		contentPane.add(lblPlacame);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setEditable(true);
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"Mode 1 - R$ 600,00", "Mode 2 - R$ 800,00", "Mode 3 - R$ 1000,00"}));
		cbPlacaMae.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		cbPlacaMae.setBounds(133, 78, 229, 30);
		contentPane.add(cbPlacaMae);
		
		JComboBox cbHd = new JComboBox();
		cbHd.setModel(new DefaultComboBoxModel(new String[] {"500 GB - R$ 200,00", "1 TB     -  R$ 400,00", "2 TB    -  R$ 600,00"}));
		cbHd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		cbHd.setEditable(true);
		cbHd.setBounds(133, 124, 229, 30);
		contentPane.add(cbHd);
		
		JLabel lblHd = new JLabel("HD:");
		lblHd.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblHd.setBounds(29, 129, 95, 30);
		contentPane.add(lblHd);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Modelo I3 -R$ 500,00", "Modelo I5-R$ 900,00", "Modelo I7-R$ 1500,00"}));
		cbProcessador.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		cbProcessador.setEditable(true);
		cbProcessador.setBounds(133, 215, 229, 30);
		contentPane.add(cbProcessador);
		
		JLabel lblProcessador = new JLabel("Processador:");
		lblProcessador.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblProcessador.setBounds(29, 220, 109, 30);
		contentPane.add(lblProcessador);
		
		JLabel lblMemria = new JLabel("Memória:");
		lblMemria.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblMemria.setBounds(29, 169, 95, 30);
		contentPane.add(lblMemria);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"Modelo 4gb  - R$ 150,00", "Modelo 8gb  - R$ 300,00", "Modelo 16gb - R$ 500,00"}));
		cbMemoria.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		cbMemoria.setEditable(true);
		cbMemoria.setBounds(133, 169, 229, 30);
		contentPane.add(cbMemoria);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 314, 519, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(211, 309, 2, 82);
		contentPane.add(separator_1);
		
		
		chCarregador.setBounds(28, 323, 173, 23);
		contentPane.add(chCarregador);
		
		chPasta.setBounds(28, 352, 173, 23);
		contentPane.add(chPasta);
		chEstabilizador.setEnabled(false);
		chEstabilizador.setBounds(222, 323, 173, 23);
		contentPane.add(chEstabilizador);
		chTeclado.setEnabled(false);
		chTeclado.setBounds(222, 352, 173, 23);
		contentPane.add(chTeclado);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(28, 389, 385, 2);
		contentPane.add(separator_2);
		
		JCheckBox chGarantia = new JCheckBox("Garantia Estendida");
		chGarantia.setBounds(28, 399, 173, 23);
		contentPane.add(chGarantia);
		
		JButton btnNewButton = new JButton("Finalizar Pedido");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbNotebook.isSelected()) {
					//placa mae
					if(cbPlacaMae.getSelectedIndex() ==0) {
						no.setPlacaMae(600);
					}else if(cbPlacaMae.getSelectedIndex() == 1) {
						no.setPlacaMae(800);
						}
					else {no.setPlacaMae(1000);
					}
					no.setConfiguracao(no.getConfiguracao()+ "Placa-Mãe:" + cbPlacaMae.getSelectedItem() + "\n");
					//hd
					if(cbHd.getSelectedIndex() ==0) {
						no.setHd(200);
					}else if(cbHd.getSelectedIndex() == 1) {
						no.setHd(400);
						}
					else {no.setHd(600);
					}
					no.setConfiguracao(no.getConfiguracao()+ "HD:" + cbHd.getSelectedItem() + "\n");
					
					//memoria
					if(cbMemoria.getSelectedIndex() ==0) {
						no.setMemoria(150);
					}else if(cbMemoria.getSelectedIndex() == 1) {
						no.setMemoria(300);
						}
					else {no.setMemoria(600);
					}
					no.setConfiguracao(no.getConfiguracao()+ "Memoria:" + cbMemoria.getSelectedItem() + "\n");
					
					//Processador
					if(cbProcessador.getSelectedIndex() ==0) {
						no.setProcessador(500);
					}else if(cbProcessador.getSelectedIndex() == 1) {
						no.setProcessador(900);
						}
					else {no.setProcessador(1500);
					}
					no.setConfiguracao(no.getConfiguracao()+ "Processador:" + cbProcessador.getSelectedItem() + "\n");
					
					//carregador
					
				if(chCarregador.isSelected()) {
					no.setCarregador(300);}
					no.setConfiguracao(no.getConfiguracao()+ "Carregador: 300,00R$"  + "\n");
					//pasta
					if(chPasta.isSelected()) {
						no.setPasta(250);}
						no.setConfiguracao(no.getConfiguracao()+ "Pasta: 200,00R$"  + "\n");
					
					
					}else {
						//placa mae
						if(cbPlacaMae.getSelectedIndex() ==0) {
							no.setPlacaMae(600);
						}else if(cbPlacaMae.getSelectedIndex() == 1) {
							no.setPlacaMae(800);
							}
						else {no.setPlacaMae(1000);
						}
						no.setConfiguracao(no.getConfiguracao()+ "Placa-Mãe:" + cbPlacaMae.getSelectedItem() + "\n");
						//hd
						if(cbHd.getSelectedIndex() ==0) {
							no.setHd(200);
						}else if(cbHd.getSelectedIndex() == 1) {
							no.setHd(400);
							}
						else {no.setHd(600);
						}
						no.setConfiguracao(no.getConfiguracao()+ "HD:" + cbHd.getSelectedItem() + "\n");
						
						//memoria
						if(cbMemoria.getSelectedIndex() ==0) {
							no.setMemoria(150);
						}else if(cbMemoria.getSelectedIndex() == 1) {
							no.setMemoria(300);
							}
						else {no.setMemoria(600);
						}
						no.setConfiguracao(no.getConfiguracao()+ "Memoria:" + cbMemoria.getSelectedItem() + "\n");
						
						//Processador
						if(cbProcessador.getSelectedIndex() ==0) {
							no.setProcessador(500);
						}else if(cbProcessador.getSelectedIndex() == 1) {
							no.setProcessador(900);
							}
						else {no.setProcessador(1500);
						}
						no.setConfiguracao(no.getConfiguracao()+ "Processador:" + cbProcessador.getSelectedItem() + "\n");
						
						//carregador
						
					if(chEstabilizador.isSelected()) {
						no.setCarregador(200);}
						no.setConfiguracao(no.getConfiguracao()+ "chEstabilizador: 200,00R$"  + "\n");
						//pasta
						if(chTeclado.isSelected()) {
							no.setPasta(250);}
							no.setConfiguracao(no.getConfiguracao()+ "Teclado: 150,00R$"  + "\n");
					
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(211, 397, 129, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chPlacaDeVideo = new JCheckBox("Placa de Video off-Board");
		chPlacaDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chPlacaDeVideo.isSelected()) {
					cbPlacaDeVideo.setEnabled(true);
				}else {
					cbPlacaDeVideo.setEnabled(false);
				}
				
			}
		});
		chPlacaDeVideo.setEnabled(false);
		chPlacaDeVideo.setBounds(28, 261, 143, 23);
		contentPane.add(chPlacaDeVideo);
		
		
		cbPlacaDeVideo.setModel(new DefaultComboBoxModel(new String[] {"Model 1 - R$ 1000,00", "Model 2 - R$ 2000,00", "Model 3 - R$ 3000,00"}));
		cbPlacaDeVideo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		cbPlacaDeVideo.setEditable(true);
		cbPlacaDeVideo.setBounds(185, 256, 177, 30);
		contentPane.add(cbPlacaDeVideo);
	}
}
