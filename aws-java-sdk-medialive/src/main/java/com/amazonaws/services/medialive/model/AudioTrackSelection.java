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
 * Audio Track Selection
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioTrackSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioTrackSelection implements Serializable, Cloneable, StructuredPojo {

    /** Selects one or more unique audio tracks from within a source. */
    private java.util.List<AudioTrack> tracks;

    /**
     * Selects one or more unique audio tracks from within a source.
     * 
     * @return Selects one or more unique audio tracks from within a source.
     */

    public java.util.List<AudioTrack> getTracks() {
        return tracks;
    }

    /**
     * Selects one or more unique audio tracks from within a source.
     * 
     * @param tracks
     *        Selects one or more unique audio tracks from within a source.
     */

    public void setTracks(java.util.Collection<AudioTrack> tracks) {
        if (tracks == null) {
            this.tracks = null;
            return;
        }

        this.tracks = new java.util.ArrayList<AudioTrack>(tracks);
    }

    /**
     * Selects one or more unique audio tracks from within a source.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTracks(java.util.Collection)} or {@link #withTracks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tracks
     *        Selects one or more unique audio tracks from within a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioTrackSelection withTracks(AudioTrack... tracks) {
        if (this.tracks == null) {
            setTracks(new java.util.ArrayList<AudioTrack>(tracks.length));
        }
        for (AudioTrack ele : tracks) {
            this.tracks.add(ele);
        }
        return this;
    }

    /**
     * Selects one or more unique audio tracks from within a source.
     * 
     * @param tracks
     *        Selects one or more unique audio tracks from within a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioTrackSelection withTracks(java.util.Collection<AudioTrack> tracks) {
        setTracks(tracks);
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
        if (getTracks() != null)
            sb.append("Tracks: ").append(getTracks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioTrackSelection == false)
            return false;
        AudioTrackSelection other = (AudioTrackSelection) obj;
        if (other.getTracks() == null ^ this.getTracks() == null)
            return false;
        if (other.getTracks() != null && other.getTracks().equals(this.getTracks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTracks() == null) ? 0 : getTracks().hashCode());
        return hashCode;
    }

    @Override
    public AudioTrackSelection clone() {
        try {
            return (AudioTrackSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioTrackSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
