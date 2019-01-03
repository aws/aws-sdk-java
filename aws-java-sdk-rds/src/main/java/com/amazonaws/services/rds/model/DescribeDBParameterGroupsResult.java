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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <a>DescribeDBParameterGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameterGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBParameterGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <a>DBParameterGroup</a> instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBParameterGroup> dBParameterGroups;

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

    public DescribeDBParameterGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>DBParameterGroup</a> instances.
     * </p>
     * 
     * @return A list of <a>DBParameterGroup</a> instances.
     */

    public java.util.List<DBParameterGroup> getDBParameterGroups() {
        if (dBParameterGroups == null) {
            dBParameterGroups = new com.amazonaws.internal.SdkInternalList<DBParameterGroup>();
        }
        return dBParameterGroups;
    }

    /**
     * <p>
     * A list of <a>DBParameterGroup</a> instances.
     * </p>
     * 
     * @param dBParameterGroups
     *        A list of <a>DBParameterGroup</a> instances.
     */

    public void setDBParameterGroups(java.util.Collection<DBParameterGroup> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
            return;
        }

        this.dBParameterGroups = new com.amazonaws.internal.SdkInternalList<DBParameterGroup>(dBParameterGroups);
    }

    /**
     * <p>
     * A list of <a>DBParameterGroup</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBParameterGroups(java.util.Collection)} or {@link #withDBParameterGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dBParameterGroups
     *        A list of <a>DBParameterGroup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBParameterGroupsResult withDBParameterGroups(DBParameterGroup... dBParameterGroups) {
        if (this.dBParameterGroups == null) {
            setDBParameterGroups(new com.amazonaws.internal.SdkInternalList<DBParameterGroup>(dBParameterGroups.length));
        }
        for (DBParameterGroup ele : dBParameterGroups) {
            this.dBParameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>DBParameterGroup</a> instances.
     * </p>
     * 
     * @param dBParameterGroups
     *        A list of <a>DBParameterGroup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBParameterGroupsResult withDBParameterGroups(java.util.Collection<DBParameterGroup> dBParameterGroups) {
        setDBParameterGroups(dBParameterGroups);
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
        if (getDBParameterGroups() != null)
            sb.append("DBParameterGroups: ").append(getDBParameterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBParameterGroupsResult == false)
            return false;
        DescribeDBParameterGroupsResult other = (DescribeDBParameterGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBParameterGroups() == null ^ this.getDBParameterGroups() == null)
            return false;
        if (other.getDBParameterGroups() != null && other.getDBParameterGroups().equals(this.getDBParameterGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroups() == null) ? 0 : getDBParameterGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBParameterGroupsResult clone() {
        try {
            return (DescribeDBParameterGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
