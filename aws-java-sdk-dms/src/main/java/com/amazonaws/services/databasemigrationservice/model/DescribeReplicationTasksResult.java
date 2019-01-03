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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A description of the replication tasks.
     * </p>
     */
    private java.util.List<ReplicationTask> replicationTasks;

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

    public DescribeReplicationTasksResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A description of the replication tasks.
     * </p>
     * 
     * @return A description of the replication tasks.
     */

    public java.util.List<ReplicationTask> getReplicationTasks() {
        return replicationTasks;
    }

    /**
     * <p>
     * A description of the replication tasks.
     * </p>
     * 
     * @param replicationTasks
     *        A description of the replication tasks.
     */

    public void setReplicationTasks(java.util.Collection<ReplicationTask> replicationTasks) {
        if (replicationTasks == null) {
            this.replicationTasks = null;
            return;
        }

        this.replicationTasks = new java.util.ArrayList<ReplicationTask>(replicationTasks);
    }

    /**
     * <p>
     * A description of the replication tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationTasks(java.util.Collection)} or {@link #withReplicationTasks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicationTasks
     *        A description of the replication tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksResult withReplicationTasks(ReplicationTask... replicationTasks) {
        if (this.replicationTasks == null) {
            setReplicationTasks(new java.util.ArrayList<ReplicationTask>(replicationTasks.length));
        }
        for (ReplicationTask ele : replicationTasks) {
            this.replicationTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of the replication tasks.
     * </p>
     * 
     * @param replicationTasks
     *        A description of the replication tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTasksResult withReplicationTasks(java.util.Collection<ReplicationTask> replicationTasks) {
        setReplicationTasks(replicationTasks);
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
        if (getReplicationTasks() != null)
            sb.append("ReplicationTasks: ").append(getReplicationTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTasksResult == false)
            return false;
        DescribeReplicationTasksResult other = (DescribeReplicationTasksResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationTasks() == null ^ this.getReplicationTasks() == null)
            return false;
        if (other.getReplicationTasks() != null && other.getReplicationTasks().equals(this.getReplicationTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationTasks() == null) ? 0 : getReplicationTasks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationTasksResult clone() {
        try {
            return (DescribeReplicationTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
