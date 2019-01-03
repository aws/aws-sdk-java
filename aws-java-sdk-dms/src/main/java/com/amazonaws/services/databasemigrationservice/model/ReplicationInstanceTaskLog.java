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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata for a replication instance task log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationInstanceTaskLog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationInstanceTaskLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the replication task.
     * </p>
     */
    private String replicationTaskName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     */
    private Long replicationInstanceTaskLogSize;

    /**
     * <p>
     * The name of the replication task.
     * </p>
     * 
     * @param replicationTaskName
     *        The name of the replication task.
     */

    public void setReplicationTaskName(String replicationTaskName) {
        this.replicationTaskName = replicationTaskName;
    }

    /**
     * <p>
     * The name of the replication task.
     * </p>
     * 
     * @return The name of the replication task.
     */

    public String getReplicationTaskName() {
        return this.replicationTaskName;
    }

    /**
     * <p>
     * The name of the replication task.
     * </p>
     * 
     * @param replicationTaskName
     *        The name of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInstanceTaskLog withReplicationTaskName(String replicationTaskName) {
        setReplicationTaskName(replicationTaskName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication task.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInstanceTaskLog withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     * 
     * @param replicationInstanceTaskLogSize
     *        The size, in bytes, of the replication task log.
     */

    public void setReplicationInstanceTaskLogSize(Long replicationInstanceTaskLogSize) {
        this.replicationInstanceTaskLogSize = replicationInstanceTaskLogSize;
    }

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     * 
     * @return The size, in bytes, of the replication task log.
     */

    public Long getReplicationInstanceTaskLogSize() {
        return this.replicationInstanceTaskLogSize;
    }

    /**
     * <p>
     * The size, in bytes, of the replication task log.
     * </p>
     * 
     * @param replicationInstanceTaskLogSize
     *        The size, in bytes, of the replication task log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationInstanceTaskLog withReplicationInstanceTaskLogSize(Long replicationInstanceTaskLogSize) {
        setReplicationInstanceTaskLogSize(replicationInstanceTaskLogSize);
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
        if (getReplicationTaskName() != null)
            sb.append("ReplicationTaskName: ").append(getReplicationTaskName()).append(",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getReplicationInstanceTaskLogSize() != null)
            sb.append("ReplicationInstanceTaskLogSize: ").append(getReplicationInstanceTaskLogSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationInstanceTaskLog == false)
            return false;
        ReplicationInstanceTaskLog other = (ReplicationInstanceTaskLog) obj;
        if (other.getReplicationTaskName() == null ^ this.getReplicationTaskName() == null)
            return false;
        if (other.getReplicationTaskName() != null && other.getReplicationTaskName().equals(this.getReplicationTaskName()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationInstanceTaskLogSize() == null ^ this.getReplicationInstanceTaskLogSize() == null)
            return false;
        if (other.getReplicationInstanceTaskLogSize() != null
                && other.getReplicationInstanceTaskLogSize().equals(this.getReplicationInstanceTaskLogSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskName() == null) ? 0 : getReplicationTaskName().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceTaskLogSize() == null) ? 0 : getReplicationInstanceTaskLogSize().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationInstanceTaskLog clone() {
        try {
            return (ReplicationInstanceTaskLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationInstanceTaskLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
