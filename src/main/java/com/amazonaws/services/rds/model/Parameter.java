/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * 
 * </p>
 */
public class Parameter {

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
     * Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     * can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
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
     * Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     * can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     *
     * @return Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     *         can be modified. Some parameters have security or operational
     *         implications that prevent them from being changed.
     */
    public Boolean isModifiable() {
        return isModifiable;
    }
    
    /**
     * Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     * can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     *
     * @param isModifiable Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     *         can be modified. Some parameters have security or operational
     *         implications that prevent them from being changed.
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }
    
    /**
     * Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     * can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isModifiable Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     *         can be modified. Some parameters have security or operational
     *         implications that prevent them from being changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Parameter withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }
    
    
    /**
     * Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     * can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     *
     * @return Indicates whether (<i>true</i>) or not (<i>false</i>) the parameter
     *         can be modified. Some parameters have security or operational
     *         implications that prevent them from being changed.
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
        sb.append("ParameterName: " + parameterName + ", ");
        sb.append("ParameterValue: " + parameterValue + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("Source: " + source + ", ");
        sb.append("ApplyType: " + applyType + ", ");
        sb.append("DataType: " + dataType + ", ");
        sb.append("AllowedValues: " + allowedValues + ", ");
        sb.append("IsModifiable: " + isModifiable + ", ");
        sb.append("MinimumEngineVersion: " + minimumEngineVersion + ", ");
        sb.append("ApplyMethod: " + applyMethod + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    