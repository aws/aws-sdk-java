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
package com.amazonaws.services.cloudformation.model;

/**
 * <p>
 * The Parameter data type.
 * </p>
 */
public class Parameter {

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
        sb.append("ParameterKey: " + parameterKey + ", ");
        sb.append("ParameterValue: " + parameterValue + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    