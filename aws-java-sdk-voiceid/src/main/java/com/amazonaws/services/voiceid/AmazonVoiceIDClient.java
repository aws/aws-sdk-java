/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.voiceid;

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

import com.amazonaws.services.voiceid.AmazonVoiceIDClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.voiceid.model.*;
import com.amazonaws.services.voiceid.model.transform.*;

/**
 * Client for accessing Amazon Voice ID. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Connect Voice ID provides real-time caller authentication and fraud screening. This guide describes the APIs
 * used for this service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonVoiceIDClient extends AmazonWebServiceClient implements AmazonVoiceID {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonVoiceID.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "voiceid";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.voiceid.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.voiceid.model.AmazonVoiceIDException.class));

    public static AmazonVoiceIDClientBuilder builder() {
        return AmazonVoiceIDClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Voice ID using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonVoiceIDClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Voice ID using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonVoiceIDClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("voiceid.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/voiceid/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/voiceid/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers, fraudsters, customer audio,
     * and voiceprints.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified domain from Voice ID.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified fraudster from Voice ID.
     * </p>
     * 
     * @param deleteFraudsterRequest
     * @return Result of the DeleteFraudster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DeleteFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFraudsterResult deleteFraudster(DeleteFraudsterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFraudster(request);
    }

    @SdkInternalApi
    final DeleteFraudsterResult executeDeleteFraudster(DeleteFraudsterRequest deleteFraudsterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFraudsterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFraudsterRequest> request = null;
        Response<DeleteFraudsterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFraudsterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFraudsterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFraudster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFraudsterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFraudsterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified speaker from Voice ID.
     * </p>
     * 
     * @param deleteSpeakerRequest
     * @return Result of the DeleteSpeaker operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DeleteSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSpeakerResult deleteSpeaker(DeleteSpeakerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSpeaker(request);
    }

    @SdkInternalApi
    final DeleteSpeakerResult executeDeleteSpeaker(DeleteSpeakerRequest deleteSpeakerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSpeakerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSpeakerRequest> request = null;
        Response<DeleteSpeakerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSpeakerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSpeakerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSpeaker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSpeakerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSpeakerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomain(request);
    }

    @SdkInternalApi
    final DescribeDomainResult executeDescribeDomain(DescribeDomainRequest describeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified fraudster.
     * </p>
     * 
     * @param describeFraudsterRequest
     * @return Result of the DescribeFraudster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeFraudster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFraudsterResult describeFraudster(DescribeFraudsterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFraudster(request);
    }

    @SdkInternalApi
    final DescribeFraudsterResult executeDescribeFraudster(DescribeFraudsterRequest describeFraudsterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFraudsterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFraudsterRequest> request = null;
        Response<DescribeFraudsterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFraudsterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFraudsterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFraudster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFraudsterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFraudsterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified fraudster registration job.
     * </p>
     * 
     * @param describeFraudsterRegistrationJobRequest
     * @return Result of the DescribeFraudsterRegistrationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFraudsterRegistrationJobResult describeFraudsterRegistrationJob(DescribeFraudsterRegistrationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFraudsterRegistrationJob(request);
    }

    @SdkInternalApi
    final DescribeFraudsterRegistrationJobResult executeDescribeFraudsterRegistrationJob(
            DescribeFraudsterRegistrationJobRequest describeFraudsterRegistrationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFraudsterRegistrationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFraudsterRegistrationJobRequest> request = null;
        Response<DescribeFraudsterRegistrationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFraudsterRegistrationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFraudsterRegistrationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFraudsterRegistrationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFraudsterRegistrationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFraudsterRegistrationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified speaker.
     * </p>
     * 
     * @param describeSpeakerRequest
     * @return Result of the DescribeSpeaker operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSpeakerResult describeSpeaker(DescribeSpeakerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSpeaker(request);
    }

    @SdkInternalApi
    final DescribeSpeakerResult executeDescribeSpeaker(DescribeSpeakerRequest describeSpeakerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSpeakerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSpeakerRequest> request = null;
        Response<DescribeSpeakerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSpeakerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSpeakerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSpeaker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSpeakerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSpeakerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified speaker enrollment job.
     * </p>
     * 
     * @param describeSpeakerEnrollmentJobRequest
     * @return Result of the DescribeSpeakerEnrollmentJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.DescribeSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSpeakerEnrollmentJobResult describeSpeakerEnrollmentJob(DescribeSpeakerEnrollmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSpeakerEnrollmentJob(request);
    }

    @SdkInternalApi
    final DescribeSpeakerEnrollmentJobResult executeDescribeSpeakerEnrollmentJob(DescribeSpeakerEnrollmentJobRequest describeSpeakerEnrollmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSpeakerEnrollmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSpeakerEnrollmentJobRequest> request = null;
        Response<DescribeSpeakerEnrollmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSpeakerEnrollmentJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSpeakerEnrollmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSpeakerEnrollmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSpeakerEnrollmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSpeakerEnrollmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Evaluates a specified session based on audio data accumulated during a streaming Amazon Connect Voice ID call.
     * </p>
     * 
     * @param evaluateSessionRequest
     * @return Result of the EvaluateSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.EvaluateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EvaluateSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EvaluateSessionResult evaluateSession(EvaluateSessionRequest request) {
        request = beforeClientExecution(request);
        return executeEvaluateSession(request);
    }

    @SdkInternalApi
    final EvaluateSessionResult executeEvaluateSession(EvaluateSessionRequest evaluateSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(evaluateSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EvaluateSessionRequest> request = null;
        Response<EvaluateSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EvaluateSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(evaluateSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EvaluateSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EvaluateSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EvaluateSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the domains in the Amazon Web Services account.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the fraudster registration jobs in the domain with the given <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all fraudster registration jobs in the given domain.
     * </p>
     * 
     * @param listFraudsterRegistrationJobsRequest
     * @return Result of the ListFraudsterRegistrationJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListFraudsterRegistrationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsterRegistrationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFraudsterRegistrationJobsResult listFraudsterRegistrationJobs(ListFraudsterRegistrationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListFraudsterRegistrationJobs(request);
    }

    @SdkInternalApi
    final ListFraudsterRegistrationJobsResult executeListFraudsterRegistrationJobs(ListFraudsterRegistrationJobsRequest listFraudsterRegistrationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFraudsterRegistrationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFraudsterRegistrationJobsRequest> request = null;
        Response<ListFraudsterRegistrationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFraudsterRegistrationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFraudsterRegistrationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFraudsterRegistrationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFraudsterRegistrationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFraudsterRegistrationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the speaker enrollment jobs in the domain with the specified <code>JobStatus</code>. If
     * <code>JobStatus</code> is not provided, this lists all jobs with all possible speaker enrollment job statuses.
     * </p>
     * 
     * @param listSpeakerEnrollmentJobsRequest
     * @return Result of the ListSpeakerEnrollmentJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListSpeakerEnrollmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakerEnrollmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSpeakerEnrollmentJobsResult listSpeakerEnrollmentJobs(ListSpeakerEnrollmentJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListSpeakerEnrollmentJobs(request);
    }

    @SdkInternalApi
    final ListSpeakerEnrollmentJobsResult executeListSpeakerEnrollmentJobs(ListSpeakerEnrollmentJobsRequest listSpeakerEnrollmentJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSpeakerEnrollmentJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSpeakerEnrollmentJobsRequest> request = null;
        Response<ListSpeakerEnrollmentJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSpeakerEnrollmentJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSpeakerEnrollmentJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSpeakerEnrollmentJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSpeakerEnrollmentJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSpeakerEnrollmentJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all speakers in a specified domain.
     * </p>
     * 
     * @param listSpeakersRequest
     * @return Result of the ListSpeakers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListSpeakers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListSpeakers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSpeakersResult listSpeakers(ListSpeakersRequest request) {
        request = beforeClientExecution(request);
        return executeListSpeakers(request);
    }

    @SdkInternalApi
    final ListSpeakersResult executeListSpeakers(ListSpeakersRequest listSpeakersRequest) {

        ExecutionContext executionContext = createExecutionContext(listSpeakersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSpeakersRequest> request = null;
        Response<ListSpeakersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSpeakersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSpeakersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSpeakers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSpeakersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSpeakersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with a specified Voice ID resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
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
     * Opts out a speaker from Voice ID. A speaker can be opted out regardless of whether or not they already exist in
     * Voice ID. If they don't yet exist, a new speaker is created in an opted out state. If they already exist, their
     * existing status is overridden and they are opted out. Enrollment and evaluation authentication requests are
     * rejected for opted out speakers, and opted out speakers have no voice embeddings stored in Voice ID.
     * </p>
     * 
     * @param optOutSpeakerRequest
     * @return Result of the OptOutSpeaker operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.OptOutSpeaker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/OptOutSpeaker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public OptOutSpeakerResult optOutSpeaker(OptOutSpeakerRequest request) {
        request = beforeClientExecution(request);
        return executeOptOutSpeaker(request);
    }

    @SdkInternalApi
    final OptOutSpeakerResult executeOptOutSpeaker(OptOutSpeakerRequest optOutSpeakerRequest) {

        ExecutionContext executionContext = createExecutionContext(optOutSpeakerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OptOutSpeakerRequest> request = null;
        Response<OptOutSpeakerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new OptOutSpeakerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(optOutSpeakerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "OptOutSpeaker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<OptOutSpeakerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new OptOutSpeakerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new batch fraudster registration job using provided details.
     * </p>
     * 
     * @param startFraudsterRegistrationJobRequest
     * @return Result of the StartFraudsterRegistrationJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.StartFraudsterRegistrationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartFraudsterRegistrationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartFraudsterRegistrationJobResult startFraudsterRegistrationJob(StartFraudsterRegistrationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartFraudsterRegistrationJob(request);
    }

    @SdkInternalApi
    final StartFraudsterRegistrationJobResult executeStartFraudsterRegistrationJob(StartFraudsterRegistrationJobRequest startFraudsterRegistrationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startFraudsterRegistrationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFraudsterRegistrationJobRequest> request = null;
        Response<StartFraudsterRegistrationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFraudsterRegistrationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startFraudsterRegistrationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFraudsterRegistrationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFraudsterRegistrationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartFraudsterRegistrationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new batch speaker enrollment job using specified details.
     * </p>
     * 
     * @param startSpeakerEnrollmentJobRequest
     * @return Result of the StartSpeakerEnrollmentJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service quota. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#voiceid-quotas"
     *         >Voice ID Service Quotas</a> and try your request again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.StartSpeakerEnrollmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/StartSpeakerEnrollmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSpeakerEnrollmentJobResult startSpeakerEnrollmentJob(StartSpeakerEnrollmentJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartSpeakerEnrollmentJob(request);
    }

    @SdkInternalApi
    final StartSpeakerEnrollmentJobResult executeStartSpeakerEnrollmentJob(StartSpeakerEnrollmentJobRequest startSpeakerEnrollmentJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startSpeakerEnrollmentJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSpeakerEnrollmentJobRequest> request = null;
        Response<StartSpeakerEnrollmentJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSpeakerEnrollmentJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSpeakerEnrollmentJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSpeakerEnrollmentJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSpeakerEnrollmentJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSpeakerEnrollmentJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a Voice ID resource with the provided list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
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
     * Removes specified tags from a specified Amazon Connect Voice ID resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
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
     * <p>
     * Updates the specified domain. This API has clobber behavior, and clears and replaces all attributes. If an
     * optional field, such as 'Description' is not provided, it is removed from the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more
     *         details.
     * @throws ValidationException
     *         The request failed one or more validations; check the error message for more details.
     * @throws ConflictException
     *         The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more
     *         details.
     * @throws InternalServerException
     *         The request failed due to an unknown error on the server side.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please slow down your request rate. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html##voiceid-api-quotas"
     *         > Amazon Connect Voice ID Service API throttling quotas </a> and try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action. Check the error message and try again.
     * @sample AmazonVoiceID.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDomainResult updateDomain(UpdateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomain(request);
    }

    @SdkInternalApi
    final UpdateDomainResult executeUpdateDomain(UpdateDomainRequest updateDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainRequest> request = null;
        Response<UpdateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Voice ID");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainResultJsonUnmarshaller());
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
    public void shutdown() {
        super.shutdown();
    }

}
