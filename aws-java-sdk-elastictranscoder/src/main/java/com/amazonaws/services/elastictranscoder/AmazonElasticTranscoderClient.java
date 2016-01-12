/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.services.elastictranscoder.model.transform.*;

/**
 * Client for accessing Amazon Elastic Transcoder. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>AWS Elastic Transcoder Service</fullname>
 * <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
public class AmazonElasticTranscoderClient extends AmazonWebServiceClient
        implements AmazonElasticTranscoder {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonElasticTranscoder.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elastictranscoder";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "elastictranscoder";

    /**
     * List of exception unmarshallers for all Amazon Elastic Transcoder
     * exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticTranscoderClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Elastic Transcoder (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticTranscoderClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonElasticTranscoderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Elastic Transcoder (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonElasticTranscoderClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonElasticTranscoderClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Elastic Transcoder (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonElasticTranscoderClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Elastic
     * Transcoder using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Elastic Transcoder (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonElasticTranscoderClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.ResourceInUseException.class,
                        "ResourceInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.IncompatibleVersionException.class,
                        "IncompatibleVersionException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.AccessDeniedException.class,
                        "AccessDeniedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.ValidationException.class,
                        "ValidationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.InternalServiceException.class,
                        "InternalServiceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.elastictranscoder.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("elastictranscoder.us-east-1.amazonaws.com/");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/elastictranscoder/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/elastictranscoder/request.handler2s"));
    }

    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <note>You can only cancel a job that has a status of
     * <code>Submitted</code>. To prevent a pipeline from starting to process a
     * job while you're getting the job identifier, use
     * <a>UpdatePipelineStatus</a> to temporarily pause the pipeline.</note>
     * 
     * @param cancelJobRequest
     *        The <code>CancelJobRequest</code> structure.
     * @return Result of the CancelJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example,
     *         you are attempting to delete a pipeline that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CancelJob
     */
    @Override
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestMarshaller().marshall(super
                        .beforeMarshalling(cancelJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CancelJobResult> responseHandler = new JsonResponseHandler<CancelJobResult>(
                    new CancelJobResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that includes
     * the values that you specified plus information about the job that is
     * created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example,
     * one output for the Kindle Fire and another output for the Apple iPhone
     * 4s), you currently must use the Elastic Transcoder API to list the jobs
     * (as opposed to the AWS Console).
     * </p>
     * 
     * @param createJobRequest
     *        The <code>CreateJobRequest</code> structure.
     * @return Result of the CreateJob operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the
     *         number of pipelines exceeds the maximum allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreateJob
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest createJobRequest) {
        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestMarshaller().marshall(super
                        .beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateJobResult> responseHandler = new JsonResponseHandler<CreateJobResult>(
                    new CreateJobResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you
     * specify.
     * </p>
     * 
     * @param createPipelineRequest
     *        The <code>CreatePipelineRequest</code> structure.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the
     *         number of pipelines exceeds the maximum allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreatePipeline
     */
    @Override
    public CreatePipelineResult createPipeline(
            CreatePipelineRequest createPipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePipelineResult> responseHandler = new JsonResponseHandler<CreatePipelineResult>(
                    new CreatePipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you
     * specify.
     * </p>
     * <important>Elastic Transcoder checks the CreatePreset settings to ensure
     * that they meet Elastic Transcoder requirements and to determine whether
     * they comply with H.264 standards. If your settings are not valid for
     * Elastic Transcoder, Elastic Transcoder returns an HTTP 400 response (
     * <code>ValidationException</code>) and does not create the preset. If the
     * settings are valid for Elastic Transcoder but aren't strictly compliant
     * with the H.264 standard, Elastic Transcoder creates the preset and
     * returns a warning message in the response. This helps you determine
     * whether your settings comply with the H.264 standard while giving you
     * greater flexibility with respect to the video that Elastic Transcoder
     * produces.</important>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i>.
     * </p>
     * 
     * @param createPresetRequest
     *        The <code>CreatePresetRequest</code> structure.
     * @return Result of the CreatePreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws LimitExceededException
     *         Too many operations for a given AWS account. For example, the
     *         number of pipelines exceeds the maximum allowed.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.CreatePreset
     */
    @Override
    public CreatePresetResult createPreset(
            CreatePresetRequest createPresetRequest) {
        ExecutionContext executionContext = createExecutionContext(createPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresetRequest> request = null;
        Response<CreatePresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresetRequestMarshaller().marshall(super
                        .beforeMarshalling(createPresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePresetResult> responseHandler = new JsonResponseHandler<CreatePresetResult>(
                    new CreatePresetResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * You can only delete a pipeline that has never been used or that is not
     * currently in use (doesn't contain any active jobs). If the pipeline is
     * currently in use, <code>DeletePipeline</code> returns an error.
     * </p>
     * 
     * @param deletePipelineRequest
     *        The <code>DeletePipelineRequest</code> structure.
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example,
     *         you are attempting to delete a pipeline that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.DeletePipeline
     */
    @Override
    public DeletePipelineResult deletePipeline(
            DeletePipelineRequest deletePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<DeletePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeletePipelineResult> responseHandler = new JsonResponseHandler<DeletePipelineResult>(
                    new DeletePipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an AWS
     * region.
     * </p>
     * <note>
     * <p>
     * You can't delete the default presets that are included with Elastic
     * Transcoder.
     * </p>
     * </note>
     * 
     * @param deletePresetRequest
     *        The <code>DeletePresetRequest</code> structure.
     * @return Result of the DeletePreset operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.DeletePreset
     */
    @Override
    public DeletePresetResult deletePreset(
            DeletePresetRequest deletePresetRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePresetRequest> request = null;
        Response<DeletePresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePresetRequestMarshaller().marshall(super
                        .beforeMarshalling(deletePresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeletePresetResult> responseHandler = new JsonResponseHandler<DeletePresetResult>(
                    new DeletePresetResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in a
     * pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByPipelineRequest
     *        The <code>ListJobsByPipelineRequest</code> structure.
     * @return Result of the ListJobsByPipeline operation returned by the
     *         service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListJobsByPipeline
     */
    @Override
    public ListJobsByPipelineResult listJobsByPipeline(
            ListJobsByPipelineRequest listJobsByPipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(listJobsByPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsByPipelineRequest> request = null;
        Response<ListJobsByPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsByPipelineRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listJobsByPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListJobsByPipelineResult> responseHandler = new JsonResponseHandler<ListJobsByPipelineResult>(
                    new ListJobsByPipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a specified
     * status. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByStatusRequest
     *        The <code>ListJobsByStatusRequest</code> structure.
     * @return Result of the ListJobsByStatus operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListJobsByStatus
     */
    @Override
    public ListJobsByStatusResult listJobsByStatus(
            ListJobsByStatusRequest listJobsByStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(listJobsByStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsByStatusRequest> request = null;
        Response<ListJobsByStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsByStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listJobsByStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListJobsByStatusResult> responseHandler = new JsonResponseHandler<ListJobsByStatusResult>(
                    new ListJobsByStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated with
     * the current AWS account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        The <code>ListPipelineRequest</code> structure.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListPipelines
     */
    @Override
    public ListPipelinesResult listPipelines(
            ListPipelinesRequest listPipelinesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestMarshaller().marshall(super
                        .beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPipelinesResult> responseHandler = new JsonResponseHandler<ListPipelinesResult>(
                    new ListPipelinesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     * 
     * @param listPresetsRequest
     *        The <code>ListPresetsRequest</code> structure.
     * @return Result of the ListPresets operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ListPresets
     */
    @Override
    public ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPresetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPresetsRequest> request = null;
        Response<ListPresetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPresetsRequestMarshaller().marshall(super
                        .beforeMarshalling(listPresetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPresetsResult> responseHandler = new JsonResponseHandler<ListPresetsResult>(
                    new ListPresetsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadJob
     */
    @Override
    public ReadJobResult readJob(ReadJobRequest readJobRequest) {
        ExecutionContext executionContext = createExecutionContext(readJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReadJobRequest> request = null;
        Response<ReadJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReadJobRequestMarshaller().marshall(super
                        .beforeMarshalling(readJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ReadJobResult> responseHandler = new JsonResponseHandler<ReadJobResult>(
                    new ReadJobResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadPipeline
     */
    @Override
    public ReadPipelineResult readPipeline(
            ReadPipelineRequest readPipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(readPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReadPipelineRequest> request = null;
        Response<ReadPipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReadPipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(readPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ReadPipelineResult> responseHandler = new JsonResponseHandler<ReadPipelineResult>(
                    new ReadPipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.ReadPreset
     */
    @Override
    public ReadPresetResult readPreset(ReadPresetRequest readPresetRequest) {
        ExecutionContext executionContext = createExecutionContext(readPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReadPresetRequest> request = null;
        Response<ReadPresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReadPresetRequestMarshaller().marshall(super
                        .beforeMarshalling(readPresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ReadPresetResult> responseHandler = new JsonResponseHandler<ReadPresetResult>(
                    new ReadPresetResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * The <code>TestRole</code> action lets you determine whether the IAM role
     * you are using has sufficient permissions to let Elastic Transcoder
     * perform tasks associated with the transcoding process. The action
     * attempts to assume the specified IAM role, checks read access to the
     * input and output buckets, and tries to send a test notification to Amazon
     * SNS topics that you specify.
     * </p>
     * 
     * @param testRoleRequest
     *        The <code>TestRoleRequest</code> structure.
     * @return Result of the TestRole operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.TestRole
     */
    @Override
    public TestRoleResult testRole(TestRoleRequest testRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(testRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestRoleRequest> request = null;
        Response<TestRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestRoleRequestMarshaller().marshall(super
                        .beforeMarshalling(testRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<TestRoleResult> responseHandler = new JsonResponseHandler<TestRoleResult>(
                    new TestRoleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for a
     * pipeline. <important>When you change pipeline settings, your changes take
     * effect immediately. Jobs that you have already submitted and that Elastic
     * Transcoder has not started to process are affected in addition to jobs
     * that you submit after you change settings. </important>
     * </p>
     * 
     * @param updatePipelineRequest
     *        The <code>UpdatePipelineRequest</code> structure.
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example,
     *         you are attempting to delete a pipeline that is currently in use.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipeline
     */
    @Override
    public UpdatePipelineResult updatePipeline(
            UpdatePipelineRequest updatePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineRequest> request = null;
        Response<UpdatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(updatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdatePipelineResult> responseHandler = new JsonResponseHandler<UpdatePipelineResult>(
                    new UpdatePipelineResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon
     * Simple Notification Service (Amazon SNS) notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder returns
     * the values that you specified in the request.
     * </p>
     * 
     * @param updatePipelineNotificationsRequest
     *        The <code>UpdatePipelineNotificationsRequest</code> structure.
     * @return Result of the UpdatePipelineNotifications operation returned by
     *         the service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example,
     *         you are attempting to delete a pipeline that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipelineNotifications
     */
    @Override
    public UpdatePipelineNotificationsResult updatePipelineNotifications(
            UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) {
        ExecutionContext executionContext = createExecutionContext(updatePipelineNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineNotificationsRequest> request = null;
        Response<UpdatePipelineNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineNotificationsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updatePipelineNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdatePipelineNotificationsResult> responseHandler = new JsonResponseHandler<UpdatePipelineNotificationsResult>(
                    new UpdatePipelineNotificationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so
     * that the pipeline stops or restarts the processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or more
     * jobs. You can't cancel jobs after Elastic Transcoder has started
     * processing them; if you pause the pipeline to which you submitted the
     * jobs, you have more time to get the job IDs for the jobs that you want to
     * cancel, and to send a <a>CancelJob</a> request.
     * </p>
     * 
     * @param updatePipelineStatusRequest
     *        The <code>UpdatePipelineStatusRequest</code> structure.
     * @return Result of the UpdatePipelineStatus operation returned by the
     *         service.
     * @throws ValidationException
     *         One or more required parameter values were not provided in the
     *         request.
     * @throws IncompatibleVersionException
     * @throws ResourceNotFoundException
     *         The requested resource does not exist or is not available. For
     *         example, the pipeline to which you're trying to add a job doesn't
     *         exist or is still being created.
     * @throws ResourceInUseException
     *         The resource you are attempting to change is in use. For example,
     *         you are attempting to delete a pipeline that is currently in use.
     * @throws AccessDeniedException
     *         General authentication failure. The request was not signed
     *         correctly.
     * @throws InternalServiceException
     *         Elastic Transcoder encountered an unexpected exception while
     *         trying to fulfill the request.
     * @sample AmazonElasticTranscoder.UpdatePipelineStatus
     */
    @Override
    public UpdatePipelineStatusResult updatePipelineStatus(
            UpdatePipelineStatusRequest updatePipelineStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(updatePipelineStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePipelineStatusRequest> request = null;
        Response<UpdatePipelineStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePipelineStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updatePipelineStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdatePipelineStatusResult> responseHandler = new JsonResponseHandler<UpdatePipelineStatusResult>(
                    new UpdatePipelineStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
