/*
 * Copyright 2013-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.services.s3.model.CryptoKeyWrapAlgorithm;
import com.amazonaws.util.ValidationUtils;

/**
 * Denotes the key wrap (encryption) algorithm to use for encryption/decryption. Both symmetric and asymmetric
 * algorithms are defined; the algorithm must be consistent with the type of key specified in the materials.
 * For asymmetric keys only asymmetric algorithm types are allowed, for symmetric keys symmetric algorithms.
 *
 * see also the externally available encryption values: {@link CryptoKeyWrapAlgorithm}.
 */
public enum InternalKeyWrapAlgorithm {

    /**
     * Default symmetric encryption algorithm
     */
    AES_GCM_NoPadding("AES/GCM",
                      KeyWrapAlgorithmSpecs.builder()
                                           .isV1Algorithm(false)
                                           .isAsymmetric(false)
                                           .isKms(false)
                                           .build()),

    /**
     * Symmetric legacy encryption algorithm supported for decryption purposes only.
     */
    AESWrap("AESWrap",
            KeyWrapAlgorithmSpecs.builder()
                                 .isV1Algorithm(true)
                                 .isAsymmetric(false)
                                 .isKms(false)
                                 .build()),

    /**
     * Default asymmetric encryption algorithm. The encryption algorithm is RSA/ECB/OAEPPadding using SHA1 for MGF1
     * (masking gate function)
     */
    RSA_OAEP_SHA1("RSA-OAEP-SHA1",
                  KeyWrapAlgorithmSpecs.builder()
                                       .isV1Algorithm(false)
                                       .isAsymmetric(true)
                                       .isKms(false)
                                       .build()),

    /**
     * Asymmetric legacy encryption algorithm supported for decryption purposes only.
     */
    RSA_ECB_OAEPWithSHA256AndMGF1Padding("RSA/ECB/OAEPWithSHA-256AndMGF1Padding",
                                         KeyWrapAlgorithmSpecs.builder()
                                                              .isV1Algorithm(true)
                                                              .isAsymmetric(true)
                                                              .isKms(false)
                                                              .build()),

    /**
     * When the delivery mechanism is KMS (not an algorithm per se)
     */
    KMS("kms+context",
        KeyWrapAlgorithmSpecs.builder()
                             .isV1Algorithm(false)
                             .isAsymmetric(false)       // not applicable
                             .isKms(true)
                             .build()),

    /**
     * KMS in legacy mode
     */
    KMS_V1("kms",
           KeyWrapAlgorithmSpecs.builder()
                                .isV1Algorithm(true)
                                .isAsymmetric(false)    // not applicable
                                .isKms(true)
                                .build());

    private final String algorithmName;
    private final KeyWrapAlgorithmSpecs keyWrapAlgorithmSpecs;

    InternalKeyWrapAlgorithm(String algorithmName, KeyWrapAlgorithmSpecs keyWrapAlgorithmSpecs) {
        this.algorithmName = algorithmName;
        this.keyWrapAlgorithmSpecs = keyWrapAlgorithmSpecs;
    }

    /**
     * The String representation of the algorithm common to Amazon Web Services independently of language used.
     */
    public String algorithmName() {
        return algorithmName;
    }

    public static InternalKeyWrapAlgorithm fromExternal(CryptoKeyWrapAlgorithm external) {
        switch (external) {
            case RSA_OAEP_SHA1: return RSA_OAEP_SHA1;
            case AES_GCM_NoPadding: return AES_GCM_NoPadding;
            case KMS: return KMS;
            default: throw new SecurityException("Unknown key-wrapping algorithm: " + external.algorithmName());
        }
    }

    public static InternalKeyWrapAlgorithm fromAlgorithmName(String algorithmName) {
        for (InternalKeyWrapAlgorithm value : values()) {
            if (value.algorithmName.equals(algorithmName)) {
                return value;
            }
        }
        return null;
    }

    public boolean isV1Algorithm() {
        return this.keyWrapAlgorithmSpecs.isV1Algorithm();
    }

    public boolean isAsymmetric() {
        return this.keyWrapAlgorithmSpecs.isAsymmetric();
    }

    public boolean isSymmetric() {
        return !this.keyWrapAlgorithmSpecs.isAsymmetric();
    }

    public boolean isKMS() {
        return this.keyWrapAlgorithmSpecs.isKms();
    }

    private static final class KeyWrapAlgorithmSpecs implements Serializable {
        private final boolean isV1Algorithm;
        private final boolean isAsymmetric;
        private final boolean isKms;

        private KeyWrapAlgorithmSpecs(Builder b) {
            this.isV1Algorithm = ValidationUtils.assertNotNull(b.isV1Algorithm, "isV1Algorithm");
            this.isAsymmetric = ValidationUtils.assertNotNull(b.isAsymmetric, "isAsymmetric");
            this.isKms = ValidationUtils.assertNotNull(b.isKms, "isKms");
        }

        private static Builder builder() {
            return new Builder();
        }

        public boolean isV1Algorithm() {
            return isV1Algorithm;
        }

        public boolean isAsymmetric() {
            return isAsymmetric;
        }

        public boolean isKms() {
            return isKms;
        }

        private static final class Builder {
            private Boolean isV1Algorithm;
            private Boolean isAsymmetric;
            private Boolean isKms;

            private Builder() {
            }

            public Builder isV1Algorithm(boolean v1Algorithm) {
                isV1Algorithm = v1Algorithm;
                return this;
            }

            public Builder isAsymmetric(boolean asymmetric) {
                isAsymmetric = asymmetric;
                return this;
            }

            public Builder isKms(boolean kms) {
                isKms = kms;
                return this;
            }

            public KeyWrapAlgorithmSpecs build() {
                return new KeyWrapAlgorithmSpecs(this);
            }
        }
    }
}
