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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * you specify <code>ORGANIZATION</code>, you must specify which organizational units the workspace can access in
     * the <code>workspaceOrganizationalUnits</code> parameter.
     * </p>
     */
    private String accountAccessType;
    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     */
    private java.util.List<String> authenticationProviders;
    /**
     * <p>
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The configuration string for the workspace that you create. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     */
    private String configuration;
    /**
     * <p>
     * The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data sources
     * and notification channels in other accounts in an organization.
     * </p>
     */
    private String organizationRoleName;
    /**
     * <p>
     * If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically creates
     * the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and
     * notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code> will not create the IAM
     * role for you. The ability for the Amazon Managed Grafana to create the IAM role on behalf of the user is
     * supported only in the Amazon Managed Grafana AWS console. Use only the <code>CUSTOMER_MANAGED</code> permission
     * type when creating a workspace in the CLI.
     * </p>
     * <p>
     * If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you are
     * creating this workspace in a member account of an organization that is not a delegated administrator account, and
     * you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must
     * choose <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * </p>
     */
    private String permissionType;
    /**
     * <p>
     * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The list of tags associated with the workspace.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;
    /**
     * <p>
     * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data
     * sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana
     * to read data from these sources. You must still add them as data sources in the Grafana console in the workspace.
     * </p>
     * <p>
     * If you don't specify a data source here, you can still add it as a data source in the workspace console later.
     * However, you will then have to manually configure permissions for it.
     * </p>
     */
    private java.util.List<String> workspaceDataSources;
    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     * <p>
     * Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     * </p>
     */
    private String workspaceDescription;
    /**
     * <p>
     * The name for the workspace. It does not have to be unique.
     * </p>
     */
    private String workspaceName;
    /**
     * <p>
     * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these
     * data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed
     * Grafana to use these channels.
     * </p>
     */
    private java.util.List<String> workspaceNotificationDestinations;
    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     */
    private java.util.List<String> workspaceOrganizationalUnits;
    /**
     * <p>
     * The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the workspace
     * will view data from. If you already have a role that you want to use, specify it here. The permission type should
     * be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     */
    private String workspaceRoleArn;

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * you specify <code>ORGANIZATION</code>, you must specify which organizational units the workspace can access in
     * the <code>workspaceOrganizationalUnits</code> parameter.
     * </p>
     * 
     * @param accountAccessType
     *        Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *        account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *        organization. If you specify <code>ORGANIZATION</code>, you must specify which organizational units the
     *        workspace can access in the <code>workspaceOrganizationalUnits</code> parameter.
     * @see AccountAccessType
     */

    public void setAccountAccessType(String accountAccessType) {
        this.accountAccessType = accountAccessType;
    }

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * you specify <code>ORGANIZATION</code>, you must specify which organizational units the workspace can access in
     * the <code>workspaceOrganizationalUnits</code> parameter.
     * </p>
     * 
     * @return Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *         account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *         organization. If you specify <code>ORGANIZATION</code>, you must specify which organizational units the
     *         workspace can access in the <code>workspaceOrganizationalUnits</code> parameter.
     * @see AccountAccessType
     */

    public String getAccountAccessType() {
        return this.accountAccessType;
    }

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * you specify <code>ORGANIZATION</code>, you must specify which organizational units the workspace can access in
     * the <code>workspaceOrganizationalUnits</code> parameter.
     * </p>
     * 
     * @param accountAccessType
     *        Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *        account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *        organization. If you specify <code>ORGANIZATION</code>, you must specify which organizational units the
     *        workspace can access in the <code>workspaceOrganizationalUnits</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountAccessType
     */

    public CreateWorkspaceRequest withAccountAccessType(String accountAccessType) {
        setAccountAccessType(accountAccessType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * you specify <code>ORGANIZATION</code>, you must specify which organizational units the workspace can access in
     * the <code>workspaceOrganizationalUnits</code> parameter.
     * </p>
     * 
     * @param accountAccessType
     *        Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *        account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *        organization. If you specify <code>ORGANIZATION</code>, you must specify which organizational units the
     *        workspace can access in the <code>workspaceOrganizationalUnits</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountAccessType
     */

    public CreateWorkspaceRequest withAccountAccessType(AccountAccessType accountAccessType) {
        this.accountAccessType = accountAccessType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @return Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or
     *         both to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User
     *         authentication in Amazon Managed Grafana</a>.
     * @see AuthenticationProviderTypes
     */

    public java.util.List<String> getAuthenticationProviders() {
        return authenticationProviders;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @see AuthenticationProviderTypes
     */

    public void setAuthenticationProviders(java.util.Collection<String> authenticationProviders) {
        if (authenticationProviders == null) {
            this.authenticationProviders = null;
            return;
        }

        this.authenticationProviders = new java.util.ArrayList<String>(authenticationProviders);
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthenticationProviders(java.util.Collection)} or
     * {@link #withAuthenticationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public CreateWorkspaceRequest withAuthenticationProviders(String... authenticationProviders) {
        if (this.authenticationProviders == null) {
            setAuthenticationProviders(new java.util.ArrayList<String>(authenticationProviders.length));
        }
        for (String ele : authenticationProviders) {
            this.authenticationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public CreateWorkspaceRequest withAuthenticationProviders(java.util.Collection<String> authenticationProviders) {
        setAuthenticationProviders(authenticationProviders);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both to
     * authenticate users for using the Grafana console within a workspace. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication in
     * Amazon Managed Grafana</a>.
     * </p>
     * 
     * @param authenticationProviders
     *        Specifies whether this workspace uses SAML 2.0, IAM Identity Center (successor to Single Sign-On), or both
     *        to authenticate users for using the Grafana console within a workspace. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/authentication-in-AMG.html">User authentication
     *        in Amazon Managed Grafana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationProviderTypes
     */

    public CreateWorkspaceRequest withAuthenticationProviders(AuthenticationProviderTypes... authenticationProviders) {
        java.util.ArrayList<String> authenticationProvidersCopy = new java.util.ArrayList<String>(authenticationProviders.length);
        for (AuthenticationProviderTypes value : authenticationProviders) {
            authenticationProvidersCopy.add(value.toString());
        }
        if (getAuthenticationProviders() == null) {
            setAuthenticationProviders(authenticationProvidersCopy);
        } else {
            getAuthenticationProviders().addAll(authenticationProvidersCopy);
        }
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The configuration string for the workspace that you create. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param configuration
     *        The configuration string for the workspace that you create. For more information about the format and
     *        configuration options available, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your
     *        Grafana workspace</a>.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration string for the workspace that you create. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The configuration string for the workspace that you create. For more information about the format and
     *         configuration options available, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your
     *         Grafana workspace</a>.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration string for the workspace that you create. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param configuration
     *        The configuration string for the workspace that you create. For more information about the format and
     *        configuration options available, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your
     *        Grafana workspace</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data sources
     * and notification channels in other accounts in an organization.
     * </p>
     * 
     * @param organizationRoleName
     *        The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data
     *        sources and notification channels in other accounts in an organization.
     */

    public void setOrganizationRoleName(String organizationRoleName) {
        this.organizationRoleName = organizationRoleName;
    }

    /**
     * <p>
     * The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data sources
     * and notification channels in other accounts in an organization.
     * </p>
     * 
     * @return The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data
     *         sources and notification channels in other accounts in an organization.
     */

    public String getOrganizationRoleName() {
        return this.organizationRoleName;
    }

    /**
     * <p>
     * The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data sources
     * and notification channels in other accounts in an organization.
     * </p>
     * 
     * @param organizationRoleName
     *        The name of an IAM role that already exists to use with Organizations to access Amazon Web Services data
     *        sources and notification channels in other accounts in an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withOrganizationRoleName(String organizationRoleName) {
        setOrganizationRoleName(organizationRoleName);
        return this;
    }

    /**
     * <p>
     * If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically creates
     * the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and
     * notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code> will not create the IAM
     * role for you. The ability for the Amazon Managed Grafana to create the IAM role on behalf of the user is
     * supported only in the Amazon Managed Grafana AWS console. Use only the <code>CUSTOMER_MANAGED</code> permission
     * type when creating a workspace in the CLI.
     * </p>
     * <p>
     * If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you are
     * creating this workspace in a member account of an organization that is not a delegated administrator account, and
     * you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must
     * choose <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * </p>
     * 
     * @param permissionType
     *        If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically
     *        creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services
     *        data sources and notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code>
     *        will not create the IAM role for you. The ability for the Amazon Managed Grafana to create the IAM role on
     *        behalf of the user is supported only in the Amazon Managed Grafana AWS console. Use only the
     *        <code>CUSTOMER_MANAGED</code> permission type when creating a workspace in the CLI. </p>
     *        <p>
     *        If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you
     *        are creating this workspace in a member account of an organization that is not a delegated administrator
     *        account, and you want the workspace to access data sources in other Amazon Web Services accounts in the
     *        organization, you must choose <code>CUSTOMER_MANAGED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * @see PermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically creates
     * the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and
     * notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code> will not create the IAM
     * role for you. The ability for the Amazon Managed Grafana to create the IAM role on behalf of the user is
     * supported only in the Amazon Managed Grafana AWS console. Use only the <code>CUSTOMER_MANAGED</code> permission
     * type when creating a workspace in the CLI.
     * </p>
     * <p>
     * If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you are
     * creating this workspace in a member account of an organization that is not a delegated administrator account, and
     * you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must
     * choose <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * </p>
     * 
     * @return If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically
     *         creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services
     *         data sources and notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code>
     *         will not create the IAM role for you. The ability for the Amazon Managed Grafana to create the IAM role
     *         on behalf of the user is supported only in the Amazon Managed Grafana AWS console. Use only the
     *         <code>CUSTOMER_MANAGED</code> permission type when creating a workspace in the CLI. </p>
     *         <p>
     *         If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If
     *         you are creating this workspace in a member account of an organization that is not a delegated
     *         administrator account, and you want the workspace to access data sources in other Amazon Web Services
     *         accounts in the organization, you must choose <code>CUSTOMER_MANAGED</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *         Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * @see PermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * <p>
     * If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically creates
     * the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and
     * notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code> will not create the IAM
     * role for you. The ability for the Amazon Managed Grafana to create the IAM role on behalf of the user is
     * supported only in the Amazon Managed Grafana AWS console. Use only the <code>CUSTOMER_MANAGED</code> permission
     * type when creating a workspace in the CLI.
     * </p>
     * <p>
     * If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you are
     * creating this workspace in a member account of an organization that is not a delegated administrator account, and
     * you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must
     * choose <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * </p>
     * 
     * @param permissionType
     *        If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically
     *        creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services
     *        data sources and notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code>
     *        will not create the IAM role for you. The ability for the Amazon Managed Grafana to create the IAM role on
     *        behalf of the user is supported only in the Amazon Managed Grafana AWS console. Use only the
     *        <code>CUSTOMER_MANAGED</code> permission type when creating a workspace in the CLI. </p>
     *        <p>
     *        If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you
     *        are creating this workspace in a member account of an organization that is not a delegated administrator
     *        account, and you want the workspace to access data sources in other Amazon Web Services accounts in the
     *        organization, you must choose <code>CUSTOMER_MANAGED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public CreateWorkspaceRequest withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * <p>
     * If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically creates
     * the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and
     * notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code> will not create the IAM
     * role for you. The ability for the Amazon Managed Grafana to create the IAM role on behalf of the user is
     * supported only in the Amazon Managed Grafana AWS console. Use only the <code>CUSTOMER_MANAGED</code> permission
     * type when creating a workspace in the CLI.
     * </p>
     * <p>
     * If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you are
     * creating this workspace in a member account of an organization that is not a delegated administrator account, and
     * you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must
     * choose <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * </p>
     * 
     * @param permissionType
     *        If you specify <code>SERVICE_MANAGED</code> on AWS Grafana console, Amazon Managed Grafana automatically
     *        creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services
     *        data sources and notification channels. In the CLI mode, the permissionType <code>SERVICE_MANAGED</code>
     *        will not create the IAM role for you. The ability for the Amazon Managed Grafana to create the IAM role on
     *        behalf of the user is supported only in the Amazon Managed Grafana AWS console. Use only the
     *        <code>CUSTOMER_MANAGED</code> permission type when creating a workspace in the CLI. </p>
     *        <p>
     *        If you specify <code>CUSTOMER_MANAGED</code>, you will manage those roles and permissions yourself. If you
     *        are creating this workspace in a member account of an organization that is not a delegated administrator
     *        account, and you want the workspace to access data sources in other Amazon Web Services accounts in the
     *        organization, you must choose <code>CUSTOMER_MANAGED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public CreateWorkspaceRequest withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     * </p>
     * 
     * @param stackSetName
     *        The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     * </p>
     * 
     * @return The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     * </p>
     * 
     * @param stackSetName
     *        The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The list of tags associated with the workspace.
     * </p>
     * 
     * @return The list of tags associated with the workspace.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags associated with the workspace.
     * </p>
     * 
     * @param tags
     *        The list of tags associated with the workspace.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tags associated with the workspace.
     * </p>
     * 
     * @param tags
     *        The list of tags associated with the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkspaceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
     * </p>
     * 
     * @param vpcConfiguration
     *        The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to
     *        connect to.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
     * </p>
     * 
     * @return The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to
     *         connect to.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
     * </p>
     * 
     * @param vpcConfiguration
     *        The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to
     *        connect to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data
     * sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana
     * to read data from these sources. You must still add them as data sources in the Grafana console in the workspace.
     * </p>
     * <p>
     * If you don't specify a data source here, you can still add it as a data source in the workspace console later.
     * However, you will then have to manually configure permissions for it.
     * </p>
     * 
     * @return Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying
     *         these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *         Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the
     *         Grafana console in the workspace.</p>
     *         <p>
     *         If you don't specify a data source here, you can still add it as a data source in the workspace console
     *         later. However, you will then have to manually configure permissions for it.
     * @see DataSourceType
     */

    public java.util.List<String> getWorkspaceDataSources() {
        return workspaceDataSources;
    }

    /**
     * <p>
     * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data
     * sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana
     * to read data from these sources. You must still add them as data sources in the Grafana console in the workspace.
     * </p>
     * <p>
     * If you don't specify a data source here, you can still add it as a data source in the workspace console later.
     * However, you will then have to manually configure permissions for it.
     * </p>
     * 
     * @param workspaceDataSources
     *        Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the
     *        Grafana console in the workspace.</p>
     *        <p>
     *        If you don't specify a data source here, you can still add it as a data source in the workspace console
     *        later. However, you will then have to manually configure permissions for it.
     * @see DataSourceType
     */

    public void setWorkspaceDataSources(java.util.Collection<String> workspaceDataSources) {
        if (workspaceDataSources == null) {
            this.workspaceDataSources = null;
            return;
        }

        this.workspaceDataSources = new java.util.ArrayList<String>(workspaceDataSources);
    }

    /**
     * <p>
     * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data
     * sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana
     * to read data from these sources. You must still add them as data sources in the Grafana console in the workspace.
     * </p>
     * <p>
     * If you don't specify a data source here, you can still add it as a data source in the workspace console later.
     * However, you will then have to manually configure permissions for it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceDataSources(java.util.Collection)} or {@link #withWorkspaceDataSources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param workspaceDataSources
     *        Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the
     *        Grafana console in the workspace.</p>
     *        <p>
     *        If you don't specify a data source here, you can still add it as a data source in the workspace console
     *        later. However, you will then have to manually configure permissions for it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateWorkspaceRequest withWorkspaceDataSources(String... workspaceDataSources) {
        if (this.workspaceDataSources == null) {
            setWorkspaceDataSources(new java.util.ArrayList<String>(workspaceDataSources.length));
        }
        for (String ele : workspaceDataSources) {
            this.workspaceDataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data
     * sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana
     * to read data from these sources. You must still add them as data sources in the Grafana console in the workspace.
     * </p>
     * <p>
     * If you don't specify a data source here, you can still add it as a data source in the workspace console later.
     * However, you will then have to manually configure permissions for it.
     * </p>
     * 
     * @param workspaceDataSources
     *        Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the
     *        Grafana console in the workspace.</p>
     *        <p>
     *        If you don't specify a data source here, you can still add it as a data source in the workspace console
     *        later. However, you will then have to manually configure permissions for it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateWorkspaceRequest withWorkspaceDataSources(java.util.Collection<String> workspaceDataSources) {
        setWorkspaceDataSources(workspaceDataSources);
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data
     * sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana
     * to read data from these sources. You must still add them as data sources in the Grafana console in the workspace.
     * </p>
     * <p>
     * If you don't specify a data source here, you can still add it as a data source in the workspace console later.
     * However, you will then have to manually configure permissions for it.
     * </p>
     * 
     * @param workspaceDataSources
     *        Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the
     *        Grafana console in the workspace.</p>
     *        <p>
     *        If you don't specify a data source here, you can still add it as a data source in the workspace console
     *        later. However, you will then have to manually configure permissions for it.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateWorkspaceRequest withWorkspaceDataSources(DataSourceType... workspaceDataSources) {
        java.util.ArrayList<String> workspaceDataSourcesCopy = new java.util.ArrayList<String>(workspaceDataSources.length);
        for (DataSourceType value : workspaceDataSources) {
            workspaceDataSourcesCopy.add(value.toString());
        }
        if (getWorkspaceDataSources() == null) {
            setWorkspaceDataSources(workspaceDataSourcesCopy);
        } else {
            getWorkspaceDataSources().addAll(workspaceDataSourcesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     * <p>
     * Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     * </p>
     * 
     * @param workspaceDescription
     *        A description for the workspace. This is used only to help you identify this workspace.</p>
     *        <p>
     *        Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     */

    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }

    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     * <p>
     * Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     * </p>
     * 
     * @return A description for the workspace. This is used only to help you identify this workspace.</p>
     *         <p>
     *         Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     */

    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }

    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     * <p>
     * Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     * </p>
     * 
     * @param workspaceDescription
     *        A description for the workspace. This is used only to help you identify this workspace.</p>
     *        <p>
     *        Pattern: <code>^[\\p{L}\\p{Z}\\p{N}\\p{P}]{0,2048}$</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withWorkspaceDescription(String workspaceDescription) {
        setWorkspaceDescription(workspaceDescription);
        return this;
    }

    /**
     * <p>
     * The name for the workspace. It does not have to be unique.
     * </p>
     * 
     * @param workspaceName
     *        The name for the workspace. It does not have to be unique.
     */

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    /**
     * <p>
     * The name for the workspace. It does not have to be unique.
     * </p>
     * 
     * @return The name for the workspace. It does not have to be unique.
     */

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * <p>
     * The name for the workspace. It does not have to be unique.
     * </p>
     * 
     * @param workspaceName
     *        The name for the workspace. It does not have to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withWorkspaceName(String workspaceName) {
        setWorkspaceName(workspaceName);
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these
     * data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed
     * Grafana to use these channels.
     * </p>
     * 
     * @return Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying
     *         these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *         Amazon Managed Grafana to use these channels.
     * @see NotificationDestinationType
     */

    public java.util.List<String> getWorkspaceNotificationDestinations() {
        return workspaceNotificationDestinations;
    }

    /**
     * <p>
     * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these
     * data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed
     * Grafana to use these channels.
     * </p>
     * 
     * @param workspaceNotificationDestinations
     *        Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to use these channels.
     * @see NotificationDestinationType
     */

    public void setWorkspaceNotificationDestinations(java.util.Collection<String> workspaceNotificationDestinations) {
        if (workspaceNotificationDestinations == null) {
            this.workspaceNotificationDestinations = null;
            return;
        }

        this.workspaceNotificationDestinations = new java.util.ArrayList<String>(workspaceNotificationDestinations);
    }

    /**
     * <p>
     * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these
     * data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed
     * Grafana to use these channels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceNotificationDestinations(java.util.Collection)} or
     * {@link #withWorkspaceNotificationDestinations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param workspaceNotificationDestinations
     *        Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public CreateWorkspaceRequest withWorkspaceNotificationDestinations(String... workspaceNotificationDestinations) {
        if (this.workspaceNotificationDestinations == null) {
            setWorkspaceNotificationDestinations(new java.util.ArrayList<String>(workspaceNotificationDestinations.length));
        }
        for (String ele : workspaceNotificationDestinations) {
            this.workspaceNotificationDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these
     * data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed
     * Grafana to use these channels.
     * </p>
     * 
     * @param workspaceNotificationDestinations
     *        Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public CreateWorkspaceRequest withWorkspaceNotificationDestinations(java.util.Collection<String> workspaceNotificationDestinations) {
        setWorkspaceNotificationDestinations(workspaceNotificationDestinations);
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these
     * data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed
     * Grafana to use these channels.
     * </p>
     * 
     * @param workspaceNotificationDestinations
     *        Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying
     *        these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow
     *        Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public CreateWorkspaceRequest withWorkspaceNotificationDestinations(NotificationDestinationType... workspaceNotificationDestinations) {
        java.util.ArrayList<String> workspaceNotificationDestinationsCopy = new java.util.ArrayList<String>(workspaceNotificationDestinations.length);
        for (NotificationDestinationType value : workspaceNotificationDestinations) {
            workspaceNotificationDestinationsCopy.add(value.toString());
        }
        if (getWorkspaceNotificationDestinations() == null) {
            setWorkspaceNotificationDestinations(workspaceNotificationDestinationsCopy);
        } else {
            getWorkspaceNotificationDestinations().addAll(workspaceNotificationDestinationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * 
     * @return Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *         workspace is in an account that is part of an organization.
     */

    public java.util.List<String> getWorkspaceOrganizationalUnits() {
        return workspaceOrganizationalUnits;
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * 
     * @param workspaceOrganizationalUnits
     *        Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *        workspace is in an account that is part of an organization.
     */

    public void setWorkspaceOrganizationalUnits(java.util.Collection<String> workspaceOrganizationalUnits) {
        if (workspaceOrganizationalUnits == null) {
            this.workspaceOrganizationalUnits = null;
            return;
        }

        this.workspaceOrganizationalUnits = new java.util.ArrayList<String>(workspaceOrganizationalUnits);
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceOrganizationalUnits(java.util.Collection)} or
     * {@link #withWorkspaceOrganizationalUnits(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param workspaceOrganizationalUnits
     *        Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *        workspace is in an account that is part of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withWorkspaceOrganizationalUnits(String... workspaceOrganizationalUnits) {
        if (this.workspaceOrganizationalUnits == null) {
            setWorkspaceOrganizationalUnits(new java.util.ArrayList<String>(workspaceOrganizationalUnits.length));
        }
        for (String ele : workspaceOrganizationalUnits) {
            this.workspaceOrganizationalUnits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * 
     * @param workspaceOrganizationalUnits
     *        Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *        workspace is in an account that is part of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withWorkspaceOrganizationalUnits(java.util.Collection<String> workspaceOrganizationalUnits) {
        setWorkspaceOrganizationalUnits(workspaceOrganizationalUnits);
        return this;
    }

    /**
     * <p>
     * The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the workspace
     * will view data from. If you already have a role that you want to use, specify it here. The permission type should
     * be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param workspaceRoleArn
     *        The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the
     *        workspace will view data from. If you already have a role that you want to use, specify it here. The
     *        permission type should be set to <code>CUSTOMER_MANAGED</code>.
     */

    public void setWorkspaceRoleArn(String workspaceRoleArn) {
        this.workspaceRoleArn = workspaceRoleArn;
    }

    /**
     * <p>
     * The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the workspace
     * will view data from. If you already have a role that you want to use, specify it here. The permission type should
     * be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @return The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the
     *         workspace will view data from. If you already have a role that you want to use, specify it here. The
     *         permission type should be set to <code>CUSTOMER_MANAGED</code>.
     */

    public String getWorkspaceRoleArn() {
        return this.workspaceRoleArn;
    }

    /**
     * <p>
     * The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the workspace
     * will view data from. If you already have a role that you want to use, specify it here. The permission type should
     * be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param workspaceRoleArn
     *        The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the
     *        workspace will view data from. If you already have a role that you want to use, specify it here. The
     *        permission type should be set to <code>CUSTOMER_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withWorkspaceRoleArn(String workspaceRoleArn) {
        setWorkspaceRoleArn(workspaceRoleArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountAccessType() != null)
            sb.append("AccountAccessType: ").append(getAccountAccessType()).append(",");
        if (getAuthenticationProviders() != null)
            sb.append("AuthenticationProviders: ").append(getAuthenticationProviders()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getOrganizationRoleName() != null)
            sb.append("OrganizationRoleName: ").append("***Sensitive Data Redacted***").append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getWorkspaceDataSources() != null)
            sb.append("WorkspaceDataSources: ").append(getWorkspaceDataSources()).append(",");
        if (getWorkspaceDescription() != null)
            sb.append("WorkspaceDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getWorkspaceName() != null)
            sb.append("WorkspaceName: ").append("***Sensitive Data Redacted***").append(",");
        if (getWorkspaceNotificationDestinations() != null)
            sb.append("WorkspaceNotificationDestinations: ").append(getWorkspaceNotificationDestinations()).append(",");
        if (getWorkspaceOrganizationalUnits() != null)
            sb.append("WorkspaceOrganizationalUnits: ").append("***Sensitive Data Redacted***").append(",");
        if (getWorkspaceRoleArn() != null)
            sb.append("WorkspaceRoleArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspaceRequest == false)
            return false;
        CreateWorkspaceRequest other = (CreateWorkspaceRequest) obj;
        if (other.getAccountAccessType() == null ^ this.getAccountAccessType() == null)
            return false;
        if (other.getAccountAccessType() != null && other.getAccountAccessType().equals(this.getAccountAccessType()) == false)
            return false;
        if (other.getAuthenticationProviders() == null ^ this.getAuthenticationProviders() == null)
            return false;
        if (other.getAuthenticationProviders() != null && other.getAuthenticationProviders().equals(this.getAuthenticationProviders()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getOrganizationRoleName() == null ^ this.getOrganizationRoleName() == null)
            return false;
        if (other.getOrganizationRoleName() != null && other.getOrganizationRoleName().equals(this.getOrganizationRoleName()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getWorkspaceDataSources() == null ^ this.getWorkspaceDataSources() == null)
            return false;
        if (other.getWorkspaceDataSources() != null && other.getWorkspaceDataSources().equals(this.getWorkspaceDataSources()) == false)
            return false;
        if (other.getWorkspaceDescription() == null ^ this.getWorkspaceDescription() == null)
            return false;
        if (other.getWorkspaceDescription() != null && other.getWorkspaceDescription().equals(this.getWorkspaceDescription()) == false)
            return false;
        if (other.getWorkspaceName() == null ^ this.getWorkspaceName() == null)
            return false;
        if (other.getWorkspaceName() != null && other.getWorkspaceName().equals(this.getWorkspaceName()) == false)
            return false;
        if (other.getWorkspaceNotificationDestinations() == null ^ this.getWorkspaceNotificationDestinations() == null)
            return false;
        if (other.getWorkspaceNotificationDestinations() != null
                && other.getWorkspaceNotificationDestinations().equals(this.getWorkspaceNotificationDestinations()) == false)
            return false;
        if (other.getWorkspaceOrganizationalUnits() == null ^ this.getWorkspaceOrganizationalUnits() == null)
            return false;
        if (other.getWorkspaceOrganizationalUnits() != null && other.getWorkspaceOrganizationalUnits().equals(this.getWorkspaceOrganizationalUnits()) == false)
            return false;
        if (other.getWorkspaceRoleArn() == null ^ this.getWorkspaceRoleArn() == null)
            return false;
        if (other.getWorkspaceRoleArn() != null && other.getWorkspaceRoleArn().equals(this.getWorkspaceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountAccessType() == null) ? 0 : getAccountAccessType().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationProviders() == null) ? 0 : getAuthenticationProviders().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRoleName() == null) ? 0 : getOrganizationRoleName().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceDataSources() == null) ? 0 : getWorkspaceDataSources().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceDescription() == null) ? 0 : getWorkspaceDescription().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceName() == null) ? 0 : getWorkspaceName().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceNotificationDestinations() == null) ? 0 : getWorkspaceNotificationDestinations().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceOrganizationalUnits() == null) ? 0 : getWorkspaceOrganizationalUnits().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceRoleArn() == null) ? 0 : getWorkspaceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceRequest clone() {
        return (CreateWorkspaceRequest) super.clone();
    }

}
