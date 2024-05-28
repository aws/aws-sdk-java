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
package com.amazonaws.services.mailmanager;

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

import com.amazonaws.services.mailmanager.AWSMailManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mailmanager.model.*;

import com.amazonaws.services.mailmanager.model.transform.*;

/**
 * Client for accessing MailManager. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * <fullname>AWS SES Mail Manager API</fullname>
 * <p>
 * <a href="http://aws.amazon.com/ses">AWS SES Mail Manager API</a> contains operations and data types that comprise the
 * Mail Manager feature of Amazon Simple Email Service.
 * </p>
 * <p>
 * Mail Manager is a set of Amazon SES email gateway features designed to help you strengthen your organization's email
 * infrastructure, simplify email workflow management, and streamline email compliance control. To learn more, see the
 * <a href="https://docs.aws.amazon.com/ses/latest/dg/eb.html">Mail Manager chapter</a> in the Amazon SES Developer
 * Guide.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMailManagerClient extends AmazonWebServiceClient implements AWSMailManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMailManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ses";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mailmanager.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mailmanager.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mailmanager.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mailmanager.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mailmanager.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mailmanager.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mailmanager.model.AWSMailManagerException.class));

    public static AWSMailManagerClientBuilder builder() {
        return AWSMailManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MailManager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMailManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MailManager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMailManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mail-manager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mailmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mailmanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Add On instance for the subscription indicated in the request. The resulting Amazon Resource Name
     * (ARN) can be used in a conditional statement for a rule set or traffic policy.
     * </p>
     * 
     * @param createAddonInstanceRequest
     * @return Result of the CreateAddonInstance operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.CreateAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAddonInstanceResult createAddonInstance(CreateAddonInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAddonInstance(request);
    }

    @SdkInternalApi
    final CreateAddonInstanceResult executeCreateAddonInstance(CreateAddonInstanceRequest createAddonInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createAddonInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddonInstanceRequest> request = null;
        Response<CreateAddonInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddonInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAddonInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAddonInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAddonInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAddonInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a subscription for an Add On representing the acceptance of its terms of use and additional pricing. The
     * subscription can then be used to create an instance for use in rule sets or traffic policies.
     * </p>
     * 
     * @param createAddonSubscriptionRequest
     * @return Result of the CreateAddonSubscription operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAddonSubscriptionResult createAddonSubscription(CreateAddonSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAddonSubscription(request);
    }

    @SdkInternalApi
    final CreateAddonSubscriptionResult executeCreateAddonSubscription(CreateAddonSubscriptionRequest createAddonSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createAddonSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddonSubscriptionRequest> request = null;
        Response<CreateAddonSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddonSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAddonSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAddonSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAddonSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAddonSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new email archive resource for storing and retaining emails.
     * </p>
     * 
     * @param createArchiveRequest
     *        The request to create a new email archive.
     * @return Result of the CreateArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.CreateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateArchiveResult createArchive(CreateArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeCreateArchive(request);
    }

    @SdkInternalApi
    final CreateArchiveResult executeCreateArchive(CreateArchiveRequest createArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(createArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateArchiveRequest> request = null;
        Response<CreateArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provision a new ingress endpoint resource.
     * </p>
     * 
     * @param createIngressPointRequest
     * @return Result of the CreateIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateIngressPointResult createIngressPoint(CreateIngressPointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIngressPoint(request);
    }

    @SdkInternalApi
    final CreateIngressPointResult executeCreateIngressPoint(CreateIngressPointRequest createIngressPointRequest) {

        ExecutionContext executionContext = createExecutionContext(createIngressPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIngressPointRequest> request = null;
        Response<CreateIngressPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIngressPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIngressPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIngressPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIngressPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIngressPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a relay resource which can be used in rules to relay incoming emails to defined relay destinations.
     * </p>
     * 
     * @param createRelayRequest
     * @return Result of the CreateRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRelayResult createRelay(CreateRelayRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRelay(request);
    }

    @SdkInternalApi
    final CreateRelayResult executeCreateRelay(CreateRelayRequest createRelayRequest) {

        ExecutionContext executionContext = createExecutionContext(createRelayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRelayRequest> request = null;
        Response<CreateRelayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRelayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRelayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRelay");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRelayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRelayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provision a new rule set.
     * </p>
     * 
     * @param createRuleSetRequest
     * @return Result of the CreateRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleSetResult createRuleSet(CreateRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRuleSet(request);
    }

    @SdkInternalApi
    final CreateRuleSetResult executeCreateRuleSet(CreateRuleSetRequest createRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleSetRequest> request = null;
        Response<CreateRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provision a new traffic policy resource.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     * @return Result of the CreateTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrafficPolicy(request);
    }

    @SdkInternalApi
    final CreateTrafficPolicyResult executeCreateTrafficPolicy(CreateTrafficPolicyRequest createTrafficPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrafficPolicyRequest> request = null;
        Response<CreateTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrafficPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrafficPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrafficPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrafficPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Add On instance.
     * </p>
     * 
     * @param deleteAddonInstanceRequest
     * @return Result of the DeleteAddonInstance operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.DeleteAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAddonInstanceResult deleteAddonInstance(DeleteAddonInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAddonInstance(request);
    }

    @SdkInternalApi
    final DeleteAddonInstanceResult executeDeleteAddonInstance(DeleteAddonInstanceRequest deleteAddonInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAddonInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAddonInstanceRequest> request = null;
        Response<DeleteAddonInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAddonInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAddonInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAddonInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAddonInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAddonInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Add On subscription.
     * </p>
     * 
     * @param deleteAddonSubscriptionRequest
     * @return Result of the DeleteAddonSubscription operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.DeleteAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAddonSubscriptionResult deleteAddonSubscription(DeleteAddonSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAddonSubscription(request);
    }

    @SdkInternalApi
    final DeleteAddonSubscriptionResult executeDeleteAddonSubscription(DeleteAddonSubscriptionRequest deleteAddonSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAddonSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAddonSubscriptionRequest> request = null;
        Response<DeleteAddonSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAddonSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAddonSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAddonSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAddonSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAddonSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates deletion of an email archive. This changes the archive state to pending deletion. In this state, no new
     * emails can be added, and existing archived emails become inaccessible (search, export, download). The archive and
     * all of its contents will be permanently deleted 30 days after entering the pending deletion state, regardless of
     * the configured retention period.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        The request to initiate deletion of an email archive.
     * @return Result of the DeleteArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.DeleteArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteArchive" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteArchiveResult deleteArchive(DeleteArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteArchive(request);
    }

    @SdkInternalApi
    final DeleteArchiveResult executeDeleteArchive(DeleteArchiveRequest deleteArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteArchiveRequest> request = null;
        Response<DeleteArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an ingress endpoint resource.
     * </p>
     * 
     * @param deleteIngressPointRequest
     * @return Result of the DeleteIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.DeleteIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteIngressPointResult deleteIngressPoint(DeleteIngressPointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIngressPoint(request);
    }

    @SdkInternalApi
    final DeleteIngressPointResult executeDeleteIngressPoint(DeleteIngressPointRequest deleteIngressPointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIngressPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIngressPointRequest> request = null;
        Response<DeleteIngressPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIngressPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIngressPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIngressPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIngressPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIngressPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing relay resource.
     * </p>
     * 
     * @param deleteRelayRequest
     * @return Result of the DeleteRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.DeleteRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRelay" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRelayResult deleteRelay(DeleteRelayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRelay(request);
    }

    @SdkInternalApi
    final DeleteRelayResult executeDeleteRelay(DeleteRelayRequest deleteRelayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRelayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRelayRequest> request = null;
        Response<DeleteRelayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRelayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRelayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRelay");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRelayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRelayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a rule set.
     * </p>
     * 
     * @param deleteRuleSetRequest
     * @return Result of the DeleteRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AWSMailManager.DeleteRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleSetResult deleteRuleSet(DeleteRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRuleSet(request);
    }

    @SdkInternalApi
    final DeleteRuleSetResult executeDeleteRuleSet(DeleteRuleSetRequest deleteRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleSetRequest> request = null;
        Response<DeleteRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a traffic policy resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     * @return Result of the DeleteTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrafficPolicyResult deleteTrafficPolicy(DeleteTrafficPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrafficPolicy(request);
    }

    @SdkInternalApi
    final DeleteTrafficPolicyResult executeDeleteTrafficPolicy(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrafficPolicyRequest> request = null;
        Response<DeleteTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrafficPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrafficPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrafficPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrafficPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about an Add On instance.
     * </p>
     * 
     * @param getAddonInstanceRequest
     * @return Result of the GetAddonInstance operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetAddonInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAddonInstanceResult getAddonInstance(GetAddonInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetAddonInstance(request);
    }

    @SdkInternalApi
    final GetAddonInstanceResult executeGetAddonInstance(GetAddonInstanceRequest getAddonInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getAddonInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAddonInstanceRequest> request = null;
        Response<GetAddonInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAddonInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAddonInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAddonInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAddonInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAddonInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about an Add On subscription.
     * </p>
     * 
     * @param getAddonSubscriptionRequest
     * @return Result of the GetAddonSubscription operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetAddonSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetAddonSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAddonSubscriptionResult getAddonSubscription(GetAddonSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetAddonSubscription(request);
    }

    @SdkInternalApi
    final GetAddonSubscriptionResult executeGetAddonSubscription(GetAddonSubscriptionRequest getAddonSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getAddonSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAddonSubscriptionRequest> request = null;
        Response<GetAddonSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAddonSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAddonSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAddonSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAddonSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAddonSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the full details and current state of a specified email archive.
     * </p>
     * 
     * @param getArchiveRequest
     *        The request to retrieve details of an email archive.
     * @return Result of the GetArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchive" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetArchiveResult getArchive(GetArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchive(request);
    }

    @SdkInternalApi
    final GetArchiveResult executeGetArchive(GetArchiveRequest getArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveRequest> request = null;
        Response<GetArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive export job.
     * </p>
     * 
     * @param getArchiveExportRequest
     *        The request to retrieve details of a specific archive export job.
     * @return Result of the GetArchiveExport operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetArchiveExportResult getArchiveExport(GetArchiveExportRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchiveExport(request);
    }

    @SdkInternalApi
    final GetArchiveExportResult executeGetArchiveExport(GetArchiveExportRequest getArchiveExportRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveExportRequest> request = null;
        Response<GetArchiveExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getArchiveExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchiveExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetArchiveExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a pre-signed URL that provides temporary download access to the specific email message stored in the
     * archive.
     * </p>
     * 
     * @param getArchiveMessageRequest
     *        The request to get details of a specific email message stored in an archive.
     * @return Result of the GetArchiveMessage operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetArchiveMessageResult getArchiveMessage(GetArchiveMessageRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchiveMessage(request);
    }

    @SdkInternalApi
    final GetArchiveMessageResult executeGetArchiveMessage(GetArchiveMessageRequest getArchiveMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveMessageRequest> request = null;
        Response<GetArchiveMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getArchiveMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchiveMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetArchiveMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the textual content of a specific email message stored in the archive. Attachments are not included.
     * </p>
     * 
     * @param getArchiveMessageContentRequest
     *        The request to get the textual content of a specific email message stored in an archive.
     * @return Result of the GetArchiveMessageContent operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveMessageContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveMessageContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetArchiveMessageContentResult getArchiveMessageContent(GetArchiveMessageContentRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchiveMessageContent(request);
    }

    @SdkInternalApi
    final GetArchiveMessageContentResult executeGetArchiveMessageContent(GetArchiveMessageContentRequest getArchiveMessageContentRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveMessageContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveMessageContentRequest> request = null;
        Response<GetArchiveMessageContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveMessageContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getArchiveMessageContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchiveMessageContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveMessageContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetArchiveMessageContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details and current status of a specific email archive search job.
     * </p>
     * 
     * @param getArchiveSearchRequest
     *        The request to retrieve details of a specific archive search job.
     * @return Result of the GetArchiveSearch operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetArchiveSearchResult getArchiveSearch(GetArchiveSearchRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchiveSearch(request);
    }

    @SdkInternalApi
    final GetArchiveSearchResult executeGetArchiveSearch(GetArchiveSearchRequest getArchiveSearchRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveSearchRequest> request = null;
        Response<GetArchiveSearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveSearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getArchiveSearchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchiveSearch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveSearchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetArchiveSearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the results of a completed email archive search job.
     * </p>
     * 
     * @param getArchiveSearchResultsRequest
     *        The request to retrieve results from a completed archive search job.
     * @return Result of the GetArchiveSearchResults operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.GetArchiveSearchResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveSearchResults"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetArchiveSearchResultsResult getArchiveSearchResults(GetArchiveSearchResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchiveSearchResults(request);
    }

    @SdkInternalApi
    final GetArchiveSearchResultsResult executeGetArchiveSearchResults(GetArchiveSearchResultsRequest getArchiveSearchResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveSearchResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveSearchResultsRequest> request = null;
        Response<GetArchiveSearchResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveSearchResultsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getArchiveSearchResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchiveSearchResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveSearchResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetArchiveSearchResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetch ingress endpoint resource attributes.
     * </p>
     * 
     * @param getIngressPointRequest
     * @return Result of the GetIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetIngressPointResult getIngressPoint(GetIngressPointRequest request) {
        request = beforeClientExecution(request);
        return executeGetIngressPoint(request);
    }

    @SdkInternalApi
    final GetIngressPointResult executeGetIngressPoint(GetIngressPointRequest getIngressPointRequest) {

        ExecutionContext executionContext = createExecutionContext(getIngressPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIngressPointRequest> request = null;
        Response<GetIngressPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIngressPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIngressPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIngressPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIngressPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIngressPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetch the relay resource and it's attributes.
     * </p>
     * 
     * @param getRelayRequest
     * @return Result of the GetRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRelay" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRelayResult getRelay(GetRelayRequest request) {
        request = beforeClientExecution(request);
        return executeGetRelay(request);
    }

    @SdkInternalApi
    final GetRelayResult executeGetRelay(GetRelayRequest getRelayRequest) {

        ExecutionContext executionContext = createExecutionContext(getRelayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRelayRequest> request = null;
        Response<GetRelayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRelayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRelayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRelay");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRelayResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRelayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetch attributes of a rule set.
     * </p>
     * 
     * @param getRuleSetRequest
     * @return Result of the GetRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRuleSetResult getRuleSet(GetRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetRuleSet(request);
    }

    @SdkInternalApi
    final GetRuleSetResult executeGetRuleSet(GetRuleSetRequest getRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleSetRequest> request = null;
        Response<GetRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Fetch attributes of a traffic policy resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     * @return Result of the GetTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrafficPolicy(request);
    }

    @SdkInternalApi
    final GetTrafficPolicyResult executeGetTrafficPolicy(GetTrafficPolicyRequest getTrafficPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrafficPolicyRequest> request = null;
        Response<GetTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrafficPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrafficPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrafficPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTrafficPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Add On instances in your account.
     * </p>
     * 
     * @param listAddonInstancesRequest
     * @return Result of the ListAddonInstances operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListAddonInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAddonInstancesResult listAddonInstances(ListAddonInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListAddonInstances(request);
    }

    @SdkInternalApi
    final ListAddonInstancesResult executeListAddonInstances(ListAddonInstancesRequest listAddonInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAddonInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAddonInstancesRequest> request = null;
        Response<ListAddonInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAddonInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAddonInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAddonInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAddonInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAddonInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Add On subscriptions in your account.
     * </p>
     * 
     * @param listAddonSubscriptionsRequest
     * @return Result of the ListAddonSubscriptions operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListAddonSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAddonSubscriptionsResult listAddonSubscriptions(ListAddonSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAddonSubscriptions(request);
    }

    @SdkInternalApi
    final ListAddonSubscriptionsResult executeListAddonSubscriptions(ListAddonSubscriptionsRequest listAddonSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAddonSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAddonSubscriptionsRequest> request = null;
        Response<ListAddonSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAddonSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAddonSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAddonSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAddonSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAddonSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of email archive export jobs.
     * </p>
     * 
     * @param listArchiveExportsRequest
     *        The request to list archive export jobs in your account.
     * @return Result of the ListArchiveExports operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.ListArchiveExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveExports" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListArchiveExportsResult listArchiveExports(ListArchiveExportsRequest request) {
        request = beforeClientExecution(request);
        return executeListArchiveExports(request);
    }

    @SdkInternalApi
    final ListArchiveExportsResult executeListArchiveExports(ListArchiveExportsRequest listArchiveExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listArchiveExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArchiveExportsRequest> request = null;
        Response<ListArchiveExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArchiveExportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listArchiveExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListArchiveExports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListArchiveExportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListArchiveExportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of email archive search jobs.
     * </p>
     * 
     * @param listArchiveSearchesRequest
     *        The request to list archive search jobs in your account.
     * @return Result of the ListArchiveSearches operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.ListArchiveSearches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchiveSearches"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListArchiveSearchesResult listArchiveSearches(ListArchiveSearchesRequest request) {
        request = beforeClientExecution(request);
        return executeListArchiveSearches(request);
    }

    @SdkInternalApi
    final ListArchiveSearchesResult executeListArchiveSearches(ListArchiveSearchesRequest listArchiveSearchesRequest) {

        ExecutionContext executionContext = createExecutionContext(listArchiveSearchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArchiveSearchesRequest> request = null;
        Response<ListArchiveSearchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArchiveSearchesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listArchiveSearchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListArchiveSearches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListArchiveSearchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListArchiveSearchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all email archives in your account.
     * </p>
     * 
     * @param listArchivesRequest
     *        The request to list email archives in your account.
     * @return Result of the ListArchives operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.ListArchives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListArchives" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListArchivesResult listArchives(ListArchivesRequest request) {
        request = beforeClientExecution(request);
        return executeListArchives(request);
    }

    @SdkInternalApi
    final ListArchivesResult executeListArchives(ListArchivesRequest listArchivesRequest) {

        ExecutionContext executionContext = createExecutionContext(listArchivesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArchivesRequest> request = null;
        Response<ListArchivesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArchivesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listArchivesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListArchives");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListArchivesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListArchivesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all ingress endpoint resources.
     * </p>
     * 
     * @param listIngressPointsRequest
     * @return Result of the ListIngressPoints operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListIngressPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListIngressPoints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListIngressPointsResult listIngressPoints(ListIngressPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListIngressPoints(request);
    }

    @SdkInternalApi
    final ListIngressPointsResult executeListIngressPoints(ListIngressPointsRequest listIngressPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIngressPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIngressPointsRequest> request = null;
        Response<ListIngressPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIngressPointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIngressPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIngressPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIngressPointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIngressPointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the existing relay resources.
     * </p>
     * 
     * @param listRelaysRequest
     * @return Result of the ListRelays operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListRelays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRelays" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRelaysResult listRelays(ListRelaysRequest request) {
        request = beforeClientExecution(request);
        return executeListRelays(request);
    }

    @SdkInternalApi
    final ListRelaysResult executeListRelays(ListRelaysRequest listRelaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listRelaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRelaysRequest> request = null;
        Response<ListRelaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRelaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRelaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRelays");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRelaysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRelaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List rule sets for this account.
     * </p>
     * 
     * @param listRuleSetsRequest
     * @return Result of the ListRuleSets operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListRuleSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRuleSetsResult listRuleSets(ListRuleSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListRuleSets(request);
    }

    @SdkInternalApi
    final ListRuleSetsResult executeListRuleSets(ListRuleSetsRequest listRuleSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRuleSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleSetsRequest> request = null;
        Response<ListRuleSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRuleSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuleSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRuleSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRuleSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of tags (keys and values) assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
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
     * List traffic policy resources.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     * @return Result of the ListTrafficPolicies operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @sample AWSMailManager.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListTrafficPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrafficPoliciesResult listTrafficPolicies(ListTrafficPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListTrafficPolicies(request);
    }

    @SdkInternalApi
    final ListTrafficPoliciesResult executeListTrafficPolicies(ListTrafficPoliciesRequest listTrafficPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrafficPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficPoliciesRequest> request = null;
        Response<ListTrafficPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrafficPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrafficPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrafficPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrafficPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates an export of emails from the specified archive.
     * </p>
     * 
     * @param startArchiveExportRequest
     *        The request to initiate an export of emails from an archive.
     * @return Result of the StartArchiveExport operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StartArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartArchiveExportResult startArchiveExport(StartArchiveExportRequest request) {
        request = beforeClientExecution(request);
        return executeStartArchiveExport(request);
    }

    @SdkInternalApi
    final StartArchiveExportResult executeStartArchiveExport(StartArchiveExportRequest startArchiveExportRequest) {

        ExecutionContext executionContext = createExecutionContext(startArchiveExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartArchiveExportRequest> request = null;
        Response<StartArchiveExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartArchiveExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startArchiveExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartArchiveExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartArchiveExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartArchiveExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a search across emails in the specified archive.
     * </p>
     * 
     * @param startArchiveSearchRequest
     *        The request to initiate a search across emails in an archive.
     * @return Result of the StartArchiveSearch operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StartArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StartArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartArchiveSearchResult startArchiveSearch(StartArchiveSearchRequest request) {
        request = beforeClientExecution(request);
        return executeStartArchiveSearch(request);
    }

    @SdkInternalApi
    final StartArchiveSearchResult executeStartArchiveSearch(StartArchiveSearchRequest startArchiveSearchRequest) {

        ExecutionContext executionContext = createExecutionContext(startArchiveSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartArchiveSearchRequest> request = null;
        Response<StartArchiveSearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartArchiveSearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startArchiveSearchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartArchiveSearch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartArchiveSearchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartArchiveSearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an in-progress export of emails from an archive.
     * </p>
     * 
     * @param stopArchiveExportRequest
     *        The request to stop an in-progress archive export job.
     * @return Result of the StopArchiveExport operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StopArchiveExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveExport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopArchiveExportResult stopArchiveExport(StopArchiveExportRequest request) {
        request = beforeClientExecution(request);
        return executeStopArchiveExport(request);
    }

    @SdkInternalApi
    final StopArchiveExportResult executeStopArchiveExport(StopArchiveExportRequest stopArchiveExportRequest) {

        ExecutionContext executionContext = createExecutionContext(stopArchiveExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopArchiveExportRequest> request = null;
        Response<StopArchiveExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopArchiveExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopArchiveExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopArchiveExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopArchiveExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopArchiveExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an in-progress archive search job.
     * </p>
     * 
     * @param stopArchiveSearchRequest
     *        The request to stop an in-progress archive search job.
     * @return Result of the StopArchiveSearch operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.StopArchiveSearch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/StopArchiveSearch" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopArchiveSearchResult stopArchiveSearch(StopArchiveSearchRequest request) {
        request = beforeClientExecution(request);
        return executeStopArchiveSearch(request);
    }

    @SdkInternalApi
    final StopArchiveSearchResult executeStopArchiveSearch(StopArchiveSearchRequest stopArchiveSearchRequest) {

        ExecutionContext executionContext = createExecutionContext(stopArchiveSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopArchiveSearchRequest> request = null;
        Response<StopArchiveSearchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopArchiveSearchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopArchiveSearchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopArchiveSearch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopArchiveSearchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopArchiveSearchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags (keys and values) to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/TagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
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
     * Remove one or more tags (keys and values) from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
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
     * Updates the attributes of an existing email archive.
     * </p>
     * 
     * @param updateArchiveRequest
     *        The request to update properties of an existing email archive.
     * @return Result of the UpdateArchive operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws AccessDeniedException
     *         Occurs when a user is denied access to a specific resource or action.
     * @throws ServiceQuotaExceededException
     *         Occurs when an operation exceeds a predefined service quota or limit.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @throws ThrottlingException
     *         Occurs when a service's request rate limit is exceeded, resulting in throttling of further requests.
     * @sample AWSMailManager.UpdateArchive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateArchive" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateArchiveResult updateArchive(UpdateArchiveRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateArchive(request);
    }

    @SdkInternalApi
    final UpdateArchiveResult executeUpdateArchive(UpdateArchiveRequest updateArchiveRequest) {

        ExecutionContext executionContext = createExecutionContext(updateArchiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateArchiveRequest> request = null;
        Response<UpdateArchiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateArchiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateArchiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateArchive");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateArchiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateArchiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update attributes of a provisioned ingress endpoint resource.
     * </p>
     * 
     * @param updateIngressPointRequest
     * @return Result of the UpdateIngressPoint operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateIngressPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateIngressPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateIngressPointResult updateIngressPoint(UpdateIngressPointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIngressPoint(request);
    }

    @SdkInternalApi
    final UpdateIngressPointResult executeUpdateIngressPoint(UpdateIngressPointRequest updateIngressPointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIngressPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIngressPointRequest> request = null;
        Response<UpdateIngressPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIngressPointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIngressPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIngressPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIngressPointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIngressPointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the attributes of an existing relay resource.
     * </p>
     * 
     * @param updateRelayRequest
     * @return Result of the UpdateRelay operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateRelay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRelay" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRelayResult updateRelay(UpdateRelayRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRelay(request);
    }

    @SdkInternalApi
    final UpdateRelayResult executeUpdateRelay(UpdateRelayRequest updateRelayRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRelayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRelayRequest> request = null;
        Response<UpdateRelayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRelayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRelayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRelay");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRelayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRelayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * &gt;Update attributes of an already provisioned rule set.
     * </p>
     * 
     * @param updateRuleSetRequest
     * @return Result of the UpdateRuleSet operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRuleSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRuleSetResult updateRuleSet(UpdateRuleSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleSet(request);
    }

    @SdkInternalApi
    final UpdateRuleSetResult executeUpdateRuleSet(UpdateRuleSetRequest updateRuleSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleSetRequest> request = null;
        Response<UpdateRuleSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update attributes of an already provisioned traffic policy resource.
     * </p>
     * 
     * @param updateTrafficPolicyRequest
     * @return Result of the UpdateTrafficPolicy operation returned by the service.
     * @throws ValidationException
     *         The request validation has failed. For details, see the accompanying error message.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ResourceNotFoundException
     *         Occurs when a requested resource is not found.
     * @sample AWSMailManager.UpdateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateTrafficPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTrafficPolicyResult updateTrafficPolicy(UpdateTrafficPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrafficPolicy(request);
    }

    @SdkInternalApi
    final UpdateTrafficPolicyResult executeUpdateTrafficPolicy(UpdateTrafficPolicyRequest updateTrafficPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrafficPolicyRequest> request = null;
        Response<UpdateTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrafficPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MailManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrafficPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrafficPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrafficPolicyResultJsonUnmarshaller());
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
