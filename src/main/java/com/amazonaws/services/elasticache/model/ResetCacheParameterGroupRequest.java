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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#resetCacheParameterGroup(ResetCacheParameterGroupRequest) ResetCacheParameterGroup operation}.
 * <p>
 * The <i>ResetCacheParameterGroup</i> operation modifies the parameters of a cache parameter group to the engine or system default value. You can reset
 * specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the <i>ResetAllParameters</i> and
 * <i>CacheParameterGroupName</i> parameters.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#resetCacheParameterGroup(ResetCacheParameterGroupRequest)
 */
public class ResetCacheParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cache parameter group to reset.
     */
    private String cacheParameterGroupName;

    /**
     * If <i>true</i>, all parameters in the cache parameter group will be
     * reset to default values. If <i>false</i>, no such action occurs.
     * <p>Valid values: <code>true</code> | <code>false</code>
     */
    private Boolean resetAllParameters;

    /**
     * An array of parameter names to be reset. If you are not resetting the
     * entire cache parameter group, you must specify at least one parameter
     * name.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterNameValue> parameterNameValues;

    /**
     * Default constructor for a new ResetCacheParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResetCacheParameterGroupRequest() {}
    
    /**
     * Constructs a new ResetCacheParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheParameterGroupName The name of the cache parameter group
     * to reset.
     * @param parameterNameValues An array of parameter names to be reset. If
     * you are not resetting the entire cache parameter group, you must
     * specify at least one parameter name.
     */
    public ResetCacheParameterGroupRequest(String cacheParameterGroupName, java.util.List<ParameterNameValue> parameterNameValues) {
        setCacheParameterGroupName(cacheParameterGroupName);
        setParameterNameValues(parameterNameValues);
    }

    /**
     * The name of the cache parameter group to reset.
     *
     * @return The name of the cache parameter group to reset.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to reset.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to reset.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * If <i>true</i>, all parameters in the cache parameter group will be
     * reset to default values. If <i>false</i>, no such action occurs.
     * <p>Valid values: <code>true</code> | <code>false</code>
     *
     * @return If <i>true</i>, all parameters in the cache parameter group will be
     *         reset to default values. If <i>false</i>, no such action occurs.
     *         <p>Valid values: <code>true</code> | <code>false</code>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * If <i>true</i>, all parameters in the cache parameter group will be
     * reset to default values. If <i>false</i>, no such action occurs.
     * <p>Valid values: <code>true</code> | <code>false</code>
     *
     * @param resetAllParameters If <i>true</i>, all parameters in the cache parameter group will be
     *         reset to default values. If <i>false</i>, no such action occurs.
     *         <p>Valid values: <code>true</code> | <code>false</code>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }
    
    /**
     * If <i>true</i>, all parameters in the cache parameter group will be
     * reset to default values. If <i>false</i>, no such action occurs.
     * <p>Valid values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetAllParameters If <i>true</i>, all parameters in the cache parameter group will be
     *         reset to default values. If <i>false</i>, no such action occurs.
     *         <p>Valid values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetCacheParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * If <i>true</i>, all parameters in the cache parameter group will be
     * reset to default values. If <i>false</i>, no such action occurs.
     * <p>Valid values: <code>true</code> | <code>false</code>
     *
     * @return If <i>true</i>, all parameters in the cache parameter group will be
     *         reset to default values. If <i>false</i>, no such action occurs.
     *         <p>Valid values: <code>true</code> | <code>false</code>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * An array of parameter names to be reset. If you are not resetting the
     * entire cache parameter group, you must specify at least one parameter
     * name.
     *
     * @return An array of parameter names to be reset. If you are not resetting the
     *         entire cache parameter group, you must specify at least one parameter
     *         name.
     */
    public java.util.List<ParameterNameValue> getParameterNameValues() {
        if (parameterNameValues == null) {
              parameterNameValues = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterNameValue>();
              parameterNameValues.setAutoConstruct(true);
        }
        return parameterNameValues;
    }
    
    /**
     * An array of parameter names to be reset. If you are not resetting the
     * entire cache parameter group, you must specify at least one parameter
     * name.
     *
     * @param parameterNameValues An array of parameter names to be reset. If you are not resetting the
     *         entire cache parameter group, you must specify at least one parameter
     *         name.
     */
    public void setParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterNameValue> parameterNameValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterNameValue>(parameterNameValues.size());
        parameterNameValuesCopy.addAll(parameterNameValues);
        this.parameterNameValues = parameterNameValuesCopy;
    }
    
    /**
     * An array of parameter names to be reset. If you are not resetting the
     * entire cache parameter group, you must specify at least one parameter
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterNameValues An array of parameter names to be reset. If you are not resetting the
     *         entire cache parameter group, you must specify at least one parameter
     *         name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetCacheParameterGroupRequest withParameterNameValues(ParameterNameValue... parameterNameValues) {
        if (getParameterNameValues() == null) setParameterNameValues(new java.util.ArrayList<ParameterNameValue>(parameterNameValues.length));
        for (ParameterNameValue value : parameterNameValues) {
            getParameterNameValues().add(value);
        }
        return this;
    }
    
    /**
     * An array of parameter names to be reset. If you are not resetting the
     * entire cache parameter group, you must specify at least one parameter
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterNameValues An array of parameter names to be reset. If you are not resetting the
     *         entire cache parameter group, you must specify at least one parameter
     *         name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetCacheParameterGroupRequest withParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterNameValue> parameterNameValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterNameValue>(parameterNameValues.size());
            parameterNameValuesCopy.addAll(parameterNameValues);
            this.parameterNameValues = parameterNameValuesCopy;
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
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (isResetAllParameters() != null) sb.append("ResetAllParameters: " + isResetAllParameters() + ",");
        if (getParameterNameValues() != null) sb.append("ParameterNameValues: " + getParameterNameValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isResetAllParameters() == null) ? 0 : isResetAllParameters().hashCode()); 
        hashCode = prime * hashCode + ((getParameterNameValues() == null) ? 0 : getParameterNameValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetCacheParameterGroupRequest == false) return false;
        ResetCacheParameterGroupRequest other = (ResetCacheParameterGroupRequest)obj;
        
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.isResetAllParameters() == null ^ this.isResetAllParameters() == null) return false;
        if (other.isResetAllParameters() != null && other.isResetAllParameters().equals(this.isResetAllParameters()) == false) return false; 
        if (other.getParameterNameValues() == null ^ this.getParameterNameValues() == null) return false;
        if (other.getParameterNameValues() != null && other.getParameterNameValues().equals(this.getParameterNameValues()) == false) return false; 
        return true;
    }
    
}
    