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
 * Contains information about a version 2 stage for Amazon API Gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayV2StageDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayV2StageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     * </p>
     */
    private String clientCertificateId;
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
     * The description of the stage.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Default route settings for the stage.
     * </p>
     */
    private AwsApiGatewayV2RouteSettings defaultRouteSettings;
    /**
     * <p>
     * The identifier of the deployment that the stage is associated with.
     * </p>
     */
    private String deploymentId;
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
     * The route settings for the stage.
     * </p>
     */
    private AwsApiGatewayV2RouteSettings routeSettings;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;
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
    private java.util.Map<String, String> stageVariables;
    /**
     * <p>
     * Information about settings for logging access for the stage.
     * </p>
     */
    private AwsApiGatewayAccessLogSettings accessLogSettings;
    /**
     * <p>
     * Indicates whether updates to an API automatically trigger a new deployment.
     * </p>
     */
    private Boolean autoDeploy;
    /**
     * <p>
     * The status of the last deployment of a stage. Supported only if the stage has automatic deployment enabled.
     * </p>
     */
    private String lastDeploymentStatusMessage;
    /**
     * <p>
     * Indicates whether the stage is managed by API Gateway.
     * </p>
     */
    private Boolean apiGatewayManaged;

    /**
     * <p>
     * The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     * </p>
     * 
     * @return The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of a client certificate for a stage. Supported only for WebSocket API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withClientCertificateId(String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
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

    public AwsApiGatewayV2StageDetails withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
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

    public AwsApiGatewayV2StageDetails withDescription(String description) {
        setDescription(description);
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

    public void setDefaultRouteSettings(AwsApiGatewayV2RouteSettings defaultRouteSettings) {
        this.defaultRouteSettings = defaultRouteSettings;
    }

    /**
     * <p>
     * Default route settings for the stage.
     * </p>
     * 
     * @return Default route settings for the stage.
     */

    public AwsApiGatewayV2RouteSettings getDefaultRouteSettings() {
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

    public AwsApiGatewayV2StageDetails withDefaultRouteSettings(AwsApiGatewayV2RouteSettings defaultRouteSettings) {
        setDefaultRouteSettings(defaultRouteSettings);
        return this;
    }

    /**
     * <p>
     * The identifier of the deployment that the stage is associated with.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the deployment that the stage is associated with.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the deployment that the stage is associated with.
     * </p>
     * 
     * @return The identifier of the deployment that the stage is associated with.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the deployment that the stage is associated with.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the deployment that the stage is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
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

    public AwsApiGatewayV2StageDetails withLastUpdatedDate(String lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The route settings for the stage.
     * </p>
     * 
     * @param routeSettings
     *        The route settings for the stage.
     */

    public void setRouteSettings(AwsApiGatewayV2RouteSettings routeSettings) {
        this.routeSettings = routeSettings;
    }

    /**
     * <p>
     * The route settings for the stage.
     * </p>
     * 
     * @return The route settings for the stage.
     */

    public AwsApiGatewayV2RouteSettings getRouteSettings() {
        return this.routeSettings;
    }

    /**
     * <p>
     * The route settings for the stage.
     * </p>
     * 
     * @param routeSettings
     *        The route settings for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withRouteSettings(AwsApiGatewayV2RouteSettings routeSettings) {
        setRouteSettings(routeSettings);
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

    public AwsApiGatewayV2StageDetails withStageName(String stageName) {
        setStageName(stageName);
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

    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
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
     * @param stageVariables
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

    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
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
     * @param stageVariables
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

    public AwsApiGatewayV2StageDetails withStageVariables(java.util.Map<String, String> stageVariables) {
        setStageVariables(stageVariables);
        return this;
    }

    /**
     * Add a single StageVariables entry
     *
     * @see AwsApiGatewayV2StageDetails#withStageVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails addStageVariablesEntry(String key, String value) {
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

    public AwsApiGatewayV2StageDetails clearStageVariablesEntries() {
        this.stageVariables = null;
        return this;
    }

    /**
     * <p>
     * Information about settings for logging access for the stage.
     * </p>
     * 
     * @param accessLogSettings
     *        Information about settings for logging access for the stage.
     */

    public void setAccessLogSettings(AwsApiGatewayAccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
    }

    /**
     * <p>
     * Information about settings for logging access for the stage.
     * </p>
     * 
     * @return Information about settings for logging access for the stage.
     */

    public AwsApiGatewayAccessLogSettings getAccessLogSettings() {
        return this.accessLogSettings;
    }

    /**
     * <p>
     * Information about settings for logging access for the stage.
     * </p>
     * 
     * @param accessLogSettings
     *        Information about settings for logging access for the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withAccessLogSettings(AwsApiGatewayAccessLogSettings accessLogSettings) {
        setAccessLogSettings(accessLogSettings);
        return this;
    }

    /**
     * <p>
     * Indicates whether updates to an API automatically trigger a new deployment.
     * </p>
     * 
     * @param autoDeploy
     *        Indicates whether updates to an API automatically trigger a new deployment.
     */

    public void setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    /**
     * <p>
     * Indicates whether updates to an API automatically trigger a new deployment.
     * </p>
     * 
     * @return Indicates whether updates to an API automatically trigger a new deployment.
     */

    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * <p>
     * Indicates whether updates to an API automatically trigger a new deployment.
     * </p>
     * 
     * @param autoDeploy
     *        Indicates whether updates to an API automatically trigger a new deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withAutoDeploy(Boolean autoDeploy) {
        setAutoDeploy(autoDeploy);
        return this;
    }

    /**
     * <p>
     * Indicates whether updates to an API automatically trigger a new deployment.
     * </p>
     * 
     * @return Indicates whether updates to an API automatically trigger a new deployment.
     */

    public Boolean isAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * <p>
     * The status of the last deployment of a stage. Supported only if the stage has automatic deployment enabled.
     * </p>
     * 
     * @param lastDeploymentStatusMessage
     *        The status of the last deployment of a stage. Supported only if the stage has automatic deployment
     *        enabled.
     */

    public void setLastDeploymentStatusMessage(String lastDeploymentStatusMessage) {
        this.lastDeploymentStatusMessage = lastDeploymentStatusMessage;
    }

    /**
     * <p>
     * The status of the last deployment of a stage. Supported only if the stage has automatic deployment enabled.
     * </p>
     * 
     * @return The status of the last deployment of a stage. Supported only if the stage has automatic deployment
     *         enabled.
     */

    public String getLastDeploymentStatusMessage() {
        return this.lastDeploymentStatusMessage;
    }

    /**
     * <p>
     * The status of the last deployment of a stage. Supported only if the stage has automatic deployment enabled.
     * </p>
     * 
     * @param lastDeploymentStatusMessage
     *        The status of the last deployment of a stage. Supported only if the stage has automatic deployment
     *        enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withLastDeploymentStatusMessage(String lastDeploymentStatusMessage) {
        setLastDeploymentStatusMessage(lastDeploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * Indicates whether the stage is managed by API Gateway.
     * </p>
     * 
     * @param apiGatewayManaged
     *        Indicates whether the stage is managed by API Gateway.
     */

    public void setApiGatewayManaged(Boolean apiGatewayManaged) {
        this.apiGatewayManaged = apiGatewayManaged;
    }

    /**
     * <p>
     * Indicates whether the stage is managed by API Gateway.
     * </p>
     * 
     * @return Indicates whether the stage is managed by API Gateway.
     */

    public Boolean getApiGatewayManaged() {
        return this.apiGatewayManaged;
    }

    /**
     * <p>
     * Indicates whether the stage is managed by API Gateway.
     * </p>
     * 
     * @param apiGatewayManaged
     *        Indicates whether the stage is managed by API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2StageDetails withApiGatewayManaged(Boolean apiGatewayManaged) {
        setApiGatewayManaged(apiGatewayManaged);
        return this;
    }

    /**
     * <p>
     * Indicates whether the stage is managed by API Gateway.
     * </p>
     * 
     * @return Indicates whether the stage is managed by API Gateway.
     */

    public Boolean isApiGatewayManaged() {
        return this.apiGatewayManaged;
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
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: ").append(getClientCertificateId()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultRouteSettings() != null)
            sb.append("DefaultRouteSettings: ").append(getDefaultRouteSettings()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getRouteSettings() != null)
            sb.append("RouteSettings: ").append(getRouteSettings()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getStageVariables() != null)
            sb.append("StageVariables: ").append(getStageVariables()).append(",");
        if (getAccessLogSettings() != null)
            sb.append("AccessLogSettings: ").append(getAccessLogSettings()).append(",");
        if (getAutoDeploy() != null)
            sb.append("AutoDeploy: ").append(getAutoDeploy()).append(",");
        if (getLastDeploymentStatusMessage() != null)
            sb.append("LastDeploymentStatusMessage: ").append(getLastDeploymentStatusMessage()).append(",");
        if (getApiGatewayManaged() != null)
            sb.append("ApiGatewayManaged: ").append(getApiGatewayManaged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayV2StageDetails == false)
            return false;
        AwsApiGatewayV2StageDetails other = (AwsApiGatewayV2StageDetails) obj;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultRouteSettings() == null ^ this.getDefaultRouteSettings() == null)
            return false;
        if (other.getDefaultRouteSettings() != null && other.getDefaultRouteSettings().equals(this.getDefaultRouteSettings()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
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
        if (other.getAccessLogSettings() == null ^ this.getAccessLogSettings() == null)
            return false;
        if (other.getAccessLogSettings() != null && other.getAccessLogSettings().equals(this.getAccessLogSettings()) == false)
            return false;
        if (other.getAutoDeploy() == null ^ this.getAutoDeploy() == null)
            return false;
        if (other.getAutoDeploy() != null && other.getAutoDeploy().equals(this.getAutoDeploy()) == false)
            return false;
        if (other.getLastDeploymentStatusMessage() == null ^ this.getLastDeploymentStatusMessage() == null)
            return false;
        if (other.getLastDeploymentStatusMessage() != null && other.getLastDeploymentStatusMessage().equals(this.getLastDeploymentStatusMessage()) == false)
            return false;
        if (other.getApiGatewayManaged() == null ^ this.getApiGatewayManaged() == null)
            return false;
        if (other.getApiGatewayManaged() != null && other.getApiGatewayManaged().equals(this.getApiGatewayManaged()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultRouteSettings() == null) ? 0 : getDefaultRouteSettings().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getRouteSettings() == null) ? 0 : getRouteSettings().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getStageVariables() == null) ? 0 : getStageVariables().hashCode());
        hashCode = prime * hashCode + ((getAccessLogSettings() == null) ? 0 : getAccessLogSettings().hashCode());
        hashCode = prime * hashCode + ((getAutoDeploy() == null) ? 0 : getAutoDeploy().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentStatusMessage() == null) ? 0 : getLastDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getApiGatewayManaged() == null) ? 0 : getApiGatewayManaged().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayV2StageDetails clone() {
        try {
            return (AwsApiGatewayV2StageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayV2StageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
