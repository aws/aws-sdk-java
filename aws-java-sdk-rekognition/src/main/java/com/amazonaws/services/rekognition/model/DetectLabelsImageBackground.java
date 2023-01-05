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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The background of the image with regard to image quality and dominant colors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectLabelsImageBackground implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The quality of the image background as defined by brightness and sharpness.
     * </p>
     */
    private DetectLabelsImageQuality quality;
    /**
     * <p>
     * The dominant colors found in the background of an image, defined with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     */
    private java.util.List<DominantColor> dominantColors;

    /**
     * <p>
     * The quality of the image background as defined by brightness and sharpness.
     * </p>
     * 
     * @param quality
     *        The quality of the image background as defined by brightness and sharpness.
     */

    public void setQuality(DetectLabelsImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * The quality of the image background as defined by brightness and sharpness.
     * </p>
     * 
     * @return The quality of the image background as defined by brightness and sharpness.
     */

    public DetectLabelsImageQuality getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * The quality of the image background as defined by brightness and sharpness.
     * </p>
     * 
     * @param quality
     *        The quality of the image background as defined by brightness and sharpness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageBackground withQuality(DetectLabelsImageQuality quality) {
        setQuality(quality);
        return this;
    }

    /**
     * <p>
     * The dominant colors found in the background of an image, defined with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * 
     * @return The dominant colors found in the background of an image, defined with RGB values, CSS color name,
     *         simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     */

    public java.util.List<DominantColor> getDominantColors() {
        return dominantColors;
    }

    /**
     * <p>
     * The dominant colors found in the background of an image, defined with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * 
     * @param dominantColors
     *        The dominant colors found in the background of an image, defined with RGB values, CSS color name,
     *        simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     */

    public void setDominantColors(java.util.Collection<DominantColor> dominantColors) {
        if (dominantColors == null) {
            this.dominantColors = null;
            return;
        }

        this.dominantColors = new java.util.ArrayList<DominantColor>(dominantColors);
    }

    /**
     * <p>
     * The dominant colors found in the background of an image, defined with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDominantColors(java.util.Collection)} or {@link #withDominantColors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dominantColors
     *        The dominant colors found in the background of an image, defined with RGB values, CSS color name,
     *        simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageBackground withDominantColors(DominantColor... dominantColors) {
        if (this.dominantColors == null) {
            setDominantColors(new java.util.ArrayList<DominantColor>(dominantColors.length));
        }
        for (DominantColor ele : dominantColors) {
            this.dominantColors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dominant colors found in the background of an image, defined with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * 
     * @param dominantColors
     *        The dominant colors found in the background of an image, defined with RGB values, CSS color name,
     *        simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageBackground withDominantColors(java.util.Collection<DominantColor> dominantColors) {
        setDominantColors(dominantColors);
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
        if (getQuality() != null)
            sb.append("Quality: ").append(getQuality()).append(",");
        if (getDominantColors() != null)
            sb.append("DominantColors: ").append(getDominantColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImageBackground == false)
            return false;
        DetectLabelsImageBackground other = (DetectLabelsImageBackground) obj;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getDominantColors() == null ^ this.getDominantColors() == null)
            return false;
        if (other.getDominantColors() != null && other.getDominantColors().equals(this.getDominantColors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode + ((getDominantColors() == null) ? 0 : getDominantColors().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsImageBackground clone() {
        try {
            return (DetectLabelsImageBackground) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DetectLabelsImageBackgroundMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
