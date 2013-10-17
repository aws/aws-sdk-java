/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Option settings are the actual settings being applied or configured for that option. It is used when you modify an option group or describe option
 * groups. For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called SQLNET.ENCRYPTION_SERVER that can have several different values.
 * </p>
 */
public class OptionSetting implements Serializable {

    /**
     * The name of the option that has settings that you can set.
     */
    private String name;

    /**
     * The current value of the option setting.
     */
    private String value;

    /**
     * The default value of the option setting.
     */
    private String defaultValue;

    /**
     * The description of the option setting.
     */
    private String description;

    /**
     * The DB engine specific parameter type.
     */
    private String applyType;

    /**
     * The data type of the option setting.
     */
    private String dataType;

    /**
     * The allowed values of the option setting.
     */
    private String allowedValues;

    /**
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     */
    private Boolean isModifiable;

    /**
     * Indicates if the option setting is part of a collection.
     */
    private Boolean isCollection;

    /**
     * The name of the option that has settings that you can set.
     *
     * @return The name of the option that has settings that you can set.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the option that has settings that you can set.
     *
     * @param name The name of the option that has settings that you can set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the option that has settings that you can set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the option that has settings that you can set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current value of the option setting.
     *
     * @return The current value of the option setting.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The current value of the option setting.
     *
     * @param value The current value of the option setting.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The current value of the option setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The current value of the option setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * The default value of the option setting.
     *
     * @return The default value of the option setting.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value of the option setting.
     *
     * @param defaultValue The default value of the option setting.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value of the option setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The default value of the option setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The description of the option setting.
     *
     * @return The description of the option setting.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the option setting.
     *
     * @param description The description of the option setting.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the option setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the option setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The DB engine specific parameter type.
     *
     * @return The DB engine specific parameter type.
     */
    public String getApplyType() {
        return applyType;
    }
    
    /**
     * The DB engine specific parameter type.
     *
     * @param applyType The DB engine specific parameter type.
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }
    
    /**
     * The DB engine specific parameter type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyType The DB engine specific parameter type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * The data type of the option setting.
     *
     * @return The data type of the option setting.
     */
    public String getDataType() {
        return dataType;
    }
    
    /**
     * The data type of the option setting.
     *
     * @param dataType The data type of the option setting.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    /**
     * The data type of the option setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataType The data type of the option setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The allowed values of the option setting.
     *
     * @return The allowed values of the option setting.
     */
    public String getAllowedValues() {
        return allowedValues;
    }
    
    /**
     * The allowed values of the option setting.
     *
     * @param allowedValues The allowed values of the option setting.
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }
    
    /**
     * The allowed values of the option setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowedValues The allowed values of the option setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     *
     * @return A Boolean value that, when true, indicates the option setting can be
     *         modified from the default.
     */
    public Boolean isModifiable() {
        return isModifiable;
    }
    
    /**
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     *
     * @param isModifiable A Boolean value that, when true, indicates the option setting can be
     *         modified from the default.
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }
    
    /**
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isModifiable A Boolean value that, when true, indicates the option setting can be
     *         modified from the default.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     *
     * @return A Boolean value that, when true, indicates the option setting can be
     *         modified from the default.
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * Indicates if the option setting is part of a collection.
     *
     * @return Indicates if the option setting is part of a collection.
     */
    public Boolean isCollection() {
        return isCollection;
    }
    
    /**
     * Indicates if the option setting is part of a collection.
     *
     * @param isCollection Indicates if the option setting is part of a collection.
     */
    public void setIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
    }
    
    /**
     * Indicates if the option setting is part of a collection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isCollection Indicates if the option setting is part of a collection.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionSetting withIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
        return this;
    }

    /**
     * Indicates if the option setting is part of a collection.
     *
     * @return Indicates if the option setting is part of a collection.
     */
    public Boolean getIsCollection() {
        return isCollection;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getApplyType() != null) sb.append("ApplyType: " + getApplyType() + ",");
        if (getDataType() != null) sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null) sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (isModifiable() != null) sb.append("IsModifiable: " + isModifiable() + ",");
        if (isCollection() != null) sb.append("IsCollection: " + isCollection() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isModifiable() == null) ? 0 : isModifiable().hashCode()); 
        hashCode = prime * hashCode + ((isCollection() == null) ? 0 : isCollection().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OptionSetting == false) return false;
        OptionSetting other = (OptionSetting)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getApplyType() == null ^ this.getApplyType() == null) return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false) return false; 
        if (other.getDataType() == null ^ this.getDataType() == null) return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false) return false; 
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null) return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false) return false; 
        if (other.isModifiable() == null ^ this.isModifiable() == null) return false;
        if (other.isModifiable() != null && other.isModifiable().equals(this.isModifiable()) == false) return false; 
        if (other.isCollection() == null ^ this.isCollection() == null) return false;
        if (other.isCollection() != null && other.isCollection().equals(this.isCollection()) == false) return false; 
        return true;
    }
    
}
    