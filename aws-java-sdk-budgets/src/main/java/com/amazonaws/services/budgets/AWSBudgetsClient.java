/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.budgets.AWSBudgetsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.services.budgets.model.transform.*;

/**
 * Client for accessing AWSBudgets. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Budgets enable you to plan your service usage, service costs, and your RI utilization. You can also track how close
 * your plan is to your budgeted amount or to the free tier limits. Budgets provide you with a quick way to see your
 * usage-to-date and current estimated charges from AWS and to see how much your predicted usage accrues in charges by
 * the end of the month. Budgets also compare current estimates and charges to the amount that you indicated you want to
 * use or spend and lets you see how much of your budget has been used. AWS updates your budget status several times a
 * day. Budgets track your unblended costs, subscriptions, and refunds. You can create the following types of budgets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cost budgets allow you to say how much you want to spend on a service.
 * </p>
 * </li>
 * <li>
 * <p>
 * Usage budgets allow you to say how many hours you want to use for one or more services.
 * </p>
 * </li>
 * <li>
 * <p>
 * RI utilization budgets allow you to define a utilization threshold and receive alerts when RIs are tracking below
 * that threshold.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can create up to 20,000 budgets per AWS master account. Your first two budgets are free of charge. Each
 * additional budget costs $0.02 per day. You can set up optional notifications that warn you if you exceed, or are
 * forecasted to exceed, your budgeted amount. You can have notifications sent to an Amazon SNS topic, to an email
 * address, or to both. For more information, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-sns-policy.html">Creating an Amazon SNS
 * Topic for Budget Notifications</a>. AWS Free Tier usage alerts via AWS Budgets are provided for you, and do not count
 * toward your budget limits.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The AWS Budgets API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://budgets.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the AWS Budgets API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBudgetsClient extends AmazonWebServiceClient implements AWSBudgets {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBudgets.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "budgets";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
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
     * @deprecated use {@link AWSBudgetsClientBuilder#defaultClient()}
     */
    @Deprecated
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
     * @deprecated use {@link AWSBudgetsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSBudgetsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSBudgetsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
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
     * @deprecated use {@link AWSBudgetsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSBudgetsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSBudgetsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSBudgetsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSBudgetsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AWSBudgetsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSBudgetsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSBudgetsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSBudgetsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AWSBudgetsClientBuilder builder() {
        return AWSBudgetsClientBuilder.standard();
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
     * <p>
     * Creates a budget and, if included, notifications and subscribers.
     * </p>
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return Result of the CreateBudget operation returned by the service.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws CreationLimitExceededException
     *         You've exceeded the notification or subscriber limit.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.CreateBudget
     */
    @Override
    public CreateBudgetResult createBudget(CreateBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBudget(request);
    }

    @SdkInternalApi
    final CreateBudgetResult executeCreateBudget(CreateBudgetRequest createBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(createBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBudgetRequest> request = null;
        Response<CreateBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Creates a notification. You must create the budget before you create the associated notification.
     * </p>
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return Result of the CreateNotification operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws CreationLimitExceededException
     *         You've exceeded the notification or subscriber limit.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.CreateNotification
     */
    @Override
    public CreateNotificationResult createNotification(CreateNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNotification(request);
    }

    @SdkInternalApi
    final CreateNotificationResult executeCreateNotification(CreateNotificationRequest createNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(createNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotificationRequest> request = null;
        Response<CreateNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotificationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     * </p>
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws CreationLimitExceededException
     *         You've exceeded the notification or subscriber limit.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.CreateSubscriber
     */
    @Override
    public CreateSubscriberResult createSubscriber(CreateSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscriber(request);
    }

    @SdkInternalApi
    final CreateSubscriberResult executeCreateSubscriber(CreateSubscriberRequest createSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriberRequest> request = null;
        Response<CreateSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Deletes a budget. You can delete your budget at any time.
     * </p>
     * <p>
     * <b>Deleting a budget also deletes the notifications and subscribers associated with that budget.</b>
     * </p>
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @return Result of the DeleteBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DeleteBudget
     */
    @Override
    public DeleteBudgetResult deleteBudget(DeleteBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBudget(request);
    }

    @SdkInternalApi
    final DeleteBudgetResult executeDeleteBudget(DeleteBudgetRequest deleteBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBudgetRequest> request = null;
        Response<DeleteBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Deletes a notification.
     * </p>
     * <p>
     * <b>Deleting a notification also deletes the subscribers associated with the notification.</b>
     * </p>
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @return Result of the DeleteNotification operation returned by the service.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DeleteNotification
     */
    @Override
    public DeleteNotificationResult deleteNotification(DeleteNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotification(request);
    }

    @SdkInternalApi
    final DeleteNotificationResult executeDeleteNotification(DeleteNotificationRequest deleteNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationRequest> request = null;
        Response<DeleteNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotificationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Deletes a subscriber.
     * </p>
     * <p>
     * <b>Deleting the last subscriber to a notification also deletes the notification.</b>
     * </p>
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DeleteSubscriber
     */
    @Override
    public DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriber(request);
    }

    @SdkInternalApi
    final DeleteSubscriberResult executeDeleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriberRequest> request = null;
        Response<DeleteSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Describes a budget.
     * </p>
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return Result of the DescribeBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.DescribeBudget
     */
    @Override
    public DescribeBudgetResult describeBudget(DescribeBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBudget(request);
    }

    @SdkInternalApi
    final DescribeBudgetResult executeDescribeBudget(DescribeBudgetRequest describeBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBudgetRequest> request = null;
        Response<DescribeBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Lists the budgets associated with an account.
     * </p>
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return Result of the DescribeBudgets operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid.
     * @throws ExpiredNextTokenException
     *         The pagination token expired.
     * @sample AWSBudgets.DescribeBudgets
     */
    @Override
    public DescribeBudgetsResult describeBudgets(DescribeBudgetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBudgets(request);
    }

    @SdkInternalApi
    final DescribeBudgetsResult executeDescribeBudgets(DescribeBudgetsRequest describeBudgetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBudgetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBudgetsRequest> request = null;
        Response<DescribeBudgetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBudgetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBudgetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Lists the notifications associated with a budget.
     * </p>
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @return Result of the DescribeNotificationsForBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid.
     * @throws ExpiredNextTokenException
     *         The pagination token expired.
     * @sample AWSBudgets.DescribeNotificationsForBudget
     */
    @Override
    public DescribeNotificationsForBudgetResult describeNotificationsForBudget(DescribeNotificationsForBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotificationsForBudget(request);
    }

    @SdkInternalApi
    final DescribeNotificationsForBudgetResult executeDescribeNotificationsForBudget(DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotificationsForBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationsForBudgetRequest> request = null;
        Response<DescribeNotificationsForBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotificationsForBudgetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotificationsForBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Lists the subscribers associated with a notification.
     * </p>
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @return Result of the DescribeSubscribersForNotification operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid.
     * @throws ExpiredNextTokenException
     *         The pagination token expired.
     * @sample AWSBudgets.DescribeSubscribersForNotification
     */
    @Override
    public DescribeSubscribersForNotificationResult describeSubscribersForNotification(DescribeSubscribersForNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSubscribersForNotification(request);
    }

    @SdkInternalApi
    final DescribeSubscribersForNotificationResult executeDescribeSubscribersForNotification(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSubscribersForNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscribersForNotificationRequest> request = null;
        Response<DescribeSubscribersForNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscribersForNotificationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSubscribersForNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Updates a budget. You can change every part of a budget except for the <code>budgetName</code> and the
     * <code>calculatedSpend</code>. When a budget is modified, the <code>calculatedSpend</code> drops to zero until AWS
     * has new usage data to use for forecasting.
     * </p>
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return Result of the UpdateBudget operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @sample AWSBudgets.UpdateBudget
     */
    @Override
    public UpdateBudgetResult updateBudget(UpdateBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBudget(request);
    }

    @SdkInternalApi
    final UpdateBudgetResult executeUpdateBudget(UpdateBudgetRequest updateBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBudgetRequest> request = null;
        Response<UpdateBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Updates a notification.
     * </p>
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return Result of the UpdateNotification operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.UpdateNotification
     */
    @Override
    public UpdateNotificationResult updateNotification(UpdateNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotification(request);
    }

    @SdkInternalApi
    final UpdateNotificationResult executeUpdateNotification(UpdateNotificationRequest updateNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotificationRequest> request = null;
        Response<UpdateNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotificationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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
     * <p>
     * Updates a subscriber.
     * </p>
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         An error on the client occurred. Typically, the cause is an invalid input value.
     * @throws NotFoundException
     *         We can’t locate the resource that you specified.
     * @throws DuplicateRecordException
     *         The budget name already exists. Budget names must be unique within an account.
     * @sample AWSBudgets.UpdateSubscriber
     */
    @Override
    public UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscriber(request);
    }

    @SdkInternalApi
    final UpdateSubscriberResult executeUpdateSubscriber(UpdateSubscriberRequest updateSubscriberRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriberRequest> request = null;
        Response<UpdateSubscriberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSubscriberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
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

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
