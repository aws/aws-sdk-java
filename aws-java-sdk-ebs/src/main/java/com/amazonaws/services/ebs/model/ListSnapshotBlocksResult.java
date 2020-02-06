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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListSnapshotBlocks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSnapshotBlocksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects containing information about the blocks.
     * </p>
     */
    private java.util.List<Block> blocks;
    /**
     * <p>
     * The time when the <code>BlockToken</code> expires.
     * </p>
     */
    private java.util.Date expiryTime;
    /**
     * <p>
     * The size of the volume in GB.
     * </p>
     */
    private Long volumeSize;
    /**
     * <p>
     * The size of the block.
     * </p>
     */
    private Integer blockSize;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects containing information about the blocks.
     * </p>
     * 
     * @return An array of objects containing information about the blocks.
     */

    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * An array of objects containing information about the blocks.
     * </p>
     * 
     * @param blocks
     *        An array of objects containing information about the blocks.
     */

    public void setBlocks(java.util.Collection<Block> blocks) {
        if (blocks == null) {
            this.blocks = null;
            return;
        }

        this.blocks = new java.util.ArrayList<Block>(blocks);
    }

    /**
     * <p>
     * An array of objects containing information about the blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlocks(java.util.Collection)} or {@link #withBlocks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param blocks
     *        An array of objects containing information about the blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotBlocksResult withBlocks(Block... blocks) {
        if (this.blocks == null) {
            setBlocks(new java.util.ArrayList<Block>(blocks.length));
        }
        for (Block ele : blocks) {
            this.blocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects containing information about the blocks.
     * </p>
     * 
     * @param blocks
     *        An array of objects containing information about the blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotBlocksResult withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
        return this;
    }

    /**
     * <p>
     * The time when the <code>BlockToken</code> expires.
     * </p>
     * 
     * @param expiryTime
     *        The time when the <code>BlockToken</code> expires.
     */

    public void setExpiryTime(java.util.Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * The time when the <code>BlockToken</code> expires.
     * </p>
     * 
     * @return The time when the <code>BlockToken</code> expires.
     */

    public java.util.Date getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * <p>
     * The time when the <code>BlockToken</code> expires.
     * </p>
     * 
     * @param expiryTime
     *        The time when the <code>BlockToken</code> expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotBlocksResult withExpiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * <p>
     * The size of the volume in GB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume in GB.
     */

    public void setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume in GB.
     * </p>
     * 
     * @return The size of the volume in GB.
     */

    public Long getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume in GB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotBlocksResult withVolumeSize(Long volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The size of the block.
     * </p>
     * 
     * @param blockSize
     *        The size of the block.
     */

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * <p>
     * The size of the block.
     * </p>
     * 
     * @return The size of the block.
     */

    public Integer getBlockSize() {
        return this.blockSize;
    }

    /**
     * <p>
     * The size of the block.
     * </p>
     * 
     * @param blockSize
     *        The size of the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotBlocksResult withBlockSize(Integer blockSize) {
        setBlockSize(blockSize);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotBlocksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBlocks() != null)
            sb.append("Blocks: ").append("***Sensitive Data Redacted***").append(",");
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getBlockSize() != null)
            sb.append("BlockSize: ").append(getBlockSize()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSnapshotBlocksResult == false)
            return false;
        ListSnapshotBlocksResult other = (ListSnapshotBlocksResult) obj;
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getBlockSize() == null ^ this.getBlockSize() == null)
            return false;
        if (other.getBlockSize() != null && other.getBlockSize().equals(this.getBlockSize()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getBlockSize() == null) ? 0 : getBlockSize().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSnapshotBlocksResult clone() {
        try {
            return (ListSnapshotBlocksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
