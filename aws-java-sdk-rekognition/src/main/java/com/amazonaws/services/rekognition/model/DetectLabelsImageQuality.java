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
 * The quality of an image provided for label detection, with regard to brightness, sharpness, and contrast.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectLabelsImageQuality implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     */
    private Float brightness;
    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     */
    private Float sharpness;
    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     */
    private Float contrast;

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     * 
     * @param brightness
     *        The brightness of an image provided for label detection.
     */

    public void setBrightness(Float brightness) {
        this.brightness = brightness;
    }

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     * 
     * @return The brightness of an image provided for label detection.
     */

    public Float getBrightness() {
        return this.brightness;
    }

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     * 
     * @param brightness
     *        The brightness of an image provided for label detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageQuality withBrightness(Float brightness) {
        setBrightness(brightness);
        return this;
    }

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     * 
     * @param sharpness
     *        The sharpness of an image provided for label detection.
     */

    public void setSharpness(Float sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     * 
     * @return The sharpness of an image provided for label detection.
     */

    public Float getSharpness() {
        return this.sharpness;
    }

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     * 
     * @param sharpness
     *        The sharpness of an image provided for label detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageQuality withSharpness(Float sharpness) {
        setSharpness(sharpness);
        return this;
    }

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     * 
     * @param contrast
     *        The contrast of an image provided for label detection.
     */

    public void setContrast(Float contrast) {
        this.contrast = contrast;
    }

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     * 
     * @return The contrast of an image provided for label detection.
     */

    public Float getContrast() {
        return this.contrast;
    }

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     * 
     * @param contrast
     *        The contrast of an image provided for label detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsImageQuality withContrast(Float contrast) {
        setContrast(contrast);
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
        if (getBrightness() != null)
            sb.append("Brightness: ").append(getBrightness()).append(",");
        if (getSharpness() != null)
            sb.append("Sharpness: ").append(getSharpness()).append(",");
        if (getContrast() != null)
            sb.append("Contrast: ").append(getContrast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImageQuality == false)
            return false;
        DetectLabelsImageQuality other = (DetectLabelsImageQuality) obj;
        if (other.getBrightness() == null ^ this.getBrightness() == null)
            return false;
        if (other.getBrightness() != null && other.getBrightness().equals(this.getBrightness()) == false)
            return false;
        if (other.getSharpness() == null ^ this.getSharpness() == null)
            return false;
        if (other.getSharpness() != null && other.getSharpness().equals(this.getSharpness()) == false)
            return false;
        if (other.getContrast() == null ^ this.getContrast() == null)
            return false;
        if (other.getContrast() != null && other.getContrast().equals(this.getContrast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrightness() == null) ? 0 : getBrightness().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
        hashCode = prime * hashCode + ((getContrast() == null) ? 0 : getContrast().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsImageQuality clone() {
        try {
            return (DetectLabelsImageQuality) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DetectLabelsImageQualityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
