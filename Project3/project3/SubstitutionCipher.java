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
			temp+= (char) (input.charAt(i)+key);
			i++;
		}
		return temp;
	}

	@Override
	public String decode(String input, int key) {		//I tried making these static however Java 7 does not allow me to, Java 8 would allow me to however I am running programs that require me to stay on 7 for the time being
		String temp = "";
		int i = 0;
		while (i<input.length()){
			temp+= (char) (input.charAt(i)-key);
			i++;
		}
		return temp;
	}

}
