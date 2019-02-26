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

package com.amazonaws.services.s3control.internal.handlers;

import static com.amazonaws.services.s3control.AWSS3Control.ENDPOINT_PREFIX;

import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.client.builder.AdvancedConfig;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.services.s3control.S3ControlClientOptions;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * {@link RequestHandler2} that modifies the endpoint to handle virtual addressing (account id hoisting),
 * Dual-Stack, and FIPS.
 */
@SdkInternalApi
public final class EndpointHandler extends RequestHandler2 {

    private static final String X_AMZ_ACCOUNT_ID = "x-amz-account-id";

    @Override
    public void beforeRequest(Request<?> request) {
        if (!request.getHeaders().containsKey(X_AMZ_ACCOUNT_ID)) {
            throw new SdkClientException("Account ID must be specified for all requests");
        }

        String accountId = request.getHeaders().remove(X_AMZ_ACCOUNT_ID);
        URI endpoint = request.getEndpoint();

        String host = resolveHost(request, accountId);

        try {
            request.setEndpoint(new URI(endpoint.getScheme(), endpoint.getUserInfo(),
                                        host, endpoint.getPort(), endpoint.getPath(), endpoint.getQuery(), endpoint.getFragment()));
        } catch (URISyntaxException e) {
            throw new SdkClientException(
                String.format("Endpoint was invalid, account id (%s) is likely incorrect", accountId), e);
        }
    }

    private String resolveHost(Request<?> request, String accountId) {
        if (isDualstackEnabled(request) && isFipsEnabled(request)) {
            throw new SdkClientException("Cannot use both Dual-Stack endpoints and FIPS endpoints");
        }
        String host = request.getEndpoint().getHost();
        if (isDualstackEnabled(request)) {
            if (!host.contains(ENDPOINT_PREFIX)) {
                throw new SdkClientException(String.format("The Dual-Stack option cannot be used with custom endpoints (%s)",
                                                           request.getEndpoint()));
            }
            host = host.replace(ENDPOINT_PREFIX, String.format("%s.%s", ENDPOINT_PREFIX, "dualstack"));
        } else if (isFipsEnabled(request)) {
            if (!host.contains(ENDPOINT_PREFIX)) {
                throw new SdkClientException(String.format("The FIPS option cannot be used with custom endpoints (%s)",
                                                           request.getEndpoint()));
            }
            host = host.replace(ENDPOINT_PREFIX, String.format("%s-%s", ENDPOINT_PREFIX, "fips"));

        }
        return String.format("%s.%s", accountId, host);
    }

    private boolean isDualstackEnabled(Request<?> request) {
        return isAdvancedConfigFlagTrue(request, S3ControlClientOptions.DUALSTACK_ENABLED);
    }

    private boolean isFipsEnabled(Request<?> request) {
        return isAdvancedConfigFlagTrue(request, S3ControlClientOptions.FIPS_ENABLED);
    }

    /**
     * @param request Marshalled request.
     * @param key Key to check.
     * @return True if advanced config is available in the context AND the specified key is present AND has the value true,
     * false otherwise.
     */
    private boolean isAdvancedConfigFlagTrue(Request<?> request, AdvancedConfig.Key<Boolean> key) {
        AdvancedConfig advancedConfig = request.getHandlerContext(HandlerContextKey.ADVANCED_CONFIG);
        if (advancedConfig == null) {
            return false;
        }
        Boolean flag = advancedConfig.get(key);
        return Boolean.TRUE.equals(flag);
    }
}
