/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
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
public class AmazonCognitoSyncClient extends AmazonWebServiceClient implements AmazonCognitoSync {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCognitoSync.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cognito-sync";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
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
     */
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
     */
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
     */
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
     */
    public AmazonCognitoSyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     */
    @Override
    public BulkPublishResult bulkPublish(BulkPublishRequest bulkPublishRequest) {
        ExecutionContext executionContext = createExecutionContext(bulkPublishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BulkPublishRequest> request = null;
        Response<BulkPublishResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BulkPublishRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(bulkPublishRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public DescribeIdentityPoolUsageResult describeIdentityPoolUsage(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIdentityPoolUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityPoolUsageRequest> request = null;
        Response<DescribeIdentityPoolUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityPoolUsageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIdentityPoolUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public DescribeIdentityUsageResult describeIdentityUsage(DescribeIdentityUsageRequest describeIdentityUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIdentityUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityUsageRequest> request = null;
        Response<DescribeIdentityUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityUsageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeIdentityUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public GetBulkPublishDetailsResult getBulkPublishDetails(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getBulkPublishDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBulkPublishDetailsRequest> request = null;
        Response<GetBulkPublishDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBulkPublishDetailsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBulkPublishDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public GetCognitoEventsResult getCognitoEvents(GetCognitoEventsRequest getCognitoEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(getCognitoEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCognitoEventsRequest> request = null;
        Response<GetCognitoEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCognitoEventsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCognitoEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public GetIdentityPoolConfigurationResult getIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityPoolConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoolConfigurationRequest> request = null;
        Response<GetIdentityPoolConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoolConfigurationRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getIdentityPoolConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentityPoolUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoolUsageRequest> request = null;
        Response<ListIdentityPoolUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoolUsageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentityPoolUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public ListRecordsResult listRecords(ListRecordsRequest listRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(listRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecordsRequest> request = null;
        Response<ListRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecordsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public RegisterDeviceResult registerDevice(RegisterDeviceRequest registerDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDeviceRequest> request = null;
        Response<RegisterDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDeviceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public SetCognitoEventsResult setCognitoEvents(SetCognitoEventsRequest setCognitoEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(setCognitoEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetCognitoEventsRequest> request = null;
        Response<SetCognitoEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetCognitoEventsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(setCognitoEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityPoolConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityPoolConfigurationRequest> request = null;
        Response<SetIdentityPoolConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityPoolConfigurationRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setIdentityPoolConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(subscribeToDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeToDatasetRequest> request = null;
        Response<SubscribeToDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeToDatasetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(subscribeToDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(unsubscribeFromDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeFromDatasetRequest> request = null;
        Response<UnsubscribeFromDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeFromDatasetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(unsubscribeFromDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     */
    @Override
    public UpdateRecordsResult updateRecords(UpdateRecordsRequest updateRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecordsRequest> request = null;
        Response<UpdateRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecordsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
