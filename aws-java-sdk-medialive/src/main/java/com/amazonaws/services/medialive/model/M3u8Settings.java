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
 * Settings information for the .m3u8 container
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/M3u8Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M3u8Settings implements Serializable, Cloneable, StructuredPojo {

    /** The number of audio frames to insert for each PES packet. */
    private Integer audioFramesPerPes;
    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     */
    private String audioPids;
    /** This parameter is unused and deprecated. */
    private String ecmPid;
    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     */
    private Integer patInterval;
    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream
     * (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary
     * stream.
     */
    private String pcrControl;
    /** Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream. */
    private Integer pcrPeriod;
    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
     */
    private String pcrPid;
    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     */
    private Integer pmtInterval;
    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     */
    private String pmtPid;
    /** The value of the program number field in the Program Map Table. */
    private Integer programNum;
    /** If set to passthrough, passes any SCTE-35 signals from the input source to this output. */
    private String scte35Behavior;
    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value.
     */
    private String scte35Pid;
    /** When set to passthrough, timed metadata is passed through from input to output. */
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
     * hexadecimal value.
     */
    private String videoPid;

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

    public M3u8Settings withAudioFramesPerPes(Integer audioFramesPerPes) {
        setAudioFramesPerPes(audioFramesPerPes);
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or
     *        hexadecimal values.
     */

    public void setAudioPids(String audioPids) {
        this.audioPids = audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     * 
     * @return Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *         accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or
     *         hexadecimal values.
     */

    public String getAudioPids() {
        return this.audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or
     *        hexadecimal values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withAudioPids(String audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * This parameter is unused and deprecated.
     * 
     * @param ecmPid
     *        This parameter is unused and deprecated.
     */

    public void setEcmPid(String ecmPid) {
        this.ecmPid = ecmPid;
    }

    /**
     * This parameter is unused and deprecated.
     * 
     * @return This parameter is unused and deprecated.
     */

    public String getEcmPid() {
        return this.ecmPid;
    }

    /**
     * This parameter is unused and deprecated.
     * 
     * @param ecmPid
     *        This parameter is unused and deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withEcmPid(String ecmPid) {
        setEcmPid(ecmPid);
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     * 
     * @param patInterval
     *        The number of milliseconds between instances of this table in the output transport stream. A value of
     *        \"0\" writes out the PMT once per segment file.
     */

    public void setPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream. A value of
     *         \"0\" writes out the PMT once per segment file.
     */

    public Integer getPatInterval() {
        return this.patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     * 
     * @param patInterval
     *        The number of milliseconds between instances of this table in the output transport stream. A value of
     *        \"0\" writes out the PMT once per segment file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPatInterval(Integer patInterval) {
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
     * @see M3u8PcrControl
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
     * @see M3u8PcrControl
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
     * @see M3u8PcrControl
     */

    public M3u8Settings withPcrControl(String pcrControl) {
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
     * @see M3u8PcrControl
     */

    public M3u8Settings withPcrControl(M3u8PcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
        return this;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * 
     * @param pcrPeriod
     *        Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     */

    public void setPcrPeriod(Integer pcrPeriod) {
        this.pcrPeriod = pcrPeriod;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * 
     * @return Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     */

    public Integer getPcrPeriod() {
        return this.pcrPeriod;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * 
     * @param pcrPeriod
     *        Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPcrPeriod(Integer pcrPeriod) {
        setPcrPeriod(pcrPeriod);
        return this;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
     * 
     * @param pcrPid
     *        Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *        given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal
     *        value.
     */

    public void setPcrPid(String pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
     * 
     * @return Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *         given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or
     *         hexadecimal value.
     */

    public String getPcrPid() {
        return this.pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
     * 
     * @param pcrPid
     *        Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *        given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPcrPid(String pcrPid) {
        setPcrPid(pcrPid);
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     * 
     * @param pmtInterval
     *        The number of milliseconds between instances of this table in the output transport stream. A value of
     *        \"0\" writes out the PMT once per segment file.
     */

    public void setPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream. A value of
     *         \"0\" writes out the PMT once per segment file.
     */

    public Integer getPmtInterval() {
        return this.pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\"
     * writes out the PMT once per segment file.
     * 
     * @param pmtInterval
     *        The number of milliseconds between instances of this table in the output transport stream. A value of
     *        \"0\" writes out the PMT once per segment file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPmtInterval(Integer pmtInterval) {
        setPmtInterval(pmtInterval);
        return this;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     * 
     * @param pmtPid
     *        Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a
     *        decimal or hexadecimal value.
     */

    public void setPmtPid(String pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     * 
     * @return Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a
     *         decimal or hexadecimal value.
     */

    public String getPmtPid() {
        return this.pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     * 
     * @param pmtPid
     *        Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a
     *        decimal or hexadecimal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPmtPid(String pmtPid) {
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

    public M3u8Settings withProgramNum(Integer programNum) {
        setProgramNum(programNum);
        return this;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * 
     * @param scte35Behavior
     *        If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * @see M3u8Scte35Behavior
     */

    public void setScte35Behavior(String scte35Behavior) {
        this.scte35Behavior = scte35Behavior;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * 
     * @return If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * @see M3u8Scte35Behavior
     */

    public String getScte35Behavior() {
        return this.scte35Behavior;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * 
     * @param scte35Behavior
     *        If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8Scte35Behavior
     */

    public M3u8Settings withScte35Behavior(String scte35Behavior) {
        setScte35Behavior(scte35Behavior);
        return this;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * 
     * @param scte35Behavior
     *        If set to passthrough, passes any SCTE-35 signals from the input source to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8Scte35Behavior
     */

    public M3u8Settings withScte35Behavior(M3u8Scte35Behavior scte35Behavior) {
        this.scte35Behavior = scte35Behavior.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value.
     * 
     * @param scte35Pid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or
     *        hexadecimal value.
     */

    public void setScte35Pid(String scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value.
     * 
     * @return Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or
     *         hexadecimal value.
     */

    public String getScte35Pid() {
        return this.scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal
     * value.
     * 
     * @param scte35Pid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or
     *        hexadecimal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withScte35Pid(String scte35Pid) {
        setScte35Pid(scte35Pid);
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata is passed through from input to output.
     * @see M3u8TimedMetadataBehavior
     */

    public void setTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @return When set to passthrough, timed metadata is passed through from input to output.
     * @see M3u8TimedMetadataBehavior
     */

    public String getTimedMetadataBehavior() {
        return this.timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata is passed through from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8TimedMetadataBehavior
     */

    public M3u8Settings withTimedMetadataBehavior(String timedMetadataBehavior) {
        setTimedMetadataBehavior(timedMetadataBehavior);
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to output.
     * 
     * @param timedMetadataBehavior
     *        When set to passthrough, timed metadata is passed through from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8TimedMetadataBehavior
     */

    public M3u8Settings withTimedMetadataBehavior(M3u8TimedMetadataBehavior timedMetadataBehavior) {
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

    public M3u8Settings withTimedMetadataPid(String timedMetadataPid) {
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

    public M3u8Settings withTransportStreamId(Integer transportStreamId) {
        setTransportStreamId(transportStreamId);
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     * 
     * @param videoPid
     *        Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a
     *        decimal or hexadecimal value.
     */

    public void setVideoPid(String videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     * 
     * @return Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a
     *         decimal or hexadecimal value.
     */

    public String getVideoPid() {
        return this.videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or
     * hexadecimal value.
     * 
     * @param videoPid
     *        Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a
     *        decimal or hexadecimal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withVideoPid(String videoPid) {
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
        if (getAudioFramesPerPes() != null)
            sb.append("AudioFramesPerPes: ").append(getAudioFramesPerPes()).append(",");
        if (getAudioPids() != null)
            sb.append("AudioPids: ").append(getAudioPids()).append(",");
        if (getEcmPid() != null)
            sb.append("EcmPid: ").append(getEcmPid()).append(",");
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
        if (getScte35Behavior() != null)
            sb.append("Scte35Behavior: ").append(getScte35Behavior()).append(",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: ").append(getScte35Pid()).append(",");
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

        if (obj instanceof M3u8Settings == false)
            return false;
        M3u8Settings other = (M3u8Settings) obj;
        if (other.getAudioFramesPerPes() == null ^ this.getAudioFramesPerPes() == null)
            return false;
        if (other.getAudioFramesPerPes() != null && other.getAudioFramesPerPes().equals(this.getAudioFramesPerPes()) == false)
            return false;
        if (other.getAudioPids() == null ^ this.getAudioPids() == null)
            return false;
        if (other.getAudioPids() != null && other.getAudioPids().equals(this.getAudioPids()) == false)
            return false;
        if (other.getEcmPid() == null ^ this.getEcmPid() == null)
            return false;
        if (other.getEcmPid() != null && other.getEcmPid().equals(this.getEcmPid()) == false)
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
        if (other.getScte35Behavior() == null ^ this.getScte35Behavior() == null)
            return false;
        if (other.getScte35Behavior() != null && other.getScte35Behavior().equals(this.getScte35Behavior()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null && other.getScte35Pid().equals(this.getScte35Pid()) == false)
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

        hashCode = prime * hashCode + ((getAudioFramesPerPes() == null) ? 0 : getAudioFramesPerPes().hashCode());
        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getEcmPid() == null) ? 0 : getEcmPid().hashCode());
        hashCode = prime * hashCode + ((getPatInterval() == null) ? 0 : getPatInterval().hashCode());
        hashCode = prime * hashCode + ((getPcrControl() == null) ? 0 : getPcrControl().hashCode());
        hashCode = prime * hashCode + ((getPcrPeriod() == null) ? 0 : getPcrPeriod().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getPmtInterval() == null) ? 0 : getPmtInterval().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNum() == null) ? 0 : getProgramNum().hashCode());
        hashCode = prime * hashCode + ((getScte35Behavior() == null) ? 0 : getScte35Behavior().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataBehavior() == null) ? 0 : getTimedMetadataBehavior().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataPid() == null) ? 0 : getTimedMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getTransportStreamId() == null) ? 0 : getTransportStreamId().hashCode());
        hashCode = prime * hashCode + ((getVideoPid() == null) ? 0 : getVideoPid().hashCode());
        return hashCode;
    }

    @Override
    public M3u8Settings clone() {
        try {
            return (M3u8Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.M3u8SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
