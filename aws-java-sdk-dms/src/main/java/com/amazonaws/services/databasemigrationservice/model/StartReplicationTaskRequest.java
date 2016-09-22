/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class StartReplicationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the replication task to be started.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The type of replication task.
     * </p>
     */
    private String startReplicationTaskType;
    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     */
    private java.util.Date cdcStartTime;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the replication task to be started.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Number (ARN) of the replication task to be started.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the replication task to be started.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the replication task to be started.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the replication task to be started.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Number (ARN) of the replication task to be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @see StartReplicationTaskTypeValue
     */

    public void setStartReplicationTaskType(String startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @return The type of replication task.
     * @see StartReplicationTaskTypeValue
     */

    public String getStartReplicationTaskType() {
        return this.startReplicationTaskType;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartReplicationTaskTypeValue
     */

    public StartReplicationTaskRequest withStartReplicationTaskType(String startReplicationTaskType) {
        setStartReplicationTaskType(startReplicationTaskType);
        return this;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @see StartReplicationTaskTypeValue
     */

    public void setStartReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType.toString();
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * 
     * @param startReplicationTaskType
     *        The type of replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartReplicationTaskTypeValue
     */

    public StartReplicationTaskRequest withStartReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
        setStartReplicationTaskType(startReplicationTaskType);
        return this;
    }

    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     * 
     * @param cdcStartTime
     *        The start time for the Change Data Capture (CDC) operation.
     */

    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     * 
     * @return The start time for the Change Data Capture (CDC) operation.
     */

    public java.util.Date getCdcStartTime() {
        return this.cdcStartTime;
    }

    /**
     * <p>
     * The start time for the Change Data Capture (CDC) operation.
     * </p>
     * 
     * @param cdcStartTime
     *        The start time for the Change Data Capture (CDC) operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
        setCdcStartTime(cdcStartTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getStartReplicationTaskType() != null)
            sb.append("StartReplicationTaskType: " + getStartReplicationTaskType() + ",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: " + getCdcStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplicationTaskRequest == false)
            return false;
        StartReplicationTaskRequest other = (StartReplicationTaskRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getStartReplicationTaskType() == null ^ this.getStartReplicationTaskType() == null)
            return false;
        if (other.getStartReplicationTaskType() != null && other.getStartReplicationTaskType().equals(this.getStartReplicationTaskType()) == false)
            return false;
        if (other.getCdcStartTime() == null ^ this.getCdcStartTime() == null)
            return false;
        if (other.getCdcStartTime() != null && other.getCdcStartTime().equals(this.getCdcStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getStartReplicationTaskType() == null) ? 0 : getStartReplicationTaskType().hashCode());
        hashCode = prime * hashCode + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        return hashCode;
    }

    @Override
    public StartReplicationTaskRequest clone() {
        return (StartReplicationTaskRequest) super.clone();
    }
}
