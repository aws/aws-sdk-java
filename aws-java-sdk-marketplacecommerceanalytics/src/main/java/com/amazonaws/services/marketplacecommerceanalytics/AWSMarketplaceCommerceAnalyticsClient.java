/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.marketplacecommerceanalytics;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.marketplacecommerceanalytics.AWSMarketplaceCommerceAnalyticsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.marketplacecommerceanalytics.model.*;
import com.amazonaws.services.marketplacecommerceanalytics.model.transform.*;

/**
 * Client for accessing AWS Marketplace Commerce Analytics. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * Provides AWS Marketplace business intelligence data on-demand.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceCommerceAnalyticsClient extends AmazonWebServiceClient implements AWSMarketplaceCommerceAnalytics {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMarketplaceCommerceAnalytics.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "marketplacecommerceanalytics";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MarketplaceCommerceAnalyticsException").withModeledClass(
                                    com.amazonaws.services.marketplacecommerceanalytics.model.MarketplaceCommerceAnalyticsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.marketplacecommerceanalytics.model.AWSMarketplaceCommerceAnalyticsException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics. A credentials provider
     * chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics. A credentials provider
     * chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Marketplace Commerce
     *        Analytics (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified AWS
     * account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AWSMarketplaceCommerceAnalyticsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified AWS
     * account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Marketplace Commerce
     *        Analytics (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified AWS
     * account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified AWS
     * account credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Marketplace Commerce
     *        Analytics (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified AWS
     * account credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Marketplace Commerce
     *        Analytics (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSMarketplaceCommerceAnalyticsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSMarketplaceCommerceAnalyticsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSMarketplaceCommerceAnalyticsClientBuilder builder() {
        return AWSMarketplaceCommerceAnalyticsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceCommerceAnalyticsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Marketplace Commerce Analytics using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceCommerceAnalyticsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://marketplacecommerceanalytics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/marketplacecommerceanalytics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/marketplacecommerceanalytics/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Given a data set type and data set publication date, asynchronously publishes the requested data set to the
     * specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
     * identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
     * published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with
     * the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten
     * by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following
     * actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
     * 
     * @param generateDataSetRequest
     *        Container for the parameters to the GenerateDataSet operation.
     * @return Result of the GenerateDataSet operation returned by the service.
     * @throws MarketplaceCommerceAnalyticsException
     *         This exception is thrown when an internal service error occurs.
     * @sample AWSMarketplaceCommerceAnalytics.GenerateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplacecommerceanalytics-2015-07-01/GenerateDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GenerateDataSetResult generateDataSet(GenerateDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateDataSet(request);
    }

    @SdkInternalApi
    final GenerateDataSetResult executeGenerateDataSet(GenerateDataSetRequest generateDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(generateDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataSetRequest> request = null;
        Response<GenerateDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Commerce Analytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Given a data set type and a from date, asynchronously publishes the requested customer support data to the
     * specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request
     * identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be
     * published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv.
     * If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will
     * be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions
     * for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,
     * iam:GetRolePolicy.
     * 
     * @param startSupportDataExportRequest
     *        Container for the parameters to the StartSupportDataExport operation.
     * @return Result of the StartSupportDataExport operation returned by the service.
     * @throws MarketplaceCommerceAnalyticsException
     *         This exception is thrown when an internal service error occurs.
     * @sample AWSMarketplaceCommerceAnalytics.StartSupportDataExport
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplacecommerceanalytics-2015-07-01/StartSupportDataExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSupportDataExportResult startSupportDataExport(StartSupportDataExportRequest request) {
        request = beforeClientExecution(request);
        return executeStartSupportDataExport(request);
    }

    @SdkInternalApi
    final StartSupportDataExportResult executeStartSupportDataExport(StartSupportDataExportRequest startSupportDataExportRequest) {

        ExecutionContext executionContext = createExecutionContext(startSupportDataExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSupportDataExportRequest> request = null;
        Response<StartSupportDataExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSupportDataExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSupportDataExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Marketplace Commerce Analytics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSupportDataExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSupportDataExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSupportDataExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
