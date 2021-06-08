/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

/**
 * The range get mode controls the behavior of {@link com.amazonaws.services.s3.AmazonS3EncryptionV2} when a request is
 * made for only part of an object.
 * <p>
 * Range gets do not provide authenticated encryption properties even when used with an authenticated mode (AES-GCM).
 * See https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html
 */
public enum CryptoRangeGetMode {
    /**
     * All range gets are disabled regardless the content encryption algorithm or configured {@link CryptoMode}.
     */
    DISABLED(new Predicate() {
        @Override
        public boolean isPermitted(CryptoMode cryptoMode, String algorithm) {
            return false;
        }
    }),

    /**
     * Range gets are enabled for specific algorithms based on the configured {@link CryptoMode}.
     * <p>
     * When the configured for {@link CryptoMode#AuthenticatedEncryption}, the client permits both AES-CBC and AES-CTR.
     * When configured for {@link CryptoMode#StrictAuthenticatedEncryption}, the client permits only AES-CTR.
     */
    @Deprecated
    ALL(new Predicate() {
        @Override
        public boolean isPermitted(CryptoMode cryptoMode, String algorithm) {
            switch (cryptoMode) {
                case AuthenticatedEncryption:
                    return AES_CTR.equals(algorithm)
                            || AES_CBC_PKCS5.equals(algorithm)
                            || AES_CBC_PKCS7.equals(algorithm);
                case StrictAuthenticatedEncryption:
                    return AES_CTR.equals(algorithm);
                default:
                    return false;
            }
        }
    }),

    ;

    private static final String AES_CTR = "AES/CTR/NoPadding";
    private static final String AES_CBC_PKCS7 = "AES/CBC/PKCS7Padding";
    private static final String AES_CBC_PKCS5 = "AES/CBC/PKCS5Padding";

    private final Predicate predicate;

    public boolean permitsCipherAlgorithm(CryptoMode cryptoMode, String algorithm) {
        return predicate.isPermitted(cryptoMode, algorithm);
    }

    CryptoRangeGetMode(Predicate predicate) {
        this.predicate = predicate;
    }

    private interface Predicate {
        boolean isPermitted(CryptoMode cryptoMode, String algorithm);
    }
}
