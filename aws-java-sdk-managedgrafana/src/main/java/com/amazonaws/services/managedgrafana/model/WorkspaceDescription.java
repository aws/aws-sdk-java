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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about an Amazon Managed Grafana workspace in your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/WorkspaceDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code> parameter specifies which
     * organizational units the workspace can access.
     * </p>
     */
    private String accountAccessType;
    /**
     * <p>
     * A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     * authentication.
     * </p>
     */
    private AuthenticationSummary authentication;
    /**
     * <p>
     * The date that the workspace was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     * </p>
     * <p>
     * This list is only used when the workspace was created through the Amazon Web Services console, and the
     * <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * </p>
     */
    private java.util.List<String> dataSources;
    /**
     * <p>
     * The user-defined description of the workspace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL that users can use to access the Grafana console in the workspace.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     */
    private Boolean freeTrialConsumed;
    /**
     * <p>
     * If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when that
     * free trial ends.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     */
    private java.util.Date freeTrialExpiration;
    /**
     * <p>
     * The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     */
    private String grafanaToken;
    /**
     * <p>
     * The version of Grafana supported in this workspace.
     * </p>
     */
    private String grafanaVersion;
    /**
     * <p>
     * The unique ID of this workspace.
     * </p>
     */
    private String id;
    /**
     * <p>
     * If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services Marketplace, this
     * specifies when the license ends and will need to be renewed. Purchasing the Enterprise plugins option through
     * Amazon Managed Grafana does not have an expiration. It is valid until the license is removed.
     * </p>
     */
    private java.util.Date licenseExpiration;
    /**
     * <p>
     * Specifies whether this workspace has a full Grafana Enterprise license.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     */
    private String licenseType;
    /**
     * <p>
     * The most recent date that the workspace was modified.
     * </p>
     */
    private java.util.Date modified;
    /**
     * <p>
     * The name of the workspace.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     */
    private NetworkAccessConfiguration networkAccessControl;
    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, to allow Amazon Managed Grafana to use these channels.
     * </p>
     */
    private java.util.List<String> notificationDestinations;
    /**
     * <p>
     * The name of the IAM role that is used to access resources through Organizations.
     * </p>
     */
    private String organizationRoleName;
    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     */
    private java.util.List<String> organizationalUnits;
    /**
     * <p>
     * If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the
     * workspace needs to use Amazon Web Services data sources and notification channels.
     * </p>
     * <p>
     * If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     * </p>
     * <p>
     * If you are working with a workspace in a member account of an organization and that account is not a delegated
     * administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in
     * the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information about converting between customer and service managed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>. For more information about the roles and permissions
     * that must be managed for customer managed workspaces, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     */
    private String permissionType;
    /**
     * <p>
     * The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The current status of the workspace.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of tags associated with the workspace.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     * </p>
     */
    private VpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from.
     * This role must already exist.
     * </p>
     */
    private String workspaceRoleArn;

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code> parameter specifies which
     * organizational units the workspace can access.
     * </p>
     * 
     * @param accountAccessType
     *        Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *        account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *        organization. If this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code>
     *        parameter specifies which organizational units the workspace can access.
     * @see AccountAccessType
     */

    public void setAccountAccessType(String accountAccessType) {
        this.accountAccessType = accountAccessType;
    }

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code> parameter specifies which
     * organizational units the workspace can access.
     * </p>
     * 
     * @return Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *         account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *         organization. If this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code>
     *         parameter specifies which organizational units the workspace can access.
     * @see AccountAccessType
     */

    public String getAccountAccessType() {
        return this.accountAccessType;
    }

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code> parameter specifies which
     * organizational units the workspace can access.
     * </p>
     * 
     * @param accountAccessType
     *        Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *        account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *        organization. If this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code>
     *        parameter specifies which organizational units the workspace can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountAccessType
     */

    public WorkspaceDescription withAccountAccessType(String accountAccessType) {
        setAccountAccessType(accountAccessType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account
     * only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If
     * this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code> parameter specifies which
     * organizational units the workspace can access.
     * </p>
     * 
     * @param accountAccessType
     *        Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services
     *        account only, or whether it can also access Amazon Web Services resources in other accounts in the same
     *        organization. If this is <code>ORGANIZATION</code>, the <code>workspaceOrganizationalUnits</code>
     *        parameter specifies which organizational units the workspace can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountAccessType
     */

    public WorkspaceDescription withAccountAccessType(AccountAccessType accountAccessType) {
        this.accountAccessType = accountAccessType.toString();
        return this;
    }

    /**
     * <p>
     * A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     * authentication.
     * </p>
     * 
     * @param authentication
     *        A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     *        authentication.
     */

    public void setAuthentication(AuthenticationSummary authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     * authentication.
     * </p>
     * 
     * @return A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     *         authentication.
     */

    public AuthenticationSummary getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     * authentication.
     * </p>
     * 
     * @param authentication
     *        A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user
     *        authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withAuthentication(AuthenticationSummary authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * The date that the workspace was created.
     * </p>
     * 
     * @param created
     *        The date that the workspace was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date that the workspace was created.
     * </p>
     * 
     * @return The date that the workspace was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date that the workspace was created.
     * </p>
     * 
     * @param created
     *        The date that the workspace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     * </p>
     * <p>
     * This list is only used when the workspace was created through the Amazon Web Services console, and the
     * <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @return Specifies the Amazon Web Services data sources that have been configured to have IAM roles and
     *         permissions created to allow Amazon Managed Grafana to read data from these sources.</p>
     *         <p>
     *         This list is only used when the workspace was created through the Amazon Web Services console, and the
     *         <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * @see DataSourceType
     */

    public java.util.List<String> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     * </p>
     * <p>
     * This list is only used when the workspace was created through the Amazon Web Services console, and the
     * <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param dataSources
     *        Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     *        created to allow Amazon Managed Grafana to read data from these sources.</p>
     *        <p>
     *        This list is only used when the workspace was created through the Amazon Web Services console, and the
     *        <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * @see DataSourceType
     */

    public void setDataSources(java.util.Collection<String> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<String>(dataSources);
    }

    /**
     * <p>
     * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     * </p>
     * <p>
     * This list is only used when the workspace was created through the Amazon Web Services console, and the
     * <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     *        created to allow Amazon Managed Grafana to read data from these sources.</p>
     *        <p>
     *        This list is only used when the workspace was created through the Amazon Web Services console, and the
     *        <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public WorkspaceDescription withDataSources(String... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<String>(dataSources.length));
        }
        for (String ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     * </p>
     * <p>
     * This list is only used when the workspace was created through the Amazon Web Services console, and the
     * <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param dataSources
     *        Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     *        created to allow Amazon Managed Grafana to read data from these sources.</p>
     *        <p>
     *        This list is only used when the workspace was created through the Amazon Web Services console, and the
     *        <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public WorkspaceDescription withDataSources(java.util.Collection<String> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     * created to allow Amazon Managed Grafana to read data from these sources.
     * </p>
     * <p>
     * This list is only used when the workspace was created through the Amazon Web Services console, and the
     * <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param dataSources
     *        Specifies the Amazon Web Services data sources that have been configured to have IAM roles and permissions
     *        created to allow Amazon Managed Grafana to read data from these sources.</p>
     *        <p>
     *        This list is only used when the workspace was created through the Amazon Web Services console, and the
     *        <code>permissionType</code> is <code>SERVICE_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public WorkspaceDescription withDataSources(DataSourceType... dataSources) {
        java.util.ArrayList<String> dataSourcesCopy = new java.util.ArrayList<String>(dataSources.length);
        for (DataSourceType value : dataSources) {
            dataSourcesCopy.add(value.toString());
        }
        if (getDataSources() == null) {
            setDataSources(dataSourcesCopy);
        } else {
            getDataSources().addAll(dataSourcesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined description of the workspace.
     * </p>
     * 
     * @param description
     *        The user-defined description of the workspace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-defined description of the workspace.
     * </p>
     * 
     * @return The user-defined description of the workspace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-defined description of the workspace.
     * </p>
     * 
     * @param description
     *        The user-defined description of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL that users can use to access the Grafana console in the workspace.
     * </p>
     * 
     * @param endpoint
     *        The URL that users can use to access the Grafana console in the workspace.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The URL that users can use to access the Grafana console in the workspace.
     * </p>
     * 
     * @return The URL that users can use to access the Grafana console in the workspace.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The URL that users can use to access the Grafana console in the workspace.
     * </p>
     * 
     * @param endpoint
     *        The URL that users can use to access the Grafana console in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param freeTrialConsumed
     *        Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     */

    public void setFreeTrialConsumed(Boolean freeTrialConsumed) {
        this.freeTrialConsumed = freeTrialConsumed;
    }

    /**
     * <p>
     * Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @return Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.</p> <note>
     *         <p>
     *         Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *         </p>
     */

    public Boolean getFreeTrialConsumed() {
        return this.freeTrialConsumed;
    }

    /**
     * <p>
     * Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param freeTrialConsumed
     *        Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withFreeTrialConsumed(Boolean freeTrialConsumed) {
        setFreeTrialConsumed(freeTrialConsumed);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @return Specifies whether this workspace has already fully used its free trial for Grafana Enterprise.</p> <note>
     *         <p>
     *         Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *         </p>
     */

    public Boolean isFreeTrialConsumed() {
        return this.freeTrialConsumed;
    }

    /**
     * <p>
     * If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when that
     * free trial ends.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param freeTrialExpiration
     *        If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when
     *        that free trial ends.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     */

    public void setFreeTrialExpiration(java.util.Date freeTrialExpiration) {
        this.freeTrialExpiration = freeTrialExpiration;
    }

    /**
     * <p>
     * If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when that
     * free trial ends.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @return If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when
     *         that free trial ends.</p> <note>
     *         <p>
     *         Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *         </p>
     */

    public java.util.Date getFreeTrialExpiration() {
        return this.freeTrialExpiration;
    }

    /**
     * <p>
     * If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when that
     * free trial ends.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param freeTrialExpiration
     *        If this workspace is currently in the free trial period for Grafana Enterprise, this value specifies when
     *        that free trial ends.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withFreeTrialExpiration(java.util.Date freeTrialExpiration) {
        setFreeTrialExpiration(freeTrialExpiration);
        return this;
    }

    /**
     * <p>
     * The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     * 
     * @param grafanaToken
     *        The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     *        >Link your account with Grafana Labs</a>.
     */

    public void setGrafanaToken(String grafanaToken) {
        this.grafanaToken = grafanaToken;
    }

    /**
     * <p>
     * The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     * 
     * @return The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     *         "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     *         >Link your account with Grafana Labs</a>.
     */

    public String getGrafanaToken() {
        return this.grafanaToken;
    }

    /**
     * <p>
     * The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     * "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     * >Link your account with Grafana Labs</a>.
     * </p>
     * 
     * @param grafanaToken
     *        The token that ties this workspace to a Grafana Labs account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html#AMG-workspace-register-enterprise"
     *        >Link your account with Grafana Labs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withGrafanaToken(String grafanaToken) {
        setGrafanaToken(grafanaToken);
        return this;
    }

    /**
     * <p>
     * The version of Grafana supported in this workspace.
     * </p>
     * 
     * @param grafanaVersion
     *        The version of Grafana supported in this workspace.
     */

    public void setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
    }

    /**
     * <p>
     * The version of Grafana supported in this workspace.
     * </p>
     * 
     * @return The version of Grafana supported in this workspace.
     */

    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    /**
     * <p>
     * The version of Grafana supported in this workspace.
     * </p>
     * 
     * @param grafanaVersion
     *        The version of Grafana supported in this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withGrafanaVersion(String grafanaVersion) {
        setGrafanaVersion(grafanaVersion);
        return this;
    }

    /**
     * <p>
     * The unique ID of this workspace.
     * </p>
     * 
     * @param id
     *        The unique ID of this workspace.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of this workspace.
     * </p>
     * 
     * @return The unique ID of this workspace.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of this workspace.
     * </p>
     * 
     * @param id
     *        The unique ID of this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services Marketplace, this
     * specifies when the license ends and will need to be renewed. Purchasing the Enterprise plugins option through
     * Amazon Managed Grafana does not have an expiration. It is valid until the license is removed.
     * </p>
     * 
     * @param licenseExpiration
     *        If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services Marketplace,
     *        this specifies when the license ends and will need to be renewed. Purchasing the Enterprise plugins option
     *        through Amazon Managed Grafana does not have an expiration. It is valid until the license is removed.
     */

    public void setLicenseExpiration(java.util.Date licenseExpiration) {
        this.licenseExpiration = licenseExpiration;
    }

    /**
     * <p>
     * If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services Marketplace, this
     * specifies when the license ends and will need to be renewed. Purchasing the Enterprise plugins option through
     * Amazon Managed Grafana does not have an expiration. It is valid until the license is removed.
     * </p>
     * 
     * @return If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services
     *         Marketplace, this specifies when the license ends and will need to be renewed. Purchasing the Enterprise
     *         plugins option through Amazon Managed Grafana does not have an expiration. It is valid until the license
     *         is removed.
     */

    public java.util.Date getLicenseExpiration() {
        return this.licenseExpiration;
    }

    /**
     * <p>
     * If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services Marketplace, this
     * specifies when the license ends and will need to be renewed. Purchasing the Enterprise plugins option through
     * Amazon Managed Grafana does not have an expiration. It is valid until the license is removed.
     * </p>
     * 
     * @param licenseExpiration
     *        If this workspace has a full Grafana Enterprise license purchased through Amazon Web Services Marketplace,
     *        this specifies when the license ends and will need to be renewed. Purchasing the Enterprise plugins option
     *        through Amazon Managed Grafana does not have an expiration. It is valid until the license is removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withLicenseExpiration(java.util.Date licenseExpiration) {
        setLicenseExpiration(licenseExpiration);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace has a full Grafana Enterprise license.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param licenseType
     *        Specifies whether this workspace has a full Grafana Enterprise license.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * Specifies whether this workspace has a full Grafana Enterprise license.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @return Specifies whether this workspace has a full Grafana Enterprise license.</p> <note>
     *         <p>
     *         Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *         </p>
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * Specifies whether this workspace has a full Grafana Enterprise license.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param licenseType
     *        Specifies whether this workspace has a full Grafana Enterprise license.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public WorkspaceDescription withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * Specifies whether this workspace has a full Grafana Enterprise license.
     * </p>
     * <note>
     * <p>
     * Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     * </p>
     * </note>
     * 
     * @param licenseType
     *        Specifies whether this workspace has a full Grafana Enterprise license.</p> <note>
     *        <p>
     *        Amazon Managed Grafana workspaces no longer support Grafana Enterprise free trials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public WorkspaceDescription withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The most recent date that the workspace was modified.
     * </p>
     * 
     * @param modified
     *        The most recent date that the workspace was modified.
     */

    public void setModified(java.util.Date modified) {
        this.modified = modified;
    }

    /**
     * <p>
     * The most recent date that the workspace was modified.
     * </p>
     * 
     * @return The most recent date that the workspace was modified.
     */

    public java.util.Date getModified() {
        return this.modified;
    }

    /**
     * <p>
     * The most recent date that the workspace was modified.
     * </p>
     * 
     * @param modified
     *        The most recent date that the workspace was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withModified(java.util.Date modified) {
        setModified(modified);
        return this;
    }

    /**
     * <p>
     * The name of the workspace.
     * </p>
     * 
     * @param name
     *        The name of the workspace.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workspace.
     * </p>
     * 
     * @return The name of the workspace.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workspace.
     * </p>
     * 
     * @param name
     *        The name of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     * 
     * @param networkAccessControl
     *        The configuration settings for network access to your workspace.
     */

    public void setNetworkAccessControl(NetworkAccessConfiguration networkAccessControl) {
        this.networkAccessControl = networkAccessControl;
    }

    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     * 
     * @return The configuration settings for network access to your workspace.
     */

    public NetworkAccessConfiguration getNetworkAccessControl() {
        return this.networkAccessControl;
    }

    /**
     * <p>
     * The configuration settings for network access to your workspace.
     * </p>
     * 
     * @param networkAccessControl
     *        The configuration settings for network access to your workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withNetworkAccessControl(NetworkAccessConfiguration networkAccessControl) {
        setNetworkAccessControl(networkAccessControl);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, to allow Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @return The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *         roles and permissions for, to allow Amazon Managed Grafana to use these channels.
     * @see NotificationDestinationType
     */

    public java.util.List<String> getNotificationDestinations() {
        return notificationDestinations;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, to allow Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, to allow Amazon Managed Grafana to use these channels.
     * @see NotificationDestinationType
     */

    public void setNotificationDestinations(java.util.Collection<String> notificationDestinations) {
        if (notificationDestinations == null) {
            this.notificationDestinations = null;
            return;
        }

        this.notificationDestinations = new java.util.ArrayList<String>(notificationDestinations);
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, to allow Amazon Managed Grafana to use these channels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationDestinations(java.util.Collection)} or
     * {@link #withNotificationDestinations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, to allow Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public WorkspaceDescription withNotificationDestinations(String... notificationDestinations) {
        if (this.notificationDestinations == null) {
            setNotificationDestinations(new java.util.ArrayList<String>(notificationDestinations.length));
        }
        for (String ele : notificationDestinations) {
            this.notificationDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, to allow Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, to allow Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public WorkspaceDescription withNotificationDestinations(java.util.Collection<String> notificationDestinations) {
        setNotificationDestinations(notificationDestinations);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, to allow Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, to allow Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public WorkspaceDescription withNotificationDestinations(NotificationDestinationType... notificationDestinations) {
        java.util.ArrayList<String> notificationDestinationsCopy = new java.util.ArrayList<String>(notificationDestinations.length);
        for (NotificationDestinationType value : notificationDestinations) {
            notificationDestinationsCopy.add(value.toString());
        }
        if (getNotificationDestinations() == null) {
            setNotificationDestinations(notificationDestinationsCopy);
        } else {
            getNotificationDestinations().addAll(notificationDestinationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the IAM role that is used to access resources through Organizations.
     * </p>
     * 
     * @param organizationRoleName
     *        The name of the IAM role that is used to access resources through Organizations.
     */

    public void setOrganizationRoleName(String organizationRoleName) {
        this.organizationRoleName = organizationRoleName;
    }

    /**
     * <p>
     * The name of the IAM role that is used to access resources through Organizations.
     * </p>
     * 
     * @return The name of the IAM role that is used to access resources through Organizations.
     */

    public String getOrganizationRoleName() {
        return this.organizationRoleName;
    }

    /**
     * <p>
     * The name of the IAM role that is used to access resources through Organizations.
     * </p>
     * 
     * @param organizationRoleName
     *        The name of the IAM role that is used to access resources through Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withOrganizationRoleName(String organizationRoleName) {
        setOrganizationRoleName(organizationRoleName);
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

    public java.util.List<String> getOrganizationalUnits() {
        return organizationalUnits;
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * 
     * @param organizationalUnits
     *        Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *        workspace is in an account that is part of an organization.
     */

    public void setOrganizationalUnits(java.util.Collection<String> organizationalUnits) {
        if (organizationalUnits == null) {
            this.organizationalUnits = null;
            return;
        }

        this.organizationalUnits = new java.util.ArrayList<String>(organizationalUnits);
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnits(java.util.Collection)} or {@link #withOrganizationalUnits(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnits
     *        Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *        workspace is in an account that is part of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withOrganizationalUnits(String... organizationalUnits) {
        if (this.organizationalUnits == null) {
            setOrganizationalUnits(new java.util.ArrayList<String>(organizationalUnits.length));
        }
        for (String ele : organizationalUnits) {
            this.organizationalUnits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is
     * in an account that is part of an organization.
     * </p>
     * 
     * @param organizationalUnits
     *        Specifies the organizational units that this workspace is allowed to use data sources from, if this
     *        workspace is in an account that is part of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withOrganizationalUnits(java.util.Collection<String> organizationalUnits) {
        setOrganizationalUnits(organizationalUnits);
        return this;
    }

    /**
     * <p>
     * If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the
     * workspace needs to use Amazon Web Services data sources and notification channels.
     * </p>
     * <p>
     * If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     * </p>
     * <p>
     * If you are working with a workspace in a member account of an organization and that account is not a delegated
     * administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in
     * the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information about converting between customer and service managed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>. For more information about the roles and permissions
     * that must be managed for customer managed workspaces, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * 
     * @param permissionType
     *        If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     *        console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions
     *        that the workspace needs to use Amazon Web Services data sources and notification channels.</p>
     *        <p>
     *        If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     *        </p>
     *        <p>
     *        If you are working with a workspace in a member account of an organization and that account is not a
     *        delegated administrator account, and you want the workspace to access data sources in other Amazon Web
     *        Services accounts in the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     *        </p>
     *        <p>
     *        For more information about converting between customer and service managed, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *        permissions for data sources and notification channels</a>. For more information about the roles and
     *        permissions that must be managed for customer managed workspaces, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     * @see PermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the
     * workspace needs to use Amazon Web Services data sources and notification channels.
     * </p>
     * <p>
     * If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     * </p>
     * <p>
     * If you are working with a workspace in a member account of an organization and that account is not a delegated
     * administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in
     * the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information about converting between customer and service managed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>. For more information about the roles and permissions
     * that must be managed for customer managed workspaces, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * 
     * @return If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     *         console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions
     *         that the workspace needs to use Amazon Web Services data sources and notification channels.</p>
     *         <p>
     *         If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     *         </p>
     *         <p>
     *         If you are working with a workspace in a member account of an organization and that account is not a
     *         delegated administrator account, and you want the workspace to access data sources in other Amazon Web
     *         Services accounts in the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     *         </p>
     *         <p>
     *         For more information about converting between customer and service managed, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *         permissions for data sources and notification channels</a>. For more information about the roles and
     *         permissions that must be managed for customer managed workspaces, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *         Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     * @see PermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * <p>
     * If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the
     * workspace needs to use Amazon Web Services data sources and notification channels.
     * </p>
     * <p>
     * If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     * </p>
     * <p>
     * If you are working with a workspace in a member account of an organization and that account is not a delegated
     * administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in
     * the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information about converting between customer and service managed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>. For more information about the roles and permissions
     * that must be managed for customer managed workspaces, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * 
     * @param permissionType
     *        If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     *        console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions
     *        that the workspace needs to use Amazon Web Services data sources and notification channels.</p>
     *        <p>
     *        If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     *        </p>
     *        <p>
     *        If you are working with a workspace in a member account of an organization and that account is not a
     *        delegated administrator account, and you want the workspace to access data sources in other Amazon Web
     *        Services accounts in the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     *        </p>
     *        <p>
     *        For more information about converting between customer and service managed, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *        permissions for data sources and notification channels</a>. For more information about the roles and
     *        permissions that must be managed for customer managed workspaces, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public WorkspaceDescription withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * <p>
     * If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     * console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the
     * workspace needs to use Amazon Web Services data sources and notification channels.
     * </p>
     * <p>
     * If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     * </p>
     * <p>
     * If you are working with a workspace in a member account of an organization and that account is not a delegated
     * administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in
     * the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     * </p>
     * <p>
     * For more information about converting between customer and service managed, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     * permissions for data sources and notification channels</a>. For more information about the roles and permissions
     * that must be managed for customer managed workspaces, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed Grafana
     * permissions and policies for Amazon Web Services data sources and notification channels</a>
     * </p>
     * 
     * @param permissionType
     *        If this is <code>SERVICE_MANAGED</code>, and the workplace was created through the Amazon Managed Grafana
     *        console, then Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions
     *        that the workspace needs to use Amazon Web Services data sources and notification channels.</p>
     *        <p>
     *        If this is <code>CUSTOMER_MANAGED</code>, you must manage those roles and permissions yourself.
     *        </p>
     *        <p>
     *        If you are working with a workspace in a member account of an organization and that account is not a
     *        delegated administrator account, and you want the workspace to access data sources in other Amazon Web
     *        Services accounts in the organization, this parameter must be set to <code>CUSTOMER_MANAGED</code>.
     *        </p>
     *        <p>
     *        For more information about converting between customer and service managed, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-datasource-and-notification.html">Managing
     *        permissions for data sources and notification channels</a>. For more information about the roles and
     *        permissions that must be managed for customer managed workspaces, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-manage-permissions.html">Amazon Managed
     *        Grafana permissions and policies for Amazon Web Services data sources and notification channels</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public WorkspaceDescription withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
     * </p>
     * 
     * @param stackSetName
     *        The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
     * </p>
     * 
     * @return The name of the CloudFormation stack set that is used to generate IAM roles to be used for this
     *         workspace.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
     * </p>
     * 
     * @param stackSetName
     *        The name of the CloudFormation stack set that is used to generate IAM roles to be used for this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The current status of the workspace.
     * </p>
     * 
     * @param status
     *        The current status of the workspace.
     * @see WorkspaceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the workspace.
     * </p>
     * 
     * @return The current status of the workspace.
     * @see WorkspaceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the workspace.
     * </p>
     * 
     * @param status
     *        The current status of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceStatus
     */

    public WorkspaceDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the workspace.
     * </p>
     * 
     * @param status
     *        The current status of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceStatus
     */

    public WorkspaceDescription withStatus(WorkspaceStatus status) {
        this.status = status.toString();
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

    public WorkspaceDescription withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see WorkspaceDescription#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription addTagsEntry(String key, String value) {
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

    public WorkspaceDescription clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     * </p>
     * 
     * @param vpcConfiguration
     *        The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     * </p>
     * 
     * @return The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     * </p>
     * 
     * @param vpcConfiguration
     *        The configuration for connecting to data sources in a private VPC (Amazon Virtual Private Cloud).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from.
     * This role must already exist.
     * </p>
     * 
     * @param workspaceRoleArn
     *        The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view
     *        data from. This role must already exist.
     */

    public void setWorkspaceRoleArn(String workspaceRoleArn) {
        this.workspaceRoleArn = workspaceRoleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from.
     * This role must already exist.
     * </p>
     * 
     * @return The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view
     *         data from. This role must already exist.
     */

    public String getWorkspaceRoleArn() {
        return this.workspaceRoleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from.
     * This role must already exist.
     * </p>
     * 
     * @param workspaceRoleArn
     *        The IAM role that grants permissions to the Amazon Web Services resources that the workspace will view
     *        data from. This role must already exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceDescription withWorkspaceRoleArn(String workspaceRoleArn) {
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
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getFreeTrialConsumed() != null)
            sb.append("FreeTrialConsumed: ").append(getFreeTrialConsumed()).append(",");
        if (getFreeTrialExpiration() != null)
            sb.append("FreeTrialExpiration: ").append(getFreeTrialExpiration()).append(",");
        if (getGrafanaToken() != null)
            sb.append("GrafanaToken: ").append(getGrafanaToken()).append(",");
        if (getGrafanaVersion() != null)
            sb.append("GrafanaVersion: ").append(getGrafanaVersion()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLicenseExpiration() != null)
            sb.append("LicenseExpiration: ").append(getLicenseExpiration()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getModified() != null)
            sb.append("Modified: ").append(getModified()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getNetworkAccessControl() != null)
            sb.append("NetworkAccessControl: ").append(getNetworkAccessControl()).append(",");
        if (getNotificationDestinations() != null)
            sb.append("NotificationDestinations: ").append(getNotificationDestinations()).append(",");
        if (getOrganizationRoleName() != null)
            sb.append("OrganizationRoleName: ").append("***Sensitive Data Redacted***").append(",");
        if (getOrganizationalUnits() != null)
            sb.append("OrganizationalUnits: ").append("***Sensitive Data Redacted***").append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
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

        if (obj instanceof WorkspaceDescription == false)
            return false;
        WorkspaceDescription other = (WorkspaceDescription) obj;
        if (other.getAccountAccessType() == null ^ this.getAccountAccessType() == null)
            return false;
        if (other.getAccountAccessType() != null && other.getAccountAccessType().equals(this.getAccountAccessType()) == false)
            return false;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getFreeTrialConsumed() == null ^ this.getFreeTrialConsumed() == null)
            return false;
        if (other.getFreeTrialConsumed() != null && other.getFreeTrialConsumed().equals(this.getFreeTrialConsumed()) == false)
            return false;
        if (other.getFreeTrialExpiration() == null ^ this.getFreeTrialExpiration() == null)
            return false;
        if (other.getFreeTrialExpiration() != null && other.getFreeTrialExpiration().equals(this.getFreeTrialExpiration()) == false)
            return false;
        if (other.getGrafanaToken() == null ^ this.getGrafanaToken() == null)
            return false;
        if (other.getGrafanaToken() != null && other.getGrafanaToken().equals(this.getGrafanaToken()) == false)
            return false;
        if (other.getGrafanaVersion() == null ^ this.getGrafanaVersion() == null)
            return false;
        if (other.getGrafanaVersion() != null && other.getGrafanaVersion().equals(this.getGrafanaVersion()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLicenseExpiration() == null ^ this.getLicenseExpiration() == null)
            return false;
        if (other.getLicenseExpiration() != null && other.getLicenseExpiration().equals(this.getLicenseExpiration()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getModified() == null ^ this.getModified() == null)
            return false;
        if (other.getModified() != null && other.getModified().equals(this.getModified()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkAccessControl() == null ^ this.getNetworkAccessControl() == null)
            return false;
        if (other.getNetworkAccessControl() != null && other.getNetworkAccessControl().equals(this.getNetworkAccessControl()) == false)
            return false;
        if (other.getNotificationDestinations() == null ^ this.getNotificationDestinations() == null)
            return false;
        if (other.getNotificationDestinations() != null && other.getNotificationDestinations().equals(this.getNotificationDestinations()) == false)
            return false;
        if (other.getOrganizationRoleName() == null ^ this.getOrganizationRoleName() == null)
            return false;
        if (other.getOrganizationRoleName() != null && other.getOrganizationRoleName().equals(this.getOrganizationRoleName()) == false)
            return false;
        if (other.getOrganizationalUnits() == null ^ this.getOrganizationalUnits() == null)
            return false;
        if (other.getOrganizationalUnits() != null && other.getOrganizationalUnits().equals(this.getOrganizationalUnits()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getFreeTrialConsumed() == null) ? 0 : getFreeTrialConsumed().hashCode());
        hashCode = prime * hashCode + ((getFreeTrialExpiration() == null) ? 0 : getFreeTrialExpiration().hashCode());
        hashCode = prime * hashCode + ((getGrafanaToken() == null) ? 0 : getGrafanaToken().hashCode());
        hashCode = prime * hashCode + ((getGrafanaVersion() == null) ? 0 : getGrafanaVersion().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLicenseExpiration() == null) ? 0 : getLicenseExpiration().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getModified() == null) ? 0 : getModified().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkAccessControl() == null) ? 0 : getNetworkAccessControl().hashCode());
        hashCode = prime * hashCode + ((getNotificationDestinations() == null) ? 0 : getNotificationDestinations().hashCode());
        hashCode = prime * hashCode + ((getOrganizationRoleName() == null) ? 0 : getOrganizationRoleName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnits() == null) ? 0 : getOrganizationalUnits().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceRoleArn() == null) ? 0 : getWorkspaceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceDescription clone() {
        try {
            return (WorkspaceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.WorkspaceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
