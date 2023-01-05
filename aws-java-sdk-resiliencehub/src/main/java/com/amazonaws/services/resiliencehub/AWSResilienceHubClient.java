/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub;

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

import com.amazonaws.services.resiliencehub.AWSResilienceHubClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.services.resiliencehub.model.transform.*;

/**
 * Client for accessing AWS Resilience Hub. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Resilience Hub helps you proactively prepare and protect your Amazon Web Services applications from disruptions.
 * Resilience Hub offers continuous resiliency assessment and validation that integrates into your software development
 * lifecycle. This enables you to uncover resiliency weaknesses, ensure recovery time objective (RTO) and recovery point
 * objective (RPO) targets for your applications are met, and resolve issues before they are released into production.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResilienceHubClient extends AmazonWebServiceClient implements AWSResilienceHub {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSResilienceHub.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "resiliencehub";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.resiliencehub.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.resiliencehub.model.AWSResilienceHubException.class));

    public static AWSResilienceHubClientBuilder builder() {
        return AWSResilienceHubClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resilience Hub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResilienceHubClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Resilience Hub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSResilienceHubClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("resiliencehub.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/resiliencehub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/resiliencehub/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds the resource mapping for the draft application version.
     * </p>
     * 
     * @param addDraftAppVersionResourceMappingsRequest
     * @return Result of the AddDraftAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.AddDraftAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AddDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddDraftAppVersionResourceMappingsResult addDraftAppVersionResourceMappings(AddDraftAppVersionResourceMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeAddDraftAppVersionResourceMappings(request);
    }

    @SdkInternalApi
    final AddDraftAppVersionResourceMappingsResult executeAddDraftAppVersionResourceMappings(
            AddDraftAppVersionResourceMappingsRequest addDraftAppVersionResourceMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(addDraftAppVersionResourceMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddDraftAppVersionResourceMappingsRequest> request = null;
        Response<AddDraftAppVersionResourceMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddDraftAppVersionResourceMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addDraftAppVersionResourceMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddDraftAppVersionResourceMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddDraftAppVersionResourceMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddDraftAppVersionResourceMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Resilience Hub application. A Resilience Hub application is a collection of Amazon Web Services
     * resources structured to prevent and recover Amazon Web Services application disruptions. To describe a Resilience
     * Hub application, you provide an application name, resources from one or more–up to five–CloudFormation stacks,
     * and an appropriate resiliency policy.
     * </p>
     * <p>
     * After you create a Resilience Hub application, you publish it so that you can run a resiliency assessment on it.
     * You can then use recommendations from the assessment to improve resiliency by running another assessment,
     * comparing results, and then iterating the process until you achieve your goals for recovery time objective (RTO)
     * and recovery point objective (RPO).
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateApp" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Creates a new recommendation template.
     * </p>
     * 
     * @param createRecommendationTemplateRequest
     * @return Result of the CreateRecommendationTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRecommendationTemplateResult createRecommendationTemplate(CreateRecommendationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRecommendationTemplate(request);
    }

    @SdkInternalApi
    final CreateRecommendationTemplateResult executeCreateRecommendationTemplate(CreateRecommendationTemplateRequest createRecommendationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createRecommendationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRecommendationTemplateRequest> request = null;
        Response<CreateRecommendationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRecommendationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRecommendationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRecommendationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRecommendationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRecommendationTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resiliency policy for an application.
     * </p>
     * 
     * @param createResiliencyPolicyRequest
     * @return Result of the CreateResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResiliencyPolicyResult createResiliencyPolicy(CreateResiliencyPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResiliencyPolicy(request);
    }

    @SdkInternalApi
    final CreateResiliencyPolicyResult executeCreateResiliencyPolicy(CreateResiliencyPolicyRequest createResiliencyPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createResiliencyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResiliencyPolicyRequest> request = null;
        Response<CreateResiliencyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResiliencyPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResiliencyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResiliencyPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResiliencyPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateResiliencyPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Resilience Hub application. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSResilienceHub.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteApp" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Deletes an AWS Resilience Hub application assessment. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppAssessmentRequest
     * @return Result of the DeleteAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppAssessmentResult deleteAppAssessment(DeleteAppAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppAssessment(request);
    }

    @SdkInternalApi
    final DeleteAppAssessmentResult executeDeleteAppAssessment(DeleteAppAssessmentRequest deleteAppAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppAssessmentRequest> request = null;
        Response<DeleteAppAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a recommendation template. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteRecommendationTemplateRequest
     * @return Result of the DeleteRecommendationTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRecommendationTemplateResult deleteRecommendationTemplate(DeleteRecommendationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecommendationTemplate(request);
    }

    @SdkInternalApi
    final DeleteRecommendationTemplateResult executeDeleteRecommendationTemplate(DeleteRecommendationTemplateRequest deleteRecommendationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecommendationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecommendationTemplateRequest> request = null;
        Response<DeleteRecommendationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecommendationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRecommendationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecommendationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecommendationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRecommendationTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resiliency policy. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteResiliencyPolicyRequest
     * @return Result of the DeleteResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResiliencyPolicyResult deleteResiliencyPolicy(DeleteResiliencyPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResiliencyPolicy(request);
    }

    @SdkInternalApi
    final DeleteResiliencyPolicyResult executeDeleteResiliencyPolicy(DeleteResiliencyPolicyRequest deleteResiliencyPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResiliencyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResiliencyPolicyRequest> request = null;
        Response<DeleteResiliencyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResiliencyPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResiliencyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResiliencyPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResiliencyPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteResiliencyPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppRequest
     * @return Result of the DescribeApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAppResult describeApp(DescribeAppRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApp(request);
    }

    @SdkInternalApi
    final DescribeAppResult executeDescribeApp(DescribeAppRequest describeAppRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppRequest> request = null;
        Response<DescribeAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an assessment for an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppAssessmentRequest
     * @return Result of the DescribeAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppAssessmentResult describeAppAssessment(DescribeAppAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppAssessment(request);
    }

    @SdkInternalApi
    final DescribeAppAssessmentResult executeDescribeAppAssessment(DescribeAppAssessmentRequest describeAppAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppAssessmentRequest> request = null;
        Response<DescribeAppAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAppAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppAssessmentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAppAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resolution status for the specified resolution identifier for an application version. If
     * <code>resolutionId</code> is not specified, the current resolution status is returned.
     * </p>
     * 
     * @param describeAppVersionResourcesResolutionStatusRequest
     * @return Result of the DescribeAppVersionResourcesResolutionStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersionResourcesResolutionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResourcesResolutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppVersionResourcesResolutionStatusResult describeAppVersionResourcesResolutionStatus(
            DescribeAppVersionResourcesResolutionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppVersionResourcesResolutionStatus(request);
    }

    @SdkInternalApi
    final DescribeAppVersionResourcesResolutionStatusResult executeDescribeAppVersionResourcesResolutionStatus(
            DescribeAppVersionResourcesResolutionStatusRequest describeAppVersionResourcesResolutionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppVersionResourcesResolutionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppVersionResourcesResolutionStatusRequest> request = null;
        Response<DescribeAppVersionResourcesResolutionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppVersionResourcesResolutionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAppVersionResourcesResolutionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppVersionResourcesResolutionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppVersionResourcesResolutionStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAppVersionResourcesResolutionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes details about an AWS Resilience Hub
     * </p>
     * 
     * @param describeAppVersionTemplateRequest
     * @return Result of the DescribeAppVersionTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppVersionTemplateResult describeAppVersionTemplate(DescribeAppVersionTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppVersionTemplate(request);
    }

    @SdkInternalApi
    final DescribeAppVersionTemplateResult executeDescribeAppVersionTemplate(DescribeAppVersionTemplateRequest describeAppVersionTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppVersionTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppVersionTemplateRequest> request = null;
        Response<DescribeAppVersionTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppVersionTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAppVersionTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppVersionTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppVersionTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAppVersionTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the status of importing resources to an application version.
     * </p>
     * 
     * @param describeDraftAppVersionResourcesImportStatusRequest
     * @return Result of the DescribeDraftAppVersionResourcesImportStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeDraftAppVersionResourcesImportStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeDraftAppVersionResourcesImportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDraftAppVersionResourcesImportStatusResult describeDraftAppVersionResourcesImportStatus(
            DescribeDraftAppVersionResourcesImportStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDraftAppVersionResourcesImportStatus(request);
    }

    @SdkInternalApi
    final DescribeDraftAppVersionResourcesImportStatusResult executeDescribeDraftAppVersionResourcesImportStatus(
            DescribeDraftAppVersionResourcesImportStatusRequest describeDraftAppVersionResourcesImportStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDraftAppVersionResourcesImportStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDraftAppVersionResourcesImportStatusRequest> request = null;
        Response<DescribeDraftAppVersionResourcesImportStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDraftAppVersionResourcesImportStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDraftAppVersionResourcesImportStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDraftAppVersionResourcesImportStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDraftAppVersionResourcesImportStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDraftAppVersionResourcesImportStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a specified resiliency policy for an AWS Resilience Hub application. The returned policy object
     * includes creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and
     * more.
     * </p>
     * 
     * @param describeResiliencyPolicyRequest
     * @return Result of the DescribeResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResiliencyPolicyResult describeResiliencyPolicy(DescribeResiliencyPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResiliencyPolicy(request);
    }

    @SdkInternalApi
    final DescribeResiliencyPolicyResult executeDescribeResiliencyPolicy(DescribeResiliencyPolicyRequest describeResiliencyPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResiliencyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResiliencyPolicyRequest> request = null;
        Response<DescribeResiliencyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResiliencyPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeResiliencyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResiliencyPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResiliencyPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResiliencyPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports resources from sources such as a CloudFormation stack, resource-groups, or application registry app to a
     * draft application version.
     * </p>
     * 
     * @param importResourcesToDraftAppVersionRequest
     * @return Result of the ImportResourcesToDraftAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ImportResourcesToDraftAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ImportResourcesToDraftAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportResourcesToDraftAppVersionResult importResourcesToDraftAppVersion(ImportResourcesToDraftAppVersionRequest request) {
        request = beforeClientExecution(request);
        return executeImportResourcesToDraftAppVersion(request);
    }

    @SdkInternalApi
    final ImportResourcesToDraftAppVersionResult executeImportResourcesToDraftAppVersion(
            ImportResourcesToDraftAppVersionRequest importResourcesToDraftAppVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(importResourcesToDraftAppVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportResourcesToDraftAppVersionRequest> request = null;
        Response<ImportResourcesToDraftAppVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportResourcesToDraftAppVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(importResourcesToDraftAppVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportResourcesToDraftAppVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportResourcesToDraftAppVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ImportResourcesToDraftAppVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the alarm recommendations for a AWS Resilience Hub application.
     * </p>
     * 
     * @param listAlarmRecommendationsRequest
     * @return Result of the ListAlarmRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAlarmRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAlarmRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAlarmRecommendationsResult listAlarmRecommendations(ListAlarmRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAlarmRecommendations(request);
    }

    @SdkInternalApi
    final ListAlarmRecommendationsResult executeListAlarmRecommendations(ListAlarmRecommendationsRequest listAlarmRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAlarmRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAlarmRecommendationsRequest> request = null;
        Response<ListAlarmRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAlarmRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAlarmRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAlarmRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAlarmRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAlarmRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessments for an AWS Resilience Hub application. You can use request parameters to refine the results
     * for the response object.
     * </p>
     * 
     * @param listAppAssessmentsRequest
     * @return Result of the ListAppAssessments operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppAssessmentsResult listAppAssessments(ListAppAssessmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppAssessments(request);
    }

    @SdkInternalApi
    final ListAppAssessmentsResult executeListAppAssessments(ListAppAssessmentsRequest listAppAssessmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppAssessmentsRequest> request = null;
        Response<ListAppAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppAssessmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppAssessments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppAssessmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppAssessmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the compliances for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentCompliancesRequest
     * @return Result of the ListAppComponentCompliances operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppComponentCompliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentCompliances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppComponentCompliancesResult listAppComponentCompliances(ListAppComponentCompliancesRequest request) {
        request = beforeClientExecution(request);
        return executeListAppComponentCompliances(request);
    }

    @SdkInternalApi
    final ListAppComponentCompliancesResult executeListAppComponentCompliances(ListAppComponentCompliancesRequest listAppComponentCompliancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppComponentCompliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppComponentCompliancesRequest> request = null;
        Response<ListAppComponentCompliancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppComponentCompliancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAppComponentCompliancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppComponentCompliances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppComponentCompliancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAppComponentCompliancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the recommendations for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentRecommendationsRequest
     * @return Result of the ListAppComponentRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppComponentRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppComponentRecommendationsResult listAppComponentRecommendations(ListAppComponentRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppComponentRecommendations(request);
    }

    @SdkInternalApi
    final ListAppComponentRecommendationsResult executeListAppComponentRecommendations(
            ListAppComponentRecommendationsRequest listAppComponentRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppComponentRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppComponentRecommendationsRequest> request = null;
        Response<ListAppComponentRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppComponentRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAppComponentRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppComponentRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppComponentRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAppComponentRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource
     * identifiers, CloudFormation stacks, resource-groups, or an application registry app.
     * </p>
     * 
     * @param listAppVersionResourceMappingsRequest
     * @return Result of the ListAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppVersionResourceMappingsResult listAppVersionResourceMappings(ListAppVersionResourceMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppVersionResourceMappings(request);
    }

    @SdkInternalApi
    final ListAppVersionResourceMappingsResult executeListAppVersionResourceMappings(ListAppVersionResourceMappingsRequest listAppVersionResourceMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppVersionResourceMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppVersionResourceMappingsRequest> request = null;
        Response<ListAppVersionResourceMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppVersionResourceMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAppVersionResourceMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppVersionResourceMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppVersionResourceMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAppVersionResourceMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the resources in an application version.
     * </p>
     * 
     * @param listAppVersionResourcesRequest
     * @return Result of the ListAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppVersionResourcesResult listAppVersionResources(ListAppVersionResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListAppVersionResources(request);
    }

    @SdkInternalApi
    final ListAppVersionResourcesResult executeListAppVersionResources(ListAppVersionResourcesRequest listAppVersionResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppVersionResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppVersionResourcesRequest> request = null;
        Response<ListAppVersionResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppVersionResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAppVersionResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppVersionResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppVersionResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAppVersionResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the different versions for the Resilience Hub applications.
     * </p>
     * 
     * @param listAppVersionsRequest
     * @return Result of the ListAppVersions operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAppVersionsResult listAppVersions(ListAppVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppVersions(request);
    }

    @SdkInternalApi
    final ListAppVersionsResult executeListAppVersions(ListAppVersionsRequest listAppVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppVersionsRequest> request = null;
        Response<ListAppVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your Resilience Hub applications.
     * </p>
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListApps" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Lists the recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @param listRecommendationTemplatesRequest
     * @return Result of the ListRecommendationTemplates operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListRecommendationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListRecommendationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecommendationTemplatesResult listRecommendationTemplates(ListRecommendationTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListRecommendationTemplates(request);
    }

    @SdkInternalApi
    final ListRecommendationTemplatesResult executeListRecommendationTemplates(ListRecommendationTemplatesRequest listRecommendationTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecommendationTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationTemplatesRequest> request = null;
        Response<ListRecommendationTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRecommendationTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecommendationTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecommendationTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRecommendationTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listResiliencyPoliciesRequest
     * @return Result of the ListResiliencyPolicies operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResiliencyPoliciesResult listResiliencyPolicies(ListResiliencyPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListResiliencyPolicies(request);
    }

    @SdkInternalApi
    final ListResiliencyPoliciesResult executeListResiliencyPolicies(ListResiliencyPoliciesRequest listResiliencyPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResiliencyPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResiliencyPoliciesRequest> request = null;
        Response<ListResiliencyPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResiliencyPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResiliencyPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResiliencyPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResiliencyPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResiliencyPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the standard operating procedure (SOP) recommendations for the Resilience Hub applications.
     * </p>
     * 
     * @param listSopRecommendationsRequest
     * @return Result of the ListSopRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListSopRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSopRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSopRecommendationsResult listSopRecommendations(ListSopRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSopRecommendations(request);
    }

    @SdkInternalApi
    final ListSopRecommendationsResult executeListSopRecommendations(ListSopRecommendationsRequest listSopRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSopRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSopRecommendationsRequest> request = null;
        Response<ListSopRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSopRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSopRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSopRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSopRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSopRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the suggested resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listSuggestedResiliencyPoliciesRequest
     * @return Result of the ListSuggestedResiliencyPolicies operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListSuggestedResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSuggestedResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSuggestedResiliencyPoliciesResult listSuggestedResiliencyPolicies(ListSuggestedResiliencyPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListSuggestedResiliencyPolicies(request);
    }

    @SdkInternalApi
    final ListSuggestedResiliencyPoliciesResult executeListSuggestedResiliencyPolicies(
            ListSuggestedResiliencyPoliciesRequest listSuggestedResiliencyPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSuggestedResiliencyPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSuggestedResiliencyPoliciesRequest> request = null;
        Response<ListSuggestedResiliencyPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSuggestedResiliencyPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSuggestedResiliencyPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSuggestedResiliencyPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSuggestedResiliencyPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSuggestedResiliencyPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for your resources in your Resilience Hub applications.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Lists the test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @param listTestRecommendationsRequest
     * @return Result of the ListTestRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListTestRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTestRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTestRecommendationsResult listTestRecommendations(ListTestRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListTestRecommendations(request);
    }

    @SdkInternalApi
    final ListTestRecommendationsResult executeListTestRecommendations(ListTestRecommendationsRequest listTestRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestRecommendationsRequest> request = null;
        Response<ListTestRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTestRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTestRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resources that are not currently supported in AWS Resilience Hub. An unsupported resource is a resource
     * that exists in the object that was used to create an app, but is not supported by Resilience Hub.
     * </p>
     * 
     * @param listUnsupportedAppVersionResourcesRequest
     * @return Result of the ListUnsupportedAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListUnsupportedAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListUnsupportedAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUnsupportedAppVersionResourcesResult listUnsupportedAppVersionResources(ListUnsupportedAppVersionResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListUnsupportedAppVersionResources(request);
    }

    @SdkInternalApi
    final ListUnsupportedAppVersionResourcesResult executeListUnsupportedAppVersionResources(
            ListUnsupportedAppVersionResourcesRequest listUnsupportedAppVersionResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listUnsupportedAppVersionResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUnsupportedAppVersionResourcesRequest> request = null;
        Response<ListUnsupportedAppVersionResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUnsupportedAppVersionResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listUnsupportedAppVersionResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUnsupportedAppVersionResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUnsupportedAppVersionResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListUnsupportedAppVersionResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes a new version of a specific Resilience Hub application.
     * </p>
     * 
     * @param publishAppVersionRequest
     * @return Result of the PublishAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.PublishAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PublishAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PublishAppVersionResult publishAppVersion(PublishAppVersionRequest request) {
        request = beforeClientExecution(request);
        return executePublishAppVersion(request);
    }

    @SdkInternalApi
    final PublishAppVersionResult executePublishAppVersion(PublishAppVersionRequest publishAppVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(publishAppVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishAppVersionRequest> request = null;
        Response<PublishAppVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishAppVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishAppVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishAppVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishAppVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishAppVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates the app template for a draft version of a Resilience Hub app.
     * </p>
     * 
     * @param putDraftAppVersionTemplateRequest
     * @return Result of the PutDraftAppVersionTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.PutDraftAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PutDraftAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDraftAppVersionTemplateResult putDraftAppVersionTemplate(PutDraftAppVersionTemplateRequest request) {
        request = beforeClientExecution(request);
        return executePutDraftAppVersionTemplate(request);
    }

    @SdkInternalApi
    final PutDraftAppVersionTemplateResult executePutDraftAppVersionTemplate(PutDraftAppVersionTemplateRequest putDraftAppVersionTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(putDraftAppVersionTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDraftAppVersionTemplateRequest> request = null;
        Response<PutDraftAppVersionTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDraftAppVersionTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDraftAppVersionTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDraftAppVersionTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDraftAppVersionTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDraftAppVersionTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes resource mappings from a draft application version.
     * </p>
     * 
     * @param removeDraftAppVersionResourceMappingsRequest
     * @return Result of the RemoveDraftAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.RemoveDraftAppVersionResourceMappings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RemoveDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveDraftAppVersionResourceMappingsResult removeDraftAppVersionResourceMappings(RemoveDraftAppVersionResourceMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveDraftAppVersionResourceMappings(request);
    }

    @SdkInternalApi
    final RemoveDraftAppVersionResourceMappingsResult executeRemoveDraftAppVersionResourceMappings(
            RemoveDraftAppVersionResourceMappingsRequest removeDraftAppVersionResourceMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeDraftAppVersionResourceMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveDraftAppVersionResourceMappingsRequest> request = null;
        Response<RemoveDraftAppVersionResourceMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveDraftAppVersionResourceMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeDraftAppVersionResourceMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveDraftAppVersionResourceMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveDraftAppVersionResourceMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveDraftAppVersionResourceMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resolves the resources for an application version.
     * </p>
     * 
     * @param resolveAppVersionResourcesRequest
     * @return Result of the ResolveAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ResolveAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResolveAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResolveAppVersionResourcesResult resolveAppVersionResources(ResolveAppVersionResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeResolveAppVersionResources(request);
    }

    @SdkInternalApi
    final ResolveAppVersionResourcesResult executeResolveAppVersionResources(ResolveAppVersionResourcesRequest resolveAppVersionResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveAppVersionResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveAppVersionResourcesRequest> request = null;
        Response<ResolveAppVersionResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveAppVersionResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(resolveAppVersionResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveAppVersionResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResolveAppVersionResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResolveAppVersionResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new application assessment for an application.
     * </p>
     * 
     * @param startAppAssessmentRequest
     * @return Result of the StartAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.StartAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/StartAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAppAssessmentResult startAppAssessment(StartAppAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeStartAppAssessment(request);
    }

    @SdkInternalApi
    final StartAppAssessmentResult executeStartAppAssessment(StartAppAssessmentRequest startAppAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(startAppAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAppAssessmentRequest> request = null;
        Response<StartAppAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAppAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAppAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAppAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAppAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartAppAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Updates an application.
     * </p>
     * 
     * @param updateAppRequest
     * @return Result of the UpdateApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateApp" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
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
     * Updates a resiliency policy.
     * </p>
     * 
     * @param updateResiliencyPolicyRequest
     * @return Result of the UpdateResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResiliencyPolicyResult updateResiliencyPolicy(UpdateResiliencyPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResiliencyPolicy(request);
    }

    @SdkInternalApi
    final UpdateResiliencyPolicyResult executeUpdateResiliencyPolicy(UpdateResiliencyPolicyRequest updateResiliencyPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResiliencyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResiliencyPolicyRequest> request = null;
        Response<UpdateResiliencyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResiliencyPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResiliencyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "resiliencehub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResiliencyPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResiliencyPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateResiliencyPolicyResultJsonUnmarshaller());
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
