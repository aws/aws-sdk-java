/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

/**
 * Common abstract base class for result that contains server side encryption
 * (SSE) information.
 */
public abstract class SSEResultBase implements ServerSideEncryptionResult {
    private String sseAlgorithm;
    private String sseCustomerAlgorithm;
    private String sseCustomerKeyMD5;

    @Override
    public final String getSSEAlgorithm() {
        return sseAlgorithm;
    }

    @Override
    public final void setSSEAlgorithm(String algorithm) {
        this.sseAlgorithm = algorithm;
    }

    @Override
    public final String getSSECustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    @Override
    public final void setSSECustomerAlgorithm(String algorithm) {
        this.sseCustomerAlgorithm = algorithm;
    }

    @Override
    public final String getSSECustomerKeyMd5() {
        return sseCustomerKeyMD5;
    }

    @Override
    public final void setSSECustomerKeyMd5(String md5) {
        this.sseCustomerKeyMD5 = md5;
    }

    /**
     * @deprecated Replaced by {@link #getSSEAlgorithm()}
     */
    @Deprecated
    public final String getServerSideEncryption() {
        return sseAlgorithm;
    }
}
