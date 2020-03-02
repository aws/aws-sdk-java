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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     */
    private AccessLogSettings accessLogSettings;
    /**
     * <p>
     * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage
     * is managed by API Gateway. You can't modify the $default stage.
     * </p>
     */
    private Boolean apiGatewayManaged;
    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     * </p>
     */
    private Boolean autoDeploy;
    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     * </p>
     */
    private String clientCertificateId;
    /**
     * <p>
     * The timestamp when the stage was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * Default route settings for the stage.
     * </p>
     */
    private RouteSettings defaultRouteSettings;
    /**
     * <p>
     * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The description of the stage.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
     * </p>
     */
    private String lastDeploymentStatusMessage;
    /**
     * <p>
     * The timestamp when the stage was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     */
    private java.util.Map<String, RouteSettings> routeSettings;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore
     * characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket APIs.
     * </p>
     */
    private java.util.Map<String, String> stageVariables;
    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
     * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage
     * is managed by API Gateway. You can't modify the $default stage.
     * </p>
     * 
     * @param apiGatewayManaged
     *        Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the
     *        $default stage is managed by API Gateway. You can't modify the $default stage.
     */

    public void setApiGatewayManaged(Boolean apiGatewayManaged) {
        this.apiGatewayManaged = apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage
     * is managed by API Gateway. You can't modify the $default stage.
     * </p>
     * 
     * @return Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the
     *         $default stage is managed by API Gateway. You can't modify the $default stage.
     */

    public Boolean getApiGatewayManaged() {
        return this.apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage
     * is managed by API Gateway. You can't modify the $default stage.
     * </p>
     * 
     * @param apiGatewayManaged
     *        Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the
     *        $default stage is managed by API Gateway. You can't modify the $default stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withApiGatewayManaged(Boolean apiGatewayManaged) {
        setApiGatewayManaged(apiGatewayManaged);
        return this;
    }

    /**
     * <p>
     * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage
     * is managed by API Gateway. You can't modify the $default stage.
     * </p>
     * 
     * @return Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the
     *         $default stage is managed by API Gateway. You can't modify the $default stage.
     */

    public Boolean isApiGatewayManaged() {
        return this.apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     * </p>
     * 
     * @param autoDeploy
     *        Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     */

    public void setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     * </p>
     * 
     * @return Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     */

    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     * </p>
     * 
     * @param autoDeploy
     *        Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withAutoDeploy(Boolean autoDeploy) {
        setAutoDeploy(autoDeploy);
        return this;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     * </p>
     * 
     * @return Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
     */

    public Boolean isAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
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
     * Default route settings for the stage.
     * </p>
     * 
     * @param defaultRouteSettings
     *        Default route settings for the stage.
     */

    public void setDefaultRouteSettings(RouteSettings defaultRouteSettings) {
        this.defaultRouteSettings = defaultRouteSettings;
    }

    /**
     * <p>
     * Default route settings for the stage.
     * </p>
     * 
     * @return Default route settings for the stage.
     */

    public RouteSettings getDefaultRouteSettings() {
        return this.defaultRouteSettings;
    }

    /**
     * <p>
     * Default route settings for the stage.
     * </p>
     * 
     * @param defaultRouteSettings
     *        Default route settings for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withDefaultRouteSettings(RouteSettings defaultRouteSettings) {
        setDefaultRouteSettings(defaultRouteSettings);
        return this;
    }

    /**
     * <p>
     * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is
     *        enabled.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
     * </p>
     * 
     * @return The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is
     *         enabled.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is
     *        enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @param description
     *        The description of the stage.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @return The description of the stage.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @param description
     *        The description of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
     * </p>
     * 
     * @param lastDeploymentStatusMessage
     *        Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
     */

    public void setLastDeploymentStatusMessage(String lastDeploymentStatusMessage) {
        this.lastDeploymentStatusMessage = lastDeploymentStatusMessage;
    }

    /**
     * <p>
     * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
     * </p>
     * 
     * @return Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy
     *         enabled.
     */

    public String getLastDeploymentStatusMessage() {
        return this.lastDeploymentStatusMessage;
    }

    /**
     * <p>
     * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
     * </p>
     * 
     * @param lastDeploymentStatusMessage
     *        Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withLastDeploymentStatusMessage(String lastDeploymentStatusMessage) {
        setLastDeploymentStatusMessage(lastDeploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp when the stage was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The timestamp when the stage was last updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the stage was last updated.
     * </p>
     * 
     * @return The timestamp when the stage was last updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The timestamp when the stage was last updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The timestamp when the stage was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     * 
     * @return Route settings for the stage, by routeKey.
     */

    public java.util.Map<String, RouteSettings> getRouteSettings() {
        return routeSettings;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     * 
     * @param routeSettings
     *        Route settings for the stage, by routeKey.
     */

    public void setRouteSettings(java.util.Map<String, RouteSettings> routeSettings) {
        this.routeSettings = routeSettings;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     * 
     * @param routeSettings
     *        Route settings for the stage, by routeKey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withRouteSettings(java.util.Map<String, RouteSettings> routeSettings) {
        setRouteSettings(routeSettings);
        return this;
    }

    /**
     * Add a single RouteSettings entry
     *
     * @see GetStageResult#withRouteSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult addRouteSettingsEntry(String key, RouteSettings value) {
        if (null == this.routeSettings) {
            this.routeSettings = new java.util.HashMap<String, RouteSettings>();
        }
        if (this.routeSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.routeSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RouteSettings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult clearRouteSettingsEntries() {
        this.routeSettings = null;
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

    public GetStageResult withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore
     * characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and
     *         underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for
     *         WebSocket APIs.
     */

    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
    }

    /**
     * <p>
     * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore
     * characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param stageVariables
     *        A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and
     *        underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket
     *        APIs.
     */

    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    /**
     * <p>
     * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore
     * characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param stageVariables
     *        A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and
     *        underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+. Supported only for WebSocket
     *        APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult withStageVariables(java.util.Map<String, String> stageVariables) {
        setStageVariables(stageVariables);
        return this;
    }

    /**
     * Add a single StageVariables entry
     *
     * @see GetStageResult#withStageVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult addStageVariablesEntry(String key, String value) {
        if (null == this.stageVariables) {
            this.stageVariables = new java.util.HashMap<String, String>();
        }
        if (this.stageVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.stageVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StageVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStageResult clearStageVariablesEntries() {
        this.stageVariables = null;
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

    /**
     * Add a single Tags entry
     *
     * @see GetStageResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

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
        if (getAccessLogSettings() != null)
            sb.append("AccessLogSettings: ").append(getAccessLogSettings()).append(",");
        if (getApiGatewayManaged() != null)
            sb.append("ApiGatewayManaged: ").append(getApiGatewayManaged()).append(",");
        if (getAutoDeploy() != null)
            sb.append("AutoDeploy: ").append(getAutoDeploy()).append(",");
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: ").append(getClientCertificateId()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDefaultRouteSettings() != null)
            sb.append("DefaultRouteSettings: ").append(getDefaultRouteSettings()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastDeploymentStatusMessage() != null)
            sb.append("LastDeploymentStatusMessage: ").append(getLastDeploymentStatusMessage()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getRouteSettings() != null)
            sb.append("RouteSettings: ").append(getRouteSettings()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getStageVariables() != null)
            sb.append("StageVariables: ").append(getStageVariables()).append(",");
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

        if (obj instanceof GetStageResult == false)
            return false;
        GetStageResult other = (GetStageResult) obj;
        if (other.getAccessLogSettings() == null ^ this.getAccessLogSettings() == null)
            return false;
        if (other.getAccessLogSettings() != null && other.getAccessLogSettings().equals(this.getAccessLogSettings()) == false)
            return false;
        if (other.getApiGatewayManaged() == null ^ this.getApiGatewayManaged() == null)
            return false;
        if (other.getApiGatewayManaged() != null && other.getApiGatewayManaged().equals(this.getApiGatewayManaged()) == false)
            return false;
        if (other.getAutoDeploy() == null ^ this.getAutoDeploy() == null)
            return false;
        if (other.getAutoDeploy() != null && other.getAutoDeploy().equals(this.getAutoDeploy()) == false)
            return false;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDefaultRouteSettings() == null ^ this.getDefaultRouteSettings() == null)
            return false;
        if (other.getDefaultRouteSettings() != null && other.getDefaultRouteSettings().equals(this.getDefaultRouteSettings()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastDeploymentStatusMessage() == null ^ this.getLastDeploymentStatusMessage() == null)
            return false;
        if (other.getLastDeploymentStatusMessage() != null && other.getLastDeploymentStatusMessage().equals(this.getLastDeploymentStatusMessage()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getRouteSettings() == null ^ this.getRouteSettings() == null)
            return false;
        if (other.getRouteSettings() != null && other.getRouteSettings().equals(this.getRouteSettings()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getStageVariables() == null ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null && other.getStageVariables().equals(this.getStageVariables()) == false)
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

        hashCode = prime * hashCode + ((getAccessLogSettings() == null) ? 0 : getAccessLogSettings().hashCode());
        hashCode = prime * hashCode + ((getApiGatewayManaged() == null) ? 0 : getApiGatewayManaged().hashCode());
        hashCode = prime * hashCode + ((getAutoDeploy() == null) ? 0 : getAutoDeploy().hashCode());
        hashCode = prime * hashCode + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteSettings() == null) ? 0 : getDefaultRouteSettings().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentStatusMessage() == null) ? 0 : getLastDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getRouteSettings() == null) ? 0 : getRouteSettings().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getStageVariables() == null) ? 0 : getStageVariables().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
