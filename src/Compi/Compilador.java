package Compi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Compilador extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compilador frame = new Compilador();
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
	public Compilador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCode = new JPanel();
		panelCode.setBounds(22, 11, 489, 336);
		contentPane.add(panelCode);
		panelCode.setLayout(null);
		

		TextArea textArea = new TextArea();
		textArea.setBounds(10, 40, 469, 256);
		panelCode.add(textArea);
		textArea.setForeground(Color.BLACK);
		
		Button btnRun = new Button("Run");
		btnRun.setBounds(10, 12, 70, 22);
		panelCode.add(btnRun);
		
		textFieldMsg = new JTextField();
		textFieldMsg.setEditable(false);
		textFieldMsg.setBounds(10, 305, 469, 20);
		panelCode.add(textFieldMsg);
		textFieldMsg.setColumns(10);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textArea.getText();
				System.out.println(text+"\n\n");
				AnLex alx =  new AnLex(text);
				alx.Compare(alx.generateTokens());
				textFieldMsg.setText("Compilado");
			}
		});
		
	
		
	}
}
