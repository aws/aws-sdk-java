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
 * A block of data in an Amazon Elastic Block Store snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/Block" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Block implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The block index.
     * </p>
     */
    private Integer blockIndex;
    /**
     * <p>
     * The block token for the block index.
     * </p>
     */
    private String blockToken;

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

    public Block withBlockIndex(Integer blockIndex) {
        setBlockIndex(blockIndex);
        return this;
    }

    /**
     * <p>
     * The block token for the block index.
     * </p>
     * 
     * @param blockToken
     *        The block token for the block index.
     */

    public void setBlockToken(String blockToken) {
        this.blockToken = blockToken;
    }

    /**
     * <p>
     * The block token for the block index.
     * </p>
     * 
     * @return The block token for the block index.
     */

    public String getBlockToken() {
        return this.blockToken;
    }

    /**
     * <p>
     * The block token for the block index.
     * </p>
     * 
     * @param blockToken
     *        The block token for the block index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withBlockToken(String blockToken) {
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

        if (obj instanceof Block == false)
            return false;
        Block other = (Block) obj;
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

        hashCode = prime * hashCode + ((getBlockIndex() == null) ? 0 : getBlockIndex().hashCode());
        hashCode = prime * hashCode + ((getBlockToken() == null) ? 0 : getBlockToken().hashCode());
        return hashCode;
    }

    @Override
    public Block clone() {
        try {
            return (Block) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ebs.model.transform.BlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
