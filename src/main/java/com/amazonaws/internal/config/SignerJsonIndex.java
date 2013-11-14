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

/**
 * An internal class used to represent a key-signer pair for JSON persistence
 * purposes.  The key can be a service, a region, or a service-region, etc.
 */
@Immutable
class SignerJsonIndex {
    private String key;
    private SignerConfigJsonHelper signerConfig;

    SignerJsonIndex(String key, SignerConfigJsonHelper signerConfig) {
        this.key = key;
        this.signerConfig = signerConfig;
    }

    SignerJsonIndex() {}

    public String getKey() {
        return key;
    }

    public SignerConfigJsonHelper getSignerConfig() {
        return signerConfig;
    }

    SignerConfig newSignerConfig() {
        return new SignerConfig(signerConfig.build());
    }

    void setKey(String key) {
        this.key = key;
    }

    void setSignerConfig(SignerConfigJsonHelper signerConfig) {
        this.signerConfig = signerConfig;
    }
}