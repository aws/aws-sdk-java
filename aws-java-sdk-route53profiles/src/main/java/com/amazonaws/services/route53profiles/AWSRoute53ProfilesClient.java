/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53profiles;

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

import com.amazonaws.services.route53profiles.AWSRoute53ProfilesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.route53profiles.model.*;

import com.amazonaws.services.route53profiles.model.transform.*;

/**
 * Client for accessing Route 53 Profiles. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * With Amazon Route 53 Profiles you can share Route 53 configurations with VPCs and AWS accounts
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53ProfilesClient extends AmazonWebServiceClient implements AWSRoute53Profiles {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRoute53Profiles.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53profiles";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.ResourceExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53profiles.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.route53profiles.model.AWSRoute53ProfilesException.class));

    public static AWSRoute53ProfilesClientBuilder builder() {
        return AWSRoute53ProfilesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 Profiles using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53ProfilesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 Profiles using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53ProfilesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("route53profiles.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/route53profiles/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/route53profiles/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a Route 53 Profiles profile with a VPC. A VPC can have only one Profile associated with it, but a
     * Profile can be associated with 1000 of VPCs (and you can request a higher quota). For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities">https://
     * docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities</a>.
     * </p>
     * 
     * @param associateProfileRequest
     * @return Result of the AssociateProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ResourceExistsException
     *         The resource you are trying to associate, has already been associated.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.AssociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateProfileResult associateProfile(AssociateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateProfile(request);
    }

    @SdkInternalApi
    final AssociateProfileResult executeAssociateProfile(AssociateProfileRequest associateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(associateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateProfileRequest> request = null;
        Response<AssociateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a DNS reource configuration to a Route 53 Profile.
     * </p>
     * 
     * @param associateResourceToProfileRequest
     * @return Result of the AssociateResourceToProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.AssociateResourceToProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateResourceToProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateResourceToProfileResult associateResourceToProfile(AssociateResourceToProfileRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResourceToProfile(request);
    }

    @SdkInternalApi
    final AssociateResourceToProfileResult executeAssociateResourceToProfile(AssociateResourceToProfileRequest associateResourceToProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResourceToProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceToProfileRequest> request = null;
        Response<AssociateResourceToProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceToProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateResourceToProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResourceToProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResourceToProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateResourceToProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty Route 53 Profile.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateProfileResult createProfile(CreateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfile(request);
    }

    @SdkInternalApi
    final CreateProfileResult executeCreateProfile(CreateProfileRequest createProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileRequest> request = null;
        Response<CreateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Route 53 Profile. Before you can delete a profile, you must first disassociate it from all
     * VPCs.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfile(request);
    }

    @SdkInternalApi
    final DeleteProfileResult executeDeleteProfile(DeleteProfileRequest deleteProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileRequest> request = null;
        Response<DeleteProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dissociates a specified Route 53 Profile from the specified VPC.
     * </p>
     * 
     * @param disassociateProfileRequest
     * @return Result of the DisassociateProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.DisassociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateProfileResult disassociateProfile(DisassociateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateProfile(request);
    }

    @SdkInternalApi
    final DisassociateProfileResult executeDisassociateProfile(DisassociateProfileRequest disassociateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateProfileRequest> request = null;
        Response<DisassociateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dissoaciated a specified resource, from the Route 53 Profile.
     * </p>
     * 
     * @param disassociateResourceFromProfileRequest
     * @return Result of the DisassociateResourceFromProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.DisassociateResourceFromProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateResourceFromProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResourceFromProfileResult disassociateResourceFromProfile(DisassociateResourceFromProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResourceFromProfile(request);
    }

    @SdkInternalApi
    final DisassociateResourceFromProfileResult executeDisassociateResourceFromProfile(
            DisassociateResourceFromProfileRequest disassociateResourceFromProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResourceFromProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceFromProfileRequest> request = null;
        Response<DisassociateResourceFromProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceFromProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateResourceFromProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResourceFromProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResourceFromProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateResourceFromProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specified Route 53 Profile, such as whether whether the Profile is shared, and the
     * current status of the Profile.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProfileResult getProfile(GetProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfile(request);
    }

    @SdkInternalApi
    final GetProfileResult executeGetProfile(GetProfileRequest getProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileRequest> request = null;
        Response<GetProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a Route 53 Profile association for a VPC. A VPC can have only one Profile association, but a Profile
     * can be associated with up to 5000 VPCs.
     * </p>
     * 
     * @param getProfileAssociationRequest
     * @return Result of the GetProfileAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.GetProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProfileAssociationResult getProfileAssociation(GetProfileAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfileAssociation(request);
    }

    @SdkInternalApi
    final GetProfileAssociationResult executeGetProfileAssociation(GetProfileAssociationRequest getProfileAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileAssociationRequest> request = null;
        Response<GetProfileAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfileAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileAssociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetProfileAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specified Route 53 Profile resource association.
     * </p>
     * 
     * @param getProfileResourceAssociationRequest
     * @return Result of the GetProfileResourceAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.GetProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProfileResourceAssociationResult getProfileResourceAssociation(GetProfileResourceAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfileResourceAssociation(request);
    }

    @SdkInternalApi
    final GetProfileResourceAssociationResult executeGetProfileResourceAssociation(GetProfileResourceAssociationRequest getProfileResourceAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileResourceAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileResourceAssociationRequest> request = null;
        Response<GetProfileResourceAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileResourceAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getProfileResourceAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfileResourceAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileResourceAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetProfileResourceAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the VPCs that the specified Route 53 Profile is associated with.
     * </p>
     * 
     * @param listProfileAssociationsRequest
     * @return Result of the ListProfileAssociations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> you provided isn;t valid.
     * @sample AWSRoute53Profiles.ListProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfileAssociationsResult listProfileAssociations(ListProfileAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileAssociations(request);
    }

    @SdkInternalApi
    final ListProfileAssociationsResult executeListProfileAssociations(ListProfileAssociationsRequest listProfileAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileAssociationsRequest> request = null;
        Response<ListProfileAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProfileAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProfileAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the resource associations for the specified Route 53 Profile.
     * </p>
     * 
     * @param listProfileResourceAssociationsRequest
     * @return Result of the ListProfileResourceAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> you provided isn;t valid.
     * @sample AWSRoute53Profiles.ListProfileResourceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileResourceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfileResourceAssociationsResult listProfileResourceAssociations(ListProfileResourceAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileResourceAssociations(request);
    }

    @SdkInternalApi
    final ListProfileResourceAssociationsResult executeListProfileResourceAssociations(
            ListProfileResourceAssociationsRequest listProfileResourceAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileResourceAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileResourceAssociationsRequest> request = null;
        Response<ListProfileResourceAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileResourceAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProfileResourceAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileResourceAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileResourceAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProfileResourceAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Route 53 Profiles associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> you provided isn;t valid.
     * @sample AWSRoute53Profiles.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListProfilesResult listProfiles(ListProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfiles(request);
    }

    @SdkInternalApi
    final ListProfilesResult executeListProfiles(ListProfilesRequest listProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfilesRequest> request = null;
        Response<ListProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
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
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
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
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
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
     * Updates the specified Route 53 Profile resourse association.
     * </p>
     * 
     * @param updateProfileResourceAssociationRequest
     * @return Result of the UpdateProfileResourceAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.UpdateProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UpdateProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProfileResourceAssociationResult updateProfileResourceAssociation(UpdateProfileResourceAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfileResourceAssociation(request);
    }

    @SdkInternalApi
    final UpdateProfileResourceAssociationResult executeUpdateProfileResourceAssociation(
            UpdateProfileResourceAssociationRequest updateProfileResourceAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileResourceAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileResourceAssociationRequest> request = null;
        Response<UpdateProfileResourceAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileResourceAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateProfileResourceAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Profiles");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfileResourceAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileResourceAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateProfileResourceAssociationResultJsonUnmarshaller());
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
