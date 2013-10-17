/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportVolumeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#importVolume(ImportVolumeRequest) ImportVolume operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#importVolume(ImportVolumeRequest)
 */
public class ImportVolumeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ImportVolumeRequest> {

    private String availabilityZone;

    private DiskImageDetail image;

    private String description;

    private VolumeDetail volume;

    /**
     * Returns the value of the AvailabilityZone property for this object.
     *
     * @return The value of the AvailabilityZone property for this object.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportVolumeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Returns the value of the Image property for this object.
     *
     * @return The value of the Image property for this object.
     */
    public DiskImageDetail getImage() {
        return image;
    }
    
    /**
     * Sets the value of the Image property for this object.
     *
     * @param image The new value for the Image property for this object.
     */
    public void setImage(DiskImageDetail image) {
        this.image = image;
    }
    
    /**
     * Sets the value of the Image property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param image The new value for the Image property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportVolumeRequest withImage(DiskImageDetail image) {
        this.image = image;
        return this;
    }

    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportVolumeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the Volume property for this object.
     *
     * @return The value of the Volume property for this object.
     */
    public VolumeDetail getVolume() {
        return volume;
    }
    
    /**
     * Sets the value of the Volume property for this object.
     *
     * @param volume The new value for the Volume property for this object.
     */
    public void setVolume(VolumeDetail volume) {
        this.volume = volume;
    }
    
    /**
     * Sets the value of the Volume property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volume The new value for the Volume property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportVolumeRequest withVolume(VolumeDetail volume) {
        this.volume = volume;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ImportVolumeRequest> getDryRunRequest() {
        Request<ImportVolumeRequest> request = new ImportVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getImage() != null) sb.append("Image: " + getImage() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getVolume() != null) sb.append("Volume: " + getVolume() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportVolumeRequest == false) return false;
        ImportVolumeRequest other = (ImportVolumeRequest)obj;
        
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getImage() == null ^ this.getImage() == null) return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getVolume() == null ^ this.getVolume() == null) return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false) return false; 
        return true;
    }
    
}
    