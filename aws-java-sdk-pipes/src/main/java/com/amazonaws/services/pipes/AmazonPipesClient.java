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
package com.amazonaws.services.pipes;

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

import com.amazonaws.services.pipes.AmazonPipesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.services.pipes.model.transform.*;

/**
 * Client for accessing Amazon EventBridge Pipes. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon EventBridge Pipes connects event sources to targets. Pipes reduces the need for specialized knowledge and
 * integration code when developing event driven architectures. This helps ensures consistency across your company’s
 * applications. With Pipes, the target can be any available EventBridge target. To set up a pipe, you select the event
 * source, add optional event filtering, define optional enrichment, and select the target for the event data.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPipesClient extends AmazonWebServiceClient implements AmazonPipes {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPipes.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "pipes";

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
                                    com.amazonaws.services.pipes.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pipes.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pipes.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pipes.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pipes.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pipes.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pipes.model.AmazonPipesException.class));

    public static AmazonPipesClientBuilder builder() {
        return AmazonPipesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EventBridge Pipes using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPipesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EventBridge Pipes using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPipesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("pipes.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pipes/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pipes/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a pipe. Amazon EventBridge Pipes connect event sources to targets and reduces the need for specialized
     * knowledge and integration code.
     * </p>
     * 
     * @param createPipeRequest
     * @return Result of the CreatePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @throws ServiceQuotaExceededException
     *         A quota has been exceeded.
     * @sample AmazonPipes.CreatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/CreatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePipeResult createPipe(CreatePipeRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePipe(request);
    }

    @SdkInternalApi
    final CreatePipeResult executeCreatePipe(CreatePipeRequest createPipeRequest) {

        ExecutionContext executionContext = createExecutionContext(createPipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipeRequest> request = null;
        Response<CreatePipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePipeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param deletePipeRequest
     * @return Result of the DeletePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.DeletePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DeletePipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePipeResult deletePipe(DeletePipeRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePipe(request);
    }

    @SdkInternalApi
    final DeletePipeResult executeDeletePipe(DeletePipeRequest deletePipeRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipeRequest> request = null;
        Response<DeletePipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePipeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the information about an existing pipe. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param describePipeRequest
     * @return Result of the DescribePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.DescribePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DescribePipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePipeResult describePipe(DescribePipeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePipe(request);
    }

    @SdkInternalApi
    final DescribePipeResult executeDescribePipe(DescribePipeRequest describePipeRequest) {

        ExecutionContext executionContext = createExecutionContext(describePipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePipeRequest> request = null;
        Response<DescribePipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the pipes associated with this account. For more information about pipes, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html">Amazon EventBridge Pipes</a> in the
     * Amazon EventBridge User Guide.
     * </p>
     * 
     * @param listPipesRequest
     * @return Result of the ListPipes operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @sample AmazonPipes.ListPipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListPipes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPipesResult listPipes(ListPipesRequest request) {
        request = beforeClientExecution(request);
        return executeListPipes(request);
    }

    @SdkInternalApi
    final ListPipesResult executeListPipes(ListPipesRequest listPipesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipesRequest> request = null;
        Response<ListPipesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPipes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPipesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a pipe.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
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
     * Start an existing pipe.
     * </p>
     * 
     * @param startPipeRequest
     * @return Result of the StartPipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.StartPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StartPipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartPipeResult startPipe(StartPipeRequest request) {
        request = beforeClientExecution(request);
        return executeStartPipe(request);
    }

    @SdkInternalApi
    final StartPipeResult executeStartPipe(StartPipeRequest startPipeRequest) {

        ExecutionContext executionContext = createExecutionContext(startPipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPipeRequest> request = null;
        Response<StartPipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startPipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartPipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartPipeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartPipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop an existing pipe.
     * </p>
     * 
     * @param stopPipeRequest
     * @return Result of the StopPipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.StopPipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/StopPipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopPipeResult stopPipe(StopPipeRequest request) {
        request = beforeClientExecution(request);
        return executeStopPipe(request);
    }

    @SdkInternalApi
    final StopPipeResult executeStopPipe(StopPipeRequest stopPipeRequest) {

        ExecutionContext executionContext = createExecutionContext(stopPipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopPipeRequest> request = null;
        Response<StopPipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopPipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopPipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopPipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopPipeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopPipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified pipe. Tags can help you organize and categorize your
     * resources. You can also use them to scope user permissions by granting a user permission to access or change only
     * resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a pipe that already has tags. If you specify a new tag key,
     * this tag is appended to the list of tags associated with the pipe. If you specify a tag key that is already
     * associated with the pipe, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a pipe.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
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
     * Removes one or more tags from the specified pipes.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @sample AmazonPipes.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
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
     * Update an existing pipe. When you call <code>UpdatePipe</code>, only the fields that are included in the request
     * are changed, the rest are unchanged. The exception to this is if you modify any Amazon Web Services-service
     * specific fields in the <code>SourceParameters</code>, <code>EnrichmentParameters</code>, or
     * <code>TargetParameters</code> objects. The fields in these objects are updated atomically as one and override
     * existing values. This is by design and means that if you don't specify an optional field in one of these
     * Parameters objects, that field will be set to its system-default value after the update.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;For more information about pipes, see &lt;a href=&quot;https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html&quot;&gt; Amazon EventBridge Pipes&lt;/a&gt; in the Amazon EventBridge User Guide.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param updatePipeRequest
     * @return Result of the UpdatePipe operation returned by the service.
     * @throws InternalException
     *         This exception occurs due to unexpected causes.
     * @throws ValidationException
     *         Indicates that an error has occurred while performing a validate operation.
     * @throws ThrottlingException
     *         An action was throttled.
     * @throws NotFoundException
     *         An entity that you specified does not exist.
     * @throws ConflictException
     *         An action you attempted resulted in an exception.
     * @sample AmazonPipes.UpdatePipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePipeResult updatePipe(UpdatePipeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipe(request);
    }

    @SdkInternalApi
    final UpdatePipeResult executeUpdatePipe(UpdatePipeRequest updatePipeRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipeRequest> request = null;
        Response<UpdatePipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pipes");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePipeResultJsonUnmarshaller());
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
