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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the disk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DiskInfo" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Long sizeInGB;
    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The type of disk.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @param sizeInGB
     *        The size of the disk in GB.
     */

    public void setSizeInGB(Long sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @return The size of the disk in GB.
     */

    public Long getSizeInGB() {
        return this.sizeInGB;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @param sizeInGB
     *        The size of the disk in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskInfo withSizeInGB(Long sizeInGB) {
        setSizeInGB(sizeInGB);
        return this;
    }

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     * 
     * @param count
     *        The number of disks with this configuration.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     * 
     * @return The number of disks with this configuration.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of disks with this configuration.
     * </p>
     * 
     * @param count
     *        The number of disks with this configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskInfo withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * 
     * @param type
     *        The type of disk.
     * @see DiskType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * 
     * @return The type of disk.
     * @see DiskType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * 
     * @param type
     *        The type of disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskType
     */

    public DiskInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of disk.
     * </p>
     * 
     * @param type
     *        The type of disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskType
     */

    public DiskInfo withType(DiskType type) {
        this.type = type.toString();
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
        if (getSizeInGB() != null)
            sb.append("SizeInGB: ").append(getSizeInGB()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getSizeInGB() == null ^ this.getSizeInGB() == null)
            return false;
        if (other.getSizeInGB() != null && other.getSizeInGB().equals(this.getSizeInGB()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInGB() == null) ? 0 : getSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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

}
