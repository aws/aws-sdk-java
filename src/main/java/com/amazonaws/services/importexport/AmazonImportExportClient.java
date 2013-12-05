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
package com.amazonaws.services.importexport;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.importexport.model.*;
import com.amazonaws.services.importexport.model.transform.*;


/**
 * Client for accessing AmazonImportExport.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Import/Export Service <p>
 * AWS Import/Export accelerates transferring large amounts of data between the AWS cloud and portable storage devices that you mail to us. AWS
 * Import/Export transfers data directly onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For
 * large data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your connectivity.
 * </p>
 */
public class AmazonImportExportClient extends AmazonWebServiceClient implements AmazonImportExport {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonImportExport exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport.  A credentials provider chain will be used
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
    public AmazonImportExportClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport.  A credentials provider chain will be used
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
     *                       client connects to AmazonImportExport
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonImportExportClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonImportExportClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImportExport
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonImportExportClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonImportExportClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport using the specified AWS account credentials
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
     *                       client connects to AmazonImportExport
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonImportExportClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new BucketPermissionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFileSystemExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingCustomsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ExpiredJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidManifestFieldExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingManifestFieldExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedManifestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAddressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MultipleRegionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnableToCancelJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CanceledJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchBucketExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAccessKeyIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCustomsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("importexport.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/importexport/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/importexport/request.handler2s"));
    }

    
    /**
     * <p>
     * This operation initiates the process of scheduling an upload or
     * download of your data. You include in the request a manifest that
     * describes the data transfer specifics. The response to the request
     * includes a job ID, which you can use in other operations, a signature
     * that you use to identify your storage device, and the address where
     * you should ship your storage device.
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob service method on AmazonImportExport.
     * 
     * @return The response from the CreateJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws MalformedManifestException
     * @throws InvalidAddressException
     * @throws BucketPermissionException
     * @throws InvalidParameterException
     * @throws MultipleRegionsException
     * @throws MissingParameterException
     * @throws InvalidFileSystemException
     * @throws MissingCustomsException
     * @throws NoSuchBucketException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidManifestFieldException
     * @throws InvalidCustomsException
     * @throws MissingManifestFieldException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest) {
        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateJobRequestMarshaller().marshall(createJobRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateJobResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * This operation cancels a specified job. Only the job owner can cancel
     * it. The operation fails if the job has already started or is complete.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob service method on AmazonImportExport.
     * 
     * @return The response from the CancelJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     * @throws UnableToCancelJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CancelJobRequestMarshaller().marshall(cancelJobRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CancelJobResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * This operation returns information about a job, including where the
     * job is in the processing pipeline, the status of the results, and the
     * signature value associated with the job. You can only return
     * information about jobs you own.
     * </p>
     *
     * @param getStatusRequest Container for the necessary parameters to
     *           execute the GetStatus service method on AmazonImportExport.
     * 
     * @return The response from the GetStatus service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStatusResult getStatus(GetStatusRequest getStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetStatusRequest> request = null;
        Response<GetStatusResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetStatusRequestMarshaller().marshall(getStatusRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetStatusResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on
     * the date of creation. For example if Job Test1 was created 2009Dec30
     * and Test2 was created 2010Feb05, the ListJobs operation would return
     * Test2 followed by Test1.
     * </p>
     *
     * @param listJobsRequest Container for the necessary parameters to
     *           execute the ListJobs service method on AmazonImportExport.
     * 
     * @return The response from the ListJobs service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListJobsRequestMarshaller().marshall(listJobsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListJobsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * You use this operation to change the parameters specified in the
     * original manifest file by supplying a new manifest file. The manifest
     * file attached to this request replaces the original manifest file. You
     * can only use the operation after a CreateJob request but before the
     * data transfer starts and you can only use it on jobs you own.
     * </p>
     *
     * @param updateJobRequest Container for the necessary parameters to
     *           execute the UpdateJob service method on AmazonImportExport.
     * 
     * @return The response from the UpdateJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws MalformedManifestException
     * @throws BucketPermissionException
     * @throws InvalidAddressException
     * @throws InvalidParameterException
     * @throws MultipleRegionsException
     * @throws MissingParameterException
     * @throws InvalidFileSystemException
     * @throws CanceledJobIdException
     * @throws MissingCustomsException
     * @throws NoSuchBucketException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidCustomsException
     * @throws InvalidManifestFieldException
     * @throws MissingManifestFieldException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) {
        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateJobRequestMarshaller().marshall(updateJobRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateJobResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on
     * the date of creation. For example if Job Test1 was created 2009Dec30
     * and Test2 was created 2010Feb05, the ListJobs operation would return
     * Test2 followed by Test1.
     * </p>
     * 
     * @return The response from the ListJobs service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs() throws AmazonServiceException, AmazonClientException {
        return listJobs(new ListJobsRequest());
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        