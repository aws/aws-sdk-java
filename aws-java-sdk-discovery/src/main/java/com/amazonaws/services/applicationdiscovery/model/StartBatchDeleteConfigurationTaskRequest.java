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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBatchDeleteConfigurationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * The list of configuration IDs that will be deleted by the task.
     * </p>
     */
    private java.util.List<String> configurationIds;

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @param configurationType
     *        The type of configuration item to delete. Supported types are: SERVER.
     * @see DeletionConfigurationItemType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @return The type of configuration item to delete. Supported types are: SERVER.
     * @see DeletionConfigurationItemType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @param configurationType
     *        The type of configuration item to delete. Supported types are: SERVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionConfigurationItemType
     */

    public StartBatchDeleteConfigurationTaskRequest withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @param configurationType
     *        The type of configuration item to delete. Supported types are: SERVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionConfigurationItemType
     */

    public StartBatchDeleteConfigurationTaskRequest withConfigurationType(DeletionConfigurationItemType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * The list of configuration IDs that will be deleted by the task.
     * </p>
     * 
     * @return The list of configuration IDs that will be deleted by the task.
     */

    public java.util.List<String> getConfigurationIds() {
        return configurationIds;
    }

    /**
     * <p>
     * The list of configuration IDs that will be deleted by the task.
     * </p>
     * 
     * @param configurationIds
     *        The list of configuration IDs that will be deleted by the task.
     */

    public void setConfigurationIds(java.util.Collection<String> configurationIds) {
        if (configurationIds == null) {
            this.configurationIds = null;
            return;
        }

        this.configurationIds = new java.util.ArrayList<String>(configurationIds);
    }

    /**
     * <p>
     * The list of configuration IDs that will be deleted by the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationIds(java.util.Collection)} or {@link #withConfigurationIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configurationIds
     *        The list of configuration IDs that will be deleted by the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchDeleteConfigurationTaskRequest withConfigurationIds(String... configurationIds) {
        if (this.configurationIds == null) {
            setConfigurationIds(new java.util.ArrayList<String>(configurationIds.length));
        }
        for (String ele : configurationIds) {
            this.configurationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of configuration IDs that will be deleted by the task.
     * </p>
     * 
     * @param configurationIds
     *        The list of configuration IDs that will be deleted by the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBatchDeleteConfigurationTaskRequest withConfigurationIds(java.util.Collection<String> configurationIds) {
        setConfigurationIds(configurationIds);
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
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getConfigurationIds() != null)
            sb.append("ConfigurationIds: ").append(getConfigurationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBatchDeleteConfigurationTaskRequest == false)
            return false;
        StartBatchDeleteConfigurationTaskRequest other = (StartBatchDeleteConfigurationTaskRequest) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getConfigurationIds() == null ^ this.getConfigurationIds() == null)
            return false;
        if (other.getConfigurationIds() != null && other.getConfigurationIds().equals(this.getConfigurationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getConfigurationIds() == null) ? 0 : getConfigurationIds().hashCode());
        return hashCode;
    }

    @Override
    public StartBatchDeleteConfigurationTaskRequest clone() {
        return (StartBatchDeleteConfigurationTaskRequest) super.clone();
    }

}
