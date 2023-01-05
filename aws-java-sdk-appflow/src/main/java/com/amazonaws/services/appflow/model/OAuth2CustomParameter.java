/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Custom parameter required for OAuth 2.0 authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/OAuth2CustomParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2CustomParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the custom parameter required for OAuth 2.0 authentication.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     * </p>
     */
    private Boolean isRequired;
    /**
     * <p>
     * The label of the custom parameter used for OAuth 2.0 authentication.
     * </p>
     */
    private String label;
    /**
     * <p>
     * A description about the custom parameter used for OAuth 2.0 authentication.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether this authentication custom parameter is a sensitive field.
     * </p>
     */
    private Boolean isSensitiveField;
    /**
     * <p>
     * Contains default values for this authentication parameter that are supplied by the connector.
     * </p>
     */
    private java.util.List<String> connectorSuppliedValues;
    /**
     * <p>
     * Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The key of the custom parameter required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param key
     *        The key of the custom parameter required for OAuth 2.0 authentication.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the custom parameter required for OAuth 2.0 authentication.
     * </p>
     * 
     * @return The key of the custom parameter required for OAuth 2.0 authentication.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the custom parameter required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param key
     *        The key of the custom parameter required for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     */

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     * </p>
     * 
     * @return Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withIsRequired(Boolean isRequired) {
        setIsRequired(isRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     * </p>
     * 
     * @return Indicates whether the custom parameter for OAuth 2.0 authentication is required.
     */

    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * The label of the custom parameter used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param label
     *        The label of the custom parameter used for OAuth 2.0 authentication.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label of the custom parameter used for OAuth 2.0 authentication.
     * </p>
     * 
     * @return The label of the custom parameter used for OAuth 2.0 authentication.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label of the custom parameter used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param label
     *        The label of the custom parameter used for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * A description about the custom parameter used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param description
     *        A description about the custom parameter used for OAuth 2.0 authentication.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description about the custom parameter used for OAuth 2.0 authentication.
     * </p>
     * 
     * @return A description about the custom parameter used for OAuth 2.0 authentication.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description about the custom parameter used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param description
     *        A description about the custom parameter used for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether this authentication custom parameter is a sensitive field.
     * </p>
     * 
     * @param isSensitiveField
     *        Indicates whether this authentication custom parameter is a sensitive field.
     */

    public void setIsSensitiveField(Boolean isSensitiveField) {
        this.isSensitiveField = isSensitiveField;
    }

    /**
     * <p>
     * Indicates whether this authentication custom parameter is a sensitive field.
     * </p>
     * 
     * @return Indicates whether this authentication custom parameter is a sensitive field.
     */

    public Boolean getIsSensitiveField() {
        return this.isSensitiveField;
    }

    /**
     * <p>
     * Indicates whether this authentication custom parameter is a sensitive field.
     * </p>
     * 
     * @param isSensitiveField
     *        Indicates whether this authentication custom parameter is a sensitive field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withIsSensitiveField(Boolean isSensitiveField) {
        setIsSensitiveField(isSensitiveField);
        return this;
    }

    /**
     * <p>
     * Indicates whether this authentication custom parameter is a sensitive field.
     * </p>
     * 
     * @return Indicates whether this authentication custom parameter is a sensitive field.
     */

    public Boolean isSensitiveField() {
        return this.isSensitiveField;
    }

    /**
     * <p>
     * Contains default values for this authentication parameter that are supplied by the connector.
     * </p>
     * 
     * @return Contains default values for this authentication parameter that are supplied by the connector.
     */

    public java.util.List<String> getConnectorSuppliedValues() {
        return connectorSuppliedValues;
    }

    /**
     * <p>
     * Contains default values for this authentication parameter that are supplied by the connector.
     * </p>
     * 
     * @param connectorSuppliedValues
     *        Contains default values for this authentication parameter that are supplied by the connector.
     */

    public void setConnectorSuppliedValues(java.util.Collection<String> connectorSuppliedValues) {
        if (connectorSuppliedValues == null) {
            this.connectorSuppliedValues = null;
            return;
        }

        this.connectorSuppliedValues = new java.util.ArrayList<String>(connectorSuppliedValues);
    }

    /**
     * <p>
     * Contains default values for this authentication parameter that are supplied by the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorSuppliedValues(java.util.Collection)} or
     * {@link #withConnectorSuppliedValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectorSuppliedValues
     *        Contains default values for this authentication parameter that are supplied by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withConnectorSuppliedValues(String... connectorSuppliedValues) {
        if (this.connectorSuppliedValues == null) {
            setConnectorSuppliedValues(new java.util.ArrayList<String>(connectorSuppliedValues.length));
        }
        for (String ele : connectorSuppliedValues) {
            this.connectorSuppliedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains default values for this authentication parameter that are supplied by the connector.
     * </p>
     * 
     * @param connectorSuppliedValues
     *        Contains default values for this authentication parameter that are supplied by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2CustomParameter withConnectorSuppliedValues(java.util.Collection<String> connectorSuppliedValues) {
        setConnectorSuppliedValues(connectorSuppliedValues);
        return this;
    }

    /**
     * <p>
     * Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * </p>
     * 
     * @param type
     *        Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * @see OAuth2CustomPropType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * </p>
     * 
     * @return Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * @see OAuth2CustomPropType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * </p>
     * 
     * @param type
     *        Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2CustomPropType
     */

    public OAuth2CustomParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * </p>
     * 
     * @param type
     *        Indicates whether custom parameter is used with TokenUrl or AuthUrl.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2CustomPropType
     */

    public OAuth2CustomParameter withType(OAuth2CustomPropType type) {
        this.type = type.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getIsRequired() != null)
            sb.append("IsRequired: ").append(getIsRequired()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsSensitiveField() != null)
            sb.append("IsSensitiveField: ").append(getIsSensitiveField()).append(",");
        if (getConnectorSuppliedValues() != null)
            sb.append("ConnectorSuppliedValues: ").append(getConnectorSuppliedValues()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuth2CustomParameter == false)
            return false;
        OAuth2CustomParameter other = (OAuth2CustomParameter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsSensitiveField() == null ^ this.getIsSensitiveField() == null)
            return false;
        if (other.getIsSensitiveField() != null && other.getIsSensitiveField().equals(this.getIsSensitiveField()) == false)
            return false;
        if (other.getConnectorSuppliedValues() == null ^ this.getConnectorSuppliedValues() == null)
            return false;
        if (other.getConnectorSuppliedValues() != null && other.getConnectorSuppliedValues().equals(this.getConnectorSuppliedValues()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsSensitiveField() == null) ? 0 : getIsSensitiveField().hashCode());
        hashCode = prime * hashCode + ((getConnectorSuppliedValues() == null) ? 0 : getConnectorSuppliedValues().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public OAuth2CustomParameter clone() {
        try {
            return (OAuth2CustomParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.OAuth2CustomParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
