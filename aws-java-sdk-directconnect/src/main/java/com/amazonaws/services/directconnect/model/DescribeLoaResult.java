/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure containing the Letter of Authorization - Connecting Facility Assignment (LOA-CFA) for a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.nio.ByteBuffer loaContent;

    private String loaContentType;

    /**
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param loaContent
     */

    public void setLoaContent(java.nio.ByteBuffer loaContent) {
        this.loaContent = loaContent;
    }

    /**
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}
     * . Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return
     */

    public java.nio.ByteBuffer getLoaContent() {
        return this.loaContent;
    }

    /**
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param loaContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoaResult withLoaContent(java.nio.ByteBuffer loaContent) {
        setLoaContent(loaContent);
        return this;
    }

    /**
     * @param loaContentType
     * @see LoaContentType
     */

    public void setLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
    }

    /**
     * @return
     * @see LoaContentType
     */

    public String getLoaContentType() {
        return this.loaContentType;
    }

    /**
     * @param loaContentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeLoaResult withLoaContentType(String loaContentType) {
        setLoaContentType(loaContentType);
        return this;
    }

    /**
     * @param loaContentType
     * @see LoaContentType
     */

    public void setLoaContentType(LoaContentType loaContentType) {
        withLoaContentType(loaContentType);
    }

    /**
     * @param loaContentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public DescribeLoaResult withLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoaContent() != null)
            sb.append("LoaContent: ").append(getLoaContent()).append(",");
        if (getLoaContentType() != null)
            sb.append("LoaContentType: ").append(getLoaContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoaResult == false)
            return false;
        DescribeLoaResult other = (DescribeLoaResult) obj;
        if (other.getLoaContent() == null ^ this.getLoaContent() == null)
            return false;
        if (other.getLoaContent() != null && other.getLoaContent().equals(this.getLoaContent()) == false)
            return false;
        if (other.getLoaContentType() == null ^ this.getLoaContentType() == null)
            return false;
        if (other.getLoaContentType() != null && other.getLoaContentType().equals(this.getLoaContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoaContent() == null) ? 0 : getLoaContent().hashCode());
        hashCode = prime * hashCode + ((getLoaContentType() == null) ? 0 : getLoaContentType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoaResult clone() {
        try {
            return (DescribeLoaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
