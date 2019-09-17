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
 * ScheduleActionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleActionSettingsMarshaller {

    private static final MarshallingInfo<StructuredPojo> HLSTIMEDMETADATASETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsTimedMetadataSettings").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSWITCHSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputSwitchSettings").build();
    private static final MarshallingInfo<StructuredPojo> PAUSESTATESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pauseStateSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE35RETURNTONETWORKSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35ReturnToNetworkSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE35SPLICEINSERTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35SpliceInsertSettings").build();
    private static final MarshallingInfo<StructuredPojo> SCTE35TIMESIGNALSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scte35TimeSignalSettings").build();
    private static final MarshallingInfo<StructuredPojo> STATICIMAGEACTIVATESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("staticImageActivateSettings").build();
    private static final MarshallingInfo<StructuredPojo> STATICIMAGEDEACTIVATESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("staticImageDeactivateSettings").build();

    private static final ScheduleActionSettingsMarshaller instance = new ScheduleActionSettingsMarshaller();

    public static ScheduleActionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduleActionSettings scheduleActionSettings, ProtocolMarshaller protocolMarshaller) {

        if (scheduleActionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduleActionSettings.getHlsTimedMetadataSettings(), HLSTIMEDMETADATASETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getInputSwitchSettings(), INPUTSWITCHSETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getPauseStateSettings(), PAUSESTATESETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getScte35ReturnToNetworkSettings(), SCTE35RETURNTONETWORKSETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getScte35SpliceInsertSettings(), SCTE35SPLICEINSERTSETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getScte35TimeSignalSettings(), SCTE35TIMESIGNALSETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getStaticImageActivateSettings(), STATICIMAGEACTIVATESETTINGS_BINDING);
            protocolMarshaller.marshall(scheduleActionSettings.getStaticImageDeactivateSettings(), STATICIMAGEDEACTIVATESETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
