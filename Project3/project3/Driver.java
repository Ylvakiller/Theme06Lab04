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
 * 
 * In terms of readability, this class holds 2 complete GUIs therefore it might not be the easiest to read, following is a summary of important lines for the program as described on blackboard:
 * Line 65: making of the object of type SubstitutionCipher //final SubstitutionCipher cipher = new SubstitutionCipher();
 * Line 166: encoding the given input //encoded = cipher.encode(encodeInputField.getText(), (int) encodeKeySpinner.getValue());
 * Line 173: decoding the given input //decoded = cipher.decode(decodeInputField.getText(), (int) decodeKeySpinner.getValue());
 * All the actionListeners are in the bottom of this class, this should make it easier to see what happens when you do a certain action
 * All the jFrames have a default close operation to close the complete program
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
		
		final SubstitutionCipher cipher = new SubstitutionCipher();
		
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
		encodeKeySpinner.setBounds(86, 80, 104, 25);
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
		decodeKeySpinner.setBounds(101, 80, 104, 25);
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
		
		final JButton toEncodeButton = new JButton("Send to encoder");
		
		toEncodeButton.setBounds(10, 185, 414, 25);
		toEncodeButton.setEnabled(false);
		decodeFrame.getContentPane().add(toEncodeButton);
		decodeFrame.setVisible(true);
		
		encodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				encoded = cipher.encode(encodeInputField.getText(), (int) encodeKeySpinner.getValue());			//Here we get the text from the inputField and get the key entered on the spinner and send that to be encoded, we then save the resulting string
				encodeOutputField.setText(encoded);																//Here we show the resulting encoded string to the user, allowing him to copy it if he wants
				toDecoderButton.setEnabled(true);																//Here we enable the user to send this string directely to the decoder
			}
		});
		decodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decoded = cipher.decode(decodeInputField.getText(), (int) decodeKeySpinner.getValue());			//Here we get the text from the inputField and the key entered on the spinner and send that to be decoded, we then save the resulting string
				decodeOutputField.setText(decoded);																//Here we show the resulting decoded string to the user, allowing him to copy it if he wants
				toEncodeButton.setEnabled(true);																//Here we enable the user to send this string directely to the encoder
			}
		});
		toDecoderButton.addActionListener(new ActionListener() {												//Here we send the encoded string to the decoder , send the key to the decoder and enable the button to decode it
			public void actionPerformed(ActionEvent e) {
				decodeInputField.setText(encoded);
				decodeKeySpinner.setValue(encodeKeySpinner.getValue());
				decodeButton.setEnabled(true);
			}
		});
		toEncodeButton.addActionListener(new ActionListener() {													//Here we send the decoded string to the encoder, along with the key used to decode it, and we enable the button to encode it
			public void actionPerformed(ActionEvent e) {
				encodeInputField.setText(decoded);
				encodeKeySpinner.setValue(decodeKeySpinner.getValue());
				encodeButton.setEnabled(true);
			}
		});
		encodeInputField.addKeyListener(new KeyAdapter() {														//This will only enable the encode button after some text has been entered to encode
			@Override
			public void keyTyped(KeyEvent arg0) {
				encodeButton.setEnabled(true);
			}
		});
		decodeInputField.addKeyListener(new KeyAdapter() {														//This will only enable the decode button after some text has been entered to decode
			@Override
			public void keyTyped(KeyEvent arg0) {
				decodeButton.setEnabled(true);
			}
		});
		/*
		 * Since we have the outputFields as editable (which we have in order to allow copying from these fields) we need to make sure that the user cannot change the string values on those fields
		 * We do this by comparing the current text with the text as it should be, and if they are not the same we set the text back to what it should be.
		 * We have a 100 millisecond sleep in order to save CPU load and allow the listeners to work.
		 * 100 milliseconds should be enough to stop the user from entering text and clicking the toDecode/toEncode button before the text has been changed back
		 */
		while (true){																							
			if (!encodeOutputField.getText().equals(encoded)){
				encodeOutputField.setText(encoded);
			}
			if (!decodeOutputField.getText().equals(decoded)){
				decodeOutputField.setText(decoded);
			}
			try {
				Thread.sleep(100);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
