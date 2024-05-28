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
 * To transcode only portions of your video overlay, include one input clip for each part of your video overlay that you
 * want in your output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoOverlayInputClipping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoOverlayInputClipping implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the timecode of the last frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     */
    private String endTimecode;
    /**
     * Specify the timecode of the first frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     */
    private String startTimecode;

    /**
     * Specify the timecode of the last frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     * 
     * @param endTimecode
     *        Specify the timecode of the last frame to include in your video overlay's clip. Use the format HH:MM:SS:FF
     *        or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When
     *        entering this value, take into account your choice for Timecode source.
     */

    public void setEndTimecode(String endTimecode) {
        this.endTimecode = endTimecode;
    }

    /**
     * Specify the timecode of the last frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     * 
     * @return Specify the timecode of the last frame to include in your video overlay's clip. Use the format
     *         HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame
     *         number. When entering this value, take into account your choice for Timecode source.
     */

    public String getEndTimecode() {
        return this.endTimecode;
    }

    /**
     * Specify the timecode of the last frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     * 
     * @param endTimecode
     *        Specify the timecode of the last frame to include in your video overlay's clip. Use the format HH:MM:SS:FF
     *        or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When
     *        entering this value, take into account your choice for Timecode source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlayInputClipping withEndTimecode(String endTimecode) {
        setEndTimecode(endTimecode);
        return this;
    }

    /**
     * Specify the timecode of the first frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     * 
     * @param startTimecode
     *        Specify the timecode of the first frame to include in your video overlay's clip. Use the format
     *        HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame
     *        number. When entering this value, take into account your choice for Timecode source.
     */

    public void setStartTimecode(String startTimecode) {
        this.startTimecode = startTimecode;
    }

    /**
     * Specify the timecode of the first frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     * 
     * @return Specify the timecode of the first frame to include in your video overlay's clip. Use the format
     *         HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame
     *         number. When entering this value, take into account your choice for Timecode source.
     */

    public String getStartTimecode() {
        return this.startTimecode;
    }

    /**
     * Specify the timecode of the first frame to include in your video overlay's clip. Use the format HH:MM:SS:FF or
     * HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When entering
     * this value, take into account your choice for Timecode source.
     * 
     * @param startTimecode
     *        Specify the timecode of the first frame to include in your video overlay's clip. Use the format
     *        HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame
     *        number. When entering this value, take into account your choice for Timecode source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlayInputClipping withStartTimecode(String startTimecode) {
        setStartTimecode(startTimecode);
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
        if (getEndTimecode() != null)
            sb.append("EndTimecode: ").append(getEndTimecode()).append(",");
        if (getStartTimecode() != null)
            sb.append("StartTimecode: ").append(getStartTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoOverlayInputClipping == false)
            return false;
        VideoOverlayInputClipping other = (VideoOverlayInputClipping) obj;
        if (other.getEndTimecode() == null ^ this.getEndTimecode() == null)
            return false;
        if (other.getEndTimecode() != null && other.getEndTimecode().equals(this.getEndTimecode()) == false)
            return false;
        if (other.getStartTimecode() == null ^ this.getStartTimecode() == null)
            return false;
        if (other.getStartTimecode() != null && other.getStartTimecode().equals(this.getStartTimecode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTimecode() == null) ? 0 : getEndTimecode().hashCode());
        hashCode = prime * hashCode + ((getStartTimecode() == null) ? 0 : getStartTimecode().hashCode());
        return hashCode;
    }

    @Override
    public VideoOverlayInputClipping clone() {
        try {
            return (VideoOverlayInputClipping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoOverlayInputClippingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
