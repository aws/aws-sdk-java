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
 * M2ts Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/M2tsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2tsSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * When set to drop, output audio streams will be removed from the program if the selected input audio stream is
     * removed from the input. This allows the output audio configuration to dynamically change based on input
     * configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not
     * connected to an active input stream.
     */
    private String absentInputAudioBehavior;
    /** When set to enabled, uses ARIB-compliant field muxing and removes video descriptor. */
    private String arib;
    /**
     * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String aribCaptionsPid;
    /**
     * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     * useConfigured, ARIB Captions will be on the configured pid number.
     */
    private String aribCaptionsPidControl;
    /** When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used. */
    private String audioBufferModel;
    /** The number of audio frames to insert for each PES packet. */
    private Integer audioFramesPerPes;
    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     * PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String audioPids;
    /**
     * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream
     * type = 0x06.
     */
    private String audioStreamType;
    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate.
     */
    private Integer bitrate;
    /**
     * If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none can
     * lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
     */
    private String bufferModel;
    /** When set to enabled, generates captionServiceDescriptor in PMT. */
    private String ccDescriptor;
    /** Inserts DVB Network Information Table (NIT) at the specified table repetition interval. */
    private DvbNitSettings dvbNitSettings;
    /** Inserts DVB Service Description Table (SDT) at the specified table repetition interval. */
    private DvbSdtSettings dvbSdtSettings;
    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID
     * specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String dvbSubPids;
    /** Inserts DVB Time and Date Table (TDT) at the specified table repetition interval. */
    private DvbTdtSettings dvbTdtSettings;
    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String dvbTeletextPid;
    /** If set to passthrough, passes any EBIF data from the input source to this output. */
    private String ebif;
    /**
     * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval
     * between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval.
     * Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2 will always follow the
     * video interval.
     */
    private String ebpAudioInterval;
    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     */
    private Integer ebpLookaheadMs;
    /**
     * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID
     * and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     */
    private String ebpPlacement;
    /** This field is unused and deprecated. */
    private String ecmPid;
    /** Include or exclude the ES Rate field in the PES header. */
    private String esRateInPes;
    /**
     * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String etvPlatformPid;
    /**
     * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String etvSignalPid;
    /** The length in seconds of each fragment. Only used with EBP markers. */
    private Double fragmentTime;
    /** If set to passthrough, passes any KLV data from the input source to this output. */
    private String klv;
    /**
     * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String klvDataPids;
    /**
     * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     * downstream encryption system requires periodic null packets.
     */
    private Double nullPacketBitrate;
    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     */
    private Integer patInterval;
    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream
     * (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary
     * stream.
     */
    private String pcrControl;
    /** Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream. */
    private Integer pcrPeriod;
    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value. Valid
     * values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String pcrPid;
    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     */
    private Integer pmtInterval;
    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String pmtPid;
    /** The value of the program number field in the Program Map Table. */
    private Integer programNum;
    /**
     * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts
     * as the maximum bitrate when vbr is set.
     */
    private String rateMode;
    /**
     * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String scte27Pids;
    /** Optionally pass SCTE-35 signals from the input source to this output. */
    private String scte35Control;
    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String scte35Pid;
    /**
     * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in
     * the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes.
     * psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to
     * the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point
     * information to the adaptation field using a legacy proprietary format.
     */
    private String segmentationMarkers;
    /**
     * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With
     * avails, it is possible that segments may be truncated, which can influence where future segmentation markers are
     * inserted.
     * 
     * When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset
     * the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
     * 
     * When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will
     * not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However,
     * all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight
     * exception to this rule.
     */
    private String segmentationStyle;
    /** The length in seconds of each segment. Required unless markers is set to None_. */
    private Double segmentationTime;
    /** When set to passthrough, timed metadata will be passed through from input to output. */
    private String timedMetadataBehavior;
    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String timedMetadataPid;
    /** The value of the transport stream ID field in the Program Map Table. */
    private Integer transportStreamId;
    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String videoPid;

    /**
     * When set to drop, output audio streams will be removed from the program if the selected input audio stream is
     * removed from the input. This allows the output audio configuration to dynamically change based on input
     * configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not
     * connected to an active input stream.
     * 
     * @param absentInputAudioBehavior
     *        When set to drop, output audio streams will be removed from the program if the selected input audio stream
     *        is removed from the input. This allows the output audio configuration to dynamically change based on input
     *        configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when
     *        not connected to an active input stream.
     * @see M2tsAbsentInputAudioBehavior
     */

    public void setAbsentInputAudioBehavior(String absentInputAudioBehavior) {
        this.absentInputAudioBehavior = absentInputAudioBehavior;
    }

    /**
     * When set to drop, output audio streams will be removed from the program if the selected input audio stream is
     * removed from the input. This allows the output audio configuration to dynamically change based on input
     * configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not
     * connected to an active input stream.
     * 
     * @return When set to drop, output audio streams will be removed from the program if the selected input audio
     *         stream is removed from the input. This allows the output audio configuration to dynamically change based
     *         on input configuration. If this is set to encodeSilence, all output audio streams will output encoded
     *         silence when not connected to an active input stream.
     * @see M2tsAbsentInputAudioBehavior
     */

    public String getAbsentInputAudioBehavior() {
        return this.absentInputAudioBehavior;
    }

    /**
     * When set to drop, output audio streams will be removed from the program if the selected input audio stream is
     * removed from the input. This allows the output audio configuration to dynamically change based on input
     * configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not
     * connected to an active input stream.
     * 
     * @param absentInputAudioBehavior
     *        When set to drop, output audio streams will be removed from the program if the selected input audio stream
     *        is removed from the input. This allows the output audio configuration to dynamically change based on input
     *        configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when
     *        not connected to an active input stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAbsentInputAudioBehavior
     */

    public M2tsSettings withAbsentInputAudioBehavior(String absentInputAudioBehavior) {
        setAbsentInputAudioBehavior(absentInputAudioBehavior);
        return this;
    }

    /**
     * When set to drop, output audio streams will be removed from the program if the selected input audio stream is
     * removed from the input. This allows the output audio configuration to dynamically change based on input
     * configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not
     * connected to an active input stream.
     * 
     * @param absentInputAudioBehavior
     *        When set to drop, output audio streams will be removed from the program if the selected input audio stream
     *        is removed from the input. This allows the output audio configuration to dynamically change based on input
     *        configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when
     *        not connected to an active input stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAbsentInputAudioBehavior
     */

    public M2tsSettings withAbsentInputAudioBehavior(M2tsAbsentInputAudioBehavior absentInputAudioBehavior) {
        this.absentInputAudioBehavior = absentInputAudioBehavior.toString();
        return this;
    }

    /**
     * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * 
     * @param arib
     *        When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * @see M2tsArib
     */

    public void setArib(String arib) {
        this.arib = arib;
    }

    /**
     * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * 
     * @return When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * @see M2tsArib
     */

    public String getArib() {
        return this.arib;
    }

    /**
     * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * 
     * @param arib
     *        When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsArib
     */

    public M2tsSettings withArib(String arib) {
        setArib(arib);
        return this;
    }

    /**
     * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * 
     * @param arib
     *        When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsArib
     */

    public M2tsSettings withArib(M2tsArib arib) {
        this.arib = arib.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param aribCaptionsPid
     *        Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setAribCaptionsPid(String aribCaptionsPid) {
        this.aribCaptionsPid = aribCaptionsPid;
    }

    /**
     * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or
     *         hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getAribCaptionsPid() {
        return this.aribCaptionsPid;
    }

    /**
     * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param aribCaptionsPid
     *        Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withAribCaptionsPid(String aribCaptionsPid) {
        setAribCaptionsPid(aribCaptionsPid);
        return this;
    }

    /**
     * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     * useConfigured, ARIB Captions will be on the configured pid number.
     * 
     * @param aribCaptionsPidControl
     *        If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     *        useConfigured, ARIB Captions will be on the configured pid number.
     * @see M2tsAribCaptionsPidControl
     */

    public void setAribCaptionsPidControl(String aribCaptionsPidControl) {
        this.aribCaptionsPidControl = aribCaptionsPidControl;
    }

    /**
     * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     * useConfigured, ARIB Captions will be on the configured pid number.
     * 
     * @return If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     *         useConfigured, ARIB Captions will be on the configured pid number.
     * @see M2tsAribCaptionsPidControl
     */

    public String getAribCaptionsPidControl() {
        return this.aribCaptionsPidControl;
    }

    /**
     * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     * useConfigured, ARIB Captions will be on the configured pid number.
     * 
     * @param aribCaptionsPidControl
     *        If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     *        useConfigured, ARIB Captions will be on the configured pid number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAribCaptionsPidControl
     */

    public M2tsSettings withAribCaptionsPidControl(String aribCaptionsPidControl) {
        setAribCaptionsPidControl(aribCaptionsPidControl);
        return this;
    }

    /**
     * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     * useConfigured, ARIB Captions will be on the configured pid number.
     * 
     * @param aribCaptionsPidControl
     *        If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids. If set to
     *        useConfigured, ARIB Captions will be on the configured pid number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAribCaptionsPidControl
     */

    public M2tsSettings withAribCaptionsPidControl(M2tsAribCaptionsPidControl aribCaptionsPidControl) {
        this.aribCaptionsPidControl = aribCaptionsPidControl.toString();
        return this;
    }

    /**
     * When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * 
     * @param audioBufferModel
     *        When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * @see M2tsAudioBufferModel
     */

    public void setAudioBufferModel(String audioBufferModel) {
        this.audioBufferModel = audioBufferModel;
    }

    /**
     * When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * 
     * @return When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * @see M2tsAudioBufferModel
     */

    public String getAudioBufferModel() {
        return this.audioBufferModel;
    }

    /**
     * When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * 
     * @param audioBufferModel
     *        When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioBufferModel
     */

    public M2tsSettings withAudioBufferModel(String audioBufferModel) {
        setAudioBufferModel(audioBufferModel);
        return this;
    }

    /**
     * When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * 
     * @param audioBufferModel
     *        When set to dvb, uses DVB buffer model for Dolby Digital audio. When set to atsc, the ATSC model is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioBufferModel
     */

    public M2tsSettings withAudioBufferModel(M2tsAudioBufferModel audioBufferModel) {
        this.audioBufferModel = audioBufferModel.toString();
        return this;
    }

    /**
     * The number of audio frames to insert for each PES packet.
     * 
     * @param audioFramesPerPes
     *        The number of audio frames to insert for each PES packet.
     */

    public void setAudioFramesPerPes(Integer audioFramesPerPes) {
        this.audioFramesPerPes = audioFramesPerPes;
    }

    /**
     * The number of audio frames to insert for each PES packet.
     * 
     * @return The number of audio frames to insert for each PES packet.
     */

    public Integer getAudioFramesPerPes() {
        return this.audioFramesPerPes;
    }

    /**
     * The number of audio frames to insert for each PES packet.
     * 
     * @param audioFramesPerPes
     *        The number of audio frames to insert for each PES packet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withAudioFramesPerPes(Integer audioFramesPerPes) {
        setAudioFramesPerPes(audioFramesPerPes);
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     * PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or
     *        hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setAudioPids(String audioPids) {
        this.audioPids = audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     * PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *         accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or
     *         hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getAudioPids() {
        return this.audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     * PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or
     *        hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withAudioPids(String audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream
     * type = 0x06.
     * 
     * @param audioStreamType
     *        When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses
     *        stream type = 0x06.
     * @see M2tsAudioStreamType
     */

    public void setAudioStreamType(String audioStreamType) {
        this.audioStreamType = audioStreamType;
    }

    /**
     * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream
     * type = 0x06.
     * 
     * @return When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses
     *         stream type = 0x06.
     * @see M2tsAudioStreamType
     */

    public String getAudioStreamType() {
        return this.audioStreamType;
    }

    /**
     * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream
     * type = 0x06.
     * 
     * @param audioStreamType
     *        When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses
     *        stream type = 0x06.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioStreamType
     */

    public M2tsSettings withAudioStreamType(String audioStreamType) {
        setAudioStreamType(audioStreamType);
        return this;
    }

    /**
     * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream
     * type = 0x06.
     * 
     * @param audioStreamType
     *        When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses
     *        stream type = 0x06.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioStreamType
     */

    public M2tsSettings withAudioStreamType(M2tsAudioStreamType audioStreamType) {
        this.audioStreamType = audioStreamType.toString();
        return this;
    }

    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate.
     * 
     * @param bitrate
     *        The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     *        determine the appropriate bitrate.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate.
     * 
     * @return The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     *         determine the appropriate bitrate.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate.
     * 
     * @param bitrate
     *        The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     *        determine the appropriate bitrate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none can
     * lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
     * 
     * @param bufferModel
     *        If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none
     *        can lead to lower latency, but low-memory devices may not be able to play back the stream without
     *        interruptions.
     * @see M2tsBufferModel
     */

    public void setBufferModel(String bufferModel) {
        this.bufferModel = bufferModel;
    }

    /**
     * If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none can
     * lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
     * 
     * @return If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none
     *         can lead to lower latency, but low-memory devices may not be able to play back the stream without
     *         interruptions.
     * @see M2tsBufferModel
     */

    public String getBufferModel() {
        return this.bufferModel;
    }

    /**
     * If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none can
     * lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
     * 
     * @param bufferModel
     *        If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none
     *        can lead to lower latency, but low-memory devices may not be able to play back the stream without
     *        interruptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsBufferModel
     */

    public M2tsSettings withBufferModel(String bufferModel) {
        setBufferModel(bufferModel);
        return this;
    }

    /**
     * If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none can
     * lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
     * 
     * @param bufferModel
     *        If set to multiplex, use multiplex buffer model for accurate interleaving. Setting to bufferModel to none
     *        can lead to lower latency, but low-memory devices may not be able to play back the stream without
     *        interruptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsBufferModel
     */

    public M2tsSettings withBufferModel(M2tsBufferModel bufferModel) {
        this.bufferModel = bufferModel.toString();
        return this;
    }

    /**
     * When set to enabled, generates captionServiceDescriptor in PMT.
     * 
     * @param ccDescriptor
     *        When set to enabled, generates captionServiceDescriptor in PMT.
     * @see M2tsCcDescriptor
     */

    public void setCcDescriptor(String ccDescriptor) {
        this.ccDescriptor = ccDescriptor;
    }

    /**
     * When set to enabled, generates captionServiceDescriptor in PMT.
     * 
     * @return When set to enabled, generates captionServiceDescriptor in PMT.
     * @see M2tsCcDescriptor
     */

    public String getCcDescriptor() {
        return this.ccDescriptor;
    }

    /**
     * When set to enabled, generates captionServiceDescriptor in PMT.
     * 
     * @param ccDescriptor
     *        When set to enabled, generates captionServiceDescriptor in PMT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsCcDescriptor
     */

    public M2tsSettings withCcDescriptor(String ccDescriptor) {
        setCcDescriptor(ccDescriptor);
        return this;
    }

    /**
     * When set to enabled, generates captionServiceDescriptor in PMT.
     * 
     * @param ccDescriptor
     *        When set to enabled, generates captionServiceDescriptor in PMT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsCcDescriptor
     */

    public M2tsSettings withCcDescriptor(M2tsCcDescriptor ccDescriptor) {
        this.ccDescriptor = ccDescriptor.toString();
        return this;
    }

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
     * 
     * @param dvbNitSettings
     *        Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
     */

    public void setDvbNitSettings(DvbNitSettings dvbNitSettings) {
        this.dvbNitSettings = dvbNitSettings;
    }

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
     * 
     * @return Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
     */

    public DvbNitSettings getDvbNitSettings() {
        return this.dvbNitSettings;
    }

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
     * 
     * @param dvbNitSettings
     *        Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbNitSettings(DvbNitSettings dvbNitSettings) {
        setDvbNitSettings(dvbNitSettings);
        return this;
    }

    /**
     * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
     * 
     * @param dvbSdtSettings
     *        Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
     */

    public void setDvbSdtSettings(DvbSdtSettings dvbSdtSettings) {
        this.dvbSdtSettings = dvbSdtSettings;
    }

    /**
     * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
     * 
     * @return Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
     */

    public DvbSdtSettings getDvbSdtSettings() {
        return this.dvbSdtSettings;
    }

    /**
     * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
     * 
     * @param dvbSdtSettings
     *        Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbSdtSettings(DvbSdtSettings dvbSdtSettings) {
        setDvbSdtSettings(dvbSdtSettings);
        return this;
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID
     * specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param dvbSubPids
     *        Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *        and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     *        Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setDvbSubPids(String dvbSubPids) {
        this.dvbSubPids = dvbSubPids;
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID
     * specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *         and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     *         Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getDvbSubPids() {
        return this.dvbSubPids;
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID
     * specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param dvbSubPids
     *        Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *        and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     *        Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbSubPids(String dvbSubPids) {
        setDvbSubPids(dvbSubPids);
        return this;
    }

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
     * 
     * @param dvbTdtSettings
     *        Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
     */

    public void setDvbTdtSettings(DvbTdtSettings dvbTdtSettings) {
        this.dvbTdtSettings = dvbTdtSettings;
    }

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
     * 
     * @return Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
     */

    public DvbTdtSettings getDvbTdtSettings() {
        return this.dvbTdtSettings;
    }

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
     * 
     * @param dvbTdtSettings
     *        Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbTdtSettings(DvbTdtSettings dvbTdtSettings) {
        setDvbTdtSettings(dvbTdtSettings);
        return this;
    }

    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param dvbTeletextPid
     *        Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setDvbTeletextPid(String dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
    }

    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     *         hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getDvbTeletextPid() {
        return this.dvbTeletextPid;
    }

    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param dvbTeletextPid
     *        Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbTeletextPid(String dvbTeletextPid) {
        setDvbTeletextPid(dvbTeletextPid);
        return this;
    }

    /**
     * If set to passthrough, passes any EBIF data from the input source to this output.
     * 
     * @param ebif
     *        If set to passthrough, passes any EBIF data from the input source to this output.
     * @see M2tsEbifControl
     */

    public void setEbif(String ebif) {
        this.ebif = ebif;
    }

    /**
     * If set to passthrough, passes any EBIF data from the input source to this output.
     * 
     * @return If set to passthrough, passes any EBIF data from the input source to this output.
     * @see M2tsEbifControl
     */

    public String getEbif() {
        return this.ebif;
    }

    /**
     * If set to passthrough, passes any EBIF data from the input source to this output.
     * 
     * @param ebif
     *        If set to passthrough, passes any EBIF data from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbifControl
     */

    public M2tsSettings withEbif(String ebif) {
        setEbif(ebif);
        return this;
    }

    /**
     * If set to passthrough, passes any EBIF data from the input source to this output.
     * 
     * @param ebif
     *        If set to passthrough, passes any EBIF data from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbifControl
     */

    public M2tsSettings withEbif(M2tsEbifControl ebif) {
        this.ebif = ebif.toString();
        return this;
    }

    /**
     * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval
     * between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval.
     * Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2 will always follow the
     * video interval.
     * 
     * @param ebpAudioInterval
     *        When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The
     *        interval between these additional markers will be fixed, and will be slightly shorter than the video EBP
     *        marker interval. Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2
     *        will always follow the video interval.
     * @see M2tsAudioInterval
     */

    public void setEbpAudioInterval(String ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval;
    }

    /**
     * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval
     * between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval.
     * Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2 will always follow the
     * video interval.
     * 
     * @return When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The
     *         interval between these additional markers will be fixed, and will be slightly shorter than the video EBP
     *         marker interval. Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2
     *         will always follow the video interval.
     * @see M2tsAudioInterval
     */

    public String getEbpAudioInterval() {
        return this.ebpAudioInterval;
    }

    /**
     * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval
     * between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval.
     * Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2 will always follow the
     * video interval.
     * 
     * @param ebpAudioInterval
     *        When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The
     *        interval between these additional markers will be fixed, and will be slightly shorter than the video EBP
     *        marker interval. Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2
     *        will always follow the video interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioInterval
     */

    public M2tsSettings withEbpAudioInterval(String ebpAudioInterval) {
        setEbpAudioInterval(ebpAudioInterval);
        return this;
    }

    /**
     * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval
     * between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval.
     * Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2 will always follow the
     * video interval.
     * 
     * @param ebpAudioInterval
     *        When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The
     *        interval between these additional markers will be fixed, and will be slightly shorter than the video EBP
     *        marker interval. Only available when EBP Cablelabs segmentation markers are selected. Partitions 1 and 2
     *        will always follow the video interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioInterval
     */

    public M2tsSettings withEbpAudioInterval(M2tsAudioInterval ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval.toString();
        return this;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     * 
     * @param ebpLookaheadMs
     *        When set, enforces that Encoder Boundary Points do not come within the specified time interval of each
     *        other by looking ahead at input video. If another EBP is going to come in within the specified time
     *        interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead
     *        value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient
     *        latency to make the lookahead accurate.
     */

    public void setEbpLookaheadMs(Integer ebpLookaheadMs) {
        this.ebpLookaheadMs = ebpLookaheadMs;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     * 
     * @return When set, enforces that Encoder Boundary Points do not come within the specified time interval of each
     *         other by looking ahead at input video. If another EBP is going to come in within the specified time
     *         interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The
     *         lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create
     *         sufficient latency to make the lookahead accurate.
     */

    public Integer getEbpLookaheadMs() {
        return this.ebpLookaheadMs;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     * 
     * @param ebpLookaheadMs
     *        When set, enforces that Encoder Boundary Points do not come within the specified time interval of each
     *        other by looking ahead at input video. If another EBP is going to come in within the specified time
     *        interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead
     *        value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient
     *        latency to make the lookahead accurate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withEbpLookaheadMs(Integer ebpLookaheadMs) {
        setEbpLookaheadMs(ebpLookaheadMs);
        return this;
    }

    /**
     * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID
     * and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * 
     * @param ebpPlacement
     *        Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the
     *        video PID and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * @see M2tsEbpPlacement
     */

    public void setEbpPlacement(String ebpPlacement) {
        this.ebpPlacement = ebpPlacement;
    }

    /**
     * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID
     * and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * 
     * @return Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the
     *         video PID and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * @see M2tsEbpPlacement
     */

    public String getEbpPlacement() {
        return this.ebpPlacement;
    }

    /**
     * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID
     * and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * 
     * @param ebpPlacement
     *        Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the
     *        video PID and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbpPlacement
     */

    public M2tsSettings withEbpPlacement(String ebpPlacement) {
        setEbpPlacement(ebpPlacement);
        return this;
    }

    /**
     * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID
     * and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * 
     * @param ebpPlacement
     *        Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the
     *        video PID and all audio PIDs. If set to videoPid, EBP markers will be placed on only the video PID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbpPlacement
     */

    public M2tsSettings withEbpPlacement(M2tsEbpPlacement ebpPlacement) {
        this.ebpPlacement = ebpPlacement.toString();
        return this;
    }

    /**
     * This field is unused and deprecated.
     * 
     * @param ecmPid
     *        This field is unused and deprecated.
     */

    public void setEcmPid(String ecmPid) {
        this.ecmPid = ecmPid;
    }

    /**
     * This field is unused and deprecated.
     * 
     * @return This field is unused and deprecated.
     */

    public String getEcmPid() {
        return this.ecmPid;
    }

    /**
     * This field is unused and deprecated.
     * 
     * @param ecmPid
     *        This field is unused and deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withEcmPid(String ecmPid) {
        setEcmPid(ecmPid);
        return this;
    }

    /**
     * Include or exclude the ES Rate field in the PES header.
     * 
     * @param esRateInPes
     *        Include or exclude the ES Rate field in the PES header.
     * @see M2tsEsRateInPes
     */

    public void setEsRateInPes(String esRateInPes) {
        this.esRateInPes = esRateInPes;
    }

    /**
     * Include or exclude the ES Rate field in the PES header.
     * 
     * @return Include or exclude the ES Rate field in the PES header.
     * @see M2tsEsRateInPes
     */

    public String getEsRateInPes() {
        return this.esRateInPes;
    }

    /**
     * Include or exclude the ES Rate field in the PES header.
     * 
     * @param esRateInPes
     *        Include or exclude the ES Rate field in the PES header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEsRateInPes
     */

    public M2tsSettings withEsRateInPes(String esRateInPes) {
        setEsRateInPes(esRateInPes);
        return this;
    }

    /**
     * Include or exclude the ES Rate field in the PES header.
     * 
     * @param esRateInPes
     *        Include or exclude the ES Rate field in the PES header.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEsRateInPes
     */

    public M2tsSettings withEsRateInPes(M2tsEsRateInPes esRateInPes) {
        this.esRateInPes = esRateInPes.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param etvPlatformPid
     *        Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setEtvPlatformPid(String etvPlatformPid) {
        this.etvPlatformPid = etvPlatformPid;
    }

    /**
     * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     *         hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getEtvPlatformPid() {
        return this.etvPlatformPid;
    }

    /**
     * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param etvPlatformPid
     *        Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withEtvPlatformPid(String etvPlatformPid) {
        setEtvPlatformPid(etvPlatformPid);
        return this;
    }

    /**
     * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param etvSignalPid
     *        Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setEtvSignalPid(String etvSignalPid) {
        this.etvSignalPid = etvSignalPid;
    }

    /**
     * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     *         hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getEtvSignalPid() {
        return this.etvSignalPid;
    }

    /**
     * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param etvSignalPid
     *        Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withEtvSignalPid(String etvSignalPid) {
        setEtvSignalPid(etvSignalPid);
        return this;
    }

    /**
     * The length in seconds of each fragment. Only used with EBP markers.
     * 
     * @param fragmentTime
     *        The length in seconds of each fragment. Only used with EBP markers.
     */

    public void setFragmentTime(Double fragmentTime) {
        this.fragmentTime = fragmentTime;
    }

    /**
     * The length in seconds of each fragment. Only used with EBP markers.
     * 
     * @return The length in seconds of each fragment. Only used with EBP markers.
     */

    public Double getFragmentTime() {
        return this.fragmentTime;
    }

    /**
     * The length in seconds of each fragment. Only used with EBP markers.
     * 
     * @param fragmentTime
     *        The length in seconds of each fragment. Only used with EBP markers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withFragmentTime(Double fragmentTime) {
        setFragmentTime(fragmentTime);
        return this;
    }

    /**
     * If set to passthrough, passes any KLV data from the input source to this output.
     * 
     * @param klv
     *        If set to passthrough, passes any KLV data from the input source to this output.
     * @see M2tsKlv
     */

    public void setKlv(String klv) {
        this.klv = klv;
    }

    /**
     * If set to passthrough, passes any KLV data from the input source to this output.
     * 
     * @return If set to passthrough, passes any KLV data from the input source to this output.
     * @see M2tsKlv
     */

    public String getKlv() {
        return this.klv;
    }

    /**
     * If set to passthrough, passes any KLV data from the input source to this output.
     * 
     * @param klv
     *        If set to passthrough, passes any KLV data from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsKlv
     */

    public M2tsSettings withKlv(String klv) {
        setKlv(klv);
        return this;
    }

    /**
     * If set to passthrough, passes any KLV data from the input source to this output.
     * 
     * @param klv
     *        If set to passthrough, passes any KLV data from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsKlv
     */

    public M2tsSettings withKlv(M2tsKlv klv) {
        this.klv = klv.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param klvDataPids
     *        Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be
     *        entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID
     *        specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setKlvDataPids(String klvDataPids) {
        this.klvDataPids = klvDataPids;
    }

    /**
     * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can
     *         be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     *         PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getKlvDataPids() {
        return this.klvDataPids;
    }

    /**
     * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param klvDataPids
     *        Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be
     *        entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID
     *        specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withKlvDataPids(String klvDataPids) {
        setKlvDataPids(klvDataPids);
        return this;
    }

    /**
     * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     * downstream encryption system requires periodic null packets.
     * 
     * @param nullPacketBitrate
     *        Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     *        downstream encryption system requires periodic null packets.
     */

    public void setNullPacketBitrate(Double nullPacketBitrate) {
        this.nullPacketBitrate = nullPacketBitrate;
    }

    /**
     * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     * downstream encryption system requires periodic null packets.
     * 
     * @return Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     *         downstream encryption system requires periodic null packets.
     */

    public Double getNullPacketBitrate() {
        return this.nullPacketBitrate;
    }

    /**
     * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     * downstream encryption system requires periodic null packets.
     * 
     * @param nullPacketBitrate
     *        Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     *        downstream encryption system requires periodic null packets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withNullPacketBitrate(Double nullPacketBitrate) {
        setNullPacketBitrate(nullPacketBitrate);
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     * 
     * @param patInterval
     *        The number of milliseconds between instances of this table in the output transport stream. Valid values
     *        are 0, 10..1000.
     */

    public void setPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream. Valid values
     *         are 0, 10..1000.
     */

    public Integer getPatInterval() {
        return this.patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     * 
     * @param patInterval
     *        The number of milliseconds between instances of this table in the output transport stream. Valid values
     *        are 0, 10..1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withPatInterval(Integer patInterval) {
        setPatInterval(patInterval);
        return this;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream
     * (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary
     * stream.
     * 
     * @param pcrControl
     *        When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary
     *        Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     *        elementary stream.
     * @see M2tsPcrControl
     */

    public void setPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream
     * (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary
     * stream.
     * 
     * @return When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized
     *         Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the
     *         video or audio elementary stream.
     * @see M2tsPcrControl
     */

    public String getPcrControl() {
        return this.pcrControl;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream
     * (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary
     * stream.
     * 
     * @param pcrControl
     *        When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary
     *        Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     *        elementary stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsPcrControl
     */

    public M2tsSettings withPcrControl(String pcrControl) {
        setPcrControl(pcrControl);
        return this;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream
     * (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary
     * stream.
     * 
     * @param pcrControl
     *        When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary
     *        Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     *        elementary stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsPcrControl
     */

    public M2tsSettings withPcrControl(M2tsPcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
        return this;
    }

    /**
     * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
     * 
     * @param pcrPeriod
     *        Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
     */

    public void setPcrPeriod(Integer pcrPeriod) {
        this.pcrPeriod = pcrPeriod;
    }

    /**
     * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
     * 
     * @return Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
     */

    public Integer getPcrPeriod() {
        return this.pcrPeriod;
    }

    /**
     * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
     * 
     * @param pcrPeriod
     *        Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withPcrPeriod(Integer pcrPeriod) {
        setPcrPeriod(pcrPeriod);
        return this;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value. Valid
     * values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param pcrPid
     *        Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *        given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal
     *        value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setPcrPid(String pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value. Valid
     * values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *         given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or
     *         hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getPcrPid() {
        return this.pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value. Valid
     * values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param pcrPid
     *        Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *        given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal
     *        value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withPcrPid(String pcrPid) {
        setPcrPid(pcrPid);
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     * 
     * @param pmtInterval
     *        The number of milliseconds between instances of this table in the output transport stream. Valid values
     *        are 0, 10..1000.
     */

    public void setPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream. Valid values
     *         are 0, 10..1000.
     */

    public Integer getPmtInterval() {
        return this.pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0,
     * 10..1000.
     * 
     * @param pmtInterval
     *        The number of milliseconds between instances of this table in the output transport stream. Valid values
     *        are 0, 10..1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withPmtInterval(Integer pmtInterval) {
        setPmtInterval(pmtInterval);
        return this;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param pmtPid
     *        Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a
     *        decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setPmtPid(String pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a
     *         decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getPmtPid() {
        return this.pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param pmtPid
     *        Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a
     *        decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withPmtPid(String pmtPid) {
        setPmtPid(pmtPid);
        return this;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * 
     * @param programNum
     *        The value of the program number field in the Program Map Table.
     */

    public void setProgramNum(Integer programNum) {
        this.programNum = programNum;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * 
     * @return The value of the program number field in the Program Map Table.
     */

    public Integer getProgramNum() {
        return this.programNum;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * 
     * @param programNum
     *        The value of the program number field in the Program Map Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withProgramNum(Integer programNum) {
        setProgramNum(programNum);
        return this;
    }

    /**
     * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts
     * as the maximum bitrate when vbr is set.
     * 
     * @param rateMode
     *        When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate
     *        setting acts as the maximum bitrate when vbr is set.
     * @see M2tsRateMode
     */

    public void setRateMode(String rateMode) {
        this.rateMode = rateMode;
    }

    /**
     * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts
     * as the maximum bitrate when vbr is set.
     * 
     * @return When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate
     *         setting acts as the maximum bitrate when vbr is set.
     * @see M2tsRateMode
     */

    public String getRateMode() {
        return this.rateMode;
    }

    /**
     * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts
     * as the maximum bitrate when vbr is set.
     * 
     * @param rateMode
     *        When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate
     *        setting acts as the maximum bitrate when vbr is set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsRateMode
     */

    public M2tsSettings withRateMode(String rateMode) {
        setRateMode(rateMode);
        return this;
    }

    /**
     * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts
     * as the maximum bitrate when vbr is set.
     * 
     * @param rateMode
     *        When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate
     *        setting acts as the maximum bitrate when vbr is set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsRateMode
     */

    public M2tsSettings withRateMode(M2tsRateMode rateMode) {
        this.rateMode = rateMode.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param scte27Pids
     *        Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and
     *        can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     *        PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setScte27Pids(String scte27Pids) {
        this.scte27Pids = scte27Pids;
    }

    /**
     * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and
     *         can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     *         Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getScte27Pids() {
        return this.scte27Pids;
    }

    /**
     * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be
     * entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified
     * must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param scte27Pids
     *        Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and
     *        can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each
     *        PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withScte27Pids(String scte27Pids) {
        setScte27Pids(scte27Pids);
        return this;
    }

    /**
     * Optionally pass SCTE-35 signals from the input source to this output.
     * 
     * @param scte35Control
     *        Optionally pass SCTE-35 signals from the input source to this output.
     * @see M2tsScte35Control
     */

    public void setScte35Control(String scte35Control) {
        this.scte35Control = scte35Control;
    }

    /**
     * Optionally pass SCTE-35 signals from the input source to this output.
     * 
     * @return Optionally pass SCTE-35 signals from the input source to this output.
     * @see M2tsScte35Control
     */

    public String getScte35Control() {
        return this.scte35Control;
    }

    /**
     * Optionally pass SCTE-35 signals from the input source to this output.
     * 
     * @param scte35Control
     *        Optionally pass SCTE-35 signals from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsScte35Control
     */

    public M2tsSettings withScte35Control(String scte35Control) {
        setScte35Control(scte35Control);
        return this;
    }

    /**
     * Optionally pass SCTE-35 signals from the input source to this output.
     * 
     * @param scte35Control
     *        Optionally pass SCTE-35 signals from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsScte35Control
     */

    public M2tsSettings withScte35Control(M2tsScte35Control scte35Control) {
        this.scte35Control = scte35Control.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param scte35Pid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setScte35Pid(String scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or
     *         hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getScte35Pid() {
        return this.scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param scte35Pid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or
     *        hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withScte35Pid(String scte35Pid) {
        setScte35Pid(scte35Pid);
        return this;
    }

    /**
     * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in
     * the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes.
     * psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to
     * the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point
     * information to the adaptation field using a legacy proprietary format.
     * 
     * @param segmentationMarkers
     *        Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator
     *        bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data
     *        bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point
     *        information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds
     *        Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
     * @see M2tsSegmentationMarkers
     */

    public void setSegmentationMarkers(String segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers;
    }

    /**
     * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in
     * the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes.
     * psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to
     * the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point
     * information to the adaptation field using a legacy proprietary format.
     * 
     * @return Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access
     *         Indicator bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the
     *         private data bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder
     *         Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     *         ebpLegacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary
     *         format.
     * @see M2tsSegmentationMarkers
     */

    public String getSegmentationMarkers() {
        return this.segmentationMarkers;
    }

    /**
     * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in
     * the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes.
     * psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to
     * the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point
     * information to the adaptation field using a legacy proprietary format.
     * 
     * @param segmentationMarkers
     *        Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator
     *        bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data
     *        bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point
     *        information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds
     *        Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationMarkers
     */

    public M2tsSettings withSegmentationMarkers(String segmentationMarkers) {
        setSegmentationMarkers(segmentationMarkers);
        return this;
    }

    /**
     * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in
     * the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes.
     * psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to
     * the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point
     * information to the adaptation field using a legacy proprietary format.
     * 
     * @param segmentationMarkers
     *        Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator
     *        bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data
     *        bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point
     *        information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds
     *        Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationMarkers
     */

    public M2tsSettings withSegmentationMarkers(M2tsSegmentationMarkers segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers.toString();
        return this;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With
     * avails, it is possible that segments may be truncated, which can influence where future segmentation markers are
     * inserted.
     * 
     * When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset
     * the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
     * 
     * When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will
     * not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However,
     * all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight
     * exception to this rule.
     * 
     * @param segmentationStyle
     *        The segmentation style parameter controls how segmentation markers are inserted into the transport stream.
     *        With avails, it is possible that segments may be truncated, which can influence where future segmentation
     *        markers are inserted.
     * 
     *        When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we
     *        will reset the segmentation cadence. This means the subsequent segment will have a duration of
     *        $segmentationTime seconds.
     * 
     *        When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we
     *        will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as
     *        well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP
     *        lookahead is a slight exception to this rule.
     * @see M2tsSegmentationStyle
     */

    public void setSegmentationStyle(String segmentationStyle) {
        this.segmentationStyle = segmentationStyle;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With
     * avails, it is possible that segments may be truncated, which can influence where future segmentation markers are
     * inserted.
     * 
     * When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset
     * the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
     * 
     * When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will
     * not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However,
     * all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight
     * exception to this rule.
     * 
     * @return The segmentation style parameter controls how segmentation markers are inserted into the transport
     *         stream. With avails, it is possible that segments may be truncated, which can influence where future
     *         segmentation markers are inserted.
     * 
     *         When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we
     *         will reset the segmentation cadence. This means the subsequent segment will have a duration of
     *         $segmentationTime seconds.
     * 
     *         When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we
     *         will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as
     *         well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP
     *         lookahead is a slight exception to this rule.
     * @see M2tsSegmentationStyle
     */

    public String getSegmentationStyle() {
        return this.segmentationStyle;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With
     * avails, it is possible that segments may be truncated, which can influence where future segmentation markers are
     * inserted.
     * 
     * When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset
     * the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
     * 
     * When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will
     * not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However,
     * all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight
     * exception to this rule.
     * 
     * @param segmentationStyle
     *        The segmentation style parameter controls how segmentation markers are inserted into the transport stream.
     *        With avails, it is possible that segments may be truncated, which can influence where future segmentation
     *        markers are inserted.
     * 
     *        When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we
     *        will reset the segmentation cadence. This means the subsequent segment will have a duration of
     *        $segmentationTime seconds.
     * 
     *        When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we
     *        will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as
     *        well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP
     *        lookahead is a slight exception to this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationStyle
     */

    public M2tsSettings withSegmentationStyle(String segmentationStyle) {
        setSegmentationStyle(segmentationStyle);
        return this;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With
     * avails, it is possible that segments may be truncated, which can influence where future segmentation markers are
     * inserted.
     * 
     * When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset
     * the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
     * 
     * When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will
     * not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However,
     * all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight
     * exception to this rule.
     * 
     * @param segmentationStyle
     *        The segmentation style parameter controls how segmentation markers are inserted into the transport stream.
     *        With avails, it is possible that segments may be truncated, which can influence where future segmentation
     *        markers are inserted.
     * 
     *        When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we
     *        will reset the segmentation cadence. This means the subsequent segment will have a duration of
     *        $segmentationTime seconds.
     * 
     *        When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we
     *        will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as
     *        well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP
     *        lookahead is a slight exception to this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationStyle
     */

    public M2tsSettings withSegmentationStyle(M2tsSegmentationStyle segmentationStyle) {
        this.segmentationStyle = segmentationStyle.toString();
        return this;
    }

    /**
     * The length in seconds of each segment. Required unless markers is set to None_.
     * 
     * @param segmentationTime
     *        The length in seconds of each segment. Required unless markers is set to None_.
     */

    public void setSegmentationTime(Double segmentationTime) {
        this.segmentationTime = segmentationTime;
    }

    /**
     * The length in seconds of each segment. Required unless markers is set to None_.
     * 
     * @return The length in seconds of each segment. Required unless markers is set to None_.
     */

    public Double getSegmentationTime() {
        return this.segmentationTime;
    }

    /**
     * The length in seconds of each segment. Required unless markers is set to None_.
     * 
     * @param segmentationTime
     *        The length in seconds of each segment. Required unless markers is set to None_.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withSegmentationTime(Double segmentationTime) {
        setSegmentationTime(segmentationTime);
        return this;
    }

    /**
     * When set to passthrough, timed metadata will be passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata will be passed through from input to output.
     * @see M2tsTimedMetadataBehavior
     */

    public void setTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata will be passed through from input to output.
     * 
     * @return When set to passthrough, timed metadata will be passed through from input to output.
     * @see M2tsTimedMetadataBehavior
     */

    public String getTimedMetadataBehavior() {
        return this.timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata will be passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata will be passed through from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsTimedMetadataBehavior
     */

    public M2tsSettings withTimedMetadataBehavior(String timedMetadataBehavior) {
        setTimedMetadataBehavior(timedMetadataBehavior);
        return this;
    }

    /**
     * When set to passthrough, timed metadata will be passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata will be passed through from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsTimedMetadataBehavior
     */

    public M2tsSettings withTimedMetadataBehavior(M2tsTimedMetadataBehavior timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param timedMetadataPid
     *        Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal
     *        or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setTimedMetadataPid(String timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal
     *         or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getTimedMetadataPid() {
        return this.timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param timedMetadataPid
     *        Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal
     *        or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withTimedMetadataPid(String timedMetadataPid) {
        setTimedMetadataPid(timedMetadataPid);
        return this;
    }

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * 
     * @param transportStreamId
     *        The value of the transport stream ID field in the Program Map Table.
     */

    public void setTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * 
     * @return The value of the transport stream ID field in the Program Map Table.
     */

    public Integer getTransportStreamId() {
        return this.transportStreamId;
    }

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * 
     * @param transportStreamId
     *        The value of the transport stream ID field in the Program Map Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withTransportStreamId(Integer transportStreamId) {
        setTransportStreamId(transportStreamId);
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param videoPid
     *        Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a
     *        decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public void setVideoPid(String videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @return Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a
     *         decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */

    public String getVideoPid() {
        return this.videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * 
     * @param videoPid
     *        Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a
     *        decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withVideoPid(String videoPid) {
        setVideoPid(videoPid);
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
        if (getAbsentInputAudioBehavior() != null)
            sb.append("AbsentInputAudioBehavior: ").append(getAbsentInputAudioBehavior()).append(",");
        if (getArib() != null)
            sb.append("Arib: ").append(getArib()).append(",");
        if (getAribCaptionsPid() != null)
            sb.append("AribCaptionsPid: ").append(getAribCaptionsPid()).append(",");
        if (getAribCaptionsPidControl() != null)
            sb.append("AribCaptionsPidControl: ").append(getAribCaptionsPidControl()).append(",");
        if (getAudioBufferModel() != null)
            sb.append("AudioBufferModel: ").append(getAudioBufferModel()).append(",");
        if (getAudioFramesPerPes() != null)
            sb.append("AudioFramesPerPes: ").append(getAudioFramesPerPes()).append(",");
        if (getAudioPids() != null)
            sb.append("AudioPids: ").append(getAudioPids()).append(",");
        if (getAudioStreamType() != null)
            sb.append("AudioStreamType: ").append(getAudioStreamType()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBufferModel() != null)
            sb.append("BufferModel: ").append(getBufferModel()).append(",");
        if (getCcDescriptor() != null)
            sb.append("CcDescriptor: ").append(getCcDescriptor()).append(",");
        if (getDvbNitSettings() != null)
            sb.append("DvbNitSettings: ").append(getDvbNitSettings()).append(",");
        if (getDvbSdtSettings() != null)
            sb.append("DvbSdtSettings: ").append(getDvbSdtSettings()).append(",");
        if (getDvbSubPids() != null)
            sb.append("DvbSubPids: ").append(getDvbSubPids()).append(",");
        if (getDvbTdtSettings() != null)
            sb.append("DvbTdtSettings: ").append(getDvbTdtSettings()).append(",");
        if (getDvbTeletextPid() != null)
            sb.append("DvbTeletextPid: ").append(getDvbTeletextPid()).append(",");
        if (getEbif() != null)
            sb.append("Ebif: ").append(getEbif()).append(",");
        if (getEbpAudioInterval() != null)
            sb.append("EbpAudioInterval: ").append(getEbpAudioInterval()).append(",");
        if (getEbpLookaheadMs() != null)
            sb.append("EbpLookaheadMs: ").append(getEbpLookaheadMs()).append(",");
        if (getEbpPlacement() != null)
            sb.append("EbpPlacement: ").append(getEbpPlacement()).append(",");
        if (getEcmPid() != null)
            sb.append("EcmPid: ").append(getEcmPid()).append(",");
        if (getEsRateInPes() != null)
            sb.append("EsRateInPes: ").append(getEsRateInPes()).append(",");
        if (getEtvPlatformPid() != null)
            sb.append("EtvPlatformPid: ").append(getEtvPlatformPid()).append(",");
        if (getEtvSignalPid() != null)
            sb.append("EtvSignalPid: ").append(getEtvSignalPid()).append(",");
        if (getFragmentTime() != null)
            sb.append("FragmentTime: ").append(getFragmentTime()).append(",");
        if (getKlv() != null)
            sb.append("Klv: ").append(getKlv()).append(",");
        if (getKlvDataPids() != null)
            sb.append("KlvDataPids: ").append(getKlvDataPids()).append(",");
        if (getNullPacketBitrate() != null)
            sb.append("NullPacketBitrate: ").append(getNullPacketBitrate()).append(",");
        if (getPatInterval() != null)
            sb.append("PatInterval: ").append(getPatInterval()).append(",");
        if (getPcrControl() != null)
            sb.append("PcrControl: ").append(getPcrControl()).append(",");
        if (getPcrPeriod() != null)
            sb.append("PcrPeriod: ").append(getPcrPeriod()).append(",");
        if (getPcrPid() != null)
            sb.append("PcrPid: ").append(getPcrPid()).append(",");
        if (getPmtInterval() != null)
            sb.append("PmtInterval: ").append(getPmtInterval()).append(",");
        if (getPmtPid() != null)
            sb.append("PmtPid: ").append(getPmtPid()).append(",");
        if (getProgramNum() != null)
            sb.append("ProgramNum: ").append(getProgramNum()).append(",");
        if (getRateMode() != null)
            sb.append("RateMode: ").append(getRateMode()).append(",");
        if (getScte27Pids() != null)
            sb.append("Scte27Pids: ").append(getScte27Pids()).append(",");
        if (getScte35Control() != null)
            sb.append("Scte35Control: ").append(getScte35Control()).append(",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: ").append(getScte35Pid()).append(",");
        if (getSegmentationMarkers() != null)
            sb.append("SegmentationMarkers: ").append(getSegmentationMarkers()).append(",");
        if (getSegmentationStyle() != null)
            sb.append("SegmentationStyle: ").append(getSegmentationStyle()).append(",");
        if (getSegmentationTime() != null)
            sb.append("SegmentationTime: ").append(getSegmentationTime()).append(",");
        if (getTimedMetadataBehavior() != null)
            sb.append("TimedMetadataBehavior: ").append(getTimedMetadataBehavior()).append(",");
        if (getTimedMetadataPid() != null)
            sb.append("TimedMetadataPid: ").append(getTimedMetadataPid()).append(",");
        if (getTransportStreamId() != null)
            sb.append("TransportStreamId: ").append(getTransportStreamId()).append(",");
        if (getVideoPid() != null)
            sb.append("VideoPid: ").append(getVideoPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2tsSettings == false)
            return false;
        M2tsSettings other = (M2tsSettings) obj;
        if (other.getAbsentInputAudioBehavior() == null ^ this.getAbsentInputAudioBehavior() == null)
            return false;
        if (other.getAbsentInputAudioBehavior() != null && other.getAbsentInputAudioBehavior().equals(this.getAbsentInputAudioBehavior()) == false)
            return false;
        if (other.getArib() == null ^ this.getArib() == null)
            return false;
        if (other.getArib() != null && other.getArib().equals(this.getArib()) == false)
            return false;
        if (other.getAribCaptionsPid() == null ^ this.getAribCaptionsPid() == null)
            return false;
        if (other.getAribCaptionsPid() != null && other.getAribCaptionsPid().equals(this.getAribCaptionsPid()) == false)
            return false;
        if (other.getAribCaptionsPidControl() == null ^ this.getAribCaptionsPidControl() == null)
            return false;
        if (other.getAribCaptionsPidControl() != null && other.getAribCaptionsPidControl().equals(this.getAribCaptionsPidControl()) == false)
            return false;
        if (other.getAudioBufferModel() == null ^ this.getAudioBufferModel() == null)
            return false;
        if (other.getAudioBufferModel() != null && other.getAudioBufferModel().equals(this.getAudioBufferModel()) == false)
            return false;
        if (other.getAudioFramesPerPes() == null ^ this.getAudioFramesPerPes() == null)
            return false;
        if (other.getAudioFramesPerPes() != null && other.getAudioFramesPerPes().equals(this.getAudioFramesPerPes()) == false)
            return false;
        if (other.getAudioPids() == null ^ this.getAudioPids() == null)
            return false;
        if (other.getAudioPids() != null && other.getAudioPids().equals(this.getAudioPids()) == false)
            return false;
        if (other.getAudioStreamType() == null ^ this.getAudioStreamType() == null)
            return false;
        if (other.getAudioStreamType() != null && other.getAudioStreamType().equals(this.getAudioStreamType()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBufferModel() == null ^ this.getBufferModel() == null)
            return false;
        if (other.getBufferModel() != null && other.getBufferModel().equals(this.getBufferModel()) == false)
            return false;
        if (other.getCcDescriptor() == null ^ this.getCcDescriptor() == null)
            return false;
        if (other.getCcDescriptor() != null && other.getCcDescriptor().equals(this.getCcDescriptor()) == false)
            return false;
        if (other.getDvbNitSettings() == null ^ this.getDvbNitSettings() == null)
            return false;
        if (other.getDvbNitSettings() != null && other.getDvbNitSettings().equals(this.getDvbNitSettings()) == false)
            return false;
        if (other.getDvbSdtSettings() == null ^ this.getDvbSdtSettings() == null)
            return false;
        if (other.getDvbSdtSettings() != null && other.getDvbSdtSettings().equals(this.getDvbSdtSettings()) == false)
            return false;
        if (other.getDvbSubPids() == null ^ this.getDvbSubPids() == null)
            return false;
        if (other.getDvbSubPids() != null && other.getDvbSubPids().equals(this.getDvbSubPids()) == false)
            return false;
        if (other.getDvbTdtSettings() == null ^ this.getDvbTdtSettings() == null)
            return false;
        if (other.getDvbTdtSettings() != null && other.getDvbTdtSettings().equals(this.getDvbTdtSettings()) == false)
            return false;
        if (other.getDvbTeletextPid() == null ^ this.getDvbTeletextPid() == null)
            return false;
        if (other.getDvbTeletextPid() != null && other.getDvbTeletextPid().equals(this.getDvbTeletextPid()) == false)
            return false;
        if (other.getEbif() == null ^ this.getEbif() == null)
            return false;
        if (other.getEbif() != null && other.getEbif().equals(this.getEbif()) == false)
            return false;
        if (other.getEbpAudioInterval() == null ^ this.getEbpAudioInterval() == null)
            return false;
        if (other.getEbpAudioInterval() != null && other.getEbpAudioInterval().equals(this.getEbpAudioInterval()) == false)
            return false;
        if (other.getEbpLookaheadMs() == null ^ this.getEbpLookaheadMs() == null)
            return false;
        if (other.getEbpLookaheadMs() != null && other.getEbpLookaheadMs().equals(this.getEbpLookaheadMs()) == false)
            return false;
        if (other.getEbpPlacement() == null ^ this.getEbpPlacement() == null)
            return false;
        if (other.getEbpPlacement() != null && other.getEbpPlacement().equals(this.getEbpPlacement()) == false)
            return false;
        if (other.getEcmPid() == null ^ this.getEcmPid() == null)
            return false;
        if (other.getEcmPid() != null && other.getEcmPid().equals(this.getEcmPid()) == false)
            return false;
        if (other.getEsRateInPes() == null ^ this.getEsRateInPes() == null)
            return false;
        if (other.getEsRateInPes() != null && other.getEsRateInPes().equals(this.getEsRateInPes()) == false)
            return false;
        if (other.getEtvPlatformPid() == null ^ this.getEtvPlatformPid() == null)
            return false;
        if (other.getEtvPlatformPid() != null && other.getEtvPlatformPid().equals(this.getEtvPlatformPid()) == false)
            return false;
        if (other.getEtvSignalPid() == null ^ this.getEtvSignalPid() == null)
            return false;
        if (other.getEtvSignalPid() != null && other.getEtvSignalPid().equals(this.getEtvSignalPid()) == false)
            return false;
        if (other.getFragmentTime() == null ^ this.getFragmentTime() == null)
            return false;
        if (other.getFragmentTime() != null && other.getFragmentTime().equals(this.getFragmentTime()) == false)
            return false;
        if (other.getKlv() == null ^ this.getKlv() == null)
            return false;
        if (other.getKlv() != null && other.getKlv().equals(this.getKlv()) == false)
            return false;
        if (other.getKlvDataPids() == null ^ this.getKlvDataPids() == null)
            return false;
        if (other.getKlvDataPids() != null && other.getKlvDataPids().equals(this.getKlvDataPids()) == false)
            return false;
        if (other.getNullPacketBitrate() == null ^ this.getNullPacketBitrate() == null)
            return false;
        if (other.getNullPacketBitrate() != null && other.getNullPacketBitrate().equals(this.getNullPacketBitrate()) == false)
            return false;
        if (other.getPatInterval() == null ^ this.getPatInterval() == null)
            return false;
        if (other.getPatInterval() != null && other.getPatInterval().equals(this.getPatInterval()) == false)
            return false;
        if (other.getPcrControl() == null ^ this.getPcrControl() == null)
            return false;
        if (other.getPcrControl() != null && other.getPcrControl().equals(this.getPcrControl()) == false)
            return false;
        if (other.getPcrPeriod() == null ^ this.getPcrPeriod() == null)
            return false;
        if (other.getPcrPeriod() != null && other.getPcrPeriod().equals(this.getPcrPeriod()) == false)
            return false;
        if (other.getPcrPid() == null ^ this.getPcrPid() == null)
            return false;
        if (other.getPcrPid() != null && other.getPcrPid().equals(this.getPcrPid()) == false)
            return false;
        if (other.getPmtInterval() == null ^ this.getPmtInterval() == null)
            return false;
        if (other.getPmtInterval() != null && other.getPmtInterval().equals(this.getPmtInterval()) == false)
            return false;
        if (other.getPmtPid() == null ^ this.getPmtPid() == null)
            return false;
        if (other.getPmtPid() != null && other.getPmtPid().equals(this.getPmtPid()) == false)
            return false;
        if (other.getProgramNum() == null ^ this.getProgramNum() == null)
            return false;
        if (other.getProgramNum() != null && other.getProgramNum().equals(this.getProgramNum()) == false)
            return false;
        if (other.getRateMode() == null ^ this.getRateMode() == null)
            return false;
        if (other.getRateMode() != null && other.getRateMode().equals(this.getRateMode()) == false)
            return false;
        if (other.getScte27Pids() == null ^ this.getScte27Pids() == null)
            return false;
        if (other.getScte27Pids() != null && other.getScte27Pids().equals(this.getScte27Pids()) == false)
            return false;
        if (other.getScte35Control() == null ^ this.getScte35Control() == null)
            return false;
        if (other.getScte35Control() != null && other.getScte35Control().equals(this.getScte35Control()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getSegmentationMarkers() == null ^ this.getSegmentationMarkers() == null)
            return false;
        if (other.getSegmentationMarkers() != null && other.getSegmentationMarkers().equals(this.getSegmentationMarkers()) == false)
            return false;
        if (other.getSegmentationStyle() == null ^ this.getSegmentationStyle() == null)
            return false;
        if (other.getSegmentationStyle() != null && other.getSegmentationStyle().equals(this.getSegmentationStyle()) == false)
            return false;
        if (other.getSegmentationTime() == null ^ this.getSegmentationTime() == null)
            return false;
        if (other.getSegmentationTime() != null && other.getSegmentationTime().equals(this.getSegmentationTime()) == false)
            return false;
        if (other.getTimedMetadataBehavior() == null ^ this.getTimedMetadataBehavior() == null)
            return false;
        if (other.getTimedMetadataBehavior() != null && other.getTimedMetadataBehavior().equals(this.getTimedMetadataBehavior()) == false)
            return false;
        if (other.getTimedMetadataPid() == null ^ this.getTimedMetadataPid() == null)
            return false;
        if (other.getTimedMetadataPid() != null && other.getTimedMetadataPid().equals(this.getTimedMetadataPid()) == false)
            return false;
        if (other.getTransportStreamId() == null ^ this.getTransportStreamId() == null)
            return false;
        if (other.getTransportStreamId() != null && other.getTransportStreamId().equals(this.getTransportStreamId()) == false)
            return false;
        if (other.getVideoPid() == null ^ this.getVideoPid() == null)
            return false;
        if (other.getVideoPid() != null && other.getVideoPid().equals(this.getVideoPid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbsentInputAudioBehavior() == null) ? 0 : getAbsentInputAudioBehavior().hashCode());
        hashCode = prime * hashCode + ((getArib() == null) ? 0 : getArib().hashCode());
        hashCode = prime * hashCode + ((getAribCaptionsPid() == null) ? 0 : getAribCaptionsPid().hashCode());
        hashCode = prime * hashCode + ((getAribCaptionsPidControl() == null) ? 0 : getAribCaptionsPidControl().hashCode());
        hashCode = prime * hashCode + ((getAudioBufferModel() == null) ? 0 : getAudioBufferModel().hashCode());
        hashCode = prime * hashCode + ((getAudioFramesPerPes() == null) ? 0 : getAudioFramesPerPes().hashCode());
        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getAudioStreamType() == null) ? 0 : getAudioStreamType().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBufferModel() == null) ? 0 : getBufferModel().hashCode());
        hashCode = prime * hashCode + ((getCcDescriptor() == null) ? 0 : getCcDescriptor().hashCode());
        hashCode = prime * hashCode + ((getDvbNitSettings() == null) ? 0 : getDvbNitSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSdtSettings() == null) ? 0 : getDvbSdtSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSubPids() == null) ? 0 : getDvbSubPids().hashCode());
        hashCode = prime * hashCode + ((getDvbTdtSettings() == null) ? 0 : getDvbTdtSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbTeletextPid() == null) ? 0 : getDvbTeletextPid().hashCode());
        hashCode = prime * hashCode + ((getEbif() == null) ? 0 : getEbif().hashCode());
        hashCode = prime * hashCode + ((getEbpAudioInterval() == null) ? 0 : getEbpAudioInterval().hashCode());
        hashCode = prime * hashCode + ((getEbpLookaheadMs() == null) ? 0 : getEbpLookaheadMs().hashCode());
        hashCode = prime * hashCode + ((getEbpPlacement() == null) ? 0 : getEbpPlacement().hashCode());
        hashCode = prime * hashCode + ((getEcmPid() == null) ? 0 : getEcmPid().hashCode());
        hashCode = prime * hashCode + ((getEsRateInPes() == null) ? 0 : getEsRateInPes().hashCode());
        hashCode = prime * hashCode + ((getEtvPlatformPid() == null) ? 0 : getEtvPlatformPid().hashCode());
        hashCode = prime * hashCode + ((getEtvSignalPid() == null) ? 0 : getEtvSignalPid().hashCode());
        hashCode = prime * hashCode + ((getFragmentTime() == null) ? 0 : getFragmentTime().hashCode());
        hashCode = prime * hashCode + ((getKlv() == null) ? 0 : getKlv().hashCode());
        hashCode = prime * hashCode + ((getKlvDataPids() == null) ? 0 : getKlvDataPids().hashCode());
        hashCode = prime * hashCode + ((getNullPacketBitrate() == null) ? 0 : getNullPacketBitrate().hashCode());
        hashCode = prime * hashCode + ((getPatInterval() == null) ? 0 : getPatInterval().hashCode());
        hashCode = prime * hashCode + ((getPcrControl() == null) ? 0 : getPcrControl().hashCode());
        hashCode = prime * hashCode + ((getPcrPeriod() == null) ? 0 : getPcrPeriod().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getPmtInterval() == null) ? 0 : getPmtInterval().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNum() == null) ? 0 : getProgramNum().hashCode());
        hashCode = prime * hashCode + ((getRateMode() == null) ? 0 : getRateMode().hashCode());
        hashCode = prime * hashCode + ((getScte27Pids() == null) ? 0 : getScte27Pids().hashCode());
        hashCode = prime * hashCode + ((getScte35Control() == null) ? 0 : getScte35Control().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode + ((getSegmentationMarkers() == null) ? 0 : getSegmentationMarkers().hashCode());
        hashCode = prime * hashCode + ((getSegmentationStyle() == null) ? 0 : getSegmentationStyle().hashCode());
        hashCode = prime * hashCode + ((getSegmentationTime() == null) ? 0 : getSegmentationTime().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataBehavior() == null) ? 0 : getTimedMetadataBehavior().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataPid() == null) ? 0 : getTimedMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getTransportStreamId() == null) ? 0 : getTransportStreamId().hashCode());
        hashCode = prime * hashCode + ((getVideoPid() == null) ? 0 : getVideoPid().hashCode());
        return hashCode;
    }

    @Override
    public M2tsSettings clone() {
        try {
            return (M2tsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.M2tsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
