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
 * Information about required authentication parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/AuthParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication key required to authenticate with the connector.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Indicates whether this authentication parameter is required.
     * </p>
     */
    private Boolean isRequired;
    /**
     * <p>
     * Label used for authentication parameter.
     * </p>
     */
    private String label;
    /**
     * <p>
     * A description about the authentication parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether this authentication parameter is a sensitive field.
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
     * The authentication key required to authenticate with the connector.
     * </p>
     * 
     * @param key
     *        The authentication key required to authenticate with the connector.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The authentication key required to authenticate with the connector.
     * </p>
     * 
     * @return The authentication key required to authenticate with the connector.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The authentication key required to authenticate with the connector.
     * </p>
     * 
     * @param key
     *        The authentication key required to authenticate with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether this authentication parameter is required.
     */

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is required.
     * </p>
     * 
     * @return Indicates whether this authentication parameter is required.
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether this authentication parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthParameter withIsRequired(Boolean isRequired) {
        setIsRequired(isRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is required.
     * </p>
     * 
     * @return Indicates whether this authentication parameter is required.
     */

    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Label used for authentication parameter.
     * </p>
     * 
     * @param label
     *        Label used for authentication parameter.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * Label used for authentication parameter.
     * </p>
     * 
     * @return Label used for authentication parameter.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * Label used for authentication parameter.
     * </p>
     * 
     * @param label
     *        Label used for authentication parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthParameter withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * A description about the authentication parameter.
     * </p>
     * 
     * @param description
     *        A description about the authentication parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description about the authentication parameter.
     * </p>
     * 
     * @return A description about the authentication parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description about the authentication parameter.
     * </p>
     * 
     * @param description
     *        A description about the authentication parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is a sensitive field.
     * </p>
     * 
     * @param isSensitiveField
     *        Indicates whether this authentication parameter is a sensitive field.
     */

    public void setIsSensitiveField(Boolean isSensitiveField) {
        this.isSensitiveField = isSensitiveField;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is a sensitive field.
     * </p>
     * 
     * @return Indicates whether this authentication parameter is a sensitive field.
     */

    public Boolean getIsSensitiveField() {
        return this.isSensitiveField;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is a sensitive field.
     * </p>
     * 
     * @param isSensitiveField
     *        Indicates whether this authentication parameter is a sensitive field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthParameter withIsSensitiveField(Boolean isSensitiveField) {
        setIsSensitiveField(isSensitiveField);
        return this;
    }

    /**
     * <p>
     * Indicates whether this authentication parameter is a sensitive field.
     * </p>
     * 
     * @return Indicates whether this authentication parameter is a sensitive field.
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

    public AuthParameter withConnectorSuppliedValues(String... connectorSuppliedValues) {
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

    public AuthParameter withConnectorSuppliedValues(java.util.Collection<String> connectorSuppliedValues) {
        setConnectorSuppliedValues(connectorSuppliedValues);
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
            sb.append("ConnectorSuppliedValues: ").append(getConnectorSuppliedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthParameter == false)
            return false;
        AuthParameter other = (AuthParameter) obj;
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
        return hashCode;
    }

    @Override
    public AuthParameter clone() {
        try {
            return (AuthParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.AuthParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
