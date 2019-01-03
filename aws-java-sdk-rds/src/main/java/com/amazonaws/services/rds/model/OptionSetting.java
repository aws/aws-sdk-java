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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Option settings are the actual settings being applied or configured for that option. It is used when you modify an
 * option group or describe option groups. For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called
 * SQLNET.ENCRYPTION_SERVER that can have several different values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OptionSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionSetting implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current value of the option setting.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The default value of the option setting.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The description of the option setting.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     */
    private String applyType;
    /**
     * <p>
     * The data type of the option setting.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be modified from the default.
     * </p>
     */
    private Boolean isModifiable;
    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     */
    private Boolean isCollection;

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     * 
     * @param name
     *        The name of the option that has settings that you can set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     * 
     * @return The name of the option that has settings that you can set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     * 
     * @param name
     *        The name of the option that has settings that you can set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     * 
     * @param value
     *        The current value of the option setting.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     * 
     * @return The current value of the option setting.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     * 
     * @param value
     *        The current value of the option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the option setting.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     * 
     * @return The default value of the option setting.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The description of the option setting.
     * </p>
     * 
     * @param description
     *        The description of the option setting.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the option setting.
     * </p>
     * 
     * @return The description of the option setting.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the option setting.
     * </p>
     * 
     * @param description
     *        The description of the option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     * 
     * @param applyType
     *        The DB engine specific parameter type.
     */

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     * 
     * @return The DB engine specific parameter type.
     */

    public String getApplyType() {
        return this.applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     * 
     * @param applyType
     *        The DB engine specific parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withApplyType(String applyType) {
        setApplyType(applyType);
        return this;
    }

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     * 
     * @param dataType
     *        The data type of the option setting.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     * 
     * @return The data type of the option setting.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     * 
     * @param dataType
     *        The data type of the option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values of the option setting.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     * 
     * @return The allowed values of the option setting.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values of the option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be modified from the default.
     * </p>
     * 
     * @param isModifiable
     *        A Boolean value that, when true, indicates the option setting can be modified from the default.
     */

    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be modified from the default.
     * </p>
     * 
     * @return A Boolean value that, when true, indicates the option setting can be modified from the default.
     */

    public Boolean getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be modified from the default.
     * </p>
     * 
     * @param isModifiable
     *        A Boolean value that, when true, indicates the option setting can be modified from the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withIsModifiable(Boolean isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be modified from the default.
     * </p>
     * 
     * @return A Boolean value that, when true, indicates the option setting can be modified from the default.
     */

    public Boolean isModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     * 
     * @param isCollection
     *        Indicates if the option setting is part of a collection.
     */

    public void setIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     * 
     * @return Indicates if the option setting is part of a collection.
     */

    public Boolean getIsCollection() {
        return this.isCollection;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     * 
     * @param isCollection
     *        Indicates if the option setting is part of a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionSetting withIsCollection(Boolean isCollection) {
        setIsCollection(isCollection);
        return this;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     * 
     * @return Indicates if the option setting is part of a collection.
     */

    public Boolean isCollection() {
        return this.isCollection;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getApplyType() != null)
            sb.append("ApplyType: ").append(getApplyType()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable()).append(",");
        if (getIsCollection() != null)
            sb.append("IsCollection: ").append(getIsCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionSetting == false)
            return false;
        OptionSetting other = (OptionSetting) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getIsCollection() == null ^ this.getIsCollection() == null)
            return false;
        if (other.getIsCollection() != null && other.getIsCollection().equals(this.getIsCollection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getIsCollection() == null) ? 0 : getIsCollection().hashCode());
        return hashCode;
    }

    @Override
    public OptionSetting clone() {
        try {
            return (OptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
