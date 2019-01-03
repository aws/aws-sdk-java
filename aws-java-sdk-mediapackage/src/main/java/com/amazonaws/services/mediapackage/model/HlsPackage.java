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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/HlsPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsPackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad
     * markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments)
     * taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and
     * blackout tags based on SCTE-35 messages in the input source.
     */
    private String adMarkers;

    private HlsEncryption encryption;
    /** When enabled, an I-Frame only stream will be included in the output. */
    private Boolean includeIframeOnlyStream;
    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     * EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     */
    private String playlistType;
    /** Time window (in seconds) contained in each parent manifest. */
    private Integer playlistWindowSeconds;
    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an
     * interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the
     * content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted
     * into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if
     * any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     */
    private Integer programDateTimeIntervalSeconds;
    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     */
    private Integer segmentDurationSeconds;

    private StreamSelection streamSelection;
    /** When enabled, audio streams will be placed in rendition groups in the output. */
    private Boolean useAudioRenditionGroup;

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad
     * markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments)
     * taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and
     * blackout tags based on SCTE-35 messages in the input source.
     * 
     * @param adMarkers
     *        This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all
     *        SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
     *        markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED"
     *        generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * @see AdMarkers
     */

    public void setAdMarkers(String adMarkers) {
        this.adMarkers = adMarkers;
    }

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad
     * markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments)
     * taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and
     * blackout tags based on SCTE-35 messages in the input source.
     * 
     * @return This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all
     *         SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
     *         markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED"
     *         generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * @see AdMarkers
     */

    public String getAdMarkers() {
        return this.adMarkers;
    }

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad
     * markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments)
     * taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and
     * blackout tags based on SCTE-35 messages in the input source.
     * 
     * @param adMarkers
     *        This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all
     *        SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
     *        markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED"
     *        generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkers
     */

    public HlsPackage withAdMarkers(String adMarkers) {
        setAdMarkers(adMarkers);
        return this;
    }

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad
     * markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments)
     * taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and
     * blackout tags based on SCTE-35 messages in the input source.
     * 
     * @param adMarkers
     *        This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all
     *        SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
     *        markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED"
     *        generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkers
     */

    public HlsPackage withAdMarkers(AdMarkers adMarkers) {
        this.adMarkers = adMarkers.toString();
        return this;
    }

    /**
     * @param encryption
     */

    public void setEncryption(HlsEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public HlsEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withEncryption(HlsEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     * @param includeIframeOnlyStream
     *        When enabled, an I-Frame only stream will be included in the output.
     */

    public void setIncludeIframeOnlyStream(Boolean includeIframeOnlyStream) {
        this.includeIframeOnlyStream = includeIframeOnlyStream;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     * @return When enabled, an I-Frame only stream will be included in the output.
     */

    public Boolean getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     * @param includeIframeOnlyStream
     *        When enabled, an I-Frame only stream will be included in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withIncludeIframeOnlyStream(Boolean includeIframeOnlyStream) {
        setIncludeIframeOnlyStream(includeIframeOnlyStream);
        return this;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     * @return When enabled, an I-Frame only stream will be included in the output.
     */

    public Boolean isIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     * EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     * @param playlistType
     *        The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     *        EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * @see PlaylistType
     */

    public void setPlaylistType(String playlistType) {
        this.playlistType = playlistType;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     * EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     * @return The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     *         EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * @see PlaylistType
     */

    public String getPlaylistType() {
        return this.playlistType;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     * EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     * @param playlistType
     *        The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     *        EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaylistType
     */

    public HlsPackage withPlaylistType(String playlistType) {
        setPlaylistType(playlistType);
        return this;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     * EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     * @param playlistType
     *        The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding
     *        EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaylistType
     */

    public HlsPackage withPlaylistType(PlaylistType playlistType) {
        this.playlistType = playlistType.toString();
        return this;
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     * @param playlistWindowSeconds
     *        Time window (in seconds) contained in each parent manifest.
     */

    public void setPlaylistWindowSeconds(Integer playlistWindowSeconds) {
        this.playlistWindowSeconds = playlistWindowSeconds;
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     * @return Time window (in seconds) contained in each parent manifest.
     */

    public Integer getPlaylistWindowSeconds() {
        return this.playlistWindowSeconds;
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     * @param playlistWindowSeconds
     *        Time window (in seconds) contained in each parent manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withPlaylistWindowSeconds(Integer playlistWindowSeconds) {
        setPlaylistWindowSeconds(playlistWindowSeconds);
        return this;
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an
     * interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the
     * content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted
     * into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if
     * any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     * @param programDateTimeIntervalSeconds
     *        The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally,
     *        when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the
     *        ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME
     *        tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that
     *        irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it
     *        will be passed through to HLS output.
     */

    public void setProgramDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an
     * interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the
     * content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted
     * into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if
     * any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     * @return The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally,
     *         when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the
     *         ingest time of the content. If the interval is not specified, or set to 0, then no
     *         EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be
     *         generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live
     *         Streaming (HLS) input, it will be passed through to HLS output.
     */

    public Integer getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds;
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an
     * interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the
     * content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted
     * into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if
     * any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     * @param programDateTimeIntervalSeconds
     *        The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally,
     *        when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the
     *        ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME
     *        tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that
     *        irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it
     *        will be passed through to HLS output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withProgramDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
        setProgramDateTimeIntervalSeconds(programDateTimeIntervalSeconds);
        return this;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *        source fragment duration.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @return Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *         source fragment duration.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *        source fragment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
        return this;
    }

    /**
     * @param streamSelection
     */

    public void setStreamSelection(StreamSelection streamSelection) {
        this.streamSelection = streamSelection;
    }

    /**
     * @return
     */

    public StreamSelection getStreamSelection() {
        return this.streamSelection;
    }

    /**
     * @param streamSelection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withStreamSelection(StreamSelection streamSelection) {
        setStreamSelection(streamSelection);
        return this;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @param useAudioRenditionGroup
     *        When enabled, audio streams will be placed in rendition groups in the output.
     */

    public void setUseAudioRenditionGroup(Boolean useAudioRenditionGroup) {
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @return When enabled, audio streams will be placed in rendition groups in the output.
     */

    public Boolean getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @param useAudioRenditionGroup
     *        When enabled, audio streams will be placed in rendition groups in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withUseAudioRenditionGroup(Boolean useAudioRenditionGroup) {
        setUseAudioRenditionGroup(useAudioRenditionGroup);
        return this;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @return When enabled, audio streams will be placed in rendition groups in the output.
     */

    public Boolean isUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup;
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
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getIncludeIframeOnlyStream() != null)
            sb.append("IncludeIframeOnlyStream: ").append(getIncludeIframeOnlyStream()).append(",");
        if (getPlaylistType() != null)
            sb.append("PlaylistType: ").append(getPlaylistType()).append(",");
        if (getPlaylistWindowSeconds() != null)
            sb.append("PlaylistWindowSeconds: ").append(getPlaylistWindowSeconds()).append(",");
        if (getProgramDateTimeIntervalSeconds() != null)
            sb.append("ProgramDateTimeIntervalSeconds: ").append(getProgramDateTimeIntervalSeconds()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds()).append(",");
        if (getStreamSelection() != null)
            sb.append("StreamSelection: ").append(getStreamSelection()).append(",");
        if (getUseAudioRenditionGroup() != null)
            sb.append("UseAudioRenditionGroup: ").append(getUseAudioRenditionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsPackage == false)
            return false;
        HlsPackage other = (HlsPackage) obj;
        if (other.getAdMarkers() == null ^ this.getAdMarkers() == null)
            return false;
        if (other.getAdMarkers() != null && other.getAdMarkers().equals(this.getAdMarkers()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getIncludeIframeOnlyStream() == null ^ this.getIncludeIframeOnlyStream() == null)
            return false;
        if (other.getIncludeIframeOnlyStream() != null && other.getIncludeIframeOnlyStream().equals(this.getIncludeIframeOnlyStream()) == false)
            return false;
        if (other.getPlaylistType() == null ^ this.getPlaylistType() == null)
            return false;
        if (other.getPlaylistType() != null && other.getPlaylistType().equals(this.getPlaylistType()) == false)
            return false;
        if (other.getPlaylistWindowSeconds() == null ^ this.getPlaylistWindowSeconds() == null)
            return false;
        if (other.getPlaylistWindowSeconds() != null && other.getPlaylistWindowSeconds().equals(this.getPlaylistWindowSeconds()) == false)
            return false;
        if (other.getProgramDateTimeIntervalSeconds() == null ^ this.getProgramDateTimeIntervalSeconds() == null)
            return false;
        if (other.getProgramDateTimeIntervalSeconds() != null
                && other.getProgramDateTimeIntervalSeconds().equals(this.getProgramDateTimeIntervalSeconds()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        if (other.getStreamSelection() == null ^ this.getStreamSelection() == null)
            return false;
        if (other.getStreamSelection() != null && other.getStreamSelection().equals(this.getStreamSelection()) == false)
            return false;
        if (other.getUseAudioRenditionGroup() == null ^ this.getUseAudioRenditionGroup() == null)
            return false;
        if (other.getUseAudioRenditionGroup() != null && other.getUseAudioRenditionGroup().equals(this.getUseAudioRenditionGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkers() == null) ? 0 : getAdMarkers().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getIncludeIframeOnlyStream() == null) ? 0 : getIncludeIframeOnlyStream().hashCode());
        hashCode = prime * hashCode + ((getPlaylistType() == null) ? 0 : getPlaylistType().hashCode());
        hashCode = prime * hashCode + ((getPlaylistWindowSeconds() == null) ? 0 : getPlaylistWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getProgramDateTimeIntervalSeconds() == null) ? 0 : getProgramDateTimeIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        hashCode = prime * hashCode + ((getUseAudioRenditionGroup() == null) ? 0 : getUseAudioRenditionGroup().hashCode());
        return hashCode;
    }

    @Override
    public HlsPackage clone() {
        try {
            return (HlsPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.HlsPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
