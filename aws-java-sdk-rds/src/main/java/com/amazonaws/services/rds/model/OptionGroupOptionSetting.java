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
 * Option group option settings are used to display settings available for each option with their default values and
 * other information. These values are used with the DescribeOptionGroupOptions action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OptionGroupOptionSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroupOptionSetting implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option group option.
     * </p>
     */
    private String settingName;
    /**
     * <p>
     * The description of the option group option.
     * </p>
     */
    private String settingDescription;
    /**
     * <p>
     * The default value for the option group option.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     */
    private String applyType;
    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     */
    private Boolean isModifiable;
    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for this option setting of the option group
     * option.
     * </p>
     */
    private Boolean isRequired;
    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed value for this option setting.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue;

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * 
     * @param settingName
     *        The name of the option group option.
     */

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * 
     * @return The name of the option group option.
     */

    public String getSettingName() {
        return this.settingName;
    }

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * 
     * @param settingName
     *        The name of the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withSettingName(String settingName) {
        setSettingName(settingName);
        return this;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * 
     * @param settingDescription
     *        The description of the option group option.
     */

    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * 
     * @return The description of the option group option.
     */

    public String getSettingDescription() {
        return this.settingDescription;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * 
     * @param settingDescription
     *        The description of the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withSettingDescription(String settingDescription) {
        setSettingDescription(settingDescription);
        return this;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the option group option.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * 
     * @return The default value for the option group option.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * 
     * @param applyType
     *        The DB engine specific parameter type for the option group option.
     */

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * 
     * @return The DB engine specific parameter type for the option group option.
     */

    public String getApplyType() {
        return this.applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * 
     * @param applyType
     *        The DB engine specific parameter type for the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withApplyType(String applyType) {
        setApplyType(applyType);
        return this;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * 
     * @param allowedValues
     *        Indicates the acceptable values for the option group option.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * 
     * @return Indicates the acceptable values for the option group option.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * 
     * @param allowedValues
     *        Indicates the acceptable values for the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @param isModifiable
     *        Boolean value where true indicates that this option group option can be changed from the default value.
     */

    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @return Boolean value where true indicates that this option group option can be changed from the default value.
     */

    public Boolean getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @param isModifiable
     *        Boolean value where true indicates that this option group option can be changed from the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withIsModifiable(Boolean isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @return Boolean value where true indicates that this option group option can be changed from the default value.
     */

    public Boolean isModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for this option setting of the option group
     * option.
     * </p>
     * 
     * @param isRequired
     *        Boolean value where true indicates that a value must be specified for this option setting of the option
     *        group option.
     */

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for this option setting of the option group
     * option.
     * </p>
     * 
     * @return Boolean value where true indicates that a value must be specified for this option setting of the option
     *         group option.
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for this option setting of the option group
     * option.
     * </p>
     * 
     * @param isRequired
     *        Boolean value where true indicates that a value must be specified for this option setting of the option
     *        group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withIsRequired(Boolean isRequired) {
        setIsRequired(isRequired);
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for this option setting of the option group
     * option.
     * </p>
     * 
     * @return Boolean value where true indicates that a value must be specified for this option setting of the option
     *         group option.
     */

    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed value for this option setting.
     * </p>
     * 
     * @return The minimum DB engine version required for the corresponding allowed value for this option setting.
     */

    public java.util.List<MinimumEngineVersionPerAllowedValue> getMinimumEngineVersionPerAllowedValue() {
        if (minimumEngineVersionPerAllowedValue == null) {
            minimumEngineVersionPerAllowedValue = new com.amazonaws.internal.SdkInternalList<MinimumEngineVersionPerAllowedValue>();
        }
        return minimumEngineVersionPerAllowedValue;
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed value for this option setting.
     * </p>
     * 
     * @param minimumEngineVersionPerAllowedValue
     *        The minimum DB engine version required for the corresponding allowed value for this option setting.
     */

    public void setMinimumEngineVersionPerAllowedValue(java.util.Collection<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue) {
        if (minimumEngineVersionPerAllowedValue == null) {
            this.minimumEngineVersionPerAllowedValue = null;
            return;
        }

        this.minimumEngineVersionPerAllowedValue = new com.amazonaws.internal.SdkInternalList<MinimumEngineVersionPerAllowedValue>(
                minimumEngineVersionPerAllowedValue);
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed value for this option setting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMinimumEngineVersionPerAllowedValue(java.util.Collection)} or
     * {@link #withMinimumEngineVersionPerAllowedValue(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param minimumEngineVersionPerAllowedValue
     *        The minimum DB engine version required for the corresponding allowed value for this option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withMinimumEngineVersionPerAllowedValue(MinimumEngineVersionPerAllowedValue... minimumEngineVersionPerAllowedValue) {
        if (this.minimumEngineVersionPerAllowedValue == null) {
            setMinimumEngineVersionPerAllowedValue(new com.amazonaws.internal.SdkInternalList<MinimumEngineVersionPerAllowedValue>(
                    minimumEngineVersionPerAllowedValue.length));
        }
        for (MinimumEngineVersionPerAllowedValue ele : minimumEngineVersionPerAllowedValue) {
            this.minimumEngineVersionPerAllowedValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed value for this option setting.
     * </p>
     * 
     * @param minimumEngineVersionPerAllowedValue
     *        The minimum DB engine version required for the corresponding allowed value for this option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withMinimumEngineVersionPerAllowedValue(
            java.util.Collection<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue) {
        setMinimumEngineVersionPerAllowedValue(minimumEngineVersionPerAllowedValue);
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
        if (getSettingName() != null)
            sb.append("SettingName: ").append(getSettingName()).append(",");
        if (getSettingDescription() != null)
            sb.append("SettingDescription: ").append(getSettingDescription()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getApplyType() != null)
            sb.append("ApplyType: ").append(getApplyType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable()).append(",");
        if (getIsRequired() != null)
            sb.append("IsRequired: ").append(getIsRequired()).append(",");
        if (getMinimumEngineVersionPerAllowedValue() != null)
            sb.append("MinimumEngineVersionPerAllowedValue: ").append(getMinimumEngineVersionPerAllowedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupOptionSetting == false)
            return false;
        OptionGroupOptionSetting other = (OptionGroupOptionSetting) obj;
        if (other.getSettingName() == null ^ this.getSettingName() == null)
            return false;
        if (other.getSettingName() != null && other.getSettingName().equals(this.getSettingName()) == false)
            return false;
        if (other.getSettingDescription() == null ^ this.getSettingDescription() == null)
            return false;
        if (other.getSettingDescription() != null && other.getSettingDescription().equals(this.getSettingDescription()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getMinimumEngineVersionPerAllowedValue() == null ^ this.getMinimumEngineVersionPerAllowedValue() == null)
            return false;
        if (other.getMinimumEngineVersionPerAllowedValue() != null
                && other.getMinimumEngineVersionPerAllowedValue().equals(this.getMinimumEngineVersionPerAllowedValue()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersionPerAllowedValue() == null) ? 0 : getMinimumEngineVersionPerAllowedValue().hashCode());
        return hashCode;
    }

    @Override
    public OptionGroupOptionSetting clone() {
        try {
            return (OptionGroupOptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
