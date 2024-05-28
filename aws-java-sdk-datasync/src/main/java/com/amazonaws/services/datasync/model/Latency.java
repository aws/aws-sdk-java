/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The latency peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak
 * value during a 1-hour interval.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Latency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Latency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     */
    private Double read;
    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     */
    private Double write;
    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     */
    private Double other;

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     * 
     * @param read
     *        Peak latency for read operations.
     */

    public void setRead(Double read) {
        this.read = read;
    }

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     * 
     * @return Peak latency for read operations.
     */

    public Double getRead() {
        return this.read;
    }

    /**
     * <p>
     * Peak latency for read operations.
     * </p>
     * 
     * @param read
     *        Peak latency for read operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withRead(Double read) {
        setRead(read);
        return this;
    }

    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     * 
     * @param write
     *        Peak latency for write operations.
     */

    public void setWrite(Double write) {
        this.write = write;
    }

    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     * 
     * @return Peak latency for write operations.
     */

    public Double getWrite() {
        return this.write;
    }

    /**
     * <p>
     * Peak latency for write operations.
     * </p>
     * 
     * @param write
     *        Peak latency for write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withWrite(Double write) {
        setWrite(write);
        return this;
    }

    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     * 
     * @param other
     *        Peak latency for operations unrelated to read and write operations.
     */

    public void setOther(Double other) {
        this.other = other;
    }

    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     * 
     * @return Peak latency for operations unrelated to read and write operations.
     */

    public Double getOther() {
        return this.other;
    }

    /**
     * <p>
     * Peak latency for operations unrelated to read and write operations.
     * </p>
     * 
     * @param other
     *        Peak latency for operations unrelated to read and write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withOther(Double other) {
        setOther(other);
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
        if (getRead() != null)
            sb.append("Read: ").append(getRead()).append(",");
        if (getWrite() != null)
            sb.append("Write: ").append(getWrite()).append(",");
        if (getOther() != null)
            sb.append("Other: ").append(getOther());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Latency == false)
            return false;
        Latency other = (Latency) obj;
        if (other.getRead() == null ^ this.getRead() == null)
            return false;
        if (other.getRead() != null && other.getRead().equals(this.getRead()) == false)
            return false;
        if (other.getWrite() == null ^ this.getWrite() == null)
            return false;
        if (other.getWrite() != null && other.getWrite().equals(this.getWrite()) == false)
            return false;
        if (other.getOther() == null ^ this.getOther() == null)
            return false;
        if (other.getOther() != null && other.getOther().equals(this.getOther()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRead() == null) ? 0 : getRead().hashCode());
        hashCode = prime * hashCode + ((getWrite() == null) ? 0 : getWrite().hashCode());
        hashCode = prime * hashCode + ((getOther() == null) ? 0 : getOther().hashCode());
        return hashCode;
    }

    @Override
    public Latency clone() {
        try {
            return (Latency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.LatencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
