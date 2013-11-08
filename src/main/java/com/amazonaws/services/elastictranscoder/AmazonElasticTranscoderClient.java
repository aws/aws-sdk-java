/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.services.elastictranscoder.model.transform.*;


/**
 * Client for accessing AmazonElasticTranscoder.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Elastic Transcoder Service <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
public class AmazonElasticTranscoderClient extends AmazonWebServiceClient implements AmazonElasticTranscoder {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticTranscoder.class);

    /**
     * List of exception unmarshallers for all AmazonElasticTranscoder exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticTranscoder.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticTranscoderClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticTranscoder.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticTranscoder
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonElasticTranscoderClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonElasticTranscoderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticTranscoder
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticTranscoderClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonElasticTranscoderClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonElasticTranscoder using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonElasticTranscoder
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonElasticTranscoderClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ValidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IncompatibleVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("elastictranscoder.us-east-1.amazonaws.com/");

        signer = new AWS4Signer();
        
        signer.setServiceName("elastictranscoder");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elastictranscoder/request.handlers"));

        
    }

    
    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline,
     * so that the pipeline stops or restarts the processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or
     * more jobs. You can't cancel jobs after Elastic Transcoder has started
     * processing them; if you pause the pipeline to which you submitted the
     * jobs, you have more time to get the job IDs for the jobs that you want
     * to cancel, and to send a CancelJob request.
     * </p>
     *
     * @param updatePipelineStatusRequest Container for the necessary
     *           parameters to execute the UpdatePipelineStatus service method on
     *           AmazonElasticTranscoder.
     * 
     * @return The response from the UpdatePipelineStatus service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdatePipelineStatusResult updatePipelineStatus(UpdatePipelineStatusRequest updatePipelineStatusRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(updatePipelineStatusRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdatePipelineStatusRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdatePipelineStatusRequestMarshaller().marshall(updatePipelineStatusRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<UpdatePipelineStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdatePipelineStatusResultJsonUnmarshaller();

        JsonResponseHandler<UpdatePipelineStatusResult> responseHandler = new JsonResponseHandler<UpdatePipelineStatusResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon
     * Simple Notification Service (Amazon SNS) notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder
     * returns the values that you specified in the request.
     * </p>
     *
     * @param updatePipelineNotificationsRequest Container for the necessary
     *           parameters to execute the UpdatePipelineNotifications service method
     *           on AmazonElasticTranscoder.
     * 
     * @return The response from the UpdatePipelineNotifications service
     *         method, as returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdatePipelineNotificationsResult updatePipelineNotifications(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(updatePipelineNotificationsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdatePipelineNotificationsRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdatePipelineNotificationsRequestMarshaller().marshall(updatePipelineNotificationsRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<UpdatePipelineNotificationsResult, JsonUnmarshallerContext> unmarshaller = new UpdatePipelineNotificationsResultJsonUnmarshaller();

        JsonResponseHandler<UpdatePipelineNotificationsResult> responseHandler = new JsonResponseHandler<UpdatePipelineNotificationsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     *
     * @param readJobRequest Container for the necessary parameters to
     *           execute the ReadJob service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ReadJob service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReadJobResult readJob(ReadJobRequest readJobRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(readJobRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReadJobRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ReadJobRequestMarshaller().marshall(readJobRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ReadJobResult, JsonUnmarshallerContext> unmarshaller = new ReadJobResultJsonUnmarshaller();

        JsonResponseHandler<ReadJobResult> responseHandler = new JsonResponseHandler<ReadJobResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a
     * specified status. The response body contains one element for each job
     * that satisfies the search criteria.
     * </p>
     *
     * @param listJobsByStatusRequest Container for the necessary parameters
     *           to execute the ListJobsByStatus service method on
     *           AmazonElasticTranscoder.
     * 
     * @return The response from the ListJobsByStatus service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsByStatusResult listJobsByStatus(ListJobsByStatusRequest listJobsByStatusRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(listJobsByStatusRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListJobsByStatusRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ListJobsByStatusRequestMarshaller().marshall(listJobsByStatusRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ListJobsByStatusResult, JsonUnmarshallerContext> unmarshaller = new ListJobsByStatusResultJsonUnmarshaller();

        JsonResponseHandler<ListJobsByStatusResult> responseHandler = new JsonResponseHandler<ListJobsByStatusResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     *
     * @param readPresetRequest Container for the necessary parameters to
     *           execute the ReadPreset service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ReadPreset service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReadPresetResult readPreset(ReadPresetRequest readPresetRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(readPresetRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReadPresetRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ReadPresetRequestMarshaller().marshall(readPresetRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ReadPresetResult, JsonUnmarshallerContext> unmarshaller = new ReadPresetResultJsonUnmarshaller();

        JsonResponseHandler<ReadPresetResult> responseHandler = new JsonResponseHandler<ReadPresetResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you
     * specify.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CreatePipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreatePipelineRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreatePipelineRequestMarshaller().marshall(createPipelineRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CreatePipelineResult, JsonUnmarshallerContext> unmarshaller = new CreatePipelineResultJsonUnmarshaller();

        JsonResponseHandler<CreatePipelineResult> responseHandler = new JsonResponseHandler<CreatePipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <p>
     * <b>NOTE:</b>You can only cancel a job that has a status of Submitted.
     * To prevent a pipeline from starting to process a job while you're
     * getting the job identifier, use UpdatePipelineStatus to temporarily
     * pause the pipeline.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CancelJob service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CancelJobRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CancelJobRequestMarshaller().marshall(cancelJobRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CancelJobResult, JsonUnmarshallerContext> unmarshaller = new CancelJobResultJsonUnmarshaller();

        JsonResponseHandler<CancelJobResult> responseHandler = new JsonResponseHandler<CancelJobResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for
     * a pipeline. <p>
     * <b>IMPORTANT:</b>When you change pipeline settings, your changes take
     * effect immediately. Jobs that you have already submitted and that
     * Elastic Transcoder has not started to process are affected in addition
     * to jobs that you submit after you change settings.
     * </p>
     * 
     * </p>
     *
     * @param updatePipelineRequest Container for the necessary parameters to
     *           execute the UpdatePipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the UpdatePipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest updatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(updatePipelineRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdatePipelineRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdatePipelineRequestMarshaller().marshall(updatePipelineRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<UpdatePipelineResult, JsonUnmarshallerContext> unmarshaller = new UpdatePipelineResultJsonUnmarshaller();

        JsonResponseHandler<UpdatePipelineResult> responseHandler = new JsonResponseHandler<UpdatePipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     *
     * @param listPresetsRequest Container for the necessary parameters to
     *           execute the ListPresets service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ListPresets service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPresetsResult listPresets(ListPresetsRequest listPresetsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(listPresetsRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListPresetsRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ListPresetsRequestMarshaller().marshall(listPresetsRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ListPresetsResult, JsonUnmarshallerContext> unmarshaller = new ListPresetsResultJsonUnmarshaller();

        JsonResponseHandler<ListPresetsResult> responseHandler = new JsonResponseHandler<ListPresetsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is
     * not currently in use (doesn't contain any active jobs). If the
     * pipeline is currently in use, <code>DeletePipeline</code> returns an
     * error.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the DeletePipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ResourceInUseException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePipelineRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeletePipelineRequestMarshaller().marshall(deletePipelineRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DeletePipelineResult, JsonUnmarshallerContext> unmarshaller = new DeletePipelineResultJsonUnmarshaller();

        JsonResponseHandler<DeletePipelineResult> responseHandler = new JsonResponseHandler<DeletePipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM
     * role you are using has sufficient permissions to let Elastic
     * Transcoder perform tasks associated with the transcoding process. The
     * action attempts to assume the specified IAM role, checks read access
     * to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     *
     * @param testRoleRequest Container for the necessary parameters to
     *           execute the TestRole service method on AmazonElasticTranscoder.
     * 
     * @return The response from the TestRole service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TestRoleResult testRole(TestRoleRequest testRoleRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(testRoleRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<TestRoleRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new TestRoleRequestMarshaller().marshall(testRoleRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<TestRoleResult, JsonUnmarshallerContext> unmarshaller = new TestRoleResultJsonUnmarshaller();

        JsonResponseHandler<TestRoleResult> responseHandler = new JsonResponseHandler<TestRoleResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated
     * with the current AWS account.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ListPipelines service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListPipelinesRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ListPipelinesRequestMarshaller().marshall(listPipelinesRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ListPipelinesResult, JsonUnmarshallerContext> unmarshaller = new ListPipelinesResultJsonUnmarshaller();

        JsonResponseHandler<ListPipelinesResult> responseHandler = new JsonResponseHandler<ListPipelinesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     *
     * @param readPipelineRequest Container for the necessary parameters to
     *           execute the ReadPipeline service method on AmazonElasticTranscoder.
     * 
     * @return The response from the ReadPipeline service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReadPipelineResult readPipeline(ReadPipelineRequest readPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(readPipelineRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReadPipelineRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ReadPipelineRequestMarshaller().marshall(readPipelineRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ReadPipelineResult, JsonUnmarshallerContext> unmarshaller = new ReadPipelineResultJsonUnmarshaller();

        JsonResponseHandler<ReadPipelineResult> responseHandler = new JsonResponseHandler<ReadPipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you
     * specify.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Elastic Transcoder checks the CreatePreset settings
     * to ensure that they meet Elastic Transcoder requirements and to
     * determine whether they comply with H.264 standards. If your settings
     * are not valid for Elastic Transcoder, Elastic Transcoder returns an
     * HTTP 400 response (ValidationException) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't
     * strictly compliant with the H.264 standard, Elastic Transcoder creates
     * the preset and returns a warning message in the response. This helps
     * you determine whether your settings comply with the H.264 standard
     * while giving you greater flexibility with respect to the video that
     * Elastic Transcoder produces.
     * </p>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more
     * information, see the International Telecommunication Union publication
     * <i>Recommendation ITU-T H.264: Advanced video coding for generic
     * audiovisual services</i> .
     * </p>
     *
     * @param createPresetRequest Container for the necessary parameters to
     *           execute the CreatePreset service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CreatePreset service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePresetResult createPreset(CreatePresetRequest createPresetRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createPresetRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreatePresetRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreatePresetRequestMarshaller().marshall(createPresetRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CreatePresetResult, JsonUnmarshallerContext> unmarshaller = new CreatePresetResultJsonUnmarshaller();

        JsonResponseHandler<CreatePresetResult> responseHandler = new JsonResponseHandler<CreatePresetResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an
     * AWS region.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't delete the default presets that are included
     * with Elastic Transcoder.
     * </p>
     *
     * @param deletePresetRequest Container for the necessary parameters to
     *           execute the DeletePreset service method on AmazonElasticTranscoder.
     * 
     * @return The response from the DeletePreset service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeletePresetResult deletePreset(DeletePresetRequest deletePresetRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(deletePresetRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePresetRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeletePresetRequestMarshaller().marshall(deletePresetRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<DeletePresetResult, JsonUnmarshallerContext> unmarshaller = new DeletePresetResultJsonUnmarshaller();

        JsonResponseHandler<DeletePresetResult> responseHandler = new JsonResponseHandler<DeletePresetResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that
     * includes the values that you specified plus information about the job
     * that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example,
     * one output for the Kindle Fire and another output for the Apple iPhone
     * 4s), you currently must use the Elastic Transcoder API to list the
     * jobs (as opposed to the AWS Console).
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob service method on AmazonElasticTranscoder.
     * 
     * @return The response from the CreateJob service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(createJobRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateJobRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreateJobRequestMarshaller().marshall(createJobRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<CreateJobResult, JsonUnmarshallerContext> unmarshaller = new CreateJobResultJsonUnmarshaller();

        JsonResponseHandler<CreateJobResult> responseHandler = new JsonResponseHandler<CreateJobResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in
     * a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified
     * pipeline. The response body contains one element for each job that
     * satisfies the search criteria.
     * </p>
     *
     * @param listJobsByPipelineRequest Container for the necessary
     *           parameters to execute the ListJobsByPipeline service method on
     *           AmazonElasticTranscoder.
     * 
     * @return The response from the ListJobsByPipeline service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsByPipelineResult listJobsByPipeline(ListJobsByPipelineRequest listJobsByPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext(listJobsByPipelineRequest);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListJobsByPipelineRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ListJobsByPipelineRequestMarshaller().marshall(listJobsByPipelineRequest);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }

        Unmarshaller<ListJobsByPipelineResult, JsonUnmarshallerContext> unmarshaller = new ListJobsByPipelineResultJsonUnmarshaller();

        JsonResponseHandler<ListJobsByPipelineResult> responseHandler = new JsonResponseHandler<ListJobsByPipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }

   
    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included
     * with Elastic Transcoder and the presets that you've added in an AWS
     * region.
     * </p>
     * 
     * @return The response from the ListPresets service method, as returned
     *         by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPresetsResult listPresets() throws AmazonServiceException, AmazonClientException {
        return listPresets(new ListPresetsRequest());
    }
    
    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM
     * role you are using has sufficient permissions to let Elastic
     * Transcoder perform tasks associated with the transcoding process. The
     * action attempts to assume the specified IAM role, checks read access
     * to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     * 
     * @return The response from the TestRole service method, as returned by
     *         AmazonElasticTranscoder.
     * 
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TestRoleResult testRole() throws AmazonServiceException, AmazonClientException {
        return testRole(new TestRoleRequest());
    }
    
    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated
     * with the current AWS account.
     * </p>
     * 
     * @return The response from the ListPipelines service method, as
     *         returned by AmazonElasticTranscoder.
     * 
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws ValidationException
     * @throws IncompatibleVersionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticTranscoder indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPipelinesResult listPipelines() throws AmazonServiceException, AmazonClientException {
        return listPipelines(new ListPipelinesRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("https://elastictranscoder.us-east-1.amazonaws.com/") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "elastictranscoder.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://elastictranscoder.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "elastictranscoder.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://elastictranscoder.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     * @see AmazonDynamoDB#setRegion(Region)
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "elastictranscoder";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                                HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
                                                                ExecutionContext executionContext) throws AmazonClientException {

        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);

        
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        X result = (X) client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        awsRequestMetrics.log();
        return result;
    }
}
        