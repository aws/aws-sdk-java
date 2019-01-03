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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.RequestConfig;
import com.amazonaws.Response;
import com.amazonaws.SdkBaseException;
import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.internal.auth.SignerProvider;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.CredentialUtils;

import java.net.URI;
import java.util.List;

/**
 * Default implementation of {@link ClientHandler}.
 */
@Immutable
@ThreadSafe
@SdkProtectedApi
public class ClientHandlerImpl extends ClientHandler {

    private final AWSCredentialsProvider awsCredentialsProvider;
    private final SignerProvider signerProvider;
    private final URI endpoint;
    private final List<RequestHandler2> requestHandler2s;
    private final RequestMetricCollector clientLevelMetricCollector;
    private final AmazonHttpClient client;

    public ClientHandlerImpl(ClientHandlerParams handlerParams) {
        this.signerProvider = handlerParams.getClientParams().getSignerProvider();
        this.endpoint = handlerParams.getClientParams().getEndpoint();
        this.awsCredentialsProvider = handlerParams.getClientParams().getCredentialsProvider();
        this.requestHandler2s = handlerParams.getClientParams().getRequestHandlers();
        this.clientLevelMetricCollector = handlerParams.getClientParams().getRequestMetricCollector();
        this.client = buildHttpClient(handlerParams);
    }

    private AmazonHttpClient buildHttpClient(ClientHandlerParams handlerParams) {
        final AwsSyncClientParams clientParams = handlerParams.getClientParams();
        return AmazonHttpClient.builder()
                .clientConfiguration(clientParams.getClientConfiguration())
                .retryPolicy(clientParams.getRetryPolicy())
                .requestMetricCollector(clientParams.getRequestMetricCollector())
                .useBrowserCompatibleHostNameVerifier(handlerParams.isDisableStrictHostnameVerification())
                .build();
    }

    @Override
    public <Input, Output> Output execute(
            ClientExecutionParams<Input, Output> executionParams) {
        final Input input = executionParams.getInput();
        ExecutionContext executionContext = createExecutionContext(
                executionParams.getRequestConfig());
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(AWSRequestMetrics.Field.ClientExecuteTime);
        Request<Input> request = null;
        Response<Output> response = null;

        try {
            awsRequestMetrics.startEvent(AWSRequestMetrics.Field.RequestMarshallTime);
            try {
                request = executionParams.getMarshaller().marshall(input);
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestMarshallTime);
            }

            response = invoke(request,
                              executionParams.getRequestConfig(),
                              executionContext,
                              executionParams.getResponseHandler(),
                              executionParams.getErrorResponseHandler());

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics,
                               executionParams.getRequestConfig(),
                               request,
                               response);
        }
    }

    @Override
    public void shutdown() {
        client.shutdown();
    }

    private ExecutionContext createExecutionContext(RequestConfig requestConfig) {
        boolean isMetricsEnabled = isRequestMetricsEnabled(requestConfig);
        return ExecutionContext.builder()
                .withRequestHandler2s(requestHandler2s)
                .withUseRequestMetrics(isMetricsEnabled)
                .withSignerProvider(signerProvider)
                .build();
    }

    /**
     * Returns true if request metric collection is applicable to the given request; false
     * otherwise.
     */
    private boolean isRequestMetricsEnabled(RequestConfig requestConfig) {
        return hasRequestMetricsCollector(requestConfig) || isRMCEnabledAtClientOrSdkLevel();
    }

    private boolean hasRequestMetricsCollector(RequestConfig requestConfig) {
        return requestConfig.getRequestMetricsCollector() != null &&
               requestConfig.getRequestMetricsCollector().isEnabled();
    }

    /**
     * Returns true if request metric collection is enabled at the service client or AWS SDK level
     * request; false otherwise.
     */
    private boolean isRMCEnabledAtClientOrSdkLevel() {
        RequestMetricCollector collector = requestMetricCollector();
        return collector != null && collector.isEnabled();
    }

    /**
     * Returns the client specific request metric collector if there is one; or the one at the AWS
     * SDK level otherwise.
     */
    private RequestMetricCollector requestMetricCollector() {
        return clientLevelMetricCollector != null ? clientLevelMetricCollector :
                AwsSdkMetrics.getRequestMetricCollector();
    }


    /**
     * Runs the {@code beforeMarshalling} method of any {@code RequestHandler2}s associated with
     * this client.
     *
     * @param request the request passed in from the user
     * @return The (possibly different) request to marshall
     */
    @SuppressWarnings("unchecked")
    protected final <T extends AmazonWebServiceRequest> T beforeMarshalling(T request) {
        T local = request;
        for (RequestHandler2 handler : requestHandler2s) {
            local = (T) handler.beforeMarshalling(local);
        }
        return local;
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the
     * request level.
     **/
    private <Output, Input> Response<Output> invoke(Request<Input> request,
                                                    RequestConfig requestConfig,
                                                    ExecutionContext executionContext,
                                                    HttpResponseHandler<Output> responseHandler,
                                                    HttpResponseHandler<? extends SdkBaseException> errorResponseHandler) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(
                requestConfig, awsCredentialsProvider));

        return doInvoke(request, requestConfig, executionContext, responseHandler,
                        errorResponseHandler);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been
     * configured in the ExecutionContext beforehand.
     **/
    private <Output, Input> Response<Output> doInvoke(Request<Input> request,
                                                      RequestConfig requestConfig,
                                                      ExecutionContext executionContext,
                                                      HttpResponseHandler<Output> responseHandler,
                                                      HttpResponseHandler<? extends SdkBaseException> errorResponseHandler) {
        request.setEndpoint(endpoint);
        return client.requestExecutionBuilder()
                .request(request)
                .requestConfig(requestConfig)
                .executionContext(executionContext)
                .errorResponseHandler(errorResponseHandler)
                .execute(responseHandler);
    }

    /**
     * Convenient method to end the client execution without logging the awsRequestMetrics.
     */
    private void endClientExecution(AWSRequestMetrics awsRequestMetrics,
                                          RequestConfig requestConfig,
                                          Request<?> request,
                                          Response<?> response) {
        if (request != null) {
            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ClientExecuteTime);
            awsRequestMetrics.getTimingInfo().endTiming();
            RequestMetricCollector metricCollector = findRequestMetricCollector(requestConfig);
            metricCollector.collectMetrics(request, response);
            awsRequestMetrics.log();
        }
    }

    /**
     * Returns the most specific request metric collector, starting from the request level, then
     * client level, then finally the AWS SDK level.
     */
    private RequestMetricCollector findRequestMetricCollector(RequestConfig requestConfig) {
        RequestMetricCollector reqLevelMetricsCollector = requestConfig
                .getRequestMetricsCollector();
        if (reqLevelMetricsCollector != null) {
            return reqLevelMetricsCollector;
        } else if (clientLevelMetricCollector != null) {
            return clientLevelMetricCollector;
        } else {
            return AwsSdkMetrics.getRequestMetricCollector();
        }
    }
}
