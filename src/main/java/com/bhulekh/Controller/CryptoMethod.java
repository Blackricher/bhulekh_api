package com.bhulekh.Controller;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.stereotype.Service;


@Service
public class CryptoMethod {

   // private String key = "UtaDataAgriData"; // Replace this with your actual secret key
//	private String jwtToken;
//    public String decryptMethod(String text) throws Exception {
//    	if (jwtToken == null) {
//            throw new IllegalStateException("JWT token is not set");
//        }
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        byte[] keyBytes = new byte[16];
//        byte[] b = jwtToken.getBytes("UTF-8");
//        int len = b.length;
//        if (len > keyBytes.length)
//            len = keyBytes.length;
//        System.arraycopy(b, 0, keyBytes, 0, len);
//        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
//        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
//        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
//
//        // URL decode the encrypted value before decryption
//        String decodedText = URLDecoder.decode(text, "UTF-8");
//        byte[] decodedBytes = Base64Utils.decode(decodedText.getBytes("UTF-8"));
//        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
//        return new String(decryptedBytes, "UTF-8");
//    }

//    public String encryptMethod(String text) throws Exception {
//    	if (jwtToken == null) {
//            throw new IllegalStateException("JWT token is not set");
//        }
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        byte[] keyBytes = new byte[16];
//        byte[] b = jwtToken.getBytes("UTF-8");
//        int len = b.length;
//        if (len > keyBytes.length)
//            len = keyBytes.length;
//        System.arraycopy(b, 0, keyBytes, 0, len);
//        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
//        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
//        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
//
//        byte[] encryptedBytes = cipher.doFinal(text.getBytes("UTF-8"));
//
//        // URL encode the encrypted value
//        //Base64.getUrlEncoder() method instead of Base64Utils.encodeToString()
//        String urlEncodedString = URLEncoder.encode(Base64Utils.encodeToString(encryptedBytes), "UTF-8");
//
//        return urlEncodedString;
//    }
	public String decryptMethod(String text,String jwtToken) throws Exception {
	   
		
		
		
		if (jwtToken == null) {
	        throw new IllegalStateException("JWT token is not set");
	    }
	    String sha256Jwt = hashSHA256(jwtToken, 7);
	    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    byte[] keyBytes = new byte[16];
	    byte[] b = sha256Jwt.getBytes("UTF-8");
	    int len = b.length;
	    if (len > keyBytes.length)
	        len = keyBytes.length;
	    System.arraycopy(b, 0, keyBytes, 0, len);
	    SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
	    IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
	    cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

	    // URL decode the input before Base64 decoding
	    String decodedText = URLDecoder.decode(text, "UTF-8");

	    byte[] decodedBytes = Base64.getUrlDecoder().decode(decodedText.getBytes("UTF-8"));
	    byte[] decryptedBytes = cipher.doFinal(decodedBytes);
	    return new String(decryptedBytes, "UTF-8");
	}

    public String encryptMethod(String text,String jwtToken) throws Exception {
        if (jwtToken == null) {
            throw new IllegalStateException("JWT token is not set");
        }
        String sha256Jwt = hashSHA256(jwtToken, 7);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] keyBytes = new byte[16];
        byte[] b = sha256Jwt.getBytes("UTF-8");
        int len = b.length;
        if (len > keyBytes.length)
            len = keyBytes.length;
        System.arraycopy(b, 0, keyBytes, 0, len);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

        byte[] encryptedBytes = cipher.doFinal(text.getBytes("UTF-8"));

        // Encode the encrypted bytes with Base64 URL-safe encoding
        String base64EncodedString = Base64.getUrlEncoder().withoutPadding().encodeToString(encryptedBytes);

        // URL encode the encrypted value
        String urlEncodedString = URLEncoder.encode(base64EncodedString, "UTF-8");

        return urlEncodedString;
    }

    private String hashSHA256(String input, int length) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();

        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        // Truncate the hash value to the desired length
        String hashedValue = hexString.toString().substring(0, Math.min(length, hexString.length()));
        System.out.println("SHA-256 hash value: " + hashedValue); // Print hash value to console

        return hashedValue;
    }
//
//
//    public void setJwtToken(String jwtToken) {
//        this.jwtToken = jwtToken;
//    }


}
