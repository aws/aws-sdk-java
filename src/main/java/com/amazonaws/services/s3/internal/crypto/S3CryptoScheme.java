/*
 * Copyright 2013-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.security.SecureRandom;

/**
 * S3 cryptographic scheme that includes the content crypto scheme and key
 * wrapping scheme (for the content-encrypting-key).
 */
final class S3CryptoScheme {
    // http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html
    // http://docs.oracle.com/javase/7/docs/technotes/guides/security/crypto/CryptoSpec.html#Key
    static final String AES = "AES"; 
    static final String RSA = "RSA"; 
    private static final SecureRandom srand = new SecureRandom();
    private static final S3KeyWrapScheme kwScheme = new S3KeyWrapScheme();

    private final ContentCryptoScheme contentCryptoScheme;

    S3CryptoScheme(ContentCryptoScheme contentCryptoScheme) {
        this.contentCryptoScheme = contentCryptoScheme;
    }

    SecureRandom getSecureRandom() { return srand; }
    
    ContentCryptoScheme getContentCryptoScheme() {
        return contentCryptoScheme;
    }

    S3KeyWrapScheme getKeyWrapScheme() { return kwScheme; }

    /**
     * Convenient method.
     */
    static boolean isAesGcm(String cipherAlgorithm) {
        return ContentCryptoScheme.AES_GCM.getCipherAlgorithm().equals(cipherAlgorithm);
    }
}
