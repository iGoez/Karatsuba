package interfaz;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.KaratsubaMultipliation;

public class CalculatorPrincipal extends JFrame implements ActionListener, MouseListener {

	private JPanel Pcalculator;

	private KaratsubaMultipliation kMul;

	private TextField txtScreen1;
	private TextField txtScreen3;
	private TextField txtScreen5;

	private JButton butOne;
	private JButton butTwo;
	private JButton butThree;
	private JButton butFour;
	private JButton butFive;
	private JButton butSix;
	private JButton butSeven;
	private JButton butEigth;
	private JButton butNine;
	private JButton butZero;

	private JButton butDelete;
	private JButton butMultiply;
	private JButton butDivide;
	private JButton butAdd;
	private JButton buSusb;
	private JButton butSymplify;
	private JButton butSquare;
	private JButton butInverse;

	public CalculatorPrincipal() {
		kMul = new KaratsubaMultipliation();

		Pcalculator = (JPanel) this.getContentPane();
		Pcalculator.setLayout(null);
		setSize(350, 350);
		setTitle("Cálculadora");
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		calculatorParts();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		long n1 = 0;
		long n2 = 0;

		txtScreen1.getText();
		txtScreen3.getText();

		if (command.equalsIgnoreCase("*")) {
			n1 = Long.valueOf(txtScreen1.getText());
			n2 = Long.valueOf(txtScreen3.getText());

			txtScreen5.setText(kMul.karatsubaMul(n1, n2) + "");
		} else if (command.equalsIgnoreCase("AC")) {
			txtScreen1.setText("");
			txtScreen3.setText("");
			txtScreen5.setText("");
		} else {
			auxiliary(e);
		}
	}

