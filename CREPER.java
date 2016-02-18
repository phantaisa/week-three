package java1;

import javax.swing.JOptionPane;

public class CREPER {public static void main(String[] args) {
	String adress=JOptionPane.showInputDialog(null, "where do you live");
String bday=JOptionPane.showInputDialog(null,"WHEN IS YOUR BIRTHDAY");
JOptionPane.showMessageDialog(null, "I Know WHERE YOU LIVE" + adress);
JOptionPane.showMessageDialog(null, "DONT GIVE IMFORMATION TO COMPUTERS BECUASE NOW I KNOW WHERE YOU LIVE"+adress);
}
}