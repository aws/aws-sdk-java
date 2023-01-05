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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP or Amazon FSx for
 * OpenZFS file system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB
 * of storage. The configuration consists of the total number of provisioned SSD IOPS and how the amount was provisioned
 * (by the customer or by the system).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DiskIopsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskIopsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the number of IOPS for the file system is using the system default (<code>AUTOMATIC</code>) or
     * was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The total number of SSD IOPS provisioned for the file system.
     * </p>
     */
    private Long iops;

    /**
     * <p>
     * Specifies whether the number of IOPS for the file system is using the system default (<code>AUTOMATIC</code>) or
     * was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * </p>
     * 
     * @param mode
     *        Specifies whether the number of IOPS for the file system is using the system default (
     *        <code>AUTOMATIC</code>) or was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * @see DiskIopsConfigurationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies whether the number of IOPS for the file system is using the system default (<code>AUTOMATIC</code>) or
     * was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * </p>
     * 
     * @return Specifies whether the number of IOPS for the file system is using the system default (
     *         <code>AUTOMATIC</code>) or was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * @see DiskIopsConfigurationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specifies whether the number of IOPS for the file system is using the system default (<code>AUTOMATIC</code>) or
     * was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * </p>
     * 
     * @param mode
     *        Specifies whether the number of IOPS for the file system is using the system default (
     *        <code>AUTOMATIC</code>) or was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskIopsConfigurationMode
     */

    public DiskIopsConfiguration withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the number of IOPS for the file system is using the system default (<code>AUTOMATIC</code>) or
     * was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * </p>
     * 
     * @param mode
     *        Specifies whether the number of IOPS for the file system is using the system default (
     *        <code>AUTOMATIC</code>) or was provisioned by the customer (<code>USER_PROVISIONED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskIopsConfigurationMode
     */

    public DiskIopsConfiguration withMode(DiskIopsConfigurationMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The total number of SSD IOPS provisioned for the file system.
     * </p>
     * 
     * @param iops
     *        The total number of SSD IOPS provisioned for the file system.
     */

    public void setIops(Long iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The total number of SSD IOPS provisioned for the file system.
     * </p>
     * 
     * @return The total number of SSD IOPS provisioned for the file system.
     */

    public Long getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The total number of SSD IOPS provisioned for the file system.
     * </p>
     * 
     * @param iops
     *        The total number of SSD IOPS provisioned for the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskIopsConfiguration withIops(Long iops) {
        setIops(iops);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskIopsConfiguration == false)
            return false;
        DiskIopsConfiguration other = (DiskIopsConfiguration) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public DiskIopsConfiguration clone() {
        try {
            return (DiskIopsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DiskIopsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
