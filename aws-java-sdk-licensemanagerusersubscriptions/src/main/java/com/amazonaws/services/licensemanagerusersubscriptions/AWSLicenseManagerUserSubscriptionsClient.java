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
package com.amazonaws.services.licensemanagerusersubscriptions;

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

import com.amazonaws.services.licensemanagerusersubscriptions.AWSLicenseManagerUserSubscriptionsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;
import com.amazonaws.services.licensemanagerusersubscriptions.model.transform.*;

/**
 * Client for accessing AWS License Manager User Subscriptions. All service calls made using this client are blocking,
 * and will not return until the service call completes.
 * <p>
 * <p>
 * With License Manager, you can create user-based subscriptions to utilize licensed software with a per user
 * subscription fee on Amazon EC2 instances.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLicenseManagerUserSubscriptionsClient extends AmazonWebServiceClient implements AWSLicenseManagerUserSubscriptions {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLicenseManagerUserSubscriptions.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "license-manager-user-subscriptions";

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
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.ServiceQuotaExceededExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanagerusersubscriptions.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(
                            com.amazonaws.services.licensemanagerusersubscriptions.model.AWSLicenseManagerUserSubscriptionsException.class));

    public static AWSLicenseManagerUserSubscriptionsClientBuilder builder() {
        return AWSLicenseManagerUserSubscriptionsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS License Manager User Subscriptions using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerUserSubscriptionsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS License Manager User Subscriptions using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerUserSubscriptionsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("license-manager-user-subscriptions.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/licensemanagerusersubscriptions/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/licensemanagerusersubscriptions/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates the user to an EC2 instance to utilize user-based subscriptions.
     * </p>
     * <note>
     * <p>
     * Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing
     * periods that haven't closed (marked as <b>Pending</b> billing status) in Amazon Web Services Billing. For more
     * information, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/invoice.html">Viewing your
     * monthly charges</a> in the <i>Amazon Web Services Billing User Guide</i>.
     * </p>
     * </note>
     * 
     * @param associateUserRequest
     * @return Result of the AssociateUser operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.AssociateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/AssociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateUserResult associateUser(AssociateUserRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateUser(request);
    }

    @SdkInternalApi
    final AssociateUserResult executeAssociateUser(AssociateUserRequest associateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(associateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateUserRequest> request = null;
        Response<AssociateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the identity provider from providing user-based subscriptions.
     * </p>
     * 
     * @param deregisterIdentityProviderRequest
     * @return Result of the DeregisterIdentityProvider operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.DeregisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DeregisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterIdentityProviderResult deregisterIdentityProvider(DeregisterIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterIdentityProvider(request);
    }

    @SdkInternalApi
    final DeregisterIdentityProviderResult executeDeregisterIdentityProvider(DeregisterIdentityProviderRequest deregisterIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterIdentityProviderRequest> request = null;
        Response<DeregisterIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the user from an EC2 instance providing user-based subscriptions.
     * </p>
     * 
     * @param disassociateUserRequest
     * @return Result of the DisassociateUser operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.DisassociateUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/DisassociateUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateUserResult disassociateUser(DisassociateUserRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateUser(request);
    }

    @SdkInternalApi
    final DisassociateUserResult executeDisassociateUser(DisassociateUserRequest disassociateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateUserRequest> request = null;
        Response<DisassociateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the identity providers for user-based subscriptions.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return Result of the ListIdentityProviders operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListIdentityProviders
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListIdentityProviders"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
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
     * Lists the EC2 instances providing user-based subscriptions.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstances(request);
    }

    @SdkInternalApi
    final ListInstancesResult executeListInstances(ListInstancesRequest listInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the user-based subscription products available from an identity provider.
     * </p>
     * 
     * @param listProductSubscriptionsRequest
     * @return Result of the ListProductSubscriptions operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListProductSubscriptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListProductSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProductSubscriptionsResult listProductSubscriptions(ListProductSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeListProductSubscriptions(request);
    }

    @SdkInternalApi
    final ListProductSubscriptionsResult executeListProductSubscriptions(ListProductSubscriptionsRequest listProductSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProductSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProductSubscriptionsRequest> request = null;
        Response<ListProductSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProductSubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProductSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProductSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProductSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProductSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists user associations for an identity provider.
     * </p>
     * 
     * @param listUserAssociationsRequest
     * @return Result of the ListUserAssociations operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.ListUserAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListUserAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUserAssociationsResult listUserAssociations(ListUserAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserAssociations(request);
    }

    @SdkInternalApi
    final ListUserAssociationsResult executeListUserAssociations(ListUserAssociationsRequest listUserAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserAssociationsRequest> request = null;
        Response<ListUserAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an identity provider for user-based subscriptions.
     * </p>
     * 
     * @param registerIdentityProviderRequest
     * @return Result of the RegisterIdentityProvider operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.RegisterIdentityProvider
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/RegisterIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterIdentityProviderResult registerIdentityProvider(RegisterIdentityProviderRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterIdentityProvider(request);
    }

    @SdkInternalApi
    final RegisterIdentityProviderResult executeRegisterIdentityProvider(RegisterIdentityProviderRequest registerIdentityProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(registerIdentityProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterIdentityProviderRequest> request = null;
        Response<RegisterIdentityProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterIdentityProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerIdentityProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterIdentityProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterIdentityProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterIdentityProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a product subscription for a user with the specified identity provider.
     * </p>
     * <note>
     * <p>
     * Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing
     * periods that haven't closed (marked as <b>Pending</b> billing status) in Amazon Web Services Billing. For more
     * information, see <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/invoice.html">Viewing your
     * monthly charges</a> in the <i>Amazon Web Services Billing User Guide</i>.
     * </p>
     * </note>
     * 
     * @param startProductSubscriptionRequest
     * @return Result of the StartProductSubscription operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.StartProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StartProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartProductSubscriptionResult startProductSubscription(StartProductSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeStartProductSubscription(request);
    }

    @SdkInternalApi
    final StartProductSubscriptionResult executeStartProductSubscription(StartProductSubscriptionRequest startProductSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(startProductSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartProductSubscriptionRequest> request = null;
        Response<StartProductSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartProductSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startProductSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartProductSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartProductSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartProductSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a product subscription for a user with the specified identity provider.
     * </p>
     * 
     * @param stopProductSubscriptionRequest
     * @return Result of the StopProductSubscription operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request failed because a service quota is exceeded.
     * @throws ConflictException
     *         The request couldn't be completed because it conflicted with the current state of the resource.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws ResourceNotFoundException
     *         The resource couldn't be found.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.StopProductSubscription
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/StopProductSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopProductSubscriptionResult stopProductSubscription(StopProductSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeStopProductSubscription(request);
    }

    @SdkInternalApi
    final StopProductSubscriptionResult executeStopProductSubscription(StopProductSubscriptionRequest stopProductSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopProductSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopProductSubscriptionRequest> request = null;
        Response<StopProductSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopProductSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopProductSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopProductSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopProductSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopProductSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates additional product configuration settings for the registered identity provider.
     * </p>
     * 
     * @param updateIdentityProviderSettingsRequest
     * @return Result of the UpdateIdentityProviderSettings operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws InternalServerException
     *         An exception occurred with the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @sample AWSLicenseManagerUserSubscriptions.UpdateIdentityProviderSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/UpdateIdentityProviderSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdentityProviderSettingsResult updateIdentityProviderSettings(UpdateIdentityProviderSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdentityProviderSettings(request);
    }

    @SdkInternalApi
    final UpdateIdentityProviderSettingsResult executeUpdateIdentityProviderSettings(UpdateIdentityProviderSettingsRequest updateIdentityProviderSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdentityProviderSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityProviderSettingsRequest> request = null;
        Response<UpdateIdentityProviderSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityProviderSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIdentityProviderSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager User Subscriptions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdentityProviderSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdentityProviderSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIdentityProviderSettingsResultJsonUnmarshaller());
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
