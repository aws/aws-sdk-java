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
 * These settings relate to the fragmented MP4 container for the segments in your CMAF outputs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CmfcSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmfcSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     */
    private String audioDuration;
    /**
     * Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output in your
     * output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of TYPE=AUDIO, as the value
     * for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio group ID, it appears in your
     * manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related setting: To associate the rendition
     * group that this audio track belongs to with a video rendition, include the same value that you provide here for
     * that video output's setting Audio rendition sets (audioRenditionSets).
     */
    private String audioGroupId;
    /**
     * List the audio rendition groups that you want included with this video rendition. Use a comma-separated list. For
     * example, say you want to include the audio rendition groups that have the audio group IDs "audio_aac_1" and
     * "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related setting: The rendition
     * groups that you include in your comma-separated list should all match values that you specify in the setting Audio
     * group ID (AudioGroupId) for audio renditions in the same output group as this video rendition. Default behavior:
     * If you don't specify anything here and for Audio group ID, MediaConvert puts each audio variant in its own audio
     * rendition group and associates it with every video variant. Each value in your list appears in your HLS parent
     * manifest in the EXT-X-STREAM-INF tag as the value for the AUDIO attribute. To continue the previous example, say
     * that the file name for the child manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent
     * manifest, each value will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"...
     * amazing_video_1.m3u8 #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     */
    private String audioRenditionSets;
    /**
     * Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the
     * client player selects which audio track to play. The other options for this setting determine the values that
     * MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For
     * more information about these attributes, see the Apple documentation article
     * https://developer.apple.com/documentation
     * /http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose
     * Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES.
     * Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default
     * (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set
     * DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert defaults to Alternate
     * audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose
     * a value for this setting.
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
     * Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for
     * this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     */
    private String iFrameOnlyManifest;
    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     */
    private String scte35Esam;
    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     */
    private String scte35Source;

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @param audioDuration
     *        Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *        sensitive to very small duration differences between video and audio. For this situation, choose Match
     *        video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *        (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams
     *        with silence or trims them to ensure that the total duration of each audio stream is at least as long as
     *        the total duration of the video stream. After padding or trimming, the audio stream duration is no more
     *        than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the
     *        end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end
     *        of the file. When you keep the default value, any minor discrepancies between audio and video duration
     *        will depend on your output audio codec.
     * @see CmfcAudioDuration
     */

    public void setAudioDuration(String audioDuration) {
        this.audioDuration = audioDuration;
    }

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @return Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *         sensitive to very small duration differences between video and audio. For this situation, choose Match
     *         video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *         (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio
     *         streams with silence or trims them to ensure that the total duration of each audio stream is at least as
     *         long as the total duration of the video stream. After padding or trimming, the audio stream duration is
     *         no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only
     *         to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to
     *         the end of the file. When you keep the default value, any minor discrepancies between audio and video
     *         duration will depend on your output audio codec.
     * @see CmfcAudioDuration
     */

    public String getAudioDuration() {
        return this.audioDuration;
    }

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @param audioDuration
     *        Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *        sensitive to very small duration differences between video and audio. For this situation, choose Match
     *        video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *        (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams
     *        with silence or trims them to ensure that the total duration of each audio stream is at least as long as
     *        the total duration of the video stream. After padding or trimming, the audio stream duration is no more
     *        than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the
     *        end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end
     *        of the file. When you keep the default value, any minor discrepancies between audio and video duration
     *        will depend on your output audio codec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcAudioDuration
     */

    public CmfcSettings withAudioDuration(String audioDuration) {
        setAudioDuration(audioDuration);
        return this;
    }

    /**
     * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     * sensitive to very small duration differences between video and audio. For this situation, choose Match video
     * duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     * (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with
     * silence or trims them to ensure that the total duration of each audio stream is at least as long as the total
     * duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame
     * longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment
     * of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the
     * default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
     * 
     * @param audioDuration
     *        Specify this setting only when your output will be consumed by a downstream repackaging workflow that is
     *        sensitive to very small duration differences between video and audio. For this situation, choose Match
     *        video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration
     *        (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams
     *        with silence or trims them to ensure that the total duration of each audio stream is at least as long as
     *        the total duration of the video stream. After padding or trimming, the audio stream duration is no more
     *        than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the
     *        end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end
     *        of the file. When you keep the default value, any minor discrepancies between audio and video duration
     *        will depend on your output audio codec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcAudioDuration
     */

    public CmfcSettings withAudioDuration(CmfcAudioDuration audioDuration) {
        this.audioDuration = audioDuration.toString();
        return this;
    }

    /**
     * Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output in your
     * output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of TYPE=AUDIO, as the value
     * for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio group ID, it appears in your
     * manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related setting: To associate the rendition
     * group that this audio track belongs to with a video rendition, include the same value that you provide here for
     * that video output's setting Audio rendition sets (audioRenditionSets).
     * 
     * @param audioGroupId
     *        Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output
     *        in your output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of TYPE=AUDIO,
     *        as the value for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio group ID, it
     *        appears in your manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related setting: To
     *        associate the rendition group that this audio track belongs to with a video rendition, include the same
     *        value that you provide here for that video output's setting Audio rendition sets (audioRenditionSets).
     */

    public void setAudioGroupId(String audioGroupId) {
        this.audioGroupId = audioGroupId;
    }

    /**
     * Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output in your
     * output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of TYPE=AUDIO, as the value
     * for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio group ID, it appears in your
     * manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related setting: To associate the rendition
     * group that this audio track belongs to with a video rendition, include the same value that you provide here for
     * that video output's setting Audio rendition sets (audioRenditionSets).
     * 
     * @return Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output
     *         in your output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of
     *         TYPE=AUDIO, as the value for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio
     *         group ID, it appears in your manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related
     *         setting: To associate the rendition group that this audio track belongs to with a video rendition,
     *         include the same value that you provide here for that video output's setting Audio rendition sets
     *         (audioRenditionSets).
     */

    public String getAudioGroupId() {
        return this.audioGroupId;
    }

    /**
     * Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output in your
     * output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of TYPE=AUDIO, as the value
     * for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio group ID, it appears in your
     * manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related setting: To associate the rendition
     * group that this audio track belongs to with a video rendition, include the same value that you provide here for
     * that video output's setting Audio rendition sets (audioRenditionSets).
     * 
     * @param audioGroupId
     *        Specify the audio rendition group for this audio rendition. Specify up to one value for each audio output
     *        in your output group. This value appears in your HLS parent manifest in the EXT-X-MEDIA tag of TYPE=AUDIO,
     *        as the value for the GROUP-ID attribute. For example, if you specify "audio_aac_1" for Audio group ID, it
     *        appears in your manifest like this: #EXT-X-MEDIA:TYPE=AUDIO,GROUP-ID="audio_aac_1". Related setting: To
     *        associate the rendition group that this audio track belongs to with a video rendition, include the same
     *        value that you provide here for that video output's setting Audio rendition sets (audioRenditionSets).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmfcSettings withAudioGroupId(String audioGroupId) {
        setAudioGroupId(audioGroupId);
        return this;
    }

    /**
     * List the audio rendition groups that you want included with this video rendition. Use a comma-separated list. For
     * example, say you want to include the audio rendition groups that have the audio group IDs "audio_aac_1" and
     * "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related setting: The rendition
     * groups that you include in your comma-separated list should all match values that you specify in the setting Audio
     * group ID (AudioGroupId) for audio renditions in the same output group as this video rendition. Default behavior:
     * If you don't specify anything here and for Audio group ID, MediaConvert puts each audio variant in its own audio
     * rendition group and associates it with every video variant. Each value in your list appears in your HLS parent
     * manifest in the EXT-X-STREAM-INF tag as the value for the AUDIO attribute. To continue the previous example, say
     * that the file name for the child manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent
     * manifest, each value will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"...
     * amazing_video_1.m3u8 #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     * 
     * @param audioRenditionSets
     *        List the audio rendition groups that you want included with this video rendition. Use a comma-separated
     *        list. For example, say you want to include the audio rendition groups that have the audio group IDs
     *        "audio_aac_1" and "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related
     *        setting: The rendition groups that you include in your comma-separated list should all match values that
     *        you specify in the setting Audio group ID (AudioGroupId) for audio renditions in the same output group as
     *        this video rendition. Default behavior: If you don't specify anything here and for Audio group ID,
     *        MediaConvert puts each audio variant in its own audio rendition group and associates it with every video
     *        variant. Each value in your list appears in your HLS parent manifest in the EXT-X-STREAM-INF tag as the
     *        value for the AUDIO attribute. To continue the previous example, say that the file name for the child
     *        manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent manifest, each value
     *        will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"... amazing_video_1.m3u8
     *        #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     */

    public void setAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
    }

    /**
     * List the audio rendition groups that you want included with this video rendition. Use a comma-separated list. For
     * example, say you want to include the audio rendition groups that have the audio group IDs "audio_aac_1" and
     * "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related setting: The rendition
     * groups that you include in your comma-separated list should all match values that you specify in the setting Audio
     * group ID (AudioGroupId) for audio renditions in the same output group as this video rendition. Default behavior:
     * If you don't specify anything here and for Audio group ID, MediaConvert puts each audio variant in its own audio
     * rendition group and associates it with every video variant. Each value in your list appears in your HLS parent
     * manifest in the EXT-X-STREAM-INF tag as the value for the AUDIO attribute. To continue the previous example, say
     * that the file name for the child manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent
     * manifest, each value will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"...
     * amazing_video_1.m3u8 #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     * 
     * @return List the audio rendition groups that you want included with this video rendition. Use a comma-separated
     *         list. For example, say you want to include the audio rendition groups that have the audio group IDs
     *         "audio_aac_1" and "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related
     *         setting: The rendition groups that you include in your comma-separated list should all match values that
     *         you specify in the setting Audio group ID (AudioGroupId) for audio renditions in the same output group as
     *         this video rendition. Default behavior: If you don't specify anything here and for Audio group ID,
     *         MediaConvert puts each audio variant in its own audio rendition group and associates it with every video
     *         variant. Each value in your list appears in your HLS parent manifest in the EXT-X-STREAM-INF tag as the
     *         value for the AUDIO attribute. To continue the previous example, say that the file name for the child
     *         manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent manifest, each value
     *         will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"... amazing_video_1.m3u8
     *         #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     */

    public String getAudioRenditionSets() {
        return this.audioRenditionSets;
    }

    /**
     * List the audio rendition groups that you want included with this video rendition. Use a comma-separated list. For
     * example, say you want to include the audio rendition groups that have the audio group IDs "audio_aac_1" and
     * "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related setting: The rendition
     * groups that you include in your comma-separated list should all match values that you specify in the setting Audio
     * group ID (AudioGroupId) for audio renditions in the same output group as this video rendition. Default behavior:
     * If you don't specify anything here and for Audio group ID, MediaConvert puts each audio variant in its own audio
     * rendition group and associates it with every video variant. Each value in your list appears in your HLS parent
     * manifest in the EXT-X-STREAM-INF tag as the value for the AUDIO attribute. To continue the previous example, say
     * that the file name for the child manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent
     * manifest, each value will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"...
     * amazing_video_1.m3u8 #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     * 
     * @param audioRenditionSets
     *        List the audio rendition groups that you want included with this video rendition. Use a comma-separated
     *        list. For example, say you want to include the audio rendition groups that have the audio group IDs
     *        "audio_aac_1" and "audio_dolby". Then you would specify this value: "audio_aac_1, audio_dolby". Related
     *        setting: The rendition groups that you include in your comma-separated list should all match values that
     *        you specify in the setting Audio group ID (AudioGroupId) for audio renditions in the same output group as
     *        this video rendition. Default behavior: If you don't specify anything here and for Audio group ID,
     *        MediaConvert puts each audio variant in its own audio rendition group and associates it with every video
     *        variant. Each value in your list appears in your HLS parent manifest in the EXT-X-STREAM-INF tag as the
     *        value for the AUDIO attribute. To continue the previous example, say that the file name for the child
     *        manifest for your video rendition is "amazing_video_1.m3u8". Then, in your parent manifest, each value
     *        will appear on separate lines, like this: #EXT-X-STREAM-INF:AUDIO="audio_aac_1"... amazing_video_1.m3u8
     *        #EXT-X-STREAM-INF:AUDIO="audio_dolby"... amazing_video_1.m3u8
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmfcSettings withAudioRenditionSets(String audioRenditionSets) {
        setAudioRenditionSets(audioRenditionSets);
        return this;
    }

    /**
     * Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the
     * client player selects which audio track to play. The other options for this setting determine the values that
     * MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For
     * more information about these attributes, see the Apple documentation article
     * https://developer.apple.com/documentation
     * /http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose
     * Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES.
     * Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default
     * (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set
     * DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert defaults to Alternate
     * audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose
     * a value for this setting.
     * 
     * @param audioTrackType
     *        Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how
     *        the client player selects which audio track to play. The other options for this setting determine the
     *        values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the
     *        audio variant. For more information about these attributes, see the Apple documentation article
     *        https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/
     *        adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default
     *        (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only
     *        one variant in your output group. Choose Alternate audio, auto select, not default
     *        (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto
     *        Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
     *        defaults to Alternate audio, auto select, default. When there is more than one variant in your output
     *        group, you must explicitly choose a value for this setting.
     * @see CmfcAudioTrackType
     */

    public void setAudioTrackType(String audioTrackType) {
        this.audioTrackType = audioTrackType;
    }

    /**
     * Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the
     * client player selects which audio track to play. The other options for this setting determine the values that
     * MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For
     * more information about these attributes, see the Apple documentation article
     * https://developer.apple.com/documentation
     * /http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose
     * Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES.
     * Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default
     * (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set
     * DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert defaults to Alternate
     * audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose
     * a value for this setting.
     * 
     * @return Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how
     *         the client player selects which audio track to play. The other options for this setting determine the
     *         values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for
     *         the audio variant. For more information about these attributes, see the Apple documentation article
     *         https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/
     *         adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default
     *         (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only
     *         one variant in your output group. Choose Alternate audio, auto select, not default
     *         (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto
     *         Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
     *         defaults to Alternate audio, auto select, default. When there is more than one variant in your output
     *         group, you must explicitly choose a value for this setting.
     * @see CmfcAudioTrackType
     */

    public String getAudioTrackType() {
        return this.audioTrackType;
    }

    /**
     * Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the
     * client player selects which audio track to play. The other options for this setting determine the values that
     * MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For
     * more information about these attributes, see the Apple documentation article
     * https://developer.apple.com/documentation
     * /http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose
     * Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES.
     * Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default
     * (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set
     * DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert defaults to Alternate
     * audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose
     * a value for this setting.
     * 
     * @param audioTrackType
     *        Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how
     *        the client player selects which audio track to play. The other options for this setting determine the
     *        values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the
     *        audio variant. For more information about these attributes, see the Apple documentation article
     *        https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/
     *        adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default
     *        (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only
     *        one variant in your output group. Choose Alternate audio, auto select, not default
     *        (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto
     *        Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
     *        defaults to Alternate audio, auto select, default. When there is more than one variant in your output
     *        group, you must explicitly choose a value for this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcAudioTrackType
     */

    public CmfcSettings withAudioTrackType(String audioTrackType) {
        setAudioTrackType(audioTrackType);
        return this;
    }

    /**
     * Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the
     * client player selects which audio track to play. The other options for this setting determine the values that
     * MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For
     * more information about these attributes, see the Apple documentation article
     * https://developer.apple.com/documentation
     * /http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose
     * Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES.
     * Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default
     * (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set
     * DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert defaults to Alternate
     * audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose
     * a value for this setting.
     * 
     * @param audioTrackType
     *        Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how
     *        the client player selects which audio track to play. The other options for this setting determine the
     *        values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the
     *        audio variant. For more information about these attributes, see the Apple documentation article
     *        https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/
     *        adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default
     *        (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only
     *        one variant in your output group. Choose Alternate audio, auto select, not default
     *        (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto
     *        Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
     *        defaults to Alternate audio, auto select, default. When there is more than one variant in your output
     *        group, you must explicitly choose a value for this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcAudioTrackType
     */

    public CmfcSettings withAudioTrackType(CmfcAudioTrackType audioTrackType) {
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
     * @see CmfcDescriptiveVideoServiceFlag
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
     * @see CmfcDescriptiveVideoServiceFlag
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
     * @see CmfcDescriptiveVideoServiceFlag
     */

    public CmfcSettings withDescriptiveVideoServiceFlag(String descriptiveVideoServiceFlag) {
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
     * @see CmfcDescriptiveVideoServiceFlag
     */

    public CmfcSettings withDescriptiveVideoServiceFlag(CmfcDescriptiveVideoServiceFlag descriptiveVideoServiceFlag) {
        this.descriptiveVideoServiceFlag = descriptiveVideoServiceFlag.toString();
        return this;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for
     * this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @param iFrameOnlyManifest
     *        Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames
     *        for this rendition, in addition to your regular manifest for this rendition. You might use this manifest
     *        as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame
     *        only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame
     *        only child manifest, keep the default value Exclude (EXCLUDE).
     * @see CmfcIFrameOnlyManifest
     */

    public void setIFrameOnlyManifest(String iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for
     * this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @return Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames
     *         for this rendition, in addition to your regular manifest for this rendition. You might use this manifest
     *         as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame
     *         only child manifest and the regular child manifest to the parent manifest. When you don't need the
     *         I-frame only child manifest, keep the default value Exclude (EXCLUDE).
     * @see CmfcIFrameOnlyManifest
     */

    public String getIFrameOnlyManifest() {
        return this.iFrameOnlyManifest;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for
     * this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @param iFrameOnlyManifest
     *        Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames
     *        for this rendition, in addition to your regular manifest for this rendition. You might use this manifest
     *        as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame
     *        only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame
     *        only child manifest, keep the default value Exclude (EXCLUDE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcIFrameOnlyManifest
     */

    public CmfcSettings withIFrameOnlyManifest(String iFrameOnlyManifest) {
        setIFrameOnlyManifest(iFrameOnlyManifest);
        return this;
    }

    /**
     * Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for
     * this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a
     * workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and
     * the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the
     * default value Exclude (EXCLUDE).
     * 
     * @param iFrameOnlyManifest
     *        Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames
     *        for this rendition, in addition to your regular manifest for this rendition. You might use this manifest
     *        as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame
     *        only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame
     *        only child manifest, keep the default value Exclude (EXCLUDE).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcIFrameOnlyManifest
     */

    public CmfcSettings withIFrameOnlyManifest(CmfcIFrameOnlyManifest iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest.toString();
        return this;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @param scte35Esam
     *        Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *        this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *        setting SCC XML (sccXml).
     * @see CmfcScte35Esam
     */

    public void setScte35Esam(String scte35Esam) {
        this.scte35Esam = scte35Esam;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @return Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *         this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *         setting SCC XML (sccXml).
     * @see CmfcScte35Esam
     */

    public String getScte35Esam() {
        return this.scte35Esam;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @param scte35Esam
     *        Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *        this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *        setting SCC XML (sccXml).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcScte35Esam
     */

    public CmfcSettings withScte35Esam(String scte35Esam) {
        setScte35Esam(scte35Esam);
        return this;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @param scte35Esam
     *        Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *        this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *        setting SCC XML (sccXml).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcScte35Esam
     */

    public CmfcSettings withScte35Esam(CmfcScte35Esam scte35Esam) {
        this.scte35Esam = scte35Esam.toString();
        return this;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @param scte35Source
     *        Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *        (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *        None (NONE) if you don't want those SCTE-35 markers in this output.
     * @see CmfcScte35Source
     */

    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @return Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *         (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *         None (NONE) if you don't want those SCTE-35 markers in this output.
     * @see CmfcScte35Source
     */

    public String getScte35Source() {
        return this.scte35Source;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @param scte35Source
     *        Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *        (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *        None (NONE) if you don't want those SCTE-35 markers in this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcScte35Source
     */

    public CmfcSettings withScte35Source(String scte35Source) {
        setScte35Source(scte35Source);
        return this;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @param scte35Source
     *        Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *        (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *        None (NONE) if you don't want those SCTE-35 markers in this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmfcScte35Source
     */

    public CmfcSettings withScte35Source(CmfcScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
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
        if (getAudioDuration() != null)
            sb.append("AudioDuration: ").append(getAudioDuration()).append(",");
        if (getAudioGroupId() != null)
            sb.append("AudioGroupId: ").append(getAudioGroupId()).append(",");
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: ").append(getAudioRenditionSets()).append(",");
        if (getAudioTrackType() != null)
            sb.append("AudioTrackType: ").append(getAudioTrackType()).append(",");
        if (getDescriptiveVideoServiceFlag() != null)
            sb.append("DescriptiveVideoServiceFlag: ").append(getDescriptiveVideoServiceFlag()).append(",");
        if (getIFrameOnlyManifest() != null)
            sb.append("IFrameOnlyManifest: ").append(getIFrameOnlyManifest()).append(",");
        if (getScte35Esam() != null)
            sb.append("Scte35Esam: ").append(getScte35Esam()).append(",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: ").append(getScte35Source());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmfcSettings == false)
            return false;
        CmfcSettings other = (CmfcSettings) obj;
        if (other.getAudioDuration() == null ^ this.getAudioDuration() == null)
            return false;
        if (other.getAudioDuration() != null && other.getAudioDuration().equals(this.getAudioDuration()) == false)
            return false;
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
        if (other.getDescriptiveVideoServiceFlag() == null ^ this.getDescriptiveVideoServiceFlag() == null)
            return false;
        if (other.getDescriptiveVideoServiceFlag() != null && other.getDescriptiveVideoServiceFlag().equals(this.getDescriptiveVideoServiceFlag()) == false)
            return false;
        if (other.getIFrameOnlyManifest() == null ^ this.getIFrameOnlyManifest() == null)
            return false;
        if (other.getIFrameOnlyManifest() != null && other.getIFrameOnlyManifest().equals(this.getIFrameOnlyManifest()) == false)
            return false;
        if (other.getScte35Esam() == null ^ this.getScte35Esam() == null)
            return false;
        if (other.getScte35Esam() != null && other.getScte35Esam().equals(this.getScte35Esam()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null && other.getScte35Source().equals(this.getScte35Source()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDuration() == null) ? 0 : getAudioDuration().hashCode());
        hashCode = prime * hashCode + ((getAudioGroupId() == null) ? 0 : getAudioGroupId().hashCode());
        hashCode = prime * hashCode + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
        hashCode = prime * hashCode + ((getDescriptiveVideoServiceFlag() == null) ? 0 : getDescriptiveVideoServiceFlag().hashCode());
        hashCode = prime * hashCode + ((getIFrameOnlyManifest() == null) ? 0 : getIFrameOnlyManifest().hashCode());
        hashCode = prime * hashCode + ((getScte35Esam() == null) ? 0 : getScte35Esam().hashCode());
        hashCode = prime * hashCode + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        return hashCode;
    }

    @Override
    public CmfcSettings clone() {
        try {
            return (CmfcSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CmfcSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
