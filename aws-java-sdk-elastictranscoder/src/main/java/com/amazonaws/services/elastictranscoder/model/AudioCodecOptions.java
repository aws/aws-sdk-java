/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Options associated with your audio codec.
 * </p>
 */
public class AudioCodecOptions implements Serializable, Cloneable {

    /**
     * You can only choose an audio profile when you specify AAC for the
     * value of Audio:Codec. <p>Specify the AAC profile for the output file.
     * Elastic Transcoder supports the following profiles: <ul>
     * <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     * Transcoder will select the profile based on the bit rate selected for
     * the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     * profile. Use for bit rates larger than 64 kbps.</li>
     * <li><code>HE-AAC</code>: Not supported on some older players and
     * devices. Use for bit rates between 40 and 80 kbps.</li>
     * <li><code>HE-AACv2</code>: Not supported on some players and devices.
     * Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     * <code>Smooth</code> playlist must have the same value for
     * <code>Profile</code>. <note><p>If you created any presets before AAC
     * profiles were added, Elastic Transcoder automatically updated your
     * presets to use AAC-LC. You can change the value as required.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     */
    private String profile;

    /**
     * You can only choose an audio bit depth when you specify
     * <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     * <p>The bit depth of a sample is how many bits of information are
     * included in the audio samples. The higher the bit depth, the better
     * the audio, but the larger the file. <p>Valid values are
     * <code>16</code> and <code>24</code>. <p>The most common bit depth is
     * <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^16$)|(^24$)<br/>
     */
    private String bitDepth;

    /**
     * You can only choose an audio bit order when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     * of a PCM sample are stored in. <p>The supported value is
     * <code>LittleEndian</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^LittleEndian$)<br/>
     */
    private String bitOrder;

    /**
     * You can only choose whether an audio sample is signed when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     * samples are represented with negative and positive numbers (signed) or
     * only positive numbers (unsigned). <p>The supported value is
     * <code>Signed</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Signed$)<br/>
     */
    private String signed;

    /**
     * You can only choose an audio profile when you specify AAC for the
     * value of Audio:Codec. <p>Specify the AAC profile for the output file.
     * Elastic Transcoder supports the following profiles: <ul>
     * <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     * Transcoder will select the profile based on the bit rate selected for
     * the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     * profile. Use for bit rates larger than 64 kbps.</li>
     * <li><code>HE-AAC</code>: Not supported on some older players and
     * devices. Use for bit rates between 40 and 80 kbps.</li>
     * <li><code>HE-AACv2</code>: Not supported on some players and devices.
     * Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     * <code>Smooth</code> playlist must have the same value for
     * <code>Profile</code>. <note><p>If you created any presets before AAC
     * profiles were added, Elastic Transcoder automatically updated your
     * presets to use AAC-LC. You can change the value as required.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     *
     * @return You can only choose an audio profile when you specify AAC for the
     *         value of Audio:Codec. <p>Specify the AAC profile for the output file.
     *         Elastic Transcoder supports the following profiles: <ul>
     *         <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     *         Transcoder will select the profile based on the bit rate selected for
     *         the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     *         profile. Use for bit rates larger than 64 kbps.</li>
     *         <li><code>HE-AAC</code>: Not supported on some older players and
     *         devices. Use for bit rates between 40 and 80 kbps.</li>
     *         <li><code>HE-AACv2</code>: Not supported on some players and devices.
     *         Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     *         <code>Smooth</code> playlist must have the same value for
     *         <code>Profile</code>. <note><p>If you created any presets before AAC
     *         profiles were added, Elastic Transcoder automatically updated your
     *         presets to use AAC-LC. You can change the value as required.</note>
     */
    public String getProfile() {
        return profile;
    }
    
