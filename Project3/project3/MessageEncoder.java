package project3;

public interface MessageEncoder {
	/**
	 * This method should encode the input using the key
	 * @param input the string to encode
	 * @param key the key with which to encode (should be used in order to decode)
	 * @return the encoded string
	 */
	public String encode(String input, int key);
}
