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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output
 * individually. These features are disabled by default.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoPreprocessor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoPreprocessor implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use these settings to convert the color space or to modify properties such as hue and contrast for this output.
     * For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     */
    private ColorCorrector colorCorrector;
    /**
     * Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     */
    private Deinterlacer deinterlacer;
    /** Enable Dolby Vision feature to produce Dolby Vision compatible video output. */
    private DolbyVision dolbyVision;
    /** Enable HDR10+ analyis and metadata injection. Compatible with HEVC only. */
    private Hdr10Plus hdr10Plus;
    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable
     * this feature for each output individually. This setting is disabled by default.
     */
    private ImageInserter imageInserter;
    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or
     * disable this feature for each output individually. This setting is disabled by default.
     */
    private NoiseReducer noiseReducer;
    /**
     * If you work with a third party video watermarking partner, use the group of settings that correspond with your
     * watermarking partner to include watermarks in your output.
     */
    private PartnerWatermarking partnerWatermarking;
    /** Settings for burning the output timecode and specified prefix into the output. */
    private TimecodeBurnin timecodeBurnin;

    /**
     * Use these settings to convert the color space or to modify properties such as hue and contrast for this output.
     * For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     * 
     * @param colorCorrector
     *        Use these settings to convert the color space or to modify properties such as hue and contrast for this
     *        output. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     */

    public void setColorCorrector(ColorCorrector colorCorrector) {
        this.colorCorrector = colorCorrector;
    }

    /**
     * Use these settings to convert the color space or to modify properties such as hue and contrast for this output.
     * For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     * 
     * @return Use these settings to convert the color space or to modify properties such as hue and contrast for this
     *         output. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     */

    public ColorCorrector getColorCorrector() {
        return this.colorCorrector;
    }

    /**
     * Use these settings to convert the color space or to modify properties such as hue and contrast for this output.
     * For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     * 
     * @param colorCorrector
     *        Use these settings to convert the color space or to modify properties such as hue and contrast for this
     *        output. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/converting-the-color-space.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withColorCorrector(ColorCorrector colorCorrector) {
        setColorCorrector(colorCorrector);
        return this;
    }

    /**
     * Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     * 
     * @param deinterlacer
     *        Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     */

    public void setDeinterlacer(Deinterlacer deinterlacer) {
        this.deinterlacer = deinterlacer;
    }

    /**
     * Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     * 
     * @return Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     */

    public Deinterlacer getDeinterlacer() {
        return this.deinterlacer;
    }

    /**
     * Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     * 
     * @param deinterlacer
     *        Use the deinterlacer to produce smoother motion and a clearer picture. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-scan-type.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withDeinterlacer(Deinterlacer deinterlacer) {
        setDeinterlacer(deinterlacer);
        return this;
    }

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
     * 
     * @param dolbyVision
     *        Enable Dolby Vision feature to produce Dolby Vision compatible video output.
     */

    public void setDolbyVision(DolbyVision dolbyVision) {
        this.dolbyVision = dolbyVision;
    }

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
     * 
     * @return Enable Dolby Vision feature to produce Dolby Vision compatible video output.
     */

    public DolbyVision getDolbyVision() {
        return this.dolbyVision;
    }

    /**
     * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
     * 
     * @param dolbyVision
     *        Enable Dolby Vision feature to produce Dolby Vision compatible video output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withDolbyVision(DolbyVision dolbyVision) {
        setDolbyVision(dolbyVision);
        return this;
    }

    /**
     * Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
     * 
     * @param hdr10Plus
     *        Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
     */

    public void setHdr10Plus(Hdr10Plus hdr10Plus) {
        this.hdr10Plus = hdr10Plus;
    }

    /**
     * Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
     * 
     * @return Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
     */

    public Hdr10Plus getHdr10Plus() {
        return this.hdr10Plus;
    }

    /**
     * Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
     * 
     * @param hdr10Plus
     *        Enable HDR10+ analyis and metadata injection. Compatible with HEVC only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withHdr10Plus(Hdr10Plus hdr10Plus) {
        setHdr10Plus(hdr10Plus);
        return this;
    }

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable
     * this feature for each output individually. This setting is disabled by default.
     * 
     * @param imageInserter
     *        Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or
     *        disable this feature for each output individually. This setting is disabled by default.
     */

    public void setImageInserter(ImageInserter imageInserter) {
        this.imageInserter = imageInserter;
    }

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable
     * this feature for each output individually. This setting is disabled by default.
     * 
     * @return Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or
     *         disable this feature for each output individually. This setting is disabled by default.
     */

    public ImageInserter getImageInserter() {
        return this.imageInserter;
    }

    /**
     * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable
     * this feature for each output individually. This setting is disabled by default.
     * 
     * @param imageInserter
     *        Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or
     *        disable this feature for each output individually. This setting is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withImageInserter(ImageInserter imageInserter) {
        setImageInserter(imageInserter);
        return this;
    }

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or
     * disable this feature for each output individually. This setting is disabled by default.
     * 
     * @param noiseReducer
     *        Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary.
     *        Enable or disable this feature for each output individually. This setting is disabled by default.
     */

    public void setNoiseReducer(NoiseReducer noiseReducer) {
        this.noiseReducer = noiseReducer;
    }

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or
     * disable this feature for each output individually. This setting is disabled by default.
     * 
     * @return Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary.
     *         Enable or disable this feature for each output individually. This setting is disabled by default.
     */

    public NoiseReducer getNoiseReducer() {
        return this.noiseReducer;
    }

    /**
     * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or
     * disable this feature for each output individually. This setting is disabled by default.
     * 
     * @param noiseReducer
     *        Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary.
     *        Enable or disable this feature for each output individually. This setting is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withNoiseReducer(NoiseReducer noiseReducer) {
        setNoiseReducer(noiseReducer);
        return this;
    }

    /**
     * If you work with a third party video watermarking partner, use the group of settings that correspond with your
     * watermarking partner to include watermarks in your output.
     * 
     * @param partnerWatermarking
     *        If you work with a third party video watermarking partner, use the group of settings that correspond with
     *        your watermarking partner to include watermarks in your output.
     */

    public void setPartnerWatermarking(PartnerWatermarking partnerWatermarking) {
        this.partnerWatermarking = partnerWatermarking;
    }

    /**
     * If you work with a third party video watermarking partner, use the group of settings that correspond with your
     * watermarking partner to include watermarks in your output.
     * 
     * @return If you work with a third party video watermarking partner, use the group of settings that correspond with
     *         your watermarking partner to include watermarks in your output.
     */

    public PartnerWatermarking getPartnerWatermarking() {
        return this.partnerWatermarking;
    }

    /**
     * If you work with a third party video watermarking partner, use the group of settings that correspond with your
     * watermarking partner to include watermarks in your output.
     * 
     * @param partnerWatermarking
     *        If you work with a third party video watermarking partner, use the group of settings that correspond with
     *        your watermarking partner to include watermarks in your output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withPartnerWatermarking(PartnerWatermarking partnerWatermarking) {
        setPartnerWatermarking(partnerWatermarking);
        return this;
    }

    /**
     * Settings for burning the output timecode and specified prefix into the output.
     * 
     * @param timecodeBurnin
     *        Settings for burning the output timecode and specified prefix into the output.
     */

    public void setTimecodeBurnin(TimecodeBurnin timecodeBurnin) {
        this.timecodeBurnin = timecodeBurnin;
    }

    /**
     * Settings for burning the output timecode and specified prefix into the output.
     * 
     * @return Settings for burning the output timecode and specified prefix into the output.
     */

    public TimecodeBurnin getTimecodeBurnin() {
        return this.timecodeBurnin;
    }

    /**
     * Settings for burning the output timecode and specified prefix into the output.
     * 
     * @param timecodeBurnin
     *        Settings for burning the output timecode and specified prefix into the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withTimecodeBurnin(TimecodeBurnin timecodeBurnin) {
        setTimecodeBurnin(timecodeBurnin);
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
        if (getColorCorrector() != null)
            sb.append("ColorCorrector: ").append(getColorCorrector()).append(",");
        if (getDeinterlacer() != null)
            sb.append("Deinterlacer: ").append(getDeinterlacer()).append(",");
        if (getDolbyVision() != null)
            sb.append("DolbyVision: ").append(getDolbyVision()).append(",");
        if (getHdr10Plus() != null)
            sb.append("Hdr10Plus: ").append(getHdr10Plus()).append(",");
        if (getImageInserter() != null)
            sb.append("ImageInserter: ").append(getImageInserter()).append(",");
        if (getNoiseReducer() != null)
            sb.append("NoiseReducer: ").append(getNoiseReducer()).append(",");
        if (getPartnerWatermarking() != null)
            sb.append("PartnerWatermarking: ").append(getPartnerWatermarking()).append(",");
        if (getTimecodeBurnin() != null)
            sb.append("TimecodeBurnin: ").append(getTimecodeBurnin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoPreprocessor == false)
            return false;
        VideoPreprocessor other = (VideoPreprocessor) obj;
        if (other.getColorCorrector() == null ^ this.getColorCorrector() == null)
            return false;
        if (other.getColorCorrector() != null && other.getColorCorrector().equals(this.getColorCorrector()) == false)
            return false;
        if (other.getDeinterlacer() == null ^ this.getDeinterlacer() == null)
            return false;
        if (other.getDeinterlacer() != null && other.getDeinterlacer().equals(this.getDeinterlacer()) == false)
            return false;
        if (other.getDolbyVision() == null ^ this.getDolbyVision() == null)
            return false;
        if (other.getDolbyVision() != null && other.getDolbyVision().equals(this.getDolbyVision()) == false)
            return false;
        if (other.getHdr10Plus() == null ^ this.getHdr10Plus() == null)
            return false;
        if (other.getHdr10Plus() != null && other.getHdr10Plus().equals(this.getHdr10Plus()) == false)
            return false;
        if (other.getImageInserter() == null ^ this.getImageInserter() == null)
            return false;
        if (other.getImageInserter() != null && other.getImageInserter().equals(this.getImageInserter()) == false)
            return false;
        if (other.getNoiseReducer() == null ^ this.getNoiseReducer() == null)
            return false;
        if (other.getNoiseReducer() != null && other.getNoiseReducer().equals(this.getNoiseReducer()) == false)
            return false;
        if (other.getPartnerWatermarking() == null ^ this.getPartnerWatermarking() == null)
            return false;
        if (other.getPartnerWatermarking() != null && other.getPartnerWatermarking().equals(this.getPartnerWatermarking()) == false)
            return false;
        if (other.getTimecodeBurnin() == null ^ this.getTimecodeBurnin() == null)
            return false;
        if (other.getTimecodeBurnin() != null && other.getTimecodeBurnin().equals(this.getTimecodeBurnin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColorCorrector() == null) ? 0 : getColorCorrector().hashCode());
        hashCode = prime * hashCode + ((getDeinterlacer() == null) ? 0 : getDeinterlacer().hashCode());
        hashCode = prime * hashCode + ((getDolbyVision() == null) ? 0 : getDolbyVision().hashCode());
        hashCode = prime * hashCode + ((getHdr10Plus() == null) ? 0 : getHdr10Plus().hashCode());
        hashCode = prime * hashCode + ((getImageInserter() == null) ? 0 : getImageInserter().hashCode());
        hashCode = prime * hashCode + ((getNoiseReducer() == null) ? 0 : getNoiseReducer().hashCode());
        hashCode = prime * hashCode + ((getPartnerWatermarking() == null) ? 0 : getPartnerWatermarking().hashCode());
        hashCode = prime * hashCode + ((getTimecodeBurnin() == null) ? 0 : getTimecodeBurnin().hashCode());
        return hashCode;
    }

    @Override
    public VideoPreprocessor clone() {
        try {
            return (VideoPreprocessor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoPreprocessorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
