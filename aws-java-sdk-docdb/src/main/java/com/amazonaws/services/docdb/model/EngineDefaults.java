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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <code>DescribeEngineDefaultClusterParameters</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/EngineDefaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineDefaults implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB cluster parameter group family to return the engine parameter information for.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The parameters of a particular DB cluster parameter group family.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The name of the DB cluster parameter group family to return the engine parameter information for.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB cluster parameter group family to return the engine parameter information for.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group family to return the engine parameter information for.
     * </p>
     * 
     * @return The name of the DB cluster parameter group family to return the engine parameter information for.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group family to return the engine parameter information for.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The name of the DB cluster parameter group family to return the engine parameter information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The parameters of a particular DB cluster parameter group family.
     * </p>
     * 
     * @return The parameters of a particular DB cluster parameter group family.
     */

    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters of a particular DB cluster parameter group family.
     * </p>
     * 
     * @param parameters
     *        The parameters of a particular DB cluster parameter group family.
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
     * The parameters of a particular DB cluster parameter group family.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters of a particular DB cluster parameter group family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withParameters(Parameter... parameters) {
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
     * The parameters of a particular DB cluster parameter group family.
     * </p>
     * 
     * @param parameters
     *        The parameters of a particular DB cluster parameter group family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineDefaults withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
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
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineDefaults == false)
            return false;
        EngineDefaults other = (EngineDefaults) obj;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public EngineDefaults clone() {
        try {
            return (EngineDefaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
