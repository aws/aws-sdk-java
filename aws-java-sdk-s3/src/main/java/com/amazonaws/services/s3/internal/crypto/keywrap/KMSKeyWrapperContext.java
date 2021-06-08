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

import java.util.Map;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.kms.AWSKMS;

public class KMSKeyWrapperContext {
    private final AWSKMS kms;
    private final AmazonWebServiceRequest originalRequest;
    private final Map<String, String> kmsMaterialsDescription;

    private KMSKeyWrapperContext(Builder b) {
        this.kms = b.kms;
        this.originalRequest = b.originalRequest;
        this.kmsMaterialsDescription = b.kmsMaterialsDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * the original request submitted for the encrypted API operation
     */
    public AmazonWebServiceRequest originalRequest() {
        return originalRequest;
    }

    /**
     * when decrypting, the materials description received from KMS
     */
    public Map<String, String> kmsMaterialsDescription() {
        return kmsMaterialsDescription;
    }

    public AWSKMS kms() {
        return kms;
    }

    public static class Builder {
        private AWSKMS kms;
        private AmazonWebServiceRequest originalRequest;
        private Map<String, String> kmsMaterialsDescription;

        public Builder kms(AWSKMS kms) {
            this.kms = kms;
            return this;
        }

        public Builder originalRequest(AmazonWebServiceRequest originalRequest) {
            this.originalRequest = originalRequest;
            return this;
        }

        public Builder kmsMaterialsDescription(Map<String, String> kmsMaterialsDescription) {
            this.kmsMaterialsDescription = kmsMaterialsDescription;
            return this;
        }

        public KMSKeyWrapperContext build() {
            return new KMSKeyWrapperContext(this);
        }
    }
}
