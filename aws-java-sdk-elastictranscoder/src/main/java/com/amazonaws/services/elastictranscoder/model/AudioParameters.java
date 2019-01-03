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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters required for transcoding audio.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>, <code>mp2</code>,
     * <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     * </p>
     */
    private String codec;
    /**
     * <p>
     * The sample rate of the audio stream in the output file, in Hertz. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     * </p>
     */
    private String sampleRate;
    /**
     * <p>
     * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320,
     * inclusive.
     * </p>
     */
    private String bitRate;
    /**
     * <p>
     * The number of audio channels in the output file. The following values are valid:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * </p>
     * <p>
     * One channel carries the information played by a single speaker. For example, a stereo track with two channels
     * sends one channel to the left speaker, and the other channel to the right speaker. The output channels are
     * organized into tracks. If you want Elastic Transcoder to automatically detect the number of audio channels in the
     * input file and use that value for the output file, select <code>auto</code>.
     * </p>
     * <p>
     * The output of a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For more
     * information about tracks, see <code>Audio:AudioPackingMode.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how Elastic Transcoder organizes channels and tracks, see
     * <code>Audio:AudioPackingMode</code>.
     * </p>
     */
    private String channels;
    /**
     * <p>
     * The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number of
     * channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and their
     * relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic Transcoder uses
     * <code>SingleTrack</code>.
     * </p>
     * <p>
     * The following values are valid:
     * </p>
     * <p>
     * <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and <code>OneChannelPerTrackWithMosTo8Tracks</code>
     * </p>
     * <p>
     * When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The track
     * can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code> containers.
     * </p>
     * <p>
     * The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple channels
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every channel in
     * your output. Your output can have up to eight single-channel tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight single-channel
     * tracks for your output. All tracks that do not contain audio data from an input channel are MOS, or Mit Out
     * Sound, tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each, plus six
     * MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus seven MOS
     * tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each, plus MOS tracks until there are eight tracks in all
     * </p>
     * </li>
     * </ul>
     */
    private String audioPackingMode;
    /**
     * <p>
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression profile
     * to use. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the output file.
     * </p>
     */
    private AudioCodecOptions codecOptions;

    /**
     * <p>
     * The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>, <code>mp2</code>,
     * <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     * </p>
     * 
     * @param codec
     *        The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>,
     *        <code>mp2</code>, <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>, <code>mp2</code>,
     * <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     * </p>
     * 
     * @return The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>,
     *         <code>mp2</code>, <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * <p>
     * The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>, <code>mp2</code>,
     * <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     * </p>
     * 
     * @param codec
     *        The audio codec for the output file. Valid values include <code>aac</code>, <code>flac</code>,
     *        <code>mp2</code>, <code>mp3</code>, <code>pcm</code>, and <code>vorbis</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioParameters withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * <p>
     * The sample rate of the audio stream in the output file, in Hertz. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     * </p>
     * 
     * @param sampleRate
     *        The sample rate of the audio stream in the output file, in Hertz. Valid values include:</p>
     *        <p>
     *        <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     *        <code>96000</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     */

    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The sample rate of the audio stream in the output file, in Hertz. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     * </p>
     * 
     * @return The sample rate of the audio stream in the output file, in Hertz. Valid values include:</p>
     *         <p>
     *         <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     *         <code>96000</code>
     *         </p>
     *         <p>
     *         If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     */

    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * <p>
     * The sample rate of the audio stream in the output file, in Hertz. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     * <code>96000</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     * </p>
     * 
     * @param sampleRate
     *        The sample rate of the audio stream in the output file, in Hertz. Valid values include:</p>
     *        <p>
     *        <code>auto</code>, <code>22050</code>, <code>32000</code>, <code>44100</code>, <code>48000</code>,
     *        <code>96000</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder automatically detects the sample rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioParameters withSampleRate(String sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * <p>
     * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320,
     * inclusive.
     * </p>
     * 
     * @param bitRate
     *        The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and
     *        320, inclusive.
     */

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    /**
     * <p>
     * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320,
     * inclusive.
     * </p>
     * 
     * @return The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and
     *         320, inclusive.
     */

    public String getBitRate() {
        return this.bitRate;
    }

    /**
     * <p>
     * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320,
     * inclusive.
     * </p>
     * 
     * @param bitRate
     *        The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and
     *        320, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioParameters withBitRate(String bitRate) {
        setBitRate(bitRate);
        return this;
    }

    /**
     * <p>
     * The number of audio channels in the output file. The following values are valid:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * </p>
     * <p>
     * One channel carries the information played by a single speaker. For example, a stereo track with two channels
     * sends one channel to the left speaker, and the other channel to the right speaker. The output channels are
     * organized into tracks. If you want Elastic Transcoder to automatically detect the number of audio channels in the
     * input file and use that value for the output file, select <code>auto</code>.
     * </p>
     * <p>
     * The output of a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For more
     * information about tracks, see <code>Audio:AudioPackingMode.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how Elastic Transcoder organizes channels and tracks, see
     * <code>Audio:AudioPackingMode</code>.
     * </p>
     * 
     * @param channels
     *        The number of audio channels in the output file. The following values are valid:</p>
     *        <p>
     *        <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     *        </p>
     *        <p>
     *        One channel carries the information played by a single speaker. For example, a stereo track with two
     *        channels sends one channel to the left speaker, and the other channel to the right speaker. The output
     *        channels are organized into tracks. If you want Elastic Transcoder to automatically detect the number of
     *        audio channels in the input file and use that value for the output file, select <code>auto</code>.
     *        </p>
     *        <p>
     *        The output of a specific channel value and inputs are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For more
     *        information about tracks, see <code>Audio:AudioPackingMode.</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about how Elastic Transcoder organizes channels and tracks, see
     *        <code>Audio:AudioPackingMode</code>.
     */

    public void setChannels(String channels) {
        this.channels = channels;
    }

    /**
     * <p>
     * The number of audio channels in the output file. The following values are valid:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * </p>
     * <p>
     * One channel carries the information played by a single speaker. For example, a stereo track with two channels
     * sends one channel to the left speaker, and the other channel to the right speaker. The output channels are
     * organized into tracks. If you want Elastic Transcoder to automatically detect the number of audio channels in the
     * input file and use that value for the output file, select <code>auto</code>.
     * </p>
     * <p>
     * The output of a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For more
     * information about tracks, see <code>Audio:AudioPackingMode.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how Elastic Transcoder organizes channels and tracks, see
     * <code>Audio:AudioPackingMode</code>.
     * </p>
     * 
     * @return The number of audio channels in the output file. The following values are valid:</p>
     *         <p>
     *         <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     *         </p>
     *         <p>
     *         One channel carries the information played by a single speaker. For example, a stereo track with two
     *         channels sends one channel to the left speaker, and the other channel to the right speaker. The output
     *         channels are organized into tracks. If you want Elastic Transcoder to automatically detect the number of
     *         audio channels in the input file and use that value for the output file, select <code>auto</code>.
     *         </p>
     *         <p>
     *         The output of a specific channel value and inputs are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For
     *         more information about tracks, see <code>Audio:AudioPackingMode.</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about how Elastic Transcoder organizes channels and tracks, see
     *         <code>Audio:AudioPackingMode</code>.
     */

    public String getChannels() {
        return this.channels;
    }

    /**
     * <p>
     * The number of audio channels in the output file. The following values are valid:
     * </p>
     * <p>
     * <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     * </p>
     * <p>
     * One channel carries the information played by a single speaker. For example, a stereo track with two channels
     * sends one channel to the left speaker, and the other channel to the right speaker. The output channels are
     * organized into tracks. If you want Elastic Transcoder to automatically detect the number of audio channels in the
     * input file and use that value for the output file, select <code>auto</code>.
     * </p>
     * <p>
     * The output of a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For more
     * information about tracks, see <code>Audio:AudioPackingMode.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how Elastic Transcoder organizes channels and tracks, see
     * <code>Audio:AudioPackingMode</code>.
     * </p>
     * 
     * @param channels
     *        The number of audio channels in the output file. The following values are valid:</p>
     *        <p>
     *        <code>auto</code>, <code>0</code>, <code>1</code>, <code>2</code>
     *        </p>
     *        <p>
     *        One channel carries the information played by a single speaker. For example, a stereo track with two
     *        channels sends one channel to the left speaker, and the other channel to the right speaker. The output
     *        channels are organized into tracks. If you want Elastic Transcoder to automatically detect the number of
     *        audio channels in the input file and use that value for the output file, select <code>auto</code>.
     *        </p>
     *        <p>
     *        The output of a specific channel value and inputs are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto</code> <b> channel specified, with any input:</b> Pass through up to eight input channels.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>0</code> <b> channels specified, with any input:</b> Audio omitted from the output.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1</code> <b> channel specified, with at least one input channel:</b> Mono sound.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2</code> <b> channels specified, with any input:</b> Two identical mono channels or stereo. For more
     *        information about tracks, see <code>Audio:AudioPackingMode.</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about how Elastic Transcoder organizes channels and tracks, see
     *        <code>Audio:AudioPackingMode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioParameters withChannels(String channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number of
     * channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and their
     * relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic Transcoder uses
     * <code>SingleTrack</code>.
     * </p>
     * <p>
     * The following values are valid:
     * </p>
     * <p>
     * <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and <code>OneChannelPerTrackWithMosTo8Tracks</code>
     * </p>
     * <p>
     * When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The track
     * can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code> containers.
     * </p>
     * <p>
     * The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple channels
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every channel in
     * your output. Your output can have up to eight single-channel tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight single-channel
     * tracks for your output. All tracks that do not contain audio data from an input channel are MOS, or Mit Out
     * Sound, tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each, plus six
     * MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus seven MOS
     * tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each, plus MOS tracks until there are eight tracks in all
     * </p>
     * </li>
     * </ul>
     * 
     * @param audioPackingMode
     *        The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number
     *        of channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and
     *        their relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic
     *        Transcoder uses <code>SingleTrack</code>.</p>
     *        <p>
     *        The following values are valid:
     *        </p>
     *        <p>
     *        <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and
     *        <code>OneChannelPerTrackWithMosTo8Tracks</code>
     *        </p>
     *        <p>
     *        When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The
     *        track can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code> containers.
     *        </p>
     *        <p>
     *        The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *        necessary
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple channels
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every channel
     *        in your output. Your output can have up to eight single-channel tracks.
     *        </p>
     *        <p>
     *        The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *        necessary
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel
     *        each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel
     *        each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one
     *        channel each
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight
     *        single-channel tracks for your output. All tracks that do not contain audio data from an input channel are
     *        MOS, or Mit Out Sound, tracks.
     *        </p>
     *        <p>
     *        The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs are
     *        as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *        necessary, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel
     *        each, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel
     *        each, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel
     *        each, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each,
     *        plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus seven
     *        MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one
     *        channel each, plus MOS tracks until there are eight tracks in all
     *        </p>
     *        </li>
     */

    public void setAudioPackingMode(String audioPackingMode) {
        this.audioPackingMode = audioPackingMode;
    }

    /**
     * <p>
     * The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number of
     * channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and their
     * relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic Transcoder uses
     * <code>SingleTrack</code>.
     * </p>
     * <p>
     * The following values are valid:
     * </p>
     * <p>
     * <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and <code>OneChannelPerTrackWithMosTo8Tracks</code>
     * </p>
     * <p>
     * When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The track
     * can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code> containers.
     * </p>
     * <p>
     * The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple channels
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every channel in
     * your output. Your output can have up to eight single-channel tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight single-channel
     * tracks for your output. All tracks that do not contain audio data from an input channel are MOS, or Mit Out
     * Sound, tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each, plus six
     * MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus seven MOS
     * tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each, plus MOS tracks until there are eight tracks in all
     * </p>
     * </li>
     * </ul>
     * 
     * @return The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number
     *         of channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and
     *         their relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic
     *         Transcoder uses <code>SingleTrack</code>.</p>
     *         <p>
     *         The following values are valid:
     *         </p>
     *         <p>
     *         <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and
     *         <code>OneChannelPerTrackWithMosTo8Tracks</code>
     *         </p>
     *         <p>
     *         When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The
     *         track can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code>
     *         containers.
     *         </p>
     *         <p>
     *         The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *         necessary
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two
     *         channels
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple
     *         channels
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every
     *         channel in your output. Your output can have up to eight single-channel tracks.
     *         </p>
     *         <p>
     *         The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *         necessary
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel
     *         each
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one
     *         channel each
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel
     *         each
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one
     *         channel each
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight
     *         single-channel tracks for your output. All tracks that do not contain audio data from an input channel
     *         are MOS, or Mit Out Sound, tracks.
     *         </p>
     *         <p>
     *         The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs
     *         are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *         necessary, plus six MOS tracks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel
     *         each, plus six MOS tracks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one
     *         channel each, plus six MOS tracks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel
     *         each, plus six MOS tracks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each,
     *         plus six MOS tracks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus
     *         seven MOS tracks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one
     *         channel each, plus MOS tracks until there are eight tracks in all
     *         </p>
     *         </li>
     */

    public String getAudioPackingMode() {
        return this.audioPackingMode;
    }

    /**
     * <p>
     * The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number of
     * channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and their
     * relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic Transcoder uses
     * <code>SingleTrack</code>.
     * </p>
     * <p>
     * The following values are valid:
     * </p>
     * <p>
     * <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and <code>OneChannelPerTrackWithMosTo8Tracks</code>
     * </p>
     * <p>
     * When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The track
     * can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code> containers.
     * </p>
     * <p>
     * The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple channels
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every channel in
     * your output. Your output can have up to eight single-channel tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight single-channel
     * tracks for your output. All tracks that do not contain audio data from an input channel are MOS, or Mit Out
     * Sound, tracks.
     * </p>
     * <p>
     * The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if necessary,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel each,
     * plus six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each, plus
     * six MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each, plus six
     * MOS tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus seven MOS
     * tracks
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one channel
     * each, plus MOS tracks until there are eight tracks in all
     * </p>
     * </li>
     * </ul>
     * 
     * @param audioPackingMode
     *        The method of organizing audio channels and tracks. Use <code>Audio:Channels</code> to specify the number
     *        of channels in your output, and <code>Audio:AudioPackingMode</code> to specify the number of tracks and
     *        their relation to the channels. If you do not specify an <code>Audio:AudioPackingMode</code>, Elastic
     *        Transcoder uses <code>SingleTrack</code>.</p>
     *        <p>
     *        The following values are valid:
     *        </p>
     *        <p>
     *        <code>SingleTrack</code>, <code>OneChannelPerTrack</code>, and
     *        <code>OneChannelPerTrackWithMosTo8Tracks</code>
     *        </p>
     *        <p>
     *        When you specify <code>SingleTrack</code>, Elastic Transcoder creates a single track for your output. The
     *        track can have up to eight channels. Use <code>SingleTrack</code> for all non-<code>mxf</code> containers.
     *        </p>
     *        <p>
     *        The outputs of <code>SingleTrack</code> for a specific channel value and inputs are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0</code> <b> channels with any input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *        necessary
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with one channel:</b> One track with two identical channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> One track with two channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with one track with two channels:</b> One track with two channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with multiple channels:</b> One track with two channels
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with multiple channels:</b> One track with multiple channels
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify <code>OneChannelPerTrack</code>, Elastic Transcoder creates a new track for every channel
     *        in your output. Your output can have up to eight single-channel tracks.
     *        </p>
     *        <p>
     *        The outputs of <code>OneChannelPerTrack</code> for a specific channel value and inputs are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *        necessary
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel
     *        each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel
     *        each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one
     *        channel each
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you specify <code>OneChannelPerTrackWithMosTo8Tracks</code>, Elastic Transcoder creates eight
     *        single-channel tracks for your output. All tracks that do not contain audio data from an input channel are
     *        MOS, or Mit Out Sound, tracks.
     *        </p>
     *        <p>
     *        The outputs of <code>OneChannelPerTrackWithMosTo8Tracks</code> for a specific channel value and inputs are
     *        as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>0 </code> <b>channels with any input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1, 2, or auto </code> <b>channels with no audio input:</b> Audio omitted from the output
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1 </code> <b>channel with any input with audio:</b> One track with one channel, downmixed if
     *        necessary, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with one channel:</b> Two tracks with one identical channel
     *        each, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with two tracks with one channel each:</b> Two tracks with one channel
     *        each, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 or auto </code> <b>channels with one track with two channels:</b> Two tracks with one channel
     *        each, plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>2 </code> <b>channels with one track with multiple channels:</b> Two tracks with one channel each,
     *        plus six MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with one channel:</b> One track with one channel, plus seven
     *        MOS tracks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>auto </code> <b>channels with one track with multiple channels:</b> Up to eight tracks with one
     *        channel each, plus MOS tracks until there are eight tracks in all
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioParameters withAudioPackingMode(String audioPackingMode) {
        setAudioPackingMode(audioPackingMode);
        return this;
    }

    /**
     * <p>
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression profile
     * to use. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the output file.
     * </p>
     * 
     * @param codecOptions
     *        If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression
     *        profile to use. Valid values include:</p>
     *        <p>
     *        <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the output
     *        file.
     */

    public void setCodecOptions(AudioCodecOptions codecOptions) {
        this.codecOptions = codecOptions;
    }

    /**
     * <p>
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression profile
     * to use. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the output file.
     * </p>
     * 
     * @return If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression
     *         profile to use. Valid values include:</p>
     *         <p>
     *         <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     *         </p>
     *         <p>
     *         If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the
     *         output file.
     */

    public AudioCodecOptions getCodecOptions() {
        return this.codecOptions;
    }

    /**
     * <p>
     * If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression profile
     * to use. Valid values include:
     * </p>
     * <p>
     * <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     * </p>
     * <p>
     * If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the output file.
     * </p>
     * 
     * @param codecOptions
     *        If you specified <code>AAC</code> for <code>Audio:Codec</code>, this is the <code>AAC</code> compression
     *        profile to use. Valid values include:</p>
     *        <p>
     *        <code>auto</code>, <code>AAC-LC</code>, <code>HE-AAC</code>, <code>HE-AACv2</code>
     *        </p>
     *        <p>
     *        If you specify <code>auto</code>, Elastic Transcoder chooses a profile based on the bit rate of the output
     *        file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioParameters withCodecOptions(AudioCodecOptions codecOptions) {
        setCodecOptions(codecOptions);
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
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getBitRate() != null)
            sb.append("BitRate: ").append(getBitRate()).append(",");
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
        if (getAudioPackingMode() != null)
            sb.append("AudioPackingMode: ").append(getAudioPackingMode()).append(",");
        if (getCodecOptions() != null)
            sb.append("CodecOptions: ").append(getCodecOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioParameters == false)
            return false;
        AudioParameters other = (AudioParameters) obj;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getBitRate() == null ^ this.getBitRate() == null)
            return false;
        if (other.getBitRate() != null && other.getBitRate().equals(this.getBitRate()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getAudioPackingMode() == null ^ this.getAudioPackingMode() == null)
            return false;
        if (other.getAudioPackingMode() != null && other.getAudioPackingMode().equals(this.getAudioPackingMode()) == false)
            return false;
        if (other.getCodecOptions() == null ^ this.getCodecOptions() == null)
            return false;
        if (other.getCodecOptions() != null && other.getCodecOptions().equals(this.getCodecOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getBitRate() == null) ? 0 : getBitRate().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getAudioPackingMode() == null) ? 0 : getAudioPackingMode().hashCode());
        hashCode = prime * hashCode + ((getCodecOptions() == null) ? 0 : getCodecOptions().hashCode());
        return hashCode;
    }

    @Override
    public AudioParameters clone() {
        try {
            return (AudioParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.AudioParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
