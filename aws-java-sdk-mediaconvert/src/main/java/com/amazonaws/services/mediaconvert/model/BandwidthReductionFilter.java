/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Bandwidth reduction filter increases the video quality of your output relative to its bitrate. Use to lower the
 * bitrate of your constant quality QVBR output, with little or no perceptual decrease in quality. Or, use to increase
 * the video quality of outputs with other rate control modes relative to the bitrate that you specify. Bandwidth
 * reduction increases further when your input is low quality or noisy. Outputs that use this feature incur pro-tier
 * pricing. When you include Bandwidth reduction filter, you cannot include the Noise reducer preprocessor.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/BandwidthReductionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BandwidthReductionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. Keep the default value Off to apply no
     * sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening, or High to apply a maximum
     * amount of sharpening.
     */
    private String sharpening;
    /**
     * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to
     * reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and
     * high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High
     * for low bitrate outputs. Note that High may incur a slight increase in the softness of your output.
     */
    private String strength;

    /**
     * Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. Keep the default value Off to apply no
     * sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening, or High to apply a maximum
     * amount of sharpening.
     * 
     * @param sharpening
     *        Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter.
     *        Sharpening adds contrast to the edges of your video content and can reduce softness. Keep the default
     *        value Off to apply no sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening,
     *        or High to apply a maximum amount of sharpening.
     * @see BandwidthReductionFilterSharpening
     */

    public void setSharpening(String sharpening) {
        this.sharpening = sharpening;
    }

    /**
     * Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. Keep the default value Off to apply no
     * sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening, or High to apply a maximum
     * amount of sharpening.
     * 
     * @return Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter.
     *         Sharpening adds contrast to the edges of your video content and can reduce softness. Keep the default
     *         value Off to apply no sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening,
     *         or High to apply a maximum amount of sharpening.
     * @see BandwidthReductionFilterSharpening
     */

    public String getSharpening() {
        return this.sharpening;
    }

    /**
     * Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. Keep the default value Off to apply no
     * sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening, or High to apply a maximum
     * amount of sharpening.
     * 
     * @param sharpening
     *        Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter.
     *        Sharpening adds contrast to the edges of your video content and can reduce softness. Keep the default
     *        value Off to apply no sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening,
     *        or High to apply a maximum amount of sharpening.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BandwidthReductionFilterSharpening
     */

    public BandwidthReductionFilter withSharpening(String sharpening) {
        setSharpening(sharpening);
        return this;
    }

    /**
     * Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter. Sharpening adds
     * contrast to the edges of your video content and can reduce softness. Keep the default value Off to apply no
     * sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening, or High to apply a maximum
     * amount of sharpening.
     * 
     * @param sharpening
     *        Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter.
     *        Sharpening adds contrast to the edges of your video content and can reduce softness. Keep the default
     *        value Off to apply no sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening,
     *        or High to apply a maximum amount of sharpening.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BandwidthReductionFilterSharpening
     */

    public BandwidthReductionFilter withSharpening(BandwidthReductionFilterSharpening sharpening) {
        this.sharpening = sharpening.toString();
        return this;
    }

    /**
     * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to
     * reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and
     * high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High
     * for low bitrate outputs. Note that High may incur a slight increase in the softness of your output.
     * 
     * @param strength
     *        Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose
     *        Auto to reduce the bandwidth of your output with little to no perceptual decrease in video quality. For
     *        high quality and high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We
     *        recommend that you choose High for low bitrate outputs. Note that High may incur a slight increase in the
     *        softness of your output.
     * @see BandwidthReductionFilterStrength
     */

    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to
     * reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and
     * high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High
     * for low bitrate outputs. Note that High may incur a slight increase in the softness of your output.
     * 
     * @return Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose
     *         Auto to reduce the bandwidth of your output with little to no perceptual decrease in video quality. For
     *         high quality and high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We
     *         recommend that you choose High for low bitrate outputs. Note that High may incur a slight increase in the
     *         softness of your output.
     * @see BandwidthReductionFilterStrength
     */

    public String getStrength() {
        return this.strength;
    }

    /**
     * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to
     * reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and
     * high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High
     * for low bitrate outputs. Note that High may incur a slight increase in the softness of your output.
     * 
     * @param strength
     *        Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose
     *        Auto to reduce the bandwidth of your output with little to no perceptual decrease in video quality. For
     *        high quality and high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We
     *        recommend that you choose High for low bitrate outputs. Note that High may incur a slight increase in the
     *        softness of your output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BandwidthReductionFilterStrength
     */

    public BandwidthReductionFilter withStrength(String strength) {
        setStrength(strength);
        return this;
    }

    /**
     * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to
     * reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and
     * high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High
     * for low bitrate outputs. Note that High may incur a slight increase in the softness of your output.
     * 
     * @param strength
     *        Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose
     *        Auto to reduce the bandwidth of your output with little to no perceptual decrease in video quality. For
     *        high quality and high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We
     *        recommend that you choose High for low bitrate outputs. Note that High may incur a slight increase in the
     *        softness of your output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BandwidthReductionFilterStrength
     */

    public BandwidthReductionFilter withStrength(BandwidthReductionFilterStrength strength) {
        this.strength = strength.toString();
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
        if (getSharpening() != null)
            sb.append("Sharpening: ").append(getSharpening()).append(",");
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

        if (obj instanceof BandwidthReductionFilter == false)
            return false;
        BandwidthReductionFilter other = (BandwidthReductionFilter) obj;
        if (other.getSharpening() == null ^ this.getSharpening() == null)
            return false;
        if (other.getSharpening() != null && other.getSharpening().equals(this.getSharpening()) == false)
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

        hashCode = prime * hashCode + ((getSharpening() == null) ? 0 : getSharpening().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public BandwidthReductionFilter clone() {
        try {
            return (BandwidthReductionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.BandwidthReductionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
