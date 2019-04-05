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

import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/**
 * A AES/GCM specific {@link CipherLite} that support re-processing of input
 * data via {@link #mark()} and {@link #reset()}.
 * 
 * @author Hanson Char
 * 
 * @see CipherLite
 */
final class GCMCipherLite extends CipherLite {
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM
            .getTagLengthInBits() / 8;
    /** Applicable only for encryption; set to zero otherwise. */
    private final int tagLen;
    /**
     * The total number of bytes (excluding the final tag) that has been output
     * by this cipher since the beginning of the input that have been processed
     * by the AES/GCM cipher.
     */
    private long outputByteCount;
    /**
     * The last part of the plaintext has been processed by the GCM cipher but
     * not reflected in the {@link #outputByteCount}.
     */
    private boolean invisiblyProcessed;
    /**
     * The current number of bytes since the beginning of the plaintext that
     * have been re-encrypted and output so far. If {@link #currentCount} <
     * {@link #outputByteCount}, it means re-processing using AES/CTR is in
     * progress. If {@link #currentCount} == {@link #outputByteCount}, it means
     * it is not re-processing and therefore the AES/GCM cipher should be used.
     */
    private long currentCount;
    /**
     * Used to mark the location where a reset can be made for re-processing
     * purposes.
     */
    private long markedCount;
    /**
     * An auxiliary cipher that is used for re-processing purposes, or null if
     * no re-processing is in progress.
     */
    private CipherLite aux;
    /**
     * The final bytes that has been computed, or null if it has not yet been
     * computed.
     */
    private byte[] finalBytes;
    /**
     * True if doFinal has been called; false otherwise.
     */
    private boolean doneFinal;
    /**
     * True if a security exception has been thrown, which means this cipher
     * lite must no longer be used.
     */
    private boolean securityViolated;

    GCMCipherLite(Cipher cipher, SecretKey secreteKey, int cipherMode) {
        super(cipher, ContentCryptoScheme.AES_GCM, secreteKey, cipherMode);
        tagLen = cipherMode == Cipher.ENCRYPT_MODE ? TAG_LENGTH : 0;
        if (cipherMode != Cipher.ENCRYPT_MODE
                && cipherMode != Cipher.DECRYPT_MODE) {
            throw new IllegalArgumentException();
        }
    }

    byte[] doFinal() throws IllegalBlockSizeException,
            BadPaddingException {
        if (doneFinal) {
            if (securityViolated)
                throw new SecurityException();
            // final bytes can only be null for decryption
            return finalBytes == null ? null : finalBytes.clone();
        }
        doneFinal = true;
        finalBytes = super.doFinal();
        if (finalBytes == null)
            return null;    // only possible for decryption
        outputByteCount += checkMax(finalBytes.length - tagLen);
        return finalBytes.clone();
    }

    final byte[] doFinal(byte[] input) throws IllegalBlockSizeException,
            BadPaddingException {
        return doFinal0(input, 0, input.length);
    }

