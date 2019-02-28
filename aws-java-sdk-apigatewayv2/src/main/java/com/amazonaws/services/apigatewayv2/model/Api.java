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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Api implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended
     * to this URI to form a complete path to a deployed API stage.
     * </p>
     */
    private String apiEndpoint;
    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     */
    private String apiKeySelectionExpression;
    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The description of the API.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     */
    private Boolean disableSchemaValidation;
    /**
     * <p>
     * The name of the API.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     */
    private String protocolType;
    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     */
    private String routeSelectionExpression;
    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API import.
     * </p>
     */
    private java.util.List<String> warnings;

    /**
     * <p>
     * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended
     * to this URI to form a complete path to a deployed API stage.
     * </p>
     * 
     * @param apiEndpoint
     *        The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     *        appended to this URI to form a complete path to a deployed API stage.
     */

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    /**
     * <p>
     * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended
     * to this URI to form a complete path to a deployed API stage.
     * </p>
     * 
     * @return The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     *         appended to this URI to form a complete path to a deployed API stage.
     */

    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * <p>
     * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended
     * to this URI to form a complete path to a deployed API stage.
     * </p>
     * 
     * @param apiEndpoint
     *        The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     *        appended to this URI to form a complete path to a deployed API stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withApiEndpoint(String apiEndpoint) {
        setApiEndpoint(apiEndpoint);
        return this;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * 
     * @param apiKeySelectionExpression
     *        An API key selection expression. See <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *        >API Key Selection Expressions</a>.
     */

    public void setApiKeySelectionExpression(String apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * 
     * @return An API key selection expression. See <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *         >API Key Selection Expressions</a>.
     */

    public String getApiKeySelectionExpression() {
        return this.apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * 
     * @param apiKeySelectionExpression
     *        An API key selection expression. See <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *        >API Key Selection Expressions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withApiKeySelectionExpression(String apiKeySelectionExpression) {
        setApiKeySelectionExpression(apiKeySelectionExpression);
        return this;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the API was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * 
     * @return The timestamp when the API was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the API was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * 
     * @param description
     *        The description of the API.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * 
     * @return The description of the API.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * 
     * @param description
     *        The description of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @param disableSchemaValidation
     *        Avoid validating models when creating a deployment.
     */

    public void setDisableSchemaValidation(Boolean disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @return Avoid validating models when creating a deployment.
     */

    public Boolean getDisableSchemaValidation() {
        return this.disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @param disableSchemaValidation
     *        Avoid validating models when creating a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withDisableSchemaValidation(Boolean disableSchemaValidation) {
        setDisableSchemaValidation(disableSchemaValidation);
        return this;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @return Avoid validating models when creating a deployment.
     */

    public Boolean isDisableSchemaValidation() {
        return this.disableSchemaValidation;
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

    public Api withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @param protocolType
     *        The API protocol: Currently only WEBSOCKET is supported.
     * @see ProtocolType
     */

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @return The API protocol: Currently only WEBSOCKET is supported.
     * @see ProtocolType
     */

    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @param protocolType
     *        The API protocol: Currently only WEBSOCKET is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public Api withProtocolType(String protocolType) {
        setProtocolType(protocolType);
        return this;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @param protocolType
     *        The API protocol: Currently only WEBSOCKET is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public Api withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType.toString();
        return this;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * 
     * @param routeSelectionExpression
     *        The route selection expression for the API.
     */

    public void setRouteSelectionExpression(String routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * 
     * @return The route selection expression for the API.
     */

    public String getRouteSelectionExpression() {
        return this.routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * 
     * @param routeSelectionExpression
     *        The route selection expression for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withRouteSelectionExpression(String routeSelectionExpression) {
        setRouteSelectionExpression(routeSelectionExpression);
        return this;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @param version
     *        A version identifier for the API.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @return A version identifier for the API.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @param version
     *        A version identifier for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API import.
     * </p>
     * 
     * @return The warning messages reported when failonwarnings is turned on during API import.
     */

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API import.
     * </p>
     * 
     * @param warnings
     *        The warning messages reported when failonwarnings is turned on during API import.
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        The warning messages reported when failonwarnings is turned on during API import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API import.
     * </p>
     * 
     * @param warnings
     *        The warning messages reported when failonwarnings is turned on during API import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Api withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
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
        if (getDisableSchemaValidation() != null)
            sb.append("DisableSchemaValidation: ").append(getDisableSchemaValidation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtocolType() != null)
            sb.append("ProtocolType: ").append(getProtocolType()).append(",");
        if (getRouteSelectionExpression() != null)
            sb.append("RouteSelectionExpression: ").append(getRouteSelectionExpression()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Api == false)
            return false;
        Api other = (Api) obj;
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
        if (other.getDisableSchemaValidation() == null ^ this.getDisableSchemaValidation() == null)
            return false;
        if (other.getDisableSchemaValidation() != null && other.getDisableSchemaValidation().equals(this.getDisableSchemaValidation()) == false)
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
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
        hashCode = prime * hashCode + ((getDisableSchemaValidation() == null) ? 0 : getDisableSchemaValidation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocolType() == null) ? 0 : getProtocolType().hashCode());
        hashCode = prime * hashCode + ((getRouteSelectionExpression() == null) ? 0 : getRouteSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public Api clone() {
        try {
            return (Api) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.ApiMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
