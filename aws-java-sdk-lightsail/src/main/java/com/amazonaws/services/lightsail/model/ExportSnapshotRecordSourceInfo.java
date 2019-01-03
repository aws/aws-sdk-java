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
 * Describes the source of an export snapshot record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshotRecordSourceInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSnapshotRecordSourceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     */
    private String fromResourceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     */
    private String fromResourceArn;
    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     */
    private InstanceSnapshotInfo instanceSnapshotInfo;
    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     */
    private DiskSnapshotInfo diskSnapshotInfo;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * @see ExportSnapshotRecordSourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * @see ExportSnapshotRecordSourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportSnapshotRecordSourceType
     */

    public ExportSnapshotRecordSourceInfo withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportSnapshotRecordSourceType
     */

    public ExportSnapshotRecordSourceInfo withResourceType(ExportSnapshotRecordSourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the source instance or disk snapshot was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     * 
     * @return The date when the source instance or disk snapshot was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the source instance or disk snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * 
     * @param name
     *        The name of the source instance or disk snapshot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * 
     * @return The name of the source instance or disk snapshot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * 
     * @param name
     *        The name of the source instance or disk snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * 
     * @param fromResourceName
     *        The name of the snapshot's source instance or disk.
     */

    public void setFromResourceName(String fromResourceName) {
        this.fromResourceName = fromResourceName;
    }

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * 
     * @return The name of the snapshot's source instance or disk.
     */

    public String getFromResourceName() {
        return this.fromResourceName;
    }

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * 
     * @param fromResourceName
     *        The name of the snapshot's source instance or disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withFromResourceName(String fromResourceName) {
        setFromResourceName(fromResourceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * 
     * @param fromResourceArn
     *        The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     */

    public void setFromResourceArn(String fromResourceArn) {
        this.fromResourceArn = fromResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     */

    public String getFromResourceArn() {
        return this.fromResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * 
     * @param fromResourceArn
     *        The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withFromResourceArn(String fromResourceArn) {
        setFromResourceArn(fromResourceArn);
        return this;
    }

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     * 
     * @param instanceSnapshotInfo
     *        A list of objects describing an instance snapshot.
     */

    public void setInstanceSnapshotInfo(InstanceSnapshotInfo instanceSnapshotInfo) {
        this.instanceSnapshotInfo = instanceSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     * 
     * @return A list of objects describing an instance snapshot.
     */

    public InstanceSnapshotInfo getInstanceSnapshotInfo() {
        return this.instanceSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     * 
     * @param instanceSnapshotInfo
     *        A list of objects describing an instance snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withInstanceSnapshotInfo(InstanceSnapshotInfo instanceSnapshotInfo) {
        setInstanceSnapshotInfo(instanceSnapshotInfo);
        return this;
    }

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     * 
     * @param diskSnapshotInfo
     *        A list of objects describing a disk snapshot.
     */

    public void setDiskSnapshotInfo(DiskSnapshotInfo diskSnapshotInfo) {
        this.diskSnapshotInfo = diskSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     * 
     * @return A list of objects describing a disk snapshot.
     */

    public DiskSnapshotInfo getDiskSnapshotInfo() {
        return this.diskSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     * 
     * @param diskSnapshotInfo
     *        A list of objects describing a disk snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecordSourceInfo withDiskSnapshotInfo(DiskSnapshotInfo diskSnapshotInfo) {
        setDiskSnapshotInfo(diskSnapshotInfo);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFromResourceName() != null)
            sb.append("FromResourceName: ").append(getFromResourceName()).append(",");
        if (getFromResourceArn() != null)
            sb.append("FromResourceArn: ").append(getFromResourceArn()).append(",");
        if (getInstanceSnapshotInfo() != null)
            sb.append("InstanceSnapshotInfo: ").append(getInstanceSnapshotInfo()).append(",");
        if (getDiskSnapshotInfo() != null)
            sb.append("DiskSnapshotInfo: ").append(getDiskSnapshotInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotRecordSourceInfo == false)
            return false;
        ExportSnapshotRecordSourceInfo other = (ExportSnapshotRecordSourceInfo) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFromResourceName() == null ^ this.getFromResourceName() == null)
            return false;
        if (other.getFromResourceName() != null && other.getFromResourceName().equals(this.getFromResourceName()) == false)
            return false;
        if (other.getFromResourceArn() == null ^ this.getFromResourceArn() == null)
            return false;
        if (other.getFromResourceArn() != null && other.getFromResourceArn().equals(this.getFromResourceArn()) == false)
            return false;
        if (other.getInstanceSnapshotInfo() == null ^ this.getInstanceSnapshotInfo() == null)
            return false;
        if (other.getInstanceSnapshotInfo() != null && other.getInstanceSnapshotInfo().equals(this.getInstanceSnapshotInfo()) == false)
            return false;
        if (other.getDiskSnapshotInfo() == null ^ this.getDiskSnapshotInfo() == null)
            return false;
        if (other.getDiskSnapshotInfo() != null && other.getDiskSnapshotInfo().equals(this.getDiskSnapshotInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFromResourceName() == null) ? 0 : getFromResourceName().hashCode());
        hashCode = prime * hashCode + ((getFromResourceArn() == null) ? 0 : getFromResourceArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceSnapshotInfo() == null) ? 0 : getInstanceSnapshotInfo().hashCode());
        hashCode = prime * hashCode + ((getDiskSnapshotInfo() == null) ? 0 : getDiskSnapshotInfo().hashCode());
        return hashCode;
    }

    @Override
    public ExportSnapshotRecordSourceInfo clone() {
        try {
            return (ExportSnapshotRecordSourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ExportSnapshotRecordSourceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