    final byte[] doFinal(byte[] input, int inputOffset, int inputLen)
            throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(input, inputOffset, inputLen);
    }

    private final byte[] doFinal0(byte[] input, int inputOffset, int inputLen)
            throws IllegalBlockSizeException, BadPaddingException {
        if (doneFinal) {
            if (securityViolated)
                throw new SecurityException();
            if (Cipher.DECRYPT_MODE == getCipherMode())
                return finalBytes == null ? null : finalBytes.clone();
            // final bytes must have been previously computed via encryption
            int finalDataLen = finalBytes.length - tagLen;
            if (inputLen == finalDataLen)
                return finalBytes.clone();
            if (inputLen < finalDataLen) {
                if (inputLen + currentCount == outputByteCount) {
                    int from = finalBytes.length - tagLen - inputLen;
                    return Arrays.copyOfRange(finalBytes, from, finalBytes.length);
                }
            }
            throw new IllegalStateException("Inconsistent re-rencryption");
        }
        doneFinal = true;
        // compute final bytes for the first time
        finalBytes = super.doFinal(input, inputOffset, inputLen);
        if (finalBytes == null)
            return null;    // only possible for decryption
        outputByteCount += checkMax(finalBytes.length - tagLen);
        return finalBytes.clone();
    }

    /**
     * @param inputLen
     *            for {@link #mark()} and {@link #reset()} to work correctly,
     *            inputLen should always be in multiple of 16 bytes except for
     *            the very last part of the plaintext.
     */
    byte[] update(byte[] input, int inputOffset, int inputLen) {
        byte[] out;
        if (aux == null) {
            out = super.update(input, inputOffset, inputLen);
            if (out == null) {
                invisiblyProcessed = input.length > 0;
                return null;
            }
            outputByteCount += checkMax(out.length);
            // There is no need to update "currentCount" here given "aux" is
            // null, as currentCount is irrelevant when reencryption is NOT in
            // progress.
            invisiblyProcessed = out.length == 0 && inputLen > 0;
        } else {
            out = aux.update(input, inputOffset, inputLen);
            if (out == null)
                return null;    // possible even for encryption
            currentCount += out.length;
            if (currentCount == outputByteCount) {
                aux = null; // flip back to the original GCM cipher
            } else if (currentCount > outputByteCount) {
                if (Cipher.ENCRYPT_MODE == getCipherMode()) {
                    throw new IllegalStateException("currentCount=" + currentCount
                        + " > outputByteCount=" + outputByteCount);
                }
                // For decryption, this is possible since AES/CTR doesn't know
                // about the tag at the end
                int finalBytesLen = (finalBytes == null ? 0 : finalBytes.length);
                long diff = outputByteCount - (currentCount - out.length) - finalBytesLen;
                currentCount = outputByteCount - finalBytesLen;
                aux = null; // flip back to the original GCM cipher
                return Arrays.copyOf(out, (int)diff);
            }
        }
        return out;
    }

    /**
     * Returns the input delta but only if it will not result in exceeding the
     * limit of the maximum number of bytes that can be processed by AES/GCM.
     * 
     * @throws SecurityException
     *             if the number of bytes processed has exceeded the maximum
     *             allowed by AES/GCM.
     */
    private int checkMax(int delta) {
        if (outputByteCount + delta > ContentCryptoScheme.MAX_GCM_BYTES) {
            securityViolated = true;
            throw new SecurityException(
                    "Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount="
                            + outputByteCount + ", delta=" + delta + "]");
        }
        return delta;
    }

    @Override long mark() {
        return this.markedCount = aux == null ? outputByteCount : currentCount;
    }

    @Override boolean markSupported() { return true; }

    @Override void reset() {
        if (markedCount < outputByteCount || invisiblyProcessed) {
            try {
                aux = createAuxiliary(markedCount);
                // assign to currentCount after calling createAuillary, not
                // before, just in case createAuillary failed
                currentCount = markedCount;
            } catch (Exception e) {
                throw ((e instanceof RuntimeException)
                    ? (RuntimeException)e
                    : new IllegalStateException(e))
                    ;
            }
        }
    }

    /**
     * For testing purposes only.
     */
    byte[] getFinalBytes() {
        return finalBytes == null ? null : finalBytes.clone();
    }

    /**
     * For testing purposes.
     * Applicable only during encryption: returns the tag that has been
     * produced; or null otherwise.
     */
    byte[] getTag() {
        return getCipherMode() != Cipher.ENCRYPT_MODE || finalBytes == null
             ? null
             : Arrays.copyOfRange(finalBytes,
                 finalBytes.length - tagLen, finalBytes.length)
             ;
    }

    /**
     * For testing purposes.
     */
    long getOutputByteCount() {
        return outputByteCount;
    }

    /**
     * For testing purposes.
     */
    long getCurrentCount() {
        return currentCount;
    }

    /**
     * For testing purposes.
     */
    long getMarkedCount() {
        return markedCount;
    }
}
