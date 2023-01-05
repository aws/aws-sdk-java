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
 * Information about the quality and dominant colors of an input image. Quality and color information is returned for
 * the entire image, foreground, and background.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectLabelsImageProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the quality of the image foreground as defined by brightness, sharpness, and contrast. The
     * higher the value the greater the brightness, sharpness, and contrast respectively.
     * </p>
     */
    private DetectLabelsImageQuality quality;
    /**
     * <p>
     * Information about the dominant colors found in an image, described with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     */
    private java.util.List<DominantColor> dominantColors;
    /**
     * <p>
     * Information about the properties of an image’s foreground, including the foreground’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     */
    private DetectLabelsImageForeground foreground;
    /**
     * <p>
     * Information about the properties of an image’s background, including the background’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     */
    private DetectLabelsImageBackground background;

    /**
     * <p>
     * Information about the quality of the image foreground as defined by brightness, sharpness, and contrast. The
     * higher the value the greater the brightness, sharpness, and contrast respectively.
     * </p>
     * 
     * @param quality
     *        Information about the quality of the image foreground as defined by brightness, sharpness, and contrast.
     *        The higher the value the greater the brightness, sharpness, and contrast respectively.
     */

    public void setQuality(DetectLabelsImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Information about the quality of the image foreground as defined by brightness, sharpness, and contrast. The
     * higher the value the greater the brightness, sharpness, and contrast respectively.
     * </p>
     * 
     * @return Information about the quality of the image foreground as defined by brightness, sharpness, and contrast.
     *         The higher the value the greater the brightness, sharpness, and contrast respectively.
     */

    public DetectLabelsImageQuality getQuality() {
        return this.quality;
    }

    /**
     * <p>
     * Information about the quality of the image foreground as defined by brightness, sharpness, and contrast. The
     * higher the value the greater the brightness, sharpness, and contrast respectively.
     * </p>
     * 
     * @param quality
     *        Information about the quality of the image foreground as defined by brightness, sharpness, and contrast.
     *        The higher the value the greater the brightness, sharpness, and contrast respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageProperties withQuality(DetectLabelsImageQuality quality) {
        setQuality(quality);
        return this;
    }

    /**
     * <p>
     * Information about the dominant colors found in an image, described with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * 
     * @return Information about the dominant colors found in an image, described with RGB values, CSS color name,
     *         simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     */

    public java.util.List<DominantColor> getDominantColors() {
        return dominantColors;
    }

    /**
     * <p>
     * Information about the dominant colors found in an image, described with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * 
     * @param dominantColors
     *        Information about the dominant colors found in an image, described with RGB values, CSS color name,
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
     * Information about the dominant colors found in an image, described with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDominantColors(java.util.Collection)} or {@link #withDominantColors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dominantColors
     *        Information about the dominant colors found in an image, described with RGB values, CSS color name,
     *        simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageProperties withDominantColors(DominantColor... dominantColors) {
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
     * Information about the dominant colors found in an image, described with RGB values, CSS color name, simplified
     * color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * </p>
     * 
     * @param dominantColors
     *        Information about the dominant colors found in an image, described with RGB values, CSS color name,
     *        simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageProperties withDominantColors(java.util.Collection<DominantColor> dominantColors) {
        setDominantColors(dominantColors);
        return this;
    }

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the foreground’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     * 
     * @param foreground
     *        Information about the properties of an image’s foreground, including the foreground’s quality and dominant
     *        colors, including the quality and dominant colors of the image.
     */

    public void setForeground(DetectLabelsImageForeground foreground) {
        this.foreground = foreground;
    }

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the foreground’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     * 
     * @return Information about the properties of an image’s foreground, including the foreground’s quality and
     *         dominant colors, including the quality and dominant colors of the image.
     */

    public DetectLabelsImageForeground getForeground() {
        return this.foreground;
    }

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the foreground’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     * 
     * @param foreground
     *        Information about the properties of an image’s foreground, including the foreground’s quality and dominant
     *        colors, including the quality and dominant colors of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageProperties withForeground(DetectLabelsImageForeground foreground) {
        setForeground(foreground);
        return this;
    }

    /**
     * <p>
     * Information about the properties of an image’s background, including the background’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     * 
     * @param background
     *        Information about the properties of an image’s background, including the background’s quality and dominant
     *        colors, including the quality and dominant colors of the image.
     */

    public void setBackground(DetectLabelsImageBackground background) {
        this.background = background;
    }

    /**
     * <p>
     * Information about the properties of an image’s background, including the background’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     * 
     * @return Information about the properties of an image’s background, including the background’s quality and
     *         dominant colors, including the quality and dominant colors of the image.
     */

    public DetectLabelsImageBackground getBackground() {
        return this.background;
    }

    /**
     * <p>
     * Information about the properties of an image’s background, including the background’s quality and dominant
     * colors, including the quality and dominant colors of the image.
     * </p>
     * 
     * @param background
     *        Information about the properties of an image’s background, including the background’s quality and dominant
     *        colors, including the quality and dominant colors of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageProperties withBackground(DetectLabelsImageBackground background) {
        setBackground(background);
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
            sb.append("DominantColors: ").append(getDominantColors()).append(",");
        if (getForeground() != null)
            sb.append("Foreground: ").append(getForeground()).append(",");
        if (getBackground() != null)
            sb.append("Background: ").append(getBackground());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImageProperties == false)
            return false;
        DetectLabelsImageProperties other = (DetectLabelsImageProperties) obj;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getDominantColors() == null ^ this.getDominantColors() == null)
            return false;
        if (other.getDominantColors() != null && other.getDominantColors().equals(this.getDominantColors()) == false)
            return false;
        if (other.getForeground() == null ^ this.getForeground() == null)
            return false;
        if (other.getForeground() != null && other.getForeground().equals(this.getForeground()) == false)
            return false;
        if (other.getBackground() == null ^ this.getBackground() == null)
            return false;
        if (other.getBackground() != null && other.getBackground().equals(this.getBackground()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode + ((getDominantColors() == null) ? 0 : getDominantColors().hashCode());
        hashCode = prime * hashCode + ((getForeground() == null) ? 0 : getForeground().hashCode());
        hashCode = prime * hashCode + ((getBackground() == null) ? 0 : getBackground().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsImageProperties clone() {
        try {
            return (DetectLabelsImageProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DetectLabelsImagePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
