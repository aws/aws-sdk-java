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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a block storage disk that is attached to an instance, and is included in an automatic snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachedDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachedDisk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     */
    private String path;
    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     * 
     * @param path
     *        The path of the disk (e.g., <code>/dev/xvdf</code>).
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     * 
     * @return The path of the disk (e.g., <code>/dev/xvdf</code>).
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the disk (e.g., <code>/dev/xvdf</code>).
     * </p>
     * 
     * @param path
     *        The path of the disk (e.g., <code>/dev/xvdf</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachedDisk withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB.
     */

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @return The size of the disk in GB.
     */

    public Integer getSizeInGb() {
        return this.sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachedDisk withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: ").append(getSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachedDisk == false)
            return false;
        AttachedDisk other = (AttachedDisk) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public AttachedDisk clone() {
        try {
            return (AttachedDisk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AttachedDiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
