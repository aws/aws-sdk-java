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
 * A structure that contains some information about one workspace in the account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/WorkspaceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
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
     * The customer-entered description of the workspace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL endpoint to use to access the Grafana console in the workspace.
     * </p>
     */
    private String endpoint;
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
     * The Grafana version that the workspace is running.
     * </p>
     */
    private String grafanaVersion;
    /**
     * <p>
     * The unique ID of the workspace.
     * </p>
     */
    private String id;
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
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, which allows Amazon Managed Grafana to use these channels.
     * </p>
     */
    private java.util.List<String> notificationDestinations;
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
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     * 
     * @param authentication
     *        A structure containing information about the authentication methods used in the workspace.
     */

    public void setAuthentication(AuthenticationSummary authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     * 
     * @return A structure containing information about the authentication methods used in the workspace.
     */

    public AuthenticationSummary getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * A structure containing information about the authentication methods used in the workspace.
     * </p>
     * 
     * @param authentication
     *        A structure containing information about the authentication methods used in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withAuthentication(AuthenticationSummary authentication) {
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

    public WorkspaceSummary withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The customer-entered description of the workspace.
     * </p>
     * 
     * @param description
     *        The customer-entered description of the workspace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The customer-entered description of the workspace.
     * </p>
     * 
     * @return The customer-entered description of the workspace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The customer-entered description of the workspace.
     * </p>
     * 
     * @param description
     *        The customer-entered description of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL endpoint to use to access the Grafana console in the workspace.
     * </p>
     * 
     * @param endpoint
     *        The URL endpoint to use to access the Grafana console in the workspace.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The URL endpoint to use to access the Grafana console in the workspace.
     * </p>
     * 
     * @return The URL endpoint to use to access the Grafana console in the workspace.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The URL endpoint to use to access the Grafana console in the workspace.
     * </p>
     * 
     * @param endpoint
     *        The URL endpoint to use to access the Grafana console in the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withEndpoint(String endpoint) {
        setEndpoint(endpoint);
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

    public WorkspaceSummary withGrafanaToken(String grafanaToken) {
        setGrafanaToken(grafanaToken);
        return this;
    }

    /**
     * <p>
     * The Grafana version that the workspace is running.
     * </p>
     * 
     * @param grafanaVersion
     *        The Grafana version that the workspace is running.
     */

    public void setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
    }

    /**
     * <p>
     * The Grafana version that the workspace is running.
     * </p>
     * 
     * @return The Grafana version that the workspace is running.
     */

    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    /**
     * <p>
     * The Grafana version that the workspace is running.
     * </p>
     * 
     * @param grafanaVersion
     *        The Grafana version that the workspace is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withGrafanaVersion(String grafanaVersion) {
        setGrafanaVersion(grafanaVersion);
        return this;
    }

    /**
     * <p>
     * The unique ID of the workspace.
     * </p>
     * 
     * @param id
     *        The unique ID of the workspace.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the workspace.
     * </p>
     * 
     * @return The unique ID of the workspace.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the workspace.
     * </p>
     * 
     * @param id
     *        The unique ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withId(String id) {
        setId(id);
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

    public WorkspaceSummary withLicenseType(String licenseType) {
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

    public WorkspaceSummary withLicenseType(LicenseType licenseType) {
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

    public WorkspaceSummary withModified(java.util.Date modified) {
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

    public WorkspaceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, which allows Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @return The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *         roles and permissions for, which allows Amazon Managed Grafana to use these channels.
     * @see NotificationDestinationType
     */

    public java.util.List<String> getNotificationDestinations() {
        return notificationDestinations;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, which allows Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, which allows Amazon Managed Grafana to use these channels.
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
     * permissions for, which allows Amazon Managed Grafana to use these channels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationDestinations(java.util.Collection)} or
     * {@link #withNotificationDestinations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, which allows Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public WorkspaceSummary withNotificationDestinations(String... notificationDestinations) {
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
     * permissions for, which allows Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, which allows Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public WorkspaceSummary withNotificationDestinations(java.util.Collection<String> notificationDestinations) {
        setNotificationDestinations(notificationDestinations);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and
     * permissions for, which allows Amazon Managed Grafana to use these channels.
     * </p>
     * 
     * @param notificationDestinations
     *        The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM
     *        roles and permissions for, which allows Amazon Managed Grafana to use these channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDestinationType
     */

    public WorkspaceSummary withNotificationDestinations(NotificationDestinationType... notificationDestinations) {
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

    public WorkspaceSummary withStatus(String status) {
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

    public WorkspaceSummary withStatus(WorkspaceStatus status) {
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

    public WorkspaceSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see WorkspaceSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary addTagsEntry(String key, String value) {
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

    public WorkspaceSummary clearTagsEntries() {
        this.tags = null;
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
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getGrafanaToken() != null)
            sb.append("GrafanaToken: ").append(getGrafanaToken()).append(",");
        if (getGrafanaVersion() != null)
            sb.append("GrafanaVersion: ").append(getGrafanaVersion()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getModified() != null)
            sb.append("Modified: ").append(getModified()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getNotificationDestinations() != null)
            sb.append("NotificationDestinations: ").append(getNotificationDestinations()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceSummary == false)
            return false;
        WorkspaceSummary other = (WorkspaceSummary) obj;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
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
        if (other.getNotificationDestinations() == null ^ this.getNotificationDestinations() == null)
            return false;
        if (other.getNotificationDestinations() != null && other.getNotificationDestinations().equals(this.getNotificationDestinations()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getGrafanaToken() == null) ? 0 : getGrafanaToken().hashCode());
        hashCode = prime * hashCode + ((getGrafanaVersion() == null) ? 0 : getGrafanaVersion().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getModified() == null) ? 0 : getModified().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNotificationDestinations() == null) ? 0 : getNotificationDestinations().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceSummary clone() {
        try {
            return (WorkspaceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.WorkspaceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
