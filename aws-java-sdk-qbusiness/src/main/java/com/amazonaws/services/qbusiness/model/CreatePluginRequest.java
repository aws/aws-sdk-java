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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatePlugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePluginRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application that will contain the plugin.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A the name for your plugin.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The type of plugin you want to create.
     * </p>
     */
    private String type;

    private PluginAuthConfiguration authConfiguration;
    /**
     * <p>
     * The source URL used for plugin configuration.
     * </p>
     */
    private String serverUrl;
    /**
     * <p>
     * Contains configuration for a custom plugin.
     * </p>
     */
    private CustomPluginConfiguration customPluginConfiguration;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize the data source connector. You can also use tags to help
     * control access to the data source connector. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business plugin.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the application that will contain the plugin.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application that will contain the plugin.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application that will contain the plugin.
     * </p>
     * 
     * @return The identifier of the application that will contain the plugin.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application that will contain the plugin.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application that will contain the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A the name for your plugin.
     * </p>
     * 
     * @param displayName
     *        A the name for your plugin.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A the name for your plugin.
     * </p>
     * 
     * @return A the name for your plugin.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A the name for your plugin.
     * </p>
     * 
     * @param displayName
     *        A the name for your plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The type of plugin you want to create.
     * </p>
     * 
     * @param type
     *        The type of plugin you want to create.
     * @see PluginType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of plugin you want to create.
     * </p>
     * 
     * @return The type of plugin you want to create.
     * @see PluginType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of plugin you want to create.
     * </p>
     * 
     * @param type
     *        The type of plugin you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginType
     */

    public CreatePluginRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of plugin you want to create.
     * </p>
     * 
     * @param type
     *        The type of plugin you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginType
     */

    public CreatePluginRequest withType(PluginType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param authConfiguration
     */

    public void setAuthConfiguration(PluginAuthConfiguration authConfiguration) {
        this.authConfiguration = authConfiguration;
    }

    /**
     * @return
     */

    public PluginAuthConfiguration getAuthConfiguration() {
        return this.authConfiguration;
    }

    /**
     * @param authConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withAuthConfiguration(PluginAuthConfiguration authConfiguration) {
        setAuthConfiguration(authConfiguration);
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

    public CreatePluginRequest withServerUrl(String serverUrl) {
        setServerUrl(serverUrl);
        return this;
    }

    /**
     * <p>
     * Contains configuration for a custom plugin.
     * </p>
     * 
     * @param customPluginConfiguration
     *        Contains configuration for a custom plugin.
     */

    public void setCustomPluginConfiguration(CustomPluginConfiguration customPluginConfiguration) {
        this.customPluginConfiguration = customPluginConfiguration;
    }

    /**
     * <p>
     * Contains configuration for a custom plugin.
     * </p>
     * 
     * @return Contains configuration for a custom plugin.
     */

    public CustomPluginConfiguration getCustomPluginConfiguration() {
        return this.customPluginConfiguration;
    }

    /**
     * <p>
     * Contains configuration for a custom plugin.
     * </p>
     * 
     * @param customPluginConfiguration
     *        Contains configuration for a custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withCustomPluginConfiguration(CustomPluginConfiguration customPluginConfiguration) {
        setCustomPluginConfiguration(customPluginConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the data source connector. You can also use tags to help
     * control access to the data source connector. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize the data source connector. You can also use tags to
     *         help control access to the data source connector. Tag keys and values can consist of Unicode letters,
     *         digits, white space, and any of the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the data source connector. You can also use tags to help
     * control access to the data source connector. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the data source connector. You can also use tags to
     *        help control access to the data source connector. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the data source connector. You can also use tags to help
     * control access to the data source connector. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the data source connector. You can also use tags to
     *        help control access to the data source connector. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the data source connector. You can also use tags to help
     * control access to the data source connector. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the data source connector. You can also use tags to
     *        help control access to the data source connector. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business plugin.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business plugin.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business plugin.
     * </p>
     * 
     * @return A token that you provide to identify the request to create your Amazon Q Business plugin.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business plugin.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAuthConfiguration() != null)
            sb.append("AuthConfiguration: ").append(getAuthConfiguration()).append(",");
        if (getServerUrl() != null)
            sb.append("ServerUrl: ").append(getServerUrl()).append(",");
        if (getCustomPluginConfiguration() != null)
            sb.append("CustomPluginConfiguration: ").append(getCustomPluginConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePluginRequest == false)
            return false;
        CreatePluginRequest other = (CreatePluginRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAuthConfiguration() == null ^ this.getAuthConfiguration() == null)
            return false;
        if (other.getAuthConfiguration() != null && other.getAuthConfiguration().equals(this.getAuthConfiguration()) == false)
            return false;
        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getCustomPluginConfiguration() == null ^ this.getCustomPluginConfiguration() == null)
            return false;
        if (other.getCustomPluginConfiguration() != null && other.getCustomPluginConfiguration().equals(this.getCustomPluginConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAuthConfiguration() == null) ? 0 : getAuthConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getCustomPluginConfiguration() == null) ? 0 : getCustomPluginConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePluginRequest clone() {
        return (CreatePluginRequest) super.clone();
    }

}
