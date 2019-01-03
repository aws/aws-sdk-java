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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstanceTaskLogs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationInstanceTaskLogsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and
     * task log size (in bytes).
     * </p>
     */
    private java.util.List<ReplicationInstanceTaskLog> replicationInstanceTaskLogs;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationInstanceTaskLogsResult withReplicationInstanceArn(String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and
     * task log size (in bytes).
     * </p>
     * 
     * @return An array of replication task log metadata. Each member of the array contains the replication task name,
     *         ARN, and task log size (in bytes).
     */

    public java.util.List<ReplicationInstanceTaskLog> getReplicationInstanceTaskLogs() {
        return replicationInstanceTaskLogs;
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and
     * task log size (in bytes).
     * </p>
     * 
     * @param replicationInstanceTaskLogs
     *        An array of replication task log metadata. Each member of the array contains the replication task name,
     *        ARN, and task log size (in bytes).
     */

    public void setReplicationInstanceTaskLogs(java.util.Collection<ReplicationInstanceTaskLog> replicationInstanceTaskLogs) {
        if (replicationInstanceTaskLogs == null) {
            this.replicationInstanceTaskLogs = null;
            return;
        }

        this.replicationInstanceTaskLogs = new java.util.ArrayList<ReplicationInstanceTaskLog>(replicationInstanceTaskLogs);
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and
     * task log size (in bytes).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationInstanceTaskLogs(java.util.Collection)} or
     * {@link #withReplicationInstanceTaskLogs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationInstanceTaskLogs
     *        An array of replication task log metadata. Each member of the array contains the replication task name,
     *        ARN, and task log size (in bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationInstanceTaskLogsResult withReplicationInstanceTaskLogs(ReplicationInstanceTaskLog... replicationInstanceTaskLogs) {
        if (this.replicationInstanceTaskLogs == null) {
            setReplicationInstanceTaskLogs(new java.util.ArrayList<ReplicationInstanceTaskLog>(replicationInstanceTaskLogs.length));
        }
        for (ReplicationInstanceTaskLog ele : replicationInstanceTaskLogs) {
            this.replicationInstanceTaskLogs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and
     * task log size (in bytes).
     * </p>
     * 
     * @param replicationInstanceTaskLogs
     *        An array of replication task log metadata. Each member of the array contains the replication task name,
     *        ARN, and task log size (in bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationInstanceTaskLogsResult withReplicationInstanceTaskLogs(
            java.util.Collection<ReplicationInstanceTaskLog> replicationInstanceTaskLogs) {
        setReplicationInstanceTaskLogs(replicationInstanceTaskLogs);
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

    public DescribeReplicationInstanceTaskLogsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: ").append(getReplicationInstanceArn()).append(",");
        if (getReplicationInstanceTaskLogs() != null)
            sb.append("ReplicationInstanceTaskLogs: ").append(getReplicationInstanceTaskLogs()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationInstanceTaskLogsResult == false)
            return false;
        DescribeReplicationInstanceTaskLogsResult other = (DescribeReplicationInstanceTaskLogsResult) obj;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getReplicationInstanceTaskLogs() == null ^ this.getReplicationInstanceTaskLogs() == null)
            return false;
        if (other.getReplicationInstanceTaskLogs() != null && other.getReplicationInstanceTaskLogs().equals(this.getReplicationInstanceTaskLogs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceTaskLogs() == null) ? 0 : getReplicationInstanceTaskLogs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationInstanceTaskLogsResult clone() {
        try {
            return (DescribeReplicationInstanceTaskLogsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
