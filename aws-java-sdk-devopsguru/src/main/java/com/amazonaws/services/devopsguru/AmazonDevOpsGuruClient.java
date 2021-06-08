/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru;

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

import com.amazonaws.services.devopsguru.AmazonDevOpsGuruClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.services.devopsguru.model.transform.*;

/**
 * Client for accessing Amazon DevOps Guru. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon DevOps Guru is a fully managed service that helps you identify anomalous behavior in business critical
 * operational applications. You specify the AWS resources that you want DevOps Guru to cover, then the Amazon
 * CloudWatch metrics and AWS CloudTrail events related to those resources are analyzed. When anomalous behavior is
 * detected, DevOps Guru creates an <i>insight</i> that includes recommendations, related events, and related metrics
 * that can help you improve your operational applications. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html">What is Amazon DevOps Guru</a>.
 * </p>
 * <p>
 * You can specify 1 or 2 Amazon Simple Notification Service topics so you are notified every time a new insight is
 * created. You can also enable DevOps Guru to generate an OpsItem in AWS Systems Manager for each insight to help you
 * manage and track your work addressing insights.
 * </p>
 * <p>
 * To learn about the DevOps Guru workflow, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/welcome.html#how-it-works">How DevOps Guru works</a>.
 * To learn about DevOps Guru concepts, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/concepts.html">Concepts in DevOps Guru</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDevOpsGuruClient extends AmazonWebServiceClient implements AmazonDevOpsGuru {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDevOpsGuru.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "devops-guru";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.devopsguru.model.AmazonDevOpsGuruException.class));

    public static AmazonDevOpsGuruClientBuilder builder() {
        return AmazonDevOpsGuruClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DevOps Guru using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDevOpsGuruClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DevOps Guru using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDevOpsGuruClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("devops-guru.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/devopsguru/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/devopsguru/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a notification channel to DevOps Guru. A notification channel is used to notify you about important DevOps
     * Guru events, such as when an insight is generated.
     * </p>
     * <p>
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru
     * permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using
     * Amazon SNS in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for
     * cross account Amazon SNS topics</a>.
     * </p>
     * <p>
     * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK),
     * then you must add permissions to the CMK. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for AWS
     * KMS–encrypted Amazon SNS topics</a>.
     * </p>
     * 
     * @param addNotificationChannelRequest
     * @return Result of the AddNotificationChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ServiceQuotaExceededException
     *         The request contains a value that exceeds a maximum quota.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddNotificationChannelResult addNotificationChannel(AddNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executeAddNotificationChannel(request);
    }

    @SdkInternalApi
    final AddNotificationChannelResult executeAddNotificationChannel(AddNotificationChannelRequest addNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(addNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddNotificationChannelRequest> request = null;
        Response<AddNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics
     * analyzed in your AWS account. Use these numbers to gauge the health of operations in your AWS account.
     * </p>
     * 
     * @param describeAccountHealthRequest
     * @return Result of the DescribeAccountHealth operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountHealthResult describeAccountHealth(DescribeAccountHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountHealth(request);
    }

    @SdkInternalApi
    final DescribeAccountHealthResult executeDescribeAccountHealth(DescribeAccountHealthRequest describeAccountHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountHealthRequest> request = null;
        Response<DescribeAccountHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountHealthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccountHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountHealthResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAccountHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For the time range passed in, returns the number of open reactive insight that were created, the number of open
     * proactive insights that were created, and the Mean Time to Recover (MTTR) for all closed reactive insights.
     * </p>
     * 
     * @param describeAccountOverviewRequest
     * @return Result of the DescribeAccountOverview operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountOverviewResult describeAccountOverview(DescribeAccountOverviewRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountOverview(request);
    }

    @SdkInternalApi
    final DescribeAccountOverviewResult executeDescribeAccountOverview(DescribeAccountOverviewRequest describeAccountOverviewRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountOverviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountOverviewRequest> request = null;
        Response<DescribeAccountOverviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountOverviewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountOverviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountOverview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountOverviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountOverviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about an anomaly that you specify using its ID.
     * </p>
     * 
     * @param describeAnomalyRequest
     * @return Result of the DescribeAnomaly operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAnomalyResult describeAnomaly(DescribeAnomalyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnomaly(request);
    }

    @SdkInternalApi
    final DescribeAnomalyResult executeDescribeAnomaly(DescribeAnomalyRequest describeAnomalyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnomalyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnomalyRequest> request = null;
        Response<DescribeAnomalyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnomalyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAnomalyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnomaly");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAnomalyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAnomalyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the most recent feedback submitted in the current AWS account and Region.
     * </p>
     * 
     * @param describeFeedbackRequest
     * @return Result of the DescribeFeedback operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeFeedback" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeFeedbackResult describeFeedback(DescribeFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFeedback(request);
    }

    @SdkInternalApi
    final DescribeFeedbackResult executeDescribeFeedback(DescribeFeedbackRequest describeFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFeedbackRequest> request = null;
        Response<DescribeFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about an insight that you specify using its ID.
     * </p>
     * 
     * @param describeInsightRequest
     * @return Result of the DescribeInsight operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeInsightResult describeInsight(DescribeInsightRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInsight(request);
    }

    @SdkInternalApi
    final DescribeInsightResult executeDescribeInsight(DescribeInsightRequest describeInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInsightRequest> request = null;
        Response<DescribeInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of open proactive insights, open reactive insights, and the Mean Time to Recover (MTTR) for
     * all closed insights in resource collections in your account. You specify the type of AWS resources collection.
     * The one type of AWS resource collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to
     * analyze only the AWS resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation
     * stacks.
     * </p>
     * 
     * @param describeResourceCollectionHealthRequest
     * @return Result of the DescribeResourceCollectionHealth operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourceCollectionHealthResult describeResourceCollectionHealth(DescribeResourceCollectionHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourceCollectionHealth(request);
    }

    @SdkInternalApi
    final DescribeResourceCollectionHealthResult executeDescribeResourceCollectionHealth(
            DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourceCollectionHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceCollectionHealthRequest> request = null;
        Response<DescribeResourceCollectionHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceCollectionHealthRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeResourceCollectionHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourceCollectionHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceCollectionHealthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourceCollectionHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the integration status of services that are integrated with DevOps Guru. The one service that can be
     * integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param describeServiceIntegrationRequest
     * @return Result of the DescribeServiceIntegration operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeServiceIntegrationResult describeServiceIntegration(DescribeServiceIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceIntegration(request);
    }

    @SdkInternalApi
    final DescribeServiceIntegrationResult executeDescribeServiceIntegration(DescribeServiceIntegrationRequest describeServiceIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceIntegrationRequest> request = null;
        Response<DescribeServiceIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeServiceIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServiceIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeServiceIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an estimate of the monthly cost for DevOps Guru to analyze your AWS resources. For more information, see
     * <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @param getCostEstimationRequest
     * @return Result of the GetCostEstimation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.GetCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetCostEstimation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCostEstimationResult getCostEstimation(GetCostEstimationRequest request) {
        request = beforeClientExecution(request);
        return executeGetCostEstimation(request);
    }

    @SdkInternalApi
    final GetCostEstimationResult executeGetCostEstimation(GetCostEstimationRequest getCostEstimationRequest) {

        ExecutionContext executionContext = createExecutionContext(getCostEstimationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostEstimationRequest> request = null;
        Response<GetCostEstimationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostEstimationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCostEstimationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCostEstimation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCostEstimationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCostEstimationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns lists AWS resources that are of the specified resource collection type. The one type of AWS resource
     * collection supported is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS
     * resources that are defined in the stacks. You can specify up to 500 AWS CloudFormation stacks.
     * </p>
     * 
     * @param getResourceCollectionRequest
     * @return Result of the GetResourceCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceCollectionResult getResourceCollection(GetResourceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceCollection(request);
    }

    @SdkInternalApi
    final GetResourceCollectionResult executeGetResourceCollection(GetResourceCollectionRequest getResourceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceCollectionRequest> request = null;
        Response<GetResourceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceCollectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetResourceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the anomalies that belong to an insight that you specify using its ID.
     * </p>
     * 
     * @param listAnomaliesForInsightRequest
     * @return Result of the ListAnomaliesForInsight operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnomaliesForInsightResult listAnomaliesForInsight(ListAnomaliesForInsightRequest request) {
        request = beforeClientExecution(request);
        return executeListAnomaliesForInsight(request);
    }

    @SdkInternalApi
    final ListAnomaliesForInsightResult executeListAnomaliesForInsight(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnomaliesForInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnomaliesForInsightRequest> request = null;
        Response<ListAnomaliesForInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnomaliesForInsightRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAnomaliesForInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnomaliesForInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnomaliesForInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAnomaliesForInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the events emitted by the resources that are evaluated by DevOps Guru. You can use filters to
     * specify which events are returned.
     * </p>
     * 
     * @param listEventsRequest
     * @return Result of the ListEvents operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEventsResult listEvents(ListEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListEvents(request);
    }

    @SdkInternalApi
    final ListEventsResult executeListEvents(ListEventsRequest listEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventsRequest> request = null;
        Response<ListEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time
     * and status (<code>ONGOING</code>, <code>CLOSED</code>, or <code>ANY</code>).
     * </p>
     * 
     * @param listInsightsRequest
     * @return Result of the ListInsights operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInsightsResult listInsights(ListInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeListInsights(request);
    }

    @SdkInternalApi
    final ListInsightsResult executeListInsights(ListInsightsRequest listInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInsightsRequest> request = null;
        Response<ListInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of notification channels configured for DevOps Guru. Each notification channel is used to notify
     * you when DevOps Guru generates an insight that contains information about how to improve your operations. The one
     * supported notification channel is Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * 
     * @param listNotificationChannelsRequest
     * @return Result of the ListNotificationChannels operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNotificationChannelsResult listNotificationChannels(ListNotificationChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotificationChannels(request);
    }

    @SdkInternalApi
    final ListNotificationChannelsResult executeListNotificationChannels(ListNotificationChannelsRequest listNotificationChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotificationChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotificationChannelsRequest> request = null;
        Response<ListNotificationChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotificationChannelsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listNotificationChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotificationChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotificationChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListNotificationChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of a specified insight's recommendations. Each recommendation includes a list of related metrics
     * and a list of related events.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecommendationsResult listRecommendations(ListRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListRecommendations(request);
    }

    @SdkInternalApi
    final ListRecommendationsResult executeListRecommendations(ListRecommendationsRequest listRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationsRequest> request = null;
        Response<ListRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Collects customer feedback about the specified insight.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutFeedbackResult putFeedback(PutFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executePutFeedback(request);
    }

    @SdkInternalApi
    final PutFeedbackResult executePutFeedback(PutFeedbackRequest putFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(putFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFeedbackRequest> request = null;
        Response<PutFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a notification channel from DevOps Guru. A notification channel is used to notify you when DevOps Guru
     * generates an insight that contains information about how to improve your operations.
     * </p>
     * 
     * @param removeNotificationChannelRequest
     * @return Result of the RemoveNotificationChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveNotificationChannelResult removeNotificationChannel(RemoveNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveNotificationChannel(request);
    }

    @SdkInternalApi
    final RemoveNotificationChannelResult executeRemoveNotificationChannel(RemoveNotificationChannelRequest removeNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(removeNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveNotificationChannelRequest> request = null;
        Response<RemoveNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of insights in your AWS account. You can specify which insights are returned by their start time,
     * one or more statuses (<code>ONGOING</code>, <code>CLOSED</code>, and <code>CLOSED</code>), one or more severities
     * (<code>LOW</code>, <code>MEDIUM</code>, and <code>HIGH</code>), and type (<code>REACTIVE</code> or
     * <code>PROACTIVE</code>).
     * </p>
     * <p>
     * Use the <code>Filters</code> parameter to specify status and severity search parameters. Use the
     * <code>Type</code> parameter to specify <code>REACTIVE</code> or <code>PROACTIVE</code> in your search.
     * </p>
     * 
     * @param searchInsightsRequest
     * @return Result of the SearchInsights operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchInsightsResult searchInsights(SearchInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchInsights(request);
    }

    @SdkInternalApi
    final SearchInsightsResult executeSearchInsights(SearchInsightsRequest searchInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchInsightsRequest> request = null;
        Response<SearchInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the creation of an estimate of the monthly cost to analyze your AWS resources.
     * </p>
     * 
     * @param startCostEstimationRequest
     * @return Result of the StartCostEstimation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ResourceNotFoundException
     *         A requested resource could not be found
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.StartCostEstimation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/StartCostEstimation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartCostEstimationResult startCostEstimation(StartCostEstimationRequest request) {
        request = beforeClientExecution(request);
        return executeStartCostEstimation(request);
    }

    @SdkInternalApi
    final StartCostEstimationResult executeStartCostEstimation(StartCostEstimationRequest startCostEstimationRequest) {

        ExecutionContext executionContext = createExecutionContext(startCostEstimationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCostEstimationRequest> request = null;
        Response<StartCostEstimationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCostEstimationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCostEstimationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCostEstimation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCostEstimationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCostEstimationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the collection of resources that DevOps Guru analyzes. The one type of AWS resource collection supported
     * is AWS CloudFormation stacks. DevOps Guru can be configured to analyze only the AWS resources that are defined in
     * the stacks. You can specify up to 500 AWS CloudFormation stacks. This method also creates the IAM role required
     * for you to use DevOps Guru.
     * </p>
     * 
     * @param updateResourceCollectionRequest
     * @return Result of the UpdateResourceCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourceCollectionResult updateResourceCollection(UpdateResourceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourceCollection(request);
    }

    @SdkInternalApi
    final UpdateResourceCollectionResult executeUpdateResourceCollection(UpdateResourceCollectionRequest updateResourceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceCollectionRequest> request = null;
        Response<UpdateResourceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateResourceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateResourceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables integration with a service that can be integrated with DevOps Guru. The one service that can
     * be integrated with DevOps Guru is AWS Systems Manager, which can be used to create an OpsItem for each generated
     * insight.
     * </p>
     * 
     * @param updateServiceIntegrationRequest
     * @return Result of the UpdateServiceIntegration operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         Management</a> in the <i>IAM User Guide</i>.
     * @throws ConflictException
     *         An exception that is thrown when a conflict occurs.
     * @throws InternalServerException
     *         An internal failure in an Amazon service occurred.
     * @throws ThrottlingException
     *         The request was denied due to a request throttling.
     * @throws ValidationException
     *         Contains information about data passed in to a field during a request that is not valid.
     * @sample AmazonDevOpsGuru.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceIntegrationResult updateServiceIntegration(UpdateServiceIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceIntegration(request);
    }

    @SdkInternalApi
    final UpdateServiceIntegrationResult executeUpdateServiceIntegration(UpdateServiceIntegrationRequest updateServiceIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceIntegrationRequest> request = null;
        Response<UpdateServiceIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServiceIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServiceIntegrationResultJsonUnmarshaller());
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
    public void shutdown() {
        super.shutdown();
    }

}
