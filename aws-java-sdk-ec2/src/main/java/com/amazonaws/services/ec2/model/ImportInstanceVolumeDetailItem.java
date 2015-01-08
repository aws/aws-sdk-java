/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an import volume task.
 * </p>
 */
public class ImportInstanceVolumeDetailItem implements Serializable {

    /**
     * The number of bytes converted so far.
     */
    private Long bytesConverted;

    /**
     * The Availability Zone where the resulting instance will reside.
     */
    private String availabilityZone;

    /**
     * The image.
     */
    private DiskImageDescription image;

    /**
     * The volume.
     */
    private DiskImageVolumeDescription volume;

    /**
     * The status of the import of this particular disk image.
     */
    private String status;

    /**
     * The status information or errors related to the disk image.
     */
    private String statusMessage;

    /**
     * 
     */
    private String description;

    /**
     * The number of bytes converted so far.
     *
     * @return The number of bytes converted so far.
     */
    public Long getBytesConverted() {
        return bytesConverted;
    }
    
    /**
     * The number of bytes converted so far.
     *
     * @param bytesConverted The number of bytes converted so far.
     */
    public void setBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
    }
    
    /**
     * The number of bytes converted so far.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bytesConverted The number of bytes converted so far.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withBytesConverted(Long bytesConverted) {
        this.bytesConverted = bytesConverted;
        return this;
    }

    /**
     * The Availability Zone where the resulting instance will reside.
     *
     * @return The Availability Zone where the resulting instance will reside.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone where the resulting instance will reside.
     *
     * @param availabilityZone The Availability Zone where the resulting instance will reside.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone where the resulting instance will reside.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone where the resulting instance will reside.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The image.
     *
     * @return The image.
     */
    public DiskImageDescription getImage() {
        return image;
    }
    
    /**
     * The image.
     *
     * @param image The image.
     */
    public void setImage(DiskImageDescription image) {
        this.image = image;
    }
    
    /**
     * The image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param image The image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withImage(DiskImageDescription image) {
        this.image = image;
        return this;
    }

    /**
     * The volume.
     *
     * @return The volume.
     */
    public DiskImageVolumeDescription getVolume() {
        return volume;
    }
    
    /**
     * The volume.
     *
     * @param volume The volume.
     */
    public void setVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
    }
    
    /**
     * The volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volume The volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withVolume(DiskImageVolumeDescription volume) {
        this.volume = volume;
        return this;
    }

    /**
     * The status of the import of this particular disk image.
     *
     * @return The status of the import of this particular disk image.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the import of this particular disk image.
     *
     * @param status The status of the import of this particular disk image.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the import of this particular disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the import of this particular disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status information or errors related to the disk image.
     *
     * @return The status information or errors related to the disk image.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * The status information or errors related to the disk image.
     *
     * @param statusMessage The status information or errors related to the disk image.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * The status information or errors related to the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The status information or errors related to the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * 
     *
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceVolumeDetailItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBytesConverted() != null) sb.append("BytesConverted: " + getBytesConverted() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getImage() != null) sb.append("Image: " + getImage() + ",");
        if (getVolume() != null) sb.append("Volume: " + getVolume() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBytesConverted() == null) ? 0 : getBytesConverted().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode()); 
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportInstanceVolumeDetailItem == false) return false;
        ImportInstanceVolumeDetailItem other = (ImportInstanceVolumeDetailItem)obj;
        
        if (other.getBytesConverted() == null ^ this.getBytesConverted() == null) return false;
        if (other.getBytesConverted() != null && other.getBytesConverted().equals(this.getBytesConverted()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getImage() == null ^ this.getImage() == null) return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false) return false; 
        if (other.getVolume() == null ^ this.getVolume() == null) return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    