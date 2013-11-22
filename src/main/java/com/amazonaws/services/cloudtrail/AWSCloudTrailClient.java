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
package com.amazonaws.services.cloudtrail;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.services.cloudtrail.model.transform.*;


/**
 * Client for accessing AWSCloudTrail.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Cloud Trail <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records AWS API calls for your AWS account and delivers log files to an Amazon S3 bucket. The recorded information
 * includes the identity of the user, the start time of the AWS API call, the source IP address, the request parameters, and the response elements
 * returned by the service.
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various programming
 * languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWSCloudTrail. For
 * example, the SDKs take care of cryptographically signing requests, managing errors, and retrying requests automatically. For information about the AWS
 * SDKs, including how to download and install them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * See the CloudTrail User Guide for information about the data that is included with each AWS API call listed in the log files.
 * </p>
 */
public class AWSCloudTrailClient extends AmazonWebServiceClient implements AWSCloudTrail {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudTrail.class);

    /**
     * List of exception unmarshallers for all AWSCloudTrail exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudTrail.  A credentials provider chain will be used
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
    public AWSCloudTrailClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudTrail.  A credentials provider chain will be used
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
     *                       client connects to AWSCloudTrail
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudTrailClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSCloudTrailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSCloudTrail
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudTrailClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudTrail using the specified AWS account credentials
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
     *                       client connects to AWSCloudTrail
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new TrailAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3BucketNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrailNotProvidedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnsTopicNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3PrefixExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MaximumNumberOfTrailsExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientSnsTopicPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrailNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTrailNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new S3BucketDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientS3BucketPolicyExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudtrail.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudtrail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudtrail/request.handler2s"));

        
    }

    
    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified
     * trail. Fields include information such as delivery errors, Amazon SNS
     * and Amazon S3 errors, and times that logging started and stopped for
     * each trail.
     * </p>
     *
     * @param getTrailStatusRequest Container for the necessary parameters to
     *           execute the GetTrailStatus service method on AWSCloudTrail.
     * 
     * @return The response from the GetTrailStatus service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTrailStatusResult getTrailStatus(GetTrailStatusRequest getTrailStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getTrailStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrailStatusRequest> request = null;
        Response<GetTrailStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrailStatusRequestMarshaller().marshall(getTrailStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTrailStatusResult, JsonUnmarshallerContext> unmarshaller = new GetTrailStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetTrailStatusResult> responseHandler = new JsonResponseHandler<GetTrailStatusResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Deletes a trail.
     * </p>
     *
     * @param deleteTrailRequest Container for the necessary parameters to
     *           execute the DeleteTrail service method on AWSCloudTrail.
     * 
     * @return The response from the DeleteTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTrailResult deleteTrail(DeleteTrailRequest deleteTrailRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrailRequest> request = null;
        Response<DeleteTrailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrailRequestMarshaller().marshall(deleteTrailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTrailResult, JsonUnmarshallerContext> unmarshaller = new DeleteTrailResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTrailResult> responseHandler = new JsonResponseHandler<DeleteTrailResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * From the command line, use create-subscription.
     * </p>
     * <p>
     * Creates a trail that specifies the settings for delivery of log data
     * to an Amazon S3 bucket. The request includes a Trail structure that
     * specifies the following:
     * </p>
     * 
     * <ul>
     * <li>Trail name.</li>
     * <li>The name of an existing Amazon S3 bucket to which CloudTrail
     * delivers your log files.</li>
     * <li>The name of the Amazon S3 key prefix that precedes each log
     * file.</li>
     * <li>The name of an existing Amazon SNS topic that notifies you that a
     * new file is available in your bucket.</li>
     * <li>Whether the log file should include AWS API calls from global
     * services. Currently, the only global AWS API calls included in
     * CloudTrail log files are from IAM and AWS STS.</li>
     * 
     * </ul>
     *
     * @param createTrailRequest Container for the necessary parameters to
     *           execute the CreateTrail service method on AWSCloudTrail.
     * 
     * @return The response from the CreateTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws S3BucketDoesNotExistException
     * @throws InternalErrorException
     * @throws InvalidS3PrefixException
     * @throws InvalidTrailNameException
     * @throws TrailAlreadyExistsException
     * @throws MaximumNumberOfTrailsExceededException
     * @throws InvalidS3BucketNameException
     * @throws TrailNotProvidedException
     * @throws InsufficientSnsTopicPolicyException
     * @throws InvalidSnsTopicNameException
     * @throws InsufficientS3BucketPolicyException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTrailResult createTrail(CreateTrailRequest createTrailRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrailRequest> request = null;
        Response<CreateTrailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrailRequestMarshaller().marshall(createTrailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTrailResult, JsonUnmarshallerContext> unmarshaller = new CreateTrailResultJsonUnmarshaller();
            JsonResponseHandler<CreateTrailResult> responseHandler = new JsonResponseHandler<CreateTrailResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * From the command line, use update-subscription.
     * </p>
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. You use this
     * action to designate an existing bucket for log delivery. If the
     * existing bucket has previously been a target for CloudTrail log files,
     * an IAM policy exists for the bucket. Use a Trail data type to pass
     * updated bucket or topic names.
     * </p>
     *
     * @param updateTrailRequest Container for the necessary parameters to
     *           execute the UpdateTrail service method on AWSCloudTrail.
     * 
     * @return The response from the UpdateTrail service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws S3BucketDoesNotExistException
     * @throws InternalErrorException
     * @throws InvalidS3PrefixException
     * @throws InvalidTrailNameException
     * @throws InvalidS3BucketNameException
     * @throws TrailNotProvidedException
     * @throws InsufficientSnsTopicPolicyException
     * @throws InvalidSnsTopicNameException
     * @throws InsufficientS3BucketPolicyException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTrailResult updateTrail(UpdateTrailRequest updateTrailRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrailRequest> request = null;
        Response<UpdateTrailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrailRequestMarshaller().marshall(updateTrailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTrailResult, JsonUnmarshallerContext> unmarshaller = new UpdateTrailResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTrailResult> responseHandler = new JsonResponseHandler<UpdateTrailResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
     * </p>
     *
     * @param describeTrailsRequest Container for the necessary parameters to
     *           execute the DescribeTrails service method on AWSCloudTrail.
     * 
     * @return The response from the DescribeTrails service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrailsResult describeTrails(DescribeTrailsRequest describeTrailsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrailsRequest> request = null;
        Response<DescribeTrailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrailsRequestMarshaller().marshall(describeTrailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrailsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrailsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrailsResult> responseHandler = new JsonResponseHandler<DescribeTrailsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the
     * specified trail. Under most circumstances, there is no need to use
     * this action. You can update a trail without stopping it first. This
     * action is the only way to stop recording.
     * </p>
     *
     * @param stopLoggingRequest Container for the necessary parameters to
     *           execute the StopLogging service method on AWSCloudTrail.
     * 
     * @return The response from the StopLogging service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopLoggingResult stopLogging(StopLoggingRequest stopLoggingRequest) {
        ExecutionContext executionContext = createExecutionContext(stopLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopLoggingRequest> request = null;
        Response<StopLoggingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopLoggingRequestMarshaller().marshall(stopLoggingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopLoggingResult, JsonUnmarshallerContext> unmarshaller = new StopLoggingResultJsonUnmarshaller();
            JsonResponseHandler<StopLoggingResult> responseHandler = new JsonResponseHandler<StopLoggingResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a
     * trail.
     * </p>
     *
     * @param startLoggingRequest Container for the necessary parameters to
     *           execute the StartLogging service method on AWSCloudTrail.
     * 
     * @return The response from the StartLogging service method, as returned
     *         by AWSCloudTrail.
     * 
     * @throws S3BucketDoesNotExistException
     * @throws InternalErrorException
     * @throws InvalidTrailNameException
     * @throws InsufficientSnsTopicPolicyException
     * @throws InsufficientS3BucketPolicyException
     * @throws TrailNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StartLoggingResult startLogging(StartLoggingRequest startLoggingRequest) {
        ExecutionContext executionContext = createExecutionContext(startLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLoggingRequest> request = null;
        Response<StartLoggingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLoggingRequestMarshaller().marshall(startLoggingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartLoggingResult, JsonUnmarshallerContext> unmarshaller = new StartLoggingResultJsonUnmarshaller();
            JsonResponseHandler<StartLoggingResult> responseHandler = new JsonResponseHandler<StartLoggingResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

   
    /**
     * <p>
     * Retrieves the settings for some or all trails associated with an
     * account. Returns a list of Trail structures in JSON format.
     * </p>
     * 
     * @return The response from the DescribeTrails service method, as
     *         returned by AWSCloudTrail.
     * 
     * @throws InternalErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudTrail indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrailsResult describeTrails() throws AmazonServiceException, AmazonClientException {
        return describeTrails(new DescribeTrailsRequest());
    }
    

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);

        
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);

        
    }

    
    @Override
    protected String getServiceAbbreviation() {
        return "cloudtrail";
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

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
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

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);

        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        awsRequestMetrics.log();
        return result;
    }
}
        