/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * <p>
 * Provides details about a DB cluster parameter group including the
 * parameters in the DB cluster parameter group.
 * </p>
 */
public class DescribeDBClusterParametersResult implements Serializable, Cloneable {

    /**
     * Provides a list of parameters for the DB cluster parameter group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     */
    private String marker;

    /**
     * Provides a list of parameters for the DB cluster parameter group.
     *
     * @return Provides a list of parameters for the DB cluster parameter group.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * Provides a list of parameters for the DB cluster parameter group.
     *
     * @param parameters Provides a list of parameters for the DB cluster parameter group.
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
     * Provides a list of parameters for the DB cluster parameter group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or {@link
     * #withParameters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters Provides a list of parameters for the DB cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of parameters for the DB cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters Provides a list of parameters for the DB cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterParametersResult withParameters(java.util.Collection<Parameter> parameters) {
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
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     *
     * @return An optional pagination token provided by a previous
     *         DescribeDBClusterParameters request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     *
     * @param marker An optional pagination token provided by a previous
     *         DescribeDBClusterParameters request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         DescribeDBClusterParameters request. If this parameter is specified,
     *         the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code> .
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterParametersResult withMarker(String marker) {
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

        if (obj instanceof DescribeDBClusterParametersResult == false) return false;
        DescribeDBClusterParametersResult other = (DescribeDBClusterParametersResult)obj;
        
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBClusterParametersResult clone() {
        try {
            return (DescribeDBClusterParametersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    