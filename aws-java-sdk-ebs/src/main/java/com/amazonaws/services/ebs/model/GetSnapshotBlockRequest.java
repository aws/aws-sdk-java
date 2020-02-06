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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotBlockRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot containing the block from which to get data.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The block index of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     */
    private Integer blockIndex;
    /**
     * <p>
     * The block token of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     */
    private String blockToken;

    /**
     * <p>
     * The ID of the snapshot containing the block from which to get data.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot containing the block from which to get data.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot containing the block from which to get data.
     * </p>
     * 
     * @return The ID of the snapshot containing the block from which to get data.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot containing the block from which to get data.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot containing the block from which to get data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotBlockRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The block index of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     * 
     * @param blockIndex
     *        The block index of the block from which to get data.</p>
     *        <p>
     *        Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     *        <code>ListSnapshotBlocks</code> operations.
     */

    public void setBlockIndex(Integer blockIndex) {
        this.blockIndex = blockIndex;
    }

    /**
     * <p>
     * The block index of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     * 
     * @return The block index of the block from which to get data.</p>
     *         <p>
     *         Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     *         <code>ListSnapshotBlocks</code> operations.
     */

    public Integer getBlockIndex() {
        return this.blockIndex;
    }

    /**
     * <p>
     * The block index of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     * 
     * @param blockIndex
     *        The block index of the block from which to get data.</p>
     *        <p>
     *        Obtain the <code>BlockIndex</code> by running the <code>ListChangedBlocks</code> or
     *        <code>ListSnapshotBlocks</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotBlockRequest withBlockIndex(Integer blockIndex) {
        setBlockIndex(blockIndex);
        return this;
    }

    /**
     * <p>
     * The block token of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     * 
     * @param blockToken
     *        The block token of the block from which to get data.</p>
     *        <p>
     *        Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     *        <code>ListSnapshotBlocks</code> operations.
     */

    public void setBlockToken(String blockToken) {
        this.blockToken = blockToken;
    }

    /**
     * <p>
     * The block token of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     * 
     * @return The block token of the block from which to get data.</p>
     *         <p>
     *         Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     *         <code>ListSnapshotBlocks</code> operations.
     */

    public String getBlockToken() {
        return this.blockToken;
    }

    /**
     * <p>
     * The block token of the block from which to get data.
     * </p>
     * <p>
     * Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     * <code>ListSnapshotBlocks</code> operations.
     * </p>
     * 
     * @param blockToken
     *        The block token of the block from which to get data.</p>
     *        <p>
     *        Obtain the <code>BlockToken</code> by running the <code>ListChangedBlocks</code> or
     *        <code>ListSnapshotBlocks</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotBlockRequest withBlockToken(String blockToken) {
        setBlockToken(blockToken);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getBlockIndex() != null)
            sb.append("BlockIndex: ").append(getBlockIndex()).append(",");
        if (getBlockToken() != null)
            sb.append("BlockToken: ").append(getBlockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSnapshotBlockRequest == false)
            return false;
        GetSnapshotBlockRequest other = (GetSnapshotBlockRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getBlockIndex() == null ^ this.getBlockIndex() == null)
            return false;
        if (other.getBlockIndex() != null && other.getBlockIndex().equals(this.getBlockIndex()) == false)
            return false;
        if (other.getBlockToken() == null ^ this.getBlockToken() == null)
            return false;
        if (other.getBlockToken() != null && other.getBlockToken().equals(this.getBlockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getBlockIndex() == null) ? 0 : getBlockIndex().hashCode());
        hashCode = prime * hashCode + ((getBlockToken() == null) ? 0 : getBlockToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSnapshotBlockRequest clone() {
        return (GetSnapshotBlockRequest) super.clone();
    }

}
