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

/**
 * <p>
 * Represents a unique identifier for a version of a deployed <a>RestApi</a> that is callable by users.
 * </p>
 * <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html">Deploy an API</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
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
     * The version of the associated API documentation.
     * </p>
     */
    private String documentationVersion;
    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     */
    private AccessLogSettings accessLogSettings;
    /**
     * <p>
     * Settings for the canary deployment in this stage.
     * </p>
     */
    private CanarySettings canarySettings;
    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.
     * </p>
     */
    private Boolean tracingEnabled;
    /**
     * <p>
     * The ARN of the WebAcl associated with the <a>Stage</a>.
     * </p>
     */
    private String webAclArn;
    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp when the stage was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The timestamp when the stage last updated.
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

    public GetStageResult withDeploymentId(String deploymentId) {
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

    public GetStageResult withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
     * Gateway.
     * </p>
     * 
     * @param stageName
     *        The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
     *        Gateway.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
     * Gateway.
     * </p>
     * 
     * @return The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
     *         Gateway.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
     * Gateway.
     * </p>
     * 
     * @param stageName
     *        The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API
     *        Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withStageName(String stageName) {
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

    public GetStageResult withDescription(String description) {
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

    public GetStageResult withCacheClusterEnabled(Boolean cacheClusterEnabled) {
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

    public GetStageResult withCacheClusterSize(String cacheClusterSize) {
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

    public GetStageResult withCacheClusterStatus(String cacheClusterStatus) {
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
        withCacheClusterStatus(cacheClusterStatus);
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

    public GetStageResult withCacheClusterStatus(CacheClusterStatus cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus.toString();
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

    public GetStageResult withMethodSettings(java.util.Map<String, MethodSetting> methodSettings) {
        setMethodSettings(methodSettings);
        return this;
    }

    public GetStageResult addMethodSettingsEntry(String key, MethodSetting value) {
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

    public GetStageResult clearMethodSettingsEntries() {
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

    public GetStageResult withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public GetStageResult addVariablesEntry(String key, String value) {
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

    public GetStageResult clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     * 
     * @param documentationVersion
     *        The version of the associated API documentation.
     */

    public void setDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     * 
     * @return The version of the associated API documentation.
     */

    public String getDocumentationVersion() {
        return this.documentationVersion;
    }

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     * 
     * @param documentationVersion
     *        The version of the associated API documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withDocumentationVersion(String documentationVersion) {
        setDocumentationVersion(documentationVersion);
        return this;
    }

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     * 
     * @param accessLogSettings
     *        Settings for logging access in this stage.
     */

    public void setAccessLogSettings(AccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
    }

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     * 
     * @return Settings for logging access in this stage.
     */

    public AccessLogSettings getAccessLogSettings() {
        return this.accessLogSettings;
    }

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     * 
     * @param accessLogSettings
     *        Settings for logging access in this stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withAccessLogSettings(AccessLogSettings accessLogSettings) {
        setAccessLogSettings(accessLogSettings);
        return this;
    }

    /**
     * <p>
     * Settings for the canary deployment in this stage.
     * </p>
     * 
     * @param canarySettings
     *        Settings for the canary deployment in this stage.
     */

    public void setCanarySettings(CanarySettings canarySettings) {
        this.canarySettings = canarySettings;
    }

    /**
     * <p>
     * Settings for the canary deployment in this stage.
     * </p>
     * 
     * @return Settings for the canary deployment in this stage.
     */

    public CanarySettings getCanarySettings() {
        return this.canarySettings;
    }

    /**
     * <p>
     * Settings for the canary deployment in this stage.
     * </p>
     * 
     * @param canarySettings
     *        Settings for the canary deployment in this stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withCanarySettings(CanarySettings canarySettings) {
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

    public GetStageResult withTracingEnabled(Boolean tracingEnabled) {
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
     * <p>
     * The ARN of the WebAcl associated with the <a>Stage</a>.
     * </p>
     * 
     * @param webAclArn
     *        The ARN of the WebAcl associated with the <a>Stage</a>.
     */

    public void setWebAclArn(String webAclArn) {
        this.webAclArn = webAclArn;
    }

    /**
     * <p>
     * The ARN of the WebAcl associated with the <a>Stage</a>.
     * </p>
     * 
     * @return The ARN of the WebAcl associated with the <a>Stage</a>.
     */

    public String getWebAclArn() {
        return this.webAclArn;
    }

    /**
     * <p>
     * The ARN of the WebAcl associated with the <a>Stage</a>.
     * </p>
     * 
     * @param webAclArn
     *        The ARN of the WebAcl associated with the <a>Stage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withWebAclArn(String webAclArn) {
        setWebAclArn(webAclArn);
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @return The collection of tags. Each tag element is associated with a given resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @param tags
     *        The collection of tags. Each tag element is associated with a given resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     * 
     * @param tags
     *        The collection of tags. Each tag element is associated with a given resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public GetStageResult addTagsEntry(String key, String value) {
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

    public GetStageResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp when the stage was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the stage was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the stage was created.
     * </p>
     * 
     * @return The timestamp when the stage was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when the stage was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the stage was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The timestamp when the stage last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The timestamp when the stage last updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the stage last updated.
     * </p>
     * 
     * @return The timestamp when the stage last updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the stage last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The timestamp when the stage last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: ").append(getClientCertificateId()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCacheClusterEnabled() != null)
            sb.append("CacheClusterEnabled: ").append(getCacheClusterEnabled()).append(",");
        if (getCacheClusterSize() != null)
            sb.append("CacheClusterSize: ").append(getCacheClusterSize()).append(",");
        if (getCacheClusterStatus() != null)
            sb.append("CacheClusterStatus: ").append(getCacheClusterStatus()).append(",");
        if (getMethodSettings() != null)
            sb.append("MethodSettings: ").append(getMethodSettings()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
        if (getDocumentationVersion() != null)
            sb.append("DocumentationVersion: ").append(getDocumentationVersion()).append(",");
        if (getAccessLogSettings() != null)
            sb.append("AccessLogSettings: ").append(getAccessLogSettings()).append(",");
        if (getCanarySettings() != null)
            sb.append("CanarySettings: ").append(getCanarySettings()).append(",");
        if (getTracingEnabled() != null)
            sb.append("TracingEnabled: ").append(getTracingEnabled()).append(",");
        if (getWebAclArn() != null)
            sb.append("WebAclArn: ").append(getWebAclArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStageResult == false)
            return false;
        GetStageResult other = (GetStageResult) obj;
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
        if (other.getDocumentationVersion() == null ^ this.getDocumentationVersion() == null)
            return false;
        if (other.getDocumentationVersion() != null && other.getDocumentationVersion().equals(this.getDocumentationVersion()) == false)
            return false;
        if (other.getAccessLogSettings() == null ^ this.getAccessLogSettings() == null)
            return false;
        if (other.getAccessLogSettings() != null && other.getAccessLogSettings().equals(this.getAccessLogSettings()) == false)
            return false;
        if (other.getCanarySettings() == null ^ this.getCanarySettings() == null)
            return false;
        if (other.getCanarySettings() != null && other.getCanarySettings().equals(this.getCanarySettings()) == false)
            return false;
        if (other.getTracingEnabled() == null ^ this.getTracingEnabled() == null)
            return false;
        if (other.getTracingEnabled() != null && other.getTracingEnabled().equals(this.getTracingEnabled()) == false)
            return false;
        if (other.getWebAclArn() == null ^ this.getWebAclArn() == null)
            return false;
        if (other.getWebAclArn() != null && other.getWebAclArn().equals(this.getWebAclArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getDocumentationVersion() == null) ? 0 : getDocumentationVersion().hashCode());
        hashCode = prime * hashCode + ((getAccessLogSettings() == null) ? 0 : getAccessLogSettings().hashCode());
        hashCode = prime * hashCode + ((getCanarySettings() == null) ? 0 : getCanarySettings().hashCode());
        hashCode = prime * hashCode + ((getTracingEnabled() == null) ? 0 : getTracingEnabled().hashCode());
        hashCode = prime * hashCode + ((getWebAclArn() == null) ? 0 : getWebAclArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetStageResult clone() {
        try {
            return (GetStageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
