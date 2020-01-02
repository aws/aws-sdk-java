/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Audio Only Hls Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioOnlyHlsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioOnlyHlsSettings implements Serializable, Cloneable, StructuredPojo {

    /** Specifies the group to which the audio Rendition belongs. */
    private String audioGroupId;
    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low
     * bit-size file because the image increases the output audio bandwidth.
     * 
     * The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     */
    private InputLocation audioOnlyImage;
    /**
     * Four types of audio-only tracks are supported:
     * 
     * Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth
     * scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     * Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     */
    private String audioTrackType;
    /** Specifies the segment type. */
    private String segmentType;

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

    public AudioOnlyHlsSettings withAudioGroupId(String audioGroupId) {
        setAudioGroupId(audioGroupId);
        return this;
    }

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low
     * bit-size file because the image increases the output audio bandwidth.
     * 
     * The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     * 
     * @param audioOnlyImage
     *        Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend
     *        a low bit-size file because the image increases the output audio bandwidth.
     * 
     *        The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     *        "ID3 tag version 2.4.0 - Native Frames" standard.
     */

    public void setAudioOnlyImage(InputLocation audioOnlyImage) {
        this.audioOnlyImage = audioOnlyImage;
    }

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low
     * bit-size file because the image increases the output audio bandwidth.
     * 
     * The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     * 
     * @return Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend
     *         a low bit-size file because the image increases the output audio bandwidth.
     * 
     *         The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     *         "ID3 tag version 2.4.0 - Native Frames" standard.
     */

    public InputLocation getAudioOnlyImage() {
        return this.audioOnlyImage;
    }

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend a low
     * bit-size file because the image increases the output audio bandwidth.
     * 
     * The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     * 
     * @param audioOnlyImage
     *        Optional. Specifies the .jpg or .png image to use as the cover art for an audio-only output. We recommend
     *        a low bit-size file because the image increases the output audio bandwidth.
     * 
     *        The image is attached to the audio as an ID3 tag, frame type APIC, picture type 0x10, as per the
     *        "ID3 tag version 2.4.0 - Native Frames" standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioOnlyHlsSettings withAudioOnlyImage(InputLocation audioOnlyImage) {
        setAudioOnlyImage(audioOnlyImage);
        return this;
    }

    /**
     * Four types of audio-only tracks are supported:
     * 
     * Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth
     * scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     * Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * 
     * @param audioTrackType
     *        Four types of audio-only tracks are supported:
     * 
     *        Audio-Only Variant Stream The client can play back this audio-only stream instead of video in
     *        low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     *        Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     *        Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     *        Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *        Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see AudioOnlyHlsTrackType
     */

    public void setAudioTrackType(String audioTrackType) {
        this.audioTrackType = audioTrackType;
    }

    /**
     * Four types of audio-only tracks are supported:
     * 
     * Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth
     * scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     * Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * 
     * @return Four types of audio-only tracks are supported:
     * 
     *         Audio-Only Variant Stream The client can play back this audio-only stream instead of video in
     *         low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     *         Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by
     *         default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     *         Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *         default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     *         Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by
     *         default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see AudioOnlyHlsTrackType
     */

    public String getAudioTrackType() {
        return this.audioTrackType;
    }

    /**
     * Four types of audio-only tracks are supported:
     * 
     * Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth
     * scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     * Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * 
     * @param audioTrackType
     *        Four types of audio-only tracks are supported:
     * 
     *        Audio-Only Variant Stream The client can play back this audio-only stream instead of video in
     *        low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     *        Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     *        Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     *        Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *        Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioOnlyHlsTrackType
     */

    public AudioOnlyHlsSettings withAudioTrackType(String audioTrackType) {
        setAudioTrackType(audioTrackType);
        return this;
    }

    /**
     * Four types of audio-only tracks are supported:
     * 
     * Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth
     * scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     * Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     * Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * 
     * @param audioTrackType
     *        Four types of audio-only tracks are supported:
     * 
     *        Audio-Only Variant Stream The client can play back this audio-only stream instead of video in
     *        low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
     * 
     *        Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * 
     *        Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by
     *        default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
     * 
     *        Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default.
     *        Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioOnlyHlsTrackType
     */

    public AudioOnlyHlsSettings withAudioTrackType(AudioOnlyHlsTrackType audioTrackType) {
        this.audioTrackType = audioTrackType.toString();
        return this;
    }

    /**
     * Specifies the segment type.
     * 
     * @param segmentType
     *        Specifies the segment type.
     * @see AudioOnlyHlsSegmentType
     */

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * Specifies the segment type.
     * 
     * @return Specifies the segment type.
     * @see AudioOnlyHlsSegmentType
     */

    public String getSegmentType() {
        return this.segmentType;
    }

    /**
     * Specifies the segment type.
     * 
     * @param segmentType
     *        Specifies the segment type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioOnlyHlsSegmentType
     */

    public AudioOnlyHlsSettings withSegmentType(String segmentType) {
        setSegmentType(segmentType);
        return this;
    }

    /**
     * Specifies the segment type.
     * 
     * @param segmentType
     *        Specifies the segment type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioOnlyHlsSegmentType
     */

    public AudioOnlyHlsSettings withSegmentType(AudioOnlyHlsSegmentType segmentType) {
        this.segmentType = segmentType.toString();
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
        if (getAudioOnlyImage() != null)
            sb.append("AudioOnlyImage: ").append(getAudioOnlyImage()).append(",");
        if (getAudioTrackType() != null)
            sb.append("AudioTrackType: ").append(getAudioTrackType()).append(",");
        if (getSegmentType() != null)
            sb.append("SegmentType: ").append(getSegmentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioOnlyHlsSettings == false)
            return false;
        AudioOnlyHlsSettings other = (AudioOnlyHlsSettings) obj;
        if (other.getAudioGroupId() == null ^ this.getAudioGroupId() == null)
            return false;
        if (other.getAudioGroupId() != null && other.getAudioGroupId().equals(this.getAudioGroupId()) == false)
            return false;
        if (other.getAudioOnlyImage() == null ^ this.getAudioOnlyImage() == null)
            return false;
        if (other.getAudioOnlyImage() != null && other.getAudioOnlyImage().equals(this.getAudioOnlyImage()) == false)
            return false;
        if (other.getAudioTrackType() == null ^ this.getAudioTrackType() == null)
            return false;
        if (other.getAudioTrackType() != null && other.getAudioTrackType().equals(this.getAudioTrackType()) == false)
            return false;
        if (other.getSegmentType() == null ^ this.getSegmentType() == null)
            return false;
        if (other.getSegmentType() != null && other.getSegmentType().equals(this.getSegmentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioGroupId() == null) ? 0 : getAudioGroupId().hashCode());
        hashCode = prime * hashCode + ((getAudioOnlyImage() == null) ? 0 : getAudioOnlyImage().hashCode());
        hashCode = prime * hashCode + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
        hashCode = prime * hashCode + ((getSegmentType() == null) ? 0 : getSegmentType().hashCode());
        return hashCode;
    }

    @Override
    public AudioOnlyHlsSettings clone() {
        try {
            return (AudioOnlyHlsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioOnlyHlsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
