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

    /** Specifies the group to which the audio rendition belongs. */
    private String audioGroupId;
    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     * MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container.
     * Regardless of the value that you specify here, if this output has video, the service will place the output into an
     * MPEG2-TS container.
     */
    private String audioOnlyContainer;
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
    /**
     * Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you
     * choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in
     * the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert
     * leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see
     * the Apple documentation.
     */
    private String descriptiveVideoServiceFlag;
    /**
     * Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this
     * rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     */
    private String iFrameOnlyManifest;
    /**
     * Use this setting to add an identifying string to the filename of each segment. The service adds this string
     * between the name modifier and segment index number. You can use format identifiers in the string. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     */
    private String segmentModifier;

    /**
     * Specifies the group to which the audio rendition belongs.
     * 
     * @param audioGroupId
     *        Specifies the group to which the audio rendition belongs.
     */

    public void setAudioGroupId(String audioGroupId) {
        this.audioGroupId = audioGroupId;
    }

    /**
     * Specifies the group to which the audio rendition belongs.
     * 
     * @return Specifies the group to which the audio rendition belongs.
     */

    public String getAudioGroupId() {
        return this.audioGroupId;
    }

    /**
     * Specifies the group to which the audio rendition belongs.
     * 
     * @param audioGroupId
     *        Specifies the group to which the audio rendition belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsSettings withAudioGroupId(String audioGroupId) {
        setAudioGroupId(audioGroupId);
        return this;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     * MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container.
     * Regardless of the value that you specify here, if this output has video, the service will place the output into an
     * MPEG2-TS container.
     * 
     * @param audioOnlyContainer
     *        Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *        MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw
     *        container. Regardless of the value that you specify here, if this output has video, the service will place
     *        the output into an MPEG2-TS container.
     * @see HlsAudioOnlyContainer
     */

    public void setAudioOnlyContainer(String audioOnlyContainer) {
        this.audioOnlyContainer = audioOnlyContainer;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     * MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container.
     * Regardless of the value that you specify here, if this output has video, the service will place the output into an
     * MPEG2-TS container.
     * 
     * @return Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *         MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw
     *         container. Regardless of the value that you specify here, if this output has video, the service will
     *         place the output into an MPEG2-TS container.
     * @see HlsAudioOnlyContainer
     */

    public String getAudioOnlyContainer() {
        return this.audioOnlyContainer;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     * MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container.
     * Regardless of the value that you specify here, if this output has video, the service will place the output into an
     * MPEG2-TS container.
     * 
     * @param audioOnlyContainer
     *        Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *        MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw
     *        container. Regardless of the value that you specify here, if this output has video, the service will place
     *        the output into an MPEG2-TS container.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAudioOnlyContainer
     */

    public HlsSettings withAudioOnlyContainer(String audioOnlyContainer) {
        setAudioOnlyContainer(audioOnlyContainer);
        return this;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     * MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw container.
     * Regardless of the value that you specify here, if this output has video, the service will place the output into an
     * MPEG2-TS container.
     * 
     * @param audioOnlyContainer
     *        Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *        MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create an audio-only file in a raw
     *        container. Regardless of the value that you specify here, if this output has video, the service will place
     *        the output into an MPEG2-TS container.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAudioOnlyContainer
     */

    public HlsSettings withAudioOnlyContainer(HlsAudioOnlyContainer audioOnlyContainer) {
        this.audioOnlyContainer = audioOnlyContainer.toString();
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
     * Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you
     * choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in
     * the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert
     * leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see
     * the Apple documentation.
     * 
     * @param descriptiveVideoServiceFlag
     *        Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest.
     *        When you choose Flag (FLAG), MediaConvert includes the parameter
     *        CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you
     *        keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can
     *        help with accessibility on Apple devices. For more information, see the Apple documentation.
     * @see HlsDescriptiveVideoServiceFlag
     */

    public void setDescriptiveVideoServiceFlag(String descriptiveVideoServiceFlag) {
        this.descriptiveVideoServiceFlag = descriptiveVideoServiceFlag;
    }

    /**
     * Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you
     * choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in
     * the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert
     * leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see
     * the Apple documentation.
     * 
     * @return Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest.
     *         When you choose Flag (FLAG), MediaConvert includes the parameter
     *         CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you
     *         keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can
     *         help with accessibility on Apple devices. For more information, see the Apple documentation.
     * @see HlsDescriptiveVideoServiceFlag
     */

    public String getDescriptiveVideoServiceFlag() {
        return this.descriptiveVideoServiceFlag;
    }

    /**
     * Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you
     * choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in
     * the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert
     * leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see
     * the Apple documentation.
     * 
     * @param descriptiveVideoServiceFlag
     *        Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest.
     *        When you choose Flag (FLAG), MediaConvert includes the parameter
     *        CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you
     *        keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can
     *        help with accessibility on Apple devices. For more information, see the Apple documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsDescriptiveVideoServiceFlag
     */

    public HlsSettings withDescriptiveVideoServiceFlag(String descriptiveVideoServiceFlag) {
        setDescriptiveVideoServiceFlag(descriptiveVideoServiceFlag);
        return this;
    }

    /**
     * Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you
     * choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in
     * the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert
     * leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see
     * the Apple documentation.
     * 
     * @param descriptiveVideoServiceFlag
     *        Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest.
     *        When you choose Flag (FLAG), MediaConvert includes the parameter
     *        CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you
     *        keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can
     *        help with accessibility on Apple devices. For more information, see the Apple documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsDescriptiveVideoServiceFlag
     */

    public HlsSettings withDescriptiveVideoServiceFlag(HlsDescriptiveVideoServiceFlag descriptiveVideoServiceFlag) {
        this.descriptiveVideoServiceFlag = descriptiveVideoServiceFlag.toString();
        return this;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this
     * rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @param iFrameOnlyManifest
     *        Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for
     *        this rendition, in addition to your regular manifest for this rendition. You might use this manifest as
     *        part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only
     *        child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only
     *        child manifest, keep the default value Exclude (EXCLUDE).
     * @see HlsIFrameOnlyManifest
     */

    public void setIFrameOnlyManifest(String iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this
     * rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @return Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for
     *         this rendition, in addition to your regular manifest for this rendition. You might use this manifest as
     *         part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only
     *         child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame
     *         only child manifest, keep the default value Exclude (EXCLUDE).
     * @see HlsIFrameOnlyManifest
     */

    public String getIFrameOnlyManifest() {
        return this.iFrameOnlyManifest;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this
     * rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @param iFrameOnlyManifest
     *        Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for
     *        this rendition, in addition to your regular manifest for this rendition. You might use this manifest as
     *        part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only
     *        child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only
     *        child manifest, keep the default value Exclude (EXCLUDE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIFrameOnlyManifest
     */

    public HlsSettings withIFrameOnlyManifest(String iFrameOnlyManifest) {
        setIFrameOnlyManifest(iFrameOnlyManifest);
        return this;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this
     * rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @param iFrameOnlyManifest
     *        Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for
     *        this rendition, in addition to your regular manifest for this rendition. You might use this manifest as
     *        part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only
     *        child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only
     *        child manifest, keep the default value Exclude (EXCLUDE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIFrameOnlyManifest
     */

    public HlsSettings withIFrameOnlyManifest(HlsIFrameOnlyManifest iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest.toString();
        return this;
    }

    /**
     * Use this setting to add an identifying string to the filename of each segment. The service adds this string
     * between the name modifier and segment index number. You can use format identifiers in the string. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     * 
     * @param segmentModifier
     *        Use this setting to add an identifying string to the filename of each segment. The service adds this
     *        string between the name modifier and segment index number. You can use format identifiers in the string.
     *        For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     */

    public void setSegmentModifier(String segmentModifier) {
        this.segmentModifier = segmentModifier;
    }

    /**
     * Use this setting to add an identifying string to the filename of each segment. The service adds this string
     * between the name modifier and segment index number. You can use format identifiers in the string. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     * 
     * @return Use this setting to add an identifying string to the filename of each segment. The service adds this
     *         string between the name modifier and segment index number. You can use format identifiers in the string.
     *         For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     */

    public String getSegmentModifier() {
        return this.segmentModifier;
    }

    /**
     * Use this setting to add an identifying string to the filename of each segment. The service adds this string
     * between the name modifier and segment index number. You can use format identifiers in the string. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     * 
     * @param segmentModifier
     *        Use this setting to add an identifying string to the filename of each segment. The service adds this
     *        string between the name modifier and segment index number. You can use format identifiers in the string.
     *        For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/using-variables-in-your-job-settings.html
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
        if (getAudioOnlyContainer() != null)
            sb.append("AudioOnlyContainer: ").append(getAudioOnlyContainer()).append(",");
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: ").append(getAudioRenditionSets()).append(",");
        if (getAudioTrackType() != null)
            sb.append("AudioTrackType: ").append(getAudioTrackType()).append(",");
        if (getDescriptiveVideoServiceFlag() != null)
            sb.append("DescriptiveVideoServiceFlag: ").append(getDescriptiveVideoServiceFlag()).append(",");
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
        if (other.getAudioOnlyContainer() == null ^ this.getAudioOnlyContainer() == null)
            return false;
        if (other.getAudioOnlyContainer() != null && other.getAudioOnlyContainer().equals(this.getAudioOnlyContainer()) == false)
            return false;
        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getAudioTrackType() == null ^ this.getAudioTrackType() == null)
            return false;
        if (other.getAudioTrackType() != null && other.getAudioTrackType().equals(this.getAudioTrackType()) == false)
            return false;
        if (other.getDescriptiveVideoServiceFlag() == null ^ this.getDescriptiveVideoServiceFlag() == null)
            return false;
        if (other.getDescriptiveVideoServiceFlag() != null && other.getDescriptiveVideoServiceFlag().equals(this.getDescriptiveVideoServiceFlag()) == false)
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
        hashCode = prime * hashCode + ((getAudioOnlyContainer() == null) ? 0 : getAudioOnlyContainer().hashCode());
        hashCode = prime * hashCode + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
        hashCode = prime * hashCode + ((getDescriptiveVideoServiceFlag() == null) ? 0 : getDescriptiveVideoServiceFlag().hashCode());
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
