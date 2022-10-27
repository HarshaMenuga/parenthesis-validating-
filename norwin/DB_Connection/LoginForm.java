package db_connection;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {
	private JTextField textfield;
	private JPasswordField passwordfield;
	private JButton button;
	private JLabel label;
	private JPanel panel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
	public LoginForm(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,190,1014,597);
		setResizable(false);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        panel.add(lblNewLabel);
        
    	
		
        textfield = new JTextField();
        textfield.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textfield.setBounds(481, 170, 281, 68);
        panel.add(textfield);
        textfield.setColumns(10);
        
        passwordfield = new JPasswordField();
        passwordfield.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordfield.setBounds(481, 286, 281, 68);
        panel.add(passwordfield);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 166, 193, 52);
        panel.add(lblUsername);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 286, 193, 52);
        panel.add(lblPassword);
        
        button = new JButton("Login");
        button.setFont(new Font("Tahoma", Font.PLAIN, 26));
        button.setBounds(545, 392, 162, 73);
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
	}

}
