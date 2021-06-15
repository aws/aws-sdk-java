/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQuickConnectConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     */
    private String quickConnectId;
    /**
     * <p>
     * Information about the configuration settings for the quick connect.
     * </p>
     */
    private QuickConnectConfig quickConnectConfig;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickConnectConfigRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * 
     * @param quickConnectId
     *        The identifier for the quick connect.
     */

    public void setQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * 
     * @return The identifier for the quick connect.
     */

    public String getQuickConnectId() {
        return this.quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * 
     * @param quickConnectId
     *        The identifier for the quick connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickConnectConfigRequest withQuickConnectId(String quickConnectId) {
        setQuickConnectId(quickConnectId);
        return this;
    }

    /**
     * <p>
     * Information about the configuration settings for the quick connect.
     * </p>
     * 
     * @param quickConnectConfig
     *        Information about the configuration settings for the quick connect.
     */

    public void setQuickConnectConfig(QuickConnectConfig quickConnectConfig) {
        this.quickConnectConfig = quickConnectConfig;
    }

    /**
     * <p>
     * Information about the configuration settings for the quick connect.
     * </p>
     * 
     * @return Information about the configuration settings for the quick connect.
     */

    public QuickConnectConfig getQuickConnectConfig() {
        return this.quickConnectConfig;
    }

    /**
     * <p>
     * Information about the configuration settings for the quick connect.
     * </p>
     * 
     * @param quickConnectConfig
     *        Information about the configuration settings for the quick connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuickConnectConfigRequest withQuickConnectConfig(QuickConnectConfig quickConnectConfig) {
        setQuickConnectConfig(quickConnectConfig);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getQuickConnectId() != null)
            sb.append("QuickConnectId: ").append(getQuickConnectId()).append(",");
        if (getQuickConnectConfig() != null)
            sb.append("QuickConnectConfig: ").append(getQuickConnectConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQuickConnectConfigRequest == false)
            return false;
        UpdateQuickConnectConfigRequest other = (UpdateQuickConnectConfigRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getQuickConnectId() == null ^ this.getQuickConnectId() == null)
            return false;
        if (other.getQuickConnectId() != null && other.getQuickConnectId().equals(this.getQuickConnectId()) == false)
            return false;
        if (other.getQuickConnectConfig() == null ^ this.getQuickConnectConfig() == null)
            return false;
        if (other.getQuickConnectConfig() != null && other.getQuickConnectConfig().equals(this.getQuickConnectConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getQuickConnectId() == null) ? 0 : getQuickConnectId().hashCode());
        hashCode = prime * hashCode + ((getQuickConnectConfig() == null) ? 0 : getQuickConnectConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQuickConnectConfigRequest clone() {
        return (UpdateQuickConnectConfigRequest) super.clone();
    }

}
