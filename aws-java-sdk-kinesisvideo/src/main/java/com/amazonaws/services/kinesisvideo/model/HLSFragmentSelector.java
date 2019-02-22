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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the range of timestamps for the requested media, and the source of the timestamps.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/HLSFragmentSelector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HLSFragmentSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested with a
     * producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the <code>TimestampRange</code> ingested immediately
     * following the first fragment (up to the <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a>
     * value) are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a
     * stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media
     * playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested
     * within the same time range and very different points in time, only the oldest ingested collection of fragments
     * are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used in the
     * MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are
     * included in the HLS media playlist. This means that even if fragments ingested in the past have producer
     * timestamps with values now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     */
    private String fragmentSelectorType;
    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     * </p>
     */
    private HLSTimestampRange timestampRange;

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested with a
     * producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the <code>TimestampRange</code> ingested immediately
     * following the first fragment (up to the <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a>
     * value) are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a
     * stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media
     * playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested
     * within the same time range and very different points in time, only the oldest ingested collection of fragments
     * are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used in the
     * MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are
     * included in the HLS media playlist. This means that even if fragments ingested in the past have producer
     * timestamps with values now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * 
     * @param fragmentSelectorType
     *        The source of the timestamps for the requested media.</p>
     *        <p>
     *        When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *        <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested
     *        with a producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the
     *        media playlist. In addition, the fragments with producer timestamps within the <code>TimestampRange</code>
     *        ingested immediately following the first fragment (up to the
     *        <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a> value) are included.
     *        </p>
     *        <p>
     *        Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are
     *        producing a stream of fragments with producer timestamps that are approximately equal to the true clock
     *        time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If
     *        some fragments are ingested within the same time range and very different points in time, only the oldest
     *        ingested collection of fragments are returned.
     *        </p>
     *        <p>
     *        When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *        <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used
     *        in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server
     *        timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past
     *        have producer timestamps with values now, they are not included in the HLS media playlist.
     *        </p>
     *        <p>
     *        The default is <code>SERVER_TIMESTAMP</code>.
     * @see HLSFragmentSelectorType
     */

    public void setFragmentSelectorType(String fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType;
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested with a
     * producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the <code>TimestampRange</code> ingested immediately
     * following the first fragment (up to the <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a>
     * value) are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a
     * stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media
     * playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested
     * within the same time range and very different points in time, only the oldest ingested collection of fragments
     * are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used in the
     * MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are
     * included in the HLS media playlist. This means that even if fragments ingested in the past have producer
     * timestamps with values now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * 
     * @return The source of the timestamps for the requested media.</p>
     *         <p>
     *         When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *         <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested
     *         with a producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the
     *         media playlist. In addition, the fragments with producer timestamps within the
     *         <code>TimestampRange</code> ingested immediately following the first fragment (up to the
     *         <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a> value) are included.
     *         </p>
     *         <p>
     *         Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are
     *         producing a stream of fragments with producer timestamps that are approximately equal to the true clock
     *         time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If
     *         some fragments are ingested within the same time range and very different points in time, only the oldest
     *         ingested collection of fragments are returned.
     *         </p>
     *         <p>
     *         When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *         <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used
     *         in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server
     *         timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past
     *         have producer timestamps with values now, they are not included in the HLS media playlist.
     *         </p>
     *         <p>
     *         The default is <code>SERVER_TIMESTAMP</code>.
     * @see HLSFragmentSelectorType
     */

    public String getFragmentSelectorType() {
        return this.fragmentSelectorType;
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested with a
     * producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the <code>TimestampRange</code> ingested immediately
     * following the first fragment (up to the <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a>
     * value) are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a
     * stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media
     * playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested
     * within the same time range and very different points in time, only the oldest ingested collection of fragments
     * are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used in the
     * MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are
     * included in the HLS media playlist. This means that even if fragments ingested in the past have producer
     * timestamps with values now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * 
     * @param fragmentSelectorType
     *        The source of the timestamps for the requested media.</p>
     *        <p>
     *        When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *        <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested
     *        with a producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the
     *        media playlist. In addition, the fragments with producer timestamps within the <code>TimestampRange</code>
     *        ingested immediately following the first fragment (up to the
     *        <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a> value) are included.
     *        </p>
     *        <p>
     *        Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are
     *        producing a stream of fragments with producer timestamps that are approximately equal to the true clock
     *        time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If
     *        some fragments are ingested within the same time range and very different points in time, only the oldest
     *        ingested collection of fragments are returned.
     *        </p>
     *        <p>
     *        When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *        <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used
     *        in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server
     *        timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past
     *        have producer timestamps with values now, they are not included in the HLS media playlist.
     *        </p>
     *        <p>
     *        The default is <code>SERVER_TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HLSFragmentSelectorType
     */

    public HLSFragmentSelector withFragmentSelectorType(String fragmentSelectorType) {
        setFragmentSelectorType(fragmentSelectorType);
        return this;
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested with a
     * producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the <code>TimestampRange</code> ingested immediately
     * following the first fragment (up to the <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a>
     * value) are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a
     * stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media
     * playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested
     * within the same time range and very different points in time, only the oldest ingested collection of fragments
     * are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used in the
     * MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are
     * included in the HLS media playlist. This means that even if fragments ingested in the past have producer
     * timestamps with values now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * 
     * @param fragmentSelectorType
     *        The source of the timestamps for the requested media.</p>
     *        <p>
     *        When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *        <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>ON_DEMAND</code>, the first fragment ingested
     *        with a producer timestamp within the specified <a>FragmentSelector$TimestampRange</a> is included in the
     *        media playlist. In addition, the fragments with producer timestamps within the <code>TimestampRange</code>
     *        ingested immediately following the first fragment (up to the
     *        <a>GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults</a> value) are included.
     *        </p>
     *        <p>
     *        Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are
     *        producing a stream of fragments with producer timestamps that are approximately equal to the true clock
     *        time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If
     *        some fragments are ingested within the same time range and very different points in time, only the oldest
     *        ingested collection of fragments are returned.
     *        </p>
     *        <p>
     *        When <code>FragmentSelectorType</code> is set to <code>PRODUCER_TIMESTAMP</code> and
     *        <a>GetHLSStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>, the producer timestamps are used
     *        in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server
     *        timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past
     *        have producer timestamps with values now, they are not included in the HLS media playlist.
     *        </p>
     *        <p>
     *        The default is <code>SERVER_TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HLSFragmentSelectorType
     */

    public HLSFragmentSelector withFragmentSelectorType(HLSFragmentSelectorType fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     * </p>
     * 
     * @param timestampRange
     *        The start and end of the timestamp range for the requested media.</p>
     *        <p>
     *        This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     */

    public void setTimestampRange(HLSTimestampRange timestampRange) {
        this.timestampRange = timestampRange;
    }

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     * </p>
     * 
     * @return The start and end of the timestamp range for the requested media.</p>
     *         <p>
     *         This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     */

    public HLSTimestampRange getTimestampRange() {
        return this.timestampRange;
    }

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     * </p>
     * 
     * @param timestampRange
     *        The start and end of the timestamp range for the requested media.</p>
     *        <p>
     *        This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HLSFragmentSelector withTimestampRange(HLSTimestampRange timestampRange) {
        setTimestampRange(timestampRange);
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
        if (getFragmentSelectorType() != null)
            sb.append("FragmentSelectorType: ").append(getFragmentSelectorType()).append(",");
        if (getTimestampRange() != null)
            sb.append("TimestampRange: ").append(getTimestampRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HLSFragmentSelector == false)
            return false;
        HLSFragmentSelector other = (HLSFragmentSelector) obj;
        if (other.getFragmentSelectorType() == null ^ this.getFragmentSelectorType() == null)
            return false;
        if (other.getFragmentSelectorType() != null && other.getFragmentSelectorType().equals(this.getFragmentSelectorType()) == false)
            return false;
        if (other.getTimestampRange() == null ^ this.getTimestampRange() == null)
            return false;
        if (other.getTimestampRange() != null && other.getTimestampRange().equals(this.getTimestampRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFragmentSelectorType() == null) ? 0 : getFragmentSelectorType().hashCode());
        hashCode = prime * hashCode + ((getTimestampRange() == null) ? 0 : getTimestampRange().hashCode());
        return hashCode;
    }

    @Override
    public HLSFragmentSelector clone() {
        try {
            return (HLSFragmentSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.HLSFragmentSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
