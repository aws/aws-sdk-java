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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesizeSpeech" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SynthesizeSpeechResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     */
    private java.io.InputStream audioStream;
    /**
     * <p>
     * Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     */
    private Integer requestCharacters;

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     * 
     * @param audioStream
     *        Stream containing the synthesized speech.
     */

    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     * 
     * @return Stream containing the synthesized speech.
     */

    public java.io.InputStream getAudioStream() {
        return this.audioStream;
    }

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     * 
     * @param audioStream
     *        Stream containing the synthesized speech.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechResult withAudioStream(java.io.InputStream audioStream) {
        setAudioStream(audioStream);
        return this;
    }

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param contentType
     *        Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your
     *        request. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     *        audio/mpeg.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code>
     *        returned is audio/ogg.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     *        audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned
     *        is audio/json.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @return Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your
     *         request. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned
     *         is audio/mpeg.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code>
     *         returned is audio/ogg.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned
     *         is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned
     *         is audio/json.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     * audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param contentType
     *        Specifies the type audio stream. This should reflect the <code>OutputFormat</code> parameter in your
     *        request. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you request <code>mp3</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     *        audio/mpeg.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>, the <code>ContentType</code>
     *        returned is audio/ogg.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you request <code>pcm</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned is
     *        audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you request <code>json</code> as the <code>OutputFormat</code>, the <code>ContentType</code> returned
     *        is audio/json.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     * 
     * @param requestCharacters
     *        Number of characters synthesized.
     */

    public void setRequestCharacters(Integer requestCharacters) {
        this.requestCharacters = requestCharacters;
    }

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     * 
     * @return Number of characters synthesized.
     */

    public Integer getRequestCharacters() {
        return this.requestCharacters;
    }

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     * 
     * @param requestCharacters
     *        Number of characters synthesized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SynthesizeSpeechResult withRequestCharacters(Integer requestCharacters) {
        setRequestCharacters(requestCharacters);
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
        if (getAudioStream() != null)
            sb.append("AudioStream: ").append(getAudioStream()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getRequestCharacters() != null)
            sb.append("RequestCharacters: ").append(getRequestCharacters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SynthesizeSpeechResult == false)
            return false;
        SynthesizeSpeechResult other = (SynthesizeSpeechResult) obj;
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getRequestCharacters() == null ^ this.getRequestCharacters() == null)
            return false;
        if (other.getRequestCharacters() != null && other.getRequestCharacters().equals(this.getRequestCharacters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getRequestCharacters() == null) ? 0 : getRequestCharacters().hashCode());
        return hashCode;
    }

    @Override
    public SynthesizeSpeechResult clone() {
        try {
            return (SynthesizeSpeechResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
