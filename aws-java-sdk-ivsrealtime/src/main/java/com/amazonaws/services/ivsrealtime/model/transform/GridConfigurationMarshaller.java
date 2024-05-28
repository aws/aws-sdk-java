/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivsrealtime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GridConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GridConfigurationMarshaller {

    private static final MarshallingInfo<String> FEATUREDPARTICIPANTATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("featuredParticipantAttribute").build();
    private static final MarshallingInfo<Integer> GRIDGAP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gridGap").build();
    private static final MarshallingInfo<Boolean> OMITSTOPPEDVIDEO_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("omitStoppedVideo").build();
    private static final MarshallingInfo<String> VIDEOASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoAspectRatio").build();
    private static final MarshallingInfo<String> VIDEOFILLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoFillMode").build();

    private static final GridConfigurationMarshaller instance = new GridConfigurationMarshaller();

    public static GridConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GridConfiguration gridConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (gridConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gridConfiguration.getFeaturedParticipantAttribute(), FEATUREDPARTICIPANTATTRIBUTE_BINDING);
            protocolMarshaller.marshall(gridConfiguration.getGridGap(), GRIDGAP_BINDING);
            protocolMarshaller.marshall(gridConfiguration.getOmitStoppedVideo(), OMITSTOPPEDVIDEO_BINDING);
            protocolMarshaller.marshall(gridConfiguration.getVideoAspectRatio(), VIDEOASPECTRATIO_BINDING);
            protocolMarshaller.marshall(gridConfiguration.getVideoFillMode(), VIDEOFILLMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
