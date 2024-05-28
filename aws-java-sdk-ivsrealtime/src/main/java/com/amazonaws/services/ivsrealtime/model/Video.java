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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for video.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/Video" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Video implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Bitrate for generated output, in bps. Default: 2500000.
     * </p>
     */
    private Integer bitrate;
    /**
     * <p>
     * Video frame rate, in fps. Default: 30.
     * </p>
     */
    private Float framerate;
    /**
     * <p>
     * Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     * <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     * </p>
     */
    private Integer height;
    /**
     * <p>
     * Video-resolution width. Note that the maximum value is determined by <code>width</code> times <code>height</code>
     * , such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
     * </p>
     */
    private Integer width;

    /**
     * <p>
     * Bitrate for generated output, in bps. Default: 2500000.
     * </p>
     * 
     * @param bitrate
     *        Bitrate for generated output, in bps. Default: 2500000.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * <p>
     * Bitrate for generated output, in bps. Default: 2500000.
     * </p>
     * 
     * @return Bitrate for generated output, in bps. Default: 2500000.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * <p>
     * Bitrate for generated output, in bps. Default: 2500000.
     * </p>
     * 
     * @param bitrate
     *        Bitrate for generated output, in bps. Default: 2500000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Video withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * <p>
     * Video frame rate, in fps. Default: 30.
     * </p>
     * 
     * @param framerate
     *        Video frame rate, in fps. Default: 30.
     */

    public void setFramerate(Float framerate) {
        this.framerate = framerate;
    }

    /**
     * <p>
     * Video frame rate, in fps. Default: 30.
     * </p>
     * 
     * @return Video frame rate, in fps. Default: 30.
     */

    public Float getFramerate() {
        return this.framerate;
    }

    /**
     * <p>
     * Video frame rate, in fps. Default: 30.
     * </p>
     * 
     * @param framerate
     *        Video frame rate, in fps. Default: 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Video withFramerate(Float framerate) {
        setFramerate(framerate);
        return this;
    }

    /**
     * <p>
     * Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     * <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     * </p>
     * 
     * @param height
     *        Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     *        <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * <p>
     * Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     * <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     * </p>
     * 
     * @return Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     *         <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default:
     *         720.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * <p>
     * Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     * <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     * </p>
     * 
     * @param height
     *        Video-resolution height. Note that the maximum value is determined by <code>width</code> times
     *        <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Video withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * Video-resolution width. Note that the maximum value is determined by <code>width</code> times <code>height</code>
     * , such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
     * </p>
     * 
     * @param width
     *        Video-resolution width. Note that the maximum value is determined by <code>width</code> times
     *        <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default:
     *        1280.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * <p>
     * Video-resolution width. Note that the maximum value is determined by <code>width</code> times <code>height</code>
     * , such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
     * </p>
     * 
     * @return Video-resolution width. Note that the maximum value is determined by <code>width</code> times
     *         <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default:
     *         1280.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * <p>
     * Video-resolution width. Note that the maximum value is determined by <code>width</code> times <code>height</code>
     * , such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
     * </p>
     * 
     * @param width
     *        Video-resolution width. Note that the maximum value is determined by <code>width</code> times
     *        <code>height</code>, such that the maximum total pixels is 2073600 (1920x1080 or 1080x1920). Default:
     *        1280.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Video withWidth(Integer width) {
        setWidth(width);
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
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getFramerate() != null)
            sb.append("Framerate: ").append(getFramerate()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Video == false)
            return false;
        Video other = (Video) obj;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public Video clone() {
        try {
            return (Video) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.VideoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
