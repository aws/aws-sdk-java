/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.profile;

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

import com.amazonaws.services.profile.AmazonProfileClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.profile.model.*;
import com.amazonaws.services.profile.model.transform.*;

/**
 * Client for accessing Profile. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Connect Customer Profiles</fullname>
 * <p>
 * Welcome to the Amazon Connect Customer Profiles API Reference. This guide provides information about the Amazon
 * Connect Customer Profiles API, including supported operations, data types, parameters, and schemas.
 * </p>
 * <p>
 * Amazon Connect Customer Profiles is a unified customer profile for your contact center that has pre-built connectors
 * powered by AppFlow that make it easy to combine customer information from third party applications, such as
 * Salesforce (CRM), ServiceNow (ITSM), and your enterprise resource planning (ERP), with contact history from your
 * Amazon Connect contact center.
 * </p>
 * <p>
 * If you're new to Amazon Connect, you might find it helpful to also review the <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/what-is-amazon-connect.html">Amazon Connect Administrator
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonProfileClient extends AmazonWebServiceClient implements AmazonProfile {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonProfile.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "profile";

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
                                    com.amazonaws.services.profile.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.profile.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.profile.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.profile.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.profile.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.profile.model.AmazonProfileException.class));

    public static AmazonProfileClientBuilder builder() {
        return AmazonProfileClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Profile using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonProfileClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Profile using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonProfileClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("profile.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/profile/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/profile/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a new key value with a specific profile, such as a Contact Trace Record (CTR) ContactId.
     * </p>
     * <p>
     * A profile object can have a single unique key and any number of additional keys that can be used to identify the
     * profile that it belongs to.
     * </p>
     * 
     * @param addProfileKeyRequest
     * @return Result of the AddProfileKey operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.AddProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/AddProfileKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddProfileKeyResult addProfileKey(AddProfileKeyRequest request) {
        request = beforeClientExecution(request);
        return executeAddProfileKey(request);
    }

    @SdkInternalApi
    final AddProfileKeyResult executeAddProfileKey(AddProfileKeyRequest addProfileKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(addProfileKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddProfileKeyRequest> request = null;
        Response<AddProfileKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddProfileKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addProfileKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddProfileKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddProfileKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddProfileKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a domain, which is a container for all customer data, such as customer profile attributes, object types,
     * profile keys, and encryption keys. You can create multiple domains, and each domain can have multiple third-party
     * integrations.
     * </p>
     * <p>
     * Each Amazon Connect instance can be associated with only one domain. Multiple Amazon Connect instances can be
     * associated with one domain.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/CreateDomain" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Creates a standard profile.
     * </p>
     * <p>
     * A standard profile represents the following attributes for a customer profile in a domain.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/CreateProfile" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Deletes a specific domain and all of its customer data, such as customer profile attributes and their related
     * objects.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteDomain" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Removes an integration from a specific domain.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return Result of the DeleteIntegration operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.DeleteIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIntegrationResult deleteIntegration(DeleteIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIntegration(request);
    }

    @SdkInternalApi
    final DeleteIntegrationResult executeDeleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationRequest> request = null;
        Response<DeleteIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the standard customer profile and all data pertaining to the profile.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Removes a searchable key from a customer profile.
     * </p>
     * 
     * @param deleteProfileKeyRequest
     * @return Result of the DeleteProfileKey operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.DeleteProfileKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteProfileKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProfileKeyResult deleteProfileKey(DeleteProfileKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfileKey(request);
    }

    @SdkInternalApi
    final DeleteProfileKeyResult executeDeleteProfileKey(DeleteProfileKeyRequest deleteProfileKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileKeyRequest> request = null;
        Response<DeleteProfileKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfileKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an object associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectRequest
     * @return Result of the DeleteProfileObject operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.DeleteProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteProfileObject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteProfileObjectResult deleteProfileObject(DeleteProfileObjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfileObject(request);
    }

    @SdkInternalApi
    final DeleteProfileObjectResult executeDeleteProfileObject(DeleteProfileObjectRequest deleteProfileObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileObjectRequest> request = null;
        Response<DeleteProfileObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfileObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a ProfileObjectType from a specific domain as well as removes all the ProfileObjects of that type. It
     * also disables integrations from this specific ProfileObjectType. In addition, it scrubs all of the fields of the
     * standard profile that were populated from this ProfileObjectType.
     * </p>
     * 
     * @param deleteProfileObjectTypeRequest
     * @return Result of the DeleteProfileObjectType operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.DeleteProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteProfileObjectType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProfileObjectTypeResult deleteProfileObjectType(DeleteProfileObjectTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfileObjectType(request);
    }

    @SdkInternalApi
    final DeleteProfileObjectTypeResult executeDeleteProfileObjectType(DeleteProfileObjectTypeRequest deleteProfileObjectTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileObjectTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileObjectTypeRequest> request = null;
        Response<DeleteProfileObjectTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileObjectTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProfileObjectTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfileObjectType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileObjectTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProfileObjectTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific domain.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainResult getDomain(GetDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomain(request);
    }

    @SdkInternalApi
    final GetDomainResult executeGetDomain(GetDomainRequest getDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainRequest> request = null;
        Response<GetDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an integration for a domain.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return Result of the GetIntegration operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.GetIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/GetIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIntegrationResult getIntegration(GetIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeGetIntegration(request);
    }

    @SdkInternalApi
    final GetIntegrationResult executeGetIntegration(GetIntegrationRequest getIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(getIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationRequest> request = null;
        Response<GetIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the object types for a specific domain.
     * </p>
     * 
     * @param getProfileObjectTypeRequest
     * @return Result of the GetProfileObjectType operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.GetProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/GetProfileObjectType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetProfileObjectTypeResult getProfileObjectType(GetProfileObjectTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfileObjectType(request);
    }

    @SdkInternalApi
    final GetProfileObjectTypeResult executeGetProfileObjectType(GetProfileObjectTypeRequest getProfileObjectTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileObjectTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileObjectTypeRequest> request = null;
        Response<GetProfileObjectTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileObjectTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileObjectTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfileObjectType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileObjectTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProfileObjectTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the template information for a specific object type.
     * </p>
     * <p>
     * A template is a predefined ProfileObjectType, such as “Salesforce-Account” or “Salesforce-Contact.” When a user
     * sends a ProfileObject, using the PutProfileObject API, with an ObjectTypeName that matches one of the
     * TemplateIds, it uses the mappings from the template.
     * </p>
     * 
     * @param getProfileObjectTypeTemplateRequest
     * @return Result of the GetProfileObjectTypeTemplate operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.GetProfileObjectTypeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/GetProfileObjectTypeTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProfileObjectTypeTemplateResult getProfileObjectTypeTemplate(GetProfileObjectTypeTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfileObjectTypeTemplate(request);
    }

    @SdkInternalApi
    final GetProfileObjectTypeTemplateResult executeGetProfileObjectTypeTemplate(GetProfileObjectTypeTemplateRequest getProfileObjectTypeTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileObjectTypeTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileObjectTypeTemplateRequest> request = null;
        Response<GetProfileObjectTypeTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileObjectTypeTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getProfileObjectTypeTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfileObjectTypeTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileObjectTypeTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetProfileObjectTypeTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the integrations associated to a specific URI in the AWS account.
     * </p>
     * 
     * @param listAccountIntegrationsRequest
     * @return Result of the ListAccountIntegrations operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.ListAccountIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListAccountIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountIntegrationsResult listAccountIntegrations(ListAccountIntegrationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountIntegrations(request);
    }

    @SdkInternalApi
    final ListAccountIntegrationsResult executeListAccountIntegrations(ListAccountIntegrationsRequest listAccountIntegrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountIntegrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountIntegrationsRequest> request = null;
        Response<ListAccountIntegrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountIntegrationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAccountIntegrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountIntegrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountIntegrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountIntegrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the domains for an AWS account that have been created.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListDomains" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Lists all of the integrations in your domain.
     * </p>
     * 
     * @param listIntegrationsRequest
     * @return Result of the ListIntegrations operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.ListIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListIntegrations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIntegrationsResult listIntegrations(ListIntegrationsRequest request) {
        request = beforeClientExecution(request);
        return executeListIntegrations(request);
    }

    @SdkInternalApi
    final ListIntegrationsResult executeListIntegrations(ListIntegrationsRequest listIntegrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIntegrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIntegrationsRequest> request = null;
        Response<ListIntegrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIntegrationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIntegrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIntegrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIntegrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIntegrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the template information for object types.
     * </p>
     * 
     * @param listProfileObjectTypeTemplatesRequest
     * @return Result of the ListProfileObjectTypeTemplates operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.ListProfileObjectTypeTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListProfileObjectTypeTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfileObjectTypeTemplatesResult listProfileObjectTypeTemplates(ListProfileObjectTypeTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileObjectTypeTemplates(request);
    }

    @SdkInternalApi
    final ListProfileObjectTypeTemplatesResult executeListProfileObjectTypeTemplates(ListProfileObjectTypeTemplatesRequest listProfileObjectTypeTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileObjectTypeTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileObjectTypeTemplatesRequest> request = null;
        Response<ListProfileObjectTypeTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileObjectTypeTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProfileObjectTypeTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileObjectTypeTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileObjectTypeTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProfileObjectTypeTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the templates available within the service.
     * </p>
     * 
     * @param listProfileObjectTypesRequest
     * @return Result of the ListProfileObjectTypes operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.ListProfileObjectTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListProfileObjectTypes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListProfileObjectTypesResult listProfileObjectTypes(ListProfileObjectTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileObjectTypes(request);
    }

    @SdkInternalApi
    final ListProfileObjectTypesResult executeListProfileObjectTypes(ListProfileObjectTypesRequest listProfileObjectTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileObjectTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileObjectTypesRequest> request = null;
        Response<ListProfileObjectTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileObjectTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfileObjectTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileObjectTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileObjectTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProfileObjectTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of objects associated with a profile of a given ProfileObjectType.
     * </p>
     * 
     * @param listProfileObjectsRequest
     * @return Result of the ListProfileObjects operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.ListProfileObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListProfileObjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProfileObjectsResult listProfileObjects(ListProfileObjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileObjects(request);
    }

    @SdkInternalApi
    final ListProfileObjectsResult executeListProfileObjects(ListProfileObjectsRequest listProfileObjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileObjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileObjectsRequest> request = null;
        Response<ListProfileObjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileObjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfileObjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileObjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileObjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfileObjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with an Amazon Connect Customer Profiles resource. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AmazonProfile.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Adds an integration between the service and a third-party service, which includes Amazon AppFlow and Amazon
     * Connect.
     * </p>
     * <p>
     * An integration can belong to only one domain.
     * </p>
     * 
     * @param putIntegrationRequest
     * @return Result of the PutIntegration operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.PutIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/PutIntegration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutIntegrationResult putIntegration(PutIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executePutIntegration(request);
    }

    @SdkInternalApi
    final PutIntegrationResult executePutIntegration(PutIntegrationRequest putIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(putIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationRequest> request = null;
        Response<PutIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds additional objects to customer profiles of a given ObjectType.
     * </p>
     * <p>
     * When adding a specific profile object, like a Contact Trace Record (CTR), an inferred profile can get created if
     * it is not mapped to an existing profile. The resulting profile will only have a phone number populated in the
     * standard ProfileObject. Any additional CTRs with the same phone number will be mapped to the same inferred
     * profile.
     * </p>
     * <p>
     * When a ProfileObject is created and if a ProfileObjectType already exists for the ProfileObject, it will provide
     * data to a standard profile depending on the ProfileObjectType definition.
     * </p>
     * <p>
     * PutProfileObject needs an ObjectType, which can be created using PutProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectRequest
     * @return Result of the PutProfileObject operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.PutProfileObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/PutProfileObject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutProfileObjectResult putProfileObject(PutProfileObjectRequest request) {
        request = beforeClientExecution(request);
        return executePutProfileObject(request);
    }

    @SdkInternalApi
    final PutProfileObjectResult executePutProfileObject(PutProfileObjectRequest putProfileObjectRequest) {

        ExecutionContext executionContext = createExecutionContext(putProfileObjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProfileObjectRequest> request = null;
        Response<PutProfileObjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProfileObjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putProfileObjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutProfileObject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutProfileObjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutProfileObjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines a ProfileObjectType.
     * </p>
     * 
     * @param putProfileObjectTypeRequest
     * @return Result of the PutProfileObjectType operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.PutProfileObjectType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/PutProfileObjectType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutProfileObjectTypeResult putProfileObjectType(PutProfileObjectTypeRequest request) {
        request = beforeClientExecution(request);
        return executePutProfileObjectType(request);
    }

    @SdkInternalApi
    final PutProfileObjectTypeResult executePutProfileObjectType(PutProfileObjectTypeRequest putProfileObjectTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(putProfileObjectTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutProfileObjectTypeRequest> request = null;
        Response<PutProfileObjectTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutProfileObjectTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putProfileObjectTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutProfileObjectType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutProfileObjectTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutProfileObjectTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for profiles within a specific domain name using name, phone number, email address, account number, or a
     * custom defined index.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return Result of the SearchProfiles operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/SearchProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchProfilesResult searchProfiles(SearchProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchProfiles(request);
    }

    @SdkInternalApi
    final SearchProfilesResult executeSearchProfiles(SearchProfilesRequest searchProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProfilesRequest> request = null;
        Response<SearchProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Connect Customer Profiles resource. Tags can
     * help you organize and categorize your resources. You can also use them to scope user permissions by granting a
     * user permission to access or change only resources with certain tag values. In Connect Customer Profiles,
     * domains, profile object types, and integrations can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the TagResource action with a resource that already has tags. If you specify a new tag key, this tag
     * is appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AmazonProfile.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Removes one or more tags from the specified Amazon Connect Customer Profiles resource. In Connect Customer
     * Profiles, domains, profile object types, and integrations can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AmazonProfile.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * Updates the properties of a domain, including creating or selecting a dead letter queue or an encryption key.
     * </p>
     * <p>
     * Once a domain is created, the name can’t be changed.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/UpdateDomain" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
     * <p>
     * Updates the properties of a profile. The ProfileId is required for updating a customer profile.
     * </p>
     * <p>
     * When calling the UpdateProfile API, specifying an empty string value means that any existing value will be
     * removed. Not specifying a string value means that any value already there will be kept.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws BadRequestException
     *         The input you provided is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         An internal service error occurred.
     * @sample AmazonProfile.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Profile");
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
