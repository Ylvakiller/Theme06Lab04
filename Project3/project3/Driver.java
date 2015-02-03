package project3;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

/*
 * Description as found on blackboard:
 * Project 8.9. Create an interface MessageDecoder that has a single abstract method decode( cipherText), 
 * where cipherText is the message to be decoded. 
 * The method will return the decoded message. 
 * Modify the classes SubstitutionCipher and ShuffleCipher, as described in Exercises 16 and 17, 
 * so that they implement MessageDecoder as well as the interface MessageEncoder that Exercise 15 describes. 
 * Finally, write a program that allows a user to encode and decode messages entered on the keyboard.
 */

/*
 * Remarks as found on blackboard:
 * 8.9; p.637:
 * First write the interfaces MessageDecoder and MessageEncoder. 
 * An example of an interface is shown on p. 607. 
 * Encoding is changing a text into something different, decoding is getting the something different back to the original text.
 * Exercises 15-16 are on p. 635.
 * The class SubstitutionCipher uses both the interfaces MessageEncoder and MessageDecoder. 
 * The Class has the methods encode() and decode(). You only have to do SubstitutionCipher NOT ShuffleCipher(!).
 * SubstitutionCipher shifts the text with a given amount of characters. 
 * For instance if the amount is 3, an ‘a’ becomes a ‘d’, a ‘b’ becomes a ‘e’, etc.
 */
/*
 * Interpretation:
 * Since I do not have the book I have to look at the assignments and from that context derive what all classes should have
 * I intemperate that you want 2 abstract classes (MessageEncode and MessageDecoder)
 * Then you want a class SubstitutionCipher that uses those 2 interfaces
 * And then you want to communicate a bit with the user allowing him to enter text and letting the program decipher that
 */

/**
 * This class is meant as a driver and tester class for this project
 * @author Ylva
 *
 */
public class Driver {
	private static JTextField encodeInputField;
	private static String encoded;
	private static JTextField decodeInputField;
	private static String decoded;
	public static void main(String[] args) {
		
		final SubstitutionCipher test = new SubstitutionCipher();
		JFrame  encodeFrame = new JFrame("Encoder");
		encodeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		encodeFrame.getContentPane().setLayout(null);
		encodeFrame.setSize(450, 320);
		encodeInputField = new JTextField();
		
		
		
		encodeInputField.setBounds(10, 44, 414, 25);
		encodeFrame.getContentPane().add(encodeInputField);
		encodeInputField.setColumns(10);
		
		JLabel lblStringToEncode = new JLabel("String to encode");
		lblStringToEncode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStringToEncode.setHorizontalAlignment(SwingConstants.CENTER);
		lblStringToEncode.setBounds(10, 11, 414, 22);
		encodeFrame.getContentPane().add(lblStringToEncode);
		
		final JSpinner encodeKeySpinner = new JSpinner();
		encodeKeySpinner.setBounds(101, 80, 51, 25);
		encodeFrame.getContentPane().add(encodeKeySpinner);
		
		JLabel lblKey = new JLabel("Key");
		lblKey.setBounds(45, 85, 46, 14);
		encodeFrame.getContentPane().add(lblKey);
		
		final JButton encodeButton = new JButton("Encode");
		encodeButton.setEnabled(false);
		encodeButton.setBounds(221, 80, 89, 25);
		encodeFrame.getContentPane().add(encodeButton);
		
		final JTextArea encodeOutputField = new JTextArea();
		
		encodeOutputField.setBounds(10, 152, 414, 22);
		encodeFrame.getContentPane().add(encodeOutputField);
		encodeOutputField.setEditable(true);
		JLabel lblEncodedText = new JLabel("Encoded text");
		lblEncodedText.setBounds(10, 127, 161, 14);
		encodeFrame.getContentPane().add(lblEncodedText);
		
		final JButton toDecoderButton = new JButton("Send to decoder");
		toDecoderButton.setEnabled(false);
		toDecoderButton.setBounds(10, 185, 414, 25);
		encodeFrame.getContentPane().add(toDecoderButton);
		encodeFrame.setVisible(true);
		
		
		JFrame  decodeFrame = new JFrame("Decoder");
		decodeFrame.setLocation(encodeFrame.getX()+encodeFrame.getWidth(), encodeFrame.getX());
		decodeFrame.getContentPane().setLayout(null);
		decodeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		decodeFrame.setSize(450, 320);
		decodeInputField = new JTextField();
		decodeInputField.setBounds(10, 44, 414, 25);
		decodeFrame.getContentPane().add(decodeInputField);
		decodeInputField.setColumns(10);
		
		JLabel lblStringToDecode = new JLabel("String to decode");
		lblStringToDecode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStringToDecode.setHorizontalAlignment(SwingConstants.CENTER);
		lblStringToDecode.setBounds(10, 11, 414, 22);
		decodeFrame.getContentPane().add(lblStringToDecode);
		
		final JSpinner decodeKeySpinner = new JSpinner();
		decodeKeySpinner.setBounds(101, 80, 51, 25);
		decodeFrame.getContentPane().add(decodeKeySpinner);
		
		JLabel lbldecodeKey = new JLabel("Key");
		lbldecodeKey.setBounds(45, 85, 46, 14);
		decodeFrame.getContentPane().add(lbldecodeKey);
		
		final JButton decodeButton = new JButton("Decode");
		decodeButton.setEnabled(false);
		decodeButton.setBounds(221, 80, 89, 25);
		decodeFrame.getContentPane().add(decodeButton);
		
		final JTextArea decodeOutputField = new JTextArea();
		decodeOutputField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				decodeOutputField.setText(encoded);
			}
		});
		decodeOutputField.setBounds(10, 152, 414, 22);
		decodeFrame.getContentPane().add(decodeOutputField);
		decodeOutputField.setEditable(true);
		JLabel lblDecodedText = new JLabel("Decoded text");
		lblDecodedText.setBounds(10, 127, 161, 14);
		decodeFrame.getContentPane().add(lblDecodedText);
		
		final JButton ToEncodeButton = new JButton("Send to encoder");
		
		ToEncodeButton.setBounds(10, 185, 414, 25);
		ToEncodeButton.setEnabled(false);
		decodeFrame.getContentPane().add(ToEncodeButton);
		decodeFrame.setVisible(true);
		
		encodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				encoded = test.encode(encodeInputField.getText(), (int) encodeKeySpinner.getValue());
				encodeOutputField.setText(encoded);
				toDecoderButton.setEnabled(true);
			}
		});
		decodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decoded = test.decode(decodeInputField.getText(), (int) decodeKeySpinner.getValue());
				decodeOutputField.setText(decoded);
				ToEncodeButton.setEnabled(true);
			}
		});
		toDecoderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decodeInputField.setText(encoded);
				decodeButton.setEnabled(true);
			}
		});
		ToEncodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encodeInputField.setText(decoded);
				encodeButton.setEnabled(true);
			}
		});
		encodeInputField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				encodeButton.setEnabled(true);
			}
		});
		decodeInputField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				decodeButton.setEnabled(true);
			}
		});
		encodeOutputField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				encodeOutputField.setText(encoded);
			}
		});
		decodeOutputField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				decodeOutputField.setText(decoded);
			}
		});
	}
}
