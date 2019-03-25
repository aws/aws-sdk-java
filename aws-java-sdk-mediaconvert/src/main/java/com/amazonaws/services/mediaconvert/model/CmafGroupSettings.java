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
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF
 * Output Group may only contain a single video, audio, or caption output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CmafGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if
     * streams are delivered from a different URL than the manifest file.
     */
    private String baseUrl;
    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later
     * replay.
     */
    private String clientCache;
    /** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation. */
    private String codecSpecification;
    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     */
    private String destination;
    /** Settings associated with the destination. Will vary based on the type of destination */
    private DestinationSettings destinationSettings;
    /** DRM settings. */
    private CmafEncryptionSettings encryption;
    /**
     * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate.
     * Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be
     * longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not
     * cause the creation of many output files as in other output types.
     */
    private Integer fragmentLength;
    /** When set to GZIP, compresses HLS playlist. */
    private String manifestCompression;
    /** Indicates whether the output manifest should use floating point values for segment duration. */
    private String manifestDurationFormat;
    /** Minimum time of initially buffered media that is needed to ensure smooth playout. */
    private Integer minBufferTime;
    /**
     * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back
     * the end of your video asset. If you know that player devices are hanging on the final segment of your video
     * because the length of your final segment is too short, use this setting to specify a minimum final segment length,
     * in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify
     * a value for this setting, the encoder will combine any final segment that is shorter than the length that you
     * specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5
     * seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final
     * segment is 3.5 seconds.
     */
    private Double minFinalSegmentLength;
    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     */
    private String segmentControl;
    /**
     * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the
     * whole package; that is, to every output in the output group. Note that segments end on the first keyframe after
     * this number of seconds, so the actual segment length might be slightly longer. If you set Segment control
     * (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has
     * metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each
     * output, each with the content of one segment.
     */
    private Integer segmentLength;
    /** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest. */
    private String streamInfResolution;
    /** When set to ENABLED, a DASH MPD manifest will be generated for this output. */
    private String writeDashManifest;
    /** When set to ENABLED, an Apple HLS manifest will be generated for this output. */
    private String writeHlsManifest;

    /**
     * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if
     * streams are delivered from a different URL than the manifest file.
     * 
     * @param baseUrl
     *        A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used
     *        if streams are delivered from a different URL than the manifest file.
     */

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if
     * streams are delivered from a different URL than the manifest file.
     * 
     * @return A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used
     *         if streams are delivered from a different URL than the manifest file.
     */

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if
     * streams are delivered from a different URL than the manifest file.
     * 
     * @param baseUrl
     *        A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used
     *        if streams are delivered from a different URL than the manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withBaseUrl(String baseUrl) {
        setBaseUrl(baseUrl);
        return this;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later
     * replay.
     * 
     * @param clientCache
     *        When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for
     *        later replay.
     * @see CmafClientCache
     */

    public void setClientCache(String clientCache) {
        this.clientCache = clientCache;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later
     * replay.
     * 
     * @return When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for
     *         later replay.
     * @see CmafClientCache
     */

    public String getClientCache() {
        return this.clientCache;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later
     * replay.
     * 
     * @param clientCache
     *        When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for
     *        later replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafClientCache
     */

    public CmafGroupSettings withClientCache(String clientCache) {
        setClientCache(clientCache);
        return this;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later
     * replay.
     * 
     * @param clientCache
     *        When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for
     *        later replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafClientCache
     */

    public CmafGroupSettings withClientCache(CmafClientCache clientCache) {
        this.clientCache = clientCache.toString();
        return this;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @param codecSpecification
     *        Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @see CmafCodecSpecification
     */

    public void setCodecSpecification(String codecSpecification) {
        this.codecSpecification = codecSpecification;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @return Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @see CmafCodecSpecification
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
     * @see CmafCodecSpecification
     */

    public CmafGroupSettings withCodecSpecification(String codecSpecification) {
        setCodecSpecification(codecSpecification);
        return this;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * 
     * @param codecSpecification
     *        Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafCodecSpecification
     */

    public CmafGroupSettings withCodecSpecification(CmafCodecSpecification codecSpecification) {
        this.codecSpecification = codecSpecification.toString();
        return this;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @param destination
     *        Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *        accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *        filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *        input file.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @return Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *         accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *         filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *         input file.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @param destination
     *        Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *        accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *        filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *        input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @param destinationSettings
     *        Settings associated with the destination. Will vary based on the type of destination
     */

    public void setDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @return Settings associated with the destination. Will vary based on the type of destination
     */

    public DestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @param destinationSettings
     *        Settings associated with the destination. Will vary based on the type of destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * DRM settings.
     * 
     * @param encryption
     *        DRM settings.
     */

    public void setEncryption(CmafEncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * DRM settings.
     * 
     * @return DRM settings.
     */

    public CmafEncryptionSettings getEncryption() {
        return this.encryption;
    }

    /**
     * DRM settings.
     * 
     * @param encryption
     *        DRM settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withEncryption(CmafEncryptionSettings encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate.
     * Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be
     * longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not
     * cause the creation of many output files as in other output types.
     * 
     * @param fragmentLength
     *        Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and
     *        Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual
     *        fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single
     *        output file and it does not cause the creation of many output files as in other output types.
     */

    public void setFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
    }

    /**
     * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate.
     * Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be
     * longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not
     * cause the creation of many output files as in other output types.
     * 
     * @return Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and
     *         Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual
     *         fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a
     *         single output file and it does not cause the creation of many output files as in other output types.
     */

    public Integer getFragmentLength() {
        return this.fragmentLength;
    }

    /**
     * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate.
     * Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be
     * longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not
     * cause the creation of many output files as in other output types.
     * 
     * @param fragmentLength
     *        Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and
     *        Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual
     *        fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single
     *        output file and it does not cause the creation of many output files as in other output types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withFragmentLength(Integer fragmentLength) {
        setFragmentLength(fragmentLength);
        return this;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * 
     * @param manifestCompression
     *        When set to GZIP, compresses HLS playlist.
     * @see CmafManifestCompression
     */

    public void setManifestCompression(String manifestCompression) {
        this.manifestCompression = manifestCompression;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * 
     * @return When set to GZIP, compresses HLS playlist.
     * @see CmafManifestCompression
     */

    public String getManifestCompression() {
        return this.manifestCompression;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * 
     * @param manifestCompression
     *        When set to GZIP, compresses HLS playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafManifestCompression
     */

    public CmafGroupSettings withManifestCompression(String manifestCompression) {
        setManifestCompression(manifestCompression);
        return this;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * 
     * @param manifestCompression
     *        When set to GZIP, compresses HLS playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafManifestCompression
     */

    public CmafGroupSettings withManifestCompression(CmafManifestCompression manifestCompression) {
        this.manifestCompression = manifestCompression.toString();
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point values for segment duration.
     * 
     * @param manifestDurationFormat
     *        Indicates whether the output manifest should use floating point values for segment duration.
     * @see CmafManifestDurationFormat
     */

    public void setManifestDurationFormat(String manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point values for segment duration.
     * 
     * @return Indicates whether the output manifest should use floating point values for segment duration.
     * @see CmafManifestDurationFormat
     */

    public String getManifestDurationFormat() {
        return this.manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point values for segment duration.
     * 
     * @param manifestDurationFormat
     *        Indicates whether the output manifest should use floating point values for segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafManifestDurationFormat
     */

    public CmafGroupSettings withManifestDurationFormat(String manifestDurationFormat) {
        setManifestDurationFormat(manifestDurationFormat);
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point values for segment duration.
     * 
     * @param manifestDurationFormat
     *        Indicates whether the output manifest should use floating point values for segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafManifestDurationFormat
     */

    public CmafGroupSettings withManifestDurationFormat(CmafManifestDurationFormat manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat.toString();
        return this;
    }

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth playout.
     * 
     * @param minBufferTime
     *        Minimum time of initially buffered media that is needed to ensure smooth playout.
     */

    public void setMinBufferTime(Integer minBufferTime) {
        this.minBufferTime = minBufferTime;
    }

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth playout.
     * 
     * @return Minimum time of initially buffered media that is needed to ensure smooth playout.
     */

    public Integer getMinBufferTime() {
        return this.minBufferTime;
    }

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth playout.
     * 
     * @param minBufferTime
     *        Minimum time of initially buffered media that is needed to ensure smooth playout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withMinBufferTime(Integer minBufferTime) {
        setMinBufferTime(minBufferTime);
        return this;
    }

    /**
     * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back
     * the end of your video asset. If you know that player devices are hanging on the final segment of your video
     * because the length of your final segment is too short, use this setting to specify a minimum final segment length,
     * in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify
     * a value for this setting, the encoder will combine any final segment that is shorter than the length that you
     * specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5
     * seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final
     * segment is 3.5 seconds.
     * 
     * @param minFinalSegmentLength
     *        Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices
     *        play back the end of your video asset. If you know that player devices are hanging on the final segment of
     *        your video because the length of your final segment is too short, use this setting to specify a minimum
     *        final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your
     *        segment length. When you specify a value for this setting, the encoder will combine any final segment that
     *        is shorter than the length that you specify with the previous segment. For example, your segment length is
     *        3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the
     *        minimum final segment length to 1, your final segment is 3.5 seconds.
     */

    public void setMinFinalSegmentLength(Double minFinalSegmentLength) {
        this.minFinalSegmentLength = minFinalSegmentLength;
    }

    /**
     * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back
     * the end of your video asset. If you know that player devices are hanging on the final segment of your video
     * because the length of your final segment is too short, use this setting to specify a minimum final segment length,
     * in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify
     * a value for this setting, the encoder will combine any final segment that is shorter than the length that you
     * specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5
     * seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final
     * segment is 3.5 seconds.
     * 
     * @return Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices
     *         play back the end of your video asset. If you know that player devices are hanging on the final segment
     *         of your video because the length of your final segment is too short, use this setting to specify a
     *         minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than
     *         your segment length. When you specify a value for this setting, the encoder will combine any final
     *         segment that is shorter than the length that you specify with the previous segment. For example, your
     *         segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length;
     *         when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
     */

    public Double getMinFinalSegmentLength() {
        return this.minFinalSegmentLength;
    }

    /**
     * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back
     * the end of your video asset. If you know that player devices are hanging on the final segment of your video
     * because the length of your final segment is too short, use this setting to specify a minimum final segment length,
     * in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify
     * a value for this setting, the encoder will combine any final segment that is shorter than the length that you
     * specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5
     * seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final
     * segment is 3.5 seconds.
     * 
     * @param minFinalSegmentLength
     *        Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices
     *        play back the end of your video asset. If you know that player devices are hanging on the final segment of
     *        your video because the length of your final segment is too short, use this setting to specify a minimum
     *        final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your
     *        segment length. When you specify a value for this setting, the encoder will combine any final segment that
     *        is shorter than the length that you specify with the previous segment. For example, your segment length is
     *        3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the
     *        minimum final segment length to 1, your final segment is 3.5 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withMinFinalSegmentLength(Double minFinalSegmentLength) {
        setMinFinalSegmentLength(minFinalSegmentLength);
        return this;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * 
     * @param segmentControl
     *        When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the
     *        Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * @see CmafSegmentControl
     */

    public void setSegmentControl(String segmentControl) {
        this.segmentControl = segmentControl;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * 
     * @return When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the
     *         Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * @see CmafSegmentControl
     */

    public String getSegmentControl() {
        return this.segmentControl;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * 
     * @param segmentControl
     *        When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the
     *        Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafSegmentControl
     */

    public CmafGroupSettings withSegmentControl(String segmentControl) {
        setSegmentControl(segmentControl);
        return this;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * 
     * @param segmentControl
     *        When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the
     *        Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafSegmentControl
     */

    public CmafGroupSettings withSegmentControl(CmafSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
        return this;
    }

    /**
     * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the
     * whole package; that is, to every output in the output group. Note that segments end on the first keyframe after
     * this number of seconds, so the actual segment length might be slightly longer. If you set Segment control
     * (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has
     * metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each
     * output, each with the content of one segment.
     * 
     * @param segmentLength
     *        Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to
     *        the whole package; that is, to every output in the output group. Note that segments end on the first
     *        keyframe after this number of seconds, so the actual segment length might be slightly longer. If you set
     *        Segment control (CmafSegmentControl) to single file, the service puts the content of each output in a
     *        single file that has metadata that marks these segments. If you set it to segmented files, the service
     *        creates multiple files for each output, each with the content of one segment.
     */

    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the
     * whole package; that is, to every output in the output group. Note that segments end on the first keyframe after
     * this number of seconds, so the actual segment length might be slightly longer. If you set Segment control
     * (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has
     * metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each
     * output, each with the content of one segment.
     * 
     * @return Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies
     *         to the whole package; that is, to every output in the output group. Note that segments end on the first
     *         keyframe after this number of seconds, so the actual segment length might be slightly longer. If you set
     *         Segment control (CmafSegmentControl) to single file, the service puts the content of each output in a
     *         single file that has metadata that marks these segments. If you set it to segmented files, the service
     *         creates multiple files for each output, each with the content of one segment.
     */

    public Integer getSegmentLength() {
        return this.segmentLength;
    }

    /**
     * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the
     * whole package; that is, to every output in the output group. Note that segments end on the first keyframe after
     * this number of seconds, so the actual segment length might be slightly longer. If you set Segment control
     * (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has
     * metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each
     * output, each with the content of one segment.
     * 
     * @param segmentLength
     *        Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to
     *        the whole package; that is, to every output in the output group. Note that segments end on the first
     *        keyframe after this number of seconds, so the actual segment length might be slightly longer. If you set
     *        Segment control (CmafSegmentControl) to single file, the service puts the content of each output in a
     *        single file that has metadata that marks these segments. If you set it to segmented files, the service
     *        creates multiple files for each output, each with the content of one segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafGroupSettings withSegmentLength(Integer segmentLength) {
        setSegmentLength(segmentLength);
        return this;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @param streamInfResolution
     *        Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @see CmafStreamInfResolution
     */

    public void setStreamInfResolution(String streamInfResolution) {
        this.streamInfResolution = streamInfResolution;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @return Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @see CmafStreamInfResolution
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
     * @see CmafStreamInfResolution
     */

    public CmafGroupSettings withStreamInfResolution(String streamInfResolution) {
        setStreamInfResolution(streamInfResolution);
        return this;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * 
     * @param streamInfResolution
     *        Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafStreamInfResolution
     */

    public CmafGroupSettings withStreamInfResolution(CmafStreamInfResolution streamInfResolution) {
        this.streamInfResolution = streamInfResolution.toString();
        return this;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * 
     * @param writeDashManifest
     *        When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * @see CmafWriteDASHManifest
     */

    public void setWriteDashManifest(String writeDashManifest) {
        this.writeDashManifest = writeDashManifest;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * 
     * @return When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * @see CmafWriteDASHManifest
     */

    public String getWriteDashManifest() {
        return this.writeDashManifest;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * 
     * @param writeDashManifest
     *        When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafWriteDASHManifest
     */

    public CmafGroupSettings withWriteDashManifest(String writeDashManifest) {
        setWriteDashManifest(writeDashManifest);
        return this;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * 
     * @param writeDashManifest
     *        When set to ENABLED, a DASH MPD manifest will be generated for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafWriteDASHManifest
     */

    public CmafGroupSettings withWriteDashManifest(CmafWriteDASHManifest writeDashManifest) {
        this.writeDashManifest = writeDashManifest.toString();
        return this;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * 
     * @param writeHlsManifest
     *        When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * @see CmafWriteHLSManifest
     */

    public void setWriteHlsManifest(String writeHlsManifest) {
        this.writeHlsManifest = writeHlsManifest;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * 
     * @return When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * @see CmafWriteHLSManifest
     */

    public String getWriteHlsManifest() {
        return this.writeHlsManifest;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * 
     * @param writeHlsManifest
     *        When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafWriteHLSManifest
     */

    public CmafGroupSettings withWriteHlsManifest(String writeHlsManifest) {
        setWriteHlsManifest(writeHlsManifest);
        return this;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * 
     * @param writeHlsManifest
     *        When set to ENABLED, an Apple HLS manifest will be generated for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafWriteHLSManifest
     */

    public CmafGroupSettings withWriteHlsManifest(CmafWriteHLSManifest writeHlsManifest) {
        this.writeHlsManifest = writeHlsManifest.toString();
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
        if (getBaseUrl() != null)
            sb.append("BaseUrl: ").append(getBaseUrl()).append(",");
        if (getClientCache() != null)
            sb.append("ClientCache: ").append(getClientCache()).append(",");
        if (getCodecSpecification() != null)
            sb.append("CodecSpecification: ").append(getCodecSpecification()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: ").append(getFragmentLength()).append(",");
        if (getManifestCompression() != null)
            sb.append("ManifestCompression: ").append(getManifestCompression()).append(",");
        if (getManifestDurationFormat() != null)
            sb.append("ManifestDurationFormat: ").append(getManifestDurationFormat()).append(",");
        if (getMinBufferTime() != null)
            sb.append("MinBufferTime: ").append(getMinBufferTime()).append(",");
        if (getMinFinalSegmentLength() != null)
            sb.append("MinFinalSegmentLength: ").append(getMinFinalSegmentLength()).append(",");
        if (getSegmentControl() != null)
            sb.append("SegmentControl: ").append(getSegmentControl()).append(",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: ").append(getSegmentLength()).append(",");
        if (getStreamInfResolution() != null)
            sb.append("StreamInfResolution: ").append(getStreamInfResolution()).append(",");
        if (getWriteDashManifest() != null)
            sb.append("WriteDashManifest: ").append(getWriteDashManifest()).append(",");
        if (getWriteHlsManifest() != null)
            sb.append("WriteHlsManifest: ").append(getWriteHlsManifest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafGroupSettings == false)
            return false;
        CmafGroupSettings other = (CmafGroupSettings) obj;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
            return false;
        if (other.getClientCache() == null ^ this.getClientCache() == null)
            return false;
        if (other.getClientCache() != null && other.getClientCache().equals(this.getClientCache()) == false)
            return false;
        if (other.getCodecSpecification() == null ^ this.getCodecSpecification() == null)
            return false;
        if (other.getCodecSpecification() != null && other.getCodecSpecification().equals(this.getCodecSpecification()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getFragmentLength() == null ^ this.getFragmentLength() == null)
            return false;
        if (other.getFragmentLength() != null && other.getFragmentLength().equals(this.getFragmentLength()) == false)
            return false;
        if (other.getManifestCompression() == null ^ this.getManifestCompression() == null)
            return false;
        if (other.getManifestCompression() != null && other.getManifestCompression().equals(this.getManifestCompression()) == false)
            return false;
        if (other.getManifestDurationFormat() == null ^ this.getManifestDurationFormat() == null)
            return false;
        if (other.getManifestDurationFormat() != null && other.getManifestDurationFormat().equals(this.getManifestDurationFormat()) == false)
            return false;
        if (other.getMinBufferTime() == null ^ this.getMinBufferTime() == null)
            return false;
        if (other.getMinBufferTime() != null && other.getMinBufferTime().equals(this.getMinBufferTime()) == false)
            return false;
        if (other.getMinFinalSegmentLength() == null ^ this.getMinFinalSegmentLength() == null)
            return false;
        if (other.getMinFinalSegmentLength() != null && other.getMinFinalSegmentLength().equals(this.getMinFinalSegmentLength()) == false)
            return false;
        if (other.getSegmentControl() == null ^ this.getSegmentControl() == null)
            return false;
        if (other.getSegmentControl() != null && other.getSegmentControl().equals(this.getSegmentControl()) == false)
            return false;
        if (other.getSegmentLength() == null ^ this.getSegmentLength() == null)
            return false;
        if (other.getSegmentLength() != null && other.getSegmentLength().equals(this.getSegmentLength()) == false)
            return false;
        if (other.getStreamInfResolution() == null ^ this.getStreamInfResolution() == null)
            return false;
        if (other.getStreamInfResolution() != null && other.getStreamInfResolution().equals(this.getStreamInfResolution()) == false)
            return false;
        if (other.getWriteDashManifest() == null ^ this.getWriteDashManifest() == null)
            return false;
        if (other.getWriteDashManifest() != null && other.getWriteDashManifest().equals(this.getWriteDashManifest()) == false)
            return false;
        if (other.getWriteHlsManifest() == null ^ this.getWriteHlsManifest() == null)
            return false;
        if (other.getWriteHlsManifest() != null && other.getWriteHlsManifest().equals(this.getWriteHlsManifest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseUrl() == null) ? 0 : getBaseUrl().hashCode());
        hashCode = prime * hashCode + ((getClientCache() == null) ? 0 : getClientCache().hashCode());
        hashCode = prime * hashCode + ((getCodecSpecification() == null) ? 0 : getCodecSpecification().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode + ((getManifestCompression() == null) ? 0 : getManifestCompression().hashCode());
        hashCode = prime * hashCode + ((getManifestDurationFormat() == null) ? 0 : getManifestDurationFormat().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTime() == null) ? 0 : getMinBufferTime().hashCode());
        hashCode = prime * hashCode + ((getMinFinalSegmentLength() == null) ? 0 : getMinFinalSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getSegmentControl() == null) ? 0 : getSegmentControl().hashCode());
        hashCode = prime * hashCode + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getStreamInfResolution() == null) ? 0 : getStreamInfResolution().hashCode());
        hashCode = prime * hashCode + ((getWriteDashManifest() == null) ? 0 : getWriteDashManifest().hashCode());
        hashCode = prime * hashCode + ((getWriteHlsManifest() == null) ? 0 : getWriteHlsManifest().hashCode());
        return hashCode;
    }

    @Override
    public CmafGroupSettings clone() {
        try {
            return (CmafGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CmafGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
