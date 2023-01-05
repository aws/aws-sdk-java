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
 * Nested block contained within a block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ChildBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChildBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     */
    private String childBlockId;
    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * 
     * @param childBlockId
     *        Unique identifier for the child block.
     */

    public void setChildBlockId(String childBlockId) {
        this.childBlockId = childBlockId;
    }

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * 
     * @return Unique identifier for the child block.
     */

    public String getChildBlockId() {
        return this.childBlockId;
    }

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * 
     * @param childBlockId
     *        Unique identifier for the child block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildBlock withChildBlockId(String childBlockId) {
        setChildBlockId(childBlockId);
        return this;
    }

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     * 
     * @param beginOffset
     *        Offset of the start of the child block within its parent block.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     * 
     * @return Offset of the start of the child block within its parent block.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     * 
     * @param beginOffset
     *        Offset of the start of the child block within its parent block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildBlock withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     * 
     * @param endOffset
     *        Offset of the end of the child block within its parent block.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     * 
     * @return Offset of the end of the child block within its parent block.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     * 
     * @param endOffset
     *        Offset of the end of the child block within its parent block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildBlock withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
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
        if (getChildBlockId() != null)
            sb.append("ChildBlockId: ").append(getChildBlockId()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChildBlock == false)
            return false;
        ChildBlock other = (ChildBlock) obj;
        if (other.getChildBlockId() == null ^ this.getChildBlockId() == null)
            return false;
        if (other.getChildBlockId() != null && other.getChildBlockId().equals(this.getChildBlockId()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChildBlockId() == null) ? 0 : getChildBlockId().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public ChildBlock clone() {
        try {
            return (ChildBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.ChildBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
