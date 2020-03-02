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
                            new JsonErrorShapeMetadata().withErrorCode("NoRunningConfigurationRecorderException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoRunningConfigurationRecorderExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationConformancePackTemplateValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.OrganizationConformancePackTemplateValidationExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotDiscoveredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.ResourceNotDiscoveredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchRemediationConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchRemediationConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableDeliveryChannelException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoAvailableDeliveryChannelExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchRemediationExceptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchRemediationExceptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchRetentionConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchRetentionConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResultTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidResultTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OversizedConfigurationItemException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.OversizedConfigurationItemExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientDeliveryPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InsufficientDeliveryPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigurationAggregatorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchConfigurationAggregatorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RemediationInProgressException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.RemediationInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationAccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.OrganizationAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableConfigurationRecorderException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoAvailableConfigurationRecorderExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAvailableOrganizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoAvailableOrganizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchDeliveryChannelException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchDeliveryChannelExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LastDeliveryChannelDeleteFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.LastDeliveryChannelDeleteFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationAllFeaturesNotEnabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.OrganizationAllFeaturesNotEnabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLimitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidLimitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchOrganizationConfigRuleException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchOrganizationConfigRuleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfDeliveryChannelsExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.MaxNumberOfDeliveryChannelsExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigurationRecorderException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchConfigurationRecorderExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfConfigRulesExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.MaxNumberOfConfigRulesExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientPermissionsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InsufficientPermissionsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidExpressionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidExpressionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchOrganizationConformancePackException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchOrganizationConformancePackExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfConformancePacksExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.MaxNumberOfConformancePacksExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfOrganizationConfigRulesExceededException")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.config.model.transform.MaxNumberOfOrganizationConfigRulesExceededExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxActiveResourcesExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.MaxActiveResourcesExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigRuleInConformancePackException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchConfigRuleInConformancePackExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfConfigurationRecordersExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.MaxNumberOfConfigurationRecordersExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConformancePackException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchConformancePackExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchBucketException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchBucketExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRecordingGroupException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidRecordingGroupExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConfigurationRecorderNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidConfigurationRecorderNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSNSTopicARNException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidSNSTopicARNExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfRetentionConfigurationsExceededException")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.config.model.transform.MaxNumberOfRetentionConfigurationsExceededExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTimeRangeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidTimeRangeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoSuchConfigRuleException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.NoSuchConfigRuleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRoleException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidRoleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeliveryChannelNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidDeliveryChannelNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConformancePackTemplateValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.ConformancePackTemplateValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxNumberOfOrganizationConformancePacksExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.MaxNumberOfOrganizationConformancePacksExceededExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3KeyPrefixException").withExceptionUnmarshaller(
                                    com.amazonaws.services.config.model.transform.InvalidS3KeyPrefixExceptionUnmarshaller.getInstance()))
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
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
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
     * Deletes the specified conformance pack and all the AWS Config rules, remediation actions, and all evaluation
     * results within that conformance pack.
     * </p>
     * <p>
     * AWS Config sets the conformance pack to <code>DELETE_IN_PROGRESS</code> until the deletion is complete. You
     * cannot update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteConformancePackRequest
     * @return Result of the DeleteConformancePack operation returned by the service.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @sample AmazonConfig.DeleteConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConformancePack" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteConformancePackResult deleteConformancePack(DeleteConformancePackRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConformancePack(request);
    }

    @SdkInternalApi
    final DeleteConformancePackResult executeDeleteConformancePack(DeleteConformancePackRequest deleteConformancePackRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConformancePackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConformancePackRequest> request = null;
        Response<DeleteConformancePackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConformancePackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConformancePackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConformancePack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConformancePackResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteConformancePackResultJsonUnmarshaller());
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
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
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
     * Deletes the specified organization config rule and all of its evaluation results from all member accounts in that
     * organization. Only a master account can delete an organization config rule.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a
     * rule while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConfigRuleRequest
     * @return Result of the DeleteOrganizationConfigRule operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         You specified one or more organization config rules that do not exist.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.DeleteOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOrganizationConfigRuleResult deleteOrganizationConfigRule(DeleteOrganizationConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOrganizationConfigRule(request);
    }

    @SdkInternalApi
    final DeleteOrganizationConfigRuleResult executeDeleteOrganizationConfigRule(DeleteOrganizationConfigRuleRequest deleteOrganizationConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOrganizationConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationConfigRuleRequest> request = null;
        Response<DeleteOrganizationConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOrganizationConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOrganizationConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOrganizationConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteOrganizationConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified organization conformance pack and all of the config rules and remediation actions from all
     * member accounts in that organization. Only a master account can delete an organization conformance pack.
     * </p>
     * <p>
     * AWS Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot
     * update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConformancePackRequest
     * @return Result of the DeleteOrganizationConformancePack operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         AWS Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws ResourceInUseException
     *         You see this exception in the following cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.DeleteOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOrganizationConformancePackResult deleteOrganizationConformancePack(DeleteOrganizationConformancePackRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOrganizationConformancePack(request);
    }

    @SdkInternalApi
    final DeleteOrganizationConformancePackResult executeDeleteOrganizationConformancePack(
            DeleteOrganizationConformancePackRequest deleteOrganizationConformancePackRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOrganizationConformancePackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationConformancePackRequest> request = null;
        Response<DeleteOrganizationConformancePackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationConformancePackRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOrganizationConformancePackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOrganizationConformancePack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOrganizationConformancePackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteOrganizationConformancePackResultJsonUnmarshaller());
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
     * @throws RemediationInProgressException
     *         Remediation action is in progress. You can either cancel execution in AWS Systems Manager or wait and try
     *         again later.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
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
     * Deletes one or more remediation exceptions mentioned in the resource keys.
     * </p>
     * 
     * @param deleteRemediationExceptionsRequest
     * @return Result of the DeleteRemediationExceptions operation returned by the service.
     * @throws NoSuchRemediationExceptionException
     *         You tried to delete a remediation exception that does not exist.
     * @sample AmazonConfig.DeleteRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRemediationExceptionsResult deleteRemediationExceptions(DeleteRemediationExceptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRemediationExceptions(request);
    }

    @SdkInternalApi
    final DeleteRemediationExceptionsResult executeDeleteRemediationExceptions(DeleteRemediationExceptionsRequest deleteRemediationExceptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRemediationExceptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRemediationExceptionsRequest> request = null;
        Response<DeleteRemediationExceptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRemediationExceptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRemediationExceptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRemediationExceptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRemediationExceptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRemediationExceptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Records the configuration state for a custom resource that has been deleted. This API records a new
     * ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this
     * resource in your AWS Config History.
     * </p>
     * 
     * @param deleteResourceConfigRequest
     * @return Result of the DeleteResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @sample AmazonConfig.DeleteResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteResourceConfigResult deleteResourceConfig(DeleteResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourceConfig(request);
    }

    @SdkInternalApi
    final DeleteResourceConfigResult executeDeleteResourceConfig(DeleteResourceConfigRequest deleteResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceConfigRequest> request = null;
        Response<DeleteResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceConfigResultJsonUnmarshaller());
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
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
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
     * Returns compliance details for each rule in that conformance pack.
     * </p>
     * <note>
     * <p>
     * You must provide exact rule names.
     * </p>
     * </note>
     * 
     * @param describeConformancePackComplianceRequest
     * @return Result of the DescribeConformancePackCompliance operation returned by the service.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigRuleInConformancePackException
     *         AWS Config rule that you passed in the filter does not exist.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @sample AmazonConfig.DescribeConformancePackCompliance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackCompliance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConformancePackComplianceResult describeConformancePackCompliance(DescribeConformancePackComplianceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConformancePackCompliance(request);
    }

    @SdkInternalApi
    final DescribeConformancePackComplianceResult executeDescribeConformancePackCompliance(
            DescribeConformancePackComplianceRequest describeConformancePackComplianceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConformancePackComplianceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConformancePackComplianceRequest> request = null;
        Response<DescribeConformancePackComplianceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConformancePackComplianceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConformancePackComplianceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConformancePackCompliance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConformancePackComplianceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConformancePackComplianceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides one or more conformance packs deployment status.
     * </p>
     * <note>
     * <p>
     * If there are no conformance packs then you will see an empty result.
     * </p>
     * </note>
     * 
     * @param describeConformancePackStatusRequest
     * @return Result of the DescribeConformancePackStatus operation returned by the service.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeConformancePackStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConformancePackStatusResult describeConformancePackStatus(DescribeConformancePackStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConformancePackStatus(request);
    }

    @SdkInternalApi
    final DescribeConformancePackStatusResult executeDescribeConformancePackStatus(DescribeConformancePackStatusRequest describeConformancePackStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConformancePackStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConformancePackStatusRequest> request = null;
        Response<DescribeConformancePackStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConformancePackStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConformancePackStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConformancePackStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConformancePackStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConformancePackStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of one or more conformance packs.
     * </p>
     * 
     * @param describeConformancePacksRequest
     * @return Result of the DescribeConformancePacks operation returned by the service.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConformancePacksResult describeConformancePacks(DescribeConformancePacksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConformancePacks(request);
    }

    @SdkInternalApi
    final DescribeConformancePacksResult executeDescribeConformancePacks(DescribeConformancePacksRequest describeConformancePacksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConformancePacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConformancePacksRequest> request = null;
        Response<DescribeConformancePacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConformancePacksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConformancePacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConformancePacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConformancePacksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConformancePacksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * Provides organization config rule deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization config rule is successfully deployed in all the member
     * accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization config rule names. It is only applicable, when you request all the
     * organization config rules.
     * </p>
     * <p>
     * Only a master account can call this API.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRuleStatusesRequest
     * @return Result of the DescribeOrganizationConfigRuleStatuses operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         You specified one or more organization config rules that do not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.DescribeOrganizationConfigRuleStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRuleStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConfigRuleStatusesResult describeOrganizationConfigRuleStatuses(DescribeOrganizationConfigRuleStatusesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConfigRuleStatuses(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConfigRuleStatusesResult executeDescribeOrganizationConfigRuleStatuses(
            DescribeOrganizationConfigRuleStatusesRequest describeOrganizationConfigRuleStatusesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConfigRuleStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConfigRuleStatusesRequest> request = null;
        Response<DescribeOrganizationConfigRuleStatusesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConfigRuleStatusesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConfigRuleStatusesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConfigRuleStatuses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConfigRuleStatusesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeOrganizationConfigRuleStatusesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of organization config rules.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization config rule names. It is only applicable, when you request all the
     * organization config rules.
     * </p>
     * <p>
     * Only a master account can call this API.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRulesRequest
     * @return Result of the DescribeOrganizationConfigRules operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         You specified one or more organization config rules that do not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.DescribeOrganizationConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConfigRulesResult describeOrganizationConfigRules(DescribeOrganizationConfigRulesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConfigRules(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConfigRulesResult executeDescribeOrganizationConfigRules(
            DescribeOrganizationConfigRulesRequest describeOrganizationConfigRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConfigRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConfigRulesRequest> request = null;
        Response<DescribeOrganizationConfigRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConfigRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConfigRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConfigRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConfigRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrganizationConfigRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides organization conformance pack deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization conformance pack is successfully deployed in all the
     * member accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization conformance pack names. They are only applicable, when you request all the
     * organization conformance packs.
     * </p>
     * <p>
     * Only a master account can call this API.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePackStatusesRequest
     * @return Result of the DescribeOrganizationConformancePackStatuses operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         AWS Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.
     *         </p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.DescribeOrganizationConformancePackStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePackStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConformancePackStatusesResult describeOrganizationConformancePackStatuses(
            DescribeOrganizationConformancePackStatusesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConformancePackStatuses(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConformancePackStatusesResult executeDescribeOrganizationConformancePackStatuses(
            DescribeOrganizationConformancePackStatusesRequest describeOrganizationConformancePackStatusesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConformancePackStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConformancePackStatusesRequest> request = null;
        Response<DescribeOrganizationConformancePackStatusesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConformancePackStatusesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConformancePackStatusesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConformancePackStatuses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConformancePackStatusesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeOrganizationConformancePackStatusesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of organization conformance packs.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you specify organization conformance packs names. They are only
     * applicable, when you request all the organization conformance packs.
     * </p>
     * <p>
     * Only a master account can call this API.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePacksRequest
     * @return Result of the DescribeOrganizationConformancePacks operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         AWS Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.
     *         </p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.DescribeOrganizationConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConformancePacksResult describeOrganizationConformancePacks(DescribeOrganizationConformancePacksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConformancePacks(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConformancePacksResult executeDescribeOrganizationConformancePacks(
            DescribeOrganizationConformancePacksRequest describeOrganizationConformancePacksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConformancePacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConformancePacksRequest> request = null;
        Response<DescribeOrganizationConformancePacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConformancePacksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConformancePacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConformancePacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConformancePacksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrganizationConformancePacksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set
     * of resources that includes an explanation of an exception and the time when the exception will be deleted. When
     * you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you request resources in batch. It is only applicable, when you
     * request all resources.
     * </p>
     * </note>
     * 
     * @param describeRemediationExceptionsRequest
     * @return Result of the DescribeRemediationExceptions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DescribeRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRemediationExceptionsResult describeRemediationExceptions(DescribeRemediationExceptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRemediationExceptions(request);
    }

    @SdkInternalApi
    final DescribeRemediationExceptionsResult executeDescribeRemediationExceptions(DescribeRemediationExceptionsRequest describeRemediationExceptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRemediationExceptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRemediationExceptionsRequest> request = null;
        Response<DescribeRemediationExceptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRemediationExceptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRemediationExceptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRemediationExceptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRemediationExceptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRemediationExceptionsResultJsonUnmarshaller());
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
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
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
     * The results can return an empty result page. But if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
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
     * Returns compliance details of a conformance pack for all AWS resources that are monitered by conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceDetailsRequest
     * @return Result of the GetConformancePackComplianceDetails operation returned by the service.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws NoSuchConfigRuleInConformancePackException
     *         AWS Config rule that you passed in the filter does not exist.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.GetConformancePackComplianceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConformancePackComplianceDetailsResult getConformancePackComplianceDetails(GetConformancePackComplianceDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConformancePackComplianceDetails(request);
    }

    @SdkInternalApi
    final GetConformancePackComplianceDetailsResult executeGetConformancePackComplianceDetails(
            GetConformancePackComplianceDetailsRequest getConformancePackComplianceDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConformancePackComplianceDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConformancePackComplianceDetailsRequest> request = null;
        Response<GetConformancePackComplianceDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConformancePackComplianceDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConformancePackComplianceDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConformancePackComplianceDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConformancePackComplianceDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConformancePackComplianceDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules
     * in that conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceSummaryRequest
     * @return Result of the GetConformancePackComplianceSummary operation returned by the service.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.GetConformancePackComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConformancePackComplianceSummaryResult getConformancePackComplianceSummary(GetConformancePackComplianceSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetConformancePackComplianceSummary(request);
    }

    @SdkInternalApi
    final GetConformancePackComplianceSummaryResult executeGetConformancePackComplianceSummary(
            GetConformancePackComplianceSummaryRequest getConformancePackComplianceSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getConformancePackComplianceSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConformancePackComplianceSummaryRequest> request = null;
        Response<GetConformancePackComplianceSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConformancePackComplianceSummaryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConformancePackComplianceSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConformancePackComplianceSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConformancePackComplianceSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConformancePackComplianceSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     * Returns detailed status for each member account within an organization for a given organization config rule.
     * </p>
     * <note>
     * <p>
     * Only a master account can call this API.
     * </p>
     * </note>
     * 
     * @param getOrganizationConfigRuleDetailedStatusRequest
     * @return Result of the GetOrganizationConfigRuleDetailedStatus operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         You specified one or more organization config rules that do not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.GetOrganizationConfigRuleDetailedStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConfigRuleDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOrganizationConfigRuleDetailedStatusResult getOrganizationConfigRuleDetailedStatus(GetOrganizationConfigRuleDetailedStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetOrganizationConfigRuleDetailedStatus(request);
    }

    @SdkInternalApi
    final GetOrganizationConfigRuleDetailedStatusResult executeGetOrganizationConfigRuleDetailedStatus(
            GetOrganizationConfigRuleDetailedStatusRequest getOrganizationConfigRuleDetailedStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getOrganizationConfigRuleDetailedStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOrganizationConfigRuleDetailedStatusRequest> request = null;
        Response<GetOrganizationConfigRuleDetailedStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOrganizationConfigRuleDetailedStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOrganizationConfigRuleDetailedStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOrganizationConfigRuleDetailedStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOrganizationConfigRuleDetailedStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetOrganizationConfigRuleDetailedStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization conformance pack.
     * </p>
     * <p>
     * Only a master account can call this API.
     * </p>
     * 
     * @param getOrganizationConformancePackDetailedStatusRequest
     * @return Result of the GetOrganizationConformancePackDetailedStatus operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         AWS Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.
     *         </p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @sample AmazonConfig.GetOrganizationConformancePackDetailedStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConformancePackDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOrganizationConformancePackDetailedStatusResult getOrganizationConformancePackDetailedStatus(
            GetOrganizationConformancePackDetailedStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetOrganizationConformancePackDetailedStatus(request);
    }

    @SdkInternalApi
    final GetOrganizationConformancePackDetailedStatusResult executeGetOrganizationConformancePackDetailedStatus(
            GetOrganizationConformancePackDetailedStatusRequest getOrganizationConformancePackDetailedStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getOrganizationConformancePackDetailedStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOrganizationConformancePackDetailedStatusRequest> request = null;
        Response<GetOrganizationConformancePackDetailedStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOrganizationConformancePackDetailedStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOrganizationConformancePackDetailedStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOrganizationConformancePackDetailedStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOrganizationConformancePackDetailedStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetOrganizationConformancePackDetailedStatusResultJsonUnmarshaller());
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
     *         Failed to add the AWS Config rule because the account already contains the maximum number of 150 rules.
     *         Consider deleting any deactivated rules before you add new rules.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
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
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.
     *         </p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @throws NoAvailableOrganizationException
     *         Organization is no longer available.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         AWS Config resource cannot be created because your organization does not have all features enabled.
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
     * Creates or updates a conformance pack. A conformance pack is a collection of AWS Config rules that can be easily
     * deployed in an account and a region and across AWS Organization.
     * </p>
     * <p>
     * This API creates a service linked role <code>AWSServiceRoleForConfigConforms</code> in your account. The service
     * linked role is created only when the role does not exist in your account. AWS Config verifies the existence of
     * role with <code>GetRole</code> action.
     * </p>
     * <note>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both AWS Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * </note>
     * 
     * @param putConformancePackRequest
     * @return Result of the PutConformancePack operation returned by the service.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws ConformancePackTemplateValidationException
     *         You have specified a template that is not valid or supported.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws MaxNumberOfConformancePacksExceededException
     *         You have reached the limit (6) of the number of conformance packs in an account (6 conformance pack with
     *         25 AWS Config rules per pack).
     * @sample AmazonConfig.PutConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConformancePack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutConformancePackResult putConformancePack(PutConformancePackRequest request) {
        request = beforeClientExecution(request);
        return executePutConformancePack(request);
    }

    @SdkInternalApi
    final PutConformancePackResult executePutConformancePack(PutConformancePackRequest putConformancePackRequest) {

        ExecutionContext executionContext = createExecutionContext(putConformancePackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConformancePackRequest> request = null;
        Response<PutConformancePackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConformancePackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putConformancePackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConformancePack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConformancePackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutConformancePackResultJsonUnmarshaller());
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
     * Adds or updates organization config rule for your entire organization evaluating whether your AWS resources
     * comply with your desired configurations. Only a master account can create or update an organization config rule.
     * </p>
     * <p>
     * This API enables organization service access through the <code>EnableAWSServiceAccess</code> action and creates a
     * service linked role <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the master account of your
     * organization. The service linked role is created only when the role does not exist in the master account. AWS
     * Config verifies the existence of role with <code>GetRole</code> action.
     * </p>
     * <p>
     * You can use this action to create both custom AWS Config rules and AWS managed Config rules. If you are adding a
     * new custom AWS Config rule, you must first create AWS Lambda function in the master account that the rule invokes
     * to evaluate your resources. When you use the <code>PutOrganizationConfigRule</code> action to add the rule to AWS
     * Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. If you are
     * adding an AWS managed Config rule, specify the rule's identifier for the <code>RuleIdentifier</code> key.
     * </p>
     * <p>
     * The maximum number of organization config rules that AWS Config supports is 150.
     * </p>
     * <note>
     * <p>
     * Specify either <code>OrganizationCustomRuleMetadata</code> or <code>OrganizationManagedRuleMetadata</code>.
     * </p>
     * </note>
     * 
     * @param putOrganizationConfigRuleRequest
     * @return Result of the PutOrganizationConfigRule operation returned by the service.
     * @throws MaxNumberOfOrganizationConfigRulesExceededException
     *         You have reached the limit of the number of organization config rules you can create.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @throws NoAvailableOrganizationException
     *         Organization is no longer available.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         AWS Config resource cannot be created because your organization does not have all features enabled.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @sample AmazonConfig.PutOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutOrganizationConfigRuleResult putOrganizationConfigRule(PutOrganizationConfigRuleRequest request) {
        request = beforeClientExecution(request);
        return executePutOrganizationConfigRule(request);
    }

    @SdkInternalApi
    final PutOrganizationConfigRuleResult executePutOrganizationConfigRule(PutOrganizationConfigRuleRequest putOrganizationConfigRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(putOrganizationConfigRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOrganizationConfigRuleRequest> request = null;
        Response<PutOrganizationConfigRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOrganizationConfigRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putOrganizationConfigRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutOrganizationConfigRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutOrganizationConfigRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutOrganizationConfigRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deploys conformance packs across member accounts in an AWS Organization.
     * </p>
     * <p>
     * This API enables organization service access for <code>config-multiaccountsetup.amazonaws.com</code> through the
     * <code>EnableAWSServiceAccess</code> action and creates a service linked role
     * <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the master account of your organization. The service
     * linked role is created only when the role does not exist in the master account. AWS Config verifies the existence
     * of role with GetRole action.
     * </p>
     * <note>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both AWS Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * <p>
     * AWS Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the confomance
     * pack is created or updated. You cannot update a conformance pack while it is in this state.
     * </p>
     * <p>
     * You can create 6 conformance packs with 25 AWS Config rules in each pack.
     * </p>
     * </note>
     * 
     * @param putOrganizationConformancePackRequest
     * @return Result of the PutOrganizationConformancePack operation returned by the service.
     * @throws MaxNumberOfOrganizationConformancePacksExceededException
     *         You have reached the limit (6) of the number of organization conformance packs in an account (6
     *         conformance pack with 25 AWS Config rules per pack per account).
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws OrganizationAccessDeniedException
     *         For PutConfigAggregator API, no permission to call EnableAWSServiceAccess API.</p>
     *         <p>
     *         For all OrganizationConfigRule and OrganizationConformancePack APIs, AWS Config throws an exception if
     *         APIs are called from member accounts. All APIs must be called from organization master account.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws OrganizationConformancePackTemplateValidationException
     *         You have specified a template that is not valid or supported.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         AWS Config resource cannot be created because your organization does not have all features enabled.
     * @throws NoAvailableOrganizationException
     *         Organization is no longer available.
     * @sample AmazonConfig.PutOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutOrganizationConformancePackResult putOrganizationConformancePack(PutOrganizationConformancePackRequest request) {
        request = beforeClientExecution(request);
        return executePutOrganizationConformancePack(request);
    }

    @SdkInternalApi
    final PutOrganizationConformancePackResult executePutOrganizationConformancePack(PutOrganizationConformancePackRequest putOrganizationConformancePackRequest) {

        ExecutionContext executionContext = createExecutionContext(putOrganizationConformancePackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOrganizationConformancePackRequest> request = null;
        Response<PutOrganizationConformancePackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOrganizationConformancePackRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putOrganizationConformancePackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutOrganizationConformancePack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutOrganizationConformancePackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutOrganizationConformancePackResultJsonUnmarshaller());
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
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
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
     * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a
     * new exception or updates an exisiting exception for a specific resource with a specific AWS Config rule.
     * </p>
     * 
     * @param putRemediationExceptionsRequest
     * @return Result of the PutRemediationExceptions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.PutRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRemediationExceptionsResult putRemediationExceptions(PutRemediationExceptionsRequest request) {
        request = beforeClientExecution(request);
        return executePutRemediationExceptions(request);
    }

    @SdkInternalApi
    final PutRemediationExceptionsResult executePutRemediationExceptions(PutRemediationExceptionsRequest putRemediationExceptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putRemediationExceptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRemediationExceptionsRequest> request = null;
        Response<PutRemediationExceptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRemediationExceptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putRemediationExceptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRemediationExceptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRemediationExceptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRemediationExceptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Records the configuration state for the resource provided in the request. The configuration state of a resource
     * is represented in AWS Config as Configuration Items. Once this API records the configuration item, you can
     * retrieve the list of configuration items for the custom resource type using existing AWS Config APIs.
     * </p>
     * <note>
     * <p>
     * The custom resource type must be registered with AWS CloudFormation. This API accepts the configuration item
     * registered with AWS CloudFormation.
     * </p>
     * <p>
     * When you call this API, AWS Config only stores configuration state of the resource provided in the request. This
     * API does not change or remediate the configuration of the resource.
     * </p>
     * </note>
     * 
     * @param putResourceConfigRequest
     * @return Result of the PutResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is not valid.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @throws MaxActiveResourcesExceededException
     *         You have reached the limit (100,000) of active custom resource types in your account. Delete unused
     *         resources using <code>DeleteResourceConfig</code>.
     * @sample AmazonConfig.PutResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutResourceConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutResourceConfigResult putResourceConfig(PutResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executePutResourceConfig(request);
    }

    @SdkInternalApi
    final PutResourceConfigResult executePutResourceConfig(PutResourceConfigRequest putResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourceConfigRequest> request = null;
        Response<PutResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourceConfigResultJsonUnmarshaller());
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
     * Accepts a structured query language (SQL) SELECT command and an aggregator to query configuration state of AWS
     * resources across multiple accounts and regions, performs the corresponding search, and returns resource
     * configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the AWS Config Developer Guide.
     * </p>
     * 
     * @param selectAggregateResourceConfigRequest
     * @return Result of the SelectAggregateResourceConfig operation returned by the service.
     * @throws InvalidExpressionException
     *         The syntax of the query is incorrect.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.SelectAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SelectAggregateResourceConfigResult selectAggregateResourceConfig(SelectAggregateResourceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeSelectAggregateResourceConfig(request);
    }

    @SdkInternalApi
    final SelectAggregateResourceConfigResult executeSelectAggregateResourceConfig(SelectAggregateResourceConfigRequest selectAggregateResourceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(selectAggregateResourceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SelectAggregateResourceConfigRequest> request = null;
        Response<SelectAggregateResourceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SelectAggregateResourceConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(selectAggregateResourceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Config Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SelectAggregateResourceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SelectAggregateResourceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SelectAggregateResourceConfigResultJsonUnmarshaller());
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
     *         You see this exception in the following cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, AWS Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and AWS Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
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
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to AWS Config lacks
     *         permissions to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the AWS Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To call IAM <code>GetRole</code> action or create a service linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To read Amazon S3 bucket.
     *         </p>
     *         </li>
     *         </ul>
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
