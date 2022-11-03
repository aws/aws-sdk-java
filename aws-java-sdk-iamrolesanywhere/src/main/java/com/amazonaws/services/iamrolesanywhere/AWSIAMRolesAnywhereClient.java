/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere;

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

import com.amazonaws.services.iamrolesanywhere.AWSIAMRolesAnywhereClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iamrolesanywhere.model.*;
import com.amazonaws.services.iamrolesanywhere.model.transform.*;

/**
 * Client for accessing IAM Roles Anywhere. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Identity and Access Management Roles Anywhere provides a secure way for your workloads such as servers,
 * containers, and applications running outside of AWS to obtain Temporary AWS credentials. Your workloads can use the
 * same IAM policies and roles that you have configured with native AWS applications to access AWS resources. Using IAM
 * Roles Anywhere will eliminate the need to manage long term credentials for workloads running outside of AWS.
 * </p>
 * <p>
 * To use IAM Roles Anywhere customer workloads will need to use X.509 certificates issued by their Certificate
 * Authority (CA) . The Certificate Authority (CA) needs to be registered with IAM Roles Anywhere as a trust anchor to
 * establish trust between customer PKI and IAM Roles Anywhere. Customers who do not manage their own PKI system can use
 * AWS Certificate Manager Private Certificate Authority (ACM PCA) to create a Certificate Authority and use that to
 * establish trust with IAM Roles Anywhere
 * </p>
 * <p>
 * This guide describes the IAM rolesanywhere operations that you can call programmatically. For general information
 * about IAM Roles Anywhere see <a href="https://docs.aws.amazon.com/">https://docs.aws.amazon.com/</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIAMRolesAnywhereClient extends AmazonWebServiceClient implements AWSIAMRolesAnywhere {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIAMRolesAnywhere.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rolesanywhere";

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
                                    com.amazonaws.services.iamrolesanywhere.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iamrolesanywhere.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iamrolesanywhere.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.iamrolesanywhere.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iamrolesanywhere.model.AWSIAMRolesAnywhereException.class));

    public static AWSIAMRolesAnywhereClientBuilder builder() {
        return AWSIAMRolesAnywhereClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on IAM Roles Anywhere using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIAMRolesAnywhereClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on IAM Roles Anywhere using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIAMRolesAnywhereClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("rolesanywhere.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iamrolesanywhere/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iamrolesanywhere/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted to
     * assume. In addition, by applying a profile you can intersect permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateProfile</code>.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateProfile" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Creates a trust anchor. You establish trust between IAM Roles Anywhere and your certificate authority (CA) by
     * configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private
     * Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can
     * authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in
     * exchange for temporary AWS credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:CreateTrustAnchor</code>.
     * </p>
     * 
     * @param createTrustAnchorRequest
     * @return Result of the CreateTrustAnchor operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.CreateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTrustAnchorResult createTrustAnchor(CreateTrustAnchorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrustAnchor(request);
    }

    @SdkInternalApi
    final CreateTrustAnchorResult executeCreateTrustAnchor(CreateTrustAnchorRequest createTrustAnchorRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrustAnchorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustAnchorRequest> request = null;
        Response<CreateTrustAnchorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustAnchorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrustAnchorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrustAnchor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrustAnchorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrustAnchorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteCrl</code>.
     * </p>
     * 
     * @param deleteCrlRequest
     * @return Result of the DeleteCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DeleteCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteCrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCrlResult deleteCrl(DeleteCrlRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCrl(request);
    }

    @SdkInternalApi
    final DeleteCrlResult executeDeleteCrl(DeleteCrlRequest deleteCrlRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCrlRequest> request = null;
        Response<DeleteCrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCrlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteProfile</code>.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteProfile" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Deletes a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DeleteTrustAnchor</code>.
     * </p>
     * 
     * @param deleteTrustAnchorRequest
     * @return Result of the DeleteTrustAnchor operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DeleteTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DeleteTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrustAnchorResult deleteTrustAnchor(DeleteTrustAnchorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrustAnchor(request);
    }

    @SdkInternalApi
    final DeleteTrustAnchorResult executeDeleteTrustAnchor(DeleteTrustAnchorRequest deleteTrustAnchorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrustAnchorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustAnchorRequest> request = null;
        Response<DeleteTrustAnchorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustAnchorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrustAnchorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrustAnchor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrustAnchorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrustAnchorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableCrl</code>.
     * </p>
     * 
     * @param disableCrlRequest
     * @return Result of the DisableCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DisableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableCrlResult disableCrl(DisableCrlRequest request) {
        request = beforeClientExecution(request);
        return executeDisableCrl(request);
    }

    @SdkInternalApi
    final DisableCrlResult executeDisableCrl(DisableCrlRequest disableCrlRequest) {

        ExecutionContext executionContext = createExecutionContext(disableCrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableCrlRequest> request = null;
        Response<DisableCrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableCrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableCrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableCrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableCrlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableCrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables a profile. When disabled, <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests with this profile fail.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableProfile</code>.
     * </p>
     * 
     * @param disableProfileRequest
     * @return Result of the DisableProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DisableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableProfileResult disableProfile(DisableProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDisableProfile(request);
    }

    @SdkInternalApi
    final DisableProfileResult executeDisableProfile(DisableProfileRequest disableProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(disableProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableProfileRequest> request = null;
        Response<DisableProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables a trust anchor. When disabled, <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * requests specifying this trust anchor are unauthorized.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:DisableTrustAnchor</code>.
     * </p>
     * 
     * @param disableTrustAnchorRequest
     * @return Result of the DisableTrustAnchor operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.DisableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableTrustAnchorResult disableTrustAnchor(DisableTrustAnchorRequest request) {
        request = beforeClientExecution(request);
        return executeDisableTrustAnchor(request);
    }

    @SdkInternalApi
    final DisableTrustAnchorResult executeDisableTrustAnchor(DisableTrustAnchorRequest disableTrustAnchorRequest) {

        ExecutionContext executionContext = createExecutionContext(disableTrustAnchorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableTrustAnchorRequest> request = null;
        Response<DisableTrustAnchorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableTrustAnchorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableTrustAnchorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableTrustAnchor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableTrustAnchorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableTrustAnchorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables a certificate revocation list (CRL). When enabled, certificates stored in the CRL are unauthorized to
     * receive session credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableCrl</code>.
     * </p>
     * 
     * @param enableCrlRequest
     * @return Result of the EnableCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.EnableCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableCrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableCrlResult enableCrl(EnableCrlRequest request) {
        request = beforeClientExecution(request);
        return executeEnableCrl(request);
    }

    @SdkInternalApi
    final EnableCrlResult executeEnableCrl(EnableCrlRequest enableCrlRequest) {

        ExecutionContext executionContext = createExecutionContext(enableCrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableCrlRequest> request = null;
        Response<EnableCrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableCrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableCrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableCrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableCrlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableCrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the roles in a profile to receive session credentials in <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableProfile</code>.
     * </p>
     * 
     * @param enableProfileRequest
     * @return Result of the EnableProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.EnableProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnableProfileResult enableProfile(EnableProfileRequest request) {
        request = beforeClientExecution(request);
        return executeEnableProfile(request);
    }

    @SdkInternalApi
    final EnableProfileResult executeEnableProfile(EnableProfileRequest enableProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(enableProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableProfileRequest> request = null;
        Response<EnableProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables a trust anchor. When enabled, certificates in the trust anchor chain are authorized for trust validation.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:EnableTrustAnchor</code>.
     * </p>
     * 
     * @param enableTrustAnchorRequest
     * @return Result of the EnableTrustAnchor operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.EnableTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/EnableTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableTrustAnchorResult enableTrustAnchor(EnableTrustAnchorRequest request) {
        request = beforeClientExecution(request);
        return executeEnableTrustAnchor(request);
    }

    @SdkInternalApi
    final EnableTrustAnchorResult executeEnableTrustAnchor(EnableTrustAnchorRequest enableTrustAnchorRequest) {

        ExecutionContext executionContext = createExecutionContext(enableTrustAnchorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableTrustAnchorRequest> request = null;
        Response<EnableTrustAnchorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableTrustAnchorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableTrustAnchorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableTrustAnchor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableTrustAnchorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableTrustAnchorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetCrl</code>.
     * </p>
     * 
     * @param getCrlRequest
     * @return Result of the GetCrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSIAMRolesAnywhere.GetCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetCrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCrlResult getCrl(GetCrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetCrl(request);
    }

    @SdkInternalApi
    final GetCrlResult executeGetCrl(GetCrlRequest getCrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getCrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrlRequest> request = null;
        Response<GetCrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCrlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a profile.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetProfile</code>.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetProfile" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Gets a Subject. A Subject associates a certificate identity with authentication attempts by CreateSession. The
     * Subject resources stores audit information such as status of the last authentication attempt, the certificate
     * data used in the attempt, and the last time the associated identity attempted authentication.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetSubject</code>.
     * </p>
     * 
     * @param getSubjectRequest
     * @return Result of the GetSubject operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.GetSubject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetSubject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSubjectResult getSubject(GetSubjectRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubject(request);
    }

    @SdkInternalApi
    final GetSubjectResult executeGetSubject(GetSubjectRequest getSubjectRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubjectRequest> request = null;
        Response<GetSubjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSubjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSubjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a trust anchor.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:GetTrustAnchor</code>.
     * </p>
     * 
     * @param getTrustAnchorRequest
     * @return Result of the GetTrustAnchor operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.GetTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetTrustAnchor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTrustAnchorResult getTrustAnchor(GetTrustAnchorRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrustAnchor(request);
    }

    @SdkInternalApi
    final GetTrustAnchorResult executeGetTrustAnchor(GetTrustAnchorRequest getTrustAnchorRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrustAnchorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrustAnchorRequest> request = null;
        Response<GetTrustAnchorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrustAnchorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrustAnchorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrustAnchor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrustAnchorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTrustAnchorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the
     * issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ImportCrl</code>.
     * </p>
     * 
     * @param importCrlRequest
     * @return Result of the ImportCrl operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ImportCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ImportCrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportCrlResult importCrl(ImportCrlRequest request) {
        request = beforeClientExecution(request);
        return executeImportCrl(request);
    }

    @SdkInternalApi
    final ImportCrlResult executeImportCrl(ImportCrlRequest importCrlRequest) {

        ExecutionContext executionContext = createExecutionContext(importCrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCrlRequest> request = null;
        Response<ImportCrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importCrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportCrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportCrlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportCrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Crls in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListCrls</code>.
     * </p>
     * 
     * @param listCrlsRequest
     * @return Result of the ListCrls operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListCrls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListCrls" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCrlsResult listCrls(ListCrlsRequest request) {
        request = beforeClientExecution(request);
        return executeListCrls(request);
    }

    @SdkInternalApi
    final ListCrlsResult executeListCrls(ListCrlsRequest listCrlsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCrlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCrlsRequest> request = null;
        Response<ListCrlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCrlsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCrlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCrls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCrlsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCrlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all profiles in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListProfiles</code>.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListProfiles" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Lists the subjects in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListSubjects</code>.
     * </p>
     * 
     * @param listSubjectsRequest
     * @return Result of the ListSubjects operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListSubjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListSubjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSubjectsResult listSubjects(ListSubjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListSubjects(request);
    }

    @SdkInternalApi
    final ListSubjectsResult executeListSubjects(ListSubjectsRequest listSubjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSubjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubjectsRequest> request = null;
        Response<ListSubjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSubjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSubjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSubjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSubjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTagsForResource</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Lists the trust anchors in the authenticated account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:ListTrustAnchors</code>.
     * </p>
     * 
     * @param listTrustAnchorsRequest
     * @return Result of the ListTrustAnchors operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.ListTrustAnchors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListTrustAnchors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTrustAnchorsResult listTrustAnchors(ListTrustAnchorsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrustAnchors(request);
    }

    @SdkInternalApi
    final ListTrustAnchorsResult executeListTrustAnchors(ListTrustAnchorsRequest listTrustAnchorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrustAnchorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrustAnchorsRequest> request = null;
        Response<ListTrustAnchorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrustAnchorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrustAnchorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrustAnchors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrustAnchorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrustAnchorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches tags to a resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:TagResource</code>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws TooManyTagsException
     *         Too many tags.
     * @sample AWSIAMRolesAnywhere.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Removes tags from the resource.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UntagResource</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
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
     * Updates the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the
     * issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateCrl</code>.
     * </p>
     * 
     * @param updateCrlRequest
     * @return Result of the UpdateCrl operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UpdateCrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateCrl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCrlResult updateCrl(UpdateCrlRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCrl(request);
    }

    @SdkInternalApi
    final UpdateCrlResult executeUpdateCrl(UpdateCrlRequest updateCrlRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCrlRequest> request = null;
        Response<UpdateCrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCrlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted
     * to assume. In addition, by applying a profile you can scope-down permissions with IAM managed policies.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateProfile</code>.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateProfileResult updateProfile(UpdateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfile(request);
    }

    @SdkInternalApi
    final UpdateProfileResult executeUpdateProfile(UpdateProfileRequest updateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileRequest> request = null;
        Response<UpdateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the trust anchor.You establish trust between IAM Roles Anywhere and your certificate authority (CA) by
     * configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private
     * Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can
     * authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in
     * exchange for temporary AWS credentials.
     * </p>
     * <p>
     * <b>Required permissions: </b> <code>rolesanywhere:UpdateTrustAnchor</code>.
     * </p>
     * 
     * @param updateTrustAnchorRequest
     * @return Result of the UpdateTrustAnchor operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSIAMRolesAnywhere.UpdateTrustAnchor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/UpdateTrustAnchor"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTrustAnchorResult updateTrustAnchor(UpdateTrustAnchorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrustAnchor(request);
    }

    @SdkInternalApi
    final UpdateTrustAnchorResult executeUpdateTrustAnchor(UpdateTrustAnchorRequest updateTrustAnchorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrustAnchorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrustAnchorRequest> request = null;
        Response<UpdateTrustAnchorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrustAnchorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrustAnchorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RolesAnywhere");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrustAnchor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrustAnchorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrustAnchorResultJsonUnmarshaller());
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
