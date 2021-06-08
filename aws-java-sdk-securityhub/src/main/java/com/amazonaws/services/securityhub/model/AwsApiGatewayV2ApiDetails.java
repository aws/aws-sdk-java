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
 * Contains information about a version 2 API in Amazon API Gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayV2ApiDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayV2ApiDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the API.
     * </p>
     * <p>
     * Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     * </p>
     * <p>
     * The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     * </p>
     */
    private String apiEndpoint;
    /**
     * <p>
     * The identifier of the API.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs.
     * </p>
     */
    private String apiKeySelectionExpression;
    /**
     * <p>
     * Indicates when the API was created.
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
     * A description of the API.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version identifier for the API.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The name of the API.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API protocol for the API.
     * </p>
     * <p>
     * Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     * </p>
     */
    private String protocolType;
    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * <p>
     * For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP APIs.
     * </p>
     * <p>
     * For WebSocket APIs, there is no default value.
     * </p>
     */
    private String routeSelectionExpression;
    /**
     * <p>
     * A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     * </p>
     */
    private AwsCorsConfiguration corsConfiguration;

    /**
     * <p>
     * The URI of the API.
     * </p>
     * <p>
     * Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     * </p>
     * <p>
     * The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     * </p>
     * 
     * @param apiEndpoint
     *        The URI of the API. </p>
     *        <p>
     *        Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     *        </p>
     *        <p>
     *        The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     */

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    /**
     * <p>
     * The URI of the API.
     * </p>
     * <p>
     * Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     * </p>
     * <p>
     * The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     * </p>
     * 
     * @return The URI of the API. </p>
     *         <p>
     *         Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     *         </p>
     *         <p>
     *         The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     */

    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * <p>
     * The URI of the API.
     * </p>
     * <p>
     * Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     * </p>
     * <p>
     * The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     * </p>
     * 
     * @param apiEndpoint
     *        The URI of the API. </p>
     *        <p>
     *        Uses the format <code> <i>&lt;api-id&gt;</i>.execute-api.<i>&lt;region&gt;</i>.amazonaws.com</code>
     *        </p>
     *        <p>
     *        The stage name is typically appended to the URI to form a complete path to a deployed API stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withApiEndpoint(String apiEndpoint) {
        setApiEndpoint(apiEndpoint);
        return this;
    }

    /**
     * <p>
     * The identifier of the API.
     * </p>
     * 
     * @param apiId
     *        The identifier of the API.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The identifier of the API.
     * </p>
     * 
     * @return The identifier of the API.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The identifier of the API.
     * </p>
     * 
     * @param apiId
     *        The identifier of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param apiKeySelectionExpression
     *        An API key selection expression. Supported only for WebSocket APIs.
     */

    public void setApiKeySelectionExpression(String apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return An API key selection expression. Supported only for WebSocket APIs.
     */

    public String getApiKeySelectionExpression() {
        return this.apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param apiKeySelectionExpression
     *        An API key selection expression. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withApiKeySelectionExpression(String apiKeySelectionExpression) {
        setApiKeySelectionExpression(apiKeySelectionExpression);
        return this;
    }

    /**
     * <p>
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdDate
     *        Indicates when the API was created.</p>
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
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the API was created.</p>
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
     * Indicates when the API was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdDate
     *        Indicates when the API was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * A description of the API.
     * </p>
     * 
     * @param description
     *        A description of the API.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the API.
     * </p>
     * 
     * @return A description of the API.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the API.
     * </p>
     * 
     * @param description
     *        A description of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version identifier for the API.
     * </p>
     * 
     * @param version
     *        The version identifier for the API.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version identifier for the API.
     * </p>
     * 
     * @return The version identifier for the API.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version identifier for the API.
     * </p>
     * 
     * @param version
     *        The version identifier for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @param name
     *        The name of the API.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @return The name of the API.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @param name
     *        The name of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API protocol for the API.
     * </p>
     * <p>
     * Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     * </p>
     * 
     * @param protocolType
     *        The API protocol for the API.</p>
     *        <p>
     *        Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     */

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * <p>
     * The API protocol for the API.
     * </p>
     * <p>
     * Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     * </p>
     * 
     * @return The API protocol for the API.</p>
     *         <p>
     *         Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     */

    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * <p>
     * The API protocol for the API.
     * </p>
     * <p>
     * Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     * </p>
     * 
     * @param protocolType
     *        The API protocol for the API.</p>
     *        <p>
     *        Valid values: <code>WEBSOCKET</code> | <code>HTTP</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withProtocolType(String protocolType) {
        setProtocolType(protocolType);
        return this;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * <p>
     * For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP APIs.
     * </p>
     * <p>
     * For WebSocket APIs, there is no default value.
     * </p>
     * 
     * @param routeSelectionExpression
     *        The route selection expression for the API.</p>
     *        <p>
     *        For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP
     *        APIs.
     *        </p>
     *        <p>
     *        For WebSocket APIs, there is no default value.
     */

    public void setRouteSelectionExpression(String routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * <p>
     * For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP APIs.
     * </p>
     * <p>
     * For WebSocket APIs, there is no default value.
     * </p>
     * 
     * @return The route selection expression for the API.</p>
     *         <p>
     *         For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP
     *         APIs.
     *         </p>
     *         <p>
     *         For WebSocket APIs, there is no default value.
     */

    public String getRouteSelectionExpression() {
        return this.routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * <p>
     * For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP APIs.
     * </p>
     * <p>
     * For WebSocket APIs, there is no default value.
     * </p>
     * 
     * @param routeSelectionExpression
     *        The route selection expression for the API.</p>
     *        <p>
     *        For HTTP APIs, must be <code>${request.method} ${request.path}</code>. This is the default value for HTTP
     *        APIs.
     *        </p>
     *        <p>
     *        For WebSocket APIs, there is no default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withRouteSelectionExpression(String routeSelectionExpression) {
        setRouteSelectionExpression(routeSelectionExpression);
        return this;
    }

    /**
     * <p>
     * A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     * </p>
     * 
     * @param corsConfiguration
     *        A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     */

    public void setCorsConfiguration(AwsCorsConfiguration corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
    }

    /**
     * <p>
     * A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     * </p>
     * 
     * @return A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     */

    public AwsCorsConfiguration getCorsConfiguration() {
        return this.corsConfiguration;
    }

    /**
     * <p>
     * A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     * </p>
     * 
     * @param corsConfiguration
     *        A cross-origin resource sharing (CORS) configuration. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2ApiDetails withCorsConfiguration(AwsCorsConfiguration corsConfiguration) {
        setCorsConfiguration(corsConfiguration);
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
        if (getApiEndpoint() != null)
            sb.append("ApiEndpoint: ").append(getApiEndpoint()).append(",");
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getApiKeySelectionExpression() != null)
            sb.append("ApiKeySelectionExpression: ").append(getApiKeySelectionExpression()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtocolType() != null)
            sb.append("ProtocolType: ").append(getProtocolType()).append(",");
        if (getRouteSelectionExpression() != null)
            sb.append("RouteSelectionExpression: ").append(getRouteSelectionExpression()).append(",");
        if (getCorsConfiguration() != null)
            sb.append("CorsConfiguration: ").append(getCorsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayV2ApiDetails == false)
            return false;
        AwsApiGatewayV2ApiDetails other = (AwsApiGatewayV2ApiDetails) obj;
        if (other.getApiEndpoint() == null ^ this.getApiEndpoint() == null)
            return false;
        if (other.getApiEndpoint() != null && other.getApiEndpoint().equals(this.getApiEndpoint()) == false)
            return false;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getApiKeySelectionExpression() == null ^ this.getApiKeySelectionExpression() == null)
            return false;
        if (other.getApiKeySelectionExpression() != null && other.getApiKeySelectionExpression().equals(this.getApiKeySelectionExpression()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocolType() == null ^ this.getProtocolType() == null)
            return false;
        if (other.getProtocolType() != null && other.getProtocolType().equals(this.getProtocolType()) == false)
            return false;
        if (other.getRouteSelectionExpression() == null ^ this.getRouteSelectionExpression() == null)
            return false;
        if (other.getRouteSelectionExpression() != null && other.getRouteSelectionExpression().equals(this.getRouteSelectionExpression()) == false)
            return false;
        if (other.getCorsConfiguration() == null ^ this.getCorsConfiguration() == null)
            return false;
        if (other.getCorsConfiguration() != null && other.getCorsConfiguration().equals(this.getCorsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiEndpoint() == null) ? 0 : getApiEndpoint().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getApiKeySelectionExpression() == null) ? 0 : getApiKeySelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocolType() == null) ? 0 : getProtocolType().hashCode());
        hashCode = prime * hashCode + ((getRouteSelectionExpression() == null) ? 0 : getRouteSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getCorsConfiguration() == null) ? 0 : getCorsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayV2ApiDetails clone() {
        try {
            return (AwsApiGatewayV2ApiDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayV2ApiDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
