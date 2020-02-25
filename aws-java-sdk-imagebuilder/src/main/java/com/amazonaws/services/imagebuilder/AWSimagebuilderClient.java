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
package com.amazonaws.services.imagebuilder;

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

import com.amazonaws.services.imagebuilder.AWSimagebuilderClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.services.imagebuilder.model.transform.*;

/**
 * Client for accessing imagebuilder. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * EC2 Image Builder is a fully managed AWS service that makes it easier to automate the creation, management, and
 * deployment of customized, secure, and up-to-date “golden” server images that are pre-installed and pre-configured
 * with software and settings to meet specific IT standards.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSimagebuilderClient extends AmazonWebServiceClient implements AWSimagebuilder {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSimagebuilder.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "imagebuilder";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CallRateLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.CallRateLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidVersionNumberException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.InvalidVersionNumberExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.IdempotentParameterMismatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterCombinationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.InvalidParameterCombinationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDependencyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ResourceDependencyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.imagebuilder.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.imagebuilder.model.AWSimagebuilderException.class));

    public static AWSimagebuilderClientBuilder builder() {
        return AWSimagebuilderClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on imagebuilder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSimagebuilderClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on imagebuilder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSimagebuilderClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("imagebuilder.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/imagebuilder/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/imagebuilder/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal
     * state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @return Result of the CancelImageCreation operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.CancelImageCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CancelImageCreation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelImageCreationResult cancelImageCreation(CancelImageCreationRequest request) {
        request = beforeClientExecution(request);
        return executeCancelImageCreation(request);
    }

    @SdkInternalApi
    final CancelImageCreationResult executeCancelImageCreation(CancelImageCreationRequest cancelImageCreationRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelImageCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelImageCreationRequest> request = null;
        Response<CancelImageCreationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelImageCreationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelImageCreationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelImageCreation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelImageCreationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelImageCreationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and assess your image.
     * </p>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateComponentResult createComponent(CreateComponentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComponent(request);
    }

    @SdkInternalApi
    final CreateComponentResult executeCreateComponent(CreateComponentRequest createComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(createComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComponentRequest> request = null;
        Response<CreateComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @return Result of the CreateDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.CreateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDistributionConfigurationResult createDistributionConfiguration(CreateDistributionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDistributionConfiguration(request);
    }

    @SdkInternalApi
    final CreateDistributionConfigurationResult executeCreateDistributionConfiguration(
            CreateDistributionConfigurationRequest createDistributionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistributionConfigurationRequest> request = null;
        Response<CreateDistributionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDistributionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDistributionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDistributionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDistributionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDistributionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all of the configured output resources
     * defined in the distribution configuration.
     * </p>
     * 
     * @param createImageRequest
     * @return Result of the CreateImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.CreateImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateImageResult createImage(CreateImageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImage(request);
    }

    @SdkInternalApi
    final CreateImageResult executeCreateImage(CreateImageRequest createImageRequest) {

        ExecutionContext executionContext = createExecutionContext(createImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageRequest> request = null;
        Response<CreateImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @return Result of the CreateImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @sample AWSimagebuilder.CreateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateImagePipelineResult createImagePipeline(CreateImagePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImagePipeline(request);
    }

    @SdkInternalApi
    final CreateImagePipelineResult executeCreateImagePipeline(CreateImagePipelineRequest createImagePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImagePipelineRequest> request = null;
        Response<CreateImagePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImagePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImagePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateImagePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImagePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImagePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @return Result of the CreateImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @sample AWSimagebuilder.CreateImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateImageRecipeResult createImageRecipe(CreateImageRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImageRecipe(request);
    }

    @SdkInternalApi
    final CreateImageRecipeResult executeCreateImageRecipe(CreateImageRecipeRequest createImageRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(createImageRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageRecipeRequest> request = null;
        Response<CreateImageRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImageRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateImageRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImageRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImageRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @return Result of the CreateInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws ResourceAlreadyExistsException
     *         The resource that you are trying to create already exists.
     * @sample AWSimagebuilder.CreateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInfrastructureConfigurationResult createInfrastructureConfiguration(CreateInfrastructureConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInfrastructureConfiguration(request);
    }

    @SdkInternalApi
    final CreateInfrastructureConfigurationResult executeCreateInfrastructureConfiguration(
            CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInfrastructureConfigurationRequest> request = null;
        Response<CreateInfrastructureConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInfrastructureConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInfrastructureConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInfrastructureConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInfrastructureConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInfrastructureConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteComponentResult deleteComponent(DeleteComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComponent(request);
    }

    @SdkInternalApi
    final DeleteComponentResult executeDeleteComponent(DeleteComponentRequest deleteComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComponentRequest> request = null;
        Response<DeleteComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @return Result of the DeleteDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDistributionConfigurationResult deleteDistributionConfiguration(DeleteDistributionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDistributionConfiguration(request);
    }

    @SdkInternalApi
    final DeleteDistributionConfigurationResult executeDeleteDistributionConfiguration(
            DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDistributionConfigurationRequest> request = null;
        Response<DeleteDistributionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDistributionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDistributionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDistributionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDistributionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDistributionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return Result of the DeleteImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteImageResult deleteImage(DeleteImageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImage(request);
    }

    @SdkInternalApi
    final DeleteImageResult executeDeleteImage(DeleteImageRequest deleteImageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageRequest> request = null;
        Response<DeleteImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @return Result of the DeleteImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteImagePipelineResult deleteImagePipeline(DeleteImagePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImagePipeline(request);
    }

    @SdkInternalApi
    final DeleteImagePipelineResult executeDeleteImagePipeline(DeleteImagePipelineRequest deleteImagePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImagePipelineRequest> request = null;
        Response<DeleteImagePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImagePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImagePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImagePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImagePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImagePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @return Result of the DeleteImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteImageRecipeResult deleteImageRecipe(DeleteImageRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImageRecipe(request);
    }

    @SdkInternalApi
    final DeleteImageRecipeResult executeDeleteImageRecipe(DeleteImageRecipeRequest deleteImageRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImageRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageRecipeRequest> request = null;
        Response<DeleteImageRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImageRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImageRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImageRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImageRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @return Result of the DeleteInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceDependencyException
     *         You have attempted to mutate or delete a resource with a dependency that prohibits this action. See the
     *         error message for more details.
     * @sample AWSimagebuilder.DeleteInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/DeleteInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInfrastructureConfigurationResult deleteInfrastructureConfiguration(DeleteInfrastructureConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInfrastructureConfiguration(request);
    }

    @SdkInternalApi
    final DeleteInfrastructureConfigurationResult executeDeleteInfrastructureConfiguration(
            DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInfrastructureConfigurationRequest> request = null;
        Response<DeleteInfrastructureConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInfrastructureConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInfrastructureConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInfrastructureConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInfrastructureConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInfrastructureConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetComponentResult getComponent(GetComponentRequest request) {
        request = beforeClientExecution(request);
        return executeGetComponent(request);
    }

    @SdkInternalApi
    final GetComponentResult executeGetComponent(GetComponentRequest getComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(getComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentRequest> request = null;
        Response<GetComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @return Result of the GetComponentPolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetComponentPolicyResult getComponentPolicy(GetComponentPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetComponentPolicy(request);
    }

    @SdkInternalApi
    final GetComponentPolicyResult executeGetComponentPolicy(GetComponentPolicyRequest getComponentPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getComponentPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentPolicyRequest> request = null;
        Response<GetComponentPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getComponentPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComponentPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetComponentPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetComponentPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @return Result of the GetDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDistributionConfigurationResult getDistributionConfiguration(GetDistributionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistributionConfiguration(request);
    }

    @SdkInternalApi
    final GetDistributionConfigurationResult executeGetDistributionConfiguration(GetDistributionConfigurationRequest getDistributionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionConfigurationRequest> request = null;
        Response<GetDistributionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDistributionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistributionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDistributionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDistributionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @return Result of the GetImage operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetImageResult getImage(GetImageRequest request) {
        request = beforeClientExecution(request);
        return executeGetImage(request);
    }

    @SdkInternalApi
    final GetImageResult executeGetImage(GetImageRequest getImageRequest) {

        ExecutionContext executionContext = createExecutionContext(getImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageRequest> request = null;
        Response<GetImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @return Result of the GetImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetImagePipelineResult getImagePipeline(GetImagePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeGetImagePipeline(request);
    }

    @SdkInternalApi
    final GetImagePipelineResult executeGetImagePipeline(GetImagePipelineRequest getImagePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(getImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImagePipelineRequest> request = null;
        Response<GetImagePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImagePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImagePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImagePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImagePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImagePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @return Result of the GetImagePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetImagePolicyResult getImagePolicy(GetImagePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetImagePolicy(request);
    }

    @SdkInternalApi
    final GetImagePolicyResult executeGetImagePolicy(GetImagePolicyRequest getImagePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getImagePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImagePolicyRequest> request = null;
        Response<GetImagePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImagePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImagePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImagePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImagePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImagePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @return Result of the GetImageRecipe operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImageRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipe" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetImageRecipeResult getImageRecipe(GetImageRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeGetImageRecipe(request);
    }

    @SdkInternalApi
    final GetImageRecipeResult executeGetImageRecipe(GetImageRecipeRequest getImageRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(getImageRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageRecipeRequest> request = null;
        Response<GetImageRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImageRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImageRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImageRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImageRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @return Result of the GetImageRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetImageRecipePolicyResult getImageRecipePolicy(GetImageRecipePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetImageRecipePolicy(request);
    }

    @SdkInternalApi
    final GetImageRecipePolicyResult executeGetImageRecipePolicy(GetImageRecipePolicyRequest getImageRecipePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getImageRecipePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageRecipePolicyRequest> request = null;
        Response<GetImageRecipePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageRecipePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImageRecipePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImageRecipePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImageRecipePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImageRecipePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest
     *        GetInfrastructureConfiguration request object.
     * @return Result of the GetInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.GetInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInfrastructureConfigurationResult getInfrastructureConfiguration(GetInfrastructureConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetInfrastructureConfiguration(request);
    }

    @SdkInternalApi
    final GetInfrastructureConfigurationResult executeGetInfrastructureConfiguration(GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInfrastructureConfigurationRequest> request = null;
        Response<GetInfrastructureConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInfrastructureConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInfrastructureConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInfrastructureConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInfrastructureConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInfrastructureConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @return Result of the ImportComponent operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws InvalidVersionNumberException
     *         Your version number is out of bounds or does not follow the required syntax.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.ImportComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImportComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ImportComponentResult importComponent(ImportComponentRequest request) {
        request = beforeClientExecution(request);
        return executeImportComponent(request);
    }

    @SdkInternalApi
    final ImportComponentResult executeImportComponent(ImportComponentRequest importComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(importComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportComponentRequest> request = null;
        Response<ImportComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentBuildVersionsRequest
     * @return Result of the ListComponentBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListComponentBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponentBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListComponentBuildVersionsResult listComponentBuildVersions(ListComponentBuildVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListComponentBuildVersions(request);
    }

    @SdkInternalApi
    final ListComponentBuildVersionsResult executeListComponentBuildVersions(ListComponentBuildVersionsRequest listComponentBuildVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentBuildVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentBuildVersionsRequest> request = null;
        Response<ListComponentBuildVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentBuildVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listComponentBuildVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponentBuildVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentBuildVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListComponentBuildVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic version.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListComponentsResult listComponents(ListComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListComponents(request);
    }

    @SdkInternalApi
    final ListComponentsResult executeListComponents(ListComponentsRequest listComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentsRequest> request = null;
        Response<ListComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @return Result of the ListDistributionConfigurations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListDistributionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListDistributionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributionConfigurationsResult listDistributionConfigurations(ListDistributionConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributionConfigurations(request);
    }

    @SdkInternalApi
    final ListDistributionConfigurationsResult executeListDistributionConfigurations(ListDistributionConfigurationsRequest listDistributionConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionConfigurationsRequest> request = null;
        Response<ListDistributionConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDistributionConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributionConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDistributionConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDistributionConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @return Result of the ListImageBuildVersions operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageBuildVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageBuildVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListImageBuildVersionsResult listImageBuildVersions(ListImageBuildVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListImageBuildVersions(request);
    }

    @SdkInternalApi
    final ListImageBuildVersionsResult executeListImageBuildVersions(ListImageBuildVersionsRequest listImageBuildVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listImageBuildVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImageBuildVersionsRequest> request = null;
        Response<ListImageBuildVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImageBuildVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImageBuildVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImageBuildVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImageBuildVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListImageBuildVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @return Result of the ListImagePipelineImages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePipelineImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelineImages"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListImagePipelineImagesResult listImagePipelineImages(ListImagePipelineImagesRequest request) {
        request = beforeClientExecution(request);
        return executeListImagePipelineImages(request);
    }

    @SdkInternalApi
    final ListImagePipelineImagesResult executeListImagePipelineImages(ListImagePipelineImagesRequest listImagePipelineImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listImagePipelineImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagePipelineImagesRequest> request = null;
        Response<ListImagePipelineImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagePipelineImagesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listImagePipelineImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImagePipelineImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImagePipelineImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListImagePipelineImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @return Result of the ListImagePipelines operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImagePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListImagePipelinesResult listImagePipelines(ListImagePipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListImagePipelines(request);
    }

    @SdkInternalApi
    final ListImagePipelinesResult executeListImagePipelines(ListImagePipelinesRequest listImagePipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listImagePipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagePipelinesRequest> request = null;
        Response<ListImagePipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagePipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImagePipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImagePipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImagePipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImagePipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @return Result of the ListImageRecipes operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImageRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImageRecipes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListImageRecipesResult listImageRecipes(ListImageRecipesRequest request) {
        request = beforeClientExecution(request);
        return executeListImageRecipes(request);
    }

    @SdkInternalApi
    final ListImageRecipesResult executeListImageRecipes(ListImageRecipesRequest listImageRecipesRequest) {

        ExecutionContext executionContext = createExecutionContext(listImageRecipesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImageRecipesRequest> request = null;
        Response<ListImageRecipesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImageRecipesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImageRecipesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImageRecipes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImageRecipesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImageRecipesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of image build versions for the specified semantic version.
     * </p>
     * 
     * @param listImagesRequest
     * @return Result of the ListImages operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListImagesResult listImages(ListImagesRequest request) {
        request = beforeClientExecution(request);
        return executeListImages(request);
    }

    @SdkInternalApi
    final ListImagesResult executeListImages(ListImagesRequest listImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagesRequest> request = null;
        Response<ListImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImagesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @return Result of the ListInfrastructureConfigurations operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidPaginationTokenException
     *         You have provided an invalid pagination token in your request.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.ListInfrastructureConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListInfrastructureConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInfrastructureConfigurationsResult listInfrastructureConfigurations(ListInfrastructureConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListInfrastructureConfigurations(request);
    }

    @SdkInternalApi
    final ListInfrastructureConfigurationsResult executeListInfrastructureConfigurations(
            ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInfrastructureConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInfrastructureConfigurationsRequest> request = null;
        Response<ListInfrastructureConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInfrastructureConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInfrastructureConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInfrastructureConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInfrastructureConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInfrastructureConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
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
     * Applies a policy to a component.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @return Result of the PutComponentPolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutComponentPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutComponentPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutComponentPolicyResult putComponentPolicy(PutComponentPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutComponentPolicy(request);
    }

    @SdkInternalApi
    final PutComponentPolicyResult executePutComponentPolicy(PutComponentPolicyRequest putComponentPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putComponentPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutComponentPolicyRequest> request = null;
        Response<PutComponentPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutComponentPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putComponentPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutComponentPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutComponentPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutComponentPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a policy to an image.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @return Result of the PutImagePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutImagePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImagePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutImagePolicyResult putImagePolicy(PutImagePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutImagePolicy(request);
    }

    @SdkInternalApi
    final PutImagePolicyResult executePutImagePolicy(PutImagePolicyRequest putImagePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putImagePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImagePolicyRequest> request = null;
        Response<PutImagePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImagePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putImagePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutImagePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutImagePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutImagePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a policy to an image recipe.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @return Result of the PutImageRecipePolicy operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws InvalidParameterValueException
     *         The value that you provided for the specified parameter is invalid.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @sample AWSimagebuilder.PutImageRecipePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutImageRecipePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutImageRecipePolicyResult putImageRecipePolicy(PutImageRecipePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutImageRecipePolicy(request);
    }

    @SdkInternalApi
    final PutImageRecipePolicyResult executePutImageRecipePolicy(PutImageRecipePolicyRequest putImageRecipePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putImageRecipePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageRecipePolicyRequest> request = null;
        Response<PutImageRecipePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageRecipePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putImageRecipePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutImageRecipePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutImageRecipePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutImageRecipePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @return Result of the StartImagePipelineExecution operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.StartImagePipelineExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/StartImagePipelineExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartImagePipelineExecutionResult startImagePipelineExecution(StartImagePipelineExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartImagePipelineExecution(request);
    }

    @SdkInternalApi
    final StartImagePipelineExecutionResult executeStartImagePipelineExecution(StartImagePipelineExecutionRequest startImagePipelineExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startImagePipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImagePipelineExecutionRequest> request = null;
        Response<StartImagePipelineExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImagePipelineExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startImagePipelineExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartImagePipelineExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartImagePipelineExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartImagePipelineExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
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
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         At least one of the resources referenced by your request does not exist.
     * @sample AWSimagebuilder.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
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
     * Updates a new distribution configuration. Distribution configurations define and configure the outputs of your
     * pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @return Result of the UpdateDistributionConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @throws InvalidParameterCombinationException
     *         You have specified two or more mutually exclusive parameters. Review the error message for details.
     * @sample AWSimagebuilder.UpdateDistributionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateDistributionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDistributionConfigurationResult updateDistributionConfiguration(UpdateDistributionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDistributionConfiguration(request);
    }

    @SdkInternalApi
    final UpdateDistributionConfigurationResult executeUpdateDistributionConfiguration(
            UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDistributionConfigurationRequest> request = null;
        Response<UpdateDistributionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDistributionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDistributionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDistributionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDistributionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDistributionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images.
     * </p>
     * 
     * @param updateImagePipelineRequest
     * @return Result of the UpdateImagePipeline operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.UpdateImagePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateImagePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateImagePipelineResult updateImagePipeline(UpdateImagePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateImagePipeline(request);
    }

    @SdkInternalApi
    final UpdateImagePipelineResult executeUpdateImagePipeline(UpdateImagePipelineRequest updateImagePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(updateImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateImagePipelineRequest> request = null;
        Response<UpdateImagePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateImagePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateImagePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateImagePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateImagePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateImagePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your
     * image will be built and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @return Result of the UpdateInfrastructureConfiguration operation returned by the service.
     * @throws ServiceException
     *         This exception is thrown when the service encounters an unrecoverable exception.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an invalid resource
     *         identifier.
     * @throws ServiceUnavailableException
     *         The service is unable to process your request at this time.
     * @throws InvalidRequestException
     *         You have made a request for an action that is not supported by the service.
     * @throws IdempotentParameterMismatchException
     *         You have specified a client token for an operation using parameter values that differ from a previous
     *         request that used the same client token.
     * @throws ForbiddenException
     *         You are not authorized to perform the requested operation.
     * @throws CallRateLimitExceededException
     *         You have exceeded the permitted request rate for the specific operation.
     * @throws ResourceInUseException
     *         The resource that you are trying to operate on is currently in use. Review the message details and retry
     *         later.
     * @sample AWSimagebuilder.UpdateInfrastructureConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/UpdateInfrastructureConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInfrastructureConfigurationResult updateInfrastructureConfiguration(UpdateInfrastructureConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInfrastructureConfiguration(request);
    }

    @SdkInternalApi
    final UpdateInfrastructureConfigurationResult executeUpdateInfrastructureConfiguration(
            UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInfrastructureConfigurationRequest> request = null;
        Response<UpdateInfrastructureConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInfrastructureConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInfrastructureConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "imagebuilder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInfrastructureConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInfrastructureConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInfrastructureConfigurationResultJsonUnmarshaller());
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
