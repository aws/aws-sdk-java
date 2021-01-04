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
package com.amazonaws.services.s3.internal.crypto;

/**
 * Static utility methods to assist with cryptographic tasks
 */
public final class CryptoUtils {
    private static final String AES_GCM_CIPHER_ALGORITHM = "AES/GCM/NoPadding";
    private static final String AES_CTR_CIPHER_ALGORITHM = "AES/CTR/NoPadding";

    private CryptoUtils() {
    }

    /**
     * Normalizes the value of a content algorithm for the purposes of authentication. Currently only maps AES/CTR
     * to AES/GCM to enable ranged gets to pass validation for those modes.
     */
    public static String normalizeContentAlgorithmForValidation(String contentAlgorithm) {
        if (AES_CTR_CIPHER_ALGORITHM.equals(contentAlgorithm)) {
            return AES_GCM_CIPHER_ALGORITHM;
        }

        return contentAlgorithm;
    }
}
