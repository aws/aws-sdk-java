/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A snapshot of an Amazon FSx for OpenZFS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/Snapshot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable, StructuredPojo {

    private String resourceARN;
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The name of the snapshot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the volume that the snapshot is of.
     * </p>
     */
    private String volumeId;

    private java.util.Date creationTime;
    /**
     * <p>
     * The lifecycle status of the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The snapshot is fully available.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;

    private LifecycleTransitionReason lifecycleTransitionReason;

    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     */
    private java.util.List<AdministrativeAction> administrativeActions;

    /**
     * @param resourceARN
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * @return
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * @param resourceARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param name
     *        The name of the snapshot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @return The name of the snapshot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param name
     *        The name of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the volume that the snapshot is of.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that the snapshot is of.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that the snapshot is of.
     * </p>
     * 
     * @return The ID of the volume that the snapshot is of.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume that the snapshot is of.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that the snapshot is of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The snapshot is fully available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The snapshot is fully available.
     *        </p>
     *        </li>
     * @see SnapshotLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The snapshot is fully available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle status of the snapshot.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Amazon FSx is creating the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The snapshot is fully available.
     *         </p>
     *         </li>
     * @see SnapshotLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The snapshot is fully available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The snapshot is fully available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotLifecycle
     */

    public Snapshot withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The snapshot is fully available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx hasn't started creating the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The snapshot is fully available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotLifecycle
     */

    public Snapshot withLifecycle(SnapshotLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * @param lifecycleTransitionReason
     */

    public void setLifecycleTransitionReason(LifecycleTransitionReason lifecycleTransitionReason) {
        this.lifecycleTransitionReason = lifecycleTransitionReason;
    }

    /**
     * @return
     */

    public LifecycleTransitionReason getLifecycleTransitionReason() {
        return this.lifecycleTransitionReason;
    }

    /**
     * @param lifecycleTransitionReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withLifecycleTransitionReason(LifecycleTransitionReason lifecycleTransitionReason) {
        setLifecycleTransitionReason(lifecycleTransitionReason);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * 
     * @return A list of administrative actions for the file system that are in process or waiting to be processed.
     *         Administrative actions describe changes to the Amazon FSx system.
     */

    public java.util.List<AdministrativeAction> getAdministrativeActions() {
        return administrativeActions;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system.
     */

    public void setAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        if (administrativeActions == null) {
            this.administrativeActions = null;
            return;
        }

        this.administrativeActions = new java.util.ArrayList<AdministrativeAction>(administrativeActions);
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdministrativeActions(java.util.Collection)} or
     * {@link #withAdministrativeActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAdministrativeActions(AdministrativeAction... administrativeActions) {
        if (this.administrativeActions == null) {
            setAdministrativeActions(new java.util.ArrayList<AdministrativeAction>(administrativeActions.length));
        }
        for (AdministrativeAction ele : administrativeActions) {
            this.administrativeActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        setAdministrativeActions(administrativeActions);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getLifecycleTransitionReason() != null)
            sb.append("LifecycleTransitionReason: ").append(getLifecycleTransitionReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAdministrativeActions() != null)
            sb.append("AdministrativeActions: ").append(getAdministrativeActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getLifecycleTransitionReason() == null ^ this.getLifecycleTransitionReason() == null)
            return false;
        if (other.getLifecycleTransitionReason() != null && other.getLifecycleTransitionReason().equals(this.getLifecycleTransitionReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAdministrativeActions() == null ^ this.getAdministrativeActions() == null)
            return false;
        if (other.getAdministrativeActions() != null && other.getAdministrativeActions().equals(this.getAdministrativeActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getLifecycleTransitionReason() == null) ? 0 : getLifecycleTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAdministrativeActions() == null) ? 0 : getAdministrativeActions().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
