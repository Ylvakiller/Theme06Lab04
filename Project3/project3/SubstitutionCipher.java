package project3;

public class SubstitutionCipher implements MessageDecoder, MessageEncoder {
	/**
	 * We dont really need to do anything in this constructor at this time
	 */
	public SubstitutionCipher() {
	}
	@Override
	public String encode(String input, int key) {		//I tried making these static however Java 7 does not allow me to, Java 8 would allow me to however I am running programs that require me to stay on 7 for the time being
		String temp = "";
		int i = 0;
		while (i<input.length()){
			temp+= (char) (input.charAt(i)+key);		//Here we move the char by the key, this keeps on working when overflowing if we use the same key later on
			i++;
		}
		return temp;
	}

	@Override
	public String decode(String input, int key) {		//I tried making these static however Java 7 does not allow me to, Java 8 would allow me to however I am running programs that require me to stay on 7 for the time being
		String temp = "";
		int i = 0;
		while (i<input.length()){
			temp+= (char) (input.charAt(i)-key);		//Here we substract the key from the character, giving the original key. has been tested to work with a key of 10 000, also works for any given input (not just text but also numbers and special signs)
			i++;										//Keep in mind that since java uses Unicode, keys around 1500 result in arabic signs whilst keys in the 1 million range give some form of chinese or japanese as cipher text
		}
		return temp;
	}

}
