/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline;

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

import com.amazonaws.services.datapipeline.DataPipelineClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.services.datapipeline.model.transform.*;

/**
 * Client for accessing AWS Data Pipeline. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Data Pipeline configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the
 * details of scheduling and ensuring that data dependencies are met so that your application can focus on processing
 * the data.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data
 * Pipeline Task Runner provides logic for common data management scenarios, such as performing database queries and
 * running data analysis using Amazon Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task Runner as your
 * task runner, or you can write your own task runner to provide custom data management.
 * </p>
 * <p>
 * AWS Data Pipeline implements two main sets of functionality. Use the first set to create a pipeline and define data
 * sources, schedules, dependencies, and the transforms to be performed on the data. Use the second set in your task
 * runner application to receive the next task ready for processing. The logic for performing the task, such as querying
 * the data, running data analysis, or converting the data from one format to another, is contained within the task
 * runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as
 * it does so. When the task is done, the task runner reports the final success or failure of the task to the web
 * service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPipelineClient extends AmazonWebServiceClient implements DataPipeline {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(DataPipeline.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "datapipeline";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.datapipeline.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TaskNotFoundException").withModeledClass(
                                    com.amazonaws.services.datapipeline.model.TaskNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineDeletedException").withModeledClass(
                                    com.amazonaws.services.datapipeline.model.PipelineDeletedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PipelineNotFoundException").withModeledClass(
                                    com.amazonaws.services.datapipeline.model.PipelineNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceError").withModeledClass(
                                    com.amazonaws.services.datapipeline.model.InternalServiceErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.datapipeline.model.DataPipelineException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link DataPipelineClientBuilder#defaultClient()}
     */
    @Deprecated
    public DataPipelineClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Data Pipeline (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link DataPipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public DataPipelineClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link DataPipelineClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code DataPipelineClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public DataPipelineClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Data Pipeline (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link DataPipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public DataPipelineClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link DataPipelineClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Data Pipeline (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link DataPipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Data Pipeline (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link DataPipelineClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link DataPipelineClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static DataPipelineClientBuilder builder() {
        return DataPipelineClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    DataPipelineClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    DataPipelineClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("datapipeline.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/datapipeline/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/datapipeline/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation,
     * activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call
     * <a>DeactivatePipeline</a>.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline and then activate it.
     * </p>
     * 
     * @param activatePipelineRequest
     *        Contains the parameters for ActivatePipeline.
     * @return Result of the ActivatePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.ActivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ActivatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ActivatePipelineResult activatePipeline(ActivatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeActivatePipeline(request);
    }

    @SdkInternalApi
    final ActivatePipelineResult executeActivatePipeline(ActivatePipelineRequest activatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(activatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivatePipelineRequest> request = null;
        Response<ActivatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(activatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ActivatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @return Result of the AddTags operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new, empty pipeline. Use <a>PutPipelineDefinition</a> to populate the pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Contains the parameters for CreatePipeline.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePipeline(request);
    }

    @SdkInternalApi
    final CreatePipelineResult executeCreatePipeline(CreatePipelineRequest createPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deactivates the specified running pipeline. The pipeline is set to the <code>DEACTIVATING</code> state until the
     * deactivation process completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use <a>ActivatePipeline</a>. By default, the pipeline resumes from the last
     * completed execution. Optionally, you can specify the date and time to resume the pipeline.
     * </p>
     * 
     * @param deactivatePipelineRequest
     *        Contains the parameters for DeactivatePipeline.
     * @return Result of the DeactivatePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.DeactivatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeactivatePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeactivatePipelineResult deactivatePipeline(DeactivatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeactivatePipeline(request);
    }

    @SdkInternalApi
    final DeactivatePipelineResult executeDeactivatePipeline(DeactivatePipelineRequest deactivatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deactivatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivatePipelineRequest> request = null;
        Response<DeactivatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deactivatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeactivatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeactivatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeactivatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances
     * associated with the pipeline that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a
     * pipeline instead of deleting it, call <a>SetStatus</a> with the status set to <code>PAUSE</code> on individual
     * components. Components that are paused by <a>SetStatus</a> can be resumed.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Contains the parameters for DeletePipeline.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePipeline(request);
    }

    @SdkInternalApi
    final DeletePipelineResult executeDeletePipeline(DeletePipelineRequest deletePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<DeletePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of
     * a set of fields that define the properties of the object.
     * </p>
     * 
     * @param describeObjectsRequest
     *        Contains the parameters for DescribeObjects.
     * @return Result of the DescribeObjects operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.DescribeObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribeObjects" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeObjectsResult describeObjects(DescribeObjectsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeObjects(request);
    }

    @SdkInternalApi
    final DescribeObjectsResult executeDescribeObjects(DescribeObjectsRequest describeObjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeObjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeObjectsRequest> request = null;
        Response<DescribeObjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeObjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeObjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeObjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeObjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeObjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the
     * pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials,
     * you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines for which you have read permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about the pipeline, call
     * <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @param describePipelinesRequest
     *        Contains the parameters for DescribePipelines.
     * @return Result of the DescribePipelines operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.DescribePipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/DescribePipelines" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePipelinesResult describePipelines(DescribePipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePipelines(request);
    }

    @SdkInternalApi
    final DescribePipelinesResult executeDescribePipelines(DescribePipelinesRequest describePipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(describePipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePipelinesRequest> request = null;
        Response<DescribePipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Task runners call <code>EvaluateExpression</code> to evaluate a string in the context of the specified object.
     * For example, a task runner can evaluate SQL queries stored in Amazon S3.
     * </p>
     * 
     * @param evaluateExpressionRequest
     *        Contains the parameters for EvaluateExpression.
     * @return Result of the EvaluateExpression operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.EvaluateExpression
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/EvaluateExpression"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EvaluateExpressionResult evaluateExpression(EvaluateExpressionRequest request) {
        request = beforeClientExecution(request);
        return executeEvaluateExpression(request);
    }

    @SdkInternalApi
    final EvaluateExpressionResult executeEvaluateExpression(EvaluateExpressionRequest evaluateExpressionRequest) {

        ExecutionContext executionContext = createExecutionContext(evaluateExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EvaluateExpressionRequest> request = null;
        Response<EvaluateExpressionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EvaluateExpressionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(evaluateExpressionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EvaluateExpression");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EvaluateExpressionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EvaluateExpressionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the definition of the specified pipeline. You can call <code>GetPipelineDefinition</code> to retrieve the
     * pipeline definition that you provided using <a>PutPipelineDefinition</a>.
     * </p>
     * 
     * @param getPipelineDefinitionRequest
     *        Contains the parameters for GetPipelineDefinition.
     * @return Result of the GetPipelineDefinition operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.GetPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/GetPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPipelineDefinitionResult getPipelineDefinition(GetPipelineDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPipelineDefinition(request);
    }

    @SdkInternalApi
    final GetPipelineDefinitionResult executeGetPipelineDefinition(GetPipelineDefinitionRequest getPipelineDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPipelineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineDefinitionRequest> request = null;
        Response<GetPipelineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPipelineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPipelineDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPipelineDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetPipelineDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the pipeline identifiers for all active pipelines that you have permission to access.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Contains the parameters for ListPipelines.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        request = beforeClientExecution(request);
        return executeListPipelines(request);
    }

    @SdkInternalApi
    final ListPipelinesResult executeListPipelines(ListPipelinesRequest listPipelinesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPipelines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPipelinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPipelinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPipelinesResult listPipelines() {
        return listPipelines(new ListPipelinesRequest());
    }

    /**
     * <p>
     * Task runners call <code>PollForTask</code> to receive a task to perform from AWS Data Pipeline. The task runner
     * specifies which tasks it can perform by setting a value for the <code>workerGroup</code> parameter. The task
     * returned can come from any of the pipelines that match the <code>workerGroup</code> value passed in by the task
     * runner and that was launched using the IAM user credentials specified by the task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code> returns a response immediately. If no tasks are
     * available in the queue, <code>PollForTask</code> uses long-polling and holds on to a poll connection for up to a
     * 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this,
     * set the socket timeout in your task runner to 90 seconds. The task runner should not call
     * <code>PollForTask</code> again on the same <code>workerGroup</code> until it receives a response, and this can
     * take up to 90 seconds.
     * </p>
     * 
     * @param pollForTaskRequest
     *        Contains the parameters for PollForTask.
     * @return Result of the PollForTask operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @sample DataPipeline.PollForTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PollForTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PollForTaskResult pollForTask(PollForTaskRequest request) {
        request = beforeClientExecution(request);
        return executePollForTask(request);
    }

    @SdkInternalApi
    final PollForTaskResult executePollForTask(PollForTaskRequest pollForTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(pollForTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForTaskRequest> request = null;
        Response<PollForTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pollForTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PollForTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PollForTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PollForTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tasks, schedules, and preconditions to the specified pipeline. You can use
     * <code>PutPipelineDefinition</code> to populate a new pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration as it adds it to the pipeline. Changes to the
     * pipeline are saved unless one of the following three validation errors exists in the pipeline.
     * </p>
     * <ol>
     * <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol>
     * <p>
     * Pipeline object definitions are passed to the <code>PutPipelineDefinition</code> action and returned by the
     * <a>GetPipelineDefinition</a> action.
     * </p>
     * 
     * @param putPipelineDefinitionRequest
     *        Contains the parameters for PutPipelineDefinition.
     * @return Result of the PutPipelineDefinition operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.PutPipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PutPipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutPipelineDefinitionResult putPipelineDefinition(PutPipelineDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executePutPipelineDefinition(request);
    }

    @SdkInternalApi
    final PutPipelineDefinitionResult executePutPipelineDefinition(PutPipelineDefinitionRequest putPipelineDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(putPipelineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPipelineDefinitionRequest> request = null;
        Response<PutPipelineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPipelineDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putPipelineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPipelineDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPipelineDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutPipelineDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Queries the specified pipeline for the names of objects that match the specified set of conditions.
     * </p>
     * 
     * @param queryObjectsRequest
     *        Contains the parameters for QueryObjects.
     * @return Result of the QueryObjects operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.QueryObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/QueryObjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public QueryObjectsResult queryObjects(QueryObjectsRequest request) {
        request = beforeClientExecution(request);
        return executeQueryObjects(request);
    }

    @SdkInternalApi
    final QueryObjectsResult executeQueryObjects(QueryObjectsRequest queryObjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(queryObjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryObjectsRequest> request = null;
        Response<QueryObjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryObjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(queryObjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "QueryObjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<QueryObjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new QueryObjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTags(request);
    }

    @SdkInternalApi
    final RemoveTagsResult executeRemoveTags(RemoveTagsRequest removeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Task runners call <code>ReportTaskProgress</code> when assigned a task to acknowledge that it has the task. If
     * the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent
     * <a>PollForTask</a> call. After this initial acknowledgement, the task runner only needs to report progress every
     * 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by
     * specifying a <code>reportProgressTimeout</code> field in your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is
     * unable to process the task and reassigns the task in a subsequent response to <a>PollForTask</a>. Task runners
     * should call <code>ReportTaskProgress</code> every 60 seconds.
     * </p>
     * 
     * @param reportTaskProgressRequest
     *        Contains the parameters for ReportTaskProgress.
     * @return Result of the ReportTaskProgress operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.ReportTaskProgress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskProgress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReportTaskProgressResult reportTaskProgress(ReportTaskProgressRequest request) {
        request = beforeClientExecution(request);
        return executeReportTaskProgress(request);
    }

    @SdkInternalApi
    final ReportTaskProgressResult executeReportTaskProgress(ReportTaskProgressRequest reportTaskProgressRequest) {

        ExecutionContext executionContext = createExecutionContext(reportTaskProgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReportTaskProgressRequest> request = null;
        Response<ReportTaskProgressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReportTaskProgressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(reportTaskProgressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReportTaskProgress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReportTaskProgressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReportTaskProgressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15 minutes to indicate that they are operational.
     * If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can
     * use this call to detect when the task runner application has failed and restart a new instance.
     * </p>
     * 
     * @param reportTaskRunnerHeartbeatRequest
     *        Contains the parameters for ReportTaskRunnerHeartbeat.
     * @return Result of the ReportTaskRunnerHeartbeat operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.ReportTaskRunnerHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskRunnerHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReportTaskRunnerHeartbeatResult reportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest request) {
        request = beforeClientExecution(request);
        return executeReportTaskRunnerHeartbeat(request);
    }

    @SdkInternalApi
    final ReportTaskRunnerHeartbeatResult executeReportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest) {

        ExecutionContext executionContext = createExecutionContext(reportTaskRunnerHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReportTaskRunnerHeartbeatRequest> request = null;
        Response<ReportTaskRunnerHeartbeatResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReportTaskRunnerHeartbeatRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(reportTaskRunnerHeartbeatRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReportTaskRunnerHeartbeat");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReportTaskRunnerHeartbeatResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ReportTaskRunnerHeartbeatResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests that the status of the specified physical or logical pipeline objects be updated in the specified
     * pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set
     * depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on
     * <code>FINISHED</code> pipelines and attempting to do so returns <code>InvalidRequestException</code>.
     * </p>
     * 
     * @param setStatusRequest
     *        Contains the parameters for SetStatus.
     * @return Result of the SetStatus operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @sample DataPipeline.SetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetStatusResult setStatus(SetStatusRequest request) {
        request = beforeClientExecution(request);
        return executeSetStatus(request);
    }

    @SdkInternalApi
    final SetStatusResult executeSetStatus(SetStatusRequest setStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(setStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetStatusRequest> request = null;
        Response<SetStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetStatusResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data Pipeline that a task is completed and provide
     * information about the final status. A task runner makes this call regardless of whether the task was sucessful. A
     * task runner does not need to call <code>SetTaskStatus</code> for tasks that are canceled by the web service
     * during a call to <a>ReportTaskProgress</a>.
     * </p>
     * 
     * @param setTaskStatusRequest
     *        Contains the parameters for SetTaskStatus.
     * @return Result of the SetTaskStatus operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.SetTaskStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetTaskStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SetTaskStatusResult setTaskStatus(SetTaskStatusRequest request) {
        request = beforeClientExecution(request);
        return executeSetTaskStatus(request);
    }

    @SdkInternalApi
    final SetTaskStatusResult executeSetTaskStatus(SetTaskStatusRequest setTaskStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(setTaskStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTaskStatusRequest> request = null;
        Response<SetTaskStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTaskStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setTaskStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetTaskStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetTaskStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetTaskStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
     * </p>
     * 
     * @param validatePipelineDefinitionRequest
     *        Contains the parameters for ValidatePipelineDefinition.
     * @return Result of the ValidatePipelineDefinition operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly formatted, that the signature was
     *         generated with the correct credentials, and that you haven't exceeded any of the service limits for your
     *         account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.ValidatePipelineDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ValidatePipelineDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidatePipelineDefinitionResult validatePipelineDefinition(ValidatePipelineDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeValidatePipelineDefinition(request);
    }

    @SdkInternalApi
    final ValidatePipelineDefinitionResult executeValidatePipelineDefinition(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(validatePipelineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidatePipelineDefinitionRequest> request = null;
        Response<ValidatePipelineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidatePipelineDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validatePipelineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Data Pipeline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidatePipelineDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidatePipelineDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidatePipelineDefinitionResultJsonUnmarshaller());
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
