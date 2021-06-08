/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for VideoBlackFailoverSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VideoBlackFailoverSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoBlackFailoverSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the input to
     * be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a
     * percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black). Note how the formula
     * works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (1023*0.1=102.3),
     * which means a pixel value of 102 or less is 'black'. If you set this field to .1 in an 8-bit color depth:
     * (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is 0.0 to 1.0, with any number of
     * decimal places.
     */
    private Double blackDetectThreshold;
    /** The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs. */
    private Integer videoBlackThresholdMsec;

    /**
     * A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the input to
     * be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a
     * percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black). Note how the formula
     * works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (1023*0.1=102.3),
     * which means a pixel value of 102 or less is 'black'. If you set this field to .1 in an 8-bit color depth:
     * (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is 0.0 to 1.0, with any number of
     * decimal places.
     * 
     * @param blackDetectThreshold
     *        A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the
     *        input to be considered black, every pixel in a frame must be below this threshold. The threshold is
     *        calculated as a percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black).
     *        Note how the formula works for any color depth. For example, if you set this field to 0.1 in 10-bit color
     *        depth: (1023*0.1=102.3), which means a pixel value of 102 or less is 'black'. If you set this field to .1
     *        in an 8-bit color depth: (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is
     *        0.0 to 1.0, with any number of decimal places.
     */

    public void setBlackDetectThreshold(Double blackDetectThreshold) {
        this.blackDetectThreshold = blackDetectThreshold;
    }

    /**
     * A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the input to
     * be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a
     * percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black). Note how the formula
     * works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (1023*0.1=102.3),
     * which means a pixel value of 102 or less is 'black'. If you set this field to .1 in an 8-bit color depth:
     * (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is 0.0 to 1.0, with any number of
     * decimal places.
     * 
     * @return A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the
     *         input to be considered black, every pixel in a frame must be below this threshold. The threshold is
     *         calculated as a percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90%
     *         black). Note how the formula works for any color depth. For example, if you set this field to 0.1 in
     *         10-bit color depth: (1023*0.1=102.3), which means a pixel value of 102 or less is 'black'. If you set
     *         this field to .1 in an 8-bit color depth: (255*0.1=25.5), which means a pixel value of 25 or less is
     *         'black'. The range is 0.0 to 1.0, with any number of decimal places.
     */

    public Double getBlackDetectThreshold() {
        return this.blackDetectThreshold;
    }

    /**
     * A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the input to
     * be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a
     * percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black). Note how the formula
     * works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (1023*0.1=102.3),
     * which means a pixel value of 102 or less is 'black'. If you set this field to .1 in an 8-bit color depth:
     * (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is 0.0 to 1.0, with any number of
     * decimal places.
     * 
     * @param blackDetectThreshold
     *        A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the
     *        input to be considered black, every pixel in a frame must be below this threshold. The threshold is
     *        calculated as a percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black).
     *        Note how the formula works for any color depth. For example, if you set this field to 0.1 in 10-bit color
     *        depth: (1023*0.1=102.3), which means a pixel value of 102 or less is 'black'. If you set this field to .1
     *        in an 8-bit color depth: (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is
     *        0.0 to 1.0, with any number of decimal places.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoBlackFailoverSettings withBlackDetectThreshold(Double blackDetectThreshold) {
        setBlackDetectThreshold(blackDetectThreshold);
        return this;
    }

    /**
     * The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs.
     * 
     * @param videoBlackThresholdMsec
     *        The amount of time (in milliseconds) that the active input must be black before automatic input failover
     *        occurs.
     */

    public void setVideoBlackThresholdMsec(Integer videoBlackThresholdMsec) {
        this.videoBlackThresholdMsec = videoBlackThresholdMsec;
    }

    /**
     * The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs.
     * 
     * @return The amount of time (in milliseconds) that the active input must be black before automatic input failover
     *         occurs.
     */

    public Integer getVideoBlackThresholdMsec() {
        return this.videoBlackThresholdMsec;
    }

    /**
     * The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs.
     * 
     * @param videoBlackThresholdMsec
     *        The amount of time (in milliseconds) that the active input must be black before automatic input failover
     *        occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoBlackFailoverSettings withVideoBlackThresholdMsec(Integer videoBlackThresholdMsec) {
        setVideoBlackThresholdMsec(videoBlackThresholdMsec);
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
        if (getBlackDetectThreshold() != null)
            sb.append("BlackDetectThreshold: ").append(getBlackDetectThreshold()).append(",");
        if (getVideoBlackThresholdMsec() != null)
            sb.append("VideoBlackThresholdMsec: ").append(getVideoBlackThresholdMsec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoBlackFailoverSettings == false)
            return false;
        VideoBlackFailoverSettings other = (VideoBlackFailoverSettings) obj;
        if (other.getBlackDetectThreshold() == null ^ this.getBlackDetectThreshold() == null)
            return false;
        if (other.getBlackDetectThreshold() != null && other.getBlackDetectThreshold().equals(this.getBlackDetectThreshold()) == false)
            return false;
        if (other.getVideoBlackThresholdMsec() == null ^ this.getVideoBlackThresholdMsec() == null)
            return false;
        if (other.getVideoBlackThresholdMsec() != null && other.getVideoBlackThresholdMsec().equals(this.getVideoBlackThresholdMsec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlackDetectThreshold() == null) ? 0 : getBlackDetectThreshold().hashCode());
        hashCode = prime * hashCode + ((getVideoBlackThresholdMsec() == null) ? 0 : getVideoBlackThresholdMsec().hashCode());
        return hashCode;
    }

    @Override
    public VideoBlackFailoverSettings clone() {
        try {
            return (VideoBlackFailoverSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VideoBlackFailoverSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
