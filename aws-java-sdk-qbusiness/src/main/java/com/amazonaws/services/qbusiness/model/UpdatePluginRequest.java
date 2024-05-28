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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdatePlugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePluginRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application the plugin is attached to.
     * </p>
     */
    private String applicationId;
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
     * The status of the plugin.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The source URL used for plugin configuration.
     * </p>
     */
    private String serverUrl;
    /**
     * <p>
     * The configuration for a custom plugin.
     * </p>
     */
    private CustomPluginConfiguration customPluginConfiguration;
    /**
     * <p>
     * The authentication configuration the plugin is using.
     * </p>
     */
    private PluginAuthConfiguration authConfiguration;

    /**
     * <p>
     * The identifier of the application the plugin is attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application the plugin is attached to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application the plugin is attached to.
     * </p>
     * 
     * @return The identifier of the application the plugin is attached to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application the plugin is attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application the plugin is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePluginRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

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

    public UpdatePluginRequest withPluginId(String pluginId) {
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

    public UpdatePluginRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param state
     *        The status of the plugin.
     * @see PluginState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @return The status of the plugin.
     * @see PluginState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param state
     *        The status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginState
     */

    public UpdatePluginRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the plugin.
     * </p>
     * 
     * @param state
     *        The status of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginState
     */

    public UpdatePluginRequest withState(PluginState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The source URL used for plugin configuration.
     * </p>
     * 
     * @param serverUrl
     *        The source URL used for plugin configuration.
     */

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * <p>
     * The source URL used for plugin configuration.
     * </p>
     * 
     * @return The source URL used for plugin configuration.
     */

    public String getServerUrl() {
        return this.serverUrl;
    }

    /**
     * <p>
     * The source URL used for plugin configuration.
     * </p>
     * 
     * @param serverUrl
     *        The source URL used for plugin configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePluginRequest withServerUrl(String serverUrl) {
        setServerUrl(serverUrl);
        return this;
    }

    /**
     * <p>
     * The configuration for a custom plugin.
     * </p>
     * 
     * @param customPluginConfiguration
     *        The configuration for a custom plugin.
     */

    public void setCustomPluginConfiguration(CustomPluginConfiguration customPluginConfiguration) {
        this.customPluginConfiguration = customPluginConfiguration;
    }

    /**
     * <p>
     * The configuration for a custom plugin.
     * </p>
     * 
     * @return The configuration for a custom plugin.
     */

    public CustomPluginConfiguration getCustomPluginConfiguration() {
        return this.customPluginConfiguration;
    }

    /**
     * <p>
     * The configuration for a custom plugin.
     * </p>
     * 
     * @param customPluginConfiguration
     *        The configuration for a custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePluginRequest withCustomPluginConfiguration(CustomPluginConfiguration customPluginConfiguration) {
        setCustomPluginConfiguration(customPluginConfiguration);
        return this;
    }

    /**
     * <p>
     * The authentication configuration the plugin is using.
     * </p>
     * 
     * @param authConfiguration
     *        The authentication configuration the plugin is using.
     */

    public void setAuthConfiguration(PluginAuthConfiguration authConfiguration) {
        this.authConfiguration = authConfiguration;
    }

    /**
     * <p>
     * The authentication configuration the plugin is using.
     * </p>
     * 
     * @return The authentication configuration the plugin is using.
     */

    public PluginAuthConfiguration getAuthConfiguration() {
        return this.authConfiguration;
    }

    /**
     * <p>
     * The authentication configuration the plugin is using.
     * </p>
     * 
     * @param authConfiguration
     *        The authentication configuration the plugin is using.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePluginRequest withAuthConfiguration(PluginAuthConfiguration authConfiguration) {
        setAuthConfiguration(authConfiguration);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getPluginId() != null)
            sb.append("PluginId: ").append(getPluginId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getServerUrl() != null)
            sb.append("ServerUrl: ").append(getServerUrl()).append(",");
        if (getCustomPluginConfiguration() != null)
            sb.append("CustomPluginConfiguration: ").append(getCustomPluginConfiguration()).append(",");
        if (getAuthConfiguration() != null)
            sb.append("AuthConfiguration: ").append(getAuthConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePluginRequest == false)
            return false;
        UpdatePluginRequest other = (UpdatePluginRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getPluginId() == null ^ this.getPluginId() == null)
            return false;
        if (other.getPluginId() != null && other.getPluginId().equals(this.getPluginId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getCustomPluginConfiguration() == null ^ this.getCustomPluginConfiguration() == null)
            return false;
        if (other.getCustomPluginConfiguration() != null && other.getCustomPluginConfiguration().equals(this.getCustomPluginConfiguration()) == false)
            return false;
        if (other.getAuthConfiguration() == null ^ this.getAuthConfiguration() == null)
            return false;
        if (other.getAuthConfiguration() != null && other.getAuthConfiguration().equals(this.getAuthConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getCustomPluginConfiguration() == null) ? 0 : getCustomPluginConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAuthConfiguration() == null) ? 0 : getAuthConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePluginRequest clone() {
        return (UpdatePluginRequest) super.clone();
    }

}
