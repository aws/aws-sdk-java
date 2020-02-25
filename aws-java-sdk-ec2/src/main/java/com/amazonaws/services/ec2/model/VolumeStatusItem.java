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
 * Describes the volume status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeStatusItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusItem implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeStatusAction> actions;
    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeStatusEvent> events;
    /**
     * <p>
     * The volume ID.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The volume status.
     * </p>
     */
    private VolumeStatusInfo volumeStatus;
    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeStatusAttachmentStatus> attachmentStatuses;

    /**
     * <p>
     * The details of the operation.
     * </p>
     * 
     * @return The details of the operation.
     */

    public java.util.List<VolumeStatusAction> getActions() {
        if (actions == null) {
            actions = new com.amazonaws.internal.SdkInternalList<VolumeStatusAction>();
        }
        return actions;
    }

    /**
     * <p>
     * The details of the operation.
     * </p>
     * 
     * @param actions
     *        The details of the operation.
     */

    public void setActions(java.util.Collection<VolumeStatusAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new com.amazonaws.internal.SdkInternalList<VolumeStatusAction>(actions);
    }

    /**
     * <p>
     * The details of the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The details of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withActions(VolumeStatusAction... actions) {
        if (this.actions == null) {
            setActions(new com.amazonaws.internal.SdkInternalList<VolumeStatusAction>(actions.length));
        }
        for (VolumeStatusAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the operation.
     * </p>
     * 
     * @param actions
     *        The details of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withActions(java.util.Collection<VolumeStatusAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the volume.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     * 
     * @return The Availability Zone of the volume.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     * 
     * @return A list of events associated with the volume.
     */

    public java.util.List<VolumeStatusEvent> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<VolumeStatusEvent>();
        }
        return events;
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     * 
     * @param events
     *        A list of events associated with the volume.
     */

    public void setEvents(java.util.Collection<VolumeStatusEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<VolumeStatusEvent>(events);
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A list of events associated with the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withEvents(VolumeStatusEvent... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<VolumeStatusEvent>(events.length));
        }
        for (VolumeStatusEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     * 
     * @param events
     *        A list of events associated with the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withEvents(java.util.Collection<VolumeStatusEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @param volumeId
     *        The volume ID.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @return The volume ID.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @param volumeId
     *        The volume ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The volume status.
     * </p>
     * 
     * @param volumeStatus
     *        The volume status.
     */

    public void setVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    /**
     * <p>
     * The volume status.
     * </p>
     * 
     * @return The volume status.
     */

    public VolumeStatusInfo getVolumeStatus() {
        return this.volumeStatus;
    }

    /**
     * <p>
     * The volume status.
     * </p>
     * 
     * @param volumeStatus
     *        The volume status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withVolumeStatus(VolumeStatusInfo volumeStatus) {
        setVolumeStatus(volumeStatus);
        return this;
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     * 
     * @return Information about the instances to which the volume is attached.
     */

    public java.util.List<VolumeStatusAttachmentStatus> getAttachmentStatuses() {
        if (attachmentStatuses == null) {
            attachmentStatuses = new com.amazonaws.internal.SdkInternalList<VolumeStatusAttachmentStatus>();
        }
        return attachmentStatuses;
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     * 
     * @param attachmentStatuses
     *        Information about the instances to which the volume is attached.
     */

    public void setAttachmentStatuses(java.util.Collection<VolumeStatusAttachmentStatus> attachmentStatuses) {
        if (attachmentStatuses == null) {
            this.attachmentStatuses = null;
            return;
        }

        this.attachmentStatuses = new com.amazonaws.internal.SdkInternalList<VolumeStatusAttachmentStatus>(attachmentStatuses);
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentStatuses(java.util.Collection)} or {@link #withAttachmentStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param attachmentStatuses
     *        Information about the instances to which the volume is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withAttachmentStatuses(VolumeStatusAttachmentStatus... attachmentStatuses) {
        if (this.attachmentStatuses == null) {
            setAttachmentStatuses(new com.amazonaws.internal.SdkInternalList<VolumeStatusAttachmentStatus>(attachmentStatuses.length));
        }
        for (VolumeStatusAttachmentStatus ele : attachmentStatuses) {
            this.attachmentStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     * 
     * @param attachmentStatuses
     *        Information about the instances to which the volume is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusItem withAttachmentStatuses(java.util.Collection<VolumeStatusAttachmentStatus> attachmentStatuses) {
        setAttachmentStatuses(attachmentStatuses);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getVolumeStatus() != null)
            sb.append("VolumeStatus: ").append(getVolumeStatus()).append(",");
        if (getAttachmentStatuses() != null)
            sb.append("AttachmentStatuses: ").append(getAttachmentStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusItem == false)
            return false;
        VolumeStatusItem other = (VolumeStatusItem) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeStatus() == null ^ this.getVolumeStatus() == null)
            return false;
        if (other.getVolumeStatus() != null && other.getVolumeStatus().equals(this.getVolumeStatus()) == false)
            return false;
        if (other.getAttachmentStatuses() == null ^ this.getAttachmentStatuses() == null)
            return false;
        if (other.getAttachmentStatuses() != null && other.getAttachmentStatuses().equals(this.getAttachmentStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeStatus() == null) ? 0 : getVolumeStatus().hashCode());
        hashCode = prime * hashCode + ((getAttachmentStatuses() == null) ? 0 : getAttachmentStatuses().hashCode());
        return hashCode;
    }

    @Override
    public VolumeStatusItem clone() {
        try {
            return (VolumeStatusItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
