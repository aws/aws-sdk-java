/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotTenantDatabases"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSnapshotTenantDatabasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
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
     * A list of DB snapshot tenant databases.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBSnapshotTenantDatabase> dBSnapshotTenantDatabases;

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

    public DescribeDBSnapshotTenantDatabasesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot tenant databases.
     * </p>
     * 
     * @return A list of DB snapshot tenant databases.
     */

    public java.util.List<DBSnapshotTenantDatabase> getDBSnapshotTenantDatabases() {
        if (dBSnapshotTenantDatabases == null) {
            dBSnapshotTenantDatabases = new com.amazonaws.internal.SdkInternalList<DBSnapshotTenantDatabase>();
        }
        return dBSnapshotTenantDatabases;
    }

    /**
     * <p>
     * A list of DB snapshot tenant databases.
     * </p>
     * 
     * @param dBSnapshotTenantDatabases
     *        A list of DB snapshot tenant databases.
     */

    public void setDBSnapshotTenantDatabases(java.util.Collection<DBSnapshotTenantDatabase> dBSnapshotTenantDatabases) {
        if (dBSnapshotTenantDatabases == null) {
            this.dBSnapshotTenantDatabases = null;
            return;
        }

        this.dBSnapshotTenantDatabases = new com.amazonaws.internal.SdkInternalList<DBSnapshotTenantDatabase>(dBSnapshotTenantDatabases);
    }

    /**
     * <p>
     * A list of DB snapshot tenant databases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSnapshotTenantDatabases(java.util.Collection)} or
     * {@link #withDBSnapshotTenantDatabases(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBSnapshotTenantDatabases
     *        A list of DB snapshot tenant databases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesResult withDBSnapshotTenantDatabases(DBSnapshotTenantDatabase... dBSnapshotTenantDatabases) {
        if (this.dBSnapshotTenantDatabases == null) {
            setDBSnapshotTenantDatabases(new com.amazonaws.internal.SdkInternalList<DBSnapshotTenantDatabase>(dBSnapshotTenantDatabases.length));
        }
        for (DBSnapshotTenantDatabase ele : dBSnapshotTenantDatabases) {
            this.dBSnapshotTenantDatabases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot tenant databases.
     * </p>
     * 
     * @param dBSnapshotTenantDatabases
     *        A list of DB snapshot tenant databases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotTenantDatabasesResult withDBSnapshotTenantDatabases(java.util.Collection<DBSnapshotTenantDatabase> dBSnapshotTenantDatabases) {
        setDBSnapshotTenantDatabases(dBSnapshotTenantDatabases);
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
        if (getDBSnapshotTenantDatabases() != null)
            sb.append("DBSnapshotTenantDatabases: ").append(getDBSnapshotTenantDatabases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBSnapshotTenantDatabasesResult == false)
            return false;
        DescribeDBSnapshotTenantDatabasesResult other = (DescribeDBSnapshotTenantDatabasesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBSnapshotTenantDatabases() == null ^ this.getDBSnapshotTenantDatabases() == null)
            return false;
        if (other.getDBSnapshotTenantDatabases() != null && other.getDBSnapshotTenantDatabases().equals(this.getDBSnapshotTenantDatabases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBSnapshotTenantDatabases() == null) ? 0 : getDBSnapshotTenantDatabases().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBSnapshotTenantDatabasesResult clone() {
        try {
            return (DescribeDBSnapshotTenantDatabasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
