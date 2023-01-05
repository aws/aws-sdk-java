/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each
 * input or output individually. For more information, see
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/graphic-overlay.html. This setting is disabled by default.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ImageInserter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageInserter implements Serializable, Cloneable, StructuredPojo {

    /** Specify the images that you want to overlay on your video. The images must be PNG or TGA files. */
    private java.util.List<InsertableImage> insertableImages;
    /**
     * Specify the reference white level, in nits, for all of your image inserter images. Use to correct brightness
     * levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set SDR reference
     * white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of 100, or specify an
     * integer from 100 to 1000.
     */
    private Integer sdrReferenceWhiteLevel;

    /**
     * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     * 
     * @return Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     */

    public java.util.List<InsertableImage> getInsertableImages() {
        return insertableImages;
    }

    /**
     * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     * 
     * @param insertableImages
     *        Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     */

    public void setInsertableImages(java.util.Collection<InsertableImage> insertableImages) {
        if (insertableImages == null) {
            this.insertableImages = null;
            return;
        }

        this.insertableImages = new java.util.ArrayList<InsertableImage>(insertableImages);
    }

    /**
     * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsertableImages(java.util.Collection)} or {@link #withInsertableImages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param insertableImages
     *        Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageInserter withInsertableImages(InsertableImage... insertableImages) {
        if (this.insertableImages == null) {
            setInsertableImages(new java.util.ArrayList<InsertableImage>(insertableImages.length));
        }
        for (InsertableImage ele : insertableImages) {
            this.insertableImages.add(ele);
        }
        return this;
    }

    /**
     * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     * 
     * @param insertableImages
     *        Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageInserter withInsertableImages(java.util.Collection<InsertableImage> insertableImages) {
        setInsertableImages(insertableImages);
        return this;
    }

    /**
     * Specify the reference white level, in nits, for all of your image inserter images. Use to correct brightness
     * levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set SDR reference
     * white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of 100, or specify an
     * integer from 100 to 1000.
     * 
     * @param sdrReferenceWhiteLevel
     *        Specify the reference white level, in nits, for all of your image inserter images. Use to correct
     *        brightness levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set
     *        SDR reference white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of
     *        100, or specify an integer from 100 to 1000.
     */

    public void setSdrReferenceWhiteLevel(Integer sdrReferenceWhiteLevel) {
        this.sdrReferenceWhiteLevel = sdrReferenceWhiteLevel;
    }

    /**
     * Specify the reference white level, in nits, for all of your image inserter images. Use to correct brightness
     * levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set SDR reference
     * white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of 100, or specify an
     * integer from 100 to 1000.
     * 
     * @return Specify the reference white level, in nits, for all of your image inserter images. Use to correct
     *         brightness levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set
     *         SDR reference white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of
     *         100, or specify an integer from 100 to 1000.
     */

    public Integer getSdrReferenceWhiteLevel() {
        return this.sdrReferenceWhiteLevel;
    }

    /**
     * Specify the reference white level, in nits, for all of your image inserter images. Use to correct brightness
     * levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set SDR reference
     * white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of 100, or specify an
     * integer from 100 to 1000.
     * 
     * @param sdrReferenceWhiteLevel
     *        Specify the reference white level, in nits, for all of your image inserter images. Use to correct
     *        brightness levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set
     *        SDR reference white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of
     *        100, or specify an integer from 100 to 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageInserter withSdrReferenceWhiteLevel(Integer sdrReferenceWhiteLevel) {
        setSdrReferenceWhiteLevel(sdrReferenceWhiteLevel);
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
        if (getInsertableImages() != null)
            sb.append("InsertableImages: ").append(getInsertableImages()).append(",");
        if (getSdrReferenceWhiteLevel() != null)
            sb.append("SdrReferenceWhiteLevel: ").append(getSdrReferenceWhiteLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageInserter == false)
            return false;
        ImageInserter other = (ImageInserter) obj;
        if (other.getInsertableImages() == null ^ this.getInsertableImages() == null)
            return false;
        if (other.getInsertableImages() != null && other.getInsertableImages().equals(this.getInsertableImages()) == false)
            return false;
        if (other.getSdrReferenceWhiteLevel() == null ^ this.getSdrReferenceWhiteLevel() == null)
            return false;
        if (other.getSdrReferenceWhiteLevel() != null && other.getSdrReferenceWhiteLevel().equals(this.getSdrReferenceWhiteLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsertableImages() == null) ? 0 : getInsertableImages().hashCode());
        hashCode = prime * hashCode + ((getSdrReferenceWhiteLevel() == null) ? 0 : getSdrReferenceWhiteLevel().hashCode());
        return hashCode;
    }

    @Override
    public ImageInserter clone() {
        try {
            return (ImageInserter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ImageInserterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
