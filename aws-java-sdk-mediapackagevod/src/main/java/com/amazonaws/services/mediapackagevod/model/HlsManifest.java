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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An HTTP Live Streaming (HLS) manifest configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/HlsManifest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsManifest implements Serializable, Cloneable, StructuredPojo {

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad
     * markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments)
     * taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and
     * blackout tags based on SCTE-35 messages in the input source.
     */
    private String adMarkers;
    /** When enabled, an I-Frame only stream will be included in the output. */
    private Boolean includeIframeOnlyStream;
    /** An optional string to include in the name of the manifest. */
    private String manifestName;
    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an
     * interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the
     * content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted
     * into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if
     * any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     */
    private Integer programDateTimeIntervalSeconds;
    /** When enabled, the EXT-X-KEY tag will be repeated in output manifests. */
    private Boolean repeatExtXKey;

    private StreamSelection streamSelection;

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

    public HlsManifest withAdMarkers(String adMarkers) {
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

    public HlsManifest withAdMarkers(AdMarkers adMarkers) {
        this.adMarkers = adMarkers.toString();
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

    public HlsManifest withIncludeIframeOnlyStream(Boolean includeIframeOnlyStream) {
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
     * An optional string to include in the name of the manifest.
     * 
     * @param manifestName
     *        An optional string to include in the name of the manifest.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * An optional string to include in the name of the manifest.
     * 
     * @return An optional string to include in the name of the manifest.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * An optional string to include in the name of the manifest.
     * 
     * @param manifestName
     *        An optional string to include in the name of the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsManifest withManifestName(String manifestName) {
        setManifestName(manifestName);
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

    public HlsManifest withProgramDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
        setProgramDateTimeIntervalSeconds(programDateTimeIntervalSeconds);
        return this;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @param repeatExtXKey
     *        When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     */

    public void setRepeatExtXKey(Boolean repeatExtXKey) {
        this.repeatExtXKey = repeatExtXKey;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @return When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     */

    public Boolean getRepeatExtXKey() {
        return this.repeatExtXKey;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @param repeatExtXKey
     *        When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsManifest withRepeatExtXKey(Boolean repeatExtXKey) {
        setRepeatExtXKey(repeatExtXKey);
        return this;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @return When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     */

    public Boolean isRepeatExtXKey() {
        return this.repeatExtXKey;
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

    public HlsManifest withStreamSelection(StreamSelection streamSelection) {
        setStreamSelection(streamSelection);
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
        if (getIncludeIframeOnlyStream() != null)
            sb.append("IncludeIframeOnlyStream: ").append(getIncludeIframeOnlyStream()).append(",");
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getProgramDateTimeIntervalSeconds() != null)
            sb.append("ProgramDateTimeIntervalSeconds: ").append(getProgramDateTimeIntervalSeconds()).append(",");
        if (getRepeatExtXKey() != null)
            sb.append("RepeatExtXKey: ").append(getRepeatExtXKey()).append(",");
        if (getStreamSelection() != null)
            sb.append("StreamSelection: ").append(getStreamSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsManifest == false)
            return false;
        HlsManifest other = (HlsManifest) obj;
        if (other.getAdMarkers() == null ^ this.getAdMarkers() == null)
            return false;
        if (other.getAdMarkers() != null && other.getAdMarkers().equals(this.getAdMarkers()) == false)
            return false;
        if (other.getIncludeIframeOnlyStream() == null ^ this.getIncludeIframeOnlyStream() == null)
            return false;
        if (other.getIncludeIframeOnlyStream() != null && other.getIncludeIframeOnlyStream().equals(this.getIncludeIframeOnlyStream()) == false)
            return false;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getProgramDateTimeIntervalSeconds() == null ^ this.getProgramDateTimeIntervalSeconds() == null)
            return false;
        if (other.getProgramDateTimeIntervalSeconds() != null
                && other.getProgramDateTimeIntervalSeconds().equals(this.getProgramDateTimeIntervalSeconds()) == false)
            return false;
        if (other.getRepeatExtXKey() == null ^ this.getRepeatExtXKey() == null)
            return false;
        if (other.getRepeatExtXKey() != null && other.getRepeatExtXKey().equals(this.getRepeatExtXKey()) == false)
            return false;
        if (other.getStreamSelection() == null ^ this.getStreamSelection() == null)
            return false;
        if (other.getStreamSelection() != null && other.getStreamSelection().equals(this.getStreamSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkers() == null) ? 0 : getAdMarkers().hashCode());
        hashCode = prime * hashCode + ((getIncludeIframeOnlyStream() == null) ? 0 : getIncludeIframeOnlyStream().hashCode());
        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getProgramDateTimeIntervalSeconds() == null) ? 0 : getProgramDateTimeIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getRepeatExtXKey() == null) ? 0 : getRepeatExtXKey().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        return hashCode;
    }

    @Override
    public HlsManifest clone() {
        try {
            return (HlsManifest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.HlsManifestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
