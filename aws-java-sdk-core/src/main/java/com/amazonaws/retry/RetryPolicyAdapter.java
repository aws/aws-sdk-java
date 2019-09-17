/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.retry.v2.RetryPolicyContext;

import static com.amazonaws.util.ValidationUtils.assertNotNull;

/**
 * Adapts a legacy {@link RetryPolicy} to the new {@link com.amazonaws.retry.v2.RetryPolicy}. This class is intended for internal
 * use by the SDK.
 */
@SdkInternalApi
public class RetryPolicyAdapter implements com.amazonaws.retry.v2.RetryPolicy {

    private final RetryPolicy legacyRetryPolicy;
    private final ClientConfiguration clientConfiguration;

    public RetryPolicyAdapter(RetryPolicy legacyRetryPolicy, ClientConfiguration clientConfiguration) {
        this.legacyRetryPolicy = assertNotNull(legacyRetryPolicy, "legacyRetryPolicy");
        this.clientConfiguration = assertNotNull(clientConfiguration, "clientConfiguration");
    }

    @Override
    public long computeDelayBeforeNextRetry(RetryPolicyContext context) {
        return legacyRetryPolicy.getBackoffStrategy().delayBeforeNextRetry(
                (AmazonWebServiceRequest) context.originalRequest(),
                (AmazonClientException) context.exception(),
                context.retriesAttempted());
    }

    @Override
    public boolean shouldRetry(RetryPolicyContext context) {
        return !maxRetriesExceeded(context) && isRetryable(context);
    }

    public boolean isRetryable(RetryPolicyContext context) {
        return legacyRetryPolicy.getRetryCondition().shouldRetry(
            (AmazonWebServiceRequest) context.originalRequest(),
            (AmazonClientException) context.exception(),
            context.retriesAttempted());
    }

    public RetryPolicy getLegacyRetryPolicy() {
        return this.legacyRetryPolicy;
    }

    private int getMaxErrorRetry() {
        if(legacyRetryPolicy.isMaxErrorRetryInClientConfigHonored() && clientConfiguration.getMaxErrorRetry() >= 0) {
            return clientConfiguration.getMaxErrorRetry();
        }
        return legacyRetryPolicy.getMaxErrorRetry();
    }

    public boolean maxRetriesExceeded(RetryPolicyContext context) {
        return context.retriesAttempted() >= getMaxErrorRetry();
    }
}
