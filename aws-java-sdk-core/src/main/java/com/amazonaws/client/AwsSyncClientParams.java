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
package com.amazonaws.client;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.client.builder.AdvancedConfig;
import com.amazonaws.monitoring.MonitoringListener;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.monitoring.CsmConfigurationProvider;
import com.amazonaws.retry.RetryPolicyAdapter;
import com.amazonaws.retry.v2.RetryPolicy;

import java.net.URI;
import java.util.List;

/**
 * Provides access to all params needed in a synchronous AWS service client constructor. Abstract
 * to allow additions to the params while maintaining backwards compatibility.
 */
@SdkProtectedApi
public abstract class AwsSyncClientParams {

    public abstract AWSCredentialsProvider getCredentialsProvider();

    public abstract ClientConfiguration getClientConfiguration();

    public abstract RequestMetricCollector getRequestMetricCollector();

    public abstract List<RequestHandler2> getRequestHandlers();

    public abstract CsmConfigurationProvider getClientSideMonitoringConfigurationProvider();

    public abstract MonitoringListener getMonitoringListener();

    public AdvancedConfig getAdvancedConfig() {
        return AdvancedConfig.EMPTY;
    }

    public SignerProvider getSignerProvider() {
        // Not currently used by AWS clients. The builder uses setRegion to configure endpoint
        // and signer and does not support custom endpoints or signers.
        return null;
    }

    public URI getEndpoint() {
        // Not currently used by AWS clients. The builder uses setRegion to configure endpoint
        // and signer and does not support custom endpoints or signers.
        return null;
    }

    public RetryPolicy getRetryPolicy() {
        final ClientConfiguration config = getClientConfiguration();
        return new RetryPolicyAdapter(config.getRetryPolicy(), config);
    }
}
