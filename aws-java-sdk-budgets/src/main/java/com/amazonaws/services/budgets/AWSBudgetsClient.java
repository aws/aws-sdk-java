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
package com.amazonaws.services.budgets;

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

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.services.budgets.model.transform.*;

/**
 * Client for accessing AWSBudgets. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * All public APIs for AWS Budgets
 */
@ThreadSafe
public class AWSBudgetsClient extends AmazonWebServiceClient implements AWSBudgets {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBudgets.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "budgets";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                            com.amazonaws.services.budgets.model.NotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                            com.amazonaws.services.budgets.model.InvalidParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("DuplicateRecordException").withModeledClass(
                            com.amazonaws.services.budgets.model.DuplicateRecordException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withModeledClass(
                            com.amazonaws.services.budgets.model.InternalErrorException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("CreationLimitExceededException").withModeledClass(
                            com.amazonaws.services.budgets.model.CreationLimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                            com.amazonaws.services.budgets.model.InvalidNextTokenException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ExpiredNextTokenException").withModeledClass(
                            com.amazonaws.services.budgets.model.ExpiredNextTokenException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.budgets.model.AWSBudgetsException.class));

    /**
     * Constructs a new client to invoke service methods on AWSBudgets. A credentials provider chain will be used that
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
     */
    public AWSBudgetsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to AWSBudgets (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSBudgetsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AWSBudgetsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSBudgets (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSBudgetsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AWSBudgetsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSBudgets (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSBudgetsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWSBudgets (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSBudgetsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSBudgets using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBudgetsClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("budgets.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/budgets/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/budgets/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Create a new budget
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return Result of the CreateBudget operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws CreationLimitExceededException
     *         The exception is thrown when customer tries to create a record (e.g. budget), but the number this record
     *         already exceeds the limitation.
     * @throws DuplicateRecordException
     *         The exception is thrown when customer tries to create a record (e.g. budget) that already exists.
     * @sample AWSBudgets.CreateBudget
     */
    @Override
    public CreateBudgetResult createBudget(CreateBudgetRequest createBudgetRequest) {
        ExecutionContext executionContext = createExecutionContext(createBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBudgetRequest> request = null;
        Response<CreateBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBudgetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a new Notification with subscribers for a budget
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return Result of the CreateNotification operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws CreationLimitExceededException
     *         The exception is thrown when customer tries to create a record (e.g. budget), but the number this record
     *         already exceeds the limitation.
     * @throws DuplicateRecordException
     *         The exception is thrown when customer tries to create a record (e.g. budget) that already exists.
     * @sample AWSBudgets.CreateNotification
     */
    @Override
    public CreateNotificationResult createNotification(CreateNotificationRequest createNotificationRequest) {
        ExecutionContext executionContext = createExecutionContext(createNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotificationRequest> request = null;
        Response<CreateNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotificationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a new Subscriber for a notification
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws CreationLimitExceededException
     *         The exception is thrown when customer tries to create a record (e.g. budget), but the number this record
     *         already exceeds the limitation.
     * @throws DuplicateRecordException
     *         The exception is thrown when customer tries to create a record (e.g. budget) that already exists.
     * @sample AWSBudgets.CreateSubscriber
     */
    @Override
    public CreateSubscriberResult createSubscriber(CreateSubscriberRequest createSubscriberRequest) {
        ExecutionContext executionContext = createExecutionContext(createSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriberRequest> request = null;
        Response<CreateSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriberRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSubscriberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete a budget and related notifications
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @return Result of the DeleteBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DeleteBudget
     */
    @Override
    public DeleteBudgetResult deleteBudget(DeleteBudgetRequest deleteBudgetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBudgetRequest> request = null;
        Response<DeleteBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBudgetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete a notification and related subscribers
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @return Result of the DeleteNotification operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DeleteNotification
     */
    @Override
    public DeleteNotificationResult deleteNotification(DeleteNotificationRequest deleteNotificationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationRequest> request = null;
        Response<DeleteNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotificationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Delete a Subscriber for a notification
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DeleteSubscriber
     */
    @Override
    public DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriberRequest> request = null;
        Response<DeleteSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriberRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSubscriberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get a single budget
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return Result of the DescribeBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DescribeBudget
     */
    @Override
    public DescribeBudgetResult describeBudget(DescribeBudgetRequest describeBudgetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBudgetRequest> request = null;
        Response<DescribeBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBudgetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get all budgets for an account
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return Result of the DescribeBudgets operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws InvalidNextTokenException
     *         This exception is thrown if paging token signature didn't match the token, or the paging token isn't for
     *         this request
     * @throws ExpiredNextTokenException
     *         This exception is thrown if the paging token is expired - past its TTL
     * @sample AWSBudgets.DescribeBudgets
     */
    @Override
    public DescribeBudgetsResult describeBudgets(DescribeBudgetsRequest describeBudgetsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBudgetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBudgetsRequest> request = null;
        Response<DescribeBudgetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBudgetsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBudgetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBudgetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBudgetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get notifications of a budget
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @return Result of the DescribeNotificationsForBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws InvalidNextTokenException
     *         This exception is thrown if paging token signature didn't match the token, or the paging token isn't for
     *         this request
     * @throws ExpiredNextTokenException
     *         This exception is thrown if the paging token is expired - past its TTL
     * @sample AWSBudgets.DescribeNotificationsForBudget
     */
    @Override
    public DescribeNotificationsForBudgetResult describeNotificationsForBudget(DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeNotificationsForBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationsForBudgetRequest> request = null;
        Response<DescribeNotificationsForBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotificationsForBudgetRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotificationsForBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNotificationsForBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNotificationsForBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Get subscribers of a notification
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @return Result of the DescribeSubscribersForNotification operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws InvalidNextTokenException
     *         This exception is thrown if paging token signature didn't match the token, or the paging token isn't for
     *         this request
     * @throws ExpiredNextTokenException
     *         This exception is thrown if the paging token is expired - past its TTL
     * @sample AWSBudgets.DescribeSubscribersForNotification
     */
    @Override
    public DescribeSubscribersForNotificationResult describeSubscribersForNotification(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSubscribersForNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscribersForNotificationRequest> request = null;
        Response<DescribeSubscribersForNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscribersForNotificationRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSubscribersForNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSubscribersForNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSubscribersForNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update the information of a budget already created
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return Result of the UpdateBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.UpdateBudget
     */
    @Override
    public UpdateBudgetResult updateBudget(UpdateBudgetRequest updateBudgetRequest) {
        ExecutionContext executionContext = createExecutionContext(updateBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBudgetRequest> request = null;
        Response<UpdateBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBudgetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update the information about a notification already created
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return Result of the UpdateNotification operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.UpdateNotification
     */
    @Override
    public UpdateNotificationResult updateNotification(UpdateNotificationRequest updateNotificationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotificationRequest> request = null;
        Response<UpdateNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotificationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Update a subscriber
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.UpdateSubscriber
     */
    @Override
    public UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest updateSubscriberRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriberRequest> request = null;
        Response<UpdateSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriberRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSubscriberResultJsonUnmarshaller());
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
