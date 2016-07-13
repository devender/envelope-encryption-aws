package com.gdr.aws.kms;

/**
 * Created by dgollapally on 7/12/16.
 */
public final class EnvelopeEncryptedMessage {

    private byte[] encryptedKey;
    private String ciphertext;

    public byte[] getEncryptedKey() {
        return encryptedKey;
    }

    public void setEncryptedKey(byte[] encryptedKey) {
        this.encryptedKey = encryptedKey;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }

    public String getCiphertext() {
        return ciphertext;
    }


}
