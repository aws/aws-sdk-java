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
package com.amazonaws.services.mainframemodernization;

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

import com.amazonaws.services.mainframemodernization.AWSMainframeModernizationClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.services.mainframemodernization.model.transform.*;

/**
 * Client for accessing AWSMainframeModernization. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Mainframe Modernization provides tools and resources to help you plan and implement migration and
 * modernization from mainframes to Amazon Web Services managed runtime environments. It provides tools for analyzing
 * existing mainframe applications, developing or updating mainframe applications using COBOL or PL/I, and implementing
 * an automated pipeline for continuous integration and continuous delivery (CI/CD) of the applications.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMainframeModernizationClient extends AmazonWebServiceClient implements AWSMainframeModernization {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMainframeModernization.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "m2";

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
                                    com.amazonaws.services.mainframemodernization.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mainframemodernization.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mainframemodernization.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mainframemodernization.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mainframemodernization.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mainframemodernization.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mainframemodernization.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mainframemodernization.model.AWSMainframeModernizationException.class));

    public static AWSMainframeModernizationClientBuilder builder() {
        return AWSMainframeModernizationClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSMainframeModernization using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMainframeModernizationClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSMainframeModernization using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMainframeModernizationClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("m2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mainframemodernization/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mainframemodernization/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels the running of a specific batch job execution.
     * </p>
     * 
     * @param cancelBatchJobExecutionRequest
     * @return Result of the CancelBatchJobExecution operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.CancelBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CancelBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelBatchJobExecutionResult cancelBatchJobExecution(CancelBatchJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelBatchJobExecution(request);
    }

    @SdkInternalApi
    final CancelBatchJobExecutionResult executeCancelBatchJobExecution(CancelBatchJobExecutionRequest cancelBatchJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelBatchJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelBatchJobExecutionRequest> request = null;
        Response<CancelBatchJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelBatchJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelBatchJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelBatchJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelBatchJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelBatchJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new application with given parameters. Requires an existing runtime environment and application
     * definition file.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a data set import task for a specific application.
     * </p>
     * 
     * @param createDataSetImportTaskRequest
     * @return Result of the CreateDataSetImportTask operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.CreateDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataSetImportTaskResult createDataSetImportTask(CreateDataSetImportTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataSetImportTask(request);
    }

    @SdkInternalApi
    final CreateDataSetImportTaskResult executeCreateDataSetImportTask(CreateDataSetImportTaskRequest createDataSetImportTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataSetImportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSetImportTaskRequest> request = null;
        Response<CreateDataSetImportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSetImportTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataSetImportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataSetImportTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataSetImportTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataSetImportTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and starts a deployment to deploy an application into a runtime environment.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeployment(request);
    }

    @SdkInternalApi
    final CreateDeploymentResult executeCreateDeployment(CreateDeploymentRequest createDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a runtime environment for a given runtime engine.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironment(request);
    }

    @SdkInternalApi
    final CreateEnvironmentResult executeCreateEnvironment(CreateEnvironmentRequest createEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific application. You cannot delete a running application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific application from the specific runtime environment where it was previously deployed. You cannot
     * delete a runtime environment using DeleteEnvironment if any application has ever been deployed to it. This API
     * removes the association of the application with the runtime environment so you can delete the environment
     * smoothly.
     * </p>
     * 
     * @param deleteApplicationFromEnvironmentRequest
     * @return Result of the DeleteApplicationFromEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.DeleteApplicationFromEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplicationFromEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationFromEnvironmentResult deleteApplicationFromEnvironment(DeleteApplicationFromEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationFromEnvironment(request);
    }

    @SdkInternalApi
    final DeleteApplicationFromEnvironmentResult executeDeleteApplicationFromEnvironment(
            DeleteApplicationFromEnvironmentRequest deleteApplicationFromEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationFromEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationFromEnvironmentRequest> request = null;
        Response<DeleteApplicationFromEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationFromEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteApplicationFromEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationFromEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationFromEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteApplicationFromEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific runtime environment. The environment cannot contain deployed applications. If it does, you
     * must delete those applications before you delete the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironment(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentResult executeDeleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentRequest> request = null;
        Response<DeleteEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the details of a specific application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplication(request);
    }

    @SdkInternalApi
    final GetApplicationResult executeGetApplication(GetApplicationRequest getApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a specific version of a specific application.
     * </p>
     * 
     * @param getApplicationVersionRequest
     * @return Result of the GetApplicationVersion operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplicationVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetApplicationVersionResult getApplicationVersion(GetApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationVersion(request);
    }

    @SdkInternalApi
    final GetApplicationVersionResult executeGetApplicationVersion(GetApplicationVersionRequest getApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationVersionRequest> request = null;
        Response<GetApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetApplicationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a specific batch job execution for a specific application.
     * </p>
     * 
     * @param getBatchJobExecutionRequest
     * @return Result of the GetBatchJobExecution operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBatchJobExecutionResult getBatchJobExecution(GetBatchJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetBatchJobExecution(request);
    }

    @SdkInternalApi
    final GetBatchJobExecutionResult executeGetBatchJobExecution(GetBatchJobExecutionRequest getBatchJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getBatchJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBatchJobExecutionRequest> request = null;
        Response<GetBatchJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBatchJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBatchJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBatchJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBatchJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBatchJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a specific data set.
     * </p>
     * 
     * @param getDataSetDetailsRequest
     * @return Result of the GetDataSetDetails operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetDataSetDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetDetails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataSetDetailsResult getDataSetDetails(GetDataSetDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSetDetails(request);
    }

    @SdkInternalApi
    final GetDataSetDetailsResult executeGetDataSetDetails(GetDataSetDetailsRequest getDataSetDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSetDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSetDetailsRequest> request = null;
        Response<GetDataSetDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSetDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSetDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSetDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSetDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSetDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of a data set import task initiated with the <a>CreateDataSetImportTask</a> operation.
     * </p>
     * 
     * @param getDataSetImportTaskRequest
     * @return Result of the GetDataSetImportTask operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataSetImportTaskResult getDataSetImportTask(GetDataSetImportTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataSetImportTask(request);
    }

    @SdkInternalApi
    final GetDataSetImportTaskResult executeGetDataSetImportTask(GetDataSetImportTaskRequest getDataSetImportTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataSetImportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSetImportTaskRequest> request = null;
        Response<GetDataSetImportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSetImportTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataSetImportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataSetImportTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataSetImportTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataSetImportTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details of a specific deployment with a given deployment identifier.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployment(request);
    }

    @SdkInternalApi
    final GetDeploymentResult executeGetDeployment(GetDeploymentRequest getDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a specific runtime environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEnvironmentResult getEnvironment(GetEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironment(request);
    }

    @SdkInternalApi
    final GetEnvironmentResult executeGetEnvironment(GetEnvironmentRequest getEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentRequest> request = null;
        Response<GetEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the application versions for a specific application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @return Result of the ListApplicationVersions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplicationVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListApplicationVersionsResult listApplicationVersions(ListApplicationVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationVersions(request);
    }

    @SdkInternalApi
    final ListApplicationVersionsResult executeListApplicationVersions(ListApplicationVersionsRequest listApplicationVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationVersionsRequest> request = null;
        Response<ListApplicationVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the applications associated with a specific Amazon Web Services account. You can provide the unique
     * identifier of a specific runtime environment in a query parameter to see all applications associated with that
     * environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the available batch job definitions based on the batch job resources uploaded during the application
     * creation. You can use the batch job definitions in the list to start a batch job.
     * </p>
     * 
     * @param listBatchJobDefinitionsRequest
     * @return Result of the ListBatchJobDefinitions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListBatchJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobDefinitions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBatchJobDefinitionsResult listBatchJobDefinitions(ListBatchJobDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListBatchJobDefinitions(request);
    }

    @SdkInternalApi
    final ListBatchJobDefinitionsResult executeListBatchJobDefinitions(ListBatchJobDefinitionsRequest listBatchJobDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBatchJobDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBatchJobDefinitionsRequest> request = null;
        Response<ListBatchJobDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBatchJobDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listBatchJobDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBatchJobDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBatchJobDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBatchJobDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists historical, current, and scheduled batch job executions for a specific application.
     * </p>
     * 
     * @param listBatchJobExecutionsRequest
     * @return Result of the ListBatchJobExecutions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListBatchJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBatchJobExecutionsResult listBatchJobExecutions(ListBatchJobExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListBatchJobExecutions(request);
    }

    @SdkInternalApi
    final ListBatchJobExecutionsResult executeListBatchJobExecutions(ListBatchJobExecutionsRequest listBatchJobExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBatchJobExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBatchJobExecutionsRequest> request = null;
        Response<ListBatchJobExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBatchJobExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBatchJobExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBatchJobExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBatchJobExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBatchJobExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data set imports for the specified application.
     * </p>
     * 
     * @param listDataSetImportHistoryRequest
     * @return Result of the ListDataSetImportHistory operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListDataSetImportHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSetImportHistory" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDataSetImportHistoryResult listDataSetImportHistory(ListDataSetImportHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSetImportHistory(request);
    }

    @SdkInternalApi
    final ListDataSetImportHistoryResult executeListDataSetImportHistory(ListDataSetImportHistoryRequest listDataSetImportHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSetImportHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetImportHistoryRequest> request = null;
        Response<ListDataSetImportHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetImportHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDataSetImportHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSetImportHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSetImportHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDataSetImportHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the data sets imported for a specific application. In Amazon Web Services Mainframe Modernization, data
     * sets are associated with applications deployed on runtime environments. This is known as importing data sets.
     * Currently, Amazon Web Services Mainframe Modernization can import data sets into catalogs using <a
     * href="https://docs.aws.amazon.com/m2/latest/APIReference/API_CreateDataSetImportTask.html"
     * >CreateDataSetImportTask</a>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return Result of the ListDataSets operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataSetsResult listDataSets(ListDataSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataSets(request);
    }

    @SdkInternalApi
    final ListDataSetsResult executeListDataSets(ListDataSetsRequest listDataSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetsRequest> request = null;
        Response<ListDataSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all deployments of a specific application. A deployment is a combination of a specific
     * application and a specific version of that application. Each deployment is mapped to a particular application
     * version.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeployments(request);
    }

    @SdkInternalApi
    final ListDeploymentsResult executeListDeployments(ListDeploymentsRequest listDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the available engine versions.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return Result of the ListEngineVersions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEngineVersionsResult listEngineVersions(ListEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEngineVersions(request);
    }

    @SdkInternalApi
    final ListEngineVersionsResult executeListEngineVersions(ListEngineVersionsRequest listEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEngineVersionsRequest> request = null;
        Response<ListEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEngineVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEngineVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEngineVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the runtime environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironments(request);
    }

    @SdkInternalApi
    final ListEnvironmentsResult executeListEnvironments(ListEnvironmentsRequest listEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentsRequest> request = null;
        Response<ListEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
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
     * Starts an application that is currently stopped.
     * </p>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartApplicationResult startApplication(StartApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStartApplication(request);
    }

    @SdkInternalApi
    final StartApplicationResult executeStartApplication(StartApplicationRequest startApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(startApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartApplicationRequest> request = null;
        Response<StartApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a batch job and returns the unique identifier of this execution of the batch job. The associated
     * application must be running in order to start the batch job.
     * </p>
     * 
     * @param startBatchJobRequest
     * @return Result of the StartBatchJob operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.StartBatchJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartBatchJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartBatchJobResult startBatchJob(StartBatchJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartBatchJob(request);
    }

    @SdkInternalApi
    final StartBatchJobResult executeStartBatchJob(StartBatchJobRequest startBatchJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startBatchJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBatchJobRequest> request = null;
        Response<StartBatchJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBatchJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startBatchJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartBatchJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartBatchJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartBatchJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StopApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopApplicationResult stopApplication(StopApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStopApplication(request);
    }

    @SdkInternalApi
    final StopApplicationResult executeStopApplication(StopApplicationRequest stopApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopApplicationRequest> request = null;
        Response<StopApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
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
     * Updates an application and creates a new version.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration details for a specific runtime environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironment(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentResult executeUpdateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "m2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEnvironmentResultJsonUnmarshaller());
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
