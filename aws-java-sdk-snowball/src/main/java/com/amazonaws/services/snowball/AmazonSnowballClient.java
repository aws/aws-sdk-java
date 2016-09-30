/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball;

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
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.services.snowball.model.transform.*;

/**
 * Client for accessing Amazon Snowball. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Import/Export Snowball is a petabyte-scale data transport solution that uses secure appliances to transfer large
 * amounts of data between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The Snowball
 * commands described here provide access to the same functionality that is available in the AWS Snowball Management
 * Console, which enables you to create and manage jobs for Snowball. To transfer data locally with a Snowball
 * appliance, you'll need to use the Snowball client or the Amazon S3 API adapter for Snowball. For more information,
 * see the <a href="http://docs.aws.amazon.com/AWSImportExport/latest/ug/api-reference.html">User Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonSnowballClient extends AmazonWebServiceClient implements AmazonSnowball {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSnowball.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "snowball";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UnsupportedAddressException").withModeledClass(
                            com.amazonaws.services.snowball.model.UnsupportedAddressException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidJobStateException").withModeledClass(
                            com.amazonaws.services.snowball.model.InvalidJobStateException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidResourceException").withModeledClass(
                            com.amazonaws.services.snowball.model.InvalidResourceException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("KMSRequestFailedException").withModeledClass(
                            com.amazonaws.services.snowball.model.KMSRequestFailedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidAddressException").withModeledClass(
                            com.amazonaws.services.snowball.model.InvalidAddressException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.snowball.model.AmazonSnowballException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball. A credentials provider chain will be used
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
     */
    public AmazonSnowballClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSnowballClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AmazonSnowballClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AmazonSnowballClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AmazonSnowballClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AmazonSnowballClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonSnowballClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSnowballClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("snowball.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/snowball/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/snowball/request.handler2s"));
    }

    /**
     * <p>
     * Cancels the specified job. Note that you can only cancel a job before its <code>JobState</code> value changes to
     * <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action will
     * return a job's <code>JobState</code> as part of the response element data returned.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @sample AmazonSnowball.CancelJob
     */
    @Override
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates an address for a Snowball to be shipped to.
     * </p>
     * <p>
     * Addresses are validated at the time of creation. The address you provide must be located within the serviceable
     * area of your region. If the address is invalid or unsupported, then an exception is thrown.
     * </p>
     * 
     * @param createAddressRequest
     * @return Result of the CreateAddress operation returned by the service.
     * @throws InvalidAddressException
     *         The address provided was invalid. Check the address with your region's carrier, and try again.
     * @throws UnsupportedAddressException
     *         The address is either outside the serviceable area for your region, or an error occurred. Check the
     *         address with your region's carrier and try again. If the issue persists, contact AWS Support.
     * @sample AmazonSnowball.CreateAddress
     */
    @Override
    public CreateAddressResult createAddress(CreateAddressRequest createAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(createAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddressRequest> request = null;
        Response<CreateAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddressRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Note that your AWS
     * account must have the right trust policies and permissions in place to create a job for Snowball. For more
     * information, see <a>api-reference-policies</a>.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @sample AmazonSnowball.CreateJob
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest createJobRequest) {
        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Takes an <code>AddressId</code> and returns specific details about that address in the form of an
     * <code>Address</code> object.
     * </p>
     * 
     * @param describeAddressRequest
     * @return Result of the DescribeAddress operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeAddress
     */
    @Override
    public DescribeAddressResult describeAddress(DescribeAddressRequest describeAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressRequest> request = null;
        Response<DescribeAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return
     * addresses from the list of all addresses associated with this account in all US regions.
     * </p>
     * 
     * @param describeAddressesRequest
     * @return Result of the DescribeAddresses operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeAddresses
     */
    @Override
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressesRequest> request = null;
        Response<DescribeAddressesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAddressesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAddressesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAddressesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific job including shipping information, job status, and other important
     * metadata.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeJob
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest describeJobRequest) {
        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified
     * <code>JobId</code> value. You can access the manifest file for up to 60 minutes after this request has been made.
     * To access the manifest file after 60 minutes have passed, you'll have to make another call to the
     * <code>GetJobManifest</code> action.
     * </p>
     * <p>
     * The manifest is an encrypted file that you can download after your job enters the <code>WithCustomer</code>
     * status. The manifest is decrypted by using the <code>UnlockCode</code> code value, when you pass both values to
     * the Snowball through the Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of an <code>UnlockCode</code> value in the same
     * location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from
     * gaining access to the Snowball associated with that job.
     * </p>
     * <p>
     * Note that the credentials of a given job, including its manifest file and unlock code, expire 90 days after the
     * job is created.
     * </p>
     * 
     * @param getJobManifestRequest
     * @return Result of the GetJobManifest operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @sample AmazonSnowball.GetJobManifest
     */
    @Override
    public GetJobManifestResult getJobManifest(GetJobManifestRequest getJobManifestRequest) {
        ExecutionContext executionContext = createExecutionContext(getJobManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobManifestRequest> request = null;
        Response<GetJobManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobManifestRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <code>UnlockCode</code> code value for the specified job. A particular <code>UnlockCode</code> value
     * can be accessed for up to 90 days after the associated job has been created.
     * </p>
     * <p>
     * The <code>UnlockCode</code> value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
     * is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
     * Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of the <code>UnlockCode</code> in the same location
     * as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
     * to the Snowball associated with that job.
     * </p>
     * 
     * @param getJobUnlockCodeRequest
     * @return Result of the GetJobUnlockCode operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @sample AmazonSnowball.GetJobUnlockCode
     */
    @Override
    public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest getJobUnlockCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(getJobUnlockCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobUnlockCodeRequest> request = null;
        Response<GetJobUnlockCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobUnlockCodeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobUnlockCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobUnlockCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobUnlockCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your
     * account has in use.
     * </p>
     * <p>
     * Note that the default service limit for the number of Snowballs that you can have at one time is 1. If you want
     * to increase your service limit, contact AWS Support.
     * </p>
     * 
     * @param getSnowballUsageRequest
     * @return Result of the GetSnowballUsage operation returned by the service.
     * @sample AmazonSnowball.GetSnowballUsage
     */
    @Override
    public GetSnowballUsageResult getSnowballUsage(GetSnowballUsageRequest getSnowballUsageRequest) {
        ExecutionContext executionContext = createExecutionContext(getSnowballUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnowballUsageRequest> request = null;
        Response<GetSnowballUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnowballUsageRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnowballUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSnowballUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSnowballUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
     * of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
     * associated with this account in all US regions.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @sample AmazonSnowball.ListJobs
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest) {
        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated
     * with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
     * this action is no longer available.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @sample AmazonSnowball.UpdateJob
     */
    @Override
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) {
        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobResultJsonUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
