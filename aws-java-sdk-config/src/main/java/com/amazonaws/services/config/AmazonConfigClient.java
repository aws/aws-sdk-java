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
package com.amazonaws.services.config;

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

import com.amazonaws.services.config.AmazonConfigClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.config.model.*;
import com.amazonaws.services.config.model.transform.*;

/**
 * Client for accessing Config Service. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>AWS Config</fullname>
 * <p>
 * AWS Config provides a way to keep track of the configurations of all the AWS resources associated with your AWS
 * account. You can use AWS Config to get the current and historical configurations of each AWS resource and also to get
 * information about the relationship between the resources. An AWS resource can be an Amazon Compute Cloud (Amazon EC2)
 * instance, an Elastic Block Store (EBS) volume, an elastic network Interface (ENI), or a security group. For a
 * complete list of resources currently supported by AWS Config, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported AWS Resources</a>.
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management Console, the AWS Command Line Interface (AWS CLI),
 * the AWS Config API, or the AWS SDKs for AWS Config. This reference guide contains documentation for the AWS Config
 * API and the AWS CLI commands that you can use to manage AWS Config. The AWS Config API uses the Signature Version 4
 * protocol for signing requests. For more information about how to sign a request with this protocol, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>. For detailed information about AWS Config features and their associated actions or commands, as well as
 * how to work with AWS Management Console, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html">What Is AWS Config</a> in the
 * <i>AWS Config Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConfigClient extends AmazonWebServiceClient implements AmazonConfig {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConfig.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "config";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoRunningConfigurationRecorderException").withModeledClass(
                                    com.amazonaws.services.config.model.NoRunningConfigurationRecorderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotDiscoveredException").withModeledClass(
                                    com.amazonaws.services.config.model.ResourceNotDiscoveredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchRemediationConfigurationException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchRemediationConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableDeliveryChannelException").withModeledClass(
                                    com.amazonaws.services.config.model.NoAvailableDeliveryChannelException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchRetentionConfigurationException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchRetentionConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResultTokenException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidResultTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OversizedConfigurationItemException").withModeledClass(
                                    com.amazonaws.services.config.model.OversizedConfigurationItemException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientDeliveryPolicyException").withModeledClass(
                                    com.amazonaws.services.config.model.InsufficientDeliveryPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigurationAggregatorException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchConfigurationAggregatorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationAccessDeniedException").withModeledClass(
                                    com.amazonaws.services.config.model.OrganizationAccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableConfigurationRecorderException").withModeledClass(
                                    com.amazonaws.services.config.model.NoAvailableConfigurationRecorderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableOrganizationException").withModeledClass(
                                    com.amazonaws.services.config.model.NoAvailableOrganizationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchDeliveryChannelException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchDeliveryChannelException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.config.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LastDeliveryChannelDeleteFailedException").withModeledClass(
                                    com.amazonaws.services.config.model.LastDeliveryChannelDeleteFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationAllFeaturesNotEnabledException").withModeledClass(
                                    com.amazonaws.services.config.model.OrganizationAllFeaturesNotEnabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.config.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLimitException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidLimitException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfDeliveryChannelsExceededException").withModeledClass(
                                    com.amazonaws.services.config.model.MaxNumberOfDeliveryChannelsExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigurationRecorderException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchConfigurationRecorderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.config.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfConfigRulesExceededException").withModeledClass(
                                    com.amazonaws.services.config.model.MaxNumberOfConfigRulesExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientPermissionsException").withModeledClass(
                                    com.amazonaws.services.config.model.InsufficientPermissionsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidExpressionException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidExpressionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.config.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfConfigurationRecordersExceededException").withModeledClass(
                                    com.amazonaws.services.config.model.MaxNumberOfConfigurationRecordersExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchBucketException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchBucketException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRecordingGroupException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidRecordingGroupException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConfigurationRecorderNameException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidConfigurationRecorderNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withModeledClass(
                                    com.amazonaws.services.config.model.TooManyTagsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSNSTopicARNException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidSNSTopicARNException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfRetentionConfigurationsExceededException").withModeledClass(
                                    com.amazonaws.services.config.model.MaxNumberOfRetentionConfigurationsExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTimeRangeException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidTimeRangeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigRuleException").withModeledClass(
                                    com.amazonaws.services.config.model.NoSuchConfigRuleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRoleException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeliveryChannelNameException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidDeliveryChannelNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3KeyPrefixException").withModeledClass(
                                    com.amazonaws.services.config.model.InvalidS3KeyPrefixException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.config.model.AmazonConfigException.class));

    /**
     * Constructs a new client to invoke service methods on Config Service. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AmazonConfigClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonConfigClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Config Service. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Config Service (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonConfigClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonConfigClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonConfigClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonConfigClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonConfigClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Config Service (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonConfigClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonConfigClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonConfigClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Config Service (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonConfigClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Config Service (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonConfigClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonConfigClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonConfigClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonConfigClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonConfigClientBuilder builder() {
        return AmazonConfigClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConfigClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Config Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConfigClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("config.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/config/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/config/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns the current configuration items for resources that are present in your AWS Config aggregator. The
     * operation also returns a list of resources that are not processed in the current request. If there are no
     * unprocessed resources, the operation returns an empty <code>unprocessedResourceIdentifiers</code> list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return tags and relationships.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetAggregateResourceConfigRequest
     * @return Result of the BatchGetAggregateResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.BatchGetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetAggregateResourceConfigResult batchGetAggregateResourceConfig(BatchGetAggregateResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetAggregateResourceConfig(request);
    }

    @SdkInternalApi
    final BatchGetAggregateResourceConfigResult executeBatchGetAggregateResourceConfig(
            BatchGetAggregateResourceConfigRequest batchGetAggregateResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetAggregateResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetAggregateResourceConfigRequest> request = null;
        Response<BatchGetAggregateResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetAggregateResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetAggregateResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetAggregateResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetAggregateResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetAggregateResourceConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current configuration for one or more requested resources. The operation also returns a list of
     * resources that are not processed in the current request. If there are no unprocessed resources, the operation
     * returns an empty unprocessedResourceKeys list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return any tags for the requested resources. This information is filtered out of the
     * supplementaryConfiguration section of the API response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetResourceConfigRequest
     * @return Result of the BatchGetResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @sample AmazonConfig.BatchGetResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetResourceConfigResult batchGetResourceConfig(BatchGetResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetResourceConfig(request);
    }

    @SdkInternalApi
    final BatchGetResourceConfigResult executeBatchGetResourceConfig(BatchGetResourceConfigRequest batchGetResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetResourceConfigRequest> request = null;
        Response<BatchGetResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetResourceConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
     * </p>
     * 
     * @param deleteAggregationAuthorizationRequest
     * @return Result of the DeleteAggregationAuthorization operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DeleteAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAggregationAuthorizationResult deleteAggregationAuthorization(DeleteAggregationAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAggregationAuthorization(request);
    }

    @SdkInternalApi
    final DeleteAggregationAuthorizationResult executeDeleteAggregationAuthorization(DeleteAggregationAuthorizationRequest deleteAggregationAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAggregationAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAggregationAuthorizationRequest> request = null;
        Response<DeleteAggregationAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAggregationAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAggregationAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAggregationAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAggregationAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAggregationAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until the deletion is complete. You cannot update a
     * rule while it is in this state. If you make a <code>PutConfigRule</code> or <code>DeleteConfigRule</code> request
     * for the rule, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @return Result of the DeleteConfigRule operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @throws ResourceInUseException
     *         The rule is currently being deleted or the rule is deleting your evaluation results. Try your request
     *         again later.
     * @sample AmazonConfig.DeleteConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteConfigRuleResult deleteConfigRule(DeleteConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigRule(request);
    }

    @SdkInternalApi
    final DeleteConfigRuleResult executeDeleteConfigRule(DeleteConfigRuleRequest deleteConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigRuleRequest> request = null;
        Response<DeleteConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
     * </p>
     * 
     * @param deleteConfigurationAggregatorRequest
     * @return Result of the DeleteConfigurationAggregator operation returned by the service.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.DeleteConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationAggregatorResult deleteConfigurationAggregator(DeleteConfigurationAggregatorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationAggregator(request);
    }

    @SdkInternalApi
    final DeleteConfigurationAggregatorResult executeDeleteConfigurationAggregator(DeleteConfigurationAggregatorRequest deleteConfigurationAggregatorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationAggregatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationAggregatorRequest> request = null;
        Response<DeleteConfigurationAggregatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationAggregatorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfigurationAggregatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationAggregator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationAggregatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfigurationAggregatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the configuration recorder.
     * </p>
     * <p>
     * After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
     * create a new configuration recorder.
     * </p>
     * <p>
     * This action does not delete the configuration information that was previously recorded. You will be able to
     * access the previously recorded information by using the <code>GetResourceConfigHistory</code> action, but you
     * will not be able to access this information in the AWS Config console until you create a new configuration
     * recorder.
     * </p>
     * 
     * @param deleteConfigurationRecorderRequest
     *        The request object for the <code>DeleteConfigurationRecorder</code> action.
     * @return Result of the DeleteConfigurationRecorder operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DeleteConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationRecorderResult deleteConfigurationRecorder(DeleteConfigurationRecorderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationRecorder(request);
    }

    @SdkInternalApi
    final DeleteConfigurationRecorderResult executeDeleteConfigurationRecorder(DeleteConfigurationRecorderRequest deleteConfigurationRecorderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationRecorderRequest> request = null;
        Response<DeleteConfigurationRecorderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationRecorderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationRecorder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationRecorderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfigurationRecorderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the delivery channel.
     * </p>
     * <p>
     * Before you can delete the delivery channel, you must stop the configuration recorder by using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON
     *        format.
     * @return Result of the DeleteDeliveryChannel operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @throws LastDeliveryChannelDeleteFailedException
     *         You cannot delete the delivery channel you specified because the configuration recorder is running.
     * @sample AmazonConfig.DeleteDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteDeliveryChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeliveryChannelResult deleteDeliveryChannel(DeleteDeliveryChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeliveryChannel(request);
    }

    @SdkInternalApi
    final DeleteDeliveryChannelResult executeDeleteDeliveryChannel(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeliveryChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryChannelRequest> request = null;
        Response<DeleteDeliveryChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeliveryChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeliveryChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeliveryChannelResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDeliveryChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per
     * request. After you delete the evaluation results, you can call the <a>StartConfigRulesEvaluation</a> API to start
     * evaluating your AWS resources against the rule.
     * </p>
     * 
     * @param deleteEvaluationResultsRequest
     * @return Result of the DeleteEvaluationResults operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @throws ResourceInUseException
     *         The rule is currently being deleted or the rule is deleting your evaluation results. Try your request
     *         again later.
     * @sample AmazonConfig.DeleteEvaluationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteEvaluationResults" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEvaluationResultsResult deleteEvaluationResults(DeleteEvaluationResultsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEvaluationResults(request);
    }

    @SdkInternalApi
    final DeleteEvaluationResultsResult executeDeleteEvaluationResults(DeleteEvaluationResultsRequest deleteEvaluationResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEvaluationResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEvaluationResultsRequest> request = null;
        Response<DeleteEvaluationResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEvaluationResultsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEvaluationResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEvaluationResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEvaluationResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEvaluationResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes pending authorization requests for a specified aggregator account in a specified region.
     * </p>
     * 
     * @param deletePendingAggregationRequestRequest
     * @return Result of the DeletePendingAggregationRequest operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DeletePendingAggregationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeletePendingAggregationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePendingAggregationRequestResult deletePendingAggregationRequest(DeletePendingAggregationRequestRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePendingAggregationRequest(request);
    }

    @SdkInternalApi
    final DeletePendingAggregationRequestResult executeDeletePendingAggregationRequest(
            DeletePendingAggregationRequestRequest deletePendingAggregationRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePendingAggregationRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePendingAggregationRequestRequest> request = null;
        Response<DeletePendingAggregationRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePendingAggregationRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePendingAggregationRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePendingAggregationRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePendingAggregationRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePendingAggregationRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the remediation configuration.
     * </p>
     * 
     * @param deleteRemediationConfigurationRequest
     * @return Result of the DeleteRemediationConfiguration operation returned by the service.
     * @throws NoSuchRemediationConfigurationException
     *         You specified an AWS Config rule without a remediation configuration.
     * @sample AmazonConfig.DeleteRemediationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRemediationConfigurationResult deleteRemediationConfiguration(DeleteRemediationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRemediationConfiguration(request);
    }

    @SdkInternalApi
    final DeleteRemediationConfigurationResult executeDeleteRemediationConfiguration(DeleteRemediationConfigurationRequest deleteRemediationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRemediationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRemediationConfigurationRequest> request = null;
        Response<DeleteRemediationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRemediationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRemediationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRemediationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRemediationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRemediationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the retention configuration.
     * </p>
     * 
     * @param deleteRetentionConfigurationRequest
     * @return Result of the DeleteRetentionConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchRetentionConfigurationException
     *         You have specified a retention configuration that does not exist.
     * @sample AmazonConfig.DeleteRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRetentionConfigurationResult deleteRetentionConfiguration(DeleteRetentionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRetentionConfiguration(request);
    }

    @SdkInternalApi
    final DeleteRetentionConfigurationResult executeDeleteRetentionConfiguration(DeleteRetentionConfigurationRequest deleteRetentionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRetentionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetentionConfigurationRequest> request = null;
        Response<DeleteRetentionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetentionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRetentionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRetentionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRetentionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRetentionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
     * the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have
     * specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Notification of the start of the delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of the completion of the delivery, if the delivery was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery failure, if the delivery failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @return Result of the DeliverConfigSnapshot operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @sample AmazonConfig.DeliverConfigSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliverConfigSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeliverConfigSnapshotResult deliverConfigSnapshot(DeliverConfigSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeliverConfigSnapshot(request);
    }

    @SdkInternalApi
    final DeliverConfigSnapshotResult executeDeliverConfigSnapshot(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deliverConfigSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeliverConfigSnapshotRequest> request = null;
        Response<DeliverConfigSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeliverConfigSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deliverConfigSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeliverConfigSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeliverConfigSnapshotResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeliverConfigSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
     * rules.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConfigRulesRequest
     * @return Result of the DescribeAggregateComplianceByConfigRules operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.DescribeAggregateComplianceByConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAggregateComplianceByConfigRulesResult describeAggregateComplianceByConfigRules(DescribeAggregateComplianceByConfigRulesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAggregateComplianceByConfigRules(request);
    }

    @SdkInternalApi
    final DescribeAggregateComplianceByConfigRulesResult executeDescribeAggregateComplianceByConfigRules(
            DescribeAggregateComplianceByConfigRulesRequest describeAggregateComplianceByConfigRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAggregateComplianceByConfigRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAggregateComplianceByConfigRulesRequest> request = null;
        Response<DescribeAggregateComplianceByConfigRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAggregateComplianceByConfigRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAggregateComplianceByConfigRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAggregateComplianceByConfigRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAggregateComplianceByConfigRulesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAggregateComplianceByConfigRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @param describeAggregationAuthorizationsRequest
     * @return Result of the DescribeAggregationAuthorizations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribeAggregationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAggregationAuthorizationsResult describeAggregationAuthorizations(DescribeAggregationAuthorizationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAggregationAuthorizations(request);
    }

    @SdkInternalApi
    final DescribeAggregationAuthorizationsResult executeDescribeAggregationAuthorizations(
            DescribeAggregationAuthorizationsRequest describeAggregationAuthorizationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAggregationAuthorizationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAggregationAuthorizationsRequest> request = null;
        Response<DescribeAggregationAuthorizationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAggregationAuthorizationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAggregationAuthorizationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAggregationAuthorizations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAggregationAuthorizationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAggregationAuthorizationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns
     * the number of AWS resources that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these
     * resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @return Result of the DescribeComplianceByConfigRule operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeComplianceByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComplianceByConfigRule(request);
    }

    @SdkInternalApi
    final DescribeComplianceByConfigRuleResult executeDescribeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComplianceByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComplianceByConfigRuleRequest> request = null;
        Response<DescribeComplianceByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComplianceByConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeComplianceByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComplianceByConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComplianceByConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeComplianceByConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule() {
        return describeComplianceByConfigRule(new DescribeComplianceByConfigRuleRequest());
    }

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns
     * the number of AWS Config rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it
     * does not comply with one or more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions about the rules that evaluate the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the AWS Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's AWS Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can
     * occur if the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByResourceRequest
     * @return Result of the DescribeComplianceByResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeComplianceByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource(DescribeComplianceByResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComplianceByResource(request);
    }

    @SdkInternalApi
    final DescribeComplianceByResourceResult executeDescribeComplianceByResource(DescribeComplianceByResourceRequest describeComplianceByResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComplianceByResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComplianceByResourceRequest> request = null;
        Response<DescribeComplianceByResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComplianceByResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeComplianceByResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComplianceByResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComplianceByResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeComplianceByResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource() {
        return describeComplianceByResource(new DescribeComplianceByResourceRequest());
    }

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules. The status includes information such as the
     * last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
     * for the last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @return Result of the DescribeConfigRuleEvaluationStatus operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeConfigRuleEvaluationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRuleEvaluationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(DescribeConfigRuleEvaluationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigRuleEvaluationStatus(request);
    }

    @SdkInternalApi
    final DescribeConfigRuleEvaluationStatusResult executeDescribeConfigRuleEvaluationStatus(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigRuleEvaluationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigRuleEvaluationStatusRequest> request = null;
        Response<DescribeConfigRuleEvaluationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigRuleEvaluationStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigRuleEvaluationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigRuleEvaluationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigRuleEvaluationStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigRuleEvaluationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus() {
        return describeConfigRuleEvaluationStatus(new DescribeConfigRuleEvaluationStatusRequest());
    }

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @return Result of the DescribeConfigRules operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeConfigRulesResult describeConfigRules(DescribeConfigRulesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigRules(request);
    }

    @SdkInternalApi
    final DescribeConfigRulesResult executeDescribeConfigRules(DescribeConfigRulesRequest describeConfigRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigRulesRequest> request = null;
        Response<DescribeConfigRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConfigRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConfigRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules() {
        return describeConfigRules(new DescribeConfigRulesRequest());
    }

    /**
     * <p>
     * Returns status information for sources within an aggregator. The status includes information about the last time
     * AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the
     * status contains the related error code or message.
     * </p>
     * 
     * @param describeConfigurationAggregatorSourcesStatusRequest
     * @return Result of the DescribeConfigurationAggregatorSourcesStatus operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribeConfigurationAggregatorSourcesStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregatorSourcesStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationAggregatorSourcesStatusResult describeConfigurationAggregatorSourcesStatus(
            DescribeConfigurationAggregatorSourcesStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationAggregatorSourcesStatus(request);
    }

    @SdkInternalApi
    final DescribeConfigurationAggregatorSourcesStatusResult executeDescribeConfigurationAggregatorSourcesStatus(
            DescribeConfigurationAggregatorSourcesStatusRequest describeConfigurationAggregatorSourcesStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationAggregatorSourcesStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationAggregatorSourcesStatusRequest> request = null;
        Response<DescribeConfigurationAggregatorSourcesStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationAggregatorSourcesStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigurationAggregatorSourcesStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationAggregatorSourcesStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationAggregatorSourcesStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeConfigurationAggregatorSourcesStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
     * this action returns the details for all the configuration aggregators associated with the account.
     * </p>
     * 
     * @param describeConfigurationAggregatorsRequest
     * @return Result of the DescribeConfigurationAggregators operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribeConfigurationAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationAggregatorsResult describeConfigurationAggregators(DescribeConfigurationAggregatorsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationAggregators(request);
    }

    @SdkInternalApi
    final DescribeConfigurationAggregatorsResult executeDescribeConfigurationAggregators(
            DescribeConfigurationAggregatorsRequest describeConfigurationAggregatorsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationAggregatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationAggregatorsRequest> request = null;
        Response<DescribeConfigurationAggregatorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationAggregatorsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigurationAggregatorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationAggregators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationAggregatorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationAggregatorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
     * this action returns the status of all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a> action.
     * @return Result of the DescribeConfigurationRecorderStatus operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DescribeConfigurationRecorderStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorderStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationRecorderStatus(request);
    }

    @SdkInternalApi
    final DescribeConfigurationRecorderStatusResult executeDescribeConfigurationRecorderStatus(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationRecorderStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRecorderStatusRequest> request = null;
        Response<DescribeConfigurationRecorderStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRecorderStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigurationRecorderStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationRecorderStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationRecorderStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationRecorderStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() {
        return describeConfigurationRecorderStatus(new DescribeConfigurationRecorderStatusRequest());
    }

    /**
     * <p>
     * Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
     * this action returns the details for all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @return Result of the DescribeConfigurationRecorders operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DescribeConfigurationRecorders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(DescribeConfigurationRecordersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationRecorders(request);
    }

    @SdkInternalApi
    final DescribeConfigurationRecordersResult executeDescribeConfigurationRecorders(DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationRecordersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRecordersRequest> request = null;
        Response<DescribeConfigurationRecordersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRecordersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigurationRecordersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationRecorders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationRecordersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationRecordersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() {
        return describeConfigurationRecorders(new DescribeConfigurationRecordersRequest());
    }

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
     * returns the current status of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @return Result of the DescribeDeliveryChannelStatus operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @sample AmazonConfig.DescribeDeliveryChannelStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannelStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeliveryChannelStatus(request);
    }

    @SdkInternalApi
    final DescribeDeliveryChannelStatusResult executeDescribeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeliveryChannelStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryChannelStatusRequest> request = null;
        Response<DescribeDeliveryChannelStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryChannelStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDeliveryChannelStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeliveryChannelStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeliveryChannelStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDeliveryChannelStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() {
        return describeDeliveryChannelStatus(new DescribeDeliveryChannelStatusRequest());
    }

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
     * the details of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @return Result of the DescribeDeliveryChannels operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @sample AmazonConfig.DescribeDeliveryChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels(DescribeDeliveryChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeliveryChannels(request);
    }

    @SdkInternalApi
    final DescribeDeliveryChannelsResult executeDescribeDeliveryChannels(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeliveryChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryChannelsRequest> request = null;
        Response<DescribeDeliveryChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryChannelsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDeliveryChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeliveryChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeliveryChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDeliveryChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels() {
        return describeDeliveryChannels(new DescribeDeliveryChannelsRequest());
    }

    /**
     * <p>
     * Returns a list of all pending aggregation requests.
     * </p>
     * 
     * @param describePendingAggregationRequestsRequest
     * @return Result of the DescribePendingAggregationRequests operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribePendingAggregationRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribePendingAggregationRequests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePendingAggregationRequestsResult describePendingAggregationRequests(DescribePendingAggregationRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePendingAggregationRequests(request);
    }

    @SdkInternalApi
    final DescribePendingAggregationRequestsResult executeDescribePendingAggregationRequests(
            DescribePendingAggregationRequestsRequest describePendingAggregationRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePendingAggregationRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePendingAggregationRequestsRequest> request = null;
        Response<DescribePendingAggregationRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePendingAggregationRequestsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePendingAggregationRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePendingAggregationRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePendingAggregationRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePendingAggregationRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of one or more remediation configurations.
     * </p>
     * 
     * @param describeRemediationConfigurationsRequest
     * @return Result of the DescribeRemediationConfigurations operation returned by the service.
     * @sample AmazonConfig.DescribeRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRemediationConfigurationsResult describeRemediationConfigurations(DescribeRemediationConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRemediationConfigurations(request);
    }

    @SdkInternalApi
    final DescribeRemediationConfigurationsResult executeDescribeRemediationConfigurations(
            DescribeRemediationConfigurationsRequest describeRemediationConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRemediationConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRemediationConfigurationsRequest> request = null;
        Response<DescribeRemediationConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRemediationConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRemediationConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRemediationConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRemediationConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRemediationConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
     * steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
     * the limit and the next token, you receive a paginated response.
     * </p>
     * 
     * @param describeRemediationExecutionStatusRequest
     * @return Result of the DescribeRemediationExecutionStatus operation returned by the service.
     * @throws NoSuchRemediationConfigurationException
     *         You specified an AWS Config rule without a remediation configuration.
     * @sample AmazonConfig.DescribeRemediationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRemediationExecutionStatusResult describeRemediationExecutionStatus(DescribeRemediationExecutionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRemediationExecutionStatus(request);
    }

    @SdkInternalApi
    final DescribeRemediationExecutionStatusResult executeDescribeRemediationExecutionStatus(
            DescribeRemediationExecutionStatusRequest describeRemediationExecutionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRemediationExecutionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRemediationExecutionStatusRequest> request = null;
        Response<DescribeRemediationExecutionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRemediationExecutionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRemediationExecutionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRemediationExecutionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRemediationExecutionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRemediationExecutionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of one or more retention configurations. If the retention configuration name is not
     * specified, this action returns the details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param describeRetentionConfigurationsRequest
     * @return Result of the DescribeRetentionConfigurations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchRetentionConfigurationException
     *         You have specified a retention configuration that does not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeRetentionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRetentionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRetentionConfigurationsResult describeRetentionConfigurations(DescribeRetentionConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRetentionConfigurations(request);
    }

    @SdkInternalApi
    final DescribeRetentionConfigurationsResult executeDescribeRetentionConfigurations(
            DescribeRetentionConfigurationsRequest describeRetentionConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRetentionConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRetentionConfigurationsRequest> request = null;
        Response<DescribeRetentionConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRetentionConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRetentionConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRetentionConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRetentionConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRetentionConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results
     * indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each
     * resource complies with the rule.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page. But if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateComplianceDetailsByConfigRuleRequest
     * @return Result of the GetAggregateComplianceDetailsByConfigRule operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAggregateComplianceDetailsByConfigRuleResult getAggregateComplianceDetailsByConfigRule(GetAggregateComplianceDetailsByConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetAggregateComplianceDetailsByConfigRule(request);
    }

    @SdkInternalApi
    final GetAggregateComplianceDetailsByConfigRuleResult executeGetAggregateComplianceDetailsByConfigRule(
            GetAggregateComplianceDetailsByConfigRuleRequest getAggregateComplianceDetailsByConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getAggregateComplianceDetailsByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAggregateComplianceDetailsByConfigRuleRequest> request = null;
        Response<GetAggregateComplianceDetailsByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAggregateComplianceDetailsByConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAggregateComplianceDetailsByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAggregateComplianceDetailsByConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAggregateComplianceDetailsByConfigRuleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAggregateComplianceDetailsByConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConfigRuleComplianceSummaryRequest
     * @return Result of the GetAggregateConfigRuleComplianceSummary operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateConfigRuleComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConfigRuleComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAggregateConfigRuleComplianceSummaryResult getAggregateConfigRuleComplianceSummary(GetAggregateConfigRuleComplianceSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetAggregateConfigRuleComplianceSummary(request);
    }

    @SdkInternalApi
    final GetAggregateConfigRuleComplianceSummaryResult executeGetAggregateConfigRuleComplianceSummary(
            GetAggregateConfigRuleComplianceSummaryRequest getAggregateConfigRuleComplianceSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getAggregateConfigRuleComplianceSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAggregateConfigRuleComplianceSummaryRequest> request = null;
        Response<GetAggregateConfigRuleComplianceSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAggregateConfigRuleComplianceSummaryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAggregateConfigRuleComplianceSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAggregateConfigRuleComplianceSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAggregateConfigRuleComplianceSummaryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAggregateConfigRuleComplianceSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can
     * request the resource counts by providing filters and GroupByKey.
     * </p>
     * <p>
     * For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
     * count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
     * GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
     * </p>
     * 
     * @param getAggregateDiscoveredResourceCountsRequest
     * @return Result of the GetAggregateDiscoveredResourceCounts operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAggregateDiscoveredResourceCountsResult getAggregateDiscoveredResourceCounts(GetAggregateDiscoveredResourceCountsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAggregateDiscoveredResourceCounts(request);
    }

    @SdkInternalApi
    final GetAggregateDiscoveredResourceCountsResult executeGetAggregateDiscoveredResourceCounts(
            GetAggregateDiscoveredResourceCountsRequest getAggregateDiscoveredResourceCountsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAggregateDiscoveredResourceCountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAggregateDiscoveredResourceCountsRequest> request = null;
        Response<GetAggregateDiscoveredResourceCountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAggregateDiscoveredResourceCountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAggregateDiscoveredResourceCountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAggregateDiscoveredResourceCounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAggregateDiscoveredResourceCountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAggregateDiscoveredResourceCountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
     * </p>
     * 
     * @param getAggregateResourceConfigRequest
     * @return Result of the GetAggregateResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws OversizedConfigurationItemException
     *         The configuration item size is outside the allowable range.
     * @throws ResourceNotDiscoveredException
     *         You have specified a resource that is either unknown or has not been discovered.
     * @sample AmazonConfig.GetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAggregateResourceConfigResult getAggregateResourceConfig(GetAggregateResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetAggregateResourceConfig(request);
    }

    @SdkInternalApi
    final GetAggregateResourceConfigResult executeGetAggregateResourceConfig(GetAggregateResourceConfigRequest getAggregateResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getAggregateResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAggregateResourceConfigRequest> request = null;
        Response<GetAggregateResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAggregateResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAggregateResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAggregateResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAggregateResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAggregateResourceConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
     * evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @return Result of the GetComplianceDetailsByConfigRule operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @sample AmazonConfig.GetComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetComplianceDetailsByConfigRule(request);
    }

    @SdkInternalApi
    final GetComplianceDetailsByConfigRuleResult executeGetComplianceDetailsByConfigRule(
            GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getComplianceDetailsByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceDetailsByConfigRuleRequest> request = null;
        Response<GetComplianceDetailsByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceDetailsByConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getComplianceDetailsByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComplianceDetailsByConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComplianceDetailsByConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetComplianceDetailsByConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
     * used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @return Result of the GetComplianceDetailsByResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.GetComplianceDetailsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetComplianceDetailsByResourceResult getComplianceDetailsByResource(GetComplianceDetailsByResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetComplianceDetailsByResource(request);
    }

    @SdkInternalApi
    final GetComplianceDetailsByResourceResult executeGetComplianceDetailsByResource(GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getComplianceDetailsByResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceDetailsByResourceRequest> request = null;
        Response<GetComplianceDetailsByResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceDetailsByResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getComplianceDetailsByResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComplianceDetailsByResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComplianceDetailsByResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetComplianceDetailsByResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @return Result of the GetComplianceSummaryByConfigRule operation returned by the service.
     * @sample AmazonConfig.GetComplianceSummaryByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetComplianceSummaryByConfigRule(request);
    }

    @SdkInternalApi
    final GetComplianceSummaryByConfigRuleResult executeGetComplianceSummaryByConfigRule(
            GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getComplianceSummaryByConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceSummaryByConfigRuleRequest> request = null;
        Response<GetComplianceSummaryByConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceSummaryByConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getComplianceSummaryByConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComplianceSummaryByConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComplianceSummaryByConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetComplianceSummaryByConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule() {
        return getComplianceSummaryByConfigRule(new GetComplianceSummaryByConfigRuleRequest());
    }

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
     * more resource types to get these numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @return Result of the GetComplianceSummaryByResourceType operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.GetComplianceSummaryByResourceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByResourceType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetComplianceSummaryByResourceType(request);
    }

    @SdkInternalApi
    final GetComplianceSummaryByResourceTypeResult executeGetComplianceSummaryByResourceType(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getComplianceSummaryByResourceTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceSummaryByResourceTypeRequest> request = null;
        Response<GetComplianceSummaryByResourceTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceSummaryByResourceTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getComplianceSummaryByResourceTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComplianceSummaryByResourceType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComplianceSummaryByResourceTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetComplianceSummaryByResourceTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType() {
        return getComplianceSummaryByResourceType(new GetComplianceSummaryByResourceTypeRequest());
    }

    /**
     * <p>
     * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config
     * is recording in this region for your AWS account.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
     * IAM users, and 15 S3 buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify that you want all resource
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource types (EC2 instances, IAM users, and S3 buckets).
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of each resource type (25, 20, and 15).
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of all resources (60).
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * The response is paginated. By default, AWS Config lists 100 <a>ResourceCount</a> objects on each page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * If you make a call to the <a>GetDiscoveredResourceCounts</a> action, you might not immediately receive resource
     * counts in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are a new AWS Config customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * You just enabled resource recording.
     * </p>
     * </li>
     * </ul>
     * <p>
     * It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry
     * the <a>GetDiscoveredResourceCounts</a> action.
     * </p>
     * </note>
     * 
     * @param getDiscoveredResourceCountsRequest
     * @return Result of the GetDiscoveredResourceCounts operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.GetDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDiscoveredResourceCountsResult getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDiscoveredResourceCounts(request);
    }

    @SdkInternalApi
    final GetDiscoveredResourceCountsResult executeGetDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest getDiscoveredResourceCountsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDiscoveredResourceCountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiscoveredResourceCountsRequest> request = null;
        Response<GetDiscoveredResourceCountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiscoveredResourceCountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDiscoveredResourceCountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDiscoveredResourceCounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDiscoveredResourceCountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDiscoveredResourceCountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The list contains details about each state of
     * the resource during the specified time interval. If you specified a retention period to retain your
     * <code>ConfigurationItems</code> between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config
     * returns the <code>ConfigurationItems</code> for the specified retention period.
     * </p>
     * <p>
     * The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is likely that the number of records
     * returned is smaller than the specified <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @return Result of the GetResourceConfigHistory operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidTimeRangeException
     *         The specified time range is not valid. The earlier time is not chronologically before the later time.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @throws ResourceNotDiscoveredException
     *         You have specified a resource that is either unknown or has not been discovered.
     * @sample AmazonConfig.GetResourceConfigHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetResourceConfigHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceConfigHistoryResult getResourceConfigHistory(GetResourceConfigHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceConfigHistory(request);
    }

    @SdkInternalApi
    final GetResourceConfigHistoryResult executeGetResourceConfigHistory(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceConfigHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceConfigHistoryRequest> request = null;
        Response<GetResourceConfigHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceConfigHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResourceConfigHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceConfigHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceConfigHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResourceConfigHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
     * type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
     * resource name, source account, and source region. You can narrow the results to include only resources that have
     * specific resource IDs, or a resource name, or source account ID, or source region.
     * </p>
     * <p>
     * For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
     * <code>AWS::EC2::Instance</code> then the API returns all the EC2 instance identifiers of accountID 12345678910
     * and region us-east-1.
     * </p>
     * 
     * @param listAggregateDiscoveredResourcesRequest
     * @return Result of the ListAggregateDiscoveredResources operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.ListAggregateDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListAggregateDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAggregateDiscoveredResourcesResult listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListAggregateDiscoveredResources(request);
    }

    @SdkInternalApi
    final ListAggregateDiscoveredResourcesResult executeListAggregateDiscoveredResources(
            ListAggregateDiscoveredResourcesRequest listAggregateDiscoveredResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAggregateDiscoveredResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAggregateDiscoveredResourcesRequest> request = null;
        Response<ListAggregateDiscoveredResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAggregateDiscoveredResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAggregateDiscoveredResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAggregateDiscoveredResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAggregateDiscoveredResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAggregateDiscoveredResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
     * identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
     * resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
     * narrow the results to include only resources that have specific resource IDs or a resource name.
     * </p>
     * <note>
     * <p>
     * You can specify either resource IDs or a resource name, but not both, in the same request.
     * </p>
     * </note>
     * <p>
     * The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize
     * this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code> string. To get
     * the next page of results, run the request again and specify the string for the <code>nextToken</code> parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return Result of the ListDiscoveredResources operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @sample AmazonConfig.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDiscoveredResources(request);
    }

    @SdkInternalApi
    final ListDiscoveredResourcesResult executeListDiscoveredResources(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDiscoveredResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDiscoveredResourcesRequest> request = null;
        Response<ListDiscoveredResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDiscoveredResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDiscoveredResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDiscoveredResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDiscoveredResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDiscoveredResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tags for AWS Config resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Authorizes the aggregator account and region to collect data from the source account and region.
     * </p>
     * 
     * @param putAggregationAuthorizationRequest
     * @return Result of the PutAggregationAuthorization operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.PutAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAggregationAuthorizationResult putAggregationAuthorization(PutAggregationAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executePutAggregationAuthorization(request);
    }

    @SdkInternalApi
    final PutAggregationAuthorizationResult executePutAggregationAuthorization(PutAggregationAuthorizationRequest putAggregationAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(putAggregationAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAggregationAuthorizationRequest> request = null;
        Response<PutAggregationAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAggregationAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAggregationAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAggregationAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAggregationAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAggregationAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired
     * configurations.
     * </p>
     * <p>
     * You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a
     * rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config
     * provides.
     * </p>
     * <p>
     * If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule
     * invokes to evaluate your resources. When you use the <code>PutConfigRule</code> action to add the rule to AWS
     * Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN
     * for the <code>SourceIdentifier</code> key. This key is part of the <code>Source</code> object, which is part of
     * the <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding an AWS managed Config rule, specify the rule's identifier for the <code>SourceIdentifier</code>
     * key. To reference AWS managed Config rule identifiers, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">About AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values are generated by AWS
     * Config for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you added previously, you can specify the rule by <code>ConfigRuleName</code>,
     * <code>ConfigRuleId</code>, or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that you use in
     * this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 150.
     * </p>
     * <p>
     * For information about requesting a rule limit increase, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_config">AWS Config Limits</a>
     * in the <i>AWS General Reference Guide</i>.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating AWS Resource
     * Configurations with AWS Config</a> in the <i>AWS Config Developer Guide</i>.
     * </p>
     * 
     * @param putConfigRuleRequest
     * @return Result of the PutConfigRule operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws MaxNumberOfConfigRulesExceededException
     *         Failed to add the AWS Config rule because the account already contains the maximum number of 50 rules.
     *         Consider deleting any deactivated rules before you add new rules.
     * @throws ResourceInUseException
     *         The rule is currently being deleted or the rule is deleting your evaluation results. Try your request
     *         again later.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the
     *         config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions.
     *         </p>
     *         </li>
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @sample AmazonConfig.PutConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutConfigRuleResult putConfigRule(PutConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigRule(request);
    }

    @SdkInternalApi
    final PutConfigRuleResult executePutConfigRule(PutConfigRuleRequest putConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigRuleRequest> request = null;
        Response<PutConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and updates the configuration aggregator with the selected source accounts and regions. The source
     * account can be individual account(s) or an organization.
     * </p>
     * <note>
     * <p>
     * AWS Config should be enabled in source accounts and regions you want to aggregate.
     * </p>
     * <p>
     * If your source type is an organization, you must be signed in to the master account and all features must be
     * enabled in your organization. AWS Config calls <code>EnableAwsServiceAccess</code> API to enable integration
     * between AWS Config and AWS Organizations.
     * </p>
     * </note>
     * 
     * @param putConfigurationAggregatorRequest
     * @return Result of the PutConfigurationAggregator operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws LimitExceededException
     *         For <code>StartConfigRulesEvaluation</code> API, this exception is thrown if an evaluation is in progress
     *         or if you call the <a>StartConfigRulesEvaluation</a> API more than once per minute.</p>
     *         <p>
     *         For <code>PutConfigurationAggregator</code> API, this exception is thrown if the number of accounts and
     *         aggregators exceeds the limit.
     * @throws InvalidRoleException
     *         You have provided a null or empty role ARN.
     * @throws OrganizationAccessDeniedException
     *         No permission to call the EnableAWSServiceAccess API.
     * @throws NoAvailableOrganizationException
     *         Organization does is no longer available.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         The configuration aggregator cannot be created because organization does not have all features enabled.
     * @sample AmazonConfig.PutConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationAggregatorResult putConfigurationAggregator(PutConfigurationAggregatorRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationAggregator(request);
    }

    @SdkInternalApi
    final PutConfigurationAggregatorResult executePutConfigurationAggregator(PutConfigurationAggregatorRequest putConfigurationAggregatorRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationAggregatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationAggregatorRequest> request = null;
        Response<PutConfigurationAggregatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationAggregatorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationAggregatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationAggregator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationAggregatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationAggregatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> or the <code>recordingGroup</code> of an existing
     * recorder. To change the role, call the action on the existing configuration recorder and specify a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the <b>recordingGroup</b> parameter specified, the default is
     * to record all supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @return Result of the PutConfigurationRecorder operation returned by the service.
     * @throws MaxNumberOfConfigurationRecordersExceededException
     *         You have reached the limit of the number of recorders you can create.
     * @throws InvalidConfigurationRecorderNameException
     *         You have provided a configuration recorder name that is not valid.
     * @throws InvalidRoleException
     *         You have provided a null or empty role ARN.
     * @throws InvalidRecordingGroupException
     *         AWS Config throws an exception if the recording group does not contain a valid list of resource types.
     *         Invalid values might also be incorrectly formatted.
     * @sample AmazonConfig.PutConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfigurationRecorderResult putConfigurationRecorder(PutConfigurationRecorderRequest request) {
        request = beforeClientExecution(request);
        return executePutConfigurationRecorder(request);
    }

    @SdkInternalApi
    final PutConfigurationRecorderResult executePutConfigurationRecorder(PutConfigurationRecorderRequest putConfigurationRecorderRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfigurationRecorderRequest> request = null;
        Response<PutConfigurationRecorderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfigurationRecorderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfigurationRecorder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfigurationRecorderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfigurationRecorderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
     * topic.
     * </p>
     * <p>
     * Before you can create a delivery channel, you must create a configuration recorder.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
     * To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
     * bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * You can have only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @return Result of the PutDeliveryChannel operation returned by the service.
     * @throws MaxNumberOfDeliveryChannelsExceededException
     *         You have reached the limit of the number of delivery channels you can create.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @throws InvalidDeliveryChannelNameException
     *         The specified delivery channel name is not valid.
     * @throws NoSuchBucketException
     *         The specified Amazon S3 bucket does not exist.
     * @throws InvalidS3KeyPrefixException
     *         The specified Amazon S3 key prefix is not valid.
     * @throws InvalidSNSTopicARNException
     *         The specified Amazon SNS topic does not exist.
     * @throws InsufficientDeliveryPolicyException
     *         Your Amazon S3 bucket policy does not permit AWS Config to write to it.
     * @sample AmazonConfig.PutDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutDeliveryChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDeliveryChannelResult putDeliveryChannel(PutDeliveryChannelRequest request) {
        request = beforeClientExecution(request);
        return executePutDeliveryChannel(request);
    }

    @SdkInternalApi
    final PutDeliveryChannelResult executePutDeliveryChannel(PutDeliveryChannelRequest putDeliveryChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(putDeliveryChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliveryChannelRequest> request = null;
        Response<PutDeliveryChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliveryChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDeliveryChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDeliveryChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDeliveryChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDeliveryChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
     * Lambda function that is invoked by an AWS Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @return Result of the PutEvaluations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidResultTokenException
     *         The specified <code>ResultToken</code> is invalid.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @sample AmazonConfig.PutEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutEvaluations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutEvaluationsResult putEvaluations(PutEvaluationsRequest request) {
        request = beforeClientExecution(request);
        return executePutEvaluations(request);
    }

    @SdkInternalApi
    final PutEvaluationsResult executePutEvaluations(PutEvaluationsRequest putEvaluationsRequest) {

        ExecutionContext executionContext = createExecutionContext(putEvaluationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEvaluationsRequest> request = null;
        Response<PutEvaluationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEvaluationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEvaluationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEvaluations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEvaluationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEvaluationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action.
     * The API creates the <code>RemediationConfiguration</code> object for the AWS Config rule. The AWS Config rule
     * must already exist for you to add a remediation configuration. The target (SSM document) must exist and have
     * permissions to use the target.
     * </p>
     * 
     * @param putRemediationConfigurationsRequest
     * @return Result of the PutRemediationConfigurations operation returned by the service.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the
     *         config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions.
     *         </p>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.PutRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRemediationConfigurationsResult putRemediationConfigurations(PutRemediationConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executePutRemediationConfigurations(request);
    }

    @SdkInternalApi
    final PutRemediationConfigurationsResult executePutRemediationConfigurations(PutRemediationConfigurationsRequest putRemediationConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(putRemediationConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRemediationConfigurationsRequest> request = null;
        Response<PutRemediationConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRemediationConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putRemediationConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRemediationConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRemediationConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRemediationConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and updates the retention configuration with details about retention period (number of days) that AWS
     * Config stores your historical information. The API creates the <code>RetentionConfiguration</code> object and
     * names the object as <b>default</b>. When you have a <code>RetentionConfiguration</code> object named
     * <b>default</b>, calling the API modifies the default object.
     * </p>
     * <note>
     * <p>
     * Currently, AWS Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param putRetentionConfigurationRequest
     * @return Result of the PutRetentionConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws MaxNumberOfRetentionConfigurationsExceededException
     *         Failed to add the retention configuration because a retention configuration with that name already
     *         exists.
     * @sample AmazonConfig.PutRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRetentionConfigurationResult putRetentionConfiguration(PutRetentionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutRetentionConfiguration(request);
    }

    @SdkInternalApi
    final PutRetentionConfigurationResult executePutRetentionConfiguration(PutRetentionConfigurationRequest putRetentionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putRetentionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionConfigurationRequest> request = null;
        Response<PutRetentionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putRetentionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRetentionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRetentionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRetentionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts a structured query language (SQL) <code>SELECT</code> command, performs the corresponding search, and
     * returns resource configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the AWS Config Developer Guide.
     * </p>
     * 
     * @param selectResourceConfigRequest
     * @return Result of the SelectResourceConfig operation returned by the service.
     * @throws InvalidExpressionException
     *         The syntax of the query is incorrect.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.SelectResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SelectResourceConfigResult selectResourceConfig(SelectResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeSelectResourceConfig(request);
    }

    @SdkInternalApi
    final SelectResourceConfigResult executeSelectResourceConfig(SelectResourceConfigRequest selectResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(selectResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SelectResourceConfigRequest> request = null;
        Response<SelectResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SelectResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(selectResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SelectResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SelectResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SelectResourceConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the
     * resources. Use <code>StartConfigRulesEvaluation</code> when you want to test that a rule you updated is working
     * as expected. <code>StartConfigRulesEvaluation</code> does not re-record the latest configuration state for your
     * resources. It re-runs an evaluation against the last known state of your resources.
     * </p>
     * <p>
     * You can specify up to 25 AWS Config rules per request.
     * </p>
     * <p>
     * An existing <code>StartConfigRulesEvaluation</code> call for the specified rules must complete before you can
     * call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a
     * <code>ConfigRuleEvaluationStarted</code> notification when the evaluation starts.
     * </p>
     * <note>
     * <p>
     * You don't need to call the <code>StartConfigRulesEvaluation</code> API to run an evaluation for a new rule. When
     * you create a rule, AWS Config evaluates your resources against the rule automatically.
     * </p>
     * </note>
     * <p>
     * The <code>StartConfigRulesEvaluation</code> API is useful if you want to run on-demand evaluations, such as the
     * following example:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You have a custom rule that evaluates your IAM resources every 24 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You update your Lambda function to add additional conditions to your rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Instead of waiting for the next periodic evaluation, you call the <code>StartConfigRulesEvaluation</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Config invokes your Lambda function and evaluates your IAM resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule will still run periodic evaluations every 24 hours.
     * </p>
     * </li>
     * </ol>
     * 
     * @param startConfigRulesEvaluationRequest
     * @return Result of the StartConfigRulesEvaluation operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try
     *         again.
     * @throws LimitExceededException
     *         For <code>StartConfigRulesEvaluation</code> API, this exception is thrown if an evaluation is in progress
     *         or if you call the <a>StartConfigRulesEvaluation</a> API more than once per minute.</p>
     *         <p>
     *         For <code>PutConfigurationAggregator</code> API, this exception is thrown if the number of accounts and
     *         aggregators exceeds the limit.
     * @throws ResourceInUseException
     *         The rule is currently being deleted or the rule is deleting your evaluation results. Try your request
     *         again later.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.StartConfigRulesEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigRulesEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartConfigRulesEvaluationResult startConfigRulesEvaluation(StartConfigRulesEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeStartConfigRulesEvaluation(request);
    }

    @SdkInternalApi
    final StartConfigRulesEvaluationResult executeStartConfigRulesEvaluation(StartConfigRulesEvaluationRequest startConfigRulesEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(startConfigRulesEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigRulesEvaluationRequest> request = null;
        Response<StartConfigRulesEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigRulesEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startConfigRulesEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartConfigRulesEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartConfigRulesEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartConfigRulesEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @return Result of the StartConfigurationRecorder operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @throws NoAvailableDeliveryChannelException
     *         There is no delivery channel available to record configurations.
     * @sample AmazonConfig.StartConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartConfigurationRecorderResult startConfigurationRecorder(StartConfigurationRecorderRequest request) {
        request = beforeClientExecution(request);
        return executeStartConfigurationRecorder(request);
    }

    @SdkInternalApi
    final StartConfigurationRecorderResult executeStartConfigurationRecorder(StartConfigurationRecorderRequest startConfigurationRecorderRequest) {

        ExecutionContext executionContext = createExecutionContext(startConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigurationRecorderRequest> request = null;
        Response<StartConfigurationRecorderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigurationRecorderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartConfigurationRecorder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartConfigurationRecorderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartConfigurationRecorderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation
     * configuration. It runs an execution against the current state of your resources. Remediation execution is
     * asynchronous.
     * </p>
     * <p>
     * You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
     * resource keys must complete before you can call the API again.
     * </p>
     * 
     * @param startRemediationExecutionRequest
     * @return Result of the StartRemediationExecution operation returned by the service.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the
     *         config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions.
     *         </p>
     *         </li>
     * @throws NoSuchRemediationConfigurationException
     *         You specified an AWS Config rule without a remediation configuration.
     * @sample AmazonConfig.StartRemediationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartRemediationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartRemediationExecutionResult startRemediationExecution(StartRemediationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartRemediationExecution(request);
    }

    @SdkInternalApi
    final StartRemediationExecutionResult executeStartRemediationExecution(StartRemediationExecutionRequest startRemediationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startRemediationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRemediationExecutionRequest> request = null;
        Response<StartRemediationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRemediationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startRemediationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRemediationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRemediationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartRemediationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        The input for the <a>StopConfigurationRecorder</a> action.
     * @return Result of the StopConfigurationRecorder operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.StopConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StopConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopConfigurationRecorderResult stopConfigurationRecorder(StopConfigurationRecorderRequest request) {
        request = beforeClientExecution(request);
        return executeStopConfigurationRecorder(request);
    }

    @SdkInternalApi
    final StopConfigurationRecorderResult executeStopConfigurationRecorder(StopConfigurationRecorderRequest stopConfigurationRecorderRequest) {

        ExecutionContext executionContext = createExecutionContext(stopConfigurationRecorderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopConfigurationRecorderRequest> request = null;
        Response<StopConfigurationRecorderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopConfigurationRecorderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopConfigurationRecorderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopConfigurationRecorder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopConfigurationRecorderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopConfigurationRecorderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @throws TooManyTagsException
     *         You have reached the limit of the number of tags you can use. You have more than 50 tags.
     * @sample AmazonConfig.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @sample AmazonConfig.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
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
