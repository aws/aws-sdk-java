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
 * Describes an import volume task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstanceVolumeDetailItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceVolumeDetailItem implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     */
    private Long bytesConverted;
    /**
     * <p>
     * A description of the task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The image.
     * </p>
     */
    private DiskImageDescription image;
    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The volume.
     * </p>
     */
    private DiskImageVolumeDescription volume;

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the resulting instance will reside.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     * 
     * @return The Availability Zone where the resulting instance will reside.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the resulting instance will reside.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the resulting instance will reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     * 
     * @param bytesConverted
     *        The number of bytes converted so far.
     */

    public void setBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
    }

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     * 
     * @return The number of bytes converted so far.
     */

    public Long getBytesConverted() {
        return this.bytesConverted;
    }

    /**
     * <p>
     * The number of bytes converted so far.
     * </p>
     * 
     * @param bytesConverted
     *        The number of bytes converted so far.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withBytesConverted(Long bytesConverted) {
        setBytesConverted(bytesConverted);
        return this;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * 
     * @param description
     *        A description of the task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * 
     * @return A description of the task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * 
     * @param description
     *        A description of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The image.
     * </p>
     * 
     * @param image
     *        The image.
     */

    public void setImage(DiskImageDescription image) {
        this.image = image;
    }

    /**
     * <p>
     * The image.
     * </p>
     * 
     * @return The image.
     */

    public DiskImageDescription getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image.
     * </p>
     * 
     * @param image
     *        The image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withImage(DiskImageDescription image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     * 
     * @param status
     *        The status of the import of this particular disk image.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     * 
     * @return The status of the import of this particular disk image.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the import of this particular disk image.
     * </p>
     * 
     * @param status
     *        The status of the import of this particular disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     * 
     * @param statusMessage
     *        The status information or errors related to the disk image.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     * 
     * @return The status information or errors related to the disk image.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status information or errors related to the disk image.
     * </p>
     * 
     * @param statusMessage
     *        The status information or errors related to the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The volume.
     * </p>
     * 
     * @param volume
     *        The volume.
     */

    public void setVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * The volume.
     * </p>
     * 
     * @return The volume.
     */

    public DiskImageVolumeDescription getVolume() {
        return this.volume;
    }

    /**
     * <p>
     * The volume.
     * </p>
     * 
     * @param volume
     *        The volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceVolumeDetailItem withVolume(DiskImageVolumeDescription volume) {
        setVolume(volume);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getBytesConverted() != null)
            sb.append("BytesConverted: ").append(getBytesConverted()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getVolume() != null)
            sb.append("Volume: ").append(getVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceVolumeDetailItem == false)
            return false;
        ImportInstanceVolumeDetailItem other = (ImportInstanceVolumeDetailItem) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getBytesConverted() == null ^ this.getBytesConverted() == null)
            return false;
        if (other.getBytesConverted() != null && other.getBytesConverted().equals(this.getBytesConverted()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getVolume() == null ^ this.getVolume() == null)
            return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getBytesConverted() == null) ? 0 : getBytesConverted().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstanceVolumeDetailItem clone() {
        try {
            return (ImportInstanceVolumeDetailItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
