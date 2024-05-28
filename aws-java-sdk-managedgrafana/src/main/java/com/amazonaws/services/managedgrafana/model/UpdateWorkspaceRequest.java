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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkspaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The configuration settings for network access to your workspace.
     * </p>
     * <p>
     * When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace.
     * Standard Grafana authentication and authorization will still be required.
     * </p>
     * <p>
     * If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed. Standard
     * Grafana authentication and authorization will still be required.
     * </p>
     */
    private NetworkAccessConfiguration networkAccessControl;
    /**
     * <p>
     * The name of an IAM role that already exists to use to access resources through Organizations. This can only be
     * used with a workspace that has the <code>permissionType</code> set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     */
    private String organizationRoleName;
    /**
     * <p>
     * Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     * <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     * datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     * organization, and that account is not a delegated administrator account, and you want the workspace to access
     * data sources in other Amazon Web Services accounts in the organization, you must choose
     * <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a <code>workspaceRoleArn</code> that
     * the workspace will use for accessing Amazon Web Services resources.
     * </p>
     * <p>
     * For more information on the role and permissions needed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * <note>
     * <p>
     * Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do not
     * include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     * Managed Grafana console. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>.
     * </p>
     * </note>
     */
    private String permissionType;
    /**
     * <p>
     * Whether to remove the network access configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an error.
     * </p>
     * <p>
     * If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC endpoints
     * will be allowed. Standard Grafana authentication and authorization will still be required.
     * </p>
     */
    private Boolean removeNetworkAccessConfiguration;
    /**
     * <p>
     * Whether to remove the VPC configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an error.
     * </p>
     */
    private Boolean removeVpcConfiguration;
    /**
     * <p>
     * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;
    /**
     * <p>
     * This parameter is for internal use only, and should not be used.
     * </p>
     */
    private java.util.List<String> workspaceDataSources;
    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     */
    private String workspaceDescription;
    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * A new name for the workspace to update.
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
     * Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace accesses, such
     * as data sources and notification channels. If this workspace has <code>permissionType</code>
     * <code>CUSTOMER_MANAGED</code>, then this role is required.
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

    public UpdateWorkspaceRequest withAccountAccessType(String accountAccessType) {
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

    public UpdateWorkspaceRequest withAccountAccessType(AccountAccessType accountAccessType) {
        this.accountAccessType = accountAccessType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     * <p>
     * When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace.
     * Standard Grafana authentication and authorization will still be required.
     * </p>
     * <p>
     * If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed. Standard
     * Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @param networkAccessControl
     *        The configuration settings for network access to your workspace.</p>
     *        <p>
     *        When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace.
     *        Standard Grafana authentication and authorization will still be required.
     *        </p>
     *        <p>
     *        If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed.
     *        Standard Grafana authentication and authorization will still be required.
     */

    public void setNetworkAccessControl(NetworkAccessConfiguration networkAccessControl) {
        this.networkAccessControl = networkAccessControl;
    }

    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     * <p>
     * When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace.
     * Standard Grafana authentication and authorization will still be required.
     * </p>
     * <p>
     * If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed. Standard
     * Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @return The configuration settings for network access to your workspace.</p>
     *         <p>
     *         When this is configured, only listed IP addresses and VPC endpoints will be able to access your
     *         workspace. Standard Grafana authentication and authorization will still be required.
     *         </p>
     *         <p>
     *         If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed.
     *         Standard Grafana authentication and authorization will still be required.
     */

    public NetworkAccessConfiguration getNetworkAccessControl() {
        return this.networkAccessControl;
    }

    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     * <p>
     * When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace.
     * Standard Grafana authentication and authorization will still be required.
     * </p>
     * <p>
     * If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed. Standard
     * Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @param networkAccessControl
     *        The configuration settings for network access to your workspace.</p>
     *        <p>
     *        When this is configured, only listed IP addresses and VPC endpoints will be able to access your workspace.
     *        Standard Grafana authentication and authorization will still be required.
     *        </p>
     *        <p>
     *        If this is not configured, or is removed, then all IP addresses and VPC endpoints will be allowed.
     *        Standard Grafana authentication and authorization will still be required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withNetworkAccessControl(NetworkAccessConfiguration networkAccessControl) {
        setNetworkAccessControl(networkAccessControl);
        return this;
    }

    /**
     * <p>
     * The name of an IAM role that already exists to use to access resources through Organizations. This can only be
     * used with a workspace that has the <code>permissionType</code> set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param organizationRoleName
     *        The name of an IAM role that already exists to use to access resources through Organizations. This can
     *        only be used with a workspace that has the <code>permissionType</code> set to
     *        <code>CUSTOMER_MANAGED</code>.
     */

    public void setOrganizationRoleName(String organizationRoleName) {
        this.organizationRoleName = organizationRoleName;
    }

    /**
     * <p>
     * The name of an IAM role that already exists to use to access resources through Organizations. This can only be
     * used with a workspace that has the <code>permissionType</code> set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @return The name of an IAM role that already exists to use to access resources through Organizations. This can
     *         only be used with a workspace that has the <code>permissionType</code> set to
     *         <code>CUSTOMER_MANAGED</code>.
     */

    public String getOrganizationRoleName() {
        return this.organizationRoleName;
    }

    /**
     * <p>
     * The name of an IAM role that already exists to use to access resources through Organizations. This can only be
     * used with a workspace that has the <code>permissionType</code> set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * 
     * @param organizationRoleName
     *        The name of an IAM role that already exists to use to access resources through Organizations. This can
     *        only be used with a workspace that has the <code>permissionType</code> set to
     *        <code>CUSTOMER_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withOrganizationRoleName(String organizationRoleName) {
        setOrganizationRoleName(organizationRoleName);
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     * <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     * datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     * organization, and that account is not a delegated administrator account, and you want the workspace to access
     * data sources in other Amazon Web Services accounts in the organization, you must choose
     * <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a <code>workspaceRoleArn</code> that
     * the workspace will use for accessing Amazon Web Services resources.
     * </p>
     * <p>
     * For more information on the role and permissions needed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * <note>
     * <p>
     * Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do not
     * include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     * Managed Grafana console. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>.
     * </p>
     * </note>
     * 
     * @param permissionType
     *        Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     *        <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     *        datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     *        organization, and that account is not a delegated administrator account, and you want the workspace to
     *        access data sources in other Amazon Web Services accounts in the organization, you must choose
     *        <code>CUSTOMER_MANAGED</code>.</p>
     *        <p>
     *        If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a
     *        <code>workspaceRoleArn</code> that the workspace will use for accessing Amazon Web Services resources.
     *        </p>
     *        <p>
     *        For more information on the role and permissions needed, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     *        </p>
     *        <note>
     *        <p>
     *        Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do
     *        not include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     *        </p>
     *        <p>
     *        You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     *        Managed Grafana console. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *        permissions for data sources and notification channels</a>.
     *        </p>
     * @see PermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     * <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     * datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     * organization, and that account is not a delegated administrator account, and you want the workspace to access
     * data sources in other Amazon Web Services accounts in the organization, you must choose
     * <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a <code>workspaceRoleArn</code> that
     * the workspace will use for accessing Amazon Web Services resources.
     * </p>
     * <p>
     * For more information on the role and permissions needed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * <note>
     * <p>
     * Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do not
     * include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     * Managed Grafana console. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>.
     * </p>
     * </note>
     * 
     * @return Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     *         <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to
     *         access datasources and notification channels. If the workspace is in a member Amazon Web Services account
     *         of an organization, and that account is not a delegated administrator account, and you want the workspace
     *         to access data sources in other Amazon Web Services accounts in the organization, you must choose
     *         <code>CUSTOMER_MANAGED</code>.</p>
     *         <p>
     *         If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a
     *         <code>workspaceRoleArn</code> that the workspace will use for accessing Amazon Web Services resources.
     *         </p>
     *         <p>
     *         For more information on the role and permissions needed, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *         Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     *         </p>
     *         <note>
     *         <p>
     *         Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do
     *         not include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     *         </p>
     *         <p>
     *         You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the
     *         Amazon Managed Grafana console. For more information, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *         permissions for data sources and notification channels</a>.
     *         </p>
     * @see PermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * <p>
     * Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     * <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     * datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     * organization, and that account is not a delegated administrator account, and you want the workspace to access
     * data sources in other Amazon Web Services accounts in the organization, you must choose
     * <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a <code>workspaceRoleArn</code> that
     * the workspace will use for accessing Amazon Web Services resources.
     * </p>
     * <p>
     * For more information on the role and permissions needed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * <note>
     * <p>
     * Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do not
     * include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     * Managed Grafana console. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>.
     * </p>
     * </note>
     * 
     * @param permissionType
     *        Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     *        <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     *        datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     *        organization, and that account is not a delegated administrator account, and you want the workspace to
     *        access data sources in other Amazon Web Services accounts in the organization, you must choose
     *        <code>CUSTOMER_MANAGED</code>.</p>
     *        <p>
     *        If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a
     *        <code>workspaceRoleArn</code> that the workspace will use for accessing Amazon Web Services resources.
     *        </p>
     *        <p>
     *        For more information on the role and permissions needed, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     *        </p>
     *        <note>
     *        <p>
     *        Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do
     *        not include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     *        </p>
     *        <p>
     *        You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     *        Managed Grafana console. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *        permissions for data sources and notification channels</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public UpdateWorkspaceRequest withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     * <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     * datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     * organization, and that account is not a delegated administrator account, and you want the workspace to access
     * data sources in other Amazon Web Services accounts in the organization, you must choose
     * <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a <code>workspaceRoleArn</code> that
     * the workspace will use for accessing Amazon Web Services resources.
     * </p>
     * <p>
     * For more information on the role and permissions needed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * <note>
     * <p>
     * Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do not
     * include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     * Managed Grafana console. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>.
     * </p>
     * </note>
     * 
     * @param permissionType
     *        Use this parameter if you want to change a workspace from <code>SERVICE_MANAGED</code> to
     *        <code>CUSTOMER_MANAGED</code>. This allows you to manage the permissions that the workspace uses to access
     *        datasources and notification channels. If the workspace is in a member Amazon Web Services account of an
     *        organization, and that account is not a delegated administrator account, and you want the workspace to
     *        access data sources in other Amazon Web Services accounts in the organization, you must choose
     *        <code>CUSTOMER_MANAGED</code>.</p>
     *        <p>
     *        If you specify this as <code>CUSTOMER_MANAGED</code>, you must also specify a
     *        <code>workspaceRoleArn</code> that the workspace will use for accessing Amazon Web Services resources.
     *        </p>
     *        <p>
     *        For more information on the role and permissions needed, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     *        </p>
     *        <note>
     *        <p>
     *        Do not use this to convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code>. Do
     *        not include this parameter if you want to leave the workspace as <code>SERVICE_MANAGED</code>.
     *        </p>
     *        <p>
     *        You can convert a <code>CUSTOMER_MANAGED</code> workspace to <code>SERVICE_MANAGED</code> using the Amazon
     *        Managed Grafana console. For more information, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *        permissions for data sources and notification channels</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public UpdateWorkspaceRequest withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to remove the network access configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an error.
     * </p>
     * <p>
     * If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC endpoints
     * will be allowed. Standard Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @param removeNetworkAccessConfiguration
     *        Whether to remove the network access configuration from the workspace.</p>
     *        <p>
     *        Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an
     *        error.
     *        </p>
     *        <p>
     *        If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC
     *        endpoints will be allowed. Standard Grafana authentication and authorization will still be required.
     */

    public void setRemoveNetworkAccessConfiguration(Boolean removeNetworkAccessConfiguration) {
        this.removeNetworkAccessConfiguration = removeNetworkAccessConfiguration;
    }

    /**
     * <p>
     * Whether to remove the network access configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an error.
     * </p>
     * <p>
     * If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC endpoints
     * will be allowed. Standard Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @return Whether to remove the network access configuration from the workspace.</p>
     *         <p>
     *         Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an
     *         error.
     *         </p>
     *         <p>
     *         If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC
     *         endpoints will be allowed. Standard Grafana authentication and authorization will still be required.
     */

    public Boolean getRemoveNetworkAccessConfiguration() {
        return this.removeNetworkAccessConfiguration;
    }

    /**
     * <p>
     * Whether to remove the network access configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an error.
     * </p>
     * <p>
     * If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC endpoints
     * will be allowed. Standard Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @param removeNetworkAccessConfiguration
     *        Whether to remove the network access configuration from the workspace.</p>
     *        <p>
     *        Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an
     *        error.
     *        </p>
     *        <p>
     *        If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC
     *        endpoints will be allowed. Standard Grafana authentication and authorization will still be required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withRemoveNetworkAccessConfiguration(Boolean removeNetworkAccessConfiguration) {
        setRemoveNetworkAccessConfiguration(removeNetworkAccessConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether to remove the network access configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an error.
     * </p>
     * <p>
     * If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC endpoints
     * will be allowed. Standard Grafana authentication and authorization will still be required.
     * </p>
     * 
     * @return Whether to remove the network access configuration from the workspace.</p>
     *         <p>
     *         Setting this to <code>true</code> and providing a <code>networkAccessControl</code> to set will return an
     *         error.
     *         </p>
     *         <p>
     *         If you remove this configuration by setting this to <code>true</code>, then all IP addresses and VPC
     *         endpoints will be allowed. Standard Grafana authentication and authorization will still be required.
     */

    public Boolean isRemoveNetworkAccessConfiguration() {
        return this.removeNetworkAccessConfiguration;
    }

    /**
     * <p>
     * Whether to remove the VPC configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an error.
     * </p>
     * 
     * @param removeVpcConfiguration
     *        Whether to remove the VPC configuration from the workspace.</p>
     *        <p>
     *        Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an
     *        error.
     */

    public void setRemoveVpcConfiguration(Boolean removeVpcConfiguration) {
        this.removeVpcConfiguration = removeVpcConfiguration;
    }

    /**
     * <p>
     * Whether to remove the VPC configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an error.
     * </p>
     * 
     * @return Whether to remove the VPC configuration from the workspace.</p>
     *         <p>
     *         Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an
     *         error.
     */

    public Boolean getRemoveVpcConfiguration() {
        return this.removeVpcConfiguration;
    }

    /**
     * <p>
     * Whether to remove the VPC configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an error.
     * </p>
     * 
     * @param removeVpcConfiguration
     *        Whether to remove the VPC configuration from the workspace.</p>
     *        <p>
     *        Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withRemoveVpcConfiguration(Boolean removeVpcConfiguration) {
        setRemoveVpcConfiguration(removeVpcConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether to remove the VPC configuration from the workspace.
     * </p>
     * <p>
     * Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an error.
     * </p>
     * 
     * @return Whether to remove the VPC configuration from the workspace.</p>
     *         <p>
     *         Setting this to <code>true</code> and providing a <code>vpcConfiguration</code> to set will return an
     *         error.
     */

    public Boolean isRemoveVpcConfiguration() {
        return this.removeVpcConfiguration;
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

    public UpdateWorkspaceRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
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

    public UpdateWorkspaceRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * This parameter is for internal use only, and should not be used.
     * </p>
     * 
     * @return This parameter is for internal use only, and should not be used.
     * @see DataSourceType
     */

    public java.util.List<String> getWorkspaceDataSources() {
        return workspaceDataSources;
    }

    /**
     * <p>
     * This parameter is for internal use only, and should not be used.
     * </p>
     * 
     * @param workspaceDataSources
     *        This parameter is for internal use only, and should not be used.
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
     * This parameter is for internal use only, and should not be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceDataSources(java.util.Collection)} or {@link #withWorkspaceDataSources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param workspaceDataSources
     *        This parameter is for internal use only, and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public UpdateWorkspaceRequest withWorkspaceDataSources(String... workspaceDataSources) {
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
     * This parameter is for internal use only, and should not be used.
     * </p>
     * 
     * @param workspaceDataSources
     *        This parameter is for internal use only, and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public UpdateWorkspaceRequest withWorkspaceDataSources(java.util.Collection<String> workspaceDataSources) {
        setWorkspaceDataSources(workspaceDataSources);
        return this;
    }

    /**
     * <p>
     * This parameter is for internal use only, and should not be used.
     * </p>
     * 
     * @param workspaceDataSources
     *        This parameter is for internal use only, and should not be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public UpdateWorkspaceRequest withWorkspaceDataSources(DataSourceType... workspaceDataSources) {
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
     * 
     * @param workspaceDescription
     *        A description for the workspace. This is used only to help you identify this workspace.
     */

    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }

    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     * 
     * @return A description for the workspace. This is used only to help you identify this workspace.
     */

    public String getWorkspaceDescription() {
        return this.workspaceDescription;
    }

    /**
     * <p>
     * A description for the workspace. This is used only to help you identify this workspace.
     * </p>
     * 
     * @param workspaceDescription
     *        A description for the workspace. This is used only to help you identify this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withWorkspaceDescription(String workspaceDescription) {
        setWorkspaceDescription(workspaceDescription);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @return The ID of the workspace to update.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * A new name for the workspace to update.
     * </p>
     * 
     * @param workspaceName
     *        A new name for the workspace to update.
     */

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    /**
     * <p>
     * A new name for the workspace to update.
     * </p>
     * 
     * @return A new name for the workspace to update.
     */

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * <p>
     * A new name for the workspace to update.
     * </p>
     * 
     * @param workspaceName
     *        A new name for the workspace to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withWorkspaceName(String workspaceName) {
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

    public UpdateWorkspaceRequest withWorkspaceNotificationDestinations(String... workspaceNotificationDestinations) {
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

    public UpdateWorkspaceRequest withWorkspaceNotificationDestinations(java.util.Collection<String> workspaceNotificationDestinations) {
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

    public UpdateWorkspaceRequest withWorkspaceNotificationDestinations(NotificationDestinationType... workspaceNotificationDestinations) {
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

    public UpdateWorkspaceRequest withWorkspaceOrganizationalUnits(String... workspaceOrganizationalUnits) {
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

    public UpdateWorkspaceRequest withWorkspaceOrganizationalUnits(java.util.Collection<String> workspaceOrganizationalUnits) {
        setWorkspaceOrganizationalUnits(workspaceOrganizationalUnits);
        return this;
    }

    /**
     * <p>
     * Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace accesses, such
     * as data sources and notification channels. If this workspace has <code>permissionType</code>
     * <code>CUSTOMER_MANAGED</code>, then this role is required.
     * </p>
     * 
     * @param workspaceRoleArn
     *        Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace
     *        accesses, such as data sources and notification channels. If this workspace has
     *        <code>permissionType</code> <code>CUSTOMER_MANAGED</code>, then this role is required.
     */

    public void setWorkspaceRoleArn(String workspaceRoleArn) {
        this.workspaceRoleArn = workspaceRoleArn;
    }

    /**
     * <p>
     * Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace accesses, such
     * as data sources and notification channels. If this workspace has <code>permissionType</code>
     * <code>CUSTOMER_MANAGED</code>, then this role is required.
     * </p>
     * 
     * @return Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace
     *         accesses, such as data sources and notification channels. If this workspace has
     *         <code>permissionType</code> <code>CUSTOMER_MANAGED</code>, then this role is required.
     */

    public String getWorkspaceRoleArn() {
        return this.workspaceRoleArn;
    }

    /**
     * <p>
     * Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace accesses, such
     * as data sources and notification channels. If this workspace has <code>permissionType</code>
     * <code>CUSTOMER_MANAGED</code>, then this role is required.
     * </p>
     * 
     * @param workspaceRoleArn
     *        Specifies an IAM role that grants permissions to Amazon Web Services resources that the workspace
     *        accesses, such as data sources and notification channels. If this workspace has
     *        <code>permissionType</code> <code>CUSTOMER_MANAGED</code>, then this role is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkspaceRequest withWorkspaceRoleArn(String workspaceRoleArn) {
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
        if (getNetworkAccessControl() != null)
            sb.append("NetworkAccessControl: ").append(getNetworkAccessControl()).append(",");
        if (getOrganizationRoleName() != null)
            sb.append("OrganizationRoleName: ").append("***Sensitive Data Redacted***").append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getRemoveNetworkAccessConfiguration() != null)
            sb.append("RemoveNetworkAccessConfiguration: ").append(getRemoveNetworkAccessConfiguration()).append(",");
        if (getRemoveVpcConfiguration() != null)
            sb.append("RemoveVpcConfiguration: ").append(getRemoveVpcConfiguration()).append(",");
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getWorkspaceDataSources() != null)
            sb.append("WorkspaceDataSources: ").append(getWorkspaceDataSources()).append(",");
        if (getWorkspaceDescription() != null)
            sb.append("WorkspaceDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
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

        if (obj instanceof UpdateWorkspaceRequest == false)
            return false;
        UpdateWorkspaceRequest other = (UpdateWorkspaceRequest) obj;
        if (other.getAccountAccessType() == null ^ this.getAccountAccessType() == null)
            return false;
        if (other.getAccountAccessType() != null && other.getAccountAccessType().equals(this.getAccountAccessType()) == false)
            return false;
        if (other.getNetworkAccessControl() == null ^ this.getNetworkAccessControl() == null)
            return false;
        if (other.getNetworkAccessControl() != null && other.getNetworkAccessControl().equals(this.getNetworkAccessControl()) == false)
            return false;
        if (other.getOrganizationRoleName() == null ^ this.getOrganizationRoleName() == null)
            return false;
        if (other.getOrganizationRoleName() != null && other.getOrganizationRoleName().equals(this.getOrganizationRoleName()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getRemoveNetworkAccessConfiguration() == null ^ this.getRemoveNetworkAccessConfiguration() == null)
            return false;
        if (other.getRemoveNetworkAccessConfiguration() != null
                && other.getRemoveNetworkAccessConfiguration().equals(this.getRemoveNetworkAccessConfiguration()) == false)
            return false;
        if (other.getRemoveVpcConfiguration() == null ^ this.getRemoveVpcConfiguration() == null)
            return false;
        if (other.getRemoveVpcConfiguration() != null && other.getRemoveVpcConfiguration().equals(this.getRemoveVpcConfiguration()) == false)
            return false;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
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
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
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
        hashCode = prime * hashCode + ((getNetworkAccessControl() == null) ? 0 : getNetworkAccessControl().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRoleName() == null) ? 0 : getOrganizationRoleName().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getRemoveNetworkAccessConfiguration() == null) ? 0 : getRemoveNetworkAccessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRemoveVpcConfiguration() == null) ? 0 : getRemoveVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceDataSources() == null) ? 0 : getWorkspaceDataSources().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceDescription() == null) ? 0 : getWorkspaceDescription().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceName() == null) ? 0 : getWorkspaceName().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceNotificationDestinations() == null) ? 0 : getWorkspaceNotificationDestinations().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceOrganizationalUnits() == null) ? 0 : getWorkspaceOrganizationalUnits().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceRoleArn() == null) ? 0 : getWorkspaceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkspaceRequest clone() {
        return (UpdateWorkspaceRequest) super.clone();
    }

}
