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
package com.amazonaws.services.ram;

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

import com.amazonaws.services.ram.AWSRAMClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ram.model.*;

import com.amazonaws.services.ram.model.transform.*;

/**
 * Client for accessing RAM. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * This is the <i>Resource Access Manager API Reference</i>. This documentation provides descriptions and syntax for
 * each of the actions and data types in RAM. RAM is a service that helps you securely share your Amazon Web Services
 * resources to other Amazon Web Services accounts. If you use Organizations to manage your accounts, then you can share
 * your resources with your entire organization or to organizational units (OUs). For supported resource types, you can
 * also share resources with individual Identity and Access Management (IAM) roles and users.
 * </p>
 * <p>
 * To learn more about RAM, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/ram">Resource Access Manager product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ram/latest/userguide/">Resource Access Manager User Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRAMClient extends AmazonWebServiceClient implements AWSRAM {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRAM.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ram";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidClientTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerInternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ServerInternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidResourceTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationExpiredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ResourceShareInvitationExpiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingRequiredParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.MissingRequiredParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.OperationNotPermittedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ResourceShareLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PermissionAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.PermissionAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnknownResourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.UnknownResourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PermissionLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.PermissionLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PermissionVersionsLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.PermissionVersionsLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.IdempotentParameterMismatchExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxResultsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidMaxResultsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.TagLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceArnNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ResourceArnNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnmatchedPolicyPermissionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.UnmatchedPolicyPermissionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationAlreadyRejectedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ResourceShareInvitationAlreadyRejectedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.MalformedArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateTransitionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.InvalidStateTransitionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationAlreadyAcceptedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ResourceShareInvitationAlreadyAcceptedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationArnNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.ResourceShareInvitationArnNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyTemplateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.MalformedPolicyTemplateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagPolicyViolationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ram.model.transform.TagPolicyViolationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ram.model.AWSRAMException.class));

    public static AWSRAMClientBuilder builder() {
        return AWSRAMClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on RAM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRAMClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on RAM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRAMClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ram.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ram/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ram/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the
     * invitation, the resources included in the resource share are available to interact with in the relevant Amazon
     * Web Services Management Consoles and tools.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return Result of the AcceptResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The operation failed because the specified invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The operation failed because the specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The operation failed because the specified invitation is past its expiration date and time.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.AcceptResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AcceptResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptResourceShareInvitationResult acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptResourceShareInvitation(request);
    }

    @SdkInternalApi
    final AcceptResourceShareInvitationResult executeAcceptResourceShareInvitation(AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptResourceShareInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptResourceShareInvitationRequest> request = null;
        Response<AcceptResourceShareInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptResourceShareInvitationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptResourceShareInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptResourceShareInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptResourceShareInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptResourceShareInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified list of principals and list of resources to a resource share. Principals that already have
     * access to this resource share immediately receive access to the added resources. Newly added principals
     * immediately receive access to the resources shared in this resource share.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return Result of the AssociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws ThrottlingException
     *         The operation failed because it exceeded the rate at which you are allowed to perform this operation.
     *         Please try again later.
     * @sample AWSRAM.AssociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateResourceShareResult associateResourceShare(AssociateResourceShareRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResourceShare(request);
    }

    @SdkInternalApi
    final AssociateResourceShareResult executeAssociateResourceShare(AssociateResourceShareRequest associateResourceShareRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceShareRequest> request = null;
        Response<AssociateResourceShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateResourceShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResourceShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResourceShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateResourceShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one
     * permission associated with each resource type in the resource share. You can add a new RAM permission only if
     * there are currently no resources of that resource type currently in the resource share.
     * </p>
     * 
     * @param associateResourceSharePermissionRequest
     * @return Result of the AssociateResourceSharePermission operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.AssociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateResourceSharePermissionResult associateResourceSharePermission(AssociateResourceSharePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResourceSharePermission(request);
    }

    @SdkInternalApi
    final AssociateResourceSharePermissionResult executeAssociateResourceSharePermission(
            AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResourceSharePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResourceSharePermissionRequest> request = null;
        Response<AssociateResourceSharePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResourceSharePermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateResourceSharePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResourceSharePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResourceSharePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateResourceSharePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a customer managed permission for a specified resource type that you can attach to resource shares. It is
     * created in the Amazon Web Services Region in which you call the operation.
     * </p>
     * 
     * @param createPermissionRequest
     * @return Result of the CreatePermission operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidPolicyException
     *         The operation failed because a policy you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws PermissionAlreadyExistsException
     *         The operation failed because a permission with the specified name already exists in the requested Amazon
     *         Web Services Region. Choose a different name.
     * @throws MalformedPolicyTemplateException
     *         The operation failed because the policy template that you provided isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws PermissionLimitExceededException
     *         The operation failed because it would exceed the maximum number of permissions you can create in each
     *         Amazon Web Services Region. To view the limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePermissionResult createPermission(CreatePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePermission(request);
    }

    @SdkInternalApi
    final CreatePermissionResult executeCreatePermission(CreatePermissionRequest createPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePermissionRequest> request = null;
        Response<CreatePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified customer managed permission. The new version is automatically set as the
     * default version of the customer managed permission. New resource shares automatically use the default permission.
     * Existing resource shares continue to use their original permission versions, but you can use
     * <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * <p>
     * If the specified customer managed permission already has the maximum of 5 versions, then you must delete one of
     * the existing versions before you can create a new one.
     * </p>
     * 
     * @param createPermissionVersionRequest
     * @return Result of the CreatePermissionVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidPolicyException
     *         The operation failed because a policy you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedPolicyTemplateException
     *         The operation failed because the policy template that you provided isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws PermissionVersionsLimitExceededException
     *         The operation failed because it would exceed the limit for the number of versions you can have for a
     *         permission. To view the limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @sample AWSRAM.CreatePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePermissionVersionResult createPermissionVersion(CreatePermissionVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePermissionVersion(request);
    }

    @SdkInternalApi
    final CreatePermissionVersionResult executeCreatePermissionVersion(CreatePermissionVersionRequest createPermissionVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPermissionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePermissionVersionRequest> request = null;
        Response<CreatePermissionVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePermissionVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPermissionVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePermissionVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePermissionVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePermissionVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource share. You can provide a list of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> for the resources that you want to share, a list of principals you want to share the resources with,
     * and the permissions to grant those principals.
     * </p>
     * <note>
     * <p>
     * Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that
     * created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account
     * that created it.
     * </p>
     * </note>
     * 
     * @param createResourceShareRequest
     * @return Result of the CreateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws TagPolicyViolationException
     *         The operation failed because the specified tag key is a reserved word and can't be used.
     * @throws TagLimitExceededException
     *         The operation failed because it would exceed the limit for tags for your Amazon Web Services account.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.CreateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateResourceShareResult createResourceShare(CreateResourceShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourceShare(request);
    }

    @SdkInternalApi
    final CreateResourceShareResult executeCreateResourceShare(CreateResourceShareRequest createResourceShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceShareRequest> request = null;
        Response<CreateResourceShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourceShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified customer managed permission in the Amazon Web Services Region in which you call this
     * operation. You can delete a customer managed permission only if it isn't attached to any resource share. The
     * operation deletes all versions associated with the customer managed permission.
     * </p>
     * 
     * @param deletePermissionRequest
     * @return Result of the DeletePermission operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePermissionResult deletePermission(DeletePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePermission(request);
    }

    @SdkInternalApi
    final DeletePermissionResult executeDeletePermission(DeletePermissionRequest deletePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionRequest> request = null;
        Response<DeletePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one version of a customer managed permission. The version you specify must not be attached to any
     * resource share and must not be the default version for the permission.
     * </p>
     * <p>
     * If a customer managed permission has the maximum of 5 versions, then you must delete at least one version before
     * you can create another.
     * </p>
     * 
     * @param deletePermissionVersionRequest
     * @return Result of the DeletePermissionVersion operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.DeletePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePermissionVersionResult deletePermissionVersion(DeletePermissionVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePermissionVersion(request);
    }

    @SdkInternalApi
    final DeletePermissionVersionResult executeDeletePermissionVersion(DeletePermissionVersionRequest deletePermissionVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePermissionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionVersionRequest> request = null;
        Response<DeletePermissionVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePermissionVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePermissionVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePermissionVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePermissionVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified resource share.
     * </p>
     * <important>
     * <p>
     * This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing
     * of those resources through this resource share.
     * </p>
     * </important>
     * 
     * @param deleteResourceShareRequest
     * @return Result of the DeleteResourceShare operation returned by the service.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.DeleteResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeleteResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteResourceShareResult deleteResourceShare(DeleteResourceShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourceShare(request);
    }

    @SdkInternalApi
    final DeleteResourceShareResult executeDeleteResourceShare(DeleteResourceShareRequest deleteResourceShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceShareRequest> request = null;
        Response<DeleteResourceShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourceShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified principals or resources from participating in the specified resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return Result of the DisassociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @sample AWSRAM.DisassociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceShare" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateResourceShareResult disassociateResourceShare(DisassociateResourceShareRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResourceShare(request);
    }

    @SdkInternalApi
    final DisassociateResourceShareResult executeDisassociateResourceShare(DisassociateResourceShareRequest disassociateResourceShareRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceShareRequest> request = null;
        Response<DisassociateResourceShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceShareRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateResourceShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResourceShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResourceShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateResourceShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a managed permission from a resource share. Permission changes take effect immediately. You can remove a
     * managed permission from a resource share only if there are currently no resources of the relevant resource type
     * currently attached to the resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @return Result of the DisassociateResourceSharePermission operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @sample AWSRAM.DisassociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResourceSharePermissionResult disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResourceSharePermission(request);
    }

    @SdkInternalApi
    final DisassociateResourceSharePermissionResult executeDisassociateResourceSharePermission(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResourceSharePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResourceSharePermissionRequest> request = null;
        Response<DisassociateResourceSharePermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResourceSharePermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateResourceSharePermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResourceSharePermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResourceSharePermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateResourceSharePermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables resource sharing within your organization in Organizations. This operation creates a service-linked role
     * called <code>AWSServiceRoleForResourceAccessManager</code> that has the IAM managed policy named
     * AWSResourceAccessManagerServiceRolePolicy attached. This role permits RAM to retrieve information about the
     * organization and its structure. This lets you share resources with all of the accounts in the calling account's
     * organization by specifying the organization ID, or all of the accounts in an organizational unit (OU) by
     * specifying the OU ID. Until you enable sharing within the organization, you can specify only individual Amazon
     * Web Services accounts, or for supported resource types, IAM roles and users.
     * </p>
     * <p>
     * You must call this operation from an IAM role or user in the organization's management account.
     * </p>
     * <p/>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return Result of the EnableSharingWithAwsOrganization operation returned by the service.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.EnableSharingWithAwsOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/EnableSharingWithAwsOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableSharingWithAwsOrganizationResult enableSharingWithAwsOrganization(EnableSharingWithAwsOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeEnableSharingWithAwsOrganization(request);
    }

    @SdkInternalApi
    final EnableSharingWithAwsOrganizationResult executeEnableSharingWithAwsOrganization(
            EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(enableSharingWithAwsOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSharingWithAwsOrganizationRequest> request = null;
        Response<EnableSharingWithAwsOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSharingWithAwsOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableSharingWithAwsOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableSharingWithAwsOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableSharingWithAwsOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableSharingWithAwsOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the contents of a managed permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @return Result of the GetPermission operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.GetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPermissionResult getPermission(GetPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeGetPermission(request);
    }

    @SdkInternalApi
    final GetPermissionResult executeGetPermission(GetPermissionRequest getPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(getPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPermissionRequest> request = null;
        Response<GetPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPermissionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the resource policies for the specified resources that you own and have shared.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return Result of the GetResourcePolicies operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ResourceArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> was not found.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetResourcePoliciesResult getResourcePolicies(GetResourcePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicies(request);
    }

    @SdkInternalApi
    final GetResourcePoliciesResult executeGetResourcePolicies(GetResourcePoliciesRequest getResourcePoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePoliciesRequest> request = null;
        Response<GetResourcePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the lists of resources and principals that associated for resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return Result of the GetResourceShareAssociations operation returned by the service.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourceShareAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceShareAssociationsResult getResourceShareAssociations(GetResourceShareAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceShareAssociations(request);
    }

    @SdkInternalApi
    final GetResourceShareAssociationsResult executeGetResourceShareAssociations(GetResourceShareAssociationsRequest getResourceShareAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceShareAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceShareAssociationsRequest> request = null;
        Response<GetResourceShareAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceShareAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResourceShareAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceShareAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceShareAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResourceShareAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about invitations that you have received for resource shares.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return Result of the GetResourceShareInvitations operation returned by the service.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws InvalidMaxResultsException
     *         The operation failed because the specified value for <code>MaxResults</code> isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourceShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceShareInvitationsResult getResourceShareInvitations(GetResourceShareInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceShareInvitations(request);
    }

    @SdkInternalApi
    final GetResourceShareInvitationsResult executeGetResourceShareInvitations(GetResourceShareInvitationsRequest getResourceShareInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceShareInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceShareInvitationsRequest> request = null;
        Response<GetResourceShareInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceShareInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResourceShareInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceShareInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceShareInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResourceShareInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about the resource shares that you own or that are shared with you.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return Result of the GetResourceShares operation returned by the service.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourceShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetResourceSharesResult getResourceShares(GetResourceSharesRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceShares(request);
    }

    @SdkInternalApi
    final GetResourceSharesResult executeGetResourceShares(GetResourceSharesRequest getResourceSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceSharesRequest> request = null;
        Response<GetResourceSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourceSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resources in a resource share that is shared with you but for which the invitation is still
     * <code>PENDING</code>. That means that you haven't accepted or rejected the invitation and the invitation hasn't
     * expired.
     * </p>
     * 
     * @param listPendingInvitationResourcesRequest
     * @return Result of the ListPendingInvitationResources operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The operation failed because the specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The operation failed because the specified invitation is past its expiration date and time.
     * @sample AWSRAM.ListPendingInvitationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPendingInvitationResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPendingInvitationResourcesResult listPendingInvitationResources(ListPendingInvitationResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListPendingInvitationResources(request);
    }

    @SdkInternalApi
    final ListPendingInvitationResourcesResult executeListPendingInvitationResources(ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPendingInvitationResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPendingInvitationResourcesRequest> request = null;
        Response<ListPendingInvitationResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPendingInvitationResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPendingInvitationResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPendingInvitationResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPendingInvitationResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPendingInvitationResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about the managed permission and its associations to any resource shares that use this managed
     * permission. This lets you see which resource shares use which versions of the specified managed permission.
     * </p>
     * 
     * @param listPermissionAssociationsRequest
     * @return Result of the ListPermissionAssociations operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListPermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPermissionAssociationsResult listPermissionAssociations(ListPermissionAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionAssociations(request);
    }

    @SdkInternalApi
    final ListPermissionAssociationsResult executeListPermissionAssociations(ListPermissionAssociationsRequest listPermissionAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionAssociationsRequest> request = null;
        Response<ListPermissionAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPermissionAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPermissionAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the available versions of the specified RAM permission.
     * </p>
     * 
     * @param listPermissionVersionsRequest
     * @return Result of the ListPermissionVersions operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @sample AWSRAM.ListPermissionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPermissionVersionsResult listPermissionVersions(ListPermissionVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionVersions(request);
    }

    @SdkInternalApi
    final ListPermissionVersionsResult executeListPermissionVersions(ListPermissionVersionsRequest listPermissionVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionVersionsRequest> request = null;
        Response<ListPermissionVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPermissionVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPermissionVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of available RAM permissions that you can use for the supported resource types.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return Result of the ListPermissions operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPermissionsResult listPermissions(ListPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissions(request);
    }

    @SdkInternalApi
    final ListPermissionsResult executeListPermissions(ListPermissionsRequest listPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionsRequest> request = null;
        Response<ListPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the principals that you are sharing resources with or that are sharing resources with you.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return Result of the ListPrincipals operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListPrincipals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPrincipalsResult listPrincipals(ListPrincipalsRequest request) {
        request = beforeClientExecution(request);
        return executeListPrincipals(request);
    }

    @SdkInternalApi
    final ListPrincipalsResult executeListPrincipals(ListPrincipalsRequest listPrincipalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalsRequest> request = null;
        Response<ListPrincipalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPrincipalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPrincipals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPrincipalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPrincipalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current status of the asynchronous tasks performed by RAM when you perform the
     * <a>ReplacePermissionAssociationsWork</a> operation.
     * </p>
     * 
     * @param listReplacePermissionAssociationsWorkRequest
     * @return Result of the ListReplacePermissionAssociationsWork operation returned by the service.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @sample AWSRAM.ListReplacePermissionAssociationsWork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListReplacePermissionAssociationsWork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReplacePermissionAssociationsWorkResult listReplacePermissionAssociationsWork(ListReplacePermissionAssociationsWorkRequest request) {
        request = beforeClientExecution(request);
        return executeListReplacePermissionAssociationsWork(request);
    }

    @SdkInternalApi
    final ListReplacePermissionAssociationsWorkResult executeListReplacePermissionAssociationsWork(
            ListReplacePermissionAssociationsWorkRequest listReplacePermissionAssociationsWorkRequest) {

        ExecutionContext executionContext = createExecutionContext(listReplacePermissionAssociationsWorkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReplacePermissionAssociationsWorkRequest> request = null;
        Response<ListReplacePermissionAssociationsWorkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReplacePermissionAssociationsWorkRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listReplacePermissionAssociationsWorkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReplacePermissionAssociationsWork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReplacePermissionAssociationsWorkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListReplacePermissionAssociationsWorkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @return Result of the ListResourceSharePermissions operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.ListResourceSharePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceSharePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceSharePermissionsResult listResourceSharePermissions(ListResourceSharePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceSharePermissions(request);
    }

    @SdkInternalApi
    final ListResourceSharePermissionsResult executeListResourceSharePermissions(ListResourceSharePermissionsRequest listResourceSharePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceSharePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceSharePermissionsRequest> request = null;
        Response<ListResourceSharePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceSharePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResourceSharePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceSharePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceSharePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResourceSharePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resource types that can be shared by RAM.
     * </p>
     * 
     * @param listResourceTypesRequest
     * @return Result of the ListResourceTypes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceTypes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResourceTypesResult listResourceTypes(ListResourceTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceTypes(request);
    }

    @SdkInternalApi
    final ListResourceTypesResult executeListResourceTypes(ListResourceTypesRequest listResourceTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceTypesRequest> request = null;
        Response<ListResourceTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourceTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resources that you added to a resource share or the resources that are shared with you.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The operation failed because the specified resource type isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListResources(request);
    }

    @SdkInternalApi
    final ListResourcesResult executeListResources(ListResourcesRequest listResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesRequest> request = null;
        Response<ListResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation creates a separate, fully manageable customer managed permission that has the same IAM permissions
     * as the original resource-based policy. You can associate this customer managed permission to any resource shares.
     * </p>
     * <p>
     * Before you use <a>PromoteResourceShareCreatedFromPolicy</a>, you should first run this operation to ensure that
     * you have an appropriate customer managed permission that can be associated with the promoted resource share.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The original <code>CREATED_FROM_POLICY</code> policy isn't deleted, and resource shares using that original
     * policy aren't automatically updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't modify a <code>CREATED_FROM_POLICY</code> resource share so you can't associate the new customer
     * managed permission by using <code>ReplacePermsissionAssociations</code>. However, if you use
     * <a>PromoteResourceShareCreatedFromPolicy</a>, that operation automatically associates the fully manageable
     * customer managed permission to the newly promoted <code>STANDARD</code> resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you promote a resource share, if the original <code>CREATED_FROM_POLICY</code> managed permission has no
     * other associations to A resource share, then RAM automatically deletes it.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promotePermissionCreatedFromPolicyRequest
     * @return Result of the PromotePermissionCreatedFromPolicy operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @sample AWSRAM.PromotePermissionCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromotePermissionCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PromotePermissionCreatedFromPolicyResult promotePermissionCreatedFromPolicy(PromotePermissionCreatedFromPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePromotePermissionCreatedFromPolicy(request);
    }

    @SdkInternalApi
    final PromotePermissionCreatedFromPolicyResult executePromotePermissionCreatedFromPolicy(
            PromotePermissionCreatedFromPolicyRequest promotePermissionCreatedFromPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(promotePermissionCreatedFromPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromotePermissionCreatedFromPolicyRequest> request = null;
        Response<PromotePermissionCreatedFromPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PromotePermissionCreatedFromPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(promotePermissionCreatedFromPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PromotePermissionCreatedFromPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PromotePermissionCreatedFromPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PromotePermissionCreatedFromPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation promotes the resource share to a <code>STANDARD</code> resource share that is fully manageable in
     * RAM. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to
     * all of the principals you shared it with.
     * </p>
     * <important>
     * <p>
     * Before you perform this operation, you should first run <a>PromotePermissionCreatedFromPolicy</a>to ensure that
     * you have an appropriate customer managed permission that can be associated with this resource share after its is
     * promoted. If this operation can't find a managed permission that exactly matches the existing
     * <code>CREATED_FROM_POLICY</code> permission, then this operation fails.
     * </p>
     * </important>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @return Result of the PromoteResourceShareCreatedFromPolicy operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws UnmatchedPolicyPermissionException
     *         There isn't an existing managed permission defined in RAM that has the same IAM permissions as the
     *         resource-based policy attached to the resource. You should first run
     *         <a>PromotePermissionCreatedFromPolicy</a> to create that managed permission.
     * @sample AWSRAM.PromoteResourceShareCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromoteResourceShareCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PromoteResourceShareCreatedFromPolicyResult promoteResourceShareCreatedFromPolicy(PromoteResourceShareCreatedFromPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePromoteResourceShareCreatedFromPolicy(request);
    }

    @SdkInternalApi
    final PromoteResourceShareCreatedFromPolicyResult executePromoteResourceShareCreatedFromPolicy(
            PromoteResourceShareCreatedFromPolicyRequest promoteResourceShareCreatedFromPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(promoteResourceShareCreatedFromPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromoteResourceShareCreatedFromPolicyRequest> request = null;
        Response<PromoteResourceShareCreatedFromPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PromoteResourceShareCreatedFromPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(promoteResourceShareCreatedFromPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PromoteResourceShareCreatedFromPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PromoteResourceShareCreatedFromPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PromoteResourceShareCreatedFromPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects an invitation to a resource share from another Amazon Web Services account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return Result of the RejectResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The operation failed because the specified invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The operation failed because the specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The operation failed because the specified invitation is past its expiration date and time.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.RejectResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/RejectResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectResourceShareInvitationResult rejectResourceShareInvitation(RejectResourceShareInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeRejectResourceShareInvitation(request);
    }

    @SdkInternalApi
    final RejectResourceShareInvitationResult executeRejectResourceShareInvitation(RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectResourceShareInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectResourceShareInvitationRequest> request = null;
        Response<RejectResourceShareInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectResourceShareInvitationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectResourceShareInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectResourceShareInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectResourceShareInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectResourceShareInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates all resource shares that use a managed permission to a different managed permission. This operation
     * always applies the default version of the target managed permission. You can optionally specify that the update
     * applies to only resource shares that currently use a specified version. This enables you to update to the latest
     * version, without changing the which managed permission is used.
     * </p>
     * <p>
     * You can use this operation to update all of your resource shares to use the current default version of the
     * permission by specifying the same value for the <code>fromPermissionArn</code> and <code>toPermissionArn</code>
     * parameters.
     * </p>
     * <p>
     * You can use the optional <code>fromPermissionVersion</code> parameter to update only those resources that use a
     * specified version of the managed permission to the new managed permission.
     * </p>
     * <important>
     * <p>
     * To successfully perform this operation, you must have permission to update the resource-based policy on all
     * affected resource types.
     * </p>
     * </important>
     * 
     * @param replacePermissionAssociationsRequest
     * @return Result of the ReplacePermissionAssociations operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.ReplacePermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReplacePermissionAssociationsResult replacePermissionAssociations(ReplacePermissionAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeReplacePermissionAssociations(request);
    }

    @SdkInternalApi
    final ReplacePermissionAssociationsResult executeReplacePermissionAssociations(ReplacePermissionAssociationsRequest replacePermissionAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(replacePermissionAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplacePermissionAssociationsRequest> request = null;
        Response<ReplacePermissionAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplacePermissionAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(replacePermissionAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReplacePermissionAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReplacePermissionAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ReplacePermissionAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Designates the specified version number as the default version for the specified customer managed permission. New
     * resource shares automatically use this new default permission. Existing resource shares continue to use their
     * original permission version, but you can use <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * 
     * @param setDefaultPermissionVersionRequest
     * @return Result of the SetDefaultPermissionVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.SetDefaultPermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/SetDefaultPermissionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetDefaultPermissionVersionResult setDefaultPermissionVersion(SetDefaultPermissionVersionRequest request) {
        request = beforeClientExecution(request);
        return executeSetDefaultPermissionVersion(request);
    }

    @SdkInternalApi
    final SetDefaultPermissionVersionResult executeSetDefaultPermissionVersion(SetDefaultPermissionVersionRequest setDefaultPermissionVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(setDefaultPermissionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultPermissionVersionRequest> request = null;
        Response<SetDefaultPermissionVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultPermissionVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setDefaultPermissionVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDefaultPermissionVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetDefaultPermissionVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetDefaultPermissionVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tag keys and values to a resource share or managed permission. If you choose a resource share,
     * the tags are attached to only the resource share, not to the resources that are in the resource share.
     * </p>
     * <p>
     * The tags on a managed permission are the same for all versions of the managed permission.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws TagLimitExceededException
     *         The operation failed because it would exceed the limit for tags for your Amazon Web Services account.
     * @throws ResourceArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> was not found.
     * @throws TagPolicyViolationException
     *         The operation failed because the specified tag key is a reserved word and can't be used.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
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
     * Removes the specified tag key and value pairs from the specified resource share or managed permission.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
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
     * Modifies some of the properties of the specified resource share.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return Result of the UpdateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.UpdateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UpdateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateResourceShareResult updateResourceShare(UpdateResourceShareRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourceShare(request);
    }

    @SdkInternalApi
    final UpdateResourceShareResult executeUpdateResourceShare(UpdateResourceShareRequest updateResourceShareRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceShareRequest> request = null;
        Response<UpdateResourceShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RAM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourceShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceShareResultJsonUnmarshaller());
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
