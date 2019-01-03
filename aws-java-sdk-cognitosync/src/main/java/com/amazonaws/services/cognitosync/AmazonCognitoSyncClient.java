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
package com.amazonaws.services.cognitosync;

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

import com.amazonaws.services.cognitosync.AmazonCognitoSyncClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.services.cognitosync.model.transform.*;

/**
 * Client for accessing Amazon Cognito Sync. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Cognito Sync</fullname>
 * <p>
 * Amazon Cognito Sync provides an AWS service and client library that enable cross-device syncing of
 * application-related user data. High-level client libraries are available for both iOS and Android. You can use these
 * libraries to persist data locally so that it's available even if the device is offline. Developer credentials don't
 * need to be stored on the mobile device to access the service. You can use Amazon Cognito to obtain a normalized user
 * ID and credentials. User data is persisted in a dataset that can store up to 1 MB of key-value pairs, and you can
 * have up to 20 datasets per user identity.
 * </p>
 * <p>
 * With Amazon Cognito Sync, the data stored for each identity is accessible only to credentials assigned to that
 * identity. In order to use the Cognito Sync service, you need to make API calls using credentials retrieved with <a
 * href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/Welcome.html">Amazon Cognito Identity
 * service</a>.
 * </p>
 * <p>
 * If you want to use Cognito Sync in an Android or iOS application, you will probably want to make API calls via the
 * AWS Mobile SDK. To learn more, see the <a
 * href="http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-sync.html">Developer Guide for
 * Android</a> and the <a href="http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-sync.html">Developer
 * Guide for iOS</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCognitoSyncClient extends AmazonWebServiceClient implements AmazonCognitoSync {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCognitoSync.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-sync";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModification").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConfiguration").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.InvalidConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameter").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateRequest").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.DuplicateRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflict").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.ResourceConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LambdaThrottled").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.LambdaThrottledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedError").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.NotAuthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalError").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequests").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLambdaFunctionOutput").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.InvalidLambdaFunctionOutputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceeded").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyStreamed").withModeledClass(
                                    com.amazonaws.services.cognitosync.model.AlreadyStreamedException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cognitosync.model.AmazonCognitoSyncException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCognitoSyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Cognito Sync (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoSyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCognitoSyncClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCognitoSyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Sync (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoSyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Sync (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Sync (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCognitoSyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCognitoSyncClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCognitoSyncClientBuilder builder() {
        return AmazonCognitoSyncClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCognitoSyncClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Cognito Sync using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCognitoSyncClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://cognito-sync.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cognitosync/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cognitosync/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are
     * limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see
     * the status of the request via the GetBulkPublishDetails operation.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param bulkPublishRequest
     *        The input for the BulkPublish operation.
     * @return Result of the BulkPublish operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws DuplicateRequestException
     *         An exception thrown when there is an IN_PROGRESS bulk publish operation for the given identity pool.
     * @throws AlreadyStreamedException
     *         An exception thrown when a bulk publish operation is requested less than 24 hours after a previous bulk
     *         publish operation completed successfully.
     * @sample AmazonCognitoSync.BulkPublish
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/BulkPublish" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BulkPublishResult bulkPublish(BulkPublishRequest request) {
        request = beforeClientExecution(request);
        return executeBulkPublish(request);
    }

    @SdkInternalApi
    final BulkPublishResult executeBulkPublish(BulkPublishRequest bulkPublishRequest) {

        ExecutionContext executionContext = createExecutionContext(bulkPublishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BulkPublishRequest> request = null;
        Response<BulkPublishResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BulkPublishRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(bulkPublishRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BulkPublish");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BulkPublishResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BulkPublishResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets
     * that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will
     * result in a ResourceNotFoundException.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        A request to delete the specific dataset.
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws ResourceConflictException
     *         Thrown if an update can't be applied because the resource was changed by another call and this would
     *         result in a conflict.
     * @sample AmazonCognitoSync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataset(request);
    }

    @SdkInternalApi
    final DeleteDatasetResult executeDeleteDataset(DeleteDatasetRequest deleteDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access
     * only to its own data. Thus, the credentials used to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials. You should use Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param describeDatasetRequest
     *        A request for meta data about a dataset (creation date, number of records, size) by owner and dataset
     *        name.
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataset(request);
    }

    @SdkInternalApi
    final DescribeDatasetResult executeDescribeDataset(DescribeDatasetRequest describeDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets usage details (for example, data storage) about a particular identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param describeIdentityPoolUsageRequest
     *        A request for usage information about the identity pool.
     * @return Result of the DescribeIdentityPoolUsage operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.DescribeIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIdentityPoolUsageResult describeIdentityPoolUsage(DescribeIdentityPoolUsageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIdentityPoolUsage(request);
    }

    @SdkInternalApi
    final DescribeIdentityPoolUsageResult executeDescribeIdentityPoolUsage(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIdentityPoolUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityPoolUsageRequest> request = null;
        Response<DescribeIdentityPoolUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityPoolUsageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeIdentityPoolUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIdentityPoolUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIdentityPoolUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeIdentityPoolUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets usage information for an identity, including number of datasets and data usage.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials.
     * </p>
     * 
     * @param describeIdentityUsageRequest
     *        A request for information about the usage of an identity pool.
     * @return Result of the DescribeIdentityUsage operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.DescribeIdentityUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeIdentityUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIdentityUsageResult describeIdentityUsage(DescribeIdentityUsageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIdentityUsage(request);
    }

    @SdkInternalApi
    final DescribeIdentityUsageResult executeDescribeIdentityUsage(DescribeIdentityUsageRequest describeIdentityUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIdentityUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityUsageRequest> request = null;
        Response<DescribeIdentityUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIdentityUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIdentityUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIdentityUsageResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeIdentityUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the status of the last BulkPublish operation for an identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param getBulkPublishDetailsRequest
     *        The input for the GetBulkPublishDetails operation.
     * @return Result of the GetBulkPublishDetails operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @sample AmazonCognitoSync.GetBulkPublishDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetBulkPublishDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBulkPublishDetailsResult getBulkPublishDetails(GetBulkPublishDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBulkPublishDetails(request);
    }

    @SdkInternalApi
    final GetBulkPublishDetailsResult executeGetBulkPublishDetails(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBulkPublishDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBulkPublishDetailsRequest> request = null;
        Response<GetBulkPublishDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBulkPublishDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBulkPublishDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBulkPublishDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBulkPublishDetailsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetBulkPublishDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the events and the corresponding Lambda functions associated with an identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param getCognitoEventsRequest
     *        A request for a list of the configured Cognito Events
     * @return Result of the GetCognitoEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.GetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCognitoEventsResult getCognitoEvents(GetCognitoEventsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCognitoEvents(request);
    }

    @SdkInternalApi
    final GetCognitoEventsResult executeGetCognitoEvents(GetCognitoEventsRequest getCognitoEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCognitoEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCognitoEventsRequest> request = null;
        Response<GetCognitoEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCognitoEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCognitoEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCognitoEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCognitoEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCognitoEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the configuration settings of an identity pool.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param getIdentityPoolConfigurationRequest
     *        The input for the GetIdentityPoolConfiguration operation.
     * @return Result of the GetIdentityPoolConfiguration operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.GetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityPoolConfigurationResult getIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityPoolConfiguration(request);
    }

    @SdkInternalApi
    final GetIdentityPoolConfigurationResult executeGetIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityPoolConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoolConfigurationRequest> request = null;
        Response<GetIdentityPoolConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoolConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getIdentityPoolConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityPoolConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdentityPoolConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetIdentityPoolConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus,
     * the credentials used to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials. You should use the Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for a list of datasets for an identity.
     * @return Result of the ListDatasets operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasets(request);
    }

    @SdkInternalApi
    final ListDatasetsResult executeListDatasets(ListDatasetsRequest listDatasetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of identity pools registered with Cognito.
     * </p>
     * <p>
     * ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the
     * temporary user credentials provided by Cognito Identity.
     * </p>
     * 
     * @param listIdentityPoolUsageRequest
     *        A request for usage information on an identity pool.
     * @return Result of the ListIdentityPoolUsage operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.ListIdentityPoolUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListIdentityPoolUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentityPoolUsage(request);
    }

    @SdkInternalApi
    final ListIdentityPoolUsageResult executeListIdentityPoolUsage(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentityPoolUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoolUsageRequest> request = null;
        Response<ListIdentityPoolUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoolUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentityPoolUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentityPoolUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdentityPoolUsageResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListIdentityPoolUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon
     * Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call
     * need to have access to the identity data.
     * </p>
     * <p>
     * ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials. You should use Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param listRecordsRequest
     *        A request for a list of records.
     * @return Result of the ListRecords operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @sample AmazonCognitoSync.ListRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListRecords" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRecordsResult listRecords(ListRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeListRecords(request);
    }

    @SdkInternalApi
    final ListRecordsResult executeListRecords(ListRecordsRequest listRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecordsRequest> request = null;
        Response<ListRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
     * with developer credentials.
     * </p>
     * 
     * @param registerDeviceRequest
     *        A request to RegisterDevice.
     * @return Result of the RegisterDevice operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.RegisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/RegisterDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterDevice(request);
    }

    @SdkInternalApi
    final RegisterDeviceResult executeRegisterDevice(RegisterDeviceRequest registerDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDeviceRequest> request = null;
        Response<RegisterDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value
     * pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the
     * particular key.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param setCognitoEventsRequest
     *        A request to configure Cognito Events"
     * @return Result of the SetCognitoEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.SetCognitoEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetCognitoEvents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetCognitoEventsResult setCognitoEvents(SetCognitoEventsRequest request) {
        request = beforeClientExecution(request);
        return executeSetCognitoEvents(request);
    }

    @SdkInternalApi
    final SetCognitoEventsResult executeSetCognitoEvents(SetCognitoEventsRequest setCognitoEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(setCognitoEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetCognitoEventsRequest> request = null;
        Response<SetCognitoEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetCognitoEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setCognitoEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetCognitoEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetCognitoEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetCognitoEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the necessary configuration for push sync.
     * </p>
     * <p>
     * This API can only be called with developer credentials. You cannot call this API with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     * 
     * @param setIdentityPoolConfigurationRequest
     *        The input for the SetIdentityPoolConfiguration operation.
     * @return Result of the SetIdentityPoolConfiguration operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws ConcurrentModificationException
     *         Thrown if there are parallel requests to modify a resource.
     * @sample AmazonCognitoSync.SetIdentityPoolConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetIdentityPoolConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeSetIdentityPoolConfiguration(request);
    }

    @SdkInternalApi
    final SetIdentityPoolConfigurationResult executeSetIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(setIdentityPoolConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityPoolConfigurationRequest> request = null;
        Response<SetIdentityPoolConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityPoolConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setIdentityPoolConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetIdentityPoolConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetIdentityPoolConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetIdentityPoolConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by another device.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
     * with developer credentials.
     * </p>
     * 
     * @param subscribeToDatasetRequest
     *        A request to SubscribeToDatasetRequest.
     * @return Result of the SubscribeToDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.SubscribeToDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SubscribeToDataset"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeSubscribeToDataset(request);
    }

    @SdkInternalApi
    final SubscribeToDatasetResult executeSubscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(subscribeToDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeToDatasetRequest> request = null;
        Response<SubscribeToDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeToDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(subscribeToDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubscribeToDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubscribeToDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SubscribeToDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified by another device.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API
     * with developer credentials.
     * </p>
     * 
     * @param unsubscribeFromDatasetRequest
     *        A request to UnsubscribeFromDataset.
     * @return Result of the UnsubscribeFromDataset operation returned by the service.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @sample AmazonCognitoSync.UnsubscribeFromDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UnsubscribeFromDataset"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeUnsubscribeFromDataset(request);
    }

    @SdkInternalApi
    final UnsubscribeFromDatasetResult executeUnsubscribeFromDataset(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(unsubscribeFromDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeFromDatasetRequest> request = null;
        Response<UnsubscribeFromDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeFromDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unsubscribeFromDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnsubscribeFromDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnsubscribeFromDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UnsubscribeFromDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Posts updates to records and adds and deletes records for a dataset and user.
     * </p>
     * <p>
     * The sync count in the record patch is your last known sync count for that record. The server will reject an
     * UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale
     * sync count.
     * </p>
     * <p>
     * For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new
     * highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call
     * ListRecords. On a successful update of the record, the response returns the new sync count for that record. You
     * should present that sync count the next time you try to update that same record. When the record does not exist,
     * specify the sync count as 0.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by Cognito Identity or with developer
     * credentials.
     * </p>
     * 
     * @param updateRecordsRequest
     *        A request to post updates to records or add and delete records for a dataset and user.
     * @return Result of the UpdateRecords operation returned by the service.
     * @throws InvalidParameterException
     *         Thrown when a request parameter does not comply with the associated constraints.
     * @throws LimitExceededException
     *         Thrown when the limit on the number of objects or operations has been exceeded.
     * @throws NotAuthorizedException
     *         Thrown when a user is not authorized to access the requested resource.
     * @throws ResourceNotFoundException
     *         Thrown if the resource doesn't exist.
     * @throws ResourceConflictException
     *         Thrown if an update can't be applied because the resource was changed by another call and this would
     *         result in a conflict.
     * @throws InvalidLambdaFunctionOutputException
     *         The AWS Lambda function returned invalid output or an exception.
     * @throws LambdaThrottledException
     *         AWS Lambda throttled your account, please contact AWS Support
     * @throws TooManyRequestsException
     *         Thrown if the request is throttled.
     * @throws InternalErrorException
     *         Indicates an internal service error.
     * @sample AmazonCognitoSync.UpdateRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/UpdateRecords" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRecordsResult updateRecords(UpdateRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecords(request);
    }

    @SdkInternalApi
    final UpdateRecordsResult executeUpdateRecords(UpdateRecordsRequest updateRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecordsRequest> request = null;
        Response<UpdateRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cognito Sync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRecordsResultJsonUnmarshaller());
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
