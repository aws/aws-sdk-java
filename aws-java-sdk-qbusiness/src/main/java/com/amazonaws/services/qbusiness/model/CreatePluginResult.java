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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatePlugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePluginResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the plugin created.
     * </p>
     */
    private String pluginId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a plugin.
     * </p>
     */
    private String pluginArn;
    /**
     * <p>
     * The current status of a plugin. A plugin is modified asynchronously.
     * </p>
     */
    private String buildStatus;

    /**
     * <p>
     * The identifier of the plugin created.
     * </p>
     * 
     * @param pluginId
     *        The identifier of the plugin created.
     */

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    /**
     * <p>
     * The identifier of the plugin created.
     * </p>
     * 
     * @return The identifier of the plugin created.
     */

    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * <p>
     * The identifier of the plugin created.
     * </p>
     * 
     * @param pluginId
     *        The identifier of the plugin created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginResult withPluginId(String pluginId) {
        setPluginId(pluginId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a plugin.
     * </p>
     * 
     * @param pluginArn
     *        The Amazon Resource Name (ARN) of a plugin.
     */

    public void setPluginArn(String pluginArn) {
        this.pluginArn = pluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a plugin.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a plugin.
     */

    public String getPluginArn() {
        return this.pluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a plugin.
     * </p>
     * 
     * @param pluginArn
     *        The Amazon Resource Name (ARN) of a plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePluginResult withPluginArn(String pluginArn) {
        setPluginArn(pluginArn);
        return this;
    }

    /**
     * <p>
     * The current status of a plugin. A plugin is modified asynchronously.
     * </p>
     * 
     * @param buildStatus
     *        The current status of a plugin. A plugin is modified asynchronously.
     * @see PluginBuildStatus
     */

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    /**
     * <p>
     * The current status of a plugin. A plugin is modified asynchronously.
     * </p>
     * 
     * @return The current status of a plugin. A plugin is modified asynchronously.
     * @see PluginBuildStatus
     */

    public String getBuildStatus() {
        return this.buildStatus;
    }

    /**
     * <p>
     * The current status of a plugin. A plugin is modified asynchronously.
     * </p>
     * 
     * @param buildStatus
     *        The current status of a plugin. A plugin is modified asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginBuildStatus
     */

    public CreatePluginResult withBuildStatus(String buildStatus) {
        setBuildStatus(buildStatus);
        return this;
    }

    /**
     * <p>
     * The current status of a plugin. A plugin is modified asynchronously.
     * </p>
     * 
     * @param buildStatus
     *        The current status of a plugin. A plugin is modified asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PluginBuildStatus
     */

    public CreatePluginResult withBuildStatus(PluginBuildStatus buildStatus) {
        this.buildStatus = buildStatus.toString();
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
        if (getPluginArn() != null)
            sb.append("PluginArn: ").append(getPluginArn()).append(",");
        if (getBuildStatus() != null)
            sb.append("BuildStatus: ").append(getBuildStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePluginResult == false)
            return false;
        CreatePluginResult other = (CreatePluginResult) obj;
        if (other.getPluginId() == null ^ this.getPluginId() == null)
            return false;
        if (other.getPluginId() != null && other.getPluginId().equals(this.getPluginId()) == false)
            return false;
        if (other.getPluginArn() == null ^ this.getPluginArn() == null)
            return false;
        if (other.getPluginArn() != null && other.getPluginArn().equals(this.getPluginArn()) == false)
            return false;
        if (other.getBuildStatus() == null ^ this.getBuildStatus() == null)
            return false;
        if (other.getBuildStatus() != null && other.getBuildStatus().equals(this.getBuildStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        hashCode = prime * hashCode + ((getPluginArn() == null) ? 0 : getPluginArn().hashCode());
        hashCode = prime * hashCode + ((getBuildStatus() == null) ? 0 : getBuildStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreatePluginResult clone() {
        try {
            return (CreatePluginResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
