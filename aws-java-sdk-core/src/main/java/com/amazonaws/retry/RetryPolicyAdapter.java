/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.retry.internal.MaxAttemptsResolver;
import com.amazonaws.retry.v2.RetryPolicyContext;

import static com.amazonaws.retry.PredefinedRetryPolicies.DEFAULT_MAX_ERROR_RETRY_STANDARD_MODE;
import static com.amazonaws.util.ValidationUtils.assertNotNull;

/**
 * Adapts a legacy {@link RetryPolicy} to the new {@link com.amazonaws.retry.v2.RetryPolicy}. This class is intended for internal
 * use by the SDK.
 */
@SdkInternalApi
public class RetryPolicyAdapter implements com.amazonaws.retry.v2.RetryPolicy {
    private final RetryPolicy legacyRetryPolicy;
    private final ClientConfiguration clientConfiguration;
    private final int maxErrorRetry;

    public RetryPolicyAdapter(RetryPolicy legacyRetryPolicy, ClientConfiguration clientConfiguration) {
        this.legacyRetryPolicy = assertNotNull(legacyRetryPolicy, "legacyRetryPolicy");
        this.clientConfiguration = assertNotNull(clientConfiguration, "clientConfiguration");

        this.maxErrorRetry = getMaxErrorRetry();
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

        Integer resolvedMaxAttempts = new MaxAttemptsResolver().maxAttempts();

        if (resolvedMaxAttempts != null) {
            return resolvedMaxAttempts - 1;
        }

        if (shouldUseStandardModeDefaultMaxRetry()) {
            return DEFAULT_MAX_ERROR_RETRY_STANDARD_MODE;
        }

        // default to use legacyRetryPolicy.getMaxErrorRetry() because it's always present
        return legacyRetryPolicy.getMaxErrorRetry();
    }

    /**
     * We should use the default standard maxErrorRetry for standard mode if the maxErrorRetry is not from sdk
     * default predefined retry policies.
     */
    private boolean shouldUseStandardModeDefaultMaxRetry() {
        RetryMode retryMode = clientConfiguration.getRetryMode() == null ? legacyRetryPolicy.getRetryMode()
                                                                         : clientConfiguration.getRetryMode();

        return retryMode.equals(RetryMode.STANDARD) && legacyRetryPolicy.isDefaultMaxErrorRetryInRetryModeHonored();
    }

    public boolean maxRetriesExceeded(RetryPolicyContext context) {
        return context.retriesAttempted() >= maxErrorRetry;
    }
}
