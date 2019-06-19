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
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DashIsoGroupSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashIsoGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used
     * if streams are delivered from a different URL than the manifest file.
     */
    private String baseUrl;
    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     */
    private String destination;
    /** Settings associated with the destination. Will vary based on the type of destination */
    private DestinationSettings destinationSettings;
    /** DRM settings. */
    private DashIsoEncryptionSettings encryption;
    /**
     * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate.
     * Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be
     * longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not
     * cause the creation of many output files as in other output types.
     */
    private Integer fragmentLength;
    /** Supports HbbTV specification as indicated */
    private String hbbtvCompliance;
    /** Minimum time of initially buffered media that is needed to ensure smooth playout. */
    private Integer minBufferTime;
    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     */
    private String segmentControl;
    /**
     * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number
     * of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is
     * internal to a single output file and it does not cause the creation of many output files as in other output types.
     */
    private Integer segmentLength;
    /**
     * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest
     * shows precise segment durations. The segment duration information appears inside the SegmentTimeline element,
     * inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears in the duration attribute of the
     * SegmentTemplate element.
     */
    private String writeSegmentTimelineInRepresentation;

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used
     * if streams are delivered from a different URL than the manifest file.
     * 
     * @param baseUrl
     *        A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be
     *        used if streams are delivered from a different URL than the manifest file.
     */

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used
     * if streams are delivered from a different URL than the manifest file.
     * 
     * @return A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can
     *         be used if streams are delivered from a different URL than the manifest file.
     */

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used
     * if streams are delivered from a different URL than the manifest file.
     * 
     * @param baseUrl
     *        A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be
     *        used if streams are delivered from a different URL than the manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashIsoGroupSettings withBaseUrl(String baseUrl) {
        setBaseUrl(baseUrl);
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

    public DashIsoGroupSettings withDestination(String destination) {
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

    public DashIsoGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * DRM settings.
     * 
     * @param encryption
     *        DRM settings.
     */

    public void setEncryption(DashIsoEncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * DRM settings.
     * 
     * @return DRM settings.
     */

    public DashIsoEncryptionSettings getEncryption() {
        return this.encryption;
    }

    /**
     * DRM settings.
     * 
     * @param encryption
     *        DRM settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashIsoGroupSettings withEncryption(DashIsoEncryptionSettings encryption) {
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

    public DashIsoGroupSettings withFragmentLength(Integer fragmentLength) {
        setFragmentLength(fragmentLength);
        return this;
    }

    /**
     * Supports HbbTV specification as indicated
     * 
     * @param hbbtvCompliance
     *        Supports HbbTV specification as indicated
     * @see DashIsoHbbtvCompliance
     */

    public void setHbbtvCompliance(String hbbtvCompliance) {
        this.hbbtvCompliance = hbbtvCompliance;
    }

    /**
     * Supports HbbTV specification as indicated
     * 
     * @return Supports HbbTV specification as indicated
     * @see DashIsoHbbtvCompliance
     */

    public String getHbbtvCompliance() {
        return this.hbbtvCompliance;
    }

    /**
     * Supports HbbTV specification as indicated
     * 
     * @param hbbtvCompliance
     *        Supports HbbTV specification as indicated
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashIsoHbbtvCompliance
     */

    public DashIsoGroupSettings withHbbtvCompliance(String hbbtvCompliance) {
        setHbbtvCompliance(hbbtvCompliance);
        return this;
    }

    /**
     * Supports HbbTV specification as indicated
     * 
     * @param hbbtvCompliance
     *        Supports HbbTV specification as indicated
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashIsoHbbtvCompliance
     */

    public DashIsoGroupSettings withHbbtvCompliance(DashIsoHbbtvCompliance hbbtvCompliance) {
        this.hbbtvCompliance = hbbtvCompliance.toString();
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

    public DashIsoGroupSettings withMinBufferTime(Integer minBufferTime) {
        setMinBufferTime(minBufferTime);
        return this;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment
     * Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * 
     * @param segmentControl
     *        When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the
     *        Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
     * @see DashIsoSegmentControl
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
     * @see DashIsoSegmentControl
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
     * @see DashIsoSegmentControl
     */

    public DashIsoGroupSettings withSegmentControl(String segmentControl) {
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
     * @see DashIsoSegmentControl
     */

    public DashIsoGroupSettings withSegmentControl(DashIsoSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
        return this;
    }

    /**
     * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number
     * of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is
     * internal to a single output file and it does not cause the creation of many output files as in other output types.
     * 
     * @param segmentLength
     *        Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this
     *        number of seconds, so actual segment length may be longer. When Emit Single File is checked, the
     *        segmentation is internal to a single output file and it does not cause the creation of many output files
     *        as in other output types.
     */

    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number
     * of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is
     * internal to a single output file and it does not cause the creation of many output files as in other output types.
     * 
     * @return Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after
     *         this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the
     *         segmentation is internal to a single output file and it does not cause the creation of many output files
     *         as in other output types.
     */

    public Integer getSegmentLength() {
        return this.segmentLength;
    }

    /**
     * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number
     * of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is
     * internal to a single output file and it does not cause the creation of many output files as in other output types.
     * 
     * @param segmentLength
     *        Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this
     *        number of seconds, so actual segment length may be longer. When Emit Single File is checked, the
     *        segmentation is internal to a single output file and it does not cause the creation of many output files
     *        as in other output types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashIsoGroupSettings withSegmentLength(Integer segmentLength) {
        setSegmentLength(segmentLength);
        return this;
    }

    /**
     * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest
     * shows precise segment durations. The segment duration information appears inside the SegmentTimeline element,
     * inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears in the duration attribute of the
     * SegmentTemplate element.
     * 
     * @param writeSegmentTimelineInRepresentation
     *        When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH
     *        manifest shows precise segment durations. The segment duration information appears inside the
     *        SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't
     *        enabled, the segment durations in your DASH manifest are approximate. The segment duration information
     *        appears in the duration attribute of the SegmentTemplate element.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */

    public void setWriteSegmentTimelineInRepresentation(String writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation;
    }

    /**
     * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest
     * shows precise segment durations. The segment duration information appears inside the SegmentTimeline element,
     * inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears in the duration attribute of the
     * SegmentTemplate element.
     * 
     * @return When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH
     *         manifest shows precise segment durations. The segment duration information appears inside the
     *         SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't
     *         enabled, the segment durations in your DASH manifest are approximate. The segment duration information
     *         appears in the duration attribute of the SegmentTemplate element.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */

    public String getWriteSegmentTimelineInRepresentation() {
        return this.writeSegmentTimelineInRepresentation;
    }

    /**
     * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest
     * shows precise segment durations. The segment duration information appears inside the SegmentTimeline element,
     * inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears in the duration attribute of the
     * SegmentTemplate element.
     * 
     * @param writeSegmentTimelineInRepresentation
     *        When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH
     *        manifest shows precise segment durations. The segment duration information appears inside the
     *        SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't
     *        enabled, the segment durations in your DASH manifest are approximate. The segment duration information
     *        appears in the duration attribute of the SegmentTemplate element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */

    public DashIsoGroupSettings withWriteSegmentTimelineInRepresentation(String writeSegmentTimelineInRepresentation) {
        setWriteSegmentTimelineInRepresentation(writeSegmentTimelineInRepresentation);
        return this;
    }

    /**
     * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest
     * shows precise segment durations. The segment duration information appears inside the SegmentTimeline element,
     * inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears in the duration attribute of the
     * SegmentTemplate element.
     * 
     * @param writeSegmentTimelineInRepresentation
     *        When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH
     *        manifest shows precise segment durations. The segment duration information appears inside the
     *        SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't
     *        enabled, the segment durations in your DASH manifest are approximate. The segment duration information
     *        appears in the duration attribute of the SegmentTemplate element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */

    public DashIsoGroupSettings withWriteSegmentTimelineInRepresentation(DashIsoWriteSegmentTimelineInRepresentation writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation.toString();
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: ").append(getFragmentLength()).append(",");
        if (getHbbtvCompliance() != null)
            sb.append("HbbtvCompliance: ").append(getHbbtvCompliance()).append(",");
        if (getMinBufferTime() != null)
            sb.append("MinBufferTime: ").append(getMinBufferTime()).append(",");
        if (getSegmentControl() != null)
            sb.append("SegmentControl: ").append(getSegmentControl()).append(",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: ").append(getSegmentLength()).append(",");
        if (getWriteSegmentTimelineInRepresentation() != null)
            sb.append("WriteSegmentTimelineInRepresentation: ").append(getWriteSegmentTimelineInRepresentation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashIsoGroupSettings == false)
            return false;
        DashIsoGroupSettings other = (DashIsoGroupSettings) obj;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
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
        if (other.getHbbtvCompliance() == null ^ this.getHbbtvCompliance() == null)
            return false;
        if (other.getHbbtvCompliance() != null && other.getHbbtvCompliance().equals(this.getHbbtvCompliance()) == false)
            return false;
        if (other.getMinBufferTime() == null ^ this.getMinBufferTime() == null)
            return false;
        if (other.getMinBufferTime() != null && other.getMinBufferTime().equals(this.getMinBufferTime()) == false)
            return false;
        if (other.getSegmentControl() == null ^ this.getSegmentControl() == null)
            return false;
        if (other.getSegmentControl() != null && other.getSegmentControl().equals(this.getSegmentControl()) == false)
            return false;
        if (other.getSegmentLength() == null ^ this.getSegmentLength() == null)
            return false;
        if (other.getSegmentLength() != null && other.getSegmentLength().equals(this.getSegmentLength()) == false)
            return false;
        if (other.getWriteSegmentTimelineInRepresentation() == null ^ this.getWriteSegmentTimelineInRepresentation() == null)
            return false;
        if (other.getWriteSegmentTimelineInRepresentation() != null
                && other.getWriteSegmentTimelineInRepresentation().equals(this.getWriteSegmentTimelineInRepresentation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseUrl() == null) ? 0 : getBaseUrl().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode + ((getHbbtvCompliance() == null) ? 0 : getHbbtvCompliance().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTime() == null) ? 0 : getMinBufferTime().hashCode());
        hashCode = prime * hashCode + ((getSegmentControl() == null) ? 0 : getSegmentControl().hashCode());
        hashCode = prime * hashCode + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getWriteSegmentTimelineInRepresentation() == null) ? 0 : getWriteSegmentTimelineInRepresentation().hashCode());
        return hashCode;
    }

    @Override
    public DashIsoGroupSettings clone() {
        try {
            return (DashIsoGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DashIsoGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
