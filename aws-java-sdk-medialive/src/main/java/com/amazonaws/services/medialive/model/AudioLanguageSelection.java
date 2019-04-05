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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Audio Language Selection
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioLanguageSelection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioLanguageSelection implements Serializable, Cloneable, StructuredPojo {

    /** Selects a specific three-letter language code from within an audio source. */
    private String languageCode;
    /**
     * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor.
     * If a PMT update occurs such that an audio stream matching the initially selected language is no longer present
     * then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose
     * another audio stream in the program with the same stream type if it can't find one with the same language.
     */
    private String languageSelectionPolicy;

    /**
     * Selects a specific three-letter language code from within an audio source.
     * 
     * @param languageCode
     *        Selects a specific three-letter language code from within an audio source.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Selects a specific three-letter language code from within an audio source.
     * 
     * @return Selects a specific three-letter language code from within an audio source.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Selects a specific three-letter language code from within an audio source.
     * 
     * @param languageCode
     *        Selects a specific three-letter language code from within an audio source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioLanguageSelection withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor.
     * If a PMT update occurs such that an audio stream matching the initially selected language is no longer present
     * then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose
     * another audio stream in the program with the same stream type if it can't find one with the same language.
     * 
     * @param languageSelectionPolicy
     *        When set to "strict", the transport stream demux strictly identifies audio streams by their language
     *        descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is
     *        no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update
     *        the demux will choose another audio stream in the program with the same stream type if it can't find one
     *        with the same language.
     * @see AudioLanguageSelectionPolicy
     */

    public void setLanguageSelectionPolicy(String languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor.
     * If a PMT update occurs such that an audio stream matching the initially selected language is no longer present
     * then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose
     * another audio stream in the program with the same stream type if it can't find one with the same language.
     * 
     * @return When set to "strict", the transport stream demux strictly identifies audio streams by their language
     *         descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is
     *         no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update
     *         the demux will choose another audio stream in the program with the same stream type if it can't find one
     *         with the same language.
     * @see AudioLanguageSelectionPolicy
     */

    public String getLanguageSelectionPolicy() {
        return this.languageSelectionPolicy;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor.
     * If a PMT update occurs such that an audio stream matching the initially selected language is no longer present
     * then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose
     * another audio stream in the program with the same stream type if it can't find one with the same language.
     * 
     * @param languageSelectionPolicy
     *        When set to "strict", the transport stream demux strictly identifies audio streams by their language
     *        descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is
     *        no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update
     *        the demux will choose another audio stream in the program with the same stream type if it can't find one
     *        with the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioLanguageSelectionPolicy
     */

    public AudioLanguageSelection withLanguageSelectionPolicy(String languageSelectionPolicy) {
        setLanguageSelectionPolicy(languageSelectionPolicy);
        return this;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor.
     * If a PMT update occurs such that an audio stream matching the initially selected language is no longer present
     * then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose
     * another audio stream in the program with the same stream type if it can't find one with the same language.
     * 
     * @param languageSelectionPolicy
     *        When set to "strict", the transport stream demux strictly identifies audio streams by their language
     *        descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is
     *        no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update
     *        the demux will choose another audio stream in the program with the same stream type if it can't find one
     *        with the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioLanguageSelectionPolicy
     */

    public AudioLanguageSelection withLanguageSelectionPolicy(AudioLanguageSelectionPolicy languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy.toString();
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageSelectionPolicy() != null)
            sb.append("LanguageSelectionPolicy: ").append(getLanguageSelectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioLanguageSelection == false)
            return false;
        AudioLanguageSelection other = (AudioLanguageSelection) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageSelectionPolicy() == null ^ this.getLanguageSelectionPolicy() == null)
            return false;
        if (other.getLanguageSelectionPolicy() != null && other.getLanguageSelectionPolicy().equals(this.getLanguageSelectionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageSelectionPolicy() == null) ? 0 : getLanguageSelectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AudioLanguageSelection clone() {
        try {
            return (AudioLanguageSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioLanguageSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
