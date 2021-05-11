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
package com.amazonaws.services.s3control;

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

import com.amazonaws.services.s3control.AWSS3ControlClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.services.s3control.model.transform.*;

import com.amazonaws.arn.Arn;
import com.amazonaws.arn.AwsResource;
import static com.amazonaws.services.s3control.S3ControlHandlerContextKey.S3_ARNABLE_FIELD;

/**
 * Client for accessing AWS S3 Control. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * AWS S3 Control provides access to Amazon S3 control plane actions.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSS3ControlClient extends AmazonWebServiceClient implements AWSS3Control {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSS3Control.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "s3";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    public static AWSS3ControlClientBuilder builder() {
        return AWSS3ControlClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS S3 Control using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSS3ControlClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS S3 Control using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSS3ControlClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new JobStatusExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchPublicAccessBlockConfigurationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BucketAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IdempotencyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BucketAlreadyOwnedByYouExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.s3control.model.AWSS3ControlException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("s3-control.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/s3control/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/s3control/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an access point and associates it with the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <note>
     * <p>
     * S3 on Outposts only supports VPC-style access points.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">
     * Accessing Amazon S3 on Outposts using virtual private cloud (VPC) only access points</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html#API_control_CreateAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p/>
     * <p>
     * The following actions are related to <code>CreateAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointRequest
     * @return Result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3Control.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAccessPointResult createAccessPoint(CreateAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessPoint(request);
    }

    @SdkInternalApi
    final CreateAccessPointResult executeCreateAccessPoint(CreateAccessPointRequest createAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPointRequest> request = null;
        Response<CreateAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = createAccessPointRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    createAccessPointRequest = createAccessPointRequest.clone();
                    createAccessPointRequest.setBucket(resource.getBucketName());

                    String accountId = createAccessPointRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    createAccessPointRequest.setAccountId(accountIdInArn);
                }
                request = new CreateAccessPointRequestMarshaller().marshall(super.beforeMarshalling(createAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessPointRequest.getAccountId(), "AccountId", "createAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessPointResult>(
                    new CreateAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Object Lambda Access Point. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointForObjectLambdaRequest
     * @return Result of the CreateAccessPointForObjectLambda operation returned by the service.
     * @sample AWSS3Control.CreateAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAccessPointForObjectLambdaResult createAccessPointForObjectLambda(CreateAccessPointForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccessPointForObjectLambda(request);
    }

    @SdkInternalApi
    final CreateAccessPointForObjectLambdaResult executeCreateAccessPointForObjectLambda(
            CreateAccessPointForObjectLambdaRequest createAccessPointForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(createAccessPointForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessPointForObjectLambdaRequest> request = null;
        Response<CreateAccessPointForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessPointForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(createAccessPointForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccessPointForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createAccessPointForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createAccessPointForObjectLambdaRequest.getAccountId(), "AccountId",
                        "createAccessPointForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createAccessPointForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateAccessPointForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateAccessPointForObjectLambdaResult>(
                    new CreateAccessPointForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">Create Bucket</a> in the <i>Amazon
     * S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket,
     * you must have S3 on Outposts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Not every string is an acceptable bucket name. For information on bucket naming restrictions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules">Working
     * with Amazon S3 Buckets</a>.
     * </p>
     * <p>
     * S3 on Outposts buckets support:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * LifecycleConfigurations for deleting expired objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OnOutpostsRestrictionsLimitations.html"> Amazon S3
     * on Outposts Restrictions and Limitations</a>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your API request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html#API_control_CreateBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>CreateBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBucketRequest
     * @return Result of the CreateBucket operation returned by the service.
     * @throws BucketAlreadyExistsException
     *         The requested Outposts bucket name is not available. The bucket namespace is shared by all users of the
     *         AWS Outposts in this Region. Select a different name and try again.
     * @throws BucketAlreadyOwnedByYouException
     *         The Outposts bucket you tried to create already exists, and you own it.
     * @sample AWSS3Control.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBucketResult createBucket(CreateBucketRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBucket(request);
    }

    @SdkInternalApi
    final CreateBucketResult executeCreateBucket(CreateBucketRequest createBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(createBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBucketRequest> request = null;
        Response<CreateBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBucketRequestMarshaller().marshall(super.beforeMarshalling(createBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateBucketResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateBucketResult>(
                    new CreateBucketResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can use S3 Batch Operations to perform large-scale batch actions on Amazon S3 objects. Batch Operations can
     * run a single action on lists of Amazon S3 objects that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This action creates a S3 Batch Operations job.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_JobOperation.html">JobOperation</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws IdempotencyException
     * @throws InternalServiceException
     * @sample AWSS3Control.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
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
                request = new CreateJobRequestMarshaller().marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(createJobRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(createJobRequest.getAccountId(), "AccountId", "createJobRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", createJobRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<CreateJobResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<CreateJobResult>(
                    new CreateJobResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified access point.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html#API_control_DeleteAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointRequest
     * @return Result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAccessPointResult deleteAccessPoint(DeleteAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPoint(request);
    }

    @SdkInternalApi
    final DeleteAccessPointResult executeDeleteAccessPoint(DeleteAccessPointRequest deleteAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointRequest> request = null;
        Response<DeleteAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = deleteAccessPointRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    deleteAccessPointRequest = deleteAccessPointRequest.clone();
                    deleteAccessPointRequest.setName(resource.getAccessPointName());

                    String accountId = deleteAccessPointRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteAccessPointRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteAccessPointRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointRequest.getAccountId(), "AccountId", "deleteAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointResult>(
                    new DeleteAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointForObjectLambdaRequest
     * @return Result of the DeleteAccessPointForObjectLambda operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPointForObjectLambdaResult deleteAccessPointForObjectLambda(DeleteAccessPointForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPointForObjectLambda(request);
    }

    @SdkInternalApi
    final DeleteAccessPointForObjectLambdaResult executeDeleteAccessPointForObjectLambda(
            DeleteAccessPointForObjectLambdaRequest deleteAccessPointForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointForObjectLambdaRequest> request = null;
        Response<DeleteAccessPointForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPointForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessPointForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPointForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointForObjectLambdaRequest.getAccountId(), "AccountId",
                        "deleteAccessPointForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointForObjectLambdaResult>(
                    new DeleteAccessPointForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html#API_control_DeleteAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyRequest
     * @return Result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPointPolicyResult deleteAccessPointPolicy(DeleteAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPointPolicy(request);
    }

    @SdkInternalApi
    final DeleteAccessPointPolicyResult executeDeleteAccessPointPolicy(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointPolicyRequest> request = null;
        Response<DeleteAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = deleteAccessPointPolicyRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    deleteAccessPointPolicyRequest = deleteAccessPointPolicyRequest.clone();
                    deleteAccessPointPolicyRequest.setName(resource.getAccessPointName());

                    String accountId = deleteAccessPointPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteAccessPointPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointPolicyRequest.getAccountId(), "AccountId", "deleteAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointPolicyResult>(
                    new DeleteAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyForObjectLambdaRequest
     * @return Result of the DeleteAccessPointPolicyForObjectLambda operation returned by the service.
     * @sample AWSS3Control.DeleteAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessPointPolicyForObjectLambdaResult deleteAccessPointPolicyForObjectLambda(DeleteAccessPointPolicyForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessPointPolicyForObjectLambda(request);
    }

    @SdkInternalApi
    final DeleteAccessPointPolicyForObjectLambdaResult executeDeleteAccessPointPolicyForObjectLambda(
            DeleteAccessPointPolicyForObjectLambdaRequest deleteAccessPointPolicyForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessPointPolicyForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessPointPolicyForObjectLambdaRequest> request = null;
        Response<DeleteAccessPointPolicyForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessPointPolicyForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAccessPointPolicyForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessPointPolicyForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId",
                        "deleteAccessPointPolicyForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteAccessPointPolicyForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteAccessPointPolicyForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteAccessPointPolicyForObjectLambdaResult>(
                    new DeleteAccessPointPolicyForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a> in the <i>Amazon S3
     * API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the
     * bucket must be deleted before the bucket itself can be deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html#API_control_DeleteBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketRequest
     * @return Result of the DeleteBucket operation returned by the service.
     * @sample AWSS3Control.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBucketResult deleteBucket(DeleteBucketRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucket(request);
    }

    @SdkInternalApi
    final DeleteBucketResult executeDeleteBucket(DeleteBucketRequest deleteBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketRequest> request = null;
        Response<DeleteBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketRequest = deleteBucketRequest.clone();
                    deleteBucketRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketRequest.getAccountId(), "AccountId", "deleteBucketRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketResult>(
                    new DeleteBucketResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the
     * lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire,
     * and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the
     * deleted lifecycle configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>s3-outposts:DeleteLifecycleConfiguration</code>
     * action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission
     * to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html#API_control_DeleteBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For more information about object expiration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
     * >Elements to Describe Lifecycle Actions</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketLifecycleConfigurationRequest
     * @return Result of the DeleteBucketLifecycleConfiguration operation returned by the service.
     * @sample AWSS3Control.DeleteBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBucketLifecycleConfigurationResult deleteBucketLifecycleConfiguration(DeleteBucketLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final DeleteBucketLifecycleConfigurationResult executeDeleteBucketLifecycleConfiguration(
            DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketLifecycleConfigurationRequest> request = null;
        Response<DeleteBucketLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketLifecycleConfigurationRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketLifecycleConfigurationRequest = deleteBucketLifecycleConfigurationRequest.clone();
                    deleteBucketLifecycleConfigurationRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketLifecycleConfigurationRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketLifecycleConfigurationRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketLifecycleConfigurationRequestMarshaller()
                        .marshall(super.beforeMarshalling(deleteBucketLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketLifecycleConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketLifecycleConfigurationRequest.getAccountId(), "AccountId",
                        "deleteBucketLifecycleConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketLifecycleConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketLifecycleConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketLifecycleConfigurationResult>(
                    new DeleteBucketLifecycleConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketPolicy.html">DeleteBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * This implementation of the DELETE action uses the policy subresource to delete the policy of a specified Amazon
     * S3 on Outposts bucket. If you are using an identity other than the root user of the AWS account that owns the
     * bucket, the calling identity must have the <code>s3-outposts:DeleteBucketPolicy</code> permissions on the
     * specified Outposts bucket and belong to the bucket owner's account to use this action. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you don't have <code>DeleteBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the AWS account that owns a bucket can always use this action, even if
     * the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html#API_control_DeleteBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketPolicyRequest
     * @return Result of the DeleteBucketPolicy operation returned by the service.
     * @sample AWSS3Control.DeleteBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBucketPolicyResult deleteBucketPolicy(DeleteBucketPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketPolicy(request);
    }

    @SdkInternalApi
    final DeleteBucketPolicyResult executeDeleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketPolicyRequest> request = null;
        Response<DeleteBucketPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketPolicyRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketPolicyRequest = deleteBucketPolicyRequest.clone();
                    deleteBucketPolicyRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketPolicyRequest.getAccountId(), "AccountId", "deleteBucketPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketPolicyResult>(
                    new DeleteBucketPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the tags from the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>PutBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html#API_control_DeleteBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketTaggingRequest
     * @return Result of the DeleteBucketTagging operation returned by the service.
     * @sample AWSS3Control.DeleteBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketTagging" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBucketTaggingResult deleteBucketTagging(DeleteBucketTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBucketTagging(request);
    }

    @SdkInternalApi
    final DeleteBucketTaggingResult executeDeleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBucketTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBucketTaggingRequest> request = null;
        Response<DeleteBucketTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = deleteBucketTaggingRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    deleteBucketTaggingRequest = deleteBucketTaggingRequest.clone();
                    deleteBucketTaggingRequest.setBucket(resource.getBucketName());

                    String accountId = deleteBucketTaggingRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    deleteBucketTaggingRequest.setAccountId(accountIdInArn);
                }
                request = new DeleteBucketTaggingRequestMarshaller().marshall(super.beforeMarshalling(deleteBucketTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBucketTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteBucketTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteBucketTaggingRequest.getAccountId(), "AccountId", "deleteBucketTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteBucketTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteBucketTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteBucketTaggingResult>(
                    new DeleteBucketTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the entire tag set from the specified S3 Batch Operations job. To use this operation, you must have
     * permission to perform the <code>s3:DeleteJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteJobTaggingRequest
     * @return Result of the DeleteJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @sample AWSS3Control.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobTaggingResult deleteJobTagging(DeleteJobTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJobTagging(request);
    }

    @SdkInternalApi
    final DeleteJobTaggingResult executeDeleteJobTagging(DeleteJobTaggingRequest deleteJobTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobTaggingRequest> request = null;
        Response<DeleteJobTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobTaggingRequestMarshaller().marshall(super.beforeMarshalling(deleteJobTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJobTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteJobTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteJobTaggingRequest.getAccountId(), "AccountId", "deleteJobTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteJobTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteJobTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteJobTaggingResult>(
                    new DeleteJobTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletePublicAccessBlockRequest
     * @return Result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3Control.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePublicAccessBlockResult deletePublicAccessBlock(DeletePublicAccessBlockRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePublicAccessBlock(request);
    }

    @SdkInternalApi
    final DeletePublicAccessBlockResult executeDeletePublicAccessBlock(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePublicAccessBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePublicAccessBlockRequest> request = null;
        Response<DeletePublicAccessBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePublicAccessBlockRequestMarshaller().marshall(super.beforeMarshalling(deletePublicAccessBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePublicAccessBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deletePublicAccessBlockRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deletePublicAccessBlockRequest.getAccountId(), "AccountId", "deletePublicAccessBlockRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deletePublicAccessBlockRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeletePublicAccessBlockResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeletePublicAccessBlockResult>(
                    new DeletePublicAccessBlockResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfiguration</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationRequest
     * @return Result of the DeleteStorageLensConfiguration operation returned by the service.
     * @sample AWSS3Control.DeleteStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageLensConfigurationResult deleteStorageLensConfiguration(DeleteStorageLensConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageLensConfiguration(request);
    }

    @SdkInternalApi
    final DeleteStorageLensConfigurationResult executeDeleteStorageLensConfiguration(DeleteStorageLensConfigurationRequest deleteStorageLensConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageLensConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageLensConfigurationRequest> request = null;
        Response<DeleteStorageLensConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageLensConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteStorageLensConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageLensConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteStorageLensConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteStorageLensConfigurationRequest.getAccountId(), "AccountId",
                        "deleteStorageLensConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteStorageLensConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteStorageLensConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteStorageLensConfigurationResult>(
                    new DeleteStorageLensConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationTaggingRequest
     * @return Result of the DeleteStorageLensConfigurationTagging operation returned by the service.
     * @sample AWSS3Control.DeleteStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageLensConfigurationTaggingResult deleteStorageLensConfigurationTagging(DeleteStorageLensConfigurationTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageLensConfigurationTagging(request);
    }

    @SdkInternalApi
    final DeleteStorageLensConfigurationTaggingResult executeDeleteStorageLensConfigurationTagging(
            DeleteStorageLensConfigurationTaggingRequest deleteStorageLensConfigurationTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageLensConfigurationTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageLensConfigurationTaggingRequest> request = null;
        Response<DeleteStorageLensConfigurationTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageLensConfigurationTaggingRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteStorageLensConfigurationTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageLensConfigurationTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(deleteStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(deleteStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId",
                        "deleteStorageLensConfigurationTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", deleteStorageLensConfigurationTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DeleteStorageLensConfigurationTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DeleteStorageLensConfigurationTaggingResult>(
                    new DeleteStorageLensConfigurationTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws InternalServiceException
     * @sample AWSS3Control.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJob(request);
    }

    @SdkInternalApi
    final DescribeJobResult executeDescribeJob(DescribeJobRequest describeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestMarshaller().marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(describeJobRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(describeJobRequest.getAccountId(), "AccountId", "describeJobRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", describeJobRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<DescribeJobResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<DescribeJobResult>(
                    new DescribeJobResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointRequest
     * @return Result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3Control.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccessPointResult getAccessPoint(GetAccessPointRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPoint(request);
    }

    @SdkInternalApi
    final GetAccessPointResult executeGetAccessPoint(GetAccessPointRequest getAccessPointRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointRequest> request = null;
        Response<GetAccessPointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = getAccessPointRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    getAccessPointRequest = getAccessPointRequest.clone();
                    getAccessPointRequest.setName(resource.getAccessPointName());

                    String accountId = getAccessPointRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getAccessPointRequest.setAccountId(accountIdInArn);
                }
                request = new GetAccessPointRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointRequest.getAccountId(), "AccountId", "getAccessPointRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointResult>(
                    new GetAccessPointResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointConfigurationForObjectLambda.html"
     * >PutAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointConfigurationForObjectLambdaRequest
     * @return Result of the GetAccessPointConfigurationForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointConfigurationForObjectLambdaResult getAccessPointConfigurationForObjectLambda(GetAccessPointConfigurationForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointConfigurationForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointConfigurationForObjectLambdaResult executeGetAccessPointConfigurationForObjectLambda(
            GetAccessPointConfigurationForObjectLambdaRequest getAccessPointConfigurationForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointConfigurationForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointConfigurationForObjectLambdaRequest> request = null;
        Response<GetAccessPointConfigurationForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointConfigurationForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessPointConfigurationForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointConfigurationForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointConfigurationForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointConfigurationForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointConfigurationForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointConfigurationForObjectLambdaResult>(
                    new GetAccessPointConfigurationForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns configuration information about the specified Object Lambda Access Point
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointForObjectLambdaRequest
     * @return Result of the GetAccessPointForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointForObjectLambdaResult getAccessPointForObjectLambda(GetAccessPointForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointForObjectLambdaResult executeGetAccessPointForObjectLambda(GetAccessPointForObjectLambdaRequest getAccessPointForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointForObjectLambdaRequest> request = null;
        Response<GetAccessPointForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointForObjectLambdaResult>(
                    new GetAccessPointForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyRequest
     * @return Result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyResult getAccessPointPolicy(GetAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicy(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyResult executeGetAccessPointPolicy(GetAccessPointPolicyRequest getAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyRequest> request = null;
        Response<GetAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = getAccessPointPolicyRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    getAccessPointPolicyRequest = getAccessPointPolicyRequest.clone();
                    getAccessPointPolicyRequest.setName(resource.getAccessPointName());

                    String accountId = getAccessPointPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getAccessPointPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new GetAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyRequest.getAccountId(), "AccountId", "getAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyResult>(
                    new GetAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyForObjectLambdaRequest
     * @return Result of the GetAccessPointPolicyForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyForObjectLambdaResult getAccessPointPolicyForObjectLambda(GetAccessPointPolicyForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicyForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyForObjectLambdaResult executeGetAccessPointPolicyForObjectLambda(
            GetAccessPointPolicyForObjectLambdaRequest getAccessPointPolicyForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyForObjectLambdaRequest> request = null;
        Response<GetAccessPointPolicyForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointPolicyForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessPointPolicyForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicyForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointPolicyForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyForObjectLambdaResult>(
                    new GetAccessPointPolicyForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @return Result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyStatusResult getAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicyStatus(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyStatusResult executeGetAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyStatusRequest> request = null;
        Response<GetAccessPointPolicyStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointPolicyStatusRequestMarshaller().marshall(super.beforeMarshalling(getAccessPointPolicyStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicyStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyStatusRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyStatusRequest.getAccountId(), "AccountId", "getAccessPointPolicyStatusRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyStatusRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyStatusResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyStatusResult>(
                    new GetAccessPointPolicyStatusResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of the resource policy associated with an Object Lambda Access Point.
     * </p>
     * 
     * @param getAccessPointPolicyStatusForObjectLambdaRequest
     * @return Result of the GetAccessPointPolicyStatusForObjectLambda operation returned by the service.
     * @sample AWSS3Control.GetAccessPointPolicyStatusForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatusForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessPointPolicyStatusForObjectLambdaResult getAccessPointPolicyStatusForObjectLambda(GetAccessPointPolicyStatusForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessPointPolicyStatusForObjectLambda(request);
    }

    @SdkInternalApi
    final GetAccessPointPolicyStatusForObjectLambdaResult executeGetAccessPointPolicyStatusForObjectLambda(
            GetAccessPointPolicyStatusForObjectLambdaRequest getAccessPointPolicyStatusForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessPointPolicyStatusForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessPointPolicyStatusForObjectLambdaRequest> request = null;
        Response<GetAccessPointPolicyStatusForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessPointPolicyStatusForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(getAccessPointPolicyStatusForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessPointPolicyStatusForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getAccessPointPolicyStatusForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getAccessPointPolicyStatusForObjectLambdaRequest.getAccountId(), "AccountId",
                        "getAccessPointPolicyStatusForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getAccessPointPolicyStatusForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetAccessPointPolicyStatusForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetAccessPointPolicyStatusForObjectLambdaResult>(
                    new GetAccessPointPolicyStatusForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html"> Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the AWS account that owns the Outposts bucket, the
     * calling identity must have the <code>s3-outposts:GetBucket</code> permissions on the specified Outposts bucket
     * and belong to the Outposts bucket owner's account in order to use this action. Only users from Outposts bucket
     * owner account with the right permissions can perform actions on an Outposts bucket.
     * </p>
     * <p>
     * If you don't have <code>s3-outposts:GetBucket</code> permissions or you're not using an identity that belongs to
     * the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html#API_control_GetBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketRequest
     * @return Result of the GetBucket operation returned by the service.
     * @sample AWSS3Control.GetBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucket" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketResult getBucket(GetBucketRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucket(request);
    }

    @SdkInternalApi
    final GetBucketResult executeGetBucket(GetBucketRequest getBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketRequest> request = null;
        Response<GetBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketRequest = getBucketRequest.clone();
                    getBucketRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketRequestMarshaller().marshall(super.beforeMarshalling(getBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketRequest.getAccountId(), "AccountId", "getBucketRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketResult>(
                    new GetBucketResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html"
     * >GetBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the lifecycle configuration information set on the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * and for information about lifecycle configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"> Object Lifecycle
     * Management</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>s3-outposts:GetLifecycleConfiguration</code>
     * action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to
     * others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html#API_control_GetBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * <code>GetBucketLifecycleConfiguration</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchLifecycleConfiguration</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * SOAP Fault Code Prefix: Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>GetBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketLifecycleConfigurationRequest
     * @return Result of the GetBucketLifecycleConfiguration operation returned by the service.
     * @sample AWSS3Control.GetBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBucketLifecycleConfigurationResult getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final GetBucketLifecycleConfigurationResult executeGetBucketLifecycleConfiguration(
            GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketLifecycleConfigurationRequest> request = null;
        Response<GetBucketLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketLifecycleConfigurationRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketLifecycleConfigurationRequest = getBucketLifecycleConfigurationRequest.clone();
                    getBucketLifecycleConfigurationRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketLifecycleConfigurationRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketLifecycleConfigurationRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketLifecycleConfigurationRequestMarshaller().marshall(super.beforeMarshalling(getBucketLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketLifecycleConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketLifecycleConfigurationRequest.getAccountId(), "AccountId",
                        "getBucketLifecycleConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketLifecycleConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketLifecycleConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketLifecycleConfigurationResult>(
                    new GetBucketLifecycleConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicy.html">GetBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the policy of a specified Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the AWS account that owns the bucket, the calling
     * identity must have the <code>GetBucketPolicy</code> permissions on the specified bucket and belong to the bucket
     * owner's account in order to use this action.
     * </p>
     * <p>
     * Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts
     * bucket. If you don't have <code>s3-outposts:GetBucketPolicy</code> permissions or you're not using an identity
     * that belongs to the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the AWS account that owns a bucket can always use this action, even if
     * the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html#API_control_GetBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketPolicyRequest
     * @return Result of the GetBucketPolicy operation returned by the service.
     * @sample AWSS3Control.GetBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketPolicyResult getBucketPolicy(GetBucketPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketPolicy(request);
    }

    @SdkInternalApi
    final GetBucketPolicyResult executeGetBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketPolicyRequest> request = null;
        Response<GetBucketPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketPolicyRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketPolicyRequest = getBucketPolicyRequest.clone();
                    getBucketPolicyRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketPolicyRequestMarshaller().marshall(super.beforeMarshalling(getBucketPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketPolicyRequest.getAccountId(), "AccountId", "getBucketPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketPolicyResult>(
                    new GetBucketPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the tag set associated with the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>GetBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * <code>GetBucketTagging</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchTagSetError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: There is no tag set associated with the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html#API_control_GetBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketTaggingRequest
     * @return Result of the GetBucketTagging operation returned by the service.
     * @sample AWSS3Control.GetBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketTaggingResult getBucketTagging(GetBucketTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketTagging(request);
    }

    @SdkInternalApi
    final GetBucketTaggingResult executeGetBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketTaggingRequest> request = null;
        Response<GetBucketTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = getBucketTaggingRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    getBucketTaggingRequest = getBucketTaggingRequest.clone();
                    getBucketTaggingRequest.setBucket(resource.getBucketName());

                    String accountId = getBucketTaggingRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    getBucketTaggingRequest.setAccountId(accountIdInArn);
                }
                request = new GetBucketTaggingRequestMarshaller().marshall(super.beforeMarshalling(getBucketTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getBucketTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getBucketTaggingRequest.getAccountId(), "AccountId", "getBucketTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getBucketTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetBucketTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetBucketTaggingResult>(
                    new GetBucketTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags on an S3 Batch Operations job. To use this operation, you must have permission to perform the
     * <code>s3:GetJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getJobTaggingRequest
     * @return Result of the GetJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @sample AWSS3Control.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobTaggingResult getJobTagging(GetJobTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobTagging(request);
    }

    @SdkInternalApi
    final GetJobTaggingResult executeGetJobTagging(GetJobTaggingRequest getJobTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobTaggingRequest> request = null;
        Response<GetJobTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobTaggingRequestMarshaller().marshall(super.beforeMarshalling(getJobTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getJobTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getJobTaggingRequest.getAccountId(), "AccountId", "getJobTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getJobTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetJobTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetJobTaggingResult>(
                    new GetJobTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getPublicAccessBlockRequest
     * @return Result of the GetPublicAccessBlock operation returned by the service.
     * @throws NoSuchPublicAccessBlockConfigurationException
     *         Amazon S3 throws this exception if you make a <code>GetPublicAccessBlock</code> request against an
     *         account that doesn't have a <code>PublicAccessBlockConfiguration</code> set.
     * @sample AWSS3Control.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPublicAccessBlockResult getPublicAccessBlock(GetPublicAccessBlockRequest request) {
        request = beforeClientExecution(request);
        return executeGetPublicAccessBlock(request);
    }

    @SdkInternalApi
    final GetPublicAccessBlockResult executeGetPublicAccessBlock(GetPublicAccessBlockRequest getPublicAccessBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(getPublicAccessBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicAccessBlockRequest> request = null;
        Response<GetPublicAccessBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPublicAccessBlockRequestMarshaller().marshall(super.beforeMarshalling(getPublicAccessBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPublicAccessBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getPublicAccessBlockRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getPublicAccessBlockRequest.getAccountId(), "AccountId", "getPublicAccessBlockRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getPublicAccessBlockRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetPublicAccessBlockResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetPublicAccessBlockResult>(
                    new GetPublicAccessBlockResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the Amazon S3 Storage Lens configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationRequest
     * @return Result of the GetStorageLensConfiguration operation returned by the service.
     * @sample AWSS3Control.GetStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStorageLensConfigurationResult getStorageLensConfiguration(GetStorageLensConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageLensConfiguration(request);
    }

    @SdkInternalApi
    final GetStorageLensConfigurationResult executeGetStorageLensConfiguration(GetStorageLensConfigurationRequest getStorageLensConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageLensConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageLensConfigurationRequest> request = null;
        Response<GetStorageLensConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageLensConfigurationRequestMarshaller().marshall(super.beforeMarshalling(getStorageLensConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageLensConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getStorageLensConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getStorageLensConfigurationRequest.getAccountId(), "AccountId",
                        "getStorageLensConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getStorageLensConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetStorageLensConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetStorageLensConfigurationResult>(
                    new GetStorageLensConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationTaggingRequest
     * @return Result of the GetStorageLensConfigurationTagging operation returned by the service.
     * @sample AWSS3Control.GetStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStorageLensConfigurationTaggingResult getStorageLensConfigurationTagging(GetStorageLensConfigurationTaggingRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageLensConfigurationTagging(request);
    }

    @SdkInternalApi
    final GetStorageLensConfigurationTaggingResult executeGetStorageLensConfigurationTagging(
            GetStorageLensConfigurationTaggingRequest getStorageLensConfigurationTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageLensConfigurationTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageLensConfigurationTaggingRequest> request = null;
        Response<GetStorageLensConfigurationTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageLensConfigurationTaggingRequestMarshaller()
                        .marshall(super.beforeMarshalling(getStorageLensConfigurationTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageLensConfigurationTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(getStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(getStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId",
                        "getStorageLensConfigurationTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", getStorageLensConfigurationTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<GetStorageLensConfigurationTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<GetStorageLensConfigurationTaggingResult>(
                    new GetStorageLensConfigurationTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000
     * access points per call. If the specified bucket has more than 1,000 access points (or the number specified in
     * <code>maxResults</code>, whichever is less), the response will include a continuation token that you can use to
     * list the additional access points.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPoints</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsRequest
     * @return Result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3Control.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccessPointsResult listAccessPoints(ListAccessPointsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessPoints(request);
    }

    @SdkInternalApi
    final ListAccessPointsResult executeListAccessPoints(ListAccessPointsRequest listAccessPointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessPointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPointsRequest> request = null;
        Response<ListAccessPointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = listAccessPointsRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    listAccessPointsRequest = listAccessPointsRequest.clone();
                    listAccessPointsRequest.setBucket(resource.getBucketName());

                    String accountId = listAccessPointsRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    listAccessPointsRequest.setAccountId(accountIdInArn);
                }
                request = new ListAccessPointsRequestMarshaller().marshall(super.beforeMarshalling(listAccessPointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessPoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessPointsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessPointsRequest.getAccountId(), "AccountId", "listAccessPointsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessPointsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessPointsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessPointsResult>(
                    new ListAccessPointsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the access points associated with the Object Lambda Access Point. You can retrieve up to 1000
     * access points per call. If there are more than 1,000 access points (or the number specified in
     * <code>maxResults</code>, whichever is less), the response will include a continuation token that you can use to
     * list the additional access points.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPointsForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsForObjectLambdaRequest
     * @return Result of the ListAccessPointsForObjectLambda operation returned by the service.
     * @sample AWSS3Control.ListAccessPointsForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPointsForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessPointsForObjectLambdaResult listAccessPointsForObjectLambda(ListAccessPointsForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessPointsForObjectLambda(request);
    }

    @SdkInternalApi
    final ListAccessPointsForObjectLambdaResult executeListAccessPointsForObjectLambda(
            ListAccessPointsForObjectLambdaRequest listAccessPointsForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessPointsForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessPointsForObjectLambdaRequest> request = null;
        Response<ListAccessPointsForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessPointsForObjectLambdaRequestMarshaller().marshall(super.beforeMarshalling(listAccessPointsForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessPointsForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listAccessPointsForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listAccessPointsForObjectLambdaRequest.getAccountId(), "AccountId",
                        "listAccessPointsForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listAccessPointsForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListAccessPointsForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListAccessPointsForObjectLambdaResult>(
                    new ListAccessPointsForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists current S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS account
     * making the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalServiceException
     * @throws InvalidNextTokenException
     * @sample AWSS3Control.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestMarshaller().marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listJobsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listJobsRequest.getAccountId(), "AccountId", "listJobsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listJobsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListJobsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListJobsResult>(
                    new ListJobsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using
     * Amazon S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListRegionalBuckets.html#API_control_ListRegionalBuckets_Examples"
     * >Examples</a> section.
     * </p>
     * 
     * @param listRegionalBucketsRequest
     * @return Result of the ListRegionalBuckets operation returned by the service.
     * @sample AWSS3Control.ListRegionalBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListRegionalBuckets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRegionalBucketsResult listRegionalBuckets(ListRegionalBucketsRequest request) {
        request = beforeClientExecution(request);
        return executeListRegionalBuckets(request);
    }

    @SdkInternalApi
    final ListRegionalBucketsResult executeListRegionalBuckets(ListRegionalBucketsRequest listRegionalBucketsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRegionalBucketsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegionalBucketsRequest> request = null;
        Response<ListRegionalBucketsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegionalBucketsRequestMarshaller().marshall(super.beforeMarshalling(listRegionalBucketsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRegionalBuckets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listRegionalBucketsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listRegionalBucketsRequest.getAccountId(), "AccountId", "listRegionalBucketsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listRegionalBucketsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListRegionalBucketsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListRegionalBucketsResult>(
                    new ListRegionalBucketsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:ListStorageLensConfigurations</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param listStorageLensConfigurationsRequest
     * @return Result of the ListStorageLensConfigurations operation returned by the service.
     * @sample AWSS3Control.ListStorageLensConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStorageLensConfigurationsResult listStorageLensConfigurations(ListStorageLensConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListStorageLensConfigurations(request);
    }

    @SdkInternalApi
    final ListStorageLensConfigurationsResult executeListStorageLensConfigurations(ListStorageLensConfigurationsRequest listStorageLensConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStorageLensConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStorageLensConfigurationsRequest> request = null;
        Response<ListStorageLensConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStorageLensConfigurationsRequestMarshaller().marshall(super.beforeMarshalling(listStorageLensConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStorageLensConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(listStorageLensConfigurationsRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(listStorageLensConfigurationsRequest.getAccountId(), "AccountId",
                        "listStorageLensConfigurationsRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", listStorageLensConfigurationsRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<ListStorageLensConfigurationsResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<ListStorageLensConfigurationsResult>(
                    new ListStorageLensConfigurationsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Replaces configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointConfigurationForObjectLambda.html"
     * >GetAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointConfigurationForObjectLambdaRequest
     * @return Result of the PutAccessPointConfigurationForObjectLambda operation returned by the service.
     * @sample AWSS3Control.PutAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccessPointConfigurationForObjectLambdaResult putAccessPointConfigurationForObjectLambda(PutAccessPointConfigurationForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessPointConfigurationForObjectLambda(request);
    }

    @SdkInternalApi
    final PutAccessPointConfigurationForObjectLambdaResult executePutAccessPointConfigurationForObjectLambda(
            PutAccessPointConfigurationForObjectLambdaRequest putAccessPointConfigurationForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessPointConfigurationForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessPointConfigurationForObjectLambdaRequest> request = null;
        Response<PutAccessPointConfigurationForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessPointConfigurationForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(putAccessPointConfigurationForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessPointConfigurationForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessPointConfigurationForObjectLambdaRequest.getAccountId(), "AccountId",
                        "putAccessPointConfigurationForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessPointConfigurationForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessPointConfigurationForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessPointConfigurationForObjectLambdaResult>(
                    new PutAccessPointConfigurationForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html#API_control_PutAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyRequest
     * @return Result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3Control.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAccessPointPolicyResult putAccessPointPolicy(PutAccessPointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessPointPolicy(request);
    }

    @SdkInternalApi
    final PutAccessPointPolicyResult executePutAccessPointPolicy(PutAccessPointPolicyRequest putAccessPointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessPointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessPointPolicyRequest> request = null;
        Response<PutAccessPointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String name = putAccessPointPolicyRequest.getName();
                Arn arn = null;
                if (name != null && name.startsWith("arn:")) {
                    arn = Arn.fromString(name);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3.S3AccessPointResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3.S3AccessPointResource.");
                    }

                    com.amazonaws.services.s3.S3AccessPointResource resource = (com.amazonaws.services.s3.S3AccessPointResource) awsResource;

                    putAccessPointPolicyRequest = putAccessPointPolicyRequest.clone();
                    putAccessPointPolicyRequest.setName(resource.getAccessPointName());

                    String accountId = putAccessPointPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putAccessPointPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new PutAccessPointPolicyRequestMarshaller().marshall(super.beforeMarshalling(putAccessPointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessPointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessPointPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessPointPolicyRequest.getAccountId(), "AccountId", "putAccessPointPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessPointPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessPointPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessPointPolicyResult>(
                    new PutAccessPointPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or replaces resource policy for an Object Lambda Access Point. For an example policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-create.html#olap-create-cli">Creating Object
     * Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyForObjectLambdaRequest
     * @return Result of the PutAccessPointPolicyForObjectLambda operation returned by the service.
     * @sample AWSS3Control.PutAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAccessPointPolicyForObjectLambdaResult putAccessPointPolicyForObjectLambda(PutAccessPointPolicyForObjectLambdaRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessPointPolicyForObjectLambda(request);
    }

    @SdkInternalApi
    final PutAccessPointPolicyForObjectLambdaResult executePutAccessPointPolicyForObjectLambda(
            PutAccessPointPolicyForObjectLambdaRequest putAccessPointPolicyForObjectLambdaRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessPointPolicyForObjectLambdaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessPointPolicyForObjectLambdaRequest> request = null;
        Response<PutAccessPointPolicyForObjectLambdaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessPointPolicyForObjectLambdaRequestMarshaller().marshall(super
                        .beforeMarshalling(putAccessPointPolicyForObjectLambdaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessPointPolicyForObjectLambda");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putAccessPointPolicyForObjectLambdaRequest.getAccountId(), "AccountId",
                        "putAccessPointPolicyForObjectLambdaRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putAccessPointPolicyForObjectLambdaRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutAccessPointPolicyForObjectLambdaResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutAccessPointPolicyForObjectLambdaResult>(
                    new PutAccessPointPolicyForObjectLambdaResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration
     * to an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html"
     * >PutBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing lifecycle
     * configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain
     * period of time and abort incomplete multipart uploads.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html#API_control_PutBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketLifecycleConfigurationRequest
     * @return Result of the PutBucketLifecycleConfiguration operation returned by the service.
     * @sample AWSS3Control.PutBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutBucketLifecycleConfigurationResult putBucketLifecycleConfiguration(PutBucketLifecycleConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketLifecycleConfiguration(request);
    }

    @SdkInternalApi
    final PutBucketLifecycleConfigurationResult executePutBucketLifecycleConfiguration(
            PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketLifecycleConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketLifecycleConfigurationRequest> request = null;
        Response<PutBucketLifecycleConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketLifecycleConfigurationRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketLifecycleConfigurationRequest = putBucketLifecycleConfigurationRequest.clone();
                    putBucketLifecycleConfigurationRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketLifecycleConfigurationRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketLifecycleConfigurationRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketLifecycleConfigurationRequestMarshaller().marshall(super.beforeMarshalling(putBucketLifecycleConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketLifecycleConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketLifecycleConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketLifecycleConfigurationRequest.getAccountId(), "AccountId",
                        "putBucketLifecycleConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketLifecycleConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketLifecycleConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketLifecycleConfigurationResult>(
                    new PutBucketLifecycleConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketPolicy.html">PutBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the AWS account that owns the Outposts bucket, the
     * calling identity must have the <code>PutBucketPolicy</code> permissions on the specified Outposts bucket and
     * belong to the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the AWS account that owns a bucket can always use this action, even if
     * the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html#API_control_PutBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketPolicyRequest
     * @return Result of the PutBucketPolicy operation returned by the service.
     * @sample AWSS3Control.PutBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutBucketPolicyResult putBucketPolicy(PutBucketPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketPolicy(request);
    }

    @SdkInternalApi
    final PutBucketPolicyResult executePutBucketPolicy(PutBucketPolicyRequest putBucketPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketPolicyRequest> request = null;
        Response<PutBucketPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketPolicyRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketPolicyRequest = putBucketPolicyRequest.clone();
                    putBucketPolicyRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketPolicyRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketPolicyRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketPolicyRequestMarshaller().marshall(super.beforeMarshalling(putBucketPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketPolicyRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketPolicyRequest.getAccountId(), "AccountId", "putBucketPolicyRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketPolicyRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketPolicyResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketPolicyResult>(
                    new PutBucketPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the tags for an S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to get your AWS
     * account bill with tag key values included. Then, to see the cost of combined resources, organize your billing
     * information according to resources with the same tag key values. For example, you can tag several resources with
     * a specific application name, and then organize your billing information to see the total cost of that application
     * across several services. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Cost allocation and
     * tagging</a>.
     * </p>
     * <note>
     * <p>
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html"> Using cost allocation in
     * Amazon S3 bucket tags</a>.
     * </p>
     * </note>
     * <p>
     * To use this action, you must have permissions to perform the <code>s3-outposts:PutBucketTagging</code> action.
     * The Outposts bucket owner has this permission by default and can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * > Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing access permissions
     * to your Amazon S3 resources</a>.
     * </p>
     * <p>
     * <code>PutBucketTagging</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>InvalidTagError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For information about tag restrictions, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">
     * User-Defined Tag Restrictions</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html"> AWS-Generated Cost
     * Allocation Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>MalformedXMLError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The XML provided does not match the schema.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>OperationAbortedError </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: A conflicting conditional action is currently in progress against this resource. Try again.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InternalError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The service was unable to apply the provided tag to the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request and an S3 on Outposts endpoint hostname prefix
     * instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on Outposts that uses the
     * S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived using the access point ARN,
     * see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html#API_control_PutBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketTaggingRequest
     * @return Result of the PutBucketTagging operation returned by the service.
     * @sample AWSS3Control.PutBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutBucketTaggingResult putBucketTagging(PutBucketTaggingRequest request) {
        request = beforeClientExecution(request);
        return executePutBucketTagging(request);
    }

    @SdkInternalApi
    final PutBucketTaggingResult executePutBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(putBucketTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutBucketTaggingRequest> request = null;
        Response<PutBucketTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                String bucket = putBucketTaggingRequest.getBucket();
                Arn arn = null;
                if (bucket != null && bucket.startsWith("arn:")) {
                    arn = Arn.fromString(bucket);
                    AwsResource awsResource = com.amazonaws.services.s3control.internal.S3ControlArnConverter.getInstance().convertArn(arn);

                    if (!(awsResource instanceof com.amazonaws.services.s3control.internal.S3ControlBucketResource)) {
                        throw new IllegalArgumentException("Unsupported ARN type: " + awsResource.getClass()
                                + ". Expected com.amazonaws.services.s3control.internal.S3ControlBucketResource.");
                    }

                    com.amazonaws.services.s3control.internal.S3ControlBucketResource resource = (com.amazonaws.services.s3control.internal.S3ControlBucketResource) awsResource;

                    putBucketTaggingRequest = putBucketTaggingRequest.clone();
                    putBucketTaggingRequest.setBucket(resource.getBucketName());

                    String accountId = putBucketTaggingRequest.getAccountId();
                    String accountIdInArn = resource.getAccountId();
                    if (accountId != null && !accountId.equals(accountIdInArn)) {
                        throw new IllegalArgumentException(String.format("%s field provided from the request (%s) is different from the one in the ARN (%s)",
                                "accountId", accountId, accountIdInArn));
                    }
                    putBucketTaggingRequest.setAccountId(accountIdInArn);
                }
                request = new PutBucketTaggingRequestMarshaller().marshall(super.beforeMarshalling(putBucketTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutBucketTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putBucketTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putBucketTaggingRequest.getAccountId(), "AccountId", "putBucketTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putBucketTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutBucketTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutBucketTaggingResult>(
                    new PutBucketTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the supplied tag-set on an S3 Batch Operations job.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request
     * against the tagging subresource that is associated with the job. To modify the existing tag set, you can either
     * replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag
     * set using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>, modify
     * that tag set, and use this action to replace the tag set with the one you modified. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">Controlling
     * access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations
     * job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see <a
     * href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deleting existing tags for your Batch Operations job, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * request is preferred because it achieves the same result without incurring charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * A few things to consider about using tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon S3 limits the maximum number of tags to 50 tags per job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate up to 50 tags with a job as long as they have unique tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in
     * length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * <p/>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutJobTagging</code> action.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreatJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putJobTaggingRequest
     * @return Result of the PutJobTagging operation returned by the service.
     * @throws InternalServiceException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws TooManyTagsException
     *         Amazon S3 throws this exception if you have too many tags in your tag set.
     * @sample AWSS3Control.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutJobTaggingResult putJobTagging(PutJobTaggingRequest request) {
        request = beforeClientExecution(request);
        return executePutJobTagging(request);
    }

    @SdkInternalApi
    final PutJobTaggingResult executePutJobTagging(PutJobTaggingRequest putJobTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(putJobTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutJobTaggingRequest> request = null;
        Response<PutJobTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutJobTaggingRequestMarshaller().marshall(super.beforeMarshalling(putJobTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutJobTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putJobTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putJobTaggingRequest.getAccountId(), "AccountId", "putJobTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putJobTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutJobTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutJobTaggingResult>(
                    new PutJobTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an AWS account. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using
     * Amazon S3 block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPublicAccessBlockRequest
     * @return Result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3Control.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutPublicAccessBlockResult putPublicAccessBlock(PutPublicAccessBlockRequest request) {
        request = beforeClientExecution(request);
        return executePutPublicAccessBlock(request);
    }

    @SdkInternalApi
    final PutPublicAccessBlockResult executePutPublicAccessBlock(PutPublicAccessBlockRequest putPublicAccessBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(putPublicAccessBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPublicAccessBlockRequest> request = null;
        Response<PutPublicAccessBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPublicAccessBlockRequestMarshaller().marshall(super.beforeMarshalling(putPublicAccessBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPublicAccessBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putPublicAccessBlockRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putPublicAccessBlockRequest.getAccountId(), "AccountId", "putPublicAccessBlockRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putPublicAccessBlockRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutPublicAccessBlockResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutPublicAccessBlockResult>(
                    new PutPublicAccessBlockResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Working with Amazon S3 Storage Lens</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationRequest
     * @return Result of the PutStorageLensConfiguration operation returned by the service.
     * @sample AWSS3Control.PutStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutStorageLensConfigurationResult putStorageLensConfiguration(PutStorageLensConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutStorageLensConfiguration(request);
    }

    @SdkInternalApi
    final PutStorageLensConfigurationResult executePutStorageLensConfiguration(PutStorageLensConfigurationRequest putStorageLensConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putStorageLensConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutStorageLensConfigurationRequest> request = null;
        Response<PutStorageLensConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutStorageLensConfigurationRequestMarshaller().marshall(super.beforeMarshalling(putStorageLensConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutStorageLensConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putStorageLensConfigurationRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putStorageLensConfigurationRequest.getAccountId(), "AccountId",
                        "putStorageLensConfigurationRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putStorageLensConfigurationRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutStorageLensConfigurationResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutStorageLensConfigurationResult>(
                    new PutStorageLensConfigurationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage
     * Lens, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage
     * activity and usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationTaggingRequest
     * @return Result of the PutStorageLensConfigurationTagging operation returned by the service.
     * @sample AWSS3Control.PutStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutStorageLensConfigurationTaggingResult putStorageLensConfigurationTagging(PutStorageLensConfigurationTaggingRequest request) {
        request = beforeClientExecution(request);
        return executePutStorageLensConfigurationTagging(request);
    }

    @SdkInternalApi
    final PutStorageLensConfigurationTaggingResult executePutStorageLensConfigurationTagging(
            PutStorageLensConfigurationTaggingRequest putStorageLensConfigurationTaggingRequest) {

        ExecutionContext executionContext = createExecutionContext(putStorageLensConfigurationTaggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutStorageLensConfigurationTaggingRequest> request = null;
        Response<PutStorageLensConfigurationTaggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutStorageLensConfigurationTaggingRequestMarshaller()
                        .marshall(super.beforeMarshalling(putStorageLensConfigurationTaggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutStorageLensConfigurationTagging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(putStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(putStorageLensConfigurationTaggingRequest.getAccountId(), "AccountId",
                        "putStorageLensConfigurationTaggingRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", putStorageLensConfigurationTaggingRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<PutStorageLensConfigurationTaggingResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<PutStorageLensConfigurationTaggingResult>(
                    new PutStorageLensConfigurationTaggingResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing S3 Batch Operations job's priority. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobPriorityRequest
     * @return Result of the UpdateJobPriority operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws InternalServiceException
     * @sample AWSS3Control.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateJobPriorityResult updateJobPriority(UpdateJobPriorityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobPriority(request);
    }

    @SdkInternalApi
    final UpdateJobPriorityResult executeUpdateJobPriority(UpdateJobPriorityRequest updateJobPriorityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobPriorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobPriorityRequest> request = null;
        Response<UpdateJobPriorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobPriorityRequestMarshaller().marshall(super.beforeMarshalling(updateJobPriorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobPriority");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(updateJobPriorityRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(updateJobPriorityRequest.getAccountId(), "AccountId", "updateJobPriorityRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", updateJobPriorityRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UpdateJobPriorityResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UpdateJobPriorityResult>(
                    new UpdateJobPriorityResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status for the specified job. Use this action to confirm that you want to run a job or to cancel an
     * existing job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobStatusRequest
     * @return Result of the UpdateJobStatus operation returned by the service.
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws JobStatusException
     * @throws InternalServiceException
     * @sample AWSS3Control.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJobStatusResult updateJobStatus(UpdateJobStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobStatus(request);
    }

    @SdkInternalApi
    final UpdateJobStatusResult executeUpdateJobStatus(UpdateJobStatusRequest updateJobStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobStatusRequest> request = null;
        Response<UpdateJobStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobStatusRequestMarshaller().marshall(super.beforeMarshalling(updateJobStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "S3 Control");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {
                ValidationUtils.assertStringNotEmpty(updateJobStatusRequest.getAccountId(), "AccountId");
                HostnameValidator.validateHostnameCompliant(updateJobStatusRequest.getAccountId(), "AccountId", "updateJobStatusRequest");

                String hostPrefix = "{AccountId}.";
                String resolvedHostPrefix = String.format("%s.", updateJobStatusRequest.getAccountId());

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            StaxResponseHandler<UpdateJobStatusResult> responseHandler = new com.amazonaws.services.s3control.internal.S3ControlStaxResponseHandler<UpdateJobStatusResult>(
                    new UpdateJobStatusResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

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
    public com.amazonaws.services.s3control.S3ControlResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        ResponseMetadata metadata = client.getResponseMetadataForRequest(request);
        if (metadata != null)
            return new com.amazonaws.services.s3control.S3ControlResponseMetadata(metadata);
        else
            return null;
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
