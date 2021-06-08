/*
 * Copyright 2013-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Denotes the key wrap (encryption) algorithm to use for encryption/decryption. Both symmetric and asymmetric
 * algorithms are defined; the algorithm must be consistent with the type of key specified in the materials.
 * For asymmetric keys only asymmetric algorithm types are allowed, for symmetric keys symmetric algorithms.
 * <p>
 * Configure the key wrap algorithm to be used for encryption in in {@link CryptoConfigurationV2}.
 * <p>
 * <b>Note:</b>This value can only be used in conjunction with the V2 version of the encryption client,
 * {@link com.amazonaws.services.s3.AmazonS3EncryptionClientV2}.
 *
 */
public enum CryptoKeyWrapAlgorithm {

    /**
     * Default symmetric encryption algorithm
     */
    AES_GCM_NoPadding("AES/GCM"),

    /**
     * Default asymmetric encryption algorithm. The encryption algorithm is RSA/ECB/OAEPPadding using SHA1 for MGF1
     * (masking gate function)
     */

    RSA_OAEP_SHA1("RSA-OAEP-SHA1"),

    /**
     * When the delivery mechanism is KMS (not an algorithm per se)
     */
    KMS("kms+context");

    private final String metadataLabel;

    CryptoKeyWrapAlgorithm(String metadataLabel) {
        this.metadataLabel = metadataLabel;
    }

    public String algorithmName() {
        return metadataLabel;
    }
}
