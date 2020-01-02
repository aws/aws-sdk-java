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
 * Describes the disks that are available for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceStorageInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStorageInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     */
    private Long totalSizeInGB;
    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DiskInfo> disks;

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     * 
     * @param totalSizeInGB
     *        The total size of the disks, in GB.
     */

    public void setTotalSizeInGB(Long totalSizeInGB) {
        this.totalSizeInGB = totalSizeInGB;
    }

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     * 
     * @return The total size of the disks, in GB.
     */

    public Long getTotalSizeInGB() {
        return this.totalSizeInGB;
    }

    /**
     * <p>
     * The total size of the disks, in GB.
     * </p>
     * 
     * @param totalSizeInGB
     *        The total size of the disks, in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageInfo withTotalSizeInGB(Long totalSizeInGB) {
        setTotalSizeInGB(totalSizeInGB);
        return this;
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     * 
     * @return Array describing the disks that are available for the instance type.
     */

    public java.util.List<DiskInfo> getDisks() {
        if (disks == null) {
            disks = new com.amazonaws.internal.SdkInternalList<DiskInfo>();
        }
        return disks;
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     * 
     * @param disks
     *        Array describing the disks that are available for the instance type.
     */

    public void setDisks(java.util.Collection<DiskInfo> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new com.amazonaws.internal.SdkInternalList<DiskInfo>(disks);
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisks(java.util.Collection)} or {@link #withDisks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param disks
     *        Array describing the disks that are available for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageInfo withDisks(DiskInfo... disks) {
        if (this.disks == null) {
            setDisks(new com.amazonaws.internal.SdkInternalList<DiskInfo>(disks.length));
        }
        for (DiskInfo ele : disks) {
            this.disks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array describing the disks that are available for the instance type.
     * </p>
     * 
     * @param disks
     *        Array describing the disks that are available for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageInfo withDisks(java.util.Collection<DiskInfo> disks) {
        setDisks(disks);
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
        if (getTotalSizeInGB() != null)
            sb.append("TotalSizeInGB: ").append(getTotalSizeInGB()).append(",");
        if (getDisks() != null)
            sb.append("Disks: ").append(getDisks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStorageInfo == false)
            return false;
        InstanceStorageInfo other = (InstanceStorageInfo) obj;
        if (other.getTotalSizeInGB() == null ^ this.getTotalSizeInGB() == null)
            return false;
        if (other.getTotalSizeInGB() != null && other.getTotalSizeInGB().equals(this.getTotalSizeInGB()) == false)
            return false;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalSizeInGB() == null) ? 0 : getTotalSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStorageInfo clone() {
        try {
            return (InstanceStorageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
