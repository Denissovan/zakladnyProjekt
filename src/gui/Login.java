package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Login {

	private JFrame frmPrihlasovaciaOkno;
	private JTextField PrihlasMenoTextField;
	private JTextField PrihlasHesloTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmPrihlasovaciaOkno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrihlasovaciaOkno = new JFrame();
		frmPrihlasovaciaOkno.setTitle("Prihlasovacia Okno");
		frmPrihlasovaciaOkno.setBounds(100, 100, 450, 300);
		frmPrihlasovaciaOkno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrihlasovaciaOkno.getContentPane().setLayout(null);
		
		JLabel PrihlasMenoOzn = new JLabel("Prihlasovacie meno");
		PrihlasMenoOzn.setBounds(35, 69, 102, 20);
		frmPrihlasovaciaOkno.getContentPane().add(PrihlasMenoOzn);
		
		JLabel PrihlasHesloOzn = new JLabel("Prihlasovacie heslo");
		PrihlasHesloOzn.setBounds(35, 113, 102, 20);
		frmPrihlasovaciaOkno.getContentPane().add(PrihlasHesloOzn);
		
		PrihlasMenoTextField = new JTextField();
		PrihlasMenoTextField.setBounds(147, 69, 205, 20);
		frmPrihlasovaciaOkno.getContentPane().add(PrihlasMenoTextField);
		PrihlasMenoTextField.setColumns(10);
		
		PrihlasHesloTextField = new JTextField();
		PrihlasHesloTextField.setBounds(147, 113, 205, 20);
		frmPrihlasovaciaOkno.getContentPane().add(PrihlasHesloTextField);
		PrihlasHesloTextField.setColumns(10);
		
		JButton Registraciabtn = new JButton("Zaregistrova\u0165");
		Registraciabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Registraciabtn.setBounds(66, 188, 130, 30);
		frmPrihlasovaciaOkno.getContentPane().add(Registraciabtn);
		
		JButton PrihlasBtn = new JButton("Prihlasi\u0165");
		PrihlasBtn.setBounds(206, 188, 102, 30);
		frmPrihlasovaciaOkno.getContentPane().add(PrihlasBtn);
		
		JButton ResetBtn = new JButton("Reset");
		ResetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrihlasMenoTextField.setText(null);
				PrihlasHesloTextField.setText(null);
			}
		});
		ResetBtn.setBounds(318, 188, 95, 30);
		frmPrihlasovaciaOkno.getContentPane().add(ResetBtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 175, 378, 2);
		frmPrihlasovaciaOkno.getContentPane().add(separator);
		
		JLabel PrihlasUdajeLbl = new JLabel("Prihlasovacie \u00FAdaje");
		PrihlasUdajeLbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		PrihlasUdajeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		PrihlasUdajeLbl.setBounds(126, 11, 182, 30);
		frmPrihlasovaciaOkno.getContentPane().add(PrihlasUdajeLbl);
	}
}
