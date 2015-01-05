package project3;
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

/**
 * This class is meant as a driver and tester class for this project
 * @author Ylva
 *
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
