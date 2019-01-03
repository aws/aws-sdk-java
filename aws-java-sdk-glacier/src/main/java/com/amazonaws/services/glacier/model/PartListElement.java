/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of the part sizes of the multipart upload.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartListElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The byte range of a part, inclusive of the upper value of the range.
     * </p>
     */
    private String rangeInBytes;
    /**
     * <p>
     * The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.
     * </p>
     */
    private String sHA256TreeHash;

    /**
     * <p>
     * The byte range of a part, inclusive of the upper value of the range.
     * </p>
     * 
     * @param rangeInBytes
     *        The byte range of a part, inclusive of the upper value of the range.
     */

    public void setRangeInBytes(String rangeInBytes) {
        this.rangeInBytes = rangeInBytes;
    }

    /**
     * <p>
     * The byte range of a part, inclusive of the upper value of the range.
     * </p>
     * 
     * @return The byte range of a part, inclusive of the upper value of the range.
     */

    public String getRangeInBytes() {
        return this.rangeInBytes;
    }

    /**
     * <p>
     * The byte range of a part, inclusive of the upper value of the range.
     * </p>
     * 
     * @param rangeInBytes
     *        The byte range of a part, inclusive of the upper value of the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartListElement withRangeInBytes(String rangeInBytes) {
        setRangeInBytes(rangeInBytes);
        return this;
    }

    /**
     * <p>
     * The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.
     * </p>
     * 
     * @param sHA256TreeHash
     *        The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never
     *        <code>null</code>.
     */

    public void setSHA256TreeHash(String sHA256TreeHash) {
        this.sHA256TreeHash = sHA256TreeHash;
    }

    /**
     * <p>
     * The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.
     * </p>
     * 
     * @return The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never
     *         <code>null</code>.
     */

    public String getSHA256TreeHash() {
        return this.sHA256TreeHash;
    }

    /**
     * <p>
     * The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.
     * </p>
     * 
     * @param sHA256TreeHash
     *        The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartListElement withSHA256TreeHash(String sHA256TreeHash) {
        setSHA256TreeHash(sHA256TreeHash);
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
        if (getRangeInBytes() != null)
            sb.append("RangeInBytes: ").append(getRangeInBytes()).append(",");
        if (getSHA256TreeHash() != null)
            sb.append("SHA256TreeHash: ").append(getSHA256TreeHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartListElement == false)
            return false;
        PartListElement other = (PartListElement) obj;
        if (other.getRangeInBytes() == null ^ this.getRangeInBytes() == null)
            return false;
        if (other.getRangeInBytes() != null && other.getRangeInBytes().equals(this.getRangeInBytes()) == false)
            return false;
        if (other.getSHA256TreeHash() == null ^ this.getSHA256TreeHash() == null)
            return false;
        if (other.getSHA256TreeHash() != null && other.getSHA256TreeHash().equals(this.getSHA256TreeHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRangeInBytes() == null) ? 0 : getRangeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSHA256TreeHash() == null) ? 0 : getSHA256TreeHash().hashCode());
        return hashCode;
    }

    @Override
    public PartListElement clone() {
        try {
            return (PartListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.PartListElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
