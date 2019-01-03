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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateNetworkProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateNetworkProfileRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<Long> UPLINKBANDWIDTHBITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkBandwidthBits").build();
    private static final MarshallingInfo<Long> DOWNLINKBANDWIDTHBITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkBandwidthBits").build();
    private static final MarshallingInfo<Long> UPLINKDELAYMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uplinkDelayMs").build();
    private static final MarshallingInfo<Long> DOWNLINKDELAYMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkDelayMs").build();
    private static final MarshallingInfo<Long> UPLINKJITTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkJitterMs").build();
    private static final MarshallingInfo<Long> DOWNLINKJITTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkJitterMs").build();
    private static final MarshallingInfo<Integer> UPLINKLOSSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uplinkLossPercent").build();
    private static final MarshallingInfo<Integer> DOWNLINKLOSSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downlinkLossPercent").build();

    private static final CreateNetworkProfileRequestMarshaller instance = new CreateNetworkProfileRequestMarshaller();

    public static CreateNetworkProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateNetworkProfileRequest createNetworkProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (createNetworkProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createNetworkProfileRequest.getProjectArn(), PROJECTARN_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getUplinkBandwidthBits(), UPLINKBANDWIDTHBITS_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getDownlinkBandwidthBits(), DOWNLINKBANDWIDTHBITS_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getUplinkDelayMs(), UPLINKDELAYMS_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getDownlinkDelayMs(), DOWNLINKDELAYMS_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getUplinkJitterMs(), UPLINKJITTERMS_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getDownlinkJitterMs(), DOWNLINKJITTERMS_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getUplinkLossPercent(), UPLINKLOSSPERCENT_BINDING);
            protocolMarshaller.marshall(createNetworkProfileRequest.getDownlinkLossPercent(), DOWNLINKLOSSPERCENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
