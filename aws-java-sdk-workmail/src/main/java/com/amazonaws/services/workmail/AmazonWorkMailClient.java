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
package com.amazonaws.services.workmail;

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

import com.amazonaws.services.workmail.AmazonWorkMailClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.services.workmail.model.transform.*;

/**
 * Client for accessing Amazon WorkMail. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * WorkMail is a secure, managed business email and calendaring service with support for existing desktop and mobile
 * email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or other
 * native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory and
 * control both the keys that encrypt your data and the location in which your data is stored.
 * </p>
 * <p>
 * The WorkMail API is designed for the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Listing and describing organizations
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing users
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing groups
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing resources
 * </p>
 * </li>
 * </ul>
 * <p>
 * All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS
 * SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate
 * access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the
 * IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy).
 * This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This
 * allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a
 * selective basis using the IAM model.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkMailClient extends AmazonWebServiceClient implements AmazonWorkMail {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkMail.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "workmail";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.DirectoryUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MailDomainStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.MailDomainStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCustomSesConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.InvalidCustomSesConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NameAvailabilityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.NameAvailabilityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityAlreadyRegisteredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.EntityAlreadyRegisteredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPasswordException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.InvalidPasswordExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.DirectoryInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MailDomainInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.MailDomainInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.OrganizationNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.EntityStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.InvalidConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MailDomainNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.MailDomainNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectoryServiceAuthenticationFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.DirectoryServiceAuthenticationFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EmailAddressInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.EmailAddressInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EntityNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.EntityNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReservedNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.ReservedNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.workmail.model.transform.OrganizationStateExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.workmail.model.AmazonWorkMailException.class));

    public static AmazonWorkMailClientBuilder builder() {
        return AmazonWorkMailClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkMail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkMailClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkMail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkMailClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("workmail.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/workmail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/workmail/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @return Result of the AssociateDelegateToResource operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.AssociateDelegateToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDelegateToResourceResult associateDelegateToResource(AssociateDelegateToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDelegateToResource(request);
    }

    @SdkInternalApi
    final AssociateDelegateToResourceResult executeAssociateDelegateToResource(AssociateDelegateToResourceRequest associateDelegateToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDelegateToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDelegateToResourceRequest> request = null;
        Response<AssociateDelegateToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDelegateToResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateDelegateToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDelegateToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDelegateToResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateDelegateToResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @return Result of the AssociateMemberToGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.AssociateMemberToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateMemberToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateMemberToGroupResult associateMemberToGroup(AssociateMemberToGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMemberToGroup(request);
    }

    @SdkInternalApi
    final AssociateMemberToGroupResult executeAssociateMemberToGroup(AssociateMemberToGroupRequest associateMemberToGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberToGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberToGroupRequest> request = null;
        Response<AssociateMemberToGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberToGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberToGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMemberToGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberToGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateMemberToGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assumes an impersonation role for the given WorkMail organization. This method returns an authentication token
     * you can use to make impersonated calls.
     * </p>
     * 
     * @param assumeImpersonationRoleRequest
     * @return Result of the AssumeImpersonationRole operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AmazonWorkMail.AssumeImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssumeImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssumeImpersonationRoleResult assumeImpersonationRole(AssumeImpersonationRoleRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeImpersonationRole(request);
    }

    @SdkInternalApi
    final AssumeImpersonationRoleResult executeAssumeImpersonationRole(AssumeImpersonationRoleRequest assumeImpersonationRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeImpersonationRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeImpersonationRoleRequest> request = null;
        Response<AssumeImpersonationRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeImpersonationRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(assumeImpersonationRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeImpersonationRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssumeImpersonationRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssumeImpersonationRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a mailbox export job.
     * </p>
     * <note>
     * <p>
     * If the mailbox export job is near completion, it might not be possible to cancel it.
     * </p>
     * </note>
     * 
     * @param cancelMailboxExportJobRequest
     * @return Result of the CancelMailboxExportJob operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @sample AmazonWorkMail.CancelMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CancelMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMailboxExportJobResult cancelMailboxExportJob(CancelMailboxExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMailboxExportJob(request);
    }

    @SdkInternalApi
    final CancelMailboxExportJobResult executeCancelMailboxExportJob(CancelMailboxExportJobRequest cancelMailboxExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMailboxExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMailboxExportJobRequest> request = null;
        Response<CancelMailboxExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMailboxExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelMailboxExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMailboxExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMailboxExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMailboxExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws MailDomainNotFoundException
     *         The domain specified is not found in your organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @sample AmazonWorkMail.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlias(request);
    }

    @SdkInternalApi
    final CreateAliasResult executeCreateAlias(CreateAliasRequest createAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param createAvailabilityConfigurationRequest
     * @return Result of the CreateAvailabilityConfiguration operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in WorkMail.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @sample AmazonWorkMail.CreateAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAvailabilityConfigurationResult createAvailabilityConfiguration(CreateAvailabilityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAvailabilityConfiguration(request);
    }

    @SdkInternalApi
    final CreateAvailabilityConfigurationResult executeCreateAvailabilityConfiguration(
            CreateAvailabilityConfigurationRequest createAvailabilityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAvailabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAvailabilityConfigurationRequest> request = null;
        Response<CreateAvailabilityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAvailabilityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAvailabilityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAvailabilityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAvailabilityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAvailabilityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a group that can be used in WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ReservedNameException
     *         This user, group, or resource name is not allowed in WorkMail.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an impersonation role for the given WorkMail organization.
     * </p>
     * <p>
     * <i>Idempotency</i> ensures that an API request completes no more than one time. With an idempotent request, if
     * the original request completes successfully, any subsequent retries also complete successfully without performing
     * any further actions.
     * </p>
     * 
     * @param createImpersonationRoleRequest
     * @return Result of the CreateImpersonationRole operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @sample AmazonWorkMail.CreateImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateImpersonationRoleResult createImpersonationRole(CreateImpersonationRoleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImpersonationRole(request);
    }

    @SdkInternalApi
    final CreateImpersonationRoleResult executeCreateImpersonationRole(CreateImpersonationRoleRequest createImpersonationRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(createImpersonationRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImpersonationRoleRequest> request = null;
        Response<CreateImpersonationRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImpersonationRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createImpersonationRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateImpersonationRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImpersonationRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateImpersonationRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new mobile device access rule for the specified WorkMail organization.
     * </p>
     * 
     * @param createMobileDeviceAccessRuleRequest
     * @return Result of the CreateMobileDeviceAccessRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.CreateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMobileDeviceAccessRuleResult createMobileDeviceAccessRule(CreateMobileDeviceAccessRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMobileDeviceAccessRule(request);
    }

    @SdkInternalApi
    final CreateMobileDeviceAccessRuleResult executeCreateMobileDeviceAccessRule(CreateMobileDeviceAccessRuleRequest createMobileDeviceAccessRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createMobileDeviceAccessRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMobileDeviceAccessRuleRequest> request = null;
        Response<CreateMobileDeviceAccessRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMobileDeviceAccessRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMobileDeviceAccessRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMobileDeviceAccessRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMobileDeviceAccessRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMobileDeviceAccessRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new WorkMail organization. Optionally, you can choose to associate an existing AWS Directory Service
     * directory with your organization. If an AWS Directory Service directory ID is specified, the organization alias
     * must match the directory alias. If you choose not to associate an existing directory with your organization, then
     * we create a new WorkMail directory for you. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_new_organization.html">Adding an
     * organization</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * You can associate multiple email domains with an organization, then choose your default email domain from the
     * WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For
     * more information, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html">Adding a
     * domain</a> and <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/default_domain.html">Choosing the
     * default domain</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * Optionally, you can use a customer managed key from AWS Key Management Service (AWS KMS) to encrypt email for
     * your organization. If you don't associate an AWS KMS key, WorkMail creates a default, AWS managed key for you.
     * </p>
     * 
     * @param createOrganizationRequest
     * @return Result of the CreateOrganization operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws DirectoryInUseException
     *         The directory is already in use by another WorkMail organization in the same account and Region.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in WorkMail.
     * @sample AmazonWorkMail.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateOrganizationResult createOrganization(CreateOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOrganization(request);
    }

    @SdkInternalApi
    final CreateOrganizationResult executeCreateOrganization(CreateOrganizationRequest createOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(createOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrganizationRequest> request = null;
        Response<CreateOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @return Result of the CreateResource operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ReservedNameException
     *         This user, group, or resource name is not allowed in WorkMail.
     * @sample AmazonWorkMail.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateResourceResult createResource(CreateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResource(request);
    }

    @SdkInternalApi
    final CreateResourceResult executeCreateResource(CreateResourceRequest createResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceRequest> request = null;
        Response<CreateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user who can be used in WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws InvalidPasswordException
     *         The supplied password doesn't match the minimum security constraints, such as length or use of special
     *         characters.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ReservedNameException
     *         This user, group, or resource name is not allowed in WorkMail.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back
     * an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteAccessControlRuleRequest
     * @return Result of the DeleteAccessControlRule operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAccessControlRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccessControlRule(request);
    }

    @SdkInternalApi
    final DeleteAccessControlRuleResult executeDeleteAccessControlRule(DeleteAccessControlRuleRequest deleteAccessControlRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccessControlRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessControlRuleRequest> request = null;
        Response<DeleteAccessControlRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessControlRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAccessControlRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccessControlRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccessControlRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAccessControlRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlias(request);
    }

    @SdkInternalApi
    final DeleteAliasResult executeDeleteAlias(DeleteAliasRequest deleteAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<DeleteAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param deleteAvailabilityConfigurationRequest
     * @return Result of the DeleteAvailabilityConfiguration operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAvailabilityConfigurationResult deleteAvailabilityConfiguration(DeleteAvailabilityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAvailabilityConfiguration(request);
    }

    @SdkInternalApi
    final DeleteAvailabilityConfigurationResult executeDeleteAvailabilityConfiguration(
            DeleteAvailabilityConfigurationRequest deleteAvailabilityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAvailabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAvailabilityConfigurationRequest> request = null;
        Response<DeleteAvailabilityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAvailabilityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAvailabilityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAvailabilityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAvailabilityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAvailabilityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param deleteEmailMonitoringConfigurationRequest
     * @return Result of the DeleteEmailMonitoringConfiguration operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEmailMonitoringConfigurationResult deleteEmailMonitoringConfiguration(DeleteEmailMonitoringConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEmailMonitoringConfiguration(request);
    }

    @SdkInternalApi
    final DeleteEmailMonitoringConfigurationResult executeDeleteEmailMonitoringConfiguration(
            DeleteEmailMonitoringConfigurationRequest deleteEmailMonitoringConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEmailMonitoringConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailMonitoringConfigurationRequest> request = null;
        Response<DeleteEmailMonitoringConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailMonitoringConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEmailMonitoringConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEmailMonitoringConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEmailMonitoringConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEmailMonitoringConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a group from WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an impersonation role for the given WorkMail organization.
     * </p>
     * 
     * @param deleteImpersonationRoleRequest
     * @return Result of the DeleteImpersonationRole operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteImpersonationRoleResult deleteImpersonationRole(DeleteImpersonationRoleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImpersonationRole(request);
    }

    @SdkInternalApi
    final DeleteImpersonationRoleResult executeDeleteImpersonationRole(DeleteImpersonationRoleRequest deleteImpersonationRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImpersonationRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImpersonationRoleRequest> request = null;
        Response<DeleteImpersonationRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImpersonationRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteImpersonationRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImpersonationRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImpersonationRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteImpersonationRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @return Result of the DeleteMailboxPermissions operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMailboxPermissions(request);
    }

    @SdkInternalApi
    final DeleteMailboxPermissionsResult executeDeleteMailboxPermissions(DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMailboxPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMailboxPermissionsRequest> request = null;
        Response<DeleteMailboxPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMailboxPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMailboxPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMailboxPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMailboxPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMailboxPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing overrides does not produce an error. In those cases, the service sends
     * back an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteMobileDeviceAccessOverrideRequest
     * @return Result of the DeleteMobileDeviceAccessOverride operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @sample AmazonWorkMail.DeleteMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMobileDeviceAccessOverrideResult deleteMobileDeviceAccessOverride(DeleteMobileDeviceAccessOverrideRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMobileDeviceAccessOverride(request);
    }

    @SdkInternalApi
    final DeleteMobileDeviceAccessOverrideResult executeDeleteMobileDeviceAccessOverride(
            DeleteMobileDeviceAccessOverrideRequest deleteMobileDeviceAccessOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMobileDeviceAccessOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMobileDeviceAccessOverrideRequest> request = null;
        Response<DeleteMobileDeviceAccessOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMobileDeviceAccessOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMobileDeviceAccessOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMobileDeviceAccessOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMobileDeviceAccessOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMobileDeviceAccessOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a mobile device access rule for the specified WorkMail organization.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back
     * an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteMobileDeviceAccessRuleRequest
     * @return Result of the DeleteMobileDeviceAccessRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMobileDeviceAccessRuleResult deleteMobileDeviceAccessRule(DeleteMobileDeviceAccessRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMobileDeviceAccessRule(request);
    }

    @SdkInternalApi
    final DeleteMobileDeviceAccessRuleResult executeDeleteMobileDeviceAccessRule(DeleteMobileDeviceAccessRuleRequest deleteMobileDeviceAccessRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMobileDeviceAccessRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMobileDeviceAccessRuleRequest> request = null;
        Response<DeleteMobileDeviceAccessRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMobileDeviceAccessRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMobileDeviceAccessRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMobileDeviceAccessRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMobileDeviceAccessRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMobileDeviceAccessRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an WorkMail organization and all underlying AWS resources managed by WorkMail as part of the
     * organization. You can choose whether to delete the associated directory. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/remove_organization.html">Removing an
     * organization</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @return Result of the DeleteOrganization operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteOrganizationResult deleteOrganization(DeleteOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOrganization(request);
    }

    @SdkInternalApi
    final DeleteOrganizationResult executeDeleteOrganization(DeleteOrganizationRequest deleteOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOrganizationRequest> request = null;
        Response<DeleteOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return Result of the DeleteResource operation returned by the service.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteResourceResult deleteResource(DeleteResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResource(request);
    }

    @SdkInternalApi
    final DeleteResourceResult executeDeleteResource(DeleteResourceRequest deleteResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceRequest> request = null;
        Response<DeleteResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified retention policy from the specified organization.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return Result of the DeleteRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeleteRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRetentionPolicy(request);
    }

    @SdkInternalApi
    final DeleteRetentionPolicyResult executeDeleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetentionPolicyRequest> request = null;
        Response<DeleteRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetentionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRetentionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRetentionPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteRetentionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user from WorkMail and all subsequent systems. Before you can delete a user, the user state must be
     * <code>DISABLED</code>. Use the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
     * permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in WorkMail. This action disassociates the mailbox and
     * schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
     * functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @return Result of the DeregisterFromWorkMail operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DeregisterFromWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterFromWorkMail"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterFromWorkMailResult deregisterFromWorkMail(DeregisterFromWorkMailRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterFromWorkMail(request);
    }

    @SdkInternalApi
    final DeregisterFromWorkMailResult executeDeregisterFromWorkMail(DeregisterFromWorkMailRequest deregisterFromWorkMailRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterFromWorkMailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterFromWorkMailRequest> request = null;
        Response<DeregisterFromWorkMailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterFromWorkMailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterFromWorkMailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterFromWorkMail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterFromWorkMailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterFromWorkMailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a domain from WorkMail, stops email routing to WorkMail, and removes the authorization allowing WorkMail
     * use. SES keeps the domain because other applications may use it. You must first remove any email address used by
     * WorkMail entities before you remove the domain.
     * </p>
     * 
     * @param deregisterMailDomainRequest
     * @return Result of the DeregisterMailDomain operation returned by the service.
     * @throws MailDomainInUseException
     *         The domain you're trying to change is in use by another user or organization in your account. See the
     *         error message for details.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws InvalidCustomSesConfigurationException
     *         You SES configuration has customizations that WorkMail cannot save. The error message lists the invalid
     *         setting. For examples of invalid settings, refer to <a
     *         href="https://docs.aws.amazon.com/ses/latest/APIReference/API_CreateReceiptRule.html"
     *         >CreateReceiptRule</a>.
     * @sample AmazonWorkMail.DeregisterMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterMailDomain" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterMailDomainResult deregisterMailDomain(DeregisterMailDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterMailDomain(request);
    }

    @SdkInternalApi
    final DeregisterMailDomainResult executeDeregisterMailDomain(DeregisterMailDomainRequest deregisterMailDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterMailDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterMailDomainRequest> request = null;
        Response<DeregisterMailDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterMailDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterMailDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterMailDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterMailDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterMailDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param describeEmailMonitoringConfigurationRequest
     * @return Result of the DescribeEmailMonitoringConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DescribeEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEmailMonitoringConfigurationResult describeEmailMonitoringConfiguration(DescribeEmailMonitoringConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEmailMonitoringConfiguration(request);
    }

    @SdkInternalApi
    final DescribeEmailMonitoringConfigurationResult executeDescribeEmailMonitoringConfiguration(
            DescribeEmailMonitoringConfigurationRequest describeEmailMonitoringConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEmailMonitoringConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEmailMonitoringConfigurationRequest> request = null;
        Response<DescribeEmailMonitoringConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEmailMonitoringConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEmailMonitoringConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEmailMonitoringConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEmailMonitoringConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEmailMonitoringConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeGroupResult describeGroup(DescribeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGroup(request);
    }

    @SdkInternalApi
    final DescribeGroupResult executeDescribeGroup(DescribeGroupRequest describeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupRequest> request = null;
        Response<DescribeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the settings in a DMARC policy for a specified organization.
     * </p>
     * 
     * @param describeInboundDmarcSettingsRequest
     * @return Result of the DescribeInboundDmarcSettings operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DescribeInboundDmarcSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeInboundDmarcSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInboundDmarcSettingsResult describeInboundDmarcSettings(DescribeInboundDmarcSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInboundDmarcSettings(request);
    }

    @SdkInternalApi
    final DescribeInboundDmarcSettingsResult executeDescribeInboundDmarcSettings(DescribeInboundDmarcSettingsRequest describeInboundDmarcSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInboundDmarcSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInboundDmarcSettingsRequest> request = null;
        Response<DescribeInboundDmarcSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInboundDmarcSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInboundDmarcSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInboundDmarcSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInboundDmarcSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInboundDmarcSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current status of a mailbox export job.
     * </p>
     * 
     * @param describeMailboxExportJobRequest
     * @return Result of the DescribeMailboxExportJob operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @sample AmazonWorkMail.DescribeMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMailboxExportJobResult describeMailboxExportJob(DescribeMailboxExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMailboxExportJob(request);
    }

    @SdkInternalApi
    final DescribeMailboxExportJobResult executeDescribeMailboxExportJob(DescribeMailboxExportJobRequest describeMailboxExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMailboxExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMailboxExportJobRequest> request = null;
        Response<DescribeMailboxExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMailboxExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMailboxExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMailboxExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMailboxExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMailboxExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides more information regarding a given organization based on its identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return Result of the DescribeOrganization operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @sample AmazonWorkMail.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeOrganizationResult describeOrganization(DescribeOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganization(request);
    }

    @SdkInternalApi
    final DescribeOrganizationResult executeDescribeOrganization(DescribeOrganizationRequest describeOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationRequest> request = null;
        Response<DescribeOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @return Result of the DescribeResource operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeResourceResult describeResource(DescribeResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResource(request);
    }

    @SdkInternalApi
    final DescribeResourceResult executeDescribeResource(DescribeResourceRequest describeResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceRequest> request = null;
        Response<DescribeResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUserResult describeUser(DescribeUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUser(request);
    }

    @SdkInternalApi
    final DescribeUserResult executeDescribeUser(DescribeUserRequest describeUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @return Result of the DisassociateDelegateFromResource operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.DisassociateDelegateFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDelegateFromResourceResult disassociateDelegateFromResource(DisassociateDelegateFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDelegateFromResource(request);
    }

    @SdkInternalApi
    final DisassociateDelegateFromResourceResult executeDisassociateDelegateFromResource(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDelegateFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDelegateFromResourceRequest> request = null;
        Response<DisassociateDelegateFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDelegateFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDelegateFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDelegateFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDelegateFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDelegateFromResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @return Result of the DisassociateMemberFromGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.DisassociateMemberFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMemberFromGroupResult disassociateMemberFromGroup(DisassociateMemberFromGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMemberFromGroup(request);
    }

    @SdkInternalApi
    final DisassociateMemberFromGroupResult executeDisassociateMemberFromGroup(DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberFromGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberFromGroupRequest> request = null;
        Response<DisassociateMemberFromGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberFromGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMemberFromGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMemberFromGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberFromGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMemberFromGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access
     * protocol action, and user ID or impersonation role ID. You must provide either the user ID or impersonation role
     * ID. Impersonation role ID can only be used with Action EWS.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @return Result of the GetAccessControlEffect operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.GetAccessControlEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetAccessControlEffect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccessControlEffectResult getAccessControlEffect(GetAccessControlEffectRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccessControlEffect(request);
    }

    @SdkInternalApi
    final GetAccessControlEffectResult executeGetAccessControlEffect(GetAccessControlEffectRequest getAccessControlEffectRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccessControlEffectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessControlEffectRequest> request = null;
        Response<GetAccessControlEffectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessControlEffectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccessControlEffectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccessControlEffect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccessControlEffectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAccessControlEffectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the default retention policy details for the specified organization.
     * </p>
     * 
     * @param getDefaultRetentionPolicyRequest
     * @return Result of the GetDefaultRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @sample AmazonWorkMail.GetDefaultRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetDefaultRetentionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDefaultRetentionPolicyResult getDefaultRetentionPolicy(GetDefaultRetentionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetDefaultRetentionPolicy(request);
    }

    @SdkInternalApi
    final GetDefaultRetentionPolicyResult executeGetDefaultRetentionPolicy(GetDefaultRetentionPolicyRequest getDefaultRetentionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getDefaultRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDefaultRetentionPolicyRequest> request = null;
        Response<GetDefaultRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDefaultRetentionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDefaultRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDefaultRetentionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDefaultRetentionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDefaultRetentionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the impersonation role details for the given WorkMail organization.
     * </p>
     * 
     * @param getImpersonationRoleRequest
     * @return Result of the GetImpersonationRole operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AmazonWorkMail.GetImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRole" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetImpersonationRoleResult getImpersonationRole(GetImpersonationRoleRequest request) {
        request = beforeClientExecution(request);
        return executeGetImpersonationRole(request);
    }

    @SdkInternalApi
    final GetImpersonationRoleResult executeGetImpersonationRole(GetImpersonationRoleRequest getImpersonationRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(getImpersonationRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImpersonationRoleRequest> request = null;
        Response<GetImpersonationRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImpersonationRoleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImpersonationRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImpersonationRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImpersonationRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImpersonationRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tests whether the given impersonation role can impersonate a target user.
     * </p>
     * 
     * @param getImpersonationRoleEffectRequest
     * @return Result of the GetImpersonationRoleEffect operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @sample AmazonWorkMail.GetImpersonationRoleEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRoleEffect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetImpersonationRoleEffectResult getImpersonationRoleEffect(GetImpersonationRoleEffectRequest request) {
        request = beforeClientExecution(request);
        return executeGetImpersonationRoleEffect(request);
    }

    @SdkInternalApi
    final GetImpersonationRoleEffectResult executeGetImpersonationRoleEffect(GetImpersonationRoleEffectRequest getImpersonationRoleEffectRequest) {

        ExecutionContext executionContext = createExecutionContext(getImpersonationRoleEffectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImpersonationRoleEffectRequest> request = null;
        Response<GetImpersonationRoleEffectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImpersonationRoleEffectRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getImpersonationRoleEffectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImpersonationRoleEffect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImpersonationRoleEffectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetImpersonationRoleEffectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details for a mail domain, including domain records required to configure your domain with recommended
     * security.
     * </p>
     * 
     * @param getMailDomainRequest
     * @return Result of the GetMailDomain operation returned by the service.
     * @throws MailDomainNotFoundException
     *         The domain specified is not found in your organization.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.GetMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMailDomainResult getMailDomain(GetMailDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetMailDomain(request);
    }

    @SdkInternalApi
    final GetMailDomainResult executeGetMailDomain(GetMailDomainRequest getMailDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getMailDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMailDomainRequest> request = null;
        Response<GetMailDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMailDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMailDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMailDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMailDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMailDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @return Result of the GetMailboxDetails operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @sample AmazonWorkMail.GetMailboxDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailboxDetails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMailboxDetailsResult getMailboxDetails(GetMailboxDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetMailboxDetails(request);
    }

    @SdkInternalApi
    final GetMailboxDetailsResult executeGetMailboxDetails(GetMailboxDetailsRequest getMailboxDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getMailboxDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMailboxDetailsRequest> request = null;
        Response<GetMailboxDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMailboxDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMailboxDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMailboxDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMailboxDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMailboxDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use
     * this method to test the effects of the current set of mobile device access rules for the WorkMail organization
     * for a particular user's attributes.
     * </p>
     * 
     * @param getMobileDeviceAccessEffectRequest
     * @return Result of the GetMobileDeviceAccessEffect operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.GetMobileDeviceAccessEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMobileDeviceAccessEffectResult getMobileDeviceAccessEffect(GetMobileDeviceAccessEffectRequest request) {
        request = beforeClientExecution(request);
        return executeGetMobileDeviceAccessEffect(request);
    }

    @SdkInternalApi
    final GetMobileDeviceAccessEffectResult executeGetMobileDeviceAccessEffect(GetMobileDeviceAccessEffectRequest getMobileDeviceAccessEffectRequest) {

        ExecutionContext executionContext = createExecutionContext(getMobileDeviceAccessEffectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMobileDeviceAccessEffectRequest> request = null;
        Response<GetMobileDeviceAccessEffectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMobileDeviceAccessEffectRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMobileDeviceAccessEffectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMobileDeviceAccessEffect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMobileDeviceAccessEffectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMobileDeviceAccessEffectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * 
     * @param getMobileDeviceAccessOverrideRequest
     * @return Result of the GetMobileDeviceAccessOverride operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AmazonWorkMail.GetMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMobileDeviceAccessOverrideResult getMobileDeviceAccessOverride(GetMobileDeviceAccessOverrideRequest request) {
        request = beforeClientExecution(request);
        return executeGetMobileDeviceAccessOverride(request);
    }

    @SdkInternalApi
    final GetMobileDeviceAccessOverrideResult executeGetMobileDeviceAccessOverride(GetMobileDeviceAccessOverrideRequest getMobileDeviceAccessOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(getMobileDeviceAccessOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMobileDeviceAccessOverrideRequest> request = null;
        Response<GetMobileDeviceAccessOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMobileDeviceAccessOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMobileDeviceAccessOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMobileDeviceAccessOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMobileDeviceAccessOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMobileDeviceAccessOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @return Result of the ListAccessControlRules operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListAccessControlRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAccessControlRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccessControlRulesResult listAccessControlRules(ListAccessControlRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListAccessControlRules(request);
    }

    @SdkInternalApi
    final ListAccessControlRulesResult executeListAccessControlRules(ListAccessControlRulesRequest listAccessControlRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccessControlRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessControlRulesRequest> request = null;
        Response<ListAccessControlRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessControlRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccessControlRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccessControlRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccessControlRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccessControlRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAliases(request);
    }

    @SdkInternalApi
    final ListAliasesResult executeListAliases(ListAliasesRequest listAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all the <code>AvailabilityConfiguration</code>'s for the given WorkMail organization.
     * </p>
     * 
     * @param listAvailabilityConfigurationsRequest
     * @return Result of the ListAvailabilityConfigurations operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListAvailabilityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAvailabilityConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAvailabilityConfigurationsResult listAvailabilityConfigurations(ListAvailabilityConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAvailabilityConfigurations(request);
    }

    @SdkInternalApi
    final ListAvailabilityConfigurationsResult executeListAvailabilityConfigurations(ListAvailabilityConfigurationsRequest listAvailabilityConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAvailabilityConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailabilityConfigurationsRequest> request = null;
        Response<ListAvailabilityConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailabilityConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAvailabilityConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAvailabilityConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAvailabilityConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAvailabilityConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @return Result of the ListGroupMembers operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupMembersResult listGroupMembers(ListGroupMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupMembers(request);
    }

    @SdkInternalApi
    final ListGroupMembersResult executeListGroupMembers(ListGroupMembersRequest listGroupMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupMembersRequest> request = null;
        Response<ListGroupMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the impersonation roles for the given WorkMail organization.
     * </p>
     * 
     * @param listImpersonationRolesRequest
     * @return Result of the ListImpersonationRoles operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListImpersonationRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListImpersonationRoles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListImpersonationRolesResult listImpersonationRoles(ListImpersonationRolesRequest request) {
        request = beforeClientExecution(request);
        return executeListImpersonationRoles(request);
    }

    @SdkInternalApi
    final ListImpersonationRolesResult executeListImpersonationRoles(ListImpersonationRolesRequest listImpersonationRolesRequest) {

        ExecutionContext executionContext = createExecutionContext(listImpersonationRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImpersonationRolesRequest> request = null;
        Response<ListImpersonationRolesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImpersonationRolesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImpersonationRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImpersonationRoles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImpersonationRolesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListImpersonationRolesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the mail domains in a given WorkMail organization.
     * </p>
     * 
     * @param listMailDomainsRequest
     * @return Result of the ListMailDomains operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListMailDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMailDomainsResult listMailDomains(ListMailDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListMailDomains(request);
    }

    @SdkInternalApi
    final ListMailDomainsResult executeListMailDomains(ListMailDomainsRequest listMailDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMailDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMailDomainsRequest> request = null;
        Response<ListMailDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMailDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMailDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMailDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMailDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMailDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the mailbox export jobs started for the specified organization within the last seven days.
     * </p>
     * 
     * @param listMailboxExportJobsRequest
     * @return Result of the ListMailboxExportJobs operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListMailboxExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMailboxExportJobsResult listMailboxExportJobs(ListMailboxExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMailboxExportJobs(request);
    }

    @SdkInternalApi
    final ListMailboxExportJobsResult executeListMailboxExportJobs(ListMailboxExportJobsRequest listMailboxExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMailboxExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMailboxExportJobsRequest> request = null;
        Response<ListMailboxExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMailboxExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMailboxExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMailboxExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMailboxExportJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListMailboxExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @return Result of the ListMailboxPermissions operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMailboxPermissionsResult listMailboxPermissions(ListMailboxPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListMailboxPermissions(request);
    }

    @SdkInternalApi
    final ListMailboxPermissionsResult executeListMailboxPermissions(ListMailboxPermissionsRequest listMailboxPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMailboxPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMailboxPermissionsRequest> request = null;
        Response<ListMailboxPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMailboxPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMailboxPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMailboxPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMailboxPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMailboxPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the mobile device access overrides for any given combination of WorkMail organization, user, or device.
     * </p>
     * 
     * @param listMobileDeviceAccessOverridesRequest
     * @return Result of the ListMobileDeviceAccessOverrides operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @sample AmazonWorkMail.ListMobileDeviceAccessOverrides
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessOverrides"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMobileDeviceAccessOverridesResult listMobileDeviceAccessOverrides(ListMobileDeviceAccessOverridesRequest request) {
        request = beforeClientExecution(request);
        return executeListMobileDeviceAccessOverrides(request);
    }

    @SdkInternalApi
    final ListMobileDeviceAccessOverridesResult executeListMobileDeviceAccessOverrides(
            ListMobileDeviceAccessOverridesRequest listMobileDeviceAccessOverridesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMobileDeviceAccessOverridesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMobileDeviceAccessOverridesRequest> request = null;
        Response<ListMobileDeviceAccessOverridesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMobileDeviceAccessOverridesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMobileDeviceAccessOverridesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMobileDeviceAccessOverrides");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMobileDeviceAccessOverridesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMobileDeviceAccessOverridesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the mobile device access rules for the specified WorkMail organization.
     * </p>
     * 
     * @param listMobileDeviceAccessRulesRequest
     * @return Result of the ListMobileDeviceAccessRules operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListMobileDeviceAccessRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMobileDeviceAccessRulesResult listMobileDeviceAccessRules(ListMobileDeviceAccessRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListMobileDeviceAccessRules(request);
    }

    @SdkInternalApi
    final ListMobileDeviceAccessRulesResult executeListMobileDeviceAccessRules(ListMobileDeviceAccessRulesRequest listMobileDeviceAccessRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMobileDeviceAccessRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMobileDeviceAccessRulesRequest> request = null;
        Response<ListMobileDeviceAccessRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMobileDeviceAccessRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listMobileDeviceAccessRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMobileDeviceAccessRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMobileDeviceAccessRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMobileDeviceAccessRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @return Result of the ListOrganizations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.ListOrganizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOrganizationsResult listOrganizations(ListOrganizationsRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizations(request);
    }

    @SdkInternalApi
    final ListOrganizationsResult executeListOrganizations(ListOrganizationsRequest listOrganizationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationsRequest> request = null;
        Response<ListOrganizationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOrganizationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOrganizationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
     * behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @return Result of the ListResourceDelegates operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListResourceDelegates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListResourceDelegatesResult listResourceDelegates(ListResourceDelegatesRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceDelegates(request);
    }

    @SdkInternalApi
    final ListResourceDelegatesResult executeListResourceDelegates(ListResourceDelegatesRequest listResourceDelegatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceDelegatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceDelegatesRequest> request = null;
        Response<ListResourceDelegatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceDelegatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceDelegatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceDelegates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceDelegatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListResourceDelegatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
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
     * Lists the tags applied to an WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AmazonWorkMail.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
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
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListUsers(request);
    }

    @SdkInternalApi
    final ListUsersResult executeListUsers(ListUsersRequest listUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new access control rule for the specified organization. The rule allows or denies access to the
     * organization for the specified IPv4 addresses, access protocol actions, user IDs and impersonation IDs. Adding a
     * new rule with the same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @return Result of the PutAccessControlRule operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.PutAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutAccessControlRule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAccessControlRuleResult putAccessControlRule(PutAccessControlRuleRequest request) {
        request = beforeClientExecution(request);
        return executePutAccessControlRule(request);
    }

    @SdkInternalApi
    final PutAccessControlRuleResult executePutAccessControlRule(PutAccessControlRuleRequest putAccessControlRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccessControlRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccessControlRuleRequest> request = null;
        Response<PutAccessControlRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccessControlRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAccessControlRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccessControlRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccessControlRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAccessControlRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates the email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param putEmailMonitoringConfigurationRequest
     * @return Result of the PutEmailMonitoringConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.PutEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutEmailMonitoringConfigurationResult putEmailMonitoringConfiguration(PutEmailMonitoringConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutEmailMonitoringConfiguration(request);
    }

    @SdkInternalApi
    final PutEmailMonitoringConfigurationResult executePutEmailMonitoringConfiguration(
            PutEmailMonitoringConfigurationRequest putEmailMonitoringConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putEmailMonitoringConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEmailMonitoringConfigurationRequest> request = null;
        Response<PutEmailMonitoringConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEmailMonitoringConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putEmailMonitoringConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEmailMonitoringConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEmailMonitoringConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutEmailMonitoringConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables or disables a DMARC policy for a given organization.
     * </p>
     * 
     * @param putInboundDmarcSettingsRequest
     * @return Result of the PutInboundDmarcSettings operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.PutInboundDmarcSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutInboundDmarcSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutInboundDmarcSettingsResult putInboundDmarcSettings(PutInboundDmarcSettingsRequest request) {
        request = beforeClientExecution(request);
        return executePutInboundDmarcSettings(request);
    }

    @SdkInternalApi
    final PutInboundDmarcSettingsResult executePutInboundDmarcSettings(PutInboundDmarcSettingsRequest putInboundDmarcSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(putInboundDmarcSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInboundDmarcSettingsRequest> request = null;
        Response<PutInboundDmarcSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInboundDmarcSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putInboundDmarcSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutInboundDmarcSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutInboundDmarcSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutInboundDmarcSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @return Result of the PutMailboxPermissions operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.PutMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutMailboxPermissionsResult putMailboxPermissions(PutMailboxPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executePutMailboxPermissions(request);
    }

    @SdkInternalApi
    final PutMailboxPermissionsResult executePutMailboxPermissions(PutMailboxPermissionsRequest putMailboxPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(putMailboxPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMailboxPermissionsRequest> request = null;
        Response<PutMailboxPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMailboxPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMailboxPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMailboxPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMailboxPermissionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutMailboxPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * 
     * @param putMobileDeviceAccessOverrideRequest
     * @return Result of the PutMobileDeviceAccessOverride operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @sample AmazonWorkMail.PutMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutMobileDeviceAccessOverrideResult putMobileDeviceAccessOverride(PutMobileDeviceAccessOverrideRequest request) {
        request = beforeClientExecution(request);
        return executePutMobileDeviceAccessOverride(request);
    }

    @SdkInternalApi
    final PutMobileDeviceAccessOverrideResult executePutMobileDeviceAccessOverride(PutMobileDeviceAccessOverrideRequest putMobileDeviceAccessOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(putMobileDeviceAccessOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMobileDeviceAccessOverrideRequest> request = null;
        Response<PutMobileDeviceAccessOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMobileDeviceAccessOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putMobileDeviceAccessOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMobileDeviceAccessOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMobileDeviceAccessOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutMobileDeviceAccessOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Puts a retention policy to the specified organization.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return Result of the PutRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @sample AmazonWorkMail.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutRetentionPolicy(request);
    }

    @SdkInternalApi
    final PutRetentionPolicyResult executePutRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionPolicyRequest> request = null;
        Response<PutRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRetentionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRetentionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRetentionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a new domain in WorkMail and SES, and configures it for use by WorkMail. Emails received by SES for
     * this domain are routed to the specified WorkMail organization, and WorkMail has permanent permission to use the
     * specified domain for sending your users' emails.
     * </p>
     * 
     * @param registerMailDomainRequest
     * @return Result of the RegisterMailDomain operation returned by the service.
     * @throws MailDomainInUseException
     *         The domain you're trying to change is in use by another user or organization in your account. See the
     *         error message for details.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.RegisterMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterMailDomain" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterMailDomainResult registerMailDomain(RegisterMailDomainRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterMailDomain(request);
    }

    @SdkInternalApi
    final RegisterMailDomainResult executeRegisterMailDomain(RegisterMailDomainRequest registerMailDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(registerMailDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterMailDomainRequest> request = null;
        Response<RegisterMailDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterMailDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerMailDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterMailDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterMailDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterMailDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for WorkMail use by associating a mailbox and
     * calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
     * group, or resource is deleted. This operation results in the accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The equivalent console functionality for this
     * operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API operation or they can be synchronized from your
     * directory. For more information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @return Result of the RegisterToWorkMail operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws EntityAlreadyRegisteredException
     *         The user, group, or resource that you're trying to register is already registered.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws MailDomainNotFoundException
     *         The domain specified is not found in your organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.RegisterToWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterToWorkMailResult registerToWorkMail(RegisterToWorkMailRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterToWorkMail(request);
    }

    @SdkInternalApi
    final RegisterToWorkMailResult executeRegisterToWorkMail(RegisterToWorkMailRequest registerToWorkMailRequest) {

        ExecutionContext executionContext = createExecutionContext(registerToWorkMailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterToWorkMailRequest> request = null;
        Response<RegisterToWorkMailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterToWorkMailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerToWorkMailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterToWorkMail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterToWorkMailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterToWorkMailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @return Result of the ResetPassword operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws InvalidPasswordException
     *         The supplied password doesn't match the minimum security constraints, such as length or use of special
     *         characters.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.ResetPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetPasswordResult resetPassword(ResetPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeResetPassword(request);
    }

    @SdkInternalApi
    final ResetPasswordResult executeResetPassword(ResetPasswordRequest resetPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(resetPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetPasswordRequest> request = null;
        Response<ResetPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetPasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to
     * the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/mail-export.html">Exporting mailbox content</a> in
     * the <i>WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param startMailboxExportJobRequest
     * @return Result of the StartMailboxExportJob operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @sample AmazonWorkMail.StartMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/StartMailboxExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartMailboxExportJobResult startMailboxExportJob(StartMailboxExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMailboxExportJob(request);
    }

    @SdkInternalApi
    final StartMailboxExportJobResult executeStartMailboxExportJob(StartMailboxExportJobRequest startMailboxExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMailboxExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMailboxExportJobRequest> request = null;
        Response<StartMailboxExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMailboxExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMailboxExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMailboxExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMailboxExportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartMailboxExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies the specified tags to the specified WorkMailorganization resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws TooManyTagsException
     *         The resource can have up to 50 user-applied tags.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
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
     * Performs a test on an availability provider to ensure that access is allowed. For EWS, it verifies the provided
     * credentials can be used to successfully log in. For Lambda, it verifies that the Lambda function can be invoked
     * and that the resource access policy was configured to deny anonymous access. An anonymous invocation is one done
     * without providing either a <code>SourceArn</code> or <code>SourceAccount</code> header.
     * </p>
     * <note>
     * <p>
     * The request must contain either one provider definition (<code>EwsProvider</code> or <code>LambdaProvider</code>)
     * or the <code>DomainName</code> parameter. If the <code>DomainName</code> parameter is provided, the configuration
     * stored under the <code>DomainName</code> will be tested.
     * </p>
     * </note>
     * 
     * @param testAvailabilityConfigurationRequest
     * @return Result of the TestAvailabilityConfiguration operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.TestAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TestAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TestAvailabilityConfigurationResult testAvailabilityConfiguration(TestAvailabilityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeTestAvailabilityConfiguration(request);
    }

    @SdkInternalApi
    final TestAvailabilityConfigurationResult executeTestAvailabilityConfiguration(TestAvailabilityConfigurationRequest testAvailabilityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(testAvailabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestAvailabilityConfigurationRequest> request = null;
        Response<TestAvailabilityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestAvailabilityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(testAvailabilityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestAvailabilityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestAvailabilityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TestAvailabilityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Untags the specified tags from the specified WorkMail organization resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @sample AmazonWorkMail.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
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
     * Updates an existing <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param updateAvailabilityConfigurationRequest
     * @return Result of the UpdateAvailabilityConfiguration operation returned by the service.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.UpdateAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAvailabilityConfigurationResult updateAvailabilityConfiguration(UpdateAvailabilityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAvailabilityConfiguration(request);
    }

    @SdkInternalApi
    final UpdateAvailabilityConfigurationResult executeUpdateAvailabilityConfiguration(
            UpdateAvailabilityConfigurationRequest updateAvailabilityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAvailabilityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAvailabilityConfigurationRequest> request = null;
        Response<UpdateAvailabilityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAvailabilityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAvailabilityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAvailabilityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAvailabilityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAvailabilityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the default mail domain for an organization. The default mail domain is used by the WorkMail AWS Console
     * to suggest an email address when enabling a mail user. You can only have one default domain.
     * </p>
     * 
     * @param updateDefaultMailDomainRequest
     * @return Result of the UpdateDefaultMailDomain operation returned by the service.
     * @throws MailDomainNotFoundException
     *         The domain specified is not found in your organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.UpdateDefaultMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateDefaultMailDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDefaultMailDomainResult updateDefaultMailDomain(UpdateDefaultMailDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDefaultMailDomain(request);
    }

    @SdkInternalApi
    final UpdateDefaultMailDomainResult executeUpdateDefaultMailDomain(UpdateDefaultMailDomainRequest updateDefaultMailDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDefaultMailDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDefaultMailDomainRequest> request = null;
        Response<UpdateDefaultMailDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDefaultMailDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDefaultMailDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDefaultMailDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDefaultMailDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDefaultMailDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an impersonation role for the given WorkMail organization.
     * </p>
     * 
     * @param updateImpersonationRoleRequest
     * @return Result of the UpdateImpersonationRole operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws ResourceNotFoundException
     *         The resource cannot be found.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws LimitExceededException
     *         The request exceeds the limit of the resource.
     * @sample AmazonWorkMail.UpdateImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateImpersonationRoleResult updateImpersonationRole(UpdateImpersonationRoleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateImpersonationRole(request);
    }

    @SdkInternalApi
    final UpdateImpersonationRoleResult executeUpdateImpersonationRole(UpdateImpersonationRoleRequest updateImpersonationRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateImpersonationRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateImpersonationRoleRequest> request = null;
        Response<UpdateImpersonationRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateImpersonationRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateImpersonationRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateImpersonationRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateImpersonationRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateImpersonationRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a user's current mailbox quota for a specified organization and user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @return Result of the UpdateMailboxQuota operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @sample AmazonWorkMail.UpdateMailboxQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMailboxQuota" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateMailboxQuotaResult updateMailboxQuota(UpdateMailboxQuotaRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMailboxQuota(request);
    }

    @SdkInternalApi
    final UpdateMailboxQuotaResult executeUpdateMailboxQuota(UpdateMailboxQuotaRequest updateMailboxQuotaRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMailboxQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMailboxQuotaRequest> request = null;
        Response<UpdateMailboxQuotaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMailboxQuotaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMailboxQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMailboxQuota");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMailboxQuotaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMailboxQuotaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a mobile device access rule for the specified WorkMail organization.
     * </p>
     * 
     * @param updateMobileDeviceAccessRuleRequest
     * @return Result of the UpdateMobileDeviceAccessRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.UpdateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMobileDeviceAccessRuleResult updateMobileDeviceAccessRule(UpdateMobileDeviceAccessRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMobileDeviceAccessRule(request);
    }

    @SdkInternalApi
    final UpdateMobileDeviceAccessRuleResult executeUpdateMobileDeviceAccessRule(UpdateMobileDeviceAccessRuleRequest updateMobileDeviceAccessRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMobileDeviceAccessRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMobileDeviceAccessRuleRequest> request = null;
        Response<UpdateMobileDeviceAccessRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMobileDeviceAccessRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMobileDeviceAccessRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMobileDeviceAccessRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMobileDeviceAccessRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMobileDeviceAccessRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
     * swapped between an existing alias and the current primary email), and the email provided in the input is promoted
     * as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @return Result of the UpdatePrimaryEmailAddress operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws MailDomainNotFoundException
     *         The domain specified is not found in your organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.UpdatePrimaryEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePrimaryEmailAddressResult updatePrimaryEmailAddress(UpdatePrimaryEmailAddressRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePrimaryEmailAddress(request);
    }

    @SdkInternalApi
    final UpdatePrimaryEmailAddressResult executeUpdatePrimaryEmailAddress(UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePrimaryEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePrimaryEmailAddressRequest> request = null;
        Response<UpdatePrimaryEmailAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePrimaryEmailAddressRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePrimaryEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePrimaryEmailAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePrimaryEmailAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePrimaryEmailAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be preceded by a <a>DescribeResource</a>
     * call. The dataset in the request should be the one expected when performing another <code>DescribeResource</code>
     * call.
     * </p>
     * 
     * @param updateResourceRequest
     * @return Result of the UpdateResource operation returned by the service.
     * @throws DirectoryUnavailableException
     *         The directory is unavailable. It might be located in another Region or deleted.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidConfigurationException
     *         The configuration for a resource isn't valid. A resource must either be able to auto-respond to requests
     *         or have at least one delegate associated that can do so on its behalf.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws MailDomainNotFoundException
     *         The domain specified is not found in your organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state to perform certain operations on the organization or its
     *         members.
     * @sample AmazonWorkMail.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResource(request);
    }

    @SdkInternalApi
    final UpdateResourceResult executeUpdateResource(UpdateResourceRequest updateResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkMail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResourceResultJsonUnmarshaller());
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
