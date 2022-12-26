package importantJava.cyphers.vernam;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * VernamCiphers
 */
public class VernamCiphers {

     String NAME = "Vernam Cypher";
     char encryptionArr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    //empty constructor
     public VernamCiphers(){
    }
    /*
     *Return a string that represents the key of the input length,
     *Return null if there is a problem with the input length. 
     */
    String generateKey(int length){
    if(length <= 0){
        return null;
    }
    String key = "";
    SecureRandom secureRandom = new SecureRandom();
    //To be tested for errors while it is been executed.
    try {
        secureRandom = SecureRandom.getInstance("SHA1PRNG");
    } catch (NoSuchAlgorithmException  e) {

        e.printStackTrace();
    }
    //Builds the key.
    for (int i = 0; i < length; i++) {

        int randomValue = secureRandom.nextInt(26);
        key +=encryptionArr[randomValue];
    }
    return key;
    /**
     * Encrypts using the formula: key XOR with m
     * Returns cypher text or null if an error occurs
     */

    } 
    public String encrypt(String plainText, String key){
        //the key and the plaintxt should be of same text
        if (plainText.length() != key.length()) {
            return null;
        }
        byte[] plainTextBytes = plainText.getBytes();
        byte[] keyBytes = key.getBytes();
        byte[] encryptedText = new byte[plainTextBytes.length];
        for (int i = 0; i < plainTextBytes.length; i++) {
            encryptedText[i] = (byte) (keyBytes[i] ^ plainTextBytes[i]);
        }
        return new String(encryptedText);
    }
    /**
     * Decrypts using the formula: key XOR ciphertext.
     * Returns plain text or null if there is an error.
     */
    public String decrypt(String cypherText, String key){
    //the key and the plaintxt should be of same text
    if (cypherText.length() != key.length()) {
        return null;
    }    
    byte[] cypherTextBytes = cypherText.getBytes();
    byte[] keyBytes = key.getBytes();
    byte[] dencryptedText = new byte[cypherTextBytes.length];
    for (int i = 0; i < cypherTextBytes.length; i++) {
        dencryptedText[i] = (byte) (keyBytes[i] ^ cypherTextBytes[i]);
    }
    return new String(dencryptedText).toUpperCase();
    }
/**
 * Returns the cipher name.
 */
public String getName(){
    return NAME;
}
 public static void main(String[] args) {
     VernamCiphers vc = new VernamCiphers();

     vc.encrypt("plainText", "");
 }
}