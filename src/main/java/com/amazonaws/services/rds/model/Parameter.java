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
 * This data type is used as a request parameter in the ModifyDBParameterGroup and ResetDBParameterGroup actions.
 * </p>
 * <p>
 * This data type is used as a response element in the DescribeEngineDefaultParameters and DescribeDBParameters actions.
 * </p>
 */
public class Parameter implements Serializable {

    /**
     * Specifies the name of the parameter.
     */
    private String parameterName;

    /**
     * Specifies the value of the parameter.
     */
    private String parameterValue;

    /**
     * Provides a description of the parameter.
     */
    private String description;

    /**
     * Indicates the source of the parameter value.
     */
    private String source;

    /**
     * Specifies the engine specific parameters type.
     */
    private String applyType;

    /**
     * Specifies the valid data type for the parameter.
     */
    private String dataType;

    /**
     * Specifies the valid range of values for the parameter.
     */
    private String allowedValues;

    /**
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or
     * operational implications that prevent them from being changed.
     */
    private Boolean isModifiable;

    /**
     * The earliest engine version to which the parameter can apply.
     */
    private String minimumEngineVersion;

    /**
     * Indicates when to apply parameter updates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     */
    private String applyMethod;

    /**
     * Default constructor for a new Parameter object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Parameter() {}
    
    /**
     * Specifies the name of the parameter.
     *
     * @return Specifies the name of the parameter.
     */
    public String getParameterName() {
        return parameterName;
    }
    
    /**
     * Specifies the name of the parameter.
     *
     * @param parameterName Specifies the name of the parameter.
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    
    /**
     * Specifies the name of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterName Specifies the name of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * Specifies the value of the parameter.
     *
     * @return Specifies the value of the parameter.
     */
    public String getParameterValue() {
        return parameterValue;
    }
    
    /**
     * Specifies the value of the parameter.
     *
     * @param parameterValue Specifies the value of the parameter.
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    /**
     * Specifies the value of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValue Specifies the value of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * Provides a description of the parameter.
     *
     * @return Provides a description of the parameter.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides a description of the parameter.
     *
     * @param description Provides a description of the parameter.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides a description of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides a description of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Indicates the source of the parameter value.
     *
     * @return Indicates the source of the parameter value.
     */
    public String getSource() {
        return source;
    }
    
    /**
     * Indicates the source of the parameter value.
     *
     * @param source Indicates the source of the parameter value.
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * Indicates the source of the parameter value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source Indicates the source of the parameter value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Specifies the engine specific parameters type.
     *
     * @return Specifies the engine specific parameters type.
     */
    public String getApplyType() {
        return applyType;
    }
    
    /**
     * Specifies the engine specific parameters type.
     *
     * @param applyType Specifies the engine specific parameters type.
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }
    
    /**
     * Specifies the engine specific parameters type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyType Specifies the engine specific parameters type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * Specifies the valid data type for the parameter.
     *
     * @return Specifies the valid data type for the parameter.
     */
    public String getDataType() {
        return dataType;
    }
    
    /**
     * Specifies the valid data type for the parameter.
     *
     * @param dataType Specifies the valid data type for the parameter.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    /**
     * Specifies the valid data type for the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataType Specifies the valid data type for the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Specifies the valid range of values for the parameter.
     *
     * @return Specifies the valid range of values for the parameter.
     */
    public String getAllowedValues() {
        return allowedValues;
    }
    
    /**
     * Specifies the valid range of values for the parameter.
     *
     * @param allowedValues Specifies the valid range of values for the parameter.
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }
    
    /**
     * Specifies the valid range of values for the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowedValues Specifies the valid range of values for the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or
     * operational implications that prevent them from being changed.
     *
     * @return Indicates whether (<code>true</code>) or not (<code>false</code>) the
     *         parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     */
    public Boolean isModifiable() {
        return isModifiable;
    }
    
    /**
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or
     * operational implications that prevent them from being changed.
     *
     * @param isModifiable Indicates whether (<code>true</code>) or not (<code>false</code>) the
     *         parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }
    
    /**
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or
     * operational implications that prevent them from being changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isModifiable Indicates whether (<code>true</code>) or not (<code>false</code>) the
     *         parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or
     * operational implications that prevent them from being changed.
     *
     * @return Indicates whether (<code>true</code>) or not (<code>false</code>) the
     *         parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * The earliest engine version to which the parameter can apply.
     *
     * @return The earliest engine version to which the parameter can apply.
     */
    public String getMinimumEngineVersion() {
        return minimumEngineVersion;
    }
    
    /**
     * The earliest engine version to which the parameter can apply.
     *
     * @param minimumEngineVersion The earliest engine version to which the parameter can apply.
     */
    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }
    
    /**
     * The earliest engine version to which the parameter can apply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimumEngineVersion The earliest engine version to which the parameter can apply.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
        return this;
    }

    /**
     * Indicates when to apply parameter updates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @return Indicates when to apply parameter updates.
     *
     * @see ApplyMethod
     */
    public String getApplyMethod() {
        return applyMethod;
    }
    
    /**
     * Indicates when to apply parameter updates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod Indicates when to apply parameter updates.
     *
     * @see ApplyMethod
     */
    public void setApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
    }
    
    /**
     * Indicates when to apply parameter updates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod Indicates when to apply parameter updates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ApplyMethod
     */
    public Parameter withApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
        return this;
    }

    /**
     * Indicates when to apply parameter updates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod Indicates when to apply parameter updates.
     *
     * @see ApplyMethod
     */
    public void setApplyMethod(ApplyMethod applyMethod) {
        this.applyMethod = applyMethod.toString();
    }
    
    /**
     * Indicates when to apply parameter updates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod Indicates when to apply parameter updates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ApplyMethod
     */
    public Parameter withApplyMethod(ApplyMethod applyMethod) {
        this.applyMethod = applyMethod.toString();
        return this;
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
        if (getParameterName() != null) sb.append("ParameterName: " + getParameterName() + ",");
        if (getParameterValue() != null) sb.append("ParameterValue: " + getParameterValue() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getApplyType() != null) sb.append("ApplyType: " + getApplyType() + ",");
        if (getDataType() != null) sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null) sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (isModifiable() != null) sb.append("IsModifiable: " + isModifiable() + ",");
        if (getMinimumEngineVersion() != null) sb.append("MinimumEngineVersion: " + getMinimumEngineVersion() + ",");
        if (getApplyMethod() != null) sb.append("ApplyMethod: " + getApplyMethod() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode()); 
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode()); 
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode()); 
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode()); 
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode()); 
        hashCode = prime * hashCode + ((isModifiable() == null) ? 0 : isModifiable().hashCode()); 
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getApplyMethod() == null) ? 0 : getApplyMethod().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Parameter == false) return false;
        Parameter other = (Parameter)obj;
        
        if (other.getParameterName() == null ^ this.getParameterName() == null) return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false) return false; 
        if (other.getParameterValue() == null ^ this.getParameterValue() == null) return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false; 
        if (other.getApplyType() == null ^ this.getApplyType() == null) return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false) return false; 
        if (other.getDataType() == null ^ this.getDataType() == null) return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false) return false; 
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null) return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false) return false; 
        if (other.isModifiable() == null ^ this.isModifiable() == null) return false;
        if (other.isModifiable() != null && other.isModifiable().equals(this.isModifiable()) == false) return false; 
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null) return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false) return false; 
        if (other.getApplyMethod() == null ^ this.getApplyMethod() == null) return false;
        if (other.getApplyMethod() != null && other.getApplyMethod().equals(this.getApplyMethod()) == false) return false; 
        return true;
    }
    
}
    