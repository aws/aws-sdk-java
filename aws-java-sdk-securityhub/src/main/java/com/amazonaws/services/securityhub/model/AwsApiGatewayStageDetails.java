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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a version 1 Amazon API Gateway stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayStageDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayStageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the deployment that the stage points to.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The identifier of the client certificate for the stage.
     * </p>
     */
    private String clientCertificateId;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * A description of the stage.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether a cache cluster is enabled for the stage.
     * </p>
     */
    private Boolean cacheClusterEnabled;
    /**
     * <p>
     * If a cache cluster is enabled, the size of the cache cluster.
     * </p>
     */
    private String cacheClusterSize;
    /**
     * <p>
     * If a cache cluster is enabled, the status of the cache cluster.
     * </p>
     */
    private String cacheClusterStatus;
    /**
     * <p>
     * Defines the method settings for the stage.
     * </p>
     */
    private java.util.List<AwsApiGatewayMethodSettings> methodSettings;
    /**
     * <p>
     * A map that defines the stage variables for the stage.
     * </p>
     * <p>
     * Variable names can have alphanumeric and underscore characters.
     * </p>
     * <p>
     * Variable values can contain the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Uppercase and lowercase letters
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers
     * </p>
     * </li>
     * <li>
     * <p>
     * Special characters -._~:/?#&amp;=,
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> variables;
    /**
     * <p>
     * The version of the API documentation that is associated with the stage.
     * </p>
     */
    private String documentationVersion;
    /**
     * <p>
     * Settings for logging access for the stage.
     * </p>
     */
    private AwsApiGatewayAccessLogSettings accessLogSettings;
    /**
     * <p>
     * Information about settings for canary deployment in the stage.
     * </p>
     */
    private AwsApiGatewayCanarySettings canarySettings;
    /**
     * <p>
     * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     * </p>
     */
    private Boolean tracingEnabled;
    /**
     * <p>
     * Indicates when the stage was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdDate;
    /**
     * <p>
     * Indicates when the stage was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String lastUpdatedDate;
    /**
     * <p>
     * The ARN of the web ACL associated with the stage.
     * </p>
     */
    private String webAclArn;

    /**
     * <p>
     * The identifier of the deployment that the stage points to.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the deployment that the stage points to.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the deployment that the stage points to.
     * </p>
     * 
     * @return The identifier of the deployment that the stage points to.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the deployment that the stage points to.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the deployment that the stage points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The identifier of the client certificate for the stage.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the client certificate for the stage.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the client certificate for the stage.
     * </p>
     * 
     * @return The identifier of the client certificate for the stage.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the client certificate for the stage.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the client certificate for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * A description of the stage.
     * </p>
     * 
     * @param description
     *        A description of the stage.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stage.
     * </p>
     * 
     * @return A description of the stage.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the stage.
     * </p>
     * 
     * @param description
     *        A description of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Indicates whether a cache cluster is enabled for the stage.
     */

    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>
     * Indicates whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @return Indicates whether a cache cluster is enabled for the stage.
     */

    public Boolean getCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * Indicates whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @param cacheClusterEnabled
     *        Indicates whether a cache cluster is enabled for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        setCacheClusterEnabled(cacheClusterEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether a cache cluster is enabled for the stage.
     * </p>
     * 
     * @return Indicates whether a cache cluster is enabled for the stage.
     */

    public Boolean isCacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }

    /**
     * <p>
     * If a cache cluster is enabled, the size of the cache cluster.
     * </p>
     * 
     * @param cacheClusterSize
     *        If a cache cluster is enabled, the size of the cache cluster.
     */

    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>
     * If a cache cluster is enabled, the size of the cache cluster.
     * </p>
     * 
     * @return If a cache cluster is enabled, the size of the cache cluster.
     */

    public String getCacheClusterSize() {
        return this.cacheClusterSize;
    }

    /**
     * <p>
     * If a cache cluster is enabled, the size of the cache cluster.
     * </p>
     * 
     * @param cacheClusterSize
     *        If a cache cluster is enabled, the size of the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withCacheClusterSize(String cacheClusterSize) {
        setCacheClusterSize(cacheClusterSize);
        return this;
    }

    /**
     * <p>
     * If a cache cluster is enabled, the status of the cache cluster.
     * </p>
     * 
     * @param cacheClusterStatus
     *        If a cache cluster is enabled, the status of the cache cluster.
     */

    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }

    /**
     * <p>
     * If a cache cluster is enabled, the status of the cache cluster.
     * </p>
     * 
     * @return If a cache cluster is enabled, the status of the cache cluster.
     */

    public String getCacheClusterStatus() {
        return this.cacheClusterStatus;
    }

    /**
     * <p>
     * If a cache cluster is enabled, the status of the cache cluster.
     * </p>
     * 
     * @param cacheClusterStatus
     *        If a cache cluster is enabled, the status of the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withCacheClusterStatus(String cacheClusterStatus) {
        setCacheClusterStatus(cacheClusterStatus);
        return this;
    }

    /**
     * <p>
     * Defines the method settings for the stage.
     * </p>
     * 
     * @return Defines the method settings for the stage.
     */

    public java.util.List<AwsApiGatewayMethodSettings> getMethodSettings() {
        return methodSettings;
    }

    /**
     * <p>
     * Defines the method settings for the stage.
     * </p>
     * 
     * @param methodSettings
     *        Defines the method settings for the stage.
     */

    public void setMethodSettings(java.util.Collection<AwsApiGatewayMethodSettings> methodSettings) {
        if (methodSettings == null) {
            this.methodSettings = null;
            return;
        }

        this.methodSettings = new java.util.ArrayList<AwsApiGatewayMethodSettings>(methodSettings);
    }

    /**
     * <p>
     * Defines the method settings for the stage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMethodSettings(java.util.Collection)} or {@link #withMethodSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param methodSettings
     *        Defines the method settings for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withMethodSettings(AwsApiGatewayMethodSettings... methodSettings) {
        if (this.methodSettings == null) {
            setMethodSettings(new java.util.ArrayList<AwsApiGatewayMethodSettings>(methodSettings.length));
        }
        for (AwsApiGatewayMethodSettings ele : methodSettings) {
            this.methodSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the method settings for the stage.
     * </p>
     * 
     * @param methodSettings
     *        Defines the method settings for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withMethodSettings(java.util.Collection<AwsApiGatewayMethodSettings> methodSettings) {
        setMethodSettings(methodSettings);
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the stage.
     * </p>
     * <p>
     * Variable names can have alphanumeric and underscore characters.
     * </p>
     * <p>
     * Variable values can contain the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Uppercase and lowercase letters
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers
     * </p>
     * </li>
     * <li>
     * <p>
     * Special characters -._~:/?#&amp;=,
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map that defines the stage variables for the stage.</p>
     *         <p>
     *         Variable names can have alphanumeric and underscore characters.
     *         </p>
     *         <p>
     *         Variable values can contain the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Uppercase and lowercase letters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Numbers
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Special characters -._~:/?#&amp;=,
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the stage.
     * </p>
     * <p>
     * Variable names can have alphanumeric and underscore characters.
     * </p>
     * <p>
     * Variable values can contain the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Uppercase and lowercase letters
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers
     * </p>
     * </li>
     * <li>
     * <p>
     * Special characters -._~:/?#&amp;=,
     * </p>
     * </li>
     * </ul>
     * 
     * @param variables
     *        A map that defines the stage variables for the stage.</p>
     *        <p>
     *        Variable names can have alphanumeric and underscore characters.
     *        </p>
     *        <p>
     *        Variable values can contain the following characters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Uppercase and lowercase letters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Numbers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Special characters -._~:/?#&amp;=,
     *        </p>
     *        </li>
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the stage.
     * </p>
     * <p>
     * Variable names can have alphanumeric and underscore characters.
     * </p>
     * <p>
     * Variable values can contain the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Uppercase and lowercase letters
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers
     * </p>
     * </li>
     * <li>
     * <p>
     * Special characters -._~:/?#&amp;=,
     * </p>
     * </li>
     * </ul>
     * 
     * @param variables
     *        A map that defines the stage variables for the stage.</p>
     *        <p>
     *        Variable names can have alphanumeric and underscore characters.
     *        </p>
     *        <p>
     *        Variable values can contain the following characters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Uppercase and lowercase letters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Numbers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Special characters -._~:/?#&amp;=,
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * Add a single Variables entry
     *
     * @see AwsApiGatewayStageDetails#withVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails addVariablesEntry(String key, String value) {
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

    public AwsApiGatewayStageDetails clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The version of the API documentation that is associated with the stage.
     * </p>
     * 
     * @param documentationVersion
     *        The version of the API documentation that is associated with the stage.
     */

    public void setDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    /**
     * <p>
     * The version of the API documentation that is associated with the stage.
     * </p>
     * 
     * @return The version of the API documentation that is associated with the stage.
     */

    public String getDocumentationVersion() {
        return this.documentationVersion;
    }

    /**
     * <p>
     * The version of the API documentation that is associated with the stage.
     * </p>
     * 
     * @param documentationVersion
     *        The version of the API documentation that is associated with the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withDocumentationVersion(String documentationVersion) {
        setDocumentationVersion(documentationVersion);
        return this;
    }

    /**
     * <p>
     * Settings for logging access for the stage.
     * </p>
     * 
     * @param accessLogSettings
     *        Settings for logging access for the stage.
     */

    public void setAccessLogSettings(AwsApiGatewayAccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
    }

    /**
     * <p>
     * Settings for logging access for the stage.
     * </p>
     * 
     * @return Settings for logging access for the stage.
     */

    public AwsApiGatewayAccessLogSettings getAccessLogSettings() {
        return this.accessLogSettings;
    }

    /**
     * <p>
     * Settings for logging access for the stage.
     * </p>
     * 
     * @param accessLogSettings
     *        Settings for logging access for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withAccessLogSettings(AwsApiGatewayAccessLogSettings accessLogSettings) {
        setAccessLogSettings(accessLogSettings);
        return this;
    }

    /**
     * <p>
     * Information about settings for canary deployment in the stage.
     * </p>
     * 
     * @param canarySettings
     *        Information about settings for canary deployment in the stage.
     */

    public void setCanarySettings(AwsApiGatewayCanarySettings canarySettings) {
        this.canarySettings = canarySettings;
    }

    /**
     * <p>
     * Information about settings for canary deployment in the stage.
     * </p>
     * 
     * @return Information about settings for canary deployment in the stage.
     */

    public AwsApiGatewayCanarySettings getCanarySettings() {
        return this.canarySettings;
    }

    /**
     * <p>
     * Information about settings for canary deployment in the stage.
     * </p>
     * 
     * @param canarySettings
     *        Information about settings for canary deployment in the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withCanarySettings(AwsApiGatewayCanarySettings canarySettings) {
        setCanarySettings(canarySettings);
        return this;
    }

    /**
     * <p>
     * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     * </p>
     * 
     * @param tracingEnabled
     *        Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     */

    public void setTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
    }

    /**
     * <p>
     * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     * </p>
     * 
     * @return Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     */

    public Boolean getTracingEnabled() {
        return this.tracingEnabled;
    }

    /**
     * <p>
     * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     * </p>
     * 
     * @param tracingEnabled
     *        Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withTracingEnabled(Boolean tracingEnabled) {
        setTracingEnabled(tracingEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     * </p>
     * 
     * @return Indicates whether active tracing with AWS X-Ray is enabled for the stage.
     */

    public Boolean isTracingEnabled() {
        return this.tracingEnabled;
    }

    /**
     * <p>
     * Indicates when the stage was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdDate
     *        Indicates when the stage was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * Indicates when the stage was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the stage was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * Indicates when the stage was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdDate
     *        Indicates when the stage was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * Indicates when the stage was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastUpdatedDate
     *        Indicates when the stage was most recently updated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * Indicates when the stage was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the stage was most recently updated.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * Indicates when the stage was most recently updated.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastUpdatedDate
     *        Indicates when the stage was most recently updated.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withLastUpdatedDate(String lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The ARN of the web ACL associated with the stage.
     * </p>
     * 
     * @param webAclArn
     *        The ARN of the web ACL associated with the stage.
     */

    public void setWebAclArn(String webAclArn) {
        this.webAclArn = webAclArn;
    }

    /**
     * <p>
     * The ARN of the web ACL associated with the stage.
     * </p>
     * 
     * @return The ARN of the web ACL associated with the stage.
     */

    public String getWebAclArn() {
        return this.webAclArn;
    }

    /**
     * <p>
     * The ARN of the web ACL associated with the stage.
     * </p>
     * 
     * @param webAclArn
     *        The ARN of the web ACL associated with the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayStageDetails withWebAclArn(String webAclArn) {
        setWebAclArn(webAclArn);
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getWebAclArn() != null)
            sb.append("WebAclArn: ").append(getWebAclArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayStageDetails == false)
            return false;
        AwsApiGatewayStageDetails other = (AwsApiGatewayStageDetails) obj;
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
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getWebAclArn() == null ^ this.getWebAclArn() == null)
            return false;
        if (other.getWebAclArn() != null && other.getWebAclArn().equals(this.getWebAclArn()) == false)
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
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getWebAclArn() == null) ? 0 : getWebAclArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayStageDetails clone() {
        try {
            return (AwsApiGatewayStageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayStageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
