/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides details about a DB cluster parameter group including the parameters in the DB cluster parameter group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeDBClusterParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     */
    private java.util.List<Parameter> parameters;
    /**
     * <p>
     * An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     * 
     * @return Provides a list of parameters for the DB cluster parameter group.
     */

    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     * 
     * @param parameters
     *        Provides a list of parameters for the DB cluster parameter group.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        Provides a list of parameters for the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterParametersResult withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     * 
     * @param parameters
     *        Provides a list of parameters for the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter
     *        is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code> .
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     * 
     * @return An optional pagination token provided by a previous DescribeDBClusterParameters request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code> .
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous DescribeDBClusterParameters request. If this parameter
     *        is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterParametersResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterParametersResult == false)
            return false;
        DescribeDBClusterParametersResult other = (DescribeDBClusterParametersResult) obj;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
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
    public DescribeDBClusterParametersResult clone() {
        try {
            return (DescribeDBClusterParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
