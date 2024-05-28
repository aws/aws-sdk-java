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
package com.amazonaws.services.workspacesweb;

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

import com.amazonaws.services.workspacesweb.AmazonWorkSpacesWebClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.services.workspacesweb.model.transform.*;

/**
 * Client for accessing Amazon WorkSpaces Web. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * WorkSpaces Web is a low cost, fully managed WorkSpace built specifically to facilitate secure, web-based workloads.
 * WorkSpaces Web makes it easy for customers to safely provide their employees with access to internal websites and
 * SaaS web applications without the administrative burden of appliances or specialized client software. WorkSpaces Web
 * provides simple policy tools tailored for user interactions, while offloading common tasks like capacity management,
 * scaling, and maintaining browser images.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkSpacesWebClient extends AmazonWebServiceClient implements AmazonWorkSpacesWeb {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkSpacesWeb.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "workspaces-web";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workspacesweb.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.workspacesweb.model.AmazonWorkSpacesWebException.class));

    public static AmazonWorkSpacesWebClientBuilder builder() {
        return AmazonWorkSpacesWebClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces Web using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkSpacesWebClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces Web using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkSpacesWebClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("workspaces-web.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/workspacesweb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/workspacesweb/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a browser settings resource with a web portal.
     * </p>
     * 
     * @param associateBrowserSettingsRequest
     * @return Result of the AssociateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateBrowserSettingsResult associateBrowserSettings(AssociateBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateBrowserSettings(request);
    }

    @SdkInternalApi
    final AssociateBrowserSettingsResult executeAssociateBrowserSettings(AssociateBrowserSettingsRequest associateBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateBrowserSettingsRequest> request = null;
        Response<AssociateBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateBrowserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an IP access settings resource with a web portal.
     * </p>
     * 
     * @param associateIpAccessSettingsRequest
     * @return Result of the AssociateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateIpAccessSettingsResult associateIpAccessSettings(AssociateIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateIpAccessSettings(request);
    }

    @SdkInternalApi
    final AssociateIpAccessSettingsResult executeAssociateIpAccessSettings(AssociateIpAccessSettingsRequest associateIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateIpAccessSettingsRequest> request = null;
        Response<AssociateIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a network settings resource with a web portal.
     * </p>
     * 
     * @param associateNetworkSettingsRequest
     * @return Result of the AssociateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateNetworkSettingsResult associateNetworkSettings(AssociateNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateNetworkSettings(request);
    }

    @SdkInternalApi
    final AssociateNetworkSettingsResult executeAssociateNetworkSettings(AssociateNetworkSettingsRequest associateNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateNetworkSettingsRequest> request = null;
        Response<AssociateNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateNetworkSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a trust store with a web portal.
     * </p>
     * 
     * @param associateTrustStoreRequest
     * @return Result of the AssociateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.AssociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateTrustStoreResult associateTrustStore(AssociateTrustStoreRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTrustStore(request);
    }

    @SdkInternalApi
    final AssociateTrustStoreResult executeAssociateTrustStore(AssociateTrustStoreRequest associateTrustStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTrustStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTrustStoreRequest> request = null;
        Response<AssociateTrustStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTrustStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateTrustStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTrustStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTrustStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateTrustStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a user access logging settings resource with a web portal.
     * </p>
     * 
     * @param associateUserAccessLoggingSettingsRequest
     * @return Result of the AssociateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateUserAccessLoggingSettingsResult associateUserAccessLoggingSettings(AssociateUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final AssociateUserAccessLoggingSettingsResult executeAssociateUserAccessLoggingSettings(
            AssociateUserAccessLoggingSettingsRequest associateUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateUserAccessLoggingSettingsRequest> request = null;
        Response<AssociateUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a user settings resource with a web portal.
     * </p>
     * 
     * @param associateUserSettingsRequest
     * @return Result of the AssociateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.AssociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateUserSettingsResult associateUserSettings(AssociateUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateUserSettings(request);
    }

    @SdkInternalApi
    final AssociateUserSettingsResult executeAssociateUserSettings(AssociateUserSettingsRequest associateUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateUserSettingsRequest> request = null;
        Response<AssociateUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateUserSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a browser settings resource that can be associated with a web portal. Once associated with a web portal,
     * browser settings control how the browser will behave once a user starts a streaming session for the web portal.
     * </p>
     * 
     * @param createBrowserSettingsRequest
     * @return Result of the CreateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBrowserSettingsResult createBrowserSettings(CreateBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBrowserSettings(request);
    }

    @SdkInternalApi
    final CreateBrowserSettingsResult executeCreateBrowserSettings(CreateBrowserSettingsRequest createBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(createBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBrowserSettingsRequest> request = null;
        Response<CreateBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBrowserSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an identity provider resource that is then associated with a web portal.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @return Result of the CreateIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIdentityProviderResult createIdentityProvider(CreateIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIdentityProvider(request);
    }

    @SdkInternalApi
    final CreateIdentityProviderResult executeCreateIdentityProvider(CreateIdentityProviderRequest createIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(createIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdentityProviderRequest> request = null;
        Response<CreateIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an IP access settings resource that can be associated with a web portal.
     * </p>
     * 
     * @param createIpAccessSettingsRequest
     * @return Result of the CreateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIpAccessSettingsResult createIpAccessSettings(CreateIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIpAccessSettings(request);
    }

    @SdkInternalApi
    final CreateIpAccessSettingsResult executeCreateIpAccessSettings(CreateIpAccessSettingsRequest createIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(createIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIpAccessSettingsRequest> request = null;
        Response<CreateIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a network settings resource that can be associated with a web portal. Once associated with a web portal,
     * network settings define how streaming instances will connect with your specified VPC.
     * </p>
     * 
     * @param createNetworkSettingsRequest
     * @return Result of the CreateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNetworkSettingsResult createNetworkSettings(CreateNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNetworkSettings(request);
    }

    @SdkInternalApi
    final CreateNetworkSettingsResult executeCreateNetworkSettings(CreateNetworkSettingsRequest createNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(createNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkSettingsRequest> request = null;
        Response<CreateNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNetworkSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a web portal.
     * </p>
     * 
     * @param createPortalRequest
     * @return Result of the CreatePortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePortalResult createPortal(CreatePortalRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePortal(request);
    }

    @SdkInternalApi
    final CreatePortalResult executeCreatePortal(CreatePortalRequest createPortalRequest) {

        ExecutionContext executionContext = createExecutionContext(createPortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePortalRequest> request = null;
        Response<CreatePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a trust store that can be associated with a web portal. A trust store contains certificate authority (CA)
     * certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates
     * that have been issued using any of the CAs in the trust store. If your organization has internal websites that
     * use certificates issued by private CAs, you should add the private CA certificate to the trust store.
     * </p>
     * 
     * @param createTrustStoreRequest
     * @return Result of the CreateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTrustStoreResult createTrustStore(CreateTrustStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrustStore(request);
    }

    @SdkInternalApi
    final CreateTrustStoreResult executeCreateTrustStore(CreateTrustStoreRequest createTrustStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrustStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustStoreRequest> request = null;
        Response<CreateTrustStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrustStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrustStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrustStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrustStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user access logging settings resource that can be associated with a web portal.
     * </p>
     * 
     * @param createUserAccessLoggingSettingsRequest
     * @return Result of the CreateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUserAccessLoggingSettingsResult createUserAccessLoggingSettings(CreateUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final CreateUserAccessLoggingSettingsResult executeCreateUserAccessLoggingSettings(
            CreateUserAccessLoggingSettingsRequest createUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserAccessLoggingSettingsRequest> request = null;
        Response<CreateUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user settings resource that can be associated with a web portal. Once associated with a web portal,
     * user settings control how users can transfer data between a streaming session and the their local devices.
     * </p>
     * 
     * @param createUserSettingsRequest
     * @return Result of the CreateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.CreateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/CreateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUserSettingsResult createUserSettings(CreateUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserSettings(request);
    }

    @SdkInternalApi
    final CreateUserSettingsResult executeCreateUserSettings(CreateUserSettingsRequest createUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserSettingsRequest> request = null;
        Response<CreateUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes browser settings.
     * </p>
     * 
     * @param deleteBrowserSettingsRequest
     * @return Result of the DeleteBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBrowserSettingsResult deleteBrowserSettings(DeleteBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBrowserSettings(request);
    }

    @SdkInternalApi
    final DeleteBrowserSettingsResult executeDeleteBrowserSettings(DeleteBrowserSettingsRequest deleteBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBrowserSettingsRequest> request = null;
        Response<DeleteBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBrowserSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the identity provider.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @return Result of the DeleteIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIdentityProviderResult deleteIdentityProvider(DeleteIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentityProvider(request);
    }

    @SdkInternalApi
    final DeleteIdentityProviderResult executeDeleteIdentityProvider(DeleteIdentityProviderRequest deleteIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityProviderRequest> request = null;
        Response<DeleteIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes IP access settings.
     * </p>
     * 
     * @param deleteIpAccessSettingsRequest
     * @return Result of the DeleteIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIpAccessSettingsResult deleteIpAccessSettings(DeleteIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIpAccessSettings(request);
    }

    @SdkInternalApi
    final DeleteIpAccessSettingsResult executeDeleteIpAccessSettings(DeleteIpAccessSettingsRequest deleteIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIpAccessSettingsRequest> request = null;
        Response<DeleteIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes network settings.
     * </p>
     * 
     * @param deleteNetworkSettingsRequest
     * @return Result of the DeleteNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNetworkSettingsResult deleteNetworkSettings(DeleteNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNetworkSettings(request);
    }

    @SdkInternalApi
    final DeleteNetworkSettingsResult executeDeleteNetworkSettings(DeleteNetworkSettingsRequest deleteNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkSettingsRequest> request = null;
        Response<DeleteNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNetworkSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a web portal.
     * </p>
     * 
     * @param deletePortalRequest
     * @return Result of the DeletePortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeletePortal" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePortalResult deletePortal(DeletePortalRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePortal(request);
    }

    @SdkInternalApi
    final DeletePortalResult executeDeletePortal(DeletePortalRequest deletePortalRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePortalRequest> request = null;
        Response<DeletePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the trust store.
     * </p>
     * 
     * @param deleteTrustStoreRequest
     * @return Result of the DeleteTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrustStoreResult deleteTrustStore(DeleteTrustStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrustStore(request);
    }

    @SdkInternalApi
    final DeleteTrustStoreResult executeDeleteTrustStore(DeleteTrustStoreRequest deleteTrustStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrustStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustStoreRequest> request = null;
        Response<DeleteTrustStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrustStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrustStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrustStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrustStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes user access logging settings.
     * </p>
     * 
     * @param deleteUserAccessLoggingSettingsRequest
     * @return Result of the DeleteUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserAccessLoggingSettingsResult deleteUserAccessLoggingSettings(DeleteUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final DeleteUserAccessLoggingSettingsResult executeDeleteUserAccessLoggingSettings(
            DeleteUserAccessLoggingSettingsRequest deleteUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserAccessLoggingSettingsRequest> request = null;
        Response<DeleteUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes user settings.
     * </p>
     * 
     * @param deleteUserSettingsRequest
     * @return Result of the DeleteUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.DeleteUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DeleteUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserSettingsResult deleteUserSettings(DeleteUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserSettings(request);
    }

    @SdkInternalApi
    final DeleteUserSettingsResult executeDeleteUserSettings(DeleteUserSettingsRequest deleteUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserSettingsRequest> request = null;
        Response<DeleteUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates browser settings from a web portal.
     * </p>
     * 
     * @param disassociateBrowserSettingsRequest
     * @return Result of the DisassociateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateBrowserSettingsResult disassociateBrowserSettings(DisassociateBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateBrowserSettings(request);
    }

    @SdkInternalApi
    final DisassociateBrowserSettingsResult executeDisassociateBrowserSettings(DisassociateBrowserSettingsRequest disassociateBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateBrowserSettingsRequest> request = null;
        Response<DisassociateBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateBrowserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates IP access settings from a web portal.
     * </p>
     * 
     * @param disassociateIpAccessSettingsRequest
     * @return Result of the DisassociateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateIpAccessSettingsResult disassociateIpAccessSettings(DisassociateIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateIpAccessSettings(request);
    }

    @SdkInternalApi
    final DisassociateIpAccessSettingsResult executeDisassociateIpAccessSettings(DisassociateIpAccessSettingsRequest disassociateIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateIpAccessSettingsRequest> request = null;
        Response<DisassociateIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates network settings from a web portal.
     * </p>
     * 
     * @param disassociateNetworkSettingsRequest
     * @return Result of the DisassociateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateNetworkSettingsResult disassociateNetworkSettings(DisassociateNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateNetworkSettings(request);
    }

    @SdkInternalApi
    final DisassociateNetworkSettingsResult executeDisassociateNetworkSettings(DisassociateNetworkSettingsRequest disassociateNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateNetworkSettingsRequest> request = null;
        Response<DisassociateNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateNetworkSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a trust store from a web portal.
     * </p>
     * 
     * @param disassociateTrustStoreRequest
     * @return Result of the DisassociateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTrustStoreResult disassociateTrustStore(DisassociateTrustStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTrustStore(request);
    }

    @SdkInternalApi
    final DisassociateTrustStoreResult executeDisassociateTrustStore(DisassociateTrustStoreRequest disassociateTrustStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTrustStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTrustStoreRequest> request = null;
        Response<DisassociateTrustStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTrustStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateTrustStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTrustStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTrustStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateTrustStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates user access logging settings from a web portal.
     * </p>
     * 
     * @param disassociateUserAccessLoggingSettingsRequest
     * @return Result of the DisassociateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateUserAccessLoggingSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateUserAccessLoggingSettingsResult disassociateUserAccessLoggingSettings(DisassociateUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final DisassociateUserAccessLoggingSettingsResult executeDisassociateUserAccessLoggingSettings(
            DisassociateUserAccessLoggingSettingsRequest disassociateUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateUserAccessLoggingSettingsRequest> request = null;
        Response<DisassociateUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates user settings from a web portal.
     * </p>
     * 
     * @param disassociateUserSettingsRequest
     * @return Result of the DisassociateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.DisassociateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/DisassociateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateUserSettingsResult disassociateUserSettings(DisassociateUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateUserSettings(request);
    }

    @SdkInternalApi
    final DisassociateUserSettingsResult executeDisassociateUserSettings(DisassociateUserSettingsRequest disassociateUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateUserSettingsRequest> request = null;
        Response<DisassociateUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets browser settings.
     * </p>
     * 
     * @param getBrowserSettingsRequest
     * @return Result of the GetBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetBrowserSettingsResult getBrowserSettings(GetBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBrowserSettings(request);
    }

    @SdkInternalApi
    final GetBrowserSettingsResult executeGetBrowserSettings(GetBrowserSettingsRequest getBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBrowserSettingsRequest> request = null;
        Response<GetBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBrowserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the identity provider.
     * </p>
     * 
     * @param getIdentityProviderRequest
     * @return Result of the GetIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdentityProviderResult getIdentityProvider(GetIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentityProvider(request);
    }

    @SdkInternalApi
    final GetIdentityProviderResult executeGetIdentityProvider(GetIdentityProviderRequest getIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityProviderRequest> request = null;
        Response<GetIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the IP access settings.
     * </p>
     * 
     * @param getIpAccessSettingsRequest
     * @return Result of the GetIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIpAccessSettingsResult getIpAccessSettings(GetIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetIpAccessSettings(request);
    }

    @SdkInternalApi
    final GetIpAccessSettingsResult executeGetIpAccessSettings(GetIpAccessSettingsRequest getIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIpAccessSettingsRequest> request = null;
        Response<GetIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the network settings.
     * </p>
     * 
     * @param getNetworkSettingsRequest
     * @return Result of the GetNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkSettingsResult getNetworkSettings(GetNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkSettings(request);
    }

    @SdkInternalApi
    final GetNetworkSettingsResult executeGetNetworkSettings(GetNetworkSettingsRequest getNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkSettingsRequest> request = null;
        Response<GetNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the web portal.
     * </p>
     * 
     * @param getPortalRequest
     * @return Result of the GetPortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetPortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortal" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPortalResult getPortal(GetPortalRequest request) {
        request = beforeClientExecution(request);
        return executeGetPortal(request);
    }

    @SdkInternalApi
    final GetPortalResult executeGetPortal(GetPortalRequest getPortalRequest) {

        ExecutionContext executionContext = createExecutionContext(getPortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPortalRequest> request = null;
        Response<GetPortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPortalResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the service provider metadata.
     * </p>
     * 
     * @param getPortalServiceProviderMetadataRequest
     * @return Result of the GetPortalServiceProviderMetadata operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetPortalServiceProviderMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetPortalServiceProviderMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPortalServiceProviderMetadataResult getPortalServiceProviderMetadata(GetPortalServiceProviderMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetPortalServiceProviderMetadata(request);
    }

    @SdkInternalApi
    final GetPortalServiceProviderMetadataResult executeGetPortalServiceProviderMetadata(
            GetPortalServiceProviderMetadataRequest getPortalServiceProviderMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getPortalServiceProviderMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPortalServiceProviderMetadataRequest> request = null;
        Response<GetPortalServiceProviderMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPortalServiceProviderMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPortalServiceProviderMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPortalServiceProviderMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPortalServiceProviderMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPortalServiceProviderMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the trust store.
     * </p>
     * 
     * @param getTrustStoreRequest
     * @return Result of the GetTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTrustStoreResult getTrustStore(GetTrustStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrustStore(request);
    }

    @SdkInternalApi
    final GetTrustStoreResult executeGetTrustStore(GetTrustStoreRequest getTrustStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrustStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrustStoreRequest> request = null;
        Response<GetTrustStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrustStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrustStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrustStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrustStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTrustStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the trust store certificate.
     * </p>
     * 
     * @param getTrustStoreCertificateRequest
     * @return Result of the GetTrustStoreCertificate operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetTrustStoreCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetTrustStoreCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTrustStoreCertificateResult getTrustStoreCertificate(GetTrustStoreCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrustStoreCertificate(request);
    }

    @SdkInternalApi
    final GetTrustStoreCertificateResult executeGetTrustStoreCertificate(GetTrustStoreCertificateRequest getTrustStoreCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrustStoreCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrustStoreCertificateRequest> request = null;
        Response<GetTrustStoreCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrustStoreCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTrustStoreCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrustStoreCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrustStoreCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTrustStoreCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets user access logging settings.
     * </p>
     * 
     * @param getUserAccessLoggingSettingsRequest
     * @return Result of the GetUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetUserAccessLoggingSettingsResult getUserAccessLoggingSettings(GetUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final GetUserAccessLoggingSettingsResult executeGetUserAccessLoggingSettings(GetUserAccessLoggingSettingsRequest getUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserAccessLoggingSettingsRequest> request = null;
        Response<GetUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets user settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return Result of the GetUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetUserSettingsResult getUserSettings(GetUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserSettings(request);
    }

    @SdkInternalApi
    final GetUserSettingsResult executeGetUserSettings(GetUserSettingsRequest getUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserSettingsRequest> request = null;
        Response<GetUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of browser settings.
     * </p>
     * 
     * @param listBrowserSettingsRequest
     * @return Result of the ListBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBrowserSettingsResult listBrowserSettings(ListBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeListBrowserSettings(request);
    }

    @SdkInternalApi
    final ListBrowserSettingsResult executeListBrowserSettings(ListBrowserSettingsRequest listBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBrowserSettingsRequest> request = null;
        Response<ListBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBrowserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of identity providers for a specific web portal.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return Result of the ListIdentityProviders operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentityProviders(request);
    }

    @SdkInternalApi
    final ListIdentityProvidersResult executeListIdentityProviders(ListIdentityProvidersRequest listIdentityProvidersRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentityProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityProvidersRequest> request = null;
        Response<ListIdentityProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityProvidersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentityProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentityProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdentityProvidersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListIdentityProvidersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of IP access settings.
     * </p>
     * 
     * @param listIpAccessSettingsRequest
     * @return Result of the ListIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIpAccessSettingsResult listIpAccessSettings(ListIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeListIpAccessSettings(request);
    }

    @SdkInternalApi
    final ListIpAccessSettingsResult executeListIpAccessSettings(ListIpAccessSettingsRequest listIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIpAccessSettingsRequest> request = null;
        Response<ListIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of network settings.
     * </p>
     * 
     * @param listNetworkSettingsRequest
     * @return Result of the ListNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNetworkSettingsResult listNetworkSettings(ListNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworkSettings(request);
    }

    @SdkInternalApi
    final ListNetworkSettingsResult executeListNetworkSettings(ListNetworkSettingsRequest listNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworkSettingsRequest> request = null;
        Response<ListNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworkSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list or web portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return Result of the ListPortals operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPortalsResult listPortals(ListPortalsRequest request) {
        request = beforeClientExecution(request);
        return executeListPortals(request);
    }

    @SdkInternalApi
    final ListPortalsResult executeListPortals(ListPortalsRequest listPortalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPortalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPortalsRequest> request = null;
        Response<ListPortalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPortalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPortalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPortals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPortalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPortalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
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
     * Retrieves a list of trust store certificates.
     * </p>
     * 
     * @param listTrustStoreCertificatesRequest
     * @return Result of the ListTrustStoreCertificates operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListTrustStoreCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStoreCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrustStoreCertificatesResult listTrustStoreCertificates(ListTrustStoreCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTrustStoreCertificates(request);
    }

    @SdkInternalApi
    final ListTrustStoreCertificatesResult executeListTrustStoreCertificates(ListTrustStoreCertificatesRequest listTrustStoreCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrustStoreCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrustStoreCertificatesRequest> request = null;
        Response<ListTrustStoreCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrustStoreCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTrustStoreCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrustStoreCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrustStoreCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTrustStoreCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of trust stores.
     * </p>
     * 
     * @param listTrustStoresRequest
     * @return Result of the ListTrustStores operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListTrustStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStores" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTrustStoresResult listTrustStores(ListTrustStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListTrustStores(request);
    }

    @SdkInternalApi
    final ListTrustStoresResult executeListTrustStores(ListTrustStoresRequest listTrustStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrustStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrustStoresRequest> request = null;
        Response<ListTrustStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrustStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrustStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrustStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrustStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrustStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of user access logging settings.
     * </p>
     * 
     * @param listUserAccessLoggingSettingsRequest
     * @return Result of the ListUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUserAccessLoggingSettingsResult listUserAccessLoggingSettings(ListUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final ListUserAccessLoggingSettingsResult executeListUserAccessLoggingSettings(ListUserAccessLoggingSettingsRequest listUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserAccessLoggingSettingsRequest> request = null;
        Response<ListUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of user settings.
     * </p>
     * 
     * @param listUserSettingsRequest
     * @return Result of the ListUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.ListUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUserSettingsResult listUserSettings(ListUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserSettings(request);
    }

    @SdkInternalApi
    final ListUserSettingsResult executeListUserSettings(ListUserSettingsRequest listUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserSettingsRequest> request = null;
        Response<ListUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @throws TooManyTagsException
     *         There are too many tags.
     * @sample AmazonWorkSpacesWeb.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
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
     * Updates browser settings.
     * </p>
     * 
     * @param updateBrowserSettingsRequest
     * @return Result of the UpdateBrowserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateBrowserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateBrowserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBrowserSettingsResult updateBrowserSettings(UpdateBrowserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBrowserSettings(request);
    }

    @SdkInternalApi
    final UpdateBrowserSettingsResult executeUpdateBrowserSettings(UpdateBrowserSettingsRequest updateBrowserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBrowserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBrowserSettingsRequest> request = null;
        Response<UpdateBrowserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBrowserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBrowserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBrowserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBrowserSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateBrowserSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the identity provider.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return Result of the UpdateIdentityProvider operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdentityProviderResult updateIdentityProvider(UpdateIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdentityProvider(request);
    }

    @SdkInternalApi
    final UpdateIdentityProviderResult executeUpdateIdentityProvider(UpdateIdentityProviderRequest updateIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityProviderRequest> request = null;
        Response<UpdateIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates IP access settings.
     * </p>
     * 
     * @param updateIpAccessSettingsRequest
     * @return Result of the UpdateIpAccessSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateIpAccessSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateIpAccessSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIpAccessSettingsResult updateIpAccessSettings(UpdateIpAccessSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIpAccessSettings(request);
    }

    @SdkInternalApi
    final UpdateIpAccessSettingsResult executeUpdateIpAccessSettings(UpdateIpAccessSettingsRequest updateIpAccessSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIpAccessSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIpAccessSettingsRequest> request = null;
        Response<UpdateIpAccessSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIpAccessSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIpAccessSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIpAccessSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIpAccessSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIpAccessSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates network settings.
     * </p>
     * 
     * @param updateNetworkSettingsRequest
     * @return Result of the UpdateNetworkSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateNetworkSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateNetworkSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNetworkSettingsResult updateNetworkSettings(UpdateNetworkSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNetworkSettings(request);
    }

    @SdkInternalApi
    final UpdateNetworkSettingsResult executeUpdateNetworkSettings(UpdateNetworkSettingsRequest updateNetworkSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNetworkSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkSettingsRequest> request = null;
        Response<UpdateNetworkSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNetworkSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNetworkSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNetworkSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateNetworkSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a web portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return Result of the UpdatePortal operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @throws ConflictException
     *         There is a conflict.
     * @sample AmazonWorkSpacesWeb.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdatePortal" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePortalResult updatePortal(UpdatePortalRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePortal(request);
    }

    @SdkInternalApi
    final UpdatePortalResult executeUpdatePortal(UpdatePortalRequest updatePortalRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePortalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePortalRequest> request = null;
        Response<UpdatePortalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePortalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePortalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePortal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePortalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePortalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the trust store.
     * </p>
     * 
     * @param updateTrustStoreRequest
     * @return Result of the UpdateTrustStore operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateTrustStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateTrustStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTrustStoreResult updateTrustStore(UpdateTrustStoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrustStore(request);
    }

    @SdkInternalApi
    final UpdateTrustStoreResult executeUpdateTrustStore(UpdateTrustStoreRequest updateTrustStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrustStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrustStoreRequest> request = null;
        Response<UpdateTrustStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrustStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrustStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrustStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrustStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrustStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the user access logging settings.
     * </p>
     * 
     * @param updateUserAccessLoggingSettingsRequest
     * @return Result of the UpdateUserAccessLoggingSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateUserAccessLoggingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserAccessLoggingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserAccessLoggingSettingsResult updateUserAccessLoggingSettings(UpdateUserAccessLoggingSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserAccessLoggingSettings(request);
    }

    @SdkInternalApi
    final UpdateUserAccessLoggingSettingsResult executeUpdateUserAccessLoggingSettings(
            UpdateUserAccessLoggingSettingsRequest updateUserAccessLoggingSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserAccessLoggingSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserAccessLoggingSettingsRequest> request = null;
        Response<UpdateUserAccessLoggingSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserAccessLoggingSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserAccessLoggingSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserAccessLoggingSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserAccessLoggingSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserAccessLoggingSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the user settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @return Result of the UpdateUserSettings operation returned by the service.
     * @throws InternalServerException
     *         There is an internal server error.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ThrottlingException
     *         There is a throttling error.
     * @throws ValidationException
     *         There is a validation error.
     * @sample AmazonWorkSpacesWeb.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserSettingsResult updateUserSettings(UpdateUserSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserSettings(request);
    }

    @SdkInternalApi
    final UpdateUserSettingsResult executeUpdateUserSettings(UpdateUserSettingsRequest updateUserSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserSettingsRequest> request = null;
        Response<UpdateUserSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkSpaces Web");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserSettingsResultJsonUnmarshaller());
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
