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
package com.amazonaws.services.signer;

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

import com.amazonaws.services.signer.AWSsignerClientBuilder;
import com.amazonaws.services.signer.waiters.AWSsignerWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.services.signer.model.transform.*;

/**
 * Client for accessing signer. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * AWS Signer is a fully managed code signing service to help you ensure the trust and integrity of your code.
 * </p>
 * <p>
 * AWS Signer supports the following applications:
 * </p>
 * <p>
 * With <i>code signing for AWS Lambda</i>, you can sign AWS Lambda deployment packages. Integrated support is provided
 * for Amazon S3, Amazon CloudWatch, and AWS CloudTrail. In order to sign code, you create a signing profile and then
 * use Signer to sign Lambda zip files in S3.
 * </p>
 * <p>
 * With <i>code signing for IoT</i>, you can sign code for any IoT device that is supported by AWS. IoT code signing is
 * available for <a href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and is integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * import a third-party code signing certificate using ACM, and use that to sign updates in Amazon FreeRTOS and AWS IoT
 * Device Management.
 * </p>
 * <p>
 * For more information about AWS Signer, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">AWS Signer Developer Guide</a>.
 * </p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSsignerClient extends AmazonWebServiceClient implements AWSsigner {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSsigner.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "signer";

    private volatile AWSsignerWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.ServiceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.signer.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.signer.model.AWSsignerException.class));

    public static AWSsignerClientBuilder builder() {
        return AWSsignerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on signer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSsignerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on signer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSsignerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("signer.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/signer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/signer/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds cross-account permissions to a signing profile.
     * </p>
     * 
     * @param addProfilePermissionRequest
     * @return Result of the AddProfilePermission operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceLimitExceededException
     *         The client is making a request that exceeds service limits.
     * @throws ConflictException
     *         The resource encountered a conflicting state.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.AddProfilePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/AddProfilePermission" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AddProfilePermissionResult addProfilePermission(AddProfilePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAddProfilePermission(request);
    }

    @SdkInternalApi
    final AddProfilePermissionResult executeAddProfilePermission(AddProfilePermissionRequest addProfilePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(addProfilePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddProfilePermissionRequest> request = null;
        Response<AddProfilePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddProfilePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addProfilePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddProfilePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddProfilePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddProfilePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the state of an <code>ACTIVE</code> signing profile to <code>CANCELED</code>. A canceled profile is still
     * viewable with the <code>ListSigningProfiles</code> operation, but it cannot perform new signing jobs, and is
     * deleted two years after cancelation.
     * </p>
     * 
     * @param cancelSigningProfileRequest
     * @return Result of the CancelSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.CancelSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/CancelSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelSigningProfileResult cancelSigningProfile(CancelSigningProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSigningProfile(request);
    }

    @SdkInternalApi
    final CancelSigningProfileResult executeCancelSigningProfile(CancelSigningProfileRequest cancelSigningProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSigningProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSigningProfileRequest> request = null;
        Response<CancelSigningProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSigningProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelSigningProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSigningProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSigningProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelSigningProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific code signing job. You specify the job by using the <code>jobId</code> value
     * that is returned by the <a>StartSigningJob</a> operation.
     * </p>
     * 
     * @param describeSigningJobRequest
     * @return Result of the DescribeSigningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.DescribeSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/DescribeSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSigningJobResult describeSigningJob(DescribeSigningJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSigningJob(request);
    }

    @SdkInternalApi
    final DescribeSigningJobResult executeDescribeSigningJob(DescribeSigningJobRequest describeSigningJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSigningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSigningJobRequest> request = null;
        Response<DescribeSigningJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSigningJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSigningJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSigningJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSigningJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSigningJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information on a specific signing platform.
     * </p>
     * 
     * @param getSigningPlatformRequest
     * @return Result of the GetSigningPlatform operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.GetSigningPlatform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningPlatform" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSigningPlatformResult getSigningPlatform(GetSigningPlatformRequest request) {
        request = beforeClientExecution(request);
        return executeGetSigningPlatform(request);
    }

    @SdkInternalApi
    final GetSigningPlatformResult executeGetSigningPlatform(GetSigningPlatformRequest getSigningPlatformRequest) {

        ExecutionContext executionContext = createExecutionContext(getSigningPlatformRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSigningPlatformRequest> request = null;
        Response<GetSigningPlatformResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSigningPlatformRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSigningPlatformRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSigningPlatform");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSigningPlatformResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSigningPlatformResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information on a specific signing profile.
     * </p>
     * 
     * @param getSigningProfileRequest
     * @return Result of the GetSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.GetSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSigningProfileResult getSigningProfile(GetSigningProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetSigningProfile(request);
    }

    @SdkInternalApi
    final GetSigningProfileResult executeGetSigningProfile(GetSigningProfileRequest getSigningProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getSigningProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSigningProfileRequest> request = null;
        Response<GetSigningProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSigningProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSigningProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSigningProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSigningProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSigningProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the cross-account permissions associated with a signing profile.
     * </p>
     * 
     * @param listProfilePermissionsRequest
     * @return Result of the ListProfilePermissions operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListProfilePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListProfilePermissions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListProfilePermissionsResult listProfilePermissions(ListProfilePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListProfilePermissions(request);
    }

    @SdkInternalApi
    final ListProfilePermissionsResult executeListProfilePermissions(ListProfilePermissionsRequest listProfilePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfilePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfilePermissionsRequest> request = null;
        Response<ListProfilePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfilePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfilePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfilePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfilePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProfilePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all your signing jobs. You can use the <code>maxResults</code> parameter to limit the number of signing
     * jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a
     * <code>nextToken</code> value. Use this value in subsequent calls to <code>ListSigningJobs</code> to fetch the
     * remaining values. You can continue calling <code>ListSigningJobs</code> with your <code>maxResults</code>
     * parameter and with new values that code signing returns in the <code>nextToken</code> parameter until all of your
     * signing jobs have been returned.
     * </p>
     * 
     * @param listSigningJobsRequest
     * @return Result of the ListSigningJobs operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSigningJobsResult listSigningJobs(ListSigningJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListSigningJobs(request);
    }

    @SdkInternalApi
    final ListSigningJobsResult executeListSigningJobs(ListSigningJobsRequest listSigningJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSigningJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSigningJobsRequest> request = null;
        Response<ListSigningJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSigningJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSigningJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSigningJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSigningJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSigningJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all signing platforms available in code signing that match the request parameters. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningPlatformsRequest
     * @return Result of the ListSigningPlatforms operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningPlatforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSigningPlatformsResult listSigningPlatforms(ListSigningPlatformsRequest request) {
        request = beforeClientExecution(request);
        return executeListSigningPlatforms(request);
    }

    @SdkInternalApi
    final ListSigningPlatformsResult executeListSigningPlatforms(ListSigningPlatformsRequest listSigningPlatformsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSigningPlatformsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSigningPlatformsRequest> request = null;
        Response<ListSigningPlatformsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSigningPlatformsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSigningPlatformsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSigningPlatforms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSigningPlatformsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSigningPlatformsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available signing profiles in your AWS account. Returns only profiles with an <code>ACTIVE</code>
     * status unless the <code>includeCanceled</code> request field is set to <code>true</code>. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningProfilesRequest
     * @return Result of the ListSigningProfiles operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSigningProfilesResult listSigningProfiles(ListSigningProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListSigningProfiles(request);
    }

    @SdkInternalApi
    final ListSigningProfilesResult executeListSigningProfiles(ListSigningProfilesRequest listSigningProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSigningProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSigningProfilesRequest> request = null;
        Response<ListSigningProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSigningProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSigningProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSigningProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSigningProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSigningProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags associated with a signing profile resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @sample AWSsigner.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
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
     * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a
     * pre-defined signing job. For more information, see <a
     * href="http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html"
     * >http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html</a>
     * </p>
     * 
     * @param putSigningProfileRequest
     * @return Result of the PutSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.PutSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSigningProfileResult putSigningProfile(PutSigningProfileRequest request) {
        request = beforeClientExecution(request);
        return executePutSigningProfile(request);
    }

    @SdkInternalApi
    final PutSigningProfileResult executePutSigningProfile(PutSigningProfileRequest putSigningProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(putSigningProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSigningProfileRequest> request = null;
        Response<PutSigningProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSigningProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSigningProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSigningProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSigningProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSigningProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes cross-account permissions from a signing profile.
     * </p>
     * 
     * @param removeProfilePermissionRequest
     * @return Result of the RemoveProfilePermission operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The resource encountered a conflicting state.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.RemoveProfilePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RemoveProfilePermission" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveProfilePermissionResult removeProfilePermission(RemoveProfilePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveProfilePermission(request);
    }

    @SdkInternalApi
    final RemoveProfilePermissionResult executeRemoveProfilePermission(RemoveProfilePermissionRequest removeProfilePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(removeProfilePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveProfilePermissionRequest> request = null;
        Response<RemoveProfilePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveProfilePermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeProfilePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveProfilePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveProfilePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveProfilePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the state of a signing job to REVOKED. This indicates that the signature is no longer valid.
     * </p>
     * 
     * @param revokeSignatureRequest
     * @return Result of the RevokeSignature operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.RevokeSignature
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RevokeSignature" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RevokeSignatureResult revokeSignature(RevokeSignatureRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeSignature(request);
    }

    @SdkInternalApi
    final RevokeSignatureResult executeRevokeSignature(RevokeSignatureRequest revokeSignatureRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeSignatureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeSignatureRequest> request = null;
        Response<RevokeSignatureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeSignatureRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeSignatureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeSignature");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeSignatureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeSignatureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the state of a signing profile to REVOKED. This indicates that signatures generated using the signing
     * profile after an effective start date are no longer valid.
     * </p>
     * 
     * @param revokeSigningProfileRequest
     * @return Result of the RevokeSigningProfile operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.RevokeSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RevokeSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RevokeSigningProfileResult revokeSigningProfile(RevokeSigningProfileRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeSigningProfile(request);
    }

    @SdkInternalApi
    final RevokeSigningProfileResult executeRevokeSigningProfile(RevokeSigningProfileRequest revokeSigningProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeSigningProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeSigningProfileRequest> request = null;
        Response<RevokeSigningProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeSigningProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeSigningProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeSigningProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeSigningProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeSigningProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
     * <code>ListSigningJobs</code> operation for two years after they are performed. Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create an Amazon S3 source bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/gsg/CreatingABucket.html">Create a Bucket</a> in the <i>Amazon
     * S3 Getting Started Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your S3 source bucket must be version enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify the name of the source and destination buckets when calling the <code>StartSigningJob</code>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also specify a request token that identifies your request to code signing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call the <a>DescribeSigningJob</a> and the <a>ListSigningJobs</a> actions after you call
     * <code>StartSigningJob</code>.
     * </p>
     * <p>
     * For a Java example that shows how to use this action, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/">http://docs.aws.amazon.com/acm/latest/userguide/</a>
     * </p>
     * 
     * @param startSigningJobRequest
     * @return Result of the StartSigningJob operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         Instead of this error, <code>TooManyRequestsException</code> should be used.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.
     *         </p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.StartSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartSigningJobResult startSigningJob(StartSigningJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartSigningJob(request);
    }

    @SdkInternalApi
    final StartSigningJobResult executeStartSigningJob(StartSigningJobRequest startSigningJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startSigningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSigningJobRequest> request = null;
        Response<StartSigningJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSigningJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSigningJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSigningJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSigningJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSigningJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. To specify the signing profile, use its Amazon
     * Resource Name (ARN). To specify the tag, use a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @sample AWSsigner.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
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
     * Removes one or more tags from a signing profile. To remove the tags, specify a list of tag keys.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @throws TooManyRequestsException
     *         The allowed number of job-signing requests has been exceeded.</p>
     *         <p>
     *         This error supersedes the error <code>ThrottlingException</code>.
     * @sample AWSsigner.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "signer");
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
    public AWSsignerWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSsignerWaiters(this);
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
