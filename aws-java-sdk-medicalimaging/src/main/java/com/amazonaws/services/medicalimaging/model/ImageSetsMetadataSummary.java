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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the image set metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ImageSetsMetadataSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageSetsMetadataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image set identifier.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The image set version.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The time an image set is created. Sample creation date is provided in <code>1985-04-12T23:20:50.52Z</code>
     * format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time an image set was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The DICOM tags associated with the image set.
     * </p>
     */
    private DICOMTags dICOMTags;

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @return The image set identifier.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageSetsMetadataSummary withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The image set version.
     * </p>
     * 
     * @param version
     *        The image set version.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The image set version.
     * </p>
     * 
     * @return The image set version.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The image set version.
     * </p>
     * 
     * @param version
     *        The image set version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageSetsMetadataSummary withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The time an image set is created. Sample creation date is provided in <code>1985-04-12T23:20:50.52Z</code>
     * format.
     * </p>
     * 
     * @param createdAt
     *        The time an image set is created. Sample creation date is provided in <code>1985-04-12T23:20:50.52Z</code>
     *        format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time an image set is created. Sample creation date is provided in <code>1985-04-12T23:20:50.52Z</code>
     * format.
     * </p>
     * 
     * @return The time an image set is created. Sample creation date is provided in
     *         <code>1985-04-12T23:20:50.52Z</code> format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time an image set is created. Sample creation date is provided in <code>1985-04-12T23:20:50.52Z</code>
     * format.
     * </p>
     * 
     * @param createdAt
     *        The time an image set is created. Sample creation date is provided in <code>1985-04-12T23:20:50.52Z</code>
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageSetsMetadataSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time an image set was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time an image set was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time an image set was last updated.
     * </p>
     * 
     * @return The time an image set was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time an image set was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time an image set was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageSetsMetadataSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The DICOM tags associated with the image set.
     * </p>
     * 
     * @param dICOMTags
     *        The DICOM tags associated with the image set.
     */

    public void setDICOMTags(DICOMTags dICOMTags) {
        this.dICOMTags = dICOMTags;
    }

    /**
     * <p>
     * The DICOM tags associated with the image set.
     * </p>
     * 
     * @return The DICOM tags associated with the image set.
     */

    public DICOMTags getDICOMTags() {
        return this.dICOMTags;
    }

    /**
     * <p>
     * The DICOM tags associated with the image set.
     * </p>
     * 
     * @param dICOMTags
     *        The DICOM tags associated with the image set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageSetsMetadataSummary withDICOMTags(DICOMTags dICOMTags) {
        setDICOMTags(dICOMTags);
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
        if (getImageSetId() != null)
            sb.append("ImageSetId: ").append(getImageSetId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDICOMTags() != null)
            sb.append("DICOMTags: ").append(getDICOMTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageSetsMetadataSummary == false)
            return false;
        ImageSetsMetadataSummary other = (ImageSetsMetadataSummary) obj;
        if (other.getImageSetId() == null ^ this.getImageSetId() == null)
            return false;
        if (other.getImageSetId() != null && other.getImageSetId().equals(this.getImageSetId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDICOMTags() == null ^ this.getDICOMTags() == null)
            return false;
        if (other.getDICOMTags() != null && other.getDICOMTags().equals(this.getDICOMTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDICOMTags() == null) ? 0 : getDICOMTags().hashCode());
        return hashCode;
    }

    @Override
    public ImageSetsMetadataSummary clone() {
        try {
            return (ImageSetsMetadataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.ImageSetsMetadataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
