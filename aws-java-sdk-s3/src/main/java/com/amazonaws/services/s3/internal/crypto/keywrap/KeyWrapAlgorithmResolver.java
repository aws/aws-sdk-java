/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.keywrap;

import com.amazonaws.services.s3.model.CryptoKeyWrapAlgorithm;
import com.amazonaws.services.s3.model.EncryptionMaterials;

public class KeyWrapAlgorithmResolver {

    /**
     * Get the default Key Wrap Algorithm based on the EncryptionMaterials provided
     * @param encryptionMaterials the encryptionMaterials
     * @return the default {@link CryptoKeyWrapAlgorithm}
     */
    public static CryptoKeyWrapAlgorithm getDefaultKeyWrapAlgorithm(EncryptionMaterials encryptionMaterials) {
        if (encryptionMaterials.isKMSEnabled()) {
            return CryptoKeyWrapAlgorithm.KMS;
        }
        if (encryptionMaterials.getKeyPair() != null) {
            return getDefaultAsymmetricKeyWrapAlgorithm();
        } else {
            return getDefaultSymmetricKeyWrapAlgorithm();
        }
    }

    private static CryptoKeyWrapAlgorithm getDefaultSymmetricKeyWrapAlgorithm() {
        return CryptoKeyWrapAlgorithm.AES_GCM_NoPadding;
    }

    private static CryptoKeyWrapAlgorithm getDefaultAsymmetricKeyWrapAlgorithm() {
        return CryptoKeyWrapAlgorithm.RSA_OAEP_SHA1;
    }
}
