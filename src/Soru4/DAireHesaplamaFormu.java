package Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DAireHesaplamaFormu {

	private JFrame frame;
	private JTextField txtRadius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DAireHesaplamaFormu window = new DAireHesaplamaFormu();
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
	public DAireHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Dairenin Yar\u0131\u00E7ap\u0131n\u0131 Giriniz:");
		lblNewLabel.setBounds(45, 48, 103, 20);
		frame.getContentPane().add(lblNewLabel);
		
		txtRadius = new JTextField();
		txtRadius.setBounds(218, 49, 96, 20);
		frame.getContentPane().add(txtRadius);
		txtRadius.setColumns(10);
		
		JLabel lblDaireAlan = new JLabel("Daire alan\u0131:");
		lblDaireAlan.setBounds(45, 152, 157, 20);
		frame.getContentPane().add(lblDaireAlan);
		
		JLabel lblDaireCevre = new JLabel("Daire \u00C7evresi:");
		lblDaireCevre.setBounds(45, 204, 157, 20);
		frame.getContentPane().add(lblDaireCevre);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DaireHesaplama daireHesaplama=new DaireHesaplama();
				double alandouble= daireHesaplama.DaireAlanHesaplama(Double.valueOf(txtRadius.getText()));
				String alanString=String.valueOf(alandouble);
				lblDaireAlan.setText("Dairenin Alaný: "+alanString);
				
				double cevredouble= daireHesaplama.DaireCevreHesaplama(Double.valueOf(txtRadius.getText()));
				String cevreString=String.valueOf(cevredouble);
				lblDaireCevre.setText("Dairenin Alaný: "+cevreString);
				
			}
		});
		btnNewButton.setBounds(218, 97, 103, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("DA\u0130REN\u0130N ALAN VE \u00C7EVRES\u0130");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(89, 10, 225, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}

}
