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
 * Represents the output of <a>DescribeDBClusterSnapshots</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeDBClusterSnapshots" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Provides a list of DB cluster snapshots.
     * </p>
     */
    private java.util.List<DBClusterSnapshot> dBClusterSnapshots;

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

    public DescribeDBClusterSnapshotsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots.
     * </p>
     * 
     * @return Provides a list of DB cluster snapshots.
     */

    public java.util.List<DBClusterSnapshot> getDBClusterSnapshots() {
        return dBClusterSnapshots;
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots.
     * </p>
     * 
     * @param dBClusterSnapshots
     *        Provides a list of DB cluster snapshots.
     */

    public void setDBClusterSnapshots(java.util.Collection<DBClusterSnapshot> dBClusterSnapshots) {
        if (dBClusterSnapshots == null) {
            this.dBClusterSnapshots = null;
            return;
        }

        this.dBClusterSnapshots = new java.util.ArrayList<DBClusterSnapshot>(dBClusterSnapshots);
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterSnapshots(java.util.Collection)} or {@link #withDBClusterSnapshots(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dBClusterSnapshots
     *        Provides a list of DB cluster snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsResult withDBClusterSnapshots(DBClusterSnapshot... dBClusterSnapshots) {
        if (this.dBClusterSnapshots == null) {
            setDBClusterSnapshots(new java.util.ArrayList<DBClusterSnapshot>(dBClusterSnapshots.length));
        }
        for (DBClusterSnapshot ele : dBClusterSnapshots) {
            this.dBClusterSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of DB cluster snapshots.
     * </p>
     * 
     * @param dBClusterSnapshots
     *        Provides a list of DB cluster snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterSnapshotsResult withDBClusterSnapshots(java.util.Collection<DBClusterSnapshot> dBClusterSnapshots) {
        setDBClusterSnapshots(dBClusterSnapshots);
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
        if (getDBClusterSnapshots() != null)
            sb.append("DBClusterSnapshots: ").append(getDBClusterSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterSnapshotsResult == false)
            return false;
        DescribeDBClusterSnapshotsResult other = (DescribeDBClusterSnapshotsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterSnapshots() == null ^ this.getDBClusterSnapshots() == null)
            return false;
        if (other.getDBClusterSnapshots() != null && other.getDBClusterSnapshots().equals(this.getDBClusterSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshots() == null) ? 0 : getDBClusterSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterSnapshotsResult clone() {
        try {
            return (DescribeDBClusterSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
