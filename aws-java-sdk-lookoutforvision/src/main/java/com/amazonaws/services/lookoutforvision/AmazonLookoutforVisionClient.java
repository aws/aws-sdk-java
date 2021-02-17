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
package com.amazonaws.services.lookoutforvision;

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

import com.amazonaws.services.lookoutforvision.AmazonLookoutforVisionClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lookoutforvision.model.*;
import com.amazonaws.services.lookoutforvision.model.transform.*;

/**
 * Client for accessing Amazon Lookout for Vision. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Lookout for Vision API Reference. It provides descriptions of actions, data types, common
 * parameters, and common errors.
 * </p>
 * <p>
 * Amazon Lookout for Vision enables you to find visual defects in industrial products, accurately and at scale. It uses
 * computer vision to identify missing components in an industrial product, damage to vehicles or structures,
 * irregularities in production lines, and even minuscule defects in silicon wafers — or any other physical item where
 * quality is important such as a missing capacitor on printed circuit boards.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLookoutforVisionClient extends AmazonWebServiceClient implements AmazonLookoutforVision {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLookoutforVision.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lookoutvision";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.lookoutforvision.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lookoutforvision.model.AmazonLookoutforVisionException.class));

    public static AmazonLookoutforVisionClientBuilder builder() {
        return AmazonLookoutforVisionClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lookout for Vision using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLookoutforVisionClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lookout for Vision using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLookoutforVisionClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lookoutvision.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lookoutforvision/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lookoutforvision/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new dataset in an Amazon Lookout for Vision project. <code>CreateDataset</code> can create a training
     * or a test dataset from a valid dataset source (<code>DatasetSource</code>).
     * </p>
     * <p>
     * If you want a single dataset project, specify <code>train</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * To have a project with separate training and test datasets, call <code>CreateDataset</code> twice. On the first
     * call, specify <code>train</code> for the value of <code>DatasetType</code>. On the second call, specify
     * <code>test</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateDataset</code> operation.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateDataset" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Creates a new version of a model within an an Amazon Lookout for Vision project. <code>CreateModel</code> is an
     * asynchronous operation in which Amazon Lookout for Vision trains, tests, and evaluates a new version of a model.
     * </p>
     * <p>
     * To get the current status, check the <code>Status</code> field returned in the response from
     * <a>DescribeModel</a>.
     * </p>
     * <p>
     * If the project has a single dataset, Amazon Lookout for Vision internally splits the dataset to create a training
     * and a test dataset. If the project has a training and a test dataset, Lookout for Vision uses the respective
     * datasets to train and test the model.
     * </p>
     * <p>
     * After training completes, the evaluation metrics are stored at the location specified in
     * <code>OutputConfig</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateModel</code> operation. If you want
     * to tag your model, you also require permission to the <code>lookoutvision:TagResource</code> operation.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateModelResult createModel(CreateModelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateModel(request);
    }

    @SdkInternalApi
    final CreateModelResult executeCreateModel(CreateModelRequest createModelRequest) {

        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty Amazon Lookout for Vision project. After you create the project, add a dataset by calling
     * <a>CreateDataset</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateProject</code> operation.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateProject" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Deletes an existing Amazon Lookout for Vision <code>dataset</code>.
     * </p>
     * <p>
     * If your the project has a single dataset, you must create a new dataset before you can create a model.
     * </p>
     * <p>
     * If you project has a training dataset and a test dataset consider the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you delete the test dataset, your project reverts to a single dataset project. If you then train the model,
     * Amazon Lookout for Vision internally splits the remaining dataset into a training and test dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete the training dataset, you must create a training dataset before you can create a model.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteDataset</code> operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Deletes an Amazon Lookout for Vision model. You can't delete a running model. To stop a running model, use the
     * <a>StopModel</a> operation.
     * </p>
     * <p>
     * It might take a few seconds to delete a model. To determine if a model has been deleted, call <a>ListProjects</a>
     * and check if the version of the model (<code>ModelVersion</code>) is in the <code>Models</code> array.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteModel</code> operation.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteModelResult deleteModel(DeleteModelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteModel(request);
    }

    @SdkInternalApi
    final DeleteModelResult executeDeleteModel(DeleteModelRequest deleteModelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<DeleteModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * To delete a project, you must first delete each version of the model associated with the project. To delete a
     * model use the <a>DeleteModel</a> operation.
     * </p>
     * <p>
     * You also have to delete the dataset(s) associated with the model. For more information, see <a>DeleteDataset</a>.
     * The images referenced by the training and test datasets aren't deleted.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteProject</code> operation.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteProject" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Describe an Amazon Lookout for Vision dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeDataset</code> operation.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Describes a version of an Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeModel</code> operation.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeModelResult describeModel(DescribeModelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeModel(request);
    }

    @SdkInternalApi
    final DescribeModelResult executeDescribeModel(DescribeModelRequest describeModelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelRequest> request = null;
        Response<DescribeModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeModelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeProject</code> operation.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeProject" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Detects anomalies in an image that you supply.
     * </p>
     * <p>
     * The response from <code>DetectAnomalies</code> includes a boolean prediction that the image contains one or more
     * anomalies and a confidence value for the prediction.
     * </p>
     * <note>
     * <p>
     * Before calling <code>DetectAnomalies</code>, you must first start your model with the <a>StartModel</a>
     * operation. You are charged for the amount of time, in minutes, that a model runs and for the number of anomaly
     * detection units that your model uses. If you are not using a model, use the <a>StopModel</a> operation to stop
     * your model.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DetectAnomalies</code> operation.
     * </p>
     * 
     * @param detectAnomaliesRequest
     * @return Result of the DetectAnomalies operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DetectAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DetectAnomalies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetectAnomaliesResult detectAnomalies(DetectAnomaliesRequest request) {
        request = beforeClientExecution(request);
        return executeDetectAnomalies(request);
    }

    @SdkInternalApi
    final DetectAnomaliesResult executeDetectAnomalies(DetectAnomaliesRequest detectAnomaliesRequest) {

        ExecutionContext executionContext = createExecutionContext(detectAnomaliesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectAnomaliesRequest> request = null;
        Response<DetectAnomaliesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectAnomaliesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectAnomaliesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectAnomalies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

                request.addHandlerContext(HandlerContextKey.REQUIRES_LENGTH, Boolean.TRUE);
                request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectAnomaliesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectAnomaliesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the JSON Lines within a dataset. An Amazon Lookout for Vision JSON Line contains the anomaly information
     * for a single image, including the image location and the assigned label.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListDatasetEntries</code> operation.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @return Result of the ListDatasetEntries operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDatasetEntriesResult listDatasetEntries(ListDatasetEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasetEntries(request);
    }

    @SdkInternalApi
    final ListDatasetEntriesResult executeListDatasetEntries(ListDatasetEntriesRequest listDatasetEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetEntriesRequest> request = null;
        Response<ListDatasetEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetEntriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasetEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetEntriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of a model in an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListModels</code> operation.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListModelsResult listModels(ListModelsRequest request) {
        request = beforeClientExecution(request);
        return executeListModels(request);
    }

    @SdkInternalApi
    final ListModelsResult executeListModels(ListModelsRequest listModelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelsRequest> request = null;
        Response<ListModelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListModels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListModelsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListModelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Lookout for Vision projects in your AWS account.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListProjects</code> operation.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListProjects" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Returns a list of tags attached to the specified Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListTagsForResource</code> operation.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Starts the running of the version of an Amazon Lookout for Vision model. Starting a model takes a while to
     * complete. To check the current state of the model, use <a>DescribeModel</a>.
     * </p>
     * <p>
     * A model is ready to use when its status is <code>HOSTED</code>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by calling <a>DetectAnomalies</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop a running model, call <a>StopModel</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:StartModel</code> operation.
     * </p>
     * 
     * @param startModelRequest
     * @return Result of the StartModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.StartModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartModelResult startModel(StartModelRequest request) {
        request = beforeClientExecution(request);
        return executeStartModel(request);
    }

    @SdkInternalApi
    final StartModelResult executeStartModel(StartModelRequest startModelRequest) {

        ExecutionContext executionContext = createExecutionContext(startModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartModelRequest> request = null;
        Response<StartModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartModelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the hosting of a running model. The operation might take a while to complete. To check the current status,
     * call <a>DescribeModel</a>.
     * </p>
     * <p>
     * After the model hosting stops, the <code>Status</code> of the model is <code>TRAINED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:StopModel</code> operation.
     * </p>
     * 
     * @param stopModelRequest
     * @return Result of the StopModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.StopModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StopModel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopModelResult stopModel(StopModelRequest request) {
        request = beforeClientExecution(request);
        return executeStopModel(request);
    }

    @SdkInternalApi
    final StopModelResult executeStopModel(StopModelRequest stopModelRequest) {

        ExecutionContext executionContext = createExecutionContext(stopModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopModelRequest> request = null;
        Response<StopModelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopModelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopModel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopModelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopModelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more key-value tags to an Amazon Lookout for Vision model. For more information, see <i>Tagging a
     * model</i> in the <i>Amazon Lookout for Vision Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:TagResource</code> operation.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Removes one or more tags from an Amazon Lookout for Vision model. For more information, see <i>Tagging a
     * model</i> in the <i>Amazon Lookout for Vision Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:UntagResource</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
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
     * Adds one or more JSON Line entries to a dataset. A JSON Line includes information about an image used for
     * training or testing an Amazon Lookout for Vision model. The following is an example JSON Line.
     * </p>
     * <p>
     * Updating a dataset might take a while to complete. To check the current status, call <a>DescribeDataset</a> and
     * check the <code>Status</code> field in the response.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:UpdateDatasetEntries</code> operation.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @return Result of the UpdateDatasetEntries operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.UpdateDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UpdateDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDatasetEntriesResult updateDatasetEntries(UpdateDatasetEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatasetEntries(request);
    }

    @SdkInternalApi
    final UpdateDatasetEntriesResult executeUpdateDatasetEntries(UpdateDatasetEntriesRequest updateDatasetEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatasetEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetEntriesRequest> request = null;
        Response<UpdateDatasetEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetEntriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatasetEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "LookoutVision");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatasetEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatasetEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatasetEntriesResultJsonUnmarshaller());
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
