/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing framerates
 * between your input captions and input video, specify the framerate of the captions file. Specify this value as a
 * fraction, using the settings Framerate numerator (framerateNumerator) and Framerate denominator
 * (framerateDenominator). For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976
 * fps, or 30000 / 1001 for 29.97 fps.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionSourceFramerate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSourceFramerate implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the denominator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
     */
    private Integer framerateDenominator;
    /**
     * Specify the numerator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
     */
    private Integer framerateNumerator;

    /**
     * Specify the denominator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
     * 
     * @param framerateDenominator
     *        Specify the denominator of the fraction that represents the framerate for the setting Caption source
     *        framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator
     *        (framerateNumerator).
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Specify the denominator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
     * 
     * @return Specify the denominator of the fraction that represents the framerate for the setting Caption source
     *         framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator
     *         (framerateNumerator).
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * Specify the denominator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
     * 
     * @param framerateDenominator
     *        Specify the denominator of the fraction that represents the framerate for the setting Caption source
     *        framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator
     *        (framerateNumerator).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceFramerate withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * Specify the numerator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
     * 
     * @param framerateNumerator
     *        Specify the numerator of the fraction that represents the framerate for the setting Caption source
     *        framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator
     *        (framerateDenominator).
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Specify the numerator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
     * 
     * @return Specify the numerator of the fraction that represents the framerate for the setting Caption source
     *         framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator
     *         (framerateDenominator).
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * Specify the numerator of the fraction that represents the framerate for the setting Caption source framerate
     * (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
     * 
     * @param framerateNumerator
     *        Specify the numerator of the fraction that represents the framerate for the setting Caption source
     *        framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator
     *        (framerateDenominator).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceFramerate withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
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
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSourceFramerate == false)
            return false;
        CaptionSourceFramerate other = (CaptionSourceFramerate) obj;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        return hashCode;
    }

    @Override
    public CaptionSourceFramerate clone() {
        try {
            return (CaptionSourceFramerate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionSourceFramerateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
