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
 * Input settings for Video overlay. You can include one or more video overlays in sequence at different times that you
 * specify.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoOverlayInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoOverlayInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and formatting in
     * your output video image, we recommend that you specify a video with similar characteristics as the underlying
     * input video.
     */
    private String fileInput;
    /**
     * Specify one or more clips to use from your video overlay. When you include an input clip, you must also specify
     * its start timecode, end timecode, or both start and end timecode.
     */
    private java.util.List<VideoOverlayInputClipping> inputClippings;
    /**
     * Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     * overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose Specified
     * start. When you do, enter the starting timecode in Start timecode. If you don't specify a value for Timecode
     * source, MediaConvert uses Embedded by default.
     */
    private String timecodeSource;
    /**
     * Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source to
     * Specified start.
     */
    private String timecodeStart;

    /**
     * Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and formatting in
     * your output video image, we recommend that you specify a video with similar characteristics as the underlying
     * input video.
     * 
     * @param fileInput
     *        Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and
     *        formatting in your output video image, we recommend that you specify a video with similar characteristics
     *        as the underlying input video.
     */

    public void setFileInput(String fileInput) {
        this.fileInput = fileInput;
    }

    /**
     * Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and formatting in
     * your output video image, we recommend that you specify a video with similar characteristics as the underlying
     * input video.
     * 
     * @return Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and
     *         formatting in your output video image, we recommend that you specify a video with similar characteristics
     *         as the underlying input video.
     */

    public String getFileInput() {
        return this.fileInput;
    }

    /**
     * Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and formatting in
     * your output video image, we recommend that you specify a video with similar characteristics as the underlying
     * input video.
     * 
     * @param fileInput
     *        Specify the input file S3, HTTP, or HTTPS URI for your video overlay. For consistency in color and
     *        formatting in your output video image, we recommend that you specify a video with similar characteristics
     *        as the underlying input video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlayInput withFileInput(String fileInput) {
        setFileInput(fileInput);
        return this;
    }

    /**
     * Specify one or more clips to use from your video overlay. When you include an input clip, you must also specify
     * its start timecode, end timecode, or both start and end timecode.
     * 
     * @return Specify one or more clips to use from your video overlay. When you include an input clip, you must also
     *         specify its start timecode, end timecode, or both start and end timecode.
     */

    public java.util.List<VideoOverlayInputClipping> getInputClippings() {
        return inputClippings;
    }

    /**
     * Specify one or more clips to use from your video overlay. When you include an input clip, you must also specify
     * its start timecode, end timecode, or both start and end timecode.
     * 
     * @param inputClippings
     *        Specify one or more clips to use from your video overlay. When you include an input clip, you must also
     *        specify its start timecode, end timecode, or both start and end timecode.
     */

    public void setInputClippings(java.util.Collection<VideoOverlayInputClipping> inputClippings) {
        if (inputClippings == null) {
            this.inputClippings = null;
            return;
        }

        this.inputClippings = new java.util.ArrayList<VideoOverlayInputClipping>(inputClippings);
    }

    /**
     * Specify one or more clips to use from your video overlay. When you include an input clip, you must also specify
     * its start timecode, end timecode, or both start and end timecode.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputClippings(java.util.Collection)} or {@link #withInputClippings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputClippings
     *        Specify one or more clips to use from your video overlay. When you include an input clip, you must also
     *        specify its start timecode, end timecode, or both start and end timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlayInput withInputClippings(VideoOverlayInputClipping... inputClippings) {
        if (this.inputClippings == null) {
            setInputClippings(new java.util.ArrayList<VideoOverlayInputClipping>(inputClippings.length));
        }
        for (VideoOverlayInputClipping ele : inputClippings) {
            this.inputClippings.add(ele);
        }
        return this;
    }

    /**
     * Specify one or more clips to use from your video overlay. When you include an input clip, you must also specify
     * its start timecode, end timecode, or both start and end timecode.
     * 
     * @param inputClippings
     *        Specify one or more clips to use from your video overlay. When you include an input clip, you must also
     *        specify its start timecode, end timecode, or both start and end timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlayInput withInputClippings(java.util.Collection<VideoOverlayInputClipping> inputClippings) {
        setInputClippings(inputClippings);
        return this;
    }

    /**
     * Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     * overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose Specified
     * start. When you do, enter the starting timecode in Start timecode. If you don't specify a value for Timecode
     * source, MediaConvert uses Embedded by default.
     * 
     * @param timecodeSource
     *        Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     *        overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose
     *        Specified start. When you do, enter the starting timecode in Start timecode. If you don't specify a value
     *        for Timecode source, MediaConvert uses Embedded by default.
     * @see InputTimecodeSource
     */

    public void setTimecodeSource(String timecodeSource) {
        this.timecodeSource = timecodeSource;
    }

    /**
     * Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     * overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose Specified
     * start. When you do, enter the starting timecode in Start timecode. If you don't specify a value for Timecode
     * source, MediaConvert uses Embedded by default.
     * 
     * @return Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     *         overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose
     *         Specified start. When you do, enter the starting timecode in Start timecode. If you don't specify a value
     *         for Timecode source, MediaConvert uses Embedded by default.
     * @see InputTimecodeSource
     */

    public String getTimecodeSource() {
        return this.timecodeSource;
    }

    /**
     * Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     * overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose Specified
     * start. When you do, enter the starting timecode in Start timecode. If you don't specify a value for Timecode
     * source, MediaConvert uses Embedded by default.
     * 
     * @param timecodeSource
     *        Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     *        overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose
     *        Specified start. When you do, enter the starting timecode in Start timecode. If you don't specify a value
     *        for Timecode source, MediaConvert uses Embedded by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputTimecodeSource
     */

    public VideoOverlayInput withTimecodeSource(String timecodeSource) {
        setTimecodeSource(timecodeSource);
        return this;
    }

    /**
     * Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     * overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose Specified
     * start. When you do, enter the starting timecode in Start timecode. If you don't specify a value for Timecode
     * source, MediaConvert uses Embedded by default.
     * 
     * @param timecodeSource
     *        Specify the timecode source for your video overlay input clips. To use the timecode present in your video
     *        overlay: Choose Embedded. To use a zerobased timecode: Choose Start at 0. To choose a timecode: Choose
     *        Specified start. When you do, enter the starting timecode in Start timecode. If you don't specify a value
     *        for Timecode source, MediaConvert uses Embedded by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputTimecodeSource
     */

    public VideoOverlayInput withTimecodeSource(InputTimecodeSource timecodeSource) {
        this.timecodeSource = timecodeSource.toString();
        return this;
    }

    /**
     * Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source to
     * Specified start.
     * 
     * @param timecodeStart
     *        Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source to
     *        Specified start.
     */

    public void setTimecodeStart(String timecodeStart) {
        this.timecodeStart = timecodeStart;
    }

    /**
     * Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source to
     * Specified start.
     * 
     * @return Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source
     *         to Specified start.
     */

    public String getTimecodeStart() {
        return this.timecodeStart;
    }

    /**
     * Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source to
     * Specified start.
     * 
     * @param timecodeStart
     *        Specify the starting timecode for this video overlay. To use this setting, you must set Timecode source to
     *        Specified start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoOverlayInput withTimecodeStart(String timecodeStart) {
        setTimecodeStart(timecodeStart);
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
        if (getFileInput() != null)
            sb.append("FileInput: ").append(getFileInput()).append(",");
        if (getInputClippings() != null)
            sb.append("InputClippings: ").append(getInputClippings()).append(",");
        if (getTimecodeSource() != null)
            sb.append("TimecodeSource: ").append(getTimecodeSource()).append(",");
        if (getTimecodeStart() != null)
            sb.append("TimecodeStart: ").append(getTimecodeStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoOverlayInput == false)
            return false;
        VideoOverlayInput other = (VideoOverlayInput) obj;
        if (other.getFileInput() == null ^ this.getFileInput() == null)
            return false;
        if (other.getFileInput() != null && other.getFileInput().equals(this.getFileInput()) == false)
            return false;
        if (other.getInputClippings() == null ^ this.getInputClippings() == null)
            return false;
        if (other.getInputClippings() != null && other.getInputClippings().equals(this.getInputClippings()) == false)
            return false;
        if (other.getTimecodeSource() == null ^ this.getTimecodeSource() == null)
            return false;
        if (other.getTimecodeSource() != null && other.getTimecodeSource().equals(this.getTimecodeSource()) == false)
            return false;
        if (other.getTimecodeStart() == null ^ this.getTimecodeStart() == null)
            return false;
        if (other.getTimecodeStart() != null && other.getTimecodeStart().equals(this.getTimecodeStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileInput() == null) ? 0 : getFileInput().hashCode());
        hashCode = prime * hashCode + ((getInputClippings() == null) ? 0 : getInputClippings().hashCode());
        hashCode = prime * hashCode + ((getTimecodeSource() == null) ? 0 : getTimecodeSource().hashCode());
        hashCode = prime * hashCode + ((getTimecodeStart() == null) ? 0 : getTimecodeStart().hashCode());
        return hashCode;
    }

    @Override
    public VideoOverlayInput clone() {
        try {
            return (VideoOverlayInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoOverlayInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
