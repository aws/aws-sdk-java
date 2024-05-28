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
 * Overlay one or more videos on top of your input video. For more information, see
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/video-overlays.html
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoOverlay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoOverlay implements Serializable, Cloneable, StructuredPojo {

    /**
     * Enter the end timecode in the underlying input video for this overlay. Your overlay will be active through this
     * frame. To display your video overlay for the duration of the underlying video: Leave blank. Use the format
     * HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number.
     * When entering this value, take into account your choice for the underlying Input timecode source. For example, if
     * you have embedded timecodes that start at 01:00:00:00 and you want your overlay to end ten minutes into the video,
     * enter 01:10:00:00.
     */
    private String endTimecode;
    /**
     * Input settings for Video overlay. You can include one or more video overlays in sequence at different times that
     * you specify.
     */
    private VideoOverlayInput input;
    /**
     * Enter the start timecode in the underlying input video for this overlay. Your overlay will be active starting
     * with this frame. To display your video overlay starting at the beginning of the underlying video: Leave blank.
     * Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the
     * frame number. When entering this value, take into account your choice for the underlying Input timecode source.
     * For example, if you have embedded timecodes that start at 01:00:00:00 and you want your overlay to begin five
     * minutes into the video, enter 01:05:00:00.
     */
    private String startTimecode;

    /**
     * Enter the end timecode in the underlying input video for this overlay. Your overlay will be active through this
     * frame. To display your video overlay for the duration of the underlying video: Leave blank. Use the format
     * HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number.
     * When entering this value, take into account your choice for the underlying Input timecode source. For example, if
     * you have embedded timecodes that start at 01:00:00:00 and you want your overlay to end ten minutes into the video,
     * enter 01:10:00:00.
     * 
     * @param endTimecode
     *        Enter the end timecode in the underlying input video for this overlay. Your overlay will be active through
     *        this frame. To display your video overlay for the duration of the underlying video: Leave blank. Use the
     *        format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the
     *        frame number. When entering this value, take into account your choice for the underlying Input timecode
     *        source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your overlay to
     *        end ten minutes into the video, enter 01:10:00:00.
     */

    public void setEndTimecode(String endTimecode) {
        this.endTimecode = endTimecode;
    }

    /**
     * Enter the end timecode in the underlying input video for this overlay. Your overlay will be active through this
     * frame. To display your video overlay for the duration of the underlying video: Leave blank. Use the format
     * HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number.
     * When entering this value, take into account your choice for the underlying Input timecode source. For example, if
     * you have embedded timecodes that start at 01:00:00:00 and you want your overlay to end ten minutes into the video,
     * enter 01:10:00:00.
     * 
     * @return Enter the end timecode in the underlying input video for this overlay. Your overlay will be active
     *         through this frame. To display your video overlay for the duration of the underlying video: Leave blank.
     *         Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and
     *         FF is the frame number. When entering this value, take into account your choice for the underlying Input
     *         timecode source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your
     *         overlay to end ten minutes into the video, enter 01:10:00:00.
     */

    public String getEndTimecode() {
        return this.endTimecode;
    }

    /**
     * Enter the end timecode in the underlying input video for this overlay. Your overlay will be active through this
     * frame. To display your video overlay for the duration of the underlying video: Leave blank. Use the format
     * HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number.
     * When entering this value, take into account your choice for the underlying Input timecode source. For example, if
     * you have embedded timecodes that start at 01:00:00:00 and you want your overlay to end ten minutes into the video,
     * enter 01:10:00:00.
     * 
     * @param endTimecode
     *        Enter the end timecode in the underlying input video for this overlay. Your overlay will be active through
     *        this frame. To display your video overlay for the duration of the underlying video: Leave blank. Use the
     *        format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the
     *        frame number. When entering this value, take into account your choice for the underlying Input timecode
     *        source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your overlay to
     *        end ten minutes into the video, enter 01:10:00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlay withEndTimecode(String endTimecode) {
        setEndTimecode(endTimecode);
        return this;
    }

    /**
     * Input settings for Video overlay. You can include one or more video overlays in sequence at different times that
     * you specify.
     * 
     * @param input
     *        Input settings for Video overlay. You can include one or more video overlays in sequence at different
     *        times that you specify.
     */

    public void setInput(VideoOverlayInput input) {
        this.input = input;
    }

    /**
     * Input settings for Video overlay. You can include one or more video overlays in sequence at different times that
     * you specify.
     * 
     * @return Input settings for Video overlay. You can include one or more video overlays in sequence at different
     *         times that you specify.
     */

    public VideoOverlayInput getInput() {
        return this.input;
    }

    /**
     * Input settings for Video overlay. You can include one or more video overlays in sequence at different times that
     * you specify.
     * 
     * @param input
     *        Input settings for Video overlay. You can include one or more video overlays in sequence at different
     *        times that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlay withInput(VideoOverlayInput input) {
        setInput(input);
        return this;
    }

    /**
     * Enter the start timecode in the underlying input video for this overlay. Your overlay will be active starting
     * with this frame. To display your video overlay starting at the beginning of the underlying video: Leave blank.
     * Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the
     * frame number. When entering this value, take into account your choice for the underlying Input timecode source.
     * For example, if you have embedded timecodes that start at 01:00:00:00 and you want your overlay to begin five
     * minutes into the video, enter 01:05:00:00.
     * 
     * @param startTimecode
     *        Enter the start timecode in the underlying input video for this overlay. Your overlay will be active
     *        starting with this frame. To display your video overlay starting at the beginning of the underlying video:
     *        Leave blank. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the
     *        second, and FF is the frame number. When entering this value, take into account your choice for the
     *        underlying Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00
     *        and you want your overlay to begin five minutes into the video, enter 01:05:00:00.
     */

    public void setStartTimecode(String startTimecode) {
        this.startTimecode = startTimecode;
    }

    /**
     * Enter the start timecode in the underlying input video for this overlay. Your overlay will be active starting
     * with this frame. To display your video overlay starting at the beginning of the underlying video: Leave blank.
     * Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the
     * frame number. When entering this value, take into account your choice for the underlying Input timecode source.
     * For example, if you have embedded timecodes that start at 01:00:00:00 and you want your overlay to begin five
     * minutes into the video, enter 01:05:00:00.
     * 
     * @return Enter the start timecode in the underlying input video for this overlay. Your overlay will be active
     *         starting with this frame. To display your video overlay starting at the beginning of the underlying
     *         video: Leave blank. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS
     *         is the second, and FF is the frame number. When entering this value, take into account your choice for
     *         the underlying Input timecode source. For example, if you have embedded timecodes that start at
     *         01:00:00:00 and you want your overlay to begin five minutes into the video, enter 01:05:00:00.
     */

    public String getStartTimecode() {
        return this.startTimecode;
    }

    /**
     * Enter the start timecode in the underlying input video for this overlay. Your overlay will be active starting
     * with this frame. To display your video overlay starting at the beginning of the underlying video: Leave blank.
     * Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the
     * frame number. When entering this value, take into account your choice for the underlying Input timecode source.
     * For example, if you have embedded timecodes that start at 01:00:00:00 and you want your overlay to begin five
     * minutes into the video, enter 01:05:00:00.
     * 
     * @param startTimecode
     *        Enter the start timecode in the underlying input video for this overlay. Your overlay will be active
     *        starting with this frame. To display your video overlay starting at the beginning of the underlying video:
     *        Leave blank. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the
     *        second, and FF is the frame number. When entering this value, take into account your choice for the
     *        underlying Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00
     *        and you want your overlay to begin five minutes into the video, enter 01:05:00:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlay withStartTimecode(String startTimecode) {
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
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

        if (obj instanceof VideoOverlay == false)
            return false;
        VideoOverlay other = (VideoOverlay) obj;
        if (other.getEndTimecode() == null ^ this.getEndTimecode() == null)
            return false;
        if (other.getEndTimecode() != null && other.getEndTimecode().equals(this.getEndTimecode()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
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
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getStartTimecode() == null) ? 0 : getStartTimecode().hashCode());
        return hashCode;
    }

    @Override
    public VideoOverlay clone() {
        try {
            return (VideoOverlay) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoOverlayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
