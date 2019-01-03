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
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts. To share a resource, you create a
 * resource share, associate the resource with the resource share, and specify the principals that can access the
 * resource. The following principals are supported:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ID of an AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an OU from AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an organization from AWS Organizations
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify an AWS account that doesn't exist in the same organization as the account that owns the resource
 * share, the owner of the specified account receives an invitation to accept the resource share. After the owner
 * accepts the invitation, they can access the resources in the resource share. An administrator of the specified
 * account can use IAM policies to restrict access resources in the resource share.
 * </p>
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
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClientTokenException").withModeledClass(
                                    com.amazonaws.services.ram.model.InvalidClientTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnknownResourceException").withModeledClass(
                                    com.amazonaws.services.ram.model.UnknownResourceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.ram.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerInternalException").withModeledClass(
                                    com.amazonaws.services.ram.model.ServerInternalException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatchException").withModeledClass(
                                    com.amazonaws.services.ram.model.IdempotentParameterMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxResultsException").withModeledClass(
                                    com.amazonaws.services.ram.model.InvalidMaxResultsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceTypeException").withModeledClass(
                                    com.amazonaws.services.ram.model.InvalidResourceTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.ram.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationExpiredException").withModeledClass(
                                    com.amazonaws.services.ram.model.ResourceShareInvitationExpiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingRequiredParameterException").withModeledClass(
                                    com.amazonaws.services.ram.model.MissingRequiredParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagLimitExceededException").withModeledClass(
                                    com.amazonaws.services.ram.model.TagLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceArnNotFoundException").withModeledClass(
                                    com.amazonaws.services.ram.model.ResourceArnNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                                    com.amazonaws.services.ram.model.OperationNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareLimitExceededException").withModeledClass(
                                    com.amazonaws.services.ram.model.ResourceShareLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationAlreadyRejectedException").withModeledClass(
                                    com.amazonaws.services.ram.model.ResourceShareInvitationAlreadyRejectedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedArnException").withModeledClass(
                                    com.amazonaws.services.ram.model.MalformedArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateTransitionException").withModeledClass(
                                    com.amazonaws.services.ram.model.InvalidStateTransitionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationAlreadyAcceptedException").withModeledClass(
                                    com.amazonaws.services.ram.model.ResourceShareInvitationAlreadyAcceptedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceShareInvitationArnNotFoundException").withModeledClass(
                                    com.amazonaws.services.ram.model.ResourceShareInvitationArnNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.ram.model.InvalidNextTokenException.class))
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
     * Accepts an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return Result of the AcceptResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The Amazon Resource Name (ARN) for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The invitation is expired.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Associates the specified resource share with the specified principals and resources.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return Result of the AssociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws ResourceShareLimitExceededException
     *         The requested resource share exceeds the limit for your account.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws UnknownResourceException
     *         A specified resource was not found.
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
     * Creates a resource share.
     * </p>
     * 
     * @param createResourceShareRequest
     * @return Result of the CreateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareLimitExceededException
     *         The requested resource share exceeds the limit for your account.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Deletes the specified resource share.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @return Result of the DeleteResourceShare operation returned by the service.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Disassociates the specified principals or resources from the specified resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return Result of the DisassociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws ResourceShareLimitExceededException
     *         The requested resource share exceeds the limit for your account.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws UnknownResourceException
     *         A specified resource was not found.
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
     * Enables resource sharing within your organization.
     * </p>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return Result of the EnableSharingWithAwsOrganization operation returned by the service.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Gets the policies for the specifies resources.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return Result of the GetResourcePolicies operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Gets the associations for the specified resource share.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return Result of the GetResourceShareAssociations operation returned by the service.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Gets the specified invitations for resource sharing.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return Result of the GetResourceShareInvitations operation returned by the service.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The Amazon Resource Name (ARN) for an invitation was not found.
     * @throws InvalidMaxResultsException
     *         The specified value for MaxResults is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Gets the specified resource shares or all of your resource shares.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return Result of the GetResourceShares operation returned by the service.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Lists the principals with access to the specified resource.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return Result of the ListPrincipals operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Lists the resources that the specified principal can access.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The specified resource type is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Rejects an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return Result of the RejectResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The Amazon Resource Name (ARN) for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The invitation is expired.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Adds the specified tags to the specified resource share.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws TagLimitExceededException
     *         The requested tags exceed the limit for your account.
     * @throws ResourceArnNotFoundException
     *         An Amazon Resource Name (ARN) was not found.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Removes the specified tags from the specified resource share.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     * Updates the specified resource share.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return Result of the UpdateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws MissingRequiredParameterException
     *         A required input parameter is missing.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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

}
