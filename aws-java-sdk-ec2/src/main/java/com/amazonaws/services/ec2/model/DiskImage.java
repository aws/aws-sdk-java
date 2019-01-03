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
 * Describes a disk image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DiskImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskImage implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the disk image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the disk image.
     * </p>
     */
    private DiskImageDetail image;
    /**
     * <p>
     * Information about the volume.
     * </p>
     */
    private VolumeDetail volume;

    /**
     * <p>
     * A description of the disk image.
     * </p>
     * 
     * @param description
     *        A description of the disk image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the disk image.
     * </p>
     * 
     * @return A description of the disk image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the disk image.
     * </p>
     * 
     * @param description
     *        A description of the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskImage withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the disk image.
     * </p>
     * 
     * @param image
     *        Information about the disk image.
     */

    public void setImage(DiskImageDetail image) {
        this.image = image;
    }

    /**
     * <p>
     * Information about the disk image.
     * </p>
     * 
     * @return Information about the disk image.
     */

    public DiskImageDetail getImage() {
        return this.image;
    }

    /**
     * <p>
     * Information about the disk image.
     * </p>
     * 
     * @param image
     *        Information about the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskImage withImage(DiskImageDetail image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Information about the volume.
     * </p>
     * 
     * @param volume
     *        Information about the volume.
     */

    public void setVolume(VolumeDetail volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * Information about the volume.
     * </p>
     * 
     * @return Information about the volume.
     */

    public VolumeDetail getVolume() {
        return this.volume;
    }

    /**
     * <p>
     * Information about the volume.
     * </p>
     * 
     * @param volume
     *        Information about the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskImage withVolume(VolumeDetail volume) {
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

        if (obj instanceof DiskImage == false)
            return false;
        DiskImage other = (DiskImage) obj;
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public DiskImage clone() {
        try {
            return (DiskImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
