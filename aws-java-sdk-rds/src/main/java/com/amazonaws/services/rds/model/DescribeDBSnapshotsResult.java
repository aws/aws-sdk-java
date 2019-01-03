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
 * Contains the result of a successful invocation of the <a>DescribeDBSnapshots</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <a>DBSnapshot</a> instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBSnapshot> dBSnapshots;

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

    public DescribeDBSnapshotsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>DBSnapshot</a> instances.
     * </p>
     * 
     * @return A list of <a>DBSnapshot</a> instances.
     */

    public java.util.List<DBSnapshot> getDBSnapshots() {
        if (dBSnapshots == null) {
            dBSnapshots = new com.amazonaws.internal.SdkInternalList<DBSnapshot>();
        }
        return dBSnapshots;
    }

    /**
     * <p>
     * A list of <a>DBSnapshot</a> instances.
     * </p>
     * 
     * @param dBSnapshots
     *        A list of <a>DBSnapshot</a> instances.
     */

    public void setDBSnapshots(java.util.Collection<DBSnapshot> dBSnapshots) {
        if (dBSnapshots == null) {
            this.dBSnapshots = null;
            return;
        }

        this.dBSnapshots = new com.amazonaws.internal.SdkInternalList<DBSnapshot>(dBSnapshots);
    }

    /**
     * <p>
     * A list of <a>DBSnapshot</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSnapshots(java.util.Collection)} or {@link #withDBSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dBSnapshots
     *        A list of <a>DBSnapshot</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsResult withDBSnapshots(DBSnapshot... dBSnapshots) {
        if (this.dBSnapshots == null) {
            setDBSnapshots(new com.amazonaws.internal.SdkInternalList<DBSnapshot>(dBSnapshots.length));
        }
        for (DBSnapshot ele : dBSnapshots) {
            this.dBSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>DBSnapshot</a> instances.
     * </p>
     * 
     * @param dBSnapshots
     *        A list of <a>DBSnapshot</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBSnapshotsResult withDBSnapshots(java.util.Collection<DBSnapshot> dBSnapshots) {
        setDBSnapshots(dBSnapshots);
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
        if (getDBSnapshots() != null)
            sb.append("DBSnapshots: ").append(getDBSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBSnapshotsResult == false)
            return false;
        DescribeDBSnapshotsResult other = (DescribeDBSnapshotsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBSnapshots() == null ^ this.getDBSnapshots() == null)
            return false;
        if (other.getDBSnapshots() != null && other.getDBSnapshots().equals(this.getDBSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBSnapshots() == null) ? 0 : getDBSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBSnapshotsResult clone() {
        try {
            return (DescribeDBSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
