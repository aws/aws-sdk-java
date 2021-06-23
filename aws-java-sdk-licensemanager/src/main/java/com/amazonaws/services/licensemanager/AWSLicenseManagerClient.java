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
package com.amazonaws.services.licensemanager;

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

import com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.services.licensemanager.model.transform.*;

/**
 * Client for accessing AWS License Manager. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname> AWS License Manager </fullname>
 * <p>
 * AWS License Manager makes it easier to manage licenses from software vendors across multiple AWS accounts and
 * on-premises servers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLicenseManagerClient extends AmazonWebServiceClient implements AWSLicenseManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLicenseManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "license-manager";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FailedDependencyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.FailedDependencyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RateLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.RateLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FilterLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.FilterLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerInternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.ServerInternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RedirectException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.RedirectExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedDigitalSignatureMethodException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.UnsupportedDigitalSignatureMethodExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AuthorizationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.AuthorizationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.InvalidResourceStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntitlementNotAllowedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.EntitlementNotAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoEntitlementsAllowedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.NoEntitlementsAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LicenseUsageException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.LicenseUsageExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.licensemanager.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.licensemanager.model.AWSLicenseManagerException.class));

    public static AWSLicenseManagerClientBuilder builder() {
        return AWSLicenseManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS License Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS License Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLicenseManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("license-manager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/licensemanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/licensemanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts the specified grant.
     * </p>
     * 
     * @param acceptGrantRequest
     * @return Result of the AcceptGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.AcceptGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/AcceptGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AcceptGrantResult acceptGrant(AcceptGrantRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptGrant(request);
    }

    @SdkInternalApi
    final AcceptGrantResult executeAcceptGrant(AcceptGrantRequest acceptGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptGrantRequest> request = null;
        Response<AcceptGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks in the specified license. Check in a license when it is no longer in use.
     * </p>
     * 
     * @param checkInLicenseRequest
     * @return Result of the CheckInLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CheckInLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckInLicense" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CheckInLicenseResult checkInLicense(CheckInLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeCheckInLicense(request);
    }

    @SdkInternalApi
    final CheckInLicenseResult executeCheckInLicense(CheckInLicenseRequest checkInLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(checkInLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckInLicenseRequest> request = null;
        Response<CheckInLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckInLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(checkInLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckInLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CheckInLicenseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CheckInLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks out the specified license for offline use.
     * </p>
     * 
     * @param checkoutBorrowLicenseRequest
     * @return Result of the CheckoutBorrowLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws NoEntitlementsAllowedException
     *         There are no entitlements found for this license, or the entitlement maximum count is reached.
     * @throws EntitlementNotAllowedException
     *         The entitlement is not allowed.
     * @throws UnsupportedDigitalSignatureMethodException
     *         The digital signature method is unsupported. Try your request again.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CheckoutBorrowLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutBorrowLicense"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CheckoutBorrowLicenseResult checkoutBorrowLicense(CheckoutBorrowLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeCheckoutBorrowLicense(request);
    }

    @SdkInternalApi
    final CheckoutBorrowLicenseResult executeCheckoutBorrowLicense(CheckoutBorrowLicenseRequest checkoutBorrowLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(checkoutBorrowLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckoutBorrowLicenseRequest> request = null;
        Response<CheckoutBorrowLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckoutBorrowLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(checkoutBorrowLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckoutBorrowLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CheckoutBorrowLicenseResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CheckoutBorrowLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks out the specified license.
     * </p>
     * 
     * @param checkoutLicenseRequest
     * @return Result of the CheckoutLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws NoEntitlementsAllowedException
     *         There are no entitlements found for this license, or the entitlement maximum count is reached.
     * @throws UnsupportedDigitalSignatureMethodException
     *         The digital signature method is unsupported. Try your request again.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CheckoutLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutLicense"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CheckoutLicenseResult checkoutLicense(CheckoutLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeCheckoutLicense(request);
    }

    @SdkInternalApi
    final CheckoutLicenseResult executeCheckoutLicense(CheckoutLicenseRequest checkoutLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(checkoutLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckoutLicenseRequest> request = null;
        Response<CheckoutLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckoutLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(checkoutLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckoutLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CheckoutLicenseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CheckoutLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a grant for the specified license. A grant shares the use of license entitlements with specific AWS
     * accounts.
     * </p>
     * 
     * @param createGrantRequest
     * @return Result of the CreateGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @sample AWSLicenseManager.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateGrantResult createGrant(CreateGrantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGrant(request);
    }

    @SdkInternalApi
    final CreateGrantResult executeCreateGrant(CreateGrantRequest createGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(createGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGrantRequest> request = null;
        Response<CreateGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified grant.
     * </p>
     * 
     * @param createGrantVersionRequest
     * @return Result of the CreateGrantVersion operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateGrantVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrantVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGrantVersionResult createGrantVersion(CreateGrantVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGrantVersion(request);
    }

    @SdkInternalApi
    final CreateGrantVersionResult executeCreateGrantVersion(CreateGrantVersionRequest createGrantVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createGrantVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGrantVersionRequest> request = null;
        Response<CreateGrantVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGrantVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGrantVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGrantVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGrantVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGrantVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a license.
     * </p>
     * 
     * @param createLicenseRequest
     * @return Result of the CreateLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.CreateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLicenseResult createLicense(CreateLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLicense(request);
    }

    @SdkInternalApi
    final CreateLicenseResult executeCreateLicense(CreateLicenseRequest createLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(createLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLicenseRequest> request = null;
        Response<CreateLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLicenseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a license configuration.
     * </p>
     * <p>
     * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
     * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
     * vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), license affinity to
     * host (how long a license must be associated with a host), and the number of licenses purchased and used.
     * </p>
     * 
     * @param createLicenseConfigurationRequest
     * @return Result of the CreateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLicenseConfigurationResult createLicenseConfiguration(CreateLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLicenseConfiguration(request);
    }

    @SdkInternalApi
    final CreateLicenseConfigurationResult executeCreateLicenseConfiguration(CreateLicenseConfigurationRequest createLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLicenseConfigurationRequest> request = null;
        Response<CreateLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new report generator.
     * </p>
     * 
     * @param createLicenseManagerReportGeneratorRequest
     * @return Result of the CreateLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.CreateLicenseManagerReportGenerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLicenseManagerReportGeneratorResult createLicenseManagerReportGenerator(CreateLicenseManagerReportGeneratorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLicenseManagerReportGenerator(request);
    }

    @SdkInternalApi
    final CreateLicenseManagerReportGeneratorResult executeCreateLicenseManagerReportGenerator(
            CreateLicenseManagerReportGeneratorRequest createLicenseManagerReportGeneratorRequest) {

        ExecutionContext executionContext = createExecutionContext(createLicenseManagerReportGeneratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLicenseManagerReportGeneratorRequest> request = null;
        Response<CreateLicenseManagerReportGeneratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLicenseManagerReportGeneratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLicenseManagerReportGeneratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLicenseManagerReportGenerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLicenseManagerReportGeneratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLicenseManagerReportGeneratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified license.
     * </p>
     * 
     * @param createLicenseVersionRequest
     * @return Result of the CreateLicenseVersion operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.CreateLicenseVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLicenseVersionResult createLicenseVersion(CreateLicenseVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLicenseVersion(request);
    }

    @SdkInternalApi
    final CreateLicenseVersionResult executeCreateLicenseVersion(CreateLicenseVersionRequest createLicenseVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createLicenseVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLicenseVersionRequest> request = null;
        Response<CreateLicenseVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLicenseVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLicenseVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLicenseVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLicenseVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLicenseVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a long-lived token.
     * </p>
     * <p>
     * A refresh token is a JWT token used to get an access token. With an access token, you can call
     * AssumeRoleWithWebIdentity to get role credentials that you can use to call License Manager to manage the
     * specified license.
     * </p>
     * 
     * @param createTokenRequest
     * @return Result of the CreateToken operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @sample AWSLicenseManager.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateToken" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateTokenResult createToken(CreateTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateToken(request);
    }

    @SdkInternalApi
    final CreateTokenResult executeCreateToken(CreateTokenRequest createTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTokenRequest> request = null;
        Response<CreateTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified grant.
     * </p>
     * 
     * @param deleteGrantRequest
     * @return Result of the DeleteGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.DeleteGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteGrantResult deleteGrant(DeleteGrantRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGrant(request);
    }

    @SdkInternalApi
    final DeleteGrantResult executeDeleteGrant(DeleteGrantRequest deleteGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGrantRequest> request = null;
        Response<DeleteGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified license.
     * </p>
     * 
     * @param deleteLicenseRequest
     * @return Result of the DeleteLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.DeleteLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicense" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLicenseResult deleteLicense(DeleteLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLicense(request);
    }

    @SdkInternalApi
    final DeleteLicenseResult executeDeleteLicense(DeleteLicenseRequest deleteLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLicenseRequest> request = null;
        Response<DeleteLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLicenseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified license configuration.
     * </p>
     * <p>
     * You cannot delete a license configuration that is in use.
     * </p>
     * 
     * @param deleteLicenseConfigurationRequest
     * @return Result of the DeleteLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.DeleteLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLicenseConfigurationResult deleteLicenseConfiguration(DeleteLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLicenseConfiguration(request);
    }

    @SdkInternalApi
    final DeleteLicenseConfigurationResult executeDeleteLicenseConfiguration(DeleteLicenseConfigurationRequest deleteLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLicenseConfigurationRequest> request = null;
        Response<DeleteLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an existing report generator.
     * </p>
     * <p>
     * This action deletes the report generator, which stops it from generating future reports and cannot be reversed.
     * However, the previous reports from this generator will remain in your S3 bucket.
     * </p>
     * 
     * @param deleteLicenseManagerReportGeneratorRequest
     * @return Result of the DeleteLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.DeleteLicenseManagerReportGenerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLicenseManagerReportGeneratorResult deleteLicenseManagerReportGenerator(DeleteLicenseManagerReportGeneratorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLicenseManagerReportGenerator(request);
    }

    @SdkInternalApi
    final DeleteLicenseManagerReportGeneratorResult executeDeleteLicenseManagerReportGenerator(
            DeleteLicenseManagerReportGeneratorRequest deleteLicenseManagerReportGeneratorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLicenseManagerReportGeneratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLicenseManagerReportGeneratorRequest> request = null;
        Response<DeleteLicenseManagerReportGeneratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLicenseManagerReportGeneratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLicenseManagerReportGeneratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLicenseManagerReportGenerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLicenseManagerReportGeneratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLicenseManagerReportGeneratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified token. Must be called in the license home Region.
     * </p>
     * 
     * @param deleteTokenRequest
     * @return Result of the DeleteToken operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws RedirectException
     *         This is not the correct Region for the resource. Try again.
     * @sample AWSLicenseManager.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/DeleteToken" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteTokenResult deleteToken(DeleteTokenRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteToken(request);
    }

    @SdkInternalApi
    final DeleteTokenResult executeDeleteToken(DeleteTokenRequest deleteTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTokenRequest> request = null;
        Response<DeleteTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Extends the expiration date for license consumption.
     * </p>
     * 
     * @param extendLicenseConsumptionRequest
     * @return Result of the ExtendLicenseConsumption operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.ExtendLicenseConsumption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ExtendLicenseConsumption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExtendLicenseConsumptionResult extendLicenseConsumption(ExtendLicenseConsumptionRequest request) {
        request = beforeClientExecution(request);
        return executeExtendLicenseConsumption(request);
    }

    @SdkInternalApi
    final ExtendLicenseConsumptionResult executeExtendLicenseConsumption(ExtendLicenseConsumptionRequest extendLicenseConsumptionRequest) {

        ExecutionContext executionContext = createExecutionContext(extendLicenseConsumptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExtendLicenseConsumptionRequest> request = null;
        Response<ExtendLicenseConsumptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExtendLicenseConsumptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(extendLicenseConsumptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExtendLicenseConsumption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExtendLicenseConsumptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExtendLicenseConsumptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a temporary access token to use with AssumeRoleWithWebIdentity. Access tokens are valid for one hour.
     * </p>
     * 
     * @param getAccessTokenRequest
     * @return Result of the GetAccessToken operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.GetAccessToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetAccessToken" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccessTokenResult getAccessToken(GetAccessTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessToken(request);
    }

    @SdkInternalApi
    final GetAccessTokenResult executeGetAccessToken(GetAccessTokenRequest getAccessTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessTokenRequest> request = null;
        Response<GetAccessTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccessTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccessTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccessTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about the specified grant.
     * </p>
     * 
     * @param getGrantRequest
     * @return Result of the GetGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetGrant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGrantResult getGrant(GetGrantRequest request) {
        request = beforeClientExecution(request);
        return executeGetGrant(request);
    }

    @SdkInternalApi
    final GetGrantResult executeGetGrant(GetGrantRequest getGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(getGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGrantRequest> request = null;
        Response<GetGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGrantResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about the specified license.
     * </p>
     * 
     * @param getLicenseRequest
     * @return Result of the GetLicense operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.GetLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicense" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLicenseResult getLicense(GetLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeGetLicense(request);
    }

    @SdkInternalApi
    final GetLicenseResult executeGetLicense(GetLicenseRequest getLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(getLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLicenseRequest> request = null;
        Response<GetLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLicenseResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about the specified license configuration.
     * </p>
     * 
     * @param getLicenseConfigurationRequest
     * @return Result of the GetLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLicenseConfigurationResult getLicenseConfiguration(GetLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLicenseConfiguration(request);
    }

    @SdkInternalApi
    final GetLicenseConfigurationResult executeGetLicenseConfiguration(GetLicenseConfigurationRequest getLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLicenseConfigurationRequest> request = null;
        Response<GetLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information on the specified report generator.
     * </p>
     * 
     * @param getLicenseManagerReportGeneratorRequest
     * @return Result of the GetLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.GetLicenseManagerReportGenerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLicenseManagerReportGeneratorResult getLicenseManagerReportGenerator(GetLicenseManagerReportGeneratorRequest request) {
        request = beforeClientExecution(request);
        return executeGetLicenseManagerReportGenerator(request);
    }

    @SdkInternalApi
    final GetLicenseManagerReportGeneratorResult executeGetLicenseManagerReportGenerator(
            GetLicenseManagerReportGeneratorRequest getLicenseManagerReportGeneratorRequest) {

        ExecutionContext executionContext = createExecutionContext(getLicenseManagerReportGeneratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLicenseManagerReportGeneratorRequest> request = null;
        Response<GetLicenseManagerReportGeneratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLicenseManagerReportGeneratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLicenseManagerReportGeneratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLicenseManagerReportGenerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLicenseManagerReportGeneratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLicenseManagerReportGeneratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about the usage of the specified license.
     * </p>
     * 
     * @param getLicenseUsageRequest
     * @return Result of the GetLicenseUsage operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.GetLicenseUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseUsage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLicenseUsageResult getLicenseUsage(GetLicenseUsageRequest request) {
        request = beforeClientExecution(request);
        return executeGetLicenseUsage(request);
    }

    @SdkInternalApi
    final GetLicenseUsageResult executeGetLicenseUsage(GetLicenseUsageRequest getLicenseUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(getLicenseUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLicenseUsageRequest> request = null;
        Response<GetLicenseUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLicenseUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLicenseUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLicenseUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLicenseUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLicenseUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the License Manager settings for the current Region.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return Result of the GetServiceSettings operation returned by the service.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.GetServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceSettingsResult getServiceSettings(GetServiceSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceSettings(request);
    }

    @SdkInternalApi
    final GetServiceSettingsResult executeGetServiceSettings(GetServiceSettingsRequest getServiceSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceSettingsRequest> request = null;
        Response<GetServiceSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resource associations for the specified license configuration.
     * </p>
     * <p>
     * Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped
     * instance might not consume a license (depending on the license rules).
     * </p>
     * 
     * @param listAssociationsForLicenseConfigurationRequest
     * @return Result of the ListAssociationsForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListAssociationsForLicenseConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListAssociationsForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociationsForLicenseConfigurationResult listAssociationsForLicenseConfiguration(ListAssociationsForLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociationsForLicenseConfiguration(request);
    }

    @SdkInternalApi
    final ListAssociationsForLicenseConfigurationResult executeListAssociationsForLicenseConfiguration(
            ListAssociationsForLicenseConfigurationRequest listAssociationsForLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociationsForLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsForLicenseConfigurationRequest> request = null;
        Response<ListAssociationsForLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsForLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssociationsForLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociationsForLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociationsForLicenseConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssociationsForLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the grants distributed for the specified license.
     * </p>
     * 
     * @param listDistributedGrantsRequest
     * @return Result of the ListDistributedGrants operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListDistributedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListDistributedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributedGrantsResult listDistributedGrants(ListDistributedGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributedGrants(request);
    }

    @SdkInternalApi
    final ListDistributedGrantsResult executeListDistributedGrants(ListDistributedGrantsRequest listDistributedGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributedGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributedGrantsRequest> request = null;
        Response<ListDistributedGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributedGrantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDistributedGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributedGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDistributedGrantsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDistributedGrantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the license configuration operations that failed.
     * </p>
     * 
     * @param listFailuresForLicenseConfigurationOperationsRequest
     * @return Result of the ListFailuresForLicenseConfigurationOperations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListFailuresForLicenseConfigurationOperations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListFailuresForLicenseConfigurationOperations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFailuresForLicenseConfigurationOperationsResult listFailuresForLicenseConfigurationOperations(
            ListFailuresForLicenseConfigurationOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListFailuresForLicenseConfigurationOperations(request);
    }

    @SdkInternalApi
    final ListFailuresForLicenseConfigurationOperationsResult executeListFailuresForLicenseConfigurationOperations(
            ListFailuresForLicenseConfigurationOperationsRequest listFailuresForLicenseConfigurationOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFailuresForLicenseConfigurationOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFailuresForLicenseConfigurationOperationsRequest> request = null;
        Response<ListFailuresForLicenseConfigurationOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFailuresForLicenseConfigurationOperationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFailuresForLicenseConfigurationOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFailuresForLicenseConfigurationOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFailuresForLicenseConfigurationOperationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListFailuresForLicenseConfigurationOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the license configurations for your account.
     * </p>
     * 
     * @param listLicenseConfigurationsRequest
     * @return Result of the ListLicenseConfigurations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLicenseConfigurationsResult listLicenseConfigurations(ListLicenseConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseConfigurations(request);
    }

    @SdkInternalApi
    final ListLicenseConfigurationsResult executeListLicenseConfigurations(ListLicenseConfigurationsRequest listLicenseConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseConfigurationsRequest> request = null;
        Response<ListLicenseConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLicenseConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLicenseConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the report generators for your account.
     * </p>
     * 
     * @param listLicenseManagerReportGeneratorsRequest
     * @return Result of the ListLicenseManagerReportGenerators operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AWSLicenseManager.ListLicenseManagerReportGenerators
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseManagerReportGenerators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLicenseManagerReportGeneratorsResult listLicenseManagerReportGenerators(ListLicenseManagerReportGeneratorsRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseManagerReportGenerators(request);
    }

    @SdkInternalApi
    final ListLicenseManagerReportGeneratorsResult executeListLicenseManagerReportGenerators(
            ListLicenseManagerReportGeneratorsRequest listLicenseManagerReportGeneratorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseManagerReportGeneratorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseManagerReportGeneratorsRequest> request = null;
        Response<ListLicenseManagerReportGeneratorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseManagerReportGeneratorsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLicenseManagerReportGeneratorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseManagerReportGenerators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseManagerReportGeneratorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLicenseManagerReportGeneratorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the license configurations for the specified resource.
     * </p>
     * 
     * @param listLicenseSpecificationsForResourceRequest
     * @return Result of the ListLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLicenseSpecificationsForResourceResult listLicenseSpecificationsForResource(ListLicenseSpecificationsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseSpecificationsForResource(request);
    }

    @SdkInternalApi
    final ListLicenseSpecificationsForResourceResult executeListLicenseSpecificationsForResource(
            ListLicenseSpecificationsForResourceRequest listLicenseSpecificationsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseSpecificationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseSpecificationsForResourceRequest> request = null;
        Response<ListLicenseSpecificationsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseSpecificationsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLicenseSpecificationsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseSpecificationsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseSpecificationsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLicenseSpecificationsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all versions of the specified license.
     * </p>
     * 
     * @param listLicenseVersionsRequest
     * @return Result of the ListLicenseVersions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.ListLicenseVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLicenseVersionsResult listLicenseVersions(ListLicenseVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseVersions(request);
    }

    @SdkInternalApi
    final ListLicenseVersionsResult executeListLicenseVersions(ListLicenseVersionsRequest listLicenseVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseVersionsRequest> request = null;
        Response<ListLicenseVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLicenseVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLicenseVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the licenses for your account.
     * </p>
     * 
     * @param listLicensesRequest
     * @return Result of the ListLicenses operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.ListLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenses" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLicensesResult listLicenses(ListLicensesRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenses(request);
    }

    @SdkInternalApi
    final ListLicensesResult executeListLicenses(ListLicensesRequest listLicensesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicensesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicensesRequest> request = null;
        Response<ListLicensesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicensesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLicensesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicensesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLicensesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists grants that are received but not accepted.
     * </p>
     * 
     * @param listReceivedGrantsRequest
     * @return Result of the ListReceivedGrants operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListReceivedGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedGrants"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReceivedGrantsResult listReceivedGrants(ListReceivedGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListReceivedGrants(request);
    }

    @SdkInternalApi
    final ListReceivedGrantsResult executeListReceivedGrants(ListReceivedGrantsRequest listReceivedGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReceivedGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceivedGrantsRequest> request = null;
        Response<ListReceivedGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceivedGrantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReceivedGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReceivedGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReceivedGrantsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReceivedGrantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists received licenses.
     * </p>
     * 
     * @param listReceivedLicensesRequest
     * @return Result of the ListReceivedLicenses operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListReceivedLicenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListReceivedLicenses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReceivedLicensesResult listReceivedLicenses(ListReceivedLicensesRequest request) {
        request = beforeClientExecution(request);
        return executeListReceivedLicenses(request);
    }

    @SdkInternalApi
    final ListReceivedLicensesResult executeListReceivedLicenses(ListReceivedLicensesRequest listReceivedLicensesRequest) {

        ExecutionContext executionContext = createExecutionContext(listReceivedLicensesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceivedLicensesRequest> request = null;
        Response<ListReceivedLicensesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceivedLicensesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReceivedLicensesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReceivedLicenses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReceivedLicensesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReceivedLicensesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists resources managed using Systems Manager inventory.
     * </p>
     * 
     * @param listResourceInventoryRequest
     * @return Result of the ListResourceInventory operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws FailedDependencyException
     *         A dependency required to run the API is missing.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListResourceInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceInventoryResult listResourceInventory(ListResourceInventoryRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceInventory(request);
    }

    @SdkInternalApi
    final ListResourceInventoryResult executeListResourceInventory(ListResourceInventoryRequest listResourceInventoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceInventoryRequest> request = null;
        Response<ListResourceInventoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceInventoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceInventoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceInventory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceInventoryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListResourceInventoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified license configuration.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
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
     * Lists your tokens.
     * </p>
     * 
     * @param listTokensRequest
     * @return Result of the ListTokens operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.ListTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTokens" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTokensResult listTokens(ListTokensRequest request) {
        request = beforeClientExecution(request);
        return executeListTokens(request);
    }

    @SdkInternalApi
    final ListTokensResult executeListTokens(ListTokensRequest listTokensRequest) {

        ExecutionContext executionContext = createExecutionContext(listTokensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTokensRequest> request = null;
        Response<ListTokensResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTokensRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTokensRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTokens");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTokensResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTokensResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all license usage records for a license configuration, displaying license consumption details by resource
     * at a selected point in time. Use this action to audit the current license consumption for any license inventory
     * and configuration.
     * </p>
     * 
     * @param listUsageForLicenseConfigurationRequest
     * @return Result of the ListUsageForLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws FilterLimitExceededException
     *         The request uses too many filters or too many filter values.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.ListUsageForLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUsageForLicenseConfigurationResult listUsageForLicenseConfiguration(ListUsageForLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeListUsageForLicenseConfiguration(request);
    }

    @SdkInternalApi
    final ListUsageForLicenseConfigurationResult executeListUsageForLicenseConfiguration(
            ListUsageForLicenseConfigurationRequest listUsageForLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsageForLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsageForLicenseConfigurationRequest> request = null;
        Response<ListUsageForLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsageForLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listUsageForLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsageForLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsageForLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListUsageForLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects the specified grant.
     * </p>
     * 
     * @param rejectGrantRequest
     * @return Result of the RejectGrant operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @sample AWSLicenseManager.RejectGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/RejectGrant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RejectGrantResult rejectGrant(RejectGrantRequest request) {
        request = beforeClientExecution(request);
        return executeRejectGrant(request);
    }

    @SdkInternalApi
    final RejectGrantResult executeRejectGrant(RejectGrantRequest rejectGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectGrantRequest> request = null;
        Response<RejectGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the specified license configuration.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
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
     * Removes the specified tags from the specified license configuration.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
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
     * Modifies the attributes of an existing license configuration.
     * </p>
     * 
     * @param updateLicenseConfigurationRequest
     * @return Result of the UpdateLicenseConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AWSLicenseManager.UpdateLicenseConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLicenseConfigurationResult updateLicenseConfiguration(UpdateLicenseConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLicenseConfiguration(request);
    }

    @SdkInternalApi
    final UpdateLicenseConfigurationResult executeUpdateLicenseConfiguration(UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLicenseConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLicenseConfigurationRequest> request = null;
        Response<UpdateLicenseConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLicenseConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLicenseConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLicenseConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLicenseConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLicenseConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a report generator.
     * </p>
     * <p>
     * After you make changes to a report generator, it will start generating new reports within 60 minutes of being
     * updated.
     * </p>
     * 
     * @param updateLicenseManagerReportGeneratorRequest
     * @return Result of the UpdateLicenseManagerReportGenerator operation returned by the service.
     * @throws ValidationException
     *         The provided input is not valid. Try your request again.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AWSLicenseManager.UpdateLicenseManagerReportGenerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseManagerReportGenerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLicenseManagerReportGeneratorResult updateLicenseManagerReportGenerator(UpdateLicenseManagerReportGeneratorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLicenseManagerReportGenerator(request);
    }

    @SdkInternalApi
    final UpdateLicenseManagerReportGeneratorResult executeUpdateLicenseManagerReportGenerator(
            UpdateLicenseManagerReportGeneratorRequest updateLicenseManagerReportGeneratorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLicenseManagerReportGeneratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLicenseManagerReportGeneratorRequest> request = null;
        Response<UpdateLicenseManagerReportGeneratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLicenseManagerReportGeneratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLicenseManagerReportGeneratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLicenseManagerReportGenerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLicenseManagerReportGeneratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLicenseManagerReportGeneratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or removes the specified license configurations for the specified AWS resource.
     * </p>
     * <p>
     * You can update the license specifications of AMIs, instances, and hosts. You cannot update the license
     * specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the
     * operation that creates the resource.
     * </p>
     * 
     * @param updateLicenseSpecificationsForResourceRequest
     * @return Result of the UpdateLicenseSpecificationsForResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         License Manager cannot allocate a license to a resource because of its state. </p>
     *         <p>
     *         For example, you cannot allocate a license to an instance in the process of shutting down.
     * @throws LicenseUsageException
     *         You do not have enough licenses available to support a new resource launch.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateLicenseSpecificationsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLicenseSpecificationsForResourceResult updateLicenseSpecificationsForResource(UpdateLicenseSpecificationsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLicenseSpecificationsForResource(request);
    }

    @SdkInternalApi
    final UpdateLicenseSpecificationsForResourceResult executeUpdateLicenseSpecificationsForResource(
            UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLicenseSpecificationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLicenseSpecificationsForResourceRequest> request = null;
        Response<UpdateLicenseSpecificationsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLicenseSpecificationsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLicenseSpecificationsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLicenseSpecificationsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLicenseSpecificationsForResourceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateLicenseSpecificationsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates License Manager settings for the current Region.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return Result of the UpdateServiceSettings operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameter values are not valid.
     * @throws ServerInternalException
     *         The server experienced an internal error. Try again.
     * @throws AuthorizationException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws AccessDeniedException
     *         Access to resource denied.
     * @throws RateLimitExceededException
     *         Too many requests have been submitted. Try again after a brief wait.
     * @sample AWSLicenseManager.UpdateServiceSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceSettingsResult updateServiceSettings(UpdateServiceSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceSettings(request);
    }

    @SdkInternalApi
    final UpdateServiceSettingsResult executeUpdateServiceSettings(UpdateServiceSettingsRequest updateServiceSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceSettingsRequest> request = null;
        Response<UpdateServiceSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "License Manager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateServiceSettingsResultJsonUnmarshaller());
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
