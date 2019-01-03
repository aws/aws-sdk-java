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
 * You can use Code Signing for Amazon FreeRTOS (AWS Signer) to sign code that you created for any of the IoT devices
 * that Amazon Web Services supports. AWS Signer is integrated with Amazon FreeRTOS, AWS Certificate Manager, and AWS
 * CloudTrail. Amazon FreeRTOS customers can use AWS Signer to sign code images before making them available for
 * microcontrollers. You can use ACM to import third-party certificates to be used by AWS Signer. For general
 * information about using AWS Signer, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">Code Signing for Amazon FreeRTOS
 * Developer Guide</a>.
 * </p>
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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.signer.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.signer.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withModeledClass(
                                    com.amazonaws.services.signer.model.InternalServiceErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.signer.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.signer.model.ThrottlingException.class))
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
     * @throws ThrottlingException
     *         The signing job has been throttled.
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
     * @throws ThrottlingException
     *         The signing job has been throttled.
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
     * Lists all your signing jobs. You can use the <code>maxResults</code> parameter to limit the number of signing
     * jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a
     * <code>nextToken</code> value. Use this value in subsequent calls to <code>ListSigningJobs</code> to fetch the
     * remaining values. You can continue calling <code>ListSigningJobs</code> with your <code>maxResults</code>
     * parameter and with new values that AWS Signer returns in the <code>nextToken</code> parameter until all of your
     * signing jobs have been returned.
     * </p>
     * 
     * @param listSigningJobsRequest
     * @return Result of the ListSigningJobs operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
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
     * Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain
     * to be listed, AWS Signer returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that AWS Signer returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningPlatformsRequest
     * @return Result of the ListSigningPlatforms operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
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
     * remain to be listed, AWS Signer returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that AWS Signer returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningProfilesRequest
     * @return Result of the ListSigningProfiles operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
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
     * Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a
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
     * @throws ThrottlingException
     *         The signing job has been throttled.
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
     * You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.
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
     * You must also specify a request token that identifies your request to AWS Signer.
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
     *         The signing job has been throttled.
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
