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
 * The file format of the output captions. If you leave this value blank, Elastic Transcoder returns an error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for this
     * output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Valid Embedded Caption Formats:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>for FLAC</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP3</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP4</b>: mov-text
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MPEG-TS</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For ogg</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For webm</b>: None
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc, srt, and
     * webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For FMP4</b>: dfxp
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Non-FMP4 outputs</b>: All sidecar types
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fmp4</code> captions have an extension of <code>.ismt</code>
     * </p>
     * </li>
     * </ul>
     */
    private String format;
    /**
     * <p>
     * The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>description</i> is a description of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter code
     * for the language of the caption in the output file names.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically appends "
     * <code>{language}</code>" to the value that you specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * </p>
     * <p>
     * For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and the
     * language of the captions is English (en), the name of the first caption file is be Sydney-en-sunrise00000.srt.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     * </p>
     */
    private Encryption encryption;

    /**
     * <p>
     * The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for this
     * output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Valid Embedded Caption Formats:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>for FLAC</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP3</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP4</b>: mov-text
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MPEG-TS</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For ogg</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For webm</b>: None
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc, srt, and
     * webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For FMP4</b>: dfxp
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Non-FMP4 outputs</b>: All sidecar types
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fmp4</code> captions have an extension of <code>.ismt</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for
     *        this output.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Valid Embedded Caption Formats:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>for FLAC</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For MP3</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For MP4</b>: mov-text
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For MPEG-TS</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For ogg</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For webm</b>: None
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc, srt,
     *        and webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>For FMP4</b>: dfxp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Non-FMP4 outputs</b>: All sidecar types
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>fmp4</code> captions have an extension of <code>.ismt</code>
     *        </p>
     *        </li>
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for this
     * output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Valid Embedded Caption Formats:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>for FLAC</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP3</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP4</b>: mov-text
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MPEG-TS</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For ogg</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For webm</b>: None
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc, srt, and
     * webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For FMP4</b>: dfxp
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Non-FMP4 outputs</b>: All sidecar types
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fmp4</code> captions have an extension of <code>.ismt</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for
     *         this output.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Valid Embedded Caption Formats:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>for FLAC</b>: None
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>For MP3</b>: None
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>For MP4</b>: mov-text
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>For MPEG-TS</b>: None
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>For ogg</b>: None
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>For webm</b>: None
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc,
     *         srt, and webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>For FMP4</b>: dfxp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Non-FMP4 outputs</b>: All sidecar types
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>fmp4</code> captions have an extension of <code>.ismt</code>
     *         </p>
     *         </li>
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for this
     * output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Valid Embedded Caption Formats:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>for FLAC</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP3</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MP4</b>: mov-text
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For MPEG-TS</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For ogg</b>: None
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>For webm</b>: None
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc, srt, and
     * webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>For FMP4</b>: dfxp
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Non-FMP4 outputs</b>: All sidecar types
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fmp4</code> captions have an extension of <code>.ismt</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for
     *        this output.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Valid Embedded Caption Formats:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>for FLAC</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For MP3</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For MP4</b>: mov-text
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For MPEG-TS</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For ogg</b>: None
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>For webm</b>: None
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Valid Sidecar Caption Formats:</b> Elastic Transcoder supports dfxp (first div element only), scc, srt,
     *        and webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>For FMP4</b>: dfxp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Non-FMP4 outputs</b>: All sidecar types
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>fmp4</code> captions have an extension of <code>.ismt</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionFormat withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>description</i> is a description of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter code
     * for the language of the caption in the output file names.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically appends "
     * <code>{language}</code>" to the value that you specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * </p>
     * <p>
     * For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and the
     * language of the captions is English (en), the name of the first caption file is be Sydney-en-sunrise00000.srt.
     * </p>
     * 
     * @param pattern
     *        The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>description</i> is a description of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter
     *        code for the language of the caption in the output file names.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically
     *        appends "<code>{language}</code>" to the value that you specify for the description. In addition, Elastic
     *        Transcoder automatically appends the count to the end of the segment files.
     *        </p>
     *        <p>
     *        For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and
     *        the language of the captions is English (en), the name of the first caption file is be
     *        Sydney-en-sunrise00000.srt.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>description</i> is a description of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter code
     * for the language of the caption in the output file names.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically appends "
     * <code>{language}</code>" to the value that you specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * </p>
     * <p>
     * For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and the
     * language of the captions is English (en), the name of the first caption file is be Sydney-en-sunrise00000.srt.
     * </p>
     * 
     * @return The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>description</i> is a description of the video.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter
     *         code for the language of the caption in the output file names.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically
     *         appends "<code>{language}</code>" to the value that you specify for the description. In addition, Elastic
     *         Transcoder automatically appends the count to the end of the segment files.
     *         </p>
     *         <p>
     *         For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and
     *         the language of the captions is English (en), the name of the first caption file is be
     *         Sydney-en-sunrise00000.srt.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>description</i> is a description of the video.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter code
     * for the language of the caption in the output file names.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically appends "
     * <code>{language}</code>" to the value that you specify for the description. In addition, Elastic Transcoder
     * automatically appends the count to the end of the segment files.
     * </p>
     * <p>
     * For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and the
     * language of the captions is English (en), the name of the first caption file is be Sydney-en-sunrise00000.srt.
     * </p>
     * 
     * @param pattern
     *        The prefix for caption filenames, in the form <i>description</i>-<code>{language}</code>, where:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>description</i> is a description of the video.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>{language}</code> is a literal value that Elastic Transcoder replaces with the two- or three-letter
     *        code for the language of the caption in the output file names.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't include <code>{language}</code> in the file name pattern, Elastic Transcoder automatically
     *        appends "<code>{language}</code>" to the value that you specify for the description. In addition, Elastic
     *        Transcoder automatically appends the count to the end of the segment files.
     *        </p>
     *        <p>
     *        For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and
     *        the language of the captions is English (en), the name of the first caption file is be
     *        Sydney-en-sunrise00000.srt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionFormat withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     * </p>
     * 
     * @return The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionFormat withEncryption(Encryption encryption) {
        setEncryption(encryption);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionFormat == false)
            return false;
        CaptionFormat other = (CaptionFormat) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public CaptionFormat clone() {
        try {
            return (CaptionFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.CaptionFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
