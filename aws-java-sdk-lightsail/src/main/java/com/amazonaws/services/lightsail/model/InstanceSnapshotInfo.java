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
 * Describes an instance snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceSnapshotInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSnapshotInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     * </p>
     */
    private String fromBundleId;
    /**
     * <p>
     * The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     * </p>
     */
    private String fromBlueprintId;
    /**
     * <p>
     * A list of objects describing the disks that were attached to the source instance.
     * </p>
     */
    private java.util.List<DiskInfo> fromDiskInfo;

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param fromBundleId
     *        The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     */

    public void setFromBundleId(String fromBundleId) {
        this.fromBundleId = fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @return The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     */

    public String getFromBundleId() {
        return this.fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param fromBundleId
     *        The bundle ID from which the source instance was created (e.g., <code>micro_1_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshotInfo withFromBundleId(String fromBundleId) {
        setFromBundleId(fromBundleId);
        return this;
    }

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     * </p>
     * 
     * @param fromBlueprintId
     *        The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     */

    public void setFromBlueprintId(String fromBlueprintId) {
        this.fromBlueprintId = fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     * </p>
     * 
     * @return The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     */

    public String getFromBlueprintId() {
        return this.fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     * </p>
     * 
     * @param fromBlueprintId
     *        The blueprint ID from which the source instance (e.g., <code>os_debian_8_3</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshotInfo withFromBlueprintId(String fromBlueprintId) {
        setFromBlueprintId(fromBlueprintId);
        return this;
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source instance.
     * </p>
     * 
     * @return A list of objects describing the disks that were attached to the source instance.
     */

    public java.util.List<DiskInfo> getFromDiskInfo() {
        return fromDiskInfo;
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source instance.
     * </p>
     * 
     * @param fromDiskInfo
     *        A list of objects describing the disks that were attached to the source instance.
     */

    public void setFromDiskInfo(java.util.Collection<DiskInfo> fromDiskInfo) {
        if (fromDiskInfo == null) {
            this.fromDiskInfo = null;
            return;
        }

        this.fromDiskInfo = new java.util.ArrayList<DiskInfo>(fromDiskInfo);
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFromDiskInfo(java.util.Collection)} or {@link #withFromDiskInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fromDiskInfo
     *        A list of objects describing the disks that were attached to the source instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshotInfo withFromDiskInfo(DiskInfo... fromDiskInfo) {
        if (this.fromDiskInfo == null) {
            setFromDiskInfo(new java.util.ArrayList<DiskInfo>(fromDiskInfo.length));
        }
        for (DiskInfo ele : fromDiskInfo) {
            this.fromDiskInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source instance.
     * </p>
     * 
     * @param fromDiskInfo
     *        A list of objects describing the disks that were attached to the source instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshotInfo withFromDiskInfo(java.util.Collection<DiskInfo> fromDiskInfo) {
        setFromDiskInfo(fromDiskInfo);
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
        if (getFromBundleId() != null)
            sb.append("FromBundleId: ").append(getFromBundleId()).append(",");
        if (getFromBlueprintId() != null)
            sb.append("FromBlueprintId: ").append(getFromBlueprintId()).append(",");
        if (getFromDiskInfo() != null)
            sb.append("FromDiskInfo: ").append(getFromDiskInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSnapshotInfo == false)
            return false;
        InstanceSnapshotInfo other = (InstanceSnapshotInfo) obj;
        if (other.getFromBundleId() == null ^ this.getFromBundleId() == null)
            return false;
        if (other.getFromBundleId() != null && other.getFromBundleId().equals(this.getFromBundleId()) == false)
            return false;
        if (other.getFromBlueprintId() == null ^ this.getFromBlueprintId() == null)
            return false;
        if (other.getFromBlueprintId() != null && other.getFromBlueprintId().equals(this.getFromBlueprintId()) == false)
            return false;
        if (other.getFromDiskInfo() == null ^ this.getFromDiskInfo() == null)
            return false;
        if (other.getFromDiskInfo() != null && other.getFromDiskInfo().equals(this.getFromDiskInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromBundleId() == null) ? 0 : getFromBundleId().hashCode());
        hashCode = prime * hashCode + ((getFromBlueprintId() == null) ? 0 : getFromBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getFromDiskInfo() == null) ? 0 : getFromDiskInfo().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSnapshotInfo clone() {
        try {
            return (InstanceSnapshotInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceSnapshotInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
