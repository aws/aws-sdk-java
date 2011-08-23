/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

/**
 * <p>
 * A parameter that has a different value for each Cache Node Type it is
 * applied to.
 * </p>
 */
public class CacheNodeTypeSpecificParameter {

    /**
     * Specifies the name of the parameter.
     */
    private String parameterName;

    /**
     * Provides a description of the parameter.
     */
    private String description;

    /**
     * Indicates the source of the parameter value.
     */
    private String source;

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
     * A list of Cache Node types and their corresponding values for this
     * parameter.
     */
    private java.util.List<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues;

    /**
     * Default constructor for a new CacheNodeTypeSpecificParameter object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheNodeTypeSpecificParameter() {}
    
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
    public CacheNodeTypeSpecificParameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
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
    public CacheNodeTypeSpecificParameter withDescription(String description) {
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
    public CacheNodeTypeSpecificParameter withSource(String source) {
        this.source = source;
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
    public CacheNodeTypeSpecificParameter withDataType(String dataType) {
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
    public CacheNodeTypeSpecificParameter withAllowedValues(String allowedValues) {
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
    public CacheNodeTypeSpecificParameter withIsModifiable(Boolean isModifiable) {
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
    public CacheNodeTypeSpecificParameter withMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
        return this;
    }
    
    
    /**
     * A list of Cache Node types and their corresponding values for this
     * parameter.
     *
     * @return A list of Cache Node types and their corresponding values for this
     *         parameter.
     */
    public java.util.List<CacheNodeTypeSpecificValue> getCacheNodeTypeSpecificValues() {
        
        if (cacheNodeTypeSpecificValues == null) {
            cacheNodeTypeSpecificValues = new java.util.ArrayList<CacheNodeTypeSpecificValue>();
        }
        return cacheNodeTypeSpecificValues;
    }
    
    /**
     * A list of Cache Node types and their corresponding values for this
     * parameter.
     *
     * @param cacheNodeTypeSpecificValues A list of Cache Node types and their corresponding values for this
     *         parameter.
     */
    public void setCacheNodeTypeSpecificValues(java.util.Collection<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues) {
        java.util.List<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValuesCopy = new java.util.ArrayList<CacheNodeTypeSpecificValue>();
        if (cacheNodeTypeSpecificValues != null) {
            cacheNodeTypeSpecificValuesCopy.addAll(cacheNodeTypeSpecificValues);
        }
        this.cacheNodeTypeSpecificValues = cacheNodeTypeSpecificValuesCopy;
    }
    
    /**
     * A list of Cache Node types and their corresponding values for this
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificValues A list of Cache Node types and their corresponding values for this
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNodeTypeSpecificParameter withCacheNodeTypeSpecificValues(CacheNodeTypeSpecificValue... cacheNodeTypeSpecificValues) {
        if (getCacheNodeTypeSpecificValues() == null) setCacheNodeTypeSpecificValues(new java.util.ArrayList<CacheNodeTypeSpecificValue>());
        for (CacheNodeTypeSpecificValue value : cacheNodeTypeSpecificValues) {
            getCacheNodeTypeSpecificValues().add(value);
        }
        return this;
    }
    
    /**
     * A list of Cache Node types and their corresponding values for this
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificValues A list of Cache Node types and their corresponding values for this
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNodeTypeSpecificParameter withCacheNodeTypeSpecificValues(java.util.Collection<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues) {
        java.util.List<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValuesCopy = new java.util.ArrayList<CacheNodeTypeSpecificValue>();
        if (cacheNodeTypeSpecificValues != null) {
            cacheNodeTypeSpecificValuesCopy.addAll(cacheNodeTypeSpecificValues);
        }
        this.cacheNodeTypeSpecificValues = cacheNodeTypeSpecificValuesCopy;

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
        sb.append("Description: " + description + ", ");
        sb.append("Source: " + source + ", ");
        sb.append("DataType: " + dataType + ", ");
        sb.append("AllowedValues: " + allowedValues + ", ");
        sb.append("IsModifiable: " + isModifiable + ", ");
        sb.append("MinimumEngineVersion: " + minimumEngineVersion + ", ");
        sb.append("CacheNodeTypeSpecificValues: " + cacheNodeTypeSpecificValues + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    