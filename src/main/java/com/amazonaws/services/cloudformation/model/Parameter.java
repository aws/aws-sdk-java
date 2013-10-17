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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The Parameter data type.
 * </p>
 */
public class Parameter implements Serializable {

    /**
     * The key associated with the parameter.
     */
    private String parameterKey;

    /**
     * The value associated with the parameter.
     */
    private String parameterValue;

    /**
     * The key associated with the parameter.
     *
     * @return The key associated with the parameter.
     */
    public String getParameterKey() {
        return parameterKey;
    }
    
    /**
     * The key associated with the parameter.
     *
     * @param parameterKey The key associated with the parameter.
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }
    
    /**
     * The key associated with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterKey The key associated with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * The value associated with the parameter.
     *
     * @return The value associated with the parameter.
     */
    public String getParameterValue() {
        return parameterValue;
    }
    
    /**
     * The value associated with the parameter.
     *
     * @param parameterValue The value associated with the parameter.
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    /**
     * The value associated with the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValue The value associated with the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Parameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
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
        if (getParameterKey() != null) sb.append("ParameterKey: " + getParameterKey() + ",");
        if (getParameterValue() != null) sb.append("ParameterValue: " + getParameterValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode()); 
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Parameter == false) return false;
        Parameter other = (Parameter)obj;
        
        if (other.getParameterKey() == null ^ this.getParameterKey() == null) return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false) return false; 
        if (other.getParameterValue() == null ^ this.getParameterValue() == null) return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false) return false; 
        return true;
    }
    
}
    