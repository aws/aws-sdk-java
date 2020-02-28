/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StartDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The environment ID.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     */
    private String deploymentStrategyId;
    /**
     * <p>
     * The configuration profile ID.
     * </p>
     */
    private String configurationProfileId;
    /**
     * <p>
     * The configuration version to deploy.
     * </p>
     */
    private String configurationVersion;
    /**
     * <p>
     * A description of the deployment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @param environmentId
     *        The environment ID.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @return The environment ID.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @param environmentId
     *        The environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * 
     * @param deploymentStrategyId
     *        The deployment strategy ID.
     */

    public void setDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * 
     * @return The deployment strategy ID.
     */

    public String getDeploymentStrategyId() {
        return this.deploymentStrategyId;
    }

    /**
     * <p>
     * The deployment strategy ID.
     * </p>
     * 
     * @param deploymentStrategyId
     *        The deployment strategy ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withDeploymentStrategyId(String deploymentStrategyId) {
        setDeploymentStrategyId(deploymentStrategyId);
        return this;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param configurationProfileId
     *        The configuration profile ID.
     */

    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @return The configuration profile ID.
     */

    public String getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param configurationProfileId
     *        The configuration profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withConfigurationProfileId(String configurationProfileId) {
        setConfigurationProfileId(configurationProfileId);
        return this;
    }

    /**
     * <p>
     * The configuration version to deploy.
     * </p>
     * 
     * @param configurationVersion
     *        The configuration version to deploy.
     */

    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    /**
     * <p>
     * The configuration version to deploy.
     * </p>
     * 
     * @return The configuration version to deploy.
     */

    public String getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * <p>
     * The configuration version to deploy.
     * </p>
     * 
     * @param configurationVersion
     *        The configuration version to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withConfigurationVersion(String configurationVersion) {
        setConfigurationVersion(configurationVersion);
        return this;
    }

    /**
     * <p>
     * A description of the deployment.
     * </p>
     * 
     * @param description
     *        A description of the deployment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the deployment.
     * </p>
     * 
     * @return A description of the deployment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the deployment.
     * </p>
     * 
     * @param description
     *        A description of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @return Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each
     *         tag consists of a key and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag
     *        consists of a key and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag
     *        consists of a key and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartDeploymentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartDeploymentRequest addTagsEntry(String key, String value) {
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

    public StartDeploymentRequest clearTagsEntries() {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDeploymentStrategyId() != null)
            sb.append("DeploymentStrategyId: ").append(getDeploymentStrategyId()).append(",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: ").append(getConfigurationProfileId()).append(",");
        if (getConfigurationVersion() != null)
            sb.append("ConfigurationVersion: ").append(getConfigurationVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof StartDeploymentRequest == false)
            return false;
        StartDeploymentRequest other = (StartDeploymentRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDeploymentStrategyId() == null ^ this.getDeploymentStrategyId() == null)
            return false;
        if (other.getDeploymentStrategyId() != null && other.getDeploymentStrategyId().equals(this.getDeploymentStrategyId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getConfigurationVersion() == null ^ this.getConfigurationVersion() == null)
            return false;
        if (other.getConfigurationVersion() != null && other.getConfigurationVersion().equals(this.getConfigurationVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStrategyId() == null) ? 0 : getDeploymentStrategyId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationVersion() == null) ? 0 : getConfigurationVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartDeploymentRequest clone() {
        return (StartDeploymentRequest) super.clone();
    }

}
