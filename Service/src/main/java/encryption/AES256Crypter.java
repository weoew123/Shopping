package encryption;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.management.openmbean.InvalidKeyException;

import org.apache.commons.codec.binary.Base64;

public class AES256Crypter {

	public static byte[] byteIv = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
			0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
	public static String strKey = "abcdefghijklmnopqrstuvwxyz012345";

	public static String encrypt(String strData)
			throws java.io.UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException,
			IllegalBlockSizeException, BadPaddingException,
			java.security.InvalidKeyException {
		
		byte[] byteText = strData.getBytes("UTF-8");
		AlgorithmParameterSpec aps = new IvParameterSpec(byteIv);
		SecretKeySpec sks = new SecretKeySpec(strKey.getBytes("UTF-8"), "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, sks, aps);
		
		return Base64.encodeBase64String(cipher.doFinal(byteText));
	}

	public static String decrypt(String strData)
			throws java.io.UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException,
			IllegalBlockSizeException, BadPaddingException,
			java.security.InvalidKeyException {
		
		byte[] byteText = Base64.decodeBase64(strData);
		// byte[] byteText = strData.getBytes("UTF-8");
		AlgorithmParameterSpec aps = new IvParameterSpec(byteIv);
		SecretKeySpec sks = new SecretKeySpec(strKey.getBytes("UTF-8"), "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, sks, aps);
		return new String(cipher.doFinal(byteText), "UTF-8");
	}
}
