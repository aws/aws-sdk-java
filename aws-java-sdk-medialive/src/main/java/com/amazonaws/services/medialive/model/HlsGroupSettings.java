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
 * Hls Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/HlsGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /** Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs. */
    private java.util.List<String> adMarkers;
    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     */
    private String baseUrlContent;
    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     */
    private String baseUrlManifest;
    /**
     * Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is set to
     * "insert".
     */
    private java.util.List<CaptionLanguageMapping> captionLanguageMappings;
    /**
     * Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at
     * least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you
     * specify. Make sure to specify the languages in the order in which they appear in the original source (if the
     * source is embedded format) or the order of the caption selectors (if the source is other than embedded).
     * Otherwise, languages in the manifest will not match up properly with the output captions. none: Include
     * CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the manifest.
     */
    private String captionLanguageSetting;
    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving
     * media segments for later replay.
     */
    private String clientCache;
    /** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation. */
    private String codecSpecification;
    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If
     * ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
     */
    private String constantIv;
    /** A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled). */
    private OutputLocationRef destination;
    /** Place segments in subdirectories. */
    private String directoryStructure;
    /** Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is desired. */
    private String encryptionType;
    /** Parameters that control interactions with the CDN. */
    private HlsCdnSettings hlsCdnSettings;
    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the
     * Output Selection field).
     * 
     * STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests
     * (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate
     * it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     */
    private String iFrameOnlyPlaylists;
    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After
     * this maximum, older segments are removed from the media manifest. This number must be less than or equal to the
     * Keep Segments field.
     */
    private Integer indexNSegments;
    /** Parameter that control output group behavior on input loss. */
    private String inputLossAction;
    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     */
    private String ivInManifest;
    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment
     * (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
     */
    private String ivSource;
    /**
     * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     * destination directory.
     */
    private Integer keepSegments;
    /**
     * The value specifies how the key is represented in the resource identified by the URI. If parameter is absent, an
     * implicit value of "identity" is used. A reverse DNS string can also be given.
     */
    private String keyFormat;
    /** Either a single positive integer version value or a slash delimited list of version values (1/2/3). */
    private String keyFormatVersions;
    /** The key provider settings. */
    private KeyProviderSettings keyProviderSettings;
    /** When set to gzip, compresses HLS playlist. */
    private String manifestCompression;
    /** Indicates whether the output manifest should use floating point or integer values for segment duration. */
    private String manifestDurationFormat;
    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby
     * avail and extending the segment size if needed.
     */
    private Integer minSegmentLength;
    /**
     * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the
     * number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments,
     * which may prevent players from rewinding all the way to the beginning of the event.
     * 
     * VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     * manifest on completion of the stream.
     */
    private String mode;
    /**
     * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output
     * group.
     * 
     * SEGMENTSONLY: Does not generate any manifests for this output group.
     */
    private String outputSelection;
    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows:
     * either the program date and time are initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the timestampOffset.
     */
    private String programDateTime;
    /** Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds. */
    private Integer programDateTimePeriod;
    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its
     * own media files, then the media files of the other pipeline. This feature allows playout device that support
     * stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale.
     * There are still two destinations and two master manifests, but both master manifests reference the media files
     * from both pipelines.
     * 
     * DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
     * 
     * For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     * MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
     */
    private String redundantManifest;
    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next
     * keyframe after this number of seconds, so actual segment length may be longer.
     */
    private Integer segmentLength;
    /** useInputSegmentation has been deprecated. The configured segment size is always used. */
    private String segmentationMode;
    /**
     * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     * subdirectoryPerStream for this setting to have an effect.
     */
    private Integer segmentsPerSubdirectory;
    /** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest. */
    private String streamInfResolution;
    /** Indicates ID3 frame that has the timecode. */
    private String timedMetadataId3Frame;
    /** Timed Metadata interval in seconds. */
    private Integer timedMetadataId3Period;
    /** Provides an extra millisecond delta offset to fine tune the timestamps. */
    private Integer timestampDeltaMilliseconds;
    /**
     * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     * SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest
     * includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the
     * output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is
     * running is not guaranteed due to HTTP server caching.
     */
    private String tsFileMode;

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * 
     * @return Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * @see HlsAdMarkers
     */

    public java.util.List<String> getAdMarkers() {
        return adMarkers;
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * 
     * @param adMarkers
     *        Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * @see HlsAdMarkers
     */

    public void setAdMarkers(java.util.Collection<String> adMarkers) {
        if (adMarkers == null) {
            this.adMarkers = null;
            return;
        }

        this.adMarkers = new java.util.ArrayList<String>(adMarkers);
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdMarkers(java.util.Collection)} or {@link #withAdMarkers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param adMarkers
     *        Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAdMarkers
     */

    public HlsGroupSettings withAdMarkers(String... adMarkers) {
        if (this.adMarkers == null) {
            setAdMarkers(new java.util.ArrayList<String>(adMarkers.length));
        }
        for (String ele : adMarkers) {
            this.adMarkers.add(ele);
        }
        return this;
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * 
     * @param adMarkers
     *        Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAdMarkers
     */

    public HlsGroupSettings withAdMarkers(java.util.Collection<String> adMarkers) {
        setAdMarkers(adMarkers);
        return this;
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * 
     * @param adMarkers
     *        Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAdMarkers
     */

    public HlsGroupSettings withAdMarkers(HlsAdMarkers... adMarkers) {
        java.util.ArrayList<String> adMarkersCopy = new java.util.ArrayList<String>(adMarkers.length);
        for (HlsAdMarkers value : adMarkers) {
            adMarkersCopy.add(value.toString());
        }
        if (getAdMarkers() == null) {
            setAdMarkers(adMarkersCopy);
        } else {
            getAdMarkers().addAll(adMarkersCopy);
        }
        return this;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     * 
     * @param baseUrlContent
     *        A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base
     *        manifest is delivered from a different URL than the main .m3u8 file.
     */

    public void setBaseUrlContent(String baseUrlContent) {
        this.baseUrlContent = baseUrlContent;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     * 
     * @return A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base
     *         manifest is delivered from a different URL than the main .m3u8 file.
     */

    public String getBaseUrlContent() {
        return this.baseUrlContent;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     * 
     * @param baseUrlContent
     *        A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base
     *        manifest is delivered from a different URL than the main .m3u8 file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withBaseUrlContent(String baseUrlContent) {
        setBaseUrlContent(baseUrlContent);
        return this;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     * 
     * @param baseUrlManifest
     *        A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base
     *        manifest is delivered from a different URL than the main .m3u8 file.
     */

    public void setBaseUrlManifest(String baseUrlManifest) {
        this.baseUrlManifest = baseUrlManifest;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     * 
     * @return A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base
     *         manifest is delivered from a different URL than the main .m3u8 file.
     */

    public String getBaseUrlManifest() {
        return this.baseUrlManifest;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest
     * is delivered from a different URL than the main .m3u8 file.
     * 
     * @param baseUrlManifest
     *        A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base
     *        manifest is delivered from a different URL than the main .m3u8 file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withBaseUrlManifest(String baseUrlManifest) {
        setBaseUrlManifest(baseUrlManifest);
        return this;
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is set to
     * "insert".
     * 
     * @return Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is
     *         set to "insert".
     */

    public java.util.List<CaptionLanguageMapping> getCaptionLanguageMappings() {
        return captionLanguageMappings;
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is set to
     * "insert".
     * 
     * @param captionLanguageMappings
     *        Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is
     *        set to "insert".
     */

    public void setCaptionLanguageMappings(java.util.Collection<CaptionLanguageMapping> captionLanguageMappings) {
        if (captionLanguageMappings == null) {
            this.captionLanguageMappings = null;
            return;
        }

        this.captionLanguageMappings = new java.util.ArrayList<CaptionLanguageMapping>(captionLanguageMappings);
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is set to
     * "insert".
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionLanguageMappings(java.util.Collection)} or
     * {@link #withCaptionLanguageMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param captionLanguageMappings
     *        Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is
     *        set to "insert".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withCaptionLanguageMappings(CaptionLanguageMapping... captionLanguageMappings) {
        if (this.captionLanguageMappings == null) {
            setCaptionLanguageMappings(new java.util.ArrayList<CaptionLanguageMapping>(captionLanguageMappings.length));
        }
        for (CaptionLanguageMapping ele : captionLanguageMappings) {
            this.captionLanguageMappings.add(ele);
        }
        return this;
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is set to
     * "insert".
     * 
     * @param captionLanguageMappings
     *        Mapping of up to 4 caption channels to caption languages. Is only meaningful if captionLanguageSetting is
     *        set to "insert".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withCaptionLanguageMappings(java.util.Collection<CaptionLanguageMapping> captionLanguageMappings) {
        setCaptionLanguageMappings(captionLanguageMappings);
        return this;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at
     * least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you
     * specify. Make sure to specify the languages in the order in which they appear in the original source (if the
     * source is embedded format) or the order of the caption selectors (if the source is other than embedded).
     * Otherwise, languages in the manifest will not match up properly with the output captions. none: Include
     * CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the manifest.
     * 
     * @param captionLanguageSetting
     *        Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest.
     *        Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     *        Language Code you specify. Make sure to specify the languages in the order in which they appear in the
     *        original source (if the source is embedded format) or the order of the caption selectors (if the source is
     *        other than embedded). Otherwise, languages in the manifest will not match up properly with the output
     *        captions. none: Include CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line
     *        from the manifest.
     * @see HlsCaptionLanguageSetting
     */

    public void setCaptionLanguageSetting(String captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at
     * least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you
     * specify. Make sure to specify the languages in the order in which they appear in the original source (if the
     * source is embedded format) or the order of the caption selectors (if the source is other than embedded).
     * Otherwise, languages in the manifest will not match up properly with the output captions. none: Include
     * CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the manifest.
     * 
     * @return Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest.
     *         Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     *         Language Code you specify. Make sure to specify the languages in the order in which they appear in the
     *         original source (if the source is embedded format) or the order of the caption selectors (if the source
     *         is other than embedded). Otherwise, languages in the manifest will not match up properly with the output
     *         captions. none: Include CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line
     *         from the manifest.
     * @see HlsCaptionLanguageSetting
     */

    public String getCaptionLanguageSetting() {
        return this.captionLanguageSetting;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at
     * least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you
     * specify. Make sure to specify the languages in the order in which they appear in the original source (if the
     * source is embedded format) or the order of the caption selectors (if the source is other than embedded).
     * Otherwise, languages in the manifest will not match up properly with the output captions. none: Include
     * CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the manifest.
     * 
     * @param captionLanguageSetting
     *        Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest.
     *        Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     *        Language Code you specify. Make sure to specify the languages in the order in which they appear in the
     *        original source (if the source is embedded format) or the order of the caption selectors (if the source is
     *        other than embedded). Otherwise, languages in the manifest will not match up properly with the output
     *        captions. none: Include CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line
     *        from the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsCaptionLanguageSetting
     */

    public HlsGroupSettings withCaptionLanguageSetting(String captionLanguageSetting) {
        setCaptionLanguageSetting(captionLanguageSetting);
        return this;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at
     * least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you
     * specify. Make sure to specify the languages in the order in which they appear in the original source (if the
     * source is embedded format) or the order of the caption selectors (if the source is other than embedded).
     * Otherwise, languages in the manifest will not match up properly with the output captions. none: Include
     * CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the manifest.
     * 
     * @param captionLanguageSetting
     *        Applies only to 608 Embedded output captions. insert: Include CLOSED-CAPTIONS lines in the manifest.
     *        Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     *        Language Code you specify. Make sure to specify the languages in the order in which they appear in the
     *        original source (if the source is embedded format) or the order of the caption selectors (if the source is
     *        other than embedded). Otherwise, languages in the manifest will not match up properly with the output
     *        captions. none: Include CLOSED-CAPTIONS=NONE line in the manifest. omit: Omit any CLOSED-CAPTIONS line
     *        from the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsCaptionLanguageSetting
     */

    public HlsGroupSettings withCaptionLanguageSetting(HlsCaptionLanguageSetting captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting.toString();
        return this;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving
     * media segments for later replay.
     * 
     * @param clientCache
     *        When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from
     *        saving media segments for later replay.
     * @see HlsClientCache
     */

    public void setClientCache(String clientCache) {
        this.clientCache = clientCache;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving
     * media segments for later replay.
     * 
     * @return When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from
     *         saving media segments for later replay.
     * @see HlsClientCache
     */

    public String getClientCache() {
        return this.clientCache;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving
     * media segments for later replay.
     * 
     * @param clientCache
     *        When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from
     *        saving media segments for later replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsClientCache
     */

    public HlsGroupSettings withClientCache(String clientCache) {
        setClientCache(clientCache);
        return this;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving
     * media segments for later replay.
     * 
     * @param clientCache
     *        When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from
     *        saving media segments for later replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsClientCache
     */

    public HlsGroupSettings withClientCache(HlsClientCache clientCache) {
        this.clientCache = clientCache.toString();
        return this;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @param codecSpecification
     *        Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @see HlsCodecSpecification
     */

    public void setCodecSpecification(String codecSpecification) {
        this.codecSpecification = codecSpecification;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @return Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @see HlsCodecSpecification
     */

    public String getCodecSpecification() {
        return this.codecSpecification;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @param codecSpecification
     *        Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsCodecSpecification
     */

    public HlsGroupSettings withCodecSpecification(String codecSpecification) {
        setCodecSpecification(codecSpecification);
        return this;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @param codecSpecification
     *        Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsCodecSpecification
     */

    public HlsGroupSettings withCodecSpecification(HlsCodecSpecification codecSpecification) {
        this.codecSpecification = codecSpecification.toString();
        return this;
    }

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If
     * ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
     * 
     * @param constantIv
     *        For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text
     *        string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for
     *        encryption.
     */

    public void setConstantIv(String constantIv) {
        this.constantIv = constantIv;
    }

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If
     * ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
     * 
     * @return For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text
     *         string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for
     *         encryption.
     */

    public String getConstantIv() {
        return this.constantIv;
    }

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If
     * ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
     * 
     * @param constantIv
     *        For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text
     *        string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withConstantIv(String constantIv) {
        setConstantIv(constantIv);
        return this;
    }

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
     * 
     * @param destination
     *        A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
     */

    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
     * 
     * @return A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
     */

    public OutputLocationRef getDestination() {
        return this.destination;
    }

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
     * 
     * @param destination
     *        A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withDestination(OutputLocationRef destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Place segments in subdirectories.
     * 
     * @param directoryStructure
     *        Place segments in subdirectories.
     * @see HlsDirectoryStructure
     */

    public void setDirectoryStructure(String directoryStructure) {
        this.directoryStructure = directoryStructure;
    }

    /**
     * Place segments in subdirectories.
     * 
     * @return Place segments in subdirectories.
     * @see HlsDirectoryStructure
     */

    public String getDirectoryStructure() {
        return this.directoryStructure;
    }

    /**
     * Place segments in subdirectories.
     * 
     * @param directoryStructure
     *        Place segments in subdirectories.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsDirectoryStructure
     */

    public HlsGroupSettings withDirectoryStructure(String directoryStructure) {
        setDirectoryStructure(directoryStructure);
        return this;
    }

    /**
     * Place segments in subdirectories.
     * 
     * @param directoryStructure
     *        Place segments in subdirectories.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsDirectoryStructure
     */

    public HlsGroupSettings withDirectoryStructure(HlsDirectoryStructure directoryStructure) {
        this.directoryStructure = directoryStructure.toString();
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is desired.
     * 
     * @param encryptionType
     *        Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is
     *        desired.
     * @see HlsEncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is desired.
     * 
     * @return Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is
     *         desired.
     * @see HlsEncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is desired.
     * 
     * @param encryptionType
     *        Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is
     *        desired.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsEncryptionType
     */

    public HlsGroupSettings withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is desired.
     * 
     * @param encryptionType
     *        Encrypts the segments with the given encryption scheme. Exclude this parameter if no encryption is
     *        desired.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsEncryptionType
     */

    public HlsGroupSettings withEncryptionType(HlsEncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * Parameters that control interactions with the CDN.
     * 
     * @param hlsCdnSettings
     *        Parameters that control interactions with the CDN.
     */

    public void setHlsCdnSettings(HlsCdnSettings hlsCdnSettings) {
        this.hlsCdnSettings = hlsCdnSettings;
    }

    /**
     * Parameters that control interactions with the CDN.
     * 
     * @return Parameters that control interactions with the CDN.
     */

    public HlsCdnSettings getHlsCdnSettings() {
        return this.hlsCdnSettings;
    }

    /**
     * Parameters that control interactions with the CDN.
     * 
     * @param hlsCdnSettings
     *        Parameters that control interactions with the CDN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withHlsCdnSettings(HlsCdnSettings hlsCdnSettings) {
        setHlsCdnSettings(hlsCdnSettings);
        return this;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the
     * Output Selection field).
     * 
     * STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests
     * (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate
     * it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * 
     * @param iFrameOnlyPlaylists
     *        DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according
     *        to the Output Selection field).
     * 
     *        STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other
     *        manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *        tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame
     *        position. For example, #EXT-X-BYTERANGE:160364@1461888"
     * @see IFrameOnlyPlaylistType
     */

    public void setIFrameOnlyPlaylists(String iFrameOnlyPlaylists) {
        this.iFrameOnlyPlaylists = iFrameOnlyPlaylists;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the
     * Output Selection field).
     * 
     * STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests
     * (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate
     * it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * 
     * @return DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according
     *         to the Output Selection field).
     * 
     *         STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other
     *         manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *         tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame
     *         position. For example, #EXT-X-BYTERANGE:160364@1461888"
     * @see IFrameOnlyPlaylistType
     */

    public String getIFrameOnlyPlaylists() {
        return this.iFrameOnlyPlaylists;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the
     * Output Selection field).
     * 
     * STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests
     * (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate
     * it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * 
     * @param iFrameOnlyPlaylists
     *        DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according
     *        to the Output Selection field).
     * 
     *        STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other
     *        manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *        tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame
     *        position. For example, #EXT-X-BYTERANGE:160364@1461888"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IFrameOnlyPlaylistType
     */

    public HlsGroupSettings withIFrameOnlyPlaylists(String iFrameOnlyPlaylists) {
        setIFrameOnlyPlaylists(iFrameOnlyPlaylists);
        return this;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the
     * Output Selection field).
     * 
     * STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests
     * (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate
     * it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * 
     * @param iFrameOnlyPlaylists
     *        DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according
     *        to the Output Selection field).
     * 
     *        STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other
     *        manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *        tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame
     *        position. For example, #EXT-X-BYTERANGE:160364@1461888"
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IFrameOnlyPlaylistType
     */

    public HlsGroupSettings withIFrameOnlyPlaylists(IFrameOnlyPlaylistType iFrameOnlyPlaylists) {
        this.iFrameOnlyPlaylists = iFrameOnlyPlaylists.toString();
        return this;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After
     * this maximum, older segments are removed from the media manifest. This number must be less than or equal to the
     * Keep Segments field.
     * 
     * @param indexNSegments
     *        Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file.
     *        After this maximum, older segments are removed from the media manifest. This number must be less than or
     *        equal to the Keep Segments field.
     */

    public void setIndexNSegments(Integer indexNSegments) {
        this.indexNSegments = indexNSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After
     * this maximum, older segments are removed from the media manifest. This number must be less than or equal to the
     * Keep Segments field.
     * 
     * @return Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file.
     *         After this maximum, older segments are removed from the media manifest. This number must be less than or
     *         equal to the Keep Segments field.
     */

    public Integer getIndexNSegments() {
        return this.indexNSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After
     * this maximum, older segments are removed from the media manifest. This number must be less than or equal to the
     * Keep Segments field.
     * 
     * @param indexNSegments
     *        Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file.
     *        After this maximum, older segments are removed from the media manifest. This number must be less than or
     *        equal to the Keep Segments field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withIndexNSegments(Integer indexNSegments) {
        setIndexNSegments(indexNSegments);
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @param inputLossAction
     *        Parameter that control output group behavior on input loss.
     * @see InputLossActionForHlsOut
     */

    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @return Parameter that control output group behavior on input loss.
     * @see InputLossActionForHlsOut
     */

    public String getInputLossAction() {
        return this.inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @param inputLossAction
     *        Parameter that control output group behavior on input loss.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForHlsOut
     */

    public HlsGroupSettings withInputLossAction(String inputLossAction) {
        setInputLossAction(inputLossAction);
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @param inputLossAction
     *        Parameter that control output group behavior on input loss.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForHlsOut
     */

    public HlsGroupSettings withInputLossAction(InputLossActionForHlsOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * 
     * @param ivInManifest
     *        For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *        the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not
     *        in the manifest.
     * @see HlsIvInManifest
     */

    public void setIvInManifest(String ivInManifest) {
        this.ivInManifest = ivInManifest;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * 
     * @return For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *         the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not
     *         in the manifest.
     * @see HlsIvInManifest
     */

    public String getIvInManifest() {
        return this.ivInManifest;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * 
     * @param ivInManifest
     *        For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *        the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not
     *        in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIvInManifest
     */

    public HlsGroupSettings withIvInManifest(String ivInManifest) {
        setIvInManifest(ivInManifest);
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * 
     * @param ivInManifest
     *        For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *        the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not
     *        in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIvInManifest
     */

    public HlsGroupSettings withIvInManifest(HlsIvInManifest ivInManifest) {
        this.ivInManifest = ivInManifest.toString();
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment
     * (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
     * 
     * @param ivSource
     *        For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *        the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change
     *        every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv
     *        value.
     * @see HlsIvSource
     */

    public void setIvSource(String ivSource) {
        this.ivSource = ivSource;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment
     * (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
     * 
     * @return For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *         the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change
     *         every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv
     *         value.
     * @see HlsIvSource
     */

    public String getIvSource() {
        return this.ivSource;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment
     * (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
     * 
     * @param ivSource
     *        For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *        the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change
     *        every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIvSource
     */

    public HlsGroupSettings withIvSource(String ivSource) {
        setIvSource(ivSource);
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key
     * for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment
     * (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
     * 
     * @param ivSource
     *        For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with
     *        the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change
     *        every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIvSource
     */

    public HlsGroupSettings withIvSource(HlsIvSource ivSource) {
        this.ivSource = ivSource.toString();
        return this;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     * destination directory.
     * 
     * @param keepSegments
     *        Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     *        destination directory.
     */

    public void setKeepSegments(Integer keepSegments) {
        this.keepSegments = keepSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     * destination directory.
     * 
     * @return Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     *         destination directory.
     */

    public Integer getKeepSegments() {
        return this.keepSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     * destination directory.
     * 
     * @param keepSegments
     *        Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the
     *        destination directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withKeepSegments(Integer keepSegments) {
        setKeepSegments(keepSegments);
        return this;
    }

    /**
     * The value specifies how the key is represented in the resource identified by the URI. If parameter is absent, an
     * implicit value of "identity" is used. A reverse DNS string can also be given.
     * 
     * @param keyFormat
     *        The value specifies how the key is represented in the resource identified by the URI. If parameter is
     *        absent, an implicit value of "identity" is used. A reverse DNS string can also be given.
     */

    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    /**
     * The value specifies how the key is represented in the resource identified by the URI. If parameter is absent, an
     * implicit value of "identity" is used. A reverse DNS string can also be given.
     * 
     * @return The value specifies how the key is represented in the resource identified by the URI. If parameter is
     *         absent, an implicit value of "identity" is used. A reverse DNS string can also be given.
     */

    public String getKeyFormat() {
        return this.keyFormat;
    }

    /**
     * The value specifies how the key is represented in the resource identified by the URI. If parameter is absent, an
     * implicit value of "identity" is used. A reverse DNS string can also be given.
     * 
     * @param keyFormat
     *        The value specifies how the key is represented in the resource identified by the URI. If parameter is
     *        absent, an implicit value of "identity" is used. A reverse DNS string can also be given.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withKeyFormat(String keyFormat) {
        setKeyFormat(keyFormat);
        return this;
    }

    /**
     * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
     * 
     * @param keyFormatVersions
     *        Either a single positive integer version value or a slash delimited list of version values (1/2/3).
     */

    public void setKeyFormatVersions(String keyFormatVersions) {
        this.keyFormatVersions = keyFormatVersions;
    }

    /**
     * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
     * 
     * @return Either a single positive integer version value or a slash delimited list of version values (1/2/3).
     */

    public String getKeyFormatVersions() {
        return this.keyFormatVersions;
    }

    /**
     * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
     * 
     * @param keyFormatVersions
     *        Either a single positive integer version value or a slash delimited list of version values (1/2/3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withKeyFormatVersions(String keyFormatVersions) {
        setKeyFormatVersions(keyFormatVersions);
        return this;
    }

    /**
     * The key provider settings.
     * 
     * @param keyProviderSettings
     *        The key provider settings.
     */

    public void setKeyProviderSettings(KeyProviderSettings keyProviderSettings) {
        this.keyProviderSettings = keyProviderSettings;
    }

    /**
     * The key provider settings.
     * 
     * @return The key provider settings.
     */

    public KeyProviderSettings getKeyProviderSettings() {
        return this.keyProviderSettings;
    }

    /**
     * The key provider settings.
     * 
     * @param keyProviderSettings
     *        The key provider settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withKeyProviderSettings(KeyProviderSettings keyProviderSettings) {
        setKeyProviderSettings(keyProviderSettings);
        return this;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * 
     * @param manifestCompression
     *        When set to gzip, compresses HLS playlist.
     * @see HlsManifestCompression
     */

    public void setManifestCompression(String manifestCompression) {
        this.manifestCompression = manifestCompression;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * 
     * @return When set to gzip, compresses HLS playlist.
     * @see HlsManifestCompression
     */

    public String getManifestCompression() {
        return this.manifestCompression;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * 
     * @param manifestCompression
     *        When set to gzip, compresses HLS playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsManifestCompression
     */

    public HlsGroupSettings withManifestCompression(String manifestCompression) {
        setManifestCompression(manifestCompression);
        return this;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * 
     * @param manifestCompression
     *        When set to gzip, compresses HLS playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsManifestCompression
     */

    public HlsGroupSettings withManifestCompression(HlsManifestCompression manifestCompression) {
        this.manifestCompression = manifestCompression.toString();
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point or integer values for segment duration.
     * 
     * @param manifestDurationFormat
     *        Indicates whether the output manifest should use floating point or integer values for segment duration.
     * @see HlsManifestDurationFormat
     */

    public void setManifestDurationFormat(String manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point or integer values for segment duration.
     * 
     * @return Indicates whether the output manifest should use floating point or integer values for segment duration.
     * @see HlsManifestDurationFormat
     */

    public String getManifestDurationFormat() {
        return this.manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point or integer values for segment duration.
     * 
     * @param manifestDurationFormat
     *        Indicates whether the output manifest should use floating point or integer values for segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsManifestDurationFormat
     */

    public HlsGroupSettings withManifestDurationFormat(String manifestDurationFormat) {
        setManifestDurationFormat(manifestDurationFormat);
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point or integer values for segment duration.
     * 
     * @param manifestDurationFormat
     *        Indicates whether the output manifest should use floating point or integer values for segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsManifestDurationFormat
     */

    public HlsGroupSettings withManifestDurationFormat(HlsManifestDurationFormat manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat.toString();
        return this;
    }

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby
     * avail and extending the segment size if needed.
     * 
     * @param minSegmentLength
     *        When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a
     *        nearby avail and extending the segment size if needed.
     */

    public void setMinSegmentLength(Integer minSegmentLength) {
        this.minSegmentLength = minSegmentLength;
    }

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby
     * avail and extending the segment size if needed.
     * 
     * @return When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a
     *         nearby avail and extending the segment size if needed.
     */

    public Integer getMinSegmentLength() {
        return this.minSegmentLength;
    }

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby
     * avail and extending the segment size if needed.
     * 
     * @param minSegmentLength
     *        When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a
     *        nearby avail and extending the segment size if needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withMinSegmentLength(Integer minSegmentLength) {
        setMinSegmentLength(minSegmentLength);
        return this;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the
     * number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments,
     * which may prevent players from rewinding all the way to the beginning of the event.
     * 
     * VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     * manifest on completion of the stream.
     * 
     * @param mode
     *        If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only
     *        the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older
     *        segments, which may prevent players from rewinding all the way to the beginning of the event.
     * 
     *        VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     *        manifest on completion of the stream.
     * @see HlsMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the
     * number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments,
     * which may prevent players from rewinding all the way to the beginning of the event.
     * 
     * VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     * manifest on completion of the stream.
     * 
     * @return If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only
     *         the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older
     *         segments, which may prevent players from rewinding all the way to the beginning of the event.
     * 
     *         VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD"
     *         type manifest on completion of the stream.
     * @see HlsMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the
     * number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments,
     * which may prevent players from rewinding all the way to the beginning of the event.
     * 
     * VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     * manifest on completion of the stream.
     * 
     * @param mode
     *        If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only
     *        the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older
     *        segments, which may prevent players from rewinding all the way to the beginning of the event.
     * 
     *        VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     *        manifest on completion of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsMode
     */

    public HlsGroupSettings withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the
     * number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments,
     * which may prevent players from rewinding all the way to the beginning of the event.
     * 
     * VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     * manifest on completion of the stream.
     * 
     * @param mode
     *        If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only
     *        the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older
     *        segments, which may prevent players from rewinding all the way to the beginning of the event.
     * 
     *        VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type
     *        manifest on completion of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsMode
     */

    public HlsGroupSettings withMode(HlsMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output
     * group.
     * 
     * SEGMENTSONLY: Does not generate any manifests for this output group.
     * 
     * @param outputSelection
     *        MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this
     *        output group.
     * 
     *        SEGMENTSONLY: Does not generate any manifests for this output group.
     * @see HlsOutputSelection
     */

    public void setOutputSelection(String outputSelection) {
        this.outputSelection = outputSelection;
    }

    /**
     * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output
     * group.
     * 
     * SEGMENTSONLY: Does not generate any manifests for this output group.
     * 
     * @return MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this
     *         output group.
     * 
     *         SEGMENTSONLY: Does not generate any manifests for this output group.
     * @see HlsOutputSelection
     */

    public String getOutputSelection() {
        return this.outputSelection;
    }

    /**
     * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output
     * group.
     * 
     * SEGMENTSONLY: Does not generate any manifests for this output group.
     * 
     * @param outputSelection
     *        MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this
     *        output group.
     * 
     *        SEGMENTSONLY: Does not generate any manifests for this output group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsOutputSelection
     */

    public HlsGroupSettings withOutputSelection(String outputSelection) {
        setOutputSelection(outputSelection);
        return this;
    }

    /**
     * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output
     * group.
     * 
     * SEGMENTSONLY: Does not generate any manifests for this output group.
     * 
     * @param outputSelection
     *        MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this
     *        output group.
     * 
     *        SEGMENTSONLY: Does not generate any manifests for this output group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsOutputSelection
     */

    public HlsGroupSettings withOutputSelection(HlsOutputSelection outputSelection) {
        this.outputSelection = outputSelection.toString();
        return this;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows:
     * either the program date and time are initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the timestampOffset.
     * 
     * @param programDateTime
     *        Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as
     *        follows: either the program date and time are initialized using the input timecode source, or the time is
     *        initialized using the input timecode source and the date is initialized using the timestampOffset.
     * @see HlsProgramDateTime
     */

    public void setProgramDateTime(String programDateTime) {
        this.programDateTime = programDateTime;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows:
     * either the program date and time are initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the timestampOffset.
     * 
     * @return Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as
     *         follows: either the program date and time are initialized using the input timecode source, or the time is
     *         initialized using the input timecode source and the date is initialized using the timestampOffset.
     * @see HlsProgramDateTime
     */

    public String getProgramDateTime() {
        return this.programDateTime;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows:
     * either the program date and time are initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the timestampOffset.
     * 
     * @param programDateTime
     *        Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as
     *        follows: either the program date and time are initialized using the input timecode source, or the time is
     *        initialized using the input timecode source and the date is initialized using the timestampOffset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsProgramDateTime
     */

    public HlsGroupSettings withProgramDateTime(String programDateTime) {
        setProgramDateTime(programDateTime);
        return this;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows:
     * either the program date and time are initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the timestampOffset.
     * 
     * @param programDateTime
     *        Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as
     *        follows: either the program date and time are initialized using the input timecode source, or the time is
     *        initialized using the input timecode source and the date is initialized using the timestampOffset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsProgramDateTime
     */

    public HlsGroupSettings withProgramDateTime(HlsProgramDateTime programDateTime) {
        this.programDateTime = programDateTime.toString();
        return this;
    }

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * 
     * @param programDateTimePeriod
     *        Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     */

    public void setProgramDateTimePeriod(Integer programDateTimePeriod) {
        this.programDateTimePeriod = programDateTimePeriod;
    }

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * 
     * @return Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     */

    public Integer getProgramDateTimePeriod() {
        return this.programDateTimePeriod;
    }

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * 
     * @param programDateTimePeriod
     *        Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withProgramDateTimePeriod(Integer programDateTimePeriod) {
        setProgramDateTimePeriod(programDateTimePeriod);
        return this;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its
     * own media files, then the media files of the other pipeline. This feature allows playout device that support
     * stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale.
     * There are still two destinations and two master manifests, but both master manifests reference the media files
     * from both pipelines.
     * 
     * DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
     * 
     * For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     * MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
     * 
     * @param redundantManifest
     *        ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines:
     *        first its own media files, then the media files of the other pipeline. This feature allows playout device
     *        that support stale manifest detection to switch from one manifest to the other, when the current manifest
     *        seems to be stale. There are still two destinations and two master manifests, but both master manifests
     *        reference the media files from both pipelines.
     * 
     *        DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline
     *        only.
     * 
     *        For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     *        MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is
     *        irrelevant.
     * @see HlsRedundantManifest
     */

    public void setRedundantManifest(String redundantManifest) {
        this.redundantManifest = redundantManifest;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its
     * own media files, then the media files of the other pipeline. This feature allows playout device that support
     * stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale.
     * There are still two destinations and two master manifests, but both master manifests reference the media files
     * from both pipelines.
     * 
     * DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
     * 
     * For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     * MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
     * 
     * @return ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines:
     *         first its own media files, then the media files of the other pipeline. This feature allows playout device
     *         that support stale manifest detection to switch from one manifest to the other, when the current manifest
     *         seems to be stale. There are still two destinations and two master manifests, but both master manifests
     *         reference the media files from both pipelines.
     * 
     *         DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline
     *         only.
     * 
     *         For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     *         MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is
     *         irrelevant.
     * @see HlsRedundantManifest
     */

    public String getRedundantManifest() {
        return this.redundantManifest;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its
     * own media files, then the media files of the other pipeline. This feature allows playout device that support
     * stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale.
     * There are still two destinations and two master manifests, but both master manifests reference the media files
     * from both pipelines.
     * 
     * DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
     * 
     * For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     * MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
     * 
     * @param redundantManifest
     *        ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines:
     *        first its own media files, then the media files of the other pipeline. This feature allows playout device
     *        that support stale manifest detection to switch from one manifest to the other, when the current manifest
     *        seems to be stale. There are still two destinations and two master manifests, but both master manifests
     *        reference the media files from both pipelines.
     * 
     *        DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline
     *        only.
     * 
     *        For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     *        MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is
     *        irrelevant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsRedundantManifest
     */

    public HlsGroupSettings withRedundantManifest(String redundantManifest) {
        setRedundantManifest(redundantManifest);
        return this;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its
     * own media files, then the media files of the other pipeline. This feature allows playout device that support
     * stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale.
     * There are still two destinations and two master manifests, but both master manifests reference the media files
     * from both pipelines.
     * 
     * DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
     * 
     * For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     * MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
     * 
     * @param redundantManifest
     *        ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines:
     *        first its own media files, then the media files of the other pipeline. This feature allows playout device
     *        that support stale manifest detection to switch from one manifest to the other, when the current manifest
     *        seems to be stale. There are still two destinations and two master manifests, but both master manifests
     *        reference the media files from both pipelines.
     * 
     *        DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline
     *        only.
     * 
     *        For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed.
     *        MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is
     *        irrelevant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsRedundantManifest
     */

    public HlsGroupSettings withRedundantManifest(HlsRedundantManifest redundantManifest) {
        this.redundantManifest = redundantManifest.toString();
        return this;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next
     * keyframe after this number of seconds, so actual segment length may be longer.
     * 
     * @param segmentLength
     *        Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next
     *        keyframe after this number of seconds, so actual segment length may be longer.
     */

    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next
     * keyframe after this number of seconds, so actual segment length may be longer.
     * 
     * @return Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the
     *         next keyframe after this number of seconds, so actual segment length may be longer.
     */

    public Integer getSegmentLength() {
        return this.segmentLength;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next
     * keyframe after this number of seconds, so actual segment length may be longer.
     * 
     * @param segmentLength
     *        Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next
     *        keyframe after this number of seconds, so actual segment length may be longer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withSegmentLength(Integer segmentLength) {
        setSegmentLength(segmentLength);
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @param segmentationMode
     *        useInputSegmentation has been deprecated. The configured segment size is always used.
     * @see HlsSegmentationMode
     */

    public void setSegmentationMode(String segmentationMode) {
        this.segmentationMode = segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @return useInputSegmentation has been deprecated. The configured segment size is always used.
     * @see HlsSegmentationMode
     */

    public String getSegmentationMode() {
        return this.segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @param segmentationMode
     *        useInputSegmentation has been deprecated. The configured segment size is always used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsSegmentationMode
     */

    public HlsGroupSettings withSegmentationMode(String segmentationMode) {
        setSegmentationMode(segmentationMode);
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @param segmentationMode
     *        useInputSegmentation has been deprecated. The configured segment size is always used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsSegmentationMode
     */

    public HlsGroupSettings withSegmentationMode(HlsSegmentationMode segmentationMode) {
        this.segmentationMode = segmentationMode.toString();
        return this;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     * subdirectoryPerStream for this setting to have an effect.
     * 
     * @param segmentsPerSubdirectory
     *        Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     *        subdirectoryPerStream for this setting to have an effect.
     */

    public void setSegmentsPerSubdirectory(Integer segmentsPerSubdirectory) {
        this.segmentsPerSubdirectory = segmentsPerSubdirectory;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     * subdirectoryPerStream for this setting to have an effect.
     * 
     * @return Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     *         subdirectoryPerStream for this setting to have an effect.
     */

    public Integer getSegmentsPerSubdirectory() {
        return this.segmentsPerSubdirectory;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     * subdirectoryPerStream for this setting to have an effect.
     * 
     * @param segmentsPerSubdirectory
     *        Number of segments to write to a subdirectory before starting a new one. directoryStructure must be
     *        subdirectoryPerStream for this setting to have an effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withSegmentsPerSubdirectory(Integer segmentsPerSubdirectory) {
        setSegmentsPerSubdirectory(segmentsPerSubdirectory);
        return this;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @param streamInfResolution
     *        Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @see HlsStreamInfResolution
     */

    public void setStreamInfResolution(String streamInfResolution) {
        this.streamInfResolution = streamInfResolution;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @return Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @see HlsStreamInfResolution
     */

    public String getStreamInfResolution() {
        return this.streamInfResolution;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @param streamInfResolution
     *        Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsStreamInfResolution
     */

    public HlsGroupSettings withStreamInfResolution(String streamInfResolution) {
        setStreamInfResolution(streamInfResolution);
        return this;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @param streamInfResolution
     *        Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsStreamInfResolution
     */

    public HlsGroupSettings withStreamInfResolution(HlsStreamInfResolution streamInfResolution) {
        this.streamInfResolution = streamInfResolution.toString();
        return this;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @param timedMetadataId3Frame
     *        Indicates ID3 frame that has the timecode.
     * @see HlsTimedMetadataId3Frame
     */

    public void setTimedMetadataId3Frame(String timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @return Indicates ID3 frame that has the timecode.
     * @see HlsTimedMetadataId3Frame
     */

    public String getTimedMetadataId3Frame() {
        return this.timedMetadataId3Frame;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @param timedMetadataId3Frame
     *        Indicates ID3 frame that has the timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsTimedMetadataId3Frame
     */

    public HlsGroupSettings withTimedMetadataId3Frame(String timedMetadataId3Frame) {
        setTimedMetadataId3Frame(timedMetadataId3Frame);
        return this;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     * @param timedMetadataId3Frame
     *        Indicates ID3 frame that has the timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsTimedMetadataId3Frame
     */

    public HlsGroupSettings withTimedMetadataId3Frame(HlsTimedMetadataId3Frame timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame.toString();
        return this;
    }

    /**
     * Timed Metadata interval in seconds.
     * 
     * @param timedMetadataId3Period
     *        Timed Metadata interval in seconds.
     */

    public void setTimedMetadataId3Period(Integer timedMetadataId3Period) {
        this.timedMetadataId3Period = timedMetadataId3Period;
    }

    /**
     * Timed Metadata interval in seconds.
     * 
     * @return Timed Metadata interval in seconds.
     */

    public Integer getTimedMetadataId3Period() {
        return this.timedMetadataId3Period;
    }

    /**
     * Timed Metadata interval in seconds.
     * 
     * @param timedMetadataId3Period
     *        Timed Metadata interval in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withTimedMetadataId3Period(Integer timedMetadataId3Period) {
        setTimedMetadataId3Period(timedMetadataId3Period);
        return this;
    }

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * 
     * @param timestampDeltaMilliseconds
     *        Provides an extra millisecond delta offset to fine tune the timestamps.
     */

    public void setTimestampDeltaMilliseconds(Integer timestampDeltaMilliseconds) {
        this.timestampDeltaMilliseconds = timestampDeltaMilliseconds;
    }

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * 
     * @return Provides an extra millisecond delta offset to fine tune the timestamps.
     */

    public Integer getTimestampDeltaMilliseconds() {
        return this.timestampDeltaMilliseconds;
    }

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * 
     * @param timestampDeltaMilliseconds
     *        Provides an extra millisecond delta offset to fine tune the timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsGroupSettings withTimestampDeltaMilliseconds(Integer timestampDeltaMilliseconds) {
        setTimestampDeltaMilliseconds(timestampDeltaMilliseconds);
        return this;
    }

    /**
     * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     * SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest
     * includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the
     * output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is
     * running is not guaranteed due to HTTP server caching.
     * 
     * @param tsFileMode
     *        SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     *        SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media
     *        manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is
     *        when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback
     *        while the channel is running is not guaranteed due to HTTP server caching.
     * @see HlsTsFileMode
     */

    public void setTsFileMode(String tsFileMode) {
        this.tsFileMode = tsFileMode;
    }

    /**
     * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     * SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest
     * includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the
     * output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is
     * running is not guaranteed due to HTTP server caching.
     * 
     * @return SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     *         SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media
     *         manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is
     *         when sending the output to AWS Elemental MediaConvert, which can accept only a single media file.
     *         Playback while the channel is running is not guaranteed due to HTTP server caching.
     * @see HlsTsFileMode
     */

    public String getTsFileMode() {
        return this.tsFileMode;
    }

    /**
     * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     * SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest
     * includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the
     * output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is
     * running is not guaranteed due to HTTP server caching.
     * 
     * @param tsFileMode
     *        SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     *        SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media
     *        manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is
     *        when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback
     *        while the channel is running is not guaranteed due to HTTP server caching.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsTsFileMode
     */

    public HlsGroupSettings withTsFileMode(String tsFileMode) {
        setTsFileMode(tsFileMode);
        return this;
    }

    /**
     * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     * SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest
     * includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the
     * output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is
     * running is not guaranteed due to HTTP server caching.
     * 
     * @param tsFileMode
     *        SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
     * 
     *        SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media
     *        manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is
     *        when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback
     *        while the channel is running is not guaranteed due to HTTP server caching.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsTsFileMode
     */

    public HlsGroupSettings withTsFileMode(HlsTsFileMode tsFileMode) {
        this.tsFileMode = tsFileMode.toString();
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
        if (getAdMarkers() != null)
            sb.append("AdMarkers: ").append(getAdMarkers()).append(",");
        if (getBaseUrlContent() != null)
            sb.append("BaseUrlContent: ").append(getBaseUrlContent()).append(",");
        if (getBaseUrlManifest() != null)
            sb.append("BaseUrlManifest: ").append(getBaseUrlManifest()).append(",");
        if (getCaptionLanguageMappings() != null)
            sb.append("CaptionLanguageMappings: ").append(getCaptionLanguageMappings()).append(",");
        if (getCaptionLanguageSetting() != null)
            sb.append("CaptionLanguageSetting: ").append(getCaptionLanguageSetting()).append(",");
        if (getClientCache() != null)
            sb.append("ClientCache: ").append(getClientCache()).append(",");
        if (getCodecSpecification() != null)
            sb.append("CodecSpecification: ").append(getCodecSpecification()).append(",");
        if (getConstantIv() != null)
            sb.append("ConstantIv: ").append(getConstantIv()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDirectoryStructure() != null)
            sb.append("DirectoryStructure: ").append(getDirectoryStructure()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getHlsCdnSettings() != null)
            sb.append("HlsCdnSettings: ").append(getHlsCdnSettings()).append(",");
        if (getIFrameOnlyPlaylists() != null)
            sb.append("IFrameOnlyPlaylists: ").append(getIFrameOnlyPlaylists()).append(",");
        if (getIndexNSegments() != null)
            sb.append("IndexNSegments: ").append(getIndexNSegments()).append(",");
        if (getInputLossAction() != null)
            sb.append("InputLossAction: ").append(getInputLossAction()).append(",");
        if (getIvInManifest() != null)
            sb.append("IvInManifest: ").append(getIvInManifest()).append(",");
        if (getIvSource() != null)
            sb.append("IvSource: ").append(getIvSource()).append(",");
        if (getKeepSegments() != null)
            sb.append("KeepSegments: ").append(getKeepSegments()).append(",");
        if (getKeyFormat() != null)
            sb.append("KeyFormat: ").append(getKeyFormat()).append(",");
        if (getKeyFormatVersions() != null)
            sb.append("KeyFormatVersions: ").append(getKeyFormatVersions()).append(",");
        if (getKeyProviderSettings() != null)
            sb.append("KeyProviderSettings: ").append(getKeyProviderSettings()).append(",");
        if (getManifestCompression() != null)
            sb.append("ManifestCompression: ").append(getManifestCompression()).append(",");
        if (getManifestDurationFormat() != null)
            sb.append("ManifestDurationFormat: ").append(getManifestDurationFormat()).append(",");
        if (getMinSegmentLength() != null)
            sb.append("MinSegmentLength: ").append(getMinSegmentLength()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getOutputSelection() != null)
            sb.append("OutputSelection: ").append(getOutputSelection()).append(",");
        if (getProgramDateTime() != null)
            sb.append("ProgramDateTime: ").append(getProgramDateTime()).append(",");
        if (getProgramDateTimePeriod() != null)
            sb.append("ProgramDateTimePeriod: ").append(getProgramDateTimePeriod()).append(",");
        if (getRedundantManifest() != null)
            sb.append("RedundantManifest: ").append(getRedundantManifest()).append(",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: ").append(getSegmentLength()).append(",");
        if (getSegmentationMode() != null)
            sb.append("SegmentationMode: ").append(getSegmentationMode()).append(",");
        if (getSegmentsPerSubdirectory() != null)
            sb.append("SegmentsPerSubdirectory: ").append(getSegmentsPerSubdirectory()).append(",");
        if (getStreamInfResolution() != null)
            sb.append("StreamInfResolution: ").append(getStreamInfResolution()).append(",");
        if (getTimedMetadataId3Frame() != null)
            sb.append("TimedMetadataId3Frame: ").append(getTimedMetadataId3Frame()).append(",");
        if (getTimedMetadataId3Period() != null)
            sb.append("TimedMetadataId3Period: ").append(getTimedMetadataId3Period()).append(",");
        if (getTimestampDeltaMilliseconds() != null)
            sb.append("TimestampDeltaMilliseconds: ").append(getTimestampDeltaMilliseconds()).append(",");
        if (getTsFileMode() != null)
            sb.append("TsFileMode: ").append(getTsFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsGroupSettings == false)
            return false;
        HlsGroupSettings other = (HlsGroupSettings) obj;
        if (other.getAdMarkers() == null ^ this.getAdMarkers() == null)
            return false;
        if (other.getAdMarkers() != null && other.getAdMarkers().equals(this.getAdMarkers()) == false)
            return false;
        if (other.getBaseUrlContent() == null ^ this.getBaseUrlContent() == null)
            return false;
        if (other.getBaseUrlContent() != null && other.getBaseUrlContent().equals(this.getBaseUrlContent()) == false)
            return false;
        if (other.getBaseUrlManifest() == null ^ this.getBaseUrlManifest() == null)
            return false;
        if (other.getBaseUrlManifest() != null && other.getBaseUrlManifest().equals(this.getBaseUrlManifest()) == false)
            return false;
        if (other.getCaptionLanguageMappings() == null ^ this.getCaptionLanguageMappings() == null)
            return false;
        if (other.getCaptionLanguageMappings() != null && other.getCaptionLanguageMappings().equals(this.getCaptionLanguageMappings()) == false)
            return false;
        if (other.getCaptionLanguageSetting() == null ^ this.getCaptionLanguageSetting() == null)
            return false;
        if (other.getCaptionLanguageSetting() != null && other.getCaptionLanguageSetting().equals(this.getCaptionLanguageSetting()) == false)
            return false;
        if (other.getClientCache() == null ^ this.getClientCache() == null)
            return false;
        if (other.getClientCache() != null && other.getClientCache().equals(this.getClientCache()) == false)
            return false;
        if (other.getCodecSpecification() == null ^ this.getCodecSpecification() == null)
            return false;
        if (other.getCodecSpecification() != null && other.getCodecSpecification().equals(this.getCodecSpecification()) == false)
            return false;
        if (other.getConstantIv() == null ^ this.getConstantIv() == null)
            return false;
        if (other.getConstantIv() != null && other.getConstantIv().equals(this.getConstantIv()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDirectoryStructure() == null ^ this.getDirectoryStructure() == null)
            return false;
        if (other.getDirectoryStructure() != null && other.getDirectoryStructure().equals(this.getDirectoryStructure()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getHlsCdnSettings() == null ^ this.getHlsCdnSettings() == null)
            return false;
        if (other.getHlsCdnSettings() != null && other.getHlsCdnSettings().equals(this.getHlsCdnSettings()) == false)
            return false;
        if (other.getIFrameOnlyPlaylists() == null ^ this.getIFrameOnlyPlaylists() == null)
            return false;
        if (other.getIFrameOnlyPlaylists() != null && other.getIFrameOnlyPlaylists().equals(this.getIFrameOnlyPlaylists()) == false)
            return false;
        if (other.getIndexNSegments() == null ^ this.getIndexNSegments() == null)
            return false;
        if (other.getIndexNSegments() != null && other.getIndexNSegments().equals(this.getIndexNSegments()) == false)
            return false;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getIvInManifest() == null ^ this.getIvInManifest() == null)
            return false;
        if (other.getIvInManifest() != null && other.getIvInManifest().equals(this.getIvInManifest()) == false)
            return false;
        if (other.getIvSource() == null ^ this.getIvSource() == null)
            return false;
        if (other.getIvSource() != null && other.getIvSource().equals(this.getIvSource()) == false)
            return false;
        if (other.getKeepSegments() == null ^ this.getKeepSegments() == null)
            return false;
        if (other.getKeepSegments() != null && other.getKeepSegments().equals(this.getKeepSegments()) == false)
            return false;
        if (other.getKeyFormat() == null ^ this.getKeyFormat() == null)
            return false;
        if (other.getKeyFormat() != null && other.getKeyFormat().equals(this.getKeyFormat()) == false)
            return false;
        if (other.getKeyFormatVersions() == null ^ this.getKeyFormatVersions() == null)
            return false;
        if (other.getKeyFormatVersions() != null && other.getKeyFormatVersions().equals(this.getKeyFormatVersions()) == false)
            return false;
        if (other.getKeyProviderSettings() == null ^ this.getKeyProviderSettings() == null)
            return false;
        if (other.getKeyProviderSettings() != null && other.getKeyProviderSettings().equals(this.getKeyProviderSettings()) == false)
            return false;
        if (other.getManifestCompression() == null ^ this.getManifestCompression() == null)
            return false;
        if (other.getManifestCompression() != null && other.getManifestCompression().equals(this.getManifestCompression()) == false)
            return false;
        if (other.getManifestDurationFormat() == null ^ this.getManifestDurationFormat() == null)
            return false;
        if (other.getManifestDurationFormat() != null && other.getManifestDurationFormat().equals(this.getManifestDurationFormat()) == false)
            return false;
        if (other.getMinSegmentLength() == null ^ this.getMinSegmentLength() == null)
            return false;
        if (other.getMinSegmentLength() != null && other.getMinSegmentLength().equals(this.getMinSegmentLength()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getOutputSelection() == null ^ this.getOutputSelection() == null)
            return false;
        if (other.getOutputSelection() != null && other.getOutputSelection().equals(this.getOutputSelection()) == false)
            return false;
        if (other.getProgramDateTime() == null ^ this.getProgramDateTime() == null)
            return false;
        if (other.getProgramDateTime() != null && other.getProgramDateTime().equals(this.getProgramDateTime()) == false)
            return false;
        if (other.getProgramDateTimePeriod() == null ^ this.getProgramDateTimePeriod() == null)
            return false;
        if (other.getProgramDateTimePeriod() != null && other.getProgramDateTimePeriod().equals(this.getProgramDateTimePeriod()) == false)
            return false;
        if (other.getRedundantManifest() == null ^ this.getRedundantManifest() == null)
            return false;
        if (other.getRedundantManifest() != null && other.getRedundantManifest().equals(this.getRedundantManifest()) == false)
            return false;
        if (other.getSegmentLength() == null ^ this.getSegmentLength() == null)
            return false;
        if (other.getSegmentLength() != null && other.getSegmentLength().equals(this.getSegmentLength()) == false)
            return false;
        if (other.getSegmentationMode() == null ^ this.getSegmentationMode() == null)
            return false;
        if (other.getSegmentationMode() != null && other.getSegmentationMode().equals(this.getSegmentationMode()) == false)
            return false;
        if (other.getSegmentsPerSubdirectory() == null ^ this.getSegmentsPerSubdirectory() == null)
            return false;
        if (other.getSegmentsPerSubdirectory() != null && other.getSegmentsPerSubdirectory().equals(this.getSegmentsPerSubdirectory()) == false)
            return false;
        if (other.getStreamInfResolution() == null ^ this.getStreamInfResolution() == null)
            return false;
        if (other.getStreamInfResolution() != null && other.getStreamInfResolution().equals(this.getStreamInfResolution()) == false)
            return false;
        if (other.getTimedMetadataId3Frame() == null ^ this.getTimedMetadataId3Frame() == null)
            return false;
        if (other.getTimedMetadataId3Frame() != null && other.getTimedMetadataId3Frame().equals(this.getTimedMetadataId3Frame()) == false)
            return false;
        if (other.getTimedMetadataId3Period() == null ^ this.getTimedMetadataId3Period() == null)
            return false;
        if (other.getTimedMetadataId3Period() != null && other.getTimedMetadataId3Period().equals(this.getTimedMetadataId3Period()) == false)
            return false;
        if (other.getTimestampDeltaMilliseconds() == null ^ this.getTimestampDeltaMilliseconds() == null)
            return false;
        if (other.getTimestampDeltaMilliseconds() != null && other.getTimestampDeltaMilliseconds().equals(this.getTimestampDeltaMilliseconds()) == false)
            return false;
        if (other.getTsFileMode() == null ^ this.getTsFileMode() == null)
            return false;
        if (other.getTsFileMode() != null && other.getTsFileMode().equals(this.getTsFileMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkers() == null) ? 0 : getAdMarkers().hashCode());
        hashCode = prime * hashCode + ((getBaseUrlContent() == null) ? 0 : getBaseUrlContent().hashCode());
        hashCode = prime * hashCode + ((getBaseUrlManifest() == null) ? 0 : getBaseUrlManifest().hashCode());
        hashCode = prime * hashCode + ((getCaptionLanguageMappings() == null) ? 0 : getCaptionLanguageMappings().hashCode());
        hashCode = prime * hashCode + ((getCaptionLanguageSetting() == null) ? 0 : getCaptionLanguageSetting().hashCode());
        hashCode = prime * hashCode + ((getClientCache() == null) ? 0 : getClientCache().hashCode());
        hashCode = prime * hashCode + ((getCodecSpecification() == null) ? 0 : getCodecSpecification().hashCode());
        hashCode = prime * hashCode + ((getConstantIv() == null) ? 0 : getConstantIv().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDirectoryStructure() == null) ? 0 : getDirectoryStructure().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getHlsCdnSettings() == null) ? 0 : getHlsCdnSettings().hashCode());
        hashCode = prime * hashCode + ((getIFrameOnlyPlaylists() == null) ? 0 : getIFrameOnlyPlaylists().hashCode());
        hashCode = prime * hashCode + ((getIndexNSegments() == null) ? 0 : getIndexNSegments().hashCode());
        hashCode = prime * hashCode + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode + ((getIvInManifest() == null) ? 0 : getIvInManifest().hashCode());
        hashCode = prime * hashCode + ((getIvSource() == null) ? 0 : getIvSource().hashCode());
        hashCode = prime * hashCode + ((getKeepSegments() == null) ? 0 : getKeepSegments().hashCode());
        hashCode = prime * hashCode + ((getKeyFormat() == null) ? 0 : getKeyFormat().hashCode());
        hashCode = prime * hashCode + ((getKeyFormatVersions() == null) ? 0 : getKeyFormatVersions().hashCode());
        hashCode = prime * hashCode + ((getKeyProviderSettings() == null) ? 0 : getKeyProviderSettings().hashCode());
        hashCode = prime * hashCode + ((getManifestCompression() == null) ? 0 : getManifestCompression().hashCode());
        hashCode = prime * hashCode + ((getManifestDurationFormat() == null) ? 0 : getManifestDurationFormat().hashCode());
        hashCode = prime * hashCode + ((getMinSegmentLength() == null) ? 0 : getMinSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getOutputSelection() == null) ? 0 : getOutputSelection().hashCode());
        hashCode = prime * hashCode + ((getProgramDateTime() == null) ? 0 : getProgramDateTime().hashCode());
        hashCode = prime * hashCode + ((getProgramDateTimePeriod() == null) ? 0 : getProgramDateTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getRedundantManifest() == null) ? 0 : getRedundantManifest().hashCode());
        hashCode = prime * hashCode + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getSegmentationMode() == null) ? 0 : getSegmentationMode().hashCode());
        hashCode = prime * hashCode + ((getSegmentsPerSubdirectory() == null) ? 0 : getSegmentsPerSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getStreamInfResolution() == null) ? 0 : getStreamInfResolution().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataId3Frame() == null) ? 0 : getTimedMetadataId3Frame().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataId3Period() == null) ? 0 : getTimedMetadataId3Period().hashCode());
        hashCode = prime * hashCode + ((getTimestampDeltaMilliseconds() == null) ? 0 : getTimestampDeltaMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getTsFileMode() == null) ? 0 : getTsFileMode().hashCode());
        return hashCode;
    }

    @Override
    public HlsGroupSettings clone() {
        try {
            return (HlsGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.HlsGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
