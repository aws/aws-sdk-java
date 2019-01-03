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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the parameters of a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     */
    private String applyMethod;
    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     */
    private String applyType;
    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     */
    private Boolean isModifiable;
    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        Specifies the valid range of values for the parameter.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     * 
     * @return Specifies the valid range of values for the parameter.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        Specifies the valid range of values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     * 
     * @param applyMethod
     *        Indicates when parameter updates are applied.</p>
     *        <p>
     *        Can be <code>immediate</code> or <code>pending-reboot</code>.
     */

    public void setApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
    }

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     * 
     * @return Indicates when parameter updates are applied.</p>
     *         <p>
     *         Can be <code>immediate</code> or <code>pending-reboot</code>.
     */

    public String getApplyMethod() {
        return this.applyMethod;
    }

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     * 
     * @param applyMethod
     *        Indicates when parameter updates are applied.</p>
     *        <p>
     *        Can be <code>immediate</code> or <code>pending-reboot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withApplyMethod(String applyMethod) {
        setApplyMethod(applyMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     * 
     * @param applyType
     *        Specifies the engine-specific parameter type.
     */

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     * 
     * @return Specifies the engine-specific parameter type.
     */

    public String getApplyType() {
        return this.applyType;
    }

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     * 
     * @param applyType
     *        Specifies the engine-specific parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withApplyType(String applyType) {
        setApplyType(applyType);
        return this;
    }

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     * 
     * @param dataType
     *        Specifies the valid data type for the parameter.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     * 
     * @return Specifies the valid data type for the parameter.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     * 
     * @param dataType
     *        Specifies the valid data type for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     * 
     * @param description
     *        Provides a description of the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     * 
     * @return Provides a description of the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     * 
     * @param description
     *        Provides a description of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     * 
     * @param isModifiable
     *        A Boolean value indicating whether the parameter can be modified.
     */

    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     * 
     * @return A Boolean value indicating whether the parameter can be modified.
     */

    public Boolean getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     * 
     * @param isModifiable
     *        A Boolean value indicating whether the parameter can be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withIsModifiable(Boolean isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     * 
     * @return A Boolean value indicating whether the parameter can be modified.
     */

    public Boolean isModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        Specifies the name of the parameter.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     * 
     * @return Specifies the name of the parameter.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        Specifies the name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     * 
     * @param parameterValue
     *        Specifies the value of the parameter.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     * 
     * @return Specifies the value of the parameter.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     * 
     * @param parameterValue
     *        Specifies the value of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseParameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
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
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getApplyMethod() != null)
            sb.append("ApplyMethod: ").append(getApplyMethod()).append(",");
        if (getApplyType() != null)
            sb.append("ApplyType: ").append(getApplyType()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable()).append(",");
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseParameter == false)
            return false;
        RelationalDatabaseParameter other = (RelationalDatabaseParameter) obj;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getApplyMethod() == null ^ this.getApplyMethod() == null)
            return false;
        if (other.getApplyMethod() != null && other.getApplyMethod().equals(this.getApplyMethod()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getApplyMethod() == null) ? 0 : getApplyMethod().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseParameter clone() {
        try {
            return (RelationalDatabaseParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
