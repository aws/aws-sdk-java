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
 * A source file for the input sidecar captions used during the transcoding process.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     * </p>
     */
    private String key;
    /**
     * <p>
     * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption
     * language must match in order to be included in the output. Specify this as one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2-character ISO 639-1 code
     * </p>
     * </li>
     * <li>
     * <p>
     * 3-character ISO 639-2 code
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     * </p>
     */
    private String language;
    /**
     * <p>
     * For clip generation or captions that do not start at the same time as the associated video file, the
     * <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including captions.
     * </p>
     * <p>
     * Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * </p>
     */
    private String timeOffset;
    /**
     * <p>
     * The label of the caption shown in the player when choosing a language. We recommend that you put the caption
     * language name here, in the language of the captions.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want
     * Elastic Transcoder to apply to your caption sources.
     * </p>
     */
    private Encryption encryption;

    /**
     * <p>
     * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     * </p>
     * 
     * @param key
     *        The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     * </p>
     * 
     * @return The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     * </p>
     * 
     * @param key
     *        The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSource withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption
     * language must match in order to be included in the output. Specify this as one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2-character ISO 639-1 code
     * </p>
     * </li>
     * <li>
     * <p>
     * 3-character ISO 639-2 code
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     * </p>
     * 
     * @param language
     *        A string that specifies the language of the caption. If you specified multiple inputs with captions, the
     *        caption language must match in order to be included in the output. Specify this as one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        2-character ISO 639-1 code
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3-character ISO 639-2 code
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption
     * language must match in order to be included in the output. Specify this as one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2-character ISO 639-1 code
     * </p>
     * </li>
     * <li>
     * <p>
     * 3-character ISO 639-2 code
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     * </p>
     * 
     * @return A string that specifies the language of the caption. If you specified multiple inputs with captions, the
     *         caption language must match in order to be included in the output. Specify this as one of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         2-character ISO 639-1 code
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         3-character ISO 639-2 code
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption
     * language must match in order to be included in the output. Specify this as one of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 2-character ISO 639-1 code
     * </p>
     * </li>
     * <li>
     * <p>
     * 3-character ISO 639-2 code
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     * </p>
     * 
     * @param language
     *        A string that specifies the language of the caption. If you specified multiple inputs with captions, the
     *        caption language must match in order to be included in the output. Specify this as one of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        2-character ISO 639-1 code
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        3-character ISO 639-2 code
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSource withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * For clip generation or captions that do not start at the same time as the associated video file, the
     * <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including captions.
     * </p>
     * <p>
     * Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * </p>
     * 
     * @param timeOffset
     *        For clip generation or captions that do not start at the same time as the associated video file, the
     *        <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including
     *        captions.</p>
     *        <p>
     *        Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     */

    public void setTimeOffset(String timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * <p>
     * For clip generation or captions that do not start at the same time as the associated video file, the
     * <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including captions.
     * </p>
     * <p>
     * Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * </p>
     * 
     * @return For clip generation or captions that do not start at the same time as the associated video file, the
     *         <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including
     *         captions.</p>
     *         <p>
     *         Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     */

    public String getTimeOffset() {
        return this.timeOffset;
    }

    /**
     * <p>
     * For clip generation or captions that do not start at the same time as the associated video file, the
     * <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including captions.
     * </p>
     * <p>
     * Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * </p>
     * 
     * @param timeOffset
     *        For clip generation or captions that do not start at the same time as the associated video file, the
     *        <code>TimeOffset</code> tells Elastic Transcoder how much of the video to encode before including
     *        captions.</p>
     *        <p>
     *        Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSource withTimeOffset(String timeOffset) {
        setTimeOffset(timeOffset);
        return this;
    }

    /**
     * <p>
     * The label of the caption shown in the player when choosing a language. We recommend that you put the caption
     * language name here, in the language of the captions.
     * </p>
     * 
     * @param label
     *        The label of the caption shown in the player when choosing a language. We recommend that you put the
     *        caption language name here, in the language of the captions.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label of the caption shown in the player when choosing a language. We recommend that you put the caption
     * language name here, in the language of the captions.
     * </p>
     * 
     * @return The label of the caption shown in the player when choosing a language. We recommend that you put the
     *         caption language name here, in the language of the captions.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label of the caption shown in the player when choosing a language. We recommend that you put the caption
     * language name here, in the language of the captions.
     * </p>
     * 
     * @param label
     *        The label of the caption shown in the player when choosing a language. We recommend that you put the
     *        caption language name here, in the language of the captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSource withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want
     * Elastic Transcoder to apply to your caption sources.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that
     *        you want Elastic Transcoder to apply to your caption sources.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want
     * Elastic Transcoder to apply to your caption sources.
     * </p>
     * 
     * @return The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that
     *         you want Elastic Transcoder to apply to your caption sources.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want
     * Elastic Transcoder to apply to your caption sources.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that
     *        you want Elastic Transcoder to apply to your caption sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSource withEncryption(Encryption encryption) {
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getTimeOffset() != null)
            sb.append("TimeOffset: ").append(getTimeOffset()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
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

        if (obj instanceof CaptionSource == false)
            return false;
        CaptionSource other = (CaptionSource) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getTimeOffset() == null ^ this.getTimeOffset() == null)
            return false;
        if (other.getTimeOffset() != null && other.getTimeOffset().equals(this.getTimeOffset()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getTimeOffset() == null) ? 0 : getTimeOffset().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public CaptionSource clone() {
        try {
            return (CaptionSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.CaptionSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
