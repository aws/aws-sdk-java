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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ChildShard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChildShard implements Serializable, Cloneable, StructuredPojo {

    private String shardId;

    private com.amazonaws.internal.SdkInternalList<String> parentShards;

    private HashKeyRange hashKeyRange;

    /**
     * @param shardId
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * @return
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * @param shardId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildShard withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getParentShards() {
        if (parentShards == null) {
            parentShards = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return parentShards;
    }

    /**
     * @param parentShards
     */

    public void setParentShards(java.util.Collection<String> parentShards) {
        if (parentShards == null) {
            this.parentShards = null;
            return;
        }

        this.parentShards = new com.amazonaws.internal.SdkInternalList<String>(parentShards);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParentShards(java.util.Collection)} or {@link #withParentShards(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parentShards
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildShard withParentShards(String... parentShards) {
        if (this.parentShards == null) {
            setParentShards(new com.amazonaws.internal.SdkInternalList<String>(parentShards.length));
        }
        for (String ele : parentShards) {
            this.parentShards.add(ele);
        }
        return this;
    }

    /**
     * @param parentShards
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildShard withParentShards(java.util.Collection<String> parentShards) {
        setParentShards(parentShards);
        return this;
    }

    /**
     * @param hashKeyRange
     */

    public void setHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
    }

    /**
     * @return
     */

    public HashKeyRange getHashKeyRange() {
        return this.hashKeyRange;
    }

    /**
     * @param hashKeyRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildShard withHashKeyRange(HashKeyRange hashKeyRange) {
        setHashKeyRange(hashKeyRange);
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
        if (getShardId() != null)
            sb.append("ShardId: ").append(getShardId()).append(",");
        if (getParentShards() != null)
            sb.append("ParentShards: ").append(getParentShards()).append(",");
        if (getHashKeyRange() != null)
            sb.append("HashKeyRange: ").append(getHashKeyRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChildShard == false)
            return false;
        ChildShard other = (ChildShard) obj;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getParentShards() == null ^ this.getParentShards() == null)
            return false;
        if (other.getParentShards() != null && other.getParentShards().equals(this.getParentShards()) == false)
            return false;
        if (other.getHashKeyRange() == null ^ this.getHashKeyRange() == null)
            return false;
        if (other.getHashKeyRange() != null && other.getHashKeyRange().equals(this.getHashKeyRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode + ((getParentShards() == null) ? 0 : getParentShards().hashCode());
        hashCode = prime * hashCode + ((getHashKeyRange() == null) ? 0 : getHashKeyRange().hashCode());
        return hashCode;
    }

    @Override
    public ChildShard clone() {
        try {
            return (ChildShard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.ChildShardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
