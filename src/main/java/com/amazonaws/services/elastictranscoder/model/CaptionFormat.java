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
 * The file format of the output captions. If you leave this value blank,
 * Elastic Transcoder returns an error.
 * </p>
 */
public class CaptionFormat implements Serializable {

    /**
     * The format you specify determines whether Elastic Transcoder generates
     * an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     * Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     * <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     * None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     * None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     * Elastic Transcoder supports dfxp (first div element only), scc, srt,
     * and webvtt. There are no container restrictions on sidecar captions.
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your
     * output format. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)<br/>
     */
    private String format;

    /**
     * The prefix for caption filenames, in the form
     * <i>description</i>-<code>{language}</code>, where: <ul>
     * <li><i>description</i> is a description of the video.</li>
     * <li><code>{language}</code> is a literal value that Elastic Transcoder
     * replaces with the two- or three-letter code for the language of the
     * caption in the output file names.</li> </ul> <p>If you don't include
     * <code>{language}</code> in the file name pattern, Elastic Transcoder
     * automatically appends "<code>{language}</code>" to the value that you
     * specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * <p>For example, suppose you're transcoding into srt format. When you
     * enter "Sydney-{language}-sunrise", and the language of the captions is
     * English (en), the name of the first caption file will be
     * Sydney-en-sunrise00000.srt.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{language\}.*$)<br/>
     */
    private String pattern;

    /**
     * The format you specify determines whether Elastic Transcoder generates
     * an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     * Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     * <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     * None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     * None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     * Elastic Transcoder supports dfxp (first div element only), scc, srt,
     * and webvtt. There are no container restrictions on sidecar captions.
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your
     * output format. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)<br/>
     *
     * @return The format you specify determines whether Elastic Transcoder generates
     *         an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     *         Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     *         <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     *         None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     *         None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     *         Elastic Transcoder supports dfxp (first div element only), scc, srt,
     *         and webvtt. There are no container restrictions on sidecar captions.
     *         If you want ttml or smpte-tt compatible captions, specify dfxp as your
     *         output format. </li> </ul>
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format you specify determines whether Elastic Transcoder generates
     * an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     * Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     * <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     * None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     * None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     * Elastic Transcoder supports dfxp (first div element only), scc, srt,
     * and webvtt. There are no container restrictions on sidecar captions.
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your
     * output format. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)<br/>
     *
     * @param format The format you specify determines whether Elastic Transcoder generates
     *         an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     *         Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     *         <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     *         None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     *         None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     *         Elastic Transcoder supports dfxp (first div element only), scc, srt,
     *         and webvtt. There are no container restrictions on sidecar captions.
     *         If you want ttml or smpte-tt compatible captions, specify dfxp as your
     *         output format. </li> </ul>
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format you specify determines whether Elastic Transcoder generates
     * an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     * Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     * <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     * None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     * None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     * Elastic Transcoder supports dfxp (first div element only), scc, srt,
     * and webvtt. There are no container restrictions on sidecar captions.
     * If you want ttml or smpte-tt compatible captions, specify dfxp as your
     * output format. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^mov-text$)|(^srt$)|(^scc$)|(^webvtt$)|(^dfxp$)<br/>
     *
     * @param format The format you specify determines whether Elastic Transcoder generates
     *         an embedded or sidecar caption for this output. <ul> <li><p><b>Valid
     *         Embedded Caption Formats:</b> <ul> <li><p><b>For MP3</b>: None</li>
     *         <li><p><b>For MP4</b>: mov-text</li> <li><p><b>For MPEG-TS</b>:
     *         None</li> <li><p><b>For ogg</b>: None</li> <li><p><b>For webm</b>:
     *         None</li> </ul> </li> <li><p><b>Valid Sidecar Caption Formats:</b>
     *         Elastic Transcoder supports dfxp (first div element only), scc, srt,
     *         and webvtt. There are no container restrictions on sidecar captions.
     *         If you want ttml or smpte-tt compatible captions, specify dfxp as your
     *         output format. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionFormat withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The prefix for caption filenames, in the form
     * <i>description</i>-<code>{language}</code>, where: <ul>
     * <li><i>description</i> is a description of the video.</li>
     * <li><code>{language}</code> is a literal value that Elastic Transcoder
     * replaces with the two- or three-letter code for the language of the
     * caption in the output file names.</li> </ul> <p>If you don't include
     * <code>{language}</code> in the file name pattern, Elastic Transcoder
     * automatically appends "<code>{language}</code>" to the value that you
     * specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * <p>For example, suppose you're transcoding into srt format. When you
     * enter "Sydney-{language}-sunrise", and the language of the captions is
     * English (en), the name of the first caption file will be
     * Sydney-en-sunrise00000.srt.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{language\}.*$)<br/>
     *
     * @return The prefix for caption filenames, in the form
     *         <i>description</i>-<code>{language}</code>, where: <ul>
     *         <li><i>description</i> is a description of the video.</li>
     *         <li><code>{language}</code> is a literal value that Elastic Transcoder
     *         replaces with the two- or three-letter code for the language of the
     *         caption in the output file names.</li> </ul> <p>If you don't include
     *         <code>{language}</code> in the file name pattern, Elastic Transcoder
     *         automatically appends "<code>{language}</code>" to the value that you
     *         specify for the description. In addition, Elastic Transcoder
     *         automatically appends the count to the end of the segment files.
     *         <p>For example, suppose you're transcoding into srt format. When you
     *         enter "Sydney-{language}-sunrise", and the language of the captions is
     *         English (en), the name of the first caption file will be
     *         Sydney-en-sunrise00000.srt.
     */
    public String getPattern() {
        return pattern;
    }
    
