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
package com.amazonaws.services.elastictranscoder;

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

import com.amazonaws.services.elastictranscoder.AmazonElasticTranscoderClientBuilder;
import com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.services.elastictranscoder.model.transform.*;

/**
 * Client for accessing Amazon Elastic Transcoder. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>AWS Elastic Transcoder Service</fullname>
 * <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticTranscoderClient extends AmazonWebServiceClient implements AmazonElasticTranscoder {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticTranscoder.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elastictranscoder";

    private volatile AmazonElasticTranscoderWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleVersionException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.IncompatibleVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.elastictranscoder.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.elastictranscoder.model.AmazonElasticTranscoderException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticTranscoderClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Elastic Transcoder (ex:
     *        proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticTranscoderClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonElasticTranscoderClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonElasticTranscoderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Elastic Transcoder (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticTranscoderClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticTranscoderClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Elastic Transcoder (ex:
     *        proxy settings, retry counts, etc.).
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticTranscoderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Elastic Transcoder (ex:
     *        proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonElasticTranscoderClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticTranscoderClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonElasticTranscoderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonElasticTranscoderClientBuilder builder() {
        return AmazonElasticTranscoderClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticTranscoderClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic Transcoder using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticTranscoderClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("elastictranscoder.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elastictranscoder/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elastictranscoder/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <note>
     * <p>
     * You can only cancel a job that has a status of <code>Submitted</code>. To prevent a pipeline from starting to
     * process a job while you're getting the job identifier, use <a>UpdatePipelineStatus</a> to temporarily pause the
     * pipeline.
     * </p>
     * </note>
     * 
     * @param cancelJobRequest
     *        The <code>CancelJobRequest</code> structure.
     * @return Result of the CancelJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CancelJob
     */
    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJob(request);
    }

    @SdkInternalApi
    final CancelJobResult executeCancelJob(CancelJobRequest cancelJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
     * information about the job that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
     * output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
     * to the AWS Console).
     * </p>
     * 
     * @param createJobRequest
     *        The <code>CreateJobRequest</code> structure.
     * @return Result of the CreateJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the number of pipelines exceeds the maximum
     *         allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreateJob
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you specify.
     * </p>
     * 
     * @param createPipelineRequest
     *        The <code>CreatePipelineRequest</code> structure.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the number of pipelines exceeds the maximum
     *         allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreatePipeline
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
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
     * The CreatePreset operation creates a preset with settings that you specify.
     * </p>
     * <important>
     * <p>
     * Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and
     * to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder,
     * Elastic Transcoder returns an HTTP 400 response (<code>ValidationException</code>) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard,
     * Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine
     * whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the
     * video that Elastic Transcoder produces.
     * </p>
     * </important>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more information, see the International
     * Telecommunication Union publication <i>Recommendation ITU-T H.264: Advanced video coding for generic audiovisual
     * services</i>.
     * </p>
     * 
     * @param createPresetRequest
     *        The <code>CreatePresetRequest</code> structure.
     * @return Result of the CreatePreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the number of pipelines exceeds the maximum
     *         allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreatePreset
     */
    @Override
    public CreatePresetResult createPreset(CreatePresetRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePreset(request);
    }

    @SdkInternalApi
    final CreatePresetResult executeCreatePreset(CreatePresetRequest createPresetRequest) {

        ExecutionContext executionContext = createExecutionContext(createPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresetRequest> request = null;
        Response<CreatePresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePreset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePresetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePresetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
     * active jobs). If the pipeline is currently in use, <code>DeletePipeline</code> returns an error.
     * </p>
     * 
     * @param deletePipelineRequest
     *        The <code>DeletePipelineRequest</code> structure.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.DeletePipeline
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
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
     * The DeletePreset operation removes a preset that you've added in an AWS region.
     * </p>
     * <note>
     * <p>
     * You can't delete the default presets that are included with Elastic Transcoder.
     * </p>
     * </note>
     * 
     * @param deletePresetRequest
     *        The <code>DeletePresetRequest</code> structure.
     * @return Result of the DeletePreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.DeletePreset
     */
    @Override
    public DeletePresetResult deletePreset(DeletePresetRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePreset(request);
    }

    @SdkInternalApi
    final DeletePresetResult executeDeletePreset(DeletePresetRequest deletePresetRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePresetRequest> request = null;
        Response<DeletePresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePresetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePreset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePresetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePresetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByPipelineRequest
     *        The <code>ListJobsByPipelineRequest</code> structure.
     * @return Result of the ListJobsByPipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListJobsByPipeline
     */
    @Override
    public ListJobsByPipelineResult listJobsByPipeline(ListJobsByPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeListJobsByPipeline(request);
    }

    @SdkInternalApi
    final ListJobsByPipelineResult executeListJobsByPipeline(ListJobsByPipelineRequest listJobsByPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsByPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsByPipelineRequest> request = null;
        Response<ListJobsByPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsByPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsByPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobsByPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsByPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsByPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByStatusRequest
     *        The <code>ListJobsByStatusRequest</code> structure.
     * @return Result of the ListJobsByStatus operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListJobsByStatus
     */
    @Override
    public ListJobsByStatusResult listJobsByStatus(ListJobsByStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListJobsByStatus(request);
    }

    @SdkInternalApi
    final ListJobsByStatusResult executeListJobsByStatus(ListJobsByStatusRequest listJobsByStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsByStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsByStatusRequest> request = null;
        Response<ListJobsByStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsByStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsByStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobsByStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsByStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsByStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        The <code>ListPipelineRequest</code> structure.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListPipelines
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
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
     * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
     * that you've added in an AWS region.
     * </p>
     * 
     * @param listPresetsRequest
     *        The <code>ListPresetsRequest</code> structure.
     * @return Result of the ListPresets operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListPresets
     */
    @Override
    public ListPresetsResult listPresets(ListPresetsRequest request) {
        request = beforeClientExecution(request);
        return executeListPresets(request);
    }

    @SdkInternalApi
    final ListPresetsResult executeListPresets(ListPresetsRequest listPresetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPresetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPresetsRequest> request = null;
        Response<ListPresetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPresetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPresetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPresets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPresetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPresetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPresetsResult listPresets() {
        return listPresets(new ListPresetsRequest());
    }

    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     * 
     * @param readJobRequest
     *        The <code>ReadJobRequest</code> structure.
     * @return Result of the ReadJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadJob
     */
    @Override
    public ReadJobResult readJob(ReadJobRequest request) {
        request = beforeClientExecution(request);
        return executeReadJob(request);
    }

    @SdkInternalApi
    final ReadJobResult executeReadJob(ReadJobRequest readJobRequest) {

        ExecutionContext executionContext = createExecutionContext(readJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReadJobRequest> request = null;
        Response<ReadJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReadJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(readJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReadJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReadJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReadJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     * 
     * @param readPipelineRequest
     *        The <code>ReadPipelineRequest</code> structure.
     * @return Result of the ReadPipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadPipeline
     */
    @Override
    public ReadPipelineResult readPipeline(ReadPipelineRequest request) {
        request = beforeClientExecution(request);
        return executeReadPipeline(request);
    }

    @SdkInternalApi
    final ReadPipelineResult executeReadPipeline(ReadPipelineRequest readPipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(readPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReadPipelineRequest> request = null;
        Response<ReadPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReadPipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(readPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReadPipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReadPipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReadPipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     * 
     * @param readPresetRequest
     *        The <code>ReadPresetRequest</code> structure.
     * @return Result of the ReadPreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadPreset
     */
    @Override
    public ReadPresetResult readPreset(ReadPresetRequest request) {
        request = beforeClientExecution(request);
        return executeReadPreset(request);
    }

    @SdkInternalApi
    final ReadPresetResult executeReadPreset(ReadPresetRequest readPresetRequest) {

        ExecutionContext executionContext = createExecutionContext(readPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReadPresetRequest> request = null;
        Response<ReadPresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReadPresetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(readPresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReadPreset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReadPresetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReadPresetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM role you are using has sufficient permissions
     * to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume
     * the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     * 
     * @param testRoleRequest
     *        The <code>TestRoleRequest</code> structure.
     * @return Result of the TestRole operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.TestRole
     */
    @Override
    @Deprecated
    public TestRoleResult testRole(TestRoleRequest request) {
        request = beforeClientExecution(request);
        return executeTestRole(request);
    }

    @SdkInternalApi
    final TestRoleResult executeTestRole(TestRoleRequest testRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(testRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRoleRequest> request = null;
        Response<TestRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRoleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestRoleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for a pipeline.
     * </p>
     * <important>
     * <p>
     * When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
     * that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
     * change settings.
     * </p>
     * </important>
     * 
     * @param updatePipelineRequest
     *        The <code>UpdatePipelineRequest</code> structure.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipeline
     */
    @Override
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipeline(request);
    }

    @SdkInternalApi
    final UpdatePipelineResult executeUpdatePipeline(UpdatePipelineRequest updatePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineRequest> request = null;
        Response<UpdatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipelineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
     * notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
     * request.
     * </p>
     * 
     * @param updatePipelineNotificationsRequest
     *        The <code>UpdatePipelineNotificationsRequest</code> structure.
     * @return Result of the UpdatePipelineNotifications operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipelineNotifications
     */
    @Override
    public UpdatePipelineNotificationsResult updatePipelineNotifications(UpdatePipelineNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipelineNotifications(request);
    }

    @SdkInternalApi
    final UpdatePipelineNotificationsResult executeUpdatePipelineNotifications(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipelineNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineNotificationsRequest> request = null;
        Response<UpdatePipelineNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePipelineNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePipelineNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipelineNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePipelineNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
     * processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
     * Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
     * have more time to get the job IDs for the jobs that you want to cancel, and to send a <a>CancelJob</a> request.
     * </p>
     * 
     * @param updatePipelineStatusRequest
     *        The <code>UpdatePipelineStatusRequest</code> structure.
     * @return Result of the UpdatePipelineStatus operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For example, the pipeline to which you're
     *         trying to add a job doesn't exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example, you are attempting to delete a pipeline
     *         that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipelineStatus
     */
    @Override
    public UpdatePipelineStatusResult updatePipelineStatus(UpdatePipelineStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePipelineStatus(request);
    }

    @SdkInternalApi
    final UpdatePipelineStatusResult executeUpdatePipelineStatus(UpdatePipelineStatusRequest updatePipelineStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePipelineStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineStatusRequest> request = null;
        Response<UpdatePipelineStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePipelineStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Transcoder");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePipelineStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePipelineStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePipelineStatusResultJsonUnmarshaller());
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
    public AmazonElasticTranscoderWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonElasticTranscoderWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
