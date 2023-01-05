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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A reference to a block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BlockReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     */
    private String blockId;
    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     */
    private Integer endOffset;
    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     */
    private java.util.List<ChildBlock> childBlocks;

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * 
     * @param blockId
     *        Unique identifier for the block.
     */

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * 
     * @return Unique identifier for the block.
     */

    public String getBlockId() {
        return this.blockId;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * 
     * @param blockId
     *        Unique identifier for the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockReference withBlockId(String blockId) {
        setBlockId(blockId);
        return this;
    }

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     * 
     * @param beginOffset
     *        Offset of the start of the block within its parent block.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     * 
     * @return Offset of the start of the block within its parent block.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     * 
     * @param beginOffset
     *        Offset of the start of the block within its parent block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockReference withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     * 
     * @param endOffset
     *        Offset of the end of the block within its parent block.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     * 
     * @return Offset of the end of the block within its parent block.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     * 
     * @param endOffset
     *        Offset of the end of the block within its parent block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockReference withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
        return this;
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     * 
     * @return List of child blocks within this block.
     */

    public java.util.List<ChildBlock> getChildBlocks() {
        return childBlocks;
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     * 
     * @param childBlocks
     *        List of child blocks within this block.
     */

    public void setChildBlocks(java.util.Collection<ChildBlock> childBlocks) {
        if (childBlocks == null) {
            this.childBlocks = null;
            return;
        }

        this.childBlocks = new java.util.ArrayList<ChildBlock>(childBlocks);
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildBlocks(java.util.Collection)} or {@link #withChildBlocks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param childBlocks
     *        List of child blocks within this block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockReference withChildBlocks(ChildBlock... childBlocks) {
        if (this.childBlocks == null) {
            setChildBlocks(new java.util.ArrayList<ChildBlock>(childBlocks.length));
        }
        for (ChildBlock ele : childBlocks) {
            this.childBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     * 
     * @param childBlocks
     *        List of child blocks within this block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockReference withChildBlocks(java.util.Collection<ChildBlock> childBlocks) {
        setChildBlocks(childBlocks);
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
        if (getBlockId() != null)
            sb.append("BlockId: ").append(getBlockId()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset()).append(",");
        if (getChildBlocks() != null)
            sb.append("ChildBlocks: ").append(getChildBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockReference == false)
            return false;
        BlockReference other = (BlockReference) obj;
        if (other.getBlockId() == null ^ this.getBlockId() == null)
            return false;
        if (other.getBlockId() != null && other.getBlockId().equals(this.getBlockId()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getChildBlocks() == null ^ this.getChildBlocks() == null)
            return false;
        if (other.getChildBlocks() != null && other.getChildBlocks().equals(this.getChildBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockId() == null) ? 0 : getBlockId().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getChildBlocks() == null) ? 0 : getChildBlocks().hashCode());
        return hashCode;
    }

    @Override
    public BlockReference clone() {
        try {
            return (BlockReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BlockReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
