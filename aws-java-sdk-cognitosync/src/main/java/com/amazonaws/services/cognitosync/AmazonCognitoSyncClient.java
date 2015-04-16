/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.services.cognitosync.model.transform.*;

/**
 * Client for accessing AmazonCognitoSync.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon Cognito Sync <p>
 * Amazon Cognito Sync provides an AWS service and client library that
 * enable cross-device syncing of application-related user data.
 * High-level client libraries are available for both iOS and Android.
 * You can use these libraries to persist data locally so that it's
 * available even if the device is offline. Developer credentials don't
 * need to be stored on the mobile device to access the service. You can
 * use Amazon Cognito to obtain a normalized user ID and credentials.
 * User data is persisted in a dataset that can store up to 1 MB of
 * key-value pairs, and you can have up to 20 datasets per user identity.
 * </p>
 * <p>
 * With Amazon Cognito Sync, the data stored for each identity is
 * accessible only to credentials assigned to that identity. In order to
 * use the Cognito Sync service, you need to make API calls using
 * credentials retrieved with
 * <a href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/Welcome.html"> Amazon Cognito Identity service </a>
 * .
 * </p>
 * <p>
 * If you want to use Cognito Sync in an Android or iOS application, you
 * will probably want to make API calls via the AWS Mobile SDK. To learn
 * more, see the
 * <a href="http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-sync.html"> Developer Guide for Android </a> and the <a href="http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-sync.html"> Developer Guide for iOS </a>
 * .
 * </p>
 */
