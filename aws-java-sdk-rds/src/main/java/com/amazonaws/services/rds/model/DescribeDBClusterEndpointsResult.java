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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterEndpoint> dBClusterEndpoints;

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeDBClusterEndpoints</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * </p>
     * 
     * @return Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     */

    public java.util.List<DBClusterEndpoint> getDBClusterEndpoints() {
        if (dBClusterEndpoints == null) {
            dBClusterEndpoints = new com.amazonaws.internal.SdkInternalList<DBClusterEndpoint>();
        }
        return dBClusterEndpoints;
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * </p>
     * 
     * @param dBClusterEndpoints
     *        Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     */

    public void setDBClusterEndpoints(java.util.Collection<DBClusterEndpoint> dBClusterEndpoints) {
        if (dBClusterEndpoints == null) {
            this.dBClusterEndpoints = null;
            return;
        }

        this.dBClusterEndpoints = new com.amazonaws.internal.SdkInternalList<DBClusterEndpoint>(dBClusterEndpoints);
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterEndpoints(java.util.Collection)} or {@link #withDBClusterEndpoints(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dBClusterEndpoints
     *        Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsResult withDBClusterEndpoints(DBClusterEndpoint... dBClusterEndpoints) {
        if (this.dBClusterEndpoints == null) {
            setDBClusterEndpoints(new com.amazonaws.internal.SdkInternalList<DBClusterEndpoint>(dBClusterEndpoints.length));
        }
        for (DBClusterEndpoint ele : dBClusterEndpoints) {
            this.dBClusterEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * </p>
     * 
     * @param dBClusterEndpoints
     *        Contains the details of the endpoints associated with the cluster and matching any filter conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterEndpointsResult withDBClusterEndpoints(java.util.Collection<DBClusterEndpoint> dBClusterEndpoints) {
        setDBClusterEndpoints(dBClusterEndpoints);
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
        if (getDBClusterEndpoints() != null)
            sb.append("DBClusterEndpoints: ").append(getDBClusterEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterEndpointsResult == false)
            return false;
        DescribeDBClusterEndpointsResult other = (DescribeDBClusterEndpointsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterEndpoints() == null ^ this.getDBClusterEndpoints() == null)
            return false;
        if (other.getDBClusterEndpoints() != null && other.getDBClusterEndpoints().equals(this.getDBClusterEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBClusterEndpoints() == null) ? 0 : getDBClusterEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterEndpointsResult clone() {
        try {
            return (DescribeDBClusterEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
