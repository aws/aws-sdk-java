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
     * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your output is
     * reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply sharpening to the
     * edges of your output. Note that Post temporal sharpening will also make the bandwidth reduction from the Noise
     * reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply
     * sharpening, depending on your input type and quality. When you set Post temporal sharpening to Enabled (ENABLED),
     * specify how much sharpening is applied using Post temporal sharpening strength (postTemporalSharpeningStrength).
     * Set Post temporal sharpening to Disabled (DISABLED) to not apply sharpening.
     */
    private String postTemporalSharpening;
    /**
     * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the
     * transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High
     * (HIGH) to indicate the amount of sharpening.
     */
    private String postTemporalSharpeningStrength;
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
     * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your output is
     * reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply sharpening to the
     * edges of your output. Note that Post temporal sharpening will also make the bandwidth reduction from the Noise
     * reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply
     * sharpening, depending on your input type and quality. When you set Post temporal sharpening to Enabled (ENABLED),
     * specify how much sharpening is applied using Post temporal sharpening strength (postTemporalSharpeningStrength).
     * Set Post temporal sharpening to Disabled (DISABLED) to not apply sharpening.
     * 
     * @param postTemporalSharpening
     *        When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your
     *        output is reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply
     *        sharpening to the edges of your output. Note that Post temporal sharpening will also make the bandwidth
     *        reduction from the Noise reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to
     *        determine whether to apply sharpening, depending on your input type and quality. When you set Post
     *        temporal sharpening to Enabled (ENABLED), specify how much sharpening is applied using Post temporal
     *        sharpening strength (postTemporalSharpeningStrength). Set Post temporal sharpening to Disabled (DISABLED)
     *        to not apply sharpening.
     * @see NoiseFilterPostTemporalSharpening
     */

    public void setPostTemporalSharpening(String postTemporalSharpening) {
        this.postTemporalSharpening = postTemporalSharpening;
    }

    /**
     * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your output is
     * reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply sharpening to the
     * edges of your output. Note that Post temporal sharpening will also make the bandwidth reduction from the Noise
     * reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply
     * sharpening, depending on your input type and quality. When you set Post temporal sharpening to Enabled (ENABLED),
     * specify how much sharpening is applied using Post temporal sharpening strength (postTemporalSharpeningStrength).
     * Set Post temporal sharpening to Disabled (DISABLED) to not apply sharpening.
     * 
     * @return When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your
     *         output is reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply
     *         sharpening to the edges of your output. Note that Post temporal sharpening will also make the bandwidth
     *         reduction from the Noise reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to
     *         determine whether to apply sharpening, depending on your input type and quality. When you set Post
     *         temporal sharpening to Enabled (ENABLED), specify how much sharpening is applied using Post temporal
     *         sharpening strength (postTemporalSharpeningStrength). Set Post temporal sharpening to Disabled (DISABLED)
     *         to not apply sharpening.
     * @see NoiseFilterPostTemporalSharpening
     */

    public String getPostTemporalSharpening() {
        return this.postTemporalSharpening;
    }

    /**
     * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your output is
     * reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply sharpening to the
     * edges of your output. Note that Post temporal sharpening will also make the bandwidth reduction from the Noise
     * reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply
     * sharpening, depending on your input type and quality. When you set Post temporal sharpening to Enabled (ENABLED),
     * specify how much sharpening is applied using Post temporal sharpening strength (postTemporalSharpeningStrength).
     * Set Post temporal sharpening to Disabled (DISABLED) to not apply sharpening.
     * 
     * @param postTemporalSharpening
     *        When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your
     *        output is reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply
     *        sharpening to the edges of your output. Note that Post temporal sharpening will also make the bandwidth
     *        reduction from the Noise reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to
     *        determine whether to apply sharpening, depending on your input type and quality. When you set Post
     *        temporal sharpening to Enabled (ENABLED), specify how much sharpening is applied using Post temporal
     *        sharpening strength (postTemporalSharpeningStrength). Set Post temporal sharpening to Disabled (DISABLED)
     *        to not apply sharpening.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoiseFilterPostTemporalSharpening
     */

    public NoiseReducerTemporalFilterSettings withPostTemporalSharpening(String postTemporalSharpening) {
        setPostTemporalSharpening(postTemporalSharpening);
        return this;
    }

    /**
     * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your output is
     * reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply sharpening to the
     * edges of your output. Note that Post temporal sharpening will also make the bandwidth reduction from the Noise
     * reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply
     * sharpening, depending on your input type and quality. When you set Post temporal sharpening to Enabled (ENABLED),
     * specify how much sharpening is applied using Post temporal sharpening strength (postTemporalSharpeningStrength).
     * Set Post temporal sharpening to Disabled (DISABLED) to not apply sharpening.
     * 
     * @param postTemporalSharpening
     *        When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the bandwidth and sharpness of your
     *        output is reduced. You can optionally use Post temporal sharpening (postTemporalSharpening) to apply
     *        sharpening to the edges of your output. Note that Post temporal sharpening will also make the bandwidth
     *        reduction from the Noise reducer smaller. The default behavior, Auto (AUTO), allows the transcoder to
     *        determine whether to apply sharpening, depending on your input type and quality. When you set Post
     *        temporal sharpening to Enabled (ENABLED), specify how much sharpening is applied using Post temporal
     *        sharpening strength (postTemporalSharpeningStrength). Set Post temporal sharpening to Disabled (DISABLED)
     *        to not apply sharpening.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoiseFilterPostTemporalSharpening
     */

    public NoiseReducerTemporalFilterSettings withPostTemporalSharpening(NoiseFilterPostTemporalSharpening postTemporalSharpening) {
        this.postTemporalSharpening = postTemporalSharpening.toString();
        return this;
    }

    /**
     * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the
     * transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High
     * (HIGH) to indicate the amount of sharpening.
     * 
     * @param postTemporalSharpeningStrength
     *        Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening
     *        the transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium
     *        (MEDIUM), or High (HIGH) to indicate the amount of sharpening.
     * @see NoiseFilterPostTemporalSharpeningStrength
     */

    public void setPostTemporalSharpeningStrength(String postTemporalSharpeningStrength) {
        this.postTemporalSharpeningStrength = postTemporalSharpeningStrength;
    }

    /**
     * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the
     * transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High
     * (HIGH) to indicate the amount of sharpening.
     * 
     * @return Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening
     *         the transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium
     *         (MEDIUM), or High (HIGH) to indicate the amount of sharpening.
     * @see NoiseFilterPostTemporalSharpeningStrength
     */

    public String getPostTemporalSharpeningStrength() {
        return this.postTemporalSharpeningStrength;
    }

    /**
     * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the
     * transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High
     * (HIGH) to indicate the amount of sharpening.
     * 
     * @param postTemporalSharpeningStrength
     *        Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening
     *        the transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium
     *        (MEDIUM), or High (HIGH) to indicate the amount of sharpening.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoiseFilterPostTemporalSharpeningStrength
     */

    public NoiseReducerTemporalFilterSettings withPostTemporalSharpeningStrength(String postTemporalSharpeningStrength) {
        setPostTemporalSharpeningStrength(postTemporalSharpeningStrength);
        return this;
    }

    /**
     * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the
     * transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High
     * (HIGH) to indicate the amount of sharpening.
     * 
     * @param postTemporalSharpeningStrength
     *        Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening
     *        the transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium
     *        (MEDIUM), or High (HIGH) to indicate the amount of sharpening.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoiseFilterPostTemporalSharpeningStrength
     */

    public NoiseReducerTemporalFilterSettings withPostTemporalSharpeningStrength(NoiseFilterPostTemporalSharpeningStrength postTemporalSharpeningStrength) {
        this.postTemporalSharpeningStrength = postTemporalSharpeningStrength.toString();
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
        if (getPostTemporalSharpening() != null)
            sb.append("PostTemporalSharpening: ").append(getPostTemporalSharpening()).append(",");
        if (getPostTemporalSharpeningStrength() != null)
            sb.append("PostTemporalSharpeningStrength: ").append(getPostTemporalSharpeningStrength()).append(",");
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
        if (other.getPostTemporalSharpening() == null ^ this.getPostTemporalSharpening() == null)
            return false;
        if (other.getPostTemporalSharpening() != null && other.getPostTemporalSharpening().equals(this.getPostTemporalSharpening()) == false)
            return false;
        if (other.getPostTemporalSharpeningStrength() == null ^ this.getPostTemporalSharpeningStrength() == null)
            return false;
        if (other.getPostTemporalSharpeningStrength() != null
                && other.getPostTemporalSharpeningStrength().equals(this.getPostTemporalSharpeningStrength()) == false)
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
        hashCode = prime * hashCode + ((getPostTemporalSharpening() == null) ? 0 : getPostTemporalSharpening().hashCode());
        hashCode = prime * hashCode + ((getPostTemporalSharpeningStrength() == null) ? 0 : getPostTemporalSharpeningStrength().hashCode());
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
