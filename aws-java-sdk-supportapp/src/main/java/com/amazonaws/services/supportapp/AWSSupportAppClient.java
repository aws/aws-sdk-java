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
package com.amazonaws.services.supportapp;

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

import com.amazonaws.services.supportapp.AWSSupportAppClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.supportapp.model.*;
import com.amazonaws.services.supportapp.model.transform.*;

/**
 * Client for accessing SupportApp. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * <fullname>Amazon Web Services Support App in Slack</fullname>
 * <p>
 * You can use the Amazon Web Services Support App in Slack API to manage your support cases in Slack for your Amazon
 * Web Services account. After you configure your Slack workspace and channel with the Amazon Web Services Support App,
 * you can perform the following tasks directly in your Slack channel:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create, search, update, and resolve your support cases
 * </p>
 * </li>
 * <li>
 * <p>
 * Request service quota increases for your account
 * </p>
 * </li>
 * <li>
 * <p>
 * Invite Amazon Web Services Support agents to your channel so that you can chat directly about your support cases
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about how to perform these actions in Slack, see the following documentation in the <i>Amazon
 * Web Services Support User Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html">Amazon Web Services
 * Support App in Slack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/joining-a-live-chat-session.html">Joining a live chat
 * session with Amazon Web Services Support</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/service-quota-increase.html">Requesting service quota
 * increases</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-commands.html">Amazon Web Services Support
 * App commands in Slack</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can also use the Amazon Web Services Management Console instead of the Amazon Web Services Support App API to
 * manage your Slack configurations. For more information, see <a
 * href="https://docs.aws.amazon.com/awssupport/latest/user/authorize-slack-workspace.html">Authorize a Slack workspace
 * to enable the Amazon Web Services Support App</a>.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise Support plan to use the Amazon Web Services Support App API.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about the Amazon Web Services Support App endpoints, see the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/awssupport.html#awssupport_app_region">Amazon Web Services
 * Support App in Slack endpoints</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * </li>
 * </ul>
 * </note></p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSupportAppClient extends AmazonWebServiceClient implements AWSSupportApp {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSupportApp.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "supportapp";

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
                                    com.amazonaws.services.supportapp.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supportapp.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supportapp.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supportapp.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supportapp.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.supportapp.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.supportapp.model.AWSSupportAppException.class));

    public static AWSSupportAppClientBuilder builder() {
        return AWSSupportAppClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SupportApp using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSupportAppClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SupportApp using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSupportAppClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("supportapp.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/supportapp/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/supportapp/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a Slack channel configuration for your Amazon Web Services account.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can add up to 5 Slack workspaces for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can add up to 20 Slack channels for your account.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * A Slack channel can have up to 100 Amazon Web Services accounts. This means that only 100 accounts can add the
     * same Slack channel to the Amazon Web Services Support App. We recommend that you only add the accounts that you
     * need to manage support cases for your organization. This can reduce the notifications about case updates that you
     * receive in the Slack channel.
     * </p>
     * <note>
     * <p>
     * We recommend that you choose a private Slack channel so that only members in that channel have read and write
     * access to your support cases. Anyone in your Slack channel can create, update, or resolve support cases for your
     * account. Users require an invitation to join private channels.
     * </p>
     * </note>
     * 
     * @param createSlackChannelConfigurationRequest
     * @return Result of the CreateSlackChannelConfiguration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Your Service Quotas request exceeds the quota for the service. For example, your Service Quotas request
     *         to Amazon Web Services Support App might exceed the maximum number of workspaces or channels per account,
     *         or the maximum number of accounts per Slack channel.
     * @throws ConflictException
     *         Your request has a conflict. For example, you might receive this error if you try the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Add, update, or delete a Slack channel configuration before you add a Slack workspace to your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Add a Slack channel configuration that already exists in your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack channel configuration for a live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack workspace from your Amazon Web Services account that has an active live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from an Amazon Web Services account that
     *         doesn't belong to an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from a member account, but the management
     *         account hasn't registered that workspace yet for the organization.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ValidationException
     *         Your request input doesn't meet the constraints that the Amazon Web Services Support App specifies.
     * @sample AWSSupportApp.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSlackChannelConfigurationResult createSlackChannelConfiguration(CreateSlackChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSlackChannelConfiguration(request);
    }

    @SdkInternalApi
    final CreateSlackChannelConfigurationResult executeCreateSlackChannelConfiguration(
            CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSlackChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSlackChannelConfigurationRequest> request = null;
        Response<CreateSlackChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSlackChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSlackChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSlackChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSlackChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSlackChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alias for an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App
     * page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web
     * Services Support App.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @return Result of the DeleteAccountAlias operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource is missing or doesn't exist, such as an account alias, Slack channel
     *         configuration, or Slack workspace configuration.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSSupportApp.DeleteAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountAlias(request);
    }

    @SdkInternalApi
    final DeleteAccountAliasResult executeDeleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountAliasRequest> request = null;
        Response<DeleteAccountAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccountAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Slack channel configuration from your Amazon Web Services account. This operation doesn't delete your
     * Slack channel.
     * </p>
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @return Result of the DeleteSlackChannelConfiguration operation returned by the service.
     * @throws ConflictException
     *         Your request has a conflict. For example, you might receive this error if you try the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Add, update, or delete a Slack channel configuration before you add a Slack workspace to your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Add a Slack channel configuration that already exists in your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack channel configuration for a live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack workspace from your Amazon Web Services account that has an active live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from an Amazon Web Services account that
     *         doesn't belong to an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from a member account, but the management
     *         account hasn't registered that workspace yet for the organization.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         The specified resource is missing or doesn't exist, such as an account alias, Slack channel
     *         configuration, or Slack workspace configuration.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ValidationException
     *         Your request input doesn't meet the constraints that the Amazon Web Services Support App specifies.
     * @sample AWSSupportApp.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSlackChannelConfigurationResult deleteSlackChannelConfiguration(DeleteSlackChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlackChannelConfiguration(request);
    }

    @SdkInternalApi
    final DeleteSlackChannelConfigurationResult executeDeleteSlackChannelConfiguration(
            DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlackChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlackChannelConfigurationRequest> request = null;
        Response<DeleteSlackChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlackChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSlackChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlackChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlackChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSlackChannelConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Slack workspace configuration from your Amazon Web Services account. This operation doesn't delete your
     * Slack workspace.
     * </p>
     * 
     * @param deleteSlackWorkspaceConfigurationRequest
     * @return Result of the DeleteSlackWorkspaceConfiguration operation returned by the service.
     * @throws ConflictException
     *         Your request has a conflict. For example, you might receive this error if you try the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Add, update, or delete a Slack channel configuration before you add a Slack workspace to your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Add a Slack channel configuration that already exists in your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack channel configuration for a live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack workspace from your Amazon Web Services account that has an active live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from an Amazon Web Services account that
     *         doesn't belong to an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from a member account, but the management
     *         account hasn't registered that workspace yet for the organization.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         The specified resource is missing or doesn't exist, such as an account alias, Slack channel
     *         configuration, or Slack workspace configuration.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ValidationException
     *         Your request input doesn't meet the constraints that the Amazon Web Services Support App specifies.
     * @sample AWSSupportApp.DeleteSlackWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSlackWorkspaceConfigurationResult deleteSlackWorkspaceConfiguration(DeleteSlackWorkspaceConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSlackWorkspaceConfiguration(request);
    }

    @SdkInternalApi
    final DeleteSlackWorkspaceConfigurationResult executeDeleteSlackWorkspaceConfiguration(
            DeleteSlackWorkspaceConfigurationRequest deleteSlackWorkspaceConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSlackWorkspaceConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSlackWorkspaceConfigurationRequest> request = null;
        Response<DeleteSlackWorkspaceConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSlackWorkspaceConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSlackWorkspaceConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSlackWorkspaceConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSlackWorkspaceConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSlackWorkspaceConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the alias from an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support
     * App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web
     * Services Support App.
     * </p>
     * 
     * @param getAccountAliasRequest
     * @return Result of the GetAccountAlias operation returned by the service.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSSupportApp.GetAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/GetAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountAliasResult getAccountAlias(GetAccountAliasRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountAlias(request);
    }

    @SdkInternalApi
    final GetAccountAliasResult executeGetAccountAlias(GetAccountAliasRequest getAccountAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountAliasRequest> request = null;
        Response<GetAccountAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Slack channel configurations for an Amazon Web Services account.
     * </p>
     * 
     * @param listSlackChannelConfigurationsRequest
     * @return Result of the ListSlackChannelConfigurations operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSSupportApp.ListSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSlackChannelConfigurationsResult listSlackChannelConfigurations(ListSlackChannelConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSlackChannelConfigurations(request);
    }

    @SdkInternalApi
    final ListSlackChannelConfigurationsResult executeListSlackChannelConfigurations(ListSlackChannelConfigurationsRequest listSlackChannelConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSlackChannelConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSlackChannelConfigurationsRequest> request = null;
        Response<ListSlackChannelConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSlackChannelConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSlackChannelConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSlackChannelConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSlackChannelConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSlackChannelConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Slack workspace configurations for an Amazon Web Services account.
     * </p>
     * 
     * @param listSlackWorkspaceConfigurationsRequest
     * @return Result of the ListSlackWorkspaceConfigurations operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @sample AWSSupportApp.ListSlackWorkspaceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackWorkspaceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSlackWorkspaceConfigurationsResult listSlackWorkspaceConfigurations(ListSlackWorkspaceConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSlackWorkspaceConfigurations(request);
    }

    @SdkInternalApi
    final ListSlackWorkspaceConfigurationsResult executeListSlackWorkspaceConfigurations(
            ListSlackWorkspaceConfigurationsRequest listSlackWorkspaceConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSlackWorkspaceConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSlackWorkspaceConfigurationsRequest> request = null;
        Response<ListSlackWorkspaceConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSlackWorkspaceConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSlackWorkspaceConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSlackWorkspaceConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSlackWorkspaceConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSlackWorkspaceConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an individual alias for each Amazon Web Services account ID. The alias appears in the Amazon
     * Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages
     * from the Amazon Web Services Support App.
     * </p>
     * 
     * @param putAccountAliasRequest
     * @return Result of the PutAccountAlias operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ValidationException
     *         Your request input doesn't meet the constraints that the Amazon Web Services Support App specifies.
     * @sample AWSSupportApp.PutAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/PutAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAccountAliasResult putAccountAlias(PutAccountAliasRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountAlias(request);
    }

    @SdkInternalApi
    final PutAccountAliasResult executePutAccountAlias(PutAccountAliasRequest putAccountAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountAliasRequest> request = null;
        Response<PutAccountAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAccountAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a Slack workspace for your Amazon Web Services account. To call this API, your account must be part of
     * an organization in Organizations.
     * </p>
     * <p>
     * If you're the <i>management account</i> and you want to register Slack workspaces for your organization, you must
     * complete the following tasks:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Sign in to the <a href="https://console.aws.amazon.com/support/app">Amazon Web Services Support Center</a> and
     * authorize the Slack workspaces where you want your organization to have access to. See <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/authorize-slack-workspace.html">Authorize a Slack
     * workspace</a> in the <i>Amazon Web Services Support User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call the <code>RegisterSlackWorkspaceForOrganization</code> API to authorize each Slack workspace for the
     * organization.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After the management account authorizes the Slack workspace, member accounts can call this API to authorize the
     * same Slack workspace for their individual accounts. Member accounts don't need to authorize the Slack workspace
     * manually through the <a href="https://console.aws.amazon.com/support/app">Amazon Web Services Support Center</a>.
     * </p>
     * <p>
     * To use the Amazon Web Services Support App, each account must then complete the following tasks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create an Identity and Access Management (IAM) role with the required permission. For more information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-permissions.html">Managing access to the
     * Amazon Web Services Support App</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Configure a Slack channel to use the Amazon Web Services Support App for support cases for that account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/awssupport/latest/user/add-your-slack-channel.html">Configuring a Slack
     * channel</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerSlackWorkspaceForOrganizationRequest
     * @return Result of the RegisterSlackWorkspaceForOrganization operation returned by the service.
     * @throws ConflictException
     *         Your request has a conflict. For example, you might receive this error if you try the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Add, update, or delete a Slack channel configuration before you add a Slack workspace to your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Add a Slack channel configuration that already exists in your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack channel configuration for a live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack workspace from your Amazon Web Services account that has an active live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from an Amazon Web Services account that
     *         doesn't belong to an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from a member account, but the management
     *         account hasn't registered that workspace yet for the organization.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         The specified resource is missing or doesn't exist, such as an account alias, Slack channel
     *         configuration, or Slack workspace configuration.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ValidationException
     *         Your request input doesn't meet the constraints that the Amazon Web Services Support App specifies.
     * @sample AWSSupportApp.RegisterSlackWorkspaceForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/RegisterSlackWorkspaceForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterSlackWorkspaceForOrganizationResult registerSlackWorkspaceForOrganization(RegisterSlackWorkspaceForOrganizationRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterSlackWorkspaceForOrganization(request);
    }

    @SdkInternalApi
    final RegisterSlackWorkspaceForOrganizationResult executeRegisterSlackWorkspaceForOrganization(
            RegisterSlackWorkspaceForOrganizationRequest registerSlackWorkspaceForOrganizationRequest) {

        ExecutionContext executionContext = createExecutionContext(registerSlackWorkspaceForOrganizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterSlackWorkspaceForOrganizationRequest> request = null;
        Response<RegisterSlackWorkspaceForOrganizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterSlackWorkspaceForOrganizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerSlackWorkspaceForOrganizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterSlackWorkspaceForOrganization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterSlackWorkspaceForOrganizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterSlackWorkspaceForOrganizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for a Slack channel, such as case update notifications.
     * </p>
     * 
     * @param updateSlackChannelConfigurationRequest
     * @return Result of the UpdateSlackChannelConfiguration operation returned by the service.
     * @throws ConflictException
     *         Your request has a conflict. For example, you might receive this error if you try the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Add, update, or delete a Slack channel configuration before you add a Slack workspace to your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Add a Slack channel configuration that already exists in your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack channel configuration for a live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete a Slack workspace from your Amazon Web Services account that has an active live chat channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from an Amazon Web Services account that
     *         doesn't belong to an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Call the <code>RegisterSlackWorkspaceForOrganization</code> API from a member account, but the management
     *         account hasn't registered that workspace yet for the organization.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         The specified resource is missing or doesn't exist, such as an account alias, Slack channel
     *         configuration, or Slack workspace configuration.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws InternalServerException
     *         We can’t process your request right now because of a server issue. Try again later.
     * @throws ValidationException
     *         Your request input doesn't meet the constraints that the Amazon Web Services Support App specifies.
     * @sample AWSSupportApp.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSlackChannelConfigurationResult updateSlackChannelConfiguration(UpdateSlackChannelConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSlackChannelConfiguration(request);
    }

    @SdkInternalApi
    final UpdateSlackChannelConfigurationResult executeUpdateSlackChannelConfiguration(
            UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSlackChannelConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSlackChannelConfigurationRequest> request = null;
        Response<UpdateSlackChannelConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSlackChannelConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSlackChannelConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Support App");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSlackChannelConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSlackChannelConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSlackChannelConfigurationResultJsonUnmarshaller());
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