	public void auxiliary(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equalsIgnoreCase("1")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 1);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 1);
			}
		} else if (command.equalsIgnoreCase("2")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 2);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 2);
			}
		} else if (command.equalsIgnoreCase("3")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 3);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 3);
			}
		} else if (command.equalsIgnoreCase("4")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 4);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 4);
			}
		} else if (command.equalsIgnoreCase("5")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 5);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 5);
			}
		} else if (command.equalsIgnoreCase("6")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 6);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 6);
			}
		} else if (command.equalsIgnoreCase("7")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 7);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 7);
			}
		} else if (command.equalsIgnoreCase("8")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 8);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 8);
			}
		} else if (command.equalsIgnoreCase("9")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 9);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 9);
			}
		} else if (command.equalsIgnoreCase("0")) {
			if (txtScreen1.isEditable()) {
				txtScreen1.setText(txtScreen1.getText() + "" + 0);
			} else if (txtScreen3.isEditable()) {
				txtScreen3.setText(txtScreen3.getText() + "" + 0);
			}
		}
	}

	public void calculatorParts() {

		// SCREEN´S
		txtScreen1 = new TextField();
		txtScreen1.setBounds(22, 8, 96, 35);
		txtScreen1.setEditable(false);
		txtScreen1.addMouseListener(this);
		add(txtScreen1);

		txtScreen3 = new TextField();
		txtScreen3.setBounds(120, 8, 96, 35);
		txtScreen3.setEditable(false);
		txtScreen3.addMouseListener(this);
		add(txtScreen3);

		txtScreen5 = new TextField();
		txtScreen5.setBounds(218, 8, 96, 35);
		txtScreen5.setEditable(false);
		add(txtScreen5);

		// NUMBERS

		butOne = new JButton("1");
		butOne.setBounds(22, 83, 50, 40);
		butOne.setFont(new Font("Arial", Font.BOLD, 20));
		butOne.setActionCommand("1");
		butOne.addActionListener(this);
		add(butOne);

		butTwo = new JButton("2");
		butTwo.setBounds(87, 83, 50, 40);
		butTwo.setFont(new Font("Arial", Font.BOLD, 20));
		butTwo.setActionCommand("2");
		butTwo.addActionListener(this);
		add(butTwo);

		butThree = new JButton("3");
		butThree.setBounds(152, 83, 50, 40);
		butThree.setFont(new Font("Arial", Font.BOLD, 20));
		butThree.setActionCommand("3");
		butThree.addActionListener(this);
		add(butThree);

		butFour = new JButton("4");
		butFour.setBounds(22, 138, 50, 40);
		butFour.setFont(new Font("Arial", Font.BOLD, 20));
		butFour.setActionCommand("4");
		butFour.addActionListener(this);
		add(butFour);

		butFive = new JButton("5");
		butFive.setBounds(87, 138, 50, 40);
		butFive.setFont(new Font("Arial", Font.BOLD, 20));
		butFive.setActionCommand("5");
		butFive.addActionListener(this);
		add(butFive);

		butSix = new JButton("6");
		butSix.setBounds(152, 138, 50, 40);
		butSix.setFont(new Font("Arial", Font.BOLD, 20));
		butSix.setActionCommand("6");
		butSix.addActionListener(this);
		add(butSix);

		butSeven = new JButton("7");
		butSeven.setBounds(22, 193, 50, 40);
		butSeven.setFont(new Font("Arial", Font.BOLD, 20));
		butSeven.setActionCommand("7");
		butSeven.addActionListener(this);
		add(butSeven);

		butEigth = new JButton("8");
		butEigth.setBounds(87, 193, 50, 40);
		butEigth.setFont(new Font("Arial", Font.BOLD, 20));
		butEigth.setActionCommand("8");
		butEigth.addActionListener(this);
		add(butEigth);

		butNine = new JButton("9");
		butNine.setBounds(152, 193, 50, 40);
		butNine.setFont(new Font("Arial", Font.BOLD, 20));
		butNine.setActionCommand("9");
		butNine.addActionListener(this);
		add(butNine);

		butZero = new JButton("0");
		butZero.setBounds(87, 245, 50, 40);
		butZero.setFont(new Font("Arial", Font.BOLD, 20));
		butZero.setActionCommand("0");
		butZero.addActionListener(this);
		add(butZero);

		butDelete = new JButton("AC");
		butDelete.setBounds(217, 83, 90, 40);
		butDelete.setFont(new Font("Arial", Font.BOLD, 12));
		butDelete.setActionCommand("AC");
		butDelete.addActionListener(this);
		add(butDelete);

		// OPERATIONS

		butAdd = new JButton("+");
		butAdd.setEnabled(false);
		butAdd.setBounds(217, 138, 42, 40);
		butAdd.setFont(new Font("Arial", Font.BOLD, 10));
		butAdd.setActionCommand("+");
		butAdd.addActionListener(this);
		add(butAdd);

		buSusb = new JButton("-");
		buSusb.setEnabled(false);
		buSusb.setBounds(267, 138, 40, 40);
		buSusb.setFont(new Font("Arial", Font.BOLD, 18));
		buSusb.setActionCommand("-");
		buSusb.addActionListener(this);
		add(buSusb);

		butMultiply = new JButton("*");
		butMultiply.setBounds(217, 193, 42, 40);
		butMultiply.setFont(new Font("Arial", Font.BOLD, 20));
		butMultiply.setActionCommand("*");
		butMultiply.addActionListener(this);
		add(butMultiply);

		butDivide = new JButton("/");
		butDivide.setEnabled(false);
		butDivide.setBounds(267, 193, 40, 40);
		butDivide.setFont(new Font("Arial", Font.BOLD, 20));
		butDivide.setActionCommand("/");
		butDivide.addActionListener(this);
		add(butDivide);

		butSquare = new JButton("x^2");
		butSquare.setEnabled(false);
		butSquare.setBounds(22, 245, 55, 40);
		butSquare.setFont(new Font("Arial", Font.BOLD, 10));
		butSquare.setActionCommand("x^2");
		butSquare.addActionListener(this);
		add(butSquare);

		butInverse = new JButton("x^-1");
		butInverse.setEnabled(false);
		butInverse.setBounds(152, 245, 55, 40);
		butInverse.setFont(new Font("Arial", Font.BOLD, 10));
		butInverse.setActionCommand("x^-1");
		butInverse.addActionListener(this);
		add(butInverse);

		butSymplify = new JButton("Simplificar");
		butSymplify.setEnabled(false);
		butSymplify.setBounds(217, 245, 90, 40);
		butSymplify.setFont(new Font("Arial", Font.BOLD, 10));
		butSymplify.setActionCommand("Simplificar");
		butSymplify.addActionListener(this);
		add(butSymplify);
	}

	public static void main(String[] args) {
		CalculatorPrincipal cal = new CalculatorPrincipal();
		cal.repaint();
		;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getComponent() == txtScreen1) {
			txtScreen1.setEditable(true);
			txtScreen3.setEditable(false);
		} else if (arg0.getComponent() == txtScreen3) {
			txtScreen1.setEditable(false);
			txtScreen3.setEditable(true);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
