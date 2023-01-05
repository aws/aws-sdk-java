/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * These settings relate to the fragmented MP4 container for the segments in your DASH outputs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MpdSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MpdSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements
     * for embedded 608 captions. This markup isn't generally required, but some video players require it to discover
     * and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you
     * enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility
     * schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     */
    private String accessibilityCaptionHints;
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
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     */
    private String captionContainerType;
    /**
     * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert
     * reads KLV metadata present in your input and writes each instance to a separate event message box in the output,
     * according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
     */
    private String klvMetadata;
    /**
     * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest
     * metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same
     * value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element
     * schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set
     * Manifest metadata signaling to Disabled.
     */
    private String manifestMetadataSignaling;
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
     * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify
     * this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of
     * ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE)
     * or leave blank.
     */
    private String timedMetadata;
    /**
     * Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify
     * Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     */
    private String timedMetadataBoxVersion;
    /**
     * Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output. For
     * more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the default value:
     * https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you must also set ID3
     * metadata (timedMetadata) to Passthrough.
     */
    private String timedMetadataSchemeIdUri;
    /**
     * Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value, you must also
     * set ID3 metadata (timedMetadata) to Passthrough.
     */
    private String timedMetadataValue;

    /**
     * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements
     * for embedded 608 captions. This markup isn't generally required, but some video players require it to discover
     * and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you
     * enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility
     * schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * 
     * @param accessibilityCaptionHints
     *        Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility>
     *        elements for embedded 608 captions. This markup isn't generally required, but some video players require
     *        it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these
     *        elements out. When you enable this setting, this is the markup that MediaConvert includes in your
     *        manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * @see MpdAccessibilityCaptionHints
     */

    public void setAccessibilityCaptionHints(String accessibilityCaptionHints) {
        this.accessibilityCaptionHints = accessibilityCaptionHints;
    }

    /**
     * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements
     * for embedded 608 captions. This markup isn't generally required, but some video players require it to discover
     * and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you
     * enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility
     * schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * 
     * @return Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility>
     *         elements for embedded 608 captions. This markup isn't generally required, but some video players require
     *         it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these
     *         elements out. When you enable this setting, this is the markup that MediaConvert includes in your
     *         manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * @see MpdAccessibilityCaptionHints
     */

    public String getAccessibilityCaptionHints() {
        return this.accessibilityCaptionHints;
    }

    /**
     * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements
     * for embedded 608 captions. This markup isn't generally required, but some video players require it to discover
     * and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you
     * enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility
     * schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * 
     * @param accessibilityCaptionHints
     *        Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility>
     *        elements for embedded 608 captions. This markup isn't generally required, but some video players require
     *        it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these
     *        elements out. When you enable this setting, this is the markup that MediaConvert includes in your
     *        manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdAccessibilityCaptionHints
     */

    public MpdSettings withAccessibilityCaptionHints(String accessibilityCaptionHints) {
        setAccessibilityCaptionHints(accessibilityCaptionHints);
        return this;
    }

    /**
     * Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements
     * for embedded 608 captions. This markup isn't generally required, but some video players require it to discover
     * and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you
     * enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility
     * schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * 
     * @param accessibilityCaptionHints
     *        Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility>
     *        elements for embedded 608 captions. This markup isn't generally required, but some video players require
     *        it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these
     *        elements out. When you enable this setting, this is the markup that MediaConvert includes in your
     *        manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdAccessibilityCaptionHints
     */

    public MpdSettings withAccessibilityCaptionHints(MpdAccessibilityCaptionHints accessibilityCaptionHints) {
        this.accessibilityCaptionHints = accessibilityCaptionHints.toString();
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
     * @see MpdAudioDuration
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
     * @see MpdAudioDuration
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
     * @see MpdAudioDuration
     */

    public MpdSettings withAudioDuration(String audioDuration) {
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
     * @see MpdAudioDuration
     */

    public MpdSettings withAudioDuration(MpdAudioDuration audioDuration) {
        this.audioDuration = audioDuration.toString();
        return this;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @param captionContainerType
     *        Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *        sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single
     *        XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *        contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *        audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */

    public void setCaptionContainerType(String captionContainerType) {
        this.captionContainerType = captionContainerType;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @return Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *         sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a
     *         single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *         contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *         audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */

    public String getCaptionContainerType() {
        return this.captionContainerType;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @param captionContainerType
     *        Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *        sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single
     *        XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *        contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *        audio fragmented MP4 files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdCaptionContainerType
     */

    public MpdSettings withCaptionContainerType(String captionContainerType) {
        setCaptionContainerType(captionContainerType);
        return this;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @param captionContainerType
     *        Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *        sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single
     *        XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *        contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *        audio fragmented MP4 files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdCaptionContainerType
     */

    public MpdSettings withCaptionContainerType(MpdCaptionContainerType captionContainerType) {
        this.captionContainerType = captionContainerType.toString();
        return this;
    }

    /**
     * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert
     * reads KLV metadata present in your input and writes each instance to a separate event message box in the output,
     * according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
     * 
     * @param klvMetadata
     *        To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough.
     *        MediaConvert reads KLV metadata present in your input and writes each instance to a separate event message
     *        box in the output, according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to
     *        None or leave blank.
     * @see MpdKlvMetadata
     */

    public void setKlvMetadata(String klvMetadata) {
        this.klvMetadata = klvMetadata;
    }

    /**
     * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert
     * reads KLV metadata present in your input and writes each instance to a separate event message box in the output,
     * according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
     * 
     * @return To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough.
     *         MediaConvert reads KLV metadata present in your input and writes each instance to a separate event
     *         message box in the output, according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata
     *         insertion to None or leave blank.
     * @see MpdKlvMetadata
     */

    public String getKlvMetadata() {
        return this.klvMetadata;
    }

    /**
     * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert
     * reads KLV metadata present in your input and writes each instance to a separate event message box in the output,
     * according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
     * 
     * @param klvMetadata
     *        To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough.
     *        MediaConvert reads KLV metadata present in your input and writes each instance to a separate event message
     *        box in the output, according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to
     *        None or leave blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdKlvMetadata
     */

    public MpdSettings withKlvMetadata(String klvMetadata) {
        setKlvMetadata(klvMetadata);
        return this;
    }

    /**
     * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert
     * reads KLV metadata present in your input and writes each instance to a separate event message box in the output,
     * according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
     * 
     * @param klvMetadata
     *        To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough.
     *        MediaConvert reads KLV metadata present in your input and writes each instance to a separate event message
     *        box in the output, according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to
     *        None or leave blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdKlvMetadata
     */

    public MpdSettings withKlvMetadata(MpdKlvMetadata klvMetadata) {
        this.klvMetadata = klvMetadata.toString();
        return this;
    }

    /**
     * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest
     * metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same
     * value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element
     * schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set
     * Manifest metadata signaling to Disabled.
     * 
     * @param manifestMetadataSignaling
     *        To add an InbandEventStream element in your output MPD manifest for each type of event message, set
     *        Manifest metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri
     *        will be same value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the
     *        InbandEventStream element schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of
     *        your output MPD manifest, set Manifest metadata signaling to Disabled.
     * @see MpdManifestMetadataSignaling
     */

    public void setManifestMetadataSignaling(String manifestMetadataSignaling) {
        this.manifestMetadataSignaling = manifestMetadataSignaling;
    }

    /**
     * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest
     * metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same
     * value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element
     * schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set
     * Manifest metadata signaling to Disabled.
     * 
     * @return To add an InbandEventStream element in your output MPD manifest for each type of event message, set
     *         Manifest metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri
     *         will be same value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the
     *         InbandEventStream element schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of
     *         your output MPD manifest, set Manifest metadata signaling to Disabled.
     * @see MpdManifestMetadataSignaling
     */

    public String getManifestMetadataSignaling() {
        return this.manifestMetadataSignaling;
    }

    /**
     * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest
     * metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same
     * value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element
     * schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set
     * Manifest metadata signaling to Disabled.
     * 
     * @param manifestMetadataSignaling
     *        To add an InbandEventStream element in your output MPD manifest for each type of event message, set
     *        Manifest metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri
     *        will be same value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the
     *        InbandEventStream element schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of
     *        your output MPD manifest, set Manifest metadata signaling to Disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdManifestMetadataSignaling
     */

    public MpdSettings withManifestMetadataSignaling(String manifestMetadataSignaling) {
        setManifestMetadataSignaling(manifestMetadataSignaling);
        return this;
    }

    /**
     * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest
     * metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same
     * value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element
     * schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set
     * Manifest metadata signaling to Disabled.
     * 
     * @param manifestMetadataSignaling
     *        To add an InbandEventStream element in your output MPD manifest for each type of event message, set
     *        Manifest metadata signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri
     *        will be same value that you specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the
     *        InbandEventStream element schemeIdUri will be "urn:scte:scte35:2013:bin". To leave these elements out of
     *        your output MPD manifest, set Manifest metadata signaling to Disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdManifestMetadataSignaling
     */

    public MpdSettings withManifestMetadataSignaling(MpdManifestMetadataSignaling manifestMetadataSignaling) {
        this.manifestMetadataSignaling = manifestMetadataSignaling.toString();
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
     * @see MpdScte35Esam
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
     * @see MpdScte35Esam
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
     * @see MpdScte35Esam
     */

    public MpdSettings withScte35Esam(String scte35Esam) {
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
     * @see MpdScte35Esam
     */

    public MpdSettings withScte35Esam(MpdScte35Esam scte35Esam) {
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
     * @see MpdScte35Source
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
     * @see MpdScte35Source
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
     * @see MpdScte35Source
     */

    public MpdSettings withScte35Source(String scte35Source) {
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
     * @see MpdScte35Source
     */

    public MpdSettings withScte35Source(MpdScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
        return this;
    }

    /**
     * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify
     * this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of
     * ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE)
     * or leave blank.
     * 
     * @param timedMetadata
     *        To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).
     *        Specify this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes
     *        each instance of ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set
     *        ID3 metadata to None (NONE) or leave blank.
     * @see MpdTimedMetadata
     */

    public void setTimedMetadata(String timedMetadata) {
        this.timedMetadata = timedMetadata;
    }

    /**
     * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify
     * this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of
     * ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE)
     * or leave blank.
     * 
     * @return To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).
     *         Specify this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes
     *         each instance of ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set
     *         ID3 metadata to None (NONE) or leave blank.
     * @see MpdTimedMetadata
     */

    public String getTimedMetadata() {
        return this.timedMetadata;
    }

    /**
     * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify
     * this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of
     * ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE)
     * or leave blank.
     * 
     * @param timedMetadata
     *        To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).
     *        Specify this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes
     *        each instance of ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set
     *        ID3 metadata to None (NONE) or leave blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdTimedMetadata
     */

    public MpdSettings withTimedMetadata(String timedMetadata) {
        setTimedMetadata(timedMetadata);
        return this;
    }

    /**
     * To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH). Specify
     * this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes each instance of
     * ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set ID3 metadata to None (NONE)
     * or leave blank.
     * 
     * @param timedMetadata
     *        To include ID3 metadata in this output: Set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).
     *        Specify this ID3 metadata in Custom ID3 metadata inserter (timedMetadataInsertion). MediaConvert writes
     *        each instance of ID3 metadata in a separate Event Message (eMSG) box. To exclude this ID3 metadata: Set
     *        ID3 metadata to None (NONE) or leave blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdTimedMetadata
     */

    public MpdSettings withTimedMetadata(MpdTimedMetadata timedMetadata) {
        this.timedMetadata = timedMetadata.toString();
        return this;
    }

    /**
     * Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify
     * Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataBoxVersion
     *        Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information,
     *        see ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When
     *        you specify Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * @see MpdTimedMetadataBoxVersion
     */

    public void setTimedMetadataBoxVersion(String timedMetadataBoxVersion) {
        this.timedMetadataBoxVersion = timedMetadataBoxVersion;
    }

    /**
     * Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify
     * Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @return Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information,
     *         see ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When
     *         you specify Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * @see MpdTimedMetadataBoxVersion
     */

    public String getTimedMetadataBoxVersion() {
        return this.timedMetadataBoxVersion;
    }

    /**
     * Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify
     * Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataBoxVersion
     *        Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information,
     *        see ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When
     *        you specify Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdTimedMetadataBoxVersion
     */

    public MpdSettings withTimedMetadataBoxVersion(String timedMetadataBoxVersion) {
        setTimedMetadataBoxVersion(timedMetadataBoxVersion);
        return this;
    }

    /**
     * Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When you specify
     * Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataBoxVersion
     *        Specify the event message box (eMSG) version for ID3 timed metadata in your output. For more information,
     *        see ISO/IEC 23009-1:2022 section 5.10.3.3.3 Syntax. Leave blank to use the default value Version 0. When
     *        you specify Version 1, you must also set ID3 metadata (timedMetadata) to Passthrough.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdTimedMetadataBoxVersion
     */

    public MpdSettings withTimedMetadataBoxVersion(MpdTimedMetadataBoxVersion timedMetadataBoxVersion) {
        this.timedMetadataBoxVersion = timedMetadataBoxVersion.toString();
        return this;
    }

    /**
     * Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output. For
     * more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the default value:
     * https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you must also set ID3
     * metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataSchemeIdUri
     *        Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output.
     *        For more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the
     *        default value: https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you
     *        must also set ID3 metadata (timedMetadata) to Passthrough.
     */

    public void setTimedMetadataSchemeIdUri(String timedMetadataSchemeIdUri) {
        this.timedMetadataSchemeIdUri = timedMetadataSchemeIdUri;
    }

    /**
     * Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output. For
     * more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the default value:
     * https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you must also set ID3
     * metadata (timedMetadata) to Passthrough.
     * 
     * @return Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output.
     *         For more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the
     *         default value: https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you
     *         must also set ID3 metadata (timedMetadata) to Passthrough.
     */

    public String getTimedMetadataSchemeIdUri() {
        return this.timedMetadataSchemeIdUri;
    }

    /**
     * Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output. For
     * more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the default value:
     * https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you must also set ID3
     * metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataSchemeIdUri
     *        Specify the event message box (eMSG) scheme ID URI (scheme_id_uri) for ID3 timed metadata in your output.
     *        For more informaiton, see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. Leave blank to use the
     *        default value: https://aomedia.org/emsg/ID3 When you specify a value for ID3 metadata scheme ID URI, you
     *        must also set ID3 metadata (timedMetadata) to Passthrough.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MpdSettings withTimedMetadataSchemeIdUri(String timedMetadataSchemeIdUri) {
        setTimedMetadataSchemeIdUri(timedMetadataSchemeIdUri);
        return this;
    }

    /**
     * Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value, you must also
     * set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataValue
     *        Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton,
     *        see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value,
     *        you must also set ID3 metadata (timedMetadata) to Passthrough.
     */

    public void setTimedMetadataValue(String timedMetadataValue) {
        this.timedMetadataValue = timedMetadataValue;
    }

    /**
     * Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value, you must also
     * set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @return Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton,
     *         see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value,
     *         you must also set ID3 metadata (timedMetadata) to Passthrough.
     */

    public String getTimedMetadataValue() {
        return this.timedMetadataValue;
    }

    /**
     * Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton, see
     * ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value, you must also
     * set ID3 metadata (timedMetadata) to Passthrough.
     * 
     * @param timedMetadataValue
     *        Specify the event message box (eMSG) value for ID3 timed metadata in your output. For more informaiton,
     *        see ISO/IEC 23009-1:2022 section 5.10.3.3.4 Semantics. When you specify a value for ID3 Metadata Value,
     *        you must also set ID3 metadata (timedMetadata) to Passthrough.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MpdSettings withTimedMetadataValue(String timedMetadataValue) {
        setTimedMetadataValue(timedMetadataValue);
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
        if (getAccessibilityCaptionHints() != null)
            sb.append("AccessibilityCaptionHints: ").append(getAccessibilityCaptionHints()).append(",");
        if (getAudioDuration() != null)
            sb.append("AudioDuration: ").append(getAudioDuration()).append(",");
        if (getCaptionContainerType() != null)
            sb.append("CaptionContainerType: ").append(getCaptionContainerType()).append(",");
        if (getKlvMetadata() != null)
            sb.append("KlvMetadata: ").append(getKlvMetadata()).append(",");
        if (getManifestMetadataSignaling() != null)
            sb.append("ManifestMetadataSignaling: ").append(getManifestMetadataSignaling()).append(",");
        if (getScte35Esam() != null)
            sb.append("Scte35Esam: ").append(getScte35Esam()).append(",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: ").append(getScte35Source()).append(",");
        if (getTimedMetadata() != null)
            sb.append("TimedMetadata: ").append(getTimedMetadata()).append(",");
        if (getTimedMetadataBoxVersion() != null)
            sb.append("TimedMetadataBoxVersion: ").append(getTimedMetadataBoxVersion()).append(",");
        if (getTimedMetadataSchemeIdUri() != null)
            sb.append("TimedMetadataSchemeIdUri: ").append(getTimedMetadataSchemeIdUri()).append(",");
        if (getTimedMetadataValue() != null)
            sb.append("TimedMetadataValue: ").append(getTimedMetadataValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MpdSettings == false)
            return false;
        MpdSettings other = (MpdSettings) obj;
        if (other.getAccessibilityCaptionHints() == null ^ this.getAccessibilityCaptionHints() == null)
            return false;
        if (other.getAccessibilityCaptionHints() != null && other.getAccessibilityCaptionHints().equals(this.getAccessibilityCaptionHints()) == false)
            return false;
        if (other.getAudioDuration() == null ^ this.getAudioDuration() == null)
            return false;
        if (other.getAudioDuration() != null && other.getAudioDuration().equals(this.getAudioDuration()) == false)
            return false;
        if (other.getCaptionContainerType() == null ^ this.getCaptionContainerType() == null)
            return false;
        if (other.getCaptionContainerType() != null && other.getCaptionContainerType().equals(this.getCaptionContainerType()) == false)
            return false;
        if (other.getKlvMetadata() == null ^ this.getKlvMetadata() == null)
            return false;
        if (other.getKlvMetadata() != null && other.getKlvMetadata().equals(this.getKlvMetadata()) == false)
            return false;
        if (other.getManifestMetadataSignaling() == null ^ this.getManifestMetadataSignaling() == null)
            return false;
        if (other.getManifestMetadataSignaling() != null && other.getManifestMetadataSignaling().equals(this.getManifestMetadataSignaling()) == false)
            return false;
        if (other.getScte35Esam() == null ^ this.getScte35Esam() == null)
            return false;
        if (other.getScte35Esam() != null && other.getScte35Esam().equals(this.getScte35Esam()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null && other.getScte35Source().equals(this.getScte35Source()) == false)
            return false;
        if (other.getTimedMetadata() == null ^ this.getTimedMetadata() == null)
            return false;
        if (other.getTimedMetadata() != null && other.getTimedMetadata().equals(this.getTimedMetadata()) == false)
            return false;
        if (other.getTimedMetadataBoxVersion() == null ^ this.getTimedMetadataBoxVersion() == null)
            return false;
        if (other.getTimedMetadataBoxVersion() != null && other.getTimedMetadataBoxVersion().equals(this.getTimedMetadataBoxVersion()) == false)
            return false;
        if (other.getTimedMetadataSchemeIdUri() == null ^ this.getTimedMetadataSchemeIdUri() == null)
            return false;
        if (other.getTimedMetadataSchemeIdUri() != null && other.getTimedMetadataSchemeIdUri().equals(this.getTimedMetadataSchemeIdUri()) == false)
            return false;
        if (other.getTimedMetadataValue() == null ^ this.getTimedMetadataValue() == null)
            return false;
        if (other.getTimedMetadataValue() != null && other.getTimedMetadataValue().equals(this.getTimedMetadataValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessibilityCaptionHints() == null) ? 0 : getAccessibilityCaptionHints().hashCode());
        hashCode = prime * hashCode + ((getAudioDuration() == null) ? 0 : getAudioDuration().hashCode());
        hashCode = prime * hashCode + ((getCaptionContainerType() == null) ? 0 : getCaptionContainerType().hashCode());
        hashCode = prime * hashCode + ((getKlvMetadata() == null) ? 0 : getKlvMetadata().hashCode());
        hashCode = prime * hashCode + ((getManifestMetadataSignaling() == null) ? 0 : getManifestMetadataSignaling().hashCode());
        hashCode = prime * hashCode + ((getScte35Esam() == null) ? 0 : getScte35Esam().hashCode());
        hashCode = prime * hashCode + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadata() == null) ? 0 : getTimedMetadata().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataBoxVersion() == null) ? 0 : getTimedMetadataBoxVersion().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataSchemeIdUri() == null) ? 0 : getTimedMetadataSchemeIdUri().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataValue() == null) ? 0 : getTimedMetadataValue().hashCode());
        return hashCode;
    }

    @Override
    public MpdSettings clone() {
        try {
            return (MpdSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MpdSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
