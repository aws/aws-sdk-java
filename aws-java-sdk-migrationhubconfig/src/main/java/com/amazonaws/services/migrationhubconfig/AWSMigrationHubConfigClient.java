/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubconfig;

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

import com.amazonaws.services.migrationhubconfig.AWSMigrationHubConfigClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.migrationhubconfig.model.*;
import com.amazonaws.services.migrationhubconfig.model.transform.*;

/**
 * Client for accessing AWS Migration Hub Config. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The AWS Migration Hub home region APIs are available specifically for working with your Migration Hub home region.
 * You can use these APIs to determine a home region, as well as to create and work with controls that describe the home
 * region.
 * </p>
 * <p>
 * You can use these APIs within your home region only. If you call these APIs from outside your home region, your calls
 * are rejected, except for the ability to register your agents and connectors.
 * </p>
 * <p>
 * You must call <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service
 * and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
 * </p>
 * <p>
 * The <code>StartDataCollection</code> API call in AWS Application Discovery Service allows your agents and connectors
 * to begin collecting data that flows directly into the home region, and it will prevent you from enabling data
 * collection information to be sent outside the home region.
 * </p>
 * <p>
 * For specific API usage, see the sections that follow in this AWS Migration Hub Home Region API reference.
 * </p>
 * <note>
 * <p>
 * The Migration Hub Home Region APIs do not support AWS Organizations.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubConfigClient extends AmazonWebServiceClient implements AWSMigrationHubConfig {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMigrationHubConfig.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mgh";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubconfig.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubconfig.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubconfig.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubconfig.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DryRunOperation").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubconfig.model.transform.DryRunOperationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.migrationhubconfig.model.AWSMigrationHubConfigException.class));

    public static AWSMigrationHubConfigClientBuilder builder() {
        return AWSMigrationHubConfigClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub Config using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubConfigClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub Config using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubConfigClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("migrationhub-config.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/migrationhubconfig/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/migrationhubconfig/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This API sets up the home region for the calling account only.
     * </p>
     * 
     * @param createHomeRegionControlRequest
     * @return Result of the CreateHomeRegionControl operation returned by the service.
     * @throws InternalServerErrorException
     *         Exception raised when an internal, configuration, or dependency error is encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when a request fails due to temporary unavailability of the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws DryRunOperationException
     *         Exception raised to indicate that authorization of an action was successful, when the <code>DryRun</code>
     *         flag is set to true.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHubConfig.CreateHomeRegionControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/CreateHomeRegionControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateHomeRegionControlResult createHomeRegionControl(CreateHomeRegionControlRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHomeRegionControl(request);
    }

    @SdkInternalApi
    final CreateHomeRegionControlResult executeCreateHomeRegionControl(CreateHomeRegionControlRequest createHomeRegionControlRequest) {

        ExecutionContext executionContext = createExecutionContext(createHomeRegionControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHomeRegionControlRequest> request = null;
        Response<CreateHomeRegionControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHomeRegionControlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createHomeRegionControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHub Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHomeRegionControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHomeRegionControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateHomeRegionControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API permits filtering on the <code>ControlId</code>, <code>HomeRegion</code>, and
     * <code>RegionControlScope</code> fields.
     * </p>
     * 
     * @param describeHomeRegionControlsRequest
     * @return Result of the DescribeHomeRegionControls operation returned by the service.
     * @throws InternalServerErrorException
     *         Exception raised when an internal, configuration, or dependency error is encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when a request fails due to temporary unavailability of the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHubConfig.DescribeHomeRegionControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DescribeHomeRegionControls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHomeRegionControlsResult describeHomeRegionControls(DescribeHomeRegionControlsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHomeRegionControls(request);
    }

    @SdkInternalApi
    final DescribeHomeRegionControlsResult executeDescribeHomeRegionControls(DescribeHomeRegionControlsRequest describeHomeRegionControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHomeRegionControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHomeRegionControlsRequest> request = null;
        Response<DescribeHomeRegionControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHomeRegionControlsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeHomeRegionControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHub Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHomeRegionControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHomeRegionControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeHomeRegionControlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the calling account’s home region, if configured. This API is used by other AWS services to determine the
     * regional endpoint for calling AWS Application Discovery Service and Migration Hub. You must call
     * <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service and AWS
     * Migration Hub APIs, to obtain the account's Migration Hub home region.
     * </p>
     * 
     * @param getHomeRegionRequest
     * @return Result of the GetHomeRegion operation returned by the service.
     * @throws InternalServerErrorException
     *         Exception raised when an internal, configuration, or dependency error is encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when a request fails due to temporary unavailability of the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHubConfig.GetHomeRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/GetHomeRegion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetHomeRegionResult getHomeRegion(GetHomeRegionRequest request) {
        request = beforeClientExecution(request);
        return executeGetHomeRegion(request);
    }

    @SdkInternalApi
    final GetHomeRegionResult executeGetHomeRegion(GetHomeRegionRequest getHomeRegionRequest) {

        ExecutionContext executionContext = createExecutionContext(getHomeRegionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHomeRegionRequest> request = null;
        Response<GetHomeRegionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHomeRegionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getHomeRegionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHub Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHomeRegion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHomeRegionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetHomeRegionResultJsonUnmarshaller());
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