    /**
     * You can only choose an audio profile when you specify AAC for the
     * value of Audio:Codec. <p>Specify the AAC profile for the output file.
     * Elastic Transcoder supports the following profiles: <ul>
     * <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     * Transcoder will select the profile based on the bit rate selected for
     * the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     * profile. Use for bit rates larger than 64 kbps.</li>
     * <li><code>HE-AAC</code>: Not supported on some older players and
     * devices. Use for bit rates between 40 and 80 kbps.</li>
     * <li><code>HE-AACv2</code>: Not supported on some players and devices.
     * Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     * <code>Smooth</code> playlist must have the same value for
     * <code>Profile</code>. <note><p>If you created any presets before AAC
     * profiles were added, Elastic Transcoder automatically updated your
     * presets to use AAC-LC. You can change the value as required.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     *
     * @param profile You can only choose an audio profile when you specify AAC for the
     *         value of Audio:Codec. <p>Specify the AAC profile for the output file.
     *         Elastic Transcoder supports the following profiles: <ul>
     *         <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     *         Transcoder will select the profile based on the bit rate selected for
     *         the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     *         profile. Use for bit rates larger than 64 kbps.</li>
     *         <li><code>HE-AAC</code>: Not supported on some older players and
     *         devices. Use for bit rates between 40 and 80 kbps.</li>
     *         <li><code>HE-AACv2</code>: Not supported on some players and devices.
     *         Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     *         <code>Smooth</code> playlist must have the same value for
     *         <code>Profile</code>. <note><p>If you created any presets before AAC
     *         profiles were added, Elastic Transcoder automatically updated your
     *         presets to use AAC-LC. You can change the value as required.</note>
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    /**
     * You can only choose an audio profile when you specify AAC for the
     * value of Audio:Codec. <p>Specify the AAC profile for the output file.
     * Elastic Transcoder supports the following profiles: <ul>
     * <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     * Transcoder will select the profile based on the bit rate selected for
     * the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     * profile. Use for bit rates larger than 64 kbps.</li>
     * <li><code>HE-AAC</code>: Not supported on some older players and
     * devices. Use for bit rates between 40 and 80 kbps.</li>
     * <li><code>HE-AACv2</code>: Not supported on some players and devices.
     * Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     * <code>Smooth</code> playlist must have the same value for
     * <code>Profile</code>. <note><p>If you created any presets before AAC
     * profiles were added, Elastic Transcoder automatically updated your
     * presets to use AAC-LC. You can change the value as required.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     *
     * @param profile You can only choose an audio profile when you specify AAC for the
     *         value of Audio:Codec. <p>Specify the AAC profile for the output file.
     *         Elastic Transcoder supports the following profiles: <ul>
     *         <li><code>auto</code>: If you specify <code>auto</code>, Elastic
     *         Transcoder will select the profile based on the bit rate selected for
     *         the output file.</li> <li><code>AAC-LC</code>: The most common AAC
     *         profile. Use for bit rates larger than 64 kbps.</li>
     *         <li><code>HE-AAC</code>: Not supported on some older players and
     *         devices. Use for bit rates between 40 and 80 kbps.</li>
     *         <li><code>HE-AACv2</code>: Not supported on some players and devices.
     *         Use for bit rates less than 48 kbps.</li> </ul> <p>All outputs in a
     *         <code>Smooth</code> playlist must have the same value for
     *         <code>Profile</code>. <note><p>If you created any presets before AAC
     *         profiles were added, Elastic Transcoder automatically updated your
     *         presets to use AAC-LC. You can change the value as required.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AudioCodecOptions withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * You can only choose an audio bit depth when you specify
     * <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     * <p>The bit depth of a sample is how many bits of information are
     * included in the audio samples. The higher the bit depth, the better
     * the audio, but the larger the file. <p>Valid values are
     * <code>16</code> and <code>24</code>. <p>The most common bit depth is
     * <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^16$)|(^24$)<br/>
     *
     * @return You can only choose an audio bit depth when you specify
     *         <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     *         <p>The bit depth of a sample is how many bits of information are
     *         included in the audio samples. The higher the bit depth, the better
     *         the audio, but the larger the file. <p>Valid values are
     *         <code>16</code> and <code>24</code>. <p>The most common bit depth is
     *         <code>24</code>.
     */
    public String getBitDepth() {
        return bitDepth;
    }
    
    /**
     * You can only choose an audio bit depth when you specify
     * <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     * <p>The bit depth of a sample is how many bits of information are
     * included in the audio samples. The higher the bit depth, the better
     * the audio, but the larger the file. <p>Valid values are
     * <code>16</code> and <code>24</code>. <p>The most common bit depth is
     * <code>24</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^16$)|(^24$)<br/>
     *
     * @param bitDepth You can only choose an audio bit depth when you specify
     *         <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     *         <p>The bit depth of a sample is how many bits of information are
     *         included in the audio samples. The higher the bit depth, the better
     *         the audio, but the larger the file. <p>Valid values are
     *         <code>16</code> and <code>24</code>. <p>The most common bit depth is
     *         <code>24</code>.
     */
    public void setBitDepth(String bitDepth) {
        this.bitDepth = bitDepth;
    }
    
    /**
     * You can only choose an audio bit depth when you specify
     * <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     * <p>The bit depth of a sample is how many bits of information are
     * included in the audio samples. The higher the bit depth, the better
     * the audio, but the larger the file. <p>Valid values are
     * <code>16</code> and <code>24</code>. <p>The most common bit depth is
     * <code>24</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^16$)|(^24$)<br/>
     *
     * @param bitDepth You can only choose an audio bit depth when you specify
     *         <code>flac</code> or <code>pcm</code> for the value of Audio:Codec.
     *         <p>The bit depth of a sample is how many bits of information are
     *         included in the audio samples. The higher the bit depth, the better
     *         the audio, but the larger the file. <p>Valid values are
     *         <code>16</code> and <code>24</code>. <p>The most common bit depth is
     *         <code>24</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AudioCodecOptions withBitDepth(String bitDepth) {
        this.bitDepth = bitDepth;
        return this;
    }

    /**
     * You can only choose an audio bit order when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     * of a PCM sample are stored in. <p>The supported value is
     * <code>LittleEndian</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^LittleEndian$)<br/>
     *
     * @return You can only choose an audio bit order when you specify
     *         <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     *         of a PCM sample are stored in. <p>The supported value is
     *         <code>LittleEndian</code>.
     */
    public String getBitOrder() {
        return bitOrder;
    }
    
