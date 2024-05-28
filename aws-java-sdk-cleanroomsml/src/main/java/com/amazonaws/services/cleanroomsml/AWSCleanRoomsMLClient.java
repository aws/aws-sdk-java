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
package com.amazonaws.services.cleanroomsml;

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

import com.amazonaws.services.cleanroomsml.AWSCleanRoomsMLClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.services.cleanroomsml.model.transform.*;

/**
 * Client for accessing AWS Clean Rooms ML. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Web Services Clean Rooms ML API Reference</i>.
 * </p>
 * <p>
 * Amazon Web Services Clean Rooms ML provides a privacy-enhancing method for two parties to identify similar users in
 * their data without the need to share their data with each other. The first party brings the training data to Clean
 * Rooms so that they can create and configure an audience model (lookalike model) and associate it with a
 * collaboration. The second party then brings their seed data to Clean Rooms and generates an audience (lookalike
 * segment) that resembles the training data.
 * </p>
 * <p>
 * To learn more about Amazon Web Services Clean Rooms ML concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/userguide/machine-learning.html">Clean Rooms User Guide</a>.
 * </p>
 * <p>
 * To learn more about SQL commands, functions, and conditions supported in Clean Rooms, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/sql-reference/sql-reference.html">Clean Rooms SQL Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCleanRoomsMLClient extends AmazonWebServiceClient implements AWSCleanRoomsML {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCleanRoomsML.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cleanrooms-ml";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanroomsml.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanroomsml.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanroomsml.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanroomsml.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanroomsml.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cleanroomsml.model.AWSCleanRoomsMLException.class));

    public static AWSCleanRoomsMLClientBuilder builder() {
        return AWSCleanRoomsMLClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Clean Rooms ML using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCleanRoomsMLClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Clean Rooms ML using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCleanRoomsMLClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cleanrooms-ml.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cleanroomsml/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cleanroomsml/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Defines the information necessary to create an audience model. An audience model is a machine learning model that
     * Clean Rooms ML trains to measure similarity between users. Clean Rooms ML manages training and storing the
     * audience model. The audience model can be used in multiple calls to the <a>StartAudienceGenerationJob</a> API.
     * </p>
     * 
     * @param createAudienceModelRequest
     * @return Result of the CreateAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.CreateAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAudienceModelResult createAudienceModel(CreateAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAudienceModel(request);
    }

    @SdkInternalApi
    final CreateAudienceModelResult executeCreateAudienceModel(CreateAudienceModelRequest createAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAudienceModelRequest> request = null;
        Response<CreateAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAudienceModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines the information necessary to create a configured audience model.
     * </p>
     * 
     * @param createConfiguredAudienceModelRequest
     * @return Result of the CreateConfiguredAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.CreateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfiguredAudienceModelResult createConfiguredAudienceModel(CreateConfiguredAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfiguredAudienceModel(request);
    }

    @SdkInternalApi
    final CreateConfiguredAudienceModelResult executeCreateConfiguredAudienceModel(CreateConfiguredAudienceModelRequest createConfiguredAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfiguredAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfiguredAudienceModelRequest> request = null;
        Response<CreateConfiguredAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfiguredAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConfiguredAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfiguredAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfiguredAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConfiguredAudienceModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines the information necessary to create a training dataset. In Clean Rooms ML, the
     * <code>TrainingDataset</code> is metadata that points to a Glue table, which is read only during
     * <code>AudienceModel</code> creation.
     * </p>
     * 
     * @param createTrainingDatasetRequest
     * @return Result of the CreateTrainingDataset operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.CreateTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTrainingDatasetResult createTrainingDataset(CreateTrainingDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrainingDataset(request);
    }

    @SdkInternalApi
    final CreateTrainingDatasetResult executeCreateTrainingDataset(CreateTrainingDatasetRequest createTrainingDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrainingDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrainingDatasetRequest> request = null;
        Response<CreateTrainingDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrainingDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrainingDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrainingDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrainingDatasetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateTrainingDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified audience generation job, and removes all data associated with the job.
     * </p>
     * 
     * @param deleteAudienceGenerationJobRequest
     * @return Result of the DeleteAudienceGenerationJob operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAudienceGenerationJobResult deleteAudienceGenerationJob(DeleteAudienceGenerationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAudienceGenerationJob(request);
    }

    @SdkInternalApi
    final DeleteAudienceGenerationJobResult executeDeleteAudienceGenerationJob(DeleteAudienceGenerationJobRequest deleteAudienceGenerationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAudienceGenerationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAudienceGenerationJobRequest> request = null;
        Response<DeleteAudienceGenerationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAudienceGenerationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAudienceGenerationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAudienceGenerationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAudienceGenerationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAudienceGenerationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies an audience model that you want to delete. You can't delete an audience model if there are any
     * configured audience models that depend on the audience model.
     * </p>
     * 
     * @param deleteAudienceModelRequest
     * @return Result of the DeleteAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAudienceModelResult deleteAudienceModel(DeleteAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAudienceModel(request);
    }

    @SdkInternalApi
    final DeleteAudienceModelResult executeDeleteAudienceModel(DeleteAudienceModelRequest deleteAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAudienceModelRequest> request = null;
        Response<DeleteAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAudienceModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configured audience model. You can't delete a configured audience model if there are any
     * lookalike models that use the configured audience model. If you delete a configured audience model, it will be
     * removed from any collaborations that it is associated to.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelRequest
     * @return Result of the DeleteConfiguredAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfiguredAudienceModelResult deleteConfiguredAudienceModel(DeleteConfiguredAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfiguredAudienceModel(request);
    }

    @SdkInternalApi
    final DeleteConfiguredAudienceModelResult executeDeleteConfiguredAudienceModel(DeleteConfiguredAudienceModelRequest deleteConfiguredAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfiguredAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfiguredAudienceModelRequest> request = null;
        Response<DeleteConfiguredAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfiguredAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfiguredAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfiguredAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfiguredAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfiguredAudienceModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configured audience model policy.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelPolicyRequest
     * @return Result of the DeleteConfiguredAudienceModelPolicy operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfiguredAudienceModelPolicyResult deleteConfiguredAudienceModelPolicy(DeleteConfiguredAudienceModelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfiguredAudienceModelPolicy(request);
    }

    @SdkInternalApi
    final DeleteConfiguredAudienceModelPolicyResult executeDeleteConfiguredAudienceModelPolicy(
            DeleteConfiguredAudienceModelPolicyRequest deleteConfiguredAudienceModelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfiguredAudienceModelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfiguredAudienceModelPolicyRequest> request = null;
        Response<DeleteConfiguredAudienceModelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfiguredAudienceModelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfiguredAudienceModelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfiguredAudienceModelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfiguredAudienceModelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfiguredAudienceModelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies a training dataset that you want to delete. You can't delete a training dataset if there are any
     * audience models that depend on the training dataset. In Clean Rooms ML, the <code>TrainingDataset</code> is
     * metadata that points to a Glue table, which is read only during <code>AudienceModel</code> creation. This action
     * deletes the metadata.
     * </p>
     * 
     * @param deleteTrainingDatasetRequest
     * @return Result of the DeleteTrainingDataset operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrainingDatasetResult deleteTrainingDataset(DeleteTrainingDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrainingDataset(request);
    }

    @SdkInternalApi
    final DeleteTrainingDatasetResult executeDeleteTrainingDataset(DeleteTrainingDatasetRequest deleteTrainingDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrainingDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrainingDatasetRequest> request = null;
        Response<DeleteTrainingDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrainingDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrainingDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrainingDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrainingDatasetResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteTrainingDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an audience generation job.
     * </p>
     * 
     * @param getAudienceGenerationJobRequest
     * @return Result of the GetAudienceGenerationJob operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAudienceGenerationJobResult getAudienceGenerationJob(GetAudienceGenerationJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetAudienceGenerationJob(request);
    }

    @SdkInternalApi
    final GetAudienceGenerationJobResult executeGetAudienceGenerationJob(GetAudienceGenerationJobRequest getAudienceGenerationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getAudienceGenerationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAudienceGenerationJobRequest> request = null;
        Response<GetAudienceGenerationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAudienceGenerationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAudienceGenerationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAudienceGenerationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAudienceGenerationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAudienceGenerationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an audience model
     * </p>
     * 
     * @param getAudienceModelRequest
     * @return Result of the GetAudienceModel operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAudienceModelResult getAudienceModel(GetAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeGetAudienceModel(request);
    }

    @SdkInternalApi
    final GetAudienceModelResult executeGetAudienceModel(GetAudienceModelRequest getAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(getAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAudienceModelRequest> request = null;
        Response<GetAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAudienceModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specified configured audience model.
     * </p>
     * 
     * @param getConfiguredAudienceModelRequest
     * @return Result of the GetConfiguredAudienceModel operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfiguredAudienceModelResult getConfiguredAudienceModel(GetConfiguredAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfiguredAudienceModel(request);
    }

    @SdkInternalApi
    final GetConfiguredAudienceModelResult executeGetConfiguredAudienceModel(GetConfiguredAudienceModelRequest getConfiguredAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfiguredAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfiguredAudienceModelRequest> request = null;
        Response<GetConfiguredAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfiguredAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfiguredAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfiguredAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfiguredAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfiguredAudienceModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a configured audience model policy.
     * </p>
     * 
     * @param getConfiguredAudienceModelPolicyRequest
     * @return Result of the GetConfiguredAudienceModelPolicy operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfiguredAudienceModelPolicyResult getConfiguredAudienceModelPolicy(GetConfiguredAudienceModelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfiguredAudienceModelPolicy(request);
    }

    @SdkInternalApi
    final GetConfiguredAudienceModelPolicyResult executeGetConfiguredAudienceModelPolicy(
            GetConfiguredAudienceModelPolicyRequest getConfiguredAudienceModelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfiguredAudienceModelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfiguredAudienceModelPolicyRequest> request = null;
        Response<GetConfiguredAudienceModelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfiguredAudienceModelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfiguredAudienceModelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfiguredAudienceModelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfiguredAudienceModelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfiguredAudienceModelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a training dataset.
     * </p>
     * 
     * @param getTrainingDatasetRequest
     * @return Result of the GetTrainingDataset operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTrainingDatasetResult getTrainingDataset(GetTrainingDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrainingDataset(request);
    }

    @SdkInternalApi
    final GetTrainingDatasetResult executeGetTrainingDataset(GetTrainingDatasetRequest getTrainingDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrainingDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrainingDatasetRequest> request = null;
        Response<GetTrainingDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrainingDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrainingDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrainingDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrainingDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTrainingDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the audience export jobs.
     * </p>
     * 
     * @param listAudienceExportJobsRequest
     * @return Result of the ListAudienceExportJobs operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListAudienceExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAudienceExportJobsResult listAudienceExportJobs(ListAudienceExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListAudienceExportJobs(request);
    }

    @SdkInternalApi
    final ListAudienceExportJobsResult executeListAudienceExportJobs(ListAudienceExportJobsRequest listAudienceExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAudienceExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAudienceExportJobsRequest> request = null;
        Response<ListAudienceExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAudienceExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAudienceExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAudienceExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAudienceExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAudienceExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of audience generation jobs.
     * </p>
     * 
     * @param listAudienceGenerationJobsRequest
     * @return Result of the ListAudienceGenerationJobs operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListAudienceGenerationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceGenerationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAudienceGenerationJobsResult listAudienceGenerationJobs(ListAudienceGenerationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListAudienceGenerationJobs(request);
    }

    @SdkInternalApi
    final ListAudienceGenerationJobsResult executeListAudienceGenerationJobs(ListAudienceGenerationJobsRequest listAudienceGenerationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAudienceGenerationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAudienceGenerationJobsRequest> request = null;
        Response<ListAudienceGenerationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAudienceGenerationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAudienceGenerationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAudienceGenerationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAudienceGenerationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAudienceGenerationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of audience models.
     * </p>
     * 
     * @param listAudienceModelsRequest
     * @return Result of the ListAudienceModels operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAudienceModelsResult listAudienceModels(ListAudienceModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListAudienceModels(request);
    }

    @SdkInternalApi
    final ListAudienceModelsResult executeListAudienceModels(ListAudienceModelsRequest listAudienceModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAudienceModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAudienceModelsRequest> request = null;
        Response<ListAudienceModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAudienceModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAudienceModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAudienceModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAudienceModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAudienceModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the configured audience models.
     * </p>
     * 
     * @param listConfiguredAudienceModelsRequest
     * @return Result of the ListConfiguredAudienceModels operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListConfiguredAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListConfiguredAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfiguredAudienceModelsResult listConfiguredAudienceModels(ListConfiguredAudienceModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfiguredAudienceModels(request);
    }

    @SdkInternalApi
    final ListConfiguredAudienceModelsResult executeListConfiguredAudienceModels(ListConfiguredAudienceModelsRequest listConfiguredAudienceModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfiguredAudienceModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfiguredAudienceModelsRequest> request = null;
        Response<ListConfiguredAudienceModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfiguredAudienceModelsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConfiguredAudienceModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfiguredAudienceModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfiguredAudienceModelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConfiguredAudienceModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags for a provided resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
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
     * Returns a list of training datasets.
     * </p>
     * 
     * @param listTrainingDatasetsRequest
     * @return Result of the ListTrainingDatasets operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListTrainingDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTrainingDatasets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrainingDatasetsResult listTrainingDatasets(ListTrainingDatasetsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrainingDatasets(request);
    }

    @SdkInternalApi
    final ListTrainingDatasetsResult executeListTrainingDatasets(ListTrainingDatasetsRequest listTrainingDatasetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrainingDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrainingDatasetsRequest> request = null;
        Response<ListTrainingDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrainingDatasetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrainingDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrainingDatasets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrainingDatasetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrainingDatasetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create or update the resource policy for a configured audience model.
     * </p>
     * 
     * @param putConfiguredAudienceModelPolicyRequest
     * @return Result of the PutConfiguredAudienceModelPolicy operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.PutConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/PutConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConfiguredAudienceModelPolicyResult putConfiguredAudienceModelPolicy(PutConfiguredAudienceModelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutConfiguredAudienceModelPolicy(request);
    }

    @SdkInternalApi
    final PutConfiguredAudienceModelPolicyResult executePutConfiguredAudienceModelPolicy(
            PutConfiguredAudienceModelPolicyRequest putConfiguredAudienceModelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putConfiguredAudienceModelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConfiguredAudienceModelPolicyRequest> request = null;
        Response<PutConfiguredAudienceModelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConfiguredAudienceModelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConfiguredAudienceModelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConfiguredAudienceModelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConfiguredAudienceModelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConfiguredAudienceModelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Export an audience of a specified size after you have generated an audience.
     * </p>
     * 
     * @param startAudienceExportJobRequest
     * @return Result of the StartAudienceExportJob operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.StartAudienceExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAudienceExportJobResult startAudienceExportJob(StartAudienceExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartAudienceExportJob(request);
    }

    @SdkInternalApi
    final StartAudienceExportJobResult executeStartAudienceExportJob(StartAudienceExportJobRequest startAudienceExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startAudienceExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAudienceExportJobRequest> request = null;
        Response<StartAudienceExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAudienceExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAudienceExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAudienceExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAudienceExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartAudienceExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information necessary to start the audience generation job.
     * </p>
     * 
     * @param startAudienceGenerationJobRequest
     * @return Result of the StartAudienceGenerationJob operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.StartAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAudienceGenerationJobResult startAudienceGenerationJob(StartAudienceGenerationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartAudienceGenerationJob(request);
    }

    @SdkInternalApi
    final StartAudienceGenerationJobResult executeStartAudienceGenerationJob(StartAudienceGenerationJobRequest startAudienceGenerationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startAudienceGenerationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAudienceGenerationJobRequest> request = null;
        Response<StartAudienceGenerationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAudienceGenerationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startAudienceGenerationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAudienceGenerationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAudienceGenerationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartAudienceGenerationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
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
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
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
     * Provides the information necessary to update a configured audience model. Updates that impact audience generation
     * jobs take effect when a new job starts, but do not impact currently running jobs.
     * </p>
     * 
     * @param updateConfiguredAudienceModelRequest
     * @return Result of the UpdateConfiguredAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.UpdateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UpdateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfiguredAudienceModelResult updateConfiguredAudienceModel(UpdateConfiguredAudienceModelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfiguredAudienceModel(request);
    }

    @SdkInternalApi
    final UpdateConfiguredAudienceModelResult executeUpdateConfiguredAudienceModel(UpdateConfiguredAudienceModelRequest updateConfiguredAudienceModelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfiguredAudienceModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfiguredAudienceModelRequest> request = null;
        Response<UpdateConfiguredAudienceModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfiguredAudienceModelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConfiguredAudienceModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRoomsML");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfiguredAudienceModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfiguredAudienceModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConfiguredAudienceModelResultJsonUnmarshaller());
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
