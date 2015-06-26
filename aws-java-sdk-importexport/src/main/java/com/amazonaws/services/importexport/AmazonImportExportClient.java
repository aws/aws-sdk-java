/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.importexport.model.*;
import com.amazonaws.services.importexport.model.transform.*;

/**
 * Client for accessing AWS Import/Export. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Import/Export Service</fullname> AWS Import/Export accelerates
 * transferring large amounts of data between the AWS cloud and portable storage
 * devices that you mail to us. AWS Import/Export transfers data directly onto
 * and off of your storage devices using Amazon's high-speed internal network
 * and bypassing the Internet. For large data sets, AWS Import/Export is often
 * faster than Internet transfer and more cost effective than upgrading your
 * connectivity.
 */
public class AmazonImportExportClient extends AmazonWebServiceClient implements
        AmazonImportExport {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonImportExport.class);

    /**
     * List of exception unmarshallers for all AWS Import/Export exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonImportExportClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *        connects to AWS Import/Export (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonImportExportClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonImportExportClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export
     * using the specified AWS account credentials and client configuration
     * options.
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
     *        connects to AWS Import/Export (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonImportExportClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonImportExportClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *        connects to AWS Import/Export (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonImportExportClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Import/Export
     * using the specified AWS account credentials provider, client
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
     *        connects to AWS Import/Export (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonImportExportClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration),
                requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new BucketPermissionExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidManifestFieldExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new MissingManifestFieldExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new MalformedManifestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ExpiredJobIdExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidFileSystemExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new UnableToCancelJobIdExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new UnableToUpdateJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingParameterExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidAccessKeyIdExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new CreateJobQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingCustomsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAddressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchBucketExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCustomsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CanceledJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MultipleRegionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://importexport.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/importexport/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/importexport/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(
            ClientConfiguration orig) {
        ClientConfiguration config = orig;
        return config;
    }

    /**
     * This operation cancels a specified job. Only the job owner can cancel it.
     * The operation fails if the job has already started or is complete.
     * 
     * @param cancelJobRequest
     *        Input structure for the CancelJob operation.
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS
     *         account.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws UnableToCancelJobIdException
     *         AWS Import/Export cannot cancel the job
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the
     *         manifest's accessKeyId value. The manifest and the request
     *         authentication must use the same AWS Access Key ID.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
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
                request = new CancelJobRequestMarshaller()
                        .marshall(cancelJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CancelJobResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * This operation initiates the process of scheduling an upload or download
     * of your data. You include in the request a manifest that describes the
     * data transfer specifics. The response to the request includes a job ID,
     * which you can use in other operations, a signature that you use to
     * identify your storage device, and the address where you should ship your
     * storage device.
     * 
     * @param createJobRequest
     *        Input structure for the CreateJob operation.
     * @return Result of the CreateJob operation returned by the service.
     * @throws MissingParameterException
     *         One or more required parameters was missing from the request.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the
     *         manifest's accessKeyId value. The manifest and the request
     *         authentication must use the same AWS Access Key ID.
     * @throws InvalidAddressException
     *         The address specified in the manifest is invalid.
     * @throws InvalidManifestFieldException
     *         One or more manifest fields was invalid. Please correct and
     *         resubmit.
     * @throws MissingManifestFieldException
     *         One or more required fields were missing from the manifest file.
     *         Please correct and resubmit.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist. Create the specified bucket
     *         or change the manifest's bucket, exportBucket, or logBucket field
     *         to a bucket that the account, as specified by the manifest's
     *         Access Key ID, has write permissions to.
     * @throws MissingCustomsException
     *         One or more required customs parameters was missing from the
     *         manifest.
     * @throws InvalidCustomsException
     *         One or more customs parameters was invalid. Please correct and
     *         resubmit.
     * @throws InvalidFileSystemException
     *         File system specified in export manifest is invalid.
     * @throws MultipleRegionsException
     *         Your manifest file contained buckets from multiple regions. A job
     *         is restricted to buckets from one region. Please correct and
     *         resubmit.
     * @throws BucketPermissionException
     *         The account specified does not have the appropriate bucket
     *         permissions.
     * @throws MalformedManifestException
     *         Your manifest is not well-formed.
     * @throws CreateJobQuotaExceededException
     *         Each account can create only a certain number of jobs per day. If
     *         you need to create more than this, please contact
     *         awsimportexport@amazon.com to explain your particular use case.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS
     *         account.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
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
                request = new CreateJobRequestMarshaller()
                        .marshall(createJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateJobResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * This operation generates a pre-paid UPS shipping label that you will use
     * to ship your device to AWS for processing.
     * 
     * @param getShippingLabelRequest
     *        null
     * @return Result of the GetShippingLabel operation returned by the service.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS
     *         account.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the
     *         manifest's accessKeyId value. The manifest and the request
     *         authentication must use the same AWS Access Key ID.
     * @throws InvalidAddressException
     *         The address specified in the manifest is invalid.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     */
    @Override
    public GetShippingLabelResult getShippingLabel(
            GetShippingLabelRequest getShippingLabelRequest) {
        ExecutionContext executionContext = createExecutionContext(getShippingLabelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetShippingLabelRequest> request = null;
        Response<GetShippingLabelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetShippingLabelRequestMarshaller()
                        .marshall(getShippingLabelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request,
                    new GetShippingLabelResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * This operation returns information about a job, including where the job
     * is in the processing pipeline, the status of the results, and the
     * signature value associated with the job. You can only return information
     * about jobs you own.
     * 
     * @param getStatusRequest
     *        Input structure for the GetStatus operation.
     * @return Result of the GetStatus operation returned by the service.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS
     *         account.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the
     *         manifest's accessKeyId value. The manifest and the request
     *         authentication must use the same AWS Access Key ID.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     */
    @Override
    public GetStatusResult getStatus(GetStatusRequest getStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStatusRequest> request = null;
        Response<GetStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStatusRequestMarshaller()
                        .marshall(getStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetStatusResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on the
     * date of creation. For example if Job Test1 was created 2009Dec30 and Test2
     * was created 2010Feb05, the ListJobs operation would return Test2 followed
     * by Test1.
     * 
     * @param listJobsRequest
     *        Input structure for the ListJobs operation.
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the
     *         manifest's accessKeyId value. The manifest and the request
     *         authentication must use the same AWS Access Key ID.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestMarshaller()
                        .marshall(listJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListJobsResultStaxUnmarshaller(),
                    executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListJobsResult listJobs() {
        return listJobs(new ListJobsRequest());
    }

    /**
     * You use this operation to change the parameters specified in the original
     * manifest file by supplying a new manifest file. The manifest file
     * attached to this request replaces the original manifest file. You can only
     * use the operation after a CreateJob request but before the data transfer
     * starts and you can only use it on jobs you own.
     * 
     * @param updateJobRequest
     *        Input structure for the UpateJob operation.
     * @return Result of the UpdateJob operation returned by the service.
     * @throws MissingParameterException
     *         One or more required parameters was missing from the request.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the
     *         manifest's accessKeyId value. The manifest and the request
     *         authentication must use the same AWS Access Key ID.
     * @throws InvalidAddressException
     *         The address specified in the manifest is invalid.
     * @throws InvalidManifestFieldException
     *         One or more manifest fields was invalid. Please correct and
     *         resubmit.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS
     *         account.
     * @throws MissingManifestFieldException
     *         One or more required fields were missing from the manifest file.
     *         Please correct and resubmit.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist. Create the specified bucket
     *         or change the manifest's bucket, exportBucket, or logBucket field
     *         to a bucket that the account, as specified by the manifest's
     *         Access Key ID, has write permissions to.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws MissingCustomsException
     *         One or more required customs parameters was missing from the
     *         manifest.
     * @throws InvalidCustomsException
     *         One or more customs parameters was invalid. Please correct and
     *         resubmit.
     * @throws InvalidFileSystemException
     *         File system specified in export manifest is invalid.
     * @throws MultipleRegionsException
     *         Your manifest file contained buckets from multiple regions. A job
     *         is restricted to buckets from one region. Please correct and
     *         resubmit.
     * @throws BucketPermissionException
     *         The account specified does not have the appropriate bucket
     *         permissions.
     * @throws MalformedManifestException
     *         Your manifest is not well-formed.
     * @throws UnableToUpdateJobIdException
     *         AWS Import/Export cannot update the job
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     */
    @Override
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) {
        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestMarshaller()
                        .marshall(updateJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UpdateJobResultStaxUnmarshaller(),
                    executionContext);

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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
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

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(
                unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
