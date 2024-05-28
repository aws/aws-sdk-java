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
 * The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak value
 * during a 1-hour interval.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/IOPS" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IOPS implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     */
    private Double read;
    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     */
    private Double write;
    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     */
    private Double other;
    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     */
    private Double total;

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     * 
     * @param read
     *        Peak IOPS related to read operations.
     */

    public void setRead(Double read) {
        this.read = read;
    }

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     * 
     * @return Peak IOPS related to read operations.
     */

    public Double getRead() {
        return this.read;
    }

    /**
     * <p>
     * Peak IOPS related to read operations.
     * </p>
     * 
     * @param read
     *        Peak IOPS related to read operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IOPS withRead(Double read) {
        setRead(read);
        return this;
    }

    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     * 
     * @param write
     *        Peak IOPS related to write operations.
     */

    public void setWrite(Double write) {
        this.write = write;
    }

    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     * 
     * @return Peak IOPS related to write operations.
     */

    public Double getWrite() {
        return this.write;
    }

    /**
     * <p>
     * Peak IOPS related to write operations.
     * </p>
     * 
     * @param write
     *        Peak IOPS related to write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IOPS withWrite(Double write) {
        setWrite(write);
        return this;
    }

    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     * 
     * @param other
     *        Peak IOPS unrelated to read and write operations.
     */

    public void setOther(Double other) {
        this.other = other;
    }

    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     * 
     * @return Peak IOPS unrelated to read and write operations.
     */

    public Double getOther() {
        return this.other;
    }

    /**
     * <p>
     * Peak IOPS unrelated to read and write operations.
     * </p>
     * 
     * @param other
     *        Peak IOPS unrelated to read and write operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IOPS withOther(Double other) {
        setOther(other);
        return this;
    }

    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     * 
     * @param total
     *        Peak total IOPS on your on-premises storage system resource.
     */

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     * 
     * @return Peak total IOPS on your on-premises storage system resource.
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * <p>
     * Peak total IOPS on your on-premises storage system resource.
     * </p>
     * 
     * @param total
     *        Peak total IOPS on your on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IOPS withTotal(Double total) {
        setTotal(total);
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
            sb.append("Other: ").append(getOther()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IOPS == false)
            return false;
        IOPS other = (IOPS) obj;
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
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
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
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public IOPS clone() {
        try {
            return (IOPS) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.IOPSMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
