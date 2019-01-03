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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a disk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DiskInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The disk name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The disk path.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     */
    private Integer sizeInGb;
    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     */
    private Boolean isSystemDisk;

    /**
     * <p>
     * The disk name.
     * </p>
     * 
     * @param name
     *        The disk name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The disk name.
     * </p>
     * 
     * @return The disk name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The disk name.
     * </p>
     * 
     * @param name
     *        The disk name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * 
     * @param path
     *        The disk path.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * 
     * @return The disk path.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * 
     * @param path
     *        The disk path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskInfo withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB (e.g., <code>32</code>).
     */

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * 
     * @return The size of the disk in GB (e.g., <code>32</code>).
     */

    public Integer getSizeInGb() {
        return this.sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB (e.g., <code>32</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskInfo withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @param isSystemDisk
     *        A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     */

    public void setIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @return A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     */

    public Boolean getIsSystemDisk() {
        return this.isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @param isSystemDisk
     *        A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskInfo withIsSystemDisk(Boolean isSystemDisk) {
        setIsSystemDisk(isSystemDisk);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @return A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     */

    public Boolean isSystemDisk() {
        return this.isSystemDisk;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: ").append(getSizeInGb()).append(",");
        if (getIsSystemDisk() != null)
            sb.append("IsSystemDisk: ").append(getIsSystemDisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskInfo == false)
            return false;
        DiskInfo other = (DiskInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getIsSystemDisk() == null ^ this.getIsSystemDisk() == null)
            return false;
        if (other.getIsSystemDisk() != null && other.getIsSystemDisk().equals(this.getIsSystemDisk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getIsSystemDisk() == null) ? 0 : getIsSystemDisk().hashCode());
        return hashCode;
    }

    @Override
    public DiskInfo clone() {
        try {
            return (DiskInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DiskInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
