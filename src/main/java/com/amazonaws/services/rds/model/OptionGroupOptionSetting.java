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
 * option group option settings are used to display settings available for each option with their default values and other information. These values are
 * used with the DescribeOptionGroupOptions action.
 * </p>
 */
public class OptionGroupOptionSetting implements Serializable {

    /**
     * The name of the option group option.
     */
    private String settingName;

    /**
     * The description of the option group option.
     */
    private String settingDescription;

    /**
     * The default value for the option group option.
     */
    private String defaultValue;

    /**
     * The DB engine specific parameter type for the option group option.
     */
    private String applyType;

    /**
     * Indicates the acceptable values for the option group option.
     */
    private String allowedValues;

    /**
     * Boolean value where true indicates that this option group option can
     * be changed from the default value.
     */
    private Boolean isModifiable;

    /**
     * The name of the option group option.
     *
     * @return The name of the option group option.
     */
    public String getSettingName() {
        return settingName;
    }
    
    /**
     * The name of the option group option.
     *
     * @param settingName The name of the option group option.
     */
    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }
    
    /**
     * The name of the option group option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param settingName The name of the option group option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupOptionSetting withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * The description of the option group option.
     *
     * @return The description of the option group option.
     */
    public String getSettingDescription() {
        return settingDescription;
    }
    
    /**
     * The description of the option group option.
     *
     * @param settingDescription The description of the option group option.
     */
    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
    }
    
    /**
     * The description of the option group option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param settingDescription The description of the option group option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupOptionSetting withSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
        return this;
    }

    /**
     * The default value for the option group option.
     *
     * @return The default value for the option group option.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value for the option group option.
     *
     * @param defaultValue The default value for the option group option.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value for the option group option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The default value for the option group option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupOptionSetting withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The DB engine specific parameter type for the option group option.
     *
     * @return The DB engine specific parameter type for the option group option.
     */
    public String getApplyType() {
        return applyType;
    }
    
    /**
     * The DB engine specific parameter type for the option group option.
     *
     * @param applyType The DB engine specific parameter type for the option group option.
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }
    
    /**
     * The DB engine specific parameter type for the option group option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyType The DB engine specific parameter type for the option group option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupOptionSetting withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * Indicates the acceptable values for the option group option.
     *
     * @return Indicates the acceptable values for the option group option.
     */
    public String getAllowedValues() {
        return allowedValues;
    }
    
    /**
     * Indicates the acceptable values for the option group option.
     *
     * @param allowedValues Indicates the acceptable values for the option group option.
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }
    
    /**
     * Indicates the acceptable values for the option group option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowedValues Indicates the acceptable values for the option group option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupOptionSetting withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * Boolean value where true indicates that this option group option can
     * be changed from the default value.
     *
     * @return Boolean value where true indicates that this option group option can
     *         be changed from the default value.
     */
    public Boolean isModifiable() {
        return isModifiable;
    }
    
    /**
     * Boolean value where true indicates that this option group option can
     * be changed from the default value.
     *
     * @param isModifiable Boolean value where true indicates that this option group option can
     *         be changed from the default value.
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }
    
    /**
     * Boolean value where true indicates that this option group option can
     * be changed from the default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isModifiable Boolean value where true indicates that this option group option can
     *         be changed from the default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupOptionSetting withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * Boolean value where true indicates that this option group option can
     * be changed from the default value.
     *
     * @return Boolean value where true indicates that this option group option can
     *         be changed from the default value.
     */
    public Boolean getIsModifiable() {
        return isModifiable;
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
        if (getSettingName() != null) sb.append("SettingName: " + getSettingName() + ",");
        if (getSettingDescription() != null) sb.append("SettingDescription: " + getSettingDescription() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getApplyType() != null) sb.append("ApplyType: " + getApplyType() + ",");
        if (getAllowedValues() != null) sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (isModifiable() != null) sb.append("IsModifiable: " + isModifiable() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSettingName() == null) ? 0 : getSettingName().hashCode()); 
        hashCode = prime * hashCode + ((getSettingDescription() == null) ? 0 : getSettingDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode()); 
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode()); 
        hashCode = prime * hashCode + ((isModifiable() == null) ? 0 : isModifiable().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OptionGroupOptionSetting == false) return false;
        OptionGroupOptionSetting other = (OptionGroupOptionSetting)obj;
        
        if (other.getSettingName() == null ^ this.getSettingName() == null) return false;
        if (other.getSettingName() != null && other.getSettingName().equals(this.getSettingName()) == false) return false; 
        if (other.getSettingDescription() == null ^ this.getSettingDescription() == null) return false;
        if (other.getSettingDescription() != null && other.getSettingDescription().equals(this.getSettingDescription()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getApplyType() == null ^ this.getApplyType() == null) return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false) return false; 
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null) return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false) return false; 
        if (other.isModifiable() == null ^ this.isModifiable() == null) return false;
        if (other.isModifiable() != null && other.isModifiable().equals(this.isModifiable()) == false) return false; 
        return true;
    }
    
}
    