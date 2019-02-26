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
package com.amazonaws.http.response;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.AmazonWebServiceResult;
import com.amazonaws.Request;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.SdkHttpMetadata;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.MetadataCache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Adapts an {@link HttpResponseHandler < AmazonWebServiceResponse <T>>} to an {@link
 * HttpResponseHandler<T>} (unwrapped result) with proper handling and logging of response
 * metadata.
 *
 * @param <T> Unmarshalled result type
 */
public class AwsResponseHandlerAdapter<T> implements HttpResponseHandler<T> {

    /**
     * Logger used for the purpose of logging the AWS request id extracted either from the
     * httpClientSettings header response or from the response body.
     */
    private static final Log requestIdLog = LogFactory.getLog("com.amazonaws.requestId");

    private static final Log requestLog = AmazonHttpClient.requestLog;

    private final HttpResponseHandler<AmazonWebServiceResponse<T>> delegate;
    private final Request<?> request;
    private final AWSRequestMetrics awsRequestMetrics;
    private final MetadataCache responseMetadataCache;

    /**
     * @param delegate          Response handler to delegate to and unwrap
     * @param request           Marshalled request
     * @param awsRequestMetrics Request metrics
     */
    public AwsResponseHandlerAdapter(HttpResponseHandler<AmazonWebServiceResponse<T>> delegate,
                                     Request<?> request,
                                     AWSRequestMetrics awsRequestMetrics,
                                     MetadataCache responseMetadataCache) {
        this.delegate = delegate;
        this.request = request;
        this.awsRequestMetrics = awsRequestMetrics;
        this.responseMetadataCache = responseMetadataCache;
    }

    @Override
    public T handle(HttpResponse response) throws Exception {
        final AmazonWebServiceResponse<T> awsResponse = delegate.handle(response);

        if (awsResponse == null) {
            throw new RuntimeException("Unable to unmarshall response metadata. Response Code: "
                                       + response.getStatusCode() + ", Response Text: " +
                                       response.getStatusText());
        }

        AmazonWebServiceRequest userRequest = request.getOriginalRequest();
        if (userRequest.getCloneRoot() != null) {
            userRequest = userRequest.getCloneRoot();
        }
        responseMetadataCache.add(userRequest, awsResponse.getResponseMetadata());
        final String awsRequestId = awsResponse.getRequestId();

        if (requestLog.isDebugEnabled()) {
            requestLog
                    .debug("Received successful response: " + response.getStatusCode() +
                           ", AWS Request ID: " + awsRequestId);
        }

        if (!logHeaderRequestId(response)) {
            // Logs the AWS request ID extracted from the payload if
            // it is not available from the response header.
            logResponseRequestId(awsRequestId);
        }
        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, awsRequestId);
        return fillInResponseMetadata(awsResponse, response);
    }

    @SuppressWarnings("unchecked")
    private <T> T fillInResponseMetadata(AmazonWebServiceResponse<T> awsResponse,
                                         HttpResponse httpResponse) {
        final T result = awsResponse.getResult();
        if (result instanceof AmazonWebServiceResult<?>) {
            ((AmazonWebServiceResult) result)
                    .setSdkResponseMetadata(awsResponse.getResponseMetadata())
                    .setSdkHttpMetadata(SdkHttpMetadata.from(httpResponse));
        }
        return result;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return delegate.needsConnectionLeftOpen();
    }

    /**
     * Used to log the "x-amzn-RequestId" header at DEBUG level, if any, from the response. This
     * method assumes the apache httpClientSettings request/response has just been successfully
     * executed. The request id is logged using the "com.amazonaws.requestId" logger if it was
     * enabled at DEBUG level; otherwise, it is logged at DEBUG level using the
     * "com.amazonaws.request" logger.
     *
     * @return true if the AWS request id is available from the httpClientSettings header; false
     * otherwise.
     */
    private boolean logHeaderRequestId(final HttpResponse response) {
        final String reqIdHeader = response.getHeaders()
                .get(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER);
        final boolean isHeaderReqIdAvail = reqIdHeader != null;

        if (requestIdLog.isDebugEnabled() || requestLog.isDebugEnabled()) {
            final String msg = HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER + ": "
                               + (isHeaderReqIdAvail ? reqIdHeader : "not available");
            if (requestIdLog.isDebugEnabled()) {
                requestIdLog.debug(msg);
            } else {
                requestLog.debug(msg);
            }
        }
        return isHeaderReqIdAvail;
    }

    /**
     * Used to log the request id (extracted from the response) at DEBUG level. This method is
     * called only if there is no request id present in the httpClientSettings response header. The
     * request id is logged using the "com.amazonaws.requestId" logger if it was enabled at DEBUG
     * level; otherwise, it is logged using at DEBUG level using the "com.amazonaws.request"
     * logger.
     */
    private void logResponseRequestId(final String awsRequestId) {
        if (requestIdLog.isDebugEnabled() || requestLog.isDebugEnabled()) {
            final String msg = "AWS Request ID: " +
                               (awsRequestId == null ? "not available" : awsRequestId);
            if (requestIdLog.isDebugEnabled()) {
                requestIdLog.debug(msg);
            } else {
                requestLog.debug(msg);
            }
        }
    }
}
