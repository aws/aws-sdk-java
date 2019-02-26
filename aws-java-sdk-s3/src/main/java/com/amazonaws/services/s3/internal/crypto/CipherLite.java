/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.internal.crypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/**
 * Functions like a {@link Cipher} but provides only a subset of all the
 * interface methods of {@link Cipher}. This class is intended to be used in
 * lieu of the underlying Cipher directly whenever applicable. For example, this
 * class makes it easy to generate an inverse cipher, or to create an
 * "auxiliary" cipher for use with get-range or multi-part upload operations. A
 * subclass may also support the mark and reset operations to enable parts of a
 * plaintext to be re-processed which is useful for error recovery typical when
 * network transmission is involved.
 * <p>
 * However a cipher lite, unlike a {@link Cipher}, can only be used once, and
 * cannot be reused after the {@link #doFinal()} methods have been invoked. In
 * other words, it is NOT true that, upon finishing, the doFinal method will
 * reset the cipher lite object to the state it was in when first constructed.
 *
 * @author Hanson Char
 *
 * @see GCMCipherLite
 */
class CipherLite {
    /**
     * A no-op implementation.
     */
    static final CipherLite Null = new CipherLite() {
        @Override
        CipherLite createAuxiliary(long startingBytePos) {
            return this;
        }

        @Override
        CipherLite createInverse() {
            return this;
        }
    };
    private final Cipher cipher;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;
    private final int cipherMode;

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    CipherLite(Cipher cipher, ContentCryptoScheme scheme,
            SecretKey secreteKey, int cipherMode) {
        this.cipher = cipher;
        this.scheme = scheme;
        this.secreteKey = secreteKey;
        this.cipherMode = cipherMode;
    }

    /**
     * Recreates a new instance of CipherLite from the current one.
     */
    CipherLite recreate() {
        return scheme.createCipherLite(secreteKey, cipher.getIV(),
                this.cipherMode, cipher.getProvider(), true);
    }

    /**
     * Creates a new instance of CipherLite from the current one, but using
     * the given IV.
     */
    CipherLite createUsingIV(byte[] iv) {
        return scheme.createCipherLite(secreteKey, iv, this.cipherMode,
                cipher.getProvider(), true);
    }

