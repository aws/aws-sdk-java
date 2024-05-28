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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetPlugin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPluginRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application which contains the plugin.
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
     * The identifier of the application which contains the plugin.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application which contains the plugin.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application which contains the plugin.
     * </p>
     * 
     * @return The identifier of the application which contains the plugin.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application which contains the plugin.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application which contains the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPluginRequest withApplicationId(String applicationId) {
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

    public GetPluginRequest withPluginId(String pluginId) {
        setPluginId(pluginId);
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
            sb.append("PluginId: ").append(getPluginId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPluginRequest == false)
            return false;
        GetPluginRequest other = (GetPluginRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getPluginId() == null ^ this.getPluginId() == null)
            return false;
        if (other.getPluginId() != null && other.getPluginId().equals(this.getPluginId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        return hashCode;
    }

    @Override
    public GetPluginRequest clone() {
        return (GetPluginRequest) super.clone();
    }

}
