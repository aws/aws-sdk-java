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
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/**
 * Package private abstract base for all abstract handler that has server side
 * encryption (SSE) information.
 */
abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    /**
     * Used to get access to the specific server side encryption (SSE) result
     * from the subclass.
     */
    protected abstract ServerSideEncryptionResult sseResult();

    @Override
    public final String getSSEAlgorithm() {
        ServerSideEncryptionResult result = sseResult();
        return result == null ? null : result.getSSEAlgorithm();
    }

    @Override
    public final void setSSEAlgorithm(String serverSideEncryption) {
        ServerSideEncryptionResult result = sseResult();
        if ( result != null )
            result.setSSEAlgorithm(serverSideEncryption);
    }

    @Override
    public final String getSSECustomerAlgorithm() {
        ServerSideEncryptionResult result = sseResult();
        return result == null ? null : result.getSSECustomerAlgorithm();
    }

    @Override
    public final void setSSECustomerAlgorithm(String algorithm) {
        ServerSideEncryptionResult result = sseResult();
        if (result != null) {
            result.setSSECustomerAlgorithm(algorithm);
        }
    }

    @Override
    public final String getSSECustomerKeyMd5() {
        ServerSideEncryptionResult result = sseResult();
        return result == null ? null : result.getSSECustomerKeyMd5();
    }

    @Override
    public final void setSSECustomerKeyMd5(String md5Digest) {
        ServerSideEncryptionResult result = sseResult();
        if (result != null) {
            result.setSSECustomerKeyMd5(md5Digest);
        }
    }
}
