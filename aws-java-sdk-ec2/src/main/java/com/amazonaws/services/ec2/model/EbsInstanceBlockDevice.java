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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a parameter used to set up an EBS volume in a block device mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EbsInstanceBlockDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsInstanceBlockDevice implements Serializable, Cloneable {

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     */
    private java.util.Date attachTime;
    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * The attachment state.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     */
    private String volumeId;

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

    public EbsInstanceBlockDevice withAttachTime(java.util.Date attachTime) {
        setAttachTime(attachTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume is deleted on instance termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the volume is deleted on instance termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * 
     * @param status
     *        The attachment state.
     * @see AttachmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * 
     * @return The attachment state.
     * @see AttachmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * 
     * @param status
     *        The attachment state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public EbsInstanceBlockDevice withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * 
     * @param status
     *        The attachment state.
     * @see AttachmentStatus
     */

    public void setStatus(AttachmentStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * 
     * @param status
     *        The attachment state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public EbsInstanceBlockDevice withStatus(AttachmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the EBS volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     * 
     * @return The ID of the EBS volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsInstanceBlockDevice withVolumeId(String volumeId) {
        setVolumeId(volumeId);
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsInstanceBlockDevice == false)
            return false;
        EbsInstanceBlockDevice other = (EbsInstanceBlockDevice) obj;
        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public EbsInstanceBlockDevice clone() {
        try {
            return (EbsInstanceBlockDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
