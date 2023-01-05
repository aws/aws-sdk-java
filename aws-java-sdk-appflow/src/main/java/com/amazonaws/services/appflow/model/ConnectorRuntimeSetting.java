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
 * Contains information about the connector runtime settings that are required for flow execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorRuntimeSetting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorRuntimeSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains value information about the connector runtime setting.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Data type of the connector runtime setting.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Indicates whether this connector runtime setting is required.
     * </p>
     */
    private Boolean isRequired;
    /**
     * <p>
     * A label used for connector runtime setting.
     * </p>
     */
    private String label;
    /**
     * <p>
     * A description about the connector runtime setting.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates the scope of the connector runtime setting.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * Contains default values for the connector runtime setting that are supplied by the connector.
     * </p>
     */
    private java.util.List<String> connectorSuppliedValueOptions;

    /**
     * <p>
     * Contains value information about the connector runtime setting.
     * </p>
     * 
     * @param key
     *        Contains value information about the connector runtime setting.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Contains value information about the connector runtime setting.
     * </p>
     * 
     * @return Contains value information about the connector runtime setting.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Contains value information about the connector runtime setting.
     * </p>
     * 
     * @param key
     *        Contains value information about the connector runtime setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Data type of the connector runtime setting.
     * </p>
     * 
     * @param dataType
     *        Data type of the connector runtime setting.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Data type of the connector runtime setting.
     * </p>
     * 
     * @return Data type of the connector runtime setting.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * Data type of the connector runtime setting.
     * </p>
     * 
     * @param dataType
     *        Data type of the connector runtime setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * Indicates whether this connector runtime setting is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether this connector runtime setting is required.
     */

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether this connector runtime setting is required.
     * </p>
     * 
     * @return Indicates whether this connector runtime setting is required.
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Indicates whether this connector runtime setting is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether this connector runtime setting is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withIsRequired(Boolean isRequired) {
        setIsRequired(isRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether this connector runtime setting is required.
     * </p>
     * 
     * @return Indicates whether this connector runtime setting is required.
     */

    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * A label used for connector runtime setting.
     * </p>
     * 
     * @param label
     *        A label used for connector runtime setting.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A label used for connector runtime setting.
     * </p>
     * 
     * @return A label used for connector runtime setting.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A label used for connector runtime setting.
     * </p>
     * 
     * @param label
     *        A label used for connector runtime setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * A description about the connector runtime setting.
     * </p>
     * 
     * @param description
     *        A description about the connector runtime setting.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description about the connector runtime setting.
     * </p>
     * 
     * @return A description about the connector runtime setting.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description about the connector runtime setting.
     * </p>
     * 
     * @param description
     *        A description about the connector runtime setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates the scope of the connector runtime setting.
     * </p>
     * 
     * @param scope
     *        Indicates the scope of the connector runtime setting.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Indicates the scope of the connector runtime setting.
     * </p>
     * 
     * @return Indicates the scope of the connector runtime setting.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Indicates the scope of the connector runtime setting.
     * </p>
     * 
     * @param scope
     *        Indicates the scope of the connector runtime setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Contains default values for the connector runtime setting that are supplied by the connector.
     * </p>
     * 
     * @return Contains default values for the connector runtime setting that are supplied by the connector.
     */

    public java.util.List<String> getConnectorSuppliedValueOptions() {
        return connectorSuppliedValueOptions;
    }

    /**
     * <p>
     * Contains default values for the connector runtime setting that are supplied by the connector.
     * </p>
     * 
     * @param connectorSuppliedValueOptions
     *        Contains default values for the connector runtime setting that are supplied by the connector.
     */

    public void setConnectorSuppliedValueOptions(java.util.Collection<String> connectorSuppliedValueOptions) {
        if (connectorSuppliedValueOptions == null) {
            this.connectorSuppliedValueOptions = null;
            return;
        }

        this.connectorSuppliedValueOptions = new java.util.ArrayList<String>(connectorSuppliedValueOptions);
    }

    /**
     * <p>
     * Contains default values for the connector runtime setting that are supplied by the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorSuppliedValueOptions(java.util.Collection)} or
     * {@link #withConnectorSuppliedValueOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectorSuppliedValueOptions
     *        Contains default values for the connector runtime setting that are supplied by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withConnectorSuppliedValueOptions(String... connectorSuppliedValueOptions) {
        if (this.connectorSuppliedValueOptions == null) {
            setConnectorSuppliedValueOptions(new java.util.ArrayList<String>(connectorSuppliedValueOptions.length));
        }
        for (String ele : connectorSuppliedValueOptions) {
            this.connectorSuppliedValueOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains default values for the connector runtime setting that are supplied by the connector.
     * </p>
     * 
     * @param connectorSuppliedValueOptions
     *        Contains default values for the connector runtime setting that are supplied by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorRuntimeSetting withConnectorSuppliedValueOptions(java.util.Collection<String> connectorSuppliedValueOptions) {
        setConnectorSuppliedValueOptions(connectorSuppliedValueOptions);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getIsRequired() != null)
            sb.append("IsRequired: ").append(getIsRequired()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getConnectorSuppliedValueOptions() != null)
            sb.append("ConnectorSuppliedValueOptions: ").append(getConnectorSuppliedValueOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorRuntimeSetting == false)
            return false;
        ConnectorRuntimeSetting other = (ConnectorRuntimeSetting) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
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
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getConnectorSuppliedValueOptions() == null ^ this.getConnectorSuppliedValueOptions() == null)
            return false;
        if (other.getConnectorSuppliedValueOptions() != null
                && other.getConnectorSuppliedValueOptions().equals(this.getConnectorSuppliedValueOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getConnectorSuppliedValueOptions() == null) ? 0 : getConnectorSuppliedValueOptions().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorRuntimeSetting clone() {
        try {
            return (ConnectorRuntimeSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorRuntimeSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
