

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LoginWindow {

	JFrame f;
	JButton bt;
	JTextField id;
	JPasswordField pwd;
	JLabel idL, pwdL;
  
  // constructor
	public LoginWindow() {
		f = new JFrame();
		f.setTitle("Login Window");
		f.setSize(600, 400);
		f.setLayout(null);
		
		this.addTextFields();
		this.addButton();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
  
  // helper methods
	private void addTextFields() {
		
		idL = new JLabel("User Id:");
		idL.setSize(100,30);
		idL.setLocation(150,100);

		id = new JTextField();
		id.setSize(200,30);
		id.setLocation(250,100);
		
		pwd = new JPasswordField();
		pwd.setSize(200,30);
		pwd.setLocation(250,160);
		
		pwdL = new JLabel("Password:");
		pwdL.setSize(100,30);
		pwdL.setLocation(150, 160);
		
		f.add(idL);
		f.add(pwdL);
		f.add(id);
		f.add(pwd);
	}
	void addButton() {
		bt = new JButton("Login");
		bt.setSize(100,40);
		bt.setLocation(250, 250);
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getSource() == bt) {
					Validator obj = new Validator();
					int result = obj.validate(id.getText(),pwd.getText());
					JDialog d = new JDialog(f);
					d.setLayout(null);
					d.setSize(430, 100);
					if(result == Validator.INCOMPLETE) {
						d.setTitle("Alert");
						JLabel msg = new JLabel("Please enter User Id and Password to continue.");
						msg.setForeground(Color.RED);
						msg.setSize(350,30);
						msg.setLocation(50,30);
						d.add(msg);
					}
					else if(result == Validator.USER_NOT_FOUND) {
						d.setTitle("Alert");
						JLabel msg = new JLabel("Incorrect Login Id!!!");
						msg.setForeground(Color.RED);
						msg.setSize(300,30);
						msg.setLocation(150,30);
						d.add(msg);
					}
					else if(result == Validator.VALIDATION_SUCCESSFUL) {
						d.setTitle("Welcome");
						JLabel msg = new JLabel("Login Successful.");
						msg.setForeground(Color.MAGENTA);
						msg.setSize(200,30);
						msg.setLocation(150,30);
						d.add(msg);
					}
					else {
						JLabel msg = new JLabel("Wrong Password");
						msg.setForeground(Color.RED);
						msg.setSize(200,30);
						msg.setLocation(150,30);
						d.add(msg);
					}
					d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					d.setVisible(true);
				}
			}
		});
		f.add(bt);
	}
  
  // main method
	public static void main(String ...s) {
		new LoginWindow();
	}
}

