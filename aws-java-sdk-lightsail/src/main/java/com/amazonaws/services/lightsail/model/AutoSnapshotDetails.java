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
 * Describes an automatic snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AutoSnapshotDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoSnapshotDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     */
    private String date;
    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot
     * was created.
     * </p>
     */
    private java.util.List<AttachedDisk> fromAttachedDisks;

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     * 
     * @param date
     *        The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     * 
     * @return The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     */

    public String getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * </p>
     * 
     * @param date
     *        The date of the automatic snapshot in <code>YYYY-MM-DD</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoSnapshotDetails withDate(String date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the automatic snapshot was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     * 
     * @return The timestamp when the automatic snapshot was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the automatic snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the automatic snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoSnapshotDetails withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * 
     * @param status
     *        The status of the automatic snapshot.
     * @see AutoSnapshotStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * 
     * @return The status of the automatic snapshot.
     * @see AutoSnapshotStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * 
     * @param status
     *        The status of the automatic snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoSnapshotStatus
     */

    public AutoSnapshotDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the automatic snapshot.
     * </p>
     * 
     * @param status
     *        The status of the automatic snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoSnapshotStatus
     */

    public AutoSnapshotDetails withStatus(AutoSnapshotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot
     * was created.
     * </p>
     * 
     * @return An array of objects that describe the block storage disks attached to the instance when the automatic
     *         snapshot was created.
     */

    public java.util.List<AttachedDisk> getFromAttachedDisks() {
        return fromAttachedDisks;
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot
     * was created.
     * </p>
     * 
     * @param fromAttachedDisks
     *        An array of objects that describe the block storage disks attached to the instance when the automatic
     *        snapshot was created.
     */

    public void setFromAttachedDisks(java.util.Collection<AttachedDisk> fromAttachedDisks) {
        if (fromAttachedDisks == null) {
            this.fromAttachedDisks = null;
            return;
        }

        this.fromAttachedDisks = new java.util.ArrayList<AttachedDisk>(fromAttachedDisks);
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot
     * was created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFromAttachedDisks(java.util.Collection)} or {@link #withFromAttachedDisks(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fromAttachedDisks
     *        An array of objects that describe the block storage disks attached to the instance when the automatic
     *        snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoSnapshotDetails withFromAttachedDisks(AttachedDisk... fromAttachedDisks) {
        if (this.fromAttachedDisks == null) {
            setFromAttachedDisks(new java.util.ArrayList<AttachedDisk>(fromAttachedDisks.length));
        }
        for (AttachedDisk ele : fromAttachedDisks) {
            this.fromAttachedDisks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot
     * was created.
     * </p>
     * 
     * @param fromAttachedDisks
     *        An array of objects that describe the block storage disks attached to the instance when the automatic
     *        snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoSnapshotDetails withFromAttachedDisks(java.util.Collection<AttachedDisk> fromAttachedDisks) {
        setFromAttachedDisks(fromAttachedDisks);
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFromAttachedDisks() != null)
            sb.append("FromAttachedDisks: ").append(getFromAttachedDisks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoSnapshotDetails == false)
            return false;
        AutoSnapshotDetails other = (AutoSnapshotDetails) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFromAttachedDisks() == null ^ this.getFromAttachedDisks() == null)
            return false;
        if (other.getFromAttachedDisks() != null && other.getFromAttachedDisks().equals(this.getFromAttachedDisks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFromAttachedDisks() == null) ? 0 : getFromAttachedDisks().hashCode());
        return hashCode;
    }

    @Override
    public AutoSnapshotDetails clone() {
        try {
            return (AutoSnapshotDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AutoSnapshotDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
