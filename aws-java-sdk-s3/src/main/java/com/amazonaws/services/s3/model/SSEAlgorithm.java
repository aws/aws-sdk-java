/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Server-side Encryption Algorithm.
 */
public enum SSEAlgorithm {
    AES256("AES256"),
    KMS("aws:kms"),
    ;

    private final String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

    private SSEAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        return algorithm;
    }

    /**
     * Returns the SSEAlgorithm enum corresponding to the given string;
     * or null if and only if the given algorithm is null.
     *
     * @throws IllegalArgumentException if the specified algorithm is not
     * supported.
     */
    public static SSEAlgorithm fromString(String algorithm) {
        if (algorithm == null)
            return null;
        for (SSEAlgorithm e: values()) {
            if (e.getAlgorithm().equals(algorithm))
                return e;
        }
        throw new IllegalArgumentException("Unsupported algorithm " + algorithm);
    }

    /**
     * Returns the default server side encryption algorithm, which is AES256.
     */
    public static SSEAlgorithm getDefault() {
        return AES256;
    }
}
