/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The disk identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/Disk" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Disk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     */
    private Long bytes;
    /**
     * <p>
     * The disk or device name.
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     * 
     * @param bytes
     *        The amount of storage on the disk in bytes.
     */

    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     * 
     * @return The amount of storage on the disk in bytes.
     */

    public Long getBytes() {
        return this.bytes;
    }

    /**
     * <p>
     * The amount of storage on the disk in bytes.
     * </p>
     * 
     * @param bytes
     *        The amount of storage on the disk in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withBytes(Long bytes) {
        setBytes(bytes);
        return this;
    }

    /**
     * <p>
     * The disk or device name.
     * </p>
     * 
     * @param deviceName
     *        The disk or device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The disk or device name.
     * </p>
     * 
     * @return The disk or device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The disk or device name.
     * </p>
     * 
     * @param deviceName
     *        The disk or device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withDeviceName(String deviceName) {
        setDeviceName(deviceName);
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
        if (getBytes() != null)
            sb.append("Bytes: ").append(getBytes()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Disk == false)
            return false;
        Disk other = (Disk) obj;
        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public Disk clone() {
        try {
            return (Disk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
