/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static com.amazonaws.services.s3control.internal.HandlerUtils.S3_OUTPOSTS;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isDualstackEnabled;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isFipsEnabledInClientConfig;
import static com.amazonaws.services.s3control.internal.HandlerUtils.isFipsRegion;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.services.s3control.S3ArnableField;
import com.amazonaws.services.s3control.S3ControlHandlerContextKey;
import com.amazonaws.services.s3control.internal.ArnHandler;
import com.amazonaws.services.s3control.model.CreateBucketRequest;
import com.amazonaws.services.s3control.model.ListRegionalBucketsRequest;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * {@link RequestHandler2} that modifies the endpoint to handle virtual addressing (account id hoisting),
 * Dual-Stack, and FIPS.
 */
@SdkInternalApi
public final class EndpointHandler extends RequestHandler2 {
    private final ArnHandler arnHandler;

    public EndpointHandler() {
        arnHandler = ArnHandler.getInstance();
    }

    @SdkTestInternalApi
    public EndpointHandler(ArnHandler arnHandler) {
        this.arnHandler = arnHandler;
    }

    @Override
    public void beforeRequest(Request<?> request) {

        S3ArnableField arnableField = request.getHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD);
        if (arnableField != null && arnableField.getArn() != null) {
            arnHandler.resolveHostForArn(request, arnableField.getArn());
            return;
        }

        // If the request is an non-arn outpost request
        if (isNonArnOutpostRequest(request)) {
            resolveHostForNonArnOutpostRequest(request);
            return;
        }

        resolveHost(request);
    }

    private void resolveHostForNonArnOutpostRequest(Request<?> request) {
        if (isDualstackEnabled(request)) {
            throw new IllegalArgumentException("Dualstack endpoints are not supported");
        }

        if (isFipsEnabledInClientConfig(request) || isFipsRegion(request.getHandlerContext(HandlerContextKey.SIGNING_REGION))) {
            throw new IllegalArgumentException("FIPS endpoints are not supported");
        }

        if (Boolean.TRUE.equals(request.getHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN))) {
            throw new IllegalArgumentException("OutpostId cannot be passed to this operation if the client has been configured "
                                               + "with an endpoint override");
        }

        request.addHandlerContext(HandlerContextKey.SIGNING_NAME, S3_OUTPOSTS);
        URI endpoint = request.getEndpoint();
        String host = endpoint.getHost();
        String newHost = host.replace(ENDPOINT_PREFIX, S3_OUTPOSTS);

        // Remove the accountId host prefixing
        int index = newHost.indexOf(S3_OUTPOSTS);
        newHost = newHost.substring(index);

        try {
            request.setEndpoint(new URI(endpoint.getScheme(), endpoint.getUserInfo(),
                                           newHost, endpoint.getPort(), endpoint.getPath(), endpoint.getQuery(), endpoint.getFragment()));
        } catch (Exception e) {
            throw new SdkClientException("Endpoint was invalid", e);
        }
    }

    /**
     * It should redirect signer if the request is CreateBucketRequest or ListRegionalBucketsRequest with outpostId present
     */
    private boolean isNonArnOutpostRequest(Request<?> request) {
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest instanceof CreateBucketRequest && (!StringUtils.isNullOrEmpty(((CreateBucketRequest) originalRequest).getOutpostId()))) {
            return true;
        }

        return originalRequest instanceof ListRegionalBucketsRequest && (!StringUtils.isNullOrEmpty(((ListRegionalBucketsRequest) originalRequest).getOutpostId()));
    }

    private void resolveHost(Request<?> request) {
        URI endpoint = request.getEndpoint();

        String host = doResolveHost(request);

        try {
            request.setEndpoint(new URI(endpoint.getScheme(), endpoint.getUserInfo(),
                                        host, endpoint.getPort(), endpoint.getPath(), endpoint.getQuery(), endpoint.getFragment()));
        } catch (URISyntaxException e) {
            throw new SdkClientException(
                String.format("Endpoint was invalid: %s", host), e);
        }
    }

    private String doResolveHost(Request<?> request) {
        if (isDualstackEnabled(request) && isFipsEnabledInClientConfig(request)) {
            throw new SdkClientException("Cannot use both Dual-Stack endpoints and FIPS endpoints");
        }
        String host = request.getEndpoint().getHost();

        if (host == null) {
            throw new SdkClientException("Endpoint does not contain a valid host name: " + request.getEndpoint());
        }

        if (isDualstackEnabled(request)) {
            // We should really use HandlerContextKey.ENDPOINT_OVERRIDDEN to check if an endpoint is overridden or not
            // because the dualstack option cannot be used with custom endpoints and currently, customers can provide an endpoint
            // as long as "s3-control" is in it.
            // Changing to use HandlerContextKey.ENDPOINT_OVERRIDDEN will likely break existing customers who provide legit
            // s3-control endpoint, so we will keep it as it is.
            if (!host.contains(ENDPOINT_PREFIX)) {
                throw new SdkClientException(String.format("The Dual-Stack option cannot be used with custom endpoints (%s)",
                                                           request.getEndpoint()));
            }
            host = host.replace(ENDPOINT_PREFIX, String.format("%s.%s", ENDPOINT_PREFIX, "dualstack"));
        } else if (isFipsEnabledInClientConfig(request)) {
            if (!host.contains(ENDPOINT_PREFIX)) {
                throw new SdkClientException(String.format("The FIPS option cannot be used with custom endpoints (%s)",
                                                           request.getEndpoint()));
            }
            host = host.replace(ENDPOINT_PREFIX, String.format("%s-%s", ENDPOINT_PREFIX, "fips"));

        }
        
        return host;
    }
}
