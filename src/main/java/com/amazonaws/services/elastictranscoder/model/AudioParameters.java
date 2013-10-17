/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Parameters required for transcoding audio.
 * </p>
 */
public class AudioParameters implements Serializable {

    /**
     * the audio codec for the output file. Valid values include
     * <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^AAC$)|(^vorbis$)|(^mp3$)<br/>
     */
    private String codec;

    /**
     * The sample rate of the audio stream in the output file, in Hertz.
     * Valid values include: <p><code>auto</code>, <code>22050</code>,
     * <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder automatically detects the sample rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)<br/>
     */
    private String sampleRate;

    /**
     * The bit rate of the audio stream in the output file, in
     * kilobits/second. Enter an integer between 64 and 320, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}$<br/>
     */
    private String bitRate;

    /**
     * The number of audio channels in the output file. Valid values include:
     * <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     * detects the number of channels in the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^1$)|(^2$)<br/>
     */
    private String channels;

    /**
     * the audio codec for the output file. Valid values include
     * <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^AAC$)|(^vorbis$)|(^mp3$)<br/>
     *
     * @return the audio codec for the output file. Valid values include
     *         <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     */
    public String getCodec() {
        return codec;
    }
    
    /**
     * the audio codec for the output file. Valid values include
     * <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^AAC$)|(^vorbis$)|(^mp3$)<br/>
     *
     * @param codec the audio codec for the output file. Valid values include
     *         <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }
    
    /**
     * the audio codec for the output file. Valid values include
     * <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^AAC$)|(^vorbis$)|(^mp3$)<br/>
     *
     * @param codec the audio codec for the output file. Valid values include
     *         <code>aac</code>, <code>mp3</code>, and <code>vorbis</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AudioParameters withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * The sample rate of the audio stream in the output file, in Hertz.
     * Valid values include: <p><code>auto</code>, <code>22050</code>,
     * <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder automatically detects the sample rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)<br/>
     *
     * @return The sample rate of the audio stream in the output file, in Hertz.
     *         Valid values include: <p><code>auto</code>, <code>22050</code>,
     *         <code>32000</code>, <code>44100</code>, <code>48000</code>,
     *         <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     *         Transcoder automatically detects the sample rate.
     */
    public String getSampleRate() {
        return sampleRate;
    }
    
    /**
     * The sample rate of the audio stream in the output file, in Hertz.
     * Valid values include: <p><code>auto</code>, <code>22050</code>,
     * <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder automatically detects the sample rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)<br/>
     *
     * @param sampleRate The sample rate of the audio stream in the output file, in Hertz.
     *         Valid values include: <p><code>auto</code>, <code>22050</code>,
     *         <code>32000</code>, <code>44100</code>, <code>48000</code>,
     *         <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     *         Transcoder automatically detects the sample rate.
     */
    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }
    
    /**
     * The sample rate of the audio stream in the output file, in Hertz.
     * Valid values include: <p><code>auto</code>, <code>22050</code>,
     * <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     * Transcoder automatically detects the sample rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^22050$)|(^32000$)|(^44100$)|(^48000$)|(^96000$)<br/>
     *
     * @param sampleRate The sample rate of the audio stream in the output file, in Hertz.
     *         Valid values include: <p><code>auto</code>, <code>22050</code>,
     *         <code>32000</code>, <code>44100</code>, <code>48000</code>,
     *         <code>96000</code> <p>If you specify <code>auto</code>, Elastic
     *         Transcoder automatically detects the sample rate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AudioParameters withSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * The bit rate of the audio stream in the output file, in
     * kilobits/second. Enter an integer between 64 and 320, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}$<br/>
     *
     * @return The bit rate of the audio stream in the output file, in
     *         kilobits/second. Enter an integer between 64 and 320, inclusive.
     */
    public String getBitRate() {
        return bitRate;
    }
    
    /**
     * The bit rate of the audio stream in the output file, in
     * kilobits/second. Enter an integer between 64 and 320, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}$<br/>
     *
     * @param bitRate The bit rate of the audio stream in the output file, in
     *         kilobits/second. Enter an integer between 64 and 320, inclusive.
     */
    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }
    
    /**
     * The bit rate of the audio stream in the output file, in
     * kilobits/second. Enter an integer between 64 and 320, inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,3}$<br/>
     *
     * @param bitRate The bit rate of the audio stream in the output file, in
     *         kilobits/second. Enter an integer between 64 and 320, inclusive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AudioParameters withBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }

    /**
     * The number of audio channels in the output file. Valid values include:
     * <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     * detects the number of channels in the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^1$)|(^2$)<br/>
     *
     * @return The number of audio channels in the output file. Valid values include:
     *         <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     *         <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     *         detects the number of channels in the input file.
     */
    public String getChannels() {
        return channels;
    }
    
    /**
     * The number of audio channels in the output file. Valid values include:
     * <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     * detects the number of channels in the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^1$)|(^2$)<br/>
     *
     * @param channels The number of audio channels in the output file. Valid values include:
     *         <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     *         <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     *         detects the number of channels in the input file.
     */
    public void setChannels(String channels) {
        this.channels = channels;
    }
    
    /**
     * The number of audio channels in the output file. Valid values include:
     * <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     * detects the number of channels in the input file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^0$)|(^1$)|(^2$)<br/>
     *
     * @param channels The number of audio channels in the output file. Valid values include:
     *         <p><code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     *         <p>If you specify <code>auto</code>, Elastic Transcoder automatically
     *         detects the number of channels in the input file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AudioParameters withChannels(String channels) {
        this.channels = channels;
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
        if (getCodec() != null) sb.append("Codec: " + getCodec() + ",");
        if (getSampleRate() != null) sb.append("SampleRate: " + getSampleRate() + ",");
        if (getBitRate() != null) sb.append("BitRate: " + getBitRate() + ",");
        if (getChannels() != null) sb.append("Channels: " + getChannels() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode()); 
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode()); 
        hashCode = prime * hashCode + ((getBitRate() == null) ? 0 : getBitRate().hashCode()); 
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AudioParameters == false) return false;
        AudioParameters other = (AudioParameters)obj;
        
        if (other.getCodec() == null ^ this.getCodec() == null) return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false) return false; 
        if (other.getSampleRate() == null ^ this.getSampleRate() == null) return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false) return false; 
        if (other.getBitRate() == null ^ this.getBitRate() == null) return false;
        if (other.getBitRate() != null && other.getBitRate().equals(this.getBitRate()) == false) return false; 
        if (other.getChannels() == null ^ this.getChannels() == null) return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false) return false; 
        return true;
    }
    
}
    