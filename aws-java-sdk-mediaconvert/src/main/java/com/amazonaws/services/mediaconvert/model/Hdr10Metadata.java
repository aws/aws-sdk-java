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
 * Use the "HDR master display information" (Hdr10Metadata) settings to correct HDR metadata or to provide missing
 * metadata. These values vary depending on the input video and must be provided by a color grader. Range is 0 to
 * 50,000; each increment represents 0.00002 in CIE1931 color coordinate. Note that these settings are not color
 * correction. Note that if you are creating HDR outputs inside of an HLS CMAF package, to comply with the Apple
 * specification, you must use the following settings. Set "MP4 packaging type" (writeMp4PackagingType) to HVC1 (HVC1).
 * Set "Profile" (H265Settings > codecProfile) to Main10/High (MAIN10_HIGH). Set "Level" (H265Settings > codecLevel) to
 * 5 (LEVEL_5).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Hdr10Metadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hdr10Metadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer bluePrimaryX;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer bluePrimaryY;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer greenPrimaryX;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer greenPrimaryY;
    /** Maximum light level among all samples in the coded video sequence, in units of candelas per square meter. */
    private Integer maxContentLightLevel;
    /** Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter. */
    private Integer maxFrameAverageLightLevel;
    /** Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter. */
    private Integer maxLuminance;
    /** Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter */
    private Integer minLuminance;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer redPrimaryX;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer redPrimaryY;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer whitePointX;
    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     */
    private Integer whitePointY;

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param bluePrimaryX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setBluePrimaryX(Integer bluePrimaryX) {
        this.bluePrimaryX = bluePrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getBluePrimaryX() {
        return this.bluePrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param bluePrimaryX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withBluePrimaryX(Integer bluePrimaryX) {
        setBluePrimaryX(bluePrimaryX);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param bluePrimaryY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setBluePrimaryY(Integer bluePrimaryY) {
        this.bluePrimaryY = bluePrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getBluePrimaryY() {
        return this.bluePrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param bluePrimaryY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withBluePrimaryY(Integer bluePrimaryY) {
        setBluePrimaryY(bluePrimaryY);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param greenPrimaryX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setGreenPrimaryX(Integer greenPrimaryX) {
        this.greenPrimaryX = greenPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getGreenPrimaryX() {
        return this.greenPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param greenPrimaryX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withGreenPrimaryX(Integer greenPrimaryX) {
        setGreenPrimaryX(greenPrimaryX);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param greenPrimaryY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setGreenPrimaryY(Integer greenPrimaryY) {
        this.greenPrimaryY = greenPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getGreenPrimaryY() {
        return this.greenPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param greenPrimaryY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withGreenPrimaryY(Integer greenPrimaryY) {
        setGreenPrimaryY(greenPrimaryY);
        return this;
    }

    /**
     * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
     * 
     * @param maxContentLightLevel
     *        Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
     */

    public void setMaxContentLightLevel(Integer maxContentLightLevel) {
        this.maxContentLightLevel = maxContentLightLevel;
    }

    /**
     * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
     * 
     * @return Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
     */

    public Integer getMaxContentLightLevel() {
        return this.maxContentLightLevel;
    }

    /**
     * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
     * 
     * @param maxContentLightLevel
     *        Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withMaxContentLightLevel(Integer maxContentLightLevel) {
        setMaxContentLightLevel(maxContentLightLevel);
        return this;
    }

    /**
     * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter.
     * 
     * @param maxFrameAverageLightLevel
     *        Maximum average light level of any frame in the coded video sequence, in units of candelas per square
     *        meter.
     */

    public void setMaxFrameAverageLightLevel(Integer maxFrameAverageLightLevel) {
        this.maxFrameAverageLightLevel = maxFrameAverageLightLevel;
    }

    /**
     * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter.
     * 
     * @return Maximum average light level of any frame in the coded video sequence, in units of candelas per square
     *         meter.
     */

    public Integer getMaxFrameAverageLightLevel() {
        return this.maxFrameAverageLightLevel;
    }

    /**
     * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter.
     * 
     * @param maxFrameAverageLightLevel
     *        Maximum average light level of any frame in the coded video sequence, in units of candelas per square
     *        meter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withMaxFrameAverageLightLevel(Integer maxFrameAverageLightLevel) {
        setMaxFrameAverageLightLevel(maxFrameAverageLightLevel);
        return this;
    }

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
     * 
     * @param maxLuminance
     *        Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
     */

    public void setMaxLuminance(Integer maxLuminance) {
        this.maxLuminance = maxLuminance;
    }

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
     * 
     * @return Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
     */

    public Integer getMaxLuminance() {
        return this.maxLuminance;
    }

    /**
     * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
     * 
     * @param maxLuminance
     *        Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withMaxLuminance(Integer maxLuminance) {
        setMaxLuminance(maxLuminance);
        return this;
    }

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
     * 
     * @param minLuminance
     *        Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
     */

    public void setMinLuminance(Integer minLuminance) {
        this.minLuminance = minLuminance;
    }

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
     * 
     * @return Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
     */

    public Integer getMinLuminance() {
        return this.minLuminance;
    }

    /**
     * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
     * 
     * @param minLuminance
     *        Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withMinLuminance(Integer minLuminance) {
        setMinLuminance(minLuminance);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param redPrimaryX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setRedPrimaryX(Integer redPrimaryX) {
        this.redPrimaryX = redPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getRedPrimaryX() {
        return this.redPrimaryX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param redPrimaryX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withRedPrimaryX(Integer redPrimaryX) {
        setRedPrimaryX(redPrimaryX);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param redPrimaryY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setRedPrimaryY(Integer redPrimaryY) {
        this.redPrimaryY = redPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getRedPrimaryY() {
        return this.redPrimaryY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param redPrimaryY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withRedPrimaryY(Integer redPrimaryY) {
        setRedPrimaryY(redPrimaryY);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param whitePointX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setWhitePointX(Integer whitePointX) {
        this.whitePointX = whitePointX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getWhitePointX() {
        return this.whitePointX;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param whitePointX
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withWhitePointX(Integer whitePointX) {
        setWhitePointX(whitePointX);
        return this;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param whitePointY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     */

    public void setWhitePointY(Integer whitePointY) {
        this.whitePointY = whitePointY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @return HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *         to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *         for color correction.
     */

    public Integer getWhitePointY() {
        return this.whitePointY;
    }

    /**
     * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to
     * 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color
     * correction.
     * 
     * @param whitePointY
     *        HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0
     *        to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not
     *        for color correction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Metadata withWhitePointY(Integer whitePointY) {
        setWhitePointY(whitePointY);
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
        if (getBluePrimaryX() != null)
            sb.append("BluePrimaryX: ").append(getBluePrimaryX()).append(",");
        if (getBluePrimaryY() != null)
            sb.append("BluePrimaryY: ").append(getBluePrimaryY()).append(",");
        if (getGreenPrimaryX() != null)
            sb.append("GreenPrimaryX: ").append(getGreenPrimaryX()).append(",");
        if (getGreenPrimaryY() != null)
            sb.append("GreenPrimaryY: ").append(getGreenPrimaryY()).append(",");
        if (getMaxContentLightLevel() != null)
            sb.append("MaxContentLightLevel: ").append(getMaxContentLightLevel()).append(",");
        if (getMaxFrameAverageLightLevel() != null)
            sb.append("MaxFrameAverageLightLevel: ").append(getMaxFrameAverageLightLevel()).append(",");
        if (getMaxLuminance() != null)
            sb.append("MaxLuminance: ").append(getMaxLuminance()).append(",");
        if (getMinLuminance() != null)
            sb.append("MinLuminance: ").append(getMinLuminance()).append(",");
        if (getRedPrimaryX() != null)
            sb.append("RedPrimaryX: ").append(getRedPrimaryX()).append(",");
        if (getRedPrimaryY() != null)
            sb.append("RedPrimaryY: ").append(getRedPrimaryY()).append(",");
        if (getWhitePointX() != null)
            sb.append("WhitePointX: ").append(getWhitePointX()).append(",");
        if (getWhitePointY() != null)
            sb.append("WhitePointY: ").append(getWhitePointY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hdr10Metadata == false)
            return false;
        Hdr10Metadata other = (Hdr10Metadata) obj;
        if (other.getBluePrimaryX() == null ^ this.getBluePrimaryX() == null)
            return false;
        if (other.getBluePrimaryX() != null && other.getBluePrimaryX().equals(this.getBluePrimaryX()) == false)
            return false;
        if (other.getBluePrimaryY() == null ^ this.getBluePrimaryY() == null)
            return false;
        if (other.getBluePrimaryY() != null && other.getBluePrimaryY().equals(this.getBluePrimaryY()) == false)
            return false;
        if (other.getGreenPrimaryX() == null ^ this.getGreenPrimaryX() == null)
            return false;
        if (other.getGreenPrimaryX() != null && other.getGreenPrimaryX().equals(this.getGreenPrimaryX()) == false)
            return false;
        if (other.getGreenPrimaryY() == null ^ this.getGreenPrimaryY() == null)
            return false;
        if (other.getGreenPrimaryY() != null && other.getGreenPrimaryY().equals(this.getGreenPrimaryY()) == false)
            return false;
        if (other.getMaxContentLightLevel() == null ^ this.getMaxContentLightLevel() == null)
            return false;
        if (other.getMaxContentLightLevel() != null && other.getMaxContentLightLevel().equals(this.getMaxContentLightLevel()) == false)
            return false;
        if (other.getMaxFrameAverageLightLevel() == null ^ this.getMaxFrameAverageLightLevel() == null)
            return false;
        if (other.getMaxFrameAverageLightLevel() != null && other.getMaxFrameAverageLightLevel().equals(this.getMaxFrameAverageLightLevel()) == false)
            return false;
        if (other.getMaxLuminance() == null ^ this.getMaxLuminance() == null)
            return false;
        if (other.getMaxLuminance() != null && other.getMaxLuminance().equals(this.getMaxLuminance()) == false)
            return false;
        if (other.getMinLuminance() == null ^ this.getMinLuminance() == null)
            return false;
        if (other.getMinLuminance() != null && other.getMinLuminance().equals(this.getMinLuminance()) == false)
            return false;
        if (other.getRedPrimaryX() == null ^ this.getRedPrimaryX() == null)
            return false;
        if (other.getRedPrimaryX() != null && other.getRedPrimaryX().equals(this.getRedPrimaryX()) == false)
            return false;
        if (other.getRedPrimaryY() == null ^ this.getRedPrimaryY() == null)
            return false;
        if (other.getRedPrimaryY() != null && other.getRedPrimaryY().equals(this.getRedPrimaryY()) == false)
            return false;
        if (other.getWhitePointX() == null ^ this.getWhitePointX() == null)
            return false;
        if (other.getWhitePointX() != null && other.getWhitePointX().equals(this.getWhitePointX()) == false)
            return false;
        if (other.getWhitePointY() == null ^ this.getWhitePointY() == null)
            return false;
        if (other.getWhitePointY() != null && other.getWhitePointY().equals(this.getWhitePointY()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBluePrimaryX() == null) ? 0 : getBluePrimaryX().hashCode());
        hashCode = prime * hashCode + ((getBluePrimaryY() == null) ? 0 : getBluePrimaryY().hashCode());
        hashCode = prime * hashCode + ((getGreenPrimaryX() == null) ? 0 : getGreenPrimaryX().hashCode());
        hashCode = prime * hashCode + ((getGreenPrimaryY() == null) ? 0 : getGreenPrimaryY().hashCode());
        hashCode = prime * hashCode + ((getMaxContentLightLevel() == null) ? 0 : getMaxContentLightLevel().hashCode());
        hashCode = prime * hashCode + ((getMaxFrameAverageLightLevel() == null) ? 0 : getMaxFrameAverageLightLevel().hashCode());
        hashCode = prime * hashCode + ((getMaxLuminance() == null) ? 0 : getMaxLuminance().hashCode());
        hashCode = prime * hashCode + ((getMinLuminance() == null) ? 0 : getMinLuminance().hashCode());
        hashCode = prime * hashCode + ((getRedPrimaryX() == null) ? 0 : getRedPrimaryX().hashCode());
        hashCode = prime * hashCode + ((getRedPrimaryY() == null) ? 0 : getRedPrimaryY().hashCode());
        hashCode = prime * hashCode + ((getWhitePointX() == null) ? 0 : getWhitePointX().hashCode());
        hashCode = prime * hashCode + ((getWhitePointY() == null) ? 0 : getWhitePointY().hashCode());
        return hashCode;
    }

    @Override
    public Hdr10Metadata clone() {
        try {
            return (Hdr10Metadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Hdr10MetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
