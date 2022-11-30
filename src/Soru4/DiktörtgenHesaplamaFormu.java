package Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DiktörtgenHesaplamaFormu {

	private JFrame frame;
	private JTextField txtUzunKenar;
	private JTextField txtKisaKenar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiktörtgenHesaplamaFormu window = new DiktörtgenHesaplamaFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiktörtgenHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dikd\u00F6rtgenin Uzun Kenar\u0131");
		lblNewLabel.setBounds(38, 53, 103, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dikd\u00F6rtgenin k\u0131sa kenar\u0131");
		lblNewLabel_1.setBounds(38, 107, 103, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(179, 58, 96, 19);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(179, 109, 96, 19);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		JLabel lblDikAlan = new JLabel("Dikd\u00F6rtgenin alan\u0131:");
		lblDikAlan.setBounds(38, 204, 145, 23);
		frame.getContentPane().add(lblDikAlan);
		
		JLabel lblDikCevre = new JLabel("Dikd\u00F6rtgenin \u00E7evresi");
		lblDikCevre.setBounds(38, 237, 145, 23);
		frame.getContentPane().add(lblDikCevre);
		
		JButton btnHesaplama = new JButton("Hesapla");
		btnHesaplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiktörtgenHesaplamaa diktörtgenHesaplamaa=new DiktörtgenHesaplamaa();
				double alandouble=diktörtgenHesaplamaa.dikdörtgenAlanHesaplama(Double.valueOf(txtKisaKenar.getText()), Double.valueOf(txtUzunKenar.getText()));
				String alanString=String.valueOf(alandouble);
				lblDikAlan.setText("Diktörgenin Alaný: "+alanString);
				
				double cevredouble=diktörtgenHesaplamaa.dikdörtgenCevreHesaplama(Double.valueOf(txtKisaKenar.getText()), Double.valueOf(txtUzunKenar.getText()));
				String cevreString=String.valueOf(cevredouble);
				lblDikCevre.setText("Diktörgenin Çevresi: "+cevreString);
				
			}
		});
		btnHesaplama.setBounds(179, 162, 85, 21);
		frame.getContentPane().add(btnHesaplama);
		
		JLabel lblNewLabel_2 = new JLabel("D\u0130KT\u00D6RTGEN\u0130N ALAN VE \u00C7EVRES\u0130");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(83, 10, 286, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}

}
