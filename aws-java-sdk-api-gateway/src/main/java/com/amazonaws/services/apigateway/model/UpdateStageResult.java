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

/**
 * <p>
 * Represents a unique identifier for a version of a deployed <a>RestApi</a> that is callable by users.
 * </p>
 * <div class="seeAlso"> <a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html">Deploy an API</a> </div>
 */
public class UpdateStageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>Deployment</a> that the stage points to.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The identifier of a client certificate for an API stage.
     * </p>
     */
    private String clientCertificateId;
    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to Amazon API
     * Gateway.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The stage's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether a cache cluster is enabled for the stage.
     * </p>
     */
    private Boolean cacheClusterEnabled;
    /**
     * <p>
     * The size of the cache cluster for the stage, if enabled.
     * </p>
     */
    private String cacheClusterSize;
    /**
     * <p>
     * The status of the cache cluster for the stage, if enabled.
     * </p>
     */
    private String cacheClusterStatus;
    /**
     * <p>
     * A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     * <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code>
     * for an individual method override, or <code>/\*&#47;\*</code> for overriding all methods in the stage.
     * </p>
     */
    private java.util.Map<String, MethodSetting> methodSettings;
    /**
     * <p>
     * A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     */
    private java.util.Map<String, String> variables;
    /**
     * <p>
     * The date and time that the stage was created, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time that information about the stage was last updated, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The identifier of the <a>Deployment</a> that the stage points to.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the <a>Deployment</a> that the stage points to.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the <a>Deployment</a> that the stage points to.
     * </p>
     * 
     * @return The identifier of the <a>Deployment</a> that the stage points to.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the <a>Deployment</a> that the stage points to.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the <a>Deployment</a> that the stage points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The identifier of a client certificate for an API stage.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of a client certificate for an API stage.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for an API stage.
     * </p>
     * 
     * @return The identifier of a client certificate for an API stage.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for an API stage.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of a client certificate for an API stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to Amazon API
     * Gateway.
     * </p>
     * 
     * @param stageName
     *        The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to
     *        Amazon API Gateway.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to Amazon API
     * Gateway.
     * </p>
     * 
     * @return The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to
     *         Amazon API Gateway.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to Amazon API
     * Gateway.
     * </p>
     * 
     * @param stageName
     *        The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to
     *        Amazon API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The stage's description.
     * </p>
     * 
     * @param description
     *        The stage's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The stage's description.
     * </p>
     * 
     * @return The stage's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The stage's description.
     * </p>
     * 
     * @param description
     *        The stage's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Specifies whether a cache cluster is enabled for the stage.
     */

    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>
     * Specifies whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @return Specifies whether a cache cluster is enabled for the stage.
     */

    public Boolean getCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * Specifies whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Specifies whether a cache cluster is enabled for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        setCacheClusterEnabled(cacheClusterEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @return Specifies whether a cache cluster is enabled for the stage.
     */

    public Boolean isCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * The size of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @param cacheClusterSize
     *        The size of the cache cluster for the stage, if enabled.
     */

    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>
     * The size of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @return The size of the cache cluster for the stage, if enabled.
     */

    public String getCacheClusterSize() {
        return this.cacheClusterSize;
    }

    /**
     * <p>
     * The size of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @param cacheClusterSize
     *        The size of the cache cluster for the stage, if enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withCacheClusterSize(String cacheClusterSize) {
        setCacheClusterSize(cacheClusterSize);
        return this;
    }

    /**
     * <p>
     * The status of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The status of the cache cluster for the stage, if enabled.
     * @see CacheClusterStatus
     */

    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }

    /**
     * <p>
     * The status of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @return The status of the cache cluster for the stage, if enabled.
     * @see CacheClusterStatus
     */

    public String getCacheClusterStatus() {
        return this.cacheClusterStatus;
    }

    /**
     * <p>
     * The status of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The status of the cache cluster for the stage, if enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CacheClusterStatus
     */

    public UpdateStageResult withCacheClusterStatus(String cacheClusterStatus) {
        setCacheClusterStatus(cacheClusterStatus);
        return this;
    }

    /**
     * <p>
     * The status of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The status of the cache cluster for the stage, if enabled.
     * @see CacheClusterStatus
     */

    public void setCacheClusterStatus(CacheClusterStatus cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus.toString();
    }

    /**
     * <p>
     * The status of the cache cluster for the stage, if enabled.
     * </p>
     * 
     * @param cacheClusterStatus
     *        The status of the cache cluster for the stage, if enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CacheClusterStatus
     */

    public UpdateStageResult withCacheClusterStatus(CacheClusterStatus cacheClusterStatus) {
        setCacheClusterStatus(cacheClusterStatus);
        return this;
    }

    /**
     * <p>
     * A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     * <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code>
     * for an individual method override, or <code>/\*&#47;\*</code> for overriding all methods in the stage.
     * </p>
     * 
     * @return A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     *         <code>/{method_setting_key</code> below) are method paths defined as
     *         <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*&#47;\*</code>
     *         for overriding all methods in the stage.
     */

    public java.util.Map<String, MethodSetting> getMethodSettings() {
        return methodSettings;
    }

    /**
     * <p>
     * A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     * <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code>
     * for an individual method override, or <code>/\*&#47;\*</code> for overriding all methods in the stage.
     * </p>
     * 
     * @param methodSettings
     *        A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     *        <code>/{method_setting_key</code> below) are method paths defined as
     *        <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*&#47;\*</code>
     *        for overriding all methods in the stage.
     */

    public void setMethodSettings(java.util.Map<String, MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
    }

    /**
     * <p>
     * A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     * <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code>
     * for an individual method override, or <code>/\*&#47;\*</code> for overriding all methods in the stage.
     * </p>
     * 
     * @param methodSettings
     *        A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as
     *        <code>/{method_setting_key</code> below) are method paths defined as
     *        <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*&#47;\*</code>
     *        for overriding all methods in the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withMethodSettings(java.util.Map<String, MethodSetting> methodSettings) {
        setMethodSettings(methodSettings);
        return this;
    }

    public UpdateStageResult addMethodSettingsEntry(String key, MethodSetting value) {
        if (null == this.methodSettings) {
            this.methodSettings = new java.util.HashMap<String, MethodSetting>();
        }
        if (this.methodSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.methodSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MethodSettings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult clearMethodSettingsEntries() {
        this.methodSettings = null;
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @return A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric
     *         and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @param variables
     *        A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric
     *        and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and
     * underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * 
     * @param variables
     *        A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric
     *        and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public UpdateStageResult addVariablesEntry(String key, String value) {
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

    public UpdateStageResult clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The date and time that the stage was created, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the stage was created, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time that the stage was created, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date and time that the stage was created, in <a
     *         href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time that the stage was created, in <a href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param createdDate
     *        The date and time that the stage was created, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time that information about the stage was last updated, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that information about the stage was last updated, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that information about the stage was last updated, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date and time that information about the stage was last updated, in <a
     *         href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that information about the stage was last updated, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that information about the stage was last updated, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm" target="_blank">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: " + getClientCertificateId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCacheClusterEnabled() != null)
            sb.append("CacheClusterEnabled: " + getCacheClusterEnabled() + ",");
        if (getCacheClusterSize() != null)
            sb.append("CacheClusterSize: " + getCacheClusterSize() + ",");
        if (getCacheClusterStatus() != null)
            sb.append("CacheClusterStatus: " + getCacheClusterStatus() + ",");
        if (getMethodSettings() != null)
            sb.append("MethodSettings: " + getMethodSettings() + ",");
        if (getVariables() != null)
            sb.append("Variables: " + getVariables() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: " + getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStageResult == false)
            return false;
        UpdateStageResult other = (UpdateStageResult) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
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
        if (other.getCacheClusterStatus() == null ^ this.getCacheClusterStatus() == null)
            return false;
        if (other.getCacheClusterStatus() != null && other.getCacheClusterStatus().equals(this.getCacheClusterStatus()) == false)
            return false;
        if (other.getMethodSettings() == null ^ this.getMethodSettings() == null)
            return false;
        if (other.getMethodSettings() != null && other.getMethodSettings().equals(this.getMethodSettings()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterStatus() == null) ? 0 : getCacheClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getMethodSettings() == null) ? 0 : getMethodSettings().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStageResult clone() {
        try {
            return (UpdateStageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
