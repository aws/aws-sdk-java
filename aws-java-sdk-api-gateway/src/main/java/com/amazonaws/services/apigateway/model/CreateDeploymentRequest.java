/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests API Gateway to create a <a>Deployment</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     */
    private String stageDescription;
    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     * </p>
     */
    private Boolean cacheClusterEnabled;
    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster is
     * enabled.
     * </p>
     */
    private String cacheClusterSize;
    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new deployment.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     */
    private java.util.Map<String, String> variables;
    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is a canary release deployment.
     * </p>
     */
    private DeploymentCanarySettings canarySettings;
    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * </p>
     */
    private Boolean tracingEnabled;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @return The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @param stageDescription
     *        The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     */

    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @return The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     */

    public String getStageDescription() {
        return this.stageDescription;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @param stageDescription
     *        The description of the <a>Stage</a> resource for the <a>Deployment</a> resource to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withStageDescription(String stageDescription) {
        setStageDescription(stageDescription);
        return this;
    }

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @param description
     *        The description for the <a>Deployment</a> resource to create.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @return The description for the <a>Deployment</a> resource to create.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     * 
     * @param description
     *        The description for the <a>Deployment</a> resource to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     */

    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     * </p>
     * 
     * @return Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     */

    public Boolean getCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        setCacheClusterEnabled(cacheClusterEnabled);
        return this;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     * </p>
     * 
     * @return Enables a cache cluster for the <a>Stage</a> resource specified in the input.
     */

    public Boolean isCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster is
     * enabled.
     * </p>
     * 
     * @param cacheClusterSize
     *        Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster
     *        is enabled.
     */

    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster is
     * enabled.
     * </p>
     * 
     * @return Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster
     *         is enabled.
     */

    public String getCacheClusterSize() {
        return this.cacheClusterSize;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster is
     * enabled.
     * </p>
     * 
     * @param cacheClusterSize
     *        Specifies the cache cluster size for the <a>Stage</a> resource specified in the input, if a cache cluster
     *        is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withCacheClusterSize(String cacheClusterSize) {
        setCacheClusterSize(cacheClusterSize);
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new deployment.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @return A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new
     *         deployment. Variable names can have alphanumeric and underscore characters, and the values must match
     *         <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new deployment.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @param variables
     *        A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new
     *        deployment. Variable names can have alphanumeric and underscore characters, and the values must match
     *        <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new deployment.
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @param variables
     *        A map that defines the stage variables for the <a>Stage</a> resource that is associated with the new
     *        deployment. Variable names can have alphanumeric and underscore characters, and the values must match
     *        <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public CreateDeploymentRequest addVariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is a canary release deployment.
     * </p>
     * 
     * @param canarySettings
     *        The input configuration for the canary deployment when the deployment is a canary release deployment.
     */

    public void setCanarySettings(DeploymentCanarySettings canarySettings) {
        this.canarySettings = canarySettings;
    }

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is a canary release deployment.
     * </p>
     * 
     * @return The input configuration for the canary deployment when the deployment is a canary release deployment.
     */

    public DeploymentCanarySettings getCanarySettings() {
        return this.canarySettings;
    }

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is a canary release deployment.
     * </p>
     * 
     * @param canarySettings
     *        The input configuration for the canary deployment when the deployment is a canary release deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withCanarySettings(DeploymentCanarySettings canarySettings) {
        setCanarySettings(canarySettings);
        return this;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * </p>
     * 
     * @param tracingEnabled
     *        Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     */

    public void setTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * </p>
     * 
     * @return Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     */

    public Boolean getTracingEnabled() {
        return this.tracingEnabled;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * </p>
     * 
     * @param tracingEnabled
     *        Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withTracingEnabled(Boolean tracingEnabled) {
        setTracingEnabled(tracingEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * </p>
     * 
     * @return Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     */

    public Boolean isTracingEnabled() {
        return this.tracingEnabled;
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getStageDescription() != null)
            sb.append("StageDescription: ").append(getStageDescription()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCacheClusterEnabled() != null)
            sb.append("CacheClusterEnabled: ").append(getCacheClusterEnabled()).append(",");
        if (getCacheClusterSize() != null)
            sb.append("CacheClusterSize: ").append(getCacheClusterSize()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
        if (getCanarySettings() != null)
            sb.append("CanarySettings: ").append(getCanarySettings()).append(",");
        if (getTracingEnabled() != null)
            sb.append("TracingEnabled: ").append(getTracingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getStageDescription() == null ^ this.getStageDescription() == null)
            return false;
        if (other.getStageDescription() != null && other.getStageDescription().equals(this.getStageDescription()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCacheClusterEnabled() == null ^ this.getCacheClusterEnabled() == null)
            return false;
        if (other.getCacheClusterEnabled() != null && other.getCacheClusterEnabled().equals(this.getCacheClusterEnabled()) == false)
            return false;
        if (other.getCacheClusterSize() == null ^ this.getCacheClusterSize() == null)
            return false;
        if (other.getCacheClusterSize() != null && other.getCacheClusterSize().equals(this.getCacheClusterSize()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getCanarySettings() == null ^ this.getCanarySettings() == null)
            return false;
        if (other.getCanarySettings() != null && other.getCanarySettings().equals(this.getCanarySettings()) == false)
            return false;
        if (other.getTracingEnabled() == null ^ this.getTracingEnabled() == null)
            return false;
        if (other.getTracingEnabled() != null && other.getTracingEnabled().equals(this.getTracingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getStageDescription() == null) ? 0 : getStageDescription().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getCanarySettings() == null) ? 0 : getCanarySettings().hashCode());
        hashCode = prime * hashCode + ((getTracingEnabled() == null) ? 0 : getTracingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
