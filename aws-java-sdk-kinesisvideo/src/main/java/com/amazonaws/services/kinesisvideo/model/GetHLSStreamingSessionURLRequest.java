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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetHLSStreamingSessionURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHLSStreamingSessionURLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new playlist on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the playlist, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     */
    private String playbackMode;
    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     */
    private HLSFragmentSelector hLSFragmentSelector;
    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     * container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>. HLS has supported
     * MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS
     * typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more
     * bandwidth and cost than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     */
    private String containerFormat;
    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default
     * is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code>
     * when it is <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This
     * means that if there is any overlap between fragments (as is typical if <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps between fragments in some places, and
     * overwrites frames in other places. When there are discontinuity flags between fragments, the media player is
     * expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment.
     * We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not
     * accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the
     * player timeline to accurately map to the producer timestamps.
     * </p>
     */
    private String discontinuityMode;
    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media
     * players report the playhead position as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media playlist, some media players might
     * report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating
     * a playback experience that shows viewers the wall-clock time of the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     */
    private String displayFragmentTimestamp;
    /**
     * <p>
     * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12
     * hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     */
    private Integer expires;
    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media playlist, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     */
    private Long maxMediaPlaylistFragmentResults;

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to retrieve the HLS master playlist URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The name of the stream for which to retrieve the HLS master playlist URL.</p>
     *         <p>
     *         You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to retrieve the HLS master playlist URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHLSStreamingSessionURLRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.</p>
     *         <p>
     *         You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL.</p>
     *        <p>
     *        You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHLSStreamingSessionURLRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new playlist on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the playlist, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param playbackMode
     *        Whether to retrieve live or archived, on-demand data.</p>
     *        <p>
     *        Features of the two types of session include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with
     *        the latest fragments as they become available. We recommend that the media player retrieve a new playlist
     *        on a one-second interval. When this type of session is played in a media player, the user interface
     *        typically displays a "live" notification, with no scrubber control for choosing the position in the
     *        playback window to display.
     *        </p>
     *        <note>
     *        <p>
     *        In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if
     *        there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *        player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media
     *        playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *        available after a subsequent fragment is added to the playlist, the older fragment is not added, and the
     *        gap is not filled.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the
     *        fragments for the session, up to the number that is specified in
     *        <code>MaxMediaPlaylistFragmentResults</code>. The playlist must be retrieved only once for each session.
     *        When this type of session is played in a media player, the user interface typically displays a scrubber
     *        control for choosing the position in the playback window to display.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *        there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *        number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not
     *        included. Fragments that have different timestamps but have overlapping durations are still included in
     *        the HLS media playlist. This can lead to unexpected behavior in the media player.
     *        </p>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @see PlaybackMode
     */

    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new playlist on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the playlist, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @return Whether to retrieve live or archived, on-demand data.</p>
     *         <p>
     *         Features of the two types of session include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with
     *         the latest fragments as they become available. We recommend that the media player retrieve a new playlist
     *         on a one-second interval. When this type of session is played in a media player, the user interface
     *         typically displays a "live" notification, with no scrubber control for choosing the position in the
     *         playback window to display.
     *         </p>
     *         <note>
     *         <p>
     *         In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if
     *         there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *         player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media
     *         playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *         available after a subsequent fragment is added to the playlist, the older fragment is not added, and the
     *         gap is not filled.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the
     *         fragments for the session, up to the number that is specified in
     *         <code>MaxMediaPlaylistFragmentResults</code>. The playlist must be retrieved only once for each session.
     *         When this type of session is played in a media player, the user interface typically displays a scrubber
     *         control for choosing the position in the playback window to display.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *         there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *         number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not
     *         included. Fragments that have different timestamps but have overlapping durations are still included in
     *         the HLS media playlist. This can lead to unexpected behavior in the media player.
     *         </p>
     *         <p>
     *         The default is <code>LIVE</code>.
     * @see PlaybackMode
     */

    public String getPlaybackMode() {
        return this.playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new playlist on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the playlist, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param playbackMode
     *        Whether to retrieve live or archived, on-demand data.</p>
     *        <p>
     *        Features of the two types of session include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with
     *        the latest fragments as they become available. We recommend that the media player retrieve a new playlist
     *        on a one-second interval. When this type of session is played in a media player, the user interface
     *        typically displays a "live" notification, with no scrubber control for choosing the position in the
     *        playback window to display.
     *        </p>
     *        <note>
     *        <p>
     *        In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if
     *        there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *        player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media
     *        playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *        available after a subsequent fragment is added to the playlist, the older fragment is not added, and the
     *        gap is not filled.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the
     *        fragments for the session, up to the number that is specified in
     *        <code>MaxMediaPlaylistFragmentResults</code>. The playlist must be retrieved only once for each session.
     *        When this type of session is played in a media player, the user interface typically displays a scrubber
     *        control for choosing the position in the playback window to display.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *        there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *        number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not
     *        included. Fragments that have different timestamps but have overlapping durations are still included in
     *        the HLS media playlist. This can lead to unexpected behavior in the media player.
     *        </p>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaybackMode
     */

    public GetHLSStreamingSessionURLRequest withPlaybackMode(String playbackMode) {
        setPlaybackMode(playbackMode);
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with the
     * latest fragments as they become available. We recommend that the media player retrieve a new playlist on a
     * one-second interval. When this type of session is played in a media player, the user interface typically displays
     * a "live" notification, with no scrubber control for choosing the position in the playback window to display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if there is
     * a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt
     * or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older
     * than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment
     * is added to the playlist, the older fragment is not added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the fragments for
     * the session, up to the number that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     * must be retrieved only once for each session. When this type of session is played in a media player, the user
     * interface typically displays a scrubber control for choosing the position in the playback window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if there are
     * multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the
     * newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead
     * to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * 
     * @param playbackMode
     *        Whether to retrieve live or archived, on-demand data.</p>
     *        <p>
     *        Features of the two types of session include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media playlist is continually updated with
     *        the latest fragments as they become available. We recommend that the media player retrieve a new playlist
     *        on a one-second interval. When this type of session is played in a media player, the user interface
     *        typically displays a "live" notification, with no scrubber control for choosing the position in the
     *        playback window to display.
     *        </p>
     *        <note>
     *        <p>
     *        In <code>LIVE</code> mode, the newest available fragments are included in an HLS media playlist, even if
     *        there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media
     *        player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media
     *        playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes
     *        available after a subsequent fragment is added to the playlist, the older fragment is not added, and the
     *        gap is not filled.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media playlist contains all the
     *        fragments for the session, up to the number that is specified in
     *        <code>MaxMediaPlaylistFragmentResults</code>. The playlist must be retrieved only once for each session.
     *        When this type of session is played in a media player, the user interface typically displays a scrubber
     *        control for choosing the position in the playback window to display.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In both playback modes, if <code>FragmentSelectorType</code> is <code>PRODUCER_TIMESTAMP</code>, and if
     *        there are multiple fragments with the same start timestamp, the fragment that has the larger fragment
     *        number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not
     *        included. Fragments that have different timestamps but have overlapping durations are still included in
     *        the HLS media playlist. This can lead to unexpected behavior in the media player.
     *        </p>
     *        <p>
     *        The default is <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlaybackMode
     */

    public GetHLSStreamingSessionURLRequest withPlaybackMode(PlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
        return this;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     * 
     * @param hLSFragmentSelector
     *        The time range of the requested fragment, and the source of the timestamps.</p>
     *        <p>
     *        This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is
     *        optional if <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is
     *        <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code>
     *        should not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both
     *        <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     */

    public void setHLSFragmentSelector(HLSFragmentSelector hLSFragmentSelector) {
        this.hLSFragmentSelector = hLSFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     * 
     * @return The time range of the requested fragment, and the source of the timestamps.</p>
     *         <p>
     *         This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is
     *         optional if <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is
     *         <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code>
     *         should not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both
     *         <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     */

    public HLSFragmentSelector getHLSFragmentSelector() {
        return this.hLSFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     * 
     * @param hLSFragmentSelector
     *        The time range of the requested fragment, and the source of the timestamps.</p>
     *        <p>
     *        This parameter is required if <code>PlaybackMode</code> is <code>ON_DEMAND</code>. This parameter is
     *        optional if <code>PlaybackMode</code> is <code>LIVE</code>. If <code>PlaybackMode</code> is
     *        <code>LIVE</code>, the <code>FragmentSelectorType</code> can be set, but the <code>TimestampRange</code>
     *        should not be set. If <code>PlaybackMode</code> is <code>ON_DEMAND</code>, both
     *        <code>FragmentSelectorType</code> and <code>TimestampRange</code> must be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHLSStreamingSessionURLRequest withHLSFragmentSelector(HLSFragmentSelector hLSFragmentSelector) {
        setHLSFragmentSelector(hLSFragmentSelector);
        return this;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     * container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>. HLS has supported
     * MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS
     * typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more
     * bandwidth and cost than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * 
     * @param containerFormat
     *        Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     *        container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging
     *        because there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>.
     *        HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on
     *        older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically
     *        requires 5-25 percent more bandwidth and cost than fMP4.</p>
     *        <p>
     *        The default is <code>FRAGMENTED_MP4</code>.
     * @see ContainerFormat
     */

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     * container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>. HLS has supported
     * MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS
     * typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more
     * bandwidth and cost than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * 
     * @return Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     *         container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging
     *         because there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>.
     *         HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on
     *         older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically
     *         requires 5-25 percent more bandwidth and cost than fMP4.</p>
     *         <p>
     *         The default is <code>FRAGMENTED_MP4</code>.
     * @see ContainerFormat
     */

    public String getContainerFormat() {
        return this.containerFormat;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     * container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>. HLS has supported
     * MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS
     * typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more
     * bandwidth and cost than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * 
     * @param containerFormat
     *        Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     *        container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging
     *        because there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>.
     *        HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on
     *        older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically
     *        requires 5-25 percent more bandwidth and cost than fMP4.</p>
     *        <p>
     *        The default is <code>FRAGMENTED_MP4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerFormat
     */

    public GetHLSStreamingSessionURLRequest withContainerFormat(String containerFormat) {
        setContainerFormat(containerFormat);
        return this;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     * container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>. HLS has supported
     * MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS
     * typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more
     * bandwidth and cost than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * 
     * @param containerFormat
     *        Specifies which format should be used for packaging the media. Specifying the <code>FRAGMENTED_MP4</code>
     *        container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging
     *        because there is minimal packaging overhead. The other container format option is <code>MPEG_TS</code>.
     *        HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on
     *        older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically
     *        requires 5-25 percent more bandwidth and cost than fMP4.</p>
     *        <p>
     *        The default is <code>FRAGMENTED_MP4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerFormat
     */

    public GetHLSStreamingSessionURLRequest withContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default
     * is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code>
     * when it is <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This
     * means that if there is any overlap between fragments (as is typical if <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps between fragments in some places, and
     * overwrites frames in other places. When there are discontinuity flags between fragments, the media player is
     * expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment.
     * We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not
     * accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the
     * player timeline to accurately map to the producer timestamps.
     * </p>
     * 
     * @param discontinuityMode
     *        Specifies when flags marking discontinuities between fragments will be added to the media playlists. The
     *        default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and
     *        <code>NEVER</code> when it is <code>PRODUCER_TIMESTAMP</code>.</p>
     *        <p>
     *        Media players typically build a timeline of media content to play, based on the timestamps of each
     *        fragment. This means that if there is any overlap between fragments (as is typical if
     *        <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps
     *        between fragments in some places, and overwrites frames in other places. When there are discontinuity
     *        flags between fragments, the media player is expected to reset the timeline, resulting in the fragment
     *        being played immediately after the previous fragment. We recommend that you always have discontinuity
     *        flags between fragments if the fragment timestamps are not accurate or if fragments might be missing. You
     *        should not place discontinuity flags between fragments for the player timeline to accurately map to the
     *        producer timestamps.
     * @see DiscontinuityMode
     */

    public void setDiscontinuityMode(String discontinuityMode) {
        this.discontinuityMode = discontinuityMode;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default
     * is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code>
     * when it is <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This
     * means that if there is any overlap between fragments (as is typical if <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps between fragments in some places, and
     * overwrites frames in other places. When there are discontinuity flags between fragments, the media player is
     * expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment.
     * We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not
     * accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the
     * player timeline to accurately map to the producer timestamps.
     * </p>
     * 
     * @return Specifies when flags marking discontinuities between fragments will be added to the media playlists. The
     *         default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and
     *         <code>NEVER</code> when it is <code>PRODUCER_TIMESTAMP</code>.</p>
     *         <p>
     *         Media players typically build a timeline of media content to play, based on the timestamps of each
     *         fragment. This means that if there is any overlap between fragments (as is typical if
     *         <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps
     *         between fragments in some places, and overwrites frames in other places. When there are discontinuity
     *         flags between fragments, the media player is expected to reset the timeline, resulting in the fragment
     *         being played immediately after the previous fragment. We recommend that you always have discontinuity
     *         flags between fragments if the fragment timestamps are not accurate or if fragments might be missing. You
     *         should not place discontinuity flags between fragments for the player timeline to accurately map to the
     *         producer timestamps.
     * @see DiscontinuityMode
     */

    public String getDiscontinuityMode() {
        return this.discontinuityMode;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default
     * is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code>
     * when it is <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This
     * means that if there is any overlap between fragments (as is typical if <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps between fragments in some places, and
     * overwrites frames in other places. When there are discontinuity flags between fragments, the media player is
     * expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment.
     * We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not
     * accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the
     * player timeline to accurately map to the producer timestamps.
     * </p>
     * 
     * @param discontinuityMode
     *        Specifies when flags marking discontinuities between fragments will be added to the media playlists. The
     *        default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and
     *        <code>NEVER</code> when it is <code>PRODUCER_TIMESTAMP</code>.</p>
     *        <p>
     *        Media players typically build a timeline of media content to play, based on the timestamps of each
     *        fragment. This means that if there is any overlap between fragments (as is typical if
     *        <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps
     *        between fragments in some places, and overwrites frames in other places. When there are discontinuity
     *        flags between fragments, the media player is expected to reset the timeline, resulting in the fragment
     *        being played immediately after the previous fragment. We recommend that you always have discontinuity
     *        flags between fragments if the fragment timestamps are not accurate or if fragments might be missing. You
     *        should not place discontinuity flags between fragments for the player timeline to accurately map to the
     *        producer timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscontinuityMode
     */

    public GetHLSStreamingSessionURLRequest withDiscontinuityMode(String discontinuityMode) {
        setDiscontinuityMode(discontinuityMode);
        return this;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments will be added to the media playlists. The default
     * is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code>
     * when it is <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This
     * means that if there is any overlap between fragments (as is typical if <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps between fragments in some places, and
     * overwrites frames in other places. When there are discontinuity flags between fragments, the media player is
     * expected to reset the timeline, resulting in the fragment being played immediately after the previous fragment.
     * We recommend that you always have discontinuity flags between fragments if the fragment timestamps are not
     * accurate or if fragments might be missing. You should not place discontinuity flags between fragments for the
     * player timeline to accurately map to the producer timestamps.
     * </p>
     * 
     * @param discontinuityMode
     *        Specifies when flags marking discontinuities between fragments will be added to the media playlists. The
     *        default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, and
     *        <code>NEVER</code> when it is <code>PRODUCER_TIMESTAMP</code>.</p>
     *        <p>
     *        Media players typically build a timeline of media content to play, based on the timestamps of each
     *        fragment. This means that if there is any overlap between fragments (as is typical if
     *        <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>), the media player timeline has small gaps
     *        between fragments in some places, and overwrites frames in other places. When there are discontinuity
     *        flags between fragments, the media player is expected to reset the timeline, resulting in the fragment
     *        being played immediately after the previous fragment. We recommend that you always have discontinuity
     *        flags between fragments if the fragment timestamps are not accurate or if fragments might be missing. You
     *        should not place discontinuity flags between fragments for the player timeline to accurately map to the
     *        producer timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscontinuityMode
     */

    public GetHLSStreamingSessionURLRequest withDiscontinuityMode(DiscontinuityMode discontinuityMode) {
        this.discontinuityMode = discontinuityMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media
     * players report the playhead position as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media playlist, some media players might
     * report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating
     * a playback experience that shows viewers the wall-clock time of the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @param displayFragmentTimestamp
     *        Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically,
     *        media players report the playhead position as a time relative to the start of the first fragment in the
     *        playback session. However, when the start timestamps are included in the HLS media playlist, some media
     *        players might report the current playhead as an absolute time based on the fragment timestamps. This can
     *        be useful for creating a playback experience that shows viewers the wall-clock time of the media.</p>
     *        <p>
     *        The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     *        timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     *        <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @see DisplayFragmentTimestamp
     */

    public void setDisplayFragmentTimestamp(String displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media
     * players report the playhead position as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media playlist, some media players might
     * report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating
     * a playback experience that shows viewers the wall-clock time of the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @return Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically,
     *         media players report the playhead position as a time relative to the start of the first fragment in the
     *         playback session. However, when the start timestamps are included in the HLS media playlist, some media
     *         players might report the current playhead as an absolute time based on the fragment timestamps. This can
     *         be useful for creating a playback experience that shows viewers the wall-clock time of the media.</p>
     *         <p>
     *         The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     *         timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     *         <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @see DisplayFragmentTimestamp
     */

    public String getDisplayFragmentTimestamp() {
        return this.displayFragmentTimestamp;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media
     * players report the playhead position as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media playlist, some media players might
     * report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating
     * a playback experience that shows viewers the wall-clock time of the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @param displayFragmentTimestamp
     *        Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically,
     *        media players report the playhead position as a time relative to the start of the first fragment in the
     *        playback session. However, when the start timestamps are included in the HLS media playlist, some media
     *        players might report the current playhead as an absolute time based on the fragment timestamps. This can
     *        be useful for creating a playback experience that shows viewers the wall-clock time of the media.</p>
     *        <p>
     *        The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     *        timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     *        <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayFragmentTimestamp
     */

    public GetHLSStreamingSessionURLRequest withDisplayFragmentTimestamp(String displayFragmentTimestamp) {
        setDisplayFragmentTimestamp(displayFragmentTimestamp);
        return this;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media
     * players report the playhead position as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media playlist, some media players might
     * report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating
     * a playback experience that shows viewers the wall-clock time of the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     * timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * </p>
     * 
     * @param displayFragmentTimestamp
     *        Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically,
     *        media players report the playhead position as a time relative to the start of the first fragment in the
     *        playback session. However, when the start timestamps are included in the HLS media playlist, some media
     *        players might report the current playhead as an absolute time based on the fragment timestamps. This can
     *        be useful for creating a playback experience that shows viewers the wall-clock time of the media.</p>
     *        <p>
     *        The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     *        timestamps will be the server start timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     *        <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer start timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayFragmentTimestamp
     */

    public GetHLSStreamingSessionURLRequest withDisplayFragmentTimestamp(DisplayFragmentTimestamp displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp.toString();
        return this;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12
     * hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * 
     * @param expires
     *        The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and
     *        43200 (12 hours).</p>
     *        <p>
     *        When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>,
     *        <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can
     *        be made for that session.
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
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * 
     * @return The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and
     *         43200 (12 hours).</p>
     *         <p>
     *         When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>,
     *         <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code>
     *         can be made for that session.
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
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * 
     * @param expires
     *        The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and
     *        43200 (12 hours).</p>
     *        <p>
     *        When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>,
     *        <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can
     *        be made for that session.
     *        </p>
     *        <p>
     *        The default is 300 (5 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHLSStreamingSessionURLRequest withExpires(Integer expires) {
        setExpires(expires);
        return this;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media playlist, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     * 
     * @param maxMediaPlaylistFragmentResults
     *        The maximum number of fragments that are returned in the HLS media playlists.</p>
     *        <p>
     *        When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this
     *        value. When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up
     *        to this maximum number.
     *        </p>
     *        <p>
     *        When there are a higher number of fragments available in a live HLS media playlist, video players often
     *        buffer content before starting playback. Increasing the buffer size increases the playback latency, but it
     *        decreases the likelihood that rebuffering will occur during playback. We recommend that a live HLS media
     *        playlist have a minimum of 3 fragments and a maximum of 10 fragments.
     *        </p>
     *        <p>
     *        The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     *        <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *        </p>
     *        <p>
     *        The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     *        fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     */

    public void setMaxMediaPlaylistFragmentResults(Long maxMediaPlaylistFragmentResults) {
        this.maxMediaPlaylistFragmentResults = maxMediaPlaylistFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media playlist, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     * 
     * @return The maximum number of fragments that are returned in the HLS media playlists.</p>
     *         <p>
     *         When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to
     *         this value. When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are
     *         returned, up to this maximum number.
     *         </p>
     *         <p>
     *         When there are a higher number of fragments available in a live HLS media playlist, video players often
     *         buffer content before starting playback. Increasing the buffer size increases the playback latency, but
     *         it decreases the likelihood that rebuffering will occur during playback. We recommend that a live HLS
     *         media playlist have a minimum of 3 fragments and a maximum of 10 fragments.
     *         </p>
     *         <p>
     *         The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *         </p>
     *         <p>
     *         The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with
     *         1-second fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     */

    public Long getMaxMediaPlaylistFragmentResults() {
        return this.maxMediaPlaylistFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this value.
     * When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up to this
     * maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media playlist, video players often buffer
     * content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a
     * minimum of 3 fragments and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     * fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * </p>
     * 
     * @param maxMediaPlaylistFragmentResults
     *        The maximum number of fragments that are returned in the HLS media playlists.</p>
     *        <p>
     *        When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent fragments are returned up to this
     *        value. When the <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments are returned, up
     *        to this maximum number.
     *        </p>
     *        <p>
     *        When there are a higher number of fragments available in a live HLS media playlist, video players often
     *        buffer content before starting playback. Increasing the buffer size increases the playback latency, but it
     *        decreases the likelihood that rebuffering will occur during playback. We recommend that a live HLS media
     *        playlist have a minimum of 3 fragments and a maximum of 10 fragments.
     *        </p>
     *        <p>
     *        The default is 5 fragments if <code>PlaybackMode</code> is <code>LIVE</code>, and 1,000 if
     *        <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *        </p>
     *        <p>
     *        The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second
     *        fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHLSStreamingSessionURLRequest withMaxMediaPlaylistFragmentResults(Long maxMediaPlaylistFragmentResults) {
        setMaxMediaPlaylistFragmentResults(maxMediaPlaylistFragmentResults);
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
        if (getHLSFragmentSelector() != null)
            sb.append("HLSFragmentSelector: ").append(getHLSFragmentSelector()).append(",");
        if (getContainerFormat() != null)
            sb.append("ContainerFormat: ").append(getContainerFormat()).append(",");
        if (getDiscontinuityMode() != null)
            sb.append("DiscontinuityMode: ").append(getDiscontinuityMode()).append(",");
        if (getDisplayFragmentTimestamp() != null)
            sb.append("DisplayFragmentTimestamp: ").append(getDisplayFragmentTimestamp()).append(",");
        if (getExpires() != null)
            sb.append("Expires: ").append(getExpires()).append(",");
        if (getMaxMediaPlaylistFragmentResults() != null)
            sb.append("MaxMediaPlaylistFragmentResults: ").append(getMaxMediaPlaylistFragmentResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHLSStreamingSessionURLRequest == false)
            return false;
        GetHLSStreamingSessionURLRequest other = (GetHLSStreamingSessionURLRequest) obj;
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
        if (other.getHLSFragmentSelector() == null ^ this.getHLSFragmentSelector() == null)
            return false;
        if (other.getHLSFragmentSelector() != null && other.getHLSFragmentSelector().equals(this.getHLSFragmentSelector()) == false)
            return false;
        if (other.getContainerFormat() == null ^ this.getContainerFormat() == null)
            return false;
        if (other.getContainerFormat() != null && other.getContainerFormat().equals(this.getContainerFormat()) == false)
            return false;
        if (other.getDiscontinuityMode() == null ^ this.getDiscontinuityMode() == null)
            return false;
        if (other.getDiscontinuityMode() != null && other.getDiscontinuityMode().equals(this.getDiscontinuityMode()) == false)
            return false;
        if (other.getDisplayFragmentTimestamp() == null ^ this.getDisplayFragmentTimestamp() == null)
            return false;
        if (other.getDisplayFragmentTimestamp() != null && other.getDisplayFragmentTimestamp().equals(this.getDisplayFragmentTimestamp()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        if (other.getMaxMediaPlaylistFragmentResults() == null ^ this.getMaxMediaPlaylistFragmentResults() == null)
            return false;
        if (other.getMaxMediaPlaylistFragmentResults() != null
                && other.getMaxMediaPlaylistFragmentResults().equals(this.getMaxMediaPlaylistFragmentResults()) == false)
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
        hashCode = prime * hashCode + ((getHLSFragmentSelector() == null) ? 0 : getHLSFragmentSelector().hashCode());
        hashCode = prime * hashCode + ((getContainerFormat() == null) ? 0 : getContainerFormat().hashCode());
        hashCode = prime * hashCode + ((getDiscontinuityMode() == null) ? 0 : getDiscontinuityMode().hashCode());
        hashCode = prime * hashCode + ((getDisplayFragmentTimestamp() == null) ? 0 : getDisplayFragmentTimestamp().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        hashCode = prime * hashCode + ((getMaxMediaPlaylistFragmentResults() == null) ? 0 : getMaxMediaPlaylistFragmentResults().hashCode());
        return hashCode;
    }

    @Override
    public GetHLSStreamingSessionURLRequest clone() {
        return (GetHLSStreamingSessionURLRequest) super.clone();
    }

}
