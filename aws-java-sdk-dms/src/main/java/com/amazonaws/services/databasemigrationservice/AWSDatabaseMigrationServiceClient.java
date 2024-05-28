/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>Database Migration Service</fullname>
 * <p>
 * Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source
 * databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP
 * Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as
 * heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about DMS, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What Is
 * Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i>
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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.InvalidOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCertificateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.InvalidCertificateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSAccessDeniedFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSAccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSDisabledFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSDisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SNSInvalidTopicFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.SNSInvalidTopicExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientResourceCapacityFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.InsufficientResourceCapacityExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.ResourceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("S3AccessDeniedFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.S3AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSKeyNotAccessibleFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSKeyNotAccessibleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetAlreadyInUse").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.SubnetAlreadyInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSubnet").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.InvalidSubnetExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CollectorNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.CollectorNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SNSNoAuthorizationFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.SNSNoAuthorizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSInvalidStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpgradeDependencyFailureFault")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.databasemigrationservice.model.transform.UpgradeDependencyFailureExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.InvalidResourceStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSThrottlingFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.KMSThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StorageQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.StorageQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("S3ResourceNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.databasemigrationservice.model.transform.S3ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("ReplicationSubnetGroupDoesNotCoverEnoughAZs")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.databasemigrationservice.model.transform.ReplicationSubnetGroupDoesNotCoverEnoughAZsExceptionUnmarshaller
                                                    .getInstance()))
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
     * Adds metadata tags to an DMS resource, including replication instance, endpoint, subnet group, and migration
     * task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or
     * used in a Condition statement in an IAM policy for DMS. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Associates a set of tags with an DMS resource.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Starts the analysis of up to 20 source databases to recommend target engines for each source database. This is a
     * batch version of <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_StartRecommendations.html">StartRecommendations
     * </a>.
     * </p>
     * <p>
     * The result of analysis of each source database is reported individually in the response. Because the batch
     * request can result in a combination of successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * 
     * @param batchStartRecommendationsRequest
     * @return Result of the BatchStartRecommendations operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.BatchStartRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/BatchStartRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchStartRecommendationsResult batchStartRecommendations(BatchStartRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchStartRecommendations(request);
    }

    @SdkInternalApi
    final BatchStartRecommendationsResult executeBatchStartRecommendations(BatchStartRecommendationsRequest batchStartRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchStartRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStartRecommendationsRequest> request = null;
        Response<BatchStartRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchStartRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchStartRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchStartRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchStartRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchStartRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a single premigration assessment run.
     * </p>
     * <p>
     * This operation prevents any individual assessments from running if they haven't started running. It also attempts
     * to cancel any individual assessments that are currently running.
     * </p>
     * 
     * @param cancelReplicationTaskAssessmentRunRequest
     * @return Result of the CancelReplicationTaskAssessmentRun operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.CancelReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CancelReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelReplicationTaskAssessmentRunResult cancelReplicationTaskAssessmentRun(CancelReplicationTaskAssessmentRunRequest request) {
        request = beforeClientExecution(request);
        return executeCancelReplicationTaskAssessmentRun(request);
    }

    @SdkInternalApi
    final CancelReplicationTaskAssessmentRunResult executeCancelReplicationTaskAssessmentRun(
            CancelReplicationTaskAssessmentRunRequest cancelReplicationTaskAssessmentRunRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelReplicationTaskAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelReplicationTaskAssessmentRunRequest> request = null;
        Response<CancelReplicationTaskAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelReplicationTaskAssessmentRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelReplicationTaskAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelReplicationTaskAssessmentRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelReplicationTaskAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelReplicationTaskAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data provider using the provided settings. A data provider stores a data store type and location
     * information about your database.
     * </p>
     * 
     * @param createDataProviderRequest
     * @return Result of the CreateDataProvider operation returned by the service.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @sample AWSDatabaseMigrationService.CreateDataProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateDataProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataProviderResult createDataProvider(CreateDataProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataProvider(request);
    }

    @SdkInternalApi
    final CreateDataProviderResult executeCreateDataProvider(CreateDataProviderRequest createDataProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataProviderRequest> request = null;
        Response<CreateDataProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataProviderResultJsonUnmarshaller());
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
     * <note>
     * <p>
     * For a MySQL source or target endpoint, don't explicitly specify the database using the <code>DatabaseName</code>
     * request parameter on the <code>CreateEndpoint</code> API call. Specifying <code>DatabaseName</code> when you
     * create a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     * the database only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * </note>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates an DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to be notified of, provide a list of DMS
     * source IDs (<code>SourceIds</code>) that triggers the events, and provide a list of event categories (
     * <code>EventCategories</code>) for events you want to be notified of. If you specify both the
     * <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of all the replication instance events for
     * the specified source. If you specify a <code>SourceType</code> but don't specify a <code>SourceIdentifier</code>,
     * you receive notice of the events for that source type for all your DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be notified of events generated from all DMS
     * sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     *         The ciphertext references a key that doesn't exist or that the DMS account doesn't have access to.
     * @throws KMSDisabledException
     *         The specified KMS key isn't enabled.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates a Fleet Advisor collector using the specified parameters.
     * </p>
     * 
     * @param createFleetAdvisorCollectorRequest
     * @return Result of the CreateFleetAdvisorCollector operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.CreateFleetAdvisorCollector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateFleetAdvisorCollector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFleetAdvisorCollectorResult createFleetAdvisorCollector(CreateFleetAdvisorCollectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleetAdvisorCollector(request);
    }

    @SdkInternalApi
    final CreateFleetAdvisorCollectorResult executeCreateFleetAdvisorCollector(CreateFleetAdvisorCollectorRequest createFleetAdvisorCollectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetAdvisorCollectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetAdvisorCollectorRequest> request = null;
        Response<CreateFleetAdvisorCollectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetAdvisorCollectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createFleetAdvisorCollectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFleetAdvisorCollector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetAdvisorCollectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateFleetAdvisorCollectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the instance profile using the specified parameters.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return Result of the CreateInstanceProfile operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.CreateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateInstanceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstanceProfile(request);
    }

    @SdkInternalApi
    final CreateInstanceProfileResult executeCreateInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceProfileRequest> request = null;
        Response<CreateInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the migration project using the specified parameters.
     * </p>
     * <p>
     * You can run this action only after you create an instance profile and data providers using <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateInstanceProfile.html"
     * >CreateInstanceProfile</a> and <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateDataProvider.html">CreateDataProvider</a>.
     * </p>
     * 
     * @param createMigrationProjectRequest
     * @return Result of the CreateMigrationProject operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.CreateMigrationProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateMigrationProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMigrationProjectResult createMigrationProject(CreateMigrationProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMigrationProject(request);
    }

    @SdkInternalApi
    final CreateMigrationProjectResult executeCreateMigrationProject(CreateMigrationProjectRequest createMigrationProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createMigrationProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMigrationProjectRequest> request = null;
        Response<CreateMigrationProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMigrationProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMigrationProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMigrationProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMigrationProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMigrationProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration that you can later provide to configure and start an DMS Serverless replication. You can
     * also provide options to validate the configuration inputs before you start the replication.
     * </p>
     * 
     * @param createReplicationConfigRequest
     * @return Result of the CreateReplicationConfig operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided isn't valid.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.CreateReplicationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateReplicationConfigResult createReplicationConfig(CreateReplicationConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationConfig(request);
    }

    @SdkInternalApi
    final CreateReplicationConfigResult executeCreateReplicationConfig(CreateReplicationConfigRequest createReplicationConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationConfigRequest> request = null;
        Response<CreateReplicationConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createReplicationConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateReplicationConfigResultJsonUnmarshaller());
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
     * <p>
     * DMS requires that your account have certain roles with appropriate permissions before you can create a
     * replication instance. For information on the required roles, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.APIRole">Creating the IAM
     * Roles to Use With the CLI and DMS API</a>. For information on the required permissions, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.IAMPermissions">IAM
     * Permissions Needed to Use DMS</a>.
     * </p>
     * <note>
     * <p>
     * If you don't specify a version when creating a replication instance, DMS will create the instance using the
     * default engine version. For information about the default engine version, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReleaseNotes.html">Release Notes</a>.
     * </p>
     * </note>
     * 
     * @param createReplicationInstanceRequest
     * @return Result of the CreateReplicationInstance operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     *         The subnet provided isn't valid.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * The VPC needs to have at least one subnet in at least two availability zones in the Amazon Web Services Region,
     * otherwise the service will throw a <code>ReplicationSubnetGroupDoesNotCoverEnoughAZs</code> exception.
     * </p>
     * <p>
     * If a replication subnet group exists in your Amazon Web Services account, the CreateReplicationSubnetGroup action
     * returns the following error message: The Replication Subnet Group already exists. In this case, delete the
     * existing replication subnet group. To do so, use the <a
     * href="https://docs.aws.amazon.com/en_us/dms/latest/APIReference/API_DeleteReplicationSubnetGroup.html"
     * >DeleteReplicationSubnetGroup</a> action. Optionally, choose Subnet groups in the DMS console, then choose your
     * subnet group. Next, choose Delete from Actions.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest
     * @return Result of the CreateReplicationSubnetGroup operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     *         The subnet provided isn't valid.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes the connection between a replication instance and an endpoint.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnection(request);
    }

    @SdkInternalApi
    final DeleteConnectionResult executeDeleteConnection(DeleteConnectionRequest deleteConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified data provider.
     * </p>
     * <note>
     * <p>
     * All migration projects associated with the data provider must be deleted or modified before you can delete the
     * data provider.
     * </p>
     * </note>
     * 
     * @param deleteDataProviderRequest
     * @return Result of the DeleteDataProvider operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteDataProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteDataProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDataProviderResult deleteDataProvider(DeleteDataProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataProvider(request);
    }

    @SdkInternalApi
    final DeleteDataProviderResult executeDeleteDataProvider(DeleteDataProviderRequest deleteDataProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataProviderRequest> request = null;
        Response<DeleteDataProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDataProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDataProviderResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes an DMS event subscription.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes the specified Fleet Advisor collector.
     * </p>
     * 
     * @param deleteFleetAdvisorCollectorRequest
     * @return Result of the DeleteFleetAdvisorCollector operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws CollectorNotFoundException
     *         The specified collector doesn't exist.
     * @sample AWSDatabaseMigrationService.DeleteFleetAdvisorCollector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteFleetAdvisorCollector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFleetAdvisorCollectorResult deleteFleetAdvisorCollector(DeleteFleetAdvisorCollectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleetAdvisorCollector(request);
    }

    @SdkInternalApi
    final DeleteFleetAdvisorCollectorResult executeDeleteFleetAdvisorCollector(DeleteFleetAdvisorCollectorRequest deleteFleetAdvisorCollectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetAdvisorCollectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetAdvisorCollectorRequest> request = null;
        Response<DeleteFleetAdvisorCollectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetAdvisorCollectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFleetAdvisorCollectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleetAdvisorCollector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetAdvisorCollectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFleetAdvisorCollectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Fleet Advisor collector databases.
     * </p>
     * 
     * @param deleteFleetAdvisorDatabasesRequest
     * @return Result of the DeleteFleetAdvisorDatabases operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidOperationException
     *         The action or operation requested isn't valid.
     * @sample AWSDatabaseMigrationService.DeleteFleetAdvisorDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteFleetAdvisorDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFleetAdvisorDatabasesResult deleteFleetAdvisorDatabases(DeleteFleetAdvisorDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleetAdvisorDatabases(request);
    }

    @SdkInternalApi
    final DeleteFleetAdvisorDatabasesResult executeDeleteFleetAdvisorDatabases(DeleteFleetAdvisorDatabasesRequest deleteFleetAdvisorDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetAdvisorDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetAdvisorDatabasesRequest> request = null;
        Response<DeleteFleetAdvisorDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetAdvisorDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFleetAdvisorDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleetAdvisorDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetAdvisorDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFleetAdvisorDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified instance profile.
     * </p>
     * <note>
     * <p>
     * All migration projects associated with the instance profile must be deleted or modified before you can delete the
     * instance profile.
     * </p>
     * </note>
     * 
     * @param deleteInstanceProfileRequest
     * @return Result of the DeleteInstanceProfile operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteInstanceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceProfile(request);
    }

    @SdkInternalApi
    final DeleteInstanceProfileResult executeDeleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceProfileRequest> request = null;
        Response<DeleteInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified migration project.
     * </p>
     * <note>
     * <p>
     * The migration project must be closed before you can delete it.
     * </p>
     * </note>
     * 
     * @param deleteMigrationProjectRequest
     * @return Result of the DeleteMigrationProject operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteMigrationProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteMigrationProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMigrationProjectResult deleteMigrationProject(DeleteMigrationProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMigrationProject(request);
    }

    @SdkInternalApi
    final DeleteMigrationProjectResult executeDeleteMigrationProject(DeleteMigrationProjectRequest deleteMigrationProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMigrationProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMigrationProjectRequest> request = null;
        Response<DeleteMigrationProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMigrationProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMigrationProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMigrationProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMigrationProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMigrationProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an DMS Serverless replication configuration. This effectively deprovisions any and all replications that
     * use this configuration. You can't delete the configuration for an DMS Serverless replication that is ongoing. You
     * can delete the configuration when the replication is in a non-RUNNING and non-STARTING state.
     * </p>
     * 
     * @param deleteReplicationConfigRequest
     * @return Result of the DeleteReplicationConfig operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteReplicationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteReplicationConfigResult deleteReplicationConfig(DeleteReplicationConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationConfig(request);
    }

    @SdkInternalApi
    final DeleteReplicationConfigResult executeDeleteReplicationConfig(DeleteReplicationConfigRequest deleteReplicationConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationConfigRequest> request = null;
        Response<DeleteReplicationConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteReplicationConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteReplicationConfigResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes the record of a single premigration assessment run.
     * </p>
     * <p>
     * This operation removes all metadata that DMS maintains about this assessment run. However, the operation leaves
     * untouched all information about this assessment run that is stored in your Amazon S3 bucket.
     * </p>
     * 
     * @param deleteReplicationTaskAssessmentRunRequest
     * @return Result of the DeleteReplicationTaskAssessmentRun operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteReplicationTaskAssessmentRunResult deleteReplicationTaskAssessmentRun(DeleteReplicationTaskAssessmentRunRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationTaskAssessmentRun(request);
    }

    @SdkInternalApi
    final DeleteReplicationTaskAssessmentRunResult executeDeleteReplicationTaskAssessmentRun(
            DeleteReplicationTaskAssessmentRunRequest deleteReplicationTaskAssessmentRunRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationTaskAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationTaskAssessmentRunRequest> request = null;
        Response<DeleteReplicationTaskAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationTaskAssessmentRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteReplicationTaskAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationTaskAssessmentRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationTaskAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteReplicationTaskAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the DMS attributes for a customer account. These attributes include DMS quotas for the account and a
     * unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by
     * the account, such as the number of replication instances allowed. The description for each resource quota,
     * includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique
     * account identifier to name each artifact used by DMS in the given region.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Provides a list of individual assessments that you can specify for a new premigration assessment run, given one
     * or more parameters.
     * </p>
     * <p>
     * If you specify an existing migration task, this operation provides the default individual assessments you can
     * specify for that task. Otherwise, the specified parameters model elements of a possible migration task on which
     * to base a premigration assessment run.
     * </p>
     * <p>
     * To use these migration task modeling parameters, you must specify an existing replication instance, a source
     * database engine, a target database engine, and a migration type. This combination of parameters potentially
     * limits the default individual assessments available for an assessment run created for a corresponding migration
     * task.
     * </p>
     * <p>
     * If you specify no parameters, this operation provides a list of all possible individual assessments that you can
     * specify for an assessment run. If you specify any one of the task modeling parameters, you must specify all of
     * them or the operation cannot provide a list of individual assessments. The only parameter that you can specify
     * alone is for an existing migration task. The specified task definition then determines the default list of
     * individual assessments that you can specify in an assessment run for the task.
     * </p>
     * 
     * @param describeApplicableIndividualAssessmentsRequest
     * @return Result of the DescribeApplicableIndividualAssessments operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeApplicableIndividualAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeApplicableIndividualAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicableIndividualAssessmentsResult describeApplicableIndividualAssessments(DescribeApplicableIndividualAssessmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicableIndividualAssessments(request);
    }

    @SdkInternalApi
    final DescribeApplicableIndividualAssessmentsResult executeDescribeApplicableIndividualAssessments(
            DescribeApplicableIndividualAssessmentsRequest describeApplicableIndividualAssessmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicableIndividualAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicableIndividualAssessmentsRequest> request = null;
        Response<DescribeApplicableIndividualAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicableIndividualAssessmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicableIndividualAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicableIndividualAssessments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicableIndividualAssessmentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeApplicableIndividualAssessmentsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns configuration parameters for a schema conversion project.
     * </p>
     * 
     * @param describeConversionConfigurationRequest
     * @return Result of the DescribeConversionConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeConversionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeConversionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConversionConfigurationResult describeConversionConfiguration(DescribeConversionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConversionConfiguration(request);
    }

    @SdkInternalApi
    final DescribeConversionConfigurationResult executeDescribeConversionConfiguration(
            DescribeConversionConfigurationRequest describeConversionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConversionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConversionConfigurationRequest> request = null;
        Response<DescribeConversionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConversionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConversionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConversionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConversionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConversionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of data providers for your account in the current region.
     * </p>
     * 
     * @param describeDataProvidersRequest
     * @return Result of the DescribeDataProviders operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.DescribeDataProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeDataProviders" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDataProvidersResult describeDataProviders(DescribeDataProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataProviders(request);
    }

    @SdkInternalApi
    final DescribeDataProvidersResult executeDescribeDataProviders(DescribeDataProvidersRequest describeDataProvidersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataProvidersRequest> request = null;
        Response<DescribeDataProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataProvidersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDataProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataProvidersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDataProvidersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the possible endpoint settings available when you create an endpoint for a specific
     * database engine.
     * </p>
     * 
     * @param describeEndpointSettingsRequest
     * @return Result of the DescribeEndpointSettings operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEndpointSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEndpointSettingsResult describeEndpointSettings(DescribeEndpointSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpointSettings(request);
    }

    @SdkInternalApi
    final DescribeEndpointSettingsResult executeDescribeEndpointSettings(DescribeEndpointSettingsRequest describeEndpointSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointSettingsRequest> request = null;
        Response<DescribeEndpointSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEndpointSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpointSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEndpointSettingsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns information about the replication instance versions used in the project.
     * </p>
     * 
     * @param describeEngineVersionsRequest
     * @return Result of the DescribeEngineVersions operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEngineVersionsResult describeEngineVersions(DescribeEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEngineVersions(request);
    }

    @SdkInternalApi
    final DescribeEngineVersionsResult executeDescribeEngineVersions(DescribeEngineVersionsRequest describeEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineVersionsRequest> request = null;
        Response<DescribeEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEngineVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEngineVersionsResultJsonUnmarshaller());
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
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * information on DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a paginated list of extension pack associations for the specified migration project. An extension pack is
     * an add-on module that emulates functions present in a source database that are required when converting objects
     * to the target database.
     * </p>
     * 
     * @param describeExtensionPackAssociationsRequest
     * @return Result of the DescribeExtensionPackAssociations operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeExtensionPackAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeExtensionPackAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeExtensionPackAssociationsResult describeExtensionPackAssociations(DescribeExtensionPackAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExtensionPackAssociations(request);
    }

    @SdkInternalApi
    final DescribeExtensionPackAssociationsResult executeDescribeExtensionPackAssociations(
            DescribeExtensionPackAssociationsRequest describeExtensionPackAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExtensionPackAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExtensionPackAssociationsRequest> request = null;
        Response<DescribeExtensionPackAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExtensionPackAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeExtensionPackAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExtensionPackAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExtensionPackAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeExtensionPackAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the Fleet Advisor collectors in your account.
     * </p>
     * 
     * @param describeFleetAdvisorCollectorsRequest
     * @return Result of the DescribeFleetAdvisorCollectors operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeFleetAdvisorCollectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorCollectors"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetAdvisorCollectorsResult describeFleetAdvisorCollectors(DescribeFleetAdvisorCollectorsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetAdvisorCollectors(request);
    }

    @SdkInternalApi
    final DescribeFleetAdvisorCollectorsResult executeDescribeFleetAdvisorCollectors(DescribeFleetAdvisorCollectorsRequest describeFleetAdvisorCollectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetAdvisorCollectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAdvisorCollectorsRequest> request = null;
        Response<DescribeFleetAdvisorCollectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAdvisorCollectorsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetAdvisorCollectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetAdvisorCollectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetAdvisorCollectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetAdvisorCollectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Fleet Advisor databases in your account.
     * </p>
     * 
     * @param describeFleetAdvisorDatabasesRequest
     * @return Result of the DescribeFleetAdvisorDatabases operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeFleetAdvisorDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetAdvisorDatabasesResult describeFleetAdvisorDatabases(DescribeFleetAdvisorDatabasesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetAdvisorDatabases(request);
    }

    @SdkInternalApi
    final DescribeFleetAdvisorDatabasesResult executeDescribeFleetAdvisorDatabases(DescribeFleetAdvisorDatabasesRequest describeFleetAdvisorDatabasesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetAdvisorDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAdvisorDatabasesRequest> request = null;
        Response<DescribeFleetAdvisorDatabasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAdvisorDatabasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetAdvisorDatabasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetAdvisorDatabases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetAdvisorDatabasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetAdvisorDatabasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides descriptions of large-scale assessment (LSA) analyses produced by your Fleet Advisor collectors.
     * </p>
     * 
     * @param describeFleetAdvisorLsaAnalysisRequest
     * @return Result of the DescribeFleetAdvisorLsaAnalysis operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeFleetAdvisorLsaAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorLsaAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetAdvisorLsaAnalysisResult describeFleetAdvisorLsaAnalysis(DescribeFleetAdvisorLsaAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetAdvisorLsaAnalysis(request);
    }

    @SdkInternalApi
    final DescribeFleetAdvisorLsaAnalysisResult executeDescribeFleetAdvisorLsaAnalysis(
            DescribeFleetAdvisorLsaAnalysisRequest describeFleetAdvisorLsaAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetAdvisorLsaAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAdvisorLsaAnalysisRequest> request = null;
        Response<DescribeFleetAdvisorLsaAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAdvisorLsaAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetAdvisorLsaAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetAdvisorLsaAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetAdvisorLsaAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetAdvisorLsaAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides descriptions of the schemas discovered by your Fleet Advisor collectors.
     * </p>
     * 
     * @param describeFleetAdvisorSchemaObjectSummaryRequest
     * @return Result of the DescribeFleetAdvisorSchemaObjectSummary operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeFleetAdvisorSchemaObjectSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorSchemaObjectSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetAdvisorSchemaObjectSummaryResult describeFleetAdvisorSchemaObjectSummary(DescribeFleetAdvisorSchemaObjectSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetAdvisorSchemaObjectSummary(request);
    }

    @SdkInternalApi
    final DescribeFleetAdvisorSchemaObjectSummaryResult executeDescribeFleetAdvisorSchemaObjectSummary(
            DescribeFleetAdvisorSchemaObjectSummaryRequest describeFleetAdvisorSchemaObjectSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetAdvisorSchemaObjectSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAdvisorSchemaObjectSummaryRequest> request = null;
        Response<DescribeFleetAdvisorSchemaObjectSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAdvisorSchemaObjectSummaryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetAdvisorSchemaObjectSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetAdvisorSchemaObjectSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetAdvisorSchemaObjectSummaryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeFleetAdvisorSchemaObjectSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of schemas detected by Fleet Advisor Collectors in your account.
     * </p>
     * 
     * @param describeFleetAdvisorSchemasRequest
     * @return Result of the DescribeFleetAdvisorSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeFleetAdvisorSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorSchemas"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFleetAdvisorSchemasResult describeFleetAdvisorSchemas(DescribeFleetAdvisorSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetAdvisorSchemas(request);
    }

    @SdkInternalApi
    final DescribeFleetAdvisorSchemasResult executeDescribeFleetAdvisorSchemas(DescribeFleetAdvisorSchemasRequest describeFleetAdvisorSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetAdvisorSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetAdvisorSchemasRequest> request = null;
        Response<DescribeFleetAdvisorSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetAdvisorSchemasRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFleetAdvisorSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetAdvisorSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetAdvisorSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFleetAdvisorSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of instance profiles for your account in the current region.
     * </p>
     * 
     * @param describeInstanceProfilesRequest
     * @return Result of the DescribeInstanceProfiles operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.DescribeInstanceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeInstanceProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeInstanceProfilesResult describeInstanceProfiles(DescribeInstanceProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceProfiles(request);
    }

    @SdkInternalApi
    final DescribeInstanceProfilesResult executeDescribeInstanceProfiles(DescribeInstanceProfilesRequest describeInstanceProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceProfilesRequest> request = null;
        Response<DescribeInstanceProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceProfilesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of metadata model assessments for your account in the current region.
     * </p>
     * 
     * @param describeMetadataModelAssessmentsRequest
     * @return Result of the DescribeMetadataModelAssessments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeMetadataModelAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMetadataModelAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetadataModelAssessmentsResult describeMetadataModelAssessments(DescribeMetadataModelAssessmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetadataModelAssessments(request);
    }

    @SdkInternalApi
    final DescribeMetadataModelAssessmentsResult executeDescribeMetadataModelAssessments(
            DescribeMetadataModelAssessmentsRequest describeMetadataModelAssessmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetadataModelAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetadataModelAssessmentsRequest> request = null;
        Response<DescribeMetadataModelAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetadataModelAssessmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMetadataModelAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetadataModelAssessments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetadataModelAssessmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMetadataModelAssessmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of metadata model conversions for a migration project.
     * </p>
     * 
     * @param describeMetadataModelConversionsRequest
     * @return Result of the DescribeMetadataModelConversions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeMetadataModelConversions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMetadataModelConversions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetadataModelConversionsResult describeMetadataModelConversions(DescribeMetadataModelConversionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetadataModelConversions(request);
    }

    @SdkInternalApi
    final DescribeMetadataModelConversionsResult executeDescribeMetadataModelConversions(
            DescribeMetadataModelConversionsRequest describeMetadataModelConversionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetadataModelConversionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetadataModelConversionsRequest> request = null;
        Response<DescribeMetadataModelConversionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetadataModelConversionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMetadataModelConversionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetadataModelConversions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetadataModelConversionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMetadataModelConversionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of metadata model exports.
     * </p>
     * 
     * @param describeMetadataModelExportsAsScriptRequest
     * @return Result of the DescribeMetadataModelExportsAsScript operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeMetadataModelExportsAsScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMetadataModelExportsAsScript"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetadataModelExportsAsScriptResult describeMetadataModelExportsAsScript(DescribeMetadataModelExportsAsScriptRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetadataModelExportsAsScript(request);
    }

    @SdkInternalApi
    final DescribeMetadataModelExportsAsScriptResult executeDescribeMetadataModelExportsAsScript(
            DescribeMetadataModelExportsAsScriptRequest describeMetadataModelExportsAsScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetadataModelExportsAsScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetadataModelExportsAsScriptRequest> request = null;
        Response<DescribeMetadataModelExportsAsScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetadataModelExportsAsScriptRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMetadataModelExportsAsScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetadataModelExportsAsScript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetadataModelExportsAsScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMetadataModelExportsAsScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of metadata model exports.
     * </p>
     * 
     * @param describeMetadataModelExportsToTargetRequest
     * @return Result of the DescribeMetadataModelExportsToTarget operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeMetadataModelExportsToTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMetadataModelExportsToTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetadataModelExportsToTargetResult describeMetadataModelExportsToTarget(DescribeMetadataModelExportsToTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetadataModelExportsToTarget(request);
    }

    @SdkInternalApi
    final DescribeMetadataModelExportsToTargetResult executeDescribeMetadataModelExportsToTarget(
            DescribeMetadataModelExportsToTargetRequest describeMetadataModelExportsToTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetadataModelExportsToTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetadataModelExportsToTargetRequest> request = null;
        Response<DescribeMetadataModelExportsToTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetadataModelExportsToTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMetadataModelExportsToTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetadataModelExportsToTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetadataModelExportsToTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMetadataModelExportsToTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of metadata model imports.
     * </p>
     * 
     * @param describeMetadataModelImportsRequest
     * @return Result of the DescribeMetadataModelImports operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeMetadataModelImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMetadataModelImports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetadataModelImportsResult describeMetadataModelImports(DescribeMetadataModelImportsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetadataModelImports(request);
    }

    @SdkInternalApi
    final DescribeMetadataModelImportsResult executeDescribeMetadataModelImports(DescribeMetadataModelImportsRequest describeMetadataModelImportsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetadataModelImportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetadataModelImportsRequest> request = null;
        Response<DescribeMetadataModelImportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetadataModelImportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMetadataModelImportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetadataModelImports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetadataModelImportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMetadataModelImportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of migration projects for your account in the current region.
     * </p>
     * 
     * @param describeMigrationProjectsRequest
     * @return Result of the DescribeMigrationProjects operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.DescribeMigrationProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMigrationProjects" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeMigrationProjectsResult describeMigrationProjects(DescribeMigrationProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMigrationProjects(request);
    }

    @SdkInternalApi
    final DescribeMigrationProjectsResult executeDescribeMigrationProjects(DescribeMigrationProjectsRequest describeMigrationProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMigrationProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMigrationProjectsRequest> request = null;
        Response<DescribeMigrationProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMigrationProjectsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMigrationProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMigrationProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMigrationProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMigrationProjectsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a paginated list of limitations for recommendations of target Amazon Web Services engines.
     * </p>
     * 
     * @param describeRecommendationLimitationsRequest
     * @return Result of the DescribeRecommendationLimitations operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.DescribeRecommendationLimitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRecommendationLimitations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRecommendationLimitationsResult describeRecommendationLimitations(DescribeRecommendationLimitationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecommendationLimitations(request);
    }

    @SdkInternalApi
    final DescribeRecommendationLimitationsResult executeDescribeRecommendationLimitations(
            DescribeRecommendationLimitationsRequest describeRecommendationLimitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecommendationLimitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecommendationLimitationsRequest> request = null;
        Response<DescribeRecommendationLimitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecommendationLimitationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRecommendationLimitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecommendationLimitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecommendationLimitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRecommendationLimitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of target engine recommendations for your source databases.
     * </p>
     * 
     * @param describeRecommendationsRequest
     * @return Result of the DescribeRecommendations operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.DescribeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRecommendations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRecommendationsResult describeRecommendations(DescribeRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecommendations(request);
    }

    @SdkInternalApi
    final DescribeRecommendationsResult executeDescribeRecommendations(DescribeRecommendationsRequest describeRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecommendationsRequest> request = null;
        Response<DescribeRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRecommendationsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns one or more existing DMS Serverless replication configurations as a list of structures.
     * </p>
     * 
     * @param describeReplicationConfigsRequest
     * @return Result of the DescribeReplicationConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReplicationConfigsResult describeReplicationConfigs(DescribeReplicationConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationConfigs(request);
    }

    @SdkInternalApi
    final DescribeReplicationConfigsResult executeDescribeReplicationConfigs(DescribeReplicationConfigsRequest describeReplicationConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationConfigsRequest> request = null;
        Response<DescribeReplicationConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationConfigsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns table and schema statistics for one or more provisioned replications that use a given DMS Serverless
     * replication configuration.
     * </p>
     * 
     * @param describeReplicationTableStatisticsRequest
     * @return Result of the DescribeReplicationTableStatistics operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTableStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTableStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationTableStatisticsResult describeReplicationTableStatistics(DescribeReplicationTableStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationTableStatistics(request);
    }

    @SdkInternalApi
    final DescribeReplicationTableStatisticsResult executeDescribeReplicationTableStatistics(
            DescribeReplicationTableStatisticsRequest describeReplicationTableStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationTableStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTableStatisticsRequest> request = null;
        Response<DescribeReplicationTableStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTableStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationTableStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationTableStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationTableStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationTableStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the task assessment results from the Amazon S3 bucket that DMS creates in your Amazon Web Services
     * account. This action always returns the latest results.
     * </p>
     * <p>
     * For more information about DMS task assessments, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Creating a task
     * assessment report</a> in the <i>Database Migration Service User Guide</i>.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a paginated list of premigration assessment runs based on filter settings.
     * </p>
     * <p>
     * These filter settings can specify a combination of premigration assessment runs, migration tasks, replication
     * instances, and assessment run status values.
     * </p>
     * <note>
     * <p>
     * This operation doesn't return information about individual assessments. For this information, see the
     * <code>DescribeReplicationTaskIndividualAssessments</code> operation.
     * </p>
     * </note>
     * 
     * @param describeReplicationTaskAssessmentRunsRequest
     * @return Result of the DescribeReplicationTaskAssessmentRuns operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTaskAssessmentRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentRuns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationTaskAssessmentRunsResult describeReplicationTaskAssessmentRuns(DescribeReplicationTaskAssessmentRunsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationTaskAssessmentRuns(request);
    }

    @SdkInternalApi
    final DescribeReplicationTaskAssessmentRunsResult executeDescribeReplicationTaskAssessmentRuns(
            DescribeReplicationTaskAssessmentRunsRequest describeReplicationTaskAssessmentRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationTaskAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTaskAssessmentRunsRequest> request = null;
        Response<DescribeReplicationTaskAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTaskAssessmentRunsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationTaskAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationTaskAssessmentRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationTaskAssessmentRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReplicationTaskAssessmentRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a paginated list of individual assessments based on filter settings.
     * </p>
     * <p>
     * These filter settings can specify a combination of premigration assessment runs, migration tasks, and assessment
     * status values.
     * </p>
     * 
     * @param describeReplicationTaskIndividualAssessmentsRequest
     * @return Result of the DescribeReplicationTaskIndividualAssessments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTaskIndividualAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskIndividualAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationTaskIndividualAssessmentsResult describeReplicationTaskIndividualAssessments(
            DescribeReplicationTaskIndividualAssessmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationTaskIndividualAssessments(request);
    }

    @SdkInternalApi
    final DescribeReplicationTaskIndividualAssessmentsResult executeDescribeReplicationTaskIndividualAssessments(
            DescribeReplicationTaskIndividualAssessmentsRequest describeReplicationTaskIndividualAssessmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationTaskIndividualAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTaskIndividualAssessmentsRequest> request = null;
        Response<DescribeReplicationTaskIndividualAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTaskIndividualAssessmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationTaskIndividualAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationTaskIndividualAssessments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationTaskIndividualAssessmentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeReplicationTaskIndividualAssessmentsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Provides details on replication progress by returning status information for one or more provisioned DMS
     * Serverless replications.
     * </p>
     * 
     * @param describeReplicationsRequest
     * @return Result of the DescribeReplications operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeReplicationsResult describeReplications(DescribeReplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplications(request);
    }

    @SdkInternalApi
    final DescribeReplicationsResult executeDescribeReplications(DescribeReplicationsRequest describeReplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationsRequest> request = null;
        Response<DescribeReplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeReplicationsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Note that the "last updated" column the DMS console only indicates the time that DMS last updated the table
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Saves a copy of a database migration assessment report to your Amazon S3 bucket. DMS can save your assessment
     * report as a comma-separated value (CSV) or a PDF file.
     * </p>
     * 
     * @param exportMetadataModelAssessmentRequest
     * @return Result of the ExportMetadataModelAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.ExportMetadataModelAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ExportMetadataModelAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportMetadataModelAssessmentResult exportMetadataModelAssessment(ExportMetadataModelAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeExportMetadataModelAssessment(request);
    }

    @SdkInternalApi
    final ExportMetadataModelAssessmentResult executeExportMetadataModelAssessment(ExportMetadataModelAssessmentRequest exportMetadataModelAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(exportMetadataModelAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportMetadataModelAssessmentRequest> request = null;
        Response<ExportMetadataModelAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportMetadataModelAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportMetadataModelAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportMetadataModelAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportMetadataModelAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportMetadataModelAssessmentResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Lists all metadata tags attached to an DMS resource, including replication instance, endpoint, subnet group, and
     * migration task. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Modifies the specified schema conversion configuration using the provided parameters.
     * </p>
     * 
     * @param modifyConversionConfigurationRequest
     * @return Result of the ModifyConversionConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.ModifyConversionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyConversionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyConversionConfigurationResult modifyConversionConfiguration(ModifyConversionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeModifyConversionConfiguration(request);
    }

    @SdkInternalApi
    final ModifyConversionConfigurationResult executeModifyConversionConfiguration(ModifyConversionConfigurationRequest modifyConversionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyConversionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyConversionConfigurationRequest> request = null;
        Response<ModifyConversionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyConversionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyConversionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyConversionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyConversionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyConversionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified data provider using the provided settings.
     * </p>
     * <note>
     * <p>
     * You must remove the data provider from all migration projects before you can modify it.
     * </p>
     * </note>
     * 
     * @param modifyDataProviderRequest
     * @return Result of the ModifyDataProvider operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.ModifyDataProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyDataProvider" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyDataProviderResult modifyDataProvider(ModifyDataProviderRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDataProvider(request);
    }

    @SdkInternalApi
    final ModifyDataProviderResult executeModifyDataProvider(ModifyDataProviderRequest modifyDataProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDataProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDataProviderRequest> request = null;
        Response<ModifyDataProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDataProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyDataProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDataProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyDataProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ModifyDataProviderResultJsonUnmarshaller());
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
     * <note>
     * <p>
     * For a MySQL source or target endpoint, don't explicitly specify the database using the <code>DatabaseName</code>
     * request parameter on the <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you
     * modify a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     * the database only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * </note>
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
     *         DMS cannot access the KMS key.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Modifies an existing DMS event notification subscription.
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
     *         The ciphertext references a key that doesn't exist or that the DMS account doesn't have access to.
     * @throws KMSDisabledException
     *         The specified KMS key isn't enabled.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Modifies the specified instance profile using the provided parameters.
     * </p>
     * <note>
     * <p>
     * All migration projects associated with the instance profile must be deleted or modified before you can modify the
     * instance profile.
     * </p>
     * </note>
     * 
     * @param modifyInstanceProfileRequest
     * @return Result of the ModifyInstanceProfile operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.ModifyInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyInstanceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyInstanceProfileResult modifyInstanceProfile(ModifyInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeModifyInstanceProfile(request);
    }

    @SdkInternalApi
    final ModifyInstanceProfileResult executeModifyInstanceProfile(ModifyInstanceProfileRequest modifyInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyInstanceProfileRequest> request = null;
        Response<ModifyInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyInstanceProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ModifyInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified migration project using the provided parameters.
     * </p>
     * <note>
     * <p>
     * The migration project must be closed before you can modify it.
     * </p>
     * </note>
     * 
     * @param modifyMigrationProjectRequest
     * @return Result of the ModifyMigrationProject operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.ModifyMigrationProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyMigrationProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyMigrationProjectResult modifyMigrationProject(ModifyMigrationProjectRequest request) {
        request = beforeClientExecution(request);
        return executeModifyMigrationProject(request);
    }

    @SdkInternalApi
    final ModifyMigrationProjectResult executeModifyMigrationProject(ModifyMigrationProjectRequest modifyMigrationProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyMigrationProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyMigrationProjectRequest> request = null;
        Response<ModifyMigrationProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyMigrationProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyMigrationProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyMigrationProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyMigrationProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyMigrationProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing DMS Serverless replication configuration that you can use to start a replication. This
     * command includes input validation and logic to check the state of any replication that uses this configuration.
     * You can only modify a replication configuration before any replication that uses it has started. As soon as you
     * have initially started a replication with a given configuiration, you can't modify that configuration, even if
     * you stop it.
     * </p>
     * <p>
     * Other run statuses that allow you to run this command include FAILED and CREATED. A provisioning state that
     * allows you to run this command is FAILED_PROVISION.
     * </p>
     * 
     * @param modifyReplicationConfigRequest
     * @return Result of the ModifyReplicationConfig operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided isn't valid.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.ModifyReplicationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ModifyReplicationConfigResult modifyReplicationConfig(ModifyReplicationConfigRequest request) {
        request = beforeClientExecution(request);
        return executeModifyReplicationConfig(request);
    }

    @SdkInternalApi
    final ModifyReplicationConfigResult executeModifyReplicationConfig(ModifyReplicationConfigRequest modifyReplicationConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyReplicationConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationConfigRequest> request = null;
        Response<ModifyReplicationConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyReplicationConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyReplicationConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyReplicationConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyReplicationConfigResultJsonUnmarshaller());
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
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     *         The subnet provided isn't valid.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * For more information about DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks</a> in the
     * <i>Database Migration Service User Guide</i>.
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
     *         DMS cannot access the KMS key.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Moves a replication task from its current replication instance to a different target replication instance using
     * the specified parameters. The target replication instance must be created with the same or later DMS version as
     * the current replication instance.
     * </p>
     * 
     * @param moveReplicationTaskRequest
     * @return Result of the MoveReplicationTask operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.MoveReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MoveReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public MoveReplicationTaskResult moveReplicationTask(MoveReplicationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeMoveReplicationTask(request);
    }

    @SdkInternalApi
    final MoveReplicationTaskResult executeMoveReplicationTask(MoveReplicationTaskRequest moveReplicationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(moveReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MoveReplicationTaskRequest> request = null;
        Response<MoveReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MoveReplicationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(moveReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MoveReplicationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MoveReplicationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new MoveReplicationTaskResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         DMS cannot access the KMS key.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Reloads the target database table with the source data for a given DMS Serverless replication configuration.
     * </p>
     * <p>
     * You can only use this operation with a task in the RUNNING state, otherwise the service will throw an
     * <code>InvalidResourceStateFault</code> exception.
     * </p>
     * 
     * @param reloadReplicationTablesRequest
     * @return Result of the ReloadReplicationTables operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.ReloadReplicationTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadReplicationTables" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ReloadReplicationTablesResult reloadReplicationTables(ReloadReplicationTablesRequest request) {
        request = beforeClientExecution(request);
        return executeReloadReplicationTables(request);
    }

    @SdkInternalApi
    final ReloadReplicationTablesResult executeReloadReplicationTables(ReloadReplicationTablesRequest reloadReplicationTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(reloadReplicationTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReloadReplicationTablesRequest> request = null;
        Response<ReloadReplicationTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReloadReplicationTablesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(reloadReplicationTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReloadReplicationTables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReloadReplicationTablesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ReloadReplicationTablesResultJsonUnmarshaller());
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
     * <p>
     * You can only use this operation with a task in the <code>RUNNING</code> state, otherwise the service will throw
     * an <code>InvalidResourceStateFault</code> exception.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Removes metadata tags from an DMS resource, including replication instance, endpoint, subnet group, and migration
     * task. For more information, see <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html">
     * <code>Tag</code> </a> data type description.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Removes one or more tags from an DMS resource.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Runs large-scale assessment (LSA) analysis on every Fleet Advisor collector in your account.
     * </p>
     * 
     * @param runFleetAdvisorLsaAnalysisRequest
     * @return Result of the RunFleetAdvisorLsaAnalysis operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.RunFleetAdvisorLsaAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RunFleetAdvisorLsaAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RunFleetAdvisorLsaAnalysisResult runFleetAdvisorLsaAnalysis(RunFleetAdvisorLsaAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeRunFleetAdvisorLsaAnalysis(request);
    }

    @SdkInternalApi
    final RunFleetAdvisorLsaAnalysisResult executeRunFleetAdvisorLsaAnalysis(RunFleetAdvisorLsaAnalysisRequest runFleetAdvisorLsaAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(runFleetAdvisorLsaAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunFleetAdvisorLsaAnalysisRequest> request = null;
        Response<RunFleetAdvisorLsaAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunFleetAdvisorLsaAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(runFleetAdvisorLsaAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RunFleetAdvisorLsaAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RunFleetAdvisorLsaAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RunFleetAdvisorLsaAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies the extension pack to your target database. An extension pack is an add-on module that emulates functions
     * present in a source database that are required when converting objects to the target database.
     * </p>
     * 
     * @param startExtensionPackAssociationRequest
     * @return Result of the StartExtensionPackAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.StartExtensionPackAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartExtensionPackAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartExtensionPackAssociationResult startExtensionPackAssociation(StartExtensionPackAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeStartExtensionPackAssociation(request);
    }

    @SdkInternalApi
    final StartExtensionPackAssociationResult executeStartExtensionPackAssociation(StartExtensionPackAssociationRequest startExtensionPackAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(startExtensionPackAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExtensionPackAssociationRequest> request = null;
        Response<StartExtensionPackAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartExtensionPackAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startExtensionPackAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartExtensionPackAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartExtensionPackAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartExtensionPackAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a database migration assessment report by assessing the migration complexity for your source database. A
     * database migration assessment report summarizes all of the schema conversion tasks. It also details the action
     * items for database objects that can't be converted to the database engine of your target database instance.
     * </p>
     * 
     * @param startMetadataModelAssessmentRequest
     * @return Result of the StartMetadataModelAssessment operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.StartMetadataModelAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMetadataModelAssessmentResult startMetadataModelAssessment(StartMetadataModelAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeStartMetadataModelAssessment(request);
    }

    @SdkInternalApi
    final StartMetadataModelAssessmentResult executeStartMetadataModelAssessment(StartMetadataModelAssessmentRequest startMetadataModelAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(startMetadataModelAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMetadataModelAssessmentRequest> request = null;
        Response<StartMetadataModelAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMetadataModelAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMetadataModelAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMetadataModelAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMetadataModelAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMetadataModelAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Converts your source database objects to a format compatible with the target database.
     * </p>
     * 
     * @param startMetadataModelConversionRequest
     * @return Result of the StartMetadataModelConversion operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.StartMetadataModelConversion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelConversion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMetadataModelConversionResult startMetadataModelConversion(StartMetadataModelConversionRequest request) {
        request = beforeClientExecution(request);
        return executeStartMetadataModelConversion(request);
    }

    @SdkInternalApi
    final StartMetadataModelConversionResult executeStartMetadataModelConversion(StartMetadataModelConversionRequest startMetadataModelConversionRequest) {

        ExecutionContext executionContext = createExecutionContext(startMetadataModelConversionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMetadataModelConversionRequest> request = null;
        Response<StartMetadataModelConversionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMetadataModelConversionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMetadataModelConversionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMetadataModelConversion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMetadataModelConversionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMetadataModelConversionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Saves your converted code to a file as a SQL script, and stores this file on your Amazon S3 bucket.
     * </p>
     * 
     * @param startMetadataModelExportAsScriptRequest
     * @return Result of the StartMetadataModelExportAsScript operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.StartMetadataModelExportAsScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelExportAsScript"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMetadataModelExportAsScriptResult startMetadataModelExportAsScript(StartMetadataModelExportAsScriptRequest request) {
        request = beforeClientExecution(request);
        return executeStartMetadataModelExportAsScript(request);
    }

    @SdkInternalApi
    final StartMetadataModelExportAsScriptResult executeStartMetadataModelExportAsScript(
            StartMetadataModelExportAsScriptRequest startMetadataModelExportAsScriptRequest) {

        ExecutionContext executionContext = createExecutionContext(startMetadataModelExportAsScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMetadataModelExportAsScriptRequest> request = null;
        Response<StartMetadataModelExportAsScriptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMetadataModelExportAsScriptRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMetadataModelExportAsScriptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMetadataModelExportAsScript");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMetadataModelExportAsScriptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMetadataModelExportAsScriptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies converted database objects to your target database.
     * </p>
     * 
     * @param startMetadataModelExportToTargetRequest
     * @return Result of the StartMetadataModelExportToTarget operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.StartMetadataModelExportToTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelExportToTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMetadataModelExportToTargetResult startMetadataModelExportToTarget(StartMetadataModelExportToTargetRequest request) {
        request = beforeClientExecution(request);
        return executeStartMetadataModelExportToTarget(request);
    }

    @SdkInternalApi
    final StartMetadataModelExportToTargetResult executeStartMetadataModelExportToTarget(
            StartMetadataModelExportToTargetRequest startMetadataModelExportToTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(startMetadataModelExportToTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMetadataModelExportToTargetRequest> request = null;
        Response<StartMetadataModelExportToTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMetadataModelExportToTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMetadataModelExportToTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMetadataModelExportToTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMetadataModelExportToTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMetadataModelExportToTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Loads the metadata for all the dependent database objects of the parent object.
     * </p>
     * <p>
     * This operation uses your project's Amazon S3 bucket as a metadata cache to improve performance.
     * </p>
     * 
     * @param startMetadataModelImportRequest
     * @return Result of the StartMetadataModelImport operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @sample AWSDatabaseMigrationService.StartMetadataModelImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelImport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartMetadataModelImportResult startMetadataModelImport(StartMetadataModelImportRequest request) {
        request = beforeClientExecution(request);
        return executeStartMetadataModelImport(request);
    }

    @SdkInternalApi
    final StartMetadataModelImportResult executeStartMetadataModelImport(StartMetadataModelImportRequest startMetadataModelImportRequest) {

        ExecutionContext executionContext = createExecutionContext(startMetadataModelImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMetadataModelImportRequest> request = null;
        Response<StartMetadataModelImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMetadataModelImportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMetadataModelImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMetadataModelImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMetadataModelImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMetadataModelImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the analysis of your source database to provide recommendations of target engines.
     * </p>
     * <p>
     * You can create recommendations for multiple source databases using <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_BatchStartRecommendations.html"
     * >BatchStartRecommendations</a>.
     * </p>
     * 
     * @param startRecommendationsRequest
     * @return Result of the StartRecommendations operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.StartRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartRecommendations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartRecommendationsResult startRecommendations(StartRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeStartRecommendations(request);
    }

    @SdkInternalApi
    final StartRecommendationsResult executeStartRecommendations(StartRecommendationsRequest startRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(startRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRecommendationsRequest> request = null;
        Response<StartRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a given DMS Serverless replication configuration, DMS connects to the source endpoint and collects the
     * metadata to analyze the replication workload. Using this metadata, DMS then computes and provisions the required
     * capacity and starts replicating to the target endpoint using the server resources that DMS has provisioned for
     * the DMS Serverless replication.
     * </p>
     * 
     * @param startReplicationRequest
     * @return Result of the StartReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartReplicationResult startReplication(StartReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStartReplication(request);
    }

    @SdkInternalApi
    final StartReplicationResult executeStartReplication(StartReplicationRequest startReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(startReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationRequest> request = null;
        Response<StartReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartReplicationResultJsonUnmarshaller());
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
     * For more information about DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks </a> in the
     * <i>Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @return Result of the StartReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * You can only use this operation for a task if the following conditions are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task must be in the <code>stopped</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * The task must have successful connections to the source and target.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If either of these conditions are not met, an <code>InvalidResourceStateFault</code> error will result.
     * </p>
     * <p>
     * For information about DMS task assessments, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Creating a task
     * assessment report</a> in the <i>Database Migration Service User Guide</i>.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Starts a new premigration assessment run for one or more individual assessments of a migration task.
     * </p>
     * <p>
     * The assessments that you can specify depend on the source and target database engine and the migration type
     * defined for the given task. To run this operation, your migration task must already be created. After you run
     * this operation, you can review the status of each individual assessment. You can also run the migration task
     * manually after the assessment run and its individual assessments complete.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRunRequest
     * @return Result of the StartReplicationTaskAssessmentRun operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or that the DMS account doesn't have access to.
     * @throws KMSDisabledException
     *         The specified KMS key isn't enabled.
     * @throws KMSException
     *         An Key Management Service (KMS) error is preventing access to KMS.
     * @throws KMSInvalidStateException
     *         The state of the specified KMS resource isn't valid for this request.
     * @throws KMSNotFoundException
     *         The specified KMS entity or resource can't be found.
     * @throws KMSKeyNotAccessibleException
     *         DMS cannot access the KMS key.
     * @throws S3AccessDeniedException
     *         Insufficient privileges are preventing access to an Amazon S3 object.
     * @throws S3ResourceNotFoundException
     *         A specified Amazon S3 bucket, bucket folder, or other object can't be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @sample AWSDatabaseMigrationService.StartReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartReplicationTaskAssessmentRunResult startReplicationTaskAssessmentRun(StartReplicationTaskAssessmentRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartReplicationTaskAssessmentRun(request);
    }

    @SdkInternalApi
    final StartReplicationTaskAssessmentRunResult executeStartReplicationTaskAssessmentRun(
            StartReplicationTaskAssessmentRunRequest startReplicationTaskAssessmentRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startReplicationTaskAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationTaskAssessmentRunRequest> request = null;
        Response<StartReplicationTaskAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationTaskAssessmentRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startReplicationTaskAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReplicationTaskAssessmentRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReplicationTaskAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartReplicationTaskAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a given DMS Serverless replication configuration, DMS stops any and all ongoing DMS Serverless replications.
     * This command doesn't deprovision the stopped replications.
     * </p>
     * 
     * @param stopReplicationRequest
     * @return Result of the StopReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.StopReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StopReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopReplicationResult stopReplication(StopReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStopReplication(request);
    }

    @SdkInternalApi
    final StopReplicationResult executeStopReplication(StopReplicationRequest stopReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopReplicationRequest> request = null;
        Response<StopReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopReplicationResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     *         DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Migrates 10 active and enabled Amazon SNS subscriptions at a time and converts them to corresponding Amazon
     * EventBridge rules. By default, this operation migrates subscriptions only when all your replication instance
     * versions are 3.4.5 or higher. If any replication instances are from versions earlier than 3.4.5, the operation
     * raises an error and tells you to upgrade these instances to version 3.4.5 or higher. To enable migration
     * regardless of version, set the <code>Force</code> option to true. However, if you don't upgrade instances earlier
     * than version 3.4.5, some types of events might not be available when you use Amazon EventBridge.
     * </p>
     * <p>
     * To call this operation, make sure that you have certain permissions added to your user account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html#CHAP_Events-migrate-to-eventbridge"
     * >Migrating event subscriptions to Amazon EventBridge</a> in the <i>Amazon Web Services Database Migration Service
     * User Guide</i>.
     * </p>
     * 
     * @param updateSubscriptionsToEventBridgeRequest
     * @return Result of the UpdateSubscriptionsToEventBridge operation returned by the service.
     * @throws AccessDeniedException
     *         DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.UpdateSubscriptionsToEventBridge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/UpdateSubscriptionsToEventBridge"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubscriptionsToEventBridgeResult updateSubscriptionsToEventBridge(UpdateSubscriptionsToEventBridgeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriptionsToEventBridge(request);
    }

    @SdkInternalApi
    final UpdateSubscriptionsToEventBridgeResult executeUpdateSubscriptionsToEventBridge(
            UpdateSubscriptionsToEventBridgeRequest updateSubscriptionsToEventBridgeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriptionsToEventBridgeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionsToEventBridgeRequest> request = null;
        Response<UpdateSubscriptionsToEventBridgeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionsToEventBridgeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubscriptionsToEventBridgeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Database Migration Service");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscriptionsToEventBridge");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriptionsToEventBridgeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSubscriptionsToEventBridgeResultJsonUnmarshaller());
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
