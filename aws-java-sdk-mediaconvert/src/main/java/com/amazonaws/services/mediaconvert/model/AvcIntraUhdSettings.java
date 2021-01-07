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
 * Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class to a
 * different value, this object isn't allowed.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AvcIntraUhdSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvcIntraUhdSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does
     * with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is
     * more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the
     * specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is
     * Single-pass (SINGLE_PASS).
     */
    private String qualityTuningLevel;

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does
     * with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is
     * more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the
     * specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is
     * Single-pass (SINGLE_PASS).
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert
     *        does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your
     *        output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target
     *        bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is
     *        faster. The default behavior is Single-pass (SINGLE_PASS).
     * @see AvcIntraUhdQualityTuningLevel
     */

    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does
     * with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is
     * more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the
     * specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is
     * Single-pass (SINGLE_PASS).
     * 
     * @return Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes
     *         MediaConvert does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better
     *         and your output bitrate is more accurate. That is, the actual bitrate of your output is closer to the
     *         target bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding
     *         time is faster. The default behavior is Single-pass (SINGLE_PASS).
     * @see AvcIntraUhdQualityTuningLevel
     */

    public String getQualityTuningLevel() {
        return this.qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does
     * with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is
     * more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the
     * specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is
     * Single-pass (SINGLE_PASS).
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert
     *        does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your
     *        output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target
     *        bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is
     *        faster. The default behavior is Single-pass (SINGLE_PASS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraUhdQualityTuningLevel
     */

    public AvcIntraUhdSettings withQualityTuningLevel(String qualityTuningLevel) {
        setQualityTuningLevel(qualityTuningLevel);
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does
     * with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is
     * more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the
     * specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is
     * Single-pass (SINGLE_PASS).
     * 
     * @param qualityTuningLevel
     *        Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert
     *        does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your
     *        output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target
     *        bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is
     *        faster. The default behavior is Single-pass (SINGLE_PASS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvcIntraUhdQualityTuningLevel
     */

    public AvcIntraUhdSettings withQualityTuningLevel(AvcIntraUhdQualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
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
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvcIntraUhdSettings == false)
            return false;
        AvcIntraUhdSettings other = (AvcIntraUhdSettings) obj;
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        return hashCode;
    }

    @Override
    public AvcIntraUhdSettings clone() {
        try {
            return (AvcIntraUhdSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AvcIntraUhdSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
