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
package com.amazonaws.services.mediaconvert;

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

import com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.services.mediaconvert.model.transform.*;

/**
 * Client for accessing MediaConvert. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * AWS Elemental MediaConvert
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaConvertClient extends AmazonWebServiceClient implements AWSMediaConvert {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaConvert.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediaconvert";

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
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.mediaconvert.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.mediaconvert.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.mediaconvert.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.mediaconvert.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.mediaconvert.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.mediaconvert.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediaconvert.model.AWSMediaConvertException.class));

    public static AWSMediaConvertClientBuilder builder() {
        return AWSMediaConvertClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on MediaConvert using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaConvertClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on MediaConvert using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaConvertClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mediaconvert.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediaconvert/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediaconvert/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
     * 
     * @param associateCertificateRequest
     * @return Result of the AssociateCertificate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested does not exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service could not complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.AssociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AssociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateCertificateResult associateCertificate(AssociateCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateCertificate(request);
    }

    @SdkInternalApi
    final AssociateCertificateResult executeAssociateCertificate(AssociateCertificateRequest associateCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(associateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCertificateRequest> request = null;
        Response<AssociateCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Permanently cancel a job. Once you have canceled a job, you can't start it again.
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CancelJob" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Create a new transcoding job. For information about jobs and job settings, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJob" target="_top">AWS API
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
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Create a new job template. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobTemplateRequest
     * @return Result of the CreateJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateJobTemplateResult createJobTemplate(CreateJobTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJobTemplate(request);
    }

    @SdkInternalApi
    final CreateJobTemplateResult executeCreateJobTemplate(CreateJobTemplateRequest createJobTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobTemplateRequest> request = null;
        Response<CreateJobTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJobTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a new preset. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createPresetRequest
     * @return Result of the CreatePreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreatePreset" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateQueueResult createQueue(CreateQueueRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQueue(request);
    }

    @SdkInternalApi
    final CreateQueueResult executeCreateQueue(CreateQueueRequest createQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Permanently delete a job template you have created.
     * 
     * @param deleteJobTemplateRequest
     * @return Result of the DeleteJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DeleteJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteJobTemplateResult deleteJobTemplate(DeleteJobTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJobTemplate(request);
    }

    @SdkInternalApi
    final DeleteJobTemplateResult executeDeleteJobTemplate(DeleteJobTemplateRequest deleteJobTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobTemplateRequest> request = null;
        Response<DeleteJobTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJobTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Permanently delete a preset you have created.
     * 
     * @param deletePresetRequest
     * @return Result of the DeletePreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DeletePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeletePreset" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Permanently delete a queue you have created.
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteQueueResult deleteQueue(DeleteQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueue(request);
    }

    @SdkInternalApi
    final DeleteQueueResult executeDeleteQueue(DeleteQueueRequest deleteQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<DeleteQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
     * 
     * @param describeEndpointsRequest
     *        DescribeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServerErrorException
     *         InternalServiceException
     * @throws ForbiddenException
     *         AccessDeniedException
     * @throws NotFoundException
     *         ResourceNotFoundException
     * @throws TooManyRequestsException
     *         LimitExceededException
     * @throws ConflictException
     *         ResourceInUseException
     * @sample AWSMediaConvert.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DescribeEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpoints(request);
    }

    @SdkInternalApi
    final DescribeEndpointsResult executeDescribeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
     * an AWS Elemental MediaConvert resource.
     * 
     * @param disassociateCertificateRequest
     * @return Result of the DisassociateCertificate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and cannot fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested does not exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service could not complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.DisassociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DisassociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateCertificateResult disassociateCertificate(DisassociateCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateCertificate(request);
    }

    @SdkInternalApi
    final DisassociateCertificateResult executeDisassociateCertificate(DisassociateCertificateRequest disassociateCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCertificateRequest> request = null;
        Response<DisassociateCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve the JSON for a specific completed transcoding job.
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobResult getJob(GetJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetJob(request);
    }

    @SdkInternalApi
    final GetJobResult executeGetJob(GetJobRequest getJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve the JSON for a specific job template.
     * 
     * @param getJobTemplateRequest
     * @return Result of the GetJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetJobTemplateResult getJobTemplate(GetJobTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobTemplate(request);
    }

    @SdkInternalApi
    final GetJobTemplateResult executeGetJobTemplate(GetJobTemplateRequest getJobTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobTemplateRequest> request = null;
        Response<GetJobTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve the JSON for a specific preset.
     * 
     * @param getPresetRequest
     * @return Result of the GetPreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetPreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetPreset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPresetResult getPreset(GetPresetRequest request) {
        request = beforeClientExecution(request);
        return executeGetPreset(request);
    }

    @SdkInternalApi
    final GetPresetResult executeGetPreset(GetPresetRequest getPresetRequest) {

        ExecutionContext executionContext = createExecutionContext(getPresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPresetRequest> request = null;
        Response<GetPresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPresetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPreset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPresetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPresetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve the JSON for a specific queue.
     * 
     * @param getQueueRequest
     * @return Result of the GetQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueueResult getQueue(GetQueueRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueue(request);
    }

    @SdkInternalApi
    final GetQueueResult executeGetQueue(GetQueueRequest getQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueRequest> request = null;
        Response<GetQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueueResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
     * a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
     * 
     * @param listJobTemplatesRequest
     * @return Result of the ListJobTemplates operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListJobTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListJobTemplatesResult listJobTemplates(ListJobTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListJobTemplates(request);
    }

    @SdkInternalApi
    final ListJobTemplatesResult executeListJobTemplates(ListJobTemplatesRequest listJobTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobTemplatesRequest> request = null;
        Response<ListJobTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
     * completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
     * twenty next most recent jobs, use the nextToken string returned with the array.
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobs" target="_top">AWS API
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
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
     * of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
     * 
     * @param listPresetsRequest
     * @return Result of the ListPresets operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListPresets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListPresets" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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

    /**
     * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
     * them. To retrieve the next twenty queues, use the nextToken string returned with the array.
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueuesResult listQueues(ListQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeListQueues(request);
    }

    @SdkInternalApi
    final ListQueuesResult executeListQueues(ListQueuesRequest listQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueuesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Retrieve the tags for a MediaConvert resource.
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
     * at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
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
     * Modify one of your existing job templates.
     * 
     * @param updateJobTemplateRequest
     * @return Result of the UpdateJobTemplate operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UpdateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateJobTemplateResult updateJobTemplate(UpdateJobTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobTemplate(request);
    }

    @SdkInternalApi
    final UpdateJobTemplateResult executeUpdateJobTemplate(UpdateJobTemplateRequest updateJobTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobTemplateRequest> request = null;
        Response<UpdateJobTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Modify one of your existing presets.
     * 
     * @param updatePresetRequest
     * @return Result of the UpdatePreset operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UpdatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePresetResult updatePreset(UpdatePresetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePreset(request);
    }

    @SdkInternalApi
    final UpdatePresetResult executeUpdatePreset(UpdatePresetRequest updatePresetRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePresetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePresetRequest> request = null;
        Response<UpdatePresetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePresetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePresetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePreset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePresetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePresetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Modify one of your existing queues.
     * 
     * @param updateQueueRequest
     * @return Result of the UpdateQueue operation returned by the service.
     * @throws BadRequestException
     *         The service can't process your request because of a problem in the request. Please check your request
     *         form and syntax.
     * @throws InternalServerErrorException
     *         The service encountered an unexpected condition and can't fulfill your request.
     * @throws ForbiddenException
     *         You don't have permissions for this action with the credentials you sent.
     * @throws NotFoundException
     *         The resource you requested doesn't exist.
     * @throws TooManyRequestsException
     *         Too many requests have been sent in too short of a time. The service limits the rate at which it will
     *         accept requests.
     * @throws ConflictException
     *         The service couldn't complete your request because there is a conflict with the current state of the
     *         resource.
     * @sample AWSMediaConvert.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateQueueResult updateQueue(UpdateQueueRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueue(request);
    }

    @SdkInternalApi
    final UpdateQueueResult executeUpdateQueue(UpdateQueueRequest updateQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueRequest> request = null;
        Response<UpdateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaConvert");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateQueueResultJsonUnmarshaller());
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

}
