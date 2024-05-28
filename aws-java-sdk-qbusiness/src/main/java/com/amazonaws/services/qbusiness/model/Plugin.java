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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon Q Business plugin and its configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Plugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Plugin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the plugin.
     * </p>
     */
    private String pluginId;
    /**
     * <p>
     * The name of the plugin.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The type of the plugin.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The plugin server URL used for configuration.
     * </p>
     */
    private String serverUrl;
    /**
     * <p>
     * The current status of the plugin.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status of the plugin.
     * </p>
     */
    private String buildStatus;
    /**
     * <p>
     * The timestamp for when the plugin was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp for when the plugin was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier of the plugin.
     * </p>
     * 
     * @param pluginId
     *        The identifier of the plugin.
     */

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    /**
     * <p>
     * The identifier of the plugin.
     * </p>
     * 
     * @return The identifier of the plugin.
     */

    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * <p>
     * The identifier of the plugin.
     * </p>
     * 
     * @param pluginId
     *        The identifier of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plugin withPluginId(String pluginId) {
        setPluginId(pluginId);
        return this;
    }

    /**
     * <p>
     * The name of the plugin.
     * </p>
     * 
     * @param displayName
     *        The name of the plugin.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the plugin.
     * </p>
     * 
     * @return The name of the plugin.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the plugin.
     * </p>
     * 
     * @param displayName
     *        The name of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plugin withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The type of the plugin.
     * </p>
     * 
     * @param type
     *        The type of the plugin.
     * @see PluginType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the plugin.
     * </p>
     * 
     * @return The type of the plugin.
     * @see PluginType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the plugin.
     * </p>
     * 
     * @param type
     *        The type of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginType
     */

    public Plugin withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the plugin.
     * </p>
     * 
     * @param type
     *        The type of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginType
     */

    public Plugin withType(PluginType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The plugin server URL used for configuration.
     * </p>
     * 
     * @param serverUrl
     *        The plugin server URL used for configuration.
     */

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * <p>
     * The plugin server URL used for configuration.
     * </p>
     * 
     * @return The plugin server URL used for configuration.
     */

    public String getServerUrl() {
        return this.serverUrl;
    }

    /**
     * <p>
     * The plugin server URL used for configuration.
     * </p>
     * 
     * @param serverUrl
     *        The plugin server URL used for configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plugin withServerUrl(String serverUrl) {
        setServerUrl(serverUrl);
        return this;
    }

    /**
     * <p>
     * The current status of the plugin.
     * </p>
     * 
     * @param state
     *        The current status of the plugin.
     * @see PluginState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the plugin.
     * </p>
     * 
     * @return The current status of the plugin.
     * @see PluginState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the plugin.
     * </p>
     * 
     * @param state
     *        The current status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginState
     */

    public Plugin withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current status of the plugin.
     * </p>
     * 
     * @param state
     *        The current status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginState
     */

    public Plugin withState(PluginState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param buildStatus
     *        The status of the plugin.
     * @see PluginBuildStatus
     */

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @return The status of the plugin.
     * @see PluginBuildStatus
     */

    public String getBuildStatus() {
        return this.buildStatus;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param buildStatus
     *        The status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginBuildStatus
     */

    public Plugin withBuildStatus(String buildStatus) {
        setBuildStatus(buildStatus);
        return this;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param buildStatus
     *        The status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginBuildStatus
     */

    public Plugin withBuildStatus(PluginBuildStatus buildStatus) {
        this.buildStatus = buildStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the plugin was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp for when the plugin was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp for when the plugin was created.
     * </p>
     * 
     * @return The timestamp for when the plugin was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp for when the plugin was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp for when the plugin was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plugin withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the plugin was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp for when the plugin was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp for when the plugin was last updated.
     * </p>
     * 
     * @return The timestamp for when the plugin was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp for when the plugin was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp for when the plugin was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Plugin withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getPluginId() != null)
            sb.append("PluginId: ").append(getPluginId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getServerUrl() != null)
            sb.append("ServerUrl: ").append(getServerUrl()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getBuildStatus() != null)
            sb.append("BuildStatus: ").append(getBuildStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Plugin == false)
            return false;
        Plugin other = (Plugin) obj;
        if (other.getPluginId() == null ^ this.getPluginId() == null)
            return false;
        if (other.getPluginId() != null && other.getPluginId().equals(this.getPluginId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getBuildStatus() == null ^ this.getBuildStatus() == null)
            return false;
        if (other.getBuildStatus() != null && other.getBuildStatus().equals(this.getBuildStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getBuildStatus() == null) ? 0 : getBuildStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Plugin clone() {
        try {
            return (Plugin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.PluginMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
