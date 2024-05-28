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
 * The segment configuration, including the segment name, duration, and other configuration values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/Segment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Segment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment duration.
     * If the value that you enter is different from the input segment duration, MediaPackage rounds segments to the
     * nearest multiple of the input segment duration.
     * </p>
     */
    private Integer segmentDurationSeconds;
    /**
     * <p>
     * The name that describes the segment. The name is the base name of the segment used in all content manifests
     * inside of the endpoint. You can't use spaces in the name.
     * </p>
     */
    private String segmentName;
    /**
     * <p>
     * When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream can be
     * used with any audio rendition from the group.
     * </p>
     */
    private Boolean tsUseAudioRenditionGroup;
    /**
     * <p>
     * When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If false,
     * this extra stream is not included. MediaPackage generates an I-frame only stream from the first rendition in the
     * manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then generates and includes an
     * I-frames only playlist in the stream. This playlist permits player functionality like fast forward and rewind.
     * </p>
     */
    private Boolean includeIframeOnlyStreams;
    /**
     * <p>
     * By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When selected,
     * MediaPackage passes through DVB subtitles into the output.
     * </p>
     */
    private Boolean tsIncludeDvbSubtitles;
    /**
     * <p>
     * The SCTE configuration options in the segment settings.
     * </p>
     */
    private Scte scte;

    private Encryption encryption;

    /**
     * <p>
     * The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment duration.
     * If the value that you enter is different from the input segment duration, MediaPackage rounds segments to the
     * nearest multiple of the input segment duration.
     * </p>
     * 
     * @param segmentDurationSeconds
     *        The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment
     *        duration. If the value that you enter is different from the input segment duration, MediaPackage rounds
     *        segments to the nearest multiple of the input segment duration.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment duration.
     * If the value that you enter is different from the input segment duration, MediaPackage rounds segments to the
     * nearest multiple of the input segment duration.
     * </p>
     * 
     * @return The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment
     *         duration. If the value that you enter is different from the input segment duration, MediaPackage rounds
     *         segments to the nearest multiple of the input segment duration.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment duration.
     * If the value that you enter is different from the input segment duration, MediaPackage rounds segments to the
     * nearest multiple of the input segment duration.
     * </p>
     * 
     * @param segmentDurationSeconds
     *        The duration (in seconds) of each segment. Enter a value equal to, or a multiple of, the input segment
     *        duration. If the value that you enter is different from the input segment duration, MediaPackage rounds
     *        segments to the nearest multiple of the input segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
        return this;
    }

    /**
     * <p>
     * The name that describes the segment. The name is the base name of the segment used in all content manifests
     * inside of the endpoint. You can't use spaces in the name.
     * </p>
     * 
     * @param segmentName
     *        The name that describes the segment. The name is the base name of the segment used in all content
     *        manifests inside of the endpoint. You can't use spaces in the name.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The name that describes the segment. The name is the base name of the segment used in all content manifests
     * inside of the endpoint. You can't use spaces in the name.
     * </p>
     * 
     * @return The name that describes the segment. The name is the base name of the segment used in all content
     *         manifests inside of the endpoint. You can't use spaces in the name.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The name that describes the segment. The name is the base name of the segment used in all content manifests
     * inside of the endpoint. You can't use spaces in the name.
     * </p>
     * 
     * @param segmentName
     *        The name that describes the segment. The name is the base name of the segment used in all content
     *        manifests inside of the endpoint. You can't use spaces in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withSegmentName(String segmentName) {
        setSegmentName(segmentName);
        return this;
    }

    /**
     * <p>
     * When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream can be
     * used with any audio rendition from the group.
     * </p>
     * 
     * @param tsUseAudioRenditionGroup
     *        When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream
     *        can be used with any audio rendition from the group.
     */

    public void setTsUseAudioRenditionGroup(Boolean tsUseAudioRenditionGroup) {
        this.tsUseAudioRenditionGroup = tsUseAudioRenditionGroup;
    }

    /**
     * <p>
     * When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream can be
     * used with any audio rendition from the group.
     * </p>
     * 
     * @return When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream
     *         can be used with any audio rendition from the group.
     */

    public Boolean getTsUseAudioRenditionGroup() {
        return this.tsUseAudioRenditionGroup;
    }

    /**
     * <p>
     * When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream can be
     * used with any audio rendition from the group.
     * </p>
     * 
     * @param tsUseAudioRenditionGroup
     *        When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream
     *        can be used with any audio rendition from the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withTsUseAudioRenditionGroup(Boolean tsUseAudioRenditionGroup) {
        setTsUseAudioRenditionGroup(tsUseAudioRenditionGroup);
        return this;
    }

    /**
     * <p>
     * When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream can be
     * used with any audio rendition from the group.
     * </p>
     * 
     * @return When selected, MediaPackage bundles all audio tracks in a rendition group. All other tracks in the stream
     *         can be used with any audio rendition from the group.
     */

    public Boolean isTsUseAudioRenditionGroup() {
        return this.tsUseAudioRenditionGroup;
    }

    /**
     * <p>
     * When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If false,
     * this extra stream is not included. MediaPackage generates an I-frame only stream from the first rendition in the
     * manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then generates and includes an
     * I-frames only playlist in the stream. This playlist permits player functionality like fast forward and rewind.
     * </p>
     * 
     * @param includeIframeOnlyStreams
     *        When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If
     *        false, this extra stream is not included. MediaPackage generates an I-frame only stream from the first
     *        rendition in the manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then
     *        generates and includes an I-frames only playlist in the stream. This playlist permits player functionality
     *        like fast forward and rewind.
     */

    public void setIncludeIframeOnlyStreams(Boolean includeIframeOnlyStreams) {
        this.includeIframeOnlyStreams = includeIframeOnlyStreams;
    }

    /**
     * <p>
     * When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If false,
     * this extra stream is not included. MediaPackage generates an I-frame only stream from the first rendition in the
     * manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then generates and includes an
     * I-frames only playlist in the stream. This playlist permits player functionality like fast forward and rewind.
     * </p>
     * 
     * @return When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If
     *         false, this extra stream is not included. MediaPackage generates an I-frame only stream from the first
     *         rendition in the manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then
     *         generates and includes an I-frames only playlist in the stream. This playlist permits player
     *         functionality like fast forward and rewind.
     */

    public Boolean getIncludeIframeOnlyStreams() {
        return this.includeIframeOnlyStreams;
    }

    /**
     * <p>
     * When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If false,
     * this extra stream is not included. MediaPackage generates an I-frame only stream from the first rendition in the
     * manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then generates and includes an
     * I-frames only playlist in the stream. This playlist permits player functionality like fast forward and rewind.
     * </p>
     * 
     * @param includeIframeOnlyStreams
     *        When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If
     *        false, this extra stream is not included. MediaPackage generates an I-frame only stream from the first
     *        rendition in the manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then
     *        generates and includes an I-frames only playlist in the stream. This playlist permits player functionality
     *        like fast forward and rewind.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withIncludeIframeOnlyStreams(Boolean includeIframeOnlyStreams) {
        setIncludeIframeOnlyStreams(includeIframeOnlyStreams);
        return this;
    }

    /**
     * <p>
     * When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If false,
     * this extra stream is not included. MediaPackage generates an I-frame only stream from the first rendition in the
     * manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then generates and includes an
     * I-frames only playlist in the stream. This playlist permits player functionality like fast forward and rewind.
     * </p>
     * 
     * @return When selected, the stream set includes an additional I-frame only stream, along with the other tracks. If
     *         false, this extra stream is not included. MediaPackage generates an I-frame only stream from the first
     *         rendition in the manifest. The service inserts EXT-I-FRAMES-ONLY tags in the output manifest, and then
     *         generates and includes an I-frames only playlist in the stream. This playlist permits player
     *         functionality like fast forward and rewind.
     */

    public Boolean isIncludeIframeOnlyStreams() {
        return this.includeIframeOnlyStreams;
    }

    /**
     * <p>
     * By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When selected,
     * MediaPackage passes through DVB subtitles into the output.
     * </p>
     * 
     * @param tsIncludeDvbSubtitles
     *        By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When
     *        selected, MediaPackage passes through DVB subtitles into the output.
     */

    public void setTsIncludeDvbSubtitles(Boolean tsIncludeDvbSubtitles) {
        this.tsIncludeDvbSubtitles = tsIncludeDvbSubtitles;
    }

    /**
     * <p>
     * By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When selected,
     * MediaPackage passes through DVB subtitles into the output.
     * </p>
     * 
     * @return By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When
     *         selected, MediaPackage passes through DVB subtitles into the output.
     */

    public Boolean getTsIncludeDvbSubtitles() {
        return this.tsIncludeDvbSubtitles;
    }

    /**
     * <p>
     * By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When selected,
     * MediaPackage passes through DVB subtitles into the output.
     * </p>
     * 
     * @param tsIncludeDvbSubtitles
     *        By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When
     *        selected, MediaPackage passes through DVB subtitles into the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withTsIncludeDvbSubtitles(Boolean tsIncludeDvbSubtitles) {
        setTsIncludeDvbSubtitles(tsIncludeDvbSubtitles);
        return this;
    }

    /**
     * <p>
     * By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When selected,
     * MediaPackage passes through DVB subtitles into the output.
     * </p>
     * 
     * @return By default, MediaPackage excludes all digital video broadcasting (DVB) subtitles from the output. When
     *         selected, MediaPackage passes through DVB subtitles into the output.
     */

    public Boolean isTsIncludeDvbSubtitles() {
        return this.tsIncludeDvbSubtitles;
    }

    /**
     * <p>
     * The SCTE configuration options in the segment settings.
     * </p>
     * 
     * @param scte
     *        The SCTE configuration options in the segment settings.
     */

    public void setScte(Scte scte) {
        this.scte = scte;
    }

    /**
     * <p>
     * The SCTE configuration options in the segment settings.
     * </p>
     * 
     * @return The SCTE configuration options in the segment settings.
     */

    public Scte getScte() {
        return this.scte;
    }

    /**
     * <p>
     * The SCTE configuration options in the segment settings.
     * </p>
     * 
     * @param scte
     *        The SCTE configuration options in the segment settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withScte(Scte scte) {
        setScte(scte);
        return this;
    }

    /**
     * @param encryption
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withEncryption(Encryption encryption) {
        setEncryption(encryption);
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
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName()).append(",");
        if (getTsUseAudioRenditionGroup() != null)
            sb.append("TsUseAudioRenditionGroup: ").append(getTsUseAudioRenditionGroup()).append(",");
        if (getIncludeIframeOnlyStreams() != null)
            sb.append("IncludeIframeOnlyStreams: ").append(getIncludeIframeOnlyStreams()).append(",");
        if (getTsIncludeDvbSubtitles() != null)
            sb.append("TsIncludeDvbSubtitles: ").append(getTsIncludeDvbSubtitles()).append(",");
        if (getScte() != null)
            sb.append("Scte: ").append(getScte()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Segment == false)
            return false;
        Segment other = (Segment) obj;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        if (other.getTsUseAudioRenditionGroup() == null ^ this.getTsUseAudioRenditionGroup() == null)
            return false;
        if (other.getTsUseAudioRenditionGroup() != null && other.getTsUseAudioRenditionGroup().equals(this.getTsUseAudioRenditionGroup()) == false)
            return false;
        if (other.getIncludeIframeOnlyStreams() == null ^ this.getIncludeIframeOnlyStreams() == null)
            return false;
        if (other.getIncludeIframeOnlyStreams() != null && other.getIncludeIframeOnlyStreams().equals(this.getIncludeIframeOnlyStreams()) == false)
            return false;
        if (other.getTsIncludeDvbSubtitles() == null ^ this.getTsIncludeDvbSubtitles() == null)
            return false;
        if (other.getTsIncludeDvbSubtitles() != null && other.getTsIncludeDvbSubtitles().equals(this.getTsIncludeDvbSubtitles()) == false)
            return false;
        if (other.getScte() == null ^ this.getScte() == null)
            return false;
        if (other.getScte() != null && other.getScte().equals(this.getScte()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        hashCode = prime * hashCode + ((getTsUseAudioRenditionGroup() == null) ? 0 : getTsUseAudioRenditionGroup().hashCode());
        hashCode = prime * hashCode + ((getIncludeIframeOnlyStreams() == null) ? 0 : getIncludeIframeOnlyStreams().hashCode());
        hashCode = prime * hashCode + ((getTsIncludeDvbSubtitles() == null) ? 0 : getTsIncludeDvbSubtitles().hashCode());
        hashCode = prime * hashCode + ((getScte() == null) ? 0 : getScte().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public Segment clone() {
        try {
            return (Segment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.SegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
