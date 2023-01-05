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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains response data from a property definition request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyDefinitionResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyDefinitionResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information about the data type.
     * </p>
     */
    private DataType dataType;
    /**
     * <p>
     * A Boolean value that specifies whether the property consists of time series data.
     * </p>
     */
    private Boolean isTimeSeries;
    /**
     * <p>
     * A Boolean value that specifies whether the property is required in an entity.
     * </p>
     */
    private Boolean isRequiredInEntity;
    /**
     * <p>
     * A Boolean value that specifies whether the property ID comes from an external data store.
     * </p>
     */
    private Boolean isExternalId;
    /**
     * <p>
     * A Boolean value that specifies whether the property is stored externally.
     * </p>
     */
    private Boolean isStoredExternally;
    /**
     * <p>
     * A Boolean value that specifies whether the property definition is imported from an external data store.
     * </p>
     */
    private Boolean isImported;
    /**
     * <p>
     * A Boolean value that specifies whether the property definition can be updated.
     * </p>
     */
    private Boolean isFinal;
    /**
     * <p>
     * A Boolean value that specifies whether the property definition is inherited from a parent entity.
     * </p>
     */
    private Boolean isInherited;
    /**
     * <p>
     * An object that contains the default value.
     * </p>
     */
    private DataValue defaultValue;
    /**
     * <p>
     * A mapping that specifies configuration information about the property.
     * </p>
     */
    private java.util.Map<String, String> configuration;
    /**
     * <p>
     * A friendly name for the property.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * An object that contains information about the data type.
     * </p>
     * 
     * @param dataType
     *        An object that contains information about the data type.
     */

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * An object that contains information about the data type.
     * </p>
     * 
     * @return An object that contains information about the data type.
     */

    public DataType getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * An object that contains information about the data type.
     * </p>
     * 
     * @param dataType
     *        An object that contains information about the data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withDataType(DataType dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property consists of time series data.
     * </p>
     * 
     * @param isTimeSeries
     *        A Boolean value that specifies whether the property consists of time series data.
     */

    public void setIsTimeSeries(Boolean isTimeSeries) {
        this.isTimeSeries = isTimeSeries;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property consists of time series data.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property consists of time series data.
     */

    public Boolean getIsTimeSeries() {
        return this.isTimeSeries;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property consists of time series data.
     * </p>
     * 
     * @param isTimeSeries
     *        A Boolean value that specifies whether the property consists of time series data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsTimeSeries(Boolean isTimeSeries) {
        setIsTimeSeries(isTimeSeries);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property consists of time series data.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property consists of time series data.
     */

    public Boolean isTimeSeries() {
        return this.isTimeSeries;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is required in an entity.
     * </p>
     * 
     * @param isRequiredInEntity
     *        A Boolean value that specifies whether the property is required in an entity.
     */

    public void setIsRequiredInEntity(Boolean isRequiredInEntity) {
        this.isRequiredInEntity = isRequiredInEntity;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is required in an entity.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property is required in an entity.
     */

    public Boolean getIsRequiredInEntity() {
        return this.isRequiredInEntity;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is required in an entity.
     * </p>
     * 
     * @param isRequiredInEntity
     *        A Boolean value that specifies whether the property is required in an entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsRequiredInEntity(Boolean isRequiredInEntity) {
        setIsRequiredInEntity(isRequiredInEntity);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is required in an entity.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property is required in an entity.
     */

    public Boolean isRequiredInEntity() {
        return this.isRequiredInEntity;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property ID comes from an external data store.
     * </p>
     * 
     * @param isExternalId
     *        A Boolean value that specifies whether the property ID comes from an external data store.
     */

    public void setIsExternalId(Boolean isExternalId) {
        this.isExternalId = isExternalId;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property ID comes from an external data store.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property ID comes from an external data store.
     */

    public Boolean getIsExternalId() {
        return this.isExternalId;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property ID comes from an external data store.
     * </p>
     * 
     * @param isExternalId
     *        A Boolean value that specifies whether the property ID comes from an external data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsExternalId(Boolean isExternalId) {
        setIsExternalId(isExternalId);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property ID comes from an external data store.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property ID comes from an external data store.
     */

    public Boolean isExternalId() {
        return this.isExternalId;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is stored externally.
     * </p>
     * 
     * @param isStoredExternally
     *        A Boolean value that specifies whether the property is stored externally.
     */

    public void setIsStoredExternally(Boolean isStoredExternally) {
        this.isStoredExternally = isStoredExternally;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is stored externally.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property is stored externally.
     */

    public Boolean getIsStoredExternally() {
        return this.isStoredExternally;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is stored externally.
     * </p>
     * 
     * @param isStoredExternally
     *        A Boolean value that specifies whether the property is stored externally.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsStoredExternally(Boolean isStoredExternally) {
        setIsStoredExternally(isStoredExternally);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property is stored externally.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property is stored externally.
     */

    public Boolean isStoredExternally() {
        return this.isStoredExternally;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is imported from an external data store.
     * </p>
     * 
     * @param isImported
     *        A Boolean value that specifies whether the property definition is imported from an external data store.
     */

    public void setIsImported(Boolean isImported) {
        this.isImported = isImported;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is imported from an external data store.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property definition is imported from an external data store.
     */

    public Boolean getIsImported() {
        return this.isImported;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is imported from an external data store.
     * </p>
     * 
     * @param isImported
     *        A Boolean value that specifies whether the property definition is imported from an external data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsImported(Boolean isImported) {
        setIsImported(isImported);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is imported from an external data store.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property definition is imported from an external data store.
     */

    public Boolean isImported() {
        return this.isImported;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition can be updated.
     * </p>
     * 
     * @param isFinal
     *        A Boolean value that specifies whether the property definition can be updated.
     */

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition can be updated.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property definition can be updated.
     */

    public Boolean getIsFinal() {
        return this.isFinal;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition can be updated.
     * </p>
     * 
     * @param isFinal
     *        A Boolean value that specifies whether the property definition can be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsFinal(Boolean isFinal) {
        setIsFinal(isFinal);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition can be updated.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property definition can be updated.
     */

    public Boolean isFinal() {
        return this.isFinal;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is inherited from a parent entity.
     * </p>
     * 
     * @param isInherited
     *        A Boolean value that specifies whether the property definition is inherited from a parent entity.
     */

    public void setIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is inherited from a parent entity.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property definition is inherited from a parent entity.
     */

    public Boolean getIsInherited() {
        return this.isInherited;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is inherited from a parent entity.
     * </p>
     * 
     * @param isInherited
     *        A Boolean value that specifies whether the property definition is inherited from a parent entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withIsInherited(Boolean isInherited) {
        setIsInherited(isInherited);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the property definition is inherited from a parent entity.
     * </p>
     * 
     * @return A Boolean value that specifies whether the property definition is inherited from a parent entity.
     */

    public Boolean isInherited() {
        return this.isInherited;
    }

    /**
     * <p>
     * An object that contains the default value.
     * </p>
     * 
     * @param defaultValue
     *        An object that contains the default value.
     */

    public void setDefaultValue(DataValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * An object that contains the default value.
     * </p>
     * 
     * @return An object that contains the default value.
     */

    public DataValue getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * An object that contains the default value.
     * </p>
     * 
     * @param defaultValue
     *        An object that contains the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withDefaultValue(DataValue defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * A mapping that specifies configuration information about the property.
     * </p>
     * 
     * @return A mapping that specifies configuration information about the property.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * A mapping that specifies configuration information about the property.
     * </p>
     * 
     * @param configuration
     *        A mapping that specifies configuration information about the property.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * A mapping that specifies configuration information about the property.
     * </p>
     * 
     * @param configuration
     *        A mapping that specifies configuration information about the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Add a single Configuration entry
     *
     * @see PropertyDefinitionResponse#withConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse addConfigurationEntry(String key, String value) {
        if (null == this.configuration) {
            this.configuration = new java.util.HashMap<String, String>();
        }
        if (this.configuration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configuration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configuration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * <p>
     * A friendly name for the property.
     * </p>
     * 
     * @param displayName
     *        A friendly name for the property.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A friendly name for the property.
     * </p>
     * 
     * @return A friendly name for the property.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A friendly name for the property.
     * </p>
     * 
     * @param displayName
     *        A friendly name for the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyDefinitionResponse withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getIsTimeSeries() != null)
            sb.append("IsTimeSeries: ").append(getIsTimeSeries()).append(",");
        if (getIsRequiredInEntity() != null)
            sb.append("IsRequiredInEntity: ").append(getIsRequiredInEntity()).append(",");
        if (getIsExternalId() != null)
            sb.append("IsExternalId: ").append(getIsExternalId()).append(",");
        if (getIsStoredExternally() != null)
            sb.append("IsStoredExternally: ").append(getIsStoredExternally()).append(",");
        if (getIsImported() != null)
            sb.append("IsImported: ").append(getIsImported()).append(",");
        if (getIsFinal() != null)
            sb.append("IsFinal: ").append(getIsFinal()).append(",");
        if (getIsInherited() != null)
            sb.append("IsInherited: ").append(getIsInherited()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyDefinitionResponse == false)
            return false;
        PropertyDefinitionResponse other = (PropertyDefinitionResponse) obj;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getIsTimeSeries() == null ^ this.getIsTimeSeries() == null)
            return false;
        if (other.getIsTimeSeries() != null && other.getIsTimeSeries().equals(this.getIsTimeSeries()) == false)
            return false;
        if (other.getIsRequiredInEntity() == null ^ this.getIsRequiredInEntity() == null)
            return false;
        if (other.getIsRequiredInEntity() != null && other.getIsRequiredInEntity().equals(this.getIsRequiredInEntity()) == false)
            return false;
        if (other.getIsExternalId() == null ^ this.getIsExternalId() == null)
            return false;
        if (other.getIsExternalId() != null && other.getIsExternalId().equals(this.getIsExternalId()) == false)
            return false;
        if (other.getIsStoredExternally() == null ^ this.getIsStoredExternally() == null)
            return false;
        if (other.getIsStoredExternally() != null && other.getIsStoredExternally().equals(this.getIsStoredExternally()) == false)
            return false;
        if (other.getIsImported() == null ^ this.getIsImported() == null)
            return false;
        if (other.getIsImported() != null && other.getIsImported().equals(this.getIsImported()) == false)
            return false;
        if (other.getIsFinal() == null ^ this.getIsFinal() == null)
            return false;
        if (other.getIsFinal() != null && other.getIsFinal().equals(this.getIsFinal()) == false)
            return false;
        if (other.getIsInherited() == null ^ this.getIsInherited() == null)
            return false;
        if (other.getIsInherited() != null && other.getIsInherited().equals(this.getIsInherited()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getIsTimeSeries() == null) ? 0 : getIsTimeSeries().hashCode());
        hashCode = prime * hashCode + ((getIsRequiredInEntity() == null) ? 0 : getIsRequiredInEntity().hashCode());
        hashCode = prime * hashCode + ((getIsExternalId() == null) ? 0 : getIsExternalId().hashCode());
        hashCode = prime * hashCode + ((getIsStoredExternally() == null) ? 0 : getIsStoredExternally().hashCode());
        hashCode = prime * hashCode + ((getIsImported() == null) ? 0 : getIsImported().hashCode());
        hashCode = prime * hashCode + ((getIsFinal() == null) ? 0 : getIsFinal().hashCode());
        hashCode = prime * hashCode + ((getIsInherited() == null) ? 0 : getIsInherited().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public PropertyDefinitionResponse clone() {
        try {
            return (PropertyDefinitionResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyDefinitionResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