public class AmazonCognitoSyncClient extends AmazonWebServiceClient implements AmazonCognitoSync {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCognitoSync.class);

    /**
     * List of exception unmarshallers for all AmazonCognitoSync exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCognitoSyncClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoSync
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCognitoSyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCognitoSyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoSync
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCognitoSyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoSync
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCognitoSync
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonCognitoSyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ResourceConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LambdaThrottledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLambdaFunctionOutputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AlreadyStreamedExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cognito-sync.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cognitosync/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cognitosync/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Posts updates to records and adds and deletes records for a dataset
     * and user.
     * </p>
     * <p>
     * UpdateRecords can only be called with temporary user credentials
     * provided by Cognito Identity. You cannot make this API call with
     * developer credentials.
     * </p>
     *
     * @param updateRecordsRequest Container for the necessary parameters to
     *           execute the UpdateRecords service method on AmazonCognitoSync.
     * 
     * @return The response from the UpdateRecords service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InvalidLambdaFunctionOutputException
     * @throws NotAuthorizedException
     * @throws LambdaThrottledException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateRecordsResult updateRecords(UpdateRecordsRequest updateRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecordsRequest> request = null;
        Response<UpdateRecordsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecordsRequestMarshaller().marshall(super.beforeMarshalling(updateRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateRecordsResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateRecordsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRecordsResult> responseHandler =
                new JsonResponseHandler<UpdateRecordsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the AWS Lambda function for a given event type for an identity
     * pool. This request only updates the key/value pair specified. Other
     * key/values pairs are not updated. To remove a key value pair, pass a
     * empty value for the particular key.
     * </p>
     *
     * @param setCognitoEventsRequest Container for the necessary parameters
     *           to execute the SetCognitoEvents service method on AmazonCognitoSync.
     * 
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setCognitoEvents(SetCognitoEventsRequest setCognitoEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(setCognitoEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetCognitoEventsRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetCognitoEventsRequestMarshaller().marshall(super.beforeMarshalling(setCognitoEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Gets the events and the corresponding Lambda functions associated
     * with an identity pool
     * </p>
     *
     * @param getCognitoEventsRequest Container for the necessary parameters
     *           to execute the GetCognitoEvents service method on AmazonCognitoSync.
     * 
     * @return The response from the GetCognitoEvents service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCognitoEventsResult getCognitoEvents(GetCognitoEventsRequest getCognitoEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(getCognitoEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCognitoEventsRequest> request = null;
        Response<GetCognitoEventsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCognitoEventsRequestMarshaller().marshall(super.beforeMarshalling(getCognitoEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetCognitoEventsResult, JsonUnmarshallerContext> unmarshaller =
                new GetCognitoEventsResultJsonUnmarshaller();
            JsonResponseHandler<GetCognitoEventsResult> responseHandler =
                new JsonResponseHandler<GetCognitoEventsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets usage information for an identity, including number of datasets
     * and data usage.
     * </p>
     * <p>
     * DescribeIdentityUsage can be called with temporary user credentials
     * provided by Cognito Identity or with developer credentials.
     * </p>
     *
     * @param describeIdentityUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityUsage service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the DescribeIdentityUsage service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIdentityUsageResult describeIdentityUsage(DescribeIdentityUsageRequest describeIdentityUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIdentityUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityUsageRequest> request = null;
        Response<DescribeIdentityUsageResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityUsageRequestMarshaller().marshall(super.beforeMarshalling(describeIdentityUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeIdentityUsageResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeIdentityUsageResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIdentityUsageResult> responseHandler =
                new JsonResponseHandler<DescribeIdentityUsageResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified
     * by another device.
     * </p>
     *
     * @param unsubscribeFromDatasetRequest Container for the necessary
     *           parameters to execute the UnsubscribeFromDataset service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the UnsubscribeFromDataset service method,
     *         as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidConfigurationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UnsubscribeFromDatasetResult unsubscribeFromDataset(UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(unsubscribeFromDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeFromDatasetRequest> request = null;
        Response<UnsubscribeFromDatasetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeFromDatasetRequestMarshaller().marshall(super.beforeMarshalling(unsubscribeFromDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UnsubscribeFromDatasetResult, JsonUnmarshallerContext> unmarshaller =
                new UnsubscribeFromDatasetResultJsonUnmarshaller();
            JsonResponseHandler<UnsubscribeFromDatasetResult> responseHandler =
                new JsonResponseHandler<UnsubscribeFromDatasetResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the necessary configuration for push sync.
     * </p>
     *
     * @param setIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the SetIdentityPoolConfiguration service method
     *           on AmazonCognitoSync.
     * 
     * @return The response from the SetIdentityPoolConfiguration service
     *         method, as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest setIdentityPoolConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityPoolConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityPoolConfigurationRequest> request = null;
        Response<SetIdentityPoolConfigurationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityPoolConfigurationRequestMarshaller().marshall(super.beforeMarshalling(setIdentityPoolConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<SetIdentityPoolConfigurationResult, JsonUnmarshallerContext> unmarshaller =
                new SetIdentityPoolConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<SetIdentityPoolConfigurationResult> responseHandler =
                new JsonResponseHandler<SetIdentityPoolConfigurationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the configuration settings of an identity pool.
     * </p>
     *
     * @param getIdentityPoolConfigurationRequest Container for the necessary
     *           parameters to execute the GetIdentityPoolConfiguration service method
     *           on AmazonCognitoSync.
     * 
     * @return The response from the GetIdentityPoolConfiguration service
     *         method, as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityPoolConfigurationResult getIdentityPoolConfiguration(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityPoolConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoolConfigurationRequest> request = null;
        Response<GetIdentityPoolConfigurationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoolConfigurationRequestMarshaller().marshall(super.beforeMarshalling(getIdentityPoolConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetIdentityPoolConfigurationResult, JsonUnmarshallerContext> unmarshaller =
                new GetIdentityPoolConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetIdentityPoolConfigurationResult> responseHandler =
                new JsonResponseHandler<GetIdentityPoolConfigurationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by
     * another device.
     * </p>
     *
     * @param subscribeToDatasetRequest Container for the necessary
     *           parameters to execute the SubscribeToDataset service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the SubscribeToDataset service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidConfigurationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(subscribeToDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeToDatasetRequest> request = null;
        Response<SubscribeToDatasetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeToDatasetRequestMarshaller().marshall(super.beforeMarshalling(subscribeToDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<SubscribeToDatasetResult, JsonUnmarshallerContext> unmarshaller =
                new SubscribeToDatasetResultJsonUnmarshaller();
            JsonResponseHandler<SubscribeToDatasetResult> responseHandler =
                new JsonResponseHandler<SubscribeToDatasetResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets usage details (for example, data storage) about a particular
     * identity pool.
     * </p>
     * <p>
     * DescribeIdentityPoolUsage can only be called with developer
     * credentials. You cannot make this API call with the temporary user
     * credentials provided by Cognito Identity.
     * </p>
     *
     * @param describeIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPoolUsage service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the DescribeIdentityPoolUsage service
     *         method, as returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIdentityPoolUsageResult describeIdentityPoolUsage(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIdentityPoolUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityPoolUsageRequest> request = null;
        Response<DescribeIdentityPoolUsageResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityPoolUsageRequestMarshaller().marshall(super.beforeMarshalling(describeIdentityPoolUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeIdentityPoolUsageResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeIdentityPoolUsageResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIdentityPoolUsageResult> responseHandler =
                new JsonResponseHandler<DescribeIdentityPoolUsageResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists datasets for an identity. With Amazon Cognito Sync, each
     * identity has access only to its own data. Thus, the credentials used
     * to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * ListDatasets can be called with temporary user credentials provided
     * by Cognito Identity or with developer credentials. You should use the
     * Cognito Identity credentials to make this API call.
     * </p>
     *
     * @param listDatasetsRequest Container for the necessary parameters to
     *           execute the ListDatasets service method on AmazonCognitoSync.
     * 
     * @return The response from the ListDatasets service method, as returned
     *         by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestMarshaller().marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListDatasetsResult, JsonUnmarshallerContext> unmarshaller =
                new ListDatasetsResultJsonUnmarshaller();
            JsonResponseHandler<ListDatasetsResult> responseHandler =
                new JsonResponseHandler<ListDatasetsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of identity pools registered with Cognito.
     * </p>
     * <p>
     * ListIdentityPoolUsage can only be called with developer credentials.
     * You cannot make this API call with the temporary user credentials
     * provided by Cognito Identity.
     * </p>
     *
     * @param listIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the ListIdentityPoolUsage service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the ListIdentityPoolUsage service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentityPoolUsageResult listIdentityPoolUsage(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentityPoolUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoolUsageRequest> request = null;
        Response<ListIdentityPoolUsageResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoolUsageRequestMarshaller().marshall(super.beforeMarshalling(listIdentityPoolUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListIdentityPoolUsageResult, JsonUnmarshallerContext> unmarshaller =
                new ListIdentityPoolUsageResultJsonUnmarshaller();
            JsonResponseHandler<ListIdentityPoolUsageResult> responseHandler =
                new JsonResponseHandler<ListIdentityPoolUsageResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync
     * count for a dataset and identity. With Amazon Cognito Sync, each
     * identity has access only to its own data. Thus, the credentials used
     * to make this API call need to have access to the identity data.
     * </p>
     * <p>
     * ListRecords can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials. You should use Cognito
     * Identity credentials to make this API call.
     * </p>
     *
     * @param listRecordsRequest Container for the necessary parameters to
     *           execute the ListRecords service method on AmazonCognitoSync.
     * 
     * @return The response from the ListRecords service method, as returned
     *         by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListRecordsResult listRecords(ListRecordsRequest listRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(listRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecordsRequest> request = null;
        Response<ListRecordsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecordsRequestMarshaller().marshall(super.beforeMarshalling(listRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListRecordsResult, JsonUnmarshallerContext> unmarshaller =
                new ListRecordsResultJsonUnmarshaller();
            JsonResponseHandler<ListRecordsResult> responseHandler =
                new JsonResponseHandler<ListRecordsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Get the status of the last BulkPublish operation for an identity
     * pool.
     * </p>
     *
     * @param getBulkPublishDetailsRequest Container for the necessary
     *           parameters to execute the GetBulkPublishDetails service method on
     *           AmazonCognitoSync.
     * 
     * @return The response from the GetBulkPublishDetails service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetBulkPublishDetailsResult getBulkPublishDetails(GetBulkPublishDetailsRequest getBulkPublishDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getBulkPublishDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBulkPublishDetailsRequest> request = null;
        Response<GetBulkPublishDetailsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBulkPublishDetailsRequestMarshaller().marshall(super.beforeMarshalling(getBulkPublishDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetBulkPublishDetailsResult, JsonUnmarshallerContext> unmarshaller =
                new GetBulkPublishDetailsResultJsonUnmarshaller();
            JsonResponseHandler<GetBulkPublishDetailsResult> responseHandler =
                new JsonResponseHandler<GetBulkPublishDetailsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Initiates a bulk publish of all existing datasets for an Identity
     * Pool to the configured stream. Customers are limited to one successful
     * bulk publish per 24 hours. Bulk publish is an asynchronous request,
     * customers can see the status of the request via the
     * GetBulkPublishDetails operation.
     * </p>
     *
     * @param bulkPublishRequest Container for the necessary parameters to
     *           execute the BulkPublish service method on AmazonCognitoSync.
     * 
     * @return The response from the BulkPublish service method, as returned
     *         by AmazonCognitoSync.
     * 
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     * @throws DuplicateRequestException
     * @throws AlreadyStreamedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BulkPublishResult bulkPublish(BulkPublishRequest bulkPublishRequest) {
        ExecutionContext executionContext = createExecutionContext(bulkPublishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BulkPublishRequest> request = null;
        Response<BulkPublishResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BulkPublishRequestMarshaller().marshall(super.beforeMarshalling(bulkPublishRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<BulkPublishResult, JsonUnmarshallerContext> unmarshaller =
                new BulkPublishResultJsonUnmarshaller();
            JsonResponseHandler<BulkPublishResult> responseHandler =
                new JsonResponseHandler<BulkPublishResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets meta data about a dataset by identity and dataset name. With
     * Amazon Cognito Sync, each identity has access only to its own data.
     * Thus, the credentials used to make this API call need to have access
     * to the identity data.
     * </p>
     * <p>
     * DescribeDataset can be called with temporary user credentials
     * provided by Cognito Identity or with developer credentials. You should
     * use Cognito Identity credentials to make this API call.
     * </p>
     *
     * @param describeDatasetRequest Container for the necessary parameters
     *           to execute the DescribeDataset service method on AmazonCognitoSync.
     * 
     * @return The response from the DescribeDataset service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestMarshaller().marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDatasetResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDatasetResult> responseHandler =
                new JsonResponseHandler<DescribeDatasetResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specific dataset. The dataset will be deleted
     * permanently, and the action can't be undone. Datasets that this
     * dataset was merged with will no longer report the merge. Any
     * subsequent operation on this dataset will result in a
     * ResourceNotFoundException.
     * </p>
     * <p>
     * DeleteDataset can be called with temporary user credentials provided
     * by Cognito Identity or with developer credentials.
     * </p>
     *
     * @param deleteDatasetRequest Container for the necessary parameters to
     *           execute the DeleteDataset service method on AmazonCognitoSync.
     * 
     * @return The response from the DeleteDataset service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws ResourceConflictException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestMarshaller().marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteDatasetResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteDatasetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDatasetResult> responseHandler =
                new JsonResponseHandler<DeleteDatasetResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     *
     * @param registerDeviceRequest Container for the necessary parameters to
     *           execute the RegisterDevice service method on AmazonCognitoSync.
     * 
     * @return The response from the RegisterDevice service method, as
     *         returned by AmazonCognitoSync.
     * 
     * @throws TooManyRequestsException
     * @throws InvalidConfigurationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterDeviceResult registerDevice(RegisterDeviceRequest registerDeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDeviceRequest> request = null;
        Response<RegisterDeviceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDeviceRequestMarshaller().marshall(super.beforeMarshalling(registerDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<RegisterDeviceResult, JsonUnmarshallerContext> unmarshaller =
                new RegisterDeviceResultJsonUnmarshaller();
            JsonResponseHandler<RegisterDeviceResult> responseHandler =
                new JsonResponseHandler<RegisterDeviceResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        