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
 * Contains the output from the DescribeClusterParameters action.
 * </p>
 */
public class DescribeClusterParametersResult implements Serializable {

    /**
     * A list of <a>Parameter</a> instances. Each instance lists the
     * parameters of one cluster parameter group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * A marker that indicates the first parameter group that a subsequent
     * <a>DescribeClusterParameterGroups</a> request will return. The
     * response returns a marker only if there are more parameter groups
     * details to list than the current response can return.
     */
    private String marker;

    /**
     * A list of <a>Parameter</a> instances. Each instance lists the
     * parameters of one cluster parameter group.
     *
     * @return A list of <a>Parameter</a> instances. Each instance lists the
     *         parameters of one cluster parameter group.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * A list of <a>Parameter</a> instances. Each instance lists the
     * parameters of one cluster parameter group.
     *
     * @param parameters A list of <a>Parameter</a> instances. Each instance lists the
     *         parameters of one cluster parameter group.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <a>Parameter</a> instances. Each instance lists the
     * parameters of one cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <a>Parameter</a> instances. Each instance lists the
     *         parameters of one cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>Parameter</a> instances. Each instance lists the
     * parameters of one cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <a>Parameter</a> instances. Each instance lists the
     *         parameters of one cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

        return this;
    }

    /**
     * A marker that indicates the first parameter group that a subsequent
     * <a>DescribeClusterParameterGroups</a> request will return. The
     * response returns a marker only if there are more parameter groups
     * details to list than the current response can return.
     *
     * @return A marker that indicates the first parameter group that a subsequent
     *         <a>DescribeClusterParameterGroups</a> request will return. The
     *         response returns a marker only if there are more parameter groups
     *         details to list than the current response can return.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker that indicates the first parameter group that a subsequent
     * <a>DescribeClusterParameterGroups</a> request will return. The
     * response returns a marker only if there are more parameter groups
     * details to list than the current response can return.
     *
     * @param marker A marker that indicates the first parameter group that a subsequent
     *         <a>DescribeClusterParameterGroups</a> request will return. The
     *         response returns a marker only if there are more parameter groups
     *         details to list than the current response can return.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker that indicates the first parameter group that a subsequent
     * <a>DescribeClusterParameterGroups</a> request will return. The
     * response returns a marker only if there are more parameter groups
     * details to list than the current response can return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker that indicates the first parameter group that a subsequent
     *         <a>DescribeClusterParameterGroups</a> request will return. The
     *         response returns a marker only if there are more parameter groups
     *         details to list than the current response can return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterParametersResult withMarker(String marker) {
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
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
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

        if (obj instanceof DescribeClusterParametersResult == false) return false;
        DescribeClusterParametersResult other = (DescribeClusterParametersResult)obj;
        
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    