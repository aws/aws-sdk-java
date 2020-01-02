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
 * Noise reducer filter settings for temporal filter.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/NoiseReducerTemporalFilterSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoiseReducerTemporalFilterSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This
     * filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
     */
    private Integer aggressiveMode;
    /**
     * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time,
     * high setting improves transcode time at the cost of bit rate.
     */
    private Integer speed;
    /**
     * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We
     * recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with
     * minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of
     * complexity reduction
     */
    private Integer strength;

    /**
     * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This
     * filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
     * 
     * @param aggressiveMode
     *        Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal
     *        filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate
     *        outputs.
     */

    public void setAggressiveMode(Integer aggressiveMode) {
        this.aggressiveMode = aggressiveMode;
    }

    /**
     * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This
     * filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
     * 
     * @return Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal
     *         filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate
     *         outputs.
     */

    public Integer getAggressiveMode() {
        return this.aggressiveMode;
    }

    /**
     * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This
     * filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
     * 
     * @param aggressiveMode
     *        Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal
     *        filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate
     *        outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducerTemporalFilterSettings withAggressiveMode(Integer aggressiveMode) {
        setAggressiveMode(aggressiveMode);
        return this;
    }

    /**
     * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time,
     * high setting improves transcode time at the cost of bit rate.
     * 
     * @param speed
     *        The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode
     *        time, high setting improves transcode time at the cost of bit rate.
     */

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time,
     * high setting improves transcode time at the cost of bit rate.
     * 
     * @return The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode
     *         time, high setting improves transcode time at the cost of bit rate.
     */

    public Integer getSpeed() {
        return this.speed;
    }

    /**
     * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time,
     * high setting improves transcode time at the cost of bit rate.
     * 
     * @param speed
     *        The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode
     *        time, high setting improves transcode time at the cost of bit rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducerTemporalFilterSettings withSpeed(Integer speed) {
        setSpeed(speed);
        return this;
    }

    /**
     * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We
     * recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with
     * minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of
     * complexity reduction
     * 
     * @param strength
     *        Specify the strength of the noise reducing filter on this output. Higher values produce stronger
     *        filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for
     *        complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation *
     *        8-16 for a high level of complexity reduction
     */

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    /**
     * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We
     * recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with
     * minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of
     * complexity reduction
     * 
     * @return Specify the strength of the noise reducing filter on this output. Higher values produce stronger
     *         filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for
     *         complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation *
     *         8-16 for a high level of complexity reduction
     */

    public Integer getStrength() {
        return this.strength;
    }

    /**
     * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We
     * recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with
     * minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of
     * complexity reduction
     * 
     * @param strength
     *        Specify the strength of the noise reducing filter on this output. Higher values produce stronger
     *        filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for
     *        complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation *
     *        8-16 for a high level of complexity reduction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducerTemporalFilterSettings withStrength(Integer strength) {
        setStrength(strength);
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
        if (getAggressiveMode() != null)
            sb.append("AggressiveMode: ").append(getAggressiveMode()).append(",");
        if (getSpeed() != null)
            sb.append("Speed: ").append(getSpeed()).append(",");
        if (getStrength() != null)
            sb.append("Strength: ").append(getStrength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NoiseReducerTemporalFilterSettings == false)
            return false;
        NoiseReducerTemporalFilterSettings other = (NoiseReducerTemporalFilterSettings) obj;
        if (other.getAggressiveMode() == null ^ this.getAggressiveMode() == null)
            return false;
        if (other.getAggressiveMode() != null && other.getAggressiveMode().equals(this.getAggressiveMode()) == false)
            return false;
        if (other.getSpeed() == null ^ this.getSpeed() == null)
            return false;
        if (other.getSpeed() != null && other.getSpeed().equals(this.getSpeed()) == false)
            return false;
        if (other.getStrength() == null ^ this.getStrength() == null)
            return false;
        if (other.getStrength() != null && other.getStrength().equals(this.getStrength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggressiveMode() == null) ? 0 : getAggressiveMode().hashCode());
        hashCode = prime * hashCode + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public NoiseReducerTemporalFilterSettings clone() {
        try {
            return (NoiseReducerTemporalFilterSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.NoiseReducerTemporalFilterSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
