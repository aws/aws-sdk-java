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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MsSmoothGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MsSmoothGroupSettingsMarshaller {

    private static final MarshallingInfo<String> ACQUISITIONPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acquisitionPointId").build();
    private static final MarshallingInfo<String> AUDIOONLYTIMECODECONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioOnlyTimecodeControl").build();
    private static final MarshallingInfo<String> CERTIFICATEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateMode").build();
    private static final MarshallingInfo<Integer> CONNECTIONRETRYINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionRetryInterval").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<String> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventId").build();
    private static final MarshallingInfo<String> EVENTIDMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventIdMode").build();
    private static final MarshallingInfo<String> EVENTSTOPBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventStopBehavior").build();
    private static final MarshallingInfo<Integer> FILECACHEDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filecacheDuration").build();
    private static final MarshallingInfo<Integer> FRAGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentLength").build();
    private static final MarshallingInfo<String> INPUTLOSSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossAction").build();
    private static final MarshallingInfo<Integer> NUMRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numRetries").build();
    private static final MarshallingInfo<Integer> RESTARTDELAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restartDelay").build();
    private static final MarshallingInfo<String> SEGMENTATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationMode").build();
    private static final MarshallingInfo<Integer> SENDDELAYMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sendDelayMs").build();
    private static final MarshallingInfo<String> SPARSETRACKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sparseTrackType").build();
    private static final MarshallingInfo<String> STREAMMANIFESTBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamManifestBehavior").build();
    private static final MarshallingInfo<String> TIMESTAMPOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timestampOffset").build();
    private static final MarshallingInfo<String> TIMESTAMPOFFSETMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timestampOffsetMode").build();

    private static final MsSmoothGroupSettingsMarshaller instance = new MsSmoothGroupSettingsMarshaller();

    public static MsSmoothGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MsSmoothGroupSettings msSmoothGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (msSmoothGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(msSmoothGroupSettings.getAcquisitionPointId(), ACQUISITIONPOINTID_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getAudioOnlyTimecodeControl(), AUDIOONLYTIMECODECONTROL_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getCertificateMode(), CERTIFICATEMODE_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getConnectionRetryInterval(), CONNECTIONRETRYINTERVAL_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getEventIdMode(), EVENTIDMODE_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getEventStopBehavior(), EVENTSTOPBEHAVIOR_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getFilecacheDuration(), FILECACHEDURATION_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getFragmentLength(), FRAGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getInputLossAction(), INPUTLOSSACTION_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getNumRetries(), NUMRETRIES_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getRestartDelay(), RESTARTDELAY_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getSegmentationMode(), SEGMENTATIONMODE_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getSendDelayMs(), SENDDELAYMS_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getSparseTrackType(), SPARSETRACKTYPE_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getStreamManifestBehavior(), STREAMMANIFESTBEHAVIOR_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getTimestampOffset(), TIMESTAMPOFFSET_BINDING);
            protocolMarshaller.marshall(msSmoothGroupSettings.getTimestampOffsetMode(), TIMESTAMPOFFSETMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
