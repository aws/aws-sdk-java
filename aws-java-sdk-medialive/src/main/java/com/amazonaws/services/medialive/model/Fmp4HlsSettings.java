/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Fmp4 Hls Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Fmp4HlsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Fmp4HlsSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     */
    private String audioRenditionSets;
    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     */
    private String nielsenId3Behavior;
    /** When set to passthrough, timed metadata is passed through from input to output. */
    private String timedMetadataBehavior;

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     * 
     * @param audioRenditionSets
     *        List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that
     *        are associated to the video, separate by ','.
     */

    public void setAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
    }

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     * 
     * @return List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that
     *         are associated to the video, separate by ','.
     */

    public String getAudioRenditionSets() {
        return this.audioRenditionSets;
    }

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     * 
     * @param audioRenditionSets
     *        List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that
     *        are associated to the video, separate by ','.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fmp4HlsSettings withAudioRenditionSets(String audioRenditionSets) {
        setAudioRenditionSets(audioRenditionSets);
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @param nielsenId3Behavior
     *        If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *        an equivalent ID3 tag will be inserted in the output.
     * @see Fmp4NielsenId3Behavior
     */

    public void setNielsenId3Behavior(String nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @return If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *         an equivalent ID3 tag will be inserted in the output.
     * @see Fmp4NielsenId3Behavior
     */

    public String getNielsenId3Behavior() {
        return this.nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @param nielsenId3Behavior
     *        If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *        an equivalent ID3 tag will be inserted in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Fmp4NielsenId3Behavior
     */

    public Fmp4HlsSettings withNielsenId3Behavior(String nielsenId3Behavior) {
        setNielsenId3Behavior(nielsenId3Behavior);
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     * equivalent ID3 tag will be inserted in the output.
     * 
     * @param nielsenId3Behavior
     *        If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and
     *        an equivalent ID3 tag will be inserted in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Fmp4NielsenId3Behavior
     */

    public Fmp4HlsSettings withNielsenId3Behavior(Fmp4NielsenId3Behavior nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior.toString();
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata is passed through from input to output.
     * @see Fmp4TimedMetadataBehavior
     */

    public void setTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @return When set to passthrough, timed metadata is passed through from input to output.
     * @see Fmp4TimedMetadataBehavior
     */

    public String getTimedMetadataBehavior() {
        return this.timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata is passed through from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Fmp4TimedMetadataBehavior
     */

    public Fmp4HlsSettings withTimedMetadataBehavior(String timedMetadataBehavior) {
        setTimedMetadataBehavior(timedMetadataBehavior);
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata is passed through from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Fmp4TimedMetadataBehavior
     */

    public Fmp4HlsSettings withTimedMetadataBehavior(Fmp4TimedMetadataBehavior timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior.toString();
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
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: ").append(getAudioRenditionSets()).append(",");
        if (getNielsenId3Behavior() != null)
            sb.append("NielsenId3Behavior: ").append(getNielsenId3Behavior()).append(",");
        if (getTimedMetadataBehavior() != null)
            sb.append("TimedMetadataBehavior: ").append(getTimedMetadataBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fmp4HlsSettings == false)
            return false;
        Fmp4HlsSettings other = (Fmp4HlsSettings) obj;
        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getNielsenId3Behavior() == null ^ this.getNielsenId3Behavior() == null)
            return false;
        if (other.getNielsenId3Behavior() != null && other.getNielsenId3Behavior().equals(this.getNielsenId3Behavior()) == false)
            return false;
        if (other.getTimedMetadataBehavior() == null ^ this.getTimedMetadataBehavior() == null)
            return false;
        if (other.getTimedMetadataBehavior() != null && other.getTimedMetadataBehavior().equals(this.getTimedMetadataBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode + ((getNielsenId3Behavior() == null) ? 0 : getNielsenId3Behavior().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataBehavior() == null) ? 0 : getTimedMetadataBehavior().hashCode());
        return hashCode;
    }

    @Override
    public Fmp4HlsSettings clone() {
        try {
            return (Fmp4HlsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Fmp4HlsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
