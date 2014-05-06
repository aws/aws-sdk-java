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

import java.security.Key;

final class S3KeyWrapScheme {
    public static final String AESWrap = "AESWrap"; 
    public static final String RSA_ECB_OAEPWithSHA256AndMGF1Padding = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    String getKeyWrapAlgorithm(Key key) {
        String algorithm = key.getAlgorithm();
        if (S3CryptoScheme.AES.equals(algorithm)) {
            return AESWrap;
        }
        if (S3CryptoScheme.RSA.equals(algorithm)) {
            if (CryptoRuntime.isRsaKeyWrapAvailable())
                return RSA_ECB_OAEPWithSHA256AndMGF1Padding;
        }
        return null;
    }
}