/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A block of data in an Amazon Elastic Block Store snapshot that is different from another snapshot of the same
 * volume/snapshot lineage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ChangedBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangedBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The block index.
     * </p>
     */
    private Integer blockIndex;
    /**
     * <p>
     * The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the changed
     * block that is on the second snapshot.
     * </p>
     */
    private String firstBlockToken;
    /**
     * <p>
     * The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation.
     * </p>
     */
    private String secondBlockToken;

    /**
     * <p>
     * The block index.
     * </p>
     * 
     * @param blockIndex
     *        The block index.
     */

    public void setBlockIndex(Integer blockIndex) {
        this.blockIndex = blockIndex;
    }

    /**
     * <p>
     * The block index.
     * </p>
     * 
     * @return The block index.
     */

    public Integer getBlockIndex() {
        return this.blockIndex;
    }

    /**
     * <p>
     * The block index.
     * </p>
     * 
     * @param blockIndex
     *        The block index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangedBlock withBlockIndex(Integer blockIndex) {
        setBlockIndex(blockIndex);
        return this;
    }

    /**
     * <p>
     * The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the changed
     * block that is on the second snapshot.
     * </p>
     * 
     * @param firstBlockToken
     *        The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     *        <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the
     *        changed block that is on the second snapshot.
     */

    public void setFirstBlockToken(String firstBlockToken) {
        this.firstBlockToken = firstBlockToken;
    }

    /**
     * <p>
     * The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the changed
     * block that is on the second snapshot.
     * </p>
     * 
     * @return The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     *         <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the
     *         changed block that is on the second snapshot.
     */

    public String getFirstBlockToken() {
        return this.firstBlockToken;
    }

    /**
     * <p>
     * The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the changed
     * block that is on the second snapshot.
     * </p>
     * 
     * @param firstBlockToken
     *        The block token for the block index of the <code>FirstSnapshotId</code> specified in the
     *        <code>ListChangedBlocks</code> operation. This value is absent if the first snapshot does not have the
     *        changed block that is on the second snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangedBlock withFirstBlockToken(String firstBlockToken) {
        setFirstBlockToken(firstBlockToken);
        return this;
    }

    /**
     * <p>
     * The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation.
     * </p>
     * 
     * @param secondBlockToken
     *        The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     *        <code>ListChangedBlocks</code> operation.
     */

    public void setSecondBlockToken(String secondBlockToken) {
        this.secondBlockToken = secondBlockToken;
    }

    /**
     * <p>
     * The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation.
     * </p>
     * 
     * @return The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     *         <code>ListChangedBlocks</code> operation.
     */

    public String getSecondBlockToken() {
        return this.secondBlockToken;
    }

    /**
     * <p>
     * The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     * <code>ListChangedBlocks</code> operation.
     * </p>
     * 
     * @param secondBlockToken
     *        The block token for the block index of the <code>SecondSnapshotId</code> specified in the
     *        <code>ListChangedBlocks</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangedBlock withSecondBlockToken(String secondBlockToken) {
        setSecondBlockToken(secondBlockToken);
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
        if (getBlockIndex() != null)
            sb.append("BlockIndex: ").append(getBlockIndex()).append(",");
        if (getFirstBlockToken() != null)
            sb.append("FirstBlockToken: ").append(getFirstBlockToken()).append(",");
        if (getSecondBlockToken() != null)
            sb.append("SecondBlockToken: ").append(getSecondBlockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangedBlock == false)
            return false;
        ChangedBlock other = (ChangedBlock) obj;
        if (other.getBlockIndex() == null ^ this.getBlockIndex() == null)
            return false;
        if (other.getBlockIndex() != null && other.getBlockIndex().equals(this.getBlockIndex()) == false)
            return false;
        if (other.getFirstBlockToken() == null ^ this.getFirstBlockToken() == null)
            return false;
        if (other.getFirstBlockToken() != null && other.getFirstBlockToken().equals(this.getFirstBlockToken()) == false)
            return false;
        if (other.getSecondBlockToken() == null ^ this.getSecondBlockToken() == null)
            return false;
        if (other.getSecondBlockToken() != null && other.getSecondBlockToken().equals(this.getSecondBlockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockIndex() == null) ? 0 : getBlockIndex().hashCode());
        hashCode = prime * hashCode + ((getFirstBlockToken() == null) ? 0 : getFirstBlockToken().hashCode());
        hashCode = prime * hashCode + ((getSecondBlockToken() == null) ? 0 : getSecondBlockToken().hashCode());
        return hashCode;
    }

    @Override
    public ChangedBlock clone() {
        try {
            return (ChangedBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ebs.model.transform.ChangedBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
