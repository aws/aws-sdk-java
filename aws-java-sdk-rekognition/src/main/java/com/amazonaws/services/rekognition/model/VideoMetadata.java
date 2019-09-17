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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page of
 * paginated responses from a Amazon Rekognition video operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     */
    private String codec;
    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     */
    private Float frameRate;
    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     */
    private Long frameHeight;
    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     */
    private Long frameWidth;

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     * 
     * @param codec
     *        Type of compression used in the analyzed video.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     * 
     * @return Type of compression used in the analyzed video.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     * 
     * @param codec
     *        Type of compression used in the analyzed video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoMetadata withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        Length of the video in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * 
     * @return Length of the video in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        Length of the video in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoMetadata withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     * 
     * @param format
     *        Format of the analyzed video. Possible values are MP4, MOV and AVI.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     * 
     * @return Format of the analyzed video. Possible values are MP4, MOV and AVI.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     * 
     * @param format
     *        Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoMetadata withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     * 
     * @param frameRate
     *        Number of frames per second in the video.
     */

    public void setFrameRate(Float frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     * 
     * @return Number of frames per second in the video.
     */

    public Float getFrameRate() {
        return this.frameRate;
    }

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     * 
     * @param frameRate
     *        Number of frames per second in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoMetadata withFrameRate(Float frameRate) {
        setFrameRate(frameRate);
        return this;
    }

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * 
     * @param frameHeight
     *        Vertical pixel dimension of the video.
     */

    public void setFrameHeight(Long frameHeight) {
        this.frameHeight = frameHeight;
    }

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * 
     * @return Vertical pixel dimension of the video.
     */

    public Long getFrameHeight() {
        return this.frameHeight;
    }

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * 
     * @param frameHeight
     *        Vertical pixel dimension of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoMetadata withFrameHeight(Long frameHeight) {
        setFrameHeight(frameHeight);
        return this;
    }

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * 
     * @param frameWidth
     *        Horizontal pixel dimension of the video.
     */

    public void setFrameWidth(Long frameWidth) {
        this.frameWidth = frameWidth;
    }

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * 
     * @return Horizontal pixel dimension of the video.
     */

    public Long getFrameWidth() {
        return this.frameWidth;
    }

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * 
     * @param frameWidth
     *        Horizontal pixel dimension of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoMetadata withFrameWidth(Long frameWidth) {
        setFrameWidth(frameWidth);
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
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFrameRate() != null)
            sb.append("FrameRate: ").append(getFrameRate()).append(",");
        if (getFrameHeight() != null)
            sb.append("FrameHeight: ").append(getFrameHeight()).append(",");
        if (getFrameWidth() != null)
            sb.append("FrameWidth: ").append(getFrameWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoMetadata == false)
            return false;
        VideoMetadata other = (VideoMetadata) obj;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getFrameHeight() == null ^ this.getFrameHeight() == null)
            return false;
        if (other.getFrameHeight() != null && other.getFrameHeight().equals(this.getFrameHeight()) == false)
            return false;
        if (other.getFrameWidth() == null ^ this.getFrameWidth() == null)
            return false;
        if (other.getFrameWidth() != null && other.getFrameWidth().equals(this.getFrameWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode());
        hashCode = prime * hashCode + ((getFrameHeight() == null) ? 0 : getFrameHeight().hashCode());
        hashCode = prime * hashCode + ((getFrameWidth() == null) ? 0 : getFrameWidth().hashCode());
        return hashCode;
    }

    @Override
    public VideoMetadata clone() {
        try {
            return (VideoMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.VideoMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
