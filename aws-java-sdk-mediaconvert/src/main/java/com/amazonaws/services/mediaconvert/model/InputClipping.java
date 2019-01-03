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
 * To transcode only portions of your input (clips), include one Input clipping (one instance of InputClipping in the
 * JSON job file) for each input clip. All input clips you specify will be included in every output of the job.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InputClipping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputClipping implements Serializable, Cloneable, StructuredPojo {

    /**
     * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding
     * to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not
     * both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF
     * is the frame number. When choosing this value, take into account your setting for timecode source under input
     * settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want
     * your clip to end six minutes into the video, use 01:06:00:00.
     */
    private String endTimecode;
    /**
     * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame
     * corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left
     * blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the
     * second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode
     * source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five
     * minutes into the video, use 01:05:00:00.
     */
    private String startTimecode;

    /**
     * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding
     * to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not
     * both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF
     * is the frame number. When choosing this value, take into account your setting for timecode source under input
     * settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want
     * your clip to end six minutes into the video, use 01:06:00:00.
     * 
     * @param endTimecode
     *        Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame
     *        corresponding to the End timecode value is included in the clip. Start timecode or End timecode may be
     *        left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the
     *        minute, SS is the second, and FF is the frame number. When choosing this value, take into account your
     *        setting for timecode source under input settings (InputTimecodeSource). For example, if you have embedded
     *        timecodes that start at 01:00:00:00 and you want your clip to end six minutes into the video, use
     *        01:06:00:00.
     */

    public void setEndTimecode(String endTimecode) {
        this.endTimecode = endTimecode;
    }

    /**
     * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding
     * to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not
     * both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF
     * is the frame number. When choosing this value, take into account your setting for timecode source under input
     * settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want
     * your clip to end six minutes into the video, use 01:06:00:00.
     * 
     * @return Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame
     *         corresponding to the End timecode value is included in the clip. Start timecode or End timecode may be
     *         left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the
     *         minute, SS is the second, and FF is the frame number. When choosing this value, take into account your
     *         setting for timecode source under input settings (InputTimecodeSource). For example, if you have embedded
     *         timecodes that start at 01:00:00:00 and you want your clip to end six minutes into the video, use
     *         01:06:00:00.
     */

    public String getEndTimecode() {
        return this.endTimecode;
    }

    /**
     * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding
     * to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not
     * both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF
     * is the frame number. When choosing this value, take into account your setting for timecode source under input
     * settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want
     * your clip to end six minutes into the video, use 01:06:00:00.
     * 
     * @param endTimecode
     *        Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame
     *        corresponding to the End timecode value is included in the clip. Start timecode or End timecode may be
     *        left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the
     *        minute, SS is the second, and FF is the frame number. When choosing this value, take into account your
     *        setting for timecode source under input settings (InputTimecodeSource). For example, if you have embedded
     *        timecodes that start at 01:00:00:00 and you want your clip to end six minutes into the video, use
     *        01:06:00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputClipping withEndTimecode(String endTimecode) {
        setEndTimecode(endTimecode);
        return this;
    }

    /**
     * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame
     * corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left
     * blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the
     * second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode
     * source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five
     * minutes into the video, use 01:05:00:00.
     * 
     * @param startTimecode
     *        Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The
     *        frame corresponding to the Start timecode value is included in the clip. Start timecode or End timecode
     *        may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is
     *        the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your
     *        setting for Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00
     *        and you want your clip to begin five minutes into the video, use 01:05:00:00.
     */

    public void setStartTimecode(String startTimecode) {
        this.startTimecode = startTimecode;
    }

    /**
     * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame
     * corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left
     * blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the
     * second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode
     * source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five
     * minutes into the video, use 01:05:00:00.
     * 
     * @return Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The
     *         frame corresponding to the Start timecode value is included in the clip. Start timecode or End timecode
     *         may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is
     *         the minute, SS is the second, and FF is the frame number. When choosing this value, take into account
     *         your setting for Input timecode source. For example, if you have embedded timecodes that start at
     *         01:00:00:00 and you want your clip to begin five minutes into the video, use 01:05:00:00.
     */

    public String getStartTimecode() {
        return this.startTimecode;
    }

    /**
     * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame
     * corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left
     * blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the
     * second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode
     * source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five
     * minutes into the video, use 01:05:00:00.
     * 
     * @param startTimecode
     *        Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The
     *        frame corresponding to the Start timecode value is included in the clip. Start timecode or End timecode
     *        may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is
     *        the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your
     *        setting for Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00
     *        and you want your clip to begin five minutes into the video, use 01:05:00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputClipping withStartTimecode(String startTimecode) {
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

        if (obj instanceof InputClipping == false)
            return false;
        InputClipping other = (InputClipping) obj;
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
    public InputClipping clone() {
        try {
            return (InputClipping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.InputClippingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
