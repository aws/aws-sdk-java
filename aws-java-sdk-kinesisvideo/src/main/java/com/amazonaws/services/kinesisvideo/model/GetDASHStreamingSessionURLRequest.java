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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetDASHStreamingSessionURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDASHStreamingSessionURLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new manifest on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH manifest if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the manifest, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly to how
     * it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given start time.
     * Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the
     * manifest every two seconds. This mode is useful to be able to start playback from when an event is detected and
     * continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is
     * also useful to stream previously archived media without being limited by the 1,000 fragment limit in the
     * <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The manifest
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the MPEG-DASH manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the MPEG-DASH manifest. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     */
    private String playbackMode;
    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived using
     * attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not properly handle
     * gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the manifest file to enable
     * playback of media with discontinuities. Therefore, the wall-clock time derived from the manifest file may be
     * inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the accurate fragment timestamp is added
     * to each S element in the manifest file with the attribute name “kvs:ts”. A custom MPEG-DASH media player is
     * necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     */
    private String displayFragmentTimestamp;
    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence number in the session. If
     * DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to each S
     * element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used for logging or
     * for use with other APIs (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A custom MPEG-DASH
     * media player is necessary to leverage these this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     */
    private String displayFragmentNumber;
    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>.
     * This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If <code>PlaybackMode</code> is
     * <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should
     * not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, both
     * <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     * </p>
     */
    private DASHFragmentSelector dASHFragmentSelector;
    /**
     * <p>
     * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12
     * hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     */
    private Integer expires;
    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH manifest have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>, and
     * 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     */
    private Long maxManifestFragmentResults;

    /**
     * <p>
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to retrieve the MPEG-DASH manifest URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The name of the stream for which to retrieve the MPEG-DASH manifest URL.</p>
     *         <p>
     *         You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to retrieve the MPEG-DASH manifest URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDASHStreamingSessionURLRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.</p>
     *         <p>
     *         You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDASHStreamingSessionURLRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new manifest on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH manifest if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the manifest, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly to how
     * it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given start time.
     * Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the
     * manifest every two seconds. This mode is useful to be able to start playback from when an event is detected and
     * continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is
     * also useful to stream previously archived media without being limited by the 1,000 fragment limit in the
     * <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The manifest
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the MPEG-DASH manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the MPEG-DASH manifest. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param playbackMode
     *        Whether to retrieve live, live replay, or archived, on-demand data.</p>
     *        <p>
     *        Features of the three types of sessions include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with
     *        the latest fragments as they become available. We recommend that the media player retrieve a new manifest
     *        on a one-second interval. When this type of session is played in a media player, the user interface
     *        typically displays a "live" notification, with no scrubber control for choosing the position in the
     *        playback window to display.
     *        </p>
     *        <note>
     *        <p>
     *        In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if
     *        there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *        player to halt or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH
     *        manifest if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *        available after a subsequent fragment is added to the manifest, the older fragment is not added, and the
     *        gap is not filled.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly
     *        to how it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given
     *        start time. Instead of fragments being added as they are ingested, fragments are added as the duration of
     *        the next fragment elapses. For example, if the fragments in the session are two seconds long, then a new
     *        fragment is added to the manifest every two seconds. This mode is useful to be able to start playback from
     *        when an event is detected and continue live streaming media that has not yet been ingested as of the time
     *        of the session creation. This mode is also useful to stream previously archived media without being
     *        limited by the 1,000 fragment limit in the <code>ON_DEMAND</code> mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the
     *        fragments for the session, up to the number that is specified in
     *        <code>MaxMediaPlaylistFragmentResults</code>. The manifest must be retrieved only once for each session.
     *        When this type of session is played in a media player, the user interface typically displays a scrubber
     *        control for choosing the position in the playback window to display.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *        there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *        number (that is, the newer fragment) is included in the MPEG-DASH manifest. The other fragments are not
     *        included. Fragments that have different timestamps but have overlapping durations are still included in
     *        the MPEG-DASH manifest. This can lead to unexpected behavior in the media player.
     *        </p>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @see DASHPlaybackMode
     */

    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new manifest on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH manifest if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the manifest, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly to how
     * it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given start time.
     * Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the
     * manifest every two seconds. This mode is useful to be able to start playback from when an event is detected and
     * continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is
     * also useful to stream previously archived media without being limited by the 1,000 fragment limit in the
     * <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The manifest
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the MPEG-DASH manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the MPEG-DASH manifest. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @return Whether to retrieve live, live replay, or archived, on-demand data.</p>
     *         <p>
     *         Features of the three types of sessions include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with
     *         the latest fragments as they become available. We recommend that the media player retrieve a new manifest
     *         on a one-second interval. When this type of session is played in a media player, the user interface
     *         typically displays a "live" notification, with no scrubber control for choosing the position in the
     *         playback window to display.
     *         </p>
     *         <note>
     *         <p>
     *         In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if
     *         there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *         player to halt or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH
     *         manifest if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *         available after a subsequent fragment is added to the manifest, the older fragment is not added, and the
     *         gap is not filled.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly
     *         to how it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given
     *         start time. Instead of fragments being added as they are ingested, fragments are added as the duration of
     *         the next fragment elapses. For example, if the fragments in the session are two seconds long, then a new
     *         fragment is added to the manifest every two seconds. This mode is useful to be able to start playback
     *         from when an event is detected and continue live streaming media that has not yet been ingested as of the
     *         time of the session creation. This mode is also useful to stream previously archived media without being
     *         limited by the 1,000 fragment limit in the <code>ON_DEMAND</code> mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the
     *         fragments for the session, up to the number that is specified in
     *         <code>MaxMediaPlaylistFragmentResults</code>. The manifest must be retrieved only once for each session.
     *         When this type of session is played in a media player, the user interface typically displays a scrubber
     *         control for choosing the position in the playback window to display.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *         there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *         number (that is, the newer fragment) is included in the MPEG-DASH manifest. The other fragments are not
     *         included. Fragments that have different timestamps but have overlapping durations are still included in
     *         the MPEG-DASH manifest. This can lead to unexpected behavior in the media player.
     *         </p>
     *         <p>
     *         The default is <code>LIVE</code>.
     * @see DASHPlaybackMode
     */

    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new manifest on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH manifest if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the manifest, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly to how
     * it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given start time.
     * Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the
     * manifest every two seconds. This mode is useful to be able to start playback from when an event is detected and
     * continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is
     * also useful to stream previously archived media without being limited by the 1,000 fragment limit in the
     * <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The manifest
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the MPEG-DASH manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the MPEG-DASH manifest. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param playbackMode
     *        Whether to retrieve live, live replay, or archived, on-demand data.</p>
     *        <p>
     *        Features of the three types of sessions include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with
     *        the latest fragments as they become available. We recommend that the media player retrieve a new manifest
     *        on a one-second interval. When this type of session is played in a media player, the user interface
     *        typically displays a "live" notification, with no scrubber control for choosing the position in the
     *        playback window to display.
     *        </p>
     *        <note>
     *        <p>
     *        In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if
     *        there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *        player to halt or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH
     *        manifest if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *        available after a subsequent fragment is added to the manifest, the older fragment is not added, and the
     *        gap is not filled.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly
     *        to how it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given
     *        start time. Instead of fragments being added as they are ingested, fragments are added as the duration of
     *        the next fragment elapses. For example, if the fragments in the session are two seconds long, then a new
     *        fragment is added to the manifest every two seconds. This mode is useful to be able to start playback from
     *        when an event is detected and continue live streaming media that has not yet been ingested as of the time
     *        of the session creation. This mode is also useful to stream previously archived media without being
     *        limited by the 1,000 fragment limit in the <code>ON_DEMAND</code> mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the
     *        fragments for the session, up to the number that is specified in
     *        <code>MaxMediaPlaylistFragmentResults</code>. The manifest must be retrieved only once for each session.
     *        When this type of session is played in a media player, the user interface typically displays a scrubber
     *        control for choosing the position in the playback window to display.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *        there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *        number (that is, the newer fragment) is included in the MPEG-DASH manifest. The other fragments are not
     *        included. Fragments that have different timestamps but have overlapping durations are still included in
     *        the MPEG-DASH manifest. This can lead to unexpected behavior in the media player.
     *        </p>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DASHPlaybackMode
     */

    public GetDASHStreamingSessionURLRequest withPlaybackMode(String playbackMode) {
        setPlaybackMode(playbackMode);
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new manifest on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH manifest if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the manifest, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly to how
     * it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given start time.
     * Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the
     * manifest every two seconds. This mode is useful to be able to start playback from when an event is detected and
     * continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is
     * also useful to stream previously archived media without being limited by the 1,000 fragment limit in the
     * <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The manifest
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the MPEG-DASH manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the MPEG-DASH manifest. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param playbackMode
     *        Whether to retrieve live, live replay, or archived, on-demand data.</p>
     *        <p>
     *        Features of the three types of sessions include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH manifest is continually updated with
     *        the latest fragments as they become available. We recommend that the media player retrieve a new manifest
     *        on a one-second interval. When this type of session is played in a media player, the user interface
     *        typically displays a "live" notification, with no scrubber control for choosing the position in the
     *        playback window to display.
     *        </p>
     *        <note>
     *        <p>
     *        In <code>LIVE</code> mode, the newest available fragments are included in an MPEG-DASH manifest, even if
     *        there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *        player to halt or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH
     *        manifest if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *        available after a subsequent fragment is added to the manifest, the older fragment is not added, and the
     *        gap is not filled.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the MPEG-DASH manifest is updated similarly
     *        to how it is updated for <code>LIVE</code> mode except that it starts by including fragments from a given
     *        start time. Instead of fragments being added as they are ingested, fragments are added as the duration of
     *        the next fragment elapses. For example, if the fragments in the session are two seconds long, then a new
     *        fragment is added to the manifest every two seconds. This mode is useful to be able to start playback from
     *        when an event is detected and continue live streaming media that has not yet been ingested as of the time
     *        of the session creation. This mode is also useful to stream previously archived media without being
     *        limited by the 1,000 fragment limit in the <code>ON_DEMAND</code> mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH manifest contains all the
     *        fragments for the session, up to the number that is specified in
     *        <code>MaxMediaPlaylistFragmentResults</code>. The manifest must be retrieved only once for each session.
     *        When this type of session is played in a media player, the user interface typically displays a scrubber
     *        control for choosing the position in the playback window to display.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In all playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *        there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *        number (that is, the newer fragment) is included in the MPEG-DASH manifest. The other fragments are not
     *        included. Fragments that have different timestamps but have overlapping durations are still included in
     *        the MPEG-DASH manifest. This can lead to unexpected behavior in the media player.
     *        </p>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DASHPlaybackMode
     */

    public GetDASHStreamingSessionURLRequest withPlaybackMode(DASHPlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
        return this;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived using
     * attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not properly handle
     * gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the manifest file to enable
     * playback of media with discontinuities. Therefore, the wall-clock time derived from the manifest file may be
     * inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the accurate fragment timestamp is added
     * to each S element in the manifest file with the attribute name “kvs:ts”. A custom MPEG-DASH media player is
     * necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @param displayFragmentTimestamp
     *        Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived
     *        using attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not
     *        properly handle gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the
     *        manifest file to enable playback of media with discontinuities. Therefore, the wall-clock time derived
     *        from the manifest file may be inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *        accurate fragment timestamp is added to each S element in the manifest file with the attribute name
     *        “kvs:ts”. A custom MPEG-DASH media player is necessary to leverage this custom attribute.</p>
     *        <p>
     *        The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>
     *        , the timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     *        <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @see DASHDisplayFragmentTimestamp
     */

    public void setDisplayFragmentTimestamp(String displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived using
     * attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not properly handle
     * gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the manifest file to enable
     * playback of media with discontinuities. Therefore, the wall-clock time derived from the manifest file may be
     * inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the accurate fragment timestamp is added
     * to each S element in the manifest file with the attribute name “kvs:ts”. A custom MPEG-DASH media player is
     * necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @return Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived
     *         using attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not
     *         properly handle gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the
     *         manifest file to enable playback of media with discontinuities. Therefore, the wall-clock time derived
     *         from the manifest file may be inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *         accurate fragment timestamp is added to each S element in the manifest file with the attribute name
     *         “kvs:ts”. A custom MPEG-DASH media player is necessary to leverage this custom attribute.</p>
     *         <p>
     *         The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is
     *         <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start timestamps. Similarly, when
     *         <a>DASHFragmentSelector</a> is <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start
     *         timestamps.
     * @see DASHDisplayFragmentTimestamp
     */

    public String getDisplayFragmentTimestamp() {
        return this.displayFragmentTimestamp;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived using
     * attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not properly handle
     * gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the manifest file to enable
     * playback of media with discontinuities. Therefore, the wall-clock time derived from the manifest file may be
     * inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the accurate fragment timestamp is added
     * to each S element in the manifest file with the attribute name “kvs:ts”. A custom MPEG-DASH media player is
     * necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @param displayFragmentTimestamp
     *        Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived
     *        using attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not
     *        properly handle gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the
     *        manifest file to enable playback of media with discontinuities. Therefore, the wall-clock time derived
     *        from the manifest file may be inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *        accurate fragment timestamp is added to each S element in the manifest file with the attribute name
     *        “kvs:ts”. A custom MPEG-DASH media player is necessary to leverage this custom attribute.</p>
     *        <p>
     *        The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>
     *        , the timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     *        <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DASHDisplayFragmentTimestamp
     */

    public GetDASHStreamingSessionURLRequest withDisplayFragmentTimestamp(String displayFragmentTimestamp) {
        setDisplayFragmentTimestamp(displayFragmentTimestamp);
        return this;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived using
     * attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not properly handle
     * gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the manifest file to enable
     * playback of media with discontinuities. Therefore, the wall-clock time derived from the manifest file may be
     * inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the accurate fragment timestamp is added
     * to each S element in the manifest file with the attribute name “kvs:ts”. A custom MPEG-DASH media player is
     * necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @param displayFragmentTimestamp
     *        Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived
     *        using attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not
     *        properly handle gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the
     *        manifest file to enable playback of media with discontinuities. Therefore, the wall-clock time derived
     *        from the manifest file may be inaccurate. If DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *        accurate fragment timestamp is added to each S element in the manifest file with the attribute name
     *        “kvs:ts”. A custom MPEG-DASH media player is necessary to leverage this custom attribute.</p>
     *        <p>
     *        The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>
     *        , the timestamps will be the server start timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     *        <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DASHDisplayFragmentTimestamp
     */

    public GetDASHStreamingSessionURLRequest withDisplayFragmentTimestamp(DASHDisplayFragmentTimestamp displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp.toString();
        return this;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence number in the session. If
     * DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to each S
     * element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used for logging or
     * for use with other APIs (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A custom MPEG-DASH
     * media player is necessary to leverage these this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * 
     * @param displayFragmentNumber
     *        Fragments are identified in the manifest file based on their sequence number in the session. If
     *        DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to
     *        each S element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used
     *        for logging or for use with other APIs (e.g. <code>GetMedia</code> and
     *        <code>GetMediaForFragmentList</code>). A custom MPEG-DASH media player is necessary to leverage these this
     *        custom attribute.</p>
     *        <p>
     *        The default value is <code>NEVER</code>.
     * @see DASHDisplayFragmentNumber
     */

    public void setDisplayFragmentNumber(String displayFragmentNumber) {
        this.displayFragmentNumber = displayFragmentNumber;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence number in the session. If
     * DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to each S
     * element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used for logging or
     * for use with other APIs (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A custom MPEG-DASH
     * media player is necessary to leverage these this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * 
     * @return Fragments are identified in the manifest file based on their sequence number in the session. If
     *         DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     *         to each S element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be
     *         used for logging or for use with other APIs (e.g. <code>GetMedia</code> and
     *         <code>GetMediaForFragmentList</code>). A custom MPEG-DASH media player is necessary to leverage these
     *         this custom attribute.</p>
     *         <p>
     *         The default value is <code>NEVER</code>.
     * @see DASHDisplayFragmentNumber
     */

    public String getDisplayFragmentNumber() {
        return this.displayFragmentNumber;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence number in the session. If
     * DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to each S
     * element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used for logging or
     * for use with other APIs (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A custom MPEG-DASH
     * media player is necessary to leverage these this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * 
     * @param displayFragmentNumber
     *        Fragments are identified in the manifest file based on their sequence number in the session. If
     *        DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to
     *        each S element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used
     *        for logging or for use with other APIs (e.g. <code>GetMedia</code> and
     *        <code>GetMediaForFragmentList</code>). A custom MPEG-DASH media player is necessary to leverage these this
     *        custom attribute.</p>
     *        <p>
     *        The default value is <code>NEVER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DASHDisplayFragmentNumber
     */

    public GetDASHStreamingSessionURLRequest withDisplayFragmentNumber(String displayFragmentNumber) {
        setDisplayFragmentNumber(displayFragmentNumber);
        return this;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence number in the session. If
     * DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to each S
     * element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used for logging or
     * for use with other APIs (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A custom MPEG-DASH
     * media player is necessary to leverage these this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * 
     * @param displayFragmentNumber
     *        Fragments are identified in the manifest file based on their sequence number in the session. If
     *        DisplayFragmentNumber is set to <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added to
     *        each S element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used
     *        for logging or for use with other APIs (e.g. <code>GetMedia</code> and
     *        <code>GetMediaForFragmentList</code>). A custom MPEG-DASH media player is necessary to leverage these this
     *        custom attribute.</p>
     *        <p>
     *        The default value is <code>NEVER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DASHDisplayFragmentNumber
     */

    public GetDASHStreamingSessionURLRequest withDisplayFragmentNumber(DASHDisplayFragmentNumber displayFragmentNumber) {
        this.displayFragmentNumber = displayFragmentNumber.toString();
        return this;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>.
     * This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If <code>PlaybackMode</code> is
     * <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should
     * not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, both
     * <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     * </p>
     * 
     * @param dASHFragmentSelector
     *        The time range of the requested fragment, and the source of the timestamps.</p>
     *        <p>
     *        This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *        <code>LIVE_REPLAY</code>. This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If
     *        <code>PlaybackMode</code> is <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the
     *        <code>TimestampRange</code> should not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *        <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be
     *        set.
     */

    public void setDASHFragmentSelector(DASHFragmentSelector dASHFragmentSelector) {
        this.dASHFragmentSelector = dASHFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>.
     * This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If <code>PlaybackMode</code> is
     * <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should
     * not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, both
     * <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     * </p>
     * 
     * @return The time range of the requested fragment, and the source of the timestamps.</p>
     *         <p>
     *         This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *         <code>LIVE_REPLAY</code>. This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If
     *         <code>PlaybackMode</code> is <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the
     *         <code>TimestampRange</code> should not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *         <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be
     *         set.
     */

    public DASHFragmentSelector getDASHFragmentSelector() {
        return this.dASHFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>.
     * This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If <code>PlaybackMode</code> is
     * <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should
     * not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, both
     * <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     * </p>
     * 
     * @param dASHFragmentSelector
     *        The time range of the requested fragment, and the source of the timestamps.</p>
     *        <p>
     *        This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *        <code>LIVE_REPLAY</code>. This parameter is optional if PlaybackMode is<code/> <code>LIVE</code>. If
     *        <code>PlaybackMode</code> is <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the
     *        <code>TimestampRange</code> should not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *        <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDASHStreamingSessionURLRequest withDASHFragmentSelector(DASHFragmentSelector dASHFragmentSelector) {
        setDASHFragmentSelector(dASHFragmentSelector);
        return this;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12
     * hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * 
     * @param expires
     *        The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and
     *        43200 (12 hours).</p>
     *        <p>
     *        When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     *        <code>GetMP4MediaFragment</code> can be made for that session.
     *        </p>
     *        <p>
     *        The default is 300 (5 minutes).
     */

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12
     * hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * 
     * @return The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and
     *         43200 (12 hours).</p>
     *         <p>
     *         When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     *         <code>GetMP4MediaFragment</code> can be made for that session.
     *         </p>
     *         <p>
     *         The default is 300 (5 minutes).
     */

    public Integer getExpires() {
        return this.expires;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12
     * hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * 
     * @param expires
     *        The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and
     *        43200 (12 hours).</p>
     *        <p>
     *        When a session expires, no new calls to <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     *        <code>GetMP4MediaFragment</code> can be made for that session.
     *        </p>
     *        <p>
     *        The default is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDASHStreamingSessionURLRequest withExpires(Integer expires) {
        setExpires(expires);
        return this;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH manifest have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>, and
     * 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     * 
     * @param maxManifestFragmentResults
     *        The maximum number of fragments that are returned in the MPEG-DASH manifest.</p>
     *        <p>
     *        When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this
     *        value. When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up
     *        to this maximum number.
     *        </p>
     *        <p>
     *        When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often
     *        buffer content before starting playback. Increasing the buffer size increases the playback latency, but it
     *        decreases the likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH
     *        manifest have a minimum of 3 fragments and a maximum of 10 fragments.
     *        </p>
     *        <p>
     *        The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>,
     *        and 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *        </p>
     *        <p>
     *        The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     *        fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     */

    public void setMaxManifestFragmentResults(Long maxManifestFragmentResults) {
        this.maxManifestFragmentResults = maxManifestFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH manifest have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>, and
     * 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     * 
     * @return The maximum number of fragments that are returned in the MPEG-DASH manifest.</p>
     *         <p>
     *         When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to
     *         this value. When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are
     *         returned, up to this maximum number.
     *         </p>
     *         <p>
     *         When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often
     *         buffer content before starting playback. Increasing the buffer size increases the playback latency, but
     *         it decreases the likelihood that rebuffering will occur during playback. We recommend that a live
     *         MPEG-DASH manifest have a minimum of 3 fragments and a maximum of 10 fragments.
     *         </p>
     *         <p>
     *         The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>,
     *         and 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *         </p>
     *         <p>
     *         The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with
     *         1-second fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     */

    public Long getMaxManifestFragmentResults() {
        return this.maxManifestFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH manifest have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>, and
     * 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     * 
     * @param maxManifestFragmentResults
     *        The maximum number of fragments that are returned in the MPEG-DASH manifest.</p>
     *        <p>
     *        When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this
     *        value. When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up
     *        to this maximum number.
     *        </p>
     *        <p>
     *        When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often
     *        buffer content before starting playback. Increasing the buffer size increases the playback latency, but it
     *        decreases the likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH
     *        manifest have a minimum of 3 fragments and a maximum of 10 fragments.
     *        </p>
     *        <p>
     *        The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code> or <code>LIVE_REPLAY</code>,
     *        and 1,000 if <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *        </p>
     *        <p>
     *        The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     *        fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDASHStreamingSessionURLRequest withMaxManifestFragmentResults(Long maxManifestFragmentResults) {
        setMaxManifestFragmentResults(maxManifestFragmentResults);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getPlaybackMode() != null)
            sb.append("PlaybackMode: ").append(getPlaybackMode()).append(",");
        if (getDisplayFragmentTimestamp() != null)
            sb.append("DisplayFragmentTimestamp: ").append(getDisplayFragmentTimestamp()).append(",");
        if (getDisplayFragmentNumber() != null)
            sb.append("DisplayFragmentNumber: ").append(getDisplayFragmentNumber()).append(",");
        if (getDASHFragmentSelector() != null)
            sb.append("DASHFragmentSelector: ").append(getDASHFragmentSelector()).append(",");
        if (getExpires() != null)
            sb.append("Expires: ").append(getExpires()).append(",");
        if (getMaxManifestFragmentResults() != null)
            sb.append("MaxManifestFragmentResults: ").append(getMaxManifestFragmentResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDASHStreamingSessionURLRequest == false)
            return false;
        GetDASHStreamingSessionURLRequest other = (GetDASHStreamingSessionURLRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getPlaybackMode() == null ^ this.getPlaybackMode() == null)
            return false;
        if (other.getPlaybackMode() != null && other.getPlaybackMode().equals(this.getPlaybackMode()) == false)
            return false;
        if (other.getDisplayFragmentTimestamp() == null ^ this.getDisplayFragmentTimestamp() == null)
            return false;
        if (other.getDisplayFragmentTimestamp() != null && other.getDisplayFragmentTimestamp().equals(this.getDisplayFragmentTimestamp()) == false)
            return false;
        if (other.getDisplayFragmentNumber() == null ^ this.getDisplayFragmentNumber() == null)
            return false;
        if (other.getDisplayFragmentNumber() != null && other.getDisplayFragmentNumber().equals(this.getDisplayFragmentNumber()) == false)
            return false;
        if (other.getDASHFragmentSelector() == null ^ this.getDASHFragmentSelector() == null)
            return false;
        if (other.getDASHFragmentSelector() != null && other.getDASHFragmentSelector().equals(this.getDASHFragmentSelector()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        if (other.getMaxManifestFragmentResults() == null ^ this.getMaxManifestFragmentResults() == null)
            return false;
        if (other.getMaxManifestFragmentResults() != null && other.getMaxManifestFragmentResults().equals(this.getMaxManifestFragmentResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getPlaybackMode() == null) ? 0 : getPlaybackMode().hashCode());
        hashCode = prime * hashCode + ((getDisplayFragmentTimestamp() == null) ? 0 : getDisplayFragmentTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDisplayFragmentNumber() == null) ? 0 : getDisplayFragmentNumber().hashCode());
        hashCode = prime * hashCode + ((getDASHFragmentSelector() == null) ? 0 : getDASHFragmentSelector().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        hashCode = prime * hashCode + ((getMaxManifestFragmentResults() == null) ? 0 : getMaxManifestFragmentResults().hashCode());
        return hashCode;
    }

    @Override
    public GetDASHStreamingSessionURLRequest clone() {
        return (GetDASHStreamingSessionURLRequest) super.clone();
    }

}
