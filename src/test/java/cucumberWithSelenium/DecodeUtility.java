package cucumberWithSelenium;

import java.util.Base64;

public class DecodeUtility {
	public static String decodeSensitiveData(String encodedData) {
		byte[] encodeBytes = Base64.getDecoder().decode(encodedData.getBytes());
		return new String(encodeBytes);
	}

}
