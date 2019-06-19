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
     * For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     * cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons. The
     * iPhone does not resize the image, it crops a centered image on the top/bottom and left/right. Additionally, this
     * image file gets saved bit-for-bit into every 10-second segment file, so will increase bandwidth by {image file
     * size} * {segment count} * {user count.}.
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
     * For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     * cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons. The
     * iPhone does not resize the image, it crops a centered image on the top/bottom and left/right. Additionally, this
     * image file gets saved bit-for-bit into every 10-second segment file, so will increase bandwidth by {image file
     * size} * {segment count} * {user count.}.
     * 
     * @param audioOnlyImage
     *        For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     *        cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons.
     *        The iPhone does not resize the image, it crops a centered image on the top/bottom and left/right.
     *        Additionally, this image file gets saved bit-for-bit into every 10-second segment file, so will increase
     *        bandwidth by {image file size} * {segment count} * {user count.}.
     */

    public void setAudioOnlyImage(InputLocation audioOnlyImage) {
        this.audioOnlyImage = audioOnlyImage;
    }

    /**
     * For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     * cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons. The
     * iPhone does not resize the image, it crops a centered image on the top/bottom and left/right. Additionally, this
     * image file gets saved bit-for-bit into every 10-second segment file, so will increase bandwidth by {image file
     * size} * {segment count} * {user count.}.
     * 
     * @return For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     *         cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two
     *         reasons. The iPhone does not resize the image, it crops a centered image on the top/bottom and
     *         left/right. Additionally, this image file gets saved bit-for-bit into every 10-second segment file, so
     *         will increase bandwidth by {image file size} * {segment count} * {user count.}.
     */

    public InputLocation getAudioOnlyImage() {
        return this.audioOnlyImage;
    }

    /**
     * For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     * cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons. The
     * iPhone does not resize the image, it crops a centered image on the top/bottom and left/right. Additionally, this
     * image file gets saved bit-for-bit into every 10-second segment file, so will increase bandwidth by {image file
     * size} * {segment count} * {user count.}.
     * 
     * @param audioOnlyImage
     *        For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the
     *        cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons.
     *        The iPhone does not resize the image, it crops a centered image on the top/bottom and left/right.
     *        Additionally, this image file gets saved bit-for-bit into every 10-second segment file, so will increase
     *        bandwidth by {image file size} * {segment count} * {user count.}.
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
            sb.append("AudioTrackType: ").append(getAudioTrackType());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioGroupId() == null) ? 0 : getAudioGroupId().hashCode());
        hashCode = prime * hashCode + ((getAudioOnlyImage() == null) ? 0 : getAudioOnlyImage().hashCode());
        hashCode = prime * hashCode + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
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
