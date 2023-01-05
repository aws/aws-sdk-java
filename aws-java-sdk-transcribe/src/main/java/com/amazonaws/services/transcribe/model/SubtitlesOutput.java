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
 * Provides information about your subtitle file, including format, start index, and Amazon S3 location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/SubtitlesOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubtitlesOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, both formats are shown.
     * </p>
     */
    private java.util.List<String> formats;
    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file. Your
     * subtitle file is stored in the same location as your transcript. If you specified both WebVTT and SubRip subtitle
     * formats, two URIs are provided.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file is
     * stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your subtitle file.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     */
    private java.util.List<String> subtitleFileUris;
    /**
     * <p>
     * Provides the start index value for your subtitle files. If you did not specify a value in your request, the
     * default value of <code>0</code> is used.
     * </p>
     */
    private Integer outputStartIndex;

    /**
     * <p>
     * Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, both formats are shown.
     * </p>
     * 
     * @return Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and
     *         SubRip (<code>srt</code>) formats, both formats are shown.
     * @see SubtitleFormat
     */

    public java.util.List<String> getFormats() {
        return formats;
    }

    /**
     * <p>
     * Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, both formats are shown.
     * </p>
     * 
     * @param formats
     *        Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and
     *        SubRip (<code>srt</code>) formats, both formats are shown.
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
     * Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, both formats are shown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormats(java.util.Collection)} or {@link #withFormats(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param formats
     *        Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and
     *        SubRip (<code>srt</code>) formats, both formats are shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubtitleFormat
     */

    public SubtitlesOutput withFormats(String... formats) {
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
     * Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, both formats are shown.
     * </p>
     * 
     * @param formats
     *        Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and
     *        SubRip (<code>srt</code>) formats, both formats are shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubtitleFormat
     */

    public SubtitlesOutput withFormats(java.util.Collection<String> formats) {
        setFormats(formats);
        return this;
    }

    /**
     * <p>
     * Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and SubRip (
     * <code>srt</code>) formats, both formats are shown.
     * </p>
     * 
     * @param formats
     *        Provides the format of your subtitle files. If your request included both WebVTT (<code>vtt</code>) and
     *        SubRip (<code>srt</code>) formats, both formats are shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubtitleFormat
     */

    public SubtitlesOutput withFormats(SubtitleFormat... formats) {
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
     * The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file. Your
     * subtitle file is stored in the same location as your transcript. If you specified both WebVTT and SubRip subtitle
     * formats, two URIs are provided.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file is
     * stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your subtitle file.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @return The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file.
     *         Your subtitle file is stored in the same location as your transcript. If you specified both WebVTT and
     *         SubRip subtitle formats, two URIs are provided.</p>
     *         <p>
     *         If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *         bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *         you specified in your request.
     *         </p>
     *         <p>
     *         If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file
     *         is stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary
     *         URI you can use for secure access to your subtitle file.
     *         </p>
     *         <note>
     *         <p>
     *         Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *         <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *         <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *         </p>
     */

    public java.util.List<String> getSubtitleFileUris() {
        return subtitleFileUris;
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file. Your
     * subtitle file is stored in the same location as your transcript. If you specified both WebVTT and SubRip subtitle
     * formats, two URIs are provided.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file is
     * stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your subtitle file.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @param subtitleFileUris
     *        The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file.
     *        Your subtitle file is stored in the same location as your transcript. If you specified both WebVTT and
     *        SubRip subtitle formats, two URIs are provided.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file
     *        is stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary
     *        URI you can use for secure access to your subtitle file.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     */

    public void setSubtitleFileUris(java.util.Collection<String> subtitleFileUris) {
        if (subtitleFileUris == null) {
            this.subtitleFileUris = null;
            return;
        }

        this.subtitleFileUris = new java.util.ArrayList<String>(subtitleFileUris);
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file. Your
     * subtitle file is stored in the same location as your transcript. If you specified both WebVTT and SubRip subtitle
     * formats, two URIs are provided.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file is
     * stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your subtitle file.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubtitleFileUris(java.util.Collection)} or {@link #withSubtitleFileUris(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param subtitleFileUris
     *        The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file.
     *        Your subtitle file is stored in the same location as your transcript. If you specified both WebVTT and
     *        SubRip subtitle formats, two URIs are provided.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file
     *        is stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary
     *        URI you can use for secure access to your subtitle file.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtitlesOutput withSubtitleFileUris(String... subtitleFileUris) {
        if (this.subtitleFileUris == null) {
            setSubtitleFileUris(new java.util.ArrayList<String>(subtitleFileUris.length));
        }
        for (String ele : subtitleFileUris) {
            this.subtitleFileUris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file. Your
     * subtitle file is stored in the same location as your transcript. If you specified both WebVTT and SubRip subtitle
     * formats, two URIs are provided.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file is
     * stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your subtitle file.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @param subtitleFileUris
     *        The Amazon S3 location of your transcript. You can use this URI to access or download your subtitle file.
     *        Your subtitle file is stored in the same location as your transcript. If you specified both WebVTT and
     *        SubRip subtitle formats, two URIs are provided.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your subtitle file
     *        is stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary
     *        URI you can use for secure access to your subtitle file.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtitlesOutput withSubtitleFileUris(java.util.Collection<String> subtitleFileUris) {
        setSubtitleFileUris(subtitleFileUris);
        return this;
    }

    /**
     * <p>
     * Provides the start index value for your subtitle files. If you did not specify a value in your request, the
     * default value of <code>0</code> is used.
     * </p>
     * 
     * @param outputStartIndex
     *        Provides the start index value for your subtitle files. If you did not specify a value in your request,
     *        the default value of <code>0</code> is used.
     */

    public void setOutputStartIndex(Integer outputStartIndex) {
        this.outputStartIndex = outputStartIndex;
    }

    /**
     * <p>
     * Provides the start index value for your subtitle files. If you did not specify a value in your request, the
     * default value of <code>0</code> is used.
     * </p>
     * 
     * @return Provides the start index value for your subtitle files. If you did not specify a value in your request,
     *         the default value of <code>0</code> is used.
     */

    public Integer getOutputStartIndex() {
        return this.outputStartIndex;
    }

    /**
     * <p>
     * Provides the start index value for your subtitle files. If you did not specify a value in your request, the
     * default value of <code>0</code> is used.
     * </p>
     * 
     * @param outputStartIndex
     *        Provides the start index value for your subtitle files. If you did not specify a value in your request,
     *        the default value of <code>0</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtitlesOutput withOutputStartIndex(Integer outputStartIndex) {
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
        if (getSubtitleFileUris() != null)
            sb.append("SubtitleFileUris: ").append(getSubtitleFileUris()).append(",");
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

        if (obj instanceof SubtitlesOutput == false)
            return false;
        SubtitlesOutput other = (SubtitlesOutput) obj;
        if (other.getFormats() == null ^ this.getFormats() == null)
            return false;
        if (other.getFormats() != null && other.getFormats().equals(this.getFormats()) == false)
            return false;
        if (other.getSubtitleFileUris() == null ^ this.getSubtitleFileUris() == null)
            return false;
        if (other.getSubtitleFileUris() != null && other.getSubtitleFileUris().equals(this.getSubtitleFileUris()) == false)
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
        hashCode = prime * hashCode + ((getSubtitleFileUris() == null) ? 0 : getSubtitleFileUris().hashCode());
        hashCode = prime * hashCode + ((getOutputStartIndex() == null) ? 0 : getOutputStartIndex().hashCode());
        return hashCode;
    }

    @Override
    public SubtitlesOutput clone() {
        try {
            return (SubtitlesOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.SubtitlesOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
