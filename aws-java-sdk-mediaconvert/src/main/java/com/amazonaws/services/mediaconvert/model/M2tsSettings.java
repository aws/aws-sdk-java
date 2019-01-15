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
 * Settings for M2TS Container.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/M2tsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2tsSettings implements Serializable, Cloneable, StructuredPojo {

    private String audioBufferModel;
    /** The number of audio frames to insert for each PES packet. */
    private Integer audioFramesPerPes;
    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted,
     * and can be entered in ranges and/or by comma separation.
     */
    private java.util.List<Integer> audioPids;
    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     */
    private Integer bitrate;

    private String bufferModel;

    private DvbNitSettings dvbNitSettings;

    private DvbSdtSettings dvbSdtSettings;
    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation.
     */
    private java.util.List<Integer> dvbSubPids;

    private DvbTdtSettings dvbTdtSettings;
    /** Packet Identifier (PID) for input source DVB Teletext data to this output. */
    private Integer dvbTeletextPid;

    private String ebpAudioInterval;

    private String ebpPlacement;

    private String esRateInPes;

    private String forceTsVideoEbpOrder;
    /** The length in seconds of each fragment. Only used with EBP markers. */
    private Double fragmentTime;
    /** Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream. */
    private Integer maxPcrInterval;
    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     */
    private Integer minEbpInterval;

    private String nielsenId3;
    /**
     * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a
     * downstream encryption system requires periodic null packets.
     */
    private Double nullPacketBitrate;
    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer patInterval;

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

    private String rateMode;
    /** Packet Identifier (PID) of the SCTE-35 stream in the transport stream. */
    private Integer scte35Pid;

    private String scte35Source;

    private String segmentationMarkers;

    private String segmentationStyle;
    /** The length in seconds of each segment. Required unless markers is set to _none_. */
    private Double segmentationTime;
    /** Packet Identifier (PID) of the timed metadata stream in the transport stream. */
    private Integer timedMetadataPid;
    /** The value of the transport stream ID field in the Program Map Table. */
    private Integer transportStreamId;
    /** Packet Identifier (PID) of the elementary video stream in the transport stream. */
    private Integer videoPid;

    /**
     * @param audioBufferModel
     * @see M2tsAudioBufferModel
     */

    public void setAudioBufferModel(String audioBufferModel) {
        this.audioBufferModel = audioBufferModel;
    }

    /**
     * @return
     * @see M2tsAudioBufferModel
     */

    public String getAudioBufferModel() {
        return this.audioBufferModel;
    }

    /**
     * @param audioBufferModel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsAudioBufferModel
     */

    public M2tsSettings withAudioBufferModel(String audioBufferModel) {
        setAudioBufferModel(audioBufferModel);
        return this;
    }

    /**
     * @param audioBufferModel
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

    public M2tsSettings withAudioPids(Integer... audioPids) {
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

    public M2tsSettings withAudioPids(java.util.Collection<Integer> audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     * 
     * @param bitrate
     *        The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     *        determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     * 
     * @return The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     *         determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     * determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     * 
     * @param bitrate
     *        The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically
     *        determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * @param bufferModel
     * @see M2tsBufferModel
     */

    public void setBufferModel(String bufferModel) {
        this.bufferModel = bufferModel;
    }

    /**
     * @return
     * @see M2tsBufferModel
     */

    public String getBufferModel() {
        return this.bufferModel;
    }

    /**
     * @param bufferModel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsBufferModel
     */

    public M2tsSettings withBufferModel(String bufferModel) {
        setBufferModel(bufferModel);
        return this;
    }

    /**
     * @param bufferModel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsBufferModel
     */

    public M2tsSettings withBufferModel(M2tsBufferModel bufferModel) {
        this.bufferModel = bufferModel.toString();
        return this;
    }

    /**
     * @param dvbNitSettings
     */

    public void setDvbNitSettings(DvbNitSettings dvbNitSettings) {
        this.dvbNitSettings = dvbNitSettings;
    }

    /**
     * @return
     */

    public DvbNitSettings getDvbNitSettings() {
        return this.dvbNitSettings;
    }

    /**
     * @param dvbNitSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbNitSettings(DvbNitSettings dvbNitSettings) {
        setDvbNitSettings(dvbNitSettings);
        return this;
    }

    /**
     * @param dvbSdtSettings
     */

    public void setDvbSdtSettings(DvbSdtSettings dvbSdtSettings) {
        this.dvbSdtSettings = dvbSdtSettings;
    }

    /**
     * @return
     */

    public DvbSdtSettings getDvbSdtSettings() {
        return this.dvbSdtSettings;
    }

    /**
     * @param dvbSdtSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbSdtSettings(DvbSdtSettings dvbSdtSettings) {
        setDvbSdtSettings(dvbSdtSettings);
        return this;
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation.
     * 
     * @return Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *         and can be entered in ranges and/or by comma separation.
     */

    public java.util.List<Integer> getDvbSubPids() {
        return dvbSubPids;
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation.
     * 
     * @param dvbSubPids
     *        Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *        and can be entered in ranges and/or by comma separation.
     */

    public void setDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        if (dvbSubPids == null) {
            this.dvbSubPids = null;
            return;
        }

        this.dvbSubPids = new java.util.ArrayList<Integer>(dvbSubPids);
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDvbSubPids(java.util.Collection)} or {@link #withDvbSubPids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dvbSubPids
     *        Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *        and can be entered in ranges and/or by comma separation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbSubPids(Integer... dvbSubPids) {
        if (this.dvbSubPids == null) {
            setDvbSubPids(new java.util.ArrayList<Integer>(dvbSubPids.length));
        }
        for (Integer ele : dvbSubPids) {
            this.dvbSubPids.add(ele);
        }
        return this;
    }

    /**
     * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can
     * be entered in ranges and/or by comma separation.
     * 
     * @param dvbSubPids
     *        Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted,
     *        and can be entered in ranges and/or by comma separation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        setDvbSubPids(dvbSubPids);
        return this;
    }

    /**
     * @param dvbTdtSettings
     */

    public void setDvbTdtSettings(DvbTdtSettings dvbTdtSettings) {
        this.dvbTdtSettings = dvbTdtSettings;
    }

    /**
     * @return
     */

    public DvbTdtSettings getDvbTdtSettings() {
        return this.dvbTdtSettings;
    }

    /**
     * @param dvbTdtSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbTdtSettings(DvbTdtSettings dvbTdtSettings) {
        setDvbTdtSettings(dvbTdtSettings);
        return this;
    }

    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output.
     * 
     * @param dvbTeletextPid
     *        Packet Identifier (PID) for input source DVB Teletext data to this output.
     */

    public void setDvbTeletextPid(Integer dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
    }

    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output.
     * 
     * @return Packet Identifier (PID) for input source DVB Teletext data to this output.
     */

    public Integer getDvbTeletextPid() {
        return this.dvbTeletextPid;
    }

    /**
     * Packet Identifier (PID) for input source DVB Teletext data to this output.
     * 
     * @param dvbTeletextPid
     *        Packet Identifier (PID) for input source DVB Teletext data to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withDvbTeletextPid(Integer dvbTeletextPid) {
        setDvbTeletextPid(dvbTeletextPid);
        return this;
    }

    /**
     * @param ebpAudioInterval
     * @see M2tsEbpAudioInterval
     */

    public void setEbpAudioInterval(String ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval;
    }

    /**
     * @return
     * @see M2tsEbpAudioInterval
     */

    public String getEbpAudioInterval() {
        return this.ebpAudioInterval;
    }

    /**
     * @param ebpAudioInterval
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbpAudioInterval
     */

    public M2tsSettings withEbpAudioInterval(String ebpAudioInterval) {
        setEbpAudioInterval(ebpAudioInterval);
        return this;
    }

    /**
     * @param ebpAudioInterval
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbpAudioInterval
     */

    public M2tsSettings withEbpAudioInterval(M2tsEbpAudioInterval ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval.toString();
        return this;
    }

    /**
     * @param ebpPlacement
     * @see M2tsEbpPlacement
     */

    public void setEbpPlacement(String ebpPlacement) {
        this.ebpPlacement = ebpPlacement;
    }

    /**
     * @return
     * @see M2tsEbpPlacement
     */

    public String getEbpPlacement() {
        return this.ebpPlacement;
    }

    /**
     * @param ebpPlacement
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbpPlacement
     */

    public M2tsSettings withEbpPlacement(String ebpPlacement) {
        setEbpPlacement(ebpPlacement);
        return this;
    }

    /**
     * @param ebpPlacement
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEbpPlacement
     */

    public M2tsSettings withEbpPlacement(M2tsEbpPlacement ebpPlacement) {
        this.ebpPlacement = ebpPlacement.toString();
        return this;
    }

    /**
     * @param esRateInPes
     * @see M2tsEsRateInPes
     */

    public void setEsRateInPes(String esRateInPes) {
        this.esRateInPes = esRateInPes;
    }

    /**
     * @return
     * @see M2tsEsRateInPes
     */

    public String getEsRateInPes() {
        return this.esRateInPes;
    }

    /**
     * @param esRateInPes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEsRateInPes
     */

    public M2tsSettings withEsRateInPes(String esRateInPes) {
        setEsRateInPes(esRateInPes);
        return this;
    }

    /**
     * @param esRateInPes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsEsRateInPes
     */

    public M2tsSettings withEsRateInPes(M2tsEsRateInPes esRateInPes) {
        this.esRateInPes = esRateInPes.toString();
        return this;
    }

    /**
     * @param forceTsVideoEbpOrder
     * @see M2tsForceTsVideoEbpOrder
     */

    public void setForceTsVideoEbpOrder(String forceTsVideoEbpOrder) {
        this.forceTsVideoEbpOrder = forceTsVideoEbpOrder;
    }

    /**
     * @return
     * @see M2tsForceTsVideoEbpOrder
     */

    public String getForceTsVideoEbpOrder() {
        return this.forceTsVideoEbpOrder;
    }

    /**
     * @param forceTsVideoEbpOrder
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsForceTsVideoEbpOrder
     */

    public M2tsSettings withForceTsVideoEbpOrder(String forceTsVideoEbpOrder) {
        setForceTsVideoEbpOrder(forceTsVideoEbpOrder);
        return this;
    }

    /**
     * @param forceTsVideoEbpOrder
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsForceTsVideoEbpOrder
     */

    public M2tsSettings withForceTsVideoEbpOrder(M2tsForceTsVideoEbpOrder forceTsVideoEbpOrder) {
        this.forceTsVideoEbpOrder = forceTsVideoEbpOrder.toString();
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
     * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * 
     * @param maxPcrInterval
     *        Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     */

    public void setMaxPcrInterval(Integer maxPcrInterval) {
        this.maxPcrInterval = maxPcrInterval;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * 
     * @return Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     */

    public Integer getMaxPcrInterval() {
        return this.maxPcrInterval;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * 
     * @param maxPcrInterval
     *        Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withMaxPcrInterval(Integer maxPcrInterval) {
        setMaxPcrInterval(maxPcrInterval);
        return this;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     * 
     * @param minEbpInterval
     *        When set, enforces that Encoder Boundary Points do not come within the specified time interval of each
     *        other by looking ahead at input video. If another EBP is going to come in within the specified time
     *        interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead
     *        value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient
     *        latency to make the lookahead accurate.
     */

    public void setMinEbpInterval(Integer minEbpInterval) {
        this.minEbpInterval = minEbpInterval;
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

    public Integer getMinEbpInterval() {
        return this.minEbpInterval;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by
     * looking ahead at input video. If another EBP is going to come in within the specified time interval, the current
     * EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to
     * the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead
     * accurate.
     * 
     * @param minEbpInterval
     *        When set, enforces that Encoder Boundary Points do not come within the specified time interval of each
     *        other by looking ahead at input video. If another EBP is going to come in within the specified time
     *        interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead
     *        value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient
     *        latency to make the lookahead accurate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withMinEbpInterval(Integer minEbpInterval) {
        setMinEbpInterval(minEbpInterval);
        return this;
    }

    /**
     * @param nielsenId3
     * @see M2tsNielsenId3
     */

    public void setNielsenId3(String nielsenId3) {
        this.nielsenId3 = nielsenId3;
    }

    /**
     * @return
     * @see M2tsNielsenId3
     */

    public String getNielsenId3() {
        return this.nielsenId3;
    }

    /**
     * @param nielsenId3
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsNielsenId3
     */

    public M2tsSettings withNielsenId3(String nielsenId3) {
        setNielsenId3(nielsenId3);
        return this;
    }

    /**
     * @param nielsenId3
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsNielsenId3
     */

    public M2tsSettings withNielsenId3(M2tsNielsenId3 nielsenId3) {
        this.nielsenId3 = nielsenId3.toString();
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

    public M2tsSettings withPatInterval(Integer patInterval) {
        setPatInterval(patInterval);
        return this;
    }

    /**
     * @param pcrControl
     * @see M2tsPcrControl
     */

    public void setPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
    }

    /**
     * @return
     * @see M2tsPcrControl
     */

    public String getPcrControl() {
        return this.pcrControl;
    }

    /**
     * @param pcrControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsPcrControl
     */

    public M2tsSettings withPcrControl(String pcrControl) {
        setPcrControl(pcrControl);
        return this;
    }

    /**
     * @param pcrControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsPcrControl
     */

    public M2tsSettings withPcrControl(M2tsPcrControl pcrControl) {
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

    public M2tsSettings withPcrPid(Integer pcrPid) {
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

    public M2tsSettings withPmtInterval(Integer pmtInterval) {
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

    public M2tsSettings withPmtPid(Integer pmtPid) {
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

    public M2tsSettings withPrivateMetadataPid(Integer privateMetadataPid) {
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

    public M2tsSettings withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * @param rateMode
     * @see M2tsRateMode
     */

    public void setRateMode(String rateMode) {
        this.rateMode = rateMode;
    }

    /**
     * @return
     * @see M2tsRateMode
     */

    public String getRateMode() {
        return this.rateMode;
    }

    /**
     * @param rateMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsRateMode
     */

    public M2tsSettings withRateMode(String rateMode) {
        setRateMode(rateMode);
        return this;
    }

    /**
     * @param rateMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsRateMode
     */

    public M2tsSettings withRateMode(M2tsRateMode rateMode) {
        this.rateMode = rateMode.toString();
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

    public M2tsSettings withScte35Pid(Integer scte35Pid) {
        setScte35Pid(scte35Pid);
        return this;
    }

    /**
     * @param scte35Source
     * @see M2tsScte35Source
     */

    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * @return
     * @see M2tsScte35Source
     */

    public String getScte35Source() {
        return this.scte35Source;
    }

    /**
     * @param scte35Source
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsScte35Source
     */

    public M2tsSettings withScte35Source(String scte35Source) {
        setScte35Source(scte35Source);
        return this;
    }

    /**
     * @param scte35Source
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsScte35Source
     */

    public M2tsSettings withScte35Source(M2tsScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
        return this;
    }

    /**
     * @param segmentationMarkers
     * @see M2tsSegmentationMarkers
     */

    public void setSegmentationMarkers(String segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers;
    }

    /**
     * @return
     * @see M2tsSegmentationMarkers
     */

    public String getSegmentationMarkers() {
        return this.segmentationMarkers;
    }

    /**
     * @param segmentationMarkers
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationMarkers
     */

    public M2tsSettings withSegmentationMarkers(String segmentationMarkers) {
        setSegmentationMarkers(segmentationMarkers);
        return this;
    }

    /**
     * @param segmentationMarkers
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationMarkers
     */

    public M2tsSettings withSegmentationMarkers(M2tsSegmentationMarkers segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers.toString();
        return this;
    }

    /**
     * @param segmentationStyle
     * @see M2tsSegmentationStyle
     */

    public void setSegmentationStyle(String segmentationStyle) {
        this.segmentationStyle = segmentationStyle;
    }

    /**
     * @return
     * @see M2tsSegmentationStyle
     */

    public String getSegmentationStyle() {
        return this.segmentationStyle;
    }

    /**
     * @param segmentationStyle
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationStyle
     */

    public M2tsSettings withSegmentationStyle(String segmentationStyle) {
        setSegmentationStyle(segmentationStyle);
        return this;
    }

    /**
     * @param segmentationStyle
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2tsSegmentationStyle
     */

    public M2tsSettings withSegmentationStyle(M2tsSegmentationStyle segmentationStyle) {
        this.segmentationStyle = segmentationStyle.toString();
        return this;
    }

    /**
     * The length in seconds of each segment. Required unless markers is set to _none_.
     * 
     * @param segmentationTime
     *        The length in seconds of each segment. Required unless markers is set to _none_.
     */

    public void setSegmentationTime(Double segmentationTime) {
        this.segmentationTime = segmentationTime;
    }

    /**
     * The length in seconds of each segment. Required unless markers is set to _none_.
     * 
     * @return The length in seconds of each segment. Required unless markers is set to _none_.
     */

    public Double getSegmentationTime() {
        return this.segmentationTime;
    }

    /**
     * The length in seconds of each segment. Required unless markers is set to _none_.
     * 
     * @param segmentationTime
     *        The length in seconds of each segment. Required unless markers is set to _none_.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2tsSettings withSegmentationTime(Double segmentationTime) {
        setSegmentationTime(segmentationTime);
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

    public M2tsSettings withTimedMetadataPid(Integer timedMetadataPid) {
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

    public M2tsSettings withVideoPid(Integer videoPid) {
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
        if (getAudioBufferModel() != null)
            sb.append("AudioBufferModel: ").append(getAudioBufferModel()).append(",");
        if (getAudioFramesPerPes() != null)
            sb.append("AudioFramesPerPes: ").append(getAudioFramesPerPes()).append(",");
        if (getAudioPids() != null)
            sb.append("AudioPids: ").append(getAudioPids()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getBufferModel() != null)
            sb.append("BufferModel: ").append(getBufferModel()).append(",");
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
        if (getEbpAudioInterval() != null)
            sb.append("EbpAudioInterval: ").append(getEbpAudioInterval()).append(",");
        if (getEbpPlacement() != null)
            sb.append("EbpPlacement: ").append(getEbpPlacement()).append(",");
        if (getEsRateInPes() != null)
            sb.append("EsRateInPes: ").append(getEsRateInPes()).append(",");
        if (getForceTsVideoEbpOrder() != null)
            sb.append("ForceTsVideoEbpOrder: ").append(getForceTsVideoEbpOrder()).append(",");
        if (getFragmentTime() != null)
            sb.append("FragmentTime: ").append(getFragmentTime()).append(",");
        if (getMaxPcrInterval() != null)
            sb.append("MaxPcrInterval: ").append(getMaxPcrInterval()).append(",");
        if (getMinEbpInterval() != null)
            sb.append("MinEbpInterval: ").append(getMinEbpInterval()).append(",");
        if (getNielsenId3() != null)
            sb.append("NielsenId3: ").append(getNielsenId3()).append(",");
        if (getNullPacketBitrate() != null)
            sb.append("NullPacketBitrate: ").append(getNullPacketBitrate()).append(",");
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
        if (getRateMode() != null)
            sb.append("RateMode: ").append(getRateMode()).append(",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: ").append(getScte35Pid()).append(",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: ").append(getScte35Source()).append(",");
        if (getSegmentationMarkers() != null)
            sb.append("SegmentationMarkers: ").append(getSegmentationMarkers()).append(",");
        if (getSegmentationStyle() != null)
            sb.append("SegmentationStyle: ").append(getSegmentationStyle()).append(",");
        if (getSegmentationTime() != null)
            sb.append("SegmentationTime: ").append(getSegmentationTime()).append(",");
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
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBufferModel() == null ^ this.getBufferModel() == null)
            return false;
        if (other.getBufferModel() != null && other.getBufferModel().equals(this.getBufferModel()) == false)
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
        if (other.getEbpAudioInterval() == null ^ this.getEbpAudioInterval() == null)
            return false;
        if (other.getEbpAudioInterval() != null && other.getEbpAudioInterval().equals(this.getEbpAudioInterval()) == false)
            return false;
        if (other.getEbpPlacement() == null ^ this.getEbpPlacement() == null)
            return false;
        if (other.getEbpPlacement() != null && other.getEbpPlacement().equals(this.getEbpPlacement()) == false)
            return false;
        if (other.getEsRateInPes() == null ^ this.getEsRateInPes() == null)
            return false;
        if (other.getEsRateInPes() != null && other.getEsRateInPes().equals(this.getEsRateInPes()) == false)
            return false;
        if (other.getForceTsVideoEbpOrder() == null ^ this.getForceTsVideoEbpOrder() == null)
            return false;
        if (other.getForceTsVideoEbpOrder() != null && other.getForceTsVideoEbpOrder().equals(this.getForceTsVideoEbpOrder()) == false)
            return false;
        if (other.getFragmentTime() == null ^ this.getFragmentTime() == null)
            return false;
        if (other.getFragmentTime() != null && other.getFragmentTime().equals(this.getFragmentTime()) == false)
            return false;
        if (other.getMaxPcrInterval() == null ^ this.getMaxPcrInterval() == null)
            return false;
        if (other.getMaxPcrInterval() != null && other.getMaxPcrInterval().equals(this.getMaxPcrInterval()) == false)
            return false;
        if (other.getMinEbpInterval() == null ^ this.getMinEbpInterval() == null)
            return false;
        if (other.getMinEbpInterval() != null && other.getMinEbpInterval().equals(this.getMinEbpInterval()) == false)
            return false;
        if (other.getNielsenId3() == null ^ this.getNielsenId3() == null)
            return false;
        if (other.getNielsenId3() != null && other.getNielsenId3().equals(this.getNielsenId3()) == false)
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
        if (other.getRateMode() == null ^ this.getRateMode() == null)
            return false;
        if (other.getRateMode() != null && other.getRateMode().equals(this.getRateMode()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null && other.getScte35Source().equals(this.getScte35Source()) == false)
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

        hashCode = prime * hashCode + ((getAudioBufferModel() == null) ? 0 : getAudioBufferModel().hashCode());
        hashCode = prime * hashCode + ((getAudioFramesPerPes() == null) ? 0 : getAudioFramesPerPes().hashCode());
        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBufferModel() == null) ? 0 : getBufferModel().hashCode());
        hashCode = prime * hashCode + ((getDvbNitSettings() == null) ? 0 : getDvbNitSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSdtSettings() == null) ? 0 : getDvbSdtSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSubPids() == null) ? 0 : getDvbSubPids().hashCode());
        hashCode = prime * hashCode + ((getDvbTdtSettings() == null) ? 0 : getDvbTdtSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbTeletextPid() == null) ? 0 : getDvbTeletextPid().hashCode());
        hashCode = prime * hashCode + ((getEbpAudioInterval() == null) ? 0 : getEbpAudioInterval().hashCode());
        hashCode = prime * hashCode + ((getEbpPlacement() == null) ? 0 : getEbpPlacement().hashCode());
        hashCode = prime * hashCode + ((getEsRateInPes() == null) ? 0 : getEsRateInPes().hashCode());
        hashCode = prime * hashCode + ((getForceTsVideoEbpOrder() == null) ? 0 : getForceTsVideoEbpOrder().hashCode());
        hashCode = prime * hashCode + ((getFragmentTime() == null) ? 0 : getFragmentTime().hashCode());
        hashCode = prime * hashCode + ((getMaxPcrInterval() == null) ? 0 : getMaxPcrInterval().hashCode());
        hashCode = prime * hashCode + ((getMinEbpInterval() == null) ? 0 : getMinEbpInterval().hashCode());
        hashCode = prime * hashCode + ((getNielsenId3() == null) ? 0 : getNielsenId3().hashCode());
        hashCode = prime * hashCode + ((getNullPacketBitrate() == null) ? 0 : getNullPacketBitrate().hashCode());
        hashCode = prime * hashCode + ((getPatInterval() == null) ? 0 : getPatInterval().hashCode());
        hashCode = prime * hashCode + ((getPcrControl() == null) ? 0 : getPcrControl().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getPmtInterval() == null) ? 0 : getPmtInterval().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode + ((getPrivateMetadataPid() == null) ? 0 : getPrivateMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getRateMode() == null) ? 0 : getRateMode().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        hashCode = prime * hashCode + ((getSegmentationMarkers() == null) ? 0 : getSegmentationMarkers().hashCode());
        hashCode = prime * hashCode + ((getSegmentationStyle() == null) ? 0 : getSegmentationStyle().hashCode());
        hashCode = prime * hashCode + ((getSegmentationTime() == null) ? 0 : getSegmentationTime().hashCode());
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
        com.amazonaws.services.mediaconvert.model.transform.M2tsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
