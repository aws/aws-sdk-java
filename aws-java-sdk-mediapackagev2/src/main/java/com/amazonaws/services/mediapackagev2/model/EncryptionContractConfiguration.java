/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The encryption contract
 * defines which content keys are used to encrypt the audio and video tracks in your stream. To configure the encryption
 * contract, specify which audio and video encryption presets to use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/EncryptionContractConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionContractConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of audio encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to encrypt all
     * of the multichannel audio tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt all of
     * the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the multichannel audio
     * tracks with more than 6 channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the audio and video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     * </p>
     * </li>
     * </ul>
     */
    private String presetSpeke20Audio;
    /**
     * <p>
     * A collection of video encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD and
     * higher resolutions video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks
     * and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks,
     * one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key for all UHD2
     * video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the video and audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     * </p>
     * </li>
     * </ul>
     */
    private String presetSpeke20Video;

    /**
     * <p>
     * A collection of audio encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to encrypt all
     * of the multichannel audio tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt all of
     * the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the multichannel audio
     * tracks with more than 6 channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the audio and video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetSpeke20Audio
     *        A collection of audio encryption presets.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to
     *        encrypt all of the multichannel audio tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt
     *        all of the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the
     *        multichannel audio tracks with more than 6 channels.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SHARED - Use the same content key for all of the audio and video tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     *        </p>
     *        </li>
     * @see PresetSpeke20Audio
     */

    public void setPresetSpeke20Audio(String presetSpeke20Audio) {
        this.presetSpeke20Audio = presetSpeke20Audio;
    }

    /**
     * <p>
     * A collection of audio encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to encrypt all
     * of the multichannel audio tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt all of
     * the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the multichannel audio
     * tracks with more than 6 channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the audio and video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A collection of audio encryption presets.</p>
     *         <p>
     *         Value description:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to
     *         encrypt all of the multichannel audio tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to
     *         encrypt all of the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of
     *         the multichannel audio tracks with more than 6 channels.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SHARED - Use the same content key for all of the audio and video tracks in your stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     *         </p>
     *         </li>
     * @see PresetSpeke20Audio
     */

    public String getPresetSpeke20Audio() {
        return this.presetSpeke20Audio;
    }

    /**
     * <p>
     * A collection of audio encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to encrypt all
     * of the multichannel audio tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt all of
     * the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the multichannel audio
     * tracks with more than 6 channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the audio and video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetSpeke20Audio
     *        A collection of audio encryption presets.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to
     *        encrypt all of the multichannel audio tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt
     *        all of the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the
     *        multichannel audio tracks with more than 6 channels.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SHARED - Use the same content key for all of the audio and video tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Audio
     */

    public EncryptionContractConfiguration withPresetSpeke20Audio(String presetSpeke20Audio) {
        setPresetSpeke20Audio(presetSpeke20Audio);
        return this;
    }

    /**
     * <p>
     * A collection of audio encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to encrypt all
     * of the multichannel audio tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt all of
     * the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the multichannel audio
     * tracks with more than 6 channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the audio and video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetSpeke20Audio
     *        A collection of audio encryption presets.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-1 - Use one content key to encrypt all of the audio tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-2 - Use one content key to encrypt all of the stereo audio tracks and one content key to
     *        encrypt all of the multichannel audio tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-AUDIO-3 - Use one content key to encrypt all of the stereo audio tracks, one content key to encrypt
     *        all of the multichannel audio tracks with 3 to 6 channels, and one content key to encrypt all of the
     *        multichannel audio tracks with more than 6 channels.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SHARED - Use the same content key for all of the audio and video tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNENCRYPTED - Don't encrypt any of the audio tracks in your stream.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Audio
     */

    public EncryptionContractConfiguration withPresetSpeke20Audio(PresetSpeke20Audio presetSpeke20Audio) {
        this.presetSpeke20Audio = presetSpeke20Audio.toString();
        return this;
    }

    /**
     * <p>
     * A collection of video encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD and
     * higher resolutions video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks
     * and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks,
     * one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key for all UHD2
     * video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the video and audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetSpeke20Video
     *        A collection of video encryption presets.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD
     *        and higher resolutions video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *        tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *        tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *        tracks, one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
     *        key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *        tracks, one content key for HD2 video tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *        video tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *        video tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SHARED - Use the same content key for all of the video and audio tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     *        </p>
     *        </li>
     * @see PresetSpeke20Video
     */

    public void setPresetSpeke20Video(String presetSpeke20Video) {
        this.presetSpeke20Video = presetSpeke20Video;
    }

    /**
     * <p>
     * A collection of video encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD and
     * higher resolutions video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks
     * and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks,
     * one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key for all UHD2
     * video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the video and audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A collection of video encryption presets.</p>
     *         <p>
     *         Value description:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD
     *         and higher resolutions video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *         tracks and one content key for all UHD video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *         tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *         tracks, one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
     *         key for all UHD2 video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *         tracks, one content key for HD2 video tracks and one content key for all UHD video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *         video tracks and one content key for all UHD video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *         video tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SHARED - Use the same content key for all of the video and audio tracks in your stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     *         </p>
     *         </li>
     * @see PresetSpeke20Video
     */

    public String getPresetSpeke20Video() {
        return this.presetSpeke20Video;
    }

    /**
     * <p>
     * A collection of video encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD and
     * higher resolutions video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks
     * and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks,
     * one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key for all UHD2
     * video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the video and audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetSpeke20Video
     *        A collection of video encryption presets.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD
     *        and higher resolutions video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *        tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *        tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *        tracks, one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
     *        key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *        tracks, one content key for HD2 video tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *        video tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *        video tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SHARED - Use the same content key for all of the video and audio tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Video
     */

    public EncryptionContractConfiguration withPresetSpeke20Video(String presetSpeke20Video) {
        setPresetSpeke20Video(presetSpeke20Video);
        return this;
    }

    /**
     * <p>
     * A collection of video encryption presets.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD and
     * higher resolutions video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks
     * and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video tracks,
     * one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key for all UHD2
     * video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video tracks,
     * one content key for HD2 video tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks and one content key for all UHD video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2 video
     * tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     * </p>
     * </li>
     * <li>
     * <p>
     * SHARED - Use the same content key for all of the video and audio tracks in your stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     * </p>
     * </li>
     * </ul>
     * 
     * @param presetSpeke20Video
     *        A collection of video encryption presets.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-1 - Use one content key to encrypt all of the video tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-2 - Use one content key to encrypt all of the SD video tracks and one content key for all HD
     *        and higher resolutions video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-3 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *        tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-4 - Use one content key to encrypt all of the SD video tracks, one content key for HD video
     *        tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-5 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *        tracks, one content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
     *        key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-6 - Use one content key to encrypt all of the SD video tracks, one content key for HD1 video
     *        tracks, one content key for HD2 video tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-7 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *        video tracks and one content key for all UHD video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PRESET-VIDEO-8 - Use one content key to encrypt all of the SD+HD1 video tracks, one content key for HD2
     *        video tracks, one content key for all UHD1 video tracks and one content key for all UHD2 video tracks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SHARED - Use the same content key for all of the video and audio tracks in your stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNENCRYPTED - Don't encrypt any of the video tracks in your stream.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Video
     */

    public EncryptionContractConfiguration withPresetSpeke20Video(PresetSpeke20Video presetSpeke20Video) {
        this.presetSpeke20Video = presetSpeke20Video.toString();
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
        if (getPresetSpeke20Audio() != null)
            sb.append("PresetSpeke20Audio: ").append(getPresetSpeke20Audio()).append(",");
        if (getPresetSpeke20Video() != null)
            sb.append("PresetSpeke20Video: ").append(getPresetSpeke20Video());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionContractConfiguration == false)
            return false;
        EncryptionContractConfiguration other = (EncryptionContractConfiguration) obj;
        if (other.getPresetSpeke20Audio() == null ^ this.getPresetSpeke20Audio() == null)
            return false;
        if (other.getPresetSpeke20Audio() != null && other.getPresetSpeke20Audio().equals(this.getPresetSpeke20Audio()) == false)
            return false;
        if (other.getPresetSpeke20Video() == null ^ this.getPresetSpeke20Video() == null)
            return false;
        if (other.getPresetSpeke20Video() != null && other.getPresetSpeke20Video().equals(this.getPresetSpeke20Video()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresetSpeke20Audio() == null) ? 0 : getPresetSpeke20Audio().hashCode());
        hashCode = prime * hashCode + ((getPresetSpeke20Video() == null) ? 0 : getPresetSpeke20Video().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionContractConfiguration clone() {
        try {
            return (EncryptionContractConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.EncryptionContractConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
