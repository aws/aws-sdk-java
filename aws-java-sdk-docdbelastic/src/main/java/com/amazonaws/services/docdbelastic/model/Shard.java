/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name of the shard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/Shard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Shard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the shard was created in Universal Coordinated Time (UTC).
     * </p>
     */
    private String createTime;
    /**
     * <p>
     * The ID of the shard.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * The current status of the shard.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time when the shard was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        The time when the shard was created in Universal Coordinated Time (UTC).
     */

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the shard was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the shard was created in Universal Coordinated Time (UTC).
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the shard was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        The time when the shard was created in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withCreateTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The ID of the shard.
     * </p>
     * 
     * @param shardId
     *        The ID of the shard.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The ID of the shard.
     * </p>
     * 
     * @return The ID of the shard.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The ID of the shard.
     * </p>
     * 
     * @param shardId
     *        The ID of the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * The current status of the shard.
     * </p>
     * 
     * @param status
     *        The current status of the shard.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the shard.
     * </p>
     * 
     * @return The current status of the shard.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the shard.
     * </p>
     * 
     * @param status
     *        The current status of the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Shard withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the shard.
     * </p>
     * 
     * @param status
     *        The current status of the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Shard withStatus(Status status) {
        this.status = status.toString();
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getShardId() != null)
            sb.append("ShardId: ").append(getShardId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Shard == false)
            return false;
        Shard other = (Shard) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Shard clone() {
        try {
            return (Shard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.docdbelastic.model.transform.ShardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
