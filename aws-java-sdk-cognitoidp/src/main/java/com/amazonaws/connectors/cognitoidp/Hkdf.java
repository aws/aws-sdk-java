/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */
package com.math.pro.ak.util.cognito;

import com.amazonaws.util.StringUtils;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/**
 * Utility class for all HKDF operations.
 */
public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private final String algorithm;
    private SecretKey prk = null;
    private static final int MAX_KEY_SIZE = 255;

    /**
     * Returns an new instance
     *
     * @param algorithm the crypto algorithm
     * @return a new instance of {@link Hkdf}
     * @throws NoSuchAlgorithmException
     */
    public static Hkdf getInstance(String algorithm) throws NoSuchAlgorithmException {
        final Mac mac = Mac.getInstance(algorithm);
        return new Hkdf(algorithm);
    }

    /**
     * @param ikm REQUIRED: The input key material.
     */
    public void init(byte[] ikm) {
        this.init(ikm, (byte[]) null);
    }

    /**
     * @param ikm REQUIRED: The input key material.
     * @param salt REQUIRED: Random bytes for salt.
     */
    public void init(byte[] ikm, byte[] salt) {
        byte[] realSalt = salt == null ? EMPTY_ARRAY : (byte[]) salt.clone();
        byte[] rawKeyMaterial = EMPTY_ARRAY;

        try {
            final Mac e = Mac.getInstance(this.algorithm);
            if (realSalt.length == 0) {
                realSalt = new byte[e.getMacLength()];
                Arrays.fill(realSalt, (byte) 0);
            }

            e.init(new SecretKeySpec(realSalt, this.algorithm));
            rawKeyMaterial = e.doFinal(ikm);
            final SecretKeySpec key = new SecretKeySpec(rawKeyMaterial, this.algorithm);
            Arrays.fill(rawKeyMaterial, (byte) 0);
            this.unsafeInitWithoutKeyExtraction(key);
        } catch (final GeneralSecurityException var10) {
            throw new RuntimeException("Unexpected exception", var10);
        } finally {
            Arrays.fill(rawKeyMaterial, (byte) 0);
        }

    }

    /**
     * @param rawKey REQUIRED: Current secret key.
     * @throws InvalidKeyException
     */
    public void unsafeInitWithoutKeyExtraction(SecretKey rawKey) throws InvalidKeyException {
        if (!rawKey.getAlgorithm().equals(this.algorithm)) {
            throw new InvalidKeyException(
                    "Algorithm for the provided key must match the algorithm for this Hkdf. Expected "
                            + this.algorithm + " but found " + rawKey.getAlgorithm());
        } else {
            this.prk = rawKey;
        }
    }

    /**
     * @param algorithm REQUIRED: The type of HMAC algorithm to be used.
     */
    private Hkdf(String algorithm) {
        if (!algorithm.startsWith("Hmac")) {
            throw new IllegalArgumentException("Invalid algorithm " + algorithm
                    + ". Hkdf may only be used with Hmac algorithms.");
        } else {
            this.algorithm = algorithm;
        }
    }

    /**
     * @param info REQUIRED
     * @param length REQUIRED
     * @return converted bytes.
     */
    public byte[] deriveKey(String info, int length) {
        return this.deriveKey(info != null ? info.getBytes(StringUtils.UTF8) : null, length);
    }

    /**
     * @param info REQUIRED
     * @param length REQUIRED
     * @return converted bytes.
     */
    public byte[] deriveKey(byte[] info, int length) {
        final byte[] result = new byte[length];

        try {
            this.deriveKey(info, length, result, 0);
            return result;
        } catch (final ShortBufferException var5) {
            throw new RuntimeException(var5);
        }
    }

    /**
     * @param info REQUIRED
     * @param length REQUIRED
     * @param output REQUIRED
     * @param offset REQUIRED
     * @throws ShortBufferException
     */
    public void deriveKey(byte[] info, int length, byte[] output, int offset)
            throws ShortBufferException {
        this.assertInitialized();
        if (length < 0) {
            throw new IllegalArgumentException("Length must be a non-negative value.");
        } else if (output.length < offset + length) {
            throw new ShortBufferException();
        } else {
            final Mac mac = this.createMac();
            if (length > MAX_KEY_SIZE * mac.getMacLength()) {
                throw new IllegalArgumentException(
                        "Requested keys may not be longer than 255 times the underlying HMAC length.");
            } else {
                byte[] t = EMPTY_ARRAY;

                try {
                    int loc = 0;

                    for (byte i = 1; loc < length; ++i) {
                        mac.update(t);
                        mac.update(info);
                        mac.update(i);
                        t = mac.doFinal();

                        for (int x = 0; x < t.length && loc < length; ++loc) {
                            output[loc] = t[x];
                            ++x;
                        }
                    }
                } finally {
                    Arrays.fill(t, (byte) 0);
                }

            }
        }
    }

    /**
     * @return the generates message authentication code.
     */
    private Mac createMac() {
        try {
            final Mac ex = Mac.getInstance(this.algorithm);
            ex.init(this.prk);
            return ex;
        } catch (final NoSuchAlgorithmException var2) {
            throw new RuntimeException(var2);
        } catch (final InvalidKeyException var3) {
            throw new RuntimeException(var3);
        }
    }

    /**
     * Checks for a valid pseudo-random key.
     */
    private void assertInitialized() {
        if (this.prk == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }
}