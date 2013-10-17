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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a parameter in a cluster parameter group.
 * </p>
 */
public class Parameter implements Serializable {

    /**
     * The name of the parameter.
     */
    private String parameterName;

    /**
     * The value of the parameter.
     */
    private String parameterValue;

    /**
     * A description of the parameter.
     */
    private String description;

    /**
     * The source of the parameter value, such as "engine-default" or "user".
     */
    private String source;

    /**
     * The data type of the parameter.
     */
    private String dataType;

    /**
     * The valid range of values for the parameter.
     */
    private String allowedValues;

    /**
     * If <code>true</code>, the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being
     * changed.
     */
    private Boolean isModifiable;

    /**
     * The earliest engine version to which the parameter can apply.
     */
    private String minimumEngineVersion;

    /**
     * The name of the parameter.
     *
     * @return The name of the parameter.
     */
    public String getParameterName() {
        return parameterName;
    }
    
    /**
     * The name of the parameter.
     *
     * @param parameterName The name of the parameter.
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    
    /**
     * The name of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterName The name of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * The value of the parameter.
     *
     * @return The value of the parameter.
     */
    public String getParameterValue() {
        return parameterValue;
    }
    
    /**
     * The value of the parameter.
     *
     * @param parameterValue The value of the parameter.
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    /**
     * The value of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValue The value of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * A description of the parameter.
     *
     * @return A description of the parameter.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the parameter.
     *
     * @param description A description of the parameter.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The source of the parameter value, such as "engine-default" or "user".
     *
     * @return The source of the parameter value, such as "engine-default" or "user".
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The source of the parameter value, such as "engine-default" or "user".
     *
     * @param source The source of the parameter value, such as "engine-default" or "user".
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The source of the parameter value, such as "engine-default" or "user".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The source of the parameter value, such as "engine-default" or "user".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * The data type of the parameter.
     *
     * @return The data type of the parameter.
     */
    public String getDataType() {
        return dataType;
    }
    
    /**
     * The data type of the parameter.
     *
     * @param dataType The data type of the parameter.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    /**
     * The data type of the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataType The data type of the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * The valid range of values for the parameter.
     *
     * @return The valid range of values for the parameter.
     */
    public String getAllowedValues() {
        return allowedValues;
    }
    
    /**
     * The valid range of values for the parameter.
     *
     * @param allowedValues The valid range of values for the parameter.
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }
    
    /**
     * The valid range of values for the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowedValues The valid range of values for the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * If <code>true</code>, the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being
     * changed.
     *
     * @return If <code>true</code>, the parameter can be modified. Some parameters
     *         have security or operational implications that prevent them from being
     *         changed.
     */
    public Boolean isModifiable() {
        return isModifiable;
    }
    
    /**
     * If <code>true</code>, the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being
     * changed.
     *
     * @param isModifiable If <code>true</code>, the parameter can be modified. Some parameters
     *         have security or operational implications that prevent them from being
     *         changed.
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }
    
    /**
     * If <code>true</code>, the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being
     * changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isModifiable If <code>true</code>, the parameter can be modified. Some parameters
     *         have security or operational implications that prevent them from being
     *         changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * If <code>true</code>, the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being
     * changed.
     *
     * @return If <code>true</code>, the parameter can be modified. Some parameters
     *         have security or operational implications that prevent them from being
     *         changed.
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
        if (getDataType() != null) sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null) sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (isModifiable() != null) sb.append("IsModifiable: " + isModifiable() + ",");
        if (getMinimumEngineVersion() != null) sb.append("MinimumEngineVersion: " + getMinimumEngineVersion() );
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
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode()); 
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode()); 
        hashCode = prime * hashCode + ((isModifiable() == null) ? 0 : isModifiable().hashCode()); 
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode()); 
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
        if (other.getDataType() == null ^ this.getDataType() == null) return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false) return false; 
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null) return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false) return false; 
        if (other.isModifiable() == null ^ this.isModifiable() == null) return false;
        if (other.isModifiable() != null && other.isModifiable().equals(this.isModifiable()) == false) return false; 
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null) return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false) return false; 
        return true;
    }
    
}
    