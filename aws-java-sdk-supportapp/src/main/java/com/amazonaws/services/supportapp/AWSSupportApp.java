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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.supportapp.model.*;

/**
 * Interface for accessing SupportApp.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.supportapp.AbstractAWSSupportApp} instead.
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
public interface AWSSupportApp {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "supportapp";

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
    CreateSlackChannelConfigurationResult createSlackChannelConfiguration(CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest);

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
    DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest);

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
    DeleteSlackChannelConfigurationResult deleteSlackChannelConfiguration(DeleteSlackChannelConfigurationRequest deleteSlackChannelConfigurationRequest);

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
    DeleteSlackWorkspaceConfigurationResult deleteSlackWorkspaceConfiguration(DeleteSlackWorkspaceConfigurationRequest deleteSlackWorkspaceConfigurationRequest);

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
    GetAccountAliasResult getAccountAlias(GetAccountAliasRequest getAccountAliasRequest);

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
    ListSlackChannelConfigurationsResult listSlackChannelConfigurations(ListSlackChannelConfigurationsRequest listSlackChannelConfigurationsRequest);

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
    ListSlackWorkspaceConfigurationsResult listSlackWorkspaceConfigurations(ListSlackWorkspaceConfigurationsRequest listSlackWorkspaceConfigurationsRequest);

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
    PutAccountAliasResult putAccountAlias(PutAccountAliasRequest putAccountAliasRequest);

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
    RegisterSlackWorkspaceForOrganizationResult registerSlackWorkspaceForOrganization(
            RegisterSlackWorkspaceForOrganizationRequest registerSlackWorkspaceForOrganizationRequest);

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
    UpdateSlackChannelConfigurationResult updateSlackChannelConfiguration(UpdateSlackChannelConfigurationRequest updateSlackChannelConfigurationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
