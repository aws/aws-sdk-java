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
package com.amazonaws.services.codestarnotifications;

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

import com.amazonaws.services.codestarnotifications.AWSCodeStarNotificationsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codestarnotifications.model.*;
import com.amazonaws.services.codestarnotifications.model.transform.*;

/**
 * Client for accessing AWS CodeStar Notifications. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * This AWS CodeStar Notifications API Reference provides descriptions and usage examples of the operations and data
 * types for the AWS CodeStar Notifications API. You can use the AWS CodeStar Notifications API to work with the
 * following objects:
 * </p>
 * <p>
 * Notification rules, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateNotificationRule</a>, which creates a notification rule for a resource in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteNotificationRule</a>, which deletes a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeNotificationRule</a>, which provides information about a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListNotificationRules</a>, which lists the notification rules associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateNotificationRule</a>, which changes the name, events, or targets associated with a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Subscribe</a>, which subscribes a target to a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Unsubscribe</a>, which removes a target from a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Targets, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteTarget</a>, which removes a notification rule target (SNS topic) from a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTargets</a>, which lists the targets associated with a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Events, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListEventTypes</a>, which lists the event types you can include in a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Tags, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which lists the tags already associated with a notification rule in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which associates a tag you provide with a notification rule in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes a tag from a notification rule in your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeStar Notifications, see link in the CodeStarNotifications User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeStarNotificationsClient extends AmazonWebServiceClient implements AWSCodeStarNotifications {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeStarNotifications.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codestar-notifications";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.ConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codestarnotifications.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codestarnotifications.model.AWSCodeStarNotificationsException.class));

    public static AWSCodeStarNotificationsClientBuilder builder() {
        return AWSCodeStarNotificationsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeStar Notifications using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeStarNotificationsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeStar Notifications using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeStarNotificationsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codestar-notifications.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codestarnotifications/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codestarnotifications/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a notification rule for a resource. The rule specifies the events you want notifications about and the
     * targets (such as SNS topics) where you want to receive them.
     * </p>
     * 
     * @param createNotificationRuleRequest
     * @return Result of the CreateNotificationRule operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name or ID already exists. Notification rule names must be unique in your AWS
     *         account.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws LimitExceededException
     *         One of the AWS CodeStar Notifications limits has been exceeded. Limits apply to accounts, notification
     *         rules, notifications, resources, and targets. For more information, see Limits.
     * @throws ConfigurationException
     *         Some or all of the configuration is incomplete, missing, or not valid.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @throws AccessDeniedException
     *         AWS CodeStar Notifications can't create the notification rule because you do not have sufficient
     *         permissions.
     * @sample AWSCodeStarNotifications.CreateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/CreateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNotificationRuleResult createNotificationRule(CreateNotificationRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNotificationRule(request);
    }

    @SdkInternalApi
    final CreateNotificationRuleResult executeCreateNotificationRule(CreateNotificationRuleRequest createNotificationRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createNotificationRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotificationRuleRequest> request = null;
        Response<CreateNotificationRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotificationRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNotificationRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNotificationRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNotificationRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateNotificationRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a notification rule for a resource.
     * </p>
     * 
     * @param deleteNotificationRuleRequest
     * @return Result of the DeleteNotificationRule operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws LimitExceededException
     *         One of the AWS CodeStar Notifications limits has been exceeded. Limits apply to accounts, notification
     *         rules, notifications, resources, and targets. For more information, see Limits.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @sample AWSCodeStarNotifications.DeleteNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNotificationRuleResult deleteNotificationRule(DeleteNotificationRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotificationRule(request);
    }

    @SdkInternalApi
    final DeleteNotificationRuleResult executeDeleteNotificationRule(DeleteNotificationRuleRequest deleteNotificationRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotificationRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationRuleRequest> request = null;
        Response<DeleteNotificationRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotificationRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNotificationRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotificationRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNotificationRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteNotificationRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified target for notifications.
     * </p>
     * 
     * @param deleteTargetRequest
     * @return Result of the DeleteTarget operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.DeleteTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DeleteTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTargetResult deleteTarget(DeleteTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTarget(request);
    }

    @SdkInternalApi
    final DeleteTargetResult executeDeleteTarget(DeleteTargetRequest deleteTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTargetRequest> request = null;
        Response<DeleteTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specified notification rule.
     * </p>
     * 
     * @param describeNotificationRuleRequest
     * @return Result of the DescribeNotificationRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.DescribeNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DescribeNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNotificationRuleResult describeNotificationRule(DescribeNotificationRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotificationRule(request);
    }

    @SdkInternalApi
    final DescribeNotificationRuleResult executeDescribeNotificationRule(DescribeNotificationRuleRequest describeNotificationRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotificationRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationRuleRequest> request = null;
        Response<DescribeNotificationRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotificationRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNotificationRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNotificationRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNotificationRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNotificationRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the event types available for configuring notifications.
     * </p>
     * 
     * @param listEventTypesRequest
     * @return Result of the ListEventTypes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value for the enumeration token used in the request to return the next batch of the results is not
     *         valid.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEventTypesResult listEventTypes(ListEventTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListEventTypes(request);
    }

    @SdkInternalApi
    final ListEventTypesResult executeListEventTypes(ListEventTypesRequest listEventTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventTypesRequest> request = null;
        Response<ListEventTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEventTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the notification rules for an AWS account.
     * </p>
     * 
     * @param listNotificationRulesRequest
     * @return Result of the ListNotificationRules operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value for the enumeration token used in the request to return the next batch of the results is not
     *         valid.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListNotificationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListNotificationRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNotificationRulesResult listNotificationRules(ListNotificationRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListNotificationRules(request);
    }

    @SdkInternalApi
    final ListNotificationRulesResult executeListNotificationRules(ListNotificationRulesRequest listNotificationRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotificationRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotificationRulesRequest> request = null;
        Response<ListNotificationRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotificationRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotificationRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotificationRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotificationRulesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListNotificationRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags associated with a notification rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
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
     * Returns a list of the notification rule targets for an AWS account.
     * </p>
     * 
     * @param listTargetsRequest
     * @return Result of the ListTargets operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value for the enumeration token used in the request to return the next batch of the results is not
     *         valid.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.ListTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTargetsResult listTargets(ListTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeListTargets(request);
    }

    @SdkInternalApi
    final ListTargetsResult executeListTargets(ListTargetsRequest listTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTargetsRequest> request = null;
        Response<ListTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an association between a notification rule and an SNS topic so that the associated target can receive
     * notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param subscribeRequest
     * @return Result of the Subscribe operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @sample AWSCodeStarNotifications.Subscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Subscribe"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SubscribeResult subscribe(SubscribeRequest request) {
        request = beforeClientExecution(request);
        return executeSubscribe(request);
    }

    @SdkInternalApi
    final SubscribeResult executeSubscribe(SubscribeRequest subscribeRequest) {

        ExecutionContext executionContext = createExecutionContext(subscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeRequest> request = null;
        Response<SubscribeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(subscribeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Subscribe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubscribeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SubscribeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a set of provided tags with a notification rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @sample AWSCodeStarNotifications.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
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
     * Removes an association between a notification rule and an Amazon SNS topic so that subscribers to that topic stop
     * receiving notifications when the events described in the rule are triggered.
     * </p>
     * 
     * @param unsubscribeRequest
     * @return Result of the Unsubscribe operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @sample AWSCodeStarNotifications.Unsubscribe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Unsubscribe"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UnsubscribeResult unsubscribe(UnsubscribeRequest request) {
        request = beforeClientExecution(request);
        return executeUnsubscribe(request);
    }

    @SdkInternalApi
    final UnsubscribeResult executeUnsubscribe(UnsubscribeRequest unsubscribeRequest) {

        ExecutionContext executionContext = createExecutionContext(unsubscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeRequest> request = null;
        Response<UnsubscribeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unsubscribeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Unsubscribe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnsubscribeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnsubscribeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the association between one or more provided tags and a notification rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ConcurrentModificationException
     *         AWS CodeStar Notifications can't complete the request because the resource is being modified by another
     *         process. Wait a few minutes and try again.
     * @sample AWSCodeStarNotifications.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
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
     * <p>
     * Updates a notification rule for a resource. You can change the events that trigger the notification rule, the
     * status of the rule, and the targets that receive the notifications.
     * </p>
     * <note>
     * <p>
     * To add or remove tags for a notification rule, you must use <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * </note>
     * 
     * @param updateNotificationRuleRequest
     * @return Result of the UpdateNotificationRule operation returned by the service.
     * @throws ValidationException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         AWS CodeStar Notifications can't find a resource that matches the provided ARN.
     * @sample AWSCodeStarNotifications.UpdateNotificationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UpdateNotificationRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNotificationRuleResult updateNotificationRule(UpdateNotificationRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotificationRule(request);
    }

    @SdkInternalApi
    final UpdateNotificationRuleResult executeUpdateNotificationRule(UpdateNotificationRuleRequest updateNotificationRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotificationRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotificationRuleRequest> request = null;
        Response<UpdateNotificationRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotificationRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNotificationRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codestar notifications");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotificationRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotificationRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNotificationRuleResultJsonUnmarshaller());
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
