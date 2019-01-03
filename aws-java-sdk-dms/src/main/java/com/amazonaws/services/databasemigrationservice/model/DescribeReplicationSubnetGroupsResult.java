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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationSubnetGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationSubnetGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
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
     * A description of the replication subnet groups.
     * </p>
     */
    private java.util.List<ReplicationSubnetGroup> replicationSubnetGroups;

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

    public DescribeReplicationSubnetGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     * 
     * @return A description of the replication subnet groups.
     */

    public java.util.List<ReplicationSubnetGroup> getReplicationSubnetGroups() {
        return replicationSubnetGroups;
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     * 
     * @param replicationSubnetGroups
     *        A description of the replication subnet groups.
     */

    public void setReplicationSubnetGroups(java.util.Collection<ReplicationSubnetGroup> replicationSubnetGroups) {
        if (replicationSubnetGroups == null) {
            this.replicationSubnetGroups = null;
            return;
        }

        this.replicationSubnetGroups = new java.util.ArrayList<ReplicationSubnetGroup>(replicationSubnetGroups);
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationSubnetGroups(java.util.Collection)} or
     * {@link #withReplicationSubnetGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationSubnetGroups
     *        A description of the replication subnet groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationSubnetGroupsResult withReplicationSubnetGroups(ReplicationSubnetGroup... replicationSubnetGroups) {
        if (this.replicationSubnetGroups == null) {
            setReplicationSubnetGroups(new java.util.ArrayList<ReplicationSubnetGroup>(replicationSubnetGroups.length));
        }
        for (ReplicationSubnetGroup ele : replicationSubnetGroups) {
            this.replicationSubnetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of the replication subnet groups.
     * </p>
     * 
     * @param replicationSubnetGroups
     *        A description of the replication subnet groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationSubnetGroupsResult withReplicationSubnetGroups(java.util.Collection<ReplicationSubnetGroup> replicationSubnetGroups) {
        setReplicationSubnetGroups(replicationSubnetGroups);
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
        if (getReplicationSubnetGroups() != null)
            sb.append("ReplicationSubnetGroups: ").append(getReplicationSubnetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationSubnetGroupsResult == false)
            return false;
        DescribeReplicationSubnetGroupsResult other = (DescribeReplicationSubnetGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationSubnetGroups() == null ^ this.getReplicationSubnetGroups() == null)
            return false;
        if (other.getReplicationSubnetGroups() != null && other.getReplicationSubnetGroups().equals(this.getReplicationSubnetGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationSubnetGroups() == null) ? 0 : getReplicationSubnetGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationSubnetGroupsResult clone() {
        try {
            return (DescribeReplicationSubnetGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
