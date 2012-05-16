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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * Contains the result of a successful invocation of the DescribeDBParameters action.
 * </p>
 */
public class DescribeDBParametersResult {

    /**
     * A list of <a>Parameter</a> instances.
     */
    private java.util.List<Parameter> parameters;

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>Parameter</a> instances.
     *
     * @return A list of <a>Parameter</a> instances.
     */
    public java.util.List<Parameter> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * A list of <a>Parameter</a> instances.
     *
     * @param parameters A list of <a>Parameter</a> instances.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <a>Parameter</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <a>Parameter</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>Parameter</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <a>Parameter</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

        return this;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBParametersResult withMarker(String marker) {
        this.marker = marker;
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
        if (parameters != null) sb.append("Parameters: " + parameters + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeDBParametersResult == false) return false;
        DescribeDBParametersResult other = (DescribeDBParametersResult)obj;
        
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    