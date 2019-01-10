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
 * Represents the output of <a>DBClusterParameterGroups</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterParameterGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterParameterGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of DB cluster parameter groups.
     * </p>
     */
    private java.util.List<DBClusterParameterGroup> dBClusterParameterGroups;

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

    public DescribeDBClusterParameterGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of DB cluster parameter groups.
     * </p>
     * 
     * @return A list of DB cluster parameter groups.
     */

    public java.util.List<DBClusterParameterGroup> getDBClusterParameterGroups() {
        return dBClusterParameterGroups;
    }

    /**
     * <p>
     * A list of DB cluster parameter groups.
     * </p>
     * 
     * @param dBClusterParameterGroups
     *        A list of DB cluster parameter groups.
     */

    public void setDBClusterParameterGroups(java.util.Collection<DBClusterParameterGroup> dBClusterParameterGroups) {
        if (dBClusterParameterGroups == null) {
            this.dBClusterParameterGroups = null;
            return;
        }

        this.dBClusterParameterGroups = new java.util.ArrayList<DBClusterParameterGroup>(dBClusterParameterGroups);
    }

    /**
     * <p>
     * A list of DB cluster parameter groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterParameterGroups(java.util.Collection)} or
     * {@link #withDBClusterParameterGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBClusterParameterGroups
     *        A list of DB cluster parameter groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterParameterGroupsResult withDBClusterParameterGroups(DBClusterParameterGroup... dBClusterParameterGroups) {
        if (this.dBClusterParameterGroups == null) {
            setDBClusterParameterGroups(new java.util.ArrayList<DBClusterParameterGroup>(dBClusterParameterGroups.length));
        }
        for (DBClusterParameterGroup ele : dBClusterParameterGroups) {
            this.dBClusterParameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB cluster parameter groups.
     * </p>
     * 
     * @param dBClusterParameterGroups
     *        A list of DB cluster parameter groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterParameterGroupsResult withDBClusterParameterGroups(java.util.Collection<DBClusterParameterGroup> dBClusterParameterGroups) {
        setDBClusterParameterGroups(dBClusterParameterGroups);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getDBClusterParameterGroups() != null)
            sb.append("DBClusterParameterGroups: ").append(getDBClusterParameterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterParameterGroupsResult == false)
            return false;
        DescribeDBClusterParameterGroupsResult other = (DescribeDBClusterParameterGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterParameterGroups() == null ^ this.getDBClusterParameterGroups() == null)
            return false;
        if (other.getDBClusterParameterGroups() != null && other.getDBClusterParameterGroups().equals(this.getDBClusterParameterGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroups() == null) ? 0 : getDBClusterParameterGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterParameterGroupsResult clone() {
        try {
            return (DescribeDBClusterParameterGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
