/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A structure containing the Letter of Authorization - Connecting Facility Assignment (LOA-CFA) for a connection.
 * </p>
 */
public class Loa implements Serializable, Cloneable {

    private java.nio.ByteBuffer loaContent;

    private String loaContentType;

    /**
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
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
     * @param loaContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Loa withLoaContent(java.nio.ByteBuffer loaContent) {
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

    public Loa withLoaContentType(String loaContentType) {
        setLoaContentType(loaContentType);
        return this;
    }

    /**
     * @param loaContentType
     * @see LoaContentType
     */

    public void setLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
    }

    /**
     * @param loaContentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoaContentType
     */

    public Loa withLoaContentType(LoaContentType loaContentType) {
        setLoaContentType(loaContentType);
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
            sb.append("LoaContent: " + getLoaContent() + ",");
        if (getLoaContentType() != null)
            sb.append("LoaContentType: " + getLoaContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Loa == false)
            return false;
        Loa other = (Loa) obj;
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
    public Loa clone() {
        try {
            return (Loa) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
