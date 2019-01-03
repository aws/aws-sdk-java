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
 * UdpGroupSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UdpGroupSettingsMarshaller {

    private static final MarshallingInfo<String> INPUTLOSSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossAction").build();
    private static final MarshallingInfo<String> TIMEDMETADATAID3FRAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataId3Frame").build();
    private static final MarshallingInfo<Integer> TIMEDMETADATAID3PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataId3Period").build();

    private static final UdpGroupSettingsMarshaller instance = new UdpGroupSettingsMarshaller();

    public static UdpGroupSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UdpGroupSettings udpGroupSettings, ProtocolMarshaller protocolMarshaller) {

        if (udpGroupSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(udpGroupSettings.getInputLossAction(), INPUTLOSSACTION_BINDING);
            protocolMarshaller.marshall(udpGroupSettings.getTimedMetadataId3Frame(), TIMEDMETADATAID3FRAME_BINDING);
            protocolMarshaller.marshall(udpGroupSettings.getTimedMetadataId3Period(), TIMEDMETADATAID3PERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
