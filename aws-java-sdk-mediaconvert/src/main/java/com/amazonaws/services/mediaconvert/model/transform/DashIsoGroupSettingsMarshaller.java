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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DashIsoGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DashIsoGroupSettingsMarshaller {

    private static final MarshallingInfo<String> BASEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("baseUrl").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destination").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationSettings").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<Integer> FRAGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fragmentLength").build();
    private static final MarshallingInfo<String> HBBTVCOMPLIANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hbbtvCompliance").build();
    private static final MarshallingInfo<Integer> MINBUFFERTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minBufferTime").build();
    private static final MarshallingInfo<String> SEGMENTCONTROL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentControl").build();
    private static final MarshallingInfo<Integer> SEGMENTLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentLength").build();
    private static final MarshallingInfo<String> WRITESEGMENTTIMELINEINREPRESENTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeSegmentTimelineInRepresentation").build();

    private static final DashIsoGroupSettingsMarshaller instance = new DashIsoGroupSettingsMarshaller();

    public static DashIsoGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DashIsoGroupSettings dashIsoGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (dashIsoGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dashIsoGroupSettings.getBaseUrl(), BASEURL_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getDestinationSettings(), DESTINATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getFragmentLength(), FRAGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getHbbtvCompliance(), HBBTVCOMPLIANCE_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getMinBufferTime(), MINBUFFERTIME_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getSegmentControl(), SEGMENTCONTROL_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getSegmentLength(), SEGMENTLENGTH_BINDING);
            protocolMarshaller.marshall(dashIsoGroupSettings.getWriteSegmentTimelineInRepresentation(), WRITESEGMENTTIMELINEINREPRESENTATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
