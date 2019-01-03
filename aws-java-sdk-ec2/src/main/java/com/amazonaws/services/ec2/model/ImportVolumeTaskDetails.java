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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportVolumeTaskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportVolumeTaskDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone where the resulting volume will reside.
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
     * The description you provided when starting the import volume task.
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
     * The volume.
     * </p>
     */
    private DiskImageVolumeDescription volume;

    /**
     * <p>
     * The Availability Zone where the resulting volume will reside.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the resulting volume will reside.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the resulting volume will reside.
     * </p>
     * 
     * @return The Availability Zone where the resulting volume will reside.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the resulting volume will reside.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the resulting volume will reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVolumeTaskDetails withAvailabilityZone(String availabilityZone) {
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

    public ImportVolumeTaskDetails withBytesConverted(Long bytesConverted) {
        setBytesConverted(bytesConverted);
        return this;
    }

    /**
     * <p>
     * The description you provided when starting the import volume task.
     * </p>
     * 
     * @param description
     *        The description you provided when starting the import volume task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description you provided when starting the import volume task.
     * </p>
     * 
     * @return The description you provided when starting the import volume task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description you provided when starting the import volume task.
     * </p>
     * 
     * @param description
     *        The description you provided when starting the import volume task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVolumeTaskDetails withDescription(String description) {
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

    public ImportVolumeTaskDetails withImage(DiskImageDescription image) {
        setImage(image);
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

    public ImportVolumeTaskDetails withVolume(DiskImageVolumeDescription volume) {
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

        if (obj instanceof ImportVolumeTaskDetails == false)
            return false;
        ImportVolumeTaskDetails other = (ImportVolumeTaskDetails) obj;
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
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public ImportVolumeTaskDetails clone() {
        try {
            return (ImportVolumeTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
