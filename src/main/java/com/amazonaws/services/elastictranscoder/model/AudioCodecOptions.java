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
 * Options associated with your audio codec.
 * </p>
 */
public class AudioCodecOptions implements Serializable {

    /**
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     * the AAC profile for the output file. Elastic Transcoder supports the
     * following profiles: <ul> <li><code>auto</code>: If you specify
     * <code>auto</code>, Elastic Transcoder will select the profile based on
     * the bit rate selected for the output file.</li>
     * <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     * larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     * some older players and devices. Use for bitrates between 40 and 80
     * kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     * and devices. Use for bitrates less than 48 kbps.</li> </ul>
     * <note><p>If you created any presets before AAC profiles were added,
     * Elastic Transcoder automatically updated your presets to use AAC-LC.
     * You can change the value as required.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     */
    private String profile;

    /**
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     * the AAC profile for the output file. Elastic Transcoder supports the
     * following profiles: <ul> <li><code>auto</code>: If you specify
     * <code>auto</code>, Elastic Transcoder will select the profile based on
     * the bit rate selected for the output file.</li>
     * <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     * larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     * some older players and devices. Use for bitrates between 40 and 80
     * kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     * and devices. Use for bitrates less than 48 kbps.</li> </ul>
     * <note><p>If you created any presets before AAC profiles were added,
     * Elastic Transcoder automatically updated your presets to use AAC-LC.
     * You can change the value as required.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     *
     * @return If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     *         the AAC profile for the output file. Elastic Transcoder supports the
     *         following profiles: <ul> <li><code>auto</code>: If you specify
     *         <code>auto</code>, Elastic Transcoder will select the profile based on
     *         the bit rate selected for the output file.</li>
     *         <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     *         larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     *         some older players and devices. Use for bitrates between 40 and 80
     *         kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     *         and devices. Use for bitrates less than 48 kbps.</li> </ul>
     *         <note><p>If you created any presets before AAC profiles were added,
     *         Elastic Transcoder automatically updated your presets to use AAC-LC.
     *         You can change the value as required.</note>
     */
    public String getProfile() {
        return profile;
    }
    
    /**
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     * the AAC profile for the output file. Elastic Transcoder supports the
     * following profiles: <ul> <li><code>auto</code>: If you specify
     * <code>auto</code>, Elastic Transcoder will select the profile based on
     * the bit rate selected for the output file.</li>
     * <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     * larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     * some older players and devices. Use for bitrates between 40 and 80
     * kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     * and devices. Use for bitrates less than 48 kbps.</li> </ul>
     * <note><p>If you created any presets before AAC profiles were added,
     * Elastic Transcoder automatically updated your presets to use AAC-LC.
     * You can change the value as required.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     *
     * @param profile If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     *         the AAC profile for the output file. Elastic Transcoder supports the
     *         following profiles: <ul> <li><code>auto</code>: If you specify
     *         <code>auto</code>, Elastic Transcoder will select the profile based on
     *         the bit rate selected for the output file.</li>
     *         <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     *         larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     *         some older players and devices. Use for bitrates between 40 and 80
     *         kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     *         and devices. Use for bitrates less than 48 kbps.</li> </ul>
     *         <note><p>If you created any presets before AAC profiles were added,
     *         Elastic Transcoder automatically updated your presets to use AAC-LC.
     *         You can change the value as required.</note>
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    /**
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     * the AAC profile for the output file. Elastic Transcoder supports the
     * following profiles: <ul> <li><code>auto</code>: If you specify
     * <code>auto</code>, Elastic Transcoder will select the profile based on
     * the bit rate selected for the output file.</li>
     * <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     * larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     * some older players and devices. Use for bitrates between 40 and 80
     * kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     * and devices. Use for bitrates less than 48 kbps.</li> </ul>
     * <note><p>If you created any presets before AAC profiles were added,
     * Elastic Transcoder automatically updated your presets to use AAC-LC.
     * You can change the value as required.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^AAC-LC$)|(^HE-AAC$)|(^HE-AACv2$)<br/>
     *
     * @param profile If you specified <code>AAC</code> for <code>Audio:Codec</code>, choose
     *         the AAC profile for the output file. Elastic Transcoder supports the
     *         following profiles: <ul> <li><code>auto</code>: If you specify
     *         <code>auto</code>, Elastic Transcoder will select the profile based on
     *         the bit rate selected for the output file.</li>
     *         <li><code>AAC-LC</code>: The most common AAC profile. Use for bitrates
     *         larger than 64 kbps.</li> <li><code>HE-AAC</code>: Not supported on
     *         some older players and devices. Use for bitrates between 40 and 80
     *         kbps.</li> <li><code>HE-AACv2</code>: Not supported on some players
     *         and devices. Use for bitrates less than 48 kbps.</li> </ul>
     *         <note><p>If you created any presets before AAC profiles were added,
     *         Elastic Transcoder automatically updated your presets to use AAC-LC.
     *         You can change the value as required.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AudioCodecOptions withProfile(String profile) {
        this.profile = profile;
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
        if (getProfile() != null) sb.append("Profile: " + getProfile() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode()); 
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
        return true;
    }
    
}
    