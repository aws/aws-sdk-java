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
 * Ms Smooth Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MsSmoothGroupSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MsSmoothGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The value of the "Acquisition Point Identity" element used in each message placed in the sparse track. Only
     * enabled if sparseTrackType is not "none".
     */
    private String acquisitionPointId;
    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current
     * timecode. This option does not write timecodes to the audio elementary stream.
     */
    private String audioOnlyTimecodeControl;
    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA). This
     * will cause https outputs to self-signed certificates to fail.
     */
    private String certificateMode;
    /**
     * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be
     * cached during this time and the cache will be be delivered to the IIS server once the connection is
     * re-established.
     */
    private Integer connectionRetryInterval;
    /** Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS. */
    private OutputLocationRef destination;
    /**
     * MS Smooth event ID to be sent to the IIS server.
     * 
     * Should only be specified if eventIdMode is set to useConfigured.
     */
    private String eventId;
    /**
     * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is
     * used without changing the publishing point, clients might see cached video from the previous run.
     * 
     * Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an event ID
     * based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     */
    private String eventIdMode;
    /** When set to sendEos, send EOS signal to IIS server when stopping the event */
    private String eventStopBehavior;
    /** Size in seconds of file cache for streaming outputs. */
    private Integer filecacheDuration;
    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
     */
    private Integer fragmentLength;
    /** Parameter that control output group behavior on input loss. */
    private String inputLossAction;
    /** Number of retry attempts. */
    private Integer numRetries;
    /**
     * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one
     * segment, or exceeding filecacheDuration.
     */
    private Integer restartDelay;
    /** useInputSegmentation has been deprecated. The configured segment size is always used. */
    private String segmentationMode;
    /** Number of milliseconds to delay the output from the second pipeline. */
    private Integer sendDelayMs;
    /** If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs. */
    private String sparseTrackType;
    /** When set to send, send stream manifest so publishing point doesn't start until all streams start. */
    private String streamManifestBehavior;
    /** Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset. */
    private String timestampOffset;
    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the offset -
     * useConfiguredOffset: Use an explicitly configured date as the offset
     */
    private String timestampOffsetMode;

    /**
     * The value of the "Acquisition Point Identity" element used in each message placed in the sparse track. Only
     * enabled if sparseTrackType is not "none".
     * 
     * @param acquisitionPointId
     *        The value of the "Acquisition Point Identity" element used in each message placed in the sparse track.
     *        Only enabled if sparseTrackType is not "none".
     */

    public void setAcquisitionPointId(String acquisitionPointId) {
        this.acquisitionPointId = acquisitionPointId;
    }

    /**
     * The value of the "Acquisition Point Identity" element used in each message placed in the sparse track. Only
     * enabled if sparseTrackType is not "none".
     * 
     * @return The value of the "Acquisition Point Identity" element used in each message placed in the sparse track.
     *         Only enabled if sparseTrackType is not "none".
     */

    public String getAcquisitionPointId() {
        return this.acquisitionPointId;
    }

    /**
     * The value of the "Acquisition Point Identity" element used in each message placed in the sparse track. Only
     * enabled if sparseTrackType is not "none".
     * 
     * @param acquisitionPointId
     *        The value of the "Acquisition Point Identity" element used in each message placed in the sparse track.
     *        Only enabled if sparseTrackType is not "none".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withAcquisitionPointId(String acquisitionPointId) {
        setAcquisitionPointId(acquisitionPointId);
        return this;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current
     * timecode. This option does not write timecodes to the audio elementary stream.
     * 
     * @param audioOnlyTimecodeControl
     *        If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the
     *        current timecode. This option does not write timecodes to the audio elementary stream.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */

    public void setAudioOnlyTimecodeControl(String audioOnlyTimecodeControl) {
        this.audioOnlyTimecodeControl = audioOnlyTimecodeControl;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current
     * timecode. This option does not write timecodes to the audio elementary stream.
     * 
     * @return If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the
     *         current timecode. This option does not write timecodes to the audio elementary stream.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */

    public String getAudioOnlyTimecodeControl() {
        return this.audioOnlyTimecodeControl;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current
     * timecode. This option does not write timecodes to the audio elementary stream.
     * 
     * @param audioOnlyTimecodeControl
     *        If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the
     *        current timecode. This option does not write timecodes to the audio elementary stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */

    public MsSmoothGroupSettings withAudioOnlyTimecodeControl(String audioOnlyTimecodeControl) {
        setAudioOnlyTimecodeControl(audioOnlyTimecodeControl);
        return this;
    }

    /**
     * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current
     * timecode. This option does not write timecodes to the audio elementary stream.
     * 
     * @param audioOnlyTimecodeControl
     *        If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the
     *        current timecode. This option does not write timecodes to the audio elementary stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupAudioOnlyTimecodeControl
     */

    public MsSmoothGroupSettings withAudioOnlyTimecodeControl(SmoothGroupAudioOnlyTimecodeControl audioOnlyTimecodeControl) {
        this.audioOnlyTimecodeControl = audioOnlyTimecodeControl.toString();
        return this;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA). This
     * will cause https outputs to self-signed certificates to fail.
     * 
     * @param certificateMode
     *        If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).
     *        This will cause https outputs to self-signed certificates to fail.
     * @see SmoothGroupCertificateMode
     */

    public void setCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA). This
     * will cause https outputs to self-signed certificates to fail.
     * 
     * @return If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).
     *         This will cause https outputs to self-signed certificates to fail.
     * @see SmoothGroupCertificateMode
     */

    public String getCertificateMode() {
        return this.certificateMode;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA). This
     * will cause https outputs to self-signed certificates to fail.
     * 
     * @param certificateMode
     *        If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).
     *        This will cause https outputs to self-signed certificates to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupCertificateMode
     */

    public MsSmoothGroupSettings withCertificateMode(String certificateMode) {
        setCertificateMode(certificateMode);
        return this;
    }

    /**
     * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA). This
     * will cause https outputs to self-signed certificates to fail.
     * 
     * @param certificateMode
     *        If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).
     *        This will cause https outputs to self-signed certificates to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupCertificateMode
     */

    public MsSmoothGroupSettings withCertificateMode(SmoothGroupCertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
        return this;
    }

    /**
     * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be
     * cached during this time and the cache will be be delivered to the IIS server once the connection is
     * re-established.
     * 
     * @param connectionRetryInterval
     *        Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content
     *        will be cached during this time and the cache will be be delivered to the IIS server once the connection
     *        is re-established.
     */

    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be
     * cached during this time and the cache will be be delivered to the IIS server once the connection is
     * re-established.
     * 
     * @return Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content
     *         will be cached during this time and the cache will be be delivered to the IIS server once the connection
     *         is re-established.
     */

    public Integer getConnectionRetryInterval() {
        return this.connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be
     * cached during this time and the cache will be be delivered to the IIS server once the connection is
     * re-established.
     * 
     * @param connectionRetryInterval
     *        Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content
     *        will be cached during this time and the cache will be be delivered to the IIS server once the connection
     *        is re-established.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withConnectionRetryInterval(Integer connectionRetryInterval) {
        setConnectionRetryInterval(connectionRetryInterval);
        return this;
    }

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
     * 
     * @param destination
     *        Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
     */

    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
     * 
     * @return Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
     */

    public OutputLocationRef getDestination() {
        return this.destination;
    }

    /**
     * Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
     * 
     * @param destination
     *        Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withDestination(OutputLocationRef destination) {
        setDestination(destination);
        return this;
    }

    /**
     * MS Smooth event ID to be sent to the IIS server.
     * 
     * Should only be specified if eventIdMode is set to useConfigured.
     * 
     * @param eventId
     *        MS Smooth event ID to be sent to the IIS server.
     * 
     *        Should only be specified if eventIdMode is set to useConfigured.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * MS Smooth event ID to be sent to the IIS server.
     * 
     * Should only be specified if eventIdMode is set to useConfigured.
     * 
     * @return MS Smooth event ID to be sent to the IIS server.
     * 
     *         Should only be specified if eventIdMode is set to useConfigured.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * MS Smooth event ID to be sent to the IIS server.
     * 
     * Should only be specified if eventIdMode is set to useConfigured.
     * 
     * @param eventId
     *        MS Smooth event ID to be sent to the IIS server.
     * 
     *        Should only be specified if eventIdMode is set to useConfigured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is
     * used without changing the publishing point, clients might see cached video from the previous run.
     * 
     * Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an event ID
     * based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * 
     * @param eventIdMode
     *        Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live
     *        Event is used without changing the publishing point, clients might see cached video from the previous run.
     * 
     *        Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an
     *        event ID based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * @see SmoothGroupEventIdMode
     */

    public void setEventIdMode(String eventIdMode) {
        this.eventIdMode = eventIdMode;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is
     * used without changing the publishing point, clients might see cached video from the previous run.
     * 
     * Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an event ID
     * based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * 
     * @return Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live
     *         Event is used without changing the publishing point, clients might see cached video from the previous
     *         run.
     * 
     *         Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an
     *         event ID based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * @see SmoothGroupEventIdMode
     */

    public String getEventIdMode() {
        return this.eventIdMode;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is
     * used without changing the publishing point, clients might see cached video from the previous run.
     * 
     * Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an event ID
     * based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * 
     * @param eventIdMode
     *        Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live
     *        Event is used without changing the publishing point, clients might see cached video from the previous run.
     * 
     *        Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an
     *        event ID based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupEventIdMode
     */

    public MsSmoothGroupSettings withEventIdMode(String eventIdMode) {
        setEventIdMode(eventIdMode);
        return this;
    }

    /**
     * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is
     * used without changing the publishing point, clients might see cached video from the previous run.
     * 
     * Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an event ID
     * based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * 
     * @param eventIdMode
     *        Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live
     *        Event is used without changing the publishing point, clients might see cached video from the previous run.
     * 
     *        Options: - "useConfigured" - use the value provided in eventId - "useTimestamp" - generate and send an
     *        event ID based on the current timestamp - "noEventId" - do not send an event ID to the IIS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupEventIdMode
     */

    public MsSmoothGroupSettings withEventIdMode(SmoothGroupEventIdMode eventIdMode) {
        this.eventIdMode = eventIdMode.toString();
        return this;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the event
     * 
     * @param eventStopBehavior
     *        When set to sendEos, send EOS signal to IIS server when stopping the event
     * @see SmoothGroupEventStopBehavior
     */

    public void setEventStopBehavior(String eventStopBehavior) {
        this.eventStopBehavior = eventStopBehavior;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the event
     * 
     * @return When set to sendEos, send EOS signal to IIS server when stopping the event
     * @see SmoothGroupEventStopBehavior
     */

    public String getEventStopBehavior() {
        return this.eventStopBehavior;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the event
     * 
     * @param eventStopBehavior
     *        When set to sendEos, send EOS signal to IIS server when stopping the event
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupEventStopBehavior
     */

    public MsSmoothGroupSettings withEventStopBehavior(String eventStopBehavior) {
        setEventStopBehavior(eventStopBehavior);
        return this;
    }

    /**
     * When set to sendEos, send EOS signal to IIS server when stopping the event
     * 
     * @param eventStopBehavior
     *        When set to sendEos, send EOS signal to IIS server when stopping the event
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupEventStopBehavior
     */

    public MsSmoothGroupSettings withEventStopBehavior(SmoothGroupEventStopBehavior eventStopBehavior) {
        this.eventStopBehavior = eventStopBehavior.toString();
        return this;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * 
     * @param filecacheDuration
     *        Size in seconds of file cache for streaming outputs.
     */

    public void setFilecacheDuration(Integer filecacheDuration) {
        this.filecacheDuration = filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * 
     * @return Size in seconds of file cache for streaming outputs.
     */

    public Integer getFilecacheDuration() {
        return this.filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * 
     * @param filecacheDuration
     *        Size in seconds of file cache for streaming outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withFilecacheDuration(Integer filecacheDuration) {
        setFilecacheDuration(filecacheDuration);
        return this;
    }

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
     * 
     * @param fragmentLength
     *        Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and
     *        framerate.
     */

    public void setFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
    }

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
     * 
     * @return Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and
     *         framerate.
     */

    public Integer getFragmentLength() {
        return this.fragmentLength;
    }

    /**
     * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
     * 
     * @param fragmentLength
     *        Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and
     *        framerate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withFragmentLength(Integer fragmentLength) {
        setFragmentLength(fragmentLength);
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @param inputLossAction
     *        Parameter that control output group behavior on input loss.
     * @see InputLossActionForMsSmoothOut
     */

    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @return Parameter that control output group behavior on input loss.
     * @see InputLossActionForMsSmoothOut
     */

    public String getInputLossAction() {
        return this.inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @param inputLossAction
     *        Parameter that control output group behavior on input loss.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForMsSmoothOut
     */

    public MsSmoothGroupSettings withInputLossAction(String inputLossAction) {
        setInputLossAction(inputLossAction);
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * 
     * @param inputLossAction
     *        Parameter that control output group behavior on input loss.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForMsSmoothOut
     */

    public MsSmoothGroupSettings withInputLossAction(InputLossActionForMsSmoothOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * Number of retry attempts.
     * 
     * @param numRetries
     *        Number of retry attempts.
     */

    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * Number of retry attempts.
     * 
     * @return Number of retry attempts.
     */

    public Integer getNumRetries() {
        return this.numRetries;
    }

    /**
     * Number of retry attempts.
     * 
     * @param numRetries
     *        Number of retry attempts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withNumRetries(Integer numRetries) {
        setNumRetries(numRetries);
        return this;
    }

    /**
     * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one
     * segment, or exceeding filecacheDuration.
     * 
     * @param restartDelay
     *        Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on
     *        one segment, or exceeding filecacheDuration.
     */

    public void setRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
    }

    /**
     * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one
     * segment, or exceeding filecacheDuration.
     * 
     * @return Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on
     *         one segment, or exceeding filecacheDuration.
     */

    public Integer getRestartDelay() {
        return this.restartDelay;
    }

    /**
     * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one
     * segment, or exceeding filecacheDuration.
     * 
     * @param restartDelay
     *        Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on
     *        one segment, or exceeding filecacheDuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withRestartDelay(Integer restartDelay) {
        setRestartDelay(restartDelay);
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @param segmentationMode
     *        useInputSegmentation has been deprecated. The configured segment size is always used.
     * @see SmoothGroupSegmentationMode
     */

    public void setSegmentationMode(String segmentationMode) {
        this.segmentationMode = segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @return useInputSegmentation has been deprecated. The configured segment size is always used.
     * @see SmoothGroupSegmentationMode
     */

    public String getSegmentationMode() {
        return this.segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @param segmentationMode
     *        useInputSegmentation has been deprecated. The configured segment size is always used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupSegmentationMode
     */

    public MsSmoothGroupSettings withSegmentationMode(String segmentationMode) {
        setSegmentationMode(segmentationMode);
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is always used.
     * 
     * @param segmentationMode
     *        useInputSegmentation has been deprecated. The configured segment size is always used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupSegmentationMode
     */

    public MsSmoothGroupSettings withSegmentationMode(SmoothGroupSegmentationMode segmentationMode) {
        this.segmentationMode = segmentationMode.toString();
        return this;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * 
     * @param sendDelayMs
     *        Number of milliseconds to delay the output from the second pipeline.
     */

    public void setSendDelayMs(Integer sendDelayMs) {
        this.sendDelayMs = sendDelayMs;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * 
     * @return Number of milliseconds to delay the output from the second pipeline.
     */

    public Integer getSendDelayMs() {
        return this.sendDelayMs;
    }

    /**
     * Number of milliseconds to delay the output from the second pipeline.
     * 
     * @param sendDelayMs
     *        Number of milliseconds to delay the output from the second pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withSendDelayMs(Integer sendDelayMs) {
        setSendDelayMs(sendDelayMs);
        return this;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs.
     * 
     * @param sparseTrackType
     *        If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth
     *        outputs.
     * @see SmoothGroupSparseTrackType
     */

    public void setSparseTrackType(String sparseTrackType) {
        this.sparseTrackType = sparseTrackType;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs.
     * 
     * @return If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth
     *         outputs.
     * @see SmoothGroupSparseTrackType
     */

    public String getSparseTrackType() {
        return this.sparseTrackType;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs.
     * 
     * @param sparseTrackType
     *        If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth
     *        outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupSparseTrackType
     */

    public MsSmoothGroupSettings withSparseTrackType(String sparseTrackType) {
        setSparseTrackType(sparseTrackType);
        return this;
    }

    /**
     * If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs.
     * 
     * @param sparseTrackType
     *        If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth
     *        outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupSparseTrackType
     */

    public MsSmoothGroupSettings withSparseTrackType(SmoothGroupSparseTrackType sparseTrackType) {
        this.sparseTrackType = sparseTrackType.toString();
        return this;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * 
     * @param streamManifestBehavior
     *        When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * @see SmoothGroupStreamManifestBehavior
     */

    public void setStreamManifestBehavior(String streamManifestBehavior) {
        this.streamManifestBehavior = streamManifestBehavior;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * 
     * @return When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * @see SmoothGroupStreamManifestBehavior
     */

    public String getStreamManifestBehavior() {
        return this.streamManifestBehavior;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * 
     * @param streamManifestBehavior
     *        When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupStreamManifestBehavior
     */

    public MsSmoothGroupSettings withStreamManifestBehavior(String streamManifestBehavior) {
        setStreamManifestBehavior(streamManifestBehavior);
        return this;
    }

    /**
     * When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * 
     * @param streamManifestBehavior
     *        When set to send, send stream manifest so publishing point doesn't start until all streams start.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupStreamManifestBehavior
     */

    public MsSmoothGroupSettings withStreamManifestBehavior(SmoothGroupStreamManifestBehavior streamManifestBehavior) {
        this.streamManifestBehavior = streamManifestBehavior.toString();
        return this;
    }

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset.
     * 
     * @param timestampOffset
     *        Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset.
     */

    public void setTimestampOffset(String timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset.
     * 
     * @return Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset.
     */

    public String getTimestampOffset() {
        return this.timestampOffset;
    }

    /**
     * Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset.
     * 
     * @param timestampOffset
     *        Timestamp offset for the event. Only used if timestampOffsetMode is set to useConfiguredOffset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withTimestampOffset(String timestampOffset) {
        setTimestampOffset(timestampOffset);
        return this;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the offset -
     * useConfiguredOffset: Use an explicitly configured date as the offset
     * 
     * @param timestampOffsetMode
     *        Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the
     *        offset - useConfiguredOffset: Use an explicitly configured date as the offset
     * @see SmoothGroupTimestampOffsetMode
     */

    public void setTimestampOffsetMode(String timestampOffsetMode) {
        this.timestampOffsetMode = timestampOffsetMode;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the offset -
     * useConfiguredOffset: Use an explicitly configured date as the offset
     * 
     * @return Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the
     *         offset - useConfiguredOffset: Use an explicitly configured date as the offset
     * @see SmoothGroupTimestampOffsetMode
     */

    public String getTimestampOffsetMode() {
        return this.timestampOffsetMode;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the offset -
     * useConfiguredOffset: Use an explicitly configured date as the offset
     * 
     * @param timestampOffsetMode
     *        Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the
     *        offset - useConfiguredOffset: Use an explicitly configured date as the offset
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupTimestampOffsetMode
     */

    public MsSmoothGroupSettings withTimestampOffsetMode(String timestampOffsetMode) {
        setTimestampOffsetMode(timestampOffsetMode);
        return this;
    }

    /**
     * Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the offset -
     * useConfiguredOffset: Use an explicitly configured date as the offset
     * 
     * @param timestampOffsetMode
     *        Type of timestamp date offset to use. - useEventStartDate: Use the date the event was started as the
     *        offset - useConfiguredOffset: Use an explicitly configured date as the offset
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmoothGroupTimestampOffsetMode
     */

    public MsSmoothGroupSettings withTimestampOffsetMode(SmoothGroupTimestampOffsetMode timestampOffsetMode) {
        this.timestampOffsetMode = timestampOffsetMode.toString();
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
        if (getAcquisitionPointId() != null)
            sb.append("AcquisitionPointId: ").append(getAcquisitionPointId()).append(",");
        if (getAudioOnlyTimecodeControl() != null)
            sb.append("AudioOnlyTimecodeControl: ").append(getAudioOnlyTimecodeControl()).append(",");
        if (getCertificateMode() != null)
            sb.append("CertificateMode: ").append(getCertificateMode()).append(",");
        if (getConnectionRetryInterval() != null)
            sb.append("ConnectionRetryInterval: ").append(getConnectionRetryInterval()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventIdMode() != null)
            sb.append("EventIdMode: ").append(getEventIdMode()).append(",");
        if (getEventStopBehavior() != null)
            sb.append("EventStopBehavior: ").append(getEventStopBehavior()).append(",");
        if (getFilecacheDuration() != null)
            sb.append("FilecacheDuration: ").append(getFilecacheDuration()).append(",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: ").append(getFragmentLength()).append(",");
        if (getInputLossAction() != null)
            sb.append("InputLossAction: ").append(getInputLossAction()).append(",");
        if (getNumRetries() != null)
            sb.append("NumRetries: ").append(getNumRetries()).append(",");
        if (getRestartDelay() != null)
            sb.append("RestartDelay: ").append(getRestartDelay()).append(",");
        if (getSegmentationMode() != null)
            sb.append("SegmentationMode: ").append(getSegmentationMode()).append(",");
        if (getSendDelayMs() != null)
            sb.append("SendDelayMs: ").append(getSendDelayMs()).append(",");
        if (getSparseTrackType() != null)
            sb.append("SparseTrackType: ").append(getSparseTrackType()).append(",");
        if (getStreamManifestBehavior() != null)
            sb.append("StreamManifestBehavior: ").append(getStreamManifestBehavior()).append(",");
        if (getTimestampOffset() != null)
            sb.append("TimestampOffset: ").append(getTimestampOffset()).append(",");
        if (getTimestampOffsetMode() != null)
            sb.append("TimestampOffsetMode: ").append(getTimestampOffsetMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MsSmoothGroupSettings == false)
            return false;
        MsSmoothGroupSettings other = (MsSmoothGroupSettings) obj;
        if (other.getAcquisitionPointId() == null ^ this.getAcquisitionPointId() == null)
            return false;
        if (other.getAcquisitionPointId() != null && other.getAcquisitionPointId().equals(this.getAcquisitionPointId()) == false)
            return false;
        if (other.getAudioOnlyTimecodeControl() == null ^ this.getAudioOnlyTimecodeControl() == null)
            return false;
        if (other.getAudioOnlyTimecodeControl() != null && other.getAudioOnlyTimecodeControl().equals(this.getAudioOnlyTimecodeControl()) == false)
            return false;
        if (other.getCertificateMode() == null ^ this.getCertificateMode() == null)
            return false;
        if (other.getCertificateMode() != null && other.getCertificateMode().equals(this.getCertificateMode()) == false)
            return false;
        if (other.getConnectionRetryInterval() == null ^ this.getConnectionRetryInterval() == null)
            return false;
        if (other.getConnectionRetryInterval() != null && other.getConnectionRetryInterval().equals(this.getConnectionRetryInterval()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventIdMode() == null ^ this.getEventIdMode() == null)
            return false;
        if (other.getEventIdMode() != null && other.getEventIdMode().equals(this.getEventIdMode()) == false)
            return false;
        if (other.getEventStopBehavior() == null ^ this.getEventStopBehavior() == null)
            return false;
        if (other.getEventStopBehavior() != null && other.getEventStopBehavior().equals(this.getEventStopBehavior()) == false)
            return false;
        if (other.getFilecacheDuration() == null ^ this.getFilecacheDuration() == null)
            return false;
        if (other.getFilecacheDuration() != null && other.getFilecacheDuration().equals(this.getFilecacheDuration()) == false)
            return false;
        if (other.getFragmentLength() == null ^ this.getFragmentLength() == null)
            return false;
        if (other.getFragmentLength() != null && other.getFragmentLength().equals(this.getFragmentLength()) == false)
            return false;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        if (other.getRestartDelay() == null ^ this.getRestartDelay() == null)
            return false;
        if (other.getRestartDelay() != null && other.getRestartDelay().equals(this.getRestartDelay()) == false)
            return false;
        if (other.getSegmentationMode() == null ^ this.getSegmentationMode() == null)
            return false;
        if (other.getSegmentationMode() != null && other.getSegmentationMode().equals(this.getSegmentationMode()) == false)
            return false;
        if (other.getSendDelayMs() == null ^ this.getSendDelayMs() == null)
            return false;
        if (other.getSendDelayMs() != null && other.getSendDelayMs().equals(this.getSendDelayMs()) == false)
            return false;
        if (other.getSparseTrackType() == null ^ this.getSparseTrackType() == null)
            return false;
        if (other.getSparseTrackType() != null && other.getSparseTrackType().equals(this.getSparseTrackType()) == false)
            return false;
        if (other.getStreamManifestBehavior() == null ^ this.getStreamManifestBehavior() == null)
            return false;
        if (other.getStreamManifestBehavior() != null && other.getStreamManifestBehavior().equals(this.getStreamManifestBehavior()) == false)
            return false;
        if (other.getTimestampOffset() == null ^ this.getTimestampOffset() == null)
            return false;
        if (other.getTimestampOffset() != null && other.getTimestampOffset().equals(this.getTimestampOffset()) == false)
            return false;
        if (other.getTimestampOffsetMode() == null ^ this.getTimestampOffsetMode() == null)
            return false;
        if (other.getTimestampOffsetMode() != null && other.getTimestampOffsetMode().equals(this.getTimestampOffsetMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcquisitionPointId() == null) ? 0 : getAcquisitionPointId().hashCode());
        hashCode = prime * hashCode + ((getAudioOnlyTimecodeControl() == null) ? 0 : getAudioOnlyTimecodeControl().hashCode());
        hashCode = prime * hashCode + ((getCertificateMode() == null) ? 0 : getCertificateMode().hashCode());
        hashCode = prime * hashCode + ((getConnectionRetryInterval() == null) ? 0 : getConnectionRetryInterval().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventIdMode() == null) ? 0 : getEventIdMode().hashCode());
        hashCode = prime * hashCode + ((getEventStopBehavior() == null) ? 0 : getEventStopBehavior().hashCode());
        hashCode = prime * hashCode + ((getFilecacheDuration() == null) ? 0 : getFilecacheDuration().hashCode());
        hashCode = prime * hashCode + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        hashCode = prime * hashCode + ((getRestartDelay() == null) ? 0 : getRestartDelay().hashCode());
        hashCode = prime * hashCode + ((getSegmentationMode() == null) ? 0 : getSegmentationMode().hashCode());
        hashCode = prime * hashCode + ((getSendDelayMs() == null) ? 0 : getSendDelayMs().hashCode());
        hashCode = prime * hashCode + ((getSparseTrackType() == null) ? 0 : getSparseTrackType().hashCode());
        hashCode = prime * hashCode + ((getStreamManifestBehavior() == null) ? 0 : getStreamManifestBehavior().hashCode());
        hashCode = prime * hashCode + ((getTimestampOffset() == null) ? 0 : getTimestampOffset().hashCode());
        hashCode = prime * hashCode + ((getTimestampOffsetMode() == null) ? 0 : getTimestampOffsetMode().hashCode());
        return hashCode;
    }

    @Override
    public MsSmoothGroupSettings clone() {
        try {
            return (MsSmoothGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MsSmoothGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
