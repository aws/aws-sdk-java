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
package com.amazonaws.services.databasemigrationservice;

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

import com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationServiceClientBuilder;
import com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.services.databasemigrationservice.model.transform.*;

/**
 * Client for accessing AWS Database Migration Service. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <fullname>AWS Database Migration Service</fullname>
 * <p>
 * AWS Database Migration Service (AWS DMS) can migrate your data to and from the most widely used commercial and
 * open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
 * MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to
 * Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL
 * Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about AWS DMS, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What
 * Is AWS Database Migration Service?</a> in the <i>AWS Database Migration User Guide.</i>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDatabaseMigrationServiceClient extends AmazonWebServiceClient implements AWSDatabaseMigrationService {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDatabaseMigrationService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dms";

    private volatile AWSDatabaseMigrationServiceWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCertificateFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.InvalidCertificateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSAccessDeniedFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.KMSAccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.KMSInvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSDisabledFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.KMSDisabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpgradeDependencyFailureFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.UpgradeDependencyFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SNSInvalidTopicFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.SNSInvalidTopicException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientResourceCapacityFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.InsufficientResourceCapacityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceQuotaExceededFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.ResourceQuotaExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSKeyNotAccessibleFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.KMSKeyNotAccessibleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetAlreadyInUse").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.SubnetAlreadyInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSNotFoundFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.KMSNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSubnet").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.InvalidSubnetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSThrottlingFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.KMSThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StorageQuotaExceededFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.StorageQuotaExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SNSNoAuthorizationFault").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.SNSNoAuthorizationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplicationSubnetGroupDoesNotCoverEnoughAZs").withModeledClass(
                                    com.amazonaws.services.databasemigrationservice.model.ReplicationSubnetGroupDoesNotCoverEnoughAZsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.databasemigrationservice.model.AWSDatabaseMigrationServiceException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Database Migration Service
     *        (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified AWS
     * account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AWSDatabaseMigrationServiceClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified AWS
     * account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Database Migration Service
     *        (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified AWS
     * account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified AWS
     * account credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Database Migration Service
     *        (ex: proxy settings, retry counts, etc.).
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified AWS
     * account credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Database Migration Service
     *        (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSDatabaseMigrationServiceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDatabaseMigrationServiceClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSDatabaseMigrationServiceClientBuilder builder() {
        return AWSDatabaseMigrationServiceClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDatabaseMigrationServiceClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database Migration Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDatabaseMigrationServiceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("dms.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/databasemigrationservice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/databasemigrationservice/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
     * migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
     * resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToResource(request);
    }

    @SdkInternalApi
    final AddTagsToResourceResult executeAddTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a replication instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return Result of the ApplyPendingMaintenanceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ApplyPendingMaintenanceActionResult applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest request) {
        request = beforeClientExecution(request);
        return executeApplyPendingMaintenanceAction(request);
    }

    @SdkInternalApi
    final ApplyPendingMaintenanceActionResult executeApplyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(applyPendingMaintenanceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplyPendingMaintenanceActionRequest> request = null;
        Response<ApplyPendingMaintenanceActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApplyPendingMaintenanceActionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(applyPendingMaintenanceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApplyPendingMaintenanceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ApplyPendingMaintenanceActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ApplyPendingMaintenanceActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEndpointResult createEndpoint(CreateEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEndpoint(request);
    }

    @SdkInternalApi
    final CreateEndpointResult executeCreateEndpoint(CreateEndpointRequest createEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointRequest> request = null;
        Response<CreateEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to be notified of, provide a list of AWS
     * DMS source IDs (<code>SourceIds</code>) that triggers the events, and provide a list of event categories (
     * <code>EventCategories</code>) for events you want to be notified of. If you specify both the
     * <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of all the replication instance events for
     * the specified source. If you specify a <code>SourceType</code> but don't specify a <code>SourceIdentifier</code>,
     * you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be notified of events generated from all AWS
     * DMS sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws SNSInvalidTopicException
     *         The SNS topic is invalid.
     * @throws SNSNoAuthorizationException
     *         You are not authorized for the SNS subscription.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or DMS account doesn't have an access to
     * @throws KMSDisabledException
     *         The specified master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The state of the specified KMS resource isn't valid for this request.
     * @throws KMSNotFoundException
     *         The specified KMS entity or resource can't be found.
     * @throws KMSThrottlingException
     *         This request triggered KMS request throttling.
     * @sample AWSDatabaseMigrationService.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEventSubscriptionResult createEventSubscription(CreateEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventSubscription(request);
    }

    @SdkInternalApi
    final CreateEventSubscriptionResult executeCreateEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSubscriptionRequest> request = null;
        Response<CreateEventSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEventSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * 
     * @param createReplicationInstanceRequest
     * @return Result of the CreateReplicationInstance operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws InsufficientResourceCapacityException
     *         There are not enough resources allocated to the database migration.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws StorageQuotaExceededException
     *         The storage quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.CreateReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateReplicationInstanceResult createReplicationInstance(CreateReplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationInstance(request);
    }

    @SdkInternalApi
    final CreateReplicationInstanceResult executeCreateReplicationInstance(CreateReplicationInstanceRequest createReplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationInstanceRequest> request = null;
        Response<CreateReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateReplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest
     * @return Result of the CreateReplicationSubnetGroup operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @sample AWSDatabaseMigrationService.CreateReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateReplicationSubnetGroupResult createReplicationSubnetGroup(CreateReplicationSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationSubnetGroup(request);
    }

    @SdkInternalApi
    final CreateReplicationSubnetGroupResult executeCreateReplicationSubnetGroup(CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationSubnetGroupRequest> request = null;
        Response<CreateReplicationSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationSubnetGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createReplicationSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationSubnetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateReplicationSubnetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest
     * @return Result of the CreateReplicationTask operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.CreateReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReplicationTaskResult createReplicationTask(CreateReplicationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationTask(request);
    }

    @SdkInternalApi
    final CreateReplicationTaskResult executeCreateReplicationTask(CreateReplicationTaskRequest createReplicationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationTaskRequest> request = null;
        Response<CreateReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateReplicationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCertificate(request);
    }

    @SdkInternalApi
    final DeleteCertificateResult executeDeleteCertificate(DeleteCertificateRequest deleteCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<DeleteCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified endpoint.
     * </p>
     * <note>
     * <p>
     * All tasks associated with the endpoint must be deleted before you can delete the endpoint.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpoint(request);
    }

    @SdkInternalApi
    final DeleteEndpointResult executeDeleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS DMS event subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEventSubscriptionResult deleteEventSubscription(DeleteEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventSubscription(request);
    }

    @SdkInternalApi
    final DeleteEventSubscriptionResult executeDeleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSubscriptionRequest> request = null;
        Response<DeleteEventSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEventSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified replication instance.
     * </p>
     * <note>
     * <p>
     * You must delete any migration tasks that are associated with the replication instance before you can delete it.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteReplicationInstanceRequest
     * @return Result of the DeleteReplicationInstance operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DeleteReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteReplicationInstanceResult deleteReplicationInstance(DeleteReplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationInstance(request);
    }

    @SdkInternalApi
    final DeleteReplicationInstanceResult executeDeleteReplicationInstance(DeleteReplicationInstanceRequest deleteReplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationInstanceRequest> request = null;
        Response<DeleteReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteReplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * 
     * @param deleteReplicationSubnetGroupRequest
     * @return Result of the DeleteReplicationSubnetGroup operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DeleteReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteReplicationSubnetGroupResult deleteReplicationSubnetGroup(DeleteReplicationSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationSubnetGroup(request);
    }

    @SdkInternalApi
    final DeleteReplicationSubnetGroupResult executeDeleteReplicationSubnetGroup(DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationSubnetGroupRequest> request = null;
        Response<DeleteReplicationSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationSubnetGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteReplicationSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationSubnetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteReplicationSubnetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified replication task.
     * </p>
     * 
     * @param deleteReplicationTaskRequest
     * @return Result of the DeleteReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReplicationTaskResult deleteReplicationTask(DeleteReplicationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationTask(request);
    }

    @SdkInternalApi
    final DeleteReplicationTaskResult executeDeleteReplicationTask(DeleteReplicationTaskRequest deleteReplicationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationTaskRequest> request = null;
        Response<DeleteReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteReplicationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the
     * account, such as the number of replication instances allowed. The description for a quota includes the quota
     * name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAttributes(request);
    }

    @SdkInternalApi
    final DescribeAccountAttributesResult executeDescribeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a description of the certificate.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return Result of the DescribeCertificates operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificates(request);
    }

    @SdkInternalApi
    final DescribeCertificatesResult executeDescribeCertificates(DescribeCertificatesRequest describeCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificatesRequest> request = null;
        Response<DescribeCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the status of the connections that have been made between the replication instance and an endpoint.
     * Connections are created when you test an endpoint.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return Result of the DescribeConnections operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeConnections" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnections(request);
    }

    @SdkInternalApi
    final DescribeConnectionsResult executeDescribeConnections(DescribeConnectionsRequest describeConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsRequest> request = null;
        Response<DescribeConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the type of endpoints available.
     * </p>
     * 
     * @param describeEndpointTypesRequest
     * @return Result of the DescribeEndpointTypes operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEndpointTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointTypes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEndpointTypesResult describeEndpointTypes(DescribeEndpointTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpointTypes(request);
    }

    @SdkInternalApi
    final DescribeEndpointTypesResult executeDescribeEndpointTypes(DescribeEndpointTypesRequest describeEndpointTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointTypesRequest> request = null;
        Response<DescribeEndpointTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpointTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointTypesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeEndpointTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the endpoints for your account in the current region.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpoints(request);
    }

    @SdkInternalApi
    final DescribeEndpointsResult executeDescribeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
     * the event categories and source types in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventCategories(request);
    }

    @SdkInternalApi
    final DescribeEventCategoriesResult executeDescribeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventCategoriesRequest> request = null;
        Response<DescribeEventCategoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventCategoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEventCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventCategories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventCategoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEventCategoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the event subscriptions for a customer account. The description of a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify <code>SubscriptionName</code>, this action lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventSubscriptions(request);
    }

    @SdkInternalApi
    final DescribeEventSubscriptionsResult executeDescribeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventSubscriptionsRequest> request = null;
        Response<DescribeEventSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEventSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEventSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists events for a given source identifier and source type. You can also specify a start and end time. For more
     * information on AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration User Guide.</i>
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvents(request);
    }

    @SdkInternalApi
    final DescribeEventsResult executeDescribeEvents(DescribeEventsRequest describeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the replication instance types that can be created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @return Result of the DescribeOrderableReplicationInstances operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeOrderableReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeOrderableReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(DescribeOrderableReplicationInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrderableReplicationInstances(request);
    }

    @SdkInternalApi
    final DescribeOrderableReplicationInstancesResult executeDescribeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrderableReplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableReplicationInstancesRequest> request = null;
        Response<DescribeOrderableReplicationInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrderableReplicationInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrderableReplicationInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrderableReplicationInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrderableReplicationInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrderableReplicationInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For internal use only
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return Result of the DescribePendingMaintenanceActions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePendingMaintenanceActions(request);
    }

    @SdkInternalApi
    final DescribePendingMaintenanceActionsResult executeDescribePendingMaintenanceActions(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePendingMaintenanceActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePendingMaintenanceActionsRequest> request = null;
        Response<DescribePendingMaintenanceActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePendingMaintenanceActionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePendingMaintenanceActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePendingMaintenanceActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePendingMaintenanceActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePendingMaintenanceActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest
     * @return Result of the DescribeRefreshSchemasStatus operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeRefreshSchemasStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRefreshSchemasStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(DescribeRefreshSchemasStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRefreshSchemasStatus(request);
    }

    @SdkInternalApi
    final DescribeRefreshSchemasStatusResult executeDescribeRefreshSchemasStatus(DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRefreshSchemasStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRefreshSchemasStatusRequest> request = null;
        Response<DescribeRefreshSchemasStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRefreshSchemasStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRefreshSchemasStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRefreshSchemasStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRefreshSchemasStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRefreshSchemasStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the task logs for the specified task.
     * </p>
     * 
     * @param describeReplicationInstanceTaskLogsRequest
     * @return Result of the DescribeReplicationInstanceTaskLogs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeReplicationInstanceTaskLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstanceTaskLogs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationInstanceTaskLogsResult describeReplicationInstanceTaskLogs(DescribeReplicationInstanceTaskLogsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationInstanceTaskLogs(request);
    }

    @SdkInternalApi
    final DescribeReplicationInstanceTaskLogsResult executeDescribeReplicationInstanceTaskLogs(
            DescribeReplicationInstanceTaskLogsRequest describeReplicationInstanceTaskLogsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationInstanceTaskLogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationInstanceTaskLogsRequest> request = null;
        Response<DescribeReplicationInstanceTaskLogsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationInstanceTaskLogsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationInstanceTaskLogsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationInstanceTaskLogs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationInstanceTaskLogsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationInstanceTaskLogsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about replication instances for your account in the current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest
     * @return Result of the DescribeReplicationInstances operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationInstancesResult describeReplicationInstances(DescribeReplicationInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationInstances(request);
    }

    @SdkInternalApi
    final DescribeReplicationInstancesResult executeDescribeReplicationInstances(DescribeReplicationInstancesRequest describeReplicationInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationInstancesRequest> request = null;
        Response<DescribeReplicationInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the replication subnet groups.
     * </p>
     * 
     * @param describeReplicationSubnetGroupsRequest
     * @return Result of the DescribeReplicationSubnetGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(DescribeReplicationSubnetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationSubnetGroups(request);
    }

    @SdkInternalApi
    final DescribeReplicationSubnetGroupsResult executeDescribeReplicationSubnetGroups(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationSubnetGroupsRequest> request = null;
        Response<DescribeReplicationSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationSubnetGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationSubnetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationSubnetGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationSubnetGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     * </p>
     * 
     * @param describeReplicationTaskAssessmentResultsRequest
     * @return Result of the DescribeReplicationTaskAssessmentResults operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTaskAssessmentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentResults"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationTaskAssessmentResultsResult describeReplicationTaskAssessmentResults(DescribeReplicationTaskAssessmentResultsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationTaskAssessmentResults(request);
    }

    @SdkInternalApi
    final DescribeReplicationTaskAssessmentResultsResult executeDescribeReplicationTaskAssessmentResults(
            DescribeReplicationTaskAssessmentResultsRequest describeReplicationTaskAssessmentResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationTaskAssessmentResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTaskAssessmentResultsRequest> request = null;
        Response<DescribeReplicationTaskAssessmentResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTaskAssessmentResultsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationTaskAssessmentResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationTaskAssessmentResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationTaskAssessmentResultsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeReplicationTaskAssessmentResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about replication tasks for your account in the current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest
     * @return Result of the DescribeReplicationTasks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTasks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReplicationTasksResult describeReplicationTasks(DescribeReplicationTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationTasks(request);
    }

    @SdkInternalApi
    final DescribeReplicationTasksResult executeDescribeReplicationTasks(DescribeReplicationTasksRequest describeReplicationTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTasksRequest> request = null;
        Response<DescribeReplicationTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <p/>
     * 
     * @param describeSchemasRequest
     * @return Result of the DescribeSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSchemasResult describeSchemas(DescribeSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchemas(request);
    }

    @SdkInternalApi
    final DescribeSchemasResult executeDescribeSchemas(DescribeSchemasRequest describeSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemasRequest> request = null;
        Response<DescribeSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
     * rows deleted.
     * </p>
     * <p>
     * Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table
     * statistics record for a table. It does not indicate the time of the last update to the table.
     * </p>
     * 
     * @param describeTableStatisticsRequest
     * @return Result of the DescribeTableStatistics operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeTableStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeTableStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTableStatisticsResult describeTableStatistics(DescribeTableStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTableStatistics(request);
    }

    @SdkInternalApi
    final DescribeTableStatisticsResult executeDescribeTableStatistics(DescribeTableStatisticsRequest describeTableStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTableStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableStatisticsRequest> request = null;
        Response<DescribeTableStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTableStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTableStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTableStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTableStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads the specified certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws InvalidCertificateException
     *         The certificate was not valid.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportCertificateResult importCertificate(ImportCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeImportCertificate(request);
    }

    @SdkInternalApi
    final ImportCertificateResult executeImportCertificate(ImportCertificateRequest importCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(importCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCertificateRequest> request = null;
        Response<ImportCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags for an AWS DMS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
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
     * Modifies the specified endpoint.
     * </p>
     * 
     * @param modifyEndpointRequest
     * @return Result of the ModifyEndpoint operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.ModifyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyEndpointResult modifyEndpoint(ModifyEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeModifyEndpoint(request);
    }

    @SdkInternalApi
    final ModifyEndpointResult executeModifyEndpoint(ModifyEndpointRequest modifyEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEndpointRequest> request = null;
        Response<ModifyEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ModifyEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing AWS DMS event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws SNSInvalidTopicException
     *         The SNS topic is invalid.
     * @throws SNSNoAuthorizationException
     *         You are not authorized for the SNS subscription.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or DMS account doesn't have an access to
     * @throws KMSDisabledException
     *         The specified master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The state of the specified KMS resource isn't valid for this request.
     * @throws KMSNotFoundException
     *         The specified KMS entity or resource can't be found.
     * @throws KMSThrottlingException
     *         This request triggered KMS request throttling.
     * @sample AWSDatabaseMigrationService.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ModifyEventSubscriptionResult modifyEventSubscription(ModifyEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeModifyEventSubscription(request);
    }

    @SdkInternalApi
    final ModifyEventSubscriptionResult executeModifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEventSubscriptionRequest> request = null;
        Response<ModifyEventSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEventSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyEventSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyEventSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyEventSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * <p>
     * Some settings are applied during the maintenance window.
     * </p>
     * <p/>
     * 
     * @param modifyReplicationInstanceRequest
     * @return Result of the ModifyReplicationInstance operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InsufficientResourceCapacityException
     *         There are not enough resources allocated to the database migration.
     * @throws StorageQuotaExceededException
     *         The storage quota has been exceeded.
     * @throws UpgradeDependencyFailureException
     *         An upgrade dependency is preventing the database migration.
     * @sample AWSDatabaseMigrationService.ModifyReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ModifyReplicationInstanceResult modifyReplicationInstance(ModifyReplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeModifyReplicationInstance(request);
    }

    @SdkInternalApi
    final ModifyReplicationInstanceResult executeModifyReplicationInstance(ModifyReplicationInstanceRequest modifyReplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationInstanceRequest> request = null;
        Response<ModifyReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyReplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyReplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyReplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * 
     * @param modifyReplicationSubnetGroupRequest
     * @return Result of the ModifyReplicationSubnetGroup operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws SubnetAlreadyInUseException
     *         The specified subnet is already in use.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @sample AWSDatabaseMigrationService.ModifyReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(ModifyReplicationSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyReplicationSubnetGroup(request);
    }

    @SdkInternalApi
    final ModifyReplicationSubnetGroupResult executeModifyReplicationSubnetGroup(ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationSubnetGroupRequest> request = null;
        Response<ModifyReplicationSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationSubnetGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyReplicationSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyReplicationSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyReplicationSubnetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyReplicationSubnetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified replication task.
     * </p>
     * <p>
     * You can't modify the task endpoints. The task must be stopped before you can modify it.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks</a> in the
     * <i>AWS Database Migration Service User Guide</i>.
     * </p>
     * 
     * @param modifyReplicationTaskRequest
     * @return Result of the ModifyReplicationTask operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.ModifyReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyReplicationTaskResult modifyReplicationTask(ModifyReplicationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeModifyReplicationTask(request);
    }

    @SdkInternalApi
    final ModifyReplicationTaskResult executeModifyReplicationTask(ModifyReplicationTaskRequest modifyReplicationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationTaskRequest> request = null;
        Response<ModifyReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyReplicationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyReplicationTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ModifyReplicationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
     * available again.
     * </p>
     * 
     * @param rebootReplicationInstanceRequest
     * @return Result of the RebootReplicationInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.RebootReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RebootReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RebootReplicationInstanceResult rebootReplicationInstance(RebootReplicationInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRebootReplicationInstance(request);
    }

    @SdkInternalApi
    final RebootReplicationInstanceResult executeRebootReplicationInstance(RebootReplicationInstanceRequest rebootReplicationInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootReplicationInstanceRequest> request = null;
        Response<RebootReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootReplicationInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rebootReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootReplicationInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootReplicationInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RebootReplicationInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
     * You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest
     * @return Result of the RefreshSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.RefreshSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RefreshSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RefreshSchemasResult refreshSchemas(RefreshSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeRefreshSchemas(request);
    }

    @SdkInternalApi
    final RefreshSchemasResult executeRefreshSchemas(RefreshSchemasRequest refreshSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(refreshSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshSchemasRequest> request = null;
        Response<RefreshSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(refreshSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RefreshSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RefreshSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RefreshSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reloads the target database table with the source data.
     * </p>
     * 
     * @param reloadTablesRequest
     * @return Result of the ReloadTables operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.ReloadTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadTables" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReloadTablesResult reloadTables(ReloadTablesRequest request) {
        request = beforeClientExecution(request);
        return executeReloadTables(request);
    }

    @SdkInternalApi
    final ReloadTablesResult executeReloadTables(ReloadTablesRequest reloadTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(reloadTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReloadTablesRequest> request = null;
        Response<ReloadTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReloadTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(reloadTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReloadTables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReloadTablesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReloadTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveTagsFromResourceResult executeRemoveTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveTagsFromResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks </a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @return Result of the StartReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.StartReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartReplicationTaskResult startReplicationTask(StartReplicationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartReplicationTask(request);
    }

    @SdkInternalApi
    final StartReplicationTaskResult executeStartReplicationTask(StartReplicationTaskRequest startReplicationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationTaskRequest> request = null;
        Response<StartReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReplicationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReplicationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartReplicationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the replication task assessment for unsupported data types in the source database.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRequest
     * @return Result of the StartReplicationTaskAssessment operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.StartReplicationTaskAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartReplicationTaskAssessmentResult startReplicationTaskAssessment(StartReplicationTaskAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeStartReplicationTaskAssessment(request);
    }

    @SdkInternalApi
    final StartReplicationTaskAssessmentResult executeStartReplicationTaskAssessment(StartReplicationTaskAssessmentRequest startReplicationTaskAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(startReplicationTaskAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationTaskAssessmentRequest> request = null;
        Response<StartReplicationTaskAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationTaskAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startReplicationTaskAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReplicationTaskAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReplicationTaskAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartReplicationTaskAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest
     * @return Result of the StopReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.StopReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StopReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopReplicationTaskResult stopReplicationTask(StopReplicationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopReplicationTask(request);
    }

    @SdkInternalApi
    final StopReplicationTaskResult executeStopReplicationTask(StopReplicationTaskRequest stopReplicationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopReplicationTaskRequest> request = null;
        Response<StopReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopReplicationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopReplicationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopReplicationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopReplicationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * 
     * @param testConnectionRequest
     * @return Result of the TestConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.TestConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/TestConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestConnectionResult testConnection(TestConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeTestConnection(request);
    }

    @SdkInternalApi
    final TestConnectionResult executeTestConnection(TestConnectionRequest testConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(testConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestConnectionRequest> request = null;
        Response<TestConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestConnectionResultJsonUnmarshaller());
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

    @Override
    public AWSDatabaseMigrationServiceWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSDatabaseMigrationServiceWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
