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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDiskSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDiskSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>instance name</code> parameter. The
     * <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     */
    private String diskName;
    /**
     * <p>
     * The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     */
    private String diskSnapshotName;
    /**
     * <p>
     * The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined,
     * a snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code> parameter. The
     * <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     */
    private String instanceName;
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
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>instance name</code> parameter. The
     * <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * 
     * @param diskName
     *        The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).</p> <note>
     *        <p>
     *        This parameter cannot be defined together with the <code>instance name</code> parameter. The
     *        <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     *        </p>
     */

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>instance name</code> parameter. The
     * <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * 
     * @return The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).</p> <note>
     *         <p>
     *         This parameter cannot be defined together with the <code>instance name</code> parameter. The
     *         <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     *         </p>
     */

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>instance name</code> parameter. The
     * <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * 
     * @param diskName
     *        The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).</p> <note>
     *        <p>
     *        This parameter cannot be defined together with the <code>instance name</code> parameter. The
     *        <code>disk name</code> and <code>instance name</code> parameters are mutually exclusive.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskSnapshotRequest withDiskName(String diskName) {
        setDiskName(diskName);
        return this;
    }

    /**
     * <p>
     * The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * 
     * @param diskSnapshotName
     *        The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     */

    public void setDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
    }

    /**
     * <p>
     * The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * 
     * @return The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     */

    public String getDiskSnapshotName() {
        return this.diskSnapshotName;
    }

    /**
     * <p>
     * The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * 
     * @param diskSnapshotName
     *        The name of the destination disk snapshot (e.g., <code>my-disk-snapshot</code>) based on the source disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskSnapshotRequest withDiskSnapshotName(String diskSnapshotName) {
        setDiskSnapshotName(diskSnapshotName);
        return this;
    }

    /**
     * <p>
     * The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined,
     * a snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code> parameter. The
     * <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * 
     * @param instanceName
     *        The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is
     *        defined, a snapshot of the instance's system volume is created.</p> <note>
     *        <p>
     *        This parameter cannot be defined together with the <code>disk name</code> parameter. The
     *        <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     *        </p>
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined,
     * a snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code> parameter. The
     * <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * 
     * @return The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is
     *         defined, a snapshot of the instance's system volume is created.</p> <note>
     *         <p>
     *         This parameter cannot be defined together with the <code>disk name</code> parameter. The
     *         <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     *         </p>
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined,
     * a snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code> parameter. The
     * <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * 
     * @param instanceName
     *        The unique name of the source instance (e.g., <code>Amazon_Linux-512MB-Virginia-1</code>). When this is
     *        defined, a snapshot of the instance's system volume is created.</p> <note>
     *        <p>
     *        This parameter cannot be defined together with the <code>disk name</code> parameter. The
     *        <code>instance name</code> and <code>disk name</code> parameters are mutually exclusive.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDiskSnapshotRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
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

    public CreateDiskSnapshotRequest withTags(Tag... tags) {
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

    public CreateDiskSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
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

        if (obj instanceof CreateDiskSnapshotRequest == false)
            return false;
        CreateDiskSnapshotRequest other = (CreateDiskSnapshotRequest) obj;
        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getDiskSnapshotName() == null ^ this.getDiskSnapshotName() == null)
            return false;
        if (other.getDiskSnapshotName() != null && other.getDiskSnapshotName().equals(this.getDiskSnapshotName()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
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
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDiskSnapshotRequest clone() {
        return (CreateDiskSnapshotRequest) super.clone();
    }

}
