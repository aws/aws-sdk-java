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
package com.amazonaws.services.gluedatabrew;

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

import com.amazonaws.services.gluedatabrew.AWSGlueDataBrewClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.services.gluedatabrew.model.transform.*;

/**
 * Client for accessing AWS Glue DataBrew. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Glue DataBrew is a visual, cloud-scale data-preparation service. DataBrew simplifies data preparation tasks,
 * targeting data issues that are hard to spot and time-consuming to fix. DataBrew empowers users of all technical
 * levels to visualize the data and perform one-click data transformations, with no coding required.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGlueDataBrewClient extends AmazonWebServiceClient implements AWSGlueDataBrew {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSGlueDataBrew.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "databrew";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gluedatabrew.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gluedatabrew.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gluedatabrew.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gluedatabrew.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gluedatabrew.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.gluedatabrew.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.gluedatabrew.model.AWSGlueDataBrewException.class));

    public static AWSGlueDataBrewClientBuilder builder() {
        return AWSGlueDataBrewClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Glue DataBrew using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGlueDataBrewClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Glue DataBrew using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGlueDataBrewClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("databrew.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/gluedatabrew/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/gluedatabrew/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes one or more versions of a recipe at a time.
     * </p>
     * <p>
     * The entire request will be rejected if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The recipe does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is an invalid version identifier in the list of versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version list is empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version list size exceeds 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version list contains duplicate entries.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The request will complete successfully, but with partial failures, if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * A version is being used by a job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify <code>LATEST_WORKING</code>, but it's being used by a project.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version fails to be deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>LATEST_WORKING</code> version will only be deleted if the recipe has no other versions. If you try to
     * delete <code>LATEST_WORKING</code> while other versions exist (or if they can't be deleted), then
     * <code>LATEST_WORKING</code> will be listed as partial failure in the response.
     * </p>
     * 
     * @param batchDeleteRecipeVersionRequest
     * @return Result of the BatchDeleteRecipeVersion operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.BatchDeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/BatchDeleteRecipeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteRecipeVersionResult batchDeleteRecipeVersion(BatchDeleteRecipeVersionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteRecipeVersion(request);
    }

    @SdkInternalApi
    final BatchDeleteRecipeVersionResult executeBatchDeleteRecipeVersion(BatchDeleteRecipeVersionRequest batchDeleteRecipeVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteRecipeVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteRecipeVersionRequest> request = null;
        Response<BatchDeleteRecipeVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteRecipeVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDeleteRecipeVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteRecipeVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteRecipeVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeleteRecipeVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DataBrew dataset.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDatasetResult createDataset(CreateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataset(request);
    }

    @SdkInternalApi
    final CreateDatasetResult executeCreateDataset(CreateDatasetRequest createDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new job to analyze a dataset and create its data profile.
     * </p>
     * 
     * @param createProfileJobRequest
     * @return Result of the CreateProfileJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProfileJobResult createProfileJob(CreateProfileJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfileJob(request);
    }

    @SdkInternalApi
    final CreateProfileJobResult executeCreateProfileJob(CreateProfileJobRequest createProfileJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileJobRequest> request = null;
        Response<CreateProfileJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfileJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DataBrew project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DataBrew recipe.
     * </p>
     * 
     * @param createRecipeRequest
     * @return Result of the CreateRecipe operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRecipeResult createRecipe(CreateRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRecipe(request);
    }

    @SdkInternalApi
    final CreateRecipeResult executeCreateRecipe(CreateRecipeRequest createRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(createRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRecipeRequest> request = null;
        Response<CreateRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new job to transform input data, using steps defined in an existing Glue DataBrew recipe
     * </p>
     * 
     * @param createRecipeJobRequest
     * @return Result of the CreateRecipeJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRecipeJobResult createRecipeJob(CreateRecipeJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRecipeJob(request);
    }

    @SdkInternalApi
    final CreateRecipeJobResult executeCreateRecipeJob(CreateRecipeJobRequest createRecipeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createRecipeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRecipeJobRequest> request = null;
        Response<CreateRecipeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRecipeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRecipeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRecipeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRecipeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRecipeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new schedule for one or more DataBrew jobs. Jobs can be run at a specific date and time, or at regular
     * intervals.
     * </p>
     * 
     * @param createScheduleRequest
     * @return Result of the CreateSchedule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateScheduleResult createSchedule(CreateScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchedule(request);
    }

    @SdkInternalApi
    final CreateScheduleResult executeCreateSchedule(CreateScheduleRequest createScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(createScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScheduleRequest> request = null;
        Response<CreateScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dataset from DataBrew.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataset(request);
    }

    @SdkInternalApi
    final DeleteDatasetResult executeDeleteDataset(DeleteDatasetRequest deleteDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified DataBrew job.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobResult deleteJob(DeleteJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJob(request);
    }

    @SdkInternalApi
    final DeleteJobResult executeDeleteJob(DeleteJobRequest deleteJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing DataBrew project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a single version of a DataBrew recipe.
     * </p>
     * 
     * @param deleteRecipeVersionRequest
     * @return Result of the DeleteRecipeVersion operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteRecipeVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRecipeVersionResult deleteRecipeVersion(DeleteRecipeVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecipeVersion(request);
    }

    @SdkInternalApi
    final DeleteRecipeVersionResult executeDeleteRecipeVersion(DeleteRecipeVersionRequest deleteRecipeVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecipeVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecipeVersionRequest> request = null;
        Response<DeleteRecipeVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecipeVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRecipeVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecipeVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecipeVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRecipeVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified DataBrew schedule.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteScheduleResult deleteSchedule(DeleteScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchedule(request);
    }

    @SdkInternalApi
    final DeleteScheduleResult executeDeleteSchedule(DeleteScheduleRequest deleteScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduleRequest> request = null;
        Response<DeleteScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the definition of a specific DataBrew dataset.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataset(request);
    }

    @SdkInternalApi
    final DescribeDatasetResult executeDescribeDataset(DescribeDatasetRequest describeDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the definition of a specific DataBrew job.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJob(request);
    }

    @SdkInternalApi
    final DescribeJobResult executeDescribeJob(DescribeJobRequest describeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Represents one run of a DataBrew job.
     * </p>
     * 
     * @param describeJobRunRequest
     * @return Result of the DescribeJobRun operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobRunResult describeJobRun(DescribeJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobRun(request);
    }

    @SdkInternalApi
    final DescribeJobRunResult executeDescribeJobRun(DescribeJobRunRequest describeJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRunRequest> request = null;
        Response<DescribeJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the definition of a specific DataBrew project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeProjectResult describeProject(DescribeProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProject(request);
    }

    @SdkInternalApi
    final DescribeProjectResult executeDescribeProject(DescribeProjectRequest describeProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectRequest> request = null;
        Response<DescribeProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the definition of a specific DataBrew recipe corresponding to a particular version.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return Result of the DescribeRecipe operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRecipeResult describeRecipe(DescribeRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecipe(request);
    }

    @SdkInternalApi
    final DescribeRecipeResult executeDescribeRecipe(DescribeRecipeRequest describeRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecipeRequest> request = null;
        Response<DescribeRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the definition of a specific DataBrew schedule.
     * </p>
     * 
     * @param describeScheduleRequest
     * @return Result of the DescribeSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeScheduleResult describeSchedule(DescribeScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchedule(request);
    }

    @SdkInternalApi
    final DescribeScheduleResult executeDescribeSchedule(DescribeScheduleRequest describeScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduleRequest> request = null;
        Response<DescribeScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the DataBrew datasets.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasets(request);
    }

    @SdkInternalApi
    final ListDatasetsResult executeListDatasets(ListDatasetsRequest listDatasetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the previous runs of a particular DataBrew job.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return Result of the ListJobRuns operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobRunsResult listJobRuns(ListJobRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobRuns(request);
    }

    @SdkInternalApi
    final ListJobRunsResult executeListJobRuns(ListJobRunsRequest listJobRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobRunsRequest> request = null;
        Response<ListJobRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the DataBrew jobs that are defined.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the DataBrew projects that are defined.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of a particular DataBrew recipe, except for <code>LATEST_WORKING</code>.
     * </p>
     * 
     * @param listRecipeVersionsRequest
     * @return Result of the ListRecipeVersions operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListRecipeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRecipeVersionsResult listRecipeVersions(ListRecipeVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListRecipeVersions(request);
    }

    @SdkInternalApi
    final ListRecipeVersionsResult executeListRecipeVersions(ListRecipeVersionsRequest listRecipeVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecipeVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecipeVersionsRequest> request = null;
        Response<ListRecipeVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecipeVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecipeVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecipeVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecipeVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecipeVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the DataBrew recipes that are defined.
     * </p>
     * 
     * @param listRecipesRequest
     * @return Result of the ListRecipes operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRecipesResult listRecipes(ListRecipesRequest request) {
        request = beforeClientExecution(request);
        return executeListRecipes(request);
    }

    @SdkInternalApi
    final ListRecipesResult executeListRecipes(ListRecipesRequest listRecipesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecipesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecipesRequest> request = null;
        Response<ListRecipesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecipesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecipesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecipes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecipesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecipesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the DataBrew schedules that are defined.
     * </p>
     * 
     * @param listSchedulesRequest
     * @return Result of the ListSchedules operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchedulesResult listSchedules(ListSchedulesRequest request) {
        request = beforeClientExecution(request);
        return executeListSchedules(request);
    }

    @SdkInternalApi
    final ListSchedulesResult executeListSchedules(ListSchedulesRequest listSchedulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchedulesRequest> request = null;
        Response<ListSchedulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchedulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchedulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchedules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchedulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchedulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the tags for a DataBrew resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
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
     * Publishes a new version of a DataBrew recipe.
     * </p>
     * 
     * @param publishRecipeRequest
     * @return Result of the PublishRecipe operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @sample AWSGlueDataBrew.PublishRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/PublishRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishRecipeResult publishRecipe(PublishRecipeRequest request) {
        request = beforeClientExecution(request);
        return executePublishRecipe(request);
    }

    @SdkInternalApi
    final PublishRecipeResult executePublishRecipe(PublishRecipeRequest publishRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(publishRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishRecipeRequest> request = null;
        Response<PublishRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Performs a recipe step within an interactive DataBrew session that's currently open.
     * </p>
     * 
     * @param sendProjectSessionActionRequest
     * @return Result of the SendProjectSessionAction operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.SendProjectSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/SendProjectSessionAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendProjectSessionActionResult sendProjectSessionAction(SendProjectSessionActionRequest request) {
        request = beforeClientExecution(request);
        return executeSendProjectSessionAction(request);
    }

    @SdkInternalApi
    final SendProjectSessionActionResult executeSendProjectSessionAction(SendProjectSessionActionRequest sendProjectSessionActionRequest) {

        ExecutionContext executionContext = createExecutionContext(sendProjectSessionActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendProjectSessionActionRequest> request = null;
        Response<SendProjectSessionActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendProjectSessionActionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendProjectSessionActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendProjectSessionAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendProjectSessionActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendProjectSessionActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs a DataBrew job.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobRunResult startJobRun(StartJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartJobRun(request);
    }

    @SdkInternalApi
    final StartJobRunResult executeStartJobRun(StartJobRunRequest startJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRunRequest> request = null;
        Response<StartJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an interactive session, enabling you to manipulate data in a DataBrew project.
     * </p>
     * 
     * @param startProjectSessionRequest
     * @return Result of the StartProjectSession operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.StartProjectSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartProjectSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartProjectSessionResult startProjectSession(StartProjectSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartProjectSession(request);
    }

    @SdkInternalApi
    final StartProjectSessionResult executeStartProjectSession(StartProjectSessionRequest startProjectSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startProjectSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartProjectSessionRequest> request = null;
        Response<StartProjectSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartProjectSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startProjectSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartProjectSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartProjectSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartProjectSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a particular run of a job.
     * </p>
     * 
     * @param stopJobRunRequest
     * @return Result of the StopJobRun operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.StopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopJobRunResult stopJobRun(StopJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeStopJobRun(request);
    }

    @SdkInternalApi
    final StopJobRunResult executeStopJobRun(StopJobRunRequest stopJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(stopJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopJobRunRequest> request = null;
        Response<StopJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopJobRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds metadata tags to a DataBrew resource, such as a dataset, project, recipe, job, or schedule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
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
     * Removes metadata tags from a DataBrew resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
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
     * Modifies the definition of an existing DataBrew dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return Result of the UpdateDataset operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDatasetResult updateDataset(UpdateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataset(request);
    }

    @SdkInternalApi
    final UpdateDatasetResult executeUpdateDataset(UpdateDatasetRequest updateDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetRequest> request = null;
        Response<UpdateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the definition of an existing profile job.
     * </p>
     * 
     * @param updateProfileJobRequest
     * @return Result of the UpdateProfileJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProfileJobResult updateProfileJob(UpdateProfileJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfileJob(request);
    }

    @SdkInternalApi
    final UpdateProfileJobResult executeUpdateProfileJob(UpdateProfileJobRequest updateProfileJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileJobRequest> request = null;
        Response<UpdateProfileJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfileJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfileJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfileJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the definition of an existing DataBrew project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the definition of the <code>LATEST_WORKING</code> version of a DataBrew recipe.
     * </p>
     * 
     * @param updateRecipeRequest
     * @return Result of the UpdateRecipe operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSGlueDataBrew.UpdateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRecipeResult updateRecipe(UpdateRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecipe(request);
    }

    @SdkInternalApi
    final UpdateRecipeResult executeUpdateRecipe(UpdateRecipeRequest updateRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecipeRequest> request = null;
        Response<UpdateRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the definition of an existing DataBrew recipe job.
     * </p>
     * 
     * @param updateRecipeJobRequest
     * @return Result of the UpdateRecipeJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRecipeJobResult updateRecipeJob(UpdateRecipeJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecipeJob(request);
    }

    @SdkInternalApi
    final UpdateRecipeJobResult executeUpdateRecipeJob(UpdateRecipeJobRequest updateRecipeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecipeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecipeJobRequest> request = null;
        Response<UpdateRecipeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecipeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRecipeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecipeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecipeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRecipeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the definition of an existing DataBrew schedule.
     * </p>
     * 
     * @param updateScheduleRequest
     * @return Result of the UpdateSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateScheduleResult updateSchedule(UpdateScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSchedule(request);
    }

    @SdkInternalApi
    final UpdateScheduleResult executeUpdateSchedule(UpdateScheduleRequest updateScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScheduleRequest> request = null;
        Response<UpdateScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataBrew");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateScheduleResultJsonUnmarshaller());
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
