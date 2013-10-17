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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * A parameter that has a different value for each cache node type it is applied to. For example, in a Redis cache cluster, a <i>cache.m1.large</i> cache
 * node type would have a larger <i>maxmemory</i> value than a <i>cache.m1.small</i> type.
 * </p>
 */
public class CacheNodeTypeSpecificParameter implements Serializable {

    /**
     * The name of the parameter.
     */
    private String parameterName;

    /**
     * A description of the parameter.
     */
    private String description;

    /**
     * The source of the parameter value.
     */
    private String source;

    /**
     * The valid data type for the parameter.
     */
    private String dataType;

    /**
     * The valid range of values for the parameter.
     */
    private String allowedValues;

    /**
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or
     * operational implications that prevent them from being changed.
     */
    private Boolean isModifiable;

    /**
     * The earliest cache engine version to which the parameter can apply.
     */
    private String minimumEngineVersion;

    /**
     * A list of cache node types and their corresponding values for this
     * parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues;

    /**
     * Default constructor for a new CacheNodeTypeSpecificParameter object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheNodeTypeSpecificParameter() {}
    
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
    public CacheNodeTypeSpecificParameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
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
    public CacheNodeTypeSpecificParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The source of the parameter value.
     *
     * @return The source of the parameter value.
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The source of the parameter value.
     *
     * @param source The source of the parameter value.
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The source of the parameter value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The source of the parameter value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificParameter withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * The valid data type for the parameter.
     *
     * @return The valid data type for the parameter.
     */
    public String getDataType() {
        return dataType;
    }
    
    /**
     * The valid data type for the parameter.
     *
     * @param dataType The valid data type for the parameter.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    
    /**
     * The valid data type for the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataType The valid data type for the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificParameter withDataType(String dataType) {
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
     * The earliest cache engine version to which the parameter can apply.
     *
     * @return The earliest cache engine version to which the parameter can apply.
     */
    public String getMinimumEngineVersion() {
        return minimumEngineVersion;
    }
    
    /**
     * The earliest cache engine version to which the parameter can apply.
     *
     * @param minimumEngineVersion The earliest cache engine version to which the parameter can apply.
     */
    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }
    
    /**
     * The earliest cache engine version to which the parameter can apply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimumEngineVersion The earliest cache engine version to which the parameter can apply.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificParameter withMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
        return this;
    }

    /**
     * A list of cache node types and their corresponding values for this
     * parameter.
     *
     * @return A list of cache node types and their corresponding values for this
     *         parameter.
     */
    public java.util.List<CacheNodeTypeSpecificValue> getCacheNodeTypeSpecificValues() {
        if (cacheNodeTypeSpecificValues == null) {
              cacheNodeTypeSpecificValues = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificValue>();
              cacheNodeTypeSpecificValues.setAutoConstruct(true);
        }
        return cacheNodeTypeSpecificValues;
    }
    
    /**
     * A list of cache node types and their corresponding values for this
     * parameter.
     *
     * @param cacheNodeTypeSpecificValues A list of cache node types and their corresponding values for this
     *         parameter.
     */
    public void setCacheNodeTypeSpecificValues(java.util.Collection<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues) {
        if (cacheNodeTypeSpecificValues == null) {
            this.cacheNodeTypeSpecificValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificValue>(cacheNodeTypeSpecificValues.size());
        cacheNodeTypeSpecificValuesCopy.addAll(cacheNodeTypeSpecificValues);
        this.cacheNodeTypeSpecificValues = cacheNodeTypeSpecificValuesCopy;
    }
    
    /**
     * A list of cache node types and their corresponding values for this
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificValues A list of cache node types and their corresponding values for this
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificParameter withCacheNodeTypeSpecificValues(CacheNodeTypeSpecificValue... cacheNodeTypeSpecificValues) {
        if (getCacheNodeTypeSpecificValues() == null) setCacheNodeTypeSpecificValues(new java.util.ArrayList<CacheNodeTypeSpecificValue>(cacheNodeTypeSpecificValues.length));
        for (CacheNodeTypeSpecificValue value : cacheNodeTypeSpecificValues) {
            getCacheNodeTypeSpecificValues().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache node types and their corresponding values for this
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificValues A list of cache node types and their corresponding values for this
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNodeTypeSpecificParameter withCacheNodeTypeSpecificValues(java.util.Collection<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues) {
        if (cacheNodeTypeSpecificValues == null) {
            this.cacheNodeTypeSpecificValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNodeTypeSpecificValue>(cacheNodeTypeSpecificValues.size());
            cacheNodeTypeSpecificValuesCopy.addAll(cacheNodeTypeSpecificValues);
            this.cacheNodeTypeSpecificValues = cacheNodeTypeSpecificValuesCopy;
        }

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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getDataType() != null) sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null) sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (isModifiable() != null) sb.append("IsModifiable: " + isModifiable() + ",");
        if (getMinimumEngineVersion() != null) sb.append("MinimumEngineVersion: " + getMinimumEngineVersion() + ",");
        if (getCacheNodeTypeSpecificValues() != null) sb.append("CacheNodeTypeSpecificValues: " + getCacheNodeTypeSpecificValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode()); 
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode()); 
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode()); 
        hashCode = prime * hashCode + ((isModifiable() == null) ? 0 : isModifiable().hashCode()); 
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeTypeSpecificValues() == null) ? 0 : getCacheNodeTypeSpecificValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheNodeTypeSpecificParameter == false) return false;
        CacheNodeTypeSpecificParameter other = (CacheNodeTypeSpecificParameter)obj;
        
        if (other.getParameterName() == null ^ this.getParameterName() == null) return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false) return false; 
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
        if (other.getCacheNodeTypeSpecificValues() == null ^ this.getCacheNodeTypeSpecificValues() == null) return false;
        if (other.getCacheNodeTypeSpecificValues() != null && other.getCacheNodeTypeSpecificValues().equals(this.getCacheNodeTypeSpecificValues()) == false) return false; 
        return true;
    }
    
}
    