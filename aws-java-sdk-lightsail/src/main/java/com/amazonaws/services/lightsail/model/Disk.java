/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the hard disk (an SSD).
 * </p>
 */
public class Disk implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the disk.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The date when the disk was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The region and Availability Zone where the disk is located.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The resource type of the disk.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Integer sizeInGb;
    /**
     * <p>
     * The number of GB in use by the disk.
     * </p>
     */
    private Integer gbInUse;
    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     */
    private Boolean isSystemDisk;
    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The disk path.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     */
    private String attachedTo;
    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     */
    private Boolean isAttached;
    /**
     * <p>
     * The attachment state of the disk.
     * </p>
     */
    private String attachmentState;

    /**
     * <p>
     * The name of the disk.
     * </p>
     * 
     * @param name
     *        The name of the disk.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the disk.
     * </p>
     * 
     * @return The name of the disk.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the disk.
     * </p>
     * 
     * @param name
     *        The name of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the disk.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the disk.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about an instance or
     *         another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *         more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the disk was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * 
     * @return The date when the disk was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the disk was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The region and Availability Zone where the disk is located.
     * </p>
     * 
     * @param location
     *        The region and Availability Zone where the disk is located.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region and Availability Zone where the disk is located.
     * </p>
     * 
     * @return The region and Availability Zone where the disk is located.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The region and Availability Zone where the disk is located.
     * </p>
     * 
     * @param location
     *        The region and Availability Zone where the disk is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The resource type of the disk.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the disk.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the disk.
     * </p>
     * 
     * @return The resource type of the disk.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the disk.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Disk withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the disk.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the disk.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type of the disk.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Disk withResourceType(ResourceType resourceType) {
        setResourceType(resourceType);
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

    public Disk withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * The number of GB in use by the disk.
     * </p>
     * 
     * @param gbInUse
     *        The number of GB in use by the disk.
     */

    public void setGbInUse(Integer gbInUse) {
        this.gbInUse = gbInUse;
    }

    /**
     * <p>
     * The number of GB in use by the disk.
     * </p>
     * 
     * @return The number of GB in use by the disk.
     */

    public Integer getGbInUse() {
        return this.gbInUse;
    }

    /**
     * <p>
     * The number of GB in use by the disk.
     * </p>
     * 
     * @param gbInUse
     *        The number of GB in use by the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withGbInUse(Integer gbInUse) {
        setGbInUse(gbInUse);
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

    public Disk withIsSystemDisk(Boolean isSystemDisk) {
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
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * 
     * @param iops
     *        The input/output operations per second (IOPS) of the disk.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * 
     * @return The input/output operations per second (IOPS) of the disk.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * 
     * @param iops
     *        The input/output operations per second (IOPS) of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withIops(Integer iops) {
        setIops(iops);
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

    public Disk withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resources to which the disk is attached.
     */

    public void setAttachedTo(String attachedTo) {
        this.attachedTo = attachedTo;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * 
     * @return The resources to which the disk is attached.
     */

    public String getAttachedTo() {
        return this.attachedTo;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resources to which the disk is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withAttachedTo(String attachedTo) {
        setAttachedTo(attachedTo);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @param isAttached
     *        A Boolean value indicating whether the disk is attached.
     */

    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @return A Boolean value indicating whether the disk is attached.
     */

    public Boolean getIsAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @param isAttached
     *        A Boolean value indicating whether the disk is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withIsAttached(Boolean isAttached) {
        setIsAttached(isAttached);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @return A Boolean value indicating whether the disk is attached.
     */

    public Boolean isAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * The attachment state of the disk.
     * </p>
     * 
     * @param attachmentState
     *        The attachment state of the disk.
     */

    public void setAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
    }

    /**
     * <p>
     * The attachment state of the disk.
     * </p>
     * 
     * @return The attachment state of the disk.
     */

    public String getAttachmentState() {
        return this.attachmentState;
    }

    /**
     * <p>
     * The attachment state of the disk.
     * </p>
     * 
     * @param attachmentState
     *        The attachment state of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withAttachmentState(String attachmentState) {
        setAttachmentState(attachmentState);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getSupportCode() != null)
            sb.append("SupportCode: " + getSupportCode() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: " + getSizeInGb() + ",");
        if (getGbInUse() != null)
            sb.append("GbInUse: " + getGbInUse() + ",");
        if (getIsSystemDisk() != null)
            sb.append("IsSystemDisk: " + getIsSystemDisk() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getAttachedTo() != null)
            sb.append("AttachedTo: " + getAttachedTo() + ",");
        if (getIsAttached() != null)
            sb.append("IsAttached: " + getIsAttached() + ",");
        if (getAttachmentState() != null)
            sb.append("AttachmentState: " + getAttachmentState());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getGbInUse() == null ^ this.getGbInUse() == null)
            return false;
        if (other.getGbInUse() != null && other.getGbInUse().equals(this.getGbInUse()) == false)
            return false;
        if (other.getIsSystemDisk() == null ^ this.getIsSystemDisk() == null)
            return false;
        if (other.getIsSystemDisk() != null && other.getIsSystemDisk().equals(this.getIsSystemDisk()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getAttachedTo() == null ^ this.getAttachedTo() == null)
            return false;
        if (other.getAttachedTo() != null && other.getAttachedTo().equals(this.getAttachedTo()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        if (other.getAttachmentState() == null ^ this.getAttachmentState() == null)
            return false;
        if (other.getAttachmentState() != null && other.getAttachmentState().equals(this.getAttachmentState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getGbInUse() == null) ? 0 : getGbInUse().hashCode());
        hashCode = prime * hashCode + ((getIsSystemDisk() == null) ? 0 : getIsSystemDisk().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getAttachedTo() == null) ? 0 : getAttachedTo().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        hashCode = prime * hashCode + ((getAttachmentState() == null) ? 0 : getAttachmentState().hashCode());
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
}
