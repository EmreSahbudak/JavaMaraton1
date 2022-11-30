package Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class KareAlanHesaplamaFormu_1 {

	private JFrame frame;
	private JTextField txtKareAlanGiris;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanHesaplamaFormu_1 window = new KareAlanHesaplamaFormu_1();
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
	public KareAlanHesaplamaFormu_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Karenin bir alan\u0131n\u0131 giriniz=");
		lblNewLabel.setBounds(58, 49, 150, 26);
		frame.getContentPane().add(lblNewLabel);
		
		txtKareAlanGiris = new JTextField();
		txtKareAlanGiris.setBounds(247, 49, 106, 26);
		frame.getContentPane().add(txtKareAlanGiris);
		txtKareAlanGiris.setColumns(10);
		
		JLabel lblAlanSonucu = new JLabel("Kare Alan Sonucu");
		lblAlanSonucu.setBounds(58, 165, 150, 26);
		frame.getContentPane().add(lblAlanSonucu);
		
		JLabel lblCevreSonucu = new JLabel("Kare \u00C7evre \u0130\u015Flem sonucu");
		lblCevreSonucu.setBounds(58, 201, 171, 26);
		frame.getContentPane().add(lblCevreSonucu);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KareHesaplama kareHesaplama=new KareHesaplama();
				double alandouble= kareHesaplama.kareAlanHesaplama(Double.valueOf(txtKareAlanGiris.getText()));
				String alanString=String.valueOf(alandouble);
				lblAlanSonucu.setText("Karenin Alaný: "+alanString);
				
				double cevredouble= kareHesaplama.kareCevreHesaplama(Double.valueOf(txtKareAlanGiris.getText()));
				String cevreString=String.valueOf(cevredouble);
				lblCevreSonucu.setText("Karenin Çevresi: "+cevreString);
				
			}
		});
		btnHesapla.setBounds(247, 114, 106, 26);
		frame.getContentPane().add(btnHesapla);
		
		JLabel lblNewLabel_2 = new JLabel("KAREN\u0130N ALAN VE \u00C7EVRES\u0130");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(89, 10, 235, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}
}
