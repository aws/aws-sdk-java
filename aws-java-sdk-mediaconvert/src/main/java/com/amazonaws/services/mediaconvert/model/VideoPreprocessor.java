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
 * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output
 * individually. These features are disabled by default.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoPreprocessor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoPreprocessor implements Serializable, Cloneable, StructuredPojo {

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     */
    private ColorCorrector colorCorrector;
    /** Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture. */
    private Deinterlacer deinterlacer;
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
    /** Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output. */
    private TimecodeBurnin timecodeBurnin;

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     * 
     * @param colorCorrector
     *        Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each
     *        output individually. This setting is disabled by default.
     */

    public void setColorCorrector(ColorCorrector colorCorrector) {
        this.colorCorrector = colorCorrector;
    }

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     * 
     * @return Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each
     *         output individually. This setting is disabled by default.
     */

    public ColorCorrector getColorCorrector() {
        return this.colorCorrector;
    }

    /**
     * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output
     * individually. This setting is disabled by default.
     * 
     * @param colorCorrector
     *        Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each
     *        output individually. This setting is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withColorCorrector(ColorCorrector colorCorrector) {
        setColorCorrector(colorCorrector);
        return this;
    }

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
     * 
     * @param deinterlacer
     *        Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
     */

    public void setDeinterlacer(Deinterlacer deinterlacer) {
        this.deinterlacer = deinterlacer;
    }

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
     * 
     * @return Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
     */

    public Deinterlacer getDeinterlacer() {
        return this.deinterlacer;
    }

    /**
     * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
     * 
     * @param deinterlacer
     *        Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoPreprocessor withDeinterlacer(Deinterlacer deinterlacer) {
        setDeinterlacer(deinterlacer);
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
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
     * 
     * @param timecodeBurnin
     *        Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
     */

    public void setTimecodeBurnin(TimecodeBurnin timecodeBurnin) {
        this.timecodeBurnin = timecodeBurnin;
    }

    /**
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
     * 
     * @return Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
     */

    public TimecodeBurnin getTimecodeBurnin() {
        return this.timecodeBurnin;
    }

    /**
     * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
     * 
     * @param timecodeBurnin
     *        Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
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
        if (getImageInserter() != null)
            sb.append("ImageInserter: ").append(getImageInserter()).append(",");
        if (getNoiseReducer() != null)
            sb.append("NoiseReducer: ").append(getNoiseReducer()).append(",");
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
        if (other.getImageInserter() == null ^ this.getImageInserter() == null)
            return false;
        if (other.getImageInserter() != null && other.getImageInserter().equals(this.getImageInserter()) == false)
            return false;
        if (other.getNoiseReducer() == null ^ this.getNoiseReducer() == null)
            return false;
        if (other.getNoiseReducer() != null && other.getNoiseReducer().equals(this.getNoiseReducer()) == false)
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
        hashCode = prime * hashCode + ((getImageInserter() == null) ? 0 : getImageInserter().hashCode());
        hashCode = prime * hashCode + ((getNoiseReducer() == null) ? 0 : getNoiseReducer().hashCode());
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
