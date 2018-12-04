/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDiskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     */
    private String diskName;
    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     * Availability Zone as the Lightsail instance where you want to create the disk.
     * </p>
     * <p>
     * Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The unique Lightsail disk name (e.g., <code>my-disk</code>).
     */

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @return The unique Lightsail disk name (e.g., <code>my-disk</code>).
     */

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * 
     * @param diskName
     *        The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withDiskName(String diskName) {
        setDiskName(diskName);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     * Availability Zone as the Lightsail instance where you want to create the disk.
     * </p>
     * <p>
     * Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     *        Availability Zone as the Lightsail instance where you want to create the disk.</p>
     *        <p>
     *        Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     * Availability Zone as the Lightsail instance where you want to create the disk.
     * </p>
     * <p>
     * Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     * 
     * @return The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     *         Availability Zone as the Lightsail instance where you want to create the disk.</p>
     *         <p>
     *         Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     * Availability Zone as the Lightsail instance where you want to create the disk.
     * </p>
     * <p>
     * Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where you want to create the disk (e.g., <code>us-east-2a</code>). Choose the same
     *        Availability Zone as the Lightsail instance where you want to create the disk.</p>
     *        <p>
     *        Use the GetRegions operation to list the Availability Zones where Lightsail is currently available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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

    public CreateDiskRequest withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
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
        if (getDiskName() != null)
            sb.append("DiskName: ").append(getDiskName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
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

        if (obj instanceof CreateDiskRequest == false)
            return false;
        CreateDiskRequest other = (CreateDiskRequest) obj;
        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
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

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public CreateDiskRequest clone() {
        return (CreateDiskRequest) super.clone();
    }

}
