import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMinus {

	private JFrame frame;
	private JTextField textFieldAdd;
	private JTextField textFieldMinus;
	private JTextField textFieldAnswer;
	private JButton AddButton;
	private JButton MinusButton;
	private JLabel AnswerLabel;
	private JLabel Integer1Label;
	private JLabel Integer2Label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
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
		
		AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldAdd.getText());
					no2 = Integer.parseInt(textFieldMinus.getText());
					ans = no1 + no2;
					textFieldAnswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong input! Please enter number only.");
				}
			}
		});
		AddButton.setBackground(Color.PINK);
		AddButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AddButton.setBounds(82, 136, 102, 32);
		frame.getContentPane().add(AddButton);
		
		MinusButton = new JButton("MINUS");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldAdd.getText());
					no2 = Integer.parseInt(textFieldMinus.getText());
					ans = no1 - no2;
					textFieldAnswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong input! Please enter number only.");
				}
			}
		});
		MinusButton.setBackground(Color.PINK);
		MinusButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		MinusButton.setBounds(280, 136, 89, 32);
		frame.getContentPane().add(MinusButton);
		
		textFieldAdd = new JTextField();
		textFieldAdd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldAdd.setBounds(82, 75, 102, 32);
		frame.getContentPane().add(textFieldAdd);
		textFieldAdd.setColumns(10);
		
		textFieldMinus = new JTextField();
		textFieldMinus.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldMinus.setBounds(280, 75, 89, 32);
		frame.getContentPane().add(textFieldMinus);
		textFieldMinus.setColumns(10);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(184, 204, 110, 32);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		AnswerLabel = new JLabel("ANSWER");
		AnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		AnswerLabel.setBounds(103, 206, 71, 29);
		frame.getContentPane().add(AnswerLabel);
		
		Integer1Label = new JLabel("Integer 1");
		Integer1Label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Integer1Label.setBounds(82, 28, 92, 32);
		frame.getContentPane().add(Integer1Label);
		
		Integer2Label = new JLabel("Integer 2");
		Integer2Label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Integer2Label.setBounds(280, 28, 89, 32);
		frame.getContentPane().add(Integer2Label);
	}
}
