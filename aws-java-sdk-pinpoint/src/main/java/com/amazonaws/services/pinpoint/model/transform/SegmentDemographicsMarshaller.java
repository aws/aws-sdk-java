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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SegmentDemographicsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SegmentDemographicsMarshaller {

    private static final MarshallingInfo<StructuredPojo> APPVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppVersion").build();
    private static final MarshallingInfo<StructuredPojo> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Channel").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceType").build();
    private static final MarshallingInfo<StructuredPojo> MAKE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Make").build();
    private static final MarshallingInfo<StructuredPojo> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Model").build();
    private static final MarshallingInfo<StructuredPojo> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Platform").build();

    private static final SegmentDemographicsMarshaller instance = new SegmentDemographicsMarshaller();

    public static SegmentDemographicsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SegmentDemographics segmentDemographics, ProtocolMarshaller protocolMarshaller) {

        if (segmentDemographics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(segmentDemographics.getAppVersion(), APPVERSION_BINDING);
            protocolMarshaller.marshall(segmentDemographics.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(segmentDemographics.getDeviceType(), DEVICETYPE_BINDING);
            protocolMarshaller.marshall(segmentDemographics.getMake(), MAKE_BINDING);
            protocolMarshaller.marshall(segmentDemographics.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(segmentDemographics.getPlatform(), PLATFORM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
