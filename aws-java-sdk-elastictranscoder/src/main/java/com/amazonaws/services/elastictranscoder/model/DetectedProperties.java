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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detected properties of the input file. Elastic Transcoder identifies these values from the input file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The detected width of the input file, in pixels.
     * </p>
     */
    private Integer width;
    /**
     * <p>
     * The detected height of the input file, in pixels.
     * </p>
     */
    private Integer height;
    /**
     * <p>
     * The detected frame rate of the input file, in frames per second.
     * </p>
     */
    private String frameRate;
    /**
     * <p>
     * The detected file size of the input file, in bytes.
     * </p>
     */
    private Long fileSize;
    /**
     * <p>
     * The detected duration of the input file, in milliseconds.
     * </p>
     */
    private Long durationMillis;

    /**
     * <p>
     * The detected width of the input file, in pixels.
     * </p>
     * 
     * @param width
     *        The detected width of the input file, in pixels.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * <p>
     * The detected width of the input file, in pixels.
     * </p>
     * 
     * @return The detected width of the input file, in pixels.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The detected width of the input file, in pixels.
     * </p>
     * 
     * @param width
     *        The detected width of the input file, in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProperties withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * The detected height of the input file, in pixels.
     * </p>
     * 
     * @param height
     *        The detected height of the input file, in pixels.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * <p>
     * The detected height of the input file, in pixels.
     * </p>
     * 
     * @return The detected height of the input file, in pixels.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The detected height of the input file, in pixels.
     * </p>
     * 
     * @param height
     *        The detected height of the input file, in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProperties withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * The detected frame rate of the input file, in frames per second.
     * </p>
     * 
     * @param frameRate
     *        The detected frame rate of the input file, in frames per second.
     */

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * <p>
     * The detected frame rate of the input file, in frames per second.
     * </p>
     * 
     * @return The detected frame rate of the input file, in frames per second.
     */

    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * <p>
     * The detected frame rate of the input file, in frames per second.
     * </p>
     * 
     * @param frameRate
     *        The detected frame rate of the input file, in frames per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProperties withFrameRate(String frameRate) {
        setFrameRate(frameRate);
        return this;
    }

    /**
     * <p>
     * The detected file size of the input file, in bytes.
     * </p>
     * 
     * @param fileSize
     *        The detected file size of the input file, in bytes.
     */

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * The detected file size of the input file, in bytes.
     * </p>
     * 
     * @return The detected file size of the input file, in bytes.
     */

    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * <p>
     * The detected file size of the input file, in bytes.
     * </p>
     * 
     * @param fileSize
     *        The detected file size of the input file, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProperties withFileSize(Long fileSize) {
        setFileSize(fileSize);
        return this;
    }

    /**
     * <p>
     * The detected duration of the input file, in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The detected duration of the input file, in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The detected duration of the input file, in milliseconds.
     * </p>
     * 
     * @return The detected duration of the input file, in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The detected duration of the input file, in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The detected duration of the input file, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedProperties withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
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
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getFrameRate() != null)
            sb.append("FrameRate: ").append(getFrameRate()).append(",");
        if (getFileSize() != null)
            sb.append("FileSize: ").append(getFileSize()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectedProperties == false)
            return false;
        DetectedProperties other = (DetectedProperties) obj;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        return hashCode;
    }

    @Override
    public DetectedProperties clone() {
        try {
            return (DetectedProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.DetectedPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