    /**
     * Returns an auxiliary {@link CipherLite} for partial plaintext
     * re-encryption (or re-decryption) purposes.
     *
     * @param startingBytePos
     *            the starting byte position of the plaintext. Must be a
     *            multiple of the cipher block size.
     */
    CipherLite createAuxiliary(long startingBytePos)
            throws InvalidKeyException, NoSuchAlgorithmException,
            NoSuchProviderException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        return scheme.createAuxillaryCipher(secreteKey, cipher.getIV(),
                cipherMode, cipher.getProvider(), startingBytePos);
    }

    /**
     * Returns the inverse of the current {@link CipherLite}.
     */
    CipherLite createInverse() throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidAlgorithmParameterException {
        int inversedMode;
        if (cipherMode == Cipher.DECRYPT_MODE)
            inversedMode = Cipher.ENCRYPT_MODE;
        else if (cipherMode == Cipher.ENCRYPT_MODE)
            inversedMode = Cipher.DECRYPT_MODE;
        else
            throw new UnsupportedOperationException();
        return scheme.createCipherLite(secreteKey, cipher.getIV(),
                inversedMode, cipher.getProvider(), true);
    }

    /**
     * Finishes a multiple-part encryption or decryption operation, depending on
     * how the underlying cipher was initialized.
     *
     * <p>
     * Input data that may have been buffered during a previous
     * <code>update</code> operation is processed, with padding (if requested)
     * being applied. If an AEAD mode such as GCM/CCM is being used, the
     * authentication tag is appended in the case of encryption, or verified in
     * the case of decryption. The result is stored in a new buffer.
     *
     * <p>
     * Note: if any exception is thrown, a new instance of this cipher lite
     * object may need to be constructed before it can be used again. be
     * reconstructed before it can be used again.
     *
     * @return the new buffer with the result
     *
     * @exception IllegalStateException
     *                if this cipher is in a wrong state (e.g., has not been
     *                initialized)
     * @exception IllegalBlockSizeException
     *                if this cipher is a block cipher, no padding has been
     *                requested (only in encryption mode), and the total input
     *                length of the data processed by this cipher is not a
     *                multiple of block size; or if this encryption algorithm is
     *                unable to process the input data provided.
     * @exception BadPaddingException
     *                if this cipher is in decryption mode, and (un)padding has
     *                been requested, but the decrypted data is not bounded by
     *                the appropriate padding bytes
     * @exception javax.crypto.AEADBadTagException
     *                if this cipher is decrypting in an AEAD mode (such as
     *                GCM/CCM), and the received authentication tag does not
     *                match the calculated value
     */
    byte[] doFinal() throws IllegalBlockSizeException,
            BadPaddingException {
        return cipher.doFinal();
    }

    /**
     * Encrypts or decrypts data in a single-part operation, or finishes a
     * multiple-part operation. The data is encrypted or decrypted, depending on
     * how the underlying cipher was initialized.
     *
     * <p>
     * The bytes in the <code>input</code> buffer, and any input bytes that may
     * have been buffered during a previous <code>update</code> operation, are
     * processed, with padding (if requested) being applied. If an AEAD mode
     * such as GCM/CCM is being used, the authentication tag is appended in the
     * case of encryption, or verified in the case of decryption. The result is
     * stored in a new buffer.
     *
     * <p>
     * Note: if any exception is thrown, a new instance of this cipher lite
     * object may need to be constructed before it can be used again.
     *
     * @param input
     *            the input buffer
     *
     * @return the new buffer with the result
     *
     * @exception IllegalStateException
     *                if this cipher is in a wrong state (e.g., has not been
     *                initialized)
     * @exception IllegalBlockSizeException
     *                if this cipher is a block cipher, no padding has been
     *                requested (only in encryption mode), and the total input
     *                length of the data processed by this cipher is not a
     *                multiple of block size; or if this encryption algorithm is
     *                unable to process the input data provided.
     * @exception BadPaddingException
     *                if this cipher is in decryption mode, and (un)padding has
     *                been requested, but the decrypted data is not bounded by
     *                the appropriate padding bytes; or if this cipher is
     *                decrypting in an AEAD mode (such as GCM/CCM), and the
     *                received authentication tag does not match the calculated
     *                value
     */
    byte[] doFinal(byte[] input) throws IllegalBlockSizeException,
            BadPaddingException {
        return cipher.doFinal(input);
    }

    /**
     * Encrypts or decrypts data in a single-part operation, or finishes a
     * multiple-part operation. The data is encrypted or decrypted, depending on
     * how the underlying cipher was initialized.
     *
     * <p>
     * The first <code>inputLen</code> bytes in the <code>input</code> buffer,
     * starting at <code>inputOffset</code> inclusive, and any input bytes that
     * may have been buffered during a previous <code>update</code> operation,
     * are processed, with padding (if requested) being applied. If an AEAD mode
     * such as GCM/CCM is being used, the authentication tag is appended in the
     * case of encryption, or verified in the case of decryption. The result is
     * stored in a new buffer.
     *
     * <p>
     * Note: if any exception is thrown, a new instance of this cipher lite
     * object may need to be constructed before it can be used again.
     *
     * @param input
     *            the input buffer
     * @param inputOffset
     *            the offset in <code>input</code> where the input starts
     * @param inputLen
     *            the input length
     *
     * @return the new buffer with the result
     *
     * @exception IllegalStateException
     *                if this cipher is in a wrong state (e.g., has not been
     *                initialized)
     * @exception IllegalBlockSizeException
     *                if this cipher is a block cipher, no padding has been
     *                requested (only in encryption mode), and the total input
     *                length of the data processed by this cipher is not a
     *                multiple of block size; or if this encryption algorithm is
     *                unable to process the input data provided.
     * @exception BadPaddingException
     *                if this cipher is in decryption mode, and (un)padding has
     *                been requested, but the decrypted data is not bounded by
     *                the appropriate padding bytes; or if this cipher is
     *                decrypting in an AEAD mode (such as GCM/CCM), and the
     *                received authentication tag does not match the calculated
     *                value
     */
    byte[] doFinal(byte[] input, int inputOffset, int inputLen)
            throws IllegalBlockSizeException, BadPaddingException {
        return cipher.doFinal(input, inputOffset, inputLen);
    }

    /**
     * Continues a multiple-part encryption or decryption operation (depending
     * on how the underlying cipher was initialized), processing another data
     * part.
     *
     * <p>
     * The first <code>inputLen</code> bytes in the <code>input</code> buffer,
     * starting at <code>inputOffset</code> inclusive, are processed, and the
     * result is stored in a new buffer.
     *
     * <p>
     * If <code>inputLen</code> is zero, this method returns <code>null</code>.
     *
     * @param input
     *            the input buffer
     * @param inputOffset
     *            the offset in <code>input</code> where the input starts
     * @param inputLen
     *            the input length
     *
     * @return the new buffer with the result, or null if the underlying cipher
     *         is a block cipher and the input data is too short to result in a
     *         new block.
     *
     * @exception IllegalStateException
     *                if the underlying cipher is in a wrong state (e.g., has
     *                not been initialized)
     */
    byte[] update(byte[] input, int inputOffset, int inputLen) {
        return cipher.update(input, inputOffset, inputLen);
    }

    /**
     * Returns the algorithm name of the underlying cipher.
     */
    final String getCipherAlgorithm() {
        return cipher.getAlgorithm();
    }

    /**
     * Returns the provider of the underlying cipher.
     */
    final Provider getCipherProvider() {
        return cipher.getProvider();
    }

    /**
     * Returns the standard algorithm name for the secret key. For example,
     * "DSA" would indicate that this key is a DSA key. See Appendix A in the <a
     * href=
     * "http://docs.oracle.com/javase/6/docs/technotes/guides/security/crypto/CryptoSpec.html#AppA"
     * > Java Cryptography Architecture API Specification &amp; Reference </a>
     * for information about standard algorithm names.
     */
    final String getSecretKeyAlgorithm() {
        return secreteKey.getAlgorithm();
    }

    /**
     * This method is provided only for testing purposes. The {@link CipherLite}
     * is intended to be used in lieu of the underlying Cipher.
     */
    final Cipher getCipher() {
        return cipher;
    }

    final ContentCryptoScheme getContentCryptoScheme() {
        return scheme;
    }

    /**
     * Returns the initialization vector (IV) in a new buffer.
     *
     * <p>This is useful in the case where a random IV was created,
     * or in the context of password-based encryption or
     * decryption, where the IV is derived from a user-supplied password.
     *
     * @return the initialization vector in a new buffer, or null if the
     * underlying algorithm does not use an IV, or if the IV has not yet
     * been set.
     */
    final byte[] getIV() {
        return cipher.getIV();
    }

    /**
     * Returns the block size (in bytes).
     *
     * @return the block size (in bytes), or 0 if the underlying algorithm is
     * not a block cipher
     */
    final int getBlockSize() {
        return cipher.getBlockSize();
    }

    final int getCipherMode() {
        return cipherMode;
    }

    /**
     * Tests if this cipher lite supports the <code>mark</code>
     * and <code>reset</code> methods.  Returns false by default, but subclass
     * may override.
     */
    boolean markSupported() { return false; }

    /**
     * Marks the current position in this cipher lite. A subsequent call to the
     * <code>reset</code> method repositions this cipher lite at the last marked
     * position so that subsequent crypto operations will be logically performed
     * in an idempotent manner as if the cipher has been rewinded back to the
     * marked position.
     *
     * <p>
     * The general contract of <code>mark</code> is that, if the method
     * <code>markSupported</code> returns <code>true</code>, the cipher lite
     * somehow remembers the internal state after the call to <code>mark</code>
     * and stands ready to restore to the internal state so that it would be
     * able to produce the same output given the same input again if and
     * whenever the method <code>reset</code> is called.
     *
     * @return the current position marked or -1 if mark/reset is not supported.
     */
    long mark() { return -1; }

    /**
     * Repositions this cipher lite to the position at the time the
     * <code>mark</code> method was last called.
     *
     * <p>
     * The general contract of <code>reset</code> is:
     *
     * <p>
     * <ul>
     * <li>If the method <code>markSupported</code> returns <code>true</code>,
     * then the cipher lite is reset to the internal state since the most recent
     * call to <code>mark</code> (or since the start of the input data, if
     * <code>mark</code> has not been called), so that subsequent callers of the
     * <code>udpate</code> or <code>doFinal</code> method would produce the same
     * output given the same input data identical to the input data after the
     * <code>mark</code> method was last called..</li>
     *
     * <li>If the method <code>markSupported</code> returns <code>false</code>,
     * then the call to <code>reset</code> may throw an
     * <code>IllegalStateException</code>.</li>
     * </ul>
     */
    void reset() {
        throw new IllegalStateException("mark/reset not supported");
    }

    int getOutputSize(int inputLen) {
        return cipher.getOutputSize(inputLen);
    }
}
