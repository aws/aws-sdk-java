/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of a shard in a snapshot
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ShardDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShardDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the shard
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration details of the shard
     * </p>
     */
    private ShardConfiguration configuration;
    /**
     * <p>
     * The size of the shard's snapshot
     * </p>
     */
    private String size;
    /**
     * <p>
     * The date and time that the shard's snapshot was created
     * </p>
     */
    private java.util.Date snapshotCreationTime;

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @param name
     *        The name of the shard
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @return The name of the shard
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the shard
     * </p>
     * 
     * @param name
     *        The name of the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration details of the shard
     * </p>
     * 
     * @param configuration
     *        The configuration details of the shard
     */

    public void setConfiguration(ShardConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration details of the shard
     * </p>
     * 
     * @return The configuration details of the shard
     */

    public ShardConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration details of the shard
     * </p>
     * 
     * @param configuration
     *        The configuration details of the shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardDetail withConfiguration(ShardConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The size of the shard's snapshot
     * </p>
     * 
     * @param size
     *        The size of the shard's snapshot
     */

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the shard's snapshot
     * </p>
     * 
     * @return The size of the shard's snapshot
     */

    public String getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the shard's snapshot
     * </p>
     * 
     * @param size
     *        The size of the shard's snapshot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardDetail withSize(String size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The date and time that the shard's snapshot was created
     * </p>
     * 
     * @param snapshotCreationTime
     *        The date and time that the shard's snapshot was created
     */

    public void setSnapshotCreationTime(java.util.Date snapshotCreationTime) {
        this.snapshotCreationTime = snapshotCreationTime;
    }

    /**
     * <p>
     * The date and time that the shard's snapshot was created
     * </p>
     * 
     * @return The date and time that the shard's snapshot was created
     */

    public java.util.Date getSnapshotCreationTime() {
        return this.snapshotCreationTime;
    }

    /**
     * <p>
     * The date and time that the shard's snapshot was created
     * </p>
     * 
     * @param snapshotCreationTime
     *        The date and time that the shard's snapshot was created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardDetail withSnapshotCreationTime(java.util.Date snapshotCreationTime) {
        setSnapshotCreationTime(snapshotCreationTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSnapshotCreationTime() != null)
            sb.append("SnapshotCreationTime: ").append(getSnapshotCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShardDetail == false)
            return false;
        ShardDetail other = (ShardDetail) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotCreationTime() == null ^ this.getSnapshotCreationTime() == null)
            return false;
        if (other.getSnapshotCreationTime() != null && other.getSnapshotCreationTime().equals(this.getSnapshotCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreationTime() == null) ? 0 : getSnapshotCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ShardDetail clone() {
        try {
            return (ShardDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ShardDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
