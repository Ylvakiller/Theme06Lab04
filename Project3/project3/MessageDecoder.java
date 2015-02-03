package project3;

public interface MessageDecoder {
	/**
	 * This method should be able to decode the given input utilizing the key
	 * @param input the string to decode
	 * @param key the key used in the encoding process
	 * @return the resulting decoded string
	 */
	public String decode(String input, int key);
}