    /**
     * The prefix for caption filenames, in the form
     * <i>description</i>-<code>{language}</code>, where: <ul>
     * <li><i>description</i> is a description of the video.</li>
     * <li><code>{language}</code> is a literal value that Elastic Transcoder
     * replaces with the two- or three-letter code for the language of the
     * caption in the output file names.</li> </ul> <p>If you don't include
     * <code>{language}</code> in the file name pattern, Elastic Transcoder
     * automatically appends "<code>{language}</code>" to the value that you
     * specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * <p>For example, suppose you're transcoding into srt format. When you
     * enter "Sydney-{language}-sunrise", and the language of the captions is
     * English (en), the name of the first caption file will be
     * Sydney-en-sunrise00000.srt.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{language\}.*$)<br/>
     *
     * @param pattern The prefix for caption filenames, in the form
     *         <i>description</i>-<code>{language}</code>, where: <ul>
     *         <li><i>description</i> is a description of the video.</li>
     *         <li><code>{language}</code> is a literal value that Elastic Transcoder
     *         replaces with the two- or three-letter code for the language of the
     *         caption in the output file names.</li> </ul> <p>If you don't include
     *         <code>{language}</code> in the file name pattern, Elastic Transcoder
     *         automatically appends "<code>{language}</code>" to the value that you
     *         specify for the description. In addition, Elastic Transcoder
     *         automatically appends the count to the end of the segment files.
     *         <p>For example, suppose you're transcoding into srt format. When you
     *         enter "Sydney-{language}-sunrise", and the language of the captions is
     *         English (en), the name of the first caption file will be
     *         Sydney-en-sunrise00000.srt.
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
    /**
     * The prefix for caption filenames, in the form
     * <i>description</i>-<code>{language}</code>, where: <ul>
     * <li><i>description</i> is a description of the video.</li>
     * <li><code>{language}</code> is a literal value that Elastic Transcoder
     * replaces with the two- or three-letter code for the language of the
     * caption in the output file names.</li> </ul> <p>If you don't include
     * <code>{language}</code> in the file name pattern, Elastic Transcoder
     * automatically appends "<code>{language}</code>" to the value that you
     * specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * <p>For example, suppose you're transcoding into srt format. When you
     * enter "Sydney-{language}-sunrise", and the language of the captions is
     * English (en), the name of the first caption file will be
     * Sydney-en-sunrise00000.srt.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^$)|(^.*\{language\}.*$)<br/>
     *
     * @param pattern The prefix for caption filenames, in the form
     *         <i>description</i>-<code>{language}</code>, where: <ul>
     *         <li><i>description</i> is a description of the video.</li>
     *         <li><code>{language}</code> is a literal value that Elastic Transcoder
     *         replaces with the two- or three-letter code for the language of the
     *         caption in the output file names.</li> </ul> <p>If you don't include
     *         <code>{language}</code> in the file name pattern, Elastic Transcoder
     *         automatically appends "<code>{language}</code>" to the value that you
     *         specify for the description. In addition, Elastic Transcoder
     *         automatically appends the count to the end of the segment files.
     *         <p>For example, suppose you're transcoding into srt format. When you
     *         enter "Sydney-{language}-sunrise", and the language of the captions is
     *         English (en), the name of the first caption file will be
     *         Sydney-en-sunrise00000.srt.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionFormat withPattern(String pattern) {
        this.pattern = pattern;
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
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getPattern() != null) sb.append("Pattern: " + getPattern() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CaptionFormat == false) return false;
        CaptionFormat other = (CaptionFormat)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getPattern() == null ^ this.getPattern() == null) return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false) return false; 
        return true;
    }
    
}
    