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
package com.amazonaws.services.servermigration;

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

import com.amazonaws.services.servermigration.AWSServerMigrationClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.services.servermigration.model.transform.*;

/**
 * Client for accessing SMS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AAWS Sever Migration Service</fullname>
 * <p>
 * This is the <i>AWS Sever Migration Service API Reference</i>. It provides descriptions, syntax, and usage examples
 * for each of the actions and data types for the AWS Sever Migration Service (AWS SMS). The topic for each action shows
 * the Query API request parameters and the XML response. You can also view the XML request elements in the WSDL.
 * </p>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * To learn more about the Server Migration Service, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://aws.amazon.com/server-migration-service/">AWS Sever Migration Service product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/server-migration-service/latest/userguide/server-migration.html">AWS Sever
 * Migration Service User Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServerMigrationClient extends AmazonWebServiceClient implements AWSServerMigration {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSServerMigration.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sms";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TemporarilyUnavailableException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.TemporarilyUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingRequiredParameterException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.MissingRequiredParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplicationJobNotFoundException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.ReplicationJobNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.OperationNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalError").withModeledClass(
                                    com.amazonaws.services.servermigration.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerCannotBeReplicatedException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.ServerCannotBeReplicatedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplicationRunLimitExceededException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.ReplicationRunLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedOperationException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.UnauthorizedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplicationJobAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.ReplicationJobAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoConnectorsAvailableException").withModeledClass(
                                    com.amazonaws.services.servermigration.model.NoConnectorsAvailableException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.servermigration.model.AWSServerMigrationException.class));

    /**
     * Constructs a new client to invoke service methods on SMS. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     * @deprecated use {@link AWSServerMigrationClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSServerMigrationClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on SMS. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSServerMigrationClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServerMigrationClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSServerMigrationClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSServerMigrationClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSServerMigrationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AWSServerMigrationClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServerMigrationClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSServerMigrationClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSServerMigrationClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AWSServerMigrationClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSServerMigrationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to SMS (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSServerMigrationClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSServerMigrationClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSServerMigrationClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSServerMigrationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSServerMigrationClientBuilder builder() {
        return AWSServerMigrationClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServerMigrationClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SMS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServerMigrationClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sms.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/servermigration/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/servermigration/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an application. An application consists of one or more server groups. Each server group contain one or
     * more servers.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApp(request);
    }

    @SdkInternalApi
    final CreateAppResult executeCreateApp(CreateAppRequest createAppRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
     * AWS. Each replication run creates an Amazon Machine Image (AMI).
     * </p>
     * 
     * @param createReplicationJobRequest
     * @return Result of the CreateReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ServerCannotBeReplicatedException
     *         The specified server cannot be replicated.
     * @throws ReplicationJobAlreadyExistsException
     *         The specified replication job already exists.
     * @throws NoConnectorsAvailableException
     *         There are no connectors available.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws TemporarilyUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSServerMigration.CreateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReplicationJobResult createReplicationJob(CreateReplicationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationJob(request);
    }

    @SdkInternalApi
    final CreateReplicationJobResult executeCreateReplicationJob(CreateReplicationJobRequest createReplicationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationJobRequest> request = null;
        Response<CreateReplicationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReplicationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateReplicationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing application. Optionally deletes the launched stack associated with the application and all
     * AWS SMS replication jobs for servers in the application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppResult deleteApp(DeleteAppRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApp(request);
    }

    @SdkInternalApi
    final DeleteAppResult executeDeleteApp(DeleteAppRequest deleteAppRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<DeleteAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes existing launch configuration for an application.
     * </p>
     * 
     * @param deleteAppLaunchConfigurationRequest
     * @return Result of the DeleteAppLaunchConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.DeleteAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppLaunchConfigurationResult deleteAppLaunchConfiguration(DeleteAppLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppLaunchConfiguration(request);
    }

    @SdkInternalApi
    final DeleteAppLaunchConfigurationResult executeDeleteAppLaunchConfiguration(DeleteAppLaunchConfigurationRequest deleteAppLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppLaunchConfigurationRequest> request = null;
        Response<DeleteAppLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppLaunchConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAppLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppLaunchConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAppLaunchConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes existing replication configuration for an application.
     * </p>
     * 
     * @param deleteAppReplicationConfigurationRequest
     * @return Result of the DeleteAppReplicationConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.DeleteAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppReplicationConfigurationResult deleteAppReplicationConfiguration(DeleteAppReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppReplicationConfiguration(request);
    }

    @SdkInternalApi
    final DeleteAppReplicationConfigurationResult executeDeleteAppReplicationConfiguration(
            DeleteAppReplicationConfigurationRequest deleteAppReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppReplicationConfigurationRequest> request = null;
        Response<DeleteAppReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAppReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppReplicationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAppReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified replication job.
     * </p>
     * <p>
     * After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
     * S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
     * </p>
     * 
     * @param deleteReplicationJobRequest
     * @return Result of the DeleteReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ReplicationJobNotFoundException
     *         The specified replication job does not exist.
     * @sample AWSServerMigration.DeleteReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReplicationJobResult deleteReplicationJob(DeleteReplicationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationJob(request);
    }

    @SdkInternalApi
    final DeleteReplicationJobResult executeDeleteReplicationJob(DeleteReplicationJobRequest deleteReplicationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationJobRequest> request = null;
        Response<DeleteReplicationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReplicationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReplicationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all servers from your server catalog.
     * </p>
     * 
     * @param deleteServerCatalogRequest
     * @return Result of the DeleteServerCatalog operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @sample AWSServerMigration.DeleteServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServerCatalogResult deleteServerCatalog(DeleteServerCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServerCatalog(request);
    }

    @SdkInternalApi
    final DeleteServerCatalogResult executeDeleteServerCatalog(DeleteServerCatalogRequest deleteServerCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServerCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServerCatalogRequest> request = null;
        Response<DeleteServerCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServerCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServerCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServerCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServerCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServerCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified connector from AWS SMS.
     * </p>
     * <p>
     * After you disassociate a connector, it is no longer available to support replication jobs.
     * </p>
     * 
     * @param disassociateConnectorRequest
     * @return Result of the DisassociateConnector operation returned by the service.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @sample AWSServerMigration.DisassociateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DisassociateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateConnectorResult disassociateConnector(DisassociateConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateConnector(request);
    }

    @SdkInternalApi
    final DisassociateConnectorResult executeDisassociateConnector(DisassociateConnectorRequest disassociateConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConnectorRequest> request = null;
        Response<DisassociateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateConnectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
     * customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateChangeSetRequest
     * @return Result of the GenerateChangeSet operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GenerateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateChangeSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateChangeSetResult generateChangeSet(GenerateChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateChangeSet(request);
    }

    @SdkInternalApi
    final GenerateChangeSetResult executeGenerateChangeSet(GenerateChangeSetRequest generateChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(generateChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateChangeSetRequest> request = null;
        Response<GenerateChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon
     * S3 object in the customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateTemplateRequest
     * @return Result of the GenerateTemplate operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GenerateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateTemplateResult generateTemplate(GenerateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateTemplate(request);
    }

    @SdkInternalApi
    final GenerateTemplateResult executeGenerateTemplate(GenerateTemplateRequest generateTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(generateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateTemplateRequest> request = null;
        Response<GenerateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @return Result of the GetApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppResult getApp(GetAppRequest request) {
        request = beforeClientExecution(request);
        return executeGetApp(request);
    }

    @SdkInternalApi
    final GetAppResult executeGetApp(GetAppRequest getAppRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppRequest> request = null;
        Response<GetAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the application launch configuration associated with an application.
     * </p>
     * 
     * @param getAppLaunchConfigurationRequest
     * @return Result of the GetAppLaunchConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GetAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAppLaunchConfigurationResult getAppLaunchConfiguration(GetAppLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppLaunchConfiguration(request);
    }

    @SdkInternalApi
    final GetAppLaunchConfigurationResult executeGetAppLaunchConfiguration(GetAppLaunchConfigurationRequest getAppLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppLaunchConfigurationRequest> request = null;
        Response<GetAppLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppLaunchConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAppLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppLaunchConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAppLaunchConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an application replication configuration associatd with an application.
     * </p>
     * 
     * @param getAppReplicationConfigurationRequest
     * @return Result of the GetAppReplicationConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GetAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAppReplicationConfigurationResult getAppReplicationConfiguration(GetAppReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppReplicationConfiguration(request);
    }

    @SdkInternalApi
    final GetAppReplicationConfigurationResult executeGetAppReplicationConfiguration(GetAppReplicationConfigurationRequest getAppReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppReplicationConfigurationRequest> request = null;
        Response<GetAppReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAppReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppReplicationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAppReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the connectors registered with the AWS SMS.
     * </p>
     * 
     * @param getConnectorsRequest
     * @return Result of the GetConnectors operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetConnectorsResult getConnectors(GetConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnectors(request);
    }

    @SdkInternalApi
    final GetConnectorsResult executeGetConnectors(GetConnectorsRequest getConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectorsRequest> request = null;
        Response<GetConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified replication job or all of your replication jobs.
     * </p>
     * 
     * @param getReplicationJobsRequest
     * @return Result of the GetReplicationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetReplicationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReplicationJobsResult getReplicationJobs(GetReplicationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeGetReplicationJobs(request);
    }

    @SdkInternalApi
    final GetReplicationJobsResult executeGetReplicationJobs(GetReplicationJobsRequest getReplicationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(getReplicationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReplicationJobsRequest> request = null;
        Response<GetReplicationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReplicationJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReplicationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReplicationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReplicationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReplicationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the replication runs for the specified replication job.
     * </p>
     * 
     * @param getReplicationRunsRequest
     * @return Result of the GetReplicationRuns operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetReplicationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReplicationRunsResult getReplicationRuns(GetReplicationRunsRequest request) {
        request = beforeClientExecution(request);
        return executeGetReplicationRuns(request);
    }

    @SdkInternalApi
    final GetReplicationRunsResult executeGetReplicationRuns(GetReplicationRunsRequest getReplicationRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(getReplicationRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReplicationRunsRequest> request = null;
        Response<GetReplicationRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReplicationRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReplicationRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReplicationRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReplicationRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReplicationRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the servers in your server catalog.
     * </p>
     * <p>
     * Before you can describe your servers, you must import them using <a>ImportServerCatalog</a>.
     * </p>
     * 
     * @param getServersRequest
     * @return Result of the GetServers operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetServers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServersResult getServers(GetServersRequest request) {
        request = beforeClientExecution(request);
        return executeGetServers(request);
    }

    @SdkInternalApi
    final GetServersResult executeGetServers(GetServersRequest getServersRequest) {

        ExecutionContext executionContext = createExecutionContext(getServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServersRequest> request = null;
        Response<GetServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you
     * want to import.
     * </p>
     * <p>
     * This call returns immediately, but might take additional time to retrieve all the servers.
     * </p>
     * 
     * @param importServerCatalogRequest
     * @return Result of the ImportServerCatalog operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws NoConnectorsAvailableException
     *         There are no connectors available.
     * @sample AWSServerMigration.ImportServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportServerCatalogResult importServerCatalog(ImportServerCatalogRequest request) {
        request = beforeClientExecution(request);
        return executeImportServerCatalog(request);
    }

    @SdkInternalApi
    final ImportServerCatalogResult executeImportServerCatalog(ImportServerCatalogRequest importServerCatalogRequest) {

        ExecutionContext executionContext = createExecutionContext(importServerCatalogRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportServerCatalogRequest> request = null;
        Response<ImportServerCatalogResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportServerCatalogRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importServerCatalogRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportServerCatalog");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportServerCatalogResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportServerCatalogResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launches an application stack.
     * </p>
     * 
     * @param launchAppRequest
     * @return Result of the LaunchApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.LaunchApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/LaunchApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public LaunchAppResult launchApp(LaunchAppRequest request) {
        request = beforeClientExecution(request);
        return executeLaunchApp(request);
    }

    @SdkInternalApi
    final LaunchAppResult executeLaunchApp(LaunchAppRequest launchAppRequest) {

        ExecutionContext executionContext = createExecutionContext(launchAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LaunchAppRequest> request = null;
        Response<LaunchAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LaunchAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(launchAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LaunchApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LaunchAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new LaunchAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of summaries for all applications.
     * </p>
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppsResult listApps(ListAppsRequest request) {
        request = beforeClientExecution(request);
        return executeListApps(request);
    }

    @SdkInternalApi
    final ListAppsResult executeListApps(ListAppsRequest listAppsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsRequest> request = null;
        Response<ListAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a launch configuration for an application.
     * </p>
     * 
     * @param putAppLaunchConfigurationRequest
     * @return Result of the PutAppLaunchConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.PutAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAppLaunchConfigurationResult putAppLaunchConfiguration(PutAppLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutAppLaunchConfiguration(request);
    }

    @SdkInternalApi
    final PutAppLaunchConfigurationResult executePutAppLaunchConfiguration(PutAppLaunchConfigurationRequest putAppLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putAppLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAppLaunchConfigurationRequest> request = null;
        Response<PutAppLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAppLaunchConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAppLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAppLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAppLaunchConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAppLaunchConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a replication configuration for an application.
     * </p>
     * 
     * @param putAppReplicationConfigurationRequest
     * @return Result of the PutAppReplicationConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.PutAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAppReplicationConfigurationResult putAppReplicationConfiguration(PutAppReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutAppReplicationConfiguration(request);
    }

    @SdkInternalApi
    final PutAppReplicationConfigurationResult executePutAppReplicationConfiguration(PutAppReplicationConfigurationRequest putAppReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putAppReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAppReplicationConfigurationRequest> request = null;
        Response<PutAppReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAppReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAppReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAppReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAppReplicationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAppReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts replicating an application.
     * </p>
     * 
     * @param startAppReplicationRequest
     * @return Result of the StartAppReplication operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.StartAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartAppReplicationResult startAppReplication(StartAppReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStartAppReplication(request);
    }

    @SdkInternalApi
    final StartAppReplicationResult executeStartAppReplication(StartAppReplicationRequest startAppReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(startAppReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAppReplicationRequest> request = null;
        Response<StartAppReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAppReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAppReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAppReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAppReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartAppReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
     * This replication run is in addition to the ones already scheduled.
     * </p>
     * <p>
     * There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
     * </p>
     * 
     * @param startOnDemandReplicationRunRequest
     * @return Result of the StartOnDemandReplicationRun operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ReplicationRunLimitExceededException
     *         You have exceeded the number of on-demand replication runs you can request in a 24-hour period.
     * @sample AWSServerMigration.StartOnDemandReplicationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandReplicationRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartOnDemandReplicationRunResult startOnDemandReplicationRun(StartOnDemandReplicationRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartOnDemandReplicationRun(request);
    }

    @SdkInternalApi
    final StartOnDemandReplicationRunResult executeStartOnDemandReplicationRun(StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startOnDemandReplicationRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartOnDemandReplicationRunRequest> request = null;
        Response<StartOnDemandReplicationRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartOnDemandReplicationRunRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startOnDemandReplicationRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartOnDemandReplicationRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartOnDemandReplicationRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartOnDemandReplicationRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops replicating an application.
     * </p>
     * 
     * @param stopAppReplicationRequest
     * @return Result of the StopAppReplication operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.StopAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StopAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopAppReplicationResult stopAppReplication(StopAppReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStopAppReplication(request);
    }

    @SdkInternalApi
    final StopAppReplicationResult executeStopAppReplication(StopAppReplicationRequest stopAppReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopAppReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAppReplicationRequest> request = null;
        Response<StopAppReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAppReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopAppReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopAppReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAppReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopAppReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the stack for an application.
     * </p>
     * 
     * @param terminateAppRequest
     * @return Result of the TerminateApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.TerminateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/TerminateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TerminateAppResult terminateApp(TerminateAppRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateApp(request);
    }

    @SdkInternalApi
    final TerminateAppResult executeTerminateApp(TerminateAppRequest terminateAppRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateAppRequest> request = null;
        Response<TerminateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateAppResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateAppRequest
     * @return Result of the UpdateApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAppResult updateApp(UpdateAppRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApp(request);
    }

    @SdkInternalApi
    final UpdateAppResult executeUpdateApp(UpdateAppRequest updateAppRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppRequest> request = null;
        Response<UpdateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified settings for the specified replication job.
     * </p>
     * 
     * @param updateReplicationJobRequest
     * @return Result of the UpdateReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws ServerCannotBeReplicatedException
     *         The specified server cannot be replicated.
     * @throws ReplicationJobNotFoundException
     *         The specified replication job does not exist.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws TemporarilyUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSServerMigration.UpdateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateReplicationJobResult updateReplicationJob(UpdateReplicationJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReplicationJob(request);
    }

    @SdkInternalApi
    final UpdateReplicationJobResult executeUpdateReplicationJob(UpdateReplicationJobRequest updateReplicationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReplicationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReplicationJobRequest> request = null;
        Response<UpdateReplicationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReplicationJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReplicationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReplicationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReplicationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReplicationJobResultJsonUnmarshaller());
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
