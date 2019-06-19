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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for color correction.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ColorCorrector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorCorrector implements Serializable, Cloneable, StructuredPojo {

    /** Brightness level. */
    private Integer brightness;
    /**
     * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If
     * _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An
     * input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
     */
    private String colorSpaceConversion;
    /** Contrast level. */
    private Integer contrast;
    /**
     * Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. Note
     * that these settings are not color correction.
     */
    private Hdr10Metadata hdr10Metadata;
    /** Hue in degrees. */
    private Integer hue;
    /** Saturation level. */
    private Integer saturation;

    /**
     * Brightness level.
     * 
     * @param brightness
     *        Brightness level.
     */

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * Brightness level.
     * 
     * @return Brightness level.
     */

    public Integer getBrightness() {
        return this.brightness;
    }

    /**
     * Brightness level.
     * 
     * @param brightness
     *        Brightness level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrector withBrightness(Integer brightness) {
        setBrightness(brightness);
        return this;
    }

    /**
     * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If
     * _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An
     * input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
     * 
     * @param colorSpaceConversion
     *        Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed.
     *        If _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing
     *        colorspaces. An input's colorspace can be specified explicitly in the
     *        "Video Selector":#inputs-video_selector if necessary.
     * @see ColorSpaceConversion
     */

    public void setColorSpaceConversion(String colorSpaceConversion) {
        this.colorSpaceConversion = colorSpaceConversion;
    }

    /**
     * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If
     * _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An
     * input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
     * 
     * @return Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed.
     *         If _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing
     *         colorspaces. An input's colorspace can be specified explicitly in the
     *         "Video Selector":#inputs-video_selector if necessary.
     * @see ColorSpaceConversion
     */

    public String getColorSpaceConversion() {
        return this.colorSpaceConversion;
    }

    /**
     * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If
     * _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An
     * input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
     * 
     * @param colorSpaceConversion
     *        Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed.
     *        If _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing
     *        colorspaces. An input's colorspace can be specified explicitly in the
     *        "Video Selector":#inputs-video_selector if necessary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpaceConversion
     */

    public ColorCorrector withColorSpaceConversion(String colorSpaceConversion) {
        setColorSpaceConversion(colorSpaceConversion);
        return this;
    }

    /**
     * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If
     * _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An
     * input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
     * 
     * @param colorSpaceConversion
     *        Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed.
     *        If _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing
     *        colorspaces. An input's colorspace can be specified explicitly in the
     *        "Video Selector":#inputs-video_selector if necessary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpaceConversion
     */

    public ColorCorrector withColorSpaceConversion(ColorSpaceConversion colorSpaceConversion) {
        this.colorSpaceConversion = colorSpaceConversion.toString();
        return this;
    }

    /**
     * Contrast level.
     * 
     * @param contrast
     *        Contrast level.
     */

    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }

    /**
     * Contrast level.
     * 
     * @return Contrast level.
     */

    public Integer getContrast() {
        return this.contrast;
    }

    /**
     * Contrast level.
     * 
     * @param contrast
     *        Contrast level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrector withContrast(Integer contrast) {
        setContrast(contrast);
        return this;
    }

    /**
     * Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. Note
     * that these settings are not color correction.
     * 
     * @param hdr10Metadata
     *        Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing
     *        metadata. Note that these settings are not color correction.
     */

    public void setHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        this.hdr10Metadata = hdr10Metadata;
    }

    /**
     * Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. Note
     * that these settings are not color correction.
     * 
     * @return Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing
     *         metadata. Note that these settings are not color correction.
     */

    public Hdr10Metadata getHdr10Metadata() {
        return this.hdr10Metadata;
    }

    /**
     * Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. Note
     * that these settings are not color correction.
     * 
     * @param hdr10Metadata
     *        Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing
     *        metadata. Note that these settings are not color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrector withHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        setHdr10Metadata(hdr10Metadata);
        return this;
    }

    /**
     * Hue in degrees.
     * 
     * @param hue
     *        Hue in degrees.
     */

    public void setHue(Integer hue) {
        this.hue = hue;
    }

    /**
     * Hue in degrees.
     * 
     * @return Hue in degrees.
     */

    public Integer getHue() {
        return this.hue;
    }

    /**
     * Hue in degrees.
     * 
     * @param hue
     *        Hue in degrees.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrector withHue(Integer hue) {
        setHue(hue);
        return this;
    }

    /**
     * Saturation level.
     * 
     * @param saturation
     *        Saturation level.
     */

    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
    }

    /**
     * Saturation level.
     * 
     * @return Saturation level.
     */

    public Integer getSaturation() {
        return this.saturation;
    }

    /**
     * Saturation level.
     * 
     * @param saturation
     *        Saturation level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrector withSaturation(Integer saturation) {
        setSaturation(saturation);
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
        if (getColorSpaceConversion() != null)
            sb.append("ColorSpaceConversion: ").append(getColorSpaceConversion()).append(",");
        if (getContrast() != null)
            sb.append("Contrast: ").append(getContrast()).append(",");
        if (getHdr10Metadata() != null)
            sb.append("Hdr10Metadata: ").append(getHdr10Metadata()).append(",");
        if (getHue() != null)
            sb.append("Hue: ").append(getHue()).append(",");
        if (getSaturation() != null)
            sb.append("Saturation: ").append(getSaturation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorCorrector == false)
            return false;
        ColorCorrector other = (ColorCorrector) obj;
        if (other.getBrightness() == null ^ this.getBrightness() == null)
            return false;
        if (other.getBrightness() != null && other.getBrightness().equals(this.getBrightness()) == false)
            return false;
        if (other.getColorSpaceConversion() == null ^ this.getColorSpaceConversion() == null)
            return false;
        if (other.getColorSpaceConversion() != null && other.getColorSpaceConversion().equals(this.getColorSpaceConversion()) == false)
            return false;
        if (other.getContrast() == null ^ this.getContrast() == null)
            return false;
        if (other.getContrast() != null && other.getContrast().equals(this.getContrast()) == false)
            return false;
        if (other.getHdr10Metadata() == null ^ this.getHdr10Metadata() == null)
            return false;
        if (other.getHdr10Metadata() != null && other.getHdr10Metadata().equals(this.getHdr10Metadata()) == false)
            return false;
        if (other.getHue() == null ^ this.getHue() == null)
            return false;
        if (other.getHue() != null && other.getHue().equals(this.getHue()) == false)
            return false;
        if (other.getSaturation() == null ^ this.getSaturation() == null)
            return false;
        if (other.getSaturation() != null && other.getSaturation().equals(this.getSaturation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrightness() == null) ? 0 : getBrightness().hashCode());
        hashCode = prime * hashCode + ((getColorSpaceConversion() == null) ? 0 : getColorSpaceConversion().hashCode());
        hashCode = prime * hashCode + ((getContrast() == null) ? 0 : getContrast().hashCode());
        hashCode = prime * hashCode + ((getHdr10Metadata() == null) ? 0 : getHdr10Metadata().hashCode());
        hashCode = prime * hashCode + ((getHue() == null) ? 0 : getHue().hashCode());
        hashCode = prime * hashCode + ((getSaturation() == null) ? 0 : getSaturation().hashCode());
        return hashCode;
    }

    @Override
    public ColorCorrector clone() {
        try {
            return (ColorCorrector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ColorCorrectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
