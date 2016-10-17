/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests Amazon API Gateway to create a <a>Stage</a> resource.
 * </p>
 */
public class CreateStageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name for the <a>Stage</a> resource.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     */
    private Boolean cacheClusterEnabled;
    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     */
    private String cacheClusterSize;
    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have alphanumeric
     * and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     */
    private java.util.Map<String, String> variables;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> resource for the <a>Stage</a> resource to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name for the <a>Stage</a> resource.
     * </p>
     * 
     * @param stageName
     *        The name for the <a>Stage</a> resource.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name for the <a>Stage</a> resource.
     * </p>
     * 
     * @return The name for the <a>Stage</a> resource.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name for the <a>Stage</a> resource.
     * </p>
     * 
     * @param stageName
     *        The name for the <a>Stage</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     * </p>
     * 
     * @return The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the <a>Deployment</a> resource for the <a>Stage</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     * 
     * @param description
     *        The description of the <a>Stage</a> resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     * 
     * @return The description of the <a>Stage</a> resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     * 
     * @param description
     *        The description of the <a>Stage</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Whether cache clustering is enabled for the stage.
     */

    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     * 
     * @return Whether cache clustering is enabled for the stage.
     */

    public Boolean getCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Whether cache clustering is enabled for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        setCacheClusterEnabled(cacheClusterEnabled);
        return this;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     * 
     * @return Whether cache clustering is enabled for the stage.
     */

    public Boolean isCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * 
     * @param cacheClusterSize
     *        The stage's cache cluster size.
     */

    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * 
     * @return The stage's cache cluster size.
     */

    public String getCacheClusterSize() {
        return this.cacheClusterSize;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * 
     * @param cacheClusterSize
     *        The stage's cache cluster size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withCacheClusterSize(String cacheClusterSize) {
        setCacheClusterSize(cacheClusterSize);
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have alphanumeric
     * and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @return A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have
     *         alphanumeric and underscore characters, and the values must match
     *         <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have alphanumeric
     * and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @param variables
     *        A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have
     *        alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>
     *        .
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have alphanumeric
     * and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @param variables
     *        A map that defines the stage variables for the new <a>Stage</a> resource. Variable names can have
     *        alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public CreateStageRequest addVariablesEntry(String key, String value) {
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

    public CreateStageRequest clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCacheClusterEnabled() != null)
            sb.append("CacheClusterEnabled: " + getCacheClusterEnabled() + ",");
        if (getCacheClusterSize() != null)
            sb.append("CacheClusterSize: " + getCacheClusterSize() + ",");
        if (getVariables() != null)
            sb.append("Variables: " + getVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStageRequest == false)
            return false;
        CreateStageRequest other = (CreateStageRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public CreateStageRequest clone() {
        return (CreateStageRequest) super.clone();
    }
}
