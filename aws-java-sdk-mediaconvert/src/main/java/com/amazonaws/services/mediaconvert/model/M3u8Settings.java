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
 * Settings for TS segments in HLS
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/M3u8Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M3u8Settings implements Serializable, Cloneable, StructuredPojo {

    /** The number of audio frames to insert for each PES packet. */
    private Integer audioFramesPerPes;
    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation.
     */
    private java.util.List<Integer> audioPids;
    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3
     * tag will be inserted in the output.
     */
    private String nielsenId3;
    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer patInterval;
    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary
     * Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     */
    private String pcrControl;
    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID.
     */
    private Integer pcrPid;
    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer pmtInterval;
    /** Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. */
    private Integer pmtPid;
    /** Packet Identifier (PID) of the private metadata stream in the transport stream. */
    private Integer privateMetadataPid;
    /** The value of the program number field in the Program Map Table. */
    private Integer programNumber;
    /** Packet Identifier (PID) of the SCTE-35 stream in the transport stream. */
    private Integer scte35Pid;
    /** Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output. */
    private String scte35Source;
    /**
     * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from
     * the input in this output.
     */
    private String timedMetadata;
    /** Packet Identifier (PID) of the timed metadata stream in the transport stream. */
    private Integer timedMetadataPid;
    /** The value of the transport stream ID field in the Program Map Table. */
    private Integer transportStreamId;
    /** Packet Identifier (PID) of the elementary video stream in the transport stream. */
    private Integer videoPid;

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
     * and can be entered in ranges and/or by comma separation.
     * 
     * @return Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *         accepted, and can be entered in ranges and/or by comma separation.
     */

    public java.util.List<Integer> getAudioPids() {
        return audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation.
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation.
     */

    public void setAudioPids(java.util.Collection<Integer> audioPids) {
        if (audioPids == null) {
            this.audioPids = null;
            return;
        }

        this.audioPids = new java.util.ArrayList<Integer>(audioPids);
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioPids(java.util.Collection)} or {@link #withAudioPids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withAudioPids(Integer... audioPids) {
        if (this.audioPids == null) {
            setAudioPids(new java.util.ArrayList<Integer>(audioPids.length));
        }
        for (Integer ele : audioPids) {
            this.audioPids.add(ele);
        }
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation.
     * 
     * @param audioPids
     *        Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are
     *        accepted, and can be entered in ranges and/or by comma separation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withAudioPids(java.util.Collection<Integer> audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3
     * tag will be inserted in the output.
     * 
     * @param nielsenId3
     *        If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     *        equivalent ID3 tag will be inserted in the output.
     * @see M3u8NielsenId3
     */

    public void setNielsenId3(String nielsenId3) {
        this.nielsenId3 = nielsenId3;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3
     * tag will be inserted in the output.
     * 
     * @return If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     *         equivalent ID3 tag will be inserted in the output.
     * @see M3u8NielsenId3
     */

    public String getNielsenId3() {
        return this.nielsenId3;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3
     * tag will be inserted in the output.
     * 
     * @param nielsenId3
     *        If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     *        equivalent ID3 tag will be inserted in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8NielsenId3
     */

    public M3u8Settings withNielsenId3(String nielsenId3) {
        setNielsenId3(nielsenId3);
        return this;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3
     * tag will be inserted in the output.
     * 
     * @param nielsenId3
     *        If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an
     *        equivalent ID3 tag will be inserted in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8NielsenId3
     */

    public M3u8Settings withNielsenId3(M3u8NielsenId3 nielsenId3) {
        this.nielsenId3 = nielsenId3.toString();
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param patInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     */

    public void setPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream.
     */

    public Integer getPatInterval() {
        return this.patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param patInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPatInterval(Integer patInterval) {
        setPatInterval(patInterval);
        return this;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary
     * Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * 
     * @param pcrControl
     *        When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized
     *        Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video
     *        or audio elementary stream.
     * @see M3u8PcrControl
     */

    public void setPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary
     * Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * 
     * @return When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized
     *         Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the
     *         video or audio elementary stream.
     * @see M3u8PcrControl
     */

    public String getPcrControl() {
        return this.pcrControl;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary
     * Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * 
     * @param pcrControl
     *        When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized
     *        Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video
     *        or audio elementary stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8PcrControl
     */

    public M3u8Settings withPcrControl(String pcrControl) {
        setPcrControl(pcrControl);
        return this;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary
     * Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * 
     * @param pcrControl
     *        When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized
     *        Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video
     *        or audio elementary stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8PcrControl
     */

    public M3u8Settings withPcrControl(M3u8PcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID.
     * 
     * @param pcrPid
     *        Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *        given, the encoder will assign the same value as the Video PID.
     */

    public void setPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID.
     * 
     * @return Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *         given, the encoder will assign the same value as the Video PID.
     */

    public Integer getPcrPid() {
        return this.pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the
     * encoder will assign the same value as the Video PID.
     * 
     * @param pcrPid
     *        Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is
     *        given, the encoder will assign the same value as the Video PID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPcrPid(Integer pcrPid) {
        setPcrPid(pcrPid);
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param pmtInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     */

    public void setPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream.
     */

    public Integer getPmtInterval() {
        return this.pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param pmtInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPmtInterval(Integer pmtInterval) {
        setPmtInterval(pmtInterval);
        return this;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
     * 
     * @param pmtPid
     *        Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
     */

    public void setPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
     * 
     * @return Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
     */

    public Integer getPmtPid() {
        return this.pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
     * 
     * @param pmtPid
     *        Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPmtPid(Integer pmtPid) {
        setPmtPid(pmtPid);
        return this;
    }

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport stream.
     * 
     * @param privateMetadataPid
     *        Packet Identifier (PID) of the private metadata stream in the transport stream.
     */

    public void setPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport stream.
     * 
     * @return Packet Identifier (PID) of the private metadata stream in the transport stream.
     */

    public Integer getPrivateMetadataPid() {
        return this.privateMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport stream.
     * 
     * @param privateMetadataPid
     *        Packet Identifier (PID) of the private metadata stream in the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withPrivateMetadataPid(Integer privateMetadataPid) {
        setPrivateMetadataPid(privateMetadataPid);
        return this;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * 
     * @param programNumber
     *        The value of the program number field in the Program Map Table.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * 
     * @return The value of the program number field in the Program Map Table.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * 
     * @param programNumber
     *        The value of the program number field in the Program Map Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * 
     * @param scte35Pid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     */

    public void setScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * 
     * @return Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     */

    public Integer getScte35Pid() {
        return this.scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * 
     * @param scte35Pid
     *        Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withScte35Pid(Integer scte35Pid) {
        setScte35Pid(scte35Pid);
        return this;
    }

    /**
     * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * 
     * @param scte35Source
     *        Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * @see M3u8Scte35Source
     */

    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * 
     * @return Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * @see M3u8Scte35Source
     */

    public String getScte35Source() {
        return this.scte35Source;
    }

    /**
     * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * 
     * @param scte35Source
     *        Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8Scte35Source
     */

    public M3u8Settings withScte35Source(String scte35Source) {
        setScte35Source(scte35Source);
        return this;
    }

    /**
     * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * 
     * @param scte35Source
     *        Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M3u8Scte35Source
     */

    public M3u8Settings withScte35Source(M3u8Scte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
        return this;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from
     * the input in this output.
     * 
     * @param timedMetadata
     *        Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed
     *        metadata from the input in this output.
     * @see TimedMetadata
     */

    public void setTimedMetadata(String timedMetadata) {
        this.timedMetadata = timedMetadata;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from
     * the input in this output.
     * 
     * @return Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed
     *         metadata from the input in this output.
     * @see TimedMetadata
     */

    public String getTimedMetadata() {
        return this.timedMetadata;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from
     * the input in this output.
     * 
     * @param timedMetadata
     *        Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed
     *        metadata from the input in this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimedMetadata
     */

    public M3u8Settings withTimedMetadata(String timedMetadata) {
        setTimedMetadata(timedMetadata);
        return this;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from
     * the input in this output.
     * 
     * @param timedMetadata
     *        Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed
     *        metadata from the input in this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimedMetadata
     */

    public M3u8Settings withTimedMetadata(TimedMetadata timedMetadata) {
        this.timedMetadata = timedMetadata.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream.
     * 
     * @param timedMetadataPid
     *        Packet Identifier (PID) of the timed metadata stream in the transport stream.
     */

    public void setTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream.
     * 
     * @return Packet Identifier (PID) of the timed metadata stream in the transport stream.
     */

    public Integer getTimedMetadataPid() {
        return this.timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport stream.
     * 
     * @param timedMetadataPid
     *        Packet Identifier (PID) of the timed metadata stream in the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withTimedMetadataPid(Integer timedMetadataPid) {
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
     * Packet Identifier (PID) of the elementary video stream in the transport stream.
     * 
     * @param videoPid
     *        Packet Identifier (PID) of the elementary video stream in the transport stream.
     */

    public void setVideoPid(Integer videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream.
     * 
     * @return Packet Identifier (PID) of the elementary video stream in the transport stream.
     */

    public Integer getVideoPid() {
        return this.videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport stream.
     * 
     * @param videoPid
     *        Packet Identifier (PID) of the elementary video stream in the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M3u8Settings withVideoPid(Integer videoPid) {
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
        if (getNielsenId3() != null)
            sb.append("NielsenId3: ").append(getNielsenId3()).append(",");
        if (getPatInterval() != null)
            sb.append("PatInterval: ").append(getPatInterval()).append(",");
        if (getPcrControl() != null)
            sb.append("PcrControl: ").append(getPcrControl()).append(",");
        if (getPcrPid() != null)
            sb.append("PcrPid: ").append(getPcrPid()).append(",");
        if (getPmtInterval() != null)
            sb.append("PmtInterval: ").append(getPmtInterval()).append(",");
        if (getPmtPid() != null)
            sb.append("PmtPid: ").append(getPmtPid()).append(",");
        if (getPrivateMetadataPid() != null)
            sb.append("PrivateMetadataPid: ").append(getPrivateMetadataPid()).append(",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: ").append(getScte35Pid()).append(",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: ").append(getScte35Source()).append(",");
        if (getTimedMetadata() != null)
            sb.append("TimedMetadata: ").append(getTimedMetadata()).append(",");
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
        if (other.getNielsenId3() == null ^ this.getNielsenId3() == null)
            return false;
        if (other.getNielsenId3() != null && other.getNielsenId3().equals(this.getNielsenId3()) == false)
            return false;
        if (other.getPatInterval() == null ^ this.getPatInterval() == null)
            return false;
        if (other.getPatInterval() != null && other.getPatInterval().equals(this.getPatInterval()) == false)
            return false;
        if (other.getPcrControl() == null ^ this.getPcrControl() == null)
            return false;
        if (other.getPcrControl() != null && other.getPcrControl().equals(this.getPcrControl()) == false)
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
        if (other.getPrivateMetadataPid() == null ^ this.getPrivateMetadataPid() == null)
            return false;
        if (other.getPrivateMetadataPid() != null && other.getPrivateMetadataPid().equals(this.getPrivateMetadataPid()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null && other.getScte35Source().equals(this.getScte35Source()) == false)
            return false;
        if (other.getTimedMetadata() == null ^ this.getTimedMetadata() == null)
            return false;
        if (other.getTimedMetadata() != null && other.getTimedMetadata().equals(this.getTimedMetadata()) == false)
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
        hashCode = prime * hashCode + ((getNielsenId3() == null) ? 0 : getNielsenId3().hashCode());
        hashCode = prime * hashCode + ((getPatInterval() == null) ? 0 : getPatInterval().hashCode());
        hashCode = prime * hashCode + ((getPcrControl() == null) ? 0 : getPcrControl().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getPmtInterval() == null) ? 0 : getPmtInterval().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode + ((getPrivateMetadataPid() == null) ? 0 : getPrivateMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadata() == null) ? 0 : getTimedMetadata().hashCode());
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
        com.amazonaws.services.mediaconvert.model.transform.M3u8SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
