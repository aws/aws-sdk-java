/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * Use Only for Fragmented MP4 or MPEG-TS Outputs. If you specify a
 * preset for which the value of Container is <code>fmp4</code>
 * (Fragmented MP4) or <code>ts</code> (MPEG-TS), Playlists contains
 * information about the master playlists that you want Elastic
 * Transcoder to create. We recommend that you create only one master
 * playlist per output format. The maximum number of master playlists in
 * a job is 30.
 * </p>
 */
public class Playlist implements Serializable {

    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. If the name includes a
     * <code>/</code> character, the section of the name before the last
     * <code>/</code> must be identical for all <code>Name</code> objects. If
     * you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name (<code>.m3u8</code> for <code>HLSv3</code> and
     * <code>HLSv4</code> playlists, and <code>.ism</code> and
     * <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     * a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String name;

    /**
     * The format of the output playlist. Valid formats include
     * <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)|(^HLSv4$)|(^Smooth$)<br/>
     */
    private String format;

    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     * output is not <code>HLS</code> or does not have a segment duration
     * set, the name of the output file is a concatenation of
     * <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     * output is <code>HLSv3</code> and has a segment duration set, or is not
     * included in a playlist, Elastic Transcoder creates an output playlist
     * file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter
     * beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     * your output is <code>HLSv4</code>, has a segment duration set, and is
     * included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     * an output playlist file with a file extension of
     * <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     * creates an output file with an extension of <code>_iframe.m3u8</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name. If you include a file extension in Output Key, the file
     * name will have two extensions. <p>If you include more than one output
     * in a playlist, any segment duration settings, clip settings, or
     * caption settings must be the same for all outputs in the playlist. For
     * <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     * <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeys;

    /**
     * The status of the job with which the playlist is associated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     */
    private String status;

    /**
     * Information that further explains the status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String statusDetail;

    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. If the name includes a
     * <code>/</code> character, the section of the name before the last
     * <code>/</code> must be identical for all <code>Name</code> objects. If
     * you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name (<code>.m3u8</code> for <code>HLSv3</code> and
     * <code>HLSv4</code> playlists, and <code>.ism</code> and
     * <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     * a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name that you want Elastic Transcoder to assign to the master
     *         playlist, for example, nyc-vacation.m3u8. If the name includes a
     *         <code>/</code> character, the section of the name before the last
     *         <code>/</code> must be identical for all <code>Name</code> objects. If
     *         you create more than one master playlist, the values of all
     *         <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name (<code>.m3u8</code> for <code>HLSv3</code> and
     *         <code>HLSv4</code> playlists, and <code>.ism</code> and
     *         <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     *         a file extension in <code>Name</code>, the file name will have two
     *         extensions.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. If the name includes a
     * <code>/</code> character, the section of the name before the last
     * <code>/</code> must be identical for all <code>Name</code> objects. If
     * you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name (<code>.m3u8</code> for <code>HLSv3</code> and
     * <code>HLSv4</code> playlists, and <code>.ism</code> and
     * <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     * a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name The name that you want Elastic Transcoder to assign to the master
     *         playlist, for example, nyc-vacation.m3u8. If the name includes a
     *         <code>/</code> character, the section of the name before the last
     *         <code>/</code> must be identical for all <code>Name</code> objects. If
     *         you create more than one master playlist, the values of all
     *         <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name (<code>.m3u8</code> for <code>HLSv3</code> and
     *         <code>HLSv4</code> playlists, and <code>.ism</code> and
     *         <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     *         a file extension in <code>Name</code>, the file name will have two
     *         extensions.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. If the name includes a
     * <code>/</code> character, the section of the name before the last
     * <code>/</code> must be identical for all <code>Name</code> objects. If
     * you create more than one master playlist, the values of all
     * <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name (<code>.m3u8</code> for <code>HLSv3</code> and
     * <code>HLSv4</code> playlists, and <code>.ism</code> and
     * <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     * a file extension in <code>Name</code>, the file name will have two
     * extensions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name The name that you want Elastic Transcoder to assign to the master
     *         playlist, for example, nyc-vacation.m3u8. If the name includes a
     *         <code>/</code> character, the section of the name before the last
     *         <code>/</code> must be identical for all <code>Name</code> objects. If
     *         you create more than one master playlist, the values of all
     *         <code>Name</code> objects must be unique. <p><b>Note</b>: Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name (<code>.m3u8</code> for <code>HLSv3</code> and
     *         <code>HLSv4</code> playlists, and <code>.ism</code> and
     *         <code>.ismc</code> for <code>Smooth</code> playlists). If you include
     *         a file extension in <code>Name</code>, the file name will have two
     *         extensions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Playlist withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The format of the output playlist. Valid formats include
     * <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)|(^HLSv4$)|(^Smooth$)<br/>
     *
     * @return The format of the output playlist. Valid formats include
     *         <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format of the output playlist. Valid formats include
     * <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)|(^HLSv4$)|(^Smooth$)<br/>
     *
     * @param format The format of the output playlist. Valid formats include
     *         <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format of the output playlist. Valid formats include
     * <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)|(^HLSv4$)|(^Smooth$)<br/>
     *
     * @param format The format of the output playlist. Valid formats include
     *         <code>HLSv3</code>, <code>HLSv4</code>, and <code>Smooth</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Playlist withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     * output is not <code>HLS</code> or does not have a segment duration
     * set, the name of the output file is a concatenation of
     * <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     * output is <code>HLSv3</code> and has a segment duration set, or is not
     * included in a playlist, Elastic Transcoder creates an output playlist
     * file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter
     * beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     * your output is <code>HLSv4</code>, has a segment duration set, and is
     * included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     * an output playlist file with a file extension of
     * <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     * creates an output file with an extension of <code>_iframe.m3u8</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name. If you include a file extension in Output Key, the file
     * name will have two extensions. <p>If you include more than one output
     * in a playlist, any segment duration settings, clip settings, or
     * caption settings must be the same for all outputs in the playlist. For
     * <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     * <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return For each output in this job that you want to include in a master
     *         playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     *         output is not <code>HLS</code> or does not have a segment duration
     *         set, the name of the output file is a concatenation of
     *         <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     *         output is <code>HLSv3</code> and has a segment duration set, or is not
     *         included in a playlist, Elastic Transcoder creates an output playlist
     *         file with a file extension of <code>.m3u8</code>, and a series of
     *         <code>.ts</code> files that include a five-digit sequential counter
     *         beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     *         your output is <code>HLSv4</code>, has a segment duration set, and is
     *         included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     *         an output playlist file with a file extension of
     *         <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     *         creates an output file with an extension of <code>_iframe.m3u8</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name. If you include a file extension in Output Key, the file
     *         name will have two extensions. <p>If you include more than one output
     *         in a playlist, any segment duration settings, clip settings, or
     *         caption settings must be the same for all outputs in the playlist. For
     *         <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     *         <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *         <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     *         outputs.
     */
    public java.util.List<String> getOutputKeys() {
        if (outputKeys == null) {
              outputKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              outputKeys.setAutoConstruct(true);
        }
        return outputKeys;
    }
    
    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     * output is not <code>HLS</code> or does not have a segment duration
     * set, the name of the output file is a concatenation of
     * <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     * output is <code>HLSv3</code> and has a segment duration set, or is not
     * included in a playlist, Elastic Transcoder creates an output playlist
     * file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter
     * beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     * your output is <code>HLSv4</code>, has a segment duration set, and is
     * included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     * an output playlist file with a file extension of
     * <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     * creates an output file with an extension of <code>_iframe.m3u8</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name. If you include a file extension in Output Key, the file
     * name will have two extensions. <p>If you include more than one output
     * in a playlist, any segment duration settings, clip settings, or
     * caption settings must be the same for all outputs in the playlist. For
     * <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     * <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys For each output in this job that you want to include in a master
     *         playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     *         output is not <code>HLS</code> or does not have a segment duration
     *         set, the name of the output file is a concatenation of
     *         <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     *         output is <code>HLSv3</code> and has a segment duration set, or is not
     *         included in a playlist, Elastic Transcoder creates an output playlist
     *         file with a file extension of <code>.m3u8</code>, and a series of
     *         <code>.ts</code> files that include a five-digit sequential counter
     *         beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     *         your output is <code>HLSv4</code>, has a segment duration set, and is
     *         included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     *         an output playlist file with a file extension of
     *         <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     *         creates an output file with an extension of <code>_iframe.m3u8</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name. If you include a file extension in Output Key, the file
     *         name will have two extensions. <p>If you include more than one output
     *         in a playlist, any segment duration settings, clip settings, or
     *         caption settings must be the same for all outputs in the playlist. For
     *         <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     *         <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *         <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     *         outputs.
     */
    public void setOutputKeys(java.util.Collection<String> outputKeys) {
        if (outputKeys == null) {
            this.outputKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(outputKeys.size());
        outputKeysCopy.addAll(outputKeys);
        this.outputKeys = outputKeysCopy;
    }
    
    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     * output is not <code>HLS</code> or does not have a segment duration
     * set, the name of the output file is a concatenation of
     * <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     * output is <code>HLSv3</code> and has a segment duration set, or is not
     * included in a playlist, Elastic Transcoder creates an output playlist
     * file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter
     * beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     * your output is <code>HLSv4</code>, has a segment duration set, and is
     * included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     * an output playlist file with a file extension of
     * <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     * creates an output file with an extension of <code>_iframe.m3u8</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name. If you include a file extension in Output Key, the file
     * name will have two extensions. <p>If you include more than one output
     * in a playlist, any segment duration settings, clip settings, or
     * caption settings must be the same for all outputs in the playlist. For
     * <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     * <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     * outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys For each output in this job that you want to include in a master
     *         playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     *         output is not <code>HLS</code> or does not have a segment duration
     *         set, the name of the output file is a concatenation of
     *         <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     *         output is <code>HLSv3</code> and has a segment duration set, or is not
     *         included in a playlist, Elastic Transcoder creates an output playlist
     *         file with a file extension of <code>.m3u8</code>, and a series of
     *         <code>.ts</code> files that include a five-digit sequential counter
     *         beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     *         your output is <code>HLSv4</code>, has a segment duration set, and is
     *         included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     *         an output playlist file with a file extension of
     *         <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     *         creates an output file with an extension of <code>_iframe.m3u8</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name. If you include a file extension in Output Key, the file
     *         name will have two extensions. <p>If you include more than one output
     *         in a playlist, any segment duration settings, clip settings, or
     *         caption settings must be the same for all outputs in the playlist. For
     *         <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     *         <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *         <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     *         outputs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Playlist withOutputKeys(String... outputKeys) {
        if (getOutputKeys() == null) setOutputKeys(new java.util.ArrayList<String>(outputKeys.length));
        for (String value : outputKeys) {
            getOutputKeys().add(value);
        }
        return this;
    }
    
    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     * output is not <code>HLS</code> or does not have a segment duration
     * set, the name of the output file is a concatenation of
     * <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     * output is <code>HLSv3</code> and has a segment duration set, or is not
     * included in a playlist, Elastic Transcoder creates an output playlist
     * file with a file extension of <code>.m3u8</code>, and a series of
     * <code>.ts</code> files that include a five-digit sequential counter
     * beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     * your output is <code>HLSv4</code>, has a segment duration set, and is
     * included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     * an output playlist file with a file extension of
     * <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     * creates an output file with an extension of <code>_iframe.m3u8</code>:
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     * <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     * Transcoder automatically appends the relevant file extension to the
     * file name. If you include a file extension in Output Key, the file
     * name will have two extensions. <p>If you include more than one output
     * in a playlist, any segment duration settings, clip settings, or
     * caption settings must be the same for all outputs in the playlist. For
     * <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     * <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     * <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     * outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys For each output in this job that you want to include in a master
     *         playlist, the value of the Outputs:Key object. <ul> <li> <p>If your
     *         output is not <code>HLS</code> or does not have a segment duration
     *         set, the name of the output file is a concatenation of
     *         <code>OutputKeyPrefix</code> and <code>Outputs:Key</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code> </li> <li> <p>If your
     *         output is <code>HLSv3</code> and has a segment duration set, or is not
     *         included in a playlist, Elastic Transcoder creates an output playlist
     *         file with a file extension of <code>.m3u8</code>, and a series of
     *         <code>.ts</code> files that include a five-digit sequential counter
     *         beginning with 00000: <p>OutputKeyPrefix<code>Outputs:Key</code>.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>00000.ts </li> <li> <p>If
     *         your output is <code>HLSv4</code>, has a segment duration set, and is
     *         included in an <code>HLSv4</code> playlist, Elastic Transcoder creates
     *         an output playlist file with a file extension of
     *         <code>_v4.m3u8</code>. If the output is video, Elastic Transcoder also
     *         creates an output file with an extension of <code>_iframe.m3u8</code>:
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_v4.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>_iframe.m3u8
     *         <p>OutputKeyPrefix<code>Outputs:Key</code>.ts </li> </ul> <p>Elastic
     *         Transcoder automatically appends the relevant file extension to the
     *         file name. If you include a file extension in Output Key, the file
     *         name will have two extensions. <p>If you include more than one output
     *         in a playlist, any segment duration settings, clip settings, or
     *         caption settings must be the same for all outputs in the playlist. For
     *         <code>Smooth</code> playlists, the <code>Audio:Profile</code>,
     *         <code>Video:Profile</code>, and <code>Video:FrameRate</code> to
     *         <code>Video:KeyframesMaxDist</code> ratio must be the same for all
     *         outputs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Playlist withOutputKeys(java.util.Collection<String> outputKeys) {
        if (outputKeys == null) {
            this.outputKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(outputKeys.size());
            outputKeysCopy.addAll(outputKeys);
            this.outputKeys = outputKeysCopy;
        }

        return this;
    }

    /**
     * The status of the job with which the playlist is associated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @return The status of the job with which the playlist is associated.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the job with which the playlist is associated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status The status of the job with which the playlist is associated.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the job with which the playlist is associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status The status of the job with which the playlist is associated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Playlist withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Information that further explains the status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Information that further explains the status.
     */
    public String getStatusDetail() {
        return statusDetail;
    }
    
    /**
     * Information that further explains the status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param statusDetail Information that further explains the status.
     */
    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }
    
    /**
     * Information that further explains the status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param statusDetail Information that further explains the status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Playlist withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getOutputKeys() != null) sb.append("OutputKeys: " + getOutputKeys() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetail() != null) sb.append("StatusDetail: " + getStatusDetail() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getOutputKeys() == null) ? 0 : getOutputKeys().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Playlist == false) return false;
        Playlist other = (Playlist)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getOutputKeys() == null ^ this.getOutputKeys() == null) return false;
        if (other.getOutputKeys() != null && other.getOutputKeys().equals(this.getOutputKeys()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null) return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false) return false; 
        return true;
    }
    
}
    