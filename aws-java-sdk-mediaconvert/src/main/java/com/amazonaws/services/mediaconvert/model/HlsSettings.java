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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for HLS output groups
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/HlsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsSettings implements Serializable, Cloneable, StructuredPojo {

    /** Specifies the group to which the audio Rendition belongs. */
    private String audioGroupId;
    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     */
    private String audioRenditionSets;
    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only
     * stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select,
     * Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the
     * client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
     * AUTOSELECT=NO
     */
    private String audioTrackType;
    /** When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest */
    private String iFrameOnlyManifest;
    /** String concatenated to end of segment filenames. Accepts "Format Identifiers":#format_identifier_parameters. */
    private String segmentModifier;

    /**
     * Specifies the group to which the audio Rendition belongs.
     * 
     * @param audioGroupId
     *        Specifies the group to which the audio Rendition belongs.
     */

    public void setAudioGroupId(String audioGroupId) {
        this.audioGroupId = audioGroupId;
    }

    /**
     * Specifies the group to which the audio Rendition belongs.
     * 
     * @return Specifies the group to which the audio Rendition belongs.
     */

    public String getAudioGroupId() {
        return this.audioGroupId;
    }

    /**
     * Specifies the group to which the audio Rendition belongs.
     * 
     * @param audioGroupId
     *        Specifies the group to which the audio Rendition belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withAudioGroupId(String audioGroupId) {
        setAudioGroupId(audioGroupId);
        return this;
    }

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

    public HlsSettings withAudioRenditionSets(String audioRenditionSets) {
        setAudioRenditionSets(audioRenditionSets);
        return this;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only
     * stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select,
     * Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the
     * client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
     * AUTOSELECT=NO
     * 
     * @param audioTrackType
     *        Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this
     *        audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the
     *        HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play
     *        back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     *        Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate
     *        Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *        Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see HlsAudioTrackType
     */

    public void setAudioTrackType(String audioTrackType) {
        this.audioTrackType = audioTrackType;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only
     * stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select,
     * Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the
     * client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
     * AUTOSELECT=NO
     * 
     * @return Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this
     *         audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the
     *         HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to
     *         play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     *         Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *         default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate
     *         Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *         Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see HlsAudioTrackType
     */

    public String getAudioTrackType() {
        return this.audioTrackType;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only
     * stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select,
     * Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the
     * client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
     * AUTOSELECT=NO
     * 
     * @param audioTrackType
     *        Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this
     *        audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the
     *        HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play
     *        back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     *        Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate
     *        Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *        Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAudioTrackType
     */

    public HlsSettings withAudioTrackType(String audioTrackType) {
        setAudioTrackType(audioTrackType);
        return this;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only
     * stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select,
     * Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the
     * client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
     * AUTOSELECT=NO
     * 
     * @param audioTrackType
     *        Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this
     *        audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the
     *        HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play
     *        back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     *        Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate
     *        Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *        Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAudioTrackType
     */

    public HlsSettings withAudioTrackType(HlsAudioTrackType audioTrackType) {
        this.audioTrackType = audioTrackType.toString();
        return this;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * 
     * @param iFrameOnlyManifest
     *        When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * @see HlsIFrameOnlyManifest
     */

    public void setIFrameOnlyManifest(String iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * 
     * @return When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * @see HlsIFrameOnlyManifest
     */

    public String getIFrameOnlyManifest() {
        return this.iFrameOnlyManifest;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * 
     * @param iFrameOnlyManifest
     *        When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIFrameOnlyManifest
     */

    public HlsSettings withIFrameOnlyManifest(String iFrameOnlyManifest) {
        setIFrameOnlyManifest(iFrameOnlyManifest);
        return this;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * 
     * @param iFrameOnlyManifest
     *        When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIFrameOnlyManifest
     */

    public HlsSettings withIFrameOnlyManifest(HlsIFrameOnlyManifest iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest.toString();
        return this;
    }

    /**
     * String concatenated to end of segment filenames. Accepts "Format Identifiers":#format_identifier_parameters.
     * 
     * @param segmentModifier
     *        String concatenated to end of segment filenames. Accepts
     *        "Format Identifiers":#format_identifier_parameters.
     */

    public void setSegmentModifier(String segmentModifier) {
        this.segmentModifier = segmentModifier;
    }

    /**
     * String concatenated to end of segment filenames. Accepts "Format Identifiers":#format_identifier_parameters.
     * 
     * @return String concatenated to end of segment filenames. Accepts
     *         "Format Identifiers":#format_identifier_parameters.
     */

    public String getSegmentModifier() {
        return this.segmentModifier;
    }

    /**
     * String concatenated to end of segment filenames. Accepts "Format Identifiers":#format_identifier_parameters.
     * 
     * @param segmentModifier
     *        String concatenated to end of segment filenames. Accepts
     *        "Format Identifiers":#format_identifier_parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withSegmentModifier(String segmentModifier) {
        setSegmentModifier(segmentModifier);
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
        if (getAudioGroupId() != null)
            sb.append("AudioGroupId: ").append(getAudioGroupId()).append(",");
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: ").append(getAudioRenditionSets()).append(",");
        if (getAudioTrackType() != null)
            sb.append("AudioTrackType: ").append(getAudioTrackType()).append(",");
        if (getIFrameOnlyManifest() != null)
            sb.append("IFrameOnlyManifest: ").append(getIFrameOnlyManifest()).append(",");
        if (getSegmentModifier() != null)
            sb.append("SegmentModifier: ").append(getSegmentModifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsSettings == false)
            return false;
        HlsSettings other = (HlsSettings) obj;
        if (other.getAudioGroupId() == null ^ this.getAudioGroupId() == null)
            return false;
        if (other.getAudioGroupId() != null && other.getAudioGroupId().equals(this.getAudioGroupId()) == false)
            return false;
        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getAudioTrackType() == null ^ this.getAudioTrackType() == null)
            return false;
        if (other.getAudioTrackType() != null && other.getAudioTrackType().equals(this.getAudioTrackType()) == false)
            return false;
        if (other.getIFrameOnlyManifest() == null ^ this.getIFrameOnlyManifest() == null)
            return false;
        if (other.getIFrameOnlyManifest() != null && other.getIFrameOnlyManifest().equals(this.getIFrameOnlyManifest()) == false)
            return false;
        if (other.getSegmentModifier() == null ^ this.getSegmentModifier() == null)
            return false;
        if (other.getSegmentModifier() != null && other.getSegmentModifier().equals(this.getSegmentModifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioGroupId() == null) ? 0 : getAudioGroupId().hashCode());
        hashCode = prime * hashCode + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
        hashCode = prime * hashCode + ((getIFrameOnlyManifest() == null) ? 0 : getIFrameOnlyManifest().hashCode());
        hashCode = prime * hashCode + ((getSegmentModifier() == null) ? 0 : getSegmentModifier().hashCode());
        return hashCode;
    }

    @Override
    public HlsSettings clone() {
        try {
            return (HlsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.HlsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
