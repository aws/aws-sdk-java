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

import javax.annotation.Generated;

import com.amazonaws.services.supportapp.model.*;

/**
 * Interface for accessing SupportApp asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.supportapp.AbstractAWSSupportAppAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSupportAppAsync extends AWSSupportApp {

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
     * @return A Java Future containing the result of the CreateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsync.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsyncHandler.CreateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/CreateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSlackChannelConfigurationRequest, CreateSlackChannelConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias for an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App
     * page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web
     * Services Support App.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @return A Java Future containing the result of the DeleteAccountAlias operation returned by the service.
     * @sample AWSSupportAppAsync.DeleteAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(DeleteAccountAliasRequest deleteAccountAliasRequest);

    /**
     * <p>
     * Deletes an alias for an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App
     * page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web
     * Services Support App.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccountAlias operation returned by the service.
     * @sample AWSSupportAppAsyncHandler.DeleteAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(DeleteAccountAliasRequest deleteAccountAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountAliasRequest, DeleteAccountAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a Slack channel configuration from your Amazon Web Services account. This operation doesn't delete your
     * Slack channel.
     * </p>
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @return A Java Future containing the result of the DeleteSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsync.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest);

    /**
     * <p>
     * Deletes a Slack channel configuration from your Amazon Web Services account. This operation doesn't delete your
     * Slack channel.
     * </p>
     * 
     * @param deleteSlackChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsyncHandler.DeleteSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackChannelConfigurationRequest, DeleteSlackChannelConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a Slack workspace configuration from your Amazon Web Services account. This operation doesn't delete your
     * Slack workspace.
     * </p>
     * 
     * @param deleteSlackWorkspaceConfigurationRequest
     * @return A Java Future containing the result of the DeleteSlackWorkspaceConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsync.DeleteSlackWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackWorkspaceConfigurationResult> deleteSlackWorkspaceConfigurationAsync(
            DeleteSlackWorkspaceConfigurationRequest deleteSlackWorkspaceConfigurationRequest);

    /**
     * <p>
     * Deletes a Slack workspace configuration from your Amazon Web Services account. This operation doesn't delete your
     * Slack workspace.
     * </p>
     * 
     * @param deleteSlackWorkspaceConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlackWorkspaceConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsyncHandler.DeleteSlackWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/DeleteSlackWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlackWorkspaceConfigurationResult> deleteSlackWorkspaceConfigurationAsync(
            DeleteSlackWorkspaceConfigurationRequest deleteSlackWorkspaceConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackWorkspaceConfigurationRequest, DeleteSlackWorkspaceConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the alias from an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support
     * App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web
     * Services Support App.
     * </p>
     * 
     * @param getAccountAliasRequest
     * @return A Java Future containing the result of the GetAccountAlias operation returned by the service.
     * @sample AWSSupportAppAsync.GetAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/GetAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountAliasResult> getAccountAliasAsync(GetAccountAliasRequest getAccountAliasRequest);

    /**
     * <p>
     * Retrieves the alias from an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support
     * App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web
     * Services Support App.
     * </p>
     * 
     * @param getAccountAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountAlias operation returned by the service.
     * @sample AWSSupportAppAsyncHandler.GetAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/GetAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountAliasResult> getAccountAliasAsync(GetAccountAliasRequest getAccountAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountAliasRequest, GetAccountAliasResult> asyncHandler);

    /**
     * <p>
     * Lists the Slack channel configurations for an Amazon Web Services account.
     * </p>
     * 
     * @param listSlackChannelConfigurationsRequest
     * @return A Java Future containing the result of the ListSlackChannelConfigurations operation returned by the
     *         service.
     * @sample AWSSupportAppAsync.ListSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSlackChannelConfigurationsResult> listSlackChannelConfigurationsAsync(
            ListSlackChannelConfigurationsRequest listSlackChannelConfigurationsRequest);

    /**
     * <p>
     * Lists the Slack channel configurations for an Amazon Web Services account.
     * </p>
     * 
     * @param listSlackChannelConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSlackChannelConfigurations operation returned by the
     *         service.
     * @sample AWSSupportAppAsyncHandler.ListSlackChannelConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackChannelConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSlackChannelConfigurationsResult> listSlackChannelConfigurationsAsync(
            ListSlackChannelConfigurationsRequest listSlackChannelConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSlackChannelConfigurationsRequest, ListSlackChannelConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists the Slack workspace configurations for an Amazon Web Services account.
     * </p>
     * 
     * @param listSlackWorkspaceConfigurationsRequest
     * @return A Java Future containing the result of the ListSlackWorkspaceConfigurations operation returned by the
     *         service.
     * @sample AWSSupportAppAsync.ListSlackWorkspaceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackWorkspaceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSlackWorkspaceConfigurationsResult> listSlackWorkspaceConfigurationsAsync(
            ListSlackWorkspaceConfigurationsRequest listSlackWorkspaceConfigurationsRequest);

    /**
     * <p>
     * Lists the Slack workspace configurations for an Amazon Web Services account.
     * </p>
     * 
     * @param listSlackWorkspaceConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSlackWorkspaceConfigurations operation returned by the
     *         service.
     * @sample AWSSupportAppAsyncHandler.ListSlackWorkspaceConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/ListSlackWorkspaceConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSlackWorkspaceConfigurationsResult> listSlackWorkspaceConfigurationsAsync(
            ListSlackWorkspaceConfigurationsRequest listSlackWorkspaceConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSlackWorkspaceConfigurationsRequest, ListSlackWorkspaceConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an individual alias for each Amazon Web Services account ID. The alias appears in the Amazon
     * Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages
     * from the Amazon Web Services Support App.
     * </p>
     * 
     * @param putAccountAliasRequest
     * @return A Java Future containing the result of the PutAccountAlias operation returned by the service.
     * @sample AWSSupportAppAsync.PutAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/PutAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountAliasResult> putAccountAliasAsync(PutAccountAliasRequest putAccountAliasRequest);

    /**
     * <p>
     * Creates or updates an individual alias for each Amazon Web Services account ID. The alias appears in the Amazon
     * Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages
     * from the Amazon Web Services Support App.
     * </p>
     * 
     * @param putAccountAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountAlias operation returned by the service.
     * @sample AWSSupportAppAsyncHandler.PutAccountAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/PutAccountAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountAliasResult> putAccountAliasAsync(PutAccountAliasRequest putAccountAliasRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountAliasRequest, PutAccountAliasResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterSlackWorkspaceForOrganization operation returned by
     *         the service.
     * @sample AWSSupportAppAsync.RegisterSlackWorkspaceForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/RegisterSlackWorkspaceForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterSlackWorkspaceForOrganizationResult> registerSlackWorkspaceForOrganizationAsync(
            RegisterSlackWorkspaceForOrganizationRequest registerSlackWorkspaceForOrganizationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterSlackWorkspaceForOrganization operation returned by
     *         the service.
     * @sample AWSSupportAppAsyncHandler.RegisterSlackWorkspaceForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/RegisterSlackWorkspaceForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterSlackWorkspaceForOrganizationResult> registerSlackWorkspaceForOrganizationAsync(
            RegisterSlackWorkspaceForOrganizationRequest registerSlackWorkspaceForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterSlackWorkspaceForOrganizationRequest, RegisterSlackWorkspaceForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for a Slack channel, such as case update notifications.
     * </p>
     * 
     * @param updateSlackChannelConfigurationRequest
     * @return A Java Future containing the result of the UpdateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsync.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest);

    /**
     * <p>
     * Updates the configuration for a Slack channel, such as case update notifications.
     * </p>
     * 
     * @param updateSlackChannelConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSlackChannelConfiguration operation returned by the
     *         service.
     * @sample AWSSupportAppAsyncHandler.UpdateSlackChannelConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/UpdateSlackChannelConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSlackChannelConfigurationRequest, UpdateSlackChannelConfigurationResult> asyncHandler);

}
