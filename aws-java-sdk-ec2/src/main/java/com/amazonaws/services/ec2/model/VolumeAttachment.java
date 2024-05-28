/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes volume attachment details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeAttachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeAttachment implements Serializable, Cloneable {

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     */
    private java.util.Date attachTime;
    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     */
    private String device;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     * </p>
     */
    private String associatedResource;
    /**
     * <p>
     * The service principal of Amazon Web Services service that owns the underlying instance to which the volume is
     * attached.
     * </p>
     * <p>
     * This parameter is returned only for volumes that are attached to Fargate tasks.
     * </p>
     */
    private String instanceOwningService;

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * 
     * @param attachTime
     *        The time stamp when the attachment initiated.
     */

    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * 
     * @return The time stamp when the attachment initiated.
     */

    public java.util.Date getAttachTime() {
        return this.attachTime;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * 
     * @param attachTime
     *        The time stamp when the attachment initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withAttachTime(java.util.Date attachTime) {
        setAttachTime(attachTime);
        return this;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     * 
     * @param device
     *        The device name.</p>
     *        <p>
     *        If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     * 
     * @return The device name.</p>
     *         <p>
     *         If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     * 
     * @param device
     *        The device name.</p>
     *        <p>
     *        If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.</p>
     *        <p>
     *        If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     * 
     * @return The ID of the instance.</p>
     *         <p>
     *         If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.</p>
     *        <p>
     *        If the volume is attached to a Fargate task, this parameter returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @see VolumeAttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @return The attachment state of the volume.
     * @see VolumeAttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeAttachmentState
     */

    public VolumeAttachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @see VolumeAttachmentState
     */

    public void setState(VolumeAttachmentState state) {
        withState(state);
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeAttachmentState
     */

    public VolumeAttachment withState(VolumeAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     * </p>
     * 
     * @param associatedResource
     *        The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     */

    public void setAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     * </p>
     * 
     * @return The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     */

    public String getAssociatedResource() {
        return this.associatedResource;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     * </p>
     * 
     * @param associatedResource
     *        The ARN of the Amazon ECS or Fargate task to which the volume is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withAssociatedResource(String associatedResource) {
        setAssociatedResource(associatedResource);
        return this;
    }

    /**
     * <p>
     * The service principal of Amazon Web Services service that owns the underlying instance to which the volume is
     * attached.
     * </p>
     * <p>
     * This parameter is returned only for volumes that are attached to Fargate tasks.
     * </p>
     * 
     * @param instanceOwningService
     *        The service principal of Amazon Web Services service that owns the underlying instance to which the volume
     *        is attached.</p>
     *        <p>
     *        This parameter is returned only for volumes that are attached to Fargate tasks.
     */

    public void setInstanceOwningService(String instanceOwningService) {
        this.instanceOwningService = instanceOwningService;
    }

    /**
     * <p>
     * The service principal of Amazon Web Services service that owns the underlying instance to which the volume is
     * attached.
     * </p>
     * <p>
     * This parameter is returned only for volumes that are attached to Fargate tasks.
     * </p>
     * 
     * @return The service principal of Amazon Web Services service that owns the underlying instance to which the
     *         volume is attached.</p>
     *         <p>
     *         This parameter is returned only for volumes that are attached to Fargate tasks.
     */

    public String getInstanceOwningService() {
        return this.instanceOwningService;
    }

    /**
     * <p>
     * The service principal of Amazon Web Services service that owns the underlying instance to which the volume is
     * attached.
     * </p>
     * <p>
     * This parameter is returned only for volumes that are attached to Fargate tasks.
     * </p>
     * 
     * @param instanceOwningService
     *        The service principal of Amazon Web Services service that owns the underlying instance to which the volume
     *        is attached.</p>
     *        <p>
     *        This parameter is returned only for volumes that are attached to Fargate tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeAttachment withInstanceOwningService(String instanceOwningService) {
        setInstanceOwningService(instanceOwningService);
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
        if (getAttachTime() != null)
            sb.append("AttachTime: ").append(getAttachTime()).append(",");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getAssociatedResource() != null)
            sb.append("AssociatedResource: ").append(getAssociatedResource()).append(",");
        if (getInstanceOwningService() != null)
            sb.append("InstanceOwningService: ").append(getInstanceOwningService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeAttachment == false)
            return false;
        VolumeAttachment other = (VolumeAttachment) obj;
        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getAssociatedResource() == null ^ this.getAssociatedResource() == null)
            return false;
        if (other.getAssociatedResource() != null && other.getAssociatedResource().equals(this.getAssociatedResource()) == false)
            return false;
        if (other.getInstanceOwningService() == null ^ this.getInstanceOwningService() == null)
            return false;
        if (other.getInstanceOwningService() != null && other.getInstanceOwningService().equals(this.getInstanceOwningService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResource() == null) ? 0 : getAssociatedResource().hashCode());
        hashCode = prime * hashCode + ((getInstanceOwningService() == null) ? 0 : getInstanceOwningService().hashCode());
        return hashCode;
    }

    @Override
    public VolumeAttachment clone() {
        try {
            return (VolumeAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