    /**
     * You can only choose an audio bit order when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     * of a PCM sample are stored in. <p>The supported value is
     * <code>LittleEndian</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^LittleEndian$)<br/>
     *
     * @param bitOrder You can only choose an audio bit order when you specify
     *         <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     *         of a PCM sample are stored in. <p>The supported value is
     *         <code>LittleEndian</code>.
     */
    public void setBitOrder(String bitOrder) {
        this.bitOrder = bitOrder;
    }
    
    /**
     * You can only choose an audio bit order when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     * of a PCM sample are stored in. <p>The supported value is
     * <code>LittleEndian</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^LittleEndian$)<br/>
     *
     * @param bitOrder You can only choose an audio bit order when you specify
     *         <code>pcm</code> for the value of Audio:Codec. <p>The order the bits
     *         of a PCM sample are stored in. <p>The supported value is
     *         <code>LittleEndian</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AudioCodecOptions withBitOrder(String bitOrder) {
        this.bitOrder = bitOrder;
        return this;
    }

    /**
     * You can only choose whether an audio sample is signed when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     * samples are represented with negative and positive numbers (signed) or
     * only positive numbers (unsigned). <p>The supported value is
     * <code>Signed</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Signed$)<br/>
     *
     * @return You can only choose whether an audio sample is signed when you specify
     *         <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     *         samples are represented with negative and positive numbers (signed) or
     *         only positive numbers (unsigned). <p>The supported value is
     *         <code>Signed</code>.
     */
    public String getSigned() {
        return signed;
    }
    
    /**
     * You can only choose whether an audio sample is signed when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     * samples are represented with negative and positive numbers (signed) or
     * only positive numbers (unsigned). <p>The supported value is
     * <code>Signed</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Signed$)<br/>
     *
     * @param signed You can only choose whether an audio sample is signed when you specify
     *         <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     *         samples are represented with negative and positive numbers (signed) or
     *         only positive numbers (unsigned). <p>The supported value is
     *         <code>Signed</code>.
     */
    public void setSigned(String signed) {
        this.signed = signed;
    }
    
    /**
     * You can only choose whether an audio sample is signed when you specify
     * <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     * samples are represented with negative and positive numbers (signed) or
     * only positive numbers (unsigned). <p>The supported value is
     * <code>Signed</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Signed$)<br/>
     *
     * @param signed You can only choose whether an audio sample is signed when you specify
     *         <code>pcm</code> for the value of Audio:Codec. <p>Whether audio
     *         samples are represented with negative and positive numbers (signed) or
     *         only positive numbers (unsigned). <p>The supported value is
     *         <code>Signed</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AudioCodecOptions withSigned(String signed) {
        this.signed = signed;
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
        if (getProfile() != null) sb.append("Profile: " + getProfile() + ",");
        if (getBitDepth() != null) sb.append("BitDepth: " + getBitDepth() + ",");
        if (getBitOrder() != null) sb.append("BitOrder: " + getBitOrder() + ",");
        if (getSigned() != null) sb.append("Signed: " + getSigned() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode()); 
        hashCode = prime * hashCode + ((getBitDepth() == null) ? 0 : getBitDepth().hashCode()); 
        hashCode = prime * hashCode + ((getBitOrder() == null) ? 0 : getBitOrder().hashCode()); 
        hashCode = prime * hashCode + ((getSigned() == null) ? 0 : getSigned().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AudioCodecOptions == false) return false;
        AudioCodecOptions other = (AudioCodecOptions)obj;
        
        if (other.getProfile() == null ^ this.getProfile() == null) return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false) return false; 
        if (other.getBitDepth() == null ^ this.getBitDepth() == null) return false;
        if (other.getBitDepth() != null && other.getBitDepth().equals(this.getBitDepth()) == false) return false; 
        if (other.getBitOrder() == null ^ this.getBitOrder() == null) return false;
        if (other.getBitOrder() != null && other.getBitOrder().equals(this.getBitOrder()) == false) return false; 
        if (other.getSigned() == null ^ this.getSigned() == null) return false;
        if (other.getSigned() != null && other.getSigned().equals(this.getSigned()) == false) return false; 
        return true;
    }
    
    @Override
    public AudioCodecOptions clone() {
        try {
            return (AudioCodecOptions) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    