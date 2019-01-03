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

import com.amazonaws.services.s3.model.CryptoMode;

/**
 * S3 cryptographic scheme that includes the content crypto scheme and key
 * wrapping scheme (for the content-encrypting-key).
 */
final class S3CryptoScheme {
    // http://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html
    // http://docs.oracle.com/javase/7/docs/technotes/guides/security/crypto/CryptoSpec.html#Key
    static final String AES = "AES";
    static final String RSA = "RSA";
    private final S3KeyWrapScheme kwScheme;

    private final ContentCryptoScheme contentCryptoScheme;

    private S3CryptoScheme(ContentCryptoScheme contentCryptoScheme,
                           S3KeyWrapScheme kwScheme) {
        this.contentCryptoScheme = contentCryptoScheme;
        this.kwScheme = kwScheme;
    }

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

    static S3CryptoScheme from(CryptoMode mode) {
        switch (mode) {
            case EncryptionOnly:
                return new S3CryptoScheme(ContentCryptoScheme.AES_CBC,
                                          S3KeyWrapScheme.NONE);
            case AuthenticatedEncryption:
            case StrictAuthenticatedEncryption:
                return new S3CryptoScheme(ContentCryptoScheme.AES_GCM,
                                          new S3KeyWrapScheme());
            default:
                throw new IllegalStateException();
        }
    }
}
