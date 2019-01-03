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
 * Information about the master playlist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobPlaylist implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If
     * the name includes a <code>/</code> character, the section of the name before the last <code>/</code> must be
     * identical for all <code>Name</code> objects. If you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique.
     * </p>
     * <note>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code> for
     * <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     * <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     * <code>Smooth</code>.
     * </p>
     */
    private String format;
    /**
     * <p>
     * For each output in this job that you want to include in a master playlist, the value of the
     * <code>Outputs:Key</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output file is a
     * concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist, Elastic
     * Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     * playlist, Elastic Transcoder creates an output playlist file with a file extension of <code>_v4.m3u8</code>. If
     * the output is video, Elastic Transcoder also creates an output file with an extension of
     * <code>_iframe.m3u8</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.ts
     * </p>
     * </li>
     * </ul>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file
     * extension in Output Key, the file name will have two extensions.
     * </p>
     * <p>
     * If you include more than one output in a playlist, any segment duration settings, clip settings, or caption
     * settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     * <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> outputKeys;
    /**
     * <p>
     * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files
     * associated with this playlist.
     * </p>
     */
    private HlsContentProtection hlsContentProtection;
    /**
     * <p>
     * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     */
    private PlayReadyDrm playReadyDrm;

    /**
     * <p>
     * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If
     * the name includes a <code>/</code> character, the section of the name before the last <code>/</code> must be
     * identical for all <code>Name</code> objects. If you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique.
     * </p>
     * <note>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code> for
     * <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     * <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * </p>
     * </note>
     * 
     * @param name
     *        The name that you want Elastic Transcoder to assign to the master playlist, for example,
     *        nyc-vacation.m3u8. If the name includes a <code>/</code> character, the section of the name before the
     *        last <code>/</code> must be identical for all <code>Name</code> objects. If you create more than one
     *        master playlist, the values of all <code>Name</code> objects must be unique.</p> <note>
     *        <p>
     *        Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code>
     *        for <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     *        <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will
     *        have two extensions.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If
     * the name includes a <code>/</code> character, the section of the name before the last <code>/</code> must be
     * identical for all <code>Name</code> objects. If you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique.
     * </p>
     * <note>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code> for
     * <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     * <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * </p>
     * </note>
     * 
     * @return The name that you want Elastic Transcoder to assign to the master playlist, for example,
     *         nyc-vacation.m3u8. If the name includes a <code>/</code> character, the section of the name before the
     *         last <code>/</code> must be identical for all <code>Name</code> objects. If you create more than one
     *         master playlist, the values of all <code>Name</code> objects must be unique.</p> <note>
     *         <p>
     *         Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code>
     *         for <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     *         <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will
     *         have two extensions.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want Elastic Transcoder to assign to the master playlist, for example, nyc-vacation.m3u8. If
     * the name includes a <code>/</code> character, the section of the name before the last <code>/</code> must be
     * identical for all <code>Name</code> objects. If you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique.
     * </p>
     * <note>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code> for
     * <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     * <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * </p>
     * </note>
     * 
     * @param name
     *        The name that you want Elastic Transcoder to assign to the master playlist, for example,
     *        nyc-vacation.m3u8. If the name includes a <code>/</code> character, the section of the name before the
     *        last <code>/</code> must be identical for all <code>Name</code> objects. If you create more than one
     *        master playlist, the values of all <code>Name</code> objects must be unique.</p> <note>
     *        <p>
     *        Elastic Transcoder automatically appends the relevant file extension to the file name (<code>.m3u8</code>
     *        for <code>HLSv3</code> and <code>HLSv4</code> playlists, and <code>.ism</code> and <code>.ismc</code> for
     *        <code>Smooth</code> playlists). If you include a file extension in <code>Name</code>, the file name will
     *        have two extensions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobPlaylist withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     * <code>Smooth</code>.
     * </p>
     * 
     * @param format
     *        The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     *        <code>Smooth</code>.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     * <code>Smooth</code>.
     * </p>
     * 
     * @return The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     *         <code>Smooth</code>.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     * <code>Smooth</code>.
     * </p>
     * 
     * @param format
     *        The format of the output playlist. Valid formats include <code>HLSv3</code>, <code>HLSv4</code>, and
     *        <code>Smooth</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobPlaylist withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * For each output in this job that you want to include in a master playlist, the value of the
     * <code>Outputs:Key</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output file is a
     * concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist, Elastic
     * Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     * playlist, Elastic Transcoder creates an output playlist file with a file extension of <code>_v4.m3u8</code>. If
     * the output is video, Elastic Transcoder also creates an output file with an extension of
     * <code>_iframe.m3u8</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.ts
     * </p>
     * </li>
     * </ul>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file
     * extension in Output Key, the file name will have two extensions.
     * </p>
     * <p>
     * If you include more than one output in a playlist, any segment duration settings, clip settings, or caption
     * settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     * <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * </p>
     * 
     * @return For each output in this job that you want to include in a master playlist, the value of the
     *         <code>Outputs:Key</code> object. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output
     *         file is a concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *         </p>
     *         <p>
     *         OutputKeyPrefix<code>Outputs:Key</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist,
     *         Elastic Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a
     *         series of <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     *         </p>
     *         <p>
     *         OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *         </p>
     *         <p>
     *         OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your output is <code>HLSv4</code>, has a segment duration set, and is included in an
     *         <code>HLSv4</code> playlist, Elastic Transcoder creates an output playlist file with a file extension of
     *         <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also creates an output file with an
     *         extension of <code>_iframe.m3u8</code>:
     *         </p>
     *         <p>
     *         OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *         </p>
     *         <p>
     *         OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *         </p>
     *         <p>
     *         OutputKeyPrefix<code>Outputs:Key</code>.ts
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a
     *         file extension in Output Key, the file name will have two extensions.
     *         </p>
     *         <p>
     *         If you include more than one output in a playlist, any segment duration settings, clip settings, or
     *         caption settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     *         <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *         <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     */

    public java.util.List<String> getOutputKeys() {
        if (outputKeys == null) {
            outputKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return outputKeys;
    }

    /**
     * <p>
     * For each output in this job that you want to include in a master playlist, the value of the
     * <code>Outputs:Key</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output file is a
     * concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist, Elastic
     * Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     * playlist, Elastic Transcoder creates an output playlist file with a file extension of <code>_v4.m3u8</code>. If
     * the output is video, Elastic Transcoder also creates an output file with an extension of
     * <code>_iframe.m3u8</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.ts
     * </p>
     * </li>
     * </ul>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file
     * extension in Output Key, the file name will have two extensions.
     * </p>
     * <p>
     * If you include more than one output in a playlist, any segment duration settings, clip settings, or caption
     * settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     * <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * </p>
     * 
     * @param outputKeys
     *        For each output in this job that you want to include in a master playlist, the value of the
     *        <code>Outputs:Key</code> object. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output
     *        file is a concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist,
     *        Elastic Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a
     *        series of <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     *        playlist, Elastic Transcoder creates an output playlist file with a file extension of
     *        <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also creates an output file with an
     *        extension of <code>_iframe.m3u8</code>:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>.ts
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a
     *        file extension in Output Key, the file name will have two extensions.
     *        </p>
     *        <p>
     *        If you include more than one output in a playlist, any segment duration settings, clip settings, or
     *        caption settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     *        <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *        <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     */

    public void setOutputKeys(java.util.Collection<String> outputKeys) {
        if (outputKeys == null) {
            this.outputKeys = null;
            return;
        }

        this.outputKeys = new com.amazonaws.internal.SdkInternalList<String>(outputKeys);
    }

    /**
     * <p>
     * For each output in this job that you want to include in a master playlist, the value of the
     * <code>Outputs:Key</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output file is a
     * concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist, Elastic
     * Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     * playlist, Elastic Transcoder creates an output playlist file with a file extension of <code>_v4.m3u8</code>. If
     * the output is video, Elastic Transcoder also creates an output file with an extension of
     * <code>_iframe.m3u8</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.ts
     * </p>
     * </li>
     * </ul>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file
     * extension in Output Key, the file name will have two extensions.
     * </p>
     * <p>
     * If you include more than one output in a playlist, any segment duration settings, clip settings, or caption
     * settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     * <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputKeys(java.util.Collection)} or {@link #withOutputKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputKeys
     *        For each output in this job that you want to include in a master playlist, the value of the
     *        <code>Outputs:Key</code> object. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output
     *        file is a concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist,
     *        Elastic Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a
     *        series of <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     *        playlist, Elastic Transcoder creates an output playlist file with a file extension of
     *        <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also creates an output file with an
     *        extension of <code>_iframe.m3u8</code>:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>.ts
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a
     *        file extension in Output Key, the file name will have two extensions.
     *        </p>
     *        <p>
     *        If you include more than one output in a playlist, any segment duration settings, clip settings, or
     *        caption settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     *        <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *        <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobPlaylist withOutputKeys(String... outputKeys) {
        if (this.outputKeys == null) {
            setOutputKeys(new com.amazonaws.internal.SdkInternalList<String>(outputKeys.length));
        }
        for (String ele : outputKeys) {
            this.outputKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For each output in this job that you want to include in a master playlist, the value of the
     * <code>Outputs:Key</code> object.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output file is a
     * concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist, Elastic
     * Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     * </p>
     * </li>
     * <li>
     * <p>
     * If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     * playlist, Elastic Transcoder creates an output playlist file with a file extension of <code>_v4.m3u8</code>. If
     * the output is video, Elastic Transcoder also creates an output file with an extension of
     * <code>_iframe.m3u8</code>:
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * </p>
     * <p>
     * OutputKeyPrefix<code>Outputs:Key</code>.ts
     * </p>
     * </li>
     * </ul>
     * <p>
     * Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a file
     * extension in Output Key, the file name will have two extensions.
     * </p>
     * <p>
     * If you include more than one output in a playlist, any segment duration settings, clip settings, or caption
     * settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     * <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * </p>
     * 
     * @param outputKeys
     *        For each output in this job that you want to include in a master playlist, the value of the
     *        <code>Outputs:Key</code> object. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If your output is not <code>HLS</code> or does not have a segment duration set, the name of the output
     *        file is a concatenation of <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your output is <code>HLSv3</code> and has a segment duration set, or is not included in a playlist,
     *        Elastic Transcoder creates an output playlist file with a file extension of <code>.m3u8</code>, and a
     *        series of <code>.ts</code> files that include a five-digit sequential counter beginning with 00000:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>00000.ts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your output is <code>HLSv4</code>, has a segment duration set, and is included in an <code>HLSv4</code>
     *        playlist, Elastic Transcoder creates an output playlist file with a file extension of
     *        <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also creates an output file with an
     *        extension of <code>_iframe.m3u8</code>:
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *        </p>
     *        <p>
     *        OutputKeyPrefix<code>Outputs:Key</code>.ts
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Elastic Transcoder automatically appends the relevant file extension to the file name. If you include a
     *        file extension in Output Key, the file name will have two extensions.
     *        </p>
     *        <p>
     *        If you include more than one output in a playlist, any segment duration settings, clip settings, or
     *        caption settings must be the same for all outputs in the playlist. For <code>Smooth</code> playlists, the
     *        <code>Audio:Profile</code>, <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *        <code>Video:KeyframesMaxDist</code> ratio must be the same for all outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobPlaylist withOutputKeys(java.util.Collection<String> outputKeys) {
        setOutputKeys(outputKeys);
        return this;
    }

    /**
     * <p>
     * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files
     * associated with this playlist.
     * </p>
     * 
     * @param hlsContentProtection
     *        The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files
     *        associated with this playlist.
     */

    public void setHlsContentProtection(HlsContentProtection hlsContentProtection) {
        this.hlsContentProtection = hlsContentProtection;
    }

    /**
     * <p>
     * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files
     * associated with this playlist.
     * </p>
     * 
     * @return The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output
     *         files associated with this playlist.
     */

    public HlsContentProtection getHlsContentProtection() {
        return this.hlsContentProtection;
    }

    /**
     * <p>
     * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files
     * associated with this playlist.
     * </p>
     * 
     * @param hlsContentProtection
     *        The HLS content protection settings, if any, that you want Elastic Transcoder to apply to the output files
     *        associated with this playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobPlaylist withHlsContentProtection(HlsContentProtection hlsContentProtection) {
        setHlsContentProtection(hlsContentProtection);
        return this;
    }

    /**
     * <p>
     * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     * 
     * @param playReadyDrm
     *        The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with
     *        this playlist.
     */

    public void setPlayReadyDrm(PlayReadyDrm playReadyDrm) {
        this.playReadyDrm = playReadyDrm;
    }

    /**
     * <p>
     * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     * 
     * @return The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with
     *         this playlist.
     */

    public PlayReadyDrm getPlayReadyDrm() {
        return this.playReadyDrm;
    }

    /**
     * <p>
     * The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     * 
     * @param playReadyDrm
     *        The DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with
     *        this playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobPlaylist withPlayReadyDrm(PlayReadyDrm playReadyDrm) {
        setPlayReadyDrm(playReadyDrm);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getOutputKeys() != null)
            sb.append("OutputKeys: ").append(getOutputKeys()).append(",");
        if (getHlsContentProtection() != null)
            sb.append("HlsContentProtection: ").append(getHlsContentProtection()).append(",");
        if (getPlayReadyDrm() != null)
            sb.append("PlayReadyDrm: ").append(getPlayReadyDrm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobPlaylist == false)
            return false;
        CreateJobPlaylist other = (CreateJobPlaylist) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getOutputKeys() == null ^ this.getOutputKeys() == null)
            return false;
        if (other.getOutputKeys() != null && other.getOutputKeys().equals(this.getOutputKeys()) == false)
            return false;
        if (other.getHlsContentProtection() == null ^ this.getHlsContentProtection() == null)
            return false;
        if (other.getHlsContentProtection() != null && other.getHlsContentProtection().equals(this.getHlsContentProtection()) == false)
            return false;
        if (other.getPlayReadyDrm() == null ^ this.getPlayReadyDrm() == null)
            return false;
        if (other.getPlayReadyDrm() != null && other.getPlayReadyDrm().equals(this.getPlayReadyDrm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getOutputKeys() == null) ? 0 : getOutputKeys().hashCode());
        hashCode = prime * hashCode + ((getHlsContentProtection() == null) ? 0 : getHlsContentProtection().hashCode());
        hashCode = prime * hashCode + ((getPlayReadyDrm() == null) ? 0 : getPlayReadyDrm().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobPlaylist clone() {
        try {
            return (CreateJobPlaylist) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.CreateJobPlaylistMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
