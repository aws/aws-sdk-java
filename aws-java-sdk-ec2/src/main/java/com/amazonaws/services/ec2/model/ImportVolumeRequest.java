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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportVolumeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ImportVolume.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ImportVolumeRequest> {

    /**
     * <p>
     * The Availability Zone for the resulting EBS volume.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A description of the volume.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The disk image.
     * </p>
     */
    private DiskImageDetail image;
    /**
     * <p>
     * The volume size.
     * </p>
     */
    private VolumeDetail volume;

    /**
     * <p>
     * The Availability Zone for the resulting EBS volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the resulting EBS volume.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the resulting EBS volume.
     * </p>
     * 
     * @return The Availability Zone for the resulting EBS volume.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the resulting EBS volume.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the resulting EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVolumeRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @return A description of the volume.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the volume.
     * </p>
     * 
     * @param description
     *        A description of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVolumeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * 
     * @param image
     *        The disk image.
     */

    public void setImage(DiskImageDetail image) {
        this.image = image;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * 
     * @return The disk image.
     */

    public DiskImageDetail getImage() {
        return this.image;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * 
     * @param image
     *        The disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVolumeRequest withImage(DiskImageDetail image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @param volume
     *        The volume size.
     */

    public void setVolume(VolumeDetail volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @return The volume size.
     */

    public VolumeDetail getVolume() {
        return this.volume;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @param volume
     *        The volume size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportVolumeRequest withVolume(VolumeDetail volume) {
        setVolume(volume);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ImportVolumeRequest> getDryRunRequest() {
        Request<ImportVolumeRequest> request = new ImportVolumeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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

        if (obj instanceof ImportVolumeRequest == false)
            return false;
        ImportVolumeRequest other = (ImportVolumeRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public ImportVolumeRequest clone() {
        return (ImportVolumeRequest) super.clone();
    }
}
