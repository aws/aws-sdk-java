/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MoveReplicationTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MoveReplicationTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that you want to move.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The ARN of the replication instance where you want to move the task to.
     * </p>
     */
    private String targetReplicationInstanceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that you want to move.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the task that you want to move.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that you want to move.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task that you want to move.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task that you want to move.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the task that you want to move.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the replication instance where you want to move the task to.
     * </p>
     * 
     * @param targetReplicationInstanceArn
     *        The ARN of the replication instance where you want to move the task to.
     */

    public void setTargetReplicationInstanceArn(String targetReplicationInstanceArn) {
        this.targetReplicationInstanceArn = targetReplicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance where you want to move the task to.
     * </p>
     * 
     * @return The ARN of the replication instance where you want to move the task to.
     */

    public String getTargetReplicationInstanceArn() {
        return this.targetReplicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance where you want to move the task to.
     * </p>
     * 
     * @param targetReplicationInstanceArn
     *        The ARN of the replication instance where you want to move the task to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveReplicationTaskRequest withTargetReplicationInstanceArn(String targetReplicationInstanceArn) {
        setTargetReplicationInstanceArn(targetReplicationInstanceArn);
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getTargetReplicationInstanceArn() != null)
            sb.append("TargetReplicationInstanceArn: ").append(getTargetReplicationInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MoveReplicationTaskRequest == false)
            return false;
        MoveReplicationTaskRequest other = (MoveReplicationTaskRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getTargetReplicationInstanceArn() == null ^ this.getTargetReplicationInstanceArn() == null)
            return false;
        if (other.getTargetReplicationInstanceArn() != null && other.getTargetReplicationInstanceArn().equals(this.getTargetReplicationInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getTargetReplicationInstanceArn() == null) ? 0 : getTargetReplicationInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public MoveReplicationTaskRequest clone() {
        return (MoveReplicationTaskRequest) super.clone();
    }

}
