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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskFromSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDiskFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     */
    private String diskName;
    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     * </p>
     */
    private String diskSnapshotName;
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateDiskFromSnapshotRequest withDiskName(String diskName) {
        setDiskName(diskName);
        return this;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     * </p>
     * 
     * @param diskSnapshotName
     *        The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     */

    public void setDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     * </p>
     * 
     * @return The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     */

    public String getDiskSnapshotName() {
        return this.diskSnapshotName;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     * </p>
     * 
     * @param diskSnapshotName
     *        The name of the disk snapshot (e.g., <code>my-snapshot</code>) from which to create the new storage disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskFromSnapshotRequest withDiskSnapshotName(String diskSnapshotName) {
        setDiskSnapshotName(diskSnapshotName);
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

    public CreateDiskFromSnapshotRequest withAvailabilityZone(String availabilityZone) {
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

    public CreateDiskFromSnapshotRequest withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskFromSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDiskName() != null)
            sb.append("DiskName: ").append(getDiskName()).append(",");
        if (getDiskSnapshotName() != null)
            sb.append("DiskSnapshotName: ").append(getDiskSnapshotName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: ").append(getSizeInGb()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDiskFromSnapshotRequest == false)
            return false;
        CreateDiskFromSnapshotRequest other = (CreateDiskFromSnapshotRequest) obj;
        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getDiskSnapshotName() == null ^ this.getDiskSnapshotName() == null)
            return false;
        if (other.getDiskSnapshotName() != null && other.getDiskSnapshotName().equals(this.getDiskSnapshotName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode + ((getDiskSnapshotName() == null) ? 0 : getDiskSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDiskFromSnapshotRequest clone() {
        return (CreateDiskFromSnapshotRequest) super.clone();
    }

}
