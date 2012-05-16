/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#resetCacheParameterGroup(ResetCacheParameterGroupRequest) ResetCacheParameterGroup operation}.
 * <p>
 * Modifies the parameters of a CacheParameterGroup to the engine or system default value. To reset specific parameters submit a list of the parameter
 * names. To reset the entire CacheParameterGroup, specify the CacheParameterGroup name and ResetAllParameters parameters.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#resetCacheParameterGroup(ResetCacheParameterGroupRequest)
 */
public class ResetCacheParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Cache Parameter Group.
     */
    private String cacheParameterGroupName;

    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the Cache Parameter Group to default values.
     */
    private Boolean resetAllParameters;

    /**
     * An array of parameter names which should be reset. If not resetting
     * the entire CacheParameterGroup, at least one parameter name must be
     * supplied.
     */
    private java.util.List<ParameterNameValue> parameterNameValues;

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
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     * @param parameterNameValues An array of parameter names which should be
     * reset. If not resetting the entire CacheParameterGroup, at least one
     * parameter name must be supplied.
     */
    public ResetCacheParameterGroupRequest(String cacheParameterGroupName, java.util.List<ParameterNameValue> parameterNameValues) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        this.parameterNameValues = parameterNameValues;
    }

    
    
    /**
     * The name of the Cache Parameter Group.
     *
     * @return The name of the Cache Parameter Group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the Cache Parameter Group to default values.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the Cache Parameter Group to default values.
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the Cache Parameter Group to default values.
     *
     * @param resetAllParameters Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the Cache Parameter Group to default values.
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the Cache Parameter Group to default values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetAllParameters Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the Cache Parameter Group to default values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetCacheParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }
    
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     * parameters in the Cache Parameter Group to default values.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) to reset all
     *         parameters in the Cache Parameter Group to default values.
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * An array of parameter names which should be reset. If not resetting
     * the entire CacheParameterGroup, at least one parameter name must be
     * supplied.
     *
     * @return An array of parameter names which should be reset. If not resetting
     *         the entire CacheParameterGroup, at least one parameter name must be
     *         supplied.
     */
    public java.util.List<ParameterNameValue> getParameterNameValues() {
        
        if (parameterNameValues == null) {
            parameterNameValues = new java.util.ArrayList<ParameterNameValue>();
        }
        return parameterNameValues;
    }
    
    /**
     * An array of parameter names which should be reset. If not resetting
     * the entire CacheParameterGroup, at least one parameter name must be
     * supplied.
     *
     * @param parameterNameValues An array of parameter names which should be reset. If not resetting
     *         the entire CacheParameterGroup, at least one parameter name must be
     *         supplied.
     */
    public void setParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
            return;
        }

        java.util.List<ParameterNameValue> parameterNameValuesCopy = new java.util.ArrayList<ParameterNameValue>(parameterNameValues.size());
        parameterNameValuesCopy.addAll(parameterNameValues);
        this.parameterNameValues = parameterNameValuesCopy;
    }
    
    /**
     * An array of parameter names which should be reset. If not resetting
     * the entire CacheParameterGroup, at least one parameter name must be
     * supplied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterNameValues An array of parameter names which should be reset. If not resetting
     *         the entire CacheParameterGroup, at least one parameter name must be
     *         supplied.
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
     * An array of parameter names which should be reset. If not resetting
     * the entire CacheParameterGroup, at least one parameter name must be
     * supplied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterNameValues An array of parameter names which should be reset. If not resetting
     *         the entire CacheParameterGroup, at least one parameter name must be
     *         supplied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResetCacheParameterGroupRequest withParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
        } else {
            java.util.List<ParameterNameValue> parameterNameValuesCopy = new java.util.ArrayList<ParameterNameValue>(parameterNameValues.size());
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
        if (cacheParameterGroupName != null) sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        if (resetAllParameters != null) sb.append("ResetAllParameters: " + resetAllParameters + ", ");
        if (parameterNameValues != null) sb.append("ParameterNameValues: " + parameterNameValues + ", ");
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
    