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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The replication instances described.
     * </p>
     */
    private java.util.List<ReplicationInstance> replicationInstances;

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

    public DescribeReplicationInstancesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     * 
     * @return The replication instances described.
     */

    public java.util.List<ReplicationInstance> getReplicationInstances() {
        return replicationInstances;
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     * 
     * @param replicationInstances
     *        The replication instances described.
     */

    public void setReplicationInstances(java.util.Collection<ReplicationInstance> replicationInstances) {
        if (replicationInstances == null) {
            this.replicationInstances = null;
            return;
        }

        this.replicationInstances = new java.util.ArrayList<ReplicationInstance>(replicationInstances);
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationInstances(java.util.Collection)} or {@link #withReplicationInstances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicationInstances
     *        The replication instances described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationInstancesResult withReplicationInstances(ReplicationInstance... replicationInstances) {
        if (this.replicationInstances == null) {
            setReplicationInstances(new java.util.ArrayList<ReplicationInstance>(replicationInstances.length));
        }
        for (ReplicationInstance ele : replicationInstances) {
            this.replicationInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replication instances described.
     * </p>
     * 
     * @param replicationInstances
     *        The replication instances described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationInstancesResult withReplicationInstances(java.util.Collection<ReplicationInstance> replicationInstances) {
        setReplicationInstances(replicationInstances);
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
        if (getReplicationInstances() != null)
            sb.append("ReplicationInstances: ").append(getReplicationInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationInstancesResult == false)
            return false;
        DescribeReplicationInstancesResult other = (DescribeReplicationInstancesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationInstances() == null ^ this.getReplicationInstances() == null)
            return false;
        if (other.getReplicationInstances() != null && other.getReplicationInstances().equals(this.getReplicationInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstances() == null) ? 0 : getReplicationInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationInstancesResult clone() {
        try {
            return (DescribeReplicationInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
