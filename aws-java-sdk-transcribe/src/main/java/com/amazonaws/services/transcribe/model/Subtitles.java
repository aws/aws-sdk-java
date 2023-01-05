/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Generate subtitles for your media file with your transcription request.
 * </p>
 * <p>
 * You can choose a start index of 0 or 1, and you can specify either WebVTT or SubRip (or both) as your output format.
 * </p>
 * <p>
 * Note that your subtitle files are placed in the same location as your transcription output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Subtitles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subtitles implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, two output files are generated.
     * </p>
     */
    private java.util.List<String> formats;
    /**
     * <p>
     * Specify the starting value that is assigned to the first subtitle segment.
     * </p>
     * <p>
     * The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used standard
     * of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>, as this may
     * improve compatibility with other services.
     * </p>
     */
    private Integer outputStartIndex;

    /**
     * <p>
     * Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, two output files are generated.
     * </p>
     * 
     * @return Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip
     *         (<code>srt</code>) formats, two output files are generated.
     * @see SubtitleFormat
     */

    public java.util.List<String> getFormats() {
        return formats;
    }

    /**
     * <p>
     * Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, two output files are generated.
     * </p>
     * 
     * @param formats
     *        Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip
     *        (<code>srt</code>) formats, two output files are generated.
     * @see SubtitleFormat
     */

    public void setFormats(java.util.Collection<String> formats) {
        if (formats == null) {
            this.formats = null;
            return;
        }

        this.formats = new java.util.ArrayList<String>(formats);
    }

    /**
     * <p>
     * Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, two output files are generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormats(java.util.Collection)} or {@link #withFormats(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param formats
     *        Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip
     *        (<code>srt</code>) formats, two output files are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubtitleFormat
     */

    public Subtitles withFormats(String... formats) {
        if (this.formats == null) {
            setFormats(new java.util.ArrayList<String>(formats.length));
        }
        for (String ele : formats) {
            this.formats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, two output files are generated.
     * </p>
     * 
     * @param formats
     *        Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip
     *        (<code>srt</code>) formats, two output files are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubtitleFormat
     */

    public Subtitles withFormats(java.util.Collection<String> formats) {
        setFormats(formats);
        return this;
    }

    /**
     * <p>
     * Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, two output files are generated.
     * </p>
     * 
     * @param formats
     *        Specify the output format for your subtitle file; if you select both WebVTT (<code>vtt</code>) and SubRip
     *        (<code>srt</code>) formats, two output files are generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubtitleFormat
     */

    public Subtitles withFormats(SubtitleFormat... formats) {
        java.util.ArrayList<String> formatsCopy = new java.util.ArrayList<String>(formats.length);
        for (SubtitleFormat value : formats) {
            formatsCopy.add(value.toString());
        }
        if (getFormats() == null) {
            setFormats(formatsCopy);
        } else {
            getFormats().addAll(formatsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specify the starting value that is assigned to the first subtitle segment.
     * </p>
     * <p>
     * The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used standard
     * of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>, as this may
     * improve compatibility with other services.
     * </p>
     * 
     * @param outputStartIndex
     *        Specify the starting value that is assigned to the first subtitle segment.</p>
     *        <p>
     *        The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used
     *        standard of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>,
     *        as this may improve compatibility with other services.
     */

    public void setOutputStartIndex(Integer outputStartIndex) {
        this.outputStartIndex = outputStartIndex;
    }

    /**
     * <p>
     * Specify the starting value that is assigned to the first subtitle segment.
     * </p>
     * <p>
     * The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used standard
     * of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>, as this may
     * improve compatibility with other services.
     * </p>
     * 
     * @return Specify the starting value that is assigned to the first subtitle segment.</p>
     *         <p>
     *         The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used
     *         standard of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>,
     *         as this may improve compatibility with other services.
     */

    public Integer getOutputStartIndex() {
        return this.outputStartIndex;
    }

    /**
     * <p>
     * Specify the starting value that is assigned to the first subtitle segment.
     * </p>
     * <p>
     * The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used standard
     * of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>, as this may
     * improve compatibility with other services.
     * </p>
     * 
     * @param outputStartIndex
     *        Specify the starting value that is assigned to the first subtitle segment.</p>
     *        <p>
     *        The default start index for Amazon Transcribe is <code>0</code>, which differs from the more widely used
     *        standard of <code>1</code>. If you're uncertain which value to use, we recommend choosing <code>1</code>,
     *        as this may improve compatibility with other services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subtitles withOutputStartIndex(Integer outputStartIndex) {
        setOutputStartIndex(outputStartIndex);
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
        if (getFormats() != null)
            sb.append("Formats: ").append(getFormats()).append(",");
        if (getOutputStartIndex() != null)
            sb.append("OutputStartIndex: ").append(getOutputStartIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subtitles == false)
            return false;
        Subtitles other = (Subtitles) obj;
        if (other.getFormats() == null ^ this.getFormats() == null)
            return false;
        if (other.getFormats() != null && other.getFormats().equals(this.getFormats()) == false)
            return false;
        if (other.getOutputStartIndex() == null ^ this.getOutputStartIndex() == null)
            return false;
        if (other.getOutputStartIndex() != null && other.getOutputStartIndex().equals(this.getOutputStartIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormats() == null) ? 0 : getFormats().hashCode());
        hashCode = prime * hashCode + ((getOutputStartIndex() == null) ? 0 : getOutputStartIndex().hashCode());
        return hashCode;
    }

    @Override
    public Subtitles clone() {
        try {
            return (Subtitles) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.SubtitlesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
