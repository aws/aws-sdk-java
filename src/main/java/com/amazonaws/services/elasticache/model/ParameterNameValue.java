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

/**
 * <p>
 * A name and value pair used to update the value of a Parameter.
 * </p>
 */
public class ParameterNameValue {

    /**
     * Specifies the name of the parameter.
     */
    private String parameterName;

    /**
     * Specifies the value of the parameter.
     */
    private String parameterValue;

    /**
     * Default constructor for a new ParameterNameValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ParameterNameValue() {}
    
    /**
     * Constructs a new ParameterNameValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param parameterName Specifies the name of the parameter.
     */
    public ParameterNameValue(String parameterName) {
        this.parameterName = parameterName;
    }

    
    
    /**
     * Constructs a new ParameterNameValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param parameterName Specifies the name of the parameter.
     * @param parameterValue Specifies the value of the parameter.
     */
    public ParameterNameValue(String parameterName, String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    
    
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
    public ParameterNameValue withParameterName(String parameterName) {
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
    public ParameterNameValue withParameterValue(String parameterValue) {
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
        if (parameterName != null) sb.append("ParameterName: " + parameterName + ", ");
        if (parameterValue != null) sb.append("ParameterValue: " + parameterValue + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode()); 
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ParameterNameValue == false) return false;
        ParameterNameValue other = (ParameterNameValue)obj;
        
        if (other.getParameterName() == null ^ this.getParameterName() == null) return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false) return false; 
        if (other.getParameterValue() == null ^ this.getParameterValue() == null) return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false) return false; 
        return true;
    }
    
}
    