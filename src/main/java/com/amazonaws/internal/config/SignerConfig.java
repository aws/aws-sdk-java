/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal.config;

import org.apache.http.annotation.Immutable;

import com.amazonaws.auth.Signer;

/**
 * Signer configuration, which has the factory method for creating the
 * respective Signer instances.
 */
@Immutable
public class SignerConfig {
    private final SignerType signerType;
    private final boolean doubleUrlEncode;

    SignerConfig(SignerType signerType, boolean doubleUrlEncode) {
        this.signerType = signerType;
        this.doubleUrlEncode = doubleUrlEncode;
    }

    SignerConfig(SignerConfig from) {
        this.signerType = from.getSignerType();
        this.doubleUrlEncode = from.isDoubleUrlEncode();
    }

    // for unit testing
    SignerConfig(SignerType signerType) {
        this(signerType, false);
    }

    public SignerType getSignerType() {
        return signerType;
    }

    public boolean isDoubleUrlEncode() {
        return doubleUrlEncode;
    }

    @Override public String toString() {
        return signerType + ": doubleUrlEncode=" + doubleUrlEncode;
    }

    /**
     * Returns the respective Signer instance, or null if it cannot be
     * determined.
     */
    public Signer computeSigner() {
        switch(signerType) {
            case AWS4SignerType:
                return signerType.createV4Signer(doubleUrlEncode);
            case AWS3SignerType:        // V3
            case QueryStringSignerType: // V2
            case CloudFrontSignerType:
                return signerType.createSigner();
            case AWSS3V4SignerType:
                // yet to invvestigate how to support this
            case S3SignerType:
                // yet to invvestigate how to support this
        }
        return null;
    }
}