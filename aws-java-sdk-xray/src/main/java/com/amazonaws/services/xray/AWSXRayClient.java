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
package com.amazonaws.services.xray;

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

import com.amazonaws.services.xray.AWSXRayClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.services.xray.model.transform.*;

/**
 * Client for accessing AWS X-Ray. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * AWS X-Ray provides APIs for managing debug traces and retrieving service maps and other data created by processing
 * those traces.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSXRayClient extends AmazonWebServiceClient implements AWSXRay {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSXRay.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "xray";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.xray.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledException").withModeledClass(
                                    com.amazonaws.services.xray.model.ThrottledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RuleLimitExceededException").withModeledClass(
                                    com.amazonaws.services.xray.model.RuleLimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.xray.model.AWSXRayException.class));

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AWSXRayClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSXRayClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS X-Ray (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSXRayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSXRayClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSXRayClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSXRayClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSXRayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS X-Ray (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSXRayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSXRayClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSXRayClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSXRayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS X-Ray (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSXRayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSXRayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS X-Ray (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSXRayClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSXRayClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSXRayClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSXRayClientBuilder builder() {
        return AWSXRayClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSXRayClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS X-Ray using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSXRayClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("xray.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/xray/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/xray/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
     * a single request. Use <code>GetTraceSummaries</code> to get a list of trace IDs.
     * </p>
     * 
     * @param batchGetTracesRequest
     * @return Result of the BatchGetTraces operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.BatchGetTraces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/BatchGetTraces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetTracesResult batchGetTraces(BatchGetTracesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetTraces(request);
    }

    @SdkInternalApi
    final BatchGetTracesResult executeBatchGetTraces(BatchGetTracesRequest batchGetTracesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetTracesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetTracesRequest> request = null;
        Response<BatchGetTracesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetTracesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetTracesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetTraces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetTracesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetTracesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a group resource with a name and a filter expression.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with
     * <a>GetSamplingRules</a>, and evaluate each rule in ascending order of <i>priority</i> for each request. If a rule
     * matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports
     * back to X-Ray with <a>GetSamplingTargets</a> to get updated versions of each in-use rule. The updated rule
     * contains a trace quota that the service can use instead of borrowing from the reservoir.
     * </p>
     * 
     * @param createSamplingRuleRequest
     * @return Result of the CreateSamplingRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @throws RuleLimitExceededException
     *         You have reached the maximum number of sampling rules.
     * @sample AWSXRay.CreateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSamplingRuleResult createSamplingRule(CreateSamplingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSamplingRule(request);
    }

    @SdkInternalApi
    final CreateSamplingRuleResult executeCreateSamplingRule(CreateSamplingRuleRequest createSamplingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createSamplingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSamplingRuleRequest> request = null;
        Response<CreateSamplingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSamplingRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSamplingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSamplingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSamplingRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSamplingRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a group resource.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a sampling rule.
     * </p>
     * 
     * @param deleteSamplingRuleRequest
     * @return Result of the DeleteSamplingRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.DeleteSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSamplingRuleResult deleteSamplingRule(DeleteSamplingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSamplingRule(request);
    }

    @SdkInternalApi
    final DeleteSamplingRuleResult executeDeleteSamplingRule(DeleteSamplingRuleRequest deleteSamplingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSamplingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSamplingRuleRequest> request = null;
        Response<DeleteSamplingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSamplingRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSamplingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSamplingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSamplingRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSamplingRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current encryption configuration for X-Ray data.
     * </p>
     * 
     * @param getEncryptionConfigRequest
     * @return Result of the GetEncryptionConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEncryptionConfigResult getEncryptionConfig(GetEncryptionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetEncryptionConfig(request);
    }

    @SdkInternalApi
    final GetEncryptionConfigResult executeGetEncryptionConfig(GetEncryptionConfigRequest getEncryptionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getEncryptionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEncryptionConfigRequest> request = null;
        Response<GetEncryptionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEncryptionConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEncryptionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEncryptionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEncryptionConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEncryptionConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves group resource details.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroup(request);
    }

    @SdkInternalApi
    final GetGroupResult executeGetGroup(GetGroupRequest getGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all active group details.
     * </p>
     * 
     * @param getGroupsRequest
     * @return Result of the GetGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupsResult getGroups(GetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroups(request);
    }

    @SdkInternalApi
    final GetGroupsResult executeGetGroups(GetGroupsRequest getGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupsRequest> request = null;
        Response<GetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all sampling rules.
     * </p>
     * 
     * @param getSamplingRulesRequest
     * @return Result of the GetSamplingRules operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetSamplingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSamplingRulesResult getSamplingRules(GetSamplingRulesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSamplingRules(request);
    }

    @SdkInternalApi
    final GetSamplingRulesResult executeGetSamplingRules(GetSamplingRulesRequest getSamplingRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSamplingRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSamplingRulesRequest> request = null;
        Response<GetSamplingRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSamplingRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSamplingRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSamplingRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSamplingRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSamplingRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about recent sampling results for all sampling rules.
     * </p>
     * 
     * @param getSamplingStatisticSummariesRequest
     * @return Result of the GetSamplingStatisticSummaries operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetSamplingStatisticSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingStatisticSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSamplingStatisticSummariesResult getSamplingStatisticSummaries(GetSamplingStatisticSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSamplingStatisticSummaries(request);
    }

    @SdkInternalApi
    final GetSamplingStatisticSummariesResult executeGetSamplingStatisticSummaries(GetSamplingStatisticSummariesRequest getSamplingStatisticSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSamplingStatisticSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSamplingStatisticSummariesRequest> request = null;
        Response<GetSamplingStatisticSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSamplingStatisticSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSamplingStatisticSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSamplingStatisticSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSamplingStatisticSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSamplingStatisticSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a sampling quota for rules that the service is using to sample requests.
     * </p>
     * 
     * @param getSamplingTargetsRequest
     * @return Result of the GetSamplingTargets operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetSamplingTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingTargets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSamplingTargetsResult getSamplingTargets(GetSamplingTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSamplingTargets(request);
    }

    @SdkInternalApi
    final GetSamplingTargetsResult executeGetSamplingTargets(GetSamplingTargetsRequest getSamplingTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSamplingTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSamplingTargetsRequest> request = null;
        Response<GetSamplingTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSamplingTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSamplingTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSamplingTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSamplingTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSamplingTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a document that describes services that process incoming requests, and downstream services that they
     * call as a result. Root services process incoming requests and make calls to downstream services. Root services
     * are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP
     * web APIs, or SQL databases.
     * </p>
     * 
     * @param getServiceGraphRequest
     * @return Result of the GetServiceGraph operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetServiceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetServiceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServiceGraphResult getServiceGraph(GetServiceGraphRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceGraph(request);
    }

    @SdkInternalApi
    final GetServiceGraphResult executeGetServiceGraph(GetServiceGraphRequest getServiceGraphRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceGraphRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceGraphRequest> request = null;
        Response<GetServiceGraphResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceGraphRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceGraphRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceGraph");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceGraphResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceGraphResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a service graph for one or more specific trace IDs.
     * </p>
     * 
     * @param getTraceGraphRequest
     * @return Result of the GetTraceGraph operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetTraceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTraceGraphResult getTraceGraph(GetTraceGraphRequest request) {
        request = beforeClientExecution(request);
        return executeGetTraceGraph(request);
    }

    @SdkInternalApi
    final GetTraceGraphResult executeGetTraceGraph(GetTraceGraphRequest getTraceGraphRequest) {

        ExecutionContext executionContext = createExecutionContext(getTraceGraphRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTraceGraphRequest> request = null;
        Response<GetTraceGraphResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTraceGraphRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTraceGraphRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTraceGraph");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTraceGraphResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTraceGraphResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the
     * full traces, pass the trace IDs to <code>BatchGetTraces</code>.
     * </p>
     * <p>
     * A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come
     * from a known user. For example, the following filter expression targets traces that pass through
     * <code>api.example.com</code>:
     * </p>
     * <p>
     * <code>service("api.example.com")</code>
     * </p>
     * <p>
     * This filter expression finds traces that have an annotation named <code>account</code> with the value
     * <code>12345</code>:
     * </p>
     * <p>
     * <code>annotation.account = "12345"</code>
     * </p>
     * <p>
     * For a full list of indexed fields and keywords that you can use in filter expressions, see <a
     * href="http://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html">Using Filter Expressions</a> in
     * the <i>AWS X-Ray Developer Guide</i>.
     * </p>
     * 
     * @param getTraceSummariesRequest
     * @return Result of the GetTraceSummaries operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetTraceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceSummaries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTraceSummariesResult getTraceSummaries(GetTraceSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeGetTraceSummaries(request);
    }

    @SdkInternalApi
    final GetTraceSummariesResult executeGetTraceSummaries(GetTraceSummariesRequest getTraceSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(getTraceSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTraceSummariesRequest> request = null;
        Response<GetTraceSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTraceSummariesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTraceSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTraceSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTraceSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTraceSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the encryption configuration for X-Ray data.
     * </p>
     * 
     * @param putEncryptionConfigRequest
     * @return Result of the PutEncryptionConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.PutEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutEncryptionConfigResult putEncryptionConfig(PutEncryptionConfigRequest request) {
        request = beforeClientExecution(request);
        return executePutEncryptionConfig(request);
    }

    @SdkInternalApi
    final PutEncryptionConfigResult executePutEncryptionConfig(PutEncryptionConfigRequest putEncryptionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(putEncryptionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEncryptionConfigRequest> request = null;
        Response<PutEncryptionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEncryptionConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEncryptionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEncryptionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEncryptionConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEncryptionConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by the AWS X-Ray daemon to upload telemetry.
     * </p>
     * 
     * @param putTelemetryRecordsRequest
     * @return Result of the PutTelemetryRecords operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.PutTelemetryRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTelemetryRecords" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutTelemetryRecordsResult putTelemetryRecords(PutTelemetryRecordsRequest request) {
        request = beforeClientExecution(request);
        return executePutTelemetryRecords(request);
    }

    @SdkInternalApi
    final PutTelemetryRecordsResult executePutTelemetryRecords(PutTelemetryRecordsRequest putTelemetryRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(putTelemetryRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutTelemetryRecordsRequest> request = null;
        Response<PutTelemetryRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutTelemetryRecordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putTelemetryRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutTelemetryRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutTelemetryRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutTelemetryRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray
     * daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or
     * an array of subsegments.
     * </p>
     * <p>
     * Segments must include the following fields. For the full segment document schema, see <a
     * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">AWS X-Ray Segment
     * Documents</a> in the <i>AWS X-Ray Developer Guide</i>.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, i.e. <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putTraceSegmentsRequest
     * @return Result of the PutTraceSegments operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.PutTraceSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutTraceSegmentsResult putTraceSegments(PutTraceSegmentsRequest request) {
        request = beforeClientExecution(request);
        return executePutTraceSegments(request);
    }

    @SdkInternalApi
    final PutTraceSegmentsResult executePutTraceSegments(PutTraceSegmentsRequest putTraceSegmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(putTraceSegmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutTraceSegmentsRequest> request = null;
        Response<PutTraceSegmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutTraceSegmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putTraceSegmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutTraceSegments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutTraceSegmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutTraceSegmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a group resource.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroup(request);
    }

    @SdkInternalApi
    final UpdateGroupResult executeUpdateGroup(UpdateGroupRequest updateGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupRequest> request = null;
        Response<UpdateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a sampling rule's configuration.
     * </p>
     * 
     * @param updateSamplingRuleRequest
     * @return Result of the UpdateSamplingRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.UpdateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSamplingRuleResult updateSamplingRule(UpdateSamplingRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSamplingRule(request);
    }

    @SdkInternalApi
    final UpdateSamplingRuleResult executeUpdateSamplingRule(UpdateSamplingRuleRequest updateSamplingRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSamplingRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSamplingRuleRequest> request = null;
        Response<UpdateSamplingRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSamplingRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSamplingRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "XRay");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSamplingRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSamplingRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSamplingRuleResultJsonUnmarshaller());
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
